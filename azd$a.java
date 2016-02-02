class azd$a
  extends avs
{
  private final boolean o;
  
  public azd$a(int ☃, int ☃, int ☃, boolean ☃)
  {
    super(☃, ☃, ☃, 12, 19, "");
    this.o = ☃;
  }
  
  public void a(ave ☃, int ☃, int ☃)
  {
    if (!this.m) {
      return;
    }
    ☃.P().a(azd.f());
    bfl.c(1.0F, 1.0F, 1.0F, 1.0F);
    
    boolean ☃ = (☃ >= this.h) && (☃ >= this.i) && (☃ < this.h + this.f) && (☃ < this.i + this.g);
    int ☃ = 0;
    int ☃ = 176;
    if (!this.l) {
      ☃ += this.f * 2;
    } else if (☃) {
      ☃ += this.f;
    }
    if (!this.o) {
      ☃ += this.g;
    }
    b(this.h, this.i, ☃, ☃, this.f, this.g);
  }
}
