package red.jad.jads.proxy;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import red.jad.jads.features.FeaturesPotions;
import red.jad.jads.util.handlers.OreGenHandler;
import red.jad.jads.util.handlers.SmeltingHandler;

public class ClientProxy implements IProxy {
	
	public void preInit(FMLPreInitializationEvent event) {}

	public void init(FMLInitializationEvent event) {
		SmeltingHandler.registerRecipes();
		GameRegistry.registerWorldGenerator(new OreGenHandler(), 0);
	}

	public void postInit(FMLPostInitializationEvent event) {

	}
}
