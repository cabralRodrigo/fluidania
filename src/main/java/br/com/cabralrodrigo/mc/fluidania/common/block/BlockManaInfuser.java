package br.com.cabralrodrigo.mc.fluidania.common.block;

import br.com.cabralrodrigo.mc.fluidania.client.list.ModSprites;
import br.com.cabralrodrigo.mc.fluidania.common.lib.LibBlockNames;
import br.com.cabralrodrigo.mc.fluidania.common.lib.LibMod;
import br.com.cabralrodrigo.mc.fluidania.common.tile.TileEntityManaInfuser;
import br.com.cabralrodrigo.mc.fluidania.common.util.FluidaniaCreativeTab;
import net.minecraft.block.Block;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.TextureAtlasSprite;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import vazkii.botania.api.mana.IPoolOverlayProvider;

import javax.annotation.Nullable;

public class BlockManaInfuser extends Block implements ITileEntityProvider, IPoolOverlayProvider {
    public BlockManaInfuser() {
        super(Material.ROCK);
        this.setRegistryName(LibMod.MOD_ID, LibBlockNames.MANA_INFUSER);
        this.setUnlocalizedName(LibMod.MOD_ID + ':' + LibBlockNames.MANA_INFUSER);
        this.setCreativeTab(FluidaniaCreativeTab.INSTANCE);

        this.setHardness(3F);
        this.setResistance(10F);
    }

    @Override
    @SideOnly(Side.CLIENT)
    public TextureAtlasSprite getIcon(World world, BlockPos blockPos) {
        return ModSprites.manaInfuserOverlay;
    }

    @Nullable
    @Override
    public TileEntity createNewTileEntity(World worldIn, int meta) {
        return new TileEntityManaInfuser();
    }
}