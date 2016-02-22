package com.hexagon.crafting;

import java.util.Comparator;

import net.minecraft.item.crafting.IRecipe;

public class HephaestusBenchRecipeSorter implements Comparator {

	final HephaestusBenchCraftingManager workSurface;
	
	public HephaestusBenchRecipeSorter(HephaestusBenchCraftingManager workSurfaceCraftingManager) {
		this.workSurface = workSurfaceCraftingManager;
	}
	
	public int compareRecipes(IRecipe irecipe1, IRecipe irecipe2) {
		return irecipe1 instanceof HephaestusBenchShapelessRecipes && irecipe2 instanceof HephaestusBenchShapedRecipes ? 1: (irecipe2 instanceof HephaestusBenchShapelessRecipes && irecipe1 instanceof HephaestusBenchShapedRecipes ? -1 : (irecipe2.getRecipeSize() < irecipe1.getRecipeSize() ? -1 : (irecipe2.getRecipeSize() > irecipe1.getRecipeSize() ? 1 : 0)));
	}
	
	@Override
	public int compare(Object o1, Object o2) {
		return this.compareRecipes((IRecipe)o1, (IRecipe)o2);
	}

}
