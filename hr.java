import com.google.common.collect.Lists;
import java.io.IOException;
import java.util.Collection;

public class hr
  implements ff<fj>
{
  private String a = "";
  private String b = "";
  private String c = "";
  private String d = "";
  private String e = auq.a.a.e;
  private int f = -1;
  private Collection<String> g = Lists.newArrayList();
  private int h;
  private int i;
  
  public hr() {}
  
  public hr(aul ☃, int ☃)
  {
    this.a = ☃.b();
    this.h = ☃;
    if ((☃ == 0) || (☃ == 2))
    {
      this.b = ☃.c();
      this.c = ☃.e();
      this.d = ☃.f();
      this.i = ☃.k();
      this.e = ☃.i().e;
      this.f = ☃.l().b();
    }
    if (☃ == 0) {
      this.g.addAll(☃.d());
    }
  }
  
  public hr(aul ☃, Collection<String> ☃, int ☃)
  {
    if ((☃ != 3) && (☃ != 4)) {
      throw new IllegalArgumentException("Method must be join or leave for player constructor");
    }
    if ((☃ == null) || (☃.isEmpty())) {
      throw new IllegalArgumentException("Players cannot be null/empty");
    }
    this.h = ☃;
    this.a = ☃.b();
    this.g.addAll(☃);
  }
  
  public void a(em ☃)
    throws IOException
  {
    this.a = ☃.c(16);
    this.h = ☃.readByte();
    if ((this.h == 0) || (this.h == 2))
    {
      this.b = ☃.c(32);
      this.c = ☃.c(16);
      this.d = ☃.c(16);
      this.i = ☃.readByte();
      this.e = ☃.c(32);
      this.f = ☃.readByte();
    }
    if ((this.h == 0) || (this.h == 3) || (this.h == 4))
    {
      int ☃ = ☃.e();
      for (int ☃ = 0; ☃ < ☃; ☃++) {
        this.g.add(☃.c(40));
      }
    }
  }
  
  public void b(em ☃)
    throws IOException
  {
    ☃.a(this.a);
    ☃.writeByte(this.h);
    if ((this.h == 0) || (this.h == 2))
    {
      ☃.a(this.b);
      ☃.a(this.c);
      ☃.a(this.d);
      ☃.writeByte(this.i);
      ☃.a(this.e);
      ☃.writeByte(this.f);
    }
    if ((this.h == 0) || (this.h == 3) || (this.h == 4))
    {
      ☃.b(this.g.size());
      for (String ☃ : this.g) {
        ☃.a(☃);
      }
    }
  }
  
  public void a(fj ☃)
  {
    ☃.a(this);
  }
  
  public String a()
  {
    return this.a;
  }
  
  public String b()
  {
    return this.b;
  }
  
  public String c()
  {
    return this.c;
  }
  
  public String d()
  {
    return this.d;
  }
  
  public Collection<String> e()
  {
    return this.g;
  }
  
  public int f()
  {
    return this.h;
  }
  
  public int g()
  {
    return this.i;
  }
  
  public int h()
  {
    return this.f;
  }
  
  public String i()
  {
    return this.e;
  }
}
