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
  public static final cq[] n;
  private static final cq[] o;
  private static final Map p;
  private static final cq[] q;
  private static final String __OBFID = "CL_00001201";
  
  private cq(String p_i46016_1_, int p_i46016_2_, int indexIn, int oppositeIn, int horizontalIndexIn, String nameIn, cq.b axisDirectionIn, cq.a axisIn, df directionVecIn)
  {
    g = indexIn;
    i = horizontalIndexIn;
    h = oppositeIn;
    j = nameIn;
    k = axisIn;
    l = axisDirectionIn;
    m = directionVecIn;
  }
  
  public int a()
  {
    return g;
  }
  
  public int b()
  {
    return i;
  }
  
  public cq.b c()
  {
    return l;
  }
  
  public cq d()
  {
    return n[h];
  }
  
  public cq a(cq.a axis)
  {
    switch (cq.1.a[axis.ordinal()])
    {
    case 1: 
      if ((this != e) && (this != f)) {
        return n();
      }
      return this;
    case 2: 
      if ((this != b) && (this != a)) {
        return e();
      }
      return this;
    case 3: 
      if ((this != c) && (this != d)) {
        return p();
      }
      return this;
    }
    throw new IllegalStateException("Unable to get CW facing for axis " + axis);
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
    case 1: 
      return a;
    case 2: 
    case 4: 
    default: 
      throw new IllegalStateException("Unable to get X-rotated facing of " + this);
    case 3: 
      return b;
    case 5: 
      return c;
    }
    return d;
  }
  
  private cq p()
  {
    switch (cq.1.b[ordinal()])
    {
    case 2: 
      return a;
    case 3: 
    default: 
      throw new IllegalStateException("Unable to get Z-rotated facing of " + this);
    case 4: 
      return b;
    case 5: 
      return f;
    }
    return e;
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
    return k == cq.a.a ? l.a() : 0;
  }
  
  public int h()
  {
    return k == cq.a.b ? l.a() : 0;
  }
  
  public int i()
  {
    return k == cq.a.c ? l.a() : 0;
  }
  
  public String j()
  {
    return j;
  }
  
  public cq.a k()
  {
    return k;
  }
  
  public static cq a(String name)
  {
    return name == null ? null : (cq)p.get(name.toLowerCase());
  }
  
  public static cq a(int index)
  {
    return n[ns.a(index % n.length)];
  }
  
  public static cq b(int p_176731_0_)
  {
    return o[ns.a(p_176731_0_ % o.length)];
  }
  
  public static cq a(double angle)
  {
    return b(ns.c(angle / 90.0D + 0.5D) & 0x3);
  }
  
  public static cq a(Random rand)
  {
    return values()[rand.nextInt(values().length)];
  }
  
  public static cq a(float p_176737_0_, float p_176737_1_, float p_176737_2_)
  {
    cq var3 = c;
    float var4 = Float.MIN_VALUE;
    cq[] var5 = values();
    int var6 = var5.length;
    for (int var7 = 0; var7 < var6; var7++)
    {
      cq var8 = var5[var7];
      float var9 = p_176737_0_ * m.n() + p_176737_1_ * m.o() + p_176737_2_ * m.p();
      if (var9 > var4)
      {
        var4 = var9;
        var3 = var8;
      }
    }
    return var3;
  }
  
  public String toString()
  {
    return j;
  }
  
  public String l()
  {
    return j;
  }
  
  public static cq a(cq.b p_500005_0_, cq.a p_500005_1_)
  {
    cq[] var2 = values();
    int var3 = var2.length;
    for (int var4 = 0; var4 < var3; var4++)
    {
      cq var5 = var2[var4];
      if ((var5.c() == p_500005_0_) && (var5.k() == p_500005_1_)) {
        return var5;
      }
    }
    throw new IllegalArgumentException("No such direction: " + p_500005_0_ + " " + p_500005_1_);
  }
  
  public df m()
  {
    return m;
  }
  
  static
  {
    n = new cq[6];
    
    o = new cq[4];
    p = Maps.newHashMap();
    
    q = new cq[] { a, b, c, d, e, f };
    
    cq[] var0 = values();
    int var1 = var0.length;
    for (int var2 = 0; var2 < var1; var2++)
    {
      cq var3 = var0[var2];
      n[g] = var3;
      if (var3.k().c()) {
        o[i] = var3;
      }
      p.put(var3.j().toLowerCase(), var3);
    }
  }
  
  public static enum a
    implements Predicate, nw
  {
    private static final Map d;
    private final String e;
    private final cq.c f;
    private static final a[] g;
    private static final String __OBFID = "CL_00002321";
    
    private a(String p_i46015_1_, int p_i46015_2_, String name, cq.c plane)
    {
      e = name;
      f = plane;
    }
    
    public static a a(String name)
    {
      return name == null ? null : (a)d.get(name.toLowerCase());
    }
    
    public String a()
    {
      return e;
    }
    
    public boolean b()
    {
      return f == cq.c.b;
    }
    
    public boolean c()
    {
      return f == cq.c.a;
    }
    
    public String toString()
    {
      return e;
    }
    
    public boolean a(cq facing)
    {
      return (facing != null) && (facing.k() == this);
    }
    
    public cq.c d()
    {
      return f;
    }
    
    public String l()
    {
      return e;
    }
    
    public boolean apply(Object p_apply_1_)
    {
      return a((cq)p_apply_1_);
    }
    
    static
    {
      d = Maps.newHashMap();
      
      g = new a[] { a, b, c };
      
      a[] var0 = values();
      int var1 = var0.length;
      for (int var2 = 0; var2 < var1; var2++)
      {
        a var3 = var0[var2];
        d.put(var3.a().toLowerCase(), var3);
      }
    }
  }
  
  public static enum b
  {
    private final int c;
    private final String d;
    private static final b[] e = { a, b };
    private static final String __OBFID = "CL_00002320";
    
    private b(String p_i46014_1_, int p_i46014_2_, int offset, String description)
    {
      c = offset;
      d = description;
    }
    
    public int a()
    {
      return c;
    }
    
    public String toString()
    {
      return d;
    }
  }
  
  public static enum c
    implements Predicate, Iterable
  {
    private static final c[] c = { a, b };
    private static final String __OBFID = "CL_00002319";
    
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
    
    public cq a(Random rand)
    {
      cq[] var2 = a();
      return var2[rand.nextInt(var2.length)];
    }
    
    public boolean a(cq facing)
    {
      return (facing != null) && (facing.k().d() == this);
    }
    
    public Iterator iterator()
    {
      return Iterators.forArray(a());
    }
    
    public boolean apply(Object p_apply_1_)
    {
      return a((cq)p_apply_1_);
    }
  }
}
