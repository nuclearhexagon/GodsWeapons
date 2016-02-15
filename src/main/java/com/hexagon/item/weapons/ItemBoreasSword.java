package com.hexagon.item.weapons;

import com.hexagon.item.CustomItemSword;
import com.hexagon.item.ModItems;

import net.minecraft.block.material.Material;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

public class ItemBoreasSword extends CustomItemSword {
	public ItemBoreasSword() {
		super(ModItems.BoreasMaterial);
		setNames("BoreasSword", "boreas_sword");
		setHeldEffects(Potion.nightVision, 2, Potion.jump, 2, Potion.moveSpeed, 2, Potion.waterBreathing, 2);
		setHeldParticle("snowshovel");
	}

	@Override
	protected void onHeldUpdate(ItemStack stack, World world, EntityLivingBase entityLiving) {
		super.onHeldUpdate(stack, world, entityLiving);

		if (!world.isRemote) {
			for (int i = 0; i < 4; ++i) {
				
				//B
				int blockX = MathHelper.floor_double(entityLiving.posX + (double) ((float) (i % 2 * 2 - 1) * 0.25F));
				int blockY = MathHelper.floor_double(entityLiving.posY) - 1;
				int blockZ = MathHelper.floor_double(entityLiving.posZ + (double) ((float) (i / 2 % 2 * 2 - 1) * 0.25F));
				
				if (world.getBlock(blockX, blockY, blockZ).getMaterial() == Material.water) {
					world.setBlock(blockX, blockY, blockZ, Blocks.ice);
				}

				if (world.getBlock(blockX, blockY, blockZ).getMaterial() == Material.lava) {
					world.setBlock(blockX, blockY, blockZ, Blocks.obsidian);
				}
			}
		}
	}
}
