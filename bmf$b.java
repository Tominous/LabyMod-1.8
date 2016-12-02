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
