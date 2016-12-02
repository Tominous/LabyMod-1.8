import net.minecraft.realms.RealmsClickableScrolledSelectionList;
import net.minecraft.realms.Tezzelator;
import org.lwjgl.input.Mouse;

public class awq
  extends awi
{
  private final RealmsClickableScrolledSelectionList u;
  
  public awq(RealmsClickableScrolledSelectionList ☃, int ☃, int ☃, int ☃, int ☃, int ☃)
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
    if ((m > 0.0F) && (Mouse.getEventButtonState())) {
      u.customMouseEvent(d, e, t, n, h);
    }
  }
  
  public void a(int ☃, int ☃, int ☃, Tezzelator ☃)
  {
    u.renderSelected(☃, ☃, ☃, ☃);
  }
  
  protected void b(int ☃, int ☃, int ☃, int ☃)
  {
    int ☃ = b();
    for (int ☃ = 0; ☃ < ☃; ☃++)
    {
      int ☃ = ☃ + ☃ * h + t;
      int ☃ = h - 4;
      if ((☃ > e) || (☃ + ☃ < d)) {
        a(☃, ☃, ☃);
      }
      if ((r) && (a(☃))) {
        a(b, ☃, ☃, Tezzelator.instance);
      }
      a(☃, ☃, ☃, ☃, ☃, ☃);
    }
  }
}
