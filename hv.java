import java.io.IOException;

public class hv
  implements ff<fj>
{
  private hv.a a;
  private eu b;
  private int c;
  private int d;
  private int e;
  
  public hv() {}
  
  public hv(hv.a ☃, eu ☃)
  {
    this(☃, ☃, -1, -1, -1);
  }
  
  public hv(int ☃, int ☃, int ☃)
  {
    this(hv.a.c, null, ☃, ☃, ☃);
  }
  
  public hv(hv.a ☃, eu ☃, int ☃, int ☃, int ☃)
  {
    a = ☃;
    b = ☃;
    c = ☃;
    d = ☃;
    e = ☃;
  }
  
  public void a(em ☃)
    throws IOException
  {
    a = ((hv.a)☃.a(hv.a.class));
    if ((a == hv.a.a) || (a == hv.a.b)) {
      b = ☃.d();
    }
    if (a == hv.a.c)
    {
      c = ☃.readInt();
      d = ☃.readInt();
      e = ☃.readInt();
    }
  }
  
  public void b(em ☃)
    throws IOException
  {
    ☃.a(a);
    if ((a == hv.a.a) || (a == hv.a.b)) {
      ☃.a(b);
    }
    if (a == hv.a.c)
    {
      ☃.writeInt(c);
      ☃.writeInt(d);
      ☃.writeInt(e);
    }
  }
  
  public void a(fj ☃)
  {
    ☃.a(this);
  }
  
  public hv.a a()
  {
    return a;
  }
  
  public eu b()
  {
    return b;
  }
  
  public int c()
  {
    return c;
  }
  
  public int d()
  {
    return d;
  }
  
  public int e()
  {
    return e;
  }
  
  public static enum a
  {
    private a() {}
    
    public static a a(String ☃)
    {
      for (a ☃ : ) {
        if (☃.name().equalsIgnoreCase(☃)) {
          return ☃;
        }
      }
      return a;
    }
    
    public static String[] a()
    {
      String[] ☃ = new String[values().length];
      int ☃ = 0;
      for (a ☃ : values()) {
        ☃[(☃++)] = ☃.name().toLowerCase();
      }
      return ☃;
    }
  }
}
