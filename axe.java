import java.util.List;

public class axe
  extends axu
  implements awx
{
  private int a;
  private boolean f = false;
  
  public void b()
  {
    this.n.clear();
    if (this.j.f.P().t())
    {
      if (this.j.E()) {
        this.n.add(new avs(1, this.l / 2 - 100, this.m / 4 + 96, bnq.a("deathScreen.deleteWorld", new Object[0])));
      } else {
        this.n.add(new avs(1, this.l / 2 - 100, this.m / 4 + 96, bnq.a("deathScreen.leaveServer", new Object[0])));
      }
    }
    else
    {
      this.n.add(new avs(0, this.l / 2 - 100, this.m / 4 + 72, bnq.a("deathScreen.respawn", new Object[0])));
      this.n.add(new avs(1, this.l / 2 - 100, this.m / 4 + 96, bnq.a("deathScreen.titleScreen", new Object[0])));
      if (this.j.L() == null) {
        ((avs)this.n.get(1)).l = false;
      }
    }
    for (avs ☃ : this.n) {
      ☃.l = false;
    }
  }
  
  protected void a(char ☃, int ☃) {}
  
  protected void a(avs ☃)
  {
    switch (☃.k)
    {
    case 0: 
      this.j.h.cb();
      this.j.a(null);
      break;
    case 1: 
      if (this.j.f.P().t())
      {
        this.j.a(new aya());
      }
      else
      {
        awy ☃ = new awy(this, bnq.a("deathScreen.quit.confirm", new Object[0]), "", bnq.a("deathScreen.titleScreen", new Object[0]), bnq.a("deathScreen.respawn", new Object[0]), 0);
        this.j.a(☃);
        ☃.b(20);
      }
      break;
    }
  }
  
  public void a(boolean ☃, int ☃)
  {
    if (☃)
    {
      this.j.f.H();
      this.j.a(null);
      this.j.a(new aya());
    }
    else
    {
      this.j.h.cb();
      this.j.a(null);
    }
  }
  
  public void a(int ☃, int ☃, float ☃)
  {
    a(0, 0, this.l, this.m, 1615855616, -1602211792);
    
    bfl.E();
    bfl.a(2.0F, 2.0F, 2.0F);
    
    boolean ☃ = this.j.f.P().t();
    
    String ☃ = ☃ ? bnq.a("deathScreen.title.hardcore", new Object[0]) : bnq.a("deathScreen.title", new Object[0]);
    a(this.q, ☃, this.l / 2 / 2, 30, 16777215);
    
    bfl.F();
    if (☃) {
      a(this.q, bnq.a("deathScreen.hardcoreInfo", new Object[0]), this.l / 2, 144, 16777215);
    }
    a(this.q, bnq.a("deathScreen.score", new Object[0]) + ": " + a.o + this.j.h.bX(), this.l / 2, 100, 16777215);
    
    super.a(☃, ☃, ☃);
  }
  
  public boolean d()
  {
    return false;
  }
  
  public void e()
  {
    super.e();
    
    this.a += 1;
    if (this.a == 20) {
      for (avs ☃ : this.n) {
        ☃.l = true;
      }
    }
  }
}
