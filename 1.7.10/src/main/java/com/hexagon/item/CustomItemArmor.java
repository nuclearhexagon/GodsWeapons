package com.hexagon.item;

import com.hexagon.util.Constants;
import com.hexagon.util.Utils;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class CustomItemArmor extends ItemArmor {

	private String armorTexture;
	private Object[] wornEffects;

	public CustomItemArmor(ArmorMaterial material, int renderIndex, int type) {
		super(material, renderIndex, type);
		setCreativeTab(ModItems.tabGod);
	}

	public CustomItemArmor setNames(String unlocalizedName, String textureName) {
		Utils.setNames(this, unlocalizedName, textureName);
		return this;
	}

	public CustomItemArmor setArmorTexture(String armorTexture) {
		this.armorTexture = armorTexture;
		return this;
	}

	public CustomItemArmor setWornEffects(Object... wornEffects) {
		this.wornEffects = wornEffects;
		return this;
	}

	@Override
	public void onArmorTick(World world, EntityPlayer player, ItemStack stack) {
		if (wornEffects != null) {
			Utils.addPotionEffects(player, wornEffects);
		}
	}

	@Override
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type) {
		return Constants.TEXTURE_PATH + "textures/armor/" + armorTexture + ".png";
	}
}
