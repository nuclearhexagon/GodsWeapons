package com.hexagon.item;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.world.World;

import com.hexagon.gui.GuiHandler;
import com.hexagon.main.GodWeapons;
import com.hexagon.main.Reference;

public class RecipeBook extends Item{
	
	public RecipeBook(String unlocalizedName) {
		this.setCreativeTab(GodWeapons.tab);
		this.setUnlocalizedName(unlocalizedName);
	}

	public ActionResult<ItemStack> onItemRightClick(ItemStack item, World world, EntityPlayer player, EnumHand hand) {
		player.openGui(Reference.MOD_ID, GuiHandler.getGUIID(), world, (int) player.posX, (int) player.posY, (int) player.posZ);
		return new ActionResult(EnumActionResult.SUCCESS, item);
    }
}