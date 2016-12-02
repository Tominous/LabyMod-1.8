import java.util.Random;

public class xb
  extends wy
{
  public xb(adm ☃)
  {
    super(☃);
  }
  
  public xb(adm ☃, pr ☃)
  {
    super(☃, ☃);
  }
  
  public xb(adm ☃, double ☃, double ☃, double ☃)
  {
    super(☃, ☃, ☃, ☃);
  }
  
  protected float m()
  {
    return 0.07F;
  }
  
  protected float j()
  {
    return 0.7F;
  }
  
  protected float l()
  {
    return -20.0F;
  }
  
  protected void a(auh ☃)
  {
    if (!o.D)
    {
      o.b(2002, new cj(this), 0);
      
      int ☃ = 3 + o.s.nextInt(5) + o.s.nextInt(5);
      while (☃ > 0)
      {
        int ☃ = pp.a(☃);
        ☃ -= ☃;
        o.d(new pp(o, s, t, u, ☃));
      }
      J();
    }
  }
}
