import net.minecraft.realms.RealmsScrolledSelectionList;

public class aws
  extends awi
{
  private final RealmsScrolledSelectionList u;
  
  public aws(RealmsScrolledSelectionList ☃, int ☃, int ☃, int ☃, int ☃, int ☃)
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
}
