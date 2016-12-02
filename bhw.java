import com.google.common.collect.Lists;
import java.util.BitSet;
import java.util.EnumSet;
import java.util.Queue;
import java.util.Set;

public class bhw
{
  private static final int a = (int)Math.pow(16.0D, 0.0D);
  private static final int b = (int)Math.pow(16.0D, 1.0D);
  private static final int c = (int)Math.pow(16.0D, 2.0D);
  private final BitSet d = new BitSet(4096);
  private static final int[] e = new int['Ո'];
  
  static
  {
    int ☃ = 0;
    int ☃ = 15;
    
    int ☃ = 0;
    for (int ☃ = 0; ☃ < 16; ☃++) {
      for (int ☃ = 0; ☃ < 16; ☃++) {
        for (int ☃ = 0; ☃ < 16; ☃++) {
          if ((☃ == 0) || (☃ == 15) || (☃ == 0) || (☃ == 15) || (☃ == 0) || (☃ == 15)) {
            e[(☃++)] = a(☃, ☃, ☃);
          }
        }
      }
    }
  }
  
  private int f = 4096;
  
  public void a(cj ☃)
  {
    this.d.set(c(☃), true);
    this.f -= 1;
  }
  
  private static int c(cj ☃)
  {
    return a(☃.n() & 0xF, ☃.o() & 0xF, ☃.p() & 0xF);
  }
  
  private static int a(int ☃, int ☃, int ☃)
  {
    return ☃ << 0 | ☃ << 8 | ☃ << 4;
  }
  
  public bhx a()
  {
    bhx ☃ = new bhx();
    if (4096 - this.f < 256) {
      ☃.a(true);
    } else if (this.f == 0) {
      ☃.a(false);
    } else {
      for (int ☃ : e) {
        if (!this.d.get(☃)) {
          ☃.a(a(☃));
        }
      }
    }
    return ☃;
  }
  
  public Set<cq> b(cj ☃)
  {
    return a(c(☃));
  }
  
  private Set<cq> a(int ☃)
  {
    Set<cq> ☃ = EnumSet.noneOf(cq.class);
    
    Queue<Integer> ☃ = Lists.newLinkedList();
    ☃.add(nl.a(☃));
    this.d.set(☃, true);
    while (!☃.isEmpty())
    {
      int ☃ = ((Integer)☃.poll()).intValue();
      a(☃, ☃);
      for (cq ☃ : cq.values())
      {
        int ☃ = a(☃, ☃);
        if ((☃ >= 0) && (!this.d.get(☃)))
        {
          this.d.set(☃, true);
          ☃.add(nl.a(☃));
        }
      }
    }
    return ☃;
  }
  
  private void a(int ☃, Set<cq> ☃)
  {
    int ☃ = ☃ >> 0 & 0xF;
    if (☃ == 0) {
      ☃.add(cq.e);
    } else if (☃ == 15) {
      ☃.add(cq.f);
    }
    int ☃ = ☃ >> 8 & 0xF;
    if (☃ == 0) {
      ☃.add(cq.a);
    } else if (☃ == 15) {
      ☃.add(cq.b);
    }
    int ☃ = ☃ >> 4 & 0xF;
    if (☃ == 0) {
      ☃.add(cq.c);
    } else if (☃ == 15) {
      ☃.add(cq.d);
    }
  }
  
  private int a(int ☃, cq ☃)
  {
    switch (bhw.1.a[☃.ordinal()])
    {
    case 1: 
      if ((☃ >> 8 & 0xF) == 0) {
        return -1;
      }
      return ☃ - c;
    case 2: 
      if ((☃ >> 8 & 0xF) == 15) {
        return -1;
      }
      return ☃ + c;
    case 3: 
      if ((☃ >> 4 & 0xF) == 0) {
        return -1;
      }
      return ☃ - b;
    case 4: 
      if ((☃ >> 4 & 0xF) == 15) {
        return -1;
      }
      return ☃ + b;
    case 5: 
      if ((☃ >> 0 & 0xF) == 0) {
        return -1;
      }
      return ☃ - a;
    case 6: 
      if ((☃ >> 0 & 0xF) == 15) {
        return -1;
      }
      return ☃ + a;
    }
    return -1;
  }
}
