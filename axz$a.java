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
    r = ☃;
    s = bnq.a("soundCategory." + ☃.a(), new Object[0]);
    j = (s + ": " + paramaxz.a(☃));
    o = axz.a(paramaxz).a(☃);
  }
  
  protected int a(boolean ☃)
  {
    return 0;
  }
  
  protected void b(ave ☃, int ☃, int ☃)
  {
    if (!m) {
      return;
    }
    if (p)
    {
      o = ((☃ - (h + 4)) / (f - 8));
      o = ns.a(o, 0.0F, 1.0F);
      t.a(r, o);
      t.b();
      j = (s + ": " + q.a(r));
    }
    bfl.c(1.0F, 1.0F, 1.0F, 1.0F);
    b(h + (int)(o * (f - 8)), i, 0, 66, 4, 20);
    b(h + (int)(o * (f - 8)) + 4, i, 196, 66, 4, 20);
  }
  
  public boolean c(ave ☃, int ☃, int ☃)
  {
    if (super.c(☃, ☃, ☃))
    {
      o = ((☃ - (h + 4)) / (f - 8));
      o = ns.a(o, 0.0F, 1.0F);
      t.a(r, o);
      t.b();
      j = (s + ": " + q.a(r));
      p = true;
      return true;
    }
    return false;
  }
  
  public void a(bpz ☃) {}
  
  public void a(int ☃, int ☃)
  {
    if (p)
    {
      float ☃ = r == bpg.a ? 1.0F : axz.a(q).a(r);
      q.j.W().a(bpf.a(new jy("gui.button.press"), 1.0F));
    }
    p = false;
  }
}
