import de.resourcepacks24.main.Pack;
import de.resourcepacks24.main.ResourcePacks24;
import de.resourcepacks24.utils.Color;
import de.resourcepacks24.utils.DrawUtils;
import java.io.File;
import java.io.PrintStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import org.lwjgl.opengl.GL11;

public abstract class azp
  implements awd.a
{
  private static final jy c = new jy("textures/gui/resource_packs.png");
  private static final eu d = new fb("resourcePack.incompatible", new Object[0]);
  private static final eu e = new fb("resourcePack.incompatible.old", new Object[0]);
  private static final eu f = new fb("resourcePack.incompatible.new", new Object[0]);
  protected final ave a;
  protected final azo b;
  zx itemIron = new zx(zw.b(265));
  zx itemGold = new zx(zw.b(266));
  zx itemDiamond = new zx(zw.b(264));
  zx itemBarrier = new zx(zw.b(166));
  private int listWidth = 0;
  private Pack pack;
  private int hoverAnimation = 0;
  private boolean folder = false;
  
  public void setFolder(boolean folder)
  {
    this.folder = folder;
  }
  
  public azp(azo resourcePacksGUIIn)
  {
    this.b = resourcePacksGUIIn;
    this.a = ave.A();
  }
  
  public void a(int slotIndex, int x, int y, int listWidth, int slotHeight, int mouseX, int mouseY, boolean isSelected)
  {
    int i = a();
    this.listWidth = listWidth;
    if (this.pack != null)
    {
      ResourcePacks24.getInstance().getDraw();DrawUtils.a(x + 32, y, 
        ResourcePacks24.getInstance().getDraw().getWidth() - 30, y + 32, Color.toRGB(this.hoverAnimation, this.hoverAnimation, this.hoverAnimation, this.hoverAnimation));
    }
    if ((this.pack != null) && (ResourcePacks24.getInstance().getSelectedPack() == this.pack))
    {
      ResourcePacks24.getInstance().getDraw();DrawUtils.a(x, y, ResourcePacks24.getInstance().getDraw().getWidth() - 30, y + 32, -2147470229);
    }
    if (this.pack != null)
    {
      if ((y > ResourcePacks24.getInstance().getDraw().getHeight()) || (y < 0)) {
        return;
      }
      if (this.pack.getPremiumId() != 0)
      {
        int s = ResourcePacks24.getInstance().getDraw().getStringWidth(this.pack.getCreator() + " " + this.pack.getBestPossibleName());
        GL11.glPushMatrix();
        GL11.glScaled(0.5D, 0.5D, 0.5D);
        zx item = this.itemIron;
        switch (this.pack.getPremiumId())
        {
        case 2: 
          item = this.itemGold;
          break;
        case 3: 
          item = this.itemDiamond;
        }
        ResourcePacks24.getInstance().getDraw().drawItem(item, (int)((x + 55 + s) / 0.5D), (int)((y + 1) / 0.5D));
        GL11.glPopMatrix();
      }
      ResourcePacks24.getInstance().getDraw();DrawUtils.a(x + 32, y, listWidth + 80, y + 32, 441470000);
    }
    else
    {
      ResourcePacks24.getInstance().getDraw();DrawUtils.a(x + 32, y, x + listWidth - 5, y + 32, 
        Color.toRGB(this.hoverAnimation, this.hoverAnimation, this.hoverAnimation, this.hoverAnimation));
      boolean selected = false;
      bnm.a current = null;
      for (bnm.a entry : this.a.R().c()) {
        if (entry.d().equals(getTitle()))
        {
          selected = true;
          break;
        }
      }
      for (bnm.a entry : this.a.R().b()) {
        if (entry.d().equals(getTitle()))
        {
          current = entry;
          break;
        }
      }
      if ((!this.b.f().contains(this)) && (!selected) && (!this.folder)) {
        if ((mouseX > x + 183 - 5) && (mouseX < x + 183 + 10) && (mouseY > y - 5) && (mouseY < y + 10))
        {
          GL11.glPushMatrix();
          GL11.glScaled(0.7D, 0.7D, 0.7D);
          ResourcePacks24.getInstance().getDraw().drawItem(this.itemBarrier, (int)((x + 183 - 1) / 0.7D), (int)((y - 1) / 0.7D));
          GL11.glPopMatrix();
        }
        else
        {
          GL11.glPushMatrix();
          GL11.glScaled(0.5D, 0.5D, 0.5D);
          ResourcePacks24.getInstance().getDraw().drawItem(this.itemBarrier, (int)((x + 183) / 0.5D), (int)(y / 0.5D));
          GL11.glPopMatrix();
        }
      }
    }
    if (i != 1)
    {
      bfl.c(1.0F, 1.0F, 1.0F, 1.0F);
      avp.a(x - 1, y - 1, x + listWidth - 9, y + slotHeight + 1, -8978432);
    }
    d();
    bfl.c(1.0F, 1.0F, 1.0F, 1.0F);
    if (this.pack == null)
    {
      if (this.folder) {
        ave.A().P().a(ResourcePacks24.RESOURCE_FOLDER);
      }
      avp.a(x, y, 0.0F, 0.0F, 32, 32, 32.0F, 32.0F);
    }
    else
    {
      ResourcePacks24.getInstance().getDraw();DrawUtils.a(x, y, x + 32, y + 32, Integer.MIN_VALUE);
      ResourcePacks24.getInstance().getDraw().drawCenteredString("?", x + 16, y + 7, 2.0D);
      bfl.c(1.0F, 1.0F, 1.0F);
      this.pack.drawImage(x, y, 32, 32, 0.13D);
    }
    String s = c();
    String s1 = b();
    if (((this.a.t.A) || (isSelected)) && (e()))
    {
      this.hoverAnimation += 18;
      if (this.hoverAnimation > 100) {
        this.hoverAnimation = 100;
      }
    }
    else
    {
      this.hoverAnimation -= 18;
      if (this.hoverAnimation < 0) {
        this.hoverAnimation = 0;
      }
    }
    if (((this.a.t.A) || (isSelected)) && (e()))
    {
      this.a.P().a(c);
      if (this.pack == null) {
        avp.a(x, y, x + 32, y + 32, -1601138544);
      }
      bfl.c(1.0F, 1.0F, 1.0F, 1.0F);
      int j = mouseX - x;
      int k = mouseY - y;
      if (i < 1)
      {
        s = d.d();
        s1 = e.d();
      }
      else if (i > 1)
      {
        s = d.d();
        s1 = f.d();
      }
      if (this.folder) {
        ResourcePacks24.getInstance().getDraw().drawCenteredString(getTitle().equals("..") ? "BACK" : "OPEN", x + 16, y + 12, 1.0D);
      }
      if ((this.pack == null) && (!this.folder)) {
        if (f())
        {
          if (j < 32) {
            avp.a(x, y, 0.0F, 32.0F, 32, 32, 256.0F, 256.0F);
          } else {
            avp.a(x, y, 0.0F, 0.0F, 32, 32, 256.0F, 256.0F);
          }
        }
        else
        {
          if (g()) {
            if (j < 16) {
              avp.a(x, y, 32.0F, 32.0F, 32, 32, 256.0F, 256.0F);
            } else {
              avp.a(x, y, 32.0F, 0.0F, 32, 32, 256.0F, 256.0F);
            }
          }
          if (h()) {
            if ((j < 32) && (j > 16) && (k < 16)) {
              avp.a(x, y, 96.0F, 32.0F, 32, 32, 256.0F, 256.0F);
            } else {
              avp.a(x, y, 96.0F, 0.0F, 32, 32, 256.0F, 256.0F);
            }
          }
          if (i()) {
            if ((j < 32) && (j > 16) && (k > 16)) {
              avp.a(x, y, 64.0F, 32.0F, 32, 32, 256.0F, 256.0F);
            } else {
              avp.a(x, y, 64.0F, 0.0F, 32, 32, 256.0F, 256.0F);
            }
          }
        }
      }
    }
    int i1 = this.a.k.a(s);
    
    int w = 157;
    if (this.pack != null) {
      w = listWidth - 150;
    }
    if (i1 > w) {
      s = this.a.k.a(s, 157 - this.a.k.a("...")) + "...";
    }
    this.a.k.a(s, x + 32 + 2, y + 1, 16777215);
    
    List<String> list = this.a.k.c(s1, w);
    if (this.pack == null)
    {
      for (int l = 0; (l < 2) && (l < list.size()); l++) {
        this.a.k.a((String)list.get(l), x + 32 + 2, y + 12 + 10 * l, 8421504);
      }
    }
    else
    {
      GL11.glPushMatrix();
      double k = 0.6D;
      GL11.glScaled(k, k, k);
      for (int l = 0; (l < 2) && (l < list.size()); l++) {
        this.a.k.a((String)list.get(l), (float)((x + 32 + 2) / k), (float)((y + 12 + 10 * l) / k), 8421504);
      }
      GL11.glPopMatrix();
      
      ResourcePacks24.getInstance().getDraw().drawRightString(Color.cl("a") + this.pack.getDownloads() + " Downloads", x + listWidth - 15, y + 1);
      ResourcePacks24.getInstance().getDraw().drawRightString(Color.cl("7") + ResourcePacks24.simpleDateFormat.format(Long.valueOf(this.pack.getUpTime() * 1000L)) + "", x + listWidth - 15, y + 12);
      ResourcePacks24.getInstance().getDraw().drawRightString(Color.cl("b") + this.pack.getVotes() + " Votes", x + listWidth - 15, y + 22);
      
      ResourcePacks24.getInstance().getDraw();DrawUtils.a(x, y + 25, x + 32, y + 32, Integer.MIN_VALUE);
      ResourcePacks24.getInstance().getDraw().drawString(Color.cl("f") + Color.cl("f") + this.pack.getSize(), x + 1, y + 27, 0.6D);
    }
  }
  
  public void setPackInfo(Pack pack)
  {
    this.pack = pack;
  }
  
  protected abstract int a();
  
  protected abstract String b();
  
  protected abstract String c();
  
  public String getTitle()
  {
    return c();
  }
  
  protected abstract void d();
  
  protected boolean e()
  {
    return true;
  }
  
  protected boolean f()
  {
    return !this.b.a(this);
  }
  
  protected boolean g()
  {
    return this.b.a(this);
  }
  
  protected boolean h()
  {
    List<azp> list = this.b.b(this);
    int i = list.indexOf(this);
    return (i > 0) && (((azp)list.get(i - 1)).e());
  }
  
  protected boolean i()
  {
    List<azp> list = this.b.b(this);
    int i = list.indexOf(this);
    return (i >= 0) && (i < list.size() - 1) && (((azp)list.get(i + 1)).e());
  }
  
  public boolean a(int slotIndex, int p_148278_2_, int p_148278_3_, int p_148278_4_, int p_148278_5_, int p_148278_6_)
  {
    if (this.pack != null)
    {
      ResourcePacks24.getInstance().setSelectedPack(this.pack);
      return true;
    }
    if (this.folder)
    {
      if (getTitle().equals(".."))
      {
        ResourcePacks24.getInstance().setPath("");
        this.b.refreshPackList();
      }
      else
      {
        List<bnm.a> list = ave.A().R().b();
        for (bnm.a entry : list) {
          if (entry.getDirPath().equals(getTitle()))
          {
            ResourcePacks24.getInstance().setPath(entry.getDirPath());
            this.b.refreshPackList();
            break;
          }
        }
      }
      return true;
    }
    boolean selected = false;
    for (bnm.a entry : this.a.R().c()) {
      if (entry.d().equals(getTitle()))
      {
        selected = true;
        break;
      }
    }
    if ((p_148278_5_ > 178) && (p_148278_5_ < 193) && (p_148278_6_ > 0) && (p_148278_6_ < 10) && (!this.b.f().contains(this)) && (!selected))
    {
      this.a.a(new awy(new awx()
      {
        public void a(boolean result, int id)
        {
          if (result)
          {
            File folder = ave.A().R().d();
            File pack = new File(folder.getAbsolutePath(), azp.this.getTitle());
            if (pack.delete())
            {
              System.out.println("[Resourcepack24] Deleted " + azp.this.getTitle() + " successfully!");
            }
            else
            {
              ResourcePacks24.getInstance().getDeletedPacks().add(azp.this.getTitle());
              System.out.println("[Resourcepack24] Can't delete " + azp.this.getTitle() + ", try again later..");
            }
          }
          azp.this.a.a(new azo(azp.this.b.getParentScreen()));
        }
      }, Color.cl("c") + "Delete this pack?", getTitle(), 0));
      return true;
    }
    if ((e()) && (p_148278_5_ <= 32))
    {
      if (f())
      {
        this.b.g();
        int j = a();
        if (j != 1)
        {
          String s1 = bnq.a("resourcePack.incompatible.confirm.title", new Object[0]);
          String s = bnq.a("resourcePack.incompatible.confirm." + (j > 1 ? "new" : "old"), new Object[0]);
          this.a.a(new awy(new awx()
          {
            public void a(boolean result, int id)
            {
              List<azp> list2 = azp.this.b.b(azp.this);
              azp.this.a.a(azp.this.b);
              if (result)
              {
                list2.remove(azp.this);
                azp.this.b.f().add(0, azp.this);
              }
            }
          }, s1, s, 0));
        }
        else
        {
          this.b.b(this).remove(this);
          this.b.f().add(0, this);
        }
        return true;
      }
      if ((p_148278_5_ < 16) && (g()))
      {
        this.b.b(this).remove(this);
        this.b.a().add(0, this);
        this.b.g();
        return true;
      }
      if ((p_148278_5_ > 16) && (p_148278_6_ < 16) && (h()))
      {
        Object list1 = this.b.b(this);
        int k = ((List)list1).indexOf(this);
        ((List)list1).remove(this);
        ((List)list1).add(k - 1, this);
        this.b.g();
        return true;
      }
      if ((p_148278_5_ > 16) && (p_148278_6_ > 16) && (i()))
      {
        Object list = this.b.b(this);
        int i = ((List)list).indexOf(this);
        ((List)list).remove(this);
        ((List)list).add(i + 1, this);
        this.b.g();
        return true;
      }
    }
    return false;
  }
  
  public void a(int p_178011_1_, int p_178011_2_, int p_178011_3_) {}
  
  public void b(int slotIndex, int x, int y, int mouseEvent, int relativeX, int relativeY) {}
}
