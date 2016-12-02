package mods.accountmanager.utils;

import ave;

public abstract class FancyGuiListExtended
  extends FancyGuiSlot
{
  private static final String __OBFID = "CL_00000674";
  
  public FancyGuiListExtended(ave mcIn, int p_i45010_2_, int p_i45010_3_, int p_i45010_4_, int p_i45010_5_, int p_i45010_6_, int startBox)
  {
    super(mcIn, p_i45010_2_, p_i45010_3_, p_i45010_4_, p_i45010_5_, p_i45010_6_, startBox);
  }
  
  protected void elementClicked(int slotIndex, boolean isDoubleClick, int mouseX, int mouseY) {}
  
  protected boolean isSelected(int slotIndex)
  {
    return false;
  }
  
  protected void drawBackground() {}
  
  protected void drawSlot(int entryID, int p_180791_2_, int p_180791_3_, int p_180791_4_, int p_180791_5_, int p_180791_6_)
  {
    getListEntry(entryID).drawEntry(entryID, p_180791_2_, p_180791_3_, getListWidth(), p_180791_4_, p_180791_5_, p_180791_6_, getSlotIndexFromScreenCoords(p_180791_5_, p_180791_6_) == entryID);
  }
  
  public boolean mouseClicked(int mouseX, int mouseY, int mouseEvent)
  {
    if (isMouseYWithinSlotBounds(mouseX, mouseY))
    {
      int l = getSlotIndexFromScreenCoords(mouseX, mouseY);
      if (l >= 0)
      {
        int i1 = left + width / 2 - getListWidth() / 2 + 2;
        int j1 = top + 4 - getAmountScrolled() + l * slotHeight + headerPadding;
        int k1 = mouseX - i1;
        int l1 = mouseY - j1;
        if (getListEntry(l).mousePressed(l, mouseX, mouseY, mouseEvent, k1, l1))
        {
          setEnabled(false);
          return true;
        }
      }
    }
    return false;
  }
  
  public boolean mouseReleased(int p_148181_1_, int p_148181_2_, int p_148181_3_)
  {
    for (int l = 0; l < getSize(); l++)
    {
      int i1 = left + width / 2 - getListWidth() / 2 + 2;
      int j1 = top + 4 - getAmountScrolled() + l * slotHeight + headerPadding;
      int k1 = p_148181_1_ - i1;
      int l1 = p_148181_2_ - j1;
      getListEntry(l).mouseReleased(l, p_148181_1_, p_148181_2_, p_148181_3_, k1, l1);
    }
    setEnabled(true);
    return false;
  }
  
  public abstract IGuiListEntry getListEntry(int paramInt);
  
  public static abstract interface IGuiListEntry
  {
    public abstract void setSelected(int paramInt1, int paramInt2, int paramInt3);
    
    public abstract void drawEntry(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, boolean paramBoolean);
    
    public abstract boolean mousePressed(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6);
    
    public abstract void mouseReleased(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6);
  }
}
