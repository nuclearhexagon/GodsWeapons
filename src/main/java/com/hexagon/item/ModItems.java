package com.hexagon.item;

import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraftforge.common.util.EnumHelper;

import com.hexagon.block.BlockHephaestusBench;
import com.hexagon.block.BlockRecipedHephaestusBench;
import com.hexagon.block.CustomBlock;
import com.hexagon.item.armors.ItemEffectRing;
import com.hexagon.item.armors.ItemReinforcedArmor;
import com.hexagon.item.armors.ItemRing;
import com.hexagon.item.other.ItemRecipeBook;
import com.hexagon.item.weapons.ItemApolloBow;
import com.hexagon.item.weapons.ItemBoreasSword;
import com.hexagon.item.weapons.ItemLegendaryHammer;
import com.hexagon.main.GodWeapons;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ModItems {

	public static final int HephaestusBenchGui = 1;
	public static final int RecipeBookGui = 2;
	public static final int RecipedHephaestusBenchGui = 3;
	
	/* --------------------------------------------------------------------------------------------------------- */
	/*		TAB		*/
	/*		TAB		*/
	/*		TAB		*/
	/* --------------------------------------------------------------------------------------------------------- */
	public static final CreativeTabs tabGod = new CreativeTabs("tabGod") {
		@Override
		public Item getTabIconItem() {
			return LegendarySword;
		}
		
		
		@SideOnly(Side.CLIENT)
	    public void displayAllReleventItems(List itemList) {
			
			//OTHER
			itemList.add(new ItemStack(RecipeBook));
			
			//Crystals
			itemList.add(new ItemStack(Crystal));
			itemList.add(new ItemStack(DiamondCrystal));
			itemList.add(new ItemStack(GoldCrystal));
			itemList.add(new ItemStack(EmeraldCrystal));
			itemList.add(new ItemStack(FrostCrystal));
			itemList.add(new ItemStack(IceCrystal));
			itemList.add(new ItemStack(GoldSoulCrystal));
			itemList.add(new ItemStack(SoulCrystal));
			itemList.add(new ItemStack(DemonCrystal));
		
			
			//Souls
			itemList.add(new ItemStack(Soul));
			itemList.add(new ItemStack(GoldSoul));
			itemList.add(new ItemStack(EmeraldSoul));
			itemList.add(new ItemStack(FireSoul));
			itemList.add(new ItemStack(IceSoul));
			
			
			//Armors
			itemList.add(new ItemStack(HermesBoot));
			itemList.add(new ItemStack(ReinforcedIronBoot));
			itemList.add(new ItemStack(ReinforcedIronChestplate));
			itemList.add(new ItemStack(ReinforcedIronBoots));
			itemList.add(new ItemStack(HermesBoots));
			itemList.add(new ItemStack(AresChestplate));
			
			
			//Weapons
			itemList.add(new ItemStack(LegendaryHammerHead));
			itemList.add(new ItemStack(DiamondHammerHead));
			itemList.add(new ItemStack(DiamondHammerHandle));
			itemList.add(new ItemStack(LegendarySwordBlade));
			itemList.add(new ItemStack(HadesSwordBlade));
			itemList.add(new ItemStack(BoreasSword));
			itemList.add(new ItemStack(LegendaryHammer));
			itemList.add(new ItemStack(DiamondHammer));
			ItemStack HadesSword = new ItemStack(ModItems.HadesSword);
			HadesSword.addEnchantment(Enchantment.fireAspect, 5);
			HadesSword.addEnchantment(Enchantment.knockback, 5);
	        itemList.add(HadesSword);
	        ItemStack DemonSword = new ItemStack(ModItems.DemonSword);
	        DemonSword.addEnchantment(Enchantment.fireAspect, 5);
	        itemList.add(DemonSword);
	        ItemStack LegendarySword = new ItemStack(ModItems.LegendarySword);
	        LegendarySword.addEnchantment(Enchantment.smite, 5);
			LegendarySword.addEnchantment(Enchantment.knockback, 10);
	        itemList.add(LegendarySword);
	        ItemStack GoldSword = new ItemStack(ModItems.GoldSword);
	        GoldSword.addEnchantment(Enchantment.smite, 5);
	        itemList.add(GoldSword);
	        ItemStack ApolloBow = new ItemStack(ModItems.ApolloBow);
	        ApolloBow.addEnchantment(Enchantment.flame, 10);
	        ApolloBow.addEnchantment(Enchantment.knockback, 1);
	        ApolloBow.addEnchantment(Enchantment.punch, 5);
	        ApolloBow.addEnchantment(Enchantment.power, 5);
	        itemList.add(ApolloBow);
			
	        
			//Basic Items
			itemList.add(new ItemStack(ObsidianStick));
			itemList.add(new ItemStack(PyroStick));
			itemList.add(new ItemStack(EmeraldString));
			itemList.add(new ItemStack(SacredGold));
			itemList.add(new ItemStack(GoldFeather));
			
			
			//Rings
			itemList.add(new ItemStack(Ring));
			itemList.add(new ItemStack(WaterRing));
			itemList.add(new ItemStack(FireRing));
			itemList.add(new ItemStack(AirRing));
			itemList.add(new ItemStack(SpeedRing));
			itemList.add(new ItemStack(DarkRing));
			itemList.add(new ItemStack(LightRing));
			itemList.add(new ItemStack(PowerRing));
			itemList.add(new ItemStack(DefenseRing));
			
			
			//Essences
			itemList.add(new ItemStack(WaterEssence));
			itemList.add(new ItemStack(FireEssence));
			itemList.add(new ItemStack(AirEssence));
			itemList.add(new ItemStack(SpeedEssence));
			itemList.add(new ItemStack(DarkEssence));
			itemList.add(new ItemStack(LightEssence));
			itemList.add(new ItemStack(PowerEssence));
			itemList.add(new ItemStack(DefenseEssence));
			
			//INGOTS
			itemList.add(new ItemStack(DarkSteel));
			itemList.add(new ItemStack(CursedSteel));
	    }
	};
	
	
	
	public static final CreativeTabs tabGodBlock = new CreativeTabs("tabGodBlock") {
		@Override
		public Item getTabIconItem() {
			return Item.getItemFromBlock(HephaestusBench);
		}
		
		@SideOnly(Side.CLIENT)
	    public void displayAllReleventItems(List itemList) {
			itemList.add(new ItemStack(HephaestusBench));
			itemList.add(new ItemStack(RecipedHephaestusBench));
			itemList.add(new ItemStack(DarkSteelOre));
		}
	};
	
	/* --------------------------------------------------------------------------------------------------------- */
	/*		TOOL, ARMOR MATERIALS AND INDEX		*/
	/*		TOOL, ARMOR MATERIALS AND INDEX		*/
	/*		TOOL, ARMOR MATERIALS AND INDEX		*/
	/* --------------------------------------------------------------------------------------------------------- */
	
	//		TOOL MATERIALS 		//
	public static final ToolMaterial DiamondCrystalMaterial = EnumHelper.addToolMaterial("DiamondCrystalMaterial", 3, 15000, 10.0f, 16.0f, 10);
	public static final ToolMaterial LegendaryMaterial = EnumHelper.addToolMaterial("LegendaryMaterial", 3, 30000, 10.0f, 66.0f, 20);
	public static final ToolMaterial GoldMaterial = EnumHelper.addToolMaterial("GoldMaterial", 2, 800, 10.0f, 1.0f, 10);
	public static final ToolMaterial LegendaryGoldMaterial = EnumHelper.addToolMaterial("LegendaryGoldMaterial", 2, 1600, 10.0f, 3.0f, 10);
	public static final ToolMaterial SatanMaterial = EnumHelper.addToolMaterial("SatanMaterial", 2, 2000, 10.0f, 6.0f, 10);
	public static final ToolMaterial LegendarySatanMaterial = EnumHelper.addToolMaterial("LegendarySatanMaterial", 2, 3000, 10.0f, 16.0f, 10);
	public static final ToolMaterial BoreasMaterial = EnumHelper.addToolMaterial("BoreasMaterial", 2, 2500, 10.0f, 11.0f, 10);
	
	
	
	//		ARMOR MATERIALS		//
	public static final ArmorMaterial ReinforcedIron = EnumHelper.addArmorMaterial("ReinforcedIron", 30, new int[]{4, 9, 7, 4}, 10);
	public static final ArmorMaterial AresArmor = EnumHelper.addArmorMaterial("AresArmor", 60, new int[]{4, 10, 7, 4}, 10);
	public static final ArmorMaterial HermesArmor = EnumHelper.addArmorMaterial("HermesArmor", 60, new int[]{4, 8, 7, 4}, 10);
	public static final ArmorMaterial RingArmor = EnumHelper.addArmorMaterial("RingArmor", 25, new int[]{20, 20, 20, 20}, 10);
	
	
	
	//		INDEX		//
	public static final int HermesIndex = GodWeapons.proxy.addArmor("HermesArmor");
	public static final int ReinforcedIronIndex = GodWeapons.proxy.addArmor("ReinforcedIron");
	public static final int AresIndex = GodWeapons.proxy.addArmor("AresArmor");
	public static final int RingIndex = GodWeapons.proxy.addArmor("RingIndex");
	
	/* --------------------------------------------------------------------------------------------------------- */
	/*		ITEMS		*/	
	/*		ITEMS		*/	
	/*		ITEMS		*/	
	/* --------------------------------------------------------------------------------------------------------- */
	
	//		BASIC ITEMS		//
	public static final Item ObsidianStick = new CustomItem("ObsidianStick", "obsidian_stick");
	public static final Item DiamondHammerHandle = new CustomItem("DiamondHammerHandle", "diamond_hammer_handle");
	public static final Item DiamondHammerHead = new CustomItem("DiamondHammerHead", "diamond_hammer_head");
	public static final Item LegendaryHammerHead = new CustomItem("LegendaryHammerHead", "legendary_diamond_hammer_head");
	public static final Item LegendarySwordBlade = new CustomItem("LegendarySwordBlade", "legendary_gold_sword_blade");
	public static final Item HadesSwordBlade = new CustomItem("HadesSwordBlade", "hades_sword_blade");
	public static final Item GoldFeather = new CustomItem("GoldFeather", "gold_feather")
	.setMaxStackSize(16);
	public static final Item HermesBoot = new CustomItem("HermesBoot", "hermes_boot");
	public static final Item ReinforcedIronBoot = new CustomItem("ReinforcedIronBoot", "reinforced_boot");
	public static final Item PyroStick = new CustomItem("PyroStick", "pyro_stick");
	public static final Item EmeraldString = new CustomItem("EmeraldString", "emerald_string");
	public static final Item SacredGold = new CustomItem("SacredGold", "sacred_gold");
	
	
	
	//		CRYSTALS		//
	public static final Item DiamondCrystal = new CustomItem("DiamondCrystal", "diamond_crystal");
	public static final Item Crystal = new CustomItem("Crystal", "crystal");
	public static final Item SoulCrystal = new CustomItem("SoulCrystal", "soul_crystal");
	public static final Item GoldCrystal = new CustomItem("GoldCrystal", "gold_crystal");
	public static final Item GoldSoulCrystal = new CustomItem("GoldSoulCrystal", "gold_soul_crystal");
	public static final Item DemonCrystal = new CustomItem("DemonCrystal", "demon_crystal");
	public static final Item EmeraldCrystal = new CustomItem("EmeraldCrystal", "emerald_crystal");
	public static final Item IceCrystal = new CustomItem("IceCrystal", "ice_crystal");
	public static final Item FrostCrystal = new CustomItem("FrostCrystal", "frost_crystal");
	
	
	
	//		WEAPONS		//
	public static final Item DiamondHammer = new CustomItemSword(DiamondCrystalMaterial)
			.setNames("DiamondHammer", "diamond_hammer");
	public static final Item LegendaryHammer = new ItemLegendaryHammer();
	public static final Item GoldSword = new CustomItemSword(GoldMaterial)
	.setNames("GoldSword", "gold_sword")
	.setEnchantments(Enchantment.smite, 5);
	public static final Item LegendarySword = new CustomItemSword(LegendaryGoldMaterial)
	.setNames("LegendarySword", "legendary_gold_sword")
	.setEnchantments(Enchantment.smite, 5, Enchantment.knockback, 10)
	.setHeldEffects(Potion.moveSlowdown, 4)
	.setHeldParticle("depthsuspend");
	public static final Item DemonSword = new CustomItemSword(SatanMaterial)
	.setNames("DemonSword", "satan_sword")
	.setEnchantments(Enchantment.fireAspect, 5);
	public static final Item HadesSword = new CustomItemSword(LegendarySatanMaterial)
	.setNames("HadesSword", "hades_sword")
	.setEnchantments(Enchantment.fireAspect, 5, Enchantment.knockback, 5)
	.setHeldEffects(Potion.fireResistance, 4, Potion.jump, 4, Potion.moveSpeed, 4)
	.setHeldParticle("smoke");
	public static final Item ApolloBow = new ItemApolloBow();
	public static final Item BoreasSword = new ItemBoreasSword();
	
	
	
	//		SOULS		//
	public static final Item Soul = new CustomItem("Soul", "soul");
	public static final Item GoldSoul = new CustomItem("GoldSoul", "gold_soul");
	public static final Item FireSoul = new CustomItem("FireSoul", "fire_soul");
	public static final Item EmeraldSoul = new CustomItem("EmeraldSoul", "emerald_soul");
	public static final Item IceSoul = new CustomItem("IceSoul", "ice_soul");
	
	
	
	//		ARMORS		//
	public static final Item HermesBoots = new CustomItemArmor(HermesArmor, HermesIndex, 3)
			.setNames("HermesBoots", "hermes_boots")
			.setArmorTexture("hermes_armor")
			.setWornEffects(Potion.moveSpeed, 19);
	public static final Item ReinforcedIronBoots = new ItemReinforcedArmor("ReinforcedIronBoots", "reinforced_boots", 3);
	public static final Item ReinforcedIronChestplate = new ItemReinforcedArmor("ReinforcedIronChestplate", "reinforced_chestplate", 1);
	public static final Item AresChestplate = new CustomItemArmor(AresArmor, AresIndex, 1)
			.setNames("AresChestlate", "ares_chestplate")
			.setArmorTexture("ares_armor")
			.setWornEffects(Potion.damageBoost, 4, Potion.fireResistance, 4, Potion.resistance, 1);
	
	
	
	//		RINGS		//	
	public static final Item Ring = new ItemRing();
	public static final Item WaterRing = new ItemEffectRing("Water", Potion.waterBreathing, 4);
	public static final Item FireRing = new ItemEffectRing("Fire", Potion.fireResistance, 4);
	public static final Item AirRing = new ItemEffectRing("Air", Potion.jump, 4);
	public static final Item SpeedRing = new ItemEffectRing("Speed", Potion.moveSpeed, 4);
	public static final Item DarkRing = new ItemEffectRing("Dark", Potion.invisibility, 4);
	public static final Item LightRing = new ItemEffectRing("Light", Potion.nightVision, 4);
	public static final Item PowerRing = new ItemEffectRing("Power", Potion.damageBoost, 4);
	public static final Item DefenseRing = new ItemEffectRing("Defense", Potion.resistance, 4);
	
	
	
	//		ESSENCES		//
	public static final Item WaterEssence = new CustomItem("WaterEssence", "water_essence");
	public static final Item FireEssence = new CustomItem("FireEssence", "fire_essence");
	public static final Item AirEssence = new CustomItem("AirEssence", "air_essence");
	public static final Item SpeedEssence = new CustomItem("SpeedEssence", "speed_essence");
	public static final Item DarkEssence = new CustomItem("DarkEssence", "dark_essence");
	public static final Item LightEssence = new CustomItem("LightEssence", "light_essence");
	public static final Item PowerEssence = new CustomItem("PowerEssence", "power_essence");
	public static final Item DefenseEssence = new CustomItem("DefenseEssence", "defense_essence");
	
	
	
	//INGOTS
	public static final Item DarkSteel = new CustomItem("DarkSteel", "dark_steel_ingot");
	public static final Item CursedSteel = new CustomItem("CursedSteel", "cursed_steel_ingot");
	
	//OTHERS
	public static final Item RecipeBook = new ItemRecipeBook("RecipeBook", "recipe_book");
	
	/* --------------------------------------------------------------------------------------------------------- */
	/*		BLOCKS		*/
	/*		BLOCKS		*/
	/*		BLOCKS		*/
	/* --------------------------------------------------------------------------------------------------------- */
	
	/* CustomBlock --- UnlocalizedName, TextureName, Material, Hardness, Resistance */
	
	public static final Block HephaestusBench = new BlockHephaestusBench(Material.iron);
	public static final Block RecipedHephaestusBench = new BlockRecipedHephaestusBench(Material.iron);
	public static final Block DarkSteelOre = new BlockDarkSteelOre(Material.iron);
	
	/* --------------------------------------------------------------------------------------------------------- */
	/*		REGISTERING ITEMS		*/
	/*		REGISTERING ITEMS		*/
	/*		REGISTERING ITEMS		*/
	/* --------------------------------------------------------------------------------------------------------- */
	
	public static void registerItems() {
		//CRYSTAL
		registerItem(Crystal);
		registerItem(DiamondCrystal);
		registerItem(GoldCrystal);
		registerItem(EmeraldCrystal);
		registerItem(FrostCrystal);
		registerItem(IceCrystal);
		registerItem(SoulCrystal);
		registerItem(GoldSoulCrystal);
		registerItem(DemonCrystal);
		
		//SOUL
		registerItem(Soul);
		registerItem(GoldSoul);
		registerItem(EmeraldSoul);
		registerItem(IceSoul);
		registerItem(FireSoul);
		
		//ITEMS
		registerItem(ObsidianStick);
		registerItem(PyroStick);
		registerItem(EmeraldString);
		registerItem(EmeraldString);
		registerItem(SacredGold);
		registerItem(GoldFeather);
		
		//WEAPONS
		registerItem(LegendaryHammerHead);
		registerItem(DiamondHammerHead);
		registerItem(DiamondHammerHandle);
		registerItem(LegendarySwordBlade);
		registerItem(HadesSwordBlade);
		registerItem(BoreasSword);
		registerItem(LegendaryHammer);
		registerItem(DiamondHammer);
		registerItem(LegendarySword);
		registerItem(GoldSword);
		registerItem(HadesSword);
		registerItem(DemonSword);
		registerItem(ApolloBow);
		
		//ARMORS
		registerItem(HermesBoot);
		registerItem(ReinforcedIronBoot);
		registerItem(ReinforcedIronChestplate);
		registerItem(AresChestplate);
		registerItem(HermesBoots);
		registerItem(ReinforcedIronBoots);
		
		//RINGS
		registerItem(Ring);
		registerItem(WaterRing);
		registerItem(FireRing);
		registerItem(AirRing);
		registerItem(SpeedRing);
		registerItem(DarkRing);
		registerItem(LightRing);
		registerItem(PowerRing);
		registerItem(DefenseRing);
		
		//ESSENCES
		registerItem(WaterEssence);
		registerItem(FireEssence);
		registerItem(AirEssence);
		registerItem(SpeedEssence);
		registerItem(DarkEssence);
		registerItem(LightEssence);
		registerItem(PowerEssence);
		registerItem(DefenseEssence);
		
		//INGOTS
		registerItem(DarkSteel);
		registerItem(CursedSteel);
		
		//OTHER
		registerItem(RecipeBook);
	}
	
	/* --------------------------------------------------------------------------------------------------------- */
	/*		REGISTERING BLOCKS		
	/*		REGISTERING BLOCKS		
	/*		REGISTERING BLOCKS		
	/* --------------------------------------------------------------------------------------------------------- */
	
	public static void registerBlocks(){
		registerBlock(HephaestusBench);
		registerBlock(RecipedHephaestusBench);
		registerBlock(DarkSteelOre);
	}

	private static void registerItem(Item item) {
		GameRegistry.registerItem(item, item.getUnlocalizedName());
	}
	
	private static void registerBlock(Block block) {
		GameRegistry.registerBlock(block, block.getUnlocalizedName());
	}
}
