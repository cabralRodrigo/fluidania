package br.com.cabralrodrigo.mc.fluidania.common.block;

import br.com.cabralrodrigo.mc.fluidania.common.lib.LibBlockNames;
import br.com.cabralrodrigo.mc.fluidania.common.lib.LibMod;
import br.com.cabralrodrigo.mc.fluidania.common.list.ModFluids;
import net.minecraft.block.material.Material;
import net.minecraftforge.fluids.BlockFluidClassic;

public class BlockFluidMana extends BlockFluidClassic {
    public BlockFluidMana() {
        super(ModFluids.liquidMana, Material.WATER);
        this.setRegistryName(LibMod.MOD_ID, LibBlockNames.LIQUID_MANA);
        this.setUnlocalizedName(LibMod.MOD_ID + ':' + LibBlockNames.LIQUID_MANA);
    }
}