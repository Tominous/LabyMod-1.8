public class bbg
  extends bbo
{
  private bct a;
  private bct b;
  private bct[] c;
  private bct[] d;
  
  public bbg()
  {
    this.t = 64;
    this.u = 64;
    
    this.c = new bct[12];
    
    this.a = new bct(this);
    this.a.a(0, 0).a(-6.0F, 10.0F, -8.0F, 12, 12, 16);
    this.a.a(0, 28).a(-8.0F, 10.0F, -6.0F, 2, 12, 12);
    this.a.a(0, 28).a(6.0F, 10.0F, -6.0F, 2, 12, 12, true);
    this.a.a(16, 40).a(-6.0F, 8.0F, -6.0F, 12, 2, 12);
    this.a.a(16, 40).a(-6.0F, 22.0F, -6.0F, 12, 2, 12);
    for (int ☃ = 0; ☃ < this.c.length; ☃++)
    {
      this.c[☃] = new bct(this, 0, 0);
      this.c[☃].a(-1.0F, -4.5F, -1.0F, 2, 9, 2);
      this.a.a(this.c[☃]);
    }
    this.b = new bct(this, 8, 0);
    this.b.a(-1.0F, 15.0F, 0.0F, 2, 2, 1);
    this.a.a(this.b);
    
    this.d = new bct[3];
    this.d[0] = new bct(this, 40, 0);
    this.d[0].a(-2.0F, 14.0F, 7.0F, 4, 4, 8);
    this.d[1] = new bct(this, 0, 54);
    this.d[1].a(0.0F, 14.0F, 0.0F, 3, 3, 7);
    this.d[2] = new bct(this);
    this.d[2].a(41, 32).a(0.0F, 14.0F, 0.0F, 2, 2, 6);
    this.d[2].a(25, 19).a(1.0F, 10.5F, 3.0F, 1, 9, 9);
    
    this.a.a(this.d[0]);
    this.d[0].a(this.d[1]);
    this.d[1].a(this.d[2]);
  }
  
  public int a()
  {
    return 54;
  }
  
  public void a(pk ☃, float ☃, float ☃, float ☃, float ☃, float ☃, float ☃)
  {
    a(☃, ☃, ☃, ☃, ☃, ☃, ☃);
    
    this.a.a(☃);
  }
  
  public void a(float ☃, float ☃, float ☃, float ☃, float ☃, float ☃, pk ☃)
  {
    vt ☃ = (vt)☃;
    float ☃ = ☃ - ☃.W;
    
    this.a.g = (☃ / 57.295776F);
    this.a.f = (☃ / 57.295776F);
    
    float[] ☃ = { 1.75F, 0.25F, 0.0F, 0.0F, 0.5F, 0.5F, 0.5F, 0.5F, 1.25F, 0.75F, 0.0F, 0.0F };
    
    float[] ☃ = { 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 1.75F, 1.25F, 0.75F, 0.0F, 0.0F, 0.0F, 0.0F };
    
    float[] ☃ = { 0.0F, 0.0F, 0.25F, 1.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.75F, 1.25F };
    
    float[] ☃ = { 0.0F, 0.0F, 8.0F, -8.0F, -8.0F, 8.0F, 8.0F, -8.0F, 0.0F, 0.0F, 8.0F, -8.0F };
    
    float[] ☃ = { -8.0F, -8.0F, -8.0F, -8.0F, 0.0F, 0.0F, 0.0F, 0.0F, 8.0F, 8.0F, 8.0F, 8.0F };
    
    float[] ☃ = { 8.0F, -8.0F, 0.0F, 0.0F, -8.0F, -8.0F, 8.0F, 8.0F, 8.0F, -8.0F, 0.0F, 0.0F };
    
    float ☃ = (1.0F - ☃.p(☃)) * 0.55F;
    for (int ☃ = 0; ☃ < 12; ☃++)
    {
      this.c[☃].f = (3.1415927F * ☃[☃]);
      this.c[☃].g = (3.1415927F * ☃[☃]);
      this.c[☃].h = (3.1415927F * ☃[☃]);
      this.c[☃].c = (☃[☃] * (1.0F + ns.b(☃ * 1.5F + ☃) * 0.01F - ☃));
      this.c[☃].d = (16.0F + ☃[☃] * (1.0F + ns.b(☃ * 1.5F + ☃) * 0.01F - ☃));
      this.c[☃].e = (☃[☃] * (1.0F + ns.b(☃ * 1.5F + ☃) * 0.01F - ☃));
    }
    this.b.e = -8.25F;
    
    pk ☃ = ave.A().ac();
    if (☃.cp()) {
      ☃ = ☃.cq();
    }
    if (☃ != null)
    {
      aui ☃ = ☃.e(0.0F);
      aui ☃ = ☃.e(0.0F);
      double ☃ = ☃.b - ☃.b;
      if (☃ > 0.0D) {
        this.b.d = 0.0F;
      } else {
        this.b.d = 1.0F;
      }
      aui ☃ = ☃.d(0.0F);
      ☃ = new aui(☃.a, 0.0D, ☃.c);
      aui ☃ = new aui(☃.a - ☃.a, 0.0D, ☃.c - ☃.c).a().b(1.5707964F);
      double ☃ = ☃.b(☃);
      this.b.c = (ns.c((float)Math.abs(☃)) * 2.0F * (float)Math.signum(☃));
    }
    this.b.j = true;
    
    float ☃ = ☃.a(☃);
    this.d[0].g = (ns.a(☃) * 3.1415927F * 0.05F);
    this.d[1].g = (ns.a(☃) * 3.1415927F * 0.1F);
    this.d[1].c = -1.5F;
    this.d[1].d = 0.5F;
    this.d[1].e = 14.0F;
    this.d[2].g = (ns.a(☃) * 3.1415927F * 0.15F);
    this.d[2].c = 0.5F;
    this.d[2].d = 0.5F;
    this.d[2].e = 6.0F;
  }
}
