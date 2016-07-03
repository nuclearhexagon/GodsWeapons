package com.hexagon.item;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.GameRegistry;

import com.hexagon.main.GodWeapons;
import com.hexagon.main.Reference;

public class ModItems {

	public static final ToolMaterial material_hammer = EnumHelper.addToolMaterial("material_hammer", 3, 15000, 10.0f, 16.0f, 10);
	public static final ToolMaterial material_storm = EnumHelper.addToolMaterial("material_storm", 3, 30000, 10.0f, 66.0f, 20);
	public static final ToolMaterial material_smite = EnumHelper.addToolMaterial("material_smite", 2, 800, 10.0f, 1.0f, 10);
	public static final ToolMaterial material_oath = EnumHelper.addToolMaterial("material_oath", 2, 1600, 10.0f, 3.0f, 10);
	public static final ToolMaterial material_demon = EnumHelper.addToolMaterial("material_demon", 2, 2000, 10.0f, 6.0f, 10);
	public static final ToolMaterial material_hades = EnumHelper.addToolMaterial("material_hades", 2, 3000, 10.0f, 16.0f, 10);
	public static final ToolMaterial material_boreas = EnumHelper.addToolMaterial("material_boreas", 2, 2500, 10.0f, 11.0f, 10);
	
	
	
	//		ARMOR MATERIALS		//
	public static final ArmorMaterial armor_iron = EnumHelper.addArmorMaterial("armor_iron", "godweapons:armor_iron", 30, new int[]{4, 9, 7, 4}, 10, null, 0);
	public static final ArmorMaterial armor_ares = EnumHelper.addArmorMaterial("armor_ares", "godweapons:armor_ares",60, new int[]{4, 10, 7, 4}, 10, null, 0);
	public static final ArmorMaterial armor_hermes = EnumHelper.addArmorMaterial("armor_hermes", "godweapons:armor_hermes",60, new int[]{4, 8, 7, 4}, 10, null, 0);
	public static final ArmorMaterial armor_ring = EnumHelper.addArmorMaterial("armor_ring", "godweapons:armor_ring", 25, new int[]{0, 0, 0, 0}, 10, null, 0);
	
	// ESSENCES
	public static Item air_essence;
	public static Item light_essence;
	public static Item dark_essence;
	public static Item fire_essence;
	public static Item defense_essence;
	public static Item power_essence;
	public static Item speed_essence;
	public static Item water_essence;
	
	// RINGS
	public static Item ring;
	public static Item air_ring;
	public static Item light_ring;
	public static Item dark_ring;
	public static Item fire_ring;
	public static Item defense_ring;
	public static Item power_ring;
	public static Item speed_ring;
	public static Item water_ring;
	
	// SOULS
	public static Item soul;
	public static Item ice_soul;
	public static Item gold_soul;
	public static Item emerald_soul;
	public static Item fire_soul;
	
	// CRYSTALS
	public static Item crystal;
	public static Item diamond_crystal;
	public static Item emerald_crystal;
	public static Item gold_crystal;
	public static Item gold_soul_crystal;
	public static Item ice_crystal;
	public static Item soul_crystal;
	public static Item frost_crystal;
	public static Item demon_crystal;
	
	// WEAPONS
	public static Item boreas_sword;
	public static Item storm_hammer;
	public static Item diamond_hammer;
	public static Item oath_sword;
	public static Item smite_sword;
	public static Item hades_sword;
	public static Item demon_sword;
	public static Item apollo_bow;
	
	//WEAPON PARTS
	public static Item storm_head;
	public static Item hammer_head;
	public static Item oath_blade;
	public static Item hades_blade;
	public static Item hammer_handle;
	
	// ARMORS
	public static Item ares_chestplate;
	public static Item r_iron_chestplate;
	public static Item r_iron_boots;
	public static Item hermes_boots;
	public static Item r_iron_boot;
	public static Item hermes_boot;
	
	//ITEMS
	public static Item obsidian_stick;
	public static Item pyro_stick;
	public static Item dark_steel;
	public static Item cursed_steel;
	public static Item sacred_gold;
	public static Item emerald_string;
	public static Item gold_feather;
	public static Item recipe_book;
	
	public static void init() {
		air_essence = new Item().setCreativeTab(GodWeapons.tab).setUnlocalizedName("air_essence");
		light_essence = new Item().setCreativeTab(GodWeapons.tab).setUnlocalizedName("light_essence");
		dark_essence = new Item().setCreativeTab(GodWeapons.tab).setUnlocalizedName("dark_essence");
		fire_essence = new Item().setCreativeTab(GodWeapons.tab).setUnlocalizedName("fire_essence");
		defense_essence = new Item().setCreativeTab(GodWeapons.tab).setUnlocalizedName("defense_essence");
		power_essence = new Item().setCreativeTab(GodWeapons.tab).setUnlocalizedName("power_essence");
		speed_essence = new Item().setCreativeTab(GodWeapons.tab).setUnlocalizedName("speed_essence");
		water_essence = new Item().setCreativeTab(GodWeapons.tab).setUnlocalizedName("water_essence");
		
		ring = new ModArmor("ring", armor_ring, 0, EntityEquipmentSlot.OFFHAND);
		air_ring = new ModArmor("air_ring", armor_ring, 0, EntityEquipmentSlot.OFFHAND);
		light_ring = new ModArmor("light_ring", armor_ring, 0, EntityEquipmentSlot.OFFHAND);
		dark_ring = new ModArmor("dark_ring", armor_ring, 0, EntityEquipmentSlot.OFFHAND);
		fire_ring = new ModArmor("fire_ring", armor_ring, 0, EntityEquipmentSlot.OFFHAND);
		defense_ring = new ModArmor("defense_ring", armor_ring, 0, EntityEquipmentSlot.OFFHAND);
		power_ring = new ModArmor("power_ring", armor_ring, 0, EntityEquipmentSlot.OFFHAND);
		speed_ring = new ModArmor("speed_ring", armor_ring, 0, EntityEquipmentSlot.OFFHAND);
		water_ring = new ModArmor("water_ring", armor_ring, 0, EntityEquipmentSlot.OFFHAND);
		
		soul = new Item().setCreativeTab(GodWeapons.tab).setUnlocalizedName("soul");
		ice_soul = new Item().setCreativeTab(GodWeapons.tab).setUnlocalizedName("ice_soul");
		gold_soul = new Item().setCreativeTab(GodWeapons.tab).setUnlocalizedName("gold_soul");
		emerald_soul = new Item().setCreativeTab(GodWeapons.tab).setUnlocalizedName("emerald_soul");
		fire_soul = new Item().setCreativeTab(GodWeapons.tab).setUnlocalizedName("fire_soul");
		
		crystal = new Item().setCreativeTab(GodWeapons.tab).setUnlocalizedName("crystal");
		diamond_crystal = new Item().setCreativeTab(GodWeapons.tab).setUnlocalizedName("diamond_crystal");
		emerald_crystal = new Item().setCreativeTab(GodWeapons.tab).setUnlocalizedName("emerald_crystal");
		gold_crystal = new Item().setCreativeTab(GodWeapons.tab).setUnlocalizedName("gold_crystal");
		gold_soul_crystal = new Item().setCreativeTab(GodWeapons.tab).setUnlocalizedName("gold_soul_crystal");
		ice_crystal = new Item().setCreativeTab(GodWeapons.tab).setUnlocalizedName("ice_crystal");
		soul_crystal = new Item().setCreativeTab(GodWeapons.tab).setUnlocalizedName("soul_crystal");
		frost_crystal = new Item().setCreativeTab(GodWeapons.tab).setUnlocalizedName("frost_crystal");
		demon_crystal = new Item().setCreativeTab(GodWeapons.tab).setUnlocalizedName("demon_crystal");
		
		boreas_sword = new ModSword("boreas_sword", material_boreas);
		storm_hammer = new StormHammer("storm_hammer", material_storm);
		diamond_hammer = new ModSword("diamond_hammer", material_hammer);
		oath_sword = new ModSword("oath_sword", material_oath);
		smite_sword = new ModSword("smite_sword", material_smite);
		hades_sword = new ModSword("hades_sword", material_hades);
		demon_sword = new ModSword("demon_sword", material_demon);
		apollo_bow = new ApolloBow("apollo_bow");
		
		storm_head = new Item().setCreativeTab(GodWeapons.tab).setUnlocalizedName("storm_head");
		hammer_head = new Item().setCreativeTab(GodWeapons.tab).setUnlocalizedName("hammer_head");
		oath_blade = new Item().setCreativeTab(GodWeapons.tab).setUnlocalizedName("oath_blade");
		hades_blade = new Item().setCreativeTab(GodWeapons.tab).setUnlocalizedName("hades_blade");
		hammer_handle = new Item().setCreativeTab(GodWeapons.tab).setUnlocalizedName("hammer_handle");
		
		ares_chestplate = new ModArmor("ares_chestplate", armor_ares, 1, EntityEquipmentSlot.CHEST);
		r_iron_chestplate = new ModArmor("r_iron_chestplate", armor_iron, 1, EntityEquipmentSlot.CHEST);
		r_iron_boots = new ModArmor("r_iron_boots", armor_iron, 1, EntityEquipmentSlot.FEET);
		hermes_boots = new ModArmor("hermes_boots", armor_hermes, 1, EntityEquipmentSlot.FEET);
		r_iron_boot = new Item().setCreativeTab(GodWeapons.tab).setUnlocalizedName("r_iron_boot");
		hermes_boot = new Item().setCreativeTab(GodWeapons.tab).setUnlocalizedName("hermes_boot");
		
		obsidian_stick = new Item().setCreativeTab(GodWeapons.tab).setUnlocalizedName("obsidian_stick");
		pyro_stick = new Item().setCreativeTab(GodWeapons.tab).setUnlocalizedName("pyro_stick");
		dark_steel = new Item().setCreativeTab(GodWeapons.tab).setUnlocalizedName("dark_steel");
		cursed_steel = new Item().setCreativeTab(GodWeapons.tab).setUnlocalizedName("cursed_steel");
		sacred_gold = new Item().setCreativeTab(GodWeapons.tab).setUnlocalizedName("sacred_gold");
		emerald_string = new Item().setCreativeTab(GodWeapons.tab).setUnlocalizedName("emerald_string");
		gold_feather = new Item().setCreativeTab(GodWeapons.tab).setUnlocalizedName("gold_feather");
		recipe_book = new RecipeBook("recipe_book");
	}
	
	private static void register(Item item) {
		GameRegistry.registerItem(item, item.getUnlocalizedName().substring(5));
	}
	
	public static void registerItems() {
		register(air_essence);
		register(light_essence);
		register(dark_essence);
		register(fire_essence);
		register(defense_essence);
		register(power_essence);
		register(speed_essence);
		register(water_essence);
		
		register(ring);
		register(air_ring);
		register(light_ring);
		register(dark_ring);
		register(fire_ring);
		register(defense_ring);
		register(power_ring);
		register(speed_ring);
		register(water_ring);
		
		register(soul);
		register(ice_soul);
		register(gold_soul);
		register(emerald_soul);
		register(fire_soul);
		
		register(crystal);
		register(diamond_crystal);
		register(emerald_crystal);
		register(gold_crystal);
		register(gold_soul_crystal);
		register(ice_crystal);
		register(soul_crystal);
		register(frost_crystal);
		register(demon_crystal);
		
		register(boreas_sword);
		register(storm_hammer);
		register(diamond_hammer);
		register(oath_sword);
		register(smite_sword);
		register(hades_sword);
		register(demon_sword);
		register(apollo_bow);
		
		register(storm_head);
		register(hammer_head);
		register(oath_blade);
		register(hades_blade);
		register(hammer_handle);
		
		register(ares_chestplate);
		register(r_iron_chestplate);
		register(r_iron_boots);
		register(hermes_boots);
		register(r_iron_boot);
		register(hermes_boot);
		
		register(obsidian_stick);
		register(pyro_stick);
		register(dark_steel);
		register(cursed_steel);
		register(sacred_gold);
		register(emerald_string);
		register(gold_feather);
		register(recipe_book);
	}
	
	public static void render(Item item){
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Reference.MOD_ID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
	}
	
	public static void renderItems() {
		render(air_essence);
		render(light_essence);
		render(dark_essence);
		render(fire_essence);
		render(defense_essence);
		render(power_essence);
		render(speed_essence);
		render(water_essence);
		
		render(ring);
		render(air_ring);
		render(light_ring);
		render(dark_ring);
		render(fire_ring);
		render(defense_ring);
		render(power_ring);
		render(speed_ring);
		render(water_ring);
		
		render(soul);
		render(ice_soul);
		render(gold_soul);
		render(emerald_soul);
		render(fire_soul);
		
		render(crystal);
		render(diamond_crystal);
		render(emerald_crystal);
		render(gold_crystal);
		render(gold_soul_crystal);
		render(ice_crystal);
		render(soul_crystal);
		render(frost_crystal);
		render(demon_crystal);
		
		render(boreas_sword);
		render(storm_hammer);
		render(diamond_hammer);
		render(oath_sword);
		render(smite_sword);
		render(hades_sword);
		render(demon_sword);
		render(apollo_bow);
		
		render(storm_head);
		render(hammer_head);
		render(oath_blade);
		render(hades_blade);
		render(hammer_handle);
		
		render(ares_chestplate);
		render(r_iron_chestplate);
		render(r_iron_boots);
		render(hermes_boots);
		render(r_iron_boot);
		render(hermes_boot);
		
		render(obsidian_stick);
		render(pyro_stick);
		render(dark_steel);
		render(cursed_steel);
		render(sacred_gold);
		render(emerald_string);
		render(gold_feather);
		render(recipe_book);
	}
}
