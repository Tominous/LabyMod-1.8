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
    super(☃, l, m, 32, m - 64, 20);
    
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
    A.c();
  }
  
  protected void a(int ☃, int ☃, bfx ☃)
  {
    if (!Mouse.isButtonDown(0)) {
      v = -1;
    }
    if (v == 0) {
      ayf.a(A, ☃ + 115 - 18, ☃ + 1, 0, 0);
    } else {
      ayf.a(A, ☃ + 115 - 18, ☃ + 1, 0, 18);
    }
    if (v == 1) {
      ayf.a(A, ☃ + 165 - 18, ☃ + 1, 0, 0);
    } else {
      ayf.a(A, ☃ + 165 - 18, ☃ + 1, 0, 18);
    }
    if (v == 2) {
      ayf.a(A, ☃ + 215 - 18, ☃ + 1, 0, 0);
    } else {
      ayf.a(A, ☃ + 215 - 18, ☃ + 1, 0, 18);
    }
    if (y != -1)
    {
      int ☃ = 79;
      int ☃ = 18;
      if (y == 1) {
        ☃ = 129;
      } else if (y == 2) {
        ☃ = 179;
      }
      if (z == 1) {
        ☃ = 36;
      }
      ayf.a(A, ☃ + ☃, ☃ + 1, ☃, 0);
    }
  }
  
  protected void a(int ☃, int ☃)
  {
    v = -1;
    if ((☃ >= 79) && (☃ < 115)) {
      v = 0;
    } else if ((☃ >= 129) && (☃ < 165)) {
      v = 1;
    } else if ((☃ >= 179) && (☃ < 215)) {
      v = 2;
    }
    if (v >= 0)
    {
      d(v);
      a.W().a(bpf.a(new jy("gui.button.press"), 1.0F));
    }
  }
  
  protected final int b()
  {
    return w.size();
  }
  
  protected final mu c(int ☃)
  {
    return (mu)w.get(☃);
  }
  
  protected abstract String b(int paramInt);
  
  protected void a(mw ☃, int ☃, int ☃, boolean ☃)
  {
    if (☃ != null)
    {
      String ☃ = ☃.a(ayf.b(A).a(☃));
      A.c(ayf.e(A), ☃, ☃ - ayf.f(A).a(☃), ☃ + 5, ☃ ? 16777215 : 9474192);
    }
    else
    {
      String ☃ = "-";
      A.c(ayf.g(A), ☃, ☃ - ayf.h(A).a(☃), ☃ + 5, ☃ ? 16777215 : 9474192);
    }
  }
  
  protected void b(int ☃, int ☃)
  {
    if ((☃ < d) || (☃ > e)) {
      return;
    }
    int ☃ = c(☃, ☃);
    int ☃ = b / 2 - 92 - 16;
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
        int ☃ = ayf.i(A).a(☃);
        ayf.a(A, ☃ - 3, ☃ - 3, ☃ + ☃ + 3, ☃ + 8 + 3, -1073741824, -1073741824);
        
        ayf.j(A).a(☃, ☃, ☃, -1);
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
      int ☃ = ayf.k(A).a(☃);
      ayf.b(A, ☃ - 3, ☃ - 3, ☃ + ☃ + 3, ☃ + 8 + 3, -1073741824, -1073741824);
      
      ayf.l(A).a(☃, ☃, ☃, -1);
    }
  }
  
  protected void d(int ☃)
  {
    if (☃ != y)
    {
      y = ☃;
      z = -1;
    }
    else if (z == -1)
    {
      z = 1;
    }
    else
    {
      y = -1;
      z = 0;
    }
    Collections.sort(w, x);
  }
}
