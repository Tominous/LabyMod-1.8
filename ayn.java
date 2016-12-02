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
    this.w = tileBeaconIn;
    this.f = 230;
    this.g = 219;
  }
  
  public void b()
  {
    super.b();
    this.n.add(this.x = new ayn.b(-1, this.i + 164, this.r + 107));
    this.n.add(new ayn.a(-2, this.i + 190, this.r + 107));
    this.y = true;
    this.x.l = false;
  }
  
  public void e()
  {
    super.e();
    int i = this.w.a_(0);
    int j = this.w.a_(1);
    int k = this.w.a_(2);
    if ((this.y) && (i >= 0))
    {
      this.y = false;
      for (int l = 0; l <= 2; l++)
      {
        int i1 = akv.a[l].length;
        int j1 = i1 * 22 + (i1 - 1) * 2;
        for (int k1 = 0; k1 < i1; k1++)
        {
          int l1 = akv.a[l][k1].H;
          ayn.c guibeacon$powerbutton = new ayn.c(l << 8 | l1, this.i + 76 + k1 * 24 - j1 / 2, this.r + 22 + l * 25, l1, l);
          this.n.add(guibeacon$powerbutton);
          if (l >= i) {
            guibeacon$powerbutton.l = false;
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
        int i3 = akv.a[i2][l2].H;
        ayn.c guibeacon$powerbutton2 = new ayn.c(i2 << 8 | i3, this.i + 167 + l2 * 24 - k2 / 2, this.r + 47, i3, i2);
        this.n.add(guibeacon$powerbutton2);
        if (i2 >= i) {
          guibeacon$powerbutton2.l = false;
        } else if (i3 == k) {
          guibeacon$powerbutton2.b(true);
        }
      }
      if (j > 0)
      {
        ayn.c guibeacon$powerbutton1 = new ayn.c(i2 << 8 | j, this.i + 167 + (j2 - 1) * 24 - k2 / 2, this.r + 47, j, i2);
        this.n.add(guibeacon$powerbutton1);
        if (i2 >= i) {
          guibeacon$powerbutton1.l = false;
        } else if (j == k) {
          guibeacon$powerbutton1.b(true);
        }
      }
    }
    this.x.l = ((this.w.a(0) != null) && (j > 0));
  }
  
  protected void a(avs button)
    throws IOException
  {
    if (button.k == -2)
    {
      this.j.a((axu)null);
    }
    else if (button.k == -1)
    {
      String s = "MC|Beacon";
      em packetbuffer = new em(Unpooled.buffer());
      packetbuffer.writeInt(this.w.a_(1));
      packetbuffer.writeInt(this.w.a_(2));
      this.j.u().a(new im(s, packetbuffer));
      this.j.a((axu)null);
    }
    else if ((button instanceof ayn.c))
    {
      if (((ayn.c)button).c()) {
        return;
      }
      int j = button.k;
      int k = j & 0xFF;
      int i = j >> 8;
      if (i < 3) {
        this.w.b(1, k);
      } else {
        this.w.b(2, k);
      }
      this.n.clear();
      b();
      e();
    }
  }
  
  protected void b(int mouseX, int mouseY)
  {
    avc.a();
    a(this.q, bnq.a("tile.beacon.primary", new Object[0]), 62, 10, 14737632);
    a(this.q, bnq.a("tile.beacon.secondary", new Object[0]), 169, 10, 14737632);
    for (avs guibutton : this.n) {
      if (guibutton.a())
      {
        guibutton.b(mouseX - this.i, mouseY - this.r);
        break;
      }
    }
    avc.c();
  }
  
  protected void a(float partialTicks, int mouseX, int mouseY)
  {
    bfl.c(1.0F, 1.0F, 1.0F, 1.0F);
    this.j.P().a(v);
    int i = (this.l - this.f) / 2;
    int j = (this.m - this.g) / 2;
    b(i, j, 0, 0, this.f, this.g);
    this.k.a = 100.0F;
    this.k.b(new zx(zy.bO), i + 42, j + 109);
    this.k.b(new zx(zy.i), i + 42 + 22, j + 109);
    this.k.b(new zx(zy.k), i + 42 + 44, j + 109);
    this.k.b(new zx(zy.j), i + 42 + 66, j + 109);
    this.k.a = 0.0F;
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
      this.o = p_i1077_4_;
      this.p = p_i1077_5_;
      this.q = p_i1077_6_;
    }
    
    public void a(ave mc, int mouseX, int mouseY)
    {
      if (this.m)
      {
        mc.P().a(ayn.a());
        bfl.c(1.0F, 1.0F, 1.0F, 1.0F);
        this.n = ((mouseX >= this.h) && (mouseY >= this.i) && (mouseX < this.h + this.f) && (mouseY < this.i + this.g));
        int i = 219;
        int j = 0;
        if (!this.l) {
          j += this.f * 2;
        } else if (this.r) {
          j += this.f * 1;
        } else if (this.n) {
          j += this.f * 3;
        }
        b(this.h, this.i, j, i, this.f, this.g);
        if (!ayn.a().equals(this.o)) {
          mc.P().a(this.o);
        }
        b(this.h + 2, this.i + 2, this.p, this.q, 18, 18);
      }
    }
    
    public boolean c()
    {
      return this.r;
    }
    
    public void b(boolean p_146140_1_)
    {
      this.r = p_146140_1_;
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
      ayn.this.a(bnq.a("gui.cancel", new Object[0]), mouseX, mouseY);
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
      ayn.this.a(bnq.a("gui.done", new Object[0]), mouseX, mouseY);
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
      this.p = p_i1076_5_;
      this.q = p_i1076_6_;
    }
    
    public void b(int mouseX, int mouseY)
    {
      String s = bnq.a(pe.a[this.p].a(), new Object[0]);
      if ((this.q >= 3) && (this.p != pe.l.H)) {
        s = s + " II";
      }
      ayn.this.a(s, mouseX, mouseY);
    }
  }
}
