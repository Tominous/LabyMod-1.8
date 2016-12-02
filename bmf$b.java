import com.google.common.collect.Lists;
import java.util.List;

public class bmf$b
{
  private final int a;
  private final int b;
  private final int c;
  private final int d;
  private List<b> e;
  private bmf.a f;
  
  public bmf$b(int ☃, int ☃, int ☃, int ☃)
  {
    this.a = ☃;
    this.b = ☃;
    this.c = ☃;
    this.d = ☃;
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
  
  public boolean a(bmf.a ☃)
  {
    if (this.f != null) {
      return false;
    }
    int ☃ = ☃.b();
    int ☃ = ☃.c();
    if ((☃ > this.c) || (☃ > this.d)) {
      return false;
    }
    if ((☃ == this.c) && (☃ == this.d))
    {
      this.f = ☃;
      return true;
    }
    if (this.e == null)
    {
      this.e = Lists.newArrayListWithCapacity(1);
      
      this.e.add(new b(this.a, this.b, ☃, ☃));
      
      int ☃ = this.c - ☃;
      int ☃ = this.d - ☃;
      if ((☃ > 0) && (☃ > 0))
      {
        int ☃ = Math.max(this.d, ☃);
        int ☃ = Math.max(this.c, ☃);
        if (☃ >= ☃)
        {
          this.e.add(new b(this.a, this.b + ☃, ☃, ☃));
          this.e.add(new b(this.a + ☃, this.b, ☃, this.d));
        }
        else
        {
          this.e.add(new b(this.a + ☃, this.b, ☃, ☃));
          this.e.add(new b(this.a, this.b + ☃, this.c, ☃));
        }
      }
      else if (☃ == 0)
      {
        this.e.add(new b(this.a, this.b + ☃, ☃, ☃));
      }
      else if (☃ == 0)
      {
        this.e.add(new b(this.a + ☃, this.b, ☃, ☃));
      }
    }
    for (b ☃ : this.e) {
      if (☃.a(☃)) {
        return true;
      }
    }
    return false;
  }
  
  public void a(List<b> ☃)
  {
    if (this.f != null) {
      ☃.add(this);
    } else if (this.e != null) {
      for (b ☃ : this.e) {
        ☃.a(☃);
      }
    }
  }
  
  public String toString()
  {
    return "Slot{originX=" + this.a + ", originY=" + this.b + ", width=" + this.c + ", height=" + this.d + ", texture=" + this.f + ", subSlots=" + this.e + '}';
  }
}
