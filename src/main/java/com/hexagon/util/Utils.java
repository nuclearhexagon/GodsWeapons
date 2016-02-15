package com.hexagon.util;

import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;

public class Utils {

	public static void setNames(Item item, String unlocalizedName, String textureName) {
		item.setUnlocalizedName(Constants.UNLOCALIZED_PATH + unlocalizedName);
		item.setTextureName(Constants.TEXTURE_PATH + textureName);
	}
	
	public static void setBlockNames(Block block, String unlocalizedName, String textureName) {
		block.setBlockName(Constants.UNLOCALIZED_PATH + unlocalizedName);
		block.setBlockTextureName(Constants.TEXTURE_PATH + textureName);
	}

	public static void addCreativeEnchantments(Item item, List list, Object... params) {
		addCreativeEnchantments(new ItemStack(item), list, params);
	}

	public static void addCreativeEnchantments(ItemStack stack, List list, Object... params) {
		addEnchantments(stack, params);
		list.add(stack);
	}

	public static void addEnchantments(ItemStack stack, Object... params) {
		for (int i = 0; i < params.length - 1; i += 2) {
			stack.addEnchantment((Enchantment) params[i], (Integer) params[i + 1]);
		}
	}

	public static void addPotionEffects(EntityLivingBase entityLiving, Object... params) {
		for (int i = 0; i < params.length - 1; i += 2) {
			addPotionEffect(entityLiving, (Potion) params[i], (Integer) params[i + 1]);
		}
	}

	public static void addPotionEffect(EntityLivingBase entityLiving, Potion potion, int amplifier) {
		entityLiving.addPotionEffect(new PotionEffect(potion.getId(), 1, amplifier));
	}
}
