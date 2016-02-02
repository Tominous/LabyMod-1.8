public class bco
  extends bbo
{
  private bct a;
  private bct b;
  private bct c;
  private bct d;
  private bct e;
  private bct f;
  private bct g;
  private bct h;
  private bct i;
  private bct j;
  private bct k;
  private bct l;
  private float m;
  
  public bco(float ☃)
  {
    this.t = 256;
    this.u = 256;
    
    a("body.body", 0, 0);
    a("wing.skin", -56, 88);
    a("wingtip.skin", -56, 144);
    a("rearleg.main", 0, 0);
    a("rearfoot.main", 112, 0);
    a("rearlegtip.main", 196, 0);
    a("head.upperhead", 112, 30);
    a("wing.bone", 112, 88);
    a("head.upperlip", 176, 44);
    a("jaw.jaw", 176, 65);
    a("frontleg.main", 112, 104);
    a("wingtip.bone", 112, 136);
    a("frontfoot.main", 144, 104);
    a("neck.box", 192, 104);
    a("frontlegtip.main", 226, 138);
    a("body.scale", 220, 53);
    a("head.scale", 0, 0);
    a("neck.scale", 48, 0);
    a("head.nostril", 112, 0);
    
    float ☃ = -16.0F;
    this.a = new bct(this, "head");
    this.a.a("upperlip", -6.0F, -1.0F, -8.0F + ☃, 12, 5, 16);
    this.a.a("upperhead", -8.0F, -8.0F, 6.0F + ☃, 16, 16, 16);
    this.a.i = true;
    this.a.a("scale", -5.0F, -12.0F, 12.0F + ☃, 2, 4, 6);
    this.a.a("nostril", -5.0F, -3.0F, -6.0F + ☃, 2, 2, 4);
    this.a.i = false;
    this.a.a("scale", 3.0F, -12.0F, 12.0F + ☃, 2, 4, 6);
    this.a.a("nostril", 3.0F, -3.0F, -6.0F + ☃, 2, 2, 4);
    
    this.c = new bct(this, "jaw");
    this.c.a(0.0F, 4.0F, 8.0F + ☃);
    this.c.a("jaw", -6.0F, 0.0F, -16.0F, 12, 4, 16);
    this.a.a(this.c);
    
    this.b = new bct(this, "neck");
    this.b.a("box", -5.0F, -5.0F, -5.0F, 10, 10, 10);
    this.b.a("scale", -1.0F, -9.0F, -3.0F, 2, 4, 6);
    
    this.d = new bct(this, "body");
    this.d.a(0.0F, 4.0F, 8.0F);
    this.d.a("body", -12.0F, 0.0F, -16.0F, 24, 24, 64);
    this.d.a("scale", -1.0F, -6.0F, -10.0F, 2, 6, 12);
    this.d.a("scale", -1.0F, -6.0F, 10.0F, 2, 6, 12);
    this.d.a("scale", -1.0F, -6.0F, 30.0F, 2, 6, 12);
    
    this.k = new bct(this, "wing");
    this.k.a(-12.0F, 5.0F, 2.0F);
    this.k.a("bone", -56.0F, -4.0F, -4.0F, 56, 8, 8);
    this.k.a("skin", -56.0F, 0.0F, 2.0F, 56, 0, 56);
    this.l = new bct(this, "wingtip");
    this.l.a(-56.0F, 0.0F, 0.0F);
    this.l.a("bone", -56.0F, -2.0F, -2.0F, 56, 4, 4);
    this.l.a("skin", -56.0F, 0.0F, 2.0F, 56, 0, 56);
    this.k.a(this.l);
    
    this.f = new bct(this, "frontleg");
    this.f.a(-12.0F, 20.0F, 2.0F);
    this.f.a("main", -4.0F, -4.0F, -4.0F, 8, 24, 8);
    this.h = new bct(this, "frontlegtip");
    this.h.a(0.0F, 20.0F, -1.0F);
    this.h.a("main", -3.0F, -1.0F, -3.0F, 6, 24, 6);
    this.f.a(this.h);
    this.j = new bct(this, "frontfoot");
    this.j.a(0.0F, 23.0F, 0.0F);
    this.j.a("main", -4.0F, 0.0F, -12.0F, 8, 4, 16);
    this.h.a(this.j);
    
    this.e = new bct(this, "rearleg");
    this.e.a(-16.0F, 16.0F, 42.0F);
    this.e.a("main", -8.0F, -4.0F, -8.0F, 16, 32, 16);
    this.g = new bct(this, "rearlegtip");
    this.g.a(0.0F, 32.0F, -4.0F);
    this.g.a("main", -6.0F, -2.0F, 0.0F, 12, 32, 12);
    this.e.a(this.g);
    this.i = new bct(this, "rearfoot");
    this.i.a(0.0F, 31.0F, 4.0F);
    this.i.a("main", -9.0F, 0.0F, -20.0F, 18, 6, 24);
    this.g.a(this.i);
  }
  
  public void a(pr ☃, float ☃, float ☃, float ☃)
  {
    this.m = ☃;
  }
  
  public void a(pk ☃, float ☃, float ☃, float ☃, float ☃, float ☃, float ☃)
  {
    bfl.E();
    ug ☃ = (ug)☃;
    float ☃ = ☃.bu + (☃.bv - ☃.bu) * this.m;
    this.c.f = ((float)(Math.sin(☃ * 3.1415927F * 2.0F) + 1.0D) * 0.2F);
    
    float ☃ = (float)(Math.sin(☃ * 3.1415927F * 2.0F - 1.0F) + 1.0D);
    ☃ = (☃ * ☃ * 1.0F + ☃ * 2.0F) * 0.05F;
    
    bfl.b(0.0F, ☃ - 2.0F, -3.0F);
    bfl.b(☃ * 2.0F, 1.0F, 0.0F, 0.0F);
    
    float ☃ = -30.0F;
    
    float ☃ = 0.0F;
    
    float ☃ = 1.5F;
    
    double[] ☃ = ☃.b(6, this.m);
    
    float ☃ = a(☃.b(5, this.m)[0] - ☃.b(10, this.m)[0]);
    float ☃ = a(☃.b(5, this.m)[0] + ☃ / 2.0F);
    
    ☃ += 2.0F;
    
    float ☃ = ☃ * 3.1415927F * 2.0F;
    ☃ = 20.0F;
    float ☃ = -12.0F;
    for (int ☃ = 0; ☃ < 5; ☃++)
    {
      double[] ☃ = ☃.b(5 - ☃, this.m);
      float ☃ = (float)Math.cos(☃ * 0.45F + ☃) * 0.15F;
      this.b.g = (a(☃[0] - ☃[0]) * 3.1415927F / 180.0F * ☃);
      this.b.f = (☃ + (float)(☃[1] - ☃[1]) * 3.1415927F / 180.0F * ☃ * 5.0F);
      this.b.h = (-a(☃[0] - ☃) * 3.1415927F / 180.0F * ☃);
      
      this.b.d = ☃;
      this.b.e = ☃;
      this.b.c = ☃;
      ☃ = (float)(☃ + Math.sin(this.b.f) * 10.0D);
      ☃ = (float)(☃ - Math.cos(this.b.g) * Math.cos(this.b.f) * 10.0D);
      ☃ = (float)(☃ - Math.sin(this.b.g) * Math.cos(this.b.f) * 10.0D);
      this.b.a(☃);
    }
    this.a.d = ☃;
    this.a.e = ☃;
    this.a.c = ☃;
    double[] ☃ = ☃.b(0, this.m);
    this.a.g = (a(☃[0] - ☃[0]) * 3.1415927F / 180.0F * 1.0F);
    this.a.h = (-a(☃[0] - ☃) * 3.1415927F / 180.0F * 1.0F);
    this.a.a(☃);
    bfl.E();
    bfl.b(0.0F, 1.0F, 0.0F);
    bfl.b(-☃ * ☃ * 1.0F, 0.0F, 0.0F, 1.0F);
    bfl.b(0.0F, -1.0F, 0.0F);
    this.d.h = 0.0F;
    this.d.a(☃);
    for (int ☃ = 0; ☃ < 2; ☃++)
    {
      bfl.o();
      float ☃ = ☃ * 3.1415927F * 2.0F;
      this.k.f = (0.125F - (float)Math.cos(☃) * 0.2F);
      this.k.g = 0.25F;
      this.k.h = ((float)(Math.sin(☃) + 0.125D) * 0.8F);
      this.l.h = (-(float)(Math.sin(☃ + 2.0F) + 0.5D) * 0.75F);
      
      this.e.f = (1.0F + ☃ * 0.1F);
      this.g.f = (0.5F + ☃ * 0.1F);
      this.i.f = (0.75F + ☃ * 0.1F);
      
      this.f.f = (1.3F + ☃ * 0.1F);
      this.h.f = (-0.5F - ☃ * 0.1F);
      this.j.f = (0.75F + ☃ * 0.1F);
      this.k.a(☃);
      this.f.a(☃);
      this.e.a(☃);
      bfl.a(-1.0F, 1.0F, 1.0F);
      if (☃ == 0) {
        bfl.e(1028);
      }
    }
    bfl.F();
    bfl.e(1029);
    bfl.p();
    
    float ☃ = -(float)Math.sin(☃ * 3.1415927F * 2.0F) * 0.0F;
    ☃ = ☃ * 3.1415927F * 2.0F;
    ☃ = 10.0F;
    ☃ = 60.0F;
    ☃ = 0.0F;
    ☃ = ☃.b(11, this.m);
    for (int ☃ = 0; ☃ < 12; ☃++)
    {
      ☃ = ☃.b(12 + ☃, this.m);
      ☃ = (float)(☃ + Math.sin(☃ * 0.45F + ☃) * 0.05000000074505806D);
      this.b.g = ((a(☃[0] - ☃[0]) * ☃ + 180.0F) * 3.1415927F / 180.0F);
      this.b.f = (☃ + (float)(☃[1] - ☃[1]) * 3.1415927F / 180.0F * ☃ * 5.0F);
      this.b.h = (a(☃[0] - ☃) * 3.1415927F / 180.0F * ☃);
      this.b.d = ☃;
      this.b.e = ☃;
      this.b.c = ☃;
      ☃ = (float)(☃ + Math.sin(this.b.f) * 10.0D);
      ☃ = (float)(☃ - Math.cos(this.b.g) * Math.cos(this.b.f) * 10.0D);
      ☃ = (float)(☃ - Math.sin(this.b.g) * Math.cos(this.b.f) * 10.0D);
      this.b.a(☃);
    }
    bfl.F();
  }
  
  private float a(double ☃)
  {
    while (☃ >= 180.0D) {
      ☃ -= 360.0D;
    }
    while (☃ < -180.0D) {
      ☃ += 360.0D;
    }
    return (float)☃;
  }
}
