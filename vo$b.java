import java.util.Collections;
import java.util.List;

class vo$b
  extends sp
{
  private wn g;
  private int h;
  private int i;
  private vo j;
  
  public vo$b(vo ☃)
  {
    super(☃, wn.class, true);
    j = ☃;
  }
  
  public boolean a()
  {
    double ☃ = f();
    List<wn> ☃ = e.o.a(wn.class, e.aR().b(☃, 4.0D, ☃), c);
    Collections.sort(☃, b);
    if (☃.isEmpty()) {
      return false;
    }
    g = ((wn)☃.get(0));
    return true;
  }
  
  public void c()
  {
    h = 5;
    i = 0;
  }
  
  public void d()
  {
    g = null;
    j.a(false);
    
    qc ☃ = j.a(vy.d);
    ☃.c(vo.cp());
    
    super.d();
  }
  
  public boolean b()
  {
    if (g != null)
    {
      if (!vo.a(j, g)) {
        return false;
      }
      vo.a(j, true);
      j.a(g, 10.0F, 10.0F);
      return true;
    }
    return super.b();
  }
  
  public void e()
  {
    if (g != null)
    {
      if (--h <= 0)
      {
        d = g;
        g = null;
        super.c();
        
        j.a("mob.endermen.stare", 1.0F, 1.0F);
        j.a(true);
        
        qc ☃ = j.a(vy.d);
        ☃.b(vo.cp());
      }
    }
    else
    {
      if (d != null) {
        if (((d instanceof wn)) && (vo.a(j, (wn)d)))
        {
          if (d.h(j) < 16.0D) {
            j.n();
          }
          i = 0;
        }
        else if ((d.h(j) > 256.0D) && 
          (i++ >= 30) && 
          (j.b(d)))
        {
          i = 0;
        }
      }
      super.e();
    }
  }
}
