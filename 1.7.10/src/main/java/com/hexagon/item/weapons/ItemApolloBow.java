package com.hexagon.item.weapons;

import java.util.List;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBow;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;

import com.hexagon.util.Utils;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemApolloBow extends ItemBow {

	public ItemApolloBow() {
		Utils.setNames(this, "ApolloBow", "apollo_bow");
		setFull3D();
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void getSubItems(Item item, CreativeTabs tab, List list) {
		Utils.addCreativeEnchantments(item, list, Enchantment.flame, 10, Enchantment.knockback, 1,Enchantment.punch, 5,Enchantment.power, 5);
	}
	
	@Override
	public void onCreated(ItemStack stack, World world, EntityPlayer player) {
		Utils.addEnchantments(stack, Enchantment.flame, 10, Enchantment.knockback, 1,Enchantment.punch, 5,Enchantment.power, 2);
	}

	@SideOnly(Side.CLIENT)
	@Override
	public IIcon getIcon(ItemStack stack, int renderPass, EntityPlayer player, ItemStack usingItem, int useRemaining) {
		if (usingItem != null) {
			int time = stack.getMaxItemUseDuration() - useRemaining;

			if (time >= 18) {
				return getItemIconForUseDuration(2);
			} else if (time > 13) {
				return getItemIconForUseDuration(1);
			} else if (time > 0) {
				return getItemIconForUseDuration(0);
			}
		}

		return super.getIcon(stack, renderPass, player, usingItem, useRemaining);
	}
}