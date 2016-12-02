import io.netty.buffer.Unpooled;
import java.io.IOException;
import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ayn
  extends ayl
{
  private static final Logger u = ;
  private static final jy v = new jy("textures/gui/container/beacon.png");
  private og w;
  private ayn.b x;
  private boolean y;
  
  public ayn(wm playerInventory, og tileBeaconIn)
  {
    super(new xl(playerInventory, tileBeaconIn));
    w = tileBeaconIn;
    f = 230;
    g = 219;
  }
  
  public void b()
  {
    super.b();
    n.add(x = new ayn.b(-1, i + 164, r + 107));
    n.add(new ayn.a(-2, i + 190, r + 107));
    y = true;
    x.l = false;
  }
  
  public void e()
  {
    super.e();
    int i = w.a_(0);
    int j = w.a_(1);
    int k = w.a_(2);
    if ((y) && (i >= 0))
    {
      y = false;
      for (int l = 0; l <= 2; l++)
      {
        int i1 = akv.a[l].length;
        int j1 = i1 * 22 + (i1 - 1) * 2;
        for (int k1 = 0; k1 < i1; k1++)
        {
          int l1 = aH;
          ayn.c guibeacon$powerbutton = new ayn.c(l << 8 | l1, this.i + 76 + k1 * 24 - j1 / 2, r + 22 + l * 25, l1, l);
          n.add(guibeacon$powerbutton);
          if (l >= i) {
            l = false;
          } else if (l1 == j) {
            guibeacon$powerbutton.b(true);
          }
        }
      }
      int i2 = 3;
      int j2 = akv.a[i2].length + 1;
      int k2 = j2 * 22 + (j2 - 1) * 2;
      for (int l2 = 0; l2 < j2 - 1; l2++)
      {
        int i3 = aH;
        ayn.c guibeacon$powerbutton2 = new ayn.c(i2 << 8 | i3, this.i + 167 + l2 * 24 - k2 / 2, r + 47, i3, i2);
        n.add(guibeacon$powerbutton2);
        if (i2 >= i) {
          l = false;
        } else if (i3 == k) {
          guibeacon$powerbutton2.b(true);
        }
      }
      if (j > 0)
      {
        ayn.c guibeacon$powerbutton1 = new ayn.c(i2 << 8 | j, this.i + 167 + (j2 - 1) * 24 - k2 / 2, r + 47, j, i2);
        n.add(guibeacon$powerbutton1);
        if (i2 >= i) {
          l = false;
        } else if (j == k) {
          guibeacon$powerbutton1.b(true);
        }
      }
    }
    x.l = ((w.a(0) != null) && (j > 0));
  }
  
  protected void a(avs button)
    throws IOException
  {
    if (k == -2)
    {
      this.j.a((axu)null);
    }
    else if (k == -1)
    {
      String s = "MC|Beacon";
      em packetbuffer = new em(Unpooled.buffer());
      packetbuffer.writeInt(w.a_(1));
      packetbuffer.writeInt(w.a_(2));
      this.j.u().a(new im(s, packetbuffer));
      this.j.a((axu)null);
    }
    else if ((button instanceof ayn.c))
    {
      if (((ayn.c)button).c()) {
        return;
      }
      int j = k;
      int k = j & 0xFF;
      int i = j >> 8;
      if (i < 3) {
        w.b(1, k);
      } else {
        w.b(2, k);
      }
      n.clear();
      b();
      e();
    }
  }
  
  protected void b(int mouseX, int mouseY)
  {
    avc.a();
    a(q, bnq.a("tile.beacon.primary", new Object[0]), 62, 10, 14737632);
    a(q, bnq.a("tile.beacon.secondary", new Object[0]), 169, 10, 14737632);
    for (avs guibutton : n) {
      if (guibutton.a())
      {
        guibutton.b(mouseX - i, mouseY - r);
        break;
      }
    }
    avc.c();
  }
  
  protected void a(float partialTicks, int mouseX, int mouseY)
  {
    bfl.c(1.0F, 1.0F, 1.0F, 1.0F);
    this.j.P().a(v);
    int i = (l - f) / 2;
    int j = (m - g) / 2;
    b(i, j, 0, 0, f, g);
    k.a = 100.0F;
    k.b(new zx(zy.bO), i + 42, j + 109);
    k.b(new zx(zy.i), i + 42 + 22, j + 109);
    k.b(new zx(zy.k), i + 42 + 44, j + 109);
    k.b(new zx(zy.j), i + 42 + 66, j + 109);
    k.a = 0.0F;
  }
  
  static class d
    extends avs
  {
    private final jy o;
    private final int p;
    private final int q;
    private boolean r;
    
    protected d(int p_i1077_1_, int p_i1077_2_, int p_i1077_3_, jy p_i1077_4_, int p_i1077_5_, int p_i1077_6_)
    {
      super(p_i1077_2_, p_i1077_3_, 22, 22, "");
      o = p_i1077_4_;
      p = p_i1077_5_;
      q = p_i1077_6_;
    }
    
    public void a(ave mc, int mouseX, int mouseY)
    {
      if (m)
      {
        mc.P().a(ayn.a());
        bfl.c(1.0F, 1.0F, 1.0F, 1.0F);
        n = ((mouseX >= h) && (mouseY >= this.i) && (mouseX < h + f) && (mouseY < this.i + g));
        int i = 219;
        int j = 0;
        if (!l) {
          j += f * 2;
        } else if (r) {
          j += f * 1;
        } else if (n) {
          j += f * 3;
        }
        b(h, this.i, j, i, f, g);
        if (!ayn.a().equals(o)) {
          mc.P().a(o);
        }
        b(h + 2, this.i + 2, p, q, 18, 18);
      }
    }
    
    public boolean c()
    {
      return r;
    }
    
    public void b(boolean p_146140_1_)
    {
      r = p_146140_1_;
    }
  }
  
  class a
    extends ayn.d
  {
    public a(int p_i1074_2_, int p_i1074_3_, int p_i1074_4_)
    {
      super(p_i1074_3_, p_i1074_4_, ayn.a(), 112, 220);
    }
    
    public void b(int mouseX, int mouseY)
    {
      a(bnq.a("gui.cancel", new Object[0]), mouseX, mouseY);
    }
  }
  
  class b
    extends ayn.d
  {
    public b(int p_i1075_2_, int p_i1075_3_, int p_i1075_4_)
    {
      super(p_i1075_3_, p_i1075_4_, ayn.a(), 90, 220);
    }
    
    public void b(int mouseX, int mouseY)
    {
      a(bnq.a("gui.done", new Object[0]), mouseX, mouseY);
    }
  }
  
  class c
    extends ayn.d
  {
    private final int p;
    private final int q;
    
    public c(int p_i1076_2_, int p_i1076_3_, int p_i1076_4_, int p_i1076_5_, int p_i1076_6_)
    {
      super(p_i1076_3_, p_i1076_4_, ayl.a, 0 + pe.a[p_i1076_5_].f() % 8 * 18, 198 + pe.a[p_i1076_5_].f() / 8 * 18);
      p = p_i1076_5_;
      q = p_i1076_6_;
    }
    
    public void b(int mouseX, int mouseY)
    {
      String s = bnq.a(pe.a[p].a(), new Object[0]);
      if ((q >= 3) && (p != lH)) {
        s = s + " II";
      }
      a(s, mouseX, mouseY);
    }
  }
}
