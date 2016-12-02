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
    m = ((ne[])new ne[16]);
    i = ☃;
    a = ☃;
    b = ☃;
    j = new int['Ā'];
    for (int ☃ = 0; ☃ < m.length; ☃++) {
      m[☃] = new ne(pk.class);
    }
    Arrays.fill(f, 64537);
    Arrays.fill(e, (byte)-1);
  }
  
  public amy(adm ☃, ans ☃, int ☃, int ☃)
  {
    this(☃, ☃, ☃);
    
    int ☃ = 256;
    boolean ☃ = !t.o();
    for (int ☃ = 0; ☃ < 16; ☃++) {
      for (int ☃ = 0; ☃ < 16; ☃++) {
        for (int ☃ = 0; ☃ < ☃; ☃++)
        {
          int ☃ = ☃ * ☃ * 16 | ☃ * ☃ | ☃;
          alz ☃ = ☃.a(☃);
          if (☃.c().t() != arm.a)
          {
            int ☃ = ☃ >> 4;
            if (d[☃] == null) {
              d[☃] = new amz(☃ << 4, ☃);
            }
            d[☃].a(☃, ☃ & 0xF, ☃, ☃);
          }
        }
      }
    }
  }
  
  public boolean a(int ☃, int ☃)
  {
    return (☃ == a) && (☃ == b);
  }
  
  public int f(cj ☃)
  {
    return b(☃.n() & 0xF, ☃.p() & 0xF);
  }
  
  public int b(int ☃, int ☃)
  {
    return j[(☃ << 4 | ☃)];
  }
  
  public int g()
  {
    for (int ☃ = d.length - 1; ☃ >= 0; ☃--) {
      if (d[☃] != null) {
        return d[☃].d();
      }
    }
    return 0;
  }
  
  public amz[] h()
  {
    return d;
  }
  
  protected void a()
  {
    int ☃ = g();
    t = Integer.MAX_VALUE;
    for (int ☃ = 0; ☃ < 16; ☃++) {
      for (int ☃ = 0; ☃ < 16; ☃++)
      {
        f[(☃ + (☃ << 4))] = 64537;
        for (int ☃ = ☃ + 16; ☃ > 0; ☃--)
        {
          afh ☃ = f(☃, ☃ - 1, ☃);
          if (☃.p() != 0)
          {
            j[(☃ << 4 | ☃)] = ☃;
            if (☃ >= t) {
              break;
            }
            t = ☃; break;
          }
        }
      }
    }
    q = true;
  }
  
  public void b()
  {
    int ☃ = g();
    t = Integer.MAX_VALUE;
    for (int ☃ = 0; ☃ < 16; ☃++) {
      for (int ☃ = 0; ☃ < 16; ☃++)
      {
        f[(☃ + (☃ << 4))] = 64537;
        for (int ☃ = ☃ + 16; ☃ > 0; ☃--) {
          if (e(☃, ☃ - 1, ☃) != 0)
          {
            j[(☃ << 4 | ☃)] = ☃;
            if (☃ >= t) {
              break;
            }
            t = ☃; break;
          }
        }
        if (!i.t.o())
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
              amz ☃ = d[(☃ >> 4)];
              if (☃ != null)
              {
                ☃.a(☃, ☃ & 0xF, ☃, ☃);
                i.n(new cj((a << 4) + ☃, ☃, (b << 4) + ☃));
              }
            }
            ☃--;
          } while ((☃ > 0) && (☃ > 0));
        }
      }
    }
    q = true;
  }
  
  private void d(int ☃, int ☃)
  {
    g[(☃ + ☃ * 16)] = true;
    k = true;
  }
  
  private void h(boolean ☃)
  {
    i.B.a("recheckGaps");
    if (i.a(new cj(a * 16 + 8, 0, b * 16 + 8), 16))
    {
      for (int ☃ = 0; ☃ < 16; ☃++) {
        for (int ☃ = 0; ☃ < 16; ☃++) {
          if (g[(☃ + ☃ * 16)] != 0)
          {
            g[(☃ + ☃ * 16)] = false;
            int ☃ = b(☃, ☃);
            int ☃ = a * 16 + ☃;
            int ☃ = b * 16 + ☃;
            
            int ☃ = Integer.MAX_VALUE;
            for (cq ☃ : cq.c.a) {
              ☃ = Math.min(☃, i.b(☃ + ☃.g(), ☃ + ☃.i()));
            }
            c(☃, ☃, ☃);
            for (cq ☃ : cq.c.a) {
              c(☃ + ☃.g(), ☃ + ☃.i(), ☃);
            }
            if (☃)
            {
              i.B.b();
              return;
            }
          }
        }
      }
      k = false;
    }
    i.B.b();
  }
  
  private void c(int ☃, int ☃, int ☃)
  {
    int ☃ = i.m(new cj(☃, 0, ☃)).o();
    if (☃ > ☃) {
      a(☃, ☃, ☃, ☃ + 1);
    } else if (☃ < ☃) {
      a(☃, ☃, ☃, ☃ + 1);
    }
  }
  
  private void a(int ☃, int ☃, int ☃, int ☃)
  {
    if ((☃ > ☃) && 
      (i.a(new cj(☃, 0, ☃), 16)))
    {
      for (int ☃ = ☃; ☃ < ☃; ☃++) {
        i.c(ads.a, new cj(☃, ☃, ☃));
      }
      q = true;
    }
  }
  
  private void d(int ☃, int ☃, int ☃)
  {
    int ☃ = j[(☃ << 4 | ☃)] & 0xFF;
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
    i.a(☃ + a * 16, ☃ + b * 16, ☃, ☃);
    j[(☃ << 4 | ☃)] = ☃;
    
    int ☃ = a * 16 + ☃;
    int ☃ = b * 16 + ☃;
    if (!i.t.o())
    {
      if (☃ < ☃) {
        for (int ☃ = ☃; ☃ < ☃; ☃++)
        {
          amz ☃ = d[(☃ >> 4)];
          if (☃ != null)
          {
            ☃.a(☃, ☃ & 0xF, ☃, 15);
            i.n(new cj((a << 4) + ☃, ☃, (b << 4) + ☃));
          }
        }
      } else {
        for (int ☃ = ☃; ☃ < ☃; ☃++)
        {
          amz ☃ = d[(☃ >> 4)];
          if (☃ != null)
          {
            ☃.a(☃, ☃ & 0xF, ☃, 0);
            i.n(new cj((a << 4) + ☃, ☃, (b << 4) + ☃));
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
        amz ☃ = d[(☃ >> 4)];
        if (☃ != null) {
          ☃.a(☃, ☃ & 0xF, ☃, ☃);
        }
      }
    }
    int ☃ = j[(☃ << 4 | ☃)];
    int ☃ = ☃;
    int ☃ = ☃;
    if (☃ < ☃)
    {
      int ☃ = ☃;
      ☃ = ☃;
      ☃ = ☃;
    }
    if (☃ < t) {
      t = ☃;
    }
    if (!i.t.o())
    {
      for (cq ☃ : cq.c.a) {
        a(☃ + ☃.g(), ☃ + ☃.i(), ☃, ☃);
      }
      a(☃, ☃, ☃, ☃);
    }
    q = true;
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
    if ((☃ >= 0) && (☃ >> 4 < d.length))
    {
      amz ☃ = d[(☃ >> 4)];
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
    if (i.G() == adr.g)
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
      if ((☃.o() >= 0) && (☃.o() >> 4 < d.length))
      {
        amz ☃ = d[(☃.o() >> 4)];
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
    if (☃ >> 4 >= d.length) {
      return 0;
    }
    amz ☃ = d[(☃ >> 4)];
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
    if (☃ >= f[☃] - 1) {
      f[☃] = 64537;
    }
    int ☃ = j[☃];
    
    alz ☃ = g(☃);
    if (☃ == ☃) {
      return null;
    }
    afh ☃ = ☃.c();
    afh ☃ = ☃.c();
    
    amz ☃ = d[(☃ >> 4)];
    boolean ☃ = false;
    if (☃ == null)
    {
      if (☃ == afi.a) {
        return null;
      }
      ☃ = d[(☃ >> 4)] = new amz(☃ >> 4 << 4, !i.t.o());
      ☃ = ☃ >= ☃;
    }
    ☃.a(☃, ☃ & 0xF, ☃, ☃);
    if (☃ != ☃) {
      if (!i.D) {
        ☃.b(i, ☃, ☃);
      } else if ((☃ instanceof agq)) {
        i.t(☃);
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
    if ((!i.D) && (☃ != ☃)) {
      ☃.c(i, ☃, ☃);
    }
    if ((☃ instanceof agq))
    {
      akw ☃ = a(☃, amy.a.c);
      if (☃ == null)
      {
        ☃ = ((agq)☃).a(i, ☃.c(☃));
        i.a(☃, ☃);
      }
      if (☃ != null) {
        ☃.E();
      }
    }
    q = true;
    return ☃;
  }
  
  public int a(ads ☃, cj ☃)
  {
    int ☃ = ☃.n() & 0xF;
    int ☃ = ☃.o();
    int ☃ = ☃.p() & 0xF;
    
    amz ☃ = d[(☃ >> 4)];
    if (☃ == null)
    {
      if (d(☃)) {
        return c;
      }
      return 0;
    }
    if (☃ == ads.a)
    {
      if (i.t.o()) {
        return 0;
      }
      return ☃.d(☃, ☃ & 0xF, ☃);
    }
    if (☃ == ads.b) {
      return ☃.e(☃, ☃ & 0xF, ☃);
    }
    return c;
  }
  
  public void a(ads ☃, cj ☃, int ☃)
  {
    int ☃ = ☃.n() & 0xF;
    int ☃ = ☃.o();
    int ☃ = ☃.p() & 0xF;
    
    amz ☃ = d[(☃ >> 4)];
    if (☃ == null)
    {
      ☃ = d[(☃ >> 4)] = new amz(☃ >> 4 << 4, !i.t.o());
      b();
    }
    q = true;
    if (☃ == ads.a)
    {
      if (!i.t.o()) {
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
    amz ☃ = d[(☃ >> 4)];
    if (☃ == null)
    {
      if ((!i.t.o()) && (☃ < ac)) {
        return ac - ☃;
      }
      return 0;
    }
    int ☃ = i.t.o() ? 0 : ☃.d(☃, ☃ & 0xF, ☃);
    ☃ -= ☃;
    int ☃ = ☃.e(☃, ☃ & 0xF, ☃);
    if (☃ > ☃) {
      ☃ = ☃;
    }
    return ☃;
  }
  
  public void a(pk ☃)
  {
    r = true;
    
    int ☃ = ns.c(s / 16.0D);
    int ☃ = ns.c(u / 16.0D);
    if ((☃ != a) || (☃ != b))
    {
      c.warn("Wrong location! (" + ☃ + ", " + ☃ + ") should be (" + a + ", " + b + "), " + ☃, new Object[] { ☃ });
      
      ☃.J();
    }
    int ☃ = ns.c(t / 16.0D);
    if (☃ < 0) {
      ☃ = 0;
    }
    if (☃ >= m.length) {
      ☃ = m.length - 1;
    }
    ad = true;
    ae = a;
    af = ☃;
    ag = b;
    m[☃].add(☃);
  }
  
  public void b(pk ☃)
  {
    a(☃, af);
  }
  
  public void a(pk ☃, int ☃)
  {
    if (☃ < 0) {
      ☃ = 0;
    }
    if (☃ >= m.length) {
      ☃ = m.length - 1;
    }
    m[☃].remove(☃);
  }
  
  public boolean d(cj ☃)
  {
    int ☃ = ☃.n() & 0xF;
    int ☃ = ☃.o();
    int ☃ = ☃.p() & 0xF;
    return ☃ >= j[(☃ << 4 | ☃)];
  }
  
  private akw i(cj ☃)
  {
    afh ☃ = a(☃);
    if (!☃.z()) {
      return null;
    }
    return ((agq)☃).a(i, c(☃));
  }
  
  public akw a(cj ☃, amy.a ☃)
  {
    akw ☃ = (akw)l.get(☃);
    if (☃ == null)
    {
      if (☃ == amy.a.a)
      {
        ☃ = i(☃);
        i.a(☃, ☃);
      }
      else if (☃ == amy.a.b)
      {
        w.add(☃);
      }
    }
    else if (☃.x())
    {
      l.remove(☃);
      return null;
    }
    return ☃;
  }
  
  public void a(akw ☃)
  {
    a(☃.v(), ☃);
    if (h) {
      i.a(☃);
    }
  }
  
  public void a(cj ☃, akw ☃)
  {
    ☃.a(i);
    ☃.a(☃);
    if (!(a(☃) instanceof agq)) {
      return;
    }
    if (l.containsKey(☃)) {
      ((akw)l.get(☃)).y();
    }
    ☃.D();
    l.put(☃, ☃);
  }
  
  public void e(cj ☃)
  {
    if (h)
    {
      akw ☃ = (akw)l.remove(☃);
      if (☃ != null) {
        ☃.y();
      }
    }
  }
  
  public void c()
  {
    h = true;
    i.a(l.values());
    for (int ☃ = 0; ☃ < m.length; ☃++)
    {
      for (pk ☃ : m[☃]) {
        ☃.ah();
      }
      i.b(m[☃]);
    }
  }
  
  public void d()
  {
    h = false;
    for (akw ☃ : l.values()) {
      i.b(☃);
    }
    for (int ☃ = 0; ☃ < m.length; ☃++) {
      i.c(m[☃]);
    }
  }
  
  public void e()
  {
    q = true;
  }
  
  public void a(pk ☃, aug ☃, List<pk> ☃, Predicate<? super pk> ☃)
  {
    int ☃ = ns.c((b - 2.0D) / 16.0D);
    int ☃ = ns.c((e + 2.0D) / 16.0D);
    ☃ = ns.a(☃, 0, m.length - 1);
    ☃ = ns.a(☃, 0, m.length - 1);
    for (int ☃ = ☃; ☃ <= ☃; ☃++) {
      if (!m[☃].isEmpty()) {
        for (pk ☃ : m[☃]) {
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
    int ☃ = ns.c((b - 2.0D) / 16.0D);
    int ☃ = ns.c((e + 2.0D) / 16.0D);
    ☃ = ns.a(☃, 0, m.length - 1);
    ☃ = ns.a(☃, 0, m.length - 1);
    for (int ☃ = ☃; ☃ <= ☃; ☃++) {
      for (T ☃ : m[☃].c(☃)) {
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
      if (((r) && (i.K() != s)) || (q)) {
        return true;
      }
    }
    else if ((r) && (i.K() >= s + 600L)) {
      return true;
    }
    return q;
  }
  
  public Random a(long ☃)
  {
    return new Random(i.J() + a * a * 4987142 + a * 5947611 + b * b * 4392871L + b * 389711 ^ ☃);
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
      if (!n) {
        ☃.a(☃, ☃, ☃);
      } else {
        ☃.a(☃, this, ☃, ☃);
      }
    }
    if ((☃) && (☃) && (☃))
    {
      amy ☃ = ☃.d(☃ - 1, ☃);
      if (!n) {
        ☃.a(☃, ☃ - 1, ☃);
      } else {
        ☃.a(☃, ☃, ☃ - 1, ☃);
      }
    }
    if ((☃) && (☃) && (☃))
    {
      amy ☃ = ☃.d(☃, ☃ - 1);
      if (!n) {
        ☃.a(☃, ☃, ☃ - 1);
      } else {
        ☃.a(☃, ☃, ☃, ☃ - 1);
      }
    }
    if ((☃) && (☃) && (☃))
    {
      amy ☃ = ☃.d(☃ - 1, ☃ - 1);
      if (!n) {
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
    
    cj ☃ = new cj(☃.n(), f[☃], ☃.p());
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
      f[☃] = ☃;
    }
    return new cj(☃.n(), f[☃], ☃.p());
  }
  
  public void b(boolean ☃)
  {
    if ((k) && (!i.t.o()) && (!☃)) {
      h(i.D);
    }
    p = true;
    if ((!o) && (n)) {
      n();
    }
    while (!w.isEmpty())
    {
      cj ☃ = (cj)w.poll();
      if ((a(☃, amy.a.c) == null) && (a(☃).z()))
      {
        akw ☃ = i(☃);
        i.a(☃, ☃);
        i.b(☃, ☃);
      }
    }
  }
  
  public boolean i()
  {
    return (p) && (n) && (o);
  }
  
  public adg j()
  {
    return new adg(a, b);
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
      amz ☃ = d[(☃ >> 4)];
      if ((☃ != null) && (!☃.a())) {
        return false;
      }
    }
    return true;
  }
  
  public void a(amz[] ☃)
  {
    if (d.length != ☃.length)
    {
      c.warn("Could not set level chunk sections, array length is " + ☃.length + " instead of " + d.length);
      return;
    }
    for (int ☃ = 0; ☃ < d.length; ☃++) {
      d[☃] = ☃[☃];
    }
  }
  
  public void a(byte[] ☃, int ☃, boolean ☃)
  {
    int ☃ = 0;
    
    boolean ☃ = !i.t.o();
    for (int ☃ = 0; ☃ < d.length; ☃++) {
      if ((☃ & 1 << ☃) != 0)
      {
        if (d[☃] == null) {
          d[☃] = new amz(☃ << 4, ☃);
        }
        char[] ☃ = d[☃].g();
        for (int ☃ = 0; ☃ < ☃.length; ☃++)
        {
          ☃[☃] = ((char)((☃[(☃ + 1)] & 0xFF) << 8 | ☃[☃] & 0xFF));
          ☃ += 2;
        }
      }
      else if ((☃) && (d[☃] != null))
      {
        d[☃] = null;
      }
    }
    for (int ☃ = 0; ☃ < d.length; ☃++) {
      if (((☃ & 1 << ☃) != 0) && (d[☃] != null))
      {
        amw ☃ = d[☃].h();
        System.arraycopy(☃, ☃, ☃.a(), 0, ☃.a().length);
        ☃ += ☃.a().length;
      }
    }
    if (☃) {
      for (int ☃ = 0; ☃ < d.length; ☃++) {
        if (((☃ & 1 << ☃) != 0) && (d[☃] != null))
        {
          amw ☃ = d[☃].i();
          System.arraycopy(☃, ☃, ☃.a(), 0, ☃.a().length);
          ☃ += ☃.a().length;
        }
      }
    }
    if (☃)
    {
      System.arraycopy(☃, ☃, e, 0, e.length);
      ☃ += e.length;
    }
    for (int ☃ = 0; ☃ < d.length; ☃++) {
      if ((d[☃] != null) && ((☃ & 1 << ☃) != 0)) {
        d[☃].e();
      }
    }
    o = true;
    n = true;
    a();
    for (akw ☃ : l.values()) {
      ☃.E();
    }
  }
  
  public ady a(cj ☃, aec ☃)
  {
    int ☃ = ☃.n() & 0xF;
    int ☃ = ☃.p() & 0xF;
    
    int ☃ = e[(☃ << 4 | ☃)] & 0xFF;
    if (☃ == 255)
    {
      ady ☃ = ☃.a(☃, ady.q);
      ☃ = az;
      e[(☃ << 4 | ☃)] = ((byte)(☃ & 0xFF));
    }
    ady ☃ = ady.e(☃);
    if (☃ == null) {
      return ady.q;
    }
    return ☃;
  }
  
  public byte[] k()
  {
    return e;
  }
  
  public void a(byte[] ☃)
  {
    if (e.length != ☃.length)
    {
      c.warn("Could not set level chunk biomes, array length is " + ☃.length + " instead of " + e.length);
      return;
    }
    for (int ☃ = 0; ☃ < e.length; ☃++) {
      e[☃] = ☃[☃];
    }
  }
  
  public void l()
  {
    v = 0;
  }
  
  public void m()
  {
    cj ☃ = new cj(a << 4, 0, b << 4);
    for (int ☃ = 0; ☃ < 8; ☃++)
    {
      if (v >= 4096) {
        return;
      }
      int ☃ = v % 16;
      int ☃ = v / 16 % 16;
      int ☃ = v / 256;
      v += 1;
      for (int ☃ = 0; ☃ < 16; ☃++)
      {
        cj ☃ = ☃.a(☃, (☃ << 4) + ☃, ☃);
        boolean ☃ = (☃ == 0) || (☃ == 15) || (☃ == 0) || (☃ == 15) || (☃ == 0) || (☃ == 15);
        if (((d[☃] == null) && (☃)) || ((d[☃] != null) && (d[☃].b(☃, ☃, ☃).t() == arm.a)))
        {
          for (cq ☃ : cq.values())
          {
            cj ☃ = ☃.a(☃);
            if (i.p(☃).c().r() > 0) {
              i.x(☃);
            }
          }
          i.x(☃);
        }
      }
    }
  }
  
  public void n()
  {
    n = true;
    o = true;
    
    cj ☃ = new cj(a << 4, 0, b << 4);
    if (!i.t.o()) {
      if (i.a(☃.a(-1, 0, -1), ☃.a(16, i.F(), 16)))
      {
        for (int ☃ = 0; ☃ < 16; ☃++) {
          for (int ☃ = 0; ☃ < 16; ☃++) {
            if (!e(☃, ☃))
            {
              o = false;
              break label121;
            }
          }
        }
        label121:
        if (o)
        {
          for (cq ☃ : cq.c.a)
          {
            int ☃ = ☃.c() == cq.b.a ? 16 : 1;
            i.f(☃.a(☃, ☃)).a(☃.d());
          }
          y();
        }
      }
      else
      {
        o = false;
      }
    }
  }
  
  private void y()
  {
    for (int ☃ = 0; ☃ < g.length; ☃++) {
      g[☃] = true;
    }
    h(false);
  }
  
  private void a(cq ☃)
  {
    if (!n) {
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
    cj.a ☃ = new cj.a((a << 4) + ☃, 0, (b << 4) + ☃);
    for (int ☃ = ☃ + 16 - 1; (☃ > i.F()) || ((☃ > 0) && (!☃)); ☃--)
    {
      ☃.c(☃.n(), ☃, ☃.p());
      int ☃ = b(☃);
      if ((☃ == 255) && (☃.o() < i.F())) {
        ☃ = true;
      }
      if ((!☃) && (☃ > 0)) {
        ☃ = true;
      } else if ((☃) && (☃ == 0) && 
        (!i.x(☃))) {
        return false;
      }
    }
    for (int ☃ = ☃.o(); ☃ > 0; ☃--)
    {
      ☃.c(☃.n(), ☃, ☃.p());
      if (a(☃).r() > 0) {
        i.x(☃);
      }
    }
    return true;
  }
  
  public boolean o()
  {
    return h;
  }
  
  public void c(boolean ☃)
  {
    h = ☃;
  }
  
  public adm p()
  {
    return i;
  }
  
  public int[] q()
  {
    return j;
  }
  
  public void a(int[] ☃)
  {
    if (j.length != ☃.length)
    {
      c.warn("Could not set level chunk heightmap, array length is " + ☃.length + " instead of " + j.length);
      return;
    }
    for (int ☃ = 0; ☃ < j.length; ☃++) {
      j[☃] = ☃[☃];
    }
  }
  
  public Map<cj, akw> r()
  {
    return l;
  }
  
  public ne<pk>[] s()
  {
    return m;
  }
  
  public boolean t()
  {
    return n;
  }
  
  public void d(boolean ☃)
  {
    n = ☃;
  }
  
  public boolean u()
  {
    return o;
  }
  
  public void e(boolean ☃)
  {
    o = ☃;
  }
  
  public void f(boolean ☃)
  {
    q = ☃;
  }
  
  public void g(boolean ☃)
  {
    r = ☃;
  }
  
  public void b(long ☃)
  {
    s = ☃;
  }
  
  public int v()
  {
    return t;
  }
  
  public long w()
  {
    return u;
  }
  
  public void c(long ☃)
  {
    u = ☃;
  }
  
  public static enum a
  {
    private a() {}
  }
}
