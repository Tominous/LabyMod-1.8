import java.util.List;
import java.util.Random;
import org.lwjgl.input.Mouse;

public class aye
  extends axu
  implements ayg
{
  private static final int y = mr.a * 24 - 112;
  private static final int z = mr.b * 24 - 112;
  private static final int A = mr.c * 24 - 77;
  private static final int B = mr.d * 24 - 77;
  private static final jy C = new jy("textures/gui/achievement/achievement_background.png");
  protected axu a;
  protected int f = 256;
  protected int g = 202;
  protected int h;
  protected int i;
  protected float r = 1.0F;
  protected double s;
  protected double t;
  protected double u;
  protected double v;
  protected double w;
  protected double x;
  private int D;
  private nb E;
  private boolean F = true;
  
  public aye(axu ☃, nb ☃)
  {
    this.a = ☃;
    this.E = ☃;
    int ☃ = 141;
    int ☃ = 141;
    
    this.s = (this.u = this.w = mr.f.a * 24 - ☃ / 2 - 12);
    this.t = (this.v = this.x = mr.f.b * 24 - ☃ / 2);
  }
  
  public void b()
  {
    this.j.u().a(new ig(ig.a.b));
    this.n.clear();
    this.n.add(new awe(1, this.l / 2 + 24, this.m / 2 + 74, 80, 20, bnq.a("gui.done", new Object[0])));
  }
  
  protected void a(avs ☃)
  {
    if (this.F) {
      return;
    }
    if (☃.k == 1) {
      this.j.a(this.a);
    }
  }
  
  protected void a(char ☃, int ☃)
  {
    if (☃ == this.j.t.ae.i())
    {
      this.j.a(null);
      this.j.n();
    }
    else
    {
      super.a(☃, ☃);
    }
  }
  
  public void a(int ☃, int ☃, float ☃)
  {
    if (this.F)
    {
      c();
      a(this.q, bnq.a("multiplayer.downloadingStats", new Object[0]), this.l / 2, this.m / 2, 16777215);
      a(this.q, c_[((int)(ave.J() / 150L % c_.length))], this.l / 2, this.m / 2 + this.q.a * 2, 16777215);
    }
    else
    {
      if (Mouse.isButtonDown(0))
      {
        int ☃ = (this.l - this.f) / 2;
        int ☃ = (this.m - this.g) / 2;
        
        int ☃ = ☃ + 8;
        int ☃ = ☃ + 17;
        if (((this.D == 0) || (this.D == 1)) && 
          (☃ >= ☃) && (☃ < ☃ + 224) && (☃ >= ☃) && (☃ < ☃ + 155))
        {
          if (this.D == 0)
          {
            this.D = 1;
          }
          else
          {
            this.u -= (☃ - this.h) * this.r;
            this.v -= (☃ - this.i) * this.r;
            this.w = (this.s = this.u);
            this.x = (this.t = this.v);
          }
          this.h = ☃;
          this.i = ☃;
        }
      }
      else
      {
        this.D = 0;
      }
      int ☃ = Mouse.getDWheel();
      float ☃ = this.r;
      if (☃ < 0) {
        this.r += 0.25F;
      } else if (☃ > 0) {
        this.r -= 0.25F;
      }
      this.r = ns.a(this.r, 1.0F, 2.0F);
      if (this.r != ☃)
      {
        float ☃ = ☃ - this.r;
        float ☃ = ☃ * this.f;
        float ☃ = ☃ * this.g;
        float ☃ = this.r * this.f;
        float ☃ = this.r * this.g;
        this.u -= (☃ - ☃) * 0.5F;
        this.v -= (☃ - ☃) * 0.5F;
        this.w = (this.s = this.u);
        this.x = (this.t = this.v);
      }
      if (this.w < y) {
        this.w = y;
      }
      if (this.x < z) {
        this.x = z;
      }
      if (this.w >= A) {
        this.w = (A - 1);
      }
      if (this.x >= B) {
        this.x = (B - 1);
      }
      c();
      b(☃, ☃, ☃);
      
      bfl.f();
      bfl.i();
      
      f();
      
      bfl.e();
      bfl.j();
    }
  }
  
  public void a()
  {
    if (this.F) {
      this.F = false;
    }
  }
  
  public void e()
  {
    if (this.F) {
      return;
    }
    this.s = this.u;
    this.t = this.v;
    
    double ☃ = this.w - this.u;
    double ☃ = this.x - this.v;
    if (☃ * ☃ + ☃ * ☃ < 4.0D)
    {
      this.u += ☃;
      this.v += ☃;
    }
    else
    {
      this.u += ☃ * 0.85D;
      this.v += ☃ * 0.85D;
    }
  }
  
  protected void f()
  {
    int ☃ = (this.l - this.f) / 2;
    int ☃ = (this.m - this.g) / 2;
    this.q.a(bnq.a("gui.achievements", new Object[0]), ☃ + 15, ☃ + 5, 4210752);
  }
  
  protected void b(int ☃, int ☃, float ☃)
  {
    int ☃ = ns.c(this.s + (this.u - this.s) * ☃);
    int ☃ = ns.c(this.t + (this.v - this.t) * ☃);
    if (☃ < y) {
      ☃ = y;
    }
    if (☃ < z) {
      ☃ = z;
    }
    if (☃ >= A) {
      ☃ = A - 1;
    }
    if (☃ >= B) {
      ☃ = B - 1;
    }
    int ☃ = (this.l - this.f) / 2;
    int ☃ = (this.m - this.g) / 2;
    
    int ☃ = ☃ + 16;
    int ☃ = ☃ + 17;
    
    this.e = 0.0F;
    bfl.c(518);
    bfl.E();
    bfl.b(☃, ☃, -200.0F);
    bfl.a(1.0F / this.r, 1.0F / this.r, 0.0F);
    
    bfl.w();
    bfl.f();
    bfl.B();
    bfl.g();
    
    int ☃ = ☃ + 288 >> 4;
    int ☃ = ☃ + 288 >> 4;
    int ☃ = (☃ + 288) % 16;
    int ☃ = (☃ + 288) % 16;
    
    int ☃ = 4;
    int ☃ = 8;
    int ☃ = 10;
    int ☃ = 22;
    int ☃ = 37;
    
    Random ☃ = new Random();
    float ☃ = 16.0F / this.r;
    float ☃ = 16.0F / this.r;
    for (int ☃ = 0; ☃ * ☃ - ☃ < 155.0F; ☃++)
    {
      float ☃ = 0.6F - (☃ + ☃) / 25.0F * 0.3F;
      bfl.c(☃, ☃, ☃, 1.0F);
      for (int ☃ = 0; ☃ * ☃ - ☃ < 224.0F; ☃++)
      {
        ☃.setSeed(this.j.L().b().hashCode() + (☃ + ☃) + (☃ + ☃) * 16);
        int ☃ = ☃.nextInt(1 + ☃ + ☃) + (☃ + ☃) / 2;
        bmi ☃ = a(afi.m);
        if ((☃ > 37) || (☃ + ☃ == 35))
        {
          afh ☃ = afi.h;
          ☃ = a(☃);
        }
        else if (☃ == 22)
        {
          if (☃.nextInt(2) == 0) {
            ☃ = a(afi.ag);
          } else {
            ☃ = a(afi.aC);
          }
        }
        else if (☃ == 10)
        {
          ☃ = a(afi.p);
        }
        else if (☃ == 8)
        {
          ☃ = a(afi.q);
        }
        else if (☃ > 4)
        {
          ☃ = a(afi.b);
        }
        else if (☃ > 0)
        {
          ☃ = a(afi.d);
        }
        this.j.P().a(bmh.g);
        
        a(☃ * 16 - ☃, ☃ * 16 - ☃, ☃, 16, 16);
      }
    }
    bfl.j();
    bfl.c(515);
    this.j.P().a(C);
    for (int ☃ = 0; ☃ < mr.e.size(); ☃++)
    {
      mq ☃ = (mq)mr.e.get(☃);
      if (☃.c != null)
      {
        int ☃ = ☃.a * 24 - ☃ + 11;
        int ☃ = ☃.b * 24 - ☃ + 11;
        
        int ☃ = ☃.c.a * 24 - ☃ + 11;
        int ☃ = ☃.c.b * 24 - ☃ + 11;
        
        boolean ☃ = this.E.a(☃);
        boolean ☃ = this.E.b(☃);
        int ☃ = this.E.c(☃);
        if (☃ <= 4)
        {
          int ☃ = -16777216;
          if (☃) {
            ☃ = -6250336;
          } else if (☃) {
            ☃ = -16711936;
          }
          a(☃, ☃, ☃, ☃);
          b(☃, ☃, ☃, ☃);
          if (☃ > ☃) {
            b(☃ - 11 - 7, ☃ - 5, 114, 234, 7, 11);
          } else if (☃ < ☃) {
            b(☃ + 11, ☃ - 5, 107, 234, 7, 11);
          } else if (☃ > ☃) {
            b(☃ - 5, ☃ - 11 - 7, 96, 234, 11, 7);
          } else if (☃ < ☃) {
            b(☃ - 5, ☃ + 11, 96, 241, 11, 7);
          }
        }
      }
    }
    mq ☃ = null;
    float ☃ = (☃ - ☃) * this.r;
    float ☃ = (☃ - ☃) * this.r;
    
    avc.c();
    bfl.f();
    bfl.B();
    bfl.g();
    for (int ☃ = 0; ☃ < mr.e.size(); ☃++)
    {
      mq ☃ = (mq)mr.e.get(☃);
      
      int ☃ = ☃.a * 24 - ☃;
      int ☃ = ☃.b * 24 - ☃;
      if ((☃ >= -24) && (☃ >= -24) && (☃ <= 224.0F * this.r) && (☃ <= 155.0F * this.r))
      {
        int ☃ = this.E.c(☃);
        if (this.E.a(☃))
        {
          float ☃ = 0.75F;
          bfl.c(☃, ☃, ☃, 1.0F);
        }
        else if (this.E.b(☃))
        {
          float ☃ = 1.0F;
          bfl.c(☃, ☃, ☃, 1.0F);
        }
        else if (☃ < 3)
        {
          float ☃ = 0.3F;
          bfl.c(☃, ☃, ☃, 1.0F);
        }
        else if (☃ == 3)
        {
          float ☃ = 0.2F;
          bfl.c(☃, ☃, ☃, 1.0F);
        }
        else
        {
          if (☃ != 4) {
            continue;
          }
          float ☃ = 0.1F;
          bfl.c(☃, ☃, ☃, 1.0F);
        }
        this.j.P().a(C);
        if (☃.g()) {
          b(☃ - 2, ☃ - 2, 26, 202, 26, 26);
        } else {
          b(☃ - 2, ☃ - 2, 0, 202, 26, 26);
        }
        if (!this.E.b(☃))
        {
          float ☃ = 0.1F;
          bfl.c(☃, ☃, ☃, 1.0F);
          this.k.a(false);
        }
        bfl.e();
        bfl.o();
        this.k.b(☃.d, ☃ + 3, ☃ + 3);
        bfl.b(770, 771);
        bfl.f();
        if (!this.E.b(☃)) {
          this.k.a(true);
        }
        bfl.c(1.0F, 1.0F, 1.0F, 1.0F);
        if ((☃ >= ☃) && (☃ <= ☃ + 22) && (☃ >= ☃) && (☃ <= ☃ + 22)) {
          ☃ = ☃;
        }
      }
    }
    bfl.i();
    bfl.l();
    
    bfl.F();
    bfl.c(1.0F, 1.0F, 1.0F, 1.0F);
    this.j.P().a(C);
    b(☃, ☃, 0, 0, this.f, this.g);
    
    this.e = 0.0F;
    bfl.c(515);
    
    bfl.i();
    bfl.w();
    super.a(☃, ☃, ☃);
    if (☃ != null)
    {
      String ☃ = ☃.e().c();
      String ☃ = ☃.f();
      
      int ☃ = ☃ + 12;
      int ☃ = ☃ - 4;
      int ☃ = this.E.c(☃);
      if (this.E.b(☃))
      {
        int ☃ = Math.max(this.q.a(☃), 120);
        int ☃ = this.q.b(☃, ☃);
        if (this.E.a(☃)) {
          ☃ += 12;
        }
        a(☃ - 3, ☃ - 3, ☃ + ☃ + 3, ☃ + ☃ + 3 + 12, -1073741824, -1073741824);
        
        this.q.a(☃, ☃, ☃ + 12, ☃, -6250336);
        if (this.E.a(☃)) {
          this.q.a(bnq.a("achievement.taken", new Object[0]), ☃, ☃ + ☃ + 4, -7302913);
        }
      }
      else if (☃ == 3)
      {
        ☃ = bnq.a("achievement.unknown", new Object[0]);
        int ☃ = Math.max(this.q.a(☃), 120);
        String ☃ = new fb("achievement.requires", new Object[] { ☃.c.e() }).c();
        int ☃ = this.q.b(☃, ☃);
        a(☃ - 3, ☃ - 3, ☃ + ☃ + 3, ☃ + ☃ + 12 + 3, -1073741824, -1073741824);
        this.q.a(☃, ☃, ☃ + 12, ☃, -9416624);
      }
      else if (☃ < 3)
      {
        int ☃ = Math.max(this.q.a(☃), 120);
        String ☃ = new fb("achievement.requires", new Object[] { ☃.c.e() }).c();
        int ☃ = this.q.b(☃, ☃);
        a(☃ - 3, ☃ - 3, ☃ + ☃ + 3, ☃ + ☃ + 12 + 3, -1073741824, -1073741824);
        this.q.a(☃, ☃, ☃ + 12, ☃, -9416624);
      }
      else
      {
        ☃ = null;
      }
      if (☃ != null) {
        this.q.a(☃, ☃, ☃, ☃.g() ? -8355776 : this.E.b(☃) ? -1 : ☃.g() ? -128 : -8355712);
      }
    }
    bfl.j();
    bfl.e();
    avc.a();
  }
  
  private bmi a(afh ☃)
  {
    return ave.A().ae().a().a(☃.Q());
  }
  
  public boolean d()
  {
    return !this.F;
  }
}
