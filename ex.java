import net.minecraft.server.MinecraftServer;

public class ex
  extends es
{
  private final String b;
  private final String c;
  private String d = "";
  
  public ex(String ☃, String ☃)
  {
    b = ☃;
    c = ☃;
  }
  
  public String g()
  {
    return b;
  }
  
  public String h()
  {
    return c;
  }
  
  public void b(String ☃)
  {
    d = ☃;
  }
  
  public String e()
  {
    MinecraftServer ☃ = MinecraftServer.N();
    if ((☃ != null) && (☃.O()) && (nx.b(d)))
    {
      auo ☃ = ☃.a(0).Z();
      auk ☃ = ☃.b(c);
      if (☃.b(b, ☃))
      {
        aum ☃ = ☃.c(b, ☃);
        b(String.format("%d", new Object[] { Integer.valueOf(☃.c()) }));
      }
      else
      {
        d = "";
      }
    }
    return d;
  }
  
  public ex i()
  {
    ex ☃ = new ex(b, c);
    ☃.b(d);
    ☃.a(b().m());
    for (eu ☃ : a()) {
      ☃.a(☃.f());
    }
    return ☃;
  }
  
  public boolean equals(Object ☃)
  {
    if (this == ☃) {
      return true;
    }
    if ((☃ instanceof ex))
    {
      ex ☃ = (ex)☃;
      return (b.equals(b)) && (c.equals(c)) && (super.equals(☃));
    }
    return false;
  }
  
  public String toString()
  {
    return "ScoreComponent{name='" + b + '\'' + "objective='" + c + '\'' + ", siblings=" + a + ", style=" + b() + '}';
  }
}
