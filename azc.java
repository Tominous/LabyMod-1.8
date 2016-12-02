import java.util.List;

public class azc
  extends ayw
{
  private float u;
  private float v;
  
  public azc(wn ☃)
  {
    super(☃.bj);
    this.p = true;
  }
  
  public void e()
  {
    if (this.j.c.h()) {
      this.j.a(new ayu(this.j.h));
    }
    a();
  }
  
  public void b()
  {
    this.n.clear();
    if (this.j.c.h()) {
      this.j.a(new ayu(this.j.h));
    } else {
      super.b();
    }
  }
  
  protected void b(int ☃, int ☃)
  {
    this.q.a(bnq.a("container.crafting", new Object[0]), 86, 16, 4210752);
  }
  
  public void a(int ☃, int ☃, float ☃)
  {
    super.a(☃, ☃, ☃);
    this.u = ☃;
    this.v = ☃;
  }
  
  protected void a(float ☃, int ☃, int ☃)
  {
    bfl.c(1.0F, 1.0F, 1.0F, 1.0F);
    this.j.P().a(a);
    int ☃ = this.i;
    int ☃ = this.r;
    b(☃, ☃, 0, 0, this.f, this.g);
    
    a(☃ + 51, ☃ + 75, 30, ☃ + 51 - this.u, ☃ + 75 - 50 - this.v, this.j.h);
  }
  
  public static void a(int ☃, int ☃, int ☃, float ☃, float ☃, pr ☃)
  {
    bfl.g();
    
    bfl.E();
    bfl.b(☃, ☃, 50.0F);
    bfl.a(-☃, ☃, ☃);
    bfl.b(180.0F, 0.0F, 0.0F, 1.0F);
    
    float ☃ = ☃.aI;
    float ☃ = ☃.y;
    float ☃ = ☃.z;
    float ☃ = ☃.aL;
    float ☃ = ☃.aK;
    
    bfl.b(135.0F, 0.0F, 1.0F, 0.0F);
    avc.b();
    bfl.b(-135.0F, 0.0F, 1.0F, 0.0F);
    
    bfl.b(-(float)Math.atan(☃ / 40.0F) * 20.0F, 1.0F, 0.0F, 0.0F);
    
    ☃.aI = ((float)Math.atan(☃ / 40.0F) * 20.0F);
    ☃.y = ((float)Math.atan(☃ / 40.0F) * 40.0F);
    ☃.z = (-(float)Math.atan(☃ / 40.0F) * 20.0F);
    ☃.aK = ☃.y;
    ☃.aL = ☃.y;
    
    bfl.b(0.0F, 0.0F, 0.0F);
    
    biu ☃ = ave.A().af();
    ☃.a(180.0F);
    ☃.a(false);
    ☃.a(☃, 0.0D, 0.0D, 0.0D, 0.0F, 1.0F);
    ☃.a(true);
    
    ☃.aI = ☃;
    ☃.y = ☃;
    ☃.z = ☃;
    ☃.aL = ☃;
    ☃.aK = ☃;
    bfl.F();
    avc.a();
    bfl.C();
    
    bfl.g(bqs.r);
    bfl.x();
    bfl.g(bqs.q);
  }
  
  protected void a(avs ☃)
  {
    if (☃.k == 0) {
      this.j.a(new aye(this, this.j.h.x()));
    }
    if (☃.k == 1) {
      this.j.a(new ayf(this, this.j.h.x()));
    }
  }
}
