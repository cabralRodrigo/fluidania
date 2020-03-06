package br.com.cabralrodrigo.mc.fluidania.common.init;

import br.com.cabralrodrigo.mc.fluidania.common.list.ModBlocks;
import net.minecraft.block.Block;
import net.minecraftforge.registries.IForgeRegistry;

public final class InitBlocks {
    public static void init(IForgeRegistry<Block> registry) {
        registry.register(ModBlocks.manaDiffuser);
        registry.register(ModBlocks.manaInfuser);
        registry.register(ModBlocks.fluidMana);
    }
}
