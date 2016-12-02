import net.minecraft.realms.RealmsSimpleScrolledSelectionList;

public class awt
  extends awi
{
  private final RealmsSimpleScrolledSelectionList u;
  
  public awt(RealmsSimpleScrolledSelectionList ☃, int ☃, int ☃, int ☃, int ☃, int ☃)
  {
    super(ave.A(), ☃, ☃, ☃, ☃, ☃);
    u = ☃;
  }
  
  protected int b()
  {
    return u.getItemCount();
  }
  
  protected void a(int ☃, boolean ☃, int ☃, int ☃)
  {
    u.selectItem(☃, ☃, ☃, ☃);
  }
  
  protected boolean a(int ☃)
  {
    return u.isSelectedItem(☃);
  }
  
  protected void a()
  {
    u.renderBackground();
  }
  
  protected void a(int ☃, int ☃, int ☃, int ☃, int ☃, int ☃)
  {
    u.renderItem(☃, ☃, ☃, ☃, ☃, ☃);
  }
  
  public int e()
  {
    return b;
  }
  
  public int f()
  {
    return j;
  }
  
  public int g()
  {
    return i;
  }
  
  protected int k()
  {
    return u.getMaxPosition();
  }
  
  protected int d()
  {
    return u.getScrollbarPosition();
  }
  
  public void p()
  {
    super.p();
  }
  
  public void a(int ☃, int ☃, float ☃)
  {
    if (!q) {
      return;
    }
    i = ☃;
    j = ☃;
    a();
    
    int ☃ = d();
    int ☃ = ☃ + 6;
    
    l();
    
    bfl.f();
    bfl.n();
    bfx ☃ = bfx.a();
    bfd ☃ = ☃.c();
    
    int ☃ = g + (b / 2 - c() / 2 + 2);
    int ☃ = d + 4 - (int)n;
    if (s) {
      a(☃, ☃, ☃);
    }
    b(☃, ☃, ☃, ☃);
    
    bfl.i();
    
    int ☃ = 4;
    
    c(0, d, 255, 255);
    c(e, c, 255, 255);
    
    bfl.l();
    bfl.a(770, 771, 0, 1);
    bfl.c();
    bfl.j(7425);
    
    bfl.x();
    
    int ☃ = m();
    if (☃ > 0)
    {
      int ☃ = (e - d) * (e - d) / k();
      ☃ = ns.a(☃, 32, e - d - 8);
      
      int ☃ = (int)n * (e - d - ☃) / ☃ + d;
      if (☃ < d) {
        ☃ = d;
      }
      ☃.a(7, bms.i);
      ☃.b(☃, e, 0.0D).a(0.0D, 1.0D).b(0, 0, 0, 255).d();
      ☃.b(☃, e, 0.0D).a(1.0D, 1.0D).b(0, 0, 0, 255).d();
      ☃.b(☃, d, 0.0D).a(1.0D, 0.0D).b(0, 0, 0, 255).d();
      ☃.b(☃, d, 0.0D).a(0.0D, 0.0D).b(0, 0, 0, 255).d();
      ☃.b();
      
      ☃.a(7, bms.i);
      ☃.b(☃, ☃ + ☃, 0.0D).a(0.0D, 1.0D).b(128, 128, 128, 255).d();
      ☃.b(☃, ☃ + ☃, 0.0D).a(1.0D, 1.0D).b(128, 128, 128, 255).d();
      ☃.b(☃, ☃, 0.0D).a(1.0D, 0.0D).b(128, 128, 128, 255).d();
      ☃.b(☃, ☃, 0.0D).a(0.0D, 0.0D).b(128, 128, 128, 255).d();
      ☃.b();
      
      ☃.a(7, bms.i);
      ☃.b(☃, ☃ + ☃ - 1, 0.0D).a(0.0D, 1.0D).b(192, 192, 192, 255).d();
      ☃.b(☃ - 1, ☃ + ☃ - 1, 0.0D).a(1.0D, 1.0D).b(192, 192, 192, 255).d();
      ☃.b(☃ - 1, ☃, 0.0D).a(1.0D, 0.0D).b(192, 192, 192, 255).d();
      ☃.b(☃, ☃, 0.0D).a(0.0D, 0.0D).b(192, 192, 192, 255).d();
      ☃.b();
    }
    b(☃, ☃);
    
    bfl.w();
    
    bfl.j(7424);
    bfl.d();
    bfl.k();
  }
}
