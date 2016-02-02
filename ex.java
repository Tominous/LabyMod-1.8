import net.minecraft.server.MinecraftServer;

public class ex
  extends es
{
  private final String b;
  private final String c;
  private String d = "";
  
  public ex(String ☃, String ☃)
  {
    this.b = ☃;
    this.c = ☃;
  }
  
  public String g()
  {
    return this.b;
  }
  
  public String h()
  {
    return this.c;
  }
  
  public void b(String ☃)
  {
    this.d = ☃;
  }
  
  public String e()
  {
    MinecraftServer ☃ = MinecraftServer.N();
    if ((☃ != null) && (☃.O()) && (nx.b(this.d)))
    {
      auo ☃ = ☃.a(0).Z();
      auk ☃ = ☃.b(this.c);
      if (☃.b(this.b, ☃))
      {
        aum ☃ = ☃.c(this.b, ☃);
        b(String.format("%d", new Object[] { Integer.valueOf(☃.c()) }));
      }
      else
      {
        this.d = "";
      }
    }
    return this.d;
  }
  
  public ex i()
  {
    ex ☃ = new ex(this.b, this.c);
    ☃.b(this.d);
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
      return (this.b.equals(☃.b)) && (this.c.equals(☃.c)) && (super.equals(☃));
    }
    return false;
  }
  
  public String toString()
  {
    return "ScoreComponent{name='" + this.b + '\'' + "objective='" + this.c + '\'' + ", siblings=" + this.a + ", style=" + b() + '}';
  }
}
