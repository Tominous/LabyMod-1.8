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
    a = ☃;
    E = ☃;
    int ☃ = 141;
    int ☃ = 141;
    
    s = (u = w = fa * 24 - ☃ / 2 - 12);
    t = (v = x = fb * 24 - ☃ / 2);
  }
  
  public void b()
  {
    j.u().a(new ig(ig.a.b));
    n.clear();
    n.add(new awe(1, l / 2 + 24, m / 2 + 74, 80, 20, bnq.a("gui.done", new Object[0])));
  }
  
  protected void a(avs ☃)
  {
    if (F) {
      return;
    }
    if (k == 1) {
      j.a(a);
    }
  }
  
  protected void a(char ☃, int ☃)
  {
    if (☃ == j.t.ae.i())
    {
      j.a(null);
      j.n();
    }
    else
    {
      super.a(☃, ☃);
    }
  }
  
  public void a(int ☃, int ☃, float ☃)
  {
    if (F)
    {
      c();
      a(q, bnq.a("multiplayer.downloadingStats", new Object[0]), l / 2, m / 2, 16777215);
      a(q, c_[((int)(ave.J() / 150L % c_.length))], l / 2, m / 2 + q.a * 2, 16777215);
    }
    else
    {
      if (Mouse.isButtonDown(0))
      {
        int ☃ = (l - f) / 2;
        int ☃ = (m - g) / 2;
        
        int ☃ = ☃ + 8;
        int ☃ = ☃ + 17;
        if (((D == 0) || (D == 1)) && 
          (☃ >= ☃) && (☃ < ☃ + 224) && (☃ >= ☃) && (☃ < ☃ + 155))
        {
          if (D == 0)
          {
            D = 1;
          }
          else
          {
            u -= (☃ - h) * r;
            v -= (☃ - i) * r;
            w = (s = u);
            x = (t = v);
          }
          h = ☃;
          i = ☃;
        }
      }
      else
      {
        D = 0;
      }
      int ☃ = Mouse.getDWheel();
      float ☃ = r;
      if (☃ < 0) {
        r += 0.25F;
      } else if (☃ > 0) {
        r -= 0.25F;
      }
      r = ns.a(r, 1.0F, 2.0F);
      if (r != ☃)
      {
        float ☃ = ☃ - r;
        float ☃ = ☃ * f;
        float ☃ = ☃ * g;
        float ☃ = r * f;
        float ☃ = r * g;
        u -= (☃ - ☃) * 0.5F;
        v -= (☃ - ☃) * 0.5F;
        w = (s = u);
        x = (t = v);
      }
      if (w < y) {
        w = y;
      }
      if (x < z) {
        x = z;
      }
      if (w >= A) {
        w = (A - 1);
      }
      if (x >= B) {
        x = (B - 1);
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
    if (F) {
      F = false;
    }
  }
  
  public void e()
  {
    if (F) {
      return;
    }
    s = u;
    t = v;
    
    double ☃ = w - u;
    double ☃ = x - v;
    if (☃ * ☃ + ☃ * ☃ < 4.0D)
    {
      u += ☃;
      v += ☃;
    }
    else
    {
      u += ☃ * 0.85D;
      v += ☃ * 0.85D;
    }
  }
  
  protected void f()
  {
    int ☃ = (l - f) / 2;
    int ☃ = (m - g) / 2;
    q.a(bnq.a("gui.achievements", new Object[0]), ☃ + 15, ☃ + 5, 4210752);
  }
  
  protected void b(int ☃, int ☃, float ☃)
  {
    int ☃ = ns.c(s + (u - s) * ☃);
    int ☃ = ns.c(t + (v - t) * ☃);
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
    int ☃ = (l - f) / 2;
    int ☃ = (m - g) / 2;
    
    int ☃ = ☃ + 16;
    int ☃ = ☃ + 17;
    
    e = 0.0F;
    bfl.c(518);
    bfl.E();
    bfl.b(☃, ☃, -200.0F);
    bfl.a(1.0F / r, 1.0F / r, 0.0F);
    
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
    float ☃ = 16.0F / r;
    float ☃ = 16.0F / r;
    for (int ☃ = 0; ☃ * ☃ - ☃ < 155.0F; ☃++)
    {
      float ☃ = 0.6F - (☃ + ☃) / 25.0F * 0.3F;
      bfl.c(☃, ☃, ☃, 1.0F);
      for (int ☃ = 0; ☃ * ☃ - ☃ < 224.0F; ☃++)
      {
        ☃.setSeed(j.L().b().hashCode() + (☃ + ☃) + (☃ + ☃) * 16);
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
        j.P().a(bmh.g);
        
        a(☃ * 16 - ☃, ☃ * 16 - ☃, ☃, 16, 16);
      }
    }
    bfl.j();
    bfl.c(515);
    j.P().a(C);
    for (int ☃ = 0; ☃ < mr.e.size(); ☃++)
    {
      mq ☃ = (mq)mr.e.get(☃);
      if (c != null)
      {
        int ☃ = a * 24 - ☃ + 11;
        int ☃ = b * 24 - ☃ + 11;
        
        int ☃ = c.a * 24 - ☃ + 11;
        int ☃ = c.b * 24 - ☃ + 11;
        
        boolean ☃ = E.a(☃);
        boolean ☃ = E.b(☃);
        int ☃ = E.c(☃);
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
    float ☃ = (☃ - ☃) * r;
    float ☃ = (☃ - ☃) * r;
    
    avc.c();
    bfl.f();
    bfl.B();
    bfl.g();
    for (int ☃ = 0; ☃ < mr.e.size(); ☃++)
    {
      mq ☃ = (mq)mr.e.get(☃);
      
      int ☃ = a * 24 - ☃;
      int ☃ = b * 24 - ☃;
      if ((☃ >= -24) && (☃ >= -24) && (☃ <= 224.0F * r) && (☃ <= 155.0F * r))
      {
        int ☃ = E.c(☃);
        if (E.a(☃))
        {
          float ☃ = 0.75F;
          bfl.c(☃, ☃, ☃, 1.0F);
        }
        else if (E.b(☃))
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
        j.P().a(C);
        if (☃.g()) {
          b(☃ - 2, ☃ - 2, 26, 202, 26, 26);
        } else {
          b(☃ - 2, ☃ - 2, 0, 202, 26, 26);
        }
        if (!E.b(☃))
        {
          float ☃ = 0.1F;
          bfl.c(☃, ☃, ☃, 1.0F);
          k.a(false);
        }
        bfl.e();
        bfl.o();
        k.b(d, ☃ + 3, ☃ + 3);
        bfl.b(770, 771);
        bfl.f();
        if (!E.b(☃)) {
          k.a(true);
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
    j.P().a(C);
    b(☃, ☃, 0, 0, f, g);
    
    e = 0.0F;
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
      int ☃ = E.c(☃);
      if (E.b(☃))
      {
        int ☃ = Math.max(q.a(☃), 120);
        int ☃ = q.b(☃, ☃);
        if (E.a(☃)) {
          ☃ += 12;
        }
        a(☃ - 3, ☃ - 3, ☃ + ☃ + 3, ☃ + ☃ + 3 + 12, -1073741824, -1073741824);
        
        q.a(☃, ☃, ☃ + 12, ☃, -6250336);
        if (E.a(☃)) {
          q.a(bnq.a("achievement.taken", new Object[0]), ☃, ☃ + ☃ + 4, -7302913);
        }
      }
      else if (☃ == 3)
      {
        ☃ = bnq.a("achievement.unknown", new Object[0]);
        int ☃ = Math.max(q.a(☃), 120);
        String ☃ = new fb("achievement.requires", new Object[] { c.e() }).c();
        int ☃ = q.b(☃, ☃);
        a(☃ - 3, ☃ - 3, ☃ + ☃ + 3, ☃ + ☃ + 12 + 3, -1073741824, -1073741824);
        q.a(☃, ☃, ☃ + 12, ☃, -9416624);
      }
      else if (☃ < 3)
      {
        int ☃ = Math.max(q.a(☃), 120);
        String ☃ = new fb("achievement.requires", new Object[] { c.e() }).c();
        int ☃ = q.b(☃, ☃);
        a(☃ - 3, ☃ - 3, ☃ + ☃ + 3, ☃ + ☃ + 12 + 3, -1073741824, -1073741824);
        q.a(☃, ☃, ☃ + 12, ☃, -9416624);
      }
      else
      {
        ☃ = null;
      }
      if (☃ != null) {
        q.a(☃, ☃, ☃, ☃.g() ? -8355776 : E.b(☃) ? -1 : ☃.g() ? -128 : -8355712);
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
    return !F;
  }
}
