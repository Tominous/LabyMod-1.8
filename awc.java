public class awc
  extends avs
{
  private boolean o = false;
  
  public awc(int ☃, int ☃, int ☃)
  {
    super(☃, ☃, ☃, 20, 20, "");
  }
  
  public boolean c()
  {
    return this.o;
  }
  
  public void b(boolean ☃)
  {
    this.o = ☃;
  }
  
  public void a(ave ☃, int ☃, int ☃)
  {
    if (!this.m) {
      return;
    }
    ☃.P().a(avs.a);
    bfl.c(1.0F, 1.0F, 1.0F, 1.0F);
    
    boolean ☃ = (☃ >= this.h) && (☃ >= this.i) && (☃ < this.h + this.f) && (☃ < this.i + this.g);
    awc.a ☃;
    awc.a ☃;
    if (this.o)
    {
      awc.a ☃;
      if (!this.l)
      {
        ☃ = awc.a.c;
      }
      else
      {
        awc.a ☃;
        if (☃) {
          ☃ = awc.a.b;
        } else {
          ☃ = awc.a.a;
        }
      }
    }
    else
    {
      awc.a ☃;
      if (!this.l)
      {
        ☃ = awc.a.f;
      }
      else
      {
        awc.a ☃;
        if (☃) {
          ☃ = awc.a.e;
        } else {
          ☃ = awc.a.d;
        }
      }
    }
    b(this.h, this.i, ☃.a(), ☃.b(), this.f, this.g);
  }
  
  static enum a
  {
    private final int g;
    private final int h;
    
    private a(int ☃, int ☃)
    {
      this.g = ☃;
      this.h = ☃;
    }
    
    public int a()
    {
      return this.g;
    }
    
    public int b()
    {
      return this.h;
    }
  }
}
