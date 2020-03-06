package br.com.cabralrodrigo.mc.fluidania.common.init;

import br.com.cabralrodrigo.mc.fluidania.common.list.ModFluids;
import net.minecraftforge.fluids.FluidRegistry;

public final class InitFluids {
    public static void init() {
        FluidRegistry.registerFluid(ModFluids.liquidMana);
        FluidRegistry.addBucketForFluid(ModFluids.liquidMana);
    }
}