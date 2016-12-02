public class asu
{
  private asv[] a = new asv['Ѐ'];
  private int b;
  
  public asv a(asv ☃)
  {
    if (d >= 0) {
      throw new IllegalStateException("OW KNOWS!");
    }
    if (b == a.length)
    {
      asv[] ☃ = new asv[b << 1];
      System.arraycopy(a, 0, ☃, 0, b);
      a = ☃;
    }
    a[b] = ☃;
    d = b;
    a(b++);
    
    return ☃;
  }
  
  public void a()
  {
    b = 0;
  }
  
  public asv c()
  {
    asv ☃ = a[0];
    a[0] = a[(--b)];
    a[b] = null;
    if (b > 0) {
      b(0);
    }
    d = -1;
    return ☃;
  }
  
  public void a(asv ☃, float ☃)
  {
    float ☃ = g;
    g = ☃;
    if (☃ < ☃) {
      a(d);
    } else {
      b(d);
    }
  }
  
  private void a(int ☃)
  {
    asv ☃ = a[☃];
    float ☃ = g;
    while (☃ > 0)
    {
      int ☃ = ☃ - 1 >> 1;
      asv ☃ = a[☃];
      if (☃ >= g) {
        break;
      }
      a[☃] = ☃;
      d = ☃;
      ☃ = ☃;
    }
    a[☃] = ☃;
    d = ☃;
  }
  
  private void b(int ☃)
  {
    asv ☃ = a[☃];
    float ☃ = g;
    for (;;)
    {
      int ☃ = 1 + (☃ << 1);
      int ☃ = ☃ + 1;
      if (☃ >= b) {
        break;
      }
      asv ☃ = a[☃];
      float ☃ = g;
      float ☃;
      asv ☃;
      float ☃;
      if (☃ >= b)
      {
        asv ☃ = null;
        ☃ = Float.POSITIVE_INFINITY;
      }
      else
      {
        ☃ = a[☃];
        ☃ = g;
      }
      if (☃ < ☃)
      {
        if (☃ >= ☃) {
          break;
        }
        a[☃] = ☃;
        d = ☃;
        ☃ = ☃;
      }
      else
      {
        if (☃ >= ☃) {
          break;
        }
        a[☃] = ☃;
        d = ☃;
        ☃ = ☃;
      }
    }
    a[☃] = ☃;
    d = ☃;
  }
  
  public boolean e()
  {
    return b == 0;
  }
}
