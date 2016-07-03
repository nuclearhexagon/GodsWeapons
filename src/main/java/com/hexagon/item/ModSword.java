package com.hexagon.item;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.World;

import com.hexagon.main.GodWeapons;

public class ModSword extends ItemSword{

	public ModSword(String unlocalizedName, ToolMaterial material) {
		super(material);
		this.setUnlocalizedName(unlocalizedName);
		this.setCreativeTab(GodWeapons.tab);
		this.setMaxStackSize(1);
	}
	
	private void effectPlayer(EntityLivingBase player, Potion potion, int amplifier) {
		if (player.getActivePotionEffect(potion) == null || player.getActivePotionEffect(potion).getDuration() <= 1)
				player.addPotionEffect(new PotionEffect(potion, 5, amplifier, true, true));
	}
	
	@Override
	public void onUpdate(ItemStack stack, World world, Entity entity, int par4, boolean par5) {
		if (entity instanceof EntityLivingBase) {
			EntityLivingBase player = (EntityLivingBase) entity;
			
			if (player.getHeldItemMainhand() == stack) {
				onMainHand(stack, world, player);
			}
		}
	}
	
	protected void onMainHand(ItemStack stack, World world, EntityLivingBase player) {
		
		if (stack.getItem() == ModItems.boreas_sword) {
			effectPlayer(player, Potion.getPotionById(16), 2);
			effectPlayer(player, Potion.getPotionById(1), 2);
			effectPlayer(player, Potion.getPotionById(8), 2);
			effectPlayer(player, Potion.getPotionById(13), 2);
			
			if (!world.isRemote) {
				for (int i = 0; i < 4; ++i) {
					
					int blockX = MathHelper.floor_double(player.posX + (double) ((float) (i % 2 * 2 - 1) * 0.25F));
					int blockY = MathHelper.floor_double(player.posY) - 1;
					int blockZ = MathHelper.floor_double(player.posZ + (double) ((float) (i / 2 % 2 * 2 - 1) * 0.25F));
					
					if (world.getBlockState(new BlockPos(blockX, blockY, blockZ)).getMaterial() == Material.WATER) {
						Block block = Blocks.FROSTED_ICE;
						IBlockState state = block.getDefaultState();
						world.setBlockState(new BlockPos(blockX, blockY, blockZ), state);
					}
					
					if (world.getBlockState(new BlockPos(blockX, blockY, blockZ)).getMaterial() == Material.LAVA) {
						Block block = Blocks.OBSIDIAN;
						IBlockState state = block.getDefaultState();
						world.setBlockState(new BlockPos(blockX, blockY, blockZ), state);
					}
				}
			}
		}
		
		if (stack.getItem() == ModItems.storm_hammer) {
			effectPlayer(player, Potion.getPotionById(11), 1);
			effectPlayer(player, Potion.getPotionById(8), 4);
			effectPlayer(player, Potion.getPotionById(1), 4);
		}
		
		if (stack.getItem() == ModItems.oath_sword) {
			effectPlayer(player, Potion.getPotionById(2), 4);
		}
		
		if (stack.getItem() == ModItems.hades_sword) {
			effectPlayer(player, Potion.getPotionById(12), 4);
			effectPlayer(player, Potion.getPotionById(1), 4);
			effectPlayer(player, Potion.getPotionById(8), 4);
		}
	}
}
