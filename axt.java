import java.util.List;
import org.lwjgl.input.Keyboard;

public class axt
  extends axu
{
  private axu a;
  private avw f;
  private final String g;
  
  public axt(axu ☃, String ☃)
  {
    this.a = ☃;
    this.g = ☃;
  }
  
  public void e()
  {
    this.f.a();
  }
  
  public void b()
  {
    Keyboard.enableRepeatEvents(true);
    this.n.clear();
    this.n.add(new avs(0, this.l / 2 - 100, this.m / 4 + 96 + 12, bnq.a("selectWorld.renameButton", new Object[0])));
    this.n.add(new avs(1, this.l / 2 - 100, this.m / 4 + 120 + 12, bnq.a("gui.cancel", new Object[0])));
    
    atr ☃ = this.j.f();
    ato ☃ = ☃.c(this.g);
    String ☃ = ☃.k();
    
    this.f = new avw(2, this.q, this.l / 2 - 100, 60, 200, 20);
    this.f.b(true);
    this.f.a(☃);
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
      this.j.a(this.a);
    }
    else if (☃.k == 0)
    {
      atr ☃ = this.j.f();
      ☃.a(this.g, this.f.b().trim());
      
      this.j.a(this.a);
    }
  }
  
  protected void a(char ☃, int ☃)
  {
    this.f.a(☃, ☃);
    ((avs)this.n.get(0)).l = (this.f.b().trim().length() > 0);
    if ((☃ == 28) || (☃ == 156)) {
      a((avs)this.n.get(0));
    }
  }
  
  protected void a(int ☃, int ☃, int ☃)
  {
    super.a(☃, ☃, ☃);
    
    this.f.a(☃, ☃, ☃);
  }
  
  public void a(int ☃, int ☃, float ☃)
  {
    c();
    
    a(this.q, bnq.a("selectWorld.renameTitle", new Object[0]), this.l / 2, 20, 16777215);
    c(this.q, bnq.a("selectWorld.enterName", new Object[0]), this.l / 2 - 100, 47, 10526880);
    
    this.f.g();
    
    super.a(☃, ☃, ☃);
  }
}
