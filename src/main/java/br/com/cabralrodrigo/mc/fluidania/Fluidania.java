package br.com.cabralrodrigo.mc.fluidania;

import br.com.cabralrodrigo.mc.fluidania.common.lib.LibMod;
import br.com.cabralrodrigo.mc.fluidania.common.proxy.IProxy;
import net.minecraftforge.fluids.FluidRegistry;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = LibMod.MOD_ID, name = LibMod.NAME, version = LibMod.VERSION, dependencies = LibMod.DEPENDENCIES)
public class Fluidania {

    static { FluidRegistry.enableUniversalBucket(); }

    @SidedProxy(modId = LibMod.MOD_ID, serverSide = LibMod.PROXY_SERVER, clientSide = LibMod.PROXY_CLIENT)
    public static IProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        proxy.preInit(event);
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        proxy.init(event);
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        proxy.postInit(event);
    }
}