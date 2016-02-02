public abstract class bjo<T extends ps>
  extends bjl<T>
{
  public bjo(biu ☃, bbo ☃, float ☃)
  {
    super(☃, ☃, ☃);
  }
  
  protected boolean b(T ☃)
  {
    return (super.a(☃)) && ((☃.aO()) || ((☃.l_()) && (☃ == this.b.d)));
  }
  
  public boolean a(T ☃, bia ☃, double ☃, double ☃, double ☃)
  {
    if (super.a(☃, ☃, ☃, ☃, ☃)) {
      return true;
    }
    if ((☃.cc()) && (☃.cd() != null))
    {
      pk ☃ = ☃.cd();
      return ☃.a(☃.aR());
    }
    return false;
  }
  
  public void a(T ☃, double ☃, double ☃, double ☃, float ☃, float ☃)
  {
    super.a(☃, ☃, ☃, ☃, ☃, ☃);
    
    b(☃, ☃, ☃, ☃, ☃, ☃);
  }
  
  public void a(T ☃, float ☃)
  {
    int ☃ = ☃.b(☃);
    int ☃ = ☃ % 65536;
    int ☃ = ☃ / 65536;
    bqs.a(bqs.r, ☃ / 1.0F, ☃ / 1.0F);
  }
  
  private double a(double ☃, double ☃, double ☃)
  {
    return ☃ + (☃ - ☃) * ☃;
  }
  
  protected void b(T ☃, double ☃, double ☃, double ☃, float ☃, float ☃)
  {
    pk ☃ = ☃.cd();
    if (☃ != null)
    {
      ☃ -= (1.6D - ☃.K) * 0.5D;
      bfx ☃ = bfx.a();
      bfd ☃ = ☃.c();
      double ☃ = a(☃.A, ☃.y, ☃ * 0.5F) * 0.01745329238474369D;
      double ☃ = a(☃.B, ☃.z, ☃ * 0.5F) * 0.01745329238474369D;
      double ☃ = Math.cos(☃);
      double ☃ = Math.sin(☃);
      double ☃ = Math.sin(☃);
      if ((☃ instanceof un))
      {
        ☃ = 0.0D;
        ☃ = 0.0D;
        ☃ = -1.0D;
      }
      double ☃ = Math.cos(☃);
      double ☃ = a(☃.p, ☃.s, ☃) - ☃ * 0.7D - ☃ * 0.5D * ☃;
      double ☃ = a(☃.q + ☃.aS() * 0.7D, ☃.t + ☃.aS() * 0.7D, ☃) - ☃ * 0.5D - 0.25D;
      double ☃ = a(☃.r, ☃.u, ☃) - ☃ * 0.7D + ☃ * 0.5D * ☃;
      
      double ☃ = a(☃.aJ, ☃.aI, ☃) * 0.01745329238474369D + 1.5707963267948966D;
      ☃ = Math.cos(☃) * ☃.J * 0.4D;
      ☃ = Math.sin(☃) * ☃.J * 0.4D;
      double ☃ = a(☃.p, ☃.s, ☃) + ☃;
      double ☃ = a(☃.q, ☃.t, ☃);
      double ☃ = a(☃.r, ☃.u, ☃) + ☃;
      ☃ += ☃;
      ☃ += ☃;
      
      double ☃ = (float)(☃ - ☃);
      double ☃ = (float)(☃ - ☃);
      double ☃ = (float)(☃ - ☃);
      
      bfl.x();
      bfl.f();
      bfl.p();
      
      int ☃ = 24;
      double ☃ = 0.025D;
      ☃.a(5, bms.f);
      for (int ☃ = 0; ☃ <= 24; ☃++)
      {
        float ☃ = 0.5F;
        float ☃ = 0.4F;
        float ☃ = 0.3F;
        if (☃ % 2 == 0)
        {
          ☃ *= 0.7F;
          ☃ *= 0.7F;
          ☃ *= 0.7F;
        }
        float ☃ = ☃ / 24.0F;
        ☃.b(☃ + ☃ * ☃ + 0.0D, ☃ + ☃ * (☃ * ☃ + ☃) * 0.5D + ((24.0F - ☃) / 18.0F + 0.125F), ☃ + ☃ * ☃).a(☃, ☃, ☃, 1.0F).d();
        ☃.b(☃ + ☃ * ☃ + 0.025D, ☃ + ☃ * (☃ * ☃ + ☃) * 0.5D + ((24.0F - ☃) / 18.0F + 0.125F) + 0.025D, ☃ + ☃ * ☃).a(☃, ☃, ☃, 1.0F).d();
      }
      ☃.b();
      
      ☃.a(5, bms.f);
      for (int ☃ = 0; ☃ <= 24; ☃++)
      {
        float ☃ = 0.5F;
        float ☃ = 0.4F;
        float ☃ = 0.3F;
        if (☃ % 2 == 0)
        {
          ☃ *= 0.7F;
          ☃ *= 0.7F;
          ☃ *= 0.7F;
        }
        float ☃ = ☃ / 24.0F;
        ☃.b(☃ + ☃ * ☃ + 0.0D, ☃ + ☃ * (☃ * ☃ + ☃) * 0.5D + ((24.0F - ☃) / 18.0F + 0.125F) + 0.025D, ☃ + ☃ * ☃).a(☃, ☃, ☃, 1.0F).d();
        ☃.b(☃ + ☃ * ☃ + 0.025D, ☃ + ☃ * (☃ * ☃ + ☃) * 0.5D + ((24.0F - ☃) / 18.0F + 0.125F), ☃ + ☃ * ☃ + 0.025D).a(☃, ☃, ☃, 1.0F).d();
      }
      ☃.b();
      
      bfl.e();
      bfl.w();
      bfl.o();
    }
  }
}
