import java.io.IOException;

public class hg
  implements ff<fj>
{
  private hg.a a;
  private int b;
  private double c;
  private double d;
  private double e;
  private double f;
  private long g;
  private int h;
  private int i;
  
  public hg() {}
  
  public hg(ams ☃, hg.a ☃)
  {
    this.a = ☃;
    this.c = ☃.f();
    this.d = ☃.g();
    this.f = ☃.h();
    this.e = ☃.j();
    this.g = ☃.i();
    this.b = ☃.l();
    this.i = ☃.q();
    this.h = ☃.p();
  }
  
  public void a(em ☃)
    throws IOException
  {
    this.a = ((hg.a)☃.a(hg.a.class));
    switch (hg.1.a[this.a.ordinal()])
    {
    case 1: 
      this.e = ☃.readDouble();
      break;
    case 2: 
      this.f = ☃.readDouble();
      this.e = ☃.readDouble();
      this.g = ☃.f();
      break;
    case 3: 
      this.c = ☃.readDouble();
      this.d = ☃.readDouble();
      break;
    case 4: 
      this.i = ☃.e();
      break;
    case 5: 
      this.h = ☃.e();
      break;
    case 6: 
      this.c = ☃.readDouble();
      this.d = ☃.readDouble();
      this.f = ☃.readDouble();
      this.e = ☃.readDouble();
      this.g = ☃.f();
      this.b = ☃.e();
      this.i = ☃.e();
      this.h = ☃.e();
    }
  }
  
  public void b(em ☃)
    throws IOException
  {
    ☃.a(this.a);
    switch (hg.1.a[this.a.ordinal()])
    {
    case 1: 
      ☃.writeDouble(this.e);
      break;
    case 2: 
      ☃.writeDouble(this.f);
      ☃.writeDouble(this.e);
      ☃.b(this.g);
      break;
    case 3: 
      ☃.writeDouble(this.c);
      ☃.writeDouble(this.d);
      break;
    case 5: 
      ☃.b(this.h);
      break;
    case 4: 
      ☃.b(this.i);
      break;
    case 6: 
      ☃.writeDouble(this.c);
      ☃.writeDouble(this.d);
      ☃.writeDouble(this.f);
      ☃.writeDouble(this.e);
      ☃.b(this.g);
      ☃.b(this.b);
      ☃.b(this.i);
      ☃.b(this.h);
    }
  }
  
  public void a(fj ☃)
  {
    ☃.a(this);
  }
  
  public void a(ams ☃)
  {
    switch (hg.1.a[this.a.ordinal()])
    {
    case 1: 
      ☃.a(this.e);
      break;
    case 2: 
      ☃.a(this.f, this.e, this.g);
      break;
    case 3: 
      ☃.c(this.c, this.d);
      break;
    case 6: 
      ☃.c(this.c, this.d);
      if (this.g > 0L) {
        ☃.a(this.f, this.e, this.g);
      } else {
        ☃.a(this.e);
      }
      ☃.a(this.b);
      ☃.c(this.i);
      ☃.b(this.h);
      break;
    case 5: 
      ☃.b(this.h);
      break;
    case 4: 
      ☃.c(this.i);
    }
  }
  
  public static enum a
  {
    private a() {}
  }
}
