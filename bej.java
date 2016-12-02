import java.util.Random;

public class bej
  extends beb
{
  private static final Random a = new Random();
  private int az = 128;
  
  protected bej(adm ☃, double ☃, double ☃, double ☃, double ☃, double ☃, double ☃)
  {
    super(☃, ☃, ☃, ☃, 0.5D - a.nextDouble(), ☃, 0.5D - a.nextDouble());
    w *= 0.20000000298023224D;
    if ((☃ == 0.0D) && (☃ == 0.0D))
    {
      v *= 0.10000000149011612D;
      x *= 0.10000000149011612D;
    }
    h *= 0.75F;
    
    g = ((int)(8.0D / (Math.random() * 0.8D + 0.2D)));
    T = false;
  }
  
  public void a(bfd ☃, pk ☃, float ☃, float ☃, float ☃, float ☃, float ☃, float ☃)
  {
    float ☃ = (f + ☃) / g * 32.0F;
    ☃ = ns.a(☃, 0.0F, 1.0F);
    
    super.a(☃, ☃, ☃, ☃, ☃, ☃, ☃, ☃);
  }
  
  public void t_()
  {
    p = s;
    q = t;
    r = u;
    if (f++ >= g) {
      J();
    }
    k(az + (7 - f * 8 / g));
    
    w += 0.004D;
    d(v, w, x);
    if (t == q)
    {
      v *= 1.1D;
      x *= 1.1D;
    }
    v *= 0.9599999785423279D;
    w *= 0.9599999785423279D;
    x *= 0.9599999785423279D;
    if (C)
    {
      v *= 0.699999988079071D;
      x *= 0.699999988079071D;
    }
  }
  
  public void a(int ☃)
  {
    az = ☃;
  }
  
  public static class d
    implements bed
  {
    public beb a(int ☃, adm ☃, double ☃, double ☃, double ☃, double ☃, double ☃, double ☃, int... ☃)
    {
      return new bej(☃, ☃, ☃, ☃, ☃, ☃, ☃);
    }
  }
  
  public static class c
    implements bed
  {
    public beb a(int ☃, adm ☃, double ☃, double ☃, double ☃, double ☃, double ☃, double ☃, int... ☃)
    {
      beb ☃ = new bej(☃, ☃, ☃, ☃, ☃, ☃, ☃);
      ☃.b((float)☃, (float)☃, (float)☃);
      return ☃;
    }
  }
  
  public static class a
    implements bed
  {
    public beb a(int ☃, adm ☃, double ☃, double ☃, double ☃, double ☃, double ☃, double ☃, int... ☃)
    {
      beb ☃ = new bej(☃, ☃, ☃, ☃, ☃, ☃, ☃);
      ☃.i(0.15F);
      ☃.b((float)☃, (float)☃, (float)☃);
      return ☃;
    }
  }
  
  public static class e
    implements bed
  {
    public beb a(int ☃, adm ☃, double ☃, double ☃, double ☃, double ☃, double ☃, double ☃, int... ☃)
    {
      beb ☃ = new bej(☃, ☃, ☃, ☃, ☃, ☃, ☃);
      ((bej)☃).a(144);
      float ☃ = s.nextFloat() * 0.5F + 0.35F;
      ☃.b(1.0F * ☃, 0.0F * ☃, 1.0F * ☃);
      return ☃;
    }
  }
  
  public static class b
    implements bed
  {
    public beb a(int ☃, adm ☃, double ☃, double ☃, double ☃, double ☃, double ☃, double ☃, int... ☃)
    {
      beb ☃ = new bej(☃, ☃, ☃, ☃, ☃, ☃, ☃);
      ((bej)☃).a(144);
      return ☃;
    }
  }
}
