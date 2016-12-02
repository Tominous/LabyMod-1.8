class adk$a
{
  private String a;
  private boolean b;
  private int c;
  private double d;
  private final adk.b e;
  
  public adk$a(String ☃, adk.b ☃)
  {
    this.e = ☃;
    a(☃);
  }
  
  public void a(String ☃)
  {
    this.a = ☃;
    this.b = Boolean.parseBoolean(☃);
    this.c = (this.b ? 1 : 0);
    try
    {
      this.c = Integer.parseInt(☃);
    }
    catch (NumberFormatException localNumberFormatException) {}
    try
    {
      this.d = Double.parseDouble(☃);
    }
    catch (NumberFormatException localNumberFormatException1) {}
  }
  
  public String a()
  {
    return this.a;
  }
  
  public boolean b()
  {
    return this.b;
  }
  
  public int c()
  {
    return this.c;
  }
  
  public adk.b e()
  {
    return this.e;
  }
}
