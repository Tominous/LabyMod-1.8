import io.netty.buffer.Unpooled;
import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.lwjgl.input.Keyboard;

public class ayq
  extends axu
{
  private static final Logger a = ;
  private avw f;
  private avw g;
  private final adc h;
  private avs i;
  private avs r;
  private avs s;
  private boolean t;
  
  public ayq(adc ☃)
  {
    this.h = ☃;
  }
  
  public void e()
  {
    this.f.a();
  }
  
  public void b()
  {
    Keyboard.enableRepeatEvents(true);
    this.n.clear();
    this.n.add(this.i = new avs(0, this.l / 2 - 4 - 150, this.m / 4 + 120 + 12, 150, 20, bnq.a("gui.done", new Object[0])));
    this.n.add(this.r = new avs(1, this.l / 2 + 4, this.m / 4 + 120 + 12, 150, 20, bnq.a("gui.cancel", new Object[0])));
    this.n.add(this.s = new avs(4, this.l / 2 + 150 - 20, 150, 20, 20, "O"));
    
    this.f = new avw(2, this.q, this.l / 2 - 150, 50, 300, 20);
    this.f.f(32767);
    this.f.b(true);
    this.f.a(this.h.l());
    
    this.g = new avw(3, this.q, this.l / 2 - 150, 150, 276, 20);
    this.g.f(32767);
    this.g.c(false);
    this.g.a("-");
    
    this.t = this.h.m();
    a();
    
    this.i.l = (this.f.b().trim().length() > 0);
  }
  
  public void m()
  {
    Keyboard.enableRepeatEvents(false);
  }
  
  protected void a(avs ☃)
  {
    if (!☃.l) {
      return;
    }
    if (☃.k == 1)
    {
      this.h.a(this.t);
      this.j.a(null);
    }
    else if (☃.k == 0)
    {
      em ☃ = new em(Unpooled.buffer());
      
      ☃.writeByte(this.h.i());
      this.h.a(☃);
      ☃.a(this.f.b());
      ☃.writeBoolean(this.h.m());
      this.j.u().a(new im("MC|AdvCdm", ☃));
      if (!this.h.m()) {
        this.h.b(null);
      }
      this.j.a(null);
    }
    else if (☃.k == 4)
    {
      this.h.a(!this.h.m());
      a();
    }
  }
  
  protected void a(char ☃, int ☃)
  {
    this.f.a(☃, ☃);
    this.g.a(☃, ☃);
    this.i.l = (this.f.b().trim().length() > 0);
    if ((☃ == 28) || (☃ == 156)) {
      a(this.i);
    } else if (☃ == 1) {
      a(this.r);
    }
  }
  
  protected void a(int ☃, int ☃, int ☃)
  {
    super.a(☃, ☃, ☃);
    
    this.f.a(☃, ☃, ☃);
    this.g.a(☃, ☃, ☃);
  }
  
  public void a(int ☃, int ☃, float ☃)
  {
    c();
    
    a(this.q, bnq.a("advMode.setCommand", new Object[0]), this.l / 2, 20, 16777215);
    c(this.q, bnq.a("advMode.command", new Object[0]), this.l / 2 - 150, 37, 10526880);
    this.f.g();
    
    int ☃ = 75;
    int ☃ = 0;
    
    c(this.q, bnq.a("advMode.nearestPlayer", new Object[0]), this.l / 2 - 150, ☃ + ☃++ * this.q.a, 10526880);
    c(this.q, bnq.a("advMode.randomPlayer", new Object[0]), this.l / 2 - 150, ☃ + ☃++ * this.q.a, 10526880);
    c(this.q, bnq.a("advMode.allPlayers", new Object[0]), this.l / 2 - 150, ☃ + ☃++ * this.q.a, 10526880);
    c(this.q, bnq.a("advMode.allEntities", new Object[0]), this.l / 2 - 150, ☃ + ☃++ * this.q.a, 10526880);
    c(this.q, "", this.l / 2 - 150, ☃ + ☃++ * this.q.a, 10526880);
    if (this.g.b().length() > 0)
    {
      ☃ += ☃ * this.q.a + 16;
      c(this.q, bnq.a("advMode.previousOutput", new Object[0]), this.l / 2 - 150, ☃, 10526880);
      this.g.g();
    }
    super.a(☃, ☃, ☃);
  }
  
  private void a()
  {
    if (this.h.m())
    {
      this.s.j = "O";
      if (this.h.k() != null) {
        this.g.a(this.h.k().c());
      }
    }
    else
    {
      this.s.j = "X";
      this.g.a("-");
    }
  }
}
