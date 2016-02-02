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
    this.f = ☃;
    this.g = ☃;
  }
  
  public void b()
  {
    int ☃ = 0;
    this.a = bnq.a("options.sounds.title", new Object[0]);
    this.h = bnq.a("options.off", new Object[0]);
    
    this.n.add(new axz.a(bpg.a.b(), this.l / 2 - 155 + ☃ % 2 * 160, this.m / 6 - 12 + 24 * (☃ >> 1), bpg.a, true));
    ☃ += 2;
    for (bpg ☃ : bpg.values()) {
      if (☃ != bpg.a)
      {
        this.n.add(new axz.a(☃.b(), this.l / 2 - 155 + ☃ % 2 * 160, this.m / 6 - 12 + 24 * (☃ >> 1), ☃, false));
        
        ☃++;
      }
    }
    this.n.add(new avs(200, this.l / 2 - 100, this.m / 6 + 168, bnq.a("gui.done", new Object[0])));
  }
  
  protected void a(avs ☃)
  {
    if (!☃.l) {
      return;
    }
    if (☃.k == 200)
    {
      this.j.t.b();
      this.j.a(this.f);
    }
  }
  
  public void a(int ☃, int ☃, float ☃)
  {
    c();
    a(this.q, this.a, this.l / 2, 15, 16777215);
    super.a(☃, ☃, ☃);
  }
  
  protected String a(bpg ☃)
  {
    float ☃ = this.g.a(☃);
    if (☃ == 0.0F) {
      return this.h;
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
      this.r = ☃;
      this.s = bnq.a("soundCategory." + ☃.a(), new Object[0]);
      this.j = (this.s + ": " + axz.this.a(☃));
      this.o = axz.a(axz.this).a(☃);
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
        this.j = (this.s + ": " + axz.this.a(this.r));
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
        this.j = (this.s + ": " + axz.this.a(this.r));
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
        float ☃ = this.r == bpg.a ? 1.0F : axz.a(axz.this).a(this.r);
        axz.this.j.W().a(bpf.a(new jy("gui.button.press"), 1.0F));
      }
      this.p = false;
    }
  }
}
