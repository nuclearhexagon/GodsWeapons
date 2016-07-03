package com.hexagon.item;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

import com.hexagon.main.GodWeapons;

public class ModArmor extends ItemArmor{

	public ModArmor(String unlocalizedName, ArmorMaterial materialIn, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn) {
		super(materialIn, renderIndexIn, equipmentSlotIn);
		this.setUnlocalizedName(unlocalizedName);
		this.setCreativeTab(GodWeapons.tab);
		this.setMaxStackSize(1);
	}
	
	private void effectPlayer(EntityLivingBase player, Potion potion, int amplifier) {
		if (player.getActivePotionEffect(potion) == null || player.getActivePotionEffect(potion).getDuration() <= 1)
				player.addPotionEffect(new PotionEffect(potion, 5, amplifier, true, true));
	}
	
	@Override
	public void onArmorTick(World world, EntityPlayer player, ItemStack stack) {
		if (stack.getItem() == ModItems.hermes_boots) {
			effectPlayer(player, Potion.getPotionById(1), 19);
		}
		
		if (stack.getItem() == ModItems.ares_chestplate) {
			effectPlayer(player, Potion.getPotionById(5), 4);
			effectPlayer(player, Potion.getPotionById(12), 4);
			effectPlayer(player, Potion.getPotionById(11), 1);
		}
	}
	
	@Override
	public void onUpdate(ItemStack stack, World world, Entity entity, int par4, boolean par5) {
		if (entity instanceof EntityLivingBase) {
			EntityLivingBase player = (EntityLivingBase) entity;

			if (player.getHeldItemOffhand() == stack) {
				onOffHand(stack, world, player);
			}
		}
	}
	
	protected void onOffHand(ItemStack stack, World world,  EntityLivingBase player) {
		
		if (stack.getItem() == ModItems.air_ring) {
			effectPlayer(player, Potion.getPotionById(8), 4);
		}
		
		if (stack.getItem() == ModItems.light_ring) {
			effectPlayer(player, Potion.getPotionById(16), 9);
		}
		
		if (stack.getItem() == ModItems.dark_ring) {
			effectPlayer(player, Potion.getPotionById(14), 9);
		}
		
		if (stack.getItem() == ModItems.fire_ring) {
			effectPlayer(player, Potion.getPotionById(12), 9);
		}
		
		if (stack.getItem() == ModItems.defense_ring) {
			effectPlayer(player, Potion.getPotionById(11), 4);
		}
		
		if (stack.getItem() == ModItems.power_ring) {
			effectPlayer(player, Potion.getPotionById(5), 4);
		}
		
		if (stack.getItem() == ModItems.speed_ring) {
			effectPlayer(player, Potion.getPotionById(1), 9);
		}
		
		if (stack.getItem() == ModItems.water_ring) {
			effectPlayer(player, Potion.getPotionById(13), 9);
		}
	}
}
