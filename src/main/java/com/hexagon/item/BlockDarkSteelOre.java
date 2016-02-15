package com.hexagon.item;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemPickaxe;

import com.hexagon.util.Constants;

public class BlockDarkSteelOre extends Block {

	protected BlockDarkSteelOre(Material p_i45394_1_) {
		super(p_i45394_1_);
		this.setBlockName("DarkSteelOre");
		this.setBlockTextureName(Constants.MOD_ID + ":" + "dark_steel_ore");
		this.setResistance(15.0F);
		this.setHardness(15.0F);
		this.setHarvestLevel("pickaxe", 1);
	}
}
