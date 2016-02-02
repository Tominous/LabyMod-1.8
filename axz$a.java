class axz$a
  extends avs
{
  private final bpg r;
  private final String s;
  public float o = 1.0F;
  public boolean p;
  
  public axz$a(axz paramaxz, int ☃, int ☃, int ☃, bpg ☃, boolean ☃)
  {
    super(☃, ☃, ☃, ☃ ? 310 : 150, 20, "");
    this.r = ☃;
    this.s = bnq.a("soundCategory." + ☃.a(), new Object[0]);
    this.j = (this.s + ": " + paramaxz.a(☃));
    this.o = axz.a(paramaxz).a(☃);
  }
  
  protected int a(boolean ☃)
  {
    return 0;
  }
  
  protected void b(ave ☃, int ☃, int ☃)
  {
    if (!this.m) {
      return;
    }
    if (this.p)
    {
      this.o = ((☃ - (this.h + 4)) / (this.f - 8));
      this.o = ns.a(this.o, 0.0F, 1.0F);
      ☃.t.a(this.r, this.o);
      ☃.t.b();
      this.j = (this.s + ": " + this.q.a(this.r));
    }
    bfl.c(1.0F, 1.0F, 1.0F, 1.0F);
    b(this.h + (int)(this.o * (this.f - 8)), this.i, 0, 66, 4, 20);
    b(this.h + (int)(this.o * (this.f - 8)) + 4, this.i, 196, 66, 4, 20);
  }
  
  public boolean c(ave ☃, int ☃, int ☃)
  {
    if (super.c(☃, ☃, ☃))
    {
      this.o = ((☃ - (this.h + 4)) / (this.f - 8));
      this.o = ns.a(this.o, 0.0F, 1.0F);
      ☃.t.a(this.r, this.o);
      ☃.t.b();
      this.j = (this.s + ": " + this.q.a(this.r));
      this.p = true;
      return true;
    }
    return false;
  }
  
  public void a(bpz ☃) {}
  
  public void a(int ☃, int ☃)
  {
    if (this.p)
    {
      float ☃ = this.r == bpg.a ? 1.0F : axz.a(this.q).a(this.r);
      this.q.j.W().a(bpf.a(new jy("gui.button.press"), 1.0F));
    }
    this.p = false;
  }
}
