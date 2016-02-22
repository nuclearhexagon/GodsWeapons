package com.hexagon.proxy;

import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.item.Item;
import net.minecraftforge.client.MinecraftForgeClient;
import net.minecraftforge.client.event.FOVUpdateEvent;
import net.minecraftforge.common.MinecraftForge;

import com.hexagon.item.ModItems;
import com.hexagon.renderer.ItemRenderHephaestusBench;
import com.hexagon.renderer.RendererHephaestusBench;
import com.hexagon.tileentity.TileEntityHephaestusBench;

import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;

public class ClientProxy extends CommonProxy {
	@Override
	public void registerRenderInfo() {
		MinecraftForge.EVENT_BUS.register(this);
	}
	
	@Override
	public void registerRenderers(){
	}
	
	 public void registerRenderThings() {
		 TileEntitySpecialRenderer render = new RendererHephaestusBench();
		 ClientRegistry.bindTileEntitySpecialRenderer(TileEntityHephaestusBench.class, render);
		 MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(ModItems.HephaestusBench), new ItemRenderHephaestusBench(render, new TileEntityHephaestusBench()));
		 MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(ModItems.RecipedHephaestusBench), new ItemRenderHephaestusBench(render, new TileEntityHephaestusBench()));
 }

	@Override
	public int addArmor(String armor) {
		return RenderingRegistry.addNewArmourRendererPrefix(armor);
	}

	@SubscribeEvent
	public void onUpdateFOV(FOVUpdateEvent event) {
		float fov = event.fov;

		if (event.entity.isUsingItem() && event.entity.getItemInUse().getItem() == ModItems.ApolloBow) {
			int duration = event.entity.getItemInUseDuration();
			float multiplier = duration / (10.0F * 2.0F);

			if (multiplier > 1.0F) {
				multiplier = 1.0F;
			} else {
				multiplier *= multiplier;
			}

			fov *= 1.0F - multiplier * (0.3F / 2.0F);
		}
		event.newfov = fov;
	}
}
