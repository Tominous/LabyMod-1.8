import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class abe
{
  public static final String a = null;
  private static final Map o = Maps.newHashMap();
  private static final Map p = Maps.newHashMap();
  
  public static boolean a(int p_77914_0_, int p_77914_1_)
  {
    return (p_77914_0_ & 1 << p_77914_1_) != 0;
  }
  
  private static int c(int p_77910_0_, int p_77910_1_)
  {
    return a(p_77910_0_, p_77910_1_) ? 1 : 0;
  }
  
  private static int d(int p_77916_0_, int p_77916_1_)
  {
    return a(p_77916_0_, p_77916_1_) ? 0 : 1;
  }
  
  public static int a(int p_77909_0_)
  {
    return a(p_77909_0_, 5, 4, 3, 2, 1);
  }
  
  public static int a(Collection p_77911_0_)
  {
    int var1 = 3694022;
    if ((p_77911_0_ != null) && (!p_77911_0_.isEmpty()))
    {
      float var2 = 0.0F;
      float var3 = 0.0F;
      float var4 = 0.0F;
      float var5 = 0.0F;
      Iterator var6 = p_77911_0_.iterator();
      while (var6.hasNext())
      {
        pf var7 = (pf)var6.next();
        if (var7.f())
        {
          int var8 = pe.a[var7.a()].k();
          if (Config.isCustomColors()) {
            var8 = CustomColorizer.getPotionColor(var7.a(), var8);
          }
          for (int var9 = 0; var9 <= var7.c(); var9++)
          {
            var2 += (var8 >> 16 & 0xFF) / 255.0F;
            var3 += (var8 >> 8 & 0xFF) / 255.0F;
            var4 += (var8 >> 0 & 0xFF) / 255.0F;
            var5 += 1.0F;
          }
        }
      }
      if (var5 == 0.0F) {
        return 0;
      }
      var2 = var2 / var5 * 255.0F;
      var3 = var3 / var5 * 255.0F;
      var4 = var4 / var5 * 255.0F;
      return (int)var2 << 16 | (int)var3 << 8 | (int)var4;
    }
    if (Config.isCustomColors()) {
      var1 = CustomColorizer.getPotionColor(0, var1);
    }
    return var1;
  }
  
  public static boolean b(Collection potionEffects)
  {
    Iterator var1 = potionEffects.iterator();
    pf var2;
    do
    {
      if (!var1.hasNext()) {
        return true;
      }
      var2 = (pf)var1.next();
    } while (var2.e());
    return false;
  }
  
  public static int a(int dataValue, boolean bypassCache)
  {
    Integer var2 = nl.a(dataValue);
    if (!bypassCache)
    {
      if (q.containsKey(var2)) {
        return ((Integer)q.get(var2)).intValue();
      }
      int var3 = a(b(var2.intValue(), false));
      q.put(var2, Integer.valueOf(var3));
      return var3;
    }
    return a(b(var2.intValue(), true));
  }
  
  public static String c(int p_77905_0_)
  {
    int var1 = a(p_77905_0_);
    return r[var1];
  }
  
  private static int a(boolean p_77904_0_, boolean p_77904_1_, boolean p_77904_2_, int p_77904_3_, int p_77904_4_, int p_77904_5_, int p_77904_6_)
  {
    int var7 = 0;
    if (p_77904_0_) {
      var7 = d(p_77904_6_, p_77904_4_);
    } else if (p_77904_3_ != -1)
    {
      if ((p_77904_3_ == 0) && (h(p_77904_6_) == p_77904_4_)) {
        var7 = 1;
      } else if ((p_77904_3_ == 1) && (h(p_77904_6_) > p_77904_4_)) {
        var7 = 1;
      } else if ((p_77904_3_ == 2) && (h(p_77904_6_) < p_77904_4_)) {
        var7 = 1;
      }
    }
    else {
      var7 = c(p_77904_6_, p_77904_4_);
    }
    if (p_77904_1_) {
      var7 *= p_77904_5_;
    }
    if (p_77904_2_) {
      var7 *= -1;
    }
    return var7;
  }
  
  private static int h(int p_77907_0_)
  {
    for (int var1 = 0; p_77907_0_ > 0; var1++) {
      p_77907_0_ &= p_77907_0_ - 1;
    }
    return var1;
  }
  
  private static int a(String p_77912_0_, int p_77912_1_, int p_77912_2_, int p_77912_3_)
  {
    if ((p_77912_1_ < p_77912_0_.length()) && (p_77912_2_ >= 0) && (p_77912_1_ < p_77912_2_))
    {
      int var4 = p_77912_0_.indexOf('|', p_77912_1_);
      if ((var4 >= 0) && (var4 < p_77912_2_))
      {
        int var5 = a(p_77912_0_, p_77912_1_, var4 - 1, p_77912_3_);
        if (var5 > 0) {
          return var5;
        }
        int var17 = a(p_77912_0_, var4 + 1, p_77912_2_, p_77912_3_);
        return var17 > 0 ? var17 : 0;
      }
      int var5 = p_77912_0_.indexOf('&', p_77912_1_);
      if ((var5 >= 0) && (var5 < p_77912_2_))
      {
        int var17 = a(p_77912_0_, p_77912_1_, var5 - 1, p_77912_3_);
        if (var17 <= 0) {
          return 0;
        }
        int var18 = a(p_77912_0_, var5 + 1, p_77912_2_, p_77912_3_);
        return var17 > var18 ? var17 : var18 <= 0 ? 0 : var18;
      }
      boolean var6 = false;
      boolean var7 = false;
      boolean var8 = false;
      boolean var9 = false;
      boolean var10 = false;
      byte var11 = -1;
      int var12 = 0;
      int var13 = 0;
      int var14 = 0;
      for (int var15 = p_77912_1_; var15 < p_77912_2_; var15++)
      {
        char var16 = p_77912_0_.charAt(var15);
        if ((var16 >= '0') && (var16 <= '9'))
        {
          if (var6)
          {
            var13 = var16 - '0';
            var7 = true;
          }
          else
          {
            var12 *= 10;
            var12 += var16 - '0';
            var8 = true;
          }
        }
        else if (var16 == '*')
        {
          var6 = true;
        }
        else if (var16 == '!')
        {
          if (var8)
          {
            var14 += a(var9, var7, var10, var11, var12, var13, p_77912_3_);
            var9 = false;
            var10 = false;
            var6 = false;
            var7 = false;
            var8 = false;
            var13 = 0;
            var12 = 0;
            var11 = -1;
          }
          var9 = true;
        }
        else if (var16 == '-')
        {
          if (var8)
          {
            var14 += a(var9, var7, var10, var11, var12, var13, p_77912_3_);
            var9 = false;
            var10 = false;
            var6 = false;
            var7 = false;
            var8 = false;
            var13 = 0;
            var12 = 0;
            var11 = -1;
          }
          var10 = true;
        }
        else if ((var16 != '=') && (var16 != '<') && (var16 != '>'))
        {
          if ((var16 == '+') && (var8))
          {
            var14 += a(var9, var7, var10, var11, var12, var13, p_77912_3_);
            var9 = false;
            var10 = false;
            var6 = false;
            var7 = false;
            var8 = false;
            var13 = 0;
            var12 = 0;
            var11 = -1;
          }
        }
        else
        {
          if (var8)
          {
            var14 += a(var9, var7, var10, var11, var12, var13, p_77912_3_);
            var9 = false;
            var10 = false;
            var6 = false;
            var7 = false;
            var8 = false;
            var13 = 0;
            var12 = 0;
            var11 = -1;
          }
          if (var16 == '=') {
            var11 = 0;
          } else if (var16 == '<') {
            var11 = 2;
          } else if (var16 == '>') {
            var11 = 1;
          }
        }
      }
      if (var8) {
        var14 += a(var9, var7, var10, var11, var12, var13, p_77912_3_);
      }
      return var14;
    }
    return 0;
  }
  
  public static List b(int p_77917_0_, boolean p_77917_1_)
  {
    ArrayList var2 = null;
    pe[] var3 = pe.a;
    int var4 = var3.length;
    for (int var5 = 0; var5 < var4; var5++)
    {
      pe var6 = var3[var5];
      if ((var6 != null) && ((!var6.j()) || (p_77917_1_)))
      {
        String var7 = (String)o.get(Integer.valueOf(var6.d()));
        if (var7 != null)
        {
          int var8 = a(var7, 0, var7.length(), p_77917_0_);
          if (var8 > 0)
          {
            int var9 = 0;
            String var10 = (String)p.get(Integer.valueOf(var6.d()));
            if (var10 != null)
            {
              var9 = a(var10, 0, var10.length(), p_77917_0_);
              if (var9 < 0) {
                var9 = 0;
              }
            }
            if (var6.b())
            {
              var8 = 1;
            }
            else
            {
              var8 = 1200 * (var8 * 3 + (var8 - 1) * 2);
              var8 >>= var9;
              var8 = (int)Math.round(var8 * var6.h());
              if ((p_77917_0_ & 0x4000) != 0) {
                var8 = (int)Math.round(var8 * 0.75D + 0.5D);
              }
            }
            if (var2 == null) {
              var2 = Lists.newArrayList();
            }
            pf var11 = new pf(var6.d(), var8, var9);
            if ((p_77917_0_ & 0x4000) != 0) {
              var11.a(true);
            }
            var2.add(var11);
          }
        }
      }
    }
    return var2;
  }
  
  private static int a(int p_77906_0_, int p_77906_1_, boolean p_77906_2_, boolean p_77906_3_, boolean p_77906_4_)
  {
    if (p_77906_4_)
    {
      if (!a(p_77906_0_, p_77906_1_)) {
        return 0;
      }
    }
    else if (p_77906_2_) {
      p_77906_0_ &= (1 << p_77906_1_ ^ 0xFFFFFFFF);
    } else if (p_77906_3_)
    {
      if ((p_77906_0_ & 1 << p_77906_1_) == 0) {
        p_77906_0_ |= 1 << p_77906_1_;
      } else {
        p_77906_0_ &= (1 << p_77906_1_ ^ 0xFFFFFFFF);
      }
    }
    else {
      p_77906_0_ |= 1 << p_77906_1_;
    }
    return p_77906_0_;
  }
  
  public static int a(int p_77913_0_, String p_77913_1_)
  {
    byte var2 = 0;
    int var3 = p_77913_1_.length();
    boolean var4 = false;
    boolean var5 = false;
    boolean var6 = false;
    boolean var7 = false;
    int var8 = 0;
    for (int var9 = var2; var9 < var3; var9++)
    {
      char var10 = p_77913_1_.charAt(var9);
      if ((var10 >= '0') && (var10 <= '9'))
      {
        var8 *= 10;
        var8 += var10 - '0';
        var4 = true;
      }
      else if (var10 == '!')
      {
        if (var4)
        {
          p_77913_0_ = a(p_77913_0_, var8, var6, var5, var7);
          var7 = false;
          var5 = false;
          var6 = false;
          var4 = false;
          var8 = 0;
        }
        var5 = true;
      }
      else if (var10 == '-')
      {
        if (var4)
        {
          p_77913_0_ = a(p_77913_0_, var8, var6, var5, var7);
          var7 = false;
          var5 = false;
          var6 = false;
          var4 = false;
          var8 = 0;
        }
        var6 = true;
      }
      else if (var10 == '+')
      {
        if (var4)
        {
          p_77913_0_ = a(p_77913_0_, var8, var6, var5, var7);
          var7 = false;
          var5 = false;
          var6 = false;
          var4 = false;
          var8 = 0;
        }
      }
      else if (var10 == '&')
      {
        if (var4)
        {
          p_77913_0_ = a(p_77913_0_, var8, var6, var5, var7);
          var7 = false;
          var5 = false;
          var6 = false;
          var4 = false;
          var8 = 0;
        }
        var7 = true;
      }
    }
    if (var4) {
      p_77913_0_ = a(p_77913_0_, var8, var6, var5, var7);
    }
    return p_77913_0_ & 0x7FFF;
  }
  
  public static int a(int p_77908_0_, int p_77908_1_, int p_77908_2_, int p_77908_3_, int p_77908_4_, int p_77908_5_)
  {
    return (a(p_77908_0_, p_77908_1_) ? 16 : 0) | (a(p_77908_0_, p_77908_2_) ? 8 : 0) | (a(p_77908_0_, p_77908_3_) ? 4 : 0) | (a(p_77908_0_, p_77908_4_) ? 2 : 0) | (a(p_77908_0_, p_77908_5_) ? 1 : 0);
  }
  
  static
  {
    o.put(Integer.valueOf(pe.l.d()), "0 & !1 & !2 & !3 & 0+6");
    b = "-0+1-2-3&4-4+13";
    o.put(Integer.valueOf(pe.c.d()), "!0 & 1 & !2 & !3 & 1+6");
    h = "+0+1-2-3&4-4+13";
    o.put(Integer.valueOf(pe.n.d()), "0 & 1 & !2 & !3 & 0+6");
    f = "+0-1+2-3&4-4+13";
    o.put(Integer.valueOf(pe.h.d()), "0 & !1 & 2 & !3");
    d = "-0-1+2-3&4-4+13";
    o.put(Integer.valueOf(pe.u.d()), "!0 & !1 & 2 & !3 & 2+6");
    e = "-0+3-4+13";
    o.put(Integer.valueOf(pe.t.d()), "!0 & !1 & !2 & 3 & 3+6");
    o.put(Integer.valueOf(pe.i.d()), "!0 & !1 & 2 & 3");
    o.put(Integer.valueOf(pe.d.d()), "!0 & 1 & !2 & 3 & 3+6");
    g = "+0-1-2+3&4-4+13";
    o.put(Integer.valueOf(pe.g.d()), "0 & !1 & !2 & 3 & 3+6");
    l = "-0+1+2-3+13&4-4";
    o.put(Integer.valueOf(pe.r.d()), "!0 & 1 & 2 & !3 & 2+6");
    o.put(Integer.valueOf(pe.p.d()), "!0 & 1 & 2 & 3 & 2+6");
    m = "+0-1+2+3+13&4-4";
    o.put(Integer.valueOf(pe.o.d()), "0 & !1 & 2 & 3 & 2+6");
    n = "+0+1-2+3&4-4+13";
    o.put(Integer.valueOf(pe.j.d()), "0 & 1 & !2 & 3 & 3+6");
    j = "+5-6-7";
    p.put(Integer.valueOf(pe.c.d()), "5");
    p.put(Integer.valueOf(pe.e.d()), "5");
    p.put(Integer.valueOf(pe.g.d()), "5");
    p.put(Integer.valueOf(pe.l.d()), "5");
    p.put(Integer.valueOf(pe.i.d()), "5");
    p.put(Integer.valueOf(pe.h.d()), "5");
    p.put(Integer.valueOf(pe.m.d()), "5");
    p.put(Integer.valueOf(pe.u.d()), "5");
    p.put(Integer.valueOf(pe.j.d()), "5");
  }
  
  public static final String i = "-5+6-7";
  public static final String k = "+14&13-13";
  private static final Map q = Maps.newHashMap();
  private static final String[] r = { "potion.prefix.mundane", "potion.prefix.uninteresting", "potion.prefix.bland", "potion.prefix.clear", "potion.prefix.milky", "potion.prefix.diffuse", "potion.prefix.artless", "potion.prefix.thin", "potion.prefix.awkward", "potion.prefix.flat", "potion.prefix.bulky", "potion.prefix.bungling", "potion.prefix.buttered", "potion.prefix.smooth", "potion.prefix.suave", "potion.prefix.debonair", "potion.prefix.thick", "potion.prefix.elegant", "potion.prefix.fancy", "potion.prefix.charming", "potion.prefix.dashing", "potion.prefix.refined", "potion.prefix.cordial", "potion.prefix.sparkling", "potion.prefix.potent", "potion.prefix.foul", "potion.prefix.odorless", "potion.prefix.rank", "potion.prefix.harsh", "potion.prefix.acrid", "potion.prefix.gross", "potion.prefix.stinky" };
  public static final String b;
  public static final String c = "+0-1-2-3&4-4+13";
  public static final String d;
  public static final String e;
  public static final String f;
  public static final String g;
  public static final String h;
  public static final String j;
  public static final String l;
  public static final String m;
  public static final String n;
  private static final String __OBFID = "CL_00000078";
  
  public static void clearPotionColorCache()
  {
    q.clear();
  }
}
