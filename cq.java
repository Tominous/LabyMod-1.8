import com.google.common.base.Predicate;
import com.google.common.collect.Iterators;
import com.google.common.collect.Maps;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;

public enum cq
  implements nw
{
  private final int g;
  private final int h;
  private final int i;
  private final String j;
  private final cq.a k;
  private final cq.b l;
  private final df m;
  private static final cq[] n;
  private static final cq[] o;
  private static final Map<String, cq> p;
  
  static
  {
    n = new cq[6];
    o = new cq[4];
    p = Maps.newHashMap();
    for (cq ☃ : values())
    {
      n[☃.g] = ☃;
      if (☃.k().c()) {
        o[☃.i] = ☃;
      }
      p.put(☃.j().toLowerCase(), ☃);
    }
  }
  
  private cq(int ☃, int ☃, int ☃, String ☃, cq.b ☃, cq.a ☃, df ☃)
  {
    this.g = ☃;
    this.i = ☃;
    this.h = ☃;
    this.j = ☃;
    this.k = ☃;
    this.l = ☃;
    this.m = ☃;
  }
  
  public int a()
  {
    return this.g;
  }
  
  public int b()
  {
    return this.i;
  }
  
  public cq.b c()
  {
    return this.l;
  }
  
  public cq d()
  {
    return a(this.h);
  }
  
  public cq a(cq.a ☃)
  {
    switch (cq.1.a[☃.ordinal()])
    {
    case 1: 
      if ((this == e) || (this == f)) {
        return this;
      }
      return n();
    case 2: 
      if ((this == b) || (this == a)) {
        return this;
      }
      return e();
    case 3: 
      if ((this == c) || (this == d)) {
        return this;
      }
      return p();
    }
    throw new IllegalStateException("Unable to get CW facing for axis " + ☃);
  }
  
  public cq e()
  {
    switch (cq.1.b[ordinal()])
    {
    case 1: 
      return f;
    case 2: 
      return d;
    case 3: 
      return e;
    case 4: 
      return c;
    }
    throw new IllegalStateException("Unable to get Y-rotated facing of " + this);
  }
  
  private cq n()
  {
    switch (cq.1.b[ordinal()])
    {
    case 5: 
      return c;
    case 1: 
      return a;
    case 6: 
      return d;
    case 3: 
      return b;
    }
    throw new IllegalStateException("Unable to get X-rotated facing of " + this);
  }
  
  private cq p()
  {
    switch (cq.1.b[ordinal()])
    {
    case 5: 
      return f;
    case 2: 
      return a;
    case 6: 
      return e;
    case 4: 
      return b;
    }
    throw new IllegalStateException("Unable to get Z-rotated facing of " + this);
  }
  
  public cq f()
  {
    switch (cq.1.b[ordinal()])
    {
    case 1: 
      return e;
    case 2: 
      return c;
    case 3: 
      return f;
    case 4: 
      return d;
    }
    throw new IllegalStateException("Unable to get CCW facing of " + this);
  }
  
  public int g()
  {
    if (this.k == cq.a.a) {
      return this.l.a();
    }
    return 0;
  }
  
  public int h()
  {
    if (this.k == cq.a.b) {
      return this.l.a();
    }
    return 0;
  }
  
  public int i()
  {
    if (this.k == cq.a.c) {
      return this.l.a();
    }
    return 0;
  }
  
  public String j()
  {
    return this.j;
  }
  
  public cq.a k()
  {
    return this.k;
  }
  
  public static cq a(String ☃)
  {
    if (☃ == null) {
      return null;
    }
    return (cq)p.get(☃.toLowerCase());
  }
  
  public static cq a(int ☃)
  {
    return n[ns.a(☃ % n.length)];
  }
  
  public static cq b(int ☃)
  {
    return o[ns.a(☃ % o.length)];
  }
  
  public static cq a(double ☃)
  {
    return b(ns.c(☃ / 90.0D + 0.5D) & 0x3);
  }
  
  public static cq a(Random ☃)
  {
    return values()[☃.nextInt(values().length)];
  }
  
  public static cq a(float ☃, float ☃, float ☃)
  {
    cq ☃ = c;
    float ☃ = Float.MIN_VALUE;
    for (cq ☃ : values())
    {
      float ☃ = ☃ * ☃.m.n() + ☃ * ☃.m.o() + ☃ * ☃.m.p();
      if (☃ > ☃)
      {
        ☃ = ☃;
        ☃ = ☃;
      }
    }
    return ☃;
  }
  
  public String toString()
  {
    return this.j;
  }
  
  public String l()
  {
    return this.j;
  }
  
  public static cq a(cq.b ☃, cq.a ☃)
  {
    for (cq ☃ : ) {
      if ((☃.c() == ☃) && (☃.k() == ☃)) {
        return ☃;
      }
    }
    throw new IllegalArgumentException("No such direction: " + ☃ + " " + ☃);
  }
  
  public static enum a
    implements Predicate<cq>, nw
  {
    private static final Map<String, a> d;
    private final String e;
    private final cq.c f;
    
    static
    {
      d = Maps.newHashMap();
      for (a ☃ : values()) {
        d.put(☃.a().toLowerCase(), ☃);
      }
    }
    
    private a(String ☃, cq.c ☃)
    {
      this.e = ☃;
      this.f = ☃;
    }
    
    public static a a(String ☃)
    {
      if (☃ == null) {
        return null;
      }
      return (a)d.get(☃.toLowerCase());
    }
    
    public String a()
    {
      return this.e;
    }
    
    public boolean b()
    {
      return this.f == cq.c.b;
    }
    
    public boolean c()
    {
      return this.f == cq.c.a;
    }
    
    public String toString()
    {
      return this.e;
    }
    
    public boolean a(cq ☃)
    {
      return (☃ != null) && (☃.k() == this);
    }
    
    public cq.c d()
    {
      return this.f;
    }
    
    public String l()
    {
      return this.e;
    }
  }
  
  public static enum b
  {
    private final int c;
    private final String d;
    
    private b(int ☃, String ☃)
    {
      this.c = ☃;
      this.d = ☃;
    }
    
    public int a()
    {
      return this.c;
    }
    
    public String toString()
    {
      return this.d;
    }
  }
  
  public df m()
  {
    return this.m;
  }
  
  public static enum c
    implements Predicate<cq>, Iterable<cq>
  {
    private c() {}
    
    public cq[] a()
    {
      switch (cq.1.c[ordinal()])
      {
      case 1: 
        return new cq[] { cq.c, cq.f, cq.d, cq.e };
      case 2: 
        return new cq[] { cq.b, cq.a };
      }
      throw new Error("Someone's been tampering with the universe!");
    }
    
    public cq a(Random ☃)
    {
      cq[] ☃ = a();
      return ☃[☃.nextInt(☃.length)];
    }
    
    public boolean a(cq ☃)
    {
      return (☃ != null) && (☃.k().d() == this);
    }
    
    public Iterator<cq> iterator()
    {
      return Iterators.forArray(a());
    }
  }
}
