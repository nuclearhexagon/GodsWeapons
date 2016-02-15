package com.hexagon.block;

import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

import com.hexagon.item.ModItems;
import com.hexagon.main.GodWeapons;
import com.hexagon.tileentity.TileEntityHephaestusBench;

public class BlockRecipedHephaestusBench extends BlockContainer {

	public BlockRecipedHephaestusBench(Material material) {
		super(material);
		this.setBlockName("RecipedHephaestusBench");
		this.setBlockTextureName("godweapons" + ":" + "hephaestusbench");
		this.setResistance(60.0F);
		this.setHardness(30.0F);
		this.setLightLevel(0.0625F);
		this.setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
		this.setStepSound(soundTypeMetal);
	}

	public boolean onBlockActivated (World world, int x, int y, int z, EntityPlayer player, int side, float hitX, float hitY, float hitZ) {
		if(player.isSneaking())
			player.openGui(GodWeapons.instance, ModItems.RecipeBookGui, world, x, y, z);
		else
			player.openGui(GodWeapons.instance, ModItems.RecipedHephaestusBenchGui, world, x, y, z);
			return true;
	}
	
	public int getRenderType(){
		return -1;
	}
	
	public boolean isOpaqueCube(){
		return false;
	}
	
	public boolean renderAsNormalBlock(){
		return false;
	}
	
	@Override
	public TileEntity createNewTileEntity(World var1, int var2){
		return new TileEntityHephaestusBench();
	}
	
}
