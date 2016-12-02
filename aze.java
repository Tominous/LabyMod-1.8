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
    this.a = ☃;
  }
  
  public void b()
  {
    this.n.clear();
    Keyboard.enableRepeatEvents(true);
    this.n.add(this.h = new avs(0, this.l / 2 - 100, this.m / 4 + 120, bnq.a("gui.done", new Object[0])));
    this.a.a(false);
  }
  
  public void m()
  {
    Keyboard.enableRepeatEvents(false);
    bcy ☃ = this.j.u();
    if (☃ != null) {
      ☃.a(new ix(this.a.v(), this.a.a));
    }
    this.a.a(true);
  }
  
  public void e()
  {
    this.f += 1;
  }
  
  protected void a(avs ☃)
  {
    if (!☃.l) {
      return;
    }
    if (☃.k == 0)
    {
      this.a.p_();
      this.j.a(null);
    }
  }
  
  protected void a(char ☃, int ☃)
  {
    if (☃ == 200) {
      this.g = (this.g - 1 & 0x3);
    }
    if ((☃ == 208) || (☃ == 28) || (☃ == 156)) {
      this.g = (this.g + 1 & 0x3);
    }
    String ☃ = this.a.a[this.g].c();
    if ((☃ == 14) && (☃.length() > 0)) {
      ☃ = ☃.substring(0, ☃.length() - 1);
    }
    if ((f.a(☃)) && (this.q.a(☃ + ☃) <= 90)) {
      ☃ = ☃ + ☃;
    }
    this.a.a[this.g] = new fa(☃);
    if (☃ == 1) {
      a(this.h);
    }
  }
  
  public void a(int ☃, int ☃, float ☃)
  {
    c();
    
    a(this.q, bnq.a("sign.edit", new Object[0]), this.l / 2, 40, 16777215);
    bfl.c(1.0F, 1.0F, 1.0F, 1.0F);
    
    bfl.E();
    bfl.b(this.l / 2, 0.0F, 50.0F);
    float ☃ = 93.75F;
    bfl.a(-☃, -☃, -☃);
    bfl.b(180.0F, 0.0F, 1.0F, 0.0F);
    
    afh ☃ = this.a.w();
    if (☃ == afi.an)
    {
      float ☃ = this.a.u() * 360 / 16.0F;
      bfl.b(☃, 0.0F, 1.0F, 0.0F);
      
      bfl.b(0.0F, -1.0625F, 0.0F);
    }
    else
    {
      int ☃ = this.a.u();
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
    if (this.f / 6 % 2 == 0) {
      this.a.f = this.g;
    }
    bhc.a.a(this.a, -0.5D, -0.75D, -0.5D, 0.0F);
    this.a.f = -1;
    
    bfl.F();
    
    super.a(☃, ☃, ☃);
  }
}
