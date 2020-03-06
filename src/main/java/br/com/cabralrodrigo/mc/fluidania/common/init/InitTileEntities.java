package br.com.cabralrodrigo.mc.fluidania.common.init;

import br.com.cabralrodrigo.mc.fluidania.common.lib.LibBlockNames;
import br.com.cabralrodrigo.mc.fluidania.common.lib.LibMod;
import br.com.cabralrodrigo.mc.fluidania.common.tile.TileEntityManaDiffuser;
import br.com.cabralrodrigo.mc.fluidania.common.tile.TileEntityManaInfuser;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry;

public final class InitTileEntities {
    public static void init() {
        GameRegistry.registerTileEntity(TileEntityManaDiffuser.class, new ResourceLocation(LibMod.MOD_ID, LibBlockNames.MANA_DIFFUSER));
        GameRegistry.registerTileEntity(TileEntityManaInfuser.class, new ResourceLocation(LibMod.MOD_ID, LibBlockNames.MANA_INFUSER));
    }
}
