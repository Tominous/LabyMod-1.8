import com.google.common.collect.Lists;
import java.io.IOException;
import java.util.List;
import org.lwjgl.util.vector.Matrix4f;

public class bls
{
  private final blq c;
  public final bfw a;
  public final bfw b;
  private final List<Object> d = Lists.newArrayList();
  private final List<String> e = Lists.newArrayList();
  private final List<Integer> f = Lists.newArrayList();
  private final List<Integer> g = Lists.newArrayList();
  private Matrix4f h;
  
  public bls(bni ☃, String ☃, bfw ☃, bfw ☃)
    throws IOException
  {
    c = new blq(☃, ☃);
    a = ☃;
    b = ☃;
  }
  
  public void b()
  {
    c.a();
  }
  
  public void a(String ☃, Object ☃, int ☃, int ☃)
  {
    e.add(e.size(), ☃);
    d.add(d.size(), ☃);
    f.add(f.size(), Integer.valueOf(☃));
    g.add(g.size(), Integer.valueOf(☃));
  }
  
  private void d()
  {
    bfl.c(1.0F, 1.0F, 1.0F, 1.0F);
    bfl.k();
    bfl.i();
    bfl.c();
    bfl.n();
    bfl.f();
    bfl.h();
    bfl.w();
    bfl.i(0);
  }
  
  public void a(Matrix4f ☃)
  {
    h = ☃;
  }
  
  public void a(float ☃)
  {
    d();
    a.e();
    
    float ☃ = b.a;
    float ☃ = b.b;
    bfl.b(0, 0, (int)☃, (int)☃);
    
    c.a("DiffuseSampler", a);
    for (int ☃ = 0; ☃ < d.size(); ☃++)
    {
      c.a((String)e.get(☃), d.get(☃));
      c.b("AuxSize" + ☃).a(((Integer)f.get(☃)).intValue(), ((Integer)g.get(☃)).intValue());
    }
    c.b("ProjMat").a(h);
    c.b("InSize").a(a.a, a.b);
    c.b("OutSize").a(☃, ☃);
    c.b("Time").a(☃);
    
    ave ☃ = ave.A();
    c.b("ScreenSize").a(d, e);
    c.c();
    b.f();
    b.a(false);
    
    bfl.a(false);
    bfl.a(true, true, true, true);
    
    bfx ☃ = bfx.a();
    bfd ☃ = ☃.c();
    ☃.a(7, bms.f);
    ☃.b(0.0D, ☃, 500.0D).b(255, 255, 255, 255).d();
    ☃.b(☃, ☃, 500.0D).b(255, 255, 255, 255).d();
    ☃.b(☃, 0.0D, 500.0D).b(255, 255, 255, 255).d();
    ☃.b(0.0D, 0.0D, 500.0D).b(255, 255, 255, 255).d();
    ☃.b();
    
    bfl.a(true);
    bfl.a(true, true, true, true);
    
    c.b();
    b.e();
    a.d();
    for (Object ☃ : d) {
      if ((☃ instanceof bfw)) {
        ((bfw)☃).d();
      }
    }
  }
  
  public blq c()
  {
    return c;
  }
}
