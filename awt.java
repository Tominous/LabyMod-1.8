import net.minecraft.realms.RealmsSimpleScrolledSelectionList;

public class awt
  extends awi
{
  private final RealmsSimpleScrolledSelectionList u;
  
  public awt(RealmsSimpleScrolledSelectionList ☃, int ☃, int ☃, int ☃, int ☃, int ☃)
  {
    super(ave.A(), ☃, ☃, ☃, ☃, ☃);
    this.u = ☃;
  }
  
  protected int b()
  {
    return this.u.getItemCount();
  }
  
  protected void a(int ☃, boolean ☃, int ☃, int ☃)
  {
    this.u.selectItem(☃, ☃, ☃, ☃);
  }
  
  protected boolean a(int ☃)
  {
    return this.u.isSelectedItem(☃);
  }
  
  protected void a()
  {
    this.u.renderBackground();
  }
  
  protected void a(int ☃, int ☃, int ☃, int ☃, int ☃, int ☃)
  {
    this.u.renderItem(☃, ☃, ☃, ☃, ☃, ☃);
  }
  
  public int e()
  {
    return this.b;
  }
  
  public int f()
  {
    return this.j;
  }
  
  public int g()
  {
    return this.i;
  }
  
  protected int k()
  {
    return this.u.getMaxPosition();
  }
  
  protected int d()
  {
    return this.u.getScrollbarPosition();
  }
  
  public void p()
  {
    super.p();
  }
  
  public void a(int ☃, int ☃, float ☃)
  {
    if (!this.q) {
      return;
    }
    this.i = ☃;
    this.j = ☃;
    a();
    
    int ☃ = d();
    int ☃ = ☃ + 6;
    
    l();
    
    bfl.f();
    bfl.n();
    bfx ☃ = bfx.a();
    bfd ☃ = ☃.c();
    
    int ☃ = this.g + (this.b / 2 - c() / 2 + 2);
    int ☃ = this.d + 4 - (int)this.n;
    if (this.s) {
      a(☃, ☃, ☃);
    }
    b(☃, ☃, ☃, ☃);
    
    bfl.i();
    
    int ☃ = 4;
    
    c(0, this.d, 255, 255);
    c(this.e, this.c, 255, 255);
    
    bfl.l();
    bfl.a(770, 771, 0, 1);
    bfl.c();
    bfl.j(7425);
    
    bfl.x();
    
    int ☃ = m();
    if (☃ > 0)
    {
      int ☃ = (this.e - this.d) * (this.e - this.d) / k();
      ☃ = ns.a(☃, 32, this.e - this.d - 8);
      
      int ☃ = (int)this.n * (this.e - this.d - ☃) / ☃ + this.d;
      if (☃ < this.d) {
        ☃ = this.d;
      }
      ☃.a(7, bms.i);
      ☃.b(☃, this.e, 0.0D).a(0.0D, 1.0D).b(0, 0, 0, 255).d();
      ☃.b(☃, this.e, 0.0D).a(1.0D, 1.0D).b(0, 0, 0, 255).d();
      ☃.b(☃, this.d, 0.0D).a(1.0D, 0.0D).b(0, 0, 0, 255).d();
      ☃.b(☃, this.d, 0.0D).a(0.0D, 0.0D).b(0, 0, 0, 255).d();
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
