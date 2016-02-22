package com.hexagon.item.armors;

import com.hexagon.item.CustomItemArmor;
import com.hexagon.item.ModItems;

public class ItemRing extends CustomItemArmor {

	public ItemRing() {
		super(ModItems.RingArmor, ModItems.RingIndex, 1);
		setNames("Ring", "ring");
		setArmorTexture("armor_ring");
	}
}
