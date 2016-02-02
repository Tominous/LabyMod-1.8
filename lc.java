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
      this.c = new adg(☃, ☃);
      lc.this.a().b.c(☃, ☃);
    }
    
    public void a(lf ☃)
    {
      if (this.b.contains(☃))
      {
        lc.c().debug("Failed to add player. {} already is in chunk {}, {}", new Object[] { ☃, Integer.valueOf(this.c.a), Integer.valueOf(this.c.b) });
        return;
      }
      if (this.b.isEmpty()) {
        this.g = lc.a(lc.this).K();
      }
      this.b.add(☃);
      ☃.f.add(this.c);
    }
    
    public void b(lf ☃)
    {
      if (!this.b.contains(☃)) {
        return;
      }
      amy ☃ = lc.a(lc.this).a(this.c.a, this.c.b);
      if (☃.i()) {
        ☃.a.a(new go(☃, true, 0));
      }
      this.b.remove(☃);
      ☃.f.remove(this.c);
      if (this.b.isEmpty())
      {
        long ☃ = this.c.a + 2147483647L | this.c.b + 2147483647L << 32;
        a(☃);
        lc.b(lc.this).d(☃);
        lc.c(lc.this).remove(this);
        if (this.e > 0) {
          lc.d(lc.this).remove(this);
        }
        lc.this.a().b.b(this.c.a, this.c.b);
      }
    }
    
    public void a()
    {
      a(lc.a(lc.this).a(this.c.a, this.c.b));
    }
    
    private void a(amy ☃)
    {
      ☃.c(☃.w() + lc.a(lc.this).K() - this.g);
      
      this.g = lc.a(lc.this).K();
    }
    
    public void a(int ☃, int ☃, int ☃)
    {
      if (this.e == 0) {
        lc.d(lc.this).add(this);
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
        a(new fv(lc.a(lc.this), ☃));
        if (lc.a(lc.this).p(☃).c().z()) {
          a(lc.a(lc.this).s(☃));
        }
      }
      else if (this.e == 64)
      {
        int ☃ = this.c.a * 16;
        int ☃ = this.c.b * 16;
        
        a(new go(lc.a(lc.this).a(this.c.a, this.c.b), false, this.f));
        for (int ☃ = 0; ☃ < 16; ☃++) {
          if ((this.f & 1 << ☃) != 0)
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
        a(new fz(this.e, this.d, lc.a(lc.this).a(this.c.a, this.c.b)));
        for (int ☃ = 0; ☃ < this.e; ☃++)
        {
          int ☃ = (this.d[☃] >> 12 & 0xF) + this.c.a * 16;
          int ☃ = this.d[☃] & 0xFF;
          int ☃ = (this.d[☃] >> 8 & 0xF) + this.c.b * 16;
          
          cj ☃ = new cj(☃, ☃, ☃);
          if (lc.a(lc.this).p(☃).c().z()) {
            a(lc.a(lc.this).s(☃));
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
  
  private final List<lf> c = Lists.newArrayList();
  private final nq<lc.a> d = new nq();
  private final List<lc.a> e = Lists.newArrayList();
  private final List<lc.a> f = Lists.newArrayList();
  private int g;
  private long h;
  
  public lc(le ☃)
  {
    this.b = ☃;
    
    a(☃.r().ap().s());
  }
  
  public le a()
  {
    return this.b;
  }
  
  public void b()
  {
    long ☃ = this.b.K();
    if (☃ - this.h > 8000L)
    {
      this.h = ☃;
      for (int ☃ = 0; ☃ < this.f.size(); ☃++)
      {
        lc.a ☃ = (lc.a)this.f.get(☃);
        ☃.b();
        ☃.a();
      }
    }
    else
    {
      for (int ☃ = 0; ☃ < this.e.size(); ☃++)
      {
        lc.a ☃ = (lc.a)this.e.get(☃);
        ☃.b();
      }
    }
    this.e.clear();
    if (this.c.isEmpty())
    {
      anm ☃ = this.b.t;
      if (!☃.e()) {
        this.b.b.b();
      }
    }
  }
  
  public boolean a(int ☃, int ☃)
  {
    long ☃ = ☃ + 2147483647L | ☃ + 2147483647L << 32;
    return this.d.a(☃) != null;
  }
  
  private lc.a a(int ☃, int ☃, boolean ☃)
  {
    long ☃ = ☃ + 2147483647L | ☃ + 2147483647L << 32;
    lc.a ☃ = (lc.a)this.d.a(☃);
    if ((☃ == null) && (☃))
    {
      ☃ = new lc.a(☃, ☃);
      this.d.a(☃, ☃);
      this.f.add(☃);
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
    int ☃ = (int)☃.s >> 4;
    int ☃ = (int)☃.u >> 4;
    
    ☃.d = ☃.s;
    ☃.e = ☃.u;
    for (int ☃ = ☃ - this.g; ☃ <= ☃ + this.g; ☃++) {
      for (int ☃ = ☃ - this.g; ☃ <= ☃ + this.g; ☃++) {
        a(☃, ☃, true).a(☃);
      }
    }
    this.c.add(☃);
    b(☃);
  }
  
  public void b(lf ☃)
  {
    List<adg> ☃ = Lists.newArrayList(☃.f);
    int ☃ = 0;
    int ☃ = this.g;
    int ☃ = (int)☃.s >> 4;
    int ☃ = (int)☃.u >> 4;
    int ☃ = 0;
    int ☃ = 0;
    adg ☃ = lc.a.a(a(☃, ☃, true));
    
    ☃.f.clear();
    if (☃.contains(☃)) {
      ☃.f.add(☃);
    }
    for (int ☃ = 1; ☃ <= ☃ * 2; ☃++) {
      for (int ☃ = 0; ☃ < 2; ☃++)
      {
        int[] ☃ = this.i[(☃++ % 4)];
        for (int ☃ = 0; ☃ < ☃; ☃++)
        {
          ☃ += ☃[0];
          ☃ += ☃[1];
          
          ☃ = lc.a.a(a(☃ + ☃, ☃ + ☃, true));
          if (☃.contains(☃)) {
            ☃.f.add(☃);
          }
        }
      }
    }
    ☃ %= 4;
    for (int ☃ = 0; ☃ < ☃ * 2; ☃++)
    {
      ☃ += this.i[☃][0];
      ☃ += this.i[☃][1];
      
      ☃ = lc.a.a(a(☃ + ☃, ☃ + ☃, true));
      if (☃.contains(☃)) {
        ☃.f.add(☃);
      }
    }
  }
  
  public void c(lf ☃)
  {
    int ☃ = (int)☃.d >> 4;
    int ☃ = (int)☃.e >> 4;
    for (int ☃ = ☃ - this.g; ☃ <= ☃ + this.g; ☃++) {
      for (int ☃ = ☃ - this.g; ☃ <= ☃ + this.g; ☃++)
      {
        lc.a ☃ = a(☃, ☃, false);
        if (☃ != null) {
          ☃.b(☃);
        }
      }
    }
    this.c.remove(☃);
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
    int ☃ = (int)☃.s >> 4;
    int ☃ = (int)☃.u >> 4;
    
    double ☃ = ☃.d - ☃.s;
    double ☃ = ☃.e - ☃.u;
    double ☃ = ☃ * ☃ + ☃ * ☃;
    if (☃ < 64.0D) {
      return;
    }
    int ☃ = (int)☃.d >> 4;
    int ☃ = (int)☃.e >> 4;
    int ☃ = this.g;
    
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
    
    ☃.d = ☃.s;
    ☃.e = ☃.u;
  }
  
  public boolean a(lf ☃, int ☃, int ☃)
  {
    lc.a ☃ = a(☃, ☃, false);
    
    return (☃ != null) && (lc.a.b(☃).contains(☃)) && (!☃.f.contains(lc.a.a(☃)));
  }
  
  public void a(int ☃)
  {
    ☃ = ns.a(☃, 3, 32);
    if (☃ == this.g) {
      return;
    }
    int ☃ = ☃ - this.g;
    
    List<lf> ☃ = Lists.newArrayList(this.c);
    for (lf ☃ : ☃)
    {
      int ☃ = (int)☃.s >> 4;
      int ☃ = (int)☃.u >> 4;
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
        for (int ☃ = ☃ - this.g; ☃ <= ☃ + this.g; ☃++) {
          for (int ☃ = ☃ - this.g; ☃ <= ☃ + this.g; ☃++) {
            if (!a(☃, ☃, ☃, ☃, ☃)) {
              a(☃, ☃, true).b(☃);
            }
          }
        }
      }
    }
    this.g = ☃;
  }
  
  public static int b(int ☃)
  {
    return ☃ * 16 - 16;
  }
}
