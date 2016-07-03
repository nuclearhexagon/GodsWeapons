package com.hexagon.proxy;

import com.hexagon.block.ModBlocks;
import com.hexagon.item.ModItems;

public class ClientProxy extends CommonProxy{
	@Override
	public void registerRenders() {
		ModItems.renderItems();
		ModBlocks.registerRenders();
	}
}
