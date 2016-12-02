import net.minecraft.realms.RealmsScrolledSelectionList;

public class aws
  extends awi
{
  private final RealmsScrolledSelectionList u;
  
  public aws(RealmsScrolledSelectionList ☃, int ☃, int ☃, int ☃, int ☃, int ☃)
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
}
