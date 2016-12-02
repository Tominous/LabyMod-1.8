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
    k = ☃;
    h = ☃;
    i = ☃;
    f = ☃;
    g = ☃;
    j = ☃;
  }
  
  protected int a(boolean ☃)
  {
    int ☃ = 1;
    if (!l) {
      ☃ = 0;
    } else if (☃) {
      ☃ = 2;
    }
    return ☃;
  }
  
  public void a(ave ☃, int ☃, int ☃)
  {
    if (!m) {
      return;
    }
    avn ☃ = k;
    
    ☃.P().a(a);
    bfl.c(1.0F, 1.0F, 1.0F, 1.0F);
    
    n = ((☃ >= h) && (☃ >= i) && (☃ < h + f) && (☃ < i + g));
    int ☃ = a(n);
    
    bfl.l();
    bfl.a(770, 771, 1, 0);
    bfl.b(770, 771);
    b(h, i, 0, 46 + ☃ * 20, f / 2, g);
    b(h + f / 2, i, 200 - f / 2, 46 + ☃ * 20, f / 2, g);
    
    b(☃, ☃, ☃);
    
    int ☃ = 14737632;
    if (!l) {
      ☃ = 10526880;
    } else if (n) {
      ☃ = 16777120;
    }
    a(☃, j, h + f / 2, i + (g - 8) / 2, ☃);
  }
  
  protected void b(ave ☃, int ☃, int ☃) {}
  
  public void a(int ☃, int ☃) {}
  
  public boolean c(ave ☃, int ☃, int ☃)
  {
    return (l) && (m) && (☃ >= h) && (☃ >= i) && (☃ < h + f) && (☃ < i + g);
  }
  
  public boolean a()
  {
    return n;
  }
  
  public void b(int ☃, int ☃) {}
  
  public void a(bpz ☃)
  {
    ☃.a(bpf.a(new jy("gui.button.press"), 1.0F));
  }
  
  public int b()
  {
    return f;
  }
  
  public void a(int ☃)
  {
    f = ☃;
  }
}
