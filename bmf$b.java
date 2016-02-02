import com.google.common.collect.Lists;
import java.util.Iterator;
import java.util.List;

public class bmf$b
{
  private final int a;
  private final int b;
  private final int c;
  private final int d;
  private List e;
  private bmf.a f;
  private static final String __OBFID = "CL_00001056";
  
  public bmf$b(int p_i1277_1_, int p_i1277_2_, int p_i1277_3_, int p_i1277_4_)
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
