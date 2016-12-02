import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

public class bmf
{
  private final int a;
  private final Set<bmf.a> b = Sets.newHashSetWithExpectedSize(256);
  private final List<bmf.b> c = Lists.newArrayListWithCapacity(256);
  private int d;
  private int e;
  private final int f;
  private final int g;
  private final boolean h;
  private final int i;
  
  public bmf(int ☃, int ☃, boolean ☃, int ☃, int ☃)
  {
    this.a = ☃;
    this.f = ☃;
    this.g = ☃;
    this.h = ☃;
    this.i = ☃;
  }
  
  public int a()
  {
    return this.d;
  }
  
  public int b()
  {
    return this.e;
  }
  
  public void a(bmi ☃)
  {
    bmf.a ☃ = new bmf.a(☃, this.a);
    if (this.i > 0) {
      ☃.a(this.i);
    }
    this.b.add(☃);
  }
  
  public void c()
  {
    bmf.a[] ☃ = (bmf.a[])this.b.toArray(new bmf.a[this.b.size()]);
    Arrays.sort(☃);
    for (bmf.a ☃ : ☃) {
      if (!a(☃))
      {
        String ☃ = String.format("Unable to fit: %s - size: %dx%d - Maybe try a lowerresolution resourcepack?", new Object[] { ☃.a().i(), Integer.valueOf(☃.a().c()), Integer.valueOf(☃.a().d()) });
        
        throw new bmg(☃, ☃);
      }
    }
    if (this.h)
    {
      this.d = ns.b(this.d);
      this.e = ns.b(this.e);
    }
  }
  
  public List<bmi> d()
  {
    List<bmf.b> ☃ = Lists.newArrayList();
    for (bmf.b ☃ : this.c) {
      ☃.a(☃);
    }
    List<bmi> ☃ = Lists.newArrayList();
    for (bmf.b ☃ : ☃)
    {
      bmf.a ☃ = ☃.a();
      
      bmi ☃ = ☃.a();
      ☃.a(this.d, this.e, ☃.b(), ☃.c(), ☃.e());
      
      ☃.add(☃);
    }
    return ☃;
  }
  
  private static int b(int ☃, int ☃)
  {
    return (☃ >> ☃) + ((☃ & (1 << ☃) - 1) == 0 ? 0 : 1) << ☃;
  }
  
  private boolean a(bmf.a ☃)
  {
    for (int ☃ = 0; ☃ < this.c.size(); ☃++)
    {
      if (((bmf.b)this.c.get(☃)).a(☃)) {
        return true;
      }
      ☃.d();
      if (((bmf.b)this.c.get(☃)).a(☃)) {
        return true;
      }
      ☃.d();
    }
    return b(☃);
  }
  
  private boolean b(bmf.a ☃)
  {
    int ☃ = Math.min(☃.b(), ☃.c());
    boolean ☃ = (this.d == 0) && (this.e == 0);
    boolean ☃;
    boolean ☃;
    if (this.h)
    {
      int ☃ = ns.b(this.d);
      int ☃ = ns.b(this.e);
      int ☃ = ns.b(this.d + ☃);
      int ☃ = ns.b(this.e + ☃);
      
      boolean ☃ = ☃ <= this.f;
      boolean ☃ = ☃ <= this.g;
      if ((!☃) && (!☃)) {
        return false;
      }
      boolean ☃ = ☃ != ☃;
      boolean ☃ = ☃ != ☃;
      boolean ☃;
      if ((☃ ^ ☃)) {
        ☃ = !☃;
      } else {
        ☃ = (☃) && (☃ <= ☃);
      }
    }
    else
    {
      boolean ☃ = this.d + ☃ <= this.f;
      boolean ☃ = this.e + ☃ <= this.g;
      if ((!☃) && (!☃)) {
        return false;
      }
      ☃ = (☃) && ((☃) || (this.d <= this.e));
    }
    int ☃ = Math.max(☃.b(), ☃.c());
    if (ns.b((☃ ? this.e : this.d) + ☃) > (☃ ? this.g : this.f)) {
      return false;
    }
    bmf.b ☃;
    if (☃)
    {
      if (☃.b() > ☃.c()) {
        ☃.d();
      }
      if (this.e == 0) {
        this.e = ☃.c();
      }
      bmf.b ☃ = new bmf.b(this.d, 0, ☃.b(), this.e);
      this.d += ☃.b();
    }
    else
    {
      ☃ = new bmf.b(0, this.e, this.d, ☃.c());
      this.e += ☃.c();
    }
    ☃.a(☃);
    this.c.add(☃);
    
    return true;
  }
  
  public static class a
    implements Comparable<a>
  {
    private final bmi a;
    private final int b;
    private final int c;
    private final int d;
    private boolean e;
    private float f = 1.0F;
    
    public a(bmi ☃, int ☃)
    {
      this.a = ☃;
      this.b = ☃.c();
      this.c = ☃.d();
      this.d = ☃;
      
      this.e = (bmf.a(this.c, ☃) > bmf.a(this.b, ☃));
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
    
    public void a(int ☃)
    {
      if ((this.b <= ☃) || (this.c <= ☃)) {
        return;
      }
      this.f = (☃ / Math.min(this.b, this.c));
    }
    
    public String toString()
    {
      return "Holder{width=" + this.b + ", height=" + this.c + '}';
    }
    
    public int a(a ☃)
    {
      int ☃;
      int ☃;
      if (c() == ☃.c())
      {
        if (b() == ☃.b())
        {
          if (this.a.i() == null) {
            return ☃.a.i() == null ? 0 : -1;
          }
          return this.a.i().compareTo(☃.a.i());
        }
        ☃ = b() < ☃.b() ? 1 : -1;
      }
      else
      {
        ☃ = c() < ☃.c() ? 1 : -1;
      }
      return ☃;
    }
  }
  
  public static class b
  {
    private final int a;
    private final int b;
    private final int c;
    private final int d;
    private List<b> e;
    private bmf.a f;
    
    public b(int ☃, int ☃, int ☃, int ☃)
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
}
