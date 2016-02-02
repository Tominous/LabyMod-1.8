class ayn$d
  extends avs
{
  private final jy o;
  private final int p;
  private final int q;
  private boolean r;
  
  protected ayn$d(int ☃, int ☃, int ☃, jy ☃, int ☃, int ☃)
  {
    super(☃, ☃, ☃, 22, 22, "");
    this.o = ☃;
    this.p = ☃;
    this.q = ☃;
  }
  
  public void a(ave ☃, int ☃, int ☃)
  {
    if (!this.m) {
      return;
    }
    ☃.P().a(ayn.a());
    bfl.c(1.0F, 1.0F, 1.0F, 1.0F);
    
    this.n = ((☃ >= this.h) && (☃ >= this.i) && (☃ < this.h + this.f) && (☃ < this.i + this.g));
    int ☃ = 219;
    int ☃ = 0;
    if (!this.l) {
      ☃ += this.f * 2;
    } else if (this.r) {
      ☃ += this.f * 1;
    } else if (this.n) {
      ☃ += this.f * 3;
    }
    b(this.h, this.i, ☃, ☃, this.f, this.g);
    if (!ayn.a().equals(this.o)) {
      ☃.P().a(this.o);
    }
    b(this.h + 2, this.i + 2, this.p, this.q, 18, 18);
  }
  
  public boolean c()
  {
    return this.r;
  }
  
  public void b(boolean ☃)
  {
    this.r = ☃;
  }
}
