package com.hexagon.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

import com.hexagon.item.ModItems;
import com.hexagon.util.Constants;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class CustomBlock extends Block {

	public CustomBlock(String unlocalizedName, Material material, float hardness, float resistance) {
		super(material);
		setBlockName(unlocalizedName);
		setHardness(hardness);
		setCreativeTab(ModItems.tabGod);
		setResistance(resistance);
	}

	public TileEntity createNewTileEntity(World var1, int var2) {
		
		return null;
	}
	
	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister iconRegister) {
		this.blockIcon = iconRegister.registerIcon(Constants.MOD_ID + ":" + this.getUnlocalizedName().substring(5));
	}
}
