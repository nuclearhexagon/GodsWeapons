package com.hexagon.item.armors;

import net.minecraft.potion.Potion;

public class ItemEffectRing extends ItemRing {

	public ItemEffectRing(String type, Potion potion, int i) {
		setNames(type + "Ring", "ring_" + type.toLowerCase());
		setWornEffects(potion, i);
	}
}
