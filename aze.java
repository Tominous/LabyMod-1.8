import java.util.List;
import org.lwjgl.input.Keyboard;

public class aze
  extends axu
{
  private aln a;
  private int f;
  private int g;
  private avs h;
  
  public aze(aln ☃)
  {
    a = ☃;
  }
  
  public void b()
  {
    n.clear();
    Keyboard.enableRepeatEvents(true);
    n.add(h = new avs(0, l / 2 - 100, m / 4 + 120, bnq.a("gui.done", new Object[0])));
    a.a(false);
  }
  
  public void m()
  {
    Keyboard.enableRepeatEvents(false);
    bcy ☃ = j.u();
    if (☃ != null) {
      ☃.a(new ix(a.v(), a.a));
    }
    a.a(true);
  }
  
  public void e()
  {
    f += 1;
  }
  
  protected void a(avs ☃)
  {
    if (!l) {
      return;
    }
    if (k == 0)
    {
      a.p_();
      j.a(null);
    }
  }
  
  protected void a(char ☃, int ☃)
  {
    if (☃ == 200) {
      g = (g - 1 & 0x3);
    }
    if ((☃ == 208) || (☃ == 28) || (☃ == 156)) {
      g = (g + 1 & 0x3);
    }
    String ☃ = a.a[g].c();
    if ((☃ == 14) && (☃.length() > 0)) {
      ☃ = ☃.substring(0, ☃.length() - 1);
    }
    if ((f.a(☃)) && (q.a(☃ + ☃) <= 90)) {
      ☃ = ☃ + ☃;
    }
    a.a[g] = new fa(☃);
    if (☃ == 1) {
      a(h);
    }
  }
  
  public void a(int ☃, int ☃, float ☃)
  {
    c();
    
    a(q, bnq.a("sign.edit", new Object[0]), l / 2, 40, 16777215);
    bfl.c(1.0F, 1.0F, 1.0F, 1.0F);
    
    bfl.E();
    bfl.b(l / 2, 0.0F, 50.0F);
    float ☃ = 93.75F;
    bfl.a(-☃, -☃, -☃);
    bfl.b(180.0F, 0.0F, 1.0F, 0.0F);
    
    afh ☃ = a.w();
    if (☃ == afi.an)
    {
      float ☃ = a.u() * 360 / 16.0F;
      bfl.b(☃, 0.0F, 1.0F, 0.0F);
      
      bfl.b(0.0F, -1.0625F, 0.0F);
    }
    else
    {
      int ☃ = a.u();
      float ☃ = 0.0F;
      if (☃ == 2) {
        ☃ = 180.0F;
      }
      if (☃ == 4) {
        ☃ = 90.0F;
      }
      if (☃ == 5) {
        ☃ = -90.0F;
      }
      bfl.b(☃, 0.0F, 1.0F, 0.0F);
      bfl.b(0.0F, -1.0625F, 0.0F);
    }
    if (f / 6 % 2 == 0) {
      a.f = g;
    }
    bhc.a.a(a, -0.5D, -0.75D, -0.5D, 0.0F);
    a.f = -1;
    
    bfl.F();
    
    super.a(☃, ☃, ☃);
  }
}
