package com.hexagon.main;

import com.hexagon.crafting.RecipeManager;
import com.hexagon.handler.GuiHandler;
import com.hexagon.item.ModItems;
import com.hexagon.proxy.CommonProxy;
import com.hexagon.util.Constants;
import com.hexagon.worldgen.WorldGeneration;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid = Constants.MOD_ID, name = Constants.MOD_NAME, version = Constants.MOD_VERSION)
public class GodWeapons {
	
	@Instance(Constants.MOD_ID)
	public static GodWeapons instance;

	@SidedProxy(clientSide = Constants.CLIENT_PROXY, serverSide = Constants.SERVER_PROXY)
	public static CommonProxy proxy;
	
	@EventHandler
	public static void preInit(FMLPreInitializationEvent event) {
		proxy.registerRenderInfo();
		ModItems.registerItems();
		ModItems.registerBlocks();
		NetworkRegistry.INSTANCE.registerGuiHandler(instance, new GuiHandler());
		RecipeManager.registerRecipes();
		proxy.registerRenderThings();
		WorldGeneration WorldGen = new WorldGeneration();
		GameRegistry.registerWorldGenerator(WorldGen, 0);
	}
	
	@EventHandler
	public static void init(FMLInitializationEvent event) {
	}

	@EventHandler
	public static void postInit(FMLPostInitializationEvent event) {
	}
}
