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
    t = 256;
    u = 256;
    
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
    a = new bct(this, "head");
    a.a("upperlip", -6.0F, -1.0F, -8.0F + ☃, 12, 5, 16);
    a.a("upperhead", -8.0F, -8.0F, 6.0F + ☃, 16, 16, 16);
    a.i = true;
    a.a("scale", -5.0F, -12.0F, 12.0F + ☃, 2, 4, 6);
    a.a("nostril", -5.0F, -3.0F, -6.0F + ☃, 2, 2, 4);
    a.i = false;
    a.a("scale", 3.0F, -12.0F, 12.0F + ☃, 2, 4, 6);
    a.a("nostril", 3.0F, -3.0F, -6.0F + ☃, 2, 2, 4);
    
    c = new bct(this, "jaw");
    c.a(0.0F, 4.0F, 8.0F + ☃);
    c.a("jaw", -6.0F, 0.0F, -16.0F, 12, 4, 16);
    a.a(c);
    
    b = new bct(this, "neck");
    b.a("box", -5.0F, -5.0F, -5.0F, 10, 10, 10);
    b.a("scale", -1.0F, -9.0F, -3.0F, 2, 4, 6);
    
    d = new bct(this, "body");
    d.a(0.0F, 4.0F, 8.0F);
    d.a("body", -12.0F, 0.0F, -16.0F, 24, 24, 64);
    d.a("scale", -1.0F, -6.0F, -10.0F, 2, 6, 12);
    d.a("scale", -1.0F, -6.0F, 10.0F, 2, 6, 12);
    d.a("scale", -1.0F, -6.0F, 30.0F, 2, 6, 12);
    
    k = new bct(this, "wing");
    k.a(-12.0F, 5.0F, 2.0F);
    k.a("bone", -56.0F, -4.0F, -4.0F, 56, 8, 8);
    k.a("skin", -56.0F, 0.0F, 2.0F, 56, 0, 56);
    l = new bct(this, "wingtip");
    l.a(-56.0F, 0.0F, 0.0F);
    l.a("bone", -56.0F, -2.0F, -2.0F, 56, 4, 4);
    l.a("skin", -56.0F, 0.0F, 2.0F, 56, 0, 56);
    k.a(l);
    
    f = new bct(this, "frontleg");
    f.a(-12.0F, 20.0F, 2.0F);
    f.a("main", -4.0F, -4.0F, -4.0F, 8, 24, 8);
    h = new bct(this, "frontlegtip");
    h.a(0.0F, 20.0F, -1.0F);
    h.a("main", -3.0F, -1.0F, -3.0F, 6, 24, 6);
    f.a(h);
    j = new bct(this, "frontfoot");
    j.a(0.0F, 23.0F, 0.0F);
    j.a("main", -4.0F, 0.0F, -12.0F, 8, 4, 16);
    h.a(j);
    
    e = new bct(this, "rearleg");
    e.a(-16.0F, 16.0F, 42.0F);
    e.a("main", -8.0F, -4.0F, -8.0F, 16, 32, 16);
    g = new bct(this, "rearlegtip");
    g.a(0.0F, 32.0F, -4.0F);
    g.a("main", -6.0F, -2.0F, 0.0F, 12, 32, 12);
    e.a(g);
    i = new bct(this, "rearfoot");
    i.a(0.0F, 31.0F, 4.0F);
    i.a("main", -9.0F, 0.0F, -20.0F, 18, 6, 24);
    g.a(i);
  }
  
  public void a(pr ☃, float ☃, float ☃, float ☃)
  {
    m = ☃;
  }
  
  public void a(pk ☃, float ☃, float ☃, float ☃, float ☃, float ☃, float ☃)
  {
    bfl.E();
    ug ☃ = (ug)☃;
    float ☃ = bu + (bv - bu) * m;
    c.f = ((float)(Math.sin(☃ * 3.1415927F * 2.0F) + 1.0D) * 0.2F);
    
    float ☃ = (float)(Math.sin(☃ * 3.1415927F * 2.0F - 1.0F) + 1.0D);
    ☃ = (☃ * ☃ * 1.0F + ☃ * 2.0F) * 0.05F;
    
    bfl.b(0.0F, ☃ - 2.0F, -3.0F);
    bfl.b(☃ * 2.0F, 1.0F, 0.0F, 0.0F);
    
    float ☃ = -30.0F;
    
    float ☃ = 0.0F;
    
    float ☃ = 1.5F;
    
    double[] ☃ = ☃.b(6, m);
    
    float ☃ = a(☃.b(5, m)[0] - ☃.b(10, m)[0]);
    float ☃ = a(☃.b(5, m)[0] + ☃ / 2.0F);
    
    ☃ += 2.0F;
    
    float ☃ = ☃ * 3.1415927F * 2.0F;
    ☃ = 20.0F;
    float ☃ = -12.0F;
    for (int ☃ = 0; ☃ < 5; ☃++)
    {
      double[] ☃ = ☃.b(5 - ☃, m);
      float ☃ = (float)Math.cos(☃ * 0.45F + ☃) * 0.15F;
      b.g = (a(☃[0] - ☃[0]) * 3.1415927F / 180.0F * ☃);
      b.f = (☃ + (float)(☃[1] - ☃[1]) * 3.1415927F / 180.0F * ☃ * 5.0F);
      b.h = (-a(☃[0] - ☃) * 3.1415927F / 180.0F * ☃);
      
      b.d = ☃;
      b.e = ☃;
      b.c = ☃;
      ☃ = (float)(☃ + Math.sin(b.f) * 10.0D);
      ☃ = (float)(☃ - Math.cos(b.g) * Math.cos(b.f) * 10.0D);
      ☃ = (float)(☃ - Math.sin(b.g) * Math.cos(b.f) * 10.0D);
      b.a(☃);
    }
    a.d = ☃;
    a.e = ☃;
    a.c = ☃;
    double[] ☃ = ☃.b(0, m);
    a.g = (a(☃[0] - ☃[0]) * 3.1415927F / 180.0F * 1.0F);
    a.h = (-a(☃[0] - ☃) * 3.1415927F / 180.0F * 1.0F);
    a.a(☃);
    bfl.E();
    bfl.b(0.0F, 1.0F, 0.0F);
    bfl.b(-☃ * ☃ * 1.0F, 0.0F, 0.0F, 1.0F);
    bfl.b(0.0F, -1.0F, 0.0F);
    d.h = 0.0F;
    d.a(☃);
    for (int ☃ = 0; ☃ < 2; ☃++)
    {
      bfl.o();
      float ☃ = ☃ * 3.1415927F * 2.0F;
      k.f = (0.125F - (float)Math.cos(☃) * 0.2F);
      k.g = 0.25F;
      k.h = ((float)(Math.sin(☃) + 0.125D) * 0.8F);
      l.h = (-(float)(Math.sin(☃ + 2.0F) + 0.5D) * 0.75F);
      
      e.f = (1.0F + ☃ * 0.1F);
      g.f = (0.5F + ☃ * 0.1F);
      i.f = (0.75F + ☃ * 0.1F);
      
      f.f = (1.3F + ☃ * 0.1F);
      h.f = (-0.5F - ☃ * 0.1F);
      j.f = (0.75F + ☃ * 0.1F);
      k.a(☃);
      f.a(☃);
      e.a(☃);
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
    ☃ = ☃.b(11, m);
    for (int ☃ = 0; ☃ < 12; ☃++)
    {
      ☃ = ☃.b(12 + ☃, m);
      ☃ = (float)(☃ + Math.sin(☃ * 0.45F + ☃) * 0.05000000074505806D);
      b.g = ((a(☃[0] - ☃[0]) * ☃ + 180.0F) * 3.1415927F / 180.0F);
      b.f = (☃ + (float)(☃[1] - ☃[1]) * 3.1415927F / 180.0F * ☃ * 5.0F);
      b.h = (a(☃[0] - ☃) * 3.1415927F / 180.0F * ☃);
      b.d = ☃;
      b.e = ☃;
      b.c = ☃;
      ☃ = (float)(☃ + Math.sin(b.f) * 10.0D);
      ☃ = (float)(☃ - Math.cos(b.g) * Math.cos(b.f) * 10.0D);
      ☃ = (float)(☃ - Math.sin(b.g) * Math.cos(b.f) * 10.0D);
      b.a(☃);
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
