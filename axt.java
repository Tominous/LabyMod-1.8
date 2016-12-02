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
    a = ☃;
    g = ☃;
  }
  
  public void e()
  {
    f.a();
  }
  
  public void b()
  {
    Keyboard.enableRepeatEvents(true);
    n.clear();
    n.add(new avs(0, l / 2 - 100, m / 4 + 96 + 12, bnq.a("selectWorld.renameButton", new Object[0])));
    n.add(new avs(1, l / 2 - 100, m / 4 + 120 + 12, bnq.a("gui.cancel", new Object[0])));
    
    atr ☃ = j.f();
    ato ☃ = ☃.c(g);
    String ☃ = ☃.k();
    
    f = new avw(2, q, l / 2 - 100, 60, 200, 20);
    f.b(true);
    f.a(☃);
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
      j.a(a);
    }
    else if (k == 0)
    {
      atr ☃ = j.f();
      ☃.a(g, f.b().trim());
      
      j.a(a);
    }
  }
  
  protected void a(char ☃, int ☃)
  {
    f.a(☃, ☃);
    n.get(0)).l = (f.b().trim().length() > 0);
    if ((☃ == 28) || (☃ == 156)) {
      a((avs)n.get(0));
    }
  }
  
  protected void a(int ☃, int ☃, int ☃)
  {
    super.a(☃, ☃, ☃);
    
    f.a(☃, ☃, ☃);
  }
  
  public void a(int ☃, int ☃, float ☃)
  {
    c();
    
    a(q, bnq.a("selectWorld.renameTitle", new Object[0]), l / 2, 20, 16777215);
    c(q, bnq.a("selectWorld.enterName", new Object[0]), l / 2 - 100, 47, 10526880);
    
    f.g();
    
    super.a(☃, ☃, ☃);
  }
}
