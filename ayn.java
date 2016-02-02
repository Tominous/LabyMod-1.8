import io.netty.buffer.Unpooled;
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
  
  public ayn(wm ☃, og ☃)
  {
    super(new xl(☃, ☃));
    this.w = ☃;
    
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
    
    int ☃ = this.w.a_(0);
    int ☃ = this.w.a_(1);
    int ☃ = this.w.a_(2);
    if ((this.y) && (☃ >= 0))
    {
      this.y = false;
      for (int ☃ = 0; ☃ <= 2; ☃++)
      {
        int ☃ = akv.a[☃].length;
        int ☃ = ☃ * 22 + (☃ - 1) * 2;
        for (int ☃ = 0; ☃ < ☃; ☃++)
        {
          int ☃ = akv.a[☃][☃].H;
          ayn.c ☃ = new ayn.c(☃ << 8 | ☃, this.i + 76 + ☃ * 24 - ☃ / 2, this.r + 22 + ☃ * 25, ☃, ☃);
          this.n.add(☃);
          if (☃ >= ☃) {
            ☃.l = false;
          } else if (☃ == ☃) {
            ☃.b(true);
          }
        }
      }
      int ☃ = 3;
      
      int ☃ = akv.a[☃].length + 1;
      int ☃ = ☃ * 22 + (☃ - 1) * 2;
      for (int ☃ = 0; ☃ < ☃ - 1; ☃++)
      {
        int ☃ = akv.a[☃][☃].H;
        ayn.c ☃ = new ayn.c(☃ << 8 | ☃, this.i + 167 + ☃ * 24 - ☃ / 2, this.r + 47, ☃, ☃);
        this.n.add(☃);
        if (☃ >= ☃) {
          ☃.l = false;
        } else if (☃ == ☃) {
          ☃.b(true);
        }
      }
      if (☃ > 0)
      {
        ayn.c ☃ = new ayn.c(☃ << 8 | ☃, this.i + 167 + (☃ - 1) * 24 - ☃ / 2, this.r + 47, ☃, ☃);
        this.n.add(☃);
        if (☃ >= ☃) {
          ☃.l = false;
        } else if (☃ == ☃) {
          ☃.b(true);
        }
      }
    }
    this.x.l = ((this.w.a(0) != null) && (☃ > 0));
  }
  
  protected void a(avs ☃)
  {
    if (☃.k == -2)
    {
      this.j.a(null);
    }
    else if (☃.k == -1)
    {
      String ☃ = "MC|Beacon";
      
      em ☃ = new em(Unpooled.buffer());
      
      ☃.writeInt(this.w.a_(1));
      ☃.writeInt(this.w.a_(2));
      this.j.u().a(new im(☃, ☃));
      this.j.a(null);
    }
    else if ((☃ instanceof ayn.c))
    {
      if (((ayn.c)☃).c()) {
        return;
      }
      int ☃ = ☃.k;
      int ☃ = ☃ & 0xFF;
      int ☃ = ☃ >> 8;
      if (☃ < 3) {
        this.w.b(1, ☃);
      } else {
        this.w.b(2, ☃);
      }
      this.n.clear();
      b();
      e();
    }
  }
  
  protected void b(int ☃, int ☃)
  {
    avc.a();
    a(this.q, bnq.a("tile.beacon.primary", new Object[0]), 62, 10, 14737632);
    a(this.q, bnq.a("tile.beacon.secondary", new Object[0]), 169, 10, 14737632);
    for (avs ☃ : this.n) {
      if (☃.a())
      {
        ☃.b(☃ - this.i, ☃ - this.r);
        break;
      }
    }
    avc.c();
  }
  
  protected void a(float ☃, int ☃, int ☃)
  {
    bfl.c(1.0F, 1.0F, 1.0F, 1.0F);
    this.j.P().a(v);
    int ☃ = (this.l - this.f) / 2;
    int ☃ = (this.m - this.g) / 2;
    b(☃, ☃, 0, 0, this.f, this.g);
    
    this.k.a = 100.0F;
    this.k.b(new zx(zy.bO), ☃ + 42, ☃ + 109);
    this.k.b(new zx(zy.i), ☃ + 42 + 22, ☃ + 109);
    this.k.b(new zx(zy.k), ☃ + 42 + 44, ☃ + 109);
    this.k.b(new zx(zy.j), ☃ + 42 + 66, ☃ + 109);
    this.k.a = 0.0F;
  }
  
  static class d
    extends avs
  {
    private final jy o;
    private final int p;
    private final int q;
    private boolean r;
    
    protected d(int ☃, int ☃, int ☃, jy ☃, int ☃, int ☃)
    {
      super(☃, ☃, 22, 22, "");
      this.o = ☃;
      this.p = ☃;
      this.q = ☃;
    }
    
    public void a(ave ☃, int ☃, int ☃)
    {
      if (!this.m) {
        return;
      }
      ☃.P().a(ayn.a());
      bfl.c(1.0F, 1.0F, 1.0F, 1.0F);
      
      this.n = ((☃ >= this.h) && (☃ >= this.i) && (☃ < this.h + this.f) && (☃ < this.i + this.g));
      int ☃ = 219;
      int ☃ = 0;
      if (!this.l) {
        ☃ += this.f * 2;
      } else if (this.r) {
        ☃ += this.f * 1;
      } else if (this.n) {
        ☃ += this.f * 3;
      }
      b(this.h, this.i, ☃, ☃, this.f, this.g);
      if (!ayn.a().equals(this.o)) {
        ☃.P().a(this.o);
      }
      b(this.h + 2, this.i + 2, this.p, this.q, 18, 18);
    }
    
    public boolean c()
    {
      return this.r;
    }
    
    public void b(boolean ☃)
    {
      this.r = ☃;
    }
  }
  
  class c
    extends ayn.d
  {
    private final int p;
    private final int q;
    
    public c(int ☃, int ☃, int ☃, int ☃, int ☃)
    {
      super(☃, ☃, ayl.a, 0 + pe.a[☃].f() % 8 * 18, 198 + pe.a[☃].f() / 8 * 18);
      this.p = ☃;
      this.q = ☃;
    }
    
    public void b(int ☃, int ☃)
    {
      String ☃ = bnq.a(pe.a[this.p].a(), new Object[0]);
      if ((this.q >= 3) && (this.p != pe.l.H)) {
        ☃ = ☃ + " II";
      }
      ayn.a(ayn.this, ☃, ☃, ☃);
    }
  }
  
  class b
    extends ayn.d
  {
    public b(int ☃, int ☃, int ☃)
    {
      super(☃, ☃, ayn.a(), 90, 220);
    }
    
    public void b(int ☃, int ☃)
    {
      ayn.b(ayn.this, bnq.a("gui.done", new Object[0]), ☃, ☃);
    }
  }
  
  class a
    extends ayn.d
  {
    public a(int ☃, int ☃, int ☃)
    {
      super(☃, ☃, ayn.a(), 112, 220);
    }
    
    public void b(int ☃, int ☃)
    {
      ayn.c(ayn.this, bnq.a("gui.cancel", new Object[0]), ☃, ☃);
    }
  }
}
