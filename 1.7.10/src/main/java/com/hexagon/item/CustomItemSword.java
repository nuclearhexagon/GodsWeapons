package com.hexagon.item;

import java.util.List;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.world.World;

import com.hexagon.util.Utils;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class CustomItemSword extends ItemSword {

	private Object[] enchantments = new Object[0];
	private Object[] heldEffects;
	private String heldParticle;

	public CustomItemSword(ToolMaterial material) {
		super(material);
		setCreativeTab(ModItems.tabGod);
	}

	public CustomItemSword setNames(String unlocalizedName, String textureName) {
		Utils.setNames(this, unlocalizedName, textureName);
		return this;
	}

	public CustomItemSword setEnchantments(Object... enchantments) {
		this.enchantments = enchantments;
		return this;
	}

	public CustomItemSword setHeldEffects(Object... heldEffects) {
		this.heldEffects = heldEffects;
		return this;
	}

	public CustomItemSword setHeldParticle(String heldParticle) {
		this.heldParticle = heldParticle;
		return this;
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void getSubItems(Item item, CreativeTabs tab, List list) {
		if (enchantments != null) {
			Utils.addCreativeEnchantments(item, list, enchantments);
		}
	}

	@Override
	public void onCreated(ItemStack stack, World world, EntityPlayer player) {
		if (enchantments != null) {
			Utils.addEnchantments(stack, enchantments);
		}
	}

	@Override
	public void onUpdate(ItemStack stack, World world, Entity entity, int par4, boolean par5) {
		if (entity instanceof EntityLivingBase) {
			EntityLivingBase entityLiving = (EntityLivingBase) entity;

			if (entityLiving.getHeldItem() == stack) {
				onHeldUpdate(stack, world, entityLiving);
			}
		}
	}

	protected void onHeldUpdate(ItemStack stack, World world,  EntityLivingBase entityLiving) {
		if (heldEffects != null) {
			Utils.addPotionEffects(entityLiving, heldEffects);
		}

		if (heldParticle != null) {
			double x = entityLiving.posX;
			double y = entityLiving.posY;
			double z = entityLiving.posZ;

			for (int i = 0; i < 2; ++i) {
				world.spawnParticle(heldParticle, x + (itemRand.nextDouble() - 0.5D) * (double) entityLiving.width, y + itemRand.nextDouble() - 1.0D, z + (itemRand.nextDouble() - 0.5D) * (double) entityLiving.width, 0.0D, 0.0D, 0.0D);
			}
		}
	}
}
