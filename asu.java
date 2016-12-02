public class asu
{
  private asv[] a = new asv['Ѐ'];
  private int b;
  
  public asv a(asv ☃)
  {
    if (☃.d >= 0) {
      throw new IllegalStateException("OW KNOWS!");
    }
    if (this.b == this.a.length)
    {
      asv[] ☃ = new asv[this.b << 1];
      System.arraycopy(this.a, 0, ☃, 0, this.b);
      this.a = ☃;
    }
    this.a[this.b] = ☃;
    ☃.d = this.b;
    a(this.b++);
    
    return ☃;
  }
  
  public void a()
  {
    this.b = 0;
  }
  
  public asv c()
  {
    asv ☃ = this.a[0];
    this.a[0] = this.a[(--this.b)];
    this.a[this.b] = null;
    if (this.b > 0) {
      b(0);
    }
    ☃.d = -1;
    return ☃;
  }
  
  public void a(asv ☃, float ☃)
  {
    float ☃ = ☃.g;
    ☃.g = ☃;
    if (☃ < ☃) {
      a(☃.d);
    } else {
      b(☃.d);
    }
  }
  
  private void a(int ☃)
  {
    asv ☃ = this.a[☃];
    float ☃ = ☃.g;
    while (☃ > 0)
    {
      int ☃ = ☃ - 1 >> 1;
      asv ☃ = this.a[☃];
      if (☃ >= ☃.g) {
        break;
      }
      this.a[☃] = ☃;
      ☃.d = ☃;
      ☃ = ☃;
    }
    this.a[☃] = ☃;
    ☃.d = ☃;
  }
  
  private void b(int ☃)
  {
    asv ☃ = this.a[☃];
    float ☃ = ☃.g;
    for (;;)
    {
      int ☃ = 1 + (☃ << 1);
      int ☃ = ☃ + 1;
      if (☃ >= this.b) {
        break;
      }
      asv ☃ = this.a[☃];
      float ☃ = ☃.g;
      float ☃;
      asv ☃;
      float ☃;
      if (☃ >= this.b)
      {
        asv ☃ = null;
        ☃ = Float.POSITIVE_INFINITY;
      }
      else
      {
        ☃ = this.a[☃];
        ☃ = ☃.g;
      }
      if (☃ < ☃)
      {
        if (☃ >= ☃) {
          break;
        }
        this.a[☃] = ☃;
        ☃.d = ☃;
        ☃ = ☃;
      }
      else
      {
        if (☃ >= ☃) {
          break;
        }
        this.a[☃] = ☃;
        ☃.d = ☃;
        ☃ = ☃;
      }
    }
    this.a[☃] = ☃;
    ☃.d = ☃;
  }
  
  public boolean e()
  {
    return this.b == 0;
  }
}
