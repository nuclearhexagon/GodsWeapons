package com.hexagon.item.other;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.WeightedRandomChestContent;
import net.minecraft.world.World;
import net.minecraftforge.common.ChestGenHooks;

import com.hexagon.item.ModItems;
import com.hexagon.main.GodWeapons;
import com.hexagon.util.Utils;

public class ItemRecipeBook extends Item{
	
	public ItemRecipeBook(String unlocalizedName, String textureName) {
		Utils.setNames(this, unlocalizedName, textureName);
	}

	public ItemStack onItemRightClick(ItemStack item, World world, EntityPlayer player){
		player.openGui(GodWeapons.instance, ModItems.RecipeBookGui, player.worldObj, (int) player.posX, (int) player.posY, (int) player.posZ);
		return item;
    }
}

