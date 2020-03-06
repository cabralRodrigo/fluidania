package br.com.cabralrodrigo.mc.fluidania.common.proxy;

import br.com.cabralrodrigo.mc.fluidania.common.init.InitBlocks;
import br.com.cabralrodrigo.mc.fluidania.common.init.InitFluids;
import br.com.cabralrodrigo.mc.fluidania.common.init.InitItems;
import br.com.cabralrodrigo.mc.fluidania.common.init.InitTileEntities;
import br.com.cabralrodrigo.mc.fluidania.common.lib.LibMod;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber(modid = LibMod.MOD_ID)
public class CommonProxy implements IProxy {
    @Override
    public void preInit(FMLPreInitializationEvent event) {
        InitFluids.init();
    }

    @Override
    public void init(FMLInitializationEvent event) {

    }

    @Override
    public void postInit(FMLPostInitializationEvent event) {

    }

    @SubscribeEvent
    public static void registerBlocks(RegistryEvent.Register<Block> event) {
        InitBlocks.init(event.getRegistry());
        InitTileEntities.init();
    }

    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event) {
        InitItems.init(event.getRegistry());
    }
}