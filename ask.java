public class ask
  extends ase
{
  private ase c;
  private ase d;
  
  public ask(long ☃, ase ☃, ase ☃)
  {
    super(☃);
    this.c = ☃;
    this.d = ☃;
  }
  
  public void a(long ☃)
  {
    this.c.a(☃);
    this.d.a(☃);
    super.a(☃);
  }
  
  public int[] a(int ☃, int ☃, int ☃, int ☃)
  {
    int[] ☃ = this.c.a(☃, ☃, ☃, ☃);
    int[] ☃ = this.d.a(☃, ☃, ☃, ☃);
    
    int[] ☃ = asc.a(☃ * ☃);
    for (int ☃ = 0; ☃ < ☃ * ☃; ☃++) {
      if ((☃[☃] == ady.p.az) || (☃[☃] == ady.N.az)) {
        ☃[☃] = ☃[☃];
      } else if (☃[☃] == ady.w.az)
      {
        if (☃[☃] == ady.B.az) {
          ☃[☃] = ady.A.az;
        } else if ((☃[☃] == ady.D.az) || (☃[☃] == ady.E.az)) {
          ☃[☃] = ady.E.az;
        } else {
          ☃[☃] &= 0xFF;
        }
      }
      else {
        ☃[☃] = ☃[☃];
      }
    }
    return ☃;
  }
}
