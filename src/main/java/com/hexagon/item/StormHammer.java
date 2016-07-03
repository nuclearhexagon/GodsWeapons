package com.hexagon.item;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.effect.EntityLightningBolt;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.World;

public class StormHammer extends ModSword{

	public StormHammer(String unlocalizedName, ToolMaterial material) {
		super(unlocalizedName, material);
	}

	public ActionResult<ItemStack> onItemRightClick(ItemStack itemStackIn, World worldIn, EntityPlayer playerIn, EnumHand hand) {
		RayTraceResult result = playerIn.rayTrace(100, 1F);
		int x = result.getBlockPos().getX();
	    int y = result.getBlockPos().getY();
	    int z = result.getBlockPos().getZ();
	    EntityLightningBolt lightning = new EntityLightningBolt(worldIn, x, y, z, false);
	    worldIn.addWeatherEffect(lightning);
	    return new ActionResult(EnumActionResult.SUCCESS, itemStackIn);
	   }
	
}
