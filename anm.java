public abstract class anm
{
  public static final float[] a = { 1.0F, 0.75F, 0.5F, 0.25F, 0.0F, 0.25F, 0.5F, 0.75F };
  protected adm b;
  private adr h;
  private String i;
  protected aec c;
  protected boolean d;
  protected boolean e;
  protected final float[] f = new float[16];
  protected int g;
  private final float[] j = new float[4];
  
  public final void a(adm ☃)
  {
    b = ☃;
    h = ☃.P().u();
    i = ☃.P().B();
    b();
    a();
  }
  
  protected void a()
  {
    float ☃ = 0.0F;
    for (int ☃ = 0; ☃ <= 15; ☃++)
    {
      float ☃ = 1.0F - ☃ / 15.0F;
      f[☃] = ((1.0F - ☃) / (☃ * 3.0F + 1.0F) * (1.0F - ☃) + ☃);
    }
  }
  
  protected void b()
  {
    adr ☃ = b.P().u();
    if (☃ == adr.c)
    {
      apz ☃ = apz.a(b.P().B());
      c = new aef(ady.a(☃.a(), ady.ad), 0.5F);
    }
    else if (☃ == adr.g)
    {
      c = new aef(ady.q, 0.0F);
    }
    else
    {
      c = new aec(b);
    }
  }
  
  public amv c()
  {
    if (h == adr.c) {
      return new anv(b, b.J(), b.P().s(), i);
    }
    if (h == adr.g) {
      return new anu(b);
    }
    if (h == adr.f) {
      return new aoa(b, b.J(), b.P().s(), i);
    }
    return new aoa(b, b.J(), b.P().s(), i);
  }
  
  public boolean a(int ☃, int ☃)
  {
    return b.c(new cj(☃, 0, ☃)) == afi.c;
  }
  
  public float a(long ☃, float ☃)
  {
    int ☃ = (int)(☃ % 24000L);
    float ☃ = (☃ + ☃) / 24000.0F - 0.25F;
    if (☃ < 0.0F) {
      ☃ += 1.0F;
    }
    if (☃ > 1.0F) {
      ☃ -= 1.0F;
    }
    float ☃ = ☃;
    ☃ = 1.0F - (float)((Math.cos(☃ * 3.141592653589793D) + 1.0D) / 2.0D);
    ☃ = ☃ + (☃ - ☃) / 3.0F;
    return ☃;
  }
  
  public int a(long ☃)
  {
    return (int)(☃ / 24000L % 8L + 8L) % 8;
  }
  
  public boolean d()
  {
    return true;
  }
  
  public float[] a(float ☃, float ☃)
  {
    float ☃ = 0.4F;
    float ☃ = ns.b(☃ * 3.1415927F * 2.0F) - 0.0F;
    float ☃ = -0.0F;
    if ((☃ >= ☃ - ☃) && (☃ <= ☃ + ☃))
    {
      float ☃ = (☃ - ☃) / ☃ * 0.5F + 0.5F;
      float ☃ = 1.0F - (1.0F - ns.a(☃ * 3.1415927F)) * 0.99F;
      ☃ *= ☃;
      j[0] = (☃ * 0.3F + 0.7F);
      j[1] = (☃ * ☃ * 0.7F + 0.2F);
      j[2] = (☃ * ☃ * 0.0F + 0.2F);
      j[3] = ☃;
      return j;
    }
    return null;
  }
  
  public aui b(float ☃, float ☃)
  {
    float ☃ = ns.b(☃ * 3.1415927F * 2.0F) * 2.0F + 0.5F;
    ☃ = ns.a(☃, 0.0F, 1.0F);
    
    float ☃ = 0.7529412F;
    float ☃ = 0.84705883F;
    float ☃ = 1.0F;
    ☃ *= (☃ * 0.94F + 0.06F);
    ☃ *= (☃ * 0.94F + 0.06F);
    ☃ *= (☃ * 0.91F + 0.09F);
    
    return new aui(☃, ☃, ☃);
  }
  
  public boolean e()
  {
    return true;
  }
  
  public static anm a(int ☃)
  {
    if (☃ == -1) {
      return new ann();
    }
    if (☃ == 0) {
      return new ano();
    }
    if (☃ == 1) {
      return new anp();
    }
    return null;
  }
  
  public float f()
  {
    return 128.0F;
  }
  
  public boolean g()
  {
    return true;
  }
  
  public cj h()
  {
    return null;
  }
  
  public int i()
  {
    if (h == adr.c) {
      return 4;
    }
    return b.F() + 1;
  }
  
  public double j()
  {
    if (h == adr.c) {
      return 1.0D;
    }
    return 0.03125D;
  }
  
  public boolean b(int ☃, int ☃)
  {
    return false;
  }
  
  public abstract String k();
  
  public abstract String l();
  
  public aec m()
  {
    return c;
  }
  
  public boolean n()
  {
    return d;
  }
  
  public boolean o()
  {
    return e;
  }
  
  public float[] p()
  {
    return f;
  }
  
  public int q()
  {
    return g;
  }
  
  public ams r()
  {
    return new ams();
  }
}
