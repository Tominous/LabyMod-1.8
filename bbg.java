public class bbg
  extends bbo
{
  private bct a;
  private bct b;
  private bct[] c;
  private bct[] d;
  
  public bbg()
  {
    t = 64;
    u = 64;
    
    c = new bct[12];
    
    a = new bct(this);
    a.a(0, 0).a(-6.0F, 10.0F, -8.0F, 12, 12, 16);
    a.a(0, 28).a(-8.0F, 10.0F, -6.0F, 2, 12, 12);
    a.a(0, 28).a(6.0F, 10.0F, -6.0F, 2, 12, 12, true);
    a.a(16, 40).a(-6.0F, 8.0F, -6.0F, 12, 2, 12);
    a.a(16, 40).a(-6.0F, 22.0F, -6.0F, 12, 2, 12);
    for (int ☃ = 0; ☃ < c.length; ☃++)
    {
      c[☃] = new bct(this, 0, 0);
      c[☃].a(-1.0F, -4.5F, -1.0F, 2, 9, 2);
      a.a(c[☃]);
    }
    b = new bct(this, 8, 0);
    b.a(-1.0F, 15.0F, 0.0F, 2, 2, 1);
    a.a(b);
    
    d = new bct[3];
    d[0] = new bct(this, 40, 0);
    d[0].a(-2.0F, 14.0F, 7.0F, 4, 4, 8);
    d[1] = new bct(this, 0, 54);
    d[1].a(0.0F, 14.0F, 0.0F, 3, 3, 7);
    d[2] = new bct(this);
    d[2].a(41, 32).a(0.0F, 14.0F, 0.0F, 2, 2, 6);
    d[2].a(25, 19).a(1.0F, 10.5F, 3.0F, 1, 9, 9);
    
    a.a(d[0]);
    d[0].a(d[1]);
    d[1].a(d[2]);
  }
  
  public int a()
  {
    return 54;
  }
  
  public void a(pk ☃, float ☃, float ☃, float ☃, float ☃, float ☃, float ☃)
  {
    a(☃, ☃, ☃, ☃, ☃, ☃, ☃);
    
    a.a(☃);
  }
  
  public void a(float ☃, float ☃, float ☃, float ☃, float ☃, float ☃, pk ☃)
  {
    vt ☃ = (vt)☃;
    float ☃ = ☃ - W;
    
    a.g = (☃ / 57.295776F);
    a.f = (☃ / 57.295776F);
    
    float[] ☃ = { 1.75F, 0.25F, 0.0F, 0.0F, 0.5F, 0.5F, 0.5F, 0.5F, 1.25F, 0.75F, 0.0F, 0.0F };
    
    float[] ☃ = { 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 1.75F, 1.25F, 0.75F, 0.0F, 0.0F, 0.0F, 0.0F };
    
    float[] ☃ = { 0.0F, 0.0F, 0.25F, 1.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.75F, 1.25F };
    
    float[] ☃ = { 0.0F, 0.0F, 8.0F, -8.0F, -8.0F, 8.0F, 8.0F, -8.0F, 0.0F, 0.0F, 8.0F, -8.0F };
    
    float[] ☃ = { -8.0F, -8.0F, -8.0F, -8.0F, 0.0F, 0.0F, 0.0F, 0.0F, 8.0F, 8.0F, 8.0F, 8.0F };
    
    float[] ☃ = { 8.0F, -8.0F, 0.0F, 0.0F, -8.0F, -8.0F, 8.0F, 8.0F, 8.0F, -8.0F, 0.0F, 0.0F };
    
    float ☃ = (1.0F - ☃.p(☃)) * 0.55F;
    for (int ☃ = 0; ☃ < 12; ☃++)
    {
      c[☃].f = (3.1415927F * ☃[☃]);
      c[☃].g = (3.1415927F * ☃[☃]);
      c[☃].h = (3.1415927F * ☃[☃]);
      c[☃].c = (☃[☃] * (1.0F + ns.b(☃ * 1.5F + ☃) * 0.01F - ☃));
      c[☃].d = (16.0F + ☃[☃] * (1.0F + ns.b(☃ * 1.5F + ☃) * 0.01F - ☃));
      c[☃].e = (☃[☃] * (1.0F + ns.b(☃ * 1.5F + ☃) * 0.01F - ☃));
    }
    b.e = -8.25F;
    
    pk ☃ = ave.A().ac();
    if (☃.cp()) {
      ☃ = ☃.cq();
    }
    if (☃ != null)
    {
      aui ☃ = ☃.e(0.0F);
      aui ☃ = ☃.e(0.0F);
      double ☃ = b - b;
      if (☃ > 0.0D) {
        b.d = 0.0F;
      } else {
        b.d = 1.0F;
      }
      aui ☃ = ☃.d(0.0F);
      ☃ = new aui(a, 0.0D, c);
      aui ☃ = new aui(a - a, 0.0D, c - c).a().b(1.5707964F);
      double ☃ = ☃.b(☃);
      b.c = (ns.c((float)Math.abs(☃)) * 2.0F * (float)Math.signum(☃));
    }
    b.j = true;
    
    float ☃ = ☃.a(☃);
    d[0].g = (ns.a(☃) * 3.1415927F * 0.05F);
    d[1].g = (ns.a(☃) * 3.1415927F * 0.1F);
    d[1].c = -1.5F;
    d[1].d = 0.5F;
    d[1].e = 14.0F;
    d[2].g = (ns.a(☃) * 3.1415927F * 0.15F);
    d[2].c = 0.5F;
    d[2].d = 0.5F;
    d[2].e = 6.0F;
  }
}
