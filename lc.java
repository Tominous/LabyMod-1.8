import com.google.common.collect.Lists;
import java.util.List;
import net.minecraft.server.MinecraftServer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class lc
{
  private static final Logger a = ;
  private final le b;
  
  class a
  {
    private final List<lf> b = Lists.newArrayList();
    private final adg c;
    private short[] d = new short[64];
    private int e;
    private int f;
    private long g;
    
    public a(int ☃, int ☃)
    {
      c = new adg(☃, ☃);
      a().b.c(☃, ☃);
    }
    
    public void a(lf ☃)
    {
      if (b.contains(☃))
      {
        lc.c().debug("Failed to add player. {} already is in chunk {}, {}", new Object[] { ☃, Integer.valueOf(c.a), Integer.valueOf(c.b) });
        return;
      }
      if (b.isEmpty()) {
        g = lc.a(lc.this).K();
      }
      b.add(☃);
      f.add(c);
    }
    
    public void b(lf ☃)
    {
      if (!b.contains(☃)) {
        return;
      }
      amy ☃ = lc.a(lc.this).a(c.a, c.b);
      if (☃.i()) {
        a.a(new go(☃, true, 0));
      }
      b.remove(☃);
      f.remove(c);
      if (b.isEmpty())
      {
        long ☃ = c.a + 2147483647L | c.b + 2147483647L << 32;
        a(☃);
        lc.b(lc.this).d(☃);
        lc.c(lc.this).remove(this);
        if (e > 0) {
          lc.d(lc.this).remove(this);
        }
        a().b.b(c.a, c.b);
      }
    }
    
    public void a()
    {
      a(lc.a(lc.this).a(c.a, c.b));
    }
    
    private void a(amy ☃)
    {
      ☃.c(☃.w() + lc.a(lc.this).K() - g);
      
      g = lc.a(lc.this).K();
    }
    
    public void a(int ☃, int ☃, int ☃)
    {
      if (e == 0) {
        lc.d(lc.this).add(this);
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
        a(new fv(lc.a(lc.this), ☃));
        if (lc.a(lc.this).p(☃).c().z()) {
          a(lc.a(lc.this).s(☃));
        }
      }
      else if (e == 64)
      {
        int ☃ = c.a * 16;
        int ☃ = c.b * 16;
        
        a(new go(lc.a(lc.this).a(c.a, c.b), false, f));
        for (int ☃ = 0; ☃ < 16; ☃++) {
          if ((f & 1 << ☃) != 0)
          {
            int ☃ = ☃ << 4;
            List<akw> ☃ = lc.a(lc.this).a(☃, ☃, ☃, ☃ + 16, ☃ + 16, ☃ + 16);
            for (int ☃ = 0; ☃ < ☃.size(); ☃++) {
              a((akw)☃.get(☃));
            }
          }
        }
      }
      else
      {
        a(new fz(e, d, lc.a(lc.this).a(c.a, c.b)));
        for (int ☃ = 0; ☃ < e; ☃++)
        {
          int ☃ = (d[☃] >> 12 & 0xF) + c.a * 16;
          int ☃ = d[☃] & 0xFF;
          int ☃ = (d[☃] >> 8 & 0xF) + c.b * 16;
          
          cj ☃ = new cj(☃, ☃, ☃);
          if (lc.a(lc.this).p(☃).c().z()) {
            a(lc.a(lc.this).s(☃));
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
  
  private final List<lf> c = Lists.newArrayList();
  private final nq<lc.a> d = new nq();
  private final List<lc.a> e = Lists.newArrayList();
  private final List<lc.a> f = Lists.newArrayList();
  private int g;
  private long h;
  
  public lc(le ☃)
  {
    b = ☃;
    
    a(☃.r().ap().s());
  }
  
  public le a()
  {
    return b;
  }
  
  public void b()
  {
    long ☃ = b.K();
    if (☃ - h > 8000L)
    {
      h = ☃;
      for (int ☃ = 0; ☃ < f.size(); ☃++)
      {
        lc.a ☃ = (lc.a)f.get(☃);
        ☃.b();
        ☃.a();
      }
    }
    else
    {
      for (int ☃ = 0; ☃ < e.size(); ☃++)
      {
        lc.a ☃ = (lc.a)e.get(☃);
        ☃.b();
      }
    }
    e.clear();
    if (c.isEmpty())
    {
      anm ☃ = b.t;
      if (!☃.e()) {
        b.b.b();
      }
    }
  }
  
  public boolean a(int ☃, int ☃)
  {
    long ☃ = ☃ + 2147483647L | ☃ + 2147483647L << 32;
    return d.a(☃) != null;
  }
  
  private lc.a a(int ☃, int ☃, boolean ☃)
  {
    long ☃ = ☃ + 2147483647L | ☃ + 2147483647L << 32;
    lc.a ☃ = (lc.a)d.a(☃);
    if ((☃ == null) && (☃))
    {
      ☃ = new lc.a(☃, ☃);
      d.a(☃, ☃);
      f.add(☃);
    }
    return ☃;
  }
  
  public void a(cj ☃)
  {
    int ☃ = ☃.n() >> 4;
    int ☃ = ☃.p() >> 4;
    lc.a ☃ = a(☃, ☃, false);
    if (☃ != null) {
      ☃.a(☃.n() & 0xF, ☃.o(), ☃.p() & 0xF);
    }
  }
  
  private final int[][] i = { { 1, 0 }, { 0, 1 }, { -1, 0 }, { 0, -1 } };
  
  public void a(lf ☃)
  {
    int ☃ = (int)s >> 4;
    int ☃ = (int)u >> 4;
    
    d = s;
    e = u;
    for (int ☃ = ☃ - g; ☃ <= ☃ + g; ☃++) {
      for (int ☃ = ☃ - g; ☃ <= ☃ + g; ☃++) {
        a(☃, ☃, true).a(☃);
      }
    }
    c.add(☃);
    b(☃);
  }
  
  public void b(lf ☃)
  {
    List<adg> ☃ = Lists.newArrayList(f);
    int ☃ = 0;
    int ☃ = g;
    int ☃ = (int)s >> 4;
    int ☃ = (int)u >> 4;
    int ☃ = 0;
    int ☃ = 0;
    adg ☃ = lc.a.a(a(☃, ☃, true));
    
    f.clear();
    if (☃.contains(☃)) {
      f.add(☃);
    }
    for (int ☃ = 1; ☃ <= ☃ * 2; ☃++) {
      for (int ☃ = 0; ☃ < 2; ☃++)
      {
        int[] ☃ = i[(☃++ % 4)];
        for (int ☃ = 0; ☃ < ☃; ☃++)
        {
          ☃ += ☃[0];
          ☃ += ☃[1];
          
          ☃ = lc.a.a(a(☃ + ☃, ☃ + ☃, true));
          if (☃.contains(☃)) {
            f.add(☃);
          }
        }
      }
    }
    ☃ %= 4;
    for (int ☃ = 0; ☃ < ☃ * 2; ☃++)
    {
      ☃ += i[☃][0];
      ☃ += i[☃][1];
      
      ☃ = lc.a.a(a(☃ + ☃, ☃ + ☃, true));
      if (☃.contains(☃)) {
        f.add(☃);
      }
    }
  }
  
  public void c(lf ☃)
  {
    int ☃ = (int)d >> 4;
    int ☃ = (int)e >> 4;
    for (int ☃ = ☃ - g; ☃ <= ☃ + g; ☃++) {
      for (int ☃ = ☃ - g; ☃ <= ☃ + g; ☃++)
      {
        lc.a ☃ = a(☃, ☃, false);
        if (☃ != null) {
          ☃.b(☃);
        }
      }
    }
    c.remove(☃);
  }
  
  private boolean a(int ☃, int ☃, int ☃, int ☃, int ☃)
  {
    int ☃ = ☃ - ☃;
    int ☃ = ☃ - ☃;
    if ((☃ < -☃) || (☃ > ☃)) {
      return false;
    }
    if ((☃ < -☃) || (☃ > ☃)) {
      return false;
    }
    return true;
  }
  
  public void d(lf ☃)
  {
    int ☃ = (int)s >> 4;
    int ☃ = (int)u >> 4;
    
    double ☃ = d - s;
    double ☃ = e - u;
    double ☃ = ☃ * ☃ + ☃ * ☃;
    if (☃ < 64.0D) {
      return;
    }
    int ☃ = (int)d >> 4;
    int ☃ = (int)e >> 4;
    int ☃ = g;
    
    int ☃ = ☃ - ☃;
    int ☃ = ☃ - ☃;
    if ((☃ == 0) && (☃ == 0)) {
      return;
    }
    for (int ☃ = ☃ - ☃; ☃ <= ☃ + ☃; ☃++) {
      for (int ☃ = ☃ - ☃; ☃ <= ☃ + ☃; ☃++)
      {
        if (!a(☃, ☃, ☃, ☃, ☃)) {
          a(☃, ☃, true).a(☃);
        }
        if (!a(☃ - ☃, ☃ - ☃, ☃, ☃, ☃))
        {
          lc.a ☃ = a(☃ - ☃, ☃ - ☃, false);
          if (☃ != null) {
            ☃.b(☃);
          }
        }
      }
    }
    b(☃);
    
    d = s;
    e = u;
  }
  
  public boolean a(lf ☃, int ☃, int ☃)
  {
    lc.a ☃ = a(☃, ☃, false);
    
    return (☃ != null) && (lc.a.b(☃).contains(☃)) && (!f.contains(lc.a.a(☃)));
  }
  
  public void a(int ☃)
  {
    ☃ = ns.a(☃, 3, 32);
    if (☃ == g) {
      return;
    }
    int ☃ = ☃ - g;
    
    List<lf> ☃ = Lists.newArrayList(c);
    for (lf ☃ : ☃)
    {
      int ☃ = (int)s >> 4;
      int ☃ = (int)u >> 4;
      if (☃ > 0) {
        for (int ☃ = ☃ - ☃; ☃ <= ☃ + ☃; ☃++) {
          for (int ☃ = ☃ - ☃; ☃ <= ☃ + ☃; ☃++)
          {
            lc.a ☃ = a(☃, ☃, true);
            if (!lc.a.b(☃).contains(☃)) {
              ☃.a(☃);
            }
          }
        }
      } else {
        for (int ☃ = ☃ - g; ☃ <= ☃ + g; ☃++) {
          for (int ☃ = ☃ - g; ☃ <= ☃ + g; ☃++) {
            if (!a(☃, ☃, ☃, ☃, ☃)) {
              a(☃, ☃, true).b(☃);
            }
          }
        }
      }
    }
    g = ☃;
  }
  
  public static int b(int ☃)
  {
    return ☃ * 16 - 16;
  }
}
