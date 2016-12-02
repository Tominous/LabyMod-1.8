import java.util.ArrayDeque;
import java.util.BitSet;
import java.util.EnumSet;
import java.util.Set;

public class bhw
{
  private static final int a = (int)Math.pow(16.0D, 0.0D);
  private static final int b = (int)Math.pow(16.0D, 1.0D);
  private static final int c = (int)Math.pow(16.0D, 2.0D);
  private final BitSet d;
  private static final int[] e = new int['Ո'];
  private int f;
  private static final String __OBFID = "CL_00002450";
  
  public bhw()
  {
    d = new BitSet(4096);
    
    f = 4096;
  }
  
  public void a(cj p_178606_1_)
  {
    d.set(c(p_178606_1_), true);
    f -= 1;
  }
  
  private static int c(cj p_178608_0_)
  {
    return a(p_178608_0_.n() & 0xF, p_178608_0_.o() & 0xF, p_178608_0_.p() & 0xF);
  }
  
  private static int a(int p_178605_0_, int p_178605_1_, int p_178605_2_)
  {
    return p_178605_0_ << 0 | p_178605_1_ << 8 | p_178605_2_ << 4;
  }
  
  public bhx a()
  {
    bhx var1 = new bhx();
    if (4096 - f < 256)
    {
      var1.a(true);
    }
    else if (f == 0)
    {
      var1.a(false);
    }
    else
    {
      int[] var2 = e;
      int var3 = var2.length;
      for (int var4 = 0; var4 < var3; var4++)
      {
        int var5 = var2[var4];
        if (!d.get(var5)) {
          var1.a(a(var5));
        }
      }
    }
    return var1;
  }
  
  public Set b(cj p_178609_1_)
  {
    return a(c(p_178609_1_));
  }
  
  private Set a(int p_178604_1_)
  {
    EnumSet var2 = EnumSet.noneOf(cq.class);
    
    ArrayDeque var3 = new ArrayDeque(384);
    
    var3.add(IntegerCache.valueOf(p_178604_1_));
    d.set(p_178604_1_, true);
    while (!var3.isEmpty())
    {
      int var4 = ((Integer)var3.poll()).intValue();
      a(var4, var2);
      
      cq[] var5 = cq.n;
      int var6 = var5.length;
      for (int var7 = 0; var7 < var6; var7++)
      {
        cq var8 = var5[var7];
        int var9 = a(var4, var8);
        if ((var9 >= 0) && (!d.get(var9)))
        {
          d.set(var9, true);
          
          var3.add(IntegerCache.valueOf(var9));
        }
      }
    }
    return var2;
  }
  
  private void a(int p_178610_1_, Set p_178610_2_)
  {
    int var3 = p_178610_1_ >> 0 & 0xF;
    if (var3 == 0) {
      p_178610_2_.add(cq.e);
    } else if (var3 == 15) {
      p_178610_2_.add(cq.f);
    }
    int var4 = p_178610_1_ >> 8 & 0xF;
    if (var4 == 0) {
      p_178610_2_.add(cq.a);
    } else if (var4 == 15) {
      p_178610_2_.add(cq.b);
    }
    int var5 = p_178610_1_ >> 4 & 0xF;
    if (var5 == 0) {
      p_178610_2_.add(cq.c);
    } else if (var5 == 15) {
      p_178610_2_.add(cq.d);
    }
  }
  
  private int a(int p_178603_1_, cq p_178603_2_)
  {
    switch (bhw.1.a[p_178603_2_.ordinal()])
    {
    case 1: 
      if ((p_178603_1_ >> 8 & 0xF) == 0) {
        return -1;
      }
      return p_178603_1_ - c;
    case 2: 
      if ((p_178603_1_ >> 8 & 0xF) == 15) {
        return -1;
      }
      return p_178603_1_ + c;
    case 3: 
      if ((p_178603_1_ >> 4 & 0xF) == 0) {
        return -1;
      }
      return p_178603_1_ - b;
    case 4: 
      if ((p_178603_1_ >> 4 & 0xF) == 15) {
        return -1;
      }
      return p_178603_1_ + b;
    case 5: 
      if ((p_178603_1_ >> 0 & 0xF) == 0) {
        return -1;
      }
      return p_178603_1_ - a;
    case 6: 
      if ((p_178603_1_ >> 0 & 0xF) == 15) {
        return -1;
      }
      return p_178603_1_ + a;
    }
    return -1;
  }
  
  static
  {
    boolean var0 = false;
    boolean var1 = true;
    int var2 = 0;
    for (int var3 = 0; var3 < 16; var3++) {
      for (int var4 = 0; var4 < 16; var4++) {
        for (int var5 = 0; var5 < 16; var5++) {
          if ((var3 == 0) || (var3 == 15) || (var4 == 0) || (var4 == 15) || (var5 == 0) || (var5 == 15)) {
            e[(var2++)] = a(var3, var4, var5);
          }
        }
      }
    }
  }
}
