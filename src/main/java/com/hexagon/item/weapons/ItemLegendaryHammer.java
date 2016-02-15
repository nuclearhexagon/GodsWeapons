package com.hexagon.item.weapons;

import com.hexagon.item.CustomItemSword;
import com.hexagon.item.ModItems;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.effect.EntityLightningBolt;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.world.World;

public class ItemLegendaryHammer extends CustomItemSword {

	public ItemLegendaryHammer() {
		super(ModItems.LegendaryMaterial);
		setNames("LegendaryHammer", "legendary_diamond_hammer");
		setHeldEffects(Potion.resistance, 1, Potion.jump, 4, Potion.moveSpeed, 4);
		setHeldParticle("townaura");
	}

	@Override
	public boolean onItemUse(ItemStack stack, EntityPlayer player, World world, int x, int y, int z, int l, float a, float b, float c) {
		spawnLightning(stack, player, world, x, y, z);
		return true;
	}

	@Override
	public boolean itemInteractionForEntity(ItemStack stack, EntityPlayer player, EntityLivingBase entity) {
		spawnLightning(stack, player, player.worldObj, entity.posX, entity.posY, entity.posZ);
		return true;
	}

	private void spawnLightning(ItemStack stack, EntityPlayer player, World world, double x, double y, double z) {
		world.spawnEntityInWorld(new EntityLightningBolt(world, x, y, z));
		stack.damageItem(50, player);
		world.spawnParticle("townaura", x, y, z, 1.0D, 1.0D, 1.0D);
	}
}
