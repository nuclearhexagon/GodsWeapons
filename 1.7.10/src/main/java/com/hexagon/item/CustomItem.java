package com.hexagon.item;

import net.minecraft.item.Item;

import com.hexagon.util.Utils;

public class CustomItem extends Item {

	public CustomItem(String unlocalizedName, String textureName) {
		Utils.setNames(this, unlocalizedName, textureName);
	}
}
