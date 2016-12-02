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
    this.j = ☃;
  }
  
  public boolean a()
  {
    double ☃ = f();
    List<wn> ☃ = this.e.o.a(wn.class, this.e.aR().b(☃, 4.0D, ☃), this.c);
    Collections.sort(☃, this.b);
    if (☃.isEmpty()) {
      return false;
    }
    this.g = ((wn)☃.get(0));
    return true;
  }
  
  public void c()
  {
    this.h = 5;
    this.i = 0;
  }
  
  public void d()
  {
    this.g = null;
    this.j.a(false);
    
    qc ☃ = this.j.a(vy.d);
    ☃.c(vo.cp());
    
    super.d();
  }
  
  public boolean b()
  {
    if (this.g != null)
    {
      if (!vo.a(this.j, this.g)) {
        return false;
      }
      vo.a(this.j, true);
      this.j.a(this.g, 10.0F, 10.0F);
      return true;
    }
    return super.b();
  }
  
  public void e()
  {
    if (this.g != null)
    {
      if (--this.h <= 0)
      {
        this.d = this.g;
        this.g = null;
        super.c();
        
        this.j.a("mob.endermen.stare", 1.0F, 1.0F);
        this.j.a(true);
        
        qc ☃ = this.j.a(vy.d);
        ☃.b(vo.cp());
      }
    }
    else
    {
      if (this.d != null) {
        if (((this.d instanceof wn)) && (vo.a(this.j, (wn)this.d)))
        {
          if (this.d.h(this.j) < 16.0D) {
            this.j.n();
          }
          this.i = 0;
        }
        else if ((this.d.h(this.j) > 256.0D) && 
          (this.i++ >= 30) && 
          (this.j.b(this.d)))
        {
          this.i = 0;
        }
      }
      super.e();
    }
  }
}
