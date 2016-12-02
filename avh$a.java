public enum avh$a
{
  private final boolean S;
  private final boolean T;
  private final String U;
  private final float V;
  private float W;
  private float X;
  
  public static a a(int ☃)
  {
    for (a ☃ : ) {
      if (☃.c() == ☃) {
        return ☃;
      }
    }
    return null;
  }
  
  private avh$a(String ☃, boolean ☃, boolean ☃)
  {
    this(☃, ☃, ☃, 0.0F, 1.0F, 0.0F);
  }
  
  private avh$a(String ☃, boolean ☃, boolean ☃, float ☃, float ☃, float ☃)
  {
    this.U = ☃;
    this.S = ☃;
    this.T = ☃;
    this.W = ☃;
    this.X = ☃;
    this.V = ☃;
  }
  
  public boolean a()
  {
    return this.S;
  }
  
  public boolean b()
  {
    return this.T;
  }
  
  public int c()
  {
    return ordinal();
  }
  
  public String d()
  {
    return this.U;
  }
  
  public float f()
  {
    return this.X;
  }
  
  public void a(float ☃)
  {
    this.X = ☃;
  }
  
  public float c(float ☃)
  {
    return ns.a((e(☃) - this.W) / (this.X - this.W), 0.0F, 1.0F);
  }
  
  public float d(float ☃)
  {
    return e(this.W + (this.X - this.W) * ns.a(☃, 0.0F, 1.0F));
  }
  
  public float e(float ☃)
  {
    ☃ = f(☃);
    return ns.a(☃, this.W, this.X);
  }
  
  protected float f(float ☃)
  {
    if (this.V > 0.0F) {
      ☃ = this.V * Math.round(☃ / this.V);
    }
    return ☃;
  }
}
