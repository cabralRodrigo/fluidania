package br.com.cabralrodrigo.mc.fluidania.common.util;

import br.com.cabralrodrigo.mc.fluidania.common.list.ModFluids;
import net.minecraftforge.fluids.FluidStack;
import net.minecraftforge.fluids.capability.FluidTankProperties;
import net.minecraftforge.fluids.capability.IFluidHandler;
import net.minecraftforge.fluids.capability.IFluidTankProperties;
import vazkii.botania.common.block.tile.mana.TilePool;

import javax.annotation.Nullable;

public class ManaPoolProxyFluidHandler implements IFluidHandler {

    public static final int RATIO = 10;

    private final TilePool pool;
    private final boolean canFill;
    private final boolean canDrain;

    public ManaPoolProxyFluidHandler(TilePool pool, boolean canFill, boolean canDrain) {
        this.pool = pool;
        this.canFill = canFill;
        this.canDrain = canDrain;
    }

    @Override
    public IFluidTankProperties[] getTankProperties() {
        FluidStack stack = this.getCurrentStack();
        int space = this.pool.getAvailableSpaceForMana();

        IFluidTankProperties prop = new FluidTankProperties(stack, stack.amount + space);
        return new IFluidTankProperties[]{prop};
    }

    @Override
    public int fill(FluidStack stack, boolean doFill) {
        if (stack.getFluid() != ModFluids.liquidMana || !canFill)
            return 0;

        int remainingCapMana = this.pool.manaCap % RATIO;
        int capFluid = (this.pool.manaCap - remainingCapMana) / RATIO;

        int remainingCurrentMana = this.pool.getCurrentMana() % RATIO;
        int currentFluid = (this.pool.getCurrentMana() - remainingCurrentMana) / RATIO;

        int diff = capFluid - (currentFluid + stack.amount);
        int toFill = stack.amount + Math.min(diff, 0);

        if (doFill)
            this.pool.recieveMana(toFill * RATIO);

        return toFill;
    }

    @Nullable
    @Override
    public FluidStack drain(FluidStack stack, boolean doDrain) {
        if (stack.getFluid() == ModFluids.liquidMana)
            return this.drain(stack.amount, doDrain);

        return null;
    }

    @Nullable
    @Override
    public FluidStack drain(int maxDrain, boolean doDrain) {
        if (!canDrain)
            return null;

        int remainingCurrentMana = this.pool.getCurrentMana() % RATIO;
        int currentFluid = (this.pool.getCurrentMana() - remainingCurrentMana) / RATIO;

        int diff = currentFluid - maxDrain;
        int toDrain = maxDrain + Math.min(diff, 0);

        if (doDrain)
            this.pool.recieveMana(-(toDrain * RATIO));

        return new FluidStack(ModFluids.liquidMana, toDrain);
    }

    private FluidStack getCurrentStack() {
        int remainingCurrentMana = this.pool.getCurrentMana() % RATIO;
        int currentFluid = (this.pool.getCurrentMana() - remainingCurrentMana) / RATIO;

        return new FluidStack(ModFluids.liquidMana, currentFluid);
    }
}