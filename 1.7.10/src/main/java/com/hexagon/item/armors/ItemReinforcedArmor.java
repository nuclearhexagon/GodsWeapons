package com.hexagon.item.armors;

import com.hexagon.item.CustomItemArmor;
import com.hexagon.item.ModItems;

public class ItemReinforcedArmor extends CustomItemArmor {

	public ItemReinforcedArmor(String unlocalizedName, String textureName, int armorType) {
		super(ModItems.ReinforcedIron, ModItems.ReinforcedIronIndex, armorType);
		setNames(unlocalizedName, textureName);
		setArmorTexture("reinforced_iron");
	}
}
