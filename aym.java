import io.netty.buffer.Unpooled;
import java.util.List;
import org.lwjgl.input.Keyboard;

public class aym
  extends ayl
  implements xn
{
  private static final jy u = new jy("textures/gui/container/anvil.png");
  private xk v;
  private avw w;
  private wm x;
  
  public aym(wm ☃, adm ☃)
  {
    super(new xk(☃, ☃, Ah));
    x = ☃;
    v = ((xk)h);
  }
  
  public void b()
  {
    super.b();
    Keyboard.enableRepeatEvents(true);
    
    int ☃ = (l - f) / 2;
    int ☃ = (m - g) / 2;
    
    w = new avw(0, q, ☃ + 62, ☃ + 24, 103, 12);
    w.g(-1);
    w.h(-1);
    w.a(false);
    w.f(30);
    
    h.b(this);
    h.a(this);
  }
  
  public void m()
  {
    super.m();
    
    Keyboard.enableRepeatEvents(false);
    h.b(this);
  }
  
  protected void b(int ☃, int ☃)
  {
    bfl.f();
    bfl.k();
    q.a(bnq.a("container.repair", new Object[0]), 60, 6, 4210752);
    if (v.a > 0)
    {
      int ☃ = 8453920;
      boolean ☃ = true;
      String ☃ = bnq.a("container.repair.cost", new Object[] { Integer.valueOf(v.a) });
      if ((v.a >= 40) && (!j.h.bA.d))
      {
        ☃ = bnq.a("container.repair.expensive", new Object[0]);
        ☃ = 16736352;
      }
      else if (!v.a(2).e())
      {
        ☃ = false;
      }
      else if (!v.a(2).a(x.d))
      {
        ☃ = 16736352;
      }
      if (☃)
      {
        int ☃ = 0xFF000000 | (☃ & 0xFCFCFC) >> 2 | ☃ & 0xFF000000;
        int ☃ = f - 8 - q.a(☃);
        int ☃ = 67;
        if (q.a())
        {
          a(☃ - 3, ☃ - 2, f - 7, ☃ + 10, -16777216);
          a(☃ - 2, ☃ - 1, f - 8, ☃ + 9, -12895429);
        }
        else
        {
          q.a(☃, ☃, ☃ + 1, ☃);
          q.a(☃, ☃ + 1, ☃, ☃);
          q.a(☃, ☃ + 1, ☃ + 1, ☃);
        }
        q.a(☃, ☃, ☃, ☃);
      }
    }
    bfl.e();
  }
  
  protected void a(char ☃, int ☃)
  {
    if (w.a(☃, ☃)) {
      a();
    } else {
      super.a(☃, ☃);
    }
  }
  
  private void a()
  {
    String ☃ = w.b();
    
    yg ☃ = v.a(0);
    if ((☃ != null) && (☃.e()) && 
      (!☃.d().s()) && (☃.equals(☃.d().q()))) {
      ☃ = "";
    }
    v.a(☃);
    j.h.a.a(new im("MC|ItemName", new em(Unpooled.buffer()).a(☃)));
  }
  
  protected void a(int ☃, int ☃, int ☃)
  {
    super.a(☃, ☃, ☃);
    w.a(☃, ☃, ☃);
  }
  
  public void a(int ☃, int ☃, float ☃)
  {
    super.a(☃, ☃, ☃);
    
    bfl.f();
    bfl.k();
    w.g();
  }
  
  protected void a(float ☃, int ☃, int ☃)
  {
    bfl.c(1.0F, 1.0F, 1.0F, 1.0F);
    j.P().a(u);
    int ☃ = (l - f) / 2;
    int ☃ = (m - g) / 2;
    b(☃, ☃, 0, 0, f, g);
    
    b(☃ + 59, ☃ + 20, 0, g + (v.a(0).e() ? 0 : 16), 110, 16);
    if (((v.a(0).e()) || (v.a(1).e())) && (!v.a(2).e())) {
      b(☃ + 99, ☃ + 45, f, 0, 28, 21);
    }
  }
  
  public void a(xi ☃, List<zx> ☃)
  {
    a(☃, 0, ☃.a(0).d());
  }
  
  public void a(xi ☃, int ☃, zx ☃)
  {
    if (☃ == 0)
    {
      w.a(☃ == null ? "" : ☃.q());
      w.c(☃ != null);
      if (☃ != null) {
        a();
      }
    }
  }
  
  public void a(xi ☃, int ☃, int ☃) {}
  
  public void a(xi ☃, og ☃) {}
}
