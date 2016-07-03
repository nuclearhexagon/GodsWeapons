package com.hexagon.main;

import net.minecraft.init.Blocks;
import net.minecraft.init.Enchantments;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

import com.hexagon.block.ModBlocks;
import com.hexagon.item.ModItems;

public class RecipeManager {
	public static void register_recipes() {
		addCraftingRec();
		addSmeltingRec();
	}
	
	public static void addCraftingRec() {
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.air_essence), ModItems.water_essence, Items.GHAST_TEAR);
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.light_essence), ModItems.water_essence, Items.ENDER_EYE);
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.dark_essence), ModItems.water_essence, Items.ENDER_PEARL);
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.fire_essence), ModItems.water_essence, Items.BLAZE_POWDER);
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.defense_essence), ModItems.water_essence, Items.EMERALD);
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.power_essence), ModItems.water_essence, Items.DIAMOND);
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.speed_essence), ModItems.water_essence, Items.REDSTONE);
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.water_essence), Items.WATER_BUCKET);
				
        GameRegistry.addRecipe(new ItemStack(ModItems.ring)," X ","X X"," X ",'X', ModItems.sacred_gold);
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.air_ring), ModItems.ring, ModItems.air_essence);
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.light_ring), ModItems.ring, ModItems.light_essence);
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.dark_ring), ModItems.ring, ModItems.dark_essence);
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.fire_ring), ModItems.ring, ModItems.fire_essence);
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.defense_ring), ModItems.ring, ModItems.defense_essence);
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.power_ring), ModItems.ring, ModItems.power_essence);
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.speed_ring), ModItems.ring, ModItems.speed_essence);
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.water_ring), ModItems.ring,ModItems.water_essence);
		
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.soul), Items.SPIDER_EYE, Items.ROTTEN_FLESH, Items.BONE);
		GameRegistry.addRecipe(new ItemStack(ModItems.ice_soul), " Y ", "YXY", " Y ", 'X', ModItems.soul, 'Y', Blocks.PACKED_ICE);
		GameRegistry.addRecipe(new ItemStack(ModItems.gold_soul), " X ", "XYX", " X ", 'X', ModItems.gold_crystal, 'Y', ModItems.soul);
		GameRegistry.addRecipe(new ItemStack(ModItems.emerald_soul), " X ", "XYX", " X ", 'X', ModItems.emerald_crystal, 'Y', ModItems.soul);
		GameRegistry.addRecipe(new ItemStack(ModItems.fire_soul), " X ", "XYX", " X ", 'X', Items.BLAZE_POWDER, 'Y', ModItems.soul);

		GameRegistry.addRecipe(new ItemStack(ModItems.crystal), "X", "X", "X", 'X', Blocks.GLASS);
		GameRegistry.addRecipe(new ItemStack(ModItems.diamond_crystal), "X", "Y", "X", 'X', Items.DIAMOND, 'Y', ModItems.crystal);
		GameRegistry.addRecipe(new ItemStack(ModItems.emerald_crystal), "Y", "X", "Y", 'X', ModItems.crystal, 'Y', Items.EMERALD);
		GameRegistry.addRecipe(new ItemStack(ModItems.gold_crystal), "X", "Y", "X", 'X', Items.GOLD_INGOT, 'Y', ModItems.crystal);
		GameRegistry.addRecipe(new ItemStack(ModItems.gold_soul_crystal), "X", "Y", 'X', ModItems.gold_soul, 'Y', ModItems.crystal);
		GameRegistry.addRecipe(new ItemStack(ModItems.ice_crystal), " Y ", " X ", " Y ", 'X', ModItems.diamond_crystal, 'Y', Blocks.PACKED_ICE);
		GameRegistry.addRecipe(new ItemStack(ModItems.soul_crystal), "X", "Y", 'X', ModItems.soul, 'Y', ModItems.crystal);
		GameRegistry.addRecipe(new ItemStack(ModItems.frost_crystal), " Y ", "YXY", " Y ", 'X', ModItems.ice_crystal, 'Y', ModItems.ice_soul);
		GameRegistry.addRecipe(new ItemStack(ModItems.demon_crystal), " X ", "XYX", " X ", 'X', ModItems.fire_soul, 'Y', ModItems.diamond_crystal);

		GameRegistry.addRecipe(new ItemStack(ModItems.boreas_sword), " XX", "XYX", "OX ", 'X', ModItems.frost_crystal, 'Y', ModItems.ice_soul, 'O', ModItems.obsidian_stick);
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.storm_hammer), ModItems.storm_head, ModItems.diamond_hammer);
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.diamond_hammer), ModItems.hammer_head, ModItems.hammer_handle);
		ItemStack oath_sword = new ItemStack(ModItems.oath_sword);
		oath_sword.addEnchantment(Enchantments.SMITE, 5);
		oath_sword.addEnchantment(Enchantments.KNOCKBACK, 10);
		GameRegistry.addShapelessRecipe(oath_sword, ModItems.oath_blade, ModItems.smite_sword);
		ItemStack smite_sword = new ItemStack(ModItems.smite_sword);
        smite_sword.addEnchantment(Enchantments.SMITE, 5);
		GameRegistry.addRecipe(smite_sword, " XX", "XXX", "YX ", 'X', ModItems.gold_crystal, 'Y', ModItems.obsidian_stick);
		ItemStack hades_sword = new ItemStack(ModItems.hades_sword);
		hades_sword.addEnchantment(Enchantments.FIRE_ASPECT, 5);
		hades_sword.addEnchantment(Enchantments.KNOCKBACK, 5);
		GameRegistry.addShapelessRecipe(hades_sword, ModItems.hades_blade, ModItems.demon_sword);
		ItemStack demon_sword = new ItemStack(ModItems.demon_sword);
        demon_sword.addEnchantment(Enchantments.FIRE_ASPECT, 5);
		GameRegistry.addRecipe(demon_sword, " XX", "XYX", "ZX ", 'X', ModItems.demon_crystal, 'Y', ModItems.fire_soul, 'Z', ModItems.obsidian_stick);
		ItemStack apollo_bow = new ItemStack(ModItems.apollo_bow);
        apollo_bow.addEnchantment(Enchantments.FLAME, 10);
        apollo_bow.addEnchantment(Enchantments.KNOCKBACK, 1);
        apollo_bow.addEnchantment(Enchantments.PUNCH, 5);
        apollo_bow.addEnchantment(Enchantments.POWER, 5);
		GameRegistry.addRecipe(apollo_bow, "XY ", "X Y", "XY ", 'X', ModItems.emerald_string, 'Y', ModItems.pyro_stick);
		GameRegistry.addRecipe(apollo_bow, " YX", "Y X", " YX", 'X', ModItems.emerald_string, 'Y', ModItems.pyro_stick);

		GameRegistry.addRecipe(new ItemStack(ModItems.storm_head), " X ", "YYY", "YZY", 'X', ModItems.soul_crystal, 'Y', ModItems.diamond_crystal, 'Z', ModItems.hammer_head);
		GameRegistry.addRecipe(new ItemStack(ModItems.hammer_head), " X ", "YYY", "YYY", 'X', Items.DIAMOND, 'Y', ModItems.diamond_crystal);
		GameRegistry.addRecipe(new ItemStack(ModItems.oath_blade), " XX", "XXX", "YX ", 'X', ModItems.gold_crystal, 'Y', ModItems.gold_soul_crystal);
		GameRegistry.addRecipe(new ItemStack(ModItems.hades_blade), " YY", "YYY", "XY ", 'X', ModItems.fire_soul, 'Y', ModItems.demon_crystal);
		GameRegistry.addRecipe(new ItemStack(ModItems.hammer_handle), "X ", "Y ", "XX", 'X', ModItems.diamond_crystal, 'Y', ModItems.obsidian_stick);

		GameRegistry.addRecipe(new ItemStack(ModItems.ares_chestplate), "Z Z", "ZYZ", "ZXZ", 'X', ModItems.r_iron_chestplate, 'Y', ModItems.fire_soul, 'Z', ModItems.demon_crystal);
		GameRegistry.addRecipe(new ItemStack(ModItems.r_iron_chestplate), " Y ", "YXY", " Y ", 'X', Items.IRON_CHESTPLATE, 'Y', Blocks.IRON_BLOCK);
		GameRegistry.addRecipe(new ItemStack(ModItems.r_iron_boots), " Y ", "YXY", " Y ", 'X', Items.IRON_BOOTS, 'Y', Blocks.IRON_BLOCK);
		GameRegistry.addRecipe(new ItemStack(ModItems.r_iron_boots), "XX", 'X', ModItems.r_iron_boot);
		GameRegistry.addRecipe(new ItemStack(ModItems.hermes_boots), "XX", 'X', ModItems.hermes_boot);
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.r_iron_boot, 2), ModItems.r_iron_boots);
		GameRegistry.addRecipe(new ItemStack(ModItems.hermes_boot), " Z ", "YXY", " Z ", 'X', ModItems.r_iron_boot, 'Y', ModItems.gold_feather, 'Z', ModItems.gold_soul);

		GameRegistry.addRecipe(new ItemStack(ModItems.obsidian_stick), "X", "X", 'X', Blocks.OBSIDIAN);
		GameRegistry.addRecipe(new ItemStack(ModItems.pyro_stick, 3), "X", "Y", "X", 'X', ModItems.demon_crystal, 'Y', ModItems.emerald_crystal);
		GameRegistry.addRecipe(new ItemStack(ModItems.cursed_steel), " X ", "XYX", " X " , 'X', ModItems.dark_steel, 'Y', ModItems.soul);
		GameRegistry.addRecipe(new ItemStack(ModItems.sacred_gold), "ZYZ", "YXY", "ZYZ", 'X', ModItems.soul, 'Y', ModItems.gold_crystal, 'Z',ModItems.gold_soul);
		GameRegistry.addRecipe(new ItemStack(ModItems.emerald_string, 3), "X", "Y", 'X', ModItems.emerald_soul, 'Y', Items.STRING);
		GameRegistry.addRecipe(new ItemStack(ModItems.gold_feather), " Y ", "YXY", " Y ", 'X', Items.FEATHER, 'Y', ModItems.gold_crystal);
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.recipe_book), ModItems.cursed_steel, Items.BOOK);
		
		
	}

	public static void addSmeltingRec() {
		GameRegistry.addSmelting(ModBlocks.dark_steel_ore, new ItemStack(ModItems.dark_steel, 1), 5f);
	}
}