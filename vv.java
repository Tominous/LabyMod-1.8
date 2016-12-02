import java.util.Random;

public abstract class vv
  extends py
  implements vq
{
  public vv(adm ☃)
  {
    super(☃);
    b_ = 5;
  }
  
  public void m()
  {
    bx();
    float ☃ = c(1.0F);
    if (☃ > 0.5F) {
      aQ += 2;
    }
    super.m();
  }
  
  public void t_()
  {
    super.t_();
    if ((!o.D) && (o.aa() == oj.a)) {
      J();
    }
  }
  
  protected String P()
  {
    return "game.hostile.swim";
  }
  
  protected String aa()
  {
    return "game.hostile.swim.splash";
  }
  
  public boolean a(ow ☃, float ☃)
  {
    if (b(☃)) {
      return false;
    }
    if (super.a(☃, ☃))
    {
      pk ☃ = ☃.j();
      if ((l == ☃) || (m == ☃)) {
        return true;
      }
      return true;
    }
    return false;
  }
  
  protected String bo()
  {
    return "game.hostile.hurt";
  }
  
  protected String bp()
  {
    return "game.hostile.die";
  }
  
  protected String n(int ☃)
  {
    if (☃ > 4) {
      return "game.hostile.hurt.fall.big";
    }
    return "game.hostile.hurt.fall.small";
  }
  
  public boolean r(pk ☃)
  {
    float ☃ = (float)a(vy.e).e();
    int ☃ = 0;
    if ((☃ instanceof pr))
    {
      ☃ += ack.a(bA(), ((pr)☃).bz());
      ☃ += ack.a(this);
    }
    boolean ☃ = ☃.a(ow.a(this), ☃);
    if (☃)
    {
      if (☃ > 0)
      {
        ☃.g(-ns.a(y * 3.1415927F / 180.0F) * ☃ * 0.5F, 0.1D, ns.b(y * 3.1415927F / 180.0F) * ☃ * 0.5F);
        v *= 0.6D;
        x *= 0.6D;
      }
      int ☃ = ack.b(this);
      if (☃ > 0) {
        ☃.e(☃ * 4);
      }
      a(this, ☃);
    }
    return ☃;
  }
  
  public float a(cj ☃)
  {
    return 0.5F - o.o(☃);
  }
  
  protected boolean n_()
  {
    cj ☃ = new cj(s, aRb, u);
    if (o.b(ads.a, ☃) > V.nextInt(32)) {
      return false;
    }
    int ☃ = o.l(☃);
    if (o.R())
    {
      int ☃ = o.ab();
      o.c(10);
      ☃ = o.l(☃);
      o.c(☃);
    }
    return ☃ <= V.nextInt(8);
  }
  
  public boolean bR()
  {
    return (o.aa() != oj.a) && (n_()) && (super.bR());
  }
  
  protected void aX()
  {
    super.aX();
    
    by().b(vy.e);
  }
  
  protected boolean ba()
  {
    return true;
  }
}
