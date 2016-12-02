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
    a = ☃;
    c = ☃.f();
    d = ☃.g();
    f = ☃.h();
    e = ☃.j();
    g = ☃.i();
    b = ☃.l();
    i = ☃.q();
    h = ☃.p();
  }
  
  public void a(em ☃)
    throws IOException
  {
    a = ((hg.a)☃.a(hg.a.class));
    switch (hg.1.a[a.ordinal()])
    {
    case 1: 
      e = ☃.readDouble();
      break;
    case 2: 
      f = ☃.readDouble();
      e = ☃.readDouble();
      g = ☃.f();
      break;
    case 3: 
      c = ☃.readDouble();
      d = ☃.readDouble();
      break;
    case 4: 
      i = ☃.e();
      break;
    case 5: 
      h = ☃.e();
      break;
    case 6: 
      c = ☃.readDouble();
      d = ☃.readDouble();
      f = ☃.readDouble();
      e = ☃.readDouble();
      g = ☃.f();
      b = ☃.e();
      i = ☃.e();
      h = ☃.e();
    }
  }
  
  public void b(em ☃)
    throws IOException
  {
    ☃.a(a);
    switch (hg.1.a[a.ordinal()])
    {
    case 1: 
      ☃.writeDouble(e);
      break;
    case 2: 
      ☃.writeDouble(f);
      ☃.writeDouble(e);
      ☃.b(g);
      break;
    case 3: 
      ☃.writeDouble(c);
      ☃.writeDouble(d);
      break;
    case 5: 
      ☃.b(h);
      break;
    case 4: 
      ☃.b(i);
      break;
    case 6: 
      ☃.writeDouble(c);
      ☃.writeDouble(d);
      ☃.writeDouble(f);
      ☃.writeDouble(e);
      ☃.b(g);
      ☃.b(b);
      ☃.b(i);
      ☃.b(h);
    }
  }
  
  public void a(fj ☃)
  {
    ☃.a(this);
  }
  
  public void a(ams ☃)
  {
    switch (hg.1.a[a.ordinal()])
    {
    case 1: 
      ☃.a(e);
      break;
    case 2: 
      ☃.a(f, e, g);
      break;
    case 3: 
      ☃.c(c, d);
      break;
    case 6: 
      ☃.c(c, d);
      if (g > 0L) {
        ☃.a(f, e, g);
      } else {
        ☃.a(e);
      }
      ☃.a(b);
      ☃.c(i);
      ☃.b(h);
      break;
    case 5: 
      ☃.b(h);
      break;
    case 4: 
      ☃.c(i);
    }
  }
  
  public static enum a
  {
    private a() {}
  }
}
