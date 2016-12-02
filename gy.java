import java.io.IOException;

public class gy
  implements ff<fj>
{
  public gy.a a;
  public int b;
  public int c;
  public int d;
  public String e;
  
  public gy() {}
  
  public gy(ov ☃, gy.a ☃)
  {
    a = ☃;
    
    pr ☃ = ☃.c();
    switch (gy.1.a[☃.ordinal()])
    {
    case 1: 
      d = ☃.f();
      c = (☃ == null ? -1 : ☃.F());
      break;
    case 2: 
      b = ☃.h().F();
      c = (☃ == null ? -1 : ☃.F());
      e = ☃.b().c();
    }
  }
  
  public void a(em ☃)
    throws IOException
  {
    a = ((gy.a)☃.a(gy.a.class));
    if (a == gy.a.b)
    {
      d = ☃.e();
      c = ☃.readInt();
    }
    else if (a == gy.a.c)
    {
      b = ☃.e();
      c = ☃.readInt();
      e = ☃.c(32767);
    }
  }
  
  public void b(em ☃)
    throws IOException
  {
    ☃.a(a);
    if (a == gy.a.b)
    {
      ☃.b(d);
      ☃.writeInt(c);
    }
    else if (a == gy.a.c)
    {
      ☃.b(b);
      ☃.writeInt(c);
      ☃.a(e);
    }
  }
  
  public void a(fj ☃)
  {
    ☃.a(this);
  }
  
  public static enum a
  {
    private a() {}
  }
}
