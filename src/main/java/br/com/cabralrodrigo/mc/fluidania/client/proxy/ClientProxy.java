package br.com.cabralrodrigo.mc.fluidania.client.proxy;

import br.com.cabralrodrigo.mc.fluidania.client.init.InitModels;
import br.com.cabralrodrigo.mc.fluidania.client.init.InitSprites;
import br.com.cabralrodrigo.mc.fluidania.common.proxy.CommonProxy;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.event.TextureStitchEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
@Mod.EventBusSubscriber(Side.CLIENT)
public class ClientProxy extends CommonProxy {
    @SubscribeEvent
    public static void registerModels(ModelRegistryEvent event) {
        InitModels.init();
    }

    @SubscribeEvent
    public static void onTextureStich(TextureStitchEvent.Pre event) {
        InitSprites.init(event.getMap());
    }
}