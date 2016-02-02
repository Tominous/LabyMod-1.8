import java.util.Random;

class wb$d
  extends qq
{
  private float g;
  private int h;
  private wb i;
  private boolean j;
  
  public wb$d(wb ☃)
  {
    super(☃);
    this.i = ☃;
  }
  
  public void a(float ☃, boolean ☃)
  {
    this.g = ☃;
    this.j = ☃;
  }
  
  public void a(double ☃)
  {
    this.e = ☃;
    this.f = true;
  }
  
  public void c()
  {
    this.a.y = a(this.a.y, this.g, 30.0F);
    this.a.aK = this.a.y;
    this.a.aI = this.a.y;
    if (!this.f)
    {
      this.a.n(0.0F);
      return;
    }
    this.f = false;
    if (this.a.C)
    {
      this.a.k((float)(this.e * this.a.a(vy.d).e()));
      if (this.h-- <= 0)
      {
        this.h = this.i.cg();
        if (this.j) {
          this.h /= 3;
        }
        this.i.r().a();
        if (this.i.cn()) {
          this.i.a(this.i.ck(), this.i.bB(), ((this.i.bc().nextFloat() - this.i.bc().nextFloat()) * 0.2F + 1.0F) * 0.8F);
        }
      }
      else
      {
        this.i.aZ = (this.i.ba = 0.0F);
        this.a.k(0.0F);
      }
    }
    else
    {
      this.a.k((float)(this.e * this.a.a(vy.d).e()));
    }
  }
}
