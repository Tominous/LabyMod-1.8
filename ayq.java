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
    h = ☃;
  }
  
  public void e()
  {
    f.a();
  }
  
  public void b()
  {
    Keyboard.enableRepeatEvents(true);
    n.clear();
    n.add(i = new avs(0, l / 2 - 4 - 150, m / 4 + 120 + 12, 150, 20, bnq.a("gui.done", new Object[0])));
    n.add(r = new avs(1, l / 2 + 4, m / 4 + 120 + 12, 150, 20, bnq.a("gui.cancel", new Object[0])));
    n.add(s = new avs(4, l / 2 + 150 - 20, 150, 20, 20, "O"));
    
    f = new avw(2, q, l / 2 - 150, 50, 300, 20);
    f.f(32767);
    f.b(true);
    f.a(h.l());
    
    g = new avw(3, q, l / 2 - 150, 150, 276, 20);
    g.f(32767);
    g.c(false);
    g.a("-");
    
    t = h.m();
    a();
    
    i.l = (f.b().trim().length() > 0);
  }
  
  public void m()
  {
    Keyboard.enableRepeatEvents(false);
  }
  
  protected void a(avs ☃)
  {
    if (!l) {
      return;
    }
    if (k == 1)
    {
      h.a(t);
      j.a(null);
    }
    else if (k == 0)
    {
      em ☃ = new em(Unpooled.buffer());
      
      ☃.writeByte(h.i());
      h.a(☃);
      ☃.a(f.b());
      ☃.writeBoolean(h.m());
      j.u().a(new im("MC|AdvCdm", ☃));
      if (!h.m()) {
        h.b(null);
      }
      j.a(null);
    }
    else if (k == 4)
    {
      h.a(!h.m());
      a();
    }
  }
  
  protected void a(char ☃, int ☃)
  {
    f.a(☃, ☃);
    g.a(☃, ☃);
    i.l = (f.b().trim().length() > 0);
    if ((☃ == 28) || (☃ == 156)) {
      a(i);
    } else if (☃ == 1) {
      a(r);
    }
  }
  
  protected void a(int ☃, int ☃, int ☃)
  {
    super.a(☃, ☃, ☃);
    
    f.a(☃, ☃, ☃);
    g.a(☃, ☃, ☃);
  }
  
  public void a(int ☃, int ☃, float ☃)
  {
    c();
    
    a(q, bnq.a("advMode.setCommand", new Object[0]), l / 2, 20, 16777215);
    c(q, bnq.a("advMode.command", new Object[0]), l / 2 - 150, 37, 10526880);
    f.g();
    
    int ☃ = 75;
    int ☃ = 0;
    
    c(q, bnq.a("advMode.nearestPlayer", new Object[0]), l / 2 - 150, ☃ + ☃++ * q.a, 10526880);
    c(q, bnq.a("advMode.randomPlayer", new Object[0]), l / 2 - 150, ☃ + ☃++ * q.a, 10526880);
    c(q, bnq.a("advMode.allPlayers", new Object[0]), l / 2 - 150, ☃ + ☃++ * q.a, 10526880);
    c(q, bnq.a("advMode.allEntities", new Object[0]), l / 2 - 150, ☃ + ☃++ * q.a, 10526880);
    c(q, "", l / 2 - 150, ☃ + ☃++ * q.a, 10526880);
    if (g.b().length() > 0)
    {
      ☃ += ☃ * q.a + 16;
      c(q, bnq.a("advMode.previousOutput", new Object[0]), l / 2 - 150, ☃, 10526880);
      g.g();
    }
    super.a(☃, ☃, ☃);
  }
  
  private void a()
  {
    if (h.m())
    {
      s.j = "O";
      if (h.k() != null) {
        g.a(h.k().c());
      }
    }
    else
    {
      s.j = "X";
      g.a("-");
    }
  }
}
