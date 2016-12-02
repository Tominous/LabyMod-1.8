public class aea
{
  private static final aea.a a = new aea.a()
  {
    public int a(ady ☃, cj ☃)
    {
      return ☃.b(☃);
    }
  };
  private static final aea.a b = new aea.a()
  {
    public int a(ady ☃, cj ☃)
    {
      return ☃.c(☃);
    }
  };
  private static final aea.a c = new aea.a()
  {
    public int a(ady ☃, cj ☃)
    {
      return ☃.ar;
    }
  };
  
  private static int a(adq ☃, cj ☃, aea.a ☃)
  {
    int ☃ = 0;
    int ☃ = 0;
    int ☃ = 0;
    for (cj.a ☃ : cj.b(☃.a(-1, 0, -1), ☃.a(1, 0, 1)))
    {
      int ☃ = ☃.a(☃.b(☃), ☃);
      
      ☃ += ((☃ & 0xFF0000) >> 16);
      ☃ += ((☃ & 0xFF00) >> 8);
      ☃ += (☃ & 0xFF);
    }
    return (☃ / 9 & 0xFF) << 16 | (☃ / 9 & 0xFF) << 8 | ☃ / 9 & 0xFF;
  }
  
  public static int a(adq ☃, cj ☃)
  {
    return a(☃, ☃, a);
  }
  
  public static int b(adq ☃, cj ☃)
  {
    return a(☃, ☃, b);
  }
  
  public static int c(adq ☃, cj ☃)
  {
    return a(☃, ☃, c);
  }
  
  static abstract interface a
  {
    public abstract int a(ady paramady, cj paramcj);
  }
}
