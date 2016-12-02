import com.google.common.collect.Lists;
import java.util.List;
import org.apache.logging.log4j.Logger;

class lc$a
{
  private final List<lf> b = Lists.newArrayList();
  private final adg c;
  private short[] d = new short[64];
  private int e;
  private int f;
  private long g;
  
  public lc$a(lc paramlc, int ☃, int ☃)
  {
    c = new adg(☃, ☃);
    ab.c(☃, ☃);
  }
  
  public void a(lf ☃)
  {
    if (b.contains(☃))
    {
      lc.c().debug("Failed to add player. {} already is in chunk {}, {}", new Object[] { ☃, Integer.valueOf(c.a), Integer.valueOf(c.b) });
      return;
    }
    if (b.isEmpty()) {
      g = lc.a(a).K();
    }
    b.add(☃);
    f.add(c);
  }
  
  public void b(lf ☃)
  {
    if (!b.contains(☃)) {
      return;
    }
    amy ☃ = lc.a(a).a(c.a, c.b);
    if (☃.i()) {
      a.a(new go(☃, true, 0));
    }
    b.remove(☃);
    f.remove(c);
    if (b.isEmpty())
    {
      long ☃ = c.a + 2147483647L | c.b + 2147483647L << 32;
      a(☃);
      lc.b(a).d(☃);
      lc.c(a).remove(this);
      if (e > 0) {
        lc.d(a).remove(this);
      }
      a.a().b.b(c.a, c.b);
    }
  }
  
  public void a()
  {
    a(lc.a(a).a(c.a, c.b));
  }
  
  private void a(amy ☃)
  {
    ☃.c(☃.w() + lc.a(a).K() - g);
    
    g = lc.a(a).K();
  }
  
  public void a(int ☃, int ☃, int ☃)
  {
    if (e == 0) {
      lc.d(a).add(this);
    }
    f |= 1 << (☃ >> 4);
    if (e < 64)
    {
      short ☃ = (short)(☃ << 12 | ☃ << 8 | ☃);
      for (int ☃ = 0; ☃ < e; ☃++) {
        if (d[☃] == ☃) {
          return;
        }
      }
      d[(e++)] = ☃;
    }
  }
  
  public void a(ff ☃)
  {
    for (int ☃ = 0; ☃ < b.size(); ☃++)
    {
      lf ☃ = (lf)b.get(☃);
      if (!f.contains(c)) {
        a.a(☃);
      }
    }
  }
  
  public void b()
  {
    if (e == 0) {
      return;
    }
    if (e == 1)
    {
      int ☃ = (d[0] >> 12 & 0xF) + c.a * 16;
      int ☃ = d[0] & 0xFF;
      int ☃ = (d[0] >> 8 & 0xF) + c.b * 16;
      
      cj ☃ = new cj(☃, ☃, ☃);
      a(new fv(lc.a(a), ☃));
      if (lc.a(a).p(☃).c().z()) {
        a(lc.a(a).s(☃));
      }
    }
    else if (e == 64)
    {
      int ☃ = c.a * 16;
      int ☃ = c.b * 16;
      
      a(new go(lc.a(a).a(c.a, c.b), false, f));
      for (int ☃ = 0; ☃ < 16; ☃++) {
        if ((f & 1 << ☃) != 0)
        {
          int ☃ = ☃ << 4;
          List<akw> ☃ = lc.a(a).a(☃, ☃, ☃, ☃ + 16, ☃ + 16, ☃ + 16);
          for (int ☃ = 0; ☃ < ☃.size(); ☃++) {
            a((akw)☃.get(☃));
          }
        }
      }
    }
    else
    {
      a(new fz(e, d, lc.a(a).a(c.a, c.b)));
      for (int ☃ = 0; ☃ < e; ☃++)
      {
        int ☃ = (d[☃] >> 12 & 0xF) + c.a * 16;
        int ☃ = d[☃] & 0xFF;
        int ☃ = (d[☃] >> 8 & 0xF) + c.b * 16;
        
        cj ☃ = new cj(☃, ☃, ☃);
        if (lc.a(a).p(☃).c().z()) {
          a(lc.a(a).s(☃));
        }
      }
    }
    e = 0;
    f = 0;
  }
  
  private void a(akw ☃)
  {
    if (☃ != null)
    {
      ff ☃ = ☃.y_();
      if (☃ != null) {
        a(☃);
      }
    }
  }
}
