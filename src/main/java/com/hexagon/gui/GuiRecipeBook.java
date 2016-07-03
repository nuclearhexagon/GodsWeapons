package com.hexagon.gui;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.resources.I18n;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import org.lwjgl.input.Keyboard;
import org.lwjgl.opengl.GL11;

import com.hexagon.item.RecipeBook;
import com.hexagon.main.Reference;

public class GuiRecipeBook extends GuiScreen{
    private final int bookImageHeight = 192;
    private final int bookImageWidth = 192;
    private int currPage = 0;
    private static final int bookTotalPages = 19;
    private static ResourceLocation[] bookPageTextures = new ResourceLocation[bookTotalPages];
    private NextPageButton buttonNextPage;
    private NextPageButton buttonPreviousPage;
    
    public GuiRecipeBook(){
    	bookPageTextures[0] = new ResourceLocation(Reference.MOD_ID +":textures/gui/book/r1.png");
        bookPageTextures[1] = new ResourceLocation(Reference.MOD_ID +":textures/gui/book/r2.png");
        bookPageTextures[2] = new ResourceLocation(Reference.MOD_ID +":textures/gui/book/r3.png");
        bookPageTextures[3] = new ResourceLocation(Reference.MOD_ID +":textures/gui/book/r4.png");
        bookPageTextures[4] = new ResourceLocation(Reference.MOD_ID +":textures/gui/book/r5.png");
        bookPageTextures[5] = new ResourceLocation(Reference.MOD_ID +":textures/gui/book/r6.png");
        bookPageTextures[6] = new ResourceLocation(Reference.MOD_ID +":textures/gui/book/r7.png");
        bookPageTextures[7] = new ResourceLocation(Reference.MOD_ID +":textures/gui/book/r8.png");
        bookPageTextures[8] = new ResourceLocation(Reference.MOD_ID +":textures/gui/book/r9.png");
        bookPageTextures[9] = new ResourceLocation(Reference.MOD_ID +":textures/gui/book/r10.png");
        bookPageTextures[10] = new ResourceLocation(Reference.MOD_ID +":textures/gui/book/r11.png");
        bookPageTextures[11] = new ResourceLocation(Reference.MOD_ID +":textures/gui/book/r12.png");
        bookPageTextures[12] = new ResourceLocation(Reference.MOD_ID +":textures/gui/book/r13.png");
        bookPageTextures[13] = new ResourceLocation(Reference.MOD_ID +":textures/gui/book/r14.png");
        bookPageTextures[14] = new ResourceLocation(Reference.MOD_ID +":textures/gui/book/r15.png");
        bookPageTextures[15] = new ResourceLocation(Reference.MOD_ID +":textures/gui/book/r16.png");
        bookPageTextures[16] = new ResourceLocation(Reference.MOD_ID +":textures/gui/book/r17.png");
        bookPageTextures[17] = new ResourceLocation(Reference.MOD_ID +":textures/gui/book/r18.png");
        bookPageTextures[18] = new ResourceLocation(Reference.MOD_ID +":textures/gui/book/r19.png");
        
    }

    public GuiRecipeBook(InventoryPlayer inventory, RecipeBook item) {
    	
	}

	@Override
    public void initGui() {
        buttonList.clear();
        Keyboard.enableRepeatEvents(true);
        int offsetFromScreenLeft = (width - bookImageWidth) / 2;
        buttonList.add(buttonNextPage = new NextPageButton(1, offsetFromScreenLeft + 120, 156, true));
        buttonList.add(buttonPreviousPage = new NextPageButton(2, offsetFromScreenLeft + 38, 156, false));
    }

    @Override
    public void updateScreen(){
        buttonNextPage.visible = (currPage < bookTotalPages - 1);
        buttonPreviousPage.visible = currPage > 0;
    }
 
    @Override
    public void drawScreen(int parWidth, int parHeight, float p_73863_3_){
    	GL11.glColor4f(1F, 1F, 1F, 1F);
    	if (currPage == 0){
        	mc.getTextureManager().bindTexture(bookPageTextures[0]);
        }
    	if (currPage == 1){
        	mc.getTextureManager().bindTexture(bookPageTextures[1]);
        }
    	if (currPage == 2){
        	mc.getTextureManager().bindTexture(bookPageTextures[2]);
        }
    	if (currPage == 3){
        	mc.getTextureManager().bindTexture(bookPageTextures[3]);
        }
    	if (currPage == 4){
        	mc.getTextureManager().bindTexture(bookPageTextures[4]);
        }
    	if (currPage == 5){
        	mc.getTextureManager().bindTexture(bookPageTextures[5]);
        }
    	if (currPage == 6){
        	mc.getTextureManager().bindTexture(bookPageTextures[6]);
        }
    	if (currPage == 7){
        	mc.getTextureManager().bindTexture(bookPageTextures[7]);
        }
    	if (currPage == 8){
        	mc.getTextureManager().bindTexture(bookPageTextures[8]);
        }
    	if (currPage == 9){
        	mc.getTextureManager().bindTexture(bookPageTextures[9]);
    	}
    	if (currPage == 10){
        	mc.getTextureManager().bindTexture(bookPageTextures[10]);
        }
    	if (currPage == 11){
        	mc.getTextureManager().bindTexture(bookPageTextures[11]);
        }
    	if (currPage == 12){
        	mc.getTextureManager().bindTexture(bookPageTextures[12]);
        }
    	if (currPage == 13){
        	mc.getTextureManager().bindTexture(bookPageTextures[13]);
        }
    	if (currPage == 14){
        	mc.getTextureManager().bindTexture(bookPageTextures[14]);
        }
    	if (currPage == 15){
        	mc.getTextureManager().bindTexture(bookPageTextures[15]);
        }
    	if (currPage == 16){
        	mc.getTextureManager().bindTexture(bookPageTextures[16]);
        }
    	if (currPage == 17){
        	mc.getTextureManager().bindTexture(bookPageTextures[17]);
        }
    	if (currPage == 18){
        	mc.getTextureManager().bindTexture(bookPageTextures[18]);
        }
    	
        int offsetFromScreenLeft = (width - bookImageWidth ) / 2;
        drawTexturedModalRect(offsetFromScreenLeft, 2, 0, 0, bookImageWidth, bookImageHeight);
        int widthOfString;
        String stringPageIndicator = I18n.format("book.pageIndicator", new Object[] {Integer.valueOf(currPage + 1), bookTotalPages});
        super.drawScreen(parWidth, parHeight, p_73863_3_);
    }
    
    @Override
    protected void mouseClickMove(int parMouseX, int parMouseY, 
          int parLastButtonClicked, long parTimeSinceMouseClick) {
     
    }

    @Override
    protected void actionPerformed(GuiButton parButton) {
        if (parButton == buttonNextPage){
            if (currPage < bookTotalPages - 1){
                ++currPage;
            }
        }
        else if (parButton == buttonPreviousPage){
            if (currPage > 0){
                --currPage;
            }
        }
   }

    @Override
    public void onGuiClosed() {
     
    }

    @Override
    public boolean doesGuiPauseGame(){
        return true;
    }
    
    @SideOnly(Side.CLIENT)
    static class NextPageButton extends GuiButton{
        private final boolean isNextButton;

        public NextPageButton(int parButtonId, int parPosX, int parPosY, 
              boolean parIsNextButton){
            super(parButtonId, parPosX, parPosY, 23, 13, "");
            isNextButton = parIsNextButton;
        }

        @Override
        public void drawButton(Minecraft mc, int parX, int parY){
            if (visible){
                boolean isButtonPressed = (parX >= xPosition 
                      && parY >= yPosition 
                      && parX < xPosition + width 
                      && parY < yPosition + height);
                GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
                mc.getTextureManager().bindTexture(bookPageTextures[1]);
                int textureX = 0;
                int textureY = 192;

                if (isButtonPressed){
                    textureX += 23;
                }

                if (!isNextButton){
                    textureY += 13;
                }

                drawTexturedModalRect(xPosition, yPosition, 
                      textureX, textureY, 
                      23, 13);
            }
        }
    }
}