import java.util.List;

public class ev
{
  public static eu a(m ☃, eu ☃, pk ☃)
    throws bz
  {
    eu ☃ = null;
    if ((☃ instanceof ex))
    {
      ex ☃ = (ex)☃;
      String ☃ = ☃.g();
      if (o.b(☃))
      {
        List<pk> ☃ = o.b(☃, ☃, pk.class);
        if (☃.size() == 1) {
          ☃ = ((pk)☃.get(0)).e_();
        } else {
          throw new ca();
        }
      }
      ☃ = (☃ != null) && (☃.equals("*")) ? new ex(☃.e_(), ☃.h()) : new ex(☃, ☃.h());
      
      ((ex)☃).b(☃.e());
    }
    else if ((☃ instanceof ey))
    {
      String ☃ = ((ey)☃).g();
      ☃ = o.b(☃, ☃);
      if (☃ == null) {
        ☃ = new fa("");
      }
    }
    else if ((☃ instanceof fa))
    {
      ☃ = new fa(((fa)☃).g());
    }
    else if ((☃ instanceof fb))
    {
      Object[] ☃ = ((fb)☃).j();
      for (int ☃ = 0; ☃ < ☃.length; ☃++)
      {
        Object ☃ = ☃[☃];
        if ((☃ instanceof eu)) {
          ☃[☃] = a(☃, (eu)☃, ☃);
        }
      }
      ☃ = new fb(((fb)☃).i(), ☃);
    }
    else
    {
      return ☃;
    }
    ez ☃ = ☃.b();
    if (☃ != null) {
      ☃.a(☃.m());
    }
    for (eu ☃ : ☃.a()) {
      ☃.a(a(☃, ☃, ☃));
    }
    return ☃;
  }
}
