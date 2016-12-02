import java.util.List;
import java.util.Random;

public class aob
  implements amv
{
  private Random h;
  private arc i;
  private arc j;
  private arc k;
  public arc a;
  public arc b;
  private adm l;
  private double[] m;
  private ady[] n;
  double[] c;
  double[] d;
  double[] e;
  double[] f;
  double[] g;
  
  public aob(adm ☃, long ☃)
  {
    l = ☃;
    
    h = new Random(☃);
    i = new arc(h, 16);
    j = new arc(h, 16);
    k = new arc(h, 8);
    
    a = new arc(h, 10);
    b = new arc(h, 16);
  }
  
  public void a(int ☃, int ☃, ans ☃)
  {
    int ☃ = 2;
    
    int ☃ = ☃ + 1;
    int ☃ = 33;
    int ☃ = ☃ + 1;
    m = a(m, ☃ * ☃, 0, ☃ * ☃, ☃, ☃, ☃);
    for (int ☃ = 0; ☃ < ☃; ☃++) {
      for (int ☃ = 0; ☃ < ☃; ☃++) {
        for (int ☃ = 0; ☃ < 32; ☃++)
        {
          double ☃ = 0.25D;
          double ☃ = m[(((☃ + 0) * ☃ + ☃ + 0) * ☃ + ☃ + 0)];
          double ☃ = m[(((☃ + 0) * ☃ + ☃ + 1) * ☃ + ☃ + 0)];
          double ☃ = m[(((☃ + 1) * ☃ + ☃ + 0) * ☃ + ☃ + 0)];
          double ☃ = m[(((☃ + 1) * ☃ + ☃ + 1) * ☃ + ☃ + 0)];
          
          double ☃ = (m[(((☃ + 0) * ☃ + ☃ + 0) * ☃ + ☃ + 1)] - ☃) * ☃;
          double ☃ = (m[(((☃ + 0) * ☃ + ☃ + 1) * ☃ + ☃ + 1)] - ☃) * ☃;
          double ☃ = (m[(((☃ + 1) * ☃ + ☃ + 0) * ☃ + ☃ + 1)] - ☃) * ☃;
          double ☃ = (m[(((☃ + 1) * ☃ + ☃ + 1) * ☃ + ☃ + 1)] - ☃) * ☃;
          for (int ☃ = 0; ☃ < 4; ☃++)
          {
            double ☃ = 0.125D;
            
            double ☃ = ☃;
            double ☃ = ☃;
            double ☃ = (☃ - ☃) * ☃;
            double ☃ = (☃ - ☃) * ☃;
            for (int ☃ = 0; ☃ < 8; ☃++)
            {
              double ☃ = 0.125D;
              
              double ☃ = ☃;
              double ☃ = (☃ - ☃) * ☃;
              for (int ☃ = 0; ☃ < 8; ☃++)
              {
                alz ☃ = null;
                if (☃ > 0.0D) {
                  ☃ = afi.bH.Q();
                }
                int ☃ = ☃ + ☃ * 8;
                int ☃ = ☃ + ☃ * 4;
                int ☃ = ☃ + ☃ * 8;
                ☃.a(☃, ☃, ☃, ☃);
                ☃ += ☃;
              }
              ☃ += ☃;
              ☃ += ☃;
            }
            ☃ += ☃;
            ☃ += ☃;
            ☃ += ☃;
            ☃ += ☃;
          }
        }
      }
    }
  }
  
  public void a(ans ☃)
  {
    for (int ☃ = 0; ☃ < 16; ☃++) {
      for (int ☃ = 0; ☃ < 16; ☃++)
      {
        int ☃ = 1;
        int ☃ = -1;
        
        alz ☃ = afi.bH.Q();
        alz ☃ = afi.bH.Q();
        for (int ☃ = 127; ☃ >= 0; ☃--)
        {
          alz ☃ = ☃.a(☃, ☃, ☃);
          if (☃.c().t() == arm.a) {
            ☃ = -1;
          } else if (☃.c() == afi.b) {
            if (☃ == -1)
            {
              if (☃ <= 0)
              {
                ☃ = afi.a.Q();
                ☃ = afi.bH.Q();
              }
              ☃ = ☃;
              if (☃ >= 0) {
                ☃.a(☃, ☃, ☃, ☃);
              } else {
                ☃.a(☃, ☃, ☃, ☃);
              }
            }
            else if (☃ > 0)
            {
              ☃--;
              ☃.a(☃, ☃, ☃, ☃);
            }
          }
        }
      }
    }
  }
  
  public amy d(int ☃, int ☃)
  {
    h.setSeed(☃ * 341873128712L + ☃ * 132897987541L);
    
    ans ☃ = new ans();
    n = l.v().b(n, ☃ * 16, ☃ * 16, 16, 16);
    
    a(☃, ☃, ☃);
    a(☃);
    
    amy ☃ = new amy(l, ☃, ☃, ☃);
    byte[] ☃ = ☃.k();
    for (int ☃ = 0; ☃ < ☃.length; ☃++) {
      ☃[☃] = ((byte)n[☃].az);
    }
    ☃.b();
    
    return ☃;
  }
  
  private double[] a(double[] ☃, int ☃, int ☃, int ☃, int ☃, int ☃, int ☃)
  {
    if (☃ == null) {
      ☃ = new double[☃ * ☃ * ☃];
    }
    double ☃ = 684.412D;
    double ☃ = 684.412D;
    
    f = a.a(f, ☃, ☃, ☃, ☃, 1.121D, 1.121D, 0.5D);
    g = b.a(g, ☃, ☃, ☃, ☃, 200.0D, 200.0D, 0.5D);
    
    ☃ *= 2.0D;
    
    c = k.a(c, ☃, ☃, ☃, ☃, ☃, ☃, ☃ / 80.0D, ☃ / 160.0D, ☃ / 80.0D);
    d = i.a(d, ☃, ☃, ☃, ☃, ☃, ☃, ☃, ☃, ☃);
    e = j.a(e, ☃, ☃, ☃, ☃, ☃, ☃, ☃, ☃, ☃);
    
    int ☃ = 0;
    for (int ☃ = 0; ☃ < ☃; ☃++) {
      for (int ☃ = 0; ☃ < ☃; ☃++)
      {
        float ☃ = (☃ + ☃) / 1.0F;
        float ☃ = (☃ + ☃) / 1.0F;
        float ☃ = 100.0F - ns.c(☃ * ☃ + ☃ * ☃) * 8.0F;
        if (☃ > 80.0F) {
          ☃ = 80.0F;
        }
        if (☃ < -100.0F) {
          ☃ = -100.0F;
        }
        for (int ☃ = 0; ☃ < ☃; ☃++)
        {
          double ☃ = 0.0D;
          double ☃ = d[☃] / 512.0D;
          double ☃ = e[☃] / 512.0D;
          
          double ☃ = (c[☃] / 10.0D + 1.0D) / 2.0D;
          if (☃ < 0.0D) {
            ☃ = ☃;
          } else if (☃ > 1.0D) {
            ☃ = ☃;
          } else {
            ☃ = ☃ + (☃ - ☃) * ☃;
          }
          ☃ -= 8.0D;
          
          ☃ += ☃;
          
          int ☃ = 2;
          if (☃ > ☃ / 2 - ☃)
          {
            double ☃ = (☃ - (☃ / 2 - ☃)) / 64.0F;
            ☃ = ns.a(☃, 0.0D, 1.0D);
            ☃ = ☃ * (1.0D - ☃) + -3000.0D * ☃;
          }
          ☃ = 8;
          if (☃ < ☃)
          {
            double ☃ = (☃ - ☃) / (☃ - 1.0F);
            ☃ = ☃ * (1.0D - ☃) + -30.0D * ☃;
          }
          ☃[☃] = ☃;
          ☃++;
        }
      }
    }
    return ☃;
  }
  
  public boolean a(int ☃, int ☃)
  {
    return true;
  }
  
  public void a(amv ☃, int ☃, int ☃)
  {
    agr.N = true;
    
    cj ☃ = new cj(☃ * 16, 0, ☃ * 16);
    l.b(☃.a(16, 0, 16)).a(l, l.s, ☃);
    
    agr.N = false;
  }
  
  public boolean a(amv ☃, amy ☃, int ☃, int ☃)
  {
    return false;
  }
  
  public boolean a(boolean ☃, nu ☃)
  {
    return true;
  }
  
  public void c() {}
  
  public boolean d()
  {
    return false;
  }
  
  public boolean e()
  {
    return true;
  }
  
  public String f()
  {
    return "RandomLevelSource";
  }
  
  public List<ady.c> a(pt ☃, cj ☃)
  {
    return l.b(☃).a(☃);
  }
  
  public cj a(adm ☃, String ☃, cj ☃)
  {
    return null;
  }
  
  public int g()
  {
    return 0;
  }
  
  public void a(amy ☃, int ☃, int ☃) {}
  
  public amy a(cj ☃)
  {
    return d(☃.n() >> 4, ☃.p() >> 4);
  }
}
