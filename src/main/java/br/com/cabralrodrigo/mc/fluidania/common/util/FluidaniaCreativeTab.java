package br.com.cabralrodrigo.mc.fluidania.common.util;

import br.com.cabralrodrigo.mc.fluidania.common.lib.LibMod;
import br.com.cabralrodrigo.mc.fluidania.common.list.ModBlocks;
import br.com.cabralrodrigo.mc.fluidania.common.list.ModFluids;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;
import net.minecraftforge.fluids.FluidStack;
import net.minecraftforge.fluids.FluidUtil;

public class FluidaniaCreativeTab extends CreativeTabs {

    public static final FluidaniaCreativeTab INSTANCE = new FluidaniaCreativeTab();

    public FluidaniaCreativeTab() {
        super(LibMod.MOD_ID);
    }

    @Override
    public ItemStack getTabIconItem() {
        return new ItemStack(ModBlocks.manaInfuser);
    }

    @Override
    public void displayAllRelevantItems(NonNullList<ItemStack> items) {
        super.displayAllRelevantItems(items);
        items.add(FluidUtil.getFilledBucket(new FluidStack(ModFluids.liquidMana, 1000)));
    }
}