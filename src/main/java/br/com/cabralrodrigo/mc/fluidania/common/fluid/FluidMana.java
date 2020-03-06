package br.com.cabralrodrigo.mc.fluidania.common.fluid;

import br.com.cabralrodrigo.mc.fluidania.common.lib.LibFluidNames;
import br.com.cabralrodrigo.mc.fluidania.common.lib.LibMod;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fluids.Fluid;

public class FluidMana extends Fluid {
    public FluidMana() {
        super(
            LibMod.MOD_ID + ':' + LibFluidNames.LIQUID_MANA,
            new ResourceLocation(LibMod.MOD_ID, "blocks/fluids/" + LibFluidNames.LIQUID_MANA + "_still"),
            new ResourceLocation(LibMod.MOD_ID, "blocks/fluids/" + LibFluidNames.LIQUID_MANA + "_flowing")
        );
    }
}
