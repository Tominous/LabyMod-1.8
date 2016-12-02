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
    this.a = ☃;
    if (☃ == adr.h)
    {
      this.c = new ady[] { ady.r, ady.t, ady.s, ady.v, ady.q, ady.u };
      
      this.g = null;
    }
    else if (☃ == adr.f)
    {
      this.g = ant.a.a(☃).b();
    }
    else
    {
      this.g = null;
    }
  }
  
  public int[] a(int ☃, int ☃, int ☃, int ☃)
  {
    int[] ☃ = this.a.a(☃, ☃, ☃, ☃);
    
    int[] ☃ = asc.a(☃ * ☃);
    for (int ☃ = 0; ☃ < ☃; ☃++) {
      for (int ☃ = 0; ☃ < ☃; ☃++)
      {
        a(☃ + ☃, ☃ + ☃);
        int ☃ = ☃[(☃ + ☃ * ☃)];
        int ☃ = (☃ & 0xF00) >> 8;
        ☃ &= 0xF0FF;
        if ((this.g != null) && (this.g.F >= 0)) {
          ☃[(☃ + ☃ * ☃)] = this.g.F;
        } else if (b(☃)) {
          ☃[(☃ + ☃ * ☃)] = ☃;
        } else if (☃ == ady.D.az) {
          ☃[(☃ + ☃ * ☃)] = ☃;
        } else if (☃ == 1)
        {
          if (☃ > 0)
          {
            if (a(3) == 0) {
              ☃[(☃ + ☃ * ☃)] = ady.ac.az;
            } else {
              ☃[(☃ + ☃ * ☃)] = ady.ab.az;
            }
          }
          else {
            ☃[(☃ + ☃ * ☃)] = this.c[a(this.c.length)].az;
          }
        }
        else if (☃ == 2)
        {
          if (☃ > 0) {
            ☃[(☃ + ☃ * ☃)] = ady.K.az;
          } else {
            ☃[(☃ + ☃ * ☃)] = this.d[a(this.d.length)].az;
          }
        }
        else if (☃ == 3)
        {
          if (☃ > 0) {
            ☃[(☃ + ☃ * ☃)] = ady.V.az;
          } else {
            ☃[(☃ + ☃ * ☃)] = this.e[a(this.e.length)].az;
          }
        }
        else if (☃ == 4) {
          ☃[(☃ + ☃ * ☃)] = this.f[a(this.f.length)].az;
        } else {
          ☃[(☃ + ☃ * ☃)] = ady.D.az;
        }
      }
    }
    return ☃;
  }
}
