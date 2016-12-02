public class arw
  extends ase
{
  private ady[] c = { ady.r, ady.r, ady.r, ady.Y, ady.Y, ady.q };
  private ady[] d = { ady.t, ady.S, ady.s, ady.q, ady.Q, ady.v };
  private ady[] e = { ady.t, ady.s, ady.u, ady.q };
  private ady[] f = { ady.B, ady.B, ady.B, ady.T };
  private final ant g;
  
  public arw(long ☃, ase ☃, adr ☃, String ☃)
  {
    super(☃);
    a = ☃;
    if (☃ == adr.h)
    {
      c = new ady[] { ady.r, ady.t, ady.s, ady.v, ady.q, ady.u };
      
      g = null;
    }
    else if (☃ == adr.f)
    {
      g = ant.a.a(☃).b();
    }
    else
    {
      g = null;
    }
  }
  
  public int[] a(int ☃, int ☃, int ☃, int ☃)
  {
    int[] ☃ = a.a(☃, ☃, ☃, ☃);
    
    int[] ☃ = asc.a(☃ * ☃);
    for (int ☃ = 0; ☃ < ☃; ☃++) {
      for (int ☃ = 0; ☃ < ☃; ☃++)
      {
        a(☃ + ☃, ☃ + ☃);
        int ☃ = ☃[(☃ + ☃ * ☃)];
        int ☃ = (☃ & 0xF00) >> 8;
        ☃ &= 0xF0FF;
        if ((g != null) && (g.F >= 0)) {
          ☃[(☃ + ☃ * ☃)] = g.F;
        } else if (b(☃)) {
          ☃[(☃ + ☃ * ☃)] = ☃;
        } else if (☃ == Daz) {
          ☃[(☃ + ☃ * ☃)] = ☃;
        } else if (☃ == 1)
        {
          if (☃ > 0)
          {
            if (a(3) == 0) {
              ☃[(☃ + ☃ * ☃)] = acaz;
            } else {
              ☃[(☃ + ☃ * ☃)] = abaz;
            }
          }
          else {
            ☃[(☃ + ☃ * ☃)] = c[a(c.length)].az;
          }
        }
        else if (☃ == 2)
        {
          if (☃ > 0) {
            ☃[(☃ + ☃ * ☃)] = Kaz;
          } else {
            ☃[(☃ + ☃ * ☃)] = d[a(d.length)].az;
          }
        }
        else if (☃ == 3)
        {
          if (☃ > 0) {
            ☃[(☃ + ☃ * ☃)] = Vaz;
          } else {
            ☃[(☃ + ☃ * ☃)] = e[a(e.length)].az;
          }
        }
        else if (☃ == 4) {
          ☃[(☃ + ☃ * ☃)] = f[a(f.length)].az;
        } else {
          ☃[(☃ + ☃ * ☃)] = Daz;
        }
      }
    }
    return ☃;
  }
}
