import io.netty.buffer.Unpooled;
import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class azd
  extends ayl
{
  private static final Logger u = ;
  private static final jy v = new jy("textures/gui/container/villager.png");
  private acy w;
  private azd.a x;
  private azd.a y;
  private int z;
  private eu A;
  
  public azd(wm ☃, acy ☃, adm ☃)
  {
    super(new yb(☃, ☃, ☃));
    w = ☃;
    A = ☃.f_();
  }
  
  public void b()
  {
    super.b();
    
    int ☃ = (l - f) / 2;
    int ☃ = (m - g) / 2;
    
    n.add(x = new azd.a(1, ☃ + 120 + 27, ☃ + 24 - 1, true));
    n.add(y = new azd.a(2, ☃ + 36 - 19, ☃ + 24 - 1, false));
    
    x.l = false;
    y.l = false;
  }
  
  protected void b(int ☃, int ☃)
  {
    String ☃ = A.c();
    q.a(☃, f / 2 - q.a(☃) / 2, 6, 4210752);
    q.a(bnq.a("container.inventory", new Object[0]), 8, g - 96 + 2, 4210752);
  }
  
  public void e()
  {
    super.e();
    
    ada ☃ = w.b_(j.h);
    if (☃ != null)
    {
      x.l = (z < ☃.size() - 1);
      y.l = (z > 0);
    }
  }
  
  protected void a(avs ☃)
  {
    boolean ☃ = false;
    if (☃ == x)
    {
      z += 1;
      ada ☃ = w.b_(j.h);
      if ((☃ != null) && (z >= ☃.size())) {
        z = (☃.size() - 1);
      }
      ☃ = true;
    }
    else if (☃ == y)
    {
      z -= 1;
      if (z < 0) {
        z = 0;
      }
      ☃ = true;
    }
    if (☃)
    {
      ((yb)h).d(z);
      
      em ☃ = new em(Unpooled.buffer());
      ☃.writeInt(z);
      j.u().a(new im("MC|TrSel", ☃));
    }
  }
  
  protected void a(float ☃, int ☃, int ☃)
  {
    bfl.c(1.0F, 1.0F, 1.0F, 1.0F);
    j.P().a(v);
    int ☃ = (l - f) / 2;
    int ☃ = (m - g) / 2;
    b(☃, ☃, 0, 0, f, g);
    
    ada ☃ = w.b_(j.h);
    if ((☃ != null) && (!☃.isEmpty()))
    {
      int ☃ = z;
      if ((☃ < 0) || (☃ >= ☃.size())) {
        return;
      }
      acz ☃ = (acz)☃.get(☃);
      if (☃.h())
      {
        j.P().a(v);
        bfl.c(1.0F, 1.0F, 1.0F, 1.0F);
        bfl.f();
        b(i + 83, r + 21, 212, 0, 28, 21);
        b(i + 83, r + 51, 212, 0, 28, 21);
      }
    }
  }
  
  public void a(int ☃, int ☃, float ☃)
  {
    super.a(☃, ☃, ☃);
    
    ada ☃ = w.b_(j.h);
    if ((☃ != null) && (!☃.isEmpty()))
    {
      int ☃ = (l - f) / 2;
      int ☃ = (m - g) / 2;
      
      int ☃ = z;
      acz ☃ = (acz)☃.get(☃);
      
      zx ☃ = ☃.a();
      zx ☃ = ☃.b();
      zx ☃ = ☃.d();
      
      bfl.E();
      
      avc.c();
      bfl.f();
      bfl.B();
      bfl.g();
      bfl.e();
      
      k.a = 100.0F;
      k.b(☃, ☃ + 36, ☃ + 24);
      k.a(q, ☃, ☃ + 36, ☃ + 24);
      if (☃ != null)
      {
        k.b(☃, ☃ + 62, ☃ + 24);
        k.a(q, ☃, ☃ + 62, ☃ + 24);
      }
      k.b(☃, ☃ + 120, ☃ + 24);
      k.a(q, ☃, ☃ + 120, ☃ + 24);
      k.a = 0.0F;
      
      bfl.f();
      if ((c(36, 24, 16, 16, ☃, ☃)) && (☃ != null)) {
        a(☃, ☃, ☃);
      } else if ((☃ != null) && (c(62, 24, 16, 16, ☃, ☃)) && (☃ != null)) {
        a(☃, ☃, ☃);
      } else if ((☃ != null) && (c(120, 24, 16, 16, ☃, ☃)) && (☃ != null)) {
        a(☃, ☃, ☃);
      } else if ((☃.h()) && ((c(83, 21, 28, 21, ☃, ☃)) || (c(83, 51, 28, 21, ☃, ☃)))) {
        a(bnq.a("merchant.deprecated", new Object[0]), ☃, ☃);
      }
      bfl.F();
      
      bfl.e();
      bfl.j();
      avc.b();
    }
  }
  
  public acy a()
  {
    return w;
  }
  
  static class a
    extends avs
  {
    private final boolean o;
    
    public a(int ☃, int ☃, int ☃, boolean ☃)
    {
      super(☃, ☃, 12, 19, "");
      o = ☃;
    }
    
    public void a(ave ☃, int ☃, int ☃)
    {
      if (!m) {
        return;
      }
      ☃.P().a(azd.f());
      bfl.c(1.0F, 1.0F, 1.0F, 1.0F);
      
      boolean ☃ = (☃ >= h) && (☃ >= i) && (☃ < h + f) && (☃ < i + g);
      int ☃ = 0;
      int ☃ = 176;
      if (!l) {
        ☃ += f * 2;
      } else if (☃) {
        ☃ += f;
      }
      if (!o) {
        ☃ += g;
      }
      b(h, i, ☃, ☃, f, g);
    }
  }
}
