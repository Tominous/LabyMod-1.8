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
    o = p_i1077_4_;
    p = p_i1077_5_;
    q = p_i1077_6_;
  }
  
  public void a(ave mc, int mouseX, int mouseY)
  {
    if (m)
    {
      mc.P().a(ayn.a());
      bfl.c(1.0F, 1.0F, 1.0F, 1.0F);
      n = ((mouseX >= h) && (mouseY >= this.i) && (mouseX < h + f) && (mouseY < this.i + g));
      int i = 219;
      int j = 0;
      if (!l) {
        j += f * 2;
      } else if (r) {
        j += f * 1;
      } else if (n) {
        j += f * 3;
      }
      b(h, this.i, j, i, f, g);
      if (!ayn.a().equals(o)) {
        mc.P().a(o);
      }
      b(h + 2, this.i + 2, p, q, 18, 18);
    }
  }
  
  public boolean c()
  {
    return r;
  }
  
  public void b(boolean p_146140_1_)
  {
    r = p_146140_1_;
  }
}
