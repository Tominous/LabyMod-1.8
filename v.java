import java.util.List;

public class v
  extends i
{
  public String c()
  {
    return "testforblocks";
  }
  
  public int a()
  {
    return 2;
  }
  
  public String c(m ☃)
  {
    return "commands.compare.usage";
  }
  
  public void a(m ☃, String[] ☃)
    throws bz
  {
    if (☃.length < 9) {
      throw new cf("commands.compare.usage", new Object[0]);
    }
    ☃.a(n.a.b, 0);
    
    cj ☃ = a(☃, ☃, 0, false);
    cj ☃ = a(☃, ☃, 3, false);
    cj ☃ = a(☃, ☃, 6, false);
    
    aqe ☃ = new aqe(☃, ☃);
    aqe ☃ = new aqe(☃, ☃.a(☃.b()));
    
    int ☃ = ☃.c() * ☃.d() * ☃.e();
    if (☃ > 524288) {
      throw new bz("commands.compare.tooManyBlocks", new Object[] { Integer.valueOf(☃), Integer.valueOf(524288) });
    }
    if ((b < 0) || (e >= 256) || (b < 0) || (e >= 256)) {
      throw new bz("commands.compare.outOfWorld", new Object[0]);
    }
    adm ☃ = ☃.e();
    if ((!☃.a(☃)) || (!☃.a(☃))) {
      throw new bz("commands.compare.outOfWorld", new Object[0]);
    }
    boolean ☃ = false;
    if ((☃.length > 9) && 
      (☃[9].equals("masked"))) {
      ☃ = true;
    }
    ☃ = 0;
    cj ☃ = new cj(a - a, b - b, c - c);
    cj.a ☃ = new cj.a();
    cj.a ☃ = new cj.a();
    for (int ☃ = c; ☃ <= f; ☃++) {
      for (int ☃ = b; ☃ <= e; ☃++) {
        for (int ☃ = a; ☃ <= d; ☃++)
        {
          ☃.c(☃, ☃, ☃);
          ☃.c(☃ + ☃.n(), ☃ + ☃.o(), ☃ + ☃.p());
          
          boolean ☃ = false;
          alz ☃ = ☃.p(☃);
          if ((!☃) || (☃.c() != afi.a))
          {
            if (☃ == ☃.p(☃))
            {
              akw ☃ = ☃.s(☃);
              akw ☃ = ☃.s(☃);
              if ((☃ != null) && (☃ != null))
              {
                dn ☃ = new dn();
                ☃.b(☃);
                ☃.o("x");
                ☃.o("y");
                ☃.o("z");
                
                dn ☃ = new dn();
                ☃.b(☃);
                ☃.o("x");
                ☃.o("y");
                ☃.o("z");
                if (!☃.equals(☃)) {
                  ☃ = true;
                }
              }
              else if (☃ != null)
              {
                ☃ = true;
              }
            }
            else
            {
              ☃ = true;
            }
            ☃++;
            if (☃) {
              throw new bz("commands.compare.failed", new Object[0]);
            }
          }
        }
      }
    }
    ☃.a(n.a.b, ☃);
    a(☃, this, "commands.compare.success", new Object[] { Integer.valueOf(☃) });
  }
  
  public List<String> a(m ☃, String[] ☃, cj ☃)
  {
    if ((☃.length > 0) && (☃.length <= 3)) {
      return a(☃, 0, ☃);
    }
    if ((☃.length > 3) && (☃.length <= 6)) {
      return a(☃, 3, ☃);
    }
    if ((☃.length > 6) && (☃.length <= 9)) {
      return a(☃, 6, ☃);
    }
    if (☃.length == 10) {
      return a(☃, new String[] { "masked", "all" });
    }
    return null;
  }
}
