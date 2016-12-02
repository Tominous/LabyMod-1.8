class ayn$d
  extends avs
{
  private final jy o;
  private final int p;
  private final int q;
  private boolean r;
  
  protected ayn$d(int p_i1077_1_, int p_i1077_2_, int p_i1077_3_, jy p_i1077_4_, int p_i1077_5_, int p_i1077_6_)
  {
    super(p_i1077_1_, p_i1077_2_, p_i1077_3_, 22, 22, "");
    this.o = p_i1077_4_;
    this.p = p_i1077_5_;
    this.q = p_i1077_6_;
  }
  
  public void a(ave mc, int mouseX, int mouseY)
  {
    if (this.m)
    {
      mc.P().a(ayn.a());
      bfl.c(1.0F, 1.0F, 1.0F, 1.0F);
      this.n = ((mouseX >= this.h) && (mouseY >= this.i) && (mouseX < this.h + this.f) && (mouseY < this.i + this.g));
      int i = 219;
      int j = 0;
      if (!this.l) {
        j += this.f * 2;
      } else if (this.r) {
        j += this.f * 1;
      } else if (this.n) {
        j += this.f * 3;
      }
      b(this.h, this.i, j, i, this.f, this.g);
      if (!ayn.a().equals(this.o)) {
        mc.P().a(this.o);
      }
      b(this.h + 2, this.i + 2, this.p, this.q, 18, 18);
    }
  }
  
  public boolean c()
  {
    return this.r;
  }
  
  public void b(boolean p_146140_1_)
  {
    this.r = p_146140_1_;
  }
}
