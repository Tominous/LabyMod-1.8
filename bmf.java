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
    this.a = p_i45095_5_;
    this.f = p_i45095_1_;
    this.g = p_i45095_2_;
    this.h = p_i45095_3_;
    this.i = p_i45095_4_;
  }
  
  public int a()
  {
    return this.d;
  }
  
  public int b()
  {
    return this.e;
  }
  
  public void a(bmi p_110934_1_)
  {
    bmf.a var2 = new bmf.a(p_110934_1_, this.a);
    if (this.i > 0) {
      var2.a(this.i);
    }
    this.b.add(var2);
  }
  
  public void c()
  {
    bmf.a[] var1 = (bmf.a[])this.b.toArray(new bmf.a[this.b.size()]);
    Arrays.sort(var1);
    bmf.a[] var2 = var1;
    int var3 = var1.length;
    for (int var4 = 0; var4 < var3; var4++)
    {
      bmf.a var5 = var2[var4];
      if (!a(var5))
      {
        String var6 = String.format("Unable to fit: %s, size: %dx%d, atlas: %dx%d, atlasMax: %dx%d - Maybe try a lower resolution resourcepack?", new Object[] { var5.a().i(), Integer.valueOf(var5.a().c()), Integer.valueOf(var5.a().d()), Integer.valueOf(this.d), Integer.valueOf(this.e), Integer.valueOf(this.f), Integer.valueOf(this.g) });
        
        throw new bmg(var5, var6);
      }
    }
    if (this.h)
    {
      this.d = ns.b(this.d);
      this.e = ns.b(this.e);
    }
  }
  
  public List d()
  {
    ArrayList var1 = Lists.newArrayList();
    Iterator var2 = this.c.iterator();
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
      var6.a(this.d, this.e, var4.b(), var4.c(), var5.e());
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
    for (int var2 = 0; var2 < this.c.size(); var2++)
    {
      if (((bmf.b)this.c.get(var2)).a(p_94310_1_)) {
        return true;
      }
      p_94310_1_.d();
      if (((bmf.b)this.c.get(var2)).a(p_94310_1_)) {
        return true;
      }
      p_94310_1_.d();
    }
    return b(p_94310_1_);
  }
  
  private boolean b(bmf.a p_94311_1_)
  {
    int var2 = Math.min(p_94311_1_.b(), p_94311_1_.c());
    boolean var3 = (this.d == 0) && (this.e == 0);
    boolean var4;
    boolean var4;
    if (this.h)
    {
      int var5 = ns.b(this.d);
      int var6 = ns.b(this.e);
      int var7 = ns.b(this.d + var2);
      int var8 = ns.b(this.e + var2);
      boolean var9 = var7 <= this.f;
      boolean var10 = var8 <= this.g;
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
      boolean var13 = this.d + var2 <= this.f;
      boolean var14 = this.e + var2 <= this.g;
      if ((!var13) && (!var14)) {
        return false;
      }
      var4 = (var13) && ((var3) || (this.d <= this.e));
    }
    int var5 = Math.max(p_94311_1_.b(), p_94311_1_.c());
    if (ns.b((!var4 ? this.e : this.d) + var5) > (!var4 ? this.g : this.f)) {
      return false;
    }
    bmf.b var15;
    if (var4)
    {
      if (p_94311_1_.b() > p_94311_1_.c()) {
        p_94311_1_.d();
      }
      if (this.e == 0) {
        this.e = p_94311_1_.c();
      }
      bmf.b var15 = new bmf.b(this.d, 0, p_94311_1_.b(), this.e);
      this.d += p_94311_1_.b();
    }
    else
    {
      var15 = new bmf.b(0, this.e, this.d, p_94311_1_.c());
      this.e += p_94311_1_.c();
    }
    var15.a(p_94311_1_);
    this.c.add(var15);
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
      this.a = p_i45094_1_;
      this.b = p_i45094_1_.c();
      this.c = p_i45094_1_.d();
      this.d = p_i45094_2_;
      this.e = (bmf.a(this.c, p_i45094_2_) > bmf.a(this.b, p_i45094_2_));
    }
    
    public bmi a()
    {
      return this.a;
    }
    
    public int b()
    {
      return this.e ? bmf.a((int)(this.c * this.f), this.d) : bmf.a((int)(this.b * this.f), this.d);
    }
    
    public int c()
    {
      return this.e ? bmf.a((int)(this.b * this.f), this.d) : bmf.a((int)(this.c * this.f), this.d);
    }
    
    public void d()
    {
      this.e = (!this.e);
    }
    
    public boolean e()
    {
      return this.e;
    }
    
    public void a(int p_94196_1_)
    {
      if ((this.b > p_94196_1_) && (this.c > p_94196_1_)) {
        this.f = (p_94196_1_ / Math.min(this.b, this.c));
      }
    }
    
    public String toString()
    {
      return "Holder{width=" + this.b + ", height=" + this.c + ", name=" + this.a.i() + '}';
    }
    
    public int a(a p_compareTo_1_)
    {
      int var2;
      int var2;
      if (c() == p_compareTo_1_.c())
      {
        if (b() == p_compareTo_1_.b())
        {
          if (this.a.i() == null) {
            return p_compareTo_1_.a.i() == null ? 0 : -1;
          }
          return this.a.i().compareTo(p_compareTo_1_.a.i());
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
      this.a = p_i1277_1_;
      this.b = p_i1277_2_;
      this.c = p_i1277_3_;
      this.d = p_i1277_4_;
    }
    
    public bmf.a a()
    {
      return this.f;
    }
    
    public int b()
    {
      return this.a;
    }
    
    public int c()
    {
      return this.b;
    }
    
    public boolean a(bmf.a p_94182_1_)
    {
      if (this.f != null) {
        return false;
      }
      int var2 = p_94182_1_.b();
      int var3 = p_94182_1_.c();
      if ((var2 <= this.c) && (var3 <= this.d))
      {
        if ((var2 == this.c) && (var3 == this.d))
        {
          this.f = p_94182_1_;
          return true;
        }
        if (this.e == null)
        {
          this.e = Lists.newArrayListWithCapacity(1);
          this.e.add(new b(this.a, this.b, var2, var3));
          int var4 = this.c - var2;
          int var5 = this.d - var3;
          if ((var5 > 0) && (var4 > 0))
          {
            int var6 = Math.max(this.d, var4);
            int var7 = Math.max(this.c, var5);
            if (var6 >= var7)
            {
              this.e.add(new b(this.a, this.b + var3, var2, var5));
              this.e.add(new b(this.a + var2, this.b, var4, this.d));
            }
            else
            {
              this.e.add(new b(this.a + var2, this.b, var4, var3));
              this.e.add(new b(this.a, this.b + var3, this.c, var5));
            }
          }
          else if (var4 == 0)
          {
            this.e.add(new b(this.a, this.b + var3, var2, var5));
          }
          else if (var5 == 0)
          {
            this.e.add(new b(this.a + var2, this.b, var4, var3));
          }
        }
        Iterator var8 = this.e.iterator();
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
      if (this.f != null)
      {
        p_94184_1_.add(this);
      }
      else if (this.e != null)
      {
        Iterator var2 = this.e.iterator();
        while (var2.hasNext())
        {
          b var3 = (b)var2.next();
          var3.a(p_94184_1_);
        }
      }
    }
    
    public String toString()
    {
      return "Slot{originX=" + this.a + ", originY=" + this.b + ", width=" + this.c + ", height=" + this.d + ", texture=" + this.f + ", subSlots=" + this.e + '}';
    }
  }
}
