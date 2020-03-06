package br.com.cabralrodrigo.mc.fluidania.common.tile;

import br.com.cabralrodrigo.mc.fluidania.common.util.ManaPoolProxyFluidHandler;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumFacing;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.fluids.capability.CapabilityFluidHandler;
import vazkii.botania.common.block.tile.mana.TilePool;

import javax.annotation.Nullable;

public class TileEntityManaDiffuser extends TileEntity {

    @Override
    public boolean hasCapability(Capability<?> capability, @Nullable EnumFacing facing) {
        if (capability != CapabilityFluidHandler.FLUID_HANDLER_CAPABILITY)
            return false;

        if (facing == EnumFacing.UP)
            return false;

        return this.getManaPool() != null;
    }

    @Nullable
    @Override
    public <T> T getCapability(Capability<T> capability, @Nullable EnumFacing facing) {
        if (!this.hasCapability(capability, facing))
            return null;

        TilePool manaPool = this.getManaPool();
        if (manaPool == null)
            return null;

        return (T) new ManaPoolProxyFluidHandler(manaPool, false, true);
    }

    private TilePool getManaPool() {
        TileEntity tile = this.world.getTileEntity(this.pos.up());

        if (tile instanceof TilePool) {
            TilePool manaPool = (TilePool) tile;

            if (manaPool.manaCap != -1)
                return manaPool;
        }

        return null;
    }
}