import java.text.DateFormat;
import java.util.Date;
import java.util.List;
import org.apache.commons.lang3.StringUtils;

class axv$a
  extends awi
{
  public axv$a(axv paramaxv, ave ☃)
  {
    super(☃, l, m, 32, m - 64, 36);
  }
  
  protected int b()
  {
    return axv.a(u).size();
  }
  
  protected void a(int ☃, boolean ☃, int ☃, int ☃)
  {
    axv.a(u, ☃);
    boolean ☃ = (axv.b(u) >= 0) && (axv.b(u) < b());
    cu).l = ☃;
    du).l = ☃;
    eu).l = ☃;
    fu).l = ☃;
    if ((☃) && (☃)) {
      u.i(☃);
    }
  }
  
  protected boolean a(int ☃)
  {
    return ☃ == axv.b(u);
  }
  
  protected int k()
  {
    return axv.a(u).size() * 36;
  }
  
  protected void a()
  {
    u.c();
  }
  
  protected void a(int ☃, int ☃, int ☃, int ☃, int ☃, int ☃)
  {
    ats ☃ = (ats)axv.a(u).get(☃);
    
    String ☃ = ☃.b();
    if (StringUtils.isEmpty(☃)) {
      ☃ = axv.g(u) + " " + (☃ + 1);
    }
    String ☃ = ☃.a();
    ☃ = ☃ + " (" + axv.h(u).format(new Date(☃.e()));
    ☃ = ☃ + ")";
    String ☃ = "";
    if (☃.d())
    {
      ☃ = axv.i(u) + " " + ☃;
    }
    else
    {
      ☃ = axv.j(u)[☃.f().a()];
      if (☃.g()) {
        ☃ = a.e + bnq.a("gameMode.hardcore", new Object[0]) + a.v;
      }
      if (☃.h()) {
        ☃ = ☃ + ", " + bnq.a("selectWorld.cheats", new Object[0]);
      }
    }
    u.c(u.q, ☃, ☃ + 2, ☃ + 1, 16777215);
    u.c(u.q, ☃, ☃ + 2, ☃ + 12, 8421504);
    u.c(u.q, ☃, ☃ + 2, ☃ + 12 + 10, 8421504);
  }
}
