class c$a
{
  private final String a;
  private final String b;
  
  public c$a(String ☃, Object ☃)
  {
    a = ☃;
    if (☃ == null)
    {
      b = "~~NULL~~";
    }
    else if ((☃ instanceof Throwable))
    {
      Throwable ☃ = (Throwable)☃;
      b = ("~~ERROR~~ " + ☃.getClass().getSimpleName() + ": " + ☃.getMessage());
    }
    else
    {
      b = ☃.toString();
    }
  }
  
  public String a()
  {
    return a;
  }
  
  public String b()
  {
    return b;
  }
}
