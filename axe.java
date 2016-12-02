import java.util.List;

public class axe
  extends axu
  implements awx
{
  private int a;
  private boolean f = false;
  
  public void b()
  {
    n.clear();
    if (j.f.P().t())
    {
      if (j.E()) {
        n.add(new avs(1, l / 2 - 100, m / 4 + 96, bnq.a("deathScreen.deleteWorld", new Object[0])));
      } else {
        n.add(new avs(1, l / 2 - 100, m / 4 + 96, bnq.a("deathScreen.leaveServer", new Object[0])));
      }
    }
    else
    {
      n.add(new avs(0, l / 2 - 100, m / 4 + 72, bnq.a("deathScreen.respawn", new Object[0])));
      n.add(new avs(1, l / 2 - 100, m / 4 + 96, bnq.a("deathScreen.titleScreen", new Object[0])));
      if (j.L() == null) {
        n.get(1)).l = false;
      }
    }
    for (avs ☃ : n) {
      l = false;
    }
  }
  
  protected void a(char ☃, int ☃) {}
  
  protected void a(avs ☃)
  {
    switch (k)
    {
    case 0: 
      j.h.cb();
      j.a(null);
      break;
    case 1: 
      if (j.f.P().t())
      {
        j.a(new aya());
      }
      else
      {
        awy ☃ = new awy(this, bnq.a("deathScreen.quit.confirm", new Object[0]), "", bnq.a("deathScreen.titleScreen", new Object[0]), bnq.a("deathScreen.respawn", new Object[0]), 0);
        j.a(☃);
        ☃.b(20);
      }
      break;
    }
  }
  
  public void a(boolean ☃, int ☃)
  {
    if (☃)
    {
      j.f.H();
      j.a(null);
      j.a(new aya());
    }
    else
    {
      j.h.cb();
      j.a(null);
    }
  }
  
  public void a(int ☃, int ☃, float ☃)
  {
    a(0, 0, l, m, 1615855616, -1602211792);
    
    bfl.E();
    bfl.a(2.0F, 2.0F, 2.0F);
    
    boolean ☃ = j.f.P().t();
    
    String ☃ = ☃ ? bnq.a("deathScreen.title.hardcore", new Object[0]) : bnq.a("deathScreen.title", new Object[0]);
    a(q, ☃, l / 2 / 2, 30, 16777215);
    
    bfl.F();
    if (☃) {
      a(q, bnq.a("deathScreen.hardcoreInfo", new Object[0]), l / 2, 144, 16777215);
    }
    a(q, bnq.a("deathScreen.score", new Object[0]) + ": " + a.o + j.h.bX(), l / 2, 100, 16777215);
    
    super.a(☃, ☃, ☃);
  }
  
  public boolean d()
  {
    return false;
  }
  
  public void e()
  {
    super.e();
    
    a += 1;
    if (a == 20) {
      for (avs ☃ : n) {
        l = true;
      }
    }
  }
}
