package com.hexagon.handler;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

import com.hexagon.container.ContainerHephaestusBench;
import com.hexagon.container.ContainerRecipedHephaestusBench;
import com.hexagon.gui.GuiHephaestusBench;
import com.hexagon.gui.GuiRecipeBook;
import com.hexagon.gui.GuiRecipedHephaestusBench;
import com.hexagon.item.ModItems;

import cpw.mods.fml.common.network.IGuiHandler;

public class GuiHandler implements IGuiHandler {

	@Override
	public Object getServerGuiElement(int ID, EntityPlayer player, World world,	int x, int y, int z) {
		TileEntity entity = world.getTileEntity(x, y, z);
		if(ID == ModItems.HephaestusBenchGui) {
			return ID == ModItems.HephaestusBenchGui && world.getBlock(x, y, z) == ModItems.HephaestusBench ? new ContainerHephaestusBench(player.inventory, world, x, y, z) : null;
		}
		
		if(ID == ModItems.RecipedHephaestusBenchGui) {
			return ID == ModItems.RecipedHephaestusBenchGui && world.getBlock(x, y, z) == ModItems.RecipedHephaestusBench ? new ContainerRecipedHephaestusBench(player.inventory, world, x, y, z) : null;
		}
		
		return null;
	}

	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world,	int x, int y, int z) {
		TileEntity entity = world.getTileEntity(x, y, z);
		if(ID == ModItems.HephaestusBenchGui) {
			return ID == ModItems.HephaestusBenchGui && world.getBlock(x, y, z) == ModItems.HephaestusBench ? new GuiHephaestusBench(player.inventory, world, x, y, z) : null;
		}
		
		if(ID == ModItems.RecipedHephaestusBenchGui) {
			return ID == ModItems.RecipedHephaestusBenchGui && world.getBlock(x, y, z) == ModItems.RecipedHephaestusBench ? new GuiRecipedHephaestusBench(player.inventory, world, x, y, z) : null;
		}
		
		if (ID == ModItems.RecipeBookGui){
	        return new GuiRecipeBook();
		}
		
		return null;
	}

}
