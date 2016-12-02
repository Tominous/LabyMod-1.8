import net.minecraft.realms.RealmsButton;

public class awp
  extends avs
{
  private RealmsButton o;
  
  public awp(RealmsButton ☃, int ☃, int ☃, int ☃, String ☃)
  {
    super(☃, ☃, ☃, ☃);
    o = ☃;
  }
  
  public awp(RealmsButton ☃, int ☃, int ☃, int ☃, String ☃, int ☃, int ☃)
  {
    super(☃, ☃, ☃, ☃, ☃, ☃);
    o = ☃;
  }
  
  public int c()
  {
    return k;
  }
  
  public boolean d()
  {
    return l;
  }
  
  public void b(boolean ☃)
  {
    l = ☃;
  }
  
  public void a(String ☃)
  {
    j = ☃;
  }
  
  public int b()
  {
    return super.b();
  }
  
  public int e()
  {
    return i;
  }
  
  public boolean c(ave ☃, int ☃, int ☃)
  {
    if (super.c(☃, ☃, ☃)) {
      o.clicked(☃, ☃);
    }
    return super.c(☃, ☃, ☃);
  }
  
  public void a(int ☃, int ☃)
  {
    o.released(☃, ☃);
  }
  
  public void b(ave ☃, int ☃, int ☃)
  {
    o.renderBg(☃, ☃);
  }
  
  public RealmsButton f()
  {
    return o;
  }
  
  public int a(boolean ☃)
  {
    return o.getYImage(☃);
  }
  
  public int c(boolean ☃)
  {
    return super.a(☃);
  }
  
  public int g()
  {
    return g;
  }
}
