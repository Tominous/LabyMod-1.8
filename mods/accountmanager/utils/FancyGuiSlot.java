package mods.accountmanager.utils;

import ave;
import avp;
import avs;
import bfd;
import bfl;
import bfx;
import java.awt.Color;
import ns;
import org.lwjgl.input.Mouse;

public abstract class FancyGuiSlot
{
  protected final ave mc;
  public int width;
  public int height;
  public int top;
  public int bottom;
  public int right;
  public int left;
  public final int slotHeight;
  private int scrollUpButtonID;
  private int scrollDownButtonID;
  protected int mouseX;
  protected int mouseY;
  protected boolean field_148163_i = true;
  protected float initialClickY = -2.0F;
  protected float scrollMultiplier;
  protected float amountScrolled;
  protected int selectedElement = -1;
  protected long lastClicked;
  protected boolean field_178041_q = true;
  protected boolean showSelectionBox = true;
  protected boolean hasListHeader;
  public int headerPadding;
  private boolean enabled = true;
  private static final String __OBFID = "CL_00000679";
  private int startX;
  
  public FancyGuiSlot(ave mcIn, int width, int height, int topIn, int bottomIn, int slotHeightIn, int startX)
  {
    mc = mcIn;
    this.width = width;
    this.height = height;
    top = topIn;
    bottom = bottomIn;
    slotHeight = slotHeightIn;
    left = startX;
    right = (left + width);
    this.startX = startX;
  }
  
  public void setDimensions(int p_148122_1_, int p_148122_2_, int p_148122_3_, int p_148122_4_)
  {
    width = p_148122_1_;
    height = p_148122_2_;
    top = p_148122_3_;
    bottom = p_148122_4_;
    left = 0;
    right = p_148122_1_;
  }
  
  public void setShowSelectionBox(boolean p_148130_1_)
  {
    showSelectionBox = p_148130_1_;
  }
  
  protected void setHasListHeader(boolean p_148133_1_, int p_148133_2_)
  {
    hasListHeader = p_148133_1_;
    headerPadding = p_148133_2_;
    if (!p_148133_1_) {
      headerPadding = 0;
    }
  }
  
  protected abstract int getSize();
  
  protected abstract void elementClicked(int paramInt1, boolean paramBoolean, int paramInt2, int paramInt3);
  
  protected abstract boolean isSelected(int paramInt);
  
  protected int getContentHeight()
  {
    return getSize() * slotHeight + headerPadding;
  }
  
  protected abstract void drawBackground();
  
  protected void func_178040_a(int p_178040_1_, int p_178040_2_, int p_178040_3_) {}
  
  protected abstract void drawSlot(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6);
  
  protected void drawListHeader(int p_148129_1_, int p_148129_2_, bfx p_148129_3_) {}
  
  protected void func_148132_a(int p_148132_1_, int p_148132_2_) {}
  
  protected void func_148142_b(int p_148142_1_, int p_148142_2_) {}
  
  public int getSlotIndexFromScreenCoords(int p_148124_1_, int p_148124_2_)
  {
    int k = left + width / 2 - getListWidth() / 2;
    int l = left + width / 2 + getListWidth() / 2;
    int i1 = p_148124_2_ - top - headerPadding + (int)amountScrolled - 4;
    
    int j1 = i1 / slotHeight;
    if ((p_148124_1_ < getScrollBarX()) && (p_148124_1_ >= k) && (p_148124_1_ <= l) && (j1 >= 0) && (i1 >= 0)) {}
    return j1 < getSize() ? j1 : -1;
  }
  
  public void registerScrollButtons(int p_148134_1_, int p_148134_2_)
  {
    scrollUpButtonID = p_148134_1_;
    scrollDownButtonID = p_148134_2_;
  }
  
  protected void bindAmountScrolled()
  {
    int i = func_148135_f();
    if (i < 0) {
      i /= 2;
    }
    if ((!field_148163_i) && (i < 0)) {
      i = 0;
    }
    amountScrolled = ns.a(amountScrolled, 0.0F, i);
  }
  
  public int func_148135_f()
  {
    return Math.max(0, getContentHeight() - (bottom - top - 4));
  }
  
  public int getAmountScrolled()
  {
    return (int)amountScrolled;
  }
  
  public boolean isMouseYWithinSlotBounds(int mouseX, int p_148141_1_)
  {
    return (p_148141_1_ >= top) && (p_148141_1_ <= bottom) && (mouseX >= left) && (mouseX <= right);
  }
  
  public void scrollBy(int p_148145_1_)
  {
    amountScrolled += p_148145_1_;
    bindAmountScrolled();
    initialClickY = -2.0F;
  }
  
  public void actionPerformed(avs p_148147_1_)
  {
    if (l) {
      if (k == scrollUpButtonID)
      {
        amountScrolled -= slotHeight * 2 / 3;
        initialClickY = -2.0F;
        bindAmountScrolled();
      }
      else if (k == scrollDownButtonID)
      {
        amountScrolled += slotHeight * 2 / 3;
        initialClickY = -2.0F;
        bindAmountScrolled();
      }
    }
  }
  
  public void drawScreen(int mouseXIn, int mouseYIn, float p_148128_3_)
  {
    if (field_178041_q)
    {
      mouseX = mouseXIn;
      mouseY = mouseYIn;
      drawBackground();
      int k = right - 6;
      int l = k + 6;
      bindAmountScrolled();
      bfl.f();
      bfl.n();
      bfx tessellator = bfx.a();
      bfd worldrenderer = tessellator.c();
      int i1 = left;
      
      int j1 = top + 4 - (int)amountScrolled;
      if (hasListHeader) {
        drawListHeader(i1, j1, tessellator);
      }
      drawSelectionBox(i1, j1, mouseXIn, mouseYIn);
      bfl.i();
      byte b0 = 4;
      bfl.l();
      bfl.a(770, 771, 0, 1);
      bfl.c();
      bfl.j(7425);
      bfl.x();
      int k1 = func_148135_f();
      if (k1 > 0)
      {
        int l1 = (bottom - top) * (bottom - top) / getContentHeight();
        l1 = ns.a(l1, 32, bottom - top - 8);
        int i2 = (int)amountScrolled * (bottom - top - l1) / k1 + top;
        if (i2 < top) {
          i2 = top;
        }
        avp.a(k, top, l, bottom, new Color(255, 255, 255, 20).getRGB());
        avp.a(k, i2, l, i2 + l1, new Color(192, 192, 192, 100).getRGB());
      }
      func_148142_b(mouseXIn, mouseYIn);
      bfl.w();
      bfl.j(7424);
      bfl.d();
      bfl.k();
    }
  }
  
  public void handleMouseInput()
  {
    if (isMouseYWithinSlotBounds(mouseX, mouseY))
    {
      if ((Mouse.isButtonDown(0)) && (getEnabled()))
      {
        if (initialClickY == -1.0F)
        {
          boolean flag = true;
          if ((mouseY >= top) && (mouseY <= bottom))
          {
            int i = width / 2 - getListWidth() / 2;
            int j = width / 2 + getListWidth() / 2;
            int k = mouseY - top - headerPadding + (int)amountScrolled - 4;
            
            int l = k / slotHeight;
            if ((mouseX >= i) && (mouseX <= j) && (l >= 0) && (k >= 0) && 
              (l < getSize()))
            {
              boolean flag1 = (l == selectedElement) && (ave.J() - lastClicked < 250L);
              
              elementClicked(l, flag1, mouseX, mouseY);
              
              selectedElement = l;
              lastClicked = ave.J();
            }
            else if ((mouseX >= i) && (mouseX <= j) && (k < 0))
            {
              func_148132_a(mouseX - i, mouseY - top + (int)amountScrolled - 4);
              
              flag = false;
            }
            int i2 = right - 6;
            int i1 = i2 + 6;
            if ((mouseX >= i2) && (mouseX <= i1))
            {
              scrollMultiplier = -1.0F;
              int j1 = func_148135_f();
              if (j1 < 1) {
                j1 = 1;
              }
              int k1 = (int)((bottom - top) * (bottom - top) / getContentHeight());
              k1 = ns.a(k1, 32, bottom - top - 8);
              
              scrollMultiplier /= (bottom - top - k1) / j1;
            }
            else
            {
              scrollMultiplier = 1.0F;
            }
            if (flag) {
              initialClickY = mouseY;
            } else {
              initialClickY = -2.0F;
            }
          }
          else
          {
            initialClickY = -2.0F;
          }
        }
        else if (initialClickY >= 0.0F)
        {
          amountScrolled -= (mouseY - initialClickY) * scrollMultiplier;
          
          initialClickY = mouseY;
        }
      }
      else {
        initialClickY = -1.0F;
      }
      int l1 = Mouse.getEventDWheel();
      if (l1 != 0)
      {
        if (l1 > 0) {
          l1 = -1;
        } else if (l1 < 0) {
          l1 = 1;
        }
        amountScrolled += l1 * slotHeight / 2;
      }
    }
  }
  
  public void setEnabled(boolean p_148143_1_)
  {
    enabled = p_148143_1_;
  }
  
  public boolean getEnabled()
  {
    return enabled;
  }
  
  public int getListWidth()
  {
    return width;
  }
  
  protected void drawSelectionBox(int p_148120_1_, int p_148120_2_, int p_148120_3_, int p_148120_4_)
  {
    int i1 = getSize();
    bfx tessellator = bfx.a();
    bfd worldrenderer = tessellator.c();
    for (int j1 = 0; j1 < i1; j1++)
    {
      int k1 = p_148120_2_ + j1 * slotHeight + headerPadding;
      int l1 = slotHeight - 4;
      if ((k1 > bottom) || (k1 + l1 < top)) {
        func_178040_a(j1, p_148120_1_, k1);
      }
      if ((showSelectionBox) && (isSelected(j1)) && (k1 >= top) && (k1 <= bottom - slotHeight + 5))
      {
        bfl.c(1.0F, 1.0F, 1.0F, 1.0F);
        avp.a(left, k1, right - 6, k1 + l1 + 2, new Color(255, 255, 255, 40)
          .getRGB());
      }
      drawSlot(j1, p_148120_1_, k1, l1, p_148120_3_, p_148120_4_);
    }
  }
  
  protected int getScrollBarX()
  {
    return right - 6;
  }
  
  public void setSlotXBoundsFromLeft(int p_148140_1_)
  {
    left = p_148140_1_;
    right = (p_148140_1_ + width);
  }
  
  public int getSlotHeight()
  {
    return slotHeight;
  }
}
