package com.hexagon.item;

import com.hexagon.gui.GuiRecipeBook;
import com.hexagon.util.Utils;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class CustomItem extends Item {

	public CustomItem(String unlocalizedName, String textureName) {
		Utils.setNames(this, unlocalizedName, textureName);
	}
}
