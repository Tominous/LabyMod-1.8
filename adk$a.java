class adk$a
{
  private String a;
  private boolean b;
  private int c;
  private double d;
  private final adk.b e;
  private static final String __OBFID = "CL_00000137";
  
  public adk$a(String value, adk.b type)
  {
    this.e = type;
    a(value);
  }
  
  public void a(String value)
  {
    this.a = value;
    if (value != null)
    {
      if (value.equals("false"))
      {
        this.b = false;
        return;
      }
      if (value.equals("true"))
      {
        this.b = true;
        return;
      }
    }
    this.b = Boolean.parseBoolean(value);
    this.c = (this.b ? 1 : 0);
    try
    {
      this.c = Integer.parseInt(value);
    }
    catch (NumberFormatException var4) {}
    try
    {
      this.d = Double.parseDouble(value);
    }
    catch (NumberFormatException var3) {}
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
