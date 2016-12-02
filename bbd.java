public class bbd
  extends bbj
{
  public boolean a;
  public boolean b;
  
  public bbd(float ☃)
  {
    super(0.0F, -14.0F, 64, 32);
    float ☃ = -14.0F;
    
    f = new bct(this, 0, 16);
    f.a(-4.0F, -8.0F, -4.0F, 8, 8, 8, ☃ - 0.5F);
    f.a(0.0F, 0.0F + ☃, 0.0F);
    
    g = new bct(this, 32, 16);
    g.a(-4.0F, 0.0F, -2.0F, 8, 12, 4, ☃);
    g.a(0.0F, 0.0F + ☃, 0.0F);
    
    h = new bct(this, 56, 0);
    h.a(-1.0F, -2.0F, -1.0F, 2, 30, 2, ☃);
    h.a(-3.0F, 2.0F + ☃, 0.0F);
    
    i = new bct(this, 56, 0);
    i.i = true;
    i.a(-1.0F, -2.0F, -1.0F, 2, 30, 2, ☃);
    i.a(5.0F, 2.0F + ☃, 0.0F);
    
    j = new bct(this, 56, 0);
    j.a(-1.0F, 0.0F, -1.0F, 2, 30, 2, ☃);
    j.a(-2.0F, 12.0F + ☃, 0.0F);
    
    k = new bct(this, 56, 0);
    k.i = true;
    k.a(-1.0F, 0.0F, -1.0F, 2, 30, 2, ☃);
    k.a(2.0F, 12.0F + ☃, 0.0F);
  }
  
  public void a(float ☃, float ☃, float ☃, float ☃, float ☃, float ☃, pk ☃)
  {
    super.a(☃, ☃, ☃, ☃, ☃, ☃, ☃);
    
    e.j = true;
    
    float ☃ = -14.0F;
    g.f = 0.0F;
    g.d = ☃;
    g.e = -0.0F;
    
    j.f -= 0.0F;
    k.f -= 0.0F; bct 
    
      tmp83_80 = h;8380f = ((float)(8380f * 0.5D)); bct 
      tmp100_97 = i;10097f = ((float)(10097f * 0.5D)); bct 
      tmp117_114 = j;117114f = ((float)(117114f * 0.5D)); bct 
      tmp134_131 = k;134131f = ((float)(134131f * 0.5D));
    
    float ☃ = 0.4F;
    if (h.f > ☃) {
      h.f = ☃;
    }
    if (i.f > ☃) {
      i.f = ☃;
    }
    if (h.f < -☃) {
      h.f = (-☃);
    }
    if (i.f < -☃) {
      i.f = (-☃);
    }
    if (j.f > ☃) {
      j.f = ☃;
    }
    if (k.f > ☃) {
      k.f = ☃;
    }
    if (j.f < -☃) {
      j.f = (-☃);
    }
    if (k.f < -☃) {
      k.f = (-☃);
    }
    if (a)
    {
      h.f = -0.5F;
      i.f = -0.5F;
      h.h = 0.05F;
      i.h = -0.05F;
    }
    h.e = 0.0F;
    i.e = 0.0F;
    j.e = 0.0F;
    k.e = 0.0F;
    
    j.d = (9.0F + ☃);
    k.d = (9.0F + ☃);
    
    e.e = -0.0F;
    e.d = (☃ + 1.0F);
    
    f.c = e.c;
    f.d = e.d;
    f.e = e.e;
    f.f = e.f;
    f.g = e.g;
    f.h = e.h;
    if (b)
    {
      float ☃ = 1.0F;
      e.d -= ☃ * 5.0F;
    }
  }
}
