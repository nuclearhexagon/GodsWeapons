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
		
		//----- RINGS -----//
        GameRegistry.addRecipe(new ItemStack(ModItems.Ring)," X ","X X"," X ",'X', ModItems.SacredGold);
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.WaterRing), ModItems.Ring,ModItems.WaterEssence);
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.FireRing), ModItems.Ring, ModItems.FireEssence);
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.AirRing), ModItems.Ring, ModItems.AirEssence);
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.SpeedRing), ModItems.Ring, ModItems.SpeedEssence);
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.PowerRing), ModItems.Ring, ModItems.PowerEssence);
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.DefenseRing), ModItems.Ring, ModItems.DefenseEssence);
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.LightRing), ModItems.Ring, ModItems.LightEssence);
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.DarkRing), ModItems.Ring, ModItems.DarkEssence);
		
		//----- ESSENCES -----//
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.WaterEssence), Items.water_bucket);
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.FireEssence), ModItems.WaterEssence, Items.blaze_powder);
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.SpeedEssence), ModItems.WaterEssence, Items.redstone);
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.AirEssence), ModItems.WaterEssence, Items.ghast_tear);
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.DarkEssence), ModItems.WaterEssence, Items.ender_pearl);
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.LightEssence), ModItems.WaterEssence, Items.ender_eye);
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.PowerEssence), ModItems.WaterEssence, Items.diamond);
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.DefenseEssence), ModItems.WaterEssence, Items.emerald);
		
		//----- CRYSTAL & SOUL -----//
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.Soul), Items.spider_eye, Items.rotten_flesh, Items.bone);
		GameRegistry.addRecipe(new ItemStack(ModItems.DiamondCrystal), "D", "C", "D", 'D', Items.diamond, 'C', ModItems.Crystal);
		GameRegistry.addRecipe(new ItemStack(ModItems.Crystal), "G", "G", "G", 'G', Blocks.glass);
		GameRegistry.addRecipe(new ItemStack(ModItems.SoulCrystal), "S", "C", 'S', ModItems.Soul, 'C', ModItems.Crystal);
		GameRegistry.addRecipe(new ItemStack(ModItems.GoldSoul), " X ", "XYX", " X ", 'X', ModItems.GoldCrystal, 'Y', ModItems.Soul);
		GameRegistry.addRecipe(new ItemStack(ModItems.GoldCrystal), "G", "C", "G", 'G', Items.gold_ingot, 'C', ModItems.Crystal);
		GameRegistry.addRecipe(new ItemStack(ModItems.GoldSoulCrystal), "S", "C", 'S', ModItems.GoldSoul, 'C', ModItems.Crystal);
		GameRegistry.addRecipe(new ItemStack(ModItems.FireSoul), " F ", "FDF", " F ", 'F', Items.blaze_powder, 'D', ModItems.Soul);
		GameRegistry.addRecipe(new ItemStack(ModItems.EmeraldSoul), " X ", "XYX", " X ", 'X', ModItems.EmeraldCrystal, 'Y', ModItems.Soul);
		GameRegistry.addRecipe(new ItemStack(ModItems.EmeraldCrystal), "Y", "X", "Y", 'X', ModItems.Crystal, 'Y', Items.emerald);
		GameRegistry.addRecipe(new ItemStack(ModItems.IceSoul), " Y ", "YXY", " Y ", 'X', ModItems.Soul, 'Y', Blocks.packed_ice);
		GameRegistry.addRecipe(new ItemStack(ModItems.IceCrystal), " Y ", " X ", " Y ", 'X', ModItems.DiamondCrystal, 'Y', Blocks.packed_ice);
		GameRegistry.addRecipe(new ItemStack(ModItems.FrostCrystal), " Y ", "YXY", " Y ", 'X', ModItems.IceCrystal, 'Y', ModItems.IceSoul);
		GameRegistry.addRecipe(new ItemStack(ModItems.DemonCrystal), " F ", "FDF", " F ", 'F', ModItems.FireSoul, 'D', ModItems.DiamondCrystal);
		
		//----- WEAPONS -----//
		//MAIN
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.DiamondHammer), ModItems.DiamondHammerHead, ModItems.DiamondHammerHandle);
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.LegendaryHammer), ModItems.LegendaryHammerHead, ModItems.DiamondHammer);
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.LegendarySword), ModItems.LegendarySwordBlade, ModItems.GoldSword);
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.HadesSword), ModItems.HadesSwordBlade, ModItems.DemonSword);
		GameRegistry.addRecipe(new ItemStack(ModItems.GoldSword), " CC", "CCC", "GC ", 'C', ModItems.GoldCrystal, 'G', ModItems.ObsidianStick);
		GameRegistry.addRecipe(new ItemStack(ModItems.DemonSword), " DD", "DFD", "OD ", 'D', ModItems.DemonCrystal, 'F', ModItems.FireSoul, 'O', ModItems.ObsidianStick);
		GameRegistry.addRecipe(new ItemStack(ModItems.ApolloBow), "XY ", "X Y", "XY ", 'X', ModItems.EmeraldString, 'Y', ModItems.PyroStick);
		GameRegistry.addRecipe(new ItemStack(ModItems.ApolloBow), " YX", "Y X", " YX", 'X', ModItems.EmeraldString, 'Y', ModItems.PyroStick);
		GameRegistry.addRecipe(new ItemStack(ModItems.ApolloBow), "XY", "XY", "XY", 'X', ModItems.PyroStick, 'Y', ModItems.EmeraldString);
		GameRegistry.addRecipe(new ItemStack(ModItems.ApolloBow), "YX", "YX", "YX", 'X', ModItems.PyroStick, 'Y', ModItems.EmeraldString);
		GameRegistry.addRecipe(new ItemStack(ModItems.BoreasSword), " XX", "XYX", "OX ", 'X', ModItems.FrostCrystal, 'Y', ModItems.IceSoul, 'O', ModItems.ObsidianStick);
		//PARTS
		GameRegistry.addRecipe(new ItemStack(ModItems.DiamondHammerHandle), "D ", "O ", "DD", 'D', ModItems.DiamondCrystal, 'O', ModItems.ObsidianStick);
		GameRegistry.addRecipe(new ItemStack(ModItems.DiamondHammerHead), " D ", "CCC", "CCC", 'D', Items.diamond, 'C', ModItems.DiamondCrystal);
		GameRegistry.addRecipe(new ItemStack(ModItems.LegendarySwordBlade), " CC", "CCC", "GC ", 'C', ModItems.GoldCrystal, 'G', ModItems.GoldSoulCrystal);
		GameRegistry.addRecipe(new ItemStack(ModItems.HadesSwordBlade), " DD", "DDD", "FD ", 'F', ModItems.FireSoul, 'D', ModItems.DemonCrystal);
		GameRegistry.addRecipe(new ItemStack(ModItems.LegendaryHammerHead), " C ", "DDD", "DHD", 'C', ModItems.SoulCrystal, 'D', ModItems.DiamondCrystal, 'H', ModItems.DiamondHammerHead);
		
		//----- ARMORS -----//
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.ReinforcedIronBoot, 2), ModItems.ReinforcedIronBoots);
		GameRegistry.addRecipe(new ItemStack(ModItems.ReinforcedIronBoots), " D ", "DFD", " D ", 'F', Items.iron_boots, 'D', Blocks.iron_block);
		GameRegistry.addRecipe(new ItemStack(ModItems.ReinforcedIronBoots), "FF", 'F', ModItems.ReinforcedIronBoot);
		GameRegistry.addRecipe(new ItemStack(ModItems.HermesBoots), "FF", 'F', ModItems.HermesBoot);
		GameRegistry.addRecipe(new ItemStack(ModItems.HermesBoot), " S ", "FBF", " S ", 'B', ModItems.ReinforcedIronBoot, 'F', ModItems.GoldFeather, 'S', ModItems.GoldSoul);
		GameRegistry.addRecipe(new ItemStack(ModItems.ReinforcedIronChestplate), " F ", "FBF", " F ", 'B', Items.iron_chestplate, 'F', Blocks.iron_block);
		GameRegistry.addRecipe(new ItemStack(ModItems.AresChestplate), "D D", "DFD", "DCD", 'C', ModItems.ReinforcedIronChestplate, 'F', ModItems.FireSoul, 'D', ModItems.DemonCrystal);
		
		//----- OTHER -----//
		// GameRegistry.addRecipe(new ItemStack(ModItems.HephaestusBench), "XXX", "XZX", "XXX", 'X', ModItems.CursedSteel, 'Z', Blocks.crafting_table);
		GameRegistry.addRecipe(new ItemStack(ModItems.SacredGold), "FCF", "CDC", "FCF", 'D', ModItems.Soul, 'C', ModItems.GoldCrystal, 'F',ModItems.GoldSoul);
		GameRegistry.addRecipe(new ItemStack(ModItems.ObsidianStick), "O", "O", 'O', Blocks.obsidian);
		GameRegistry.addRecipe(new ItemStack(ModItems.CursedSteel), " X ", "XYX", " X " , 'X', ModItems.DarkSteel, 'Y', ModItems.Soul);
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.RecipeBook), ModItems.CursedSteel, Items.book);
		GameRegistry.addRecipe(new ItemStack(ModItems.GoldFeather), " D ", "DFD", " D ", 'F', Items.feather, 'D', ModItems.GoldCrystal);
		GameRegistry.addRecipe(new ItemStack(ModItems.EmeraldString, 3), "O", "Y", 'O', ModItems.EmeraldSoul, 'Y', Items.string);
		GameRegistry.addRecipe(new ItemStack(ModItems.PyroStick, 3), "X", "Y", "X", 'X', ModItems.DemonCrystal, 'Y', ModItems.EmeraldCrystal);
		
		
	}

	public static void addSmeltingRec() {
		GameRegistry.addSmelting(ModItems.DarkSteelOre, new ItemStack(ModItems.DarkSteel, 1), 0.1f);
	}
}
