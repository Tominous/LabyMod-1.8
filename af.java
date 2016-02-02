import com.google.common.collect.Lists;
import java.util.List;

public class af
  extends i
{
  public String c()
  {
    return "fill";
  }
  
  public int a()
  {
    return 2;
  }
  
  public String c(m ☃)
  {
    return "commands.fill.usage";
  }
  
  public void a(m ☃, String[] ☃)
    throws bz
  {
    if (☃.length < 7) {
      throw new cf("commands.fill.usage", new Object[0]);
    }
    ☃.a(n.a.b, 0);
    
    cj ☃ = a(☃, ☃, 0, false);
    cj ☃ = a(☃, ☃, 3, false);
    afh ☃ = i.g(☃, ☃[6]);
    
    int ☃ = 0;
    if (☃.length >= 8) {
      ☃ = a(☃[7], 0, 15);
    }
    cj ☃ = new cj(Math.min(☃.n(), ☃.n()), Math.min(☃.o(), ☃.o()), Math.min(☃.p(), ☃.p()));
    cj ☃ = new cj(Math.max(☃.n(), ☃.n()), Math.max(☃.o(), ☃.o()), Math.max(☃.p(), ☃.p()));
    
    int ☃ = (☃.n() - ☃.n() + 1) * (☃.o() - ☃.o() + 1) * (☃.p() - ☃.p() + 1);
    if (☃ > 32768) {
      throw new bz("commands.fill.tooManyBlocks", new Object[] { Integer.valueOf(☃), Integer.valueOf(32768) });
    }
    if ((☃.o() < 0) || (☃.o() >= 256)) {
      throw new bz("commands.fill.outOfWorld", new Object[0]);
    }
    adm ☃ = ☃.e();
    for (int ☃ = ☃.p(); ☃ < ☃.p() + 16; ☃ += 16) {
      for (int ☃ = ☃.n(); ☃ < ☃.n() + 16; ☃ += 16) {
        if (!☃.e(new cj(☃, ☃.o() - ☃.o(), ☃))) {
          throw new bz("commands.fill.outOfWorld", new Object[0]);
        }
      }
    }
    dn ☃ = new dn();
    boolean ☃ = false;
    if ((☃.length >= 10) && (☃.z()))
    {
      String ☃ = a(☃, ☃, 9).c();
      try
      {
        ☃ = ed.a(☃);
        ☃ = true;
      }
      catch (ec ☃)
      {
        throw new bz("commands.fill.tagError", new Object[] { ☃.getMessage() });
      }
    }
    List<cj> ☃ = Lists.newArrayList();
    
    ☃ = 0;
    for (int ☃ = ☃.p(); ☃ <= ☃.p(); ☃++) {
      for (int ☃ = ☃.o(); ☃ <= ☃.o(); ☃++) {
        for (int ☃ = ☃.n(); ☃ <= ☃.n(); ☃++)
        {
          cj ☃ = new cj(☃, ☃, ☃);
          if (☃.length >= 9) {
            if ((☃[8].equals("outline")) || (☃[8].equals("hollow")))
            {
              if ((☃ != ☃.n()) && (☃ != ☃.n()) && (☃ != ☃.o()) && (☃ != ☃.o()) && (☃ != ☃.p()) && (☃ != ☃.p()))
              {
                if (!☃[8].equals("hollow")) {
                  continue;
                }
                ☃.a(☃, afi.a.Q(), 2);
                ☃.add(☃); continue;
              }
            }
            else if (☃[8].equals("destroy")) {
              ☃.b(☃, true);
            } else if (☃[8].equals("keep"))
            {
              if (!☃.d(☃)) {
                continue;
              }
            }
            else if ((☃[8].equals("replace")) && (!☃.z())) {
              if (☃.length > 9)
              {
                afh ☃ = i.g(☃, ☃[9]);
                if (☃.p(☃).c() != ☃) {}
              }
              else if (☃.length > 10)
              {
                int ☃ = i.a(☃[10]);
                alz ☃ = ☃.p(☃);
                if (☃.c().c(☃) != ☃) {
                  continue;
                }
              }
            }
          }
          akw ☃ = ☃.s(☃);
          if (☃ != null)
          {
            if ((☃ instanceof og)) {
              ((og)☃).l();
            }
            ☃.a(☃, afi.cv.Q(), ☃ == afi.cv ? 2 : 4);
          }
          alz ☃ = ☃.a(☃);
          if (☃.a(☃, ☃, 2))
          {
            ☃.add(☃);
            ☃++;
            if (☃)
            {
              akw ☃ = ☃.s(☃);
              if (☃ != null)
              {
                ☃.a("x", ☃.n());
                ☃.a("y", ☃.o());
                ☃.a("z", ☃.p());
                
                ☃.a(☃);
              }
            }
          }
        }
      }
    }
    for (cj ☃ : ☃)
    {
      afh ☃ = ☃.p(☃).c();
      ☃.b(☃, ☃);
    }
    if (☃ <= 0) {
      throw new bz("commands.fill.failed", new Object[0]);
    }
    ☃.a(n.a.b, ☃);
    a(☃, this, "commands.fill.success", new Object[] { Integer.valueOf(☃) });
  }
  
  public List<String> a(m ☃, String[] ☃, cj ☃)
  {
    if ((☃.length > 0) && (☃.length <= 3)) {
      return a(☃, 0, ☃);
    }
    if ((☃.length > 3) && (☃.length <= 6)) {
      return a(☃, 3, ☃);
    }
    if (☃.length == 7) {
      return a(☃, afh.c.c());
    }
    if (☃.length == 9) {
      return a(☃, new String[] { "replace", "destroy", "keep", "hollow", "outline" });
    }
    if ((☃.length == 10) && ("replace".equals(☃[8]))) {
      return a(☃, afh.c.c());
    }
    return null;
  }
}
