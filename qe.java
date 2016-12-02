public abstract class qe
  implements qb
{
  private final qb a;
  private final String b;
  private final double c;
  private boolean d;
  
  protected qe(qb ☃, String ☃, double ☃)
  {
    a = ☃;
    b = ☃;
    c = ☃;
    if (☃ == null) {
      throw new IllegalArgumentException("Name cannot be null!");
    }
  }
  
  public String a()
  {
    return b;
  }
  
  public double b()
  {
    return c;
  }
  
  public boolean c()
  {
    return d;
  }
  
  public qe a(boolean ☃)
  {
    d = ☃;
    return this;
  }
  
  public qb d()
  {
    return a;
  }
  
  public int hashCode()
  {
    return b.hashCode();
  }
  
  public boolean equals(Object ☃)
  {
    return ((☃ instanceof qb)) && (b.equals(((qb)☃).a()));
  }
}
