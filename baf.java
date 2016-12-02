import com.google.common.base.Objects;
import com.google.common.collect.Lists;
import java.util.List;

public class baf
{
  private static final bah b = new baf.a(null);
  private static final bah c = new baf.b(-1, true);
  private static final bah d = new baf.b(1, true);
  private static final bah e = new baf.b(1, false);
  public static final bah a = new bah()
  {
    public void a(baf ☃) {}
    
    public eu A_()
    {
      return new fa("");
    }
    
    public void a(float ☃, int ☃) {}
    
    public boolean B_()
    {
      return false;
    }
  };
  private final bai f;
  private final List<baj> g = Lists.newArrayList();
  private bag h;
  private int i = -1;
  private int j;
  
  public baf(bai ☃)
  {
    this.h = new bae();
    this.f = ☃;
  }
  
  public bah a(int ☃)
  {
    int ☃ = ☃ + this.j * 6;
    if ((this.j > 0) && (☃ == 0)) {
      return c;
    }
    if (☃ == 7)
    {
      if (☃ < this.h.a().size()) {
        return d;
      }
      return e;
    }
    if (☃ == 8) {
      return b;
    }
    if ((☃ < 0) || (☃ >= this.h.a().size())) {
      return a;
    }
    return (bah)Objects.firstNonNull(this.h.a().get(☃), a);
  }
  
  public List<bah> a()
  {
    List<bah> ☃ = Lists.newArrayList();
    for (int ☃ = 0; ☃ <= 8; ☃++) {
      ☃.add(a(☃));
    }
    return ☃;
  }
  
  public bah b()
  {
    return a(this.i);
  }
  
  public bag c()
  {
    return this.h;
  }
  
  public void b(int ☃)
  {
    bah ☃ = a(☃);
    if (☃ != a) {
      if ((this.i == ☃) && (☃.B_())) {
        ☃.a(this);
      } else {
        this.i = ☃;
      }
    }
  }
  
  public void d()
  {
    this.f.a(this);
  }
  
  public int e()
  {
    return this.i;
  }
  
  public void a(bag ☃)
  {
    this.g.add(f());
    
    this.h = ☃;
    this.i = -1;
    this.j = 0;
  }
  
  public baj f()
  {
    return new baj(this.h, a(), this.i);
  }
  
  static class a
    implements bah
  {
    public void a(baf ☃)
    {
      ☃.d();
    }
    
    public eu A_()
    {
      return new fa("Close menu");
    }
    
    public void a(float ☃, int ☃)
    {
      ave.A().P().a(awm.a);
      avp.a(0, 0, 128.0F, 0.0F, 16, 16, 256.0F, 256.0F);
    }
    
    public boolean B_()
    {
      return true;
    }
  }
  
  static class b
    implements bah
  {
    private final int a;
    private final boolean b;
    
    public b(int ☃, boolean ☃)
    {
      this.a = ☃;
      this.b = ☃;
    }
    
    public void a(baf ☃)
    {
      baf.a(☃, this.a);
    }
    
    public eu A_()
    {
      if (this.a < 0) {
        return new fa("Previous Page");
      }
      return new fa("Next Page");
    }
    
    public void a(float ☃, int ☃)
    {
      ave.A().P().a(awm.a);
      if (this.a < 0) {
        avp.a(0, 0, 144.0F, 0.0F, 16, 16, 256.0F, 256.0F);
      } else {
        avp.a(0, 0, 160.0F, 0.0F, 16, 16, 256.0F, 256.0F);
      }
    }
    
    public boolean B_()
    {
      return this.b;
    }
  }
}
