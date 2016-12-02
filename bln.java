public class bln
  extends bjl<bet>
{
  private boolean a;
  
  public bln(biu ☃)
  {
    this(☃, false);
  }
  
  public bln(biu ☃, boolean ☃)
  {
    super(☃, new bbr(0.0F, ☃), 0.5F);
    a = ☃;
    
    a(new bkx(this));
    a(new bky(this));
    a(new bko(this));
    a(new bkt(this));
    a(new bkp(this));
    a(new bks(ge));
  }
  
  public bbr g()
  {
    return (bbr)super.b();
  }
  
  public void a(bet ☃, double ☃, double ☃, double ☃, float ☃, float ☃)
  {
    if ((☃.cc()) && (b.c != ☃)) {
      return;
    }
    double ☃ = ☃;
    if ((☃.av()) && (!(☃ instanceof bew))) {
      ☃ -= 0.125D;
    }
    d(☃);
    
    super.a(☃, ☃, ☃, ☃, ☃, ☃);
  }
  
  private void d(bet ☃)
  {
    bbr ☃ = g();
    if (☃.v())
    {
      ☃.a(false);
      e.j = true;
      f.j = true;
    }
    else
    {
      zx ☃ = bi.h();
      
      ☃.a(true);
      
      f.j = ☃.a(wo.g);
      v.j = ☃.a(wo.b);
      c.j = ☃.a(wo.e);
      d.j = ☃.a(wo.f);
      a.j = ☃.a(wo.c);
      b.j = ☃.a(wo.d);
      
      l = 0;
      o = false;
      n = ☃.av();
      if (☃ == null)
      {
        m = 0;
      }
      else
      {
        m = 1;
        if (☃.bR() > 0)
        {
          aba ☃ = ☃.m();
          if (☃ == aba.d) {
            m = 3;
          } else if (☃ == aba.e) {
            o = true;
          }
        }
      }
    }
  }
  
  protected jy a(bet ☃)
  {
    return ☃.i();
  }
  
  public void C_()
  {
    bfl.b(0.0F, 0.1875F, 0.0F);
  }
  
  protected void a(bet ☃, float ☃)
  {
    float ☃ = 0.9375F;
    bfl.a(☃, ☃, ☃);
  }
  
  protected void a(bet ☃, double ☃, double ☃, double ☃, String ☃, float ☃, double ☃)
  {
    if (☃ < 100.0D)
    {
      auo ☃ = ☃.cp();
      auk ☃ = ☃.a(2);
      if (☃ != null)
      {
        aum ☃ = ☃.c(☃.e_(), ☃);
        
        a(☃, ☃.c() + " " + ☃.d(), ☃, ☃, ☃, 64);
        
        ☃ += ca * 1.15F * ☃;
      }
    }
    super.a(☃, ☃, ☃, ☃, ☃, ☃, ☃);
  }
  
  public void b(bet ☃)
  {
    float ☃ = 1.0F;
    bfl.c(☃, ☃, ☃);
    
    bbr ☃ = g();
    d(☃);
    p = 0.0F;
    n = false;
    ☃.a(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0625F, ☃);
    ☃.a();
  }
  
  public void c(bet ☃)
  {
    float ☃ = 1.0F;
    bfl.c(☃, ☃, ☃);
    
    bbr ☃ = g();
    d(☃);
    n = false;
    p = 0.0F;
    ☃.a(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0625F, ☃);
    ☃.b();
  }
  
  protected void a(bet ☃, double ☃, double ☃, double ☃)
  {
    if ((☃.ai()) && (☃.bJ())) {
      super.a(☃, ☃ + by, ☃ + bZ, ☃ + bz);
    } else {
      super.a(☃, ☃, ☃, ☃);
    }
  }
  
  protected void a(bet ☃, float ☃, float ☃, float ☃)
  {
    if ((☃.ai()) && (☃.bJ()))
    {
      bfl.b(☃.ce(), 0.0F, 1.0F, 0.0F);
      bfl.b(b(☃), 0.0F, 0.0F, 1.0F);
      bfl.b(270.0F, 0.0F, 1.0F, 0.0F);
    }
    else
    {
      super.a(☃, ☃, ☃, ☃);
    }
  }
}
