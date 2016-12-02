import com.google.common.base.Predicate;
import com.google.common.collect.Maps;
import com.google.common.collect.Queues;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentLinkedQueue;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class amy
{
  private static final Logger c = ;
  private final amz[] d = new amz[16];
  private final byte[] e = new byte['Ā'];
  private final int[] f = new int['Ā'];
  private final boolean[] g = new boolean['Ā'];
  private boolean h;
  private final adm i;
  private final int[] j;
  public final int a;
  public final int b;
  private boolean k;
  private final Map<cj, akw> l = Maps.newHashMap();
  private final ne<pk>[] m;
  private boolean n;
  private boolean o;
  private boolean p;
  private boolean q;
  private boolean r;
  private long s;
  private int t;
  private long u;
  private int v = 4096;
  private ConcurrentLinkedQueue<cj> w = Queues.newConcurrentLinkedQueue();
  
  public amy(adm ☃, int ☃, int ☃)
  {
    this.m = ((ne[])new ne[16]);
    this.i = ☃;
    this.a = ☃;
    this.b = ☃;
    this.j = new int['Ā'];
    for (int ☃ = 0; ☃ < this.m.length; ☃++) {
      this.m[☃] = new ne(pk.class);
    }
    Arrays.fill(this.f, 64537);
    Arrays.fill(this.e, (byte)-1);
  }
  
  public amy(adm ☃, ans ☃, int ☃, int ☃)
  {
    this(☃, ☃, ☃);
    
    int ☃ = 256;
    boolean ☃ = !☃.t.o();
    for (int ☃ = 0; ☃ < 16; ☃++) {
      for (int ☃ = 0; ☃ < 16; ☃++) {
        for (int ☃ = 0; ☃ < ☃; ☃++)
        {
          int ☃ = ☃ * ☃ * 16 | ☃ * ☃ | ☃;
          alz ☃ = ☃.a(☃);
          if (☃.c().t() != arm.a)
          {
            int ☃ = ☃ >> 4;
            if (this.d[☃] == null) {
              this.d[☃] = new amz(☃ << 4, ☃);
            }
            this.d[☃].a(☃, ☃ & 0xF, ☃, ☃);
          }
        }
      }
    }
  }
  
  public boolean a(int ☃, int ☃)
  {
    return (☃ == this.a) && (☃ == this.b);
  }
  
  public int f(cj ☃)
  {
    return b(☃.n() & 0xF, ☃.p() & 0xF);
  }
  
  public int b(int ☃, int ☃)
  {
    return this.j[(☃ << 4 | ☃)];
  }
  
  public int g()
  {
    for (int ☃ = this.d.length - 1; ☃ >= 0; ☃--) {
      if (this.d[☃] != null) {
        return this.d[☃].d();
      }
    }
    return 0;
  }
  
  public amz[] h()
  {
    return this.d;
  }
  
  protected void a()
  {
    int ☃ = g();
    this.t = Integer.MAX_VALUE;
    for (int ☃ = 0; ☃ < 16; ☃++) {
      for (int ☃ = 0; ☃ < 16; ☃++)
      {
        this.f[(☃ + (☃ << 4))] = 64537;
        for (int ☃ = ☃ + 16; ☃ > 0; ☃--)
        {
          afh ☃ = f(☃, ☃ - 1, ☃);
          if (☃.p() != 0)
          {
            this.j[(☃ << 4 | ☃)] = ☃;
            if (☃ >= this.t) {
              break;
            }
            this.t = ☃; break;
          }
        }
      }
    }
    this.q = true;
  }
  
  public void b()
  {
    int ☃ = g();
    this.t = Integer.MAX_VALUE;
    for (int ☃ = 0; ☃ < 16; ☃++) {
      for (int ☃ = 0; ☃ < 16; ☃++)
      {
        this.f[(☃ + (☃ << 4))] = 64537;
        for (int ☃ = ☃ + 16; ☃ > 0; ☃--) {
          if (e(☃, ☃ - 1, ☃) != 0)
          {
            this.j[(☃ << 4 | ☃)] = ☃;
            if (☃ >= this.t) {
              break;
            }
            this.t = ☃; break;
          }
        }
        if (!this.i.t.o())
        {
          int ☃ = 15;
          int ☃ = ☃ + 16 - 1;
          do
          {
            int ☃ = e(☃, ☃, ☃);
            if ((☃ == 0) && (☃ != 15)) {
              ☃ = 1;
            }
            ☃ -= ☃;
            if (☃ > 0)
            {
              amz ☃ = this.d[(☃ >> 4)];
              if (☃ != null)
              {
                ☃.a(☃, ☃ & 0xF, ☃, ☃);
                this.i.n(new cj((this.a << 4) + ☃, ☃, (this.b << 4) + ☃));
              }
            }
            ☃--;
          } while ((☃ > 0) && (☃ > 0));
        }
      }
    }
    this.q = true;
  }
  
  private void d(int ☃, int ☃)
  {
    this.g[(☃ + ☃ * 16)] = true;
    this.k = true;
  }
  
  private void h(boolean ☃)
  {
    this.i.B.a("recheckGaps");
    if (this.i.a(new cj(this.a * 16 + 8, 0, this.b * 16 + 8), 16))
    {
      for (int ☃ = 0; ☃ < 16; ☃++) {
        for (int ☃ = 0; ☃ < 16; ☃++) {
          if (this.g[(☃ + ☃ * 16)] != 0)
          {
            this.g[(☃ + ☃ * 16)] = false;
            int ☃ = b(☃, ☃);
            int ☃ = this.a * 16 + ☃;
            int ☃ = this.b * 16 + ☃;
            
            int ☃ = Integer.MAX_VALUE;
            for (cq ☃ : cq.c.a) {
              ☃ = Math.min(☃, this.i.b(☃ + ☃.g(), ☃ + ☃.i()));
            }
            c(☃, ☃, ☃);
            for (cq ☃ : cq.c.a) {
              c(☃ + ☃.g(), ☃ + ☃.i(), ☃);
            }
            if (☃)
            {
              this.i.B.b();
              return;
            }
          }
        }
      }
      this.k = false;
    }
    this.i.B.b();
  }
  
  private void c(int ☃, int ☃, int ☃)
  {
    int ☃ = this.i.m(new cj(☃, 0, ☃)).o();
    if (☃ > ☃) {
      a(☃, ☃, ☃, ☃ + 1);
    } else if (☃ < ☃) {
      a(☃, ☃, ☃, ☃ + 1);
    }
  }
  
  private void a(int ☃, int ☃, int ☃, int ☃)
  {
    if ((☃ > ☃) && 
      (this.i.a(new cj(☃, 0, ☃), 16)))
    {
      for (int ☃ = ☃; ☃ < ☃; ☃++) {
        this.i.c(ads.a, new cj(☃, ☃, ☃));
      }
      this.q = true;
    }
  }
  
  private void d(int ☃, int ☃, int ☃)
  {
    int ☃ = this.j[(☃ << 4 | ☃)] & 0xFF;
    int ☃ = ☃;
    if (☃ > ☃) {
      ☃ = ☃;
    }
    while ((☃ > 0) && (e(☃, ☃ - 1, ☃) == 0)) {
      ☃--;
    }
    if (☃ == ☃) {
      return;
    }
    this.i.a(☃ + this.a * 16, ☃ + this.b * 16, ☃, ☃);
    this.j[(☃ << 4 | ☃)] = ☃;
    
    int ☃ = this.a * 16 + ☃;
    int ☃ = this.b * 16 + ☃;
    if (!this.i.t.o())
    {
      if (☃ < ☃) {
        for (int ☃ = ☃; ☃ < ☃; ☃++)
        {
          amz ☃ = this.d[(☃ >> 4)];
          if (☃ != null)
          {
            ☃.a(☃, ☃ & 0xF, ☃, 15);
            this.i.n(new cj((this.a << 4) + ☃, ☃, (this.b << 4) + ☃));
          }
        }
      } else {
        for (int ☃ = ☃; ☃ < ☃; ☃++)
        {
          amz ☃ = this.d[(☃ >> 4)];
          if (☃ != null)
          {
            ☃.a(☃, ☃ & 0xF, ☃, 0);
            this.i.n(new cj((this.a << 4) + ☃, ☃, (this.b << 4) + ☃));
          }
        }
      }
      int ☃ = 15;
      while ((☃ > 0) && (☃ > 0))
      {
        ☃--;
        int ☃ = e(☃, ☃, ☃);
        if (☃ == 0) {
          ☃ = 1;
        }
        ☃ -= ☃;
        if (☃ < 0) {
          ☃ = 0;
        }
        amz ☃ = this.d[(☃ >> 4)];
        if (☃ != null) {
          ☃.a(☃, ☃ & 0xF, ☃, ☃);
        }
      }
    }
    int ☃ = this.j[(☃ << 4 | ☃)];
    int ☃ = ☃;
    int ☃ = ☃;
    if (☃ < ☃)
    {
      int ☃ = ☃;
      ☃ = ☃;
      ☃ = ☃;
    }
    if (☃ < this.t) {
      this.t = ☃;
    }
    if (!this.i.t.o())
    {
      for (cq ☃ : cq.c.a) {
        a(☃ + ☃.g(), ☃ + ☃.i(), ☃, ☃);
      }
      a(☃, ☃, ☃, ☃);
    }
    this.q = true;
  }
  
  public int b(cj ☃)
  {
    return a(☃).p();
  }
  
  private int e(int ☃, int ☃, int ☃)
  {
    return f(☃, ☃, ☃).p();
  }
  
  private afh f(int ☃, int ☃, int ☃)
  {
    afh ☃ = afi.a;
    if ((☃ >= 0) && (☃ >> 4 < this.d.length))
    {
      amz ☃ = this.d[(☃ >> 4)];
      if (☃ != null) {
        try
        {
          ☃ = ☃.b(☃, ☃ & 0xF, ☃);
        }
        catch (Throwable ☃)
        {
          b ☃ = b.a(☃, "Getting block");
          
          throw new e(☃);
        }
      }
    }
    return ☃;
  }
  
  public afh a(final int ☃, final int ☃, final int ☃)
  {
    try
    {
      return f(☃ & 0xF, ☃, ☃ & 0xF);
    }
    catch (e ☃)
    {
      c ☃ = ☃.a().a("Block being got");
      ☃.a("Location", new Callable()
      {
        public String a()
          throws Exception
        {
          return c.a(new cj(☃ * 16 + ☃, ☃, ☃ * 16 + ☃));
        }
      });
      throw ☃;
    }
  }
  
  public afh a(final cj ☃)
  {
    try
    {
      return f(☃.n() & 0xF, ☃.o(), ☃.p() & 0xF);
    }
    catch (e ☃)
    {
      c ☃ = ☃.a().a("Block being got");
      ☃.a("Location", new Callable()
      {
        public String a()
          throws Exception
        {
          return c.a(☃);
        }
      });
      throw ☃;
    }
  }
  
  public alz g(final cj ☃)
  {
    if (this.i.G() == adr.g)
    {
      alz ☃ = null;
      if (☃.o() == 60) {
        ☃ = afi.cv.Q();
      }
      if (☃.o() == 70) {
        ☃ = anu.b(☃.n(), ☃.p());
      }
      return ☃ == null ? afi.a.Q() : ☃;
    }
    try
    {
      if ((☃.o() >= 0) && (☃.o() >> 4 < this.d.length))
      {
        amz ☃ = this.d[(☃.o() >> 4)];
        if (☃ != null)
        {
          int ☃ = ☃.n() & 0xF;
          int ☃ = ☃.o() & 0xF;
          int ☃ = ☃.p() & 0xF;
          return ☃.a(☃, ☃, ☃);
        }
      }
      return afi.a.Q();
    }
    catch (Throwable ☃)
    {
      b ☃ = b.a(☃, "Getting block state");
      c ☃ = ☃.a("Block being got");
      ☃.a("Location", new Callable()
      {
        public String a()
          throws Exception
        {
          return c.a(☃);
        }
      });
      throw new e(☃);
    }
  }
  
  private int g(int ☃, int ☃, int ☃)
  {
    if (☃ >> 4 >= this.d.length) {
      return 0;
    }
    amz ☃ = this.d[(☃ >> 4)];
    if (☃ != null) {
      return ☃.c(☃, ☃ & 0xF, ☃);
    }
    return 0;
  }
  
  public int c(cj ☃)
  {
    return g(☃.n() & 0xF, ☃.o(), ☃.p() & 0xF);
  }
  
  public alz a(cj ☃, alz ☃)
  {
    int ☃ = ☃.n() & 0xF;
    int ☃ = ☃.o();
    int ☃ = ☃.p() & 0xF;
    
    int ☃ = ☃ << 4 | ☃;
    if (☃ >= this.f[☃] - 1) {
      this.f[☃] = 64537;
    }
    int ☃ = this.j[☃];
    
    alz ☃ = g(☃);
    if (☃ == ☃) {
      return null;
    }
    afh ☃ = ☃.c();
    afh ☃ = ☃.c();
    
    amz ☃ = this.d[(☃ >> 4)];
    boolean ☃ = false;
    if (☃ == null)
    {
      if (☃ == afi.a) {
        return null;
      }
      ☃ = this.d[(☃ >> 4)] = new amz(☃ >> 4 << 4, !this.i.t.o());
      ☃ = ☃ >= ☃;
    }
    ☃.a(☃, ☃ & 0xF, ☃, ☃);
    if (☃ != ☃) {
      if (!this.i.D) {
        ☃.b(this.i, ☃, ☃);
      } else if ((☃ instanceof agq)) {
        this.i.t(☃);
      }
    }
    if (☃.b(☃, ☃ & 0xF, ☃) != ☃) {
      return null;
    }
    if (☃)
    {
      b();
    }
    else
    {
      int ☃ = ☃.p();
      int ☃ = ☃.p();
      if (☃ > 0)
      {
        if (☃ >= ☃) {
          d(☃, ☃ + 1, ☃);
        }
      }
      else if (☃ == ☃ - 1) {
        d(☃, ☃, ☃);
      }
      if (☃ != ☃) {
        if ((☃ < ☃) || (a(ads.a, ☃) > 0) || (a(ads.b, ☃) > 0)) {
          d(☃, ☃);
        }
      }
    }
    if ((☃ instanceof agq))
    {
      akw ☃ = a(☃, amy.a.c);
      if (☃ != null) {
        ☃.E();
      }
    }
    if ((!this.i.D) && (☃ != ☃)) {
      ☃.c(this.i, ☃, ☃);
    }
    if ((☃ instanceof agq))
    {
      akw ☃ = a(☃, amy.a.c);
      if (☃ == null)
      {
        ☃ = ((agq)☃).a(this.i, ☃.c(☃));
        this.i.a(☃, ☃);
      }
      if (☃ != null) {
        ☃.E();
      }
    }
    this.q = true;
    return ☃;
  }
  
  public int a(ads ☃, cj ☃)
  {
    int ☃ = ☃.n() & 0xF;
    int ☃ = ☃.o();
    int ☃ = ☃.p() & 0xF;
    
    amz ☃ = this.d[(☃ >> 4)];
    if (☃ == null)
    {
      if (d(☃)) {
        return ☃.c;
      }
      return 0;
    }
    if (☃ == ads.a)
    {
      if (this.i.t.o()) {
        return 0;
      }
      return ☃.d(☃, ☃ & 0xF, ☃);
    }
    if (☃ == ads.b) {
      return ☃.e(☃, ☃ & 0xF, ☃);
    }
    return ☃.c;
  }
  
  public void a(ads ☃, cj ☃, int ☃)
  {
    int ☃ = ☃.n() & 0xF;
    int ☃ = ☃.o();
    int ☃ = ☃.p() & 0xF;
    
    amz ☃ = this.d[(☃ >> 4)];
    if (☃ == null)
    {
      ☃ = this.d[(☃ >> 4)] = new amz(☃ >> 4 << 4, !this.i.t.o());
      b();
    }
    this.q = true;
    if (☃ == ads.a)
    {
      if (!this.i.t.o()) {
        ☃.a(☃, ☃ & 0xF, ☃, ☃);
      }
    }
    else if (☃ == ads.b) {
      ☃.b(☃, ☃ & 0xF, ☃, ☃);
    }
  }
  
  public int a(cj ☃, int ☃)
  {
    int ☃ = ☃.n() & 0xF;
    int ☃ = ☃.o();
    int ☃ = ☃.p() & 0xF;
    amz ☃ = this.d[(☃ >> 4)];
    if (☃ == null)
    {
      if ((!this.i.t.o()) && (☃ < ads.a.c)) {
        return ads.a.c - ☃;
      }
      return 0;
    }
    int ☃ = this.i.t.o() ? 0 : ☃.d(☃, ☃ & 0xF, ☃);
    ☃ -= ☃;
    int ☃ = ☃.e(☃, ☃ & 0xF, ☃);
    if (☃ > ☃) {
      ☃ = ☃;
    }
    return ☃;
  }
  
  public void a(pk ☃)
  {
    this.r = true;
    
    int ☃ = ns.c(☃.s / 16.0D);
    int ☃ = ns.c(☃.u / 16.0D);
    if ((☃ != this.a) || (☃ != this.b))
    {
      c.warn("Wrong location! (" + ☃ + ", " + ☃ + ") should be (" + this.a + ", " + this.b + "), " + ☃, new Object[] { ☃ });
      
      ☃.J();
    }
    int ☃ = ns.c(☃.t / 16.0D);
    if (☃ < 0) {
      ☃ = 0;
    }
    if (☃ >= this.m.length) {
      ☃ = this.m.length - 1;
    }
    ☃.ad = true;
    ☃.ae = this.a;
    ☃.af = ☃;
    ☃.ag = this.b;
    this.m[☃].add(☃);
  }
  
  public void b(pk ☃)
  {
    a(☃, ☃.af);
  }
  
  public void a(pk ☃, int ☃)
  {
    if (☃ < 0) {
      ☃ = 0;
    }
    if (☃ >= this.m.length) {
      ☃ = this.m.length - 1;
    }
    this.m[☃].remove(☃);
  }
  
  public boolean d(cj ☃)
  {
    int ☃ = ☃.n() & 0xF;
    int ☃ = ☃.o();
    int ☃ = ☃.p() & 0xF;
    return ☃ >= this.j[(☃ << 4 | ☃)];
  }
  
  private akw i(cj ☃)
  {
    afh ☃ = a(☃);
    if (!☃.z()) {
      return null;
    }
    return ((agq)☃).a(this.i, c(☃));
  }
  
  public akw a(cj ☃, amy.a ☃)
  {
    akw ☃ = (akw)this.l.get(☃);
    if (☃ == null)
    {
      if (☃ == amy.a.a)
      {
        ☃ = i(☃);
        this.i.a(☃, ☃);
      }
      else if (☃ == amy.a.b)
      {
        this.w.add(☃);
      }
    }
    else if (☃.x())
    {
      this.l.remove(☃);
      return null;
    }
    return ☃;
  }
  
  public void a(akw ☃)
  {
    a(☃.v(), ☃);
    if (this.h) {
      this.i.a(☃);
    }
  }
  
  public void a(cj ☃, akw ☃)
  {
    ☃.a(this.i);
    ☃.a(☃);
    if (!(a(☃) instanceof agq)) {
      return;
    }
    if (this.l.containsKey(☃)) {
      ((akw)this.l.get(☃)).y();
    }
    ☃.D();
    this.l.put(☃, ☃);
  }
  
  public void e(cj ☃)
  {
    if (this.h)
    {
      akw ☃ = (akw)this.l.remove(☃);
      if (☃ != null) {
        ☃.y();
      }
    }
  }
  
  public void c()
  {
    this.h = true;
    this.i.a(this.l.values());
    for (int ☃ = 0; ☃ < this.m.length; ☃++)
    {
      for (pk ☃ : this.m[☃]) {
        ☃.ah();
      }
      this.i.b(this.m[☃]);
    }
  }
  
  public void d()
  {
    this.h = false;
    for (akw ☃ : this.l.values()) {
      this.i.b(☃);
    }
    for (int ☃ = 0; ☃ < this.m.length; ☃++) {
      this.i.c(this.m[☃]);
    }
  }
  
  public void e()
  {
    this.q = true;
  }
  
  public void a(pk ☃, aug ☃, List<pk> ☃, Predicate<? super pk> ☃)
  {
    int ☃ = ns.c((☃.b - 2.0D) / 16.0D);
    int ☃ = ns.c((☃.e + 2.0D) / 16.0D);
    ☃ = ns.a(☃, 0, this.m.length - 1);
    ☃ = ns.a(☃, 0, this.m.length - 1);
    for (int ☃ = ☃; ☃ <= ☃; ☃++) {
      if (!this.m[☃].isEmpty()) {
        for (pk ☃ : this.m[☃]) {
          if ((☃.aR().b(☃)) && (☃ != ☃))
          {
            if ((☃ == null) || (☃.apply(☃))) {
              ☃.add(☃);
            }
            pk[] ☃ = ☃.aB();
            if (☃ != null) {
              for (int ☃ = 0; ☃ < ☃.length; ☃++)
              {
                ☃ = ☃[☃];
                if ((☃ != ☃) && (☃.aR().b(☃)) && ((☃ == null) || (☃.apply(☃)))) {
                  ☃.add(☃);
                }
              }
            }
          }
        }
      }
    }
  }
  
  public <T extends pk> void a(Class<? extends T> ☃, aug ☃, List<T> ☃, Predicate<? super T> ☃)
  {
    int ☃ = ns.c((☃.b - 2.0D) / 16.0D);
    int ☃ = ns.c((☃.e + 2.0D) / 16.0D);
    ☃ = ns.a(☃, 0, this.m.length - 1);
    ☃ = ns.a(☃, 0, this.m.length - 1);
    for (int ☃ = ☃; ☃ <= ☃; ☃++) {
      for (T ☃ : this.m[☃].c(☃)) {
        if ((☃.aR().b(☃)) && (
          (☃ == null) || (☃.apply(☃)))) {
          ☃.add(☃);
        }
      }
    }
  }
  
  public boolean a(boolean ☃)
  {
    if (☃)
    {
      if (((this.r) && (this.i.K() != this.s)) || (this.q)) {
        return true;
      }
    }
    else if ((this.r) && (this.i.K() >= this.s + 600L)) {
      return true;
    }
    return this.q;
  }
  
  public Random a(long ☃)
  {
    return new Random(this.i.J() + this.a * this.a * 4987142 + this.a * 5947611 + this.b * this.b * 4392871L + this.b * 389711 ^ ☃);
  }
  
  public boolean f()
  {
    return false;
  }
  
  public void a(amv ☃, amv ☃, int ☃, int ☃)
  {
    boolean ☃ = ☃.a(☃, ☃ - 1);
    boolean ☃ = ☃.a(☃ + 1, ☃);
    boolean ☃ = ☃.a(☃, ☃ + 1);
    boolean ☃ = ☃.a(☃ - 1, ☃);
    boolean ☃ = ☃.a(☃ - 1, ☃ - 1);
    boolean ☃ = ☃.a(☃ + 1, ☃ + 1);
    boolean ☃ = ☃.a(☃ - 1, ☃ + 1);
    boolean ☃ = ☃.a(☃ + 1, ☃ - 1);
    if ((☃) && (☃) && (☃)) {
      if (!this.n) {
        ☃.a(☃, ☃, ☃);
      } else {
        ☃.a(☃, this, ☃, ☃);
      }
    }
    if ((☃) && (☃) && (☃))
    {
      amy ☃ = ☃.d(☃ - 1, ☃);
      if (!☃.n) {
        ☃.a(☃, ☃ - 1, ☃);
      } else {
        ☃.a(☃, ☃, ☃ - 1, ☃);
      }
    }
    if ((☃) && (☃) && (☃))
    {
      amy ☃ = ☃.d(☃, ☃ - 1);
      if (!☃.n) {
        ☃.a(☃, ☃, ☃ - 1);
      } else {
        ☃.a(☃, ☃, ☃, ☃ - 1);
      }
    }
    if ((☃) && (☃) && (☃))
    {
      amy ☃ = ☃.d(☃ - 1, ☃ - 1);
      if (!☃.n) {
        ☃.a(☃, ☃ - 1, ☃ - 1);
      } else {
        ☃.a(☃, ☃, ☃ - 1, ☃ - 1);
      }
    }
  }
  
  public cj h(cj ☃)
  {
    int ☃ = ☃.n() & 0xF;
    int ☃ = ☃.p() & 0xF;
    int ☃ = ☃ | ☃ << 4;
    
    cj ☃ = new cj(☃.n(), this.f[☃], ☃.p());
    if (☃.o() == 64537)
    {
      int ☃ = g() + 15;
      ☃ = new cj(☃.n(), ☃, ☃.p());
      
      int ☃ = -1;
      while ((☃.o() > 0) && (☃ == -1))
      {
        afh ☃ = a(☃);
        arm ☃ = ☃.t();
        if ((!☃.c()) && (!☃.d())) {
          ☃ = ☃.b();
        } else {
          ☃ = ☃.o() + 1;
        }
      }
      this.f[☃] = ☃;
    }
    return new cj(☃.n(), this.f[☃], ☃.p());
  }
  
  public void b(boolean ☃)
  {
    if ((this.k) && (!this.i.t.o()) && (!☃)) {
      h(this.i.D);
    }
    this.p = true;
    if ((!this.o) && (this.n)) {
      n();
    }
    while (!this.w.isEmpty())
    {
      cj ☃ = (cj)this.w.poll();
      if ((a(☃, amy.a.c) == null) && (a(☃).z()))
      {
        akw ☃ = i(☃);
        this.i.a(☃, ☃);
        this.i.b(☃, ☃);
      }
    }
  }
  
  public boolean i()
  {
    return (this.p) && (this.n) && (this.o);
  }
  
  public adg j()
  {
    return new adg(this.a, this.b);
  }
  
  public boolean c(int ☃, int ☃)
  {
    if (☃ < 0) {
      ☃ = 0;
    }
    if (☃ >= 256) {
      ☃ = 255;
    }
    for (int ☃ = ☃; ☃ <= ☃; ☃ += 16)
    {
      amz ☃ = this.d[(☃ >> 4)];
      if ((☃ != null) && (!☃.a())) {
        return false;
      }
    }
    return true;
  }
  
  public void a(amz[] ☃)
  {
    if (this.d.length != ☃.length)
    {
      c.warn("Could not set level chunk sections, array length is " + ☃.length + " instead of " + this.d.length);
      return;
    }
    for (int ☃ = 0; ☃ < this.d.length; ☃++) {
      this.d[☃] = ☃[☃];
    }
  }
  
  public void a(byte[] ☃, int ☃, boolean ☃)
  {
    int ☃ = 0;
    
    boolean ☃ = !this.i.t.o();
    for (int ☃ = 0; ☃ < this.d.length; ☃++) {
      if ((☃ & 1 << ☃) != 0)
      {
        if (this.d[☃] == null) {
          this.d[☃] = new amz(☃ << 4, ☃);
        }
        char[] ☃ = this.d[☃].g();
        for (int ☃ = 0; ☃ < ☃.length; ☃++)
        {
          ☃[☃] = ((char)((☃[(☃ + 1)] & 0xFF) << 8 | ☃[☃] & 0xFF));
          ☃ += 2;
        }
      }
      else if ((☃) && (this.d[☃] != null))
      {
        this.d[☃] = null;
      }
    }
    for (int ☃ = 0; ☃ < this.d.length; ☃++) {
      if (((☃ & 1 << ☃) != 0) && (this.d[☃] != null))
      {
        amw ☃ = this.d[☃].h();
        System.arraycopy(☃, ☃, ☃.a(), 0, ☃.a().length);
        ☃ += ☃.a().length;
      }
    }
    if (☃) {
      for (int ☃ = 0; ☃ < this.d.length; ☃++) {
        if (((☃ & 1 << ☃) != 0) && (this.d[☃] != null))
        {
          amw ☃ = this.d[☃].i();
          System.arraycopy(☃, ☃, ☃.a(), 0, ☃.a().length);
          ☃ += ☃.a().length;
        }
      }
    }
    if (☃)
    {
      System.arraycopy(☃, ☃, this.e, 0, this.e.length);
      ☃ += this.e.length;
    }
    for (int ☃ = 0; ☃ < this.d.length; ☃++) {
      if ((this.d[☃] != null) && ((☃ & 1 << ☃) != 0)) {
        this.d[☃].e();
      }
    }
    this.o = true;
    this.n = true;
    a();
    for (akw ☃ : this.l.values()) {
      ☃.E();
    }
  }
  
  public ady a(cj ☃, aec ☃)
  {
    int ☃ = ☃.n() & 0xF;
    int ☃ = ☃.p() & 0xF;
    
    int ☃ = this.e[(☃ << 4 | ☃)] & 0xFF;
    if (☃ == 255)
    {
      ady ☃ = ☃.a(☃, ady.q);
      ☃ = ☃.az;
      this.e[(☃ << 4 | ☃)] = ((byte)(☃ & 0xFF));
    }
    ady ☃ = ady.e(☃);
    if (☃ == null) {
      return ady.q;
    }
    return ☃;
  }
  
  public byte[] k()
  {
    return this.e;
  }
  
  public void a(byte[] ☃)
  {
    if (this.e.length != ☃.length)
    {
      c.warn("Could not set level chunk biomes, array length is " + ☃.length + " instead of " + this.e.length);
      return;
    }
    for (int ☃ = 0; ☃ < this.e.length; ☃++) {
      this.e[☃] = ☃[☃];
    }
  }
  
  public void l()
  {
    this.v = 0;
  }
  
  public void m()
  {
    cj ☃ = new cj(this.a << 4, 0, this.b << 4);
    for (int ☃ = 0; ☃ < 8; ☃++)
    {
      if (this.v >= 4096) {
        return;
      }
      int ☃ = this.v % 16;
      int ☃ = this.v / 16 % 16;
      int ☃ = this.v / 256;
      this.v += 1;
      for (int ☃ = 0; ☃ < 16; ☃++)
      {
        cj ☃ = ☃.a(☃, (☃ << 4) + ☃, ☃);
        boolean ☃ = (☃ == 0) || (☃ == 15) || (☃ == 0) || (☃ == 15) || (☃ == 0) || (☃ == 15);
        if (((this.d[☃] == null) && (☃)) || ((this.d[☃] != null) && (this.d[☃].b(☃, ☃, ☃).t() == arm.a)))
        {
          for (cq ☃ : cq.values())
          {
            cj ☃ = ☃.a(☃);
            if (this.i.p(☃).c().r() > 0) {
              this.i.x(☃);
            }
          }
          this.i.x(☃);
        }
      }
    }
  }
  
  public void n()
  {
    this.n = true;
    this.o = true;
    
    cj ☃ = new cj(this.a << 4, 0, this.b << 4);
    if (!this.i.t.o()) {
      if (this.i.a(☃.a(-1, 0, -1), ☃.a(16, this.i.F(), 16)))
      {
        for (int ☃ = 0; ☃ < 16; ☃++) {
          for (int ☃ = 0; ☃ < 16; ☃++) {
            if (!e(☃, ☃))
            {
              this.o = false;
              break label121;
            }
          }
        }
        label121:
        if (this.o)
        {
          for (cq ☃ : cq.c.a)
          {
            int ☃ = ☃.c() == cq.b.a ? 16 : 1;
            this.i.f(☃.a(☃, ☃)).a(☃.d());
          }
          y();
        }
      }
      else
      {
        this.o = false;
      }
    }
  }
  
  private void y()
  {
    for (int ☃ = 0; ☃ < this.g.length; ☃++) {
      this.g[☃] = true;
    }
    h(false);
  }
  
  private void a(cq ☃)
  {
    if (!this.n) {
      return;
    }
    if (☃ == cq.f) {
      for (int ☃ = 0; ☃ < 16; ☃++) {
        e(15, ☃);
      }
    } else if (☃ == cq.e) {
      for (int ☃ = 0; ☃ < 16; ☃++) {
        e(0, ☃);
      }
    } else if (☃ == cq.d) {
      for (int ☃ = 0; ☃ < 16; ☃++) {
        e(☃, 15);
      }
    } else if (☃ == cq.c) {
      for (int ☃ = 0; ☃ < 16; ☃++) {
        e(☃, 0);
      }
    }
  }
  
  private boolean e(int ☃, int ☃)
  {
    int ☃ = g();
    boolean ☃ = false;
    boolean ☃ = false;
    cj.a ☃ = new cj.a((this.a << 4) + ☃, 0, (this.b << 4) + ☃);
    for (int ☃ = ☃ + 16 - 1; (☃ > this.i.F()) || ((☃ > 0) && (!☃)); ☃--)
    {
      ☃.c(☃.n(), ☃, ☃.p());
      int ☃ = b(☃);
      if ((☃ == 255) && (☃.o() < this.i.F())) {
        ☃ = true;
      }
      if ((!☃) && (☃ > 0)) {
        ☃ = true;
      } else if ((☃) && (☃ == 0) && 
        (!this.i.x(☃))) {
        return false;
      }
    }
    for (int ☃ = ☃.o(); ☃ > 0; ☃--)
    {
      ☃.c(☃.n(), ☃, ☃.p());
      if (a(☃).r() > 0) {
        this.i.x(☃);
      }
    }
    return true;
  }
  
  public boolean o()
  {
    return this.h;
  }
  
  public void c(boolean ☃)
  {
    this.h = ☃;
  }
  
  public adm p()
  {
    return this.i;
  }
  
  public int[] q()
  {
    return this.j;
  }
  
  public void a(int[] ☃)
  {
    if (this.j.length != ☃.length)
    {
      c.warn("Could not set level chunk heightmap, array length is " + ☃.length + " instead of " + this.j.length);
      return;
    }
    for (int ☃ = 0; ☃ < this.j.length; ☃++) {
      this.j[☃] = ☃[☃];
    }
  }
  
  public Map<cj, akw> r()
  {
    return this.l;
  }
  
  public ne<pk>[] s()
  {
    return this.m;
  }
  
  public boolean t()
  {
    return this.n;
  }
  
  public void d(boolean ☃)
  {
    this.n = ☃;
  }
  
  public boolean u()
  {
    return this.o;
  }
  
  public void e(boolean ☃)
  {
    this.o = ☃;
  }
  
  public void f(boolean ☃)
  {
    this.q = ☃;
  }
  
  public void g(boolean ☃)
  {
    this.r = ☃;
  }
  
  public void b(long ☃)
  {
    this.s = ☃;
  }
  
  public int v()
  {
    return this.t;
  }
  
  public long w()
  {
    return this.u;
  }
  
  public void c(long ☃)
  {
    this.u = ☃;
  }
  
  public static enum a
  {
    private a() {}
  }
}
