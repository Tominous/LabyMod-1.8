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
    this.c = new adg(☃, ☃);
    paramlc.a().b.c(☃, ☃);
  }
  
  public void a(lf ☃)
  {
    if (this.b.contains(☃))
    {
      lc.c().debug("Failed to add player. {} already is in chunk {}, {}", new Object[] { ☃, Integer.valueOf(this.c.a), Integer.valueOf(this.c.b) });
      return;
    }
    if (this.b.isEmpty()) {
      this.g = lc.a(this.a).K();
    }
    this.b.add(☃);
    ☃.f.add(this.c);
  }
  
  public void b(lf ☃)
  {
    if (!this.b.contains(☃)) {
      return;
    }
    amy ☃ = lc.a(this.a).a(this.c.a, this.c.b);
    if (☃.i()) {
      ☃.a.a(new go(☃, true, 0));
    }
    this.b.remove(☃);
    ☃.f.remove(this.c);
    if (this.b.isEmpty())
    {
      long ☃ = this.c.a + 2147483647L | this.c.b + 2147483647L << 32;
      a(☃);
      lc.b(this.a).d(☃);
      lc.c(this.a).remove(this);
      if (this.e > 0) {
        lc.d(this.a).remove(this);
      }
      this.a.a().b.b(this.c.a, this.c.b);
    }
  }
  
  public void a()
  {
    a(lc.a(this.a).a(this.c.a, this.c.b));
  }
  
  private void a(amy ☃)
  {
    ☃.c(☃.w() + lc.a(this.a).K() - this.g);
    
    this.g = lc.a(this.a).K();
  }
  
  public void a(int ☃, int ☃, int ☃)
  {
    if (this.e == 0) {
      lc.d(this.a).add(this);
    }
    this.f |= 1 << (☃ >> 4);
    if (this.e < 64)
    {
      short ☃ = (short)(☃ << 12 | ☃ << 8 | ☃);
      for (int ☃ = 0; ☃ < this.e; ☃++) {
        if (this.d[☃] == ☃) {
          return;
        }
      }
      this.d[(this.e++)] = ☃;
    }
  }
  
  public void a(ff ☃)
  {
    for (int ☃ = 0; ☃ < this.b.size(); ☃++)
    {
      lf ☃ = (lf)this.b.get(☃);
      if (!☃.f.contains(this.c)) {
        ☃.a.a(☃);
      }
    }
  }
  
  public void b()
  {
    if (this.e == 0) {
      return;
    }
    if (this.e == 1)
    {
      int ☃ = (this.d[0] >> 12 & 0xF) + this.c.a * 16;
      int ☃ = this.d[0] & 0xFF;
      int ☃ = (this.d[0] >> 8 & 0xF) + this.c.b * 16;
      
      cj ☃ = new cj(☃, ☃, ☃);
      a(new fv(lc.a(this.a), ☃));
      if (lc.a(this.a).p(☃).c().z()) {
        a(lc.a(this.a).s(☃));
      }
    }
    else if (this.e == 64)
    {
      int ☃ = this.c.a * 16;
      int ☃ = this.c.b * 16;
      
      a(new go(lc.a(this.a).a(this.c.a, this.c.b), false, this.f));
      for (int ☃ = 0; ☃ < 16; ☃++) {
        if ((this.f & 1 << ☃) != 0)
        {
          int ☃ = ☃ << 4;
          List<akw> ☃ = lc.a(this.a).a(☃, ☃, ☃, ☃ + 16, ☃ + 16, ☃ + 16);
          for (int ☃ = 0; ☃ < ☃.size(); ☃++) {
            a((akw)☃.get(☃));
          }
        }
      }
    }
    else
    {
      a(new fz(this.e, this.d, lc.a(this.a).a(this.c.a, this.c.b)));
      for (int ☃ = 0; ☃ < this.e; ☃++)
      {
        int ☃ = (this.d[☃] >> 12 & 0xF) + this.c.a * 16;
        int ☃ = this.d[☃] & 0xFF;
        int ☃ = (this.d[☃] >> 8 & 0xF) + this.c.b * 16;
        
        cj ☃ = new cj(☃, ☃, ☃);
        if (lc.a(this.a).p(☃).c().z()) {
          a(lc.a(this.a).s(☃));
        }
      }
    }
    this.e = 0;
    this.f = 0;
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
