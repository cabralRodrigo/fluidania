package br.com.cabralrodrigo.mc.fluidania.client.util;

import br.com.cabralrodrigo.mc.fluidania.common.lib.LibMod;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.ItemMeshDefinition;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.client.renderer.block.statemap.StateMapperBase;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class FluidStateMapper extends StateMapperBase implements ItemMeshDefinition {
    public final ModelResourceLocation location;

    public FluidStateMapper(ResourceLocation resourceLocation) {
        location = new ModelResourceLocation(LibMod.MOD_ID + ":liquids/" + resourceLocation.getResourcePath(), "normal");
    }

    @Override
    protected ModelResourceLocation getModelResourceLocation(IBlockState state) {
        return location;
    }

    @Override
    public ModelResourceLocation getModelLocation(ItemStack stack) {
        return location;
    }
}