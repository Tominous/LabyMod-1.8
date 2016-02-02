import com.google.common.collect.HashMultiset;
import com.google.common.collect.Iterables;
import com.google.common.collect.Multiset;
import com.google.common.collect.Multisets;
import java.util.List;

public class aab
  extends yy
{
  protected aab()
  {
    a(true);
  }
  
  public static atg a(int ☃, adm ☃)
  {
    String ☃ = "map_" + ☃;
    atg ☃ = (atg)☃.a(atg.class, ☃);
    if (☃ == null)
    {
      ☃ = new atg(☃);
      
      ☃.a(☃, ☃);
    }
    return ☃;
  }
  
  public atg a(zx ☃, adm ☃)
  {
    String ☃ = "map_" + ☃.i();
    atg ☃ = (atg)☃.a(atg.class, ☃);
    if ((☃ == null) && (!☃.D))
    {
      ☃.b(☃.b("map"));
      ☃ = "map_" + ☃.i();
      ☃ = new atg(☃);
      
      ☃.e = 3;
      ☃.a(☃.P().c(), ☃.P().e(), ☃.e);
      ☃.d = ((byte)☃.t.q());
      
      ☃.c();
      
      ☃.a(☃, ☃);
    }
    return ☃;
  }
  
  public void a(adm ☃, pk ☃, atg ☃)
  {
    if ((☃.t.q() != ☃.d) || (!(☃ instanceof wn))) {
      return;
    }
    int ☃ = 1 << ☃.e;
    int ☃ = ☃.b;
    int ☃ = ☃.c;
    
    int ☃ = ns.c(☃.s - ☃) / ☃ + 64;
    int ☃ = ns.c(☃.u - ☃) / ☃ + 64;
    int ☃ = 128 / ☃;
    if (☃.t.o()) {
      ☃ /= 2;
    }
    atg.a ☃ = ☃.a((wn)☃);
    ☃.b += 1;
    
    boolean ☃ = false;
    for (int ☃ = ☃ - ☃ + 1; ☃ < ☃ + ☃; ☃++) {
      if (((☃ & 0xF) == (☃.b & 0xF)) || (☃))
      {
        ☃ = false;
        double ☃ = 0.0D;
        for (int ☃ = ☃ - ☃ - 1; ☃ < ☃ + ☃; ☃++) {
          if ((☃ >= 0) && (☃ >= -1) && (☃ < 128) && (☃ < 128))
          {
            int ☃ = ☃ - ☃;
            int ☃ = ☃ - ☃;
            
            boolean ☃ = ☃ * ☃ + ☃ * ☃ > (☃ - 2) * (☃ - 2);
            
            int ☃ = (☃ / ☃ + ☃ - 64) * ☃;
            int ☃ = (☃ / ☃ + ☃ - 64) * ☃;
            
            Multiset<arn> ☃ = HashMultiset.create();
            
            amy ☃ = ☃.f(new cj(☃, 0, ☃));
            if (!☃.f())
            {
              int ☃ = ☃ & 0xF;
              int ☃ = ☃ & 0xF;
              int ☃ = 0;
              
              double ☃ = 0.0D;
              if (☃.t.o())
              {
                int ☃ = ☃ + ☃ * 231871;
                ☃ = ☃ * ☃ * 31287121 + ☃ * 11;
                if ((☃ >> 20 & 0x1) == 0) {
                  ☃.add(afi.d.g(afi.d.Q().a(agf.a, agf.a.a)), 10);
                } else {
                  ☃.add(afi.b.g(afi.b.Q().a(ajy.a, ajy.a.a)), 100);
                }
                ☃ = 100.0D;
              }
              else
              {
                cj.a ☃ = new cj.a();
                for (int ☃ = 0; ☃ < ☃; ☃++) {
                  for (int ☃ = 0; ☃ < ☃; ☃++)
                  {
                    int ☃ = ☃.b(☃ + ☃, ☃ + ☃) + 1;
                    alz ☃ = afi.a.Q();
                    if (☃ > 1)
                    {
                      do
                      {
                        ☃--;
                        ☃ = ☃.g(☃.c(☃ + ☃, ☃, ☃ + ☃));
                      } while ((☃.c().g(☃) == arn.b) && (☃ > 0));
                      if ((☃ > 0) && (☃.c().t().d()))
                      {
                        int ☃ = ☃ - 1;
                        afh ☃;
                        do
                        {
                          ☃ = ☃.a(☃ + ☃, ☃--, ☃ + ☃);
                          ☃++;
                        } while ((☃ > 0) && (☃.t().d()));
                      }
                    }
                    ☃ += ☃ / (☃ * ☃);
                    
                    ☃.add(☃.c().g(☃));
                  }
                }
              }
              ☃ /= ☃ * ☃;
              
              double ☃ = (☃ - ☃) * 4.0D / (☃ + 4) + ((☃ + ☃ & 0x1) - 0.5D) * 0.4D;
              int ☃ = 1;
              if (☃ > 0.6D) {
                ☃ = 2;
              }
              if (☃ < -0.6D) {
                ☃ = 0;
              }
              arn ☃ = (arn)Iterables.getFirst(Multisets.copyHighestCountFirst(☃), arn.b);
              if (☃ == arn.n)
              {
                ☃ = ☃ * 0.1D + (☃ + ☃ & 0x1) * 0.2D;
                ☃ = 1;
                if (☃ < 0.5D) {
                  ☃ = 2;
                }
                if (☃ > 0.9D) {
                  ☃ = 0;
                }
              }
              ☃ = ☃;
              if (☃ >= 0) {
                if (☃ * ☃ + ☃ * ☃ < ☃ * ☃) {
                  if ((!☃) || ((☃ + ☃ & 0x1) != 0))
                  {
                    byte ☃ = ☃.f[(☃ + ☃ * 128)];
                    byte ☃ = (byte)(☃.M * 4 + ☃);
                    if (☃ != ☃)
                    {
                      ☃.f[(☃ + ☃ * 128)] = ☃;
                      ☃.a(☃, ☃);
                      ☃ = true;
                    }
                  }
                }
              }
            }
          }
        }
      }
    }
  }
  
  public void a(zx ☃, adm ☃, pk ☃, int ☃, boolean ☃)
  {
    if (☃.D) {
      return;
    }
    atg ☃ = a(☃, ☃);
    if ((☃ instanceof wn))
    {
      wn ☃ = (wn)☃;
      ☃.a(☃, ☃);
    }
    if (☃) {
      a(☃, ☃, ☃);
    }
  }
  
  public ff c(zx ☃, adm ☃, wn ☃)
  {
    return a(☃, ☃).a(☃, ☃, ☃);
  }
  
  public void d(zx ☃, adm ☃, wn ☃)
  {
    if ((☃.n()) && (☃.o().n("map_is_scaling")))
    {
      atg ☃ = zy.bd.a(☃, ☃);
      ☃.b(☃.b("map"));
      atg ☃ = new atg("map_" + ☃.i());
      
      ☃.e = ((byte)(☃.e + 1));
      if (☃.e > 4) {
        ☃.e = 4;
      }
      ☃.a(☃.b, ☃.c, ☃.e);
      ☃.d = ☃.d;
      ☃.c();
      ☃.a("map_" + ☃.i(), ☃);
    }
  }
  
  public void a(zx ☃, wn ☃, List<String> ☃, boolean ☃)
  {
    atg ☃ = a(☃, ☃.o);
    if (☃) {
      if (☃ == null)
      {
        ☃.add("Unknown map");
      }
      else
      {
        ☃.add("Scaling at 1:" + (1 << ☃.e));
        ☃.add("(Level " + ☃.e + "/" + 4 + ")");
      }
    }
  }
}
