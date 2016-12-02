import java.text.DateFormat;
import java.util.Date;
import java.util.List;
import org.apache.commons.lang3.StringUtils;

class axv$a
  extends awi
{
  public axv$a(axv paramaxv, ave ☃)
  {
    super(☃, paramaxv.l, paramaxv.m, 32, paramaxv.m - 64, 36);
  }
  
  protected int b()
  {
    return axv.a(this.u).size();
  }
  
  protected void a(int ☃, boolean ☃, int ☃, int ☃)
  {
    axv.a(this.u, ☃);
    boolean ☃ = (axv.b(this.u) >= 0) && (axv.b(this.u) < b());
    axv.c(this.u).l = ☃;
    axv.d(this.u).l = ☃;
    axv.e(this.u).l = ☃;
    axv.f(this.u).l = ☃;
    if ((☃) && (☃)) {
      this.u.i(☃);
    }
  }
  
  protected boolean a(int ☃)
  {
    return ☃ == axv.b(this.u);
  }
  
  protected int k()
  {
    return axv.a(this.u).size() * 36;
  }
  
  protected void a()
  {
    this.u.c();
  }
  
  protected void a(int ☃, int ☃, int ☃, int ☃, int ☃, int ☃)
  {
    ats ☃ = (ats)axv.a(this.u).get(☃);
    
    String ☃ = ☃.b();
    if (StringUtils.isEmpty(☃)) {
      ☃ = axv.g(this.u) + " " + (☃ + 1);
    }
    String ☃ = ☃.a();
    ☃ = ☃ + " (" + axv.h(this.u).format(new Date(☃.e()));
    ☃ = ☃ + ")";
    String ☃ = "";
    if (☃.d())
    {
      ☃ = axv.i(this.u) + " " + ☃;
    }
    else
    {
      ☃ = axv.j(this.u)[☃.f().a()];
      if (☃.g()) {
        ☃ = a.e + bnq.a("gameMode.hardcore", new Object[0]) + a.v;
      }
      if (☃.h()) {
        ☃ = ☃ + ", " + bnq.a("selectWorld.cheats", new Object[0]);
      }
    }
    this.u.c(this.u.q, ☃, ☃ + 2, ☃ + 1, 16777215);
    this.u.c(this.u.q, ☃, ☃ + 2, ☃ + 12, 8421504);
    this.u.c(this.u.q, ☃, ☃ + 2, ☃ + 12 + 10, 8421504);
  }
}
