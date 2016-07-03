package com.hexagon.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

import com.hexagon.main.Reference;

public class ModBlocks {
	
	public static Block dark_steel_ore;
	public static Block hephaestus_bench;
	
	public static void init() {
		
	}
	
	public static void register() {
		GameRegistry.registerBlock(dark_steel_ore = new DarkSteelOre(Material.IRON), dark_steel_ore.getUnlocalizedName().substring(5));
	}
	
	public static void registerRenders() {
		registerRender(dark_steel_ore);
	}
	
	public static void registerRender(Block block) {
		Item item = Item.getItemFromBlock(block);
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Reference.MOD_ID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
	}
}