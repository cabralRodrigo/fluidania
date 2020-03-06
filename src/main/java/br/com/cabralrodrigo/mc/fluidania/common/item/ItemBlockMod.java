package br.com.cabralrodrigo.mc.fluidania.common.item;

import br.com.cabralrodrigo.mc.fluidania.common.util.FluidaniaCreativeTab;
import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;

public class ItemBlockMod extends ItemBlock {
    public ItemBlockMod(Block block) {
        super(block);
        this.setRegistryName(block.getRegistryName());
        this.setCreativeTab(FluidaniaCreativeTab.INSTANCE);
    }
}