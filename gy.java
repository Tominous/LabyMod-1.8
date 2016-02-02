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
    this.a = ☃;
    
    pr ☃ = ☃.c();
    switch (gy.1.a[☃.ordinal()])
    {
    case 1: 
      this.d = ☃.f();
      this.c = (☃ == null ? -1 : ☃.F());
      break;
    case 2: 
      this.b = ☃.h().F();
      this.c = (☃ == null ? -1 : ☃.F());
      this.e = ☃.b().c();
    }
  }
  
  public void a(em ☃)
    throws IOException
  {
    this.a = ((gy.a)☃.a(gy.a.class));
    if (this.a == gy.a.b)
    {
      this.d = ☃.e();
      this.c = ☃.readInt();
    }
    else if (this.a == gy.a.c)
    {
      this.b = ☃.e();
      this.c = ☃.readInt();
      this.e = ☃.c(32767);
    }
  }
  
  public void b(em ☃)
    throws IOException
  {
    ☃.a(this.a);
    if (this.a == gy.a.b)
    {
      ☃.b(this.d);
      ☃.writeInt(this.c);
    }
    else if (this.a == gy.a.c)
    {
      ☃.b(this.b);
      ☃.writeInt(this.c);
      ☃.a(this.e);
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
