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
    e = type;
    a(value);
  }
  
  public void a(String value)
  {
    a = value;
    if (value != null)
    {
      if (value.equals("false"))
      {
        b = false;
        return;
      }
      if (value.equals("true"))
      {
        b = true;
        return;
      }
    }
    b = Boolean.parseBoolean(value);
    c = (b ? 1 : 0);
    try
    {
      c = Integer.parseInt(value);
    }
    catch (NumberFormatException var4) {}
    try
    {
      d = Double.parseDouble(value);
    }
    catch (NumberFormatException var3) {}
  }
  
  public String a()
  {
    return a;
  }
  
  public boolean b()
  {
    return b;
  }
  
  public int c()
  {
    return c;
  }
  
  public adk.b e()
  {
    return e;
  }
}
