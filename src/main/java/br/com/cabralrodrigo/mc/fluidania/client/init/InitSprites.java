package br.com.cabralrodrigo.mc.fluidania.client.init;

import br.com.cabralrodrigo.mc.fluidania.client.lib.LibSpriteNames;
import br.com.cabralrodrigo.mc.fluidania.client.list.ModSprites;
import br.com.cabralrodrigo.mc.fluidania.common.lib.LibMod;
import net.minecraft.client.renderer.texture.TextureAtlasSprite;
import net.minecraft.client.renderer.texture.TextureMap;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public final class InitSprites {
    public static void init(TextureMap textureMap) {
        ModSprites.manaInfuserOverlay = registerSprite(textureMap, LibSpriteNames.MANA_INFUSER);
        ModSprites.manaDiffuserOverlay = registerSprite(textureMap, LibSpriteNames.MANA_DIFFUSER);
    }

    private static TextureAtlasSprite registerSprite(TextureMap map, String name) {
        return map.registerSprite(new ResourceLocation(LibMod.MOD_ID + ":sprites/" + name));
    }
}
