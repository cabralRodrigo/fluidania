package br.com.cabralrodrigo.mc.fluidania.client.init;

import br.com.cabralrodrigo.mc.fluidania.client.util.FluidStateMapper;
import br.com.cabralrodrigo.mc.fluidania.common.list.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelBakery;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public final class InitModels {
    public static void init() {
        registerBlockItem(ModBlocks.manaDiffuser);
        registerBlockItem(ModBlocks.manaInfuser);
        registerBlockFluid(ModBlocks.fluidMana);
    }

    private static void registerBlockItem(Block block) {
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0, new ModelResourceLocation(block.getRegistryName(), "inventory"));
    }

    private static void registerBlockFluid(Block block) {
        FluidStateMapper mapper = new FluidStateMapper(block.getRegistryName());
        Item item = Item.getItemFromBlock(block);

        ModelBakery.registerItemVariants(item);
        ModelLoader.setCustomMeshDefinition(item, mapper);
        ModelLoader.setCustomStateMapper(block, mapper);
    }
}