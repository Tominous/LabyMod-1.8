import java.util.List;

public class azc
  extends ayw
{
  private float u;
  private float v;
  
  public azc(wn ☃)
  {
    super(bj);
    p = true;
  }
  
  public void e()
  {
    if (j.c.h()) {
      j.a(new ayu(j.h));
    }
    a();
  }
  
  public void b()
  {
    n.clear();
    if (j.c.h()) {
      j.a(new ayu(j.h));
    } else {
      super.b();
    }
  }
  
  protected void b(int ☃, int ☃)
  {
    q.a(bnq.a("container.crafting", new Object[0]), 86, 16, 4210752);
  }
  
  public void a(int ☃, int ☃, float ☃)
  {
    super.a(☃, ☃, ☃);
    u = ☃;
    v = ☃;
  }
  
  protected void a(float ☃, int ☃, int ☃)
  {
    bfl.c(1.0F, 1.0F, 1.0F, 1.0F);
    j.P().a(a);
    int ☃ = i;
    int ☃ = r;
    b(☃, ☃, 0, 0, f, g);
    
    a(☃ + 51, ☃ + 75, 30, ☃ + 51 - u, ☃ + 75 - 50 - v, j.h);
  }
  
  public static void a(int ☃, int ☃, int ☃, float ☃, float ☃, pr ☃)
  {
    bfl.g();
    
    bfl.E();
    bfl.b(☃, ☃, 50.0F);
    bfl.a(-☃, ☃, ☃);
    bfl.b(180.0F, 0.0F, 0.0F, 1.0F);
    
    float ☃ = aI;
    float ☃ = y;
    float ☃ = z;
    float ☃ = aL;
    float ☃ = aK;
    
    bfl.b(135.0F, 0.0F, 1.0F, 0.0F);
    avc.b();
    bfl.b(-135.0F, 0.0F, 1.0F, 0.0F);
    
    bfl.b(-(float)Math.atan(☃ / 40.0F) * 20.0F, 1.0F, 0.0F, 0.0F);
    
    aI = ((float)Math.atan(☃ / 40.0F) * 20.0F);
    y = ((float)Math.atan(☃ / 40.0F) * 40.0F);
    z = (-(float)Math.atan(☃ / 40.0F) * 20.0F);
    aK = y;
    aL = y;
    
    bfl.b(0.0F, 0.0F, 0.0F);
    
    biu ☃ = ave.A().af();
    ☃.a(180.0F);
    ☃.a(false);
    ☃.a(☃, 0.0D, 0.0D, 0.0D, 0.0F, 1.0F);
    ☃.a(true);
    
    aI = ☃;
    y = ☃;
    z = ☃;
    aL = ☃;
    aK = ☃;
    bfl.F();
    avc.a();
    bfl.C();
    
    bfl.g(bqs.r);
    bfl.x();
    bfl.g(bqs.q);
  }
  
  protected void a(avs ☃)
  {
    if (k == 0) {
      j.a(new aye(this, j.h.x()));
    }
    if (k == 1) {
      j.a(new ayf(this, j.h.x()));
    }
  }
}
