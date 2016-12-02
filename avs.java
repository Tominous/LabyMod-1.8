public class avs
  extends avp
{
  protected static final jy a = new jy("textures/gui/widgets.png");
  protected int f = 200;
  protected int g = 20;
  public int h;
  public int i;
  public String j;
  public int k;
  public boolean l = true;
  public boolean m = true;
  protected boolean n;
  
  public avs(int ☃, int ☃, int ☃, String ☃)
  {
    this(☃, ☃, ☃, 200, 20, ☃);
  }
  
  public avs(int ☃, int ☃, int ☃, int ☃, int ☃, String ☃)
  {
    this.k = ☃;
    this.h = ☃;
    this.i = ☃;
    this.f = ☃;
    this.g = ☃;
    this.j = ☃;
  }
  
  protected int a(boolean ☃)
  {
    int ☃ = 1;
    if (!this.l) {
      ☃ = 0;
    } else if (☃) {
      ☃ = 2;
    }
    return ☃;
  }
  
  public void a(ave ☃, int ☃, int ☃)
  {
    if (!this.m) {
      return;
    }
    avn ☃ = ☃.k;
    
    ☃.P().a(a);
    bfl.c(1.0F, 1.0F, 1.0F, 1.0F);
    
    this.n = ((☃ >= this.h) && (☃ >= this.i) && (☃ < this.h + this.f) && (☃ < this.i + this.g));
    int ☃ = a(this.n);
    
    bfl.l();
    bfl.a(770, 771, 1, 0);
    bfl.b(770, 771);
    b(this.h, this.i, 0, 46 + ☃ * 20, this.f / 2, this.g);
    b(this.h + this.f / 2, this.i, 200 - this.f / 2, 46 + ☃ * 20, this.f / 2, this.g);
    
    b(☃, ☃, ☃);
    
    int ☃ = 14737632;
    if (!this.l) {
      ☃ = 10526880;
    } else if (this.n) {
      ☃ = 16777120;
    }
    a(☃, this.j, this.h + this.f / 2, this.i + (this.g - 8) / 2, ☃);
  }
  
  protected void b(ave ☃, int ☃, int ☃) {}
  
  public void a(int ☃, int ☃) {}
  
  public boolean c(ave ☃, int ☃, int ☃)
  {
    return (this.l) && (this.m) && (☃ >= this.h) && (☃ >= this.i) && (☃ < this.h + this.f) && (☃ < this.i + this.g);
  }
  
  public boolean a()
  {
    return this.n;
  }
  
  public void b(int ☃, int ☃) {}
  
  public void a(bpz ☃)
  {
    ☃.a(bpf.a(new jy("gui.button.press"), 1.0F));
  }
  
  public int b()
  {
    return this.f;
  }
  
  public void a(int ☃)
  {
    this.f = ☃;
  }
}
