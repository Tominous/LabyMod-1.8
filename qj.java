public class qj
  extends qe
{
  private final double a;
  private final double b;
  private String c;
  
  public qj(qb ☃, String ☃, double ☃, double ☃, double ☃)
  {
    super(☃, ☃, ☃);
    a = ☃;
    b = ☃;
    if (☃ > ☃) {
      throw new IllegalArgumentException("Minimum value cannot be bigger than maximum value!");
    }
    if (☃ < ☃) {
      throw new IllegalArgumentException("Default value cannot be lower than minimum value!");
    }
    if (☃ > ☃) {
      throw new IllegalArgumentException("Default value cannot be bigger than maximum value!");
    }
  }
  
  public qj a(String ☃)
  {
    c = ☃;
    return this;
  }
  
  public String g()
  {
    return c;
  }
  
  public double a(double ☃)
  {
    ☃ = ns.a(☃, a, b);
    
    return ☃;
  }
}
