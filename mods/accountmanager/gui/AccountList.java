package mods.accountmanager.gui;

import ave;
import com.google.common.collect.Lists;
import java.util.List;
import mods.accountmanager.utils.FancyGuiListExtended;
import mods.accountmanager.utils.FancyGuiListExtended.IGuiListEntry;

public class AccountList
  extends FancyGuiListExtended
{
  private List<AccountEntry> field_148198_l = Lists.newArrayList();
  private int field_148197_o = -1;
  private static final String __OBFID = "CL_00000819";
  
  public AccountList(ave mcIn, int p_i45049_3_, int p_i45049_4_, int p_i45049_5_, int p_i45049_6_, int p_i45049_7_, int startBox)
  {
    super(mcIn, p_i45049_3_, p_i45049_4_, p_i45049_5_, p_i45049_6_, p_i45049_7_, startBox);
  }
  
  public FancyGuiListExtended.IGuiListEntry getListEntry(int p_148180_1_)
  {
    return (FancyGuiListExtended.IGuiListEntry)this.field_148198_l.get(p_148180_1_);
  }
  
  protected int getSize()
  {
    return this.field_148198_l.size();
  }
  
  public AccountEntry getAccountEntry()
  {
    return (AccountEntry)this.field_148198_l.get(this.field_148197_o);
  }
  
  public void setSelected(int p_148192_1_)
  {
    this.field_148197_o = p_148192_1_;
  }
  
  protected boolean isSelected(int slotIndex)
  {
    return slotIndex == this.field_148197_o;
  }
  
  public void setAccounts(AccountManagerGUI gui, List accounts)
  {
    this.field_148198_l.clear();
    for (Object account : accounts) {
      this.field_148198_l.add(new AccountEntry(gui, (String)account, this));
    }
  }
  
  public List<AccountEntry> getAccountEntrys()
  {
    return this.field_148198_l;
  }
  
  protected int getScrollBarX()
  {
    return super.getScrollBarX() + 30;
  }
  
  public int getListWidth()
  {
    return super.getListWidth() + 85;
  }
}
