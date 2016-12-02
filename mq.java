import java.util.List;

public class mq
  extends mw
{
  public final int a;
  public final int b;
  public final mq c;
  private final String k;
  private ms l;
  public final zx d;
  private boolean m;
  
  public mq(String ☃, String ☃, int ☃, int ☃, zw ☃, mq ☃)
  {
    this(☃, ☃, ☃, ☃, new zx(☃), ☃);
  }
  
  public mq(String ☃, String ☃, int ☃, int ☃, afh ☃, mq ☃)
  {
    this(☃, ☃, ☃, ☃, new zx(☃), ☃);
  }
  
  public mq(String ☃, String ☃, int ☃, int ☃, zx ☃, mq ☃)
  {
    super(☃, new fb("achievement." + ☃, new Object[0]));
    d = ☃;
    
    k = ("achievement." + ☃ + ".desc");
    a = ☃;
    b = ☃;
    if (☃ < mr.a) {
      mr.a = ☃;
    }
    if (☃ < mr.b) {
      mr.b = ☃;
    }
    if (☃ > mr.c) {
      mr.c = ☃;
    }
    if (☃ > mr.d) {
      mr.d = ☃;
    }
    c = ☃;
  }
  
  public mq a()
  {
    f = true;
    return this;
  }
  
  public mq b()
  {
    m = true;
    return this;
  }
  
  public mq c()
  {
    super.h();
    
    mr.e.add(this);
    
    return this;
  }
  
  public boolean d()
  {
    return true;
  }
  
  public eu e()
  {
    eu ☃ = super.e();
    ☃.b().a(g() ? a.f : a.k);
    return ☃;
  }
  
  public mq a(Class<? extends mz> ☃)
  {
    return (mq)super.b(☃);
  }
  
  public String f()
  {
    if (l != null) {
      return l.a(di.a(k));
    }
    return di.a(k);
  }
  
  public mq a(ms ☃)
  {
    l = ☃;
    return this;
  }
  
  public boolean g()
  {
    return m;
  }
}
