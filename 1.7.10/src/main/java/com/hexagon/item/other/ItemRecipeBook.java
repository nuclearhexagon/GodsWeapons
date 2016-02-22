package com.hexagon.item.other;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

import com.hexagon.item.ModItems;
import com.hexagon.main.GodWeapons;
import com.hexagon.util.Utils;

public class ItemRecipeBook extends Item{
	
	public ItemRecipeBook(String unlocalizedName, String textureName) {
		Utils.setNames(this, unlocalizedName, textureName);
	}
	
	/*
	public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World, EntityPlayer player){
		player.openGui(GodWeapons.instance, ModItems.RecipeBookGui, player.worldObj, (int) player.posX, (int) player.posY, (int) player.posZ);
		return par1ItemStack;
    }
    */
}

