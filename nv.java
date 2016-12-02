public class nv
{
  private float a;
  private float b;
  private float c;
  
  public float a(float ☃, float ☃)
  {
    a += ☃;
    
    ☃ = (a - b) * ☃;
    c += (☃ - c) * 0.5F;
    if (((☃ > 0.0F) && (☃ > c)) || ((☃ < 0.0F) && (☃ < c))) {
      ☃ = c;
    }
    b += ☃;
    
    return ☃;
  }
  
  public void a()
  {
    a = 0.0F;
    b = 0.0F;
    c = 0.0F;
  }
}
