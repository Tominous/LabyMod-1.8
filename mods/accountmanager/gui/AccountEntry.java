package mods.accountmanager.gui;

import ave;
import avm;
import avn;
import avs;
import bfl;
import bmj;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import jy;
import mods.accountmanager.AccountManager;
import mods.accountmanager.utils.FancyGuiListExtended.IGuiListEntry;
import mods.accountmanager.utils.FancyGuiSlot;
import nx;
import org.lwjgl.opengl.GL11;

public class AccountEntry
  implements FancyGuiListExtended.IGuiListEntry
{
  private final ave mc;
  private String field_148299_g;
  private long field_148298_f;
  private static final String __OBFID = "CL_00000817";
  private String name;
  private FancyGuiSlot parentList;
  private AccountManagerGUI parent;
  
  protected AccountEntry(AccountManagerGUI parent, String name, FancyGuiSlot parentList)
  {
    this.mc = ave.A();
    this.name = name;
    this.parent = parent;
    this.parentList = parentList;
  }
  
  public void drawEntry(int slotIndex, int x, int y, int listWidth, int slotHeight, int mouseX, int mouseY, boolean isSelected)
  {
    int yPos = y + 3;
    if ((yPos - 3 >= this.parentList.top) && (yPos + 13 <= this.parentList.bottom))
    {
      drawPlayerHead(nx.a(this.name), x + 1, yPos + 1, 0.5D);
      
      String tempName = this.name;
      if (ave.A().L().c().equals(tempName)) {
        tempName = "§a" + tempName;
      }
      this.mc.k.a(tempName, x + 30, yPos + 2, 16777215);
    }
    bfl.c(1.0F, 1.0F, 1.0F, 1.0F);
  }
  
  private void drawPlayerHead(String player, double x, double y, double size)
  {
    if (!AccountManager.playerHeads.containsKey(player)) {
      return;
    }
    GL11.glPushMatrix();
    GL11.glScaled(size, size, size);
    bfl.c(1.0F, 1.0F, 1.0F);
    this.mc.P().a(
      (jy)AccountManager.playerHeads.get(player));
    AccountManager.drawTexturedModalRect(x / size, (y - 3.0D) / size, 32.0D, 32.0D, 32.0D, 32.0D);
    
    AccountManager.drawTexturedModalRect(x / size, (y - 3.0D) / size, 160.0D, 32.0D, 32.0D, 32.0D);
    
    GL11.glPopMatrix();
  }
  
  private boolean func_178013_b()
  {
    return true;
  }
  
  public boolean mousePressed(int p_148278_1_, int p_148278_2_, int p_148278_3_, int p_148278_4_, int p_148278_5_, int p_148278_6_)
  {
    this.parent.getList().setSelected(p_148278_1_);
    for (Iterator localIterator = this.parent.getButtonList().iterator(); localIterator.hasNext();)
    {
      button = (avs)localIterator.next();
      if ((button.k == 3) || (button.k == 4)) {
        button.l = true;
      }
    }
    avs button;
    if (ave.J() - this.field_148298_f <= 1000L)
    {
      avs button = null;
      for (avs buttons : this.parent.getButtonList()) {
        if (buttons.k == 3) {
          button = buttons;
        }
      }
      try
      {
        this.parent.a(button);
      }
      catch (IOException e)
      {
        e.printStackTrace();
      }
    }
    this.field_148298_f = ave.J();
    return false;
  }
  
  public String getName()
  {
    return this.name;
  }
  
  public void setSelected(int p_178011_1_, int p_178011_2_, int p_178011_3_) {}
  
  public void mouseReleased(int slotIndex, int x, int y, int mouseEvent, int relativeX, int relativeY) {}
}
