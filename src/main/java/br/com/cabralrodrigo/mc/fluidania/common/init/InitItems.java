package br.com.cabralrodrigo.mc.fluidania.common.init;

import br.com.cabralrodrigo.mc.fluidania.common.item.ItemBlockMod;
import br.com.cabralrodrigo.mc.fluidania.common.list.ModBlocks;
import net.minecraft.item.Item;
import net.minecraftforge.registries.IForgeRegistry;

public final class InitItems {
    public static void init(IForgeRegistry<Item> registry) {
        registry.register(new ItemBlockMod(ModBlocks.manaDiffuser));
        registry.register(new ItemBlockMod(ModBlocks.manaInfuser));
        registry.register(new ItemBlockMod(ModBlocks.fluidMana));
    }
}
