import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import org.lwjgl.input.Mouse;

abstract class ayf$e
  extends awi
{
  protected int v = -1;
  protected List<mu> w;
  protected Comparator<mu> x;
  protected int y = -1;
  protected int z;
  
  protected ayf$e(ayf paramayf, ave ☃)
  {
    super(☃, paramayf.l, paramayf.m, 32, paramayf.m - 64, 20);
    
    b(false);
    a(true, 20);
  }
  
  protected void a(int ☃, boolean ☃, int ☃, int ☃) {}
  
  protected boolean a(int ☃)
  {
    return false;
  }
  
  protected void a()
  {
    this.A.c();
  }
  
  protected void a(int ☃, int ☃, bfx ☃)
  {
    if (!Mouse.isButtonDown(0)) {
      this.v = -1;
    }
    if (this.v == 0) {
      ayf.a(this.A, ☃ + 115 - 18, ☃ + 1, 0, 0);
    } else {
      ayf.a(this.A, ☃ + 115 - 18, ☃ + 1, 0, 18);
    }
    if (this.v == 1) {
      ayf.a(this.A, ☃ + 165 - 18, ☃ + 1, 0, 0);
    } else {
      ayf.a(this.A, ☃ + 165 - 18, ☃ + 1, 0, 18);
    }
    if (this.v == 2) {
      ayf.a(this.A, ☃ + 215 - 18, ☃ + 1, 0, 0);
    } else {
      ayf.a(this.A, ☃ + 215 - 18, ☃ + 1, 0, 18);
    }
    if (this.y != -1)
    {
      int ☃ = 79;
      int ☃ = 18;
      if (this.y == 1) {
        ☃ = 129;
      } else if (this.y == 2) {
        ☃ = 179;
      }
      if (this.z == 1) {
        ☃ = 36;
      }
      ayf.a(this.A, ☃ + ☃, ☃ + 1, ☃, 0);
    }
  }
  
  protected void a(int ☃, int ☃)
  {
    this.v = -1;
    if ((☃ >= 79) && (☃ < 115)) {
      this.v = 0;
    } else if ((☃ >= 129) && (☃ < 165)) {
      this.v = 1;
    } else if ((☃ >= 179) && (☃ < 215)) {
      this.v = 2;
    }
    if (this.v >= 0)
    {
      d(this.v);
      this.a.W().a(bpf.a(new jy("gui.button.press"), 1.0F));
    }
  }
  
  protected final int b()
  {
    return this.w.size();
  }
  
  protected final mu c(int ☃)
  {
    return (mu)this.w.get(☃);
  }
  
  protected abstract String b(int paramInt);
  
  protected void a(mw ☃, int ☃, int ☃, boolean ☃)
  {
    if (☃ != null)
    {
      String ☃ = ☃.a(ayf.b(this.A).a(☃));
      this.A.c(ayf.e(this.A), ☃, ☃ - ayf.f(this.A).a(☃), ☃ + 5, ☃ ? 16777215 : 9474192);
    }
    else
    {
      String ☃ = "-";
      this.A.c(ayf.g(this.A), ☃, ☃ - ayf.h(this.A).a(☃), ☃ + 5, ☃ ? 16777215 : 9474192);
    }
  }
  
  protected void b(int ☃, int ☃)
  {
    if ((☃ < this.d) || (☃ > this.e)) {
      return;
    }
    int ☃ = c(☃, ☃);
    int ☃ = this.b / 2 - 92 - 16;
    if (☃ >= 0)
    {
      if ((☃ < ☃ + 40) || (☃ > ☃ + 40 + 20)) {
        return;
      }
      mu ☃ = c(☃);
      a(☃, ☃, ☃);
    }
    else
    {
      String ☃ = "";
      if ((☃ >= ☃ + 115 - 18) && (☃ <= ☃ + 115)) {
        ☃ = b(0);
      } else if ((☃ >= ☃ + 165 - 18) && (☃ <= ☃ + 165)) {
        ☃ = b(1);
      } else if ((☃ >= ☃ + 215 - 18) && (☃ <= ☃ + 215)) {
        ☃ = b(2);
      } else {
        return;
      }
      ☃ = ("" + bnq.a(☃, new Object[0])).trim();
      if (☃.length() > 0)
      {
        int ☃ = ☃ + 12;
        int ☃ = ☃ - 12;
        int ☃ = ayf.i(this.A).a(☃);
        ayf.a(this.A, ☃ - 3, ☃ - 3, ☃ + ☃ + 3, ☃ + 8 + 3, -1073741824, -1073741824);
        
        ayf.j(this.A).a(☃, ☃, ☃, -1);
      }
    }
  }
  
  protected void a(mu ☃, int ☃, int ☃)
  {
    if (☃ == null) {
      return;
    }
    zw ☃ = ☃.a();
    zx ☃ = new zx(☃);
    String ☃ = ☃.a();
    
    String ☃ = ("" + bnq.a(new StringBuilder().append(☃).append(".name").toString(), new Object[0])).trim();
    if (☃.length() > 0)
    {
      int ☃ = ☃ + 12;
      int ☃ = ☃ - 12;
      int ☃ = ayf.k(this.A).a(☃);
      ayf.b(this.A, ☃ - 3, ☃ - 3, ☃ + ☃ + 3, ☃ + 8 + 3, -1073741824, -1073741824);
      
      ayf.l(this.A).a(☃, ☃, ☃, -1);
    }
  }
  
  protected void d(int ☃)
  {
    if (☃ != this.y)
    {
      this.y = ☃;
      this.z = -1;
    }
    else if (this.z == -1)
    {
      this.z = 1;
    }
    else
    {
      this.y = -1;
      this.z = 0;
    }
    Collections.sort(this.w, this.x);
  }
}
