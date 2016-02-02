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
    super(new xk(☃, ☃, ave.A().h));
    this.x = ☃;
    this.v = ((xk)this.h);
  }
  
  public void b()
  {
    super.b();
    Keyboard.enableRepeatEvents(true);
    
    int ☃ = (this.l - this.f) / 2;
    int ☃ = (this.m - this.g) / 2;
    
    this.w = new avw(0, this.q, ☃ + 62, ☃ + 24, 103, 12);
    this.w.g(-1);
    this.w.h(-1);
    this.w.a(false);
    this.w.f(30);
    
    this.h.b(this);
    this.h.a(this);
  }
  
  public void m()
  {
    super.m();
    
    Keyboard.enableRepeatEvents(false);
    this.h.b(this);
  }
  
  protected void b(int ☃, int ☃)
  {
    bfl.f();
    bfl.k();
    this.q.a(bnq.a("container.repair", new Object[0]), 60, 6, 4210752);
    if (this.v.a > 0)
    {
      int ☃ = 8453920;
      boolean ☃ = true;
      String ☃ = bnq.a("container.repair.cost", new Object[] { Integer.valueOf(this.v.a) });
      if ((this.v.a >= 40) && (!this.j.h.bA.d))
      {
        ☃ = bnq.a("container.repair.expensive", new Object[0]);
        ☃ = 16736352;
      }
      else if (!this.v.a(2).e())
      {
        ☃ = false;
      }
      else if (!this.v.a(2).a(this.x.d))
      {
        ☃ = 16736352;
      }
      if (☃)
      {
        int ☃ = 0xFF000000 | (☃ & 0xFCFCFC) >> 2 | ☃ & 0xFF000000;
        int ☃ = this.f - 8 - this.q.a(☃);
        int ☃ = 67;
        if (this.q.a())
        {
          a(☃ - 3, ☃ - 2, this.f - 7, ☃ + 10, -16777216);
          a(☃ - 2, ☃ - 1, this.f - 8, ☃ + 9, -12895429);
        }
        else
        {
          this.q.a(☃, ☃, ☃ + 1, ☃);
          this.q.a(☃, ☃ + 1, ☃, ☃);
          this.q.a(☃, ☃ + 1, ☃ + 1, ☃);
        }
        this.q.a(☃, ☃, ☃, ☃);
      }
    }
    bfl.e();
  }
  
  protected void a(char ☃, int ☃)
  {
    if (this.w.a(☃, ☃)) {
      a();
    } else {
      super.a(☃, ☃);
    }
  }
  
  private void a()
  {
    String ☃ = this.w.b();
    
    yg ☃ = this.v.a(0);
    if ((☃ != null) && (☃.e()) && 
      (!☃.d().s()) && (☃.equals(☃.d().q()))) {
      ☃ = "";
    }
    this.v.a(☃);
    this.j.h.a.a(new im("MC|ItemName", new em(Unpooled.buffer()).a(☃)));
  }
  
  protected void a(int ☃, int ☃, int ☃)
  {
    super.a(☃, ☃, ☃);
    this.w.a(☃, ☃, ☃);
  }
  
  public void a(int ☃, int ☃, float ☃)
  {
    super.a(☃, ☃, ☃);
    
    bfl.f();
    bfl.k();
    this.w.g();
  }
  
  protected void a(float ☃, int ☃, int ☃)
  {
    bfl.c(1.0F, 1.0F, 1.0F, 1.0F);
    this.j.P().a(u);
    int ☃ = (this.l - this.f) / 2;
    int ☃ = (this.m - this.g) / 2;
    b(☃, ☃, 0, 0, this.f, this.g);
    
    b(☃ + 59, ☃ + 20, 0, this.g + (this.v.a(0).e() ? 0 : 16), 110, 16);
    if (((this.v.a(0).e()) || (this.v.a(1).e())) && (!this.v.a(2).e())) {
      b(☃ + 99, ☃ + 45, this.f, 0, 28, 21);
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
      this.w.a(☃ == null ? "" : ☃.q());
      this.w.c(☃ != null);
      if (☃ != null) {
        a();
      }
    }
  }
  
  public void a(xi ☃, int ☃, int ☃) {}
  
  public void a(xi ☃, og ☃) {}
}
