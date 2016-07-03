package com.hexagon.block;

import com.hexagon.main.GodWeapons;
import com.hexagon.main.Reference;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class DarkSteelOre extends Block {

	public DarkSteelOre(Material material) {
		super(material);
		this.setUnlocalizedName("dark_steel_ore");
		this.setResistance(15.0F);
		this.setHardness(15.0F);
		this.setHarvestLevel("pickaxe", 1);
		this.setCreativeTab(GodWeapons.tab);
	}

}
