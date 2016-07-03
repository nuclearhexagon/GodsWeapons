package com.hexagon.gui;

import java.util.List;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Enchantments;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import com.hexagon.item.ModItems;

public class ModCreativeTab extends CreativeTabs{

	public ModCreativeTab(int index, String label) {
		super(index, label);
	}

	@Override
	public Item getTabIconItem() {
		return ModItems.storm_hammer;
	}
	
	@SideOnly(Side.CLIENT)
    public void displayAllRelevantItems(List itemList) {
		
		itemList.add(new ItemStack(ModItems.air_essence));
		itemList.add(new ItemStack(ModItems.light_essence));
		itemList.add(new ItemStack(ModItems.dark_essence));
		itemList.add(new ItemStack(ModItems.fire_essence));
		itemList.add(new ItemStack(ModItems.defense_essence));
		itemList.add(new ItemStack(ModItems.power_essence));
		itemList.add(new ItemStack(ModItems.speed_essence));
		itemList.add(new ItemStack(ModItems.water_essence));
		
		itemList.add(new ItemStack(ModItems.ring));
		itemList.add(new ItemStack(ModItems.air_ring));
		itemList.add(new ItemStack(ModItems.light_ring));
		itemList.add(new ItemStack(ModItems.dark_ring));
		itemList.add(new ItemStack(ModItems.fire_ring));
		itemList.add(new ItemStack(ModItems.defense_ring));
		itemList.add(new ItemStack(ModItems.power_ring));
		itemList.add(new ItemStack(ModItems.speed_ring));
		itemList.add(new ItemStack(ModItems.water_ring));
		
		itemList.add(new ItemStack(ModItems.soul));
		itemList.add(new ItemStack(ModItems.ice_soul));
		itemList.add(new ItemStack(ModItems.gold_soul));
		itemList.add(new ItemStack(ModItems.emerald_soul));
		itemList.add(new ItemStack(ModItems.fire_soul));
		
		itemList.add(new ItemStack(ModItems.crystal));
		itemList.add(new ItemStack(ModItems.diamond_crystal));
		itemList.add(new ItemStack(ModItems.emerald_crystal));
		itemList.add(new ItemStack(ModItems.gold_crystal));
		itemList.add(new ItemStack(ModItems.gold_soul_crystal));
		itemList.add(new ItemStack(ModItems.ice_crystal));
		itemList.add(new ItemStack(ModItems.soul_crystal));
		itemList.add(new ItemStack(ModItems.frost_crystal));
		itemList.add(new ItemStack(ModItems.demon_crystal));
		
		itemList.add(new ItemStack(ModItems.boreas_sword));
		itemList.add(new ItemStack(ModItems.storm_hammer));
		itemList.add(new ItemStack(ModItems.diamond_hammer));
		ItemStack oath_sword = new ItemStack(ModItems.oath_sword);
		oath_sword.addEnchantment(Enchantments.SMITE, 5);
		oath_sword.addEnchantment(Enchantments.KNOCKBACK, 10);
        itemList.add(oath_sword);
        ItemStack smite_sword = new ItemStack(ModItems.smite_sword);
        smite_sword.addEnchantment(Enchantments.SMITE, 5);
        itemList.add(smite_sword);
		ItemStack hades_sword = new ItemStack(ModItems.hades_sword);
		hades_sword.addEnchantment(Enchantments.FIRE_ASPECT, 5);
		hades_sword.addEnchantment(Enchantments.KNOCKBACK, 5);
        itemList.add(hades_sword);
        ItemStack demon_sword = new ItemStack(ModItems.demon_sword);
        demon_sword.addEnchantment(Enchantments.FIRE_ASPECT, 5);
        itemList.add(demon_sword);
        ItemStack apollo_bow = new ItemStack(ModItems.apollo_bow);
        apollo_bow.addEnchantment(Enchantments.FLAME, 10);
        apollo_bow.addEnchantment(Enchantments.KNOCKBACK, 1);
        apollo_bow.addEnchantment(Enchantments.PUNCH, 5);
        apollo_bow.addEnchantment(Enchantments.POWER, 5);
        itemList.add(apollo_bow);
		
		itemList.add(new ItemStack(ModItems.storm_head));
		itemList.add(new ItemStack(ModItems.hammer_head));
		itemList.add(new ItemStack(ModItems.oath_blade));
		itemList.add(new ItemStack(ModItems.hades_blade));
		itemList.add(new ItemStack(ModItems.hammer_handle));
		
		itemList.add(new ItemStack(ModItems.ares_chestplate));
		itemList.add(new ItemStack(ModItems.r_iron_chestplate));
		itemList.add(new ItemStack(ModItems.r_iron_boots));
		ItemStack hermes_boots = new ItemStack(ModItems.hermes_boots);
		hermes_boots.addEnchantment(Enchantments.DEPTH_STRIDER, 5);
        itemList.add(hermes_boots);
		itemList.add(new ItemStack(ModItems.r_iron_boot));
		itemList.add(new ItemStack(ModItems.hermes_boot));
		
		itemList.add(new ItemStack(ModItems.obsidian_stick));
		itemList.add(new ItemStack(ModItems.pyro_stick));
		itemList.add(new ItemStack(ModItems.dark_steel));
		itemList.add(new ItemStack(ModItems.cursed_steel));
		itemList.add(new ItemStack(ModItems.sacred_gold));
		itemList.add(new ItemStack(ModItems.emerald_string));
		itemList.add(new ItemStack(ModItems.gold_feather));
		itemList.add(new ItemStack(ModItems.recipe_book));
	}

}
