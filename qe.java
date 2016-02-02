public abstract class qe
  implements qb
{
  private final qb a;
  private final String b;
  private final double c;
  private boolean d;
  
  protected qe(qb ☃, String ☃, double ☃)
  {
    this.a = ☃;
    this.b = ☃;
    this.c = ☃;
    if (☃ == null) {
      throw new IllegalArgumentException("Name cannot be null!");
    }
  }
  
  public String a()
  {
    return this.b;
  }
  
  public double b()
  {
    return this.c;
  }
  
  public boolean c()
  {
    return this.d;
  }
  
  public qe a(boolean ☃)
  {
    this.d = ☃;
    return this;
  }
  
  public qb d()
  {
    return this.a;
  }
  
  public int hashCode()
  {
    return this.b.hashCode();
  }
  
  public boolean equals(Object ☃)
  {
    return ((☃ instanceof qb)) && (this.b.equals(((qb)☃).a()));
  }
}
