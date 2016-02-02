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
    this.a = ☃;
    this.b = ☃;
    this.c = ☃;
    this.d = ☃;
    this.e = ☃;
  }
  
  public void a(em ☃)
    throws IOException
  {
    this.a = ((hv.a)☃.a(hv.a.class));
    if ((this.a == hv.a.a) || (this.a == hv.a.b)) {
      this.b = ☃.d();
    }
    if (this.a == hv.a.c)
    {
      this.c = ☃.readInt();
      this.d = ☃.readInt();
      this.e = ☃.readInt();
    }
  }
  
  public void b(em ☃)
    throws IOException
  {
    ☃.a(this.a);
    if ((this.a == hv.a.a) || (this.a == hv.a.b)) {
      ☃.a(this.b);
    }
    if (this.a == hv.a.c)
    {
      ☃.writeInt(this.c);
      ☃.writeInt(this.d);
      ☃.writeInt(this.e);
    }
  }
  
  public void a(fj ☃)
  {
    ☃.a(this);
  }
  
  public hv.a a()
  {
    return this.a;
  }
  
  public eu b()
  {
    return this.b;
  }
  
  public int c()
  {
    return this.c;
  }
  
  public int d()
  {
    return this.d;
  }
  
  public int e()
  {
    return this.e;
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
