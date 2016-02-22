package com.hexagon.crafting;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

import com.hexagon.item.ModItems;

import cpw.mods.fml.common.registry.GameRegistry;

public class RecipeManager {
	public static void registerRecipes() {
		addCraftingRec();
		addSmeltingRec();
	}
	
	public static void addCraftingRec() {
		
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.Soul), Items.spider_eye, Items.rotten_flesh, Items.bone);
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.RecipeBook), ModItems.CursedSteel, Items.book, ModItems.CursedSteel);
		GameRegistry.addRecipe(new ItemStack(ModItems.CursedSteel), " X ", "XYX", " X " , 'X', ModItems.DarkSteel, 'Y', ModItems.Soul);
		GameRegistry.addRecipe(new ItemStack(ModItems.HephaestusBench), "XXX", "XZX", "XXX", 'X', ModItems.CursedSteel, 'Z', Blocks.crafting_table);,
		
	}

	public static void addSmeltingRec() {
		GameRegistry.addSmelting(ModItems.DarkSteelOre, new ItemStack(ModItems.DarkSteel, 1), 0.1f);
	}
}
