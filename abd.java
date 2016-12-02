import java.util.List;

public class abd
  extends zw
{
  public abd()
  {
    c(1);
  }
  
  public static boolean b(dn ☃)
  {
    if (!abc.b(☃)) {
      return false;
    }
    if (!☃.b("title", 8)) {
      return false;
    }
    String ☃ = ☃.j("title");
    if ((☃ == null) || (☃.length() > 32)) {
      return false;
    }
    if (!☃.b("author", 8)) {
      return false;
    }
    return true;
  }
  
  public static int h(zx ☃)
  {
    return ☃.o().f("generation");
  }
  
  public String a(zx ☃)
  {
    if (☃.n())
    {
      dn ☃ = ☃.o();
      
      String ☃ = ☃.j("title");
      if (!nx.b(☃)) {
        return ☃;
      }
    }
    return super.a(☃);
  }
  
  public void a(zx ☃, wn ☃, List<String> ☃, boolean ☃)
  {
    if (☃.n())
    {
      dn ☃ = ☃.o();
      
      String ☃ = ☃.j("author");
      if (!nx.b(☃)) {
        ☃.add(a.h + di.a("book.byAuthor", new Object[] { ☃ }));
      }
      ☃.add(a.h + di.a(new StringBuilder().append("book.generation.").append(☃.f("generation")).toString()));
    }
  }
  
  public zx a(zx ☃, adm ☃, wn ☃)
  {
    if (!☃.D) {
      a(☃, ☃);
    }
    ☃.a(☃);
    ☃.b(na.ad[zw.b(this)]);
    return ☃;
  }
  
  private void a(zx ☃, wn ☃)
  {
    if ((☃ == null) || (☃.o() == null)) {
      return;
    }
    dn ☃ = ☃.o();
    if (☃.n("resolved")) {
      return;
    }
    ☃.a("resolved", true);
    if (!b(☃)) {
      return;
    }
    du ☃ = ☃.c("pages", 8);
    for (int ☃ = 0; ☃ < ☃.c(); ☃++)
    {
      String ☃ = ☃.f(☃);
      eu ☃;
      try
      {
        ☃ = eu.a.a(☃);
        ☃ = ev.a(☃, ☃, ☃);
      }
      catch (Exception ☃)
      {
        ☃ = new fa(☃);
      }
      ☃.a(☃, new ea(eu.a.a(☃)));
    }
    ☃.a("pages", ☃);
    if (((☃ instanceof lf)) && (☃.bZ() == ☃))
    {
      yg ☃ = ☃.bk.a(☃.bi, ☃.bi.c);
      ((lf)☃).a.a(new gf(0, ☃.e, ☃));
    }
  }
  
  public boolean f(zx ☃)
  {
    return true;
  }
}
