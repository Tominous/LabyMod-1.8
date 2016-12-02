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
    this.mc = mcIn;
    this.width = width;
    this.height = height;
    this.top = topIn;
    this.bottom = bottomIn;
    this.slotHeight = slotHeightIn;
    this.left = startX;
    this.right = (this.left + width);
    this.startX = startX;
  }
  
  public void setDimensions(int p_148122_1_, int p_148122_2_, int p_148122_3_, int p_148122_4_)
  {
    this.width = p_148122_1_;
    this.height = p_148122_2_;
    this.top = p_148122_3_;
    this.bottom = p_148122_4_;
    this.left = 0;
    this.right = p_148122_1_;
  }
  
  public void setShowSelectionBox(boolean p_148130_1_)
  {
    this.showSelectionBox = p_148130_1_;
  }
  
  protected void setHasListHeader(boolean p_148133_1_, int p_148133_2_)
  {
    this.hasListHeader = p_148133_1_;
    this.headerPadding = p_148133_2_;
    if (!p_148133_1_) {
      this.headerPadding = 0;
    }
  }
  
  protected abstract int getSize();
  
  protected abstract void elementClicked(int paramInt1, boolean paramBoolean, int paramInt2, int paramInt3);
  
  protected abstract boolean isSelected(int paramInt);
  
  protected int getContentHeight()
  {
    return getSize() * this.slotHeight + this.headerPadding;
  }
  
  protected abstract void drawBackground();
  
  protected void func_178040_a(int p_178040_1_, int p_178040_2_, int p_178040_3_) {}
  
  protected abstract void drawSlot(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6);
  
  protected void drawListHeader(int p_148129_1_, int p_148129_2_, bfx p_148129_3_) {}
  
  protected void func_148132_a(int p_148132_1_, int p_148132_2_) {}
  
  protected void func_148142_b(int p_148142_1_, int p_148142_2_) {}
  
  public int getSlotIndexFromScreenCoords(int p_148124_1_, int p_148124_2_)
  {
    int k = this.left + this.width / 2 - getListWidth() / 2;
    int l = this.left + this.width / 2 + getListWidth() / 2;
    int i1 = p_148124_2_ - this.top - this.headerPadding + (int)this.amountScrolled - 4;
    
    int j1 = i1 / this.slotHeight;
    if ((p_148124_1_ < getScrollBarX()) && (p_148124_1_ >= k) && (p_148124_1_ <= l) && (j1 >= 0) && (i1 >= 0)) {}
    return j1 < getSize() ? j1 : -1;
  }
  
  public void registerScrollButtons(int p_148134_1_, int p_148134_2_)
  {
    this.scrollUpButtonID = p_148134_1_;
    this.scrollDownButtonID = p_148134_2_;
  }
  
  protected void bindAmountScrolled()
  {
    int i = func_148135_f();
    if (i < 0) {
      i /= 2;
    }
    if ((!this.field_148163_i) && (i < 0)) {
      i = 0;
    }
    this.amountScrolled = ns.a(this.amountScrolled, 0.0F, i);
  }
  
  public int func_148135_f()
  {
    return Math.max(0, getContentHeight() - (this.bottom - this.top - 4));
  }
  
  public int getAmountScrolled()
  {
    return (int)this.amountScrolled;
  }
  
  public boolean isMouseYWithinSlotBounds(int mouseX, int p_148141_1_)
  {
    return (p_148141_1_ >= this.top) && (p_148141_1_ <= this.bottom) && (mouseX >= this.left) && (mouseX <= this.right);
  }
  
  public void scrollBy(int p_148145_1_)
  {
    this.amountScrolled += p_148145_1_;
    bindAmountScrolled();
    this.initialClickY = -2.0F;
  }
  
  public void actionPerformed(avs p_148147_1_)
  {
    if (p_148147_1_.l) {
      if (p_148147_1_.k == this.scrollUpButtonID)
      {
        this.amountScrolled -= this.slotHeight * 2 / 3;
        this.initialClickY = -2.0F;
        bindAmountScrolled();
      }
      else if (p_148147_1_.k == this.scrollDownButtonID)
      {
        this.amountScrolled += this.slotHeight * 2 / 3;
        this.initialClickY = -2.0F;
        bindAmountScrolled();
      }
    }
  }
  
  public void drawScreen(int mouseXIn, int mouseYIn, float p_148128_3_)
  {
    if (this.field_178041_q)
    {
      this.mouseX = mouseXIn;
      this.mouseY = mouseYIn;
      drawBackground();
      int k = this.right - 6;
      int l = k + 6;
      bindAmountScrolled();
      bfl.f();
      bfl.n();
      bfx tessellator = bfx.a();
      bfd worldrenderer = tessellator.c();
      int i1 = this.left;
      
      int j1 = this.top + 4 - (int)this.amountScrolled;
      if (this.hasListHeader) {
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
        int l1 = (this.bottom - this.top) * (this.bottom - this.top) / getContentHeight();
        l1 = ns.a(l1, 32, this.bottom - this.top - 8);
        int i2 = (int)this.amountScrolled * (this.bottom - this.top - l1) / k1 + this.top;
        if (i2 < this.top) {
          i2 = this.top;
        }
        avp.a(k, this.top, l, this.bottom, new Color(255, 255, 255, 20).getRGB());
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
    if (isMouseYWithinSlotBounds(this.mouseX, this.mouseY))
    {
      if ((Mouse.isButtonDown(0)) && (getEnabled()))
      {
        if (this.initialClickY == -1.0F)
        {
          boolean flag = true;
          if ((this.mouseY >= this.top) && (this.mouseY <= this.bottom))
          {
            int i = this.width / 2 - getListWidth() / 2;
            int j = this.width / 2 + getListWidth() / 2;
            int k = this.mouseY - this.top - this.headerPadding + (int)this.amountScrolled - 4;
            
            int l = k / this.slotHeight;
            if ((this.mouseX >= i) && (this.mouseX <= j) && (l >= 0) && (k >= 0) && 
              (l < getSize()))
            {
              boolean flag1 = (l == this.selectedElement) && (ave.J() - this.lastClicked < 250L);
              
              elementClicked(l, flag1, this.mouseX, this.mouseY);
              
              this.selectedElement = l;
              this.lastClicked = ave.J();
            }
            else if ((this.mouseX >= i) && (this.mouseX <= j) && (k < 0))
            {
              func_148132_a(this.mouseX - i, this.mouseY - this.top + (int)this.amountScrolled - 4);
              
              flag = false;
            }
            int i2 = this.right - 6;
            int i1 = i2 + 6;
            if ((this.mouseX >= i2) && (this.mouseX <= i1))
            {
              this.scrollMultiplier = -1.0F;
              int j1 = func_148135_f();
              if (j1 < 1) {
                j1 = 1;
              }
              int k1 = (int)((this.bottom - this.top) * (this.bottom - this.top) / getContentHeight());
              k1 = ns.a(k1, 32, this.bottom - this.top - 8);
              
              this.scrollMultiplier /= (this.bottom - this.top - k1) / j1;
            }
            else
            {
              this.scrollMultiplier = 1.0F;
            }
            if (flag) {
              this.initialClickY = this.mouseY;
            } else {
              this.initialClickY = -2.0F;
            }
          }
          else
          {
            this.initialClickY = -2.0F;
          }
        }
        else if (this.initialClickY >= 0.0F)
        {
          this.amountScrolled -= (this.mouseY - this.initialClickY) * this.scrollMultiplier;
          
          this.initialClickY = this.mouseY;
        }
      }
      else {
        this.initialClickY = -1.0F;
      }
      int l1 = Mouse.getEventDWheel();
      if (l1 != 0)
      {
        if (l1 > 0) {
          l1 = -1;
        } else if (l1 < 0) {
          l1 = 1;
        }
        this.amountScrolled += l1 * this.slotHeight / 2;
      }
    }
  }
  
  public void setEnabled(boolean p_148143_1_)
  {
    this.enabled = p_148143_1_;
  }
  
  public boolean getEnabled()
  {
    return this.enabled;
  }
  
  public int getListWidth()
  {
    return this.width;
  }
  
  protected void drawSelectionBox(int p_148120_1_, int p_148120_2_, int p_148120_3_, int p_148120_4_)
  {
    int i1 = getSize();
    bfx tessellator = bfx.a();
    bfd worldrenderer = tessellator.c();
    for (int j1 = 0; j1 < i1; j1++)
    {
      int k1 = p_148120_2_ + j1 * this.slotHeight + this.headerPadding;
      int l1 = this.slotHeight - 4;
      if ((k1 > this.bottom) || (k1 + l1 < this.top)) {
        func_178040_a(j1, p_148120_1_, k1);
      }
      if ((this.showSelectionBox) && (isSelected(j1)) && (k1 >= this.top) && (k1 <= this.bottom - this.slotHeight + 5))
      {
        bfl.c(1.0F, 1.0F, 1.0F, 1.0F);
        avp.a(this.left, k1, this.right - 6, k1 + l1 + 2, new Color(255, 255, 255, 40)
          .getRGB());
      }
      drawSlot(j1, p_148120_1_, k1, l1, p_148120_3_, p_148120_4_);
    }
  }
  
  protected int getScrollBarX()
  {
    return this.right - 6;
  }
  
  public void setSlotXBoundsFromLeft(int p_148140_1_)
  {
    this.left = p_148140_1_;
    this.right = (p_148140_1_ + this.width);
  }
  
  public int getSlotHeight()
  {
    return this.slotHeight;
  }
}
