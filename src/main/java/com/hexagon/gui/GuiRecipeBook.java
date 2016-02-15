package com.hexagon.gui;

import org.lwjgl.input.Keyboard;
import org.lwjgl.opengl.GL11;

import com.hexagon.util.Constants;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.resources.I18n;
import net.minecraft.util.ResourceLocation;

public class GuiRecipeBook extends GuiScreen{
    private final int bookImageHeight = 192;
    private final int bookImageWidth = 192;
    private int currPage = 0;
    private static final int bookTotalPages = 3;
    private static ResourceLocation[] bookPageTextures = new ResourceLocation[bookTotalPages];
    private NextPageButton buttonNextPage;
    private NextPageButton buttonPreviousPage;
    
    public GuiRecipeBook(){
    	bookPageTextures[0] = new ResourceLocation(Constants.MOD_ID +":textures/gui/book/r1.png");
        bookPageTextures[1] = new ResourceLocation(Constants.MOD_ID +":textures/gui/book/r2.png");
        bookPageTextures[2] = new ResourceLocation(Constants.MOD_ID +":textures/gui/book/r3.png");
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
        return false;
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
