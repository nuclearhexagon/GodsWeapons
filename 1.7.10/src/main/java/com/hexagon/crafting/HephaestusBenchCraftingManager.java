package com.hexagon.crafting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

import com.hexagon.item.ModItems;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.inventory.InventoryCrafting;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.item.crafting.RecipeBookCloning;
import net.minecraft.item.crafting.RecipeFireworks;
import net.minecraft.item.crafting.RecipesArmor;
import net.minecraft.item.crafting.RecipesArmorDyes;
import net.minecraft.item.crafting.RecipesCrafting;
import net.minecraft.item.crafting.RecipesDyes;
import net.minecraft.item.crafting.RecipesFood;
import net.minecraft.item.crafting.RecipesIngots;
import net.minecraft.item.crafting.RecipesMapCloning;
import net.minecraft.item.crafting.RecipesMapExtending;
import net.minecraft.item.crafting.RecipesTools;
import net.minecraft.item.crafting.RecipesWeapons;
import net.minecraft.item.crafting.ShapelessRecipes;
import net.minecraft.world.World;

public class HephaestusBenchCraftingManager
{
    private static final HephaestusBenchCraftingManager instance = new HephaestusBenchCraftingManager();
    private List recipes = new ArrayList();
    private static final String __OBFID = "CL_00000090";
    
    public static final HephaestusBenchCraftingManager getInstance()
    {
        return instance;
    }

    private HephaestusBenchCraftingManager()
    {
        recipes = new ArrayList();
        //RINGS
        this.addRecipe(new ItemStack(ModItems.Ring)," D ","D D"," D ",'D', ModItems.SacredGold);
        this.addRecipe(new ItemStack(ModItems.WaterRing), "D", "G" ,'G', ModItems.Ring, 'D',ModItems.WaterEssence);
        this.addRecipe(new ItemStack(ModItems.FireRing), "D", "G" ,'G', ModItems.Ring, 'D',ModItems.FireEssence);
        this.addRecipe(new ItemStack(ModItems.AirRing), "D", "G" ,'G', ModItems.Ring, 'D',ModItems.AirEssence);
        this.addRecipe(new ItemStack(ModItems.SpeedRing), "D", "G" ,'G', ModItems.Ring, 'D',ModItems.SpeedEssence);
        this.addRecipe(new ItemStack(ModItems.PowerRing), "D", "G" ,'G', ModItems.Ring, 'D',ModItems.PowerEssence);
		this.addRecipe(new ItemStack(ModItems.DefenseRing), "D", "G" ,'G', ModItems.Ring, 'D',ModItems.DefenseEssence);
		this.addRecipe(new ItemStack(ModItems.LightRing), "D", "G" ,'G', ModItems.Ring, 'D',ModItems.LightEssence);
		this.addRecipe(new ItemStack(ModItems.DarkRing), "D", "G" ,'G', ModItems.Ring, 'D',ModItems.DarkEssence);
		
		//ESSENCES
		this.addRecipe(new ItemStack(ModItems.WaterEssence), "D" ,'D', Items.water_bucket);
		this.addRecipe(new ItemStack(ModItems.FireEssence), "A", "O", 'O', ModItems.WaterEssence, 'A',Items.blaze_powder);
		this.addRecipe(new ItemStack(ModItems.SpeedEssence), "A", "O", 'O', ModItems.WaterEssence, 'A',Items.redstone);
		this.addRecipe(new ItemStack(ModItems.AirEssence), "A", "O", 'O', ModItems.WaterEssence, 'A',Items.ghast_tear);
		this.addRecipe(new ItemStack(ModItems.DarkEssence), "A", "O", 'O', ModItems.WaterEssence, 'A',Items.ender_pearl);
		this.addRecipe(new ItemStack(ModItems.LightEssence), "A", "O", 'O', ModItems.WaterEssence,'A',Items.ender_eye);
		this.addRecipe(new ItemStack(ModItems.PowerEssence), "A", "O", 'O', ModItems.WaterEssence, 'A',Items.diamond);
		this.addRecipe(new ItemStack(ModItems.DefenseEssence), "A", "O", 'O', ModItems.WaterEssence, 'A',Items.emerald);
		
		//MAIN
		this.addRecipe(new ItemStack(ModItems.SacredGold), "FCF", "CDC", "FCF", 'D', ModItems.Soul, 'C', ModItems.GoldCrystal, 'F',ModItems.GoldSoul);
		this.addRecipe(new ItemStack(ModItems.ObsidianStick), "O", "O", 'O', Blocks.obsidian);
		this.addRecipe(new ItemStack(ModItems.DiamondCrystal), "D", "C", "D", 'D', Items.diamond, 'C', ModItems.Crystal);
		this.addRecipe(new ItemStack(ModItems.DiamondHammerHandle), "D ", "O ", "DD", 'D', ModItems.DiamondCrystal, 'O', ModItems.ObsidianStick);
		this.addRecipe(new ItemStack(ModItems.DiamondHammerHead), " D ", "CCC", "CCC", 'D', Items.diamond, 'C', ModItems.DiamondCrystal);
		this.addRecipe(new ItemStack(ModItems.DiamondHammer), "X", "Y", 'X', ModItems.DiamondHammerHead, 'Y', ModItems.DiamondHammerHandle);
		this.addRecipe(new ItemStack(ModItems.LegendaryHammerHead), " C ", "DDD", "DHD", 'C', ModItems.SoulCrystal, 'D', ModItems.DiamondCrystal, 'H', ModItems.DiamondHammerHead);
		this.addRecipe(new ItemStack(ModItems.Crystal), "G", "G", "G", 'G', Blocks.glass);
		this.addRecipe(new ItemStack(ModItems.SoulCrystal), "S", "C", 'S', ModItems.Soul, 'C', ModItems.Crystal);
		this.addRecipe(new ItemStack(ModItems.SoulCrystal), "C", "S", 'S', ModItems.Soul, 'C', ModItems.Crystal);
		this.addRecipe(new ItemStack(ModItems.LegendaryHammer), "X", "Y", 'X', ModItems.LegendaryHammerHead, 'Y', ModItems.DiamondHammer);
		this.addRecipe(new ItemStack(ModItems.GoldSoul), " X ", "XYX", " X ", 'X', ModItems.GoldCrystal, 'Y', ModItems.Soul);
		this.addRecipe(new ItemStack(ModItems.GoldCrystal), "G", "C", "G", 'G', Items.gold_ingot, 'C', ModItems.Crystal);
		this.addRecipe(new ItemStack(ModItems.GoldSoulCrystal), "S", "C", 'S', ModItems.GoldSoul, 'C', ModItems.Crystal);
		this.addRecipe(new ItemStack(ModItems.GoldSoulCrystal), "C", "S", 'S', ModItems.GoldSoul, 'C', ModItems.Crystal);
		this.addRecipe(new ItemStack(ModItems.LegendarySwordBlade), " CC", "CCC", "GC ", 'C', ModItems.GoldCrystal, 'G', ModItems.GoldSoulCrystal);
		this.addRecipe(new ItemStack(ModItems.LegendarySword), "G", "S", 'G', ModItems.LegendarySwordBlade, 'S', ModItems.GoldSword);
		this.addRecipe(new ItemStack(ModItems.HadesSword), "G", "S", 'G', ModItems.HadesSwordBlade, 'S', ModItems.DemonSword);
		this.addRecipe(new ItemStack(ModItems.GoldSword), " CC", "CCC", "GC ", 'C', ModItems.GoldCrystal, 'G', ModItems.ObsidianStick);
		this.addRecipe(new ItemStack(ModItems.DemonSword), " DD", "DFD", "OD ", 'D', ModItems.DemonCrystal, 'F', ModItems.FireSoul, 'O', ModItems.ObsidianStick);
		this.addRecipe(new ItemStack(ModItems.DemonCrystal), " F ", "FDF", " F ", 'F', ModItems.FireSoul, 'D', ModItems.DiamondCrystal);
		this.addRecipe(new ItemStack(ModItems.FireSoul), " F ", "FDF", " F ", 'F', Items.blaze_powder, 'D', ModItems.Soul);
		this.addRecipe(new ItemStack(ModItems.HadesSwordBlade), " DD", "DDD", "FD ", 'F', ModItems.FireSoul, 'D', ModItems.DemonCrystal);
		this.addRecipe(new ItemStack(ModItems.GoldFeather), " D ", "DFD", " D ", 'F', Items.feather, 'D', ModItems.GoldCrystal);
		this.addRecipe(new ItemStack(ModItems.ReinforcedIronBoots), " D ", "DFD", " D ", 'F', Items.iron_boots, 'D', Blocks.iron_block);
		this.addRecipe(new ItemStack(ModItems.ReinforcedIronBoots), "FF", 'F', ModItems.ReinforcedIronBoot);
		this.addRecipe(new ItemStack(ModItems.HermesBoots), "FF", 'F', ModItems.HermesBoot);
		this.addRecipe(new ItemStack(ModItems.HermesBoot), " S ", "FBF", " S ", 'B', ModItems.ReinforcedIronBoot, 'F', ModItems.GoldFeather, 'S', ModItems.GoldSoul);
		this.addRecipe(new ItemStack(ModItems.ReinforcedIronChestplate), " F ", "FBF", " F ", 'B', Items.iron_chestplate, 'F', Blocks.iron_block);
		this.addRecipe(new ItemStack(ModItems.AresChestplate), "D D", "DFD", "DCD", 'C', ModItems.ReinforcedIronChestplate, 'F', ModItems.FireSoul, 'D', ModItems.DemonCrystal);
		this.addRecipe(new ItemStack(ModItems.EmeraldSoul), " X ", "XYX", " X ", 'X', ModItems.EmeraldCrystal, 'Y', ModItems.Soul);
		this.addRecipe(new ItemStack(ModItems.EmeraldCrystal), "Y", "X", "Y", 'X', ModItems.Crystal, 'Y', Items.emerald);
		this.addRecipe(new ItemStack(ModItems.EmeraldString, 3), "O", "Y", 'O', ModItems.EmeraldSoul, 'Y', Items.string);
		this.addRecipe(new ItemStack(ModItems.PyroStick, 3), "X", "Y", "X", 'X', ModItems.DemonCrystal, 'Y', ModItems.EmeraldCrystal);
		this.addRecipe(new ItemStack(ModItems.ApolloBow), "XY ", "X Y", "XY ", 'X', ModItems.PyroStick, 'Y', ModItems.EmeraldString);
		this.addRecipe(new ItemStack(ModItems.ApolloBow), " YX", "Y X", " YX", 'X', ModItems.PyroStick, 'Y', ModItems.EmeraldString);
		this.addRecipe(new ItemStack(ModItems.ApolloBow), "XY", "XY", "XY", 'X', ModItems.PyroStick, 'Y', ModItems.EmeraldString);
		this.addRecipe(new ItemStack(ModItems.ApolloBow), "YX", "YX", "YX", 'X', ModItems.PyroStick, 'Y', ModItems.EmeraldString);
		this.addRecipe(new ItemStack(ModItems.IceSoul), " Y ", "YXY", " Y ", 'X', ModItems.Soul, 'Y', Blocks.packed_ice);
		this.addRecipe(new ItemStack(ModItems.IceCrystal), " Y ", " X ", " Y ", 'X', ModItems.DiamondCrystal, 'Y', Blocks.packed_ice);
		this.addRecipe(new ItemStack(ModItems.FrostCrystal), " Y ", "YXY", " Y ", 'X', ModItems.IceCrystal, 'Y', ModItems.IceSoul);
		this.addRecipe(new ItemStack(ModItems.BoreasSword), " XX", "XYX", "OX ", 'X', ModItems.FrostCrystal, 'Y', ModItems.IceSoul, 'O', ModItems.ObsidianStick);
		
		//OTHER
		this.addRecipe(new ItemStack(ModItems.HephaestusBench), "XXX", "XZX", "XXX", 'X', ModItems.CursedSteel, 'Z', Blocks.crafting_table);
		this.addRecipe(new ItemStack(ModItems.CursedSteel), " X ", "XYX", " X " , 'X', ModItems.DarkSteel, 'Y', ModItems.Soul);
		
		//SHAPELESS TO SHAPED
		this.addRecipe(new ItemStack(ModItems.HermesBoot, 2), "S", 'S', ModItems.HermesBoots);
		this.addRecipe(new ItemStack(ModItems.ReinforcedIronBoot, 2), "X", 'X', ModItems.ReinforcedIronBoots);
		this.addRecipe(new ItemStack(ModItems.RecipeBook), "X", "Y", 'X', ModItems.CursedSteel, 'Y', Items.book);
		this.addRecipe(new ItemStack(ModItems.Soul), "X", "Y", "Z", 'X', Items.spider_eye, 'Y', Items.rotten_flesh, 'Z', Items.bone);
		this.addRecipe(new ItemStack(ModItems.RecipedHephaestusBench), "X", "Y", 'X', ModItems.RecipeBook, 'Y', ModItems.HephaestusBench);
		
		/* --------------------------------------------------------------------------------------------------------- */
		this.addShapelessRecipe(new ItemStack(ModItems.HermesBoot, 2), ModItems.HermesBoots);
		this.addShapelessRecipe(new ItemStack(ModItems.ReinforcedIronBoot, 2), ModItems.ReinforcedIronBoots);
		this.addShapelessRecipe(new ItemStack(ModItems.RecipeBook), ModItems.CursedSteel, Items.book);
		this.addShapelessRecipe(new ItemStack(ModItems.Soul), Items.spider_eye, Items.rotten_flesh, Items.bone);
		this.addShapelessRecipe(new ItemStack(ModItems.RecipedHephaestusBench), ModItems.HephaestusBench, ModItems.RecipeBook);
		/* --------------------------------------------------------------------------------------------------------- */
        Collections.sort(this.recipes, new HephaestusBenchRecipeSorter(this));
    }

    public HephaestusBenchShapedRecipes addRecipe(ItemStack par1ItemStack, Object ... par2ArrayOfObj)
    {
        String s = "";
        int i = 0;
        int j = 0;
        int k = 0;

        if (par2ArrayOfObj[i] instanceof String[])
        {
            String[] astring = (String[])((String[])par2ArrayOfObj[i++]);
            for (int l = 0; l < astring.length; ++l)
            {
                String s1 = astring[l];
                ++k;
                j = s1.length();
                s = s + s1;
            }
        }
        else
        {
            while (par2ArrayOfObj[i] instanceof String)
            {
                String s2 = (String)par2ArrayOfObj[i++];
                ++k;
                j = s2.length();
                s = s + s2;
            }
        }

        HashMap hashmap;

        for (hashmap = new HashMap(); i < par2ArrayOfObj.length; i += 2)
        {
            Character character = (Character)par2ArrayOfObj[i];
            ItemStack itemstack1 = null;

            if (par2ArrayOfObj[i + 1] instanceof Item)
            {
                itemstack1 = new ItemStack((Item)par2ArrayOfObj[i + 1]);
            }
            else if (par2ArrayOfObj[i + 1] instanceof Block)
            {
                itemstack1 = new ItemStack((Block)par2ArrayOfObj[i + 1], 1, 32767);
            }
            else if (par2ArrayOfObj[i + 1] instanceof ItemStack)
            {
                itemstack1 = (ItemStack)par2ArrayOfObj[i + 1];
            }

            hashmap.put(character, itemstack1);
        }

        ItemStack[] aitemstack = new ItemStack[j * k];

        for (int i1 = 0; i1 < j * k; ++i1)
        {
            char c0 = s.charAt(i1);

            if (hashmap.containsKey(Character.valueOf(c0)))
            {
                aitemstack[i1] = ((ItemStack)hashmap.get(Character.valueOf(c0))).copy();
            }
            else
            {
                aitemstack[i1] = null;
            }
        }

        HephaestusBenchShapedRecipes shapedrecipes = new HephaestusBenchShapedRecipes(j, k, aitemstack, par1ItemStack);
        this.recipes.add(shapedrecipes);
        return shapedrecipes;
    }

    public void addShapelessRecipe(ItemStack par1ItemStack, Object ... par2ArrayOfObj)
    {
        ArrayList arraylist = new ArrayList();
        Object[] aobject = par2ArrayOfObj;
        int i = par2ArrayOfObj.length;

        for (int j = 0; j < i; ++j)
        {
            Object object1 = aobject[j];

            if (object1 instanceof ItemStack)
            {
                arraylist.add(((ItemStack)object1).copy());
            }
            else if (object1 instanceof Item)
            {
                arraylist.add(new ItemStack((Item)object1));
            }
            else
            {
                if (!(object1 instanceof Block))
                {
                    throw new RuntimeException("");
                }

                arraylist.add(new ItemStack((Block)object1));
            }
        }

        this.recipes.add(new ShapelessRecipes(par1ItemStack, arraylist));
    }

    public ItemStack findMatchingRecipe(InventoryCrafting par1InventoryCrafting, World par2World)
    {
        int i = 0;
        ItemStack itemstack = null;
        ItemStack itemstack1 = null;
        int j;

        for (j = 0; j < par1InventoryCrafting.getSizeInventory(); ++j)
        {
            ItemStack itemstack2 = par1InventoryCrafting.getStackInSlot(j);

            if (itemstack2 != null)
            {
                if (i == 0)
                {
                    itemstack = itemstack2;
                }

                if (i == 1)
                {
                    itemstack1 = itemstack2;
                }

                ++i;
            }
        }

        if (i == 2 && itemstack.getItem() == itemstack1.getItem() && itemstack.stackSize == 1 && itemstack1.stackSize == 1 && itemstack.getItem().isRepairable())
        {
            Item item = itemstack.getItem();
            int j1 = item.getMaxDamage() - itemstack.getItemDamageForDisplay();
            int k = item.getMaxDamage() - itemstack1.getItemDamageForDisplay();
            int l = j1 + k + item.getMaxDamage() * 5 / 100;
            int i1 = item.getMaxDamage() - l;

            if (i1 < 0)
            {
                i1 = 0;
            }

            return new ItemStack(itemstack.getItem(), 1, i1);
        }
        else
        {
            for (j = 0; j < this.recipes.size(); ++j)
            {
                IRecipe irecipe = (IRecipe)this.recipes.get(j);

                if (irecipe.matches(par1InventoryCrafting, par2World))
                {
                    return irecipe.getCraftingResult(par1InventoryCrafting);
                }
            }

            return null;
        }
    }
    public List getRecipeList()
    {
        return this.recipes;
    }
}