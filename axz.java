import java.util.List;

public class axz
  extends axu
{
  private final axu f;
  private final avh g;
  protected String a = "Options";
  private String h;
  
  public axz(axu ☃, avh ☃)
  {
    f = ☃;
    g = ☃;
  }
  
  public void b()
  {
    int ☃ = 0;
    a = bnq.a("options.sounds.title", new Object[0]);
    h = bnq.a("options.off", new Object[0]);
    
    n.add(new axz.a(bpg.a.b(), l / 2 - 155 + ☃ % 2 * 160, m / 6 - 12 + 24 * (☃ >> 1), bpg.a, true));
    ☃ += 2;
    for (bpg ☃ : bpg.values()) {
      if (☃ != bpg.a)
      {
        n.add(new axz.a(☃.b(), l / 2 - 155 + ☃ % 2 * 160, m / 6 - 12 + 24 * (☃ >> 1), ☃, false));
        
        ☃++;
      }
    }
    n.add(new avs(200, l / 2 - 100, m / 6 + 168, bnq.a("gui.done", new Object[0])));
  }
  
  protected void a(avs ☃)
  {
    if (!l) {
      return;
    }
    if (k == 200)
    {
      j.t.b();
      j.a(f);
    }
  }
  
  public void a(int ☃, int ☃, float ☃)
  {
    c();
    a(q, a, l / 2, 15, 16777215);
    super.a(☃, ☃, ☃);
  }
  
  protected String a(bpg ☃)
  {
    float ☃ = g.a(☃);
    if (☃ == 0.0F) {
      return h;
    }
    return (int)(☃ * 100.0F) + "%";
  }
  
  class a
    extends avs
  {
    private final bpg r;
    private final String s;
    public float o = 1.0F;
    public boolean p;
    
    public a(int ☃, int ☃, int ☃, bpg ☃, boolean ☃)
    {
      super(☃, ☃, ☃ ? 310 : 150, 20, "");
      r = ☃;
      s = bnq.a("soundCategory." + ☃.a(), new Object[0]);
      j = (s + ": " + a(☃));
      o = axz.a(axz.this).a(☃);
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
        j = (s + ": " + a(r));
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
        j = (s + ": " + a(r));
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
        float ☃ = r == bpg.a ? 1.0F : axz.a(axz.this).a(r);
        j.W().a(bpf.a(new jy("gui.button.press"), 1.0F));
      }
      p = false;
    }
  }
}
