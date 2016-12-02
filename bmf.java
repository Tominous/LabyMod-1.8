import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class bmf
{
  private final int a;
  private final Set b = Sets.newHashSetWithExpectedSize(256);
  private final List c = Lists.newArrayListWithCapacity(256);
  private int d;
  private int e;
  private final int f;
  private final int g;
  private final boolean h;
  private final int i;
  private static final String __OBFID = "CL_00001054";
  
  public bmf(int p_i45095_1_, int p_i45095_2_, boolean p_i45095_3_, int p_i45095_4_, int p_i45095_5_)
  {
    a = p_i45095_5_;
    f = p_i45095_1_;
    g = p_i45095_2_;
    h = p_i45095_3_;
    i = p_i45095_4_;
  }
  
  public int a()
  {
    return d;
  }
  
  public int b()
  {
    return e;
  }
  
  public void a(bmi p_110934_1_)
  {
    bmf.a var2 = new bmf.a(p_110934_1_, a);
    if (i > 0) {
      var2.a(i);
    }
    b.add(var2);
  }
  
  public void c()
  {
    bmf.a[] var1 = (bmf.a[])b.toArray(new bmf.a[b.size()]);
    Arrays.sort(var1);
    bmf.a[] var2 = var1;
    int var3 = var1.length;
    for (int var4 = 0; var4 < var3; var4++)
    {
      bmf.a var5 = var2[var4];
      if (!a(var5))
      {
        String var6 = String.format("Unable to fit: %s, size: %dx%d, atlas: %dx%d, atlasMax: %dx%d - Maybe try a lower resolution resourcepack?", new Object[] { var5.a().i(), Integer.valueOf(var5.a().c()), Integer.valueOf(var5.a().d()), Integer.valueOf(d), Integer.valueOf(e), Integer.valueOf(f), Integer.valueOf(g) });
        
        throw new bmg(var5, var6);
      }
    }
    if (h)
    {
      d = ns.b(d);
      e = ns.b(e);
    }
  }
  
  public List d()
  {
    ArrayList var1 = Lists.newArrayList();
    Iterator var2 = c.iterator();
    while (var2.hasNext())
    {
      bmf.b var3 = (bmf.b)var2.next();
      var3.a(var1);
    }
    ArrayList var7 = Lists.newArrayList();
    Iterator var8 = var1.iterator();
    while (var8.hasNext())
    {
      bmf.b var4 = (bmf.b)var8.next();
      bmf.a var5 = var4.a();
      bmi var6 = var5.a();
      var6.a(d, e, var4.b(), var4.c(), var5.e());
      var7.add(var6);
    }
    return var7;
  }
  
  private static int b(int p_147969_0_, int p_147969_1_)
  {
    return (p_147969_0_ >> p_147969_1_) + ((p_147969_0_ & (1 << p_147969_1_) - 1) == 0 ? 0 : 1) << p_147969_1_;
  }
  
  private boolean a(bmf.a p_94310_1_)
  {
    for (int var2 = 0; var2 < c.size(); var2++)
    {
      if (((bmf.b)c.get(var2)).a(p_94310_1_)) {
        return true;
      }
      p_94310_1_.d();
      if (((bmf.b)c.get(var2)).a(p_94310_1_)) {
        return true;
      }
      p_94310_1_.d();
    }
    return b(p_94310_1_);
  }
  
  private boolean b(bmf.a p_94311_1_)
  {
    int var2 = Math.min(p_94311_1_.b(), p_94311_1_.c());
    boolean var3 = (d == 0) && (e == 0);
    boolean var4;
    boolean var4;
    if (h)
    {
      int var5 = ns.b(d);
      int var6 = ns.b(e);
      int var7 = ns.b(d + var2);
      int var8 = ns.b(e + var2);
      boolean var9 = var7 <= f;
      boolean var10 = var8 <= g;
      if ((!var9) && (!var10)) {
        return false;
      }
      boolean var11 = var5 != var7;
      boolean var12 = var6 != var8;
      boolean var4;
      if ((var11 ^ var12)) {
        var4 = !var11;
      } else {
        var4 = (var9) && (var5 <= var6);
      }
    }
    else
    {
      boolean var13 = d + var2 <= f;
      boolean var14 = e + var2 <= g;
      if ((!var13) && (!var14)) {
        return false;
      }
      var4 = (var13) && ((var3) || (d <= e));
    }
    int var5 = Math.max(p_94311_1_.b(), p_94311_1_.c());
    if (ns.b((!var4 ? e : d) + var5) > (!var4 ? g : f)) {
      return false;
    }
    bmf.b var15;
    if (var4)
    {
      if (p_94311_1_.b() > p_94311_1_.c()) {
        p_94311_1_.d();
      }
      if (e == 0) {
        e = p_94311_1_.c();
      }
      bmf.b var15 = new bmf.b(d, 0, p_94311_1_.b(), e);
      d += p_94311_1_.b();
    }
    else
    {
      var15 = new bmf.b(0, e, d, p_94311_1_.c());
      e += p_94311_1_.c();
    }
    var15.a(p_94311_1_);
    c.add(var15);
    return true;
  }
  
  public static class a
    implements Comparable
  {
    private final bmi a;
    private final int b;
    private final int c;
    private final int d;
    private boolean e;
    private float f = 1.0F;
    private static final String __OBFID = "CL_00001055";
    
    public a(bmi p_i45094_1_, int p_i45094_2_)
    {
      a = p_i45094_1_;
      b = p_i45094_1_.c();
      c = p_i45094_1_.d();
      d = p_i45094_2_;
      e = (bmf.a(c, p_i45094_2_) > bmf.a(b, p_i45094_2_));
    }
    
    public bmi a()
    {
      return a;
    }
    
    public int b()
    {
      return e ? bmf.a((int)(c * f), d) : bmf.a((int)(b * f), d);
    }
    
    public int c()
    {
      return e ? bmf.a((int)(b * f), d) : bmf.a((int)(c * f), d);
    }
    
    public void d()
    {
      e = (!e);
    }
    
    public boolean e()
    {
      return e;
    }
    
    public void a(int p_94196_1_)
    {
      if ((b > p_94196_1_) && (c > p_94196_1_)) {
        f = (p_94196_1_ / Math.min(b, c));
      }
    }
    
    public String toString()
    {
      return "Holder{width=" + b + ", height=" + c + ", name=" + a.i() + '}';
    }
    
    public int a(a p_compareTo_1_)
    {
      int var2;
      int var2;
      if (c() == p_compareTo_1_.c())
      {
        if (b() == p_compareTo_1_.b())
        {
          if (a.i() == null) {
            return a.i() == null ? 0 : -1;
          }
          return a.i().compareTo(a.i());
        }
        var2 = b() < p_compareTo_1_.b() ? 1 : -1;
      }
      else
      {
        var2 = c() < p_compareTo_1_.c() ? 1 : -1;
      }
      return var2;
    }
    
    public int compareTo(Object p_compareTo_1_)
    {
      return a((a)p_compareTo_1_);
    }
  }
  
  public static class b
  {
    private final int a;
    private final int b;
    private final int c;
    private final int d;
    private List e;
    private bmf.a f;
    private static final String __OBFID = "CL_00001056";
    
    public b(int p_i1277_1_, int p_i1277_2_, int p_i1277_3_, int p_i1277_4_)
    {
      a = p_i1277_1_;
      b = p_i1277_2_;
      c = p_i1277_3_;
      d = p_i1277_4_;
    }
    
    public bmf.a a()
    {
      return f;
    }
    
    public int b()
    {
      return a;
    }
    
    public int c()
    {
      return b;
    }
    
    public boolean a(bmf.a p_94182_1_)
    {
      if (f != null) {
        return false;
      }
      int var2 = p_94182_1_.b();
      int var3 = p_94182_1_.c();
      if ((var2 <= c) && (var3 <= d))
      {
        if ((var2 == c) && (var3 == d))
        {
          f = p_94182_1_;
          return true;
        }
        if (e == null)
        {
          e = Lists.newArrayListWithCapacity(1);
          e.add(new b(a, b, var2, var3));
          int var4 = c - var2;
          int var5 = d - var3;
          if ((var5 > 0) && (var4 > 0))
          {
            int var6 = Math.max(d, var4);
            int var7 = Math.max(c, var5);
            if (var6 >= var7)
            {
              e.add(new b(a, b + var3, var2, var5));
              e.add(new b(a + var2, b, var4, d));
            }
            else
            {
              e.add(new b(a + var2, b, var4, var3));
              e.add(new b(a, b + var3, c, var5));
            }
          }
          else if (var4 == 0)
          {
            e.add(new b(a, b + var3, var2, var5));
          }
          else if (var5 == 0)
          {
            e.add(new b(a + var2, b, var4, var3));
          }
        }
        Iterator var8 = e.iterator();
        b var9;
        do
        {
          if (!var8.hasNext()) {
            return false;
          }
          var9 = (b)var8.next();
        } while (!var9.a(p_94182_1_));
        return true;
      }
      return false;
    }
    
    public void a(List p_94184_1_)
    {
      if (f != null)
      {
        p_94184_1_.add(this);
      }
      else if (e != null)
      {
        Iterator var2 = e.iterator();
        while (var2.hasNext())
        {
          b var3 = (b)var2.next();
          var3.a(p_94184_1_);
        }
      }
    }
    
    public String toString()
    {
      return "Slot{originX=" + a + ", originY=" + b + ", width=" + c + ", height=" + d + ", texture=" + f + ", subSlots=" + e + '}';
    }
  }
}
