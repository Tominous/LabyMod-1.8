import java.util.Collection;
import java.util.Map;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class aup
  extends ate
{
  private static final Logger b = ;
  private auo c;
  private dn d;
  
  public aup()
  {
    this("scoreboard");
  }
  
  public aup(String ☃)
  {
    super(☃);
  }
  
  public void a(auo ☃)
  {
    c = ☃;
    if (d != null) {
      a(d);
    }
  }
  
  public void a(dn ☃)
  {
    if (c == null)
    {
      d = ☃;
      return;
    }
    b(☃.c("Objectives", 10));
    c(☃.c("PlayerScores", 10));
    if (☃.b("DisplaySlots", 10)) {
      c(☃.m("DisplaySlots"));
    }
    if (☃.b("Teams", 9)) {
      a(☃.c("Teams", 10));
    }
  }
  
  protected void a(du ☃)
  {
    for (int ☃ = 0; ☃ < ☃.c(); ☃++)
    {
      dn ☃ = ☃.b(☃);
      
      String ☃ = ☃.j("Name");
      if (☃.length() > 16) {
        ☃ = ☃.substring(0, 16);
      }
      aul ☃ = c.e(☃);
      String ☃ = ☃.j("DisplayName");
      if (☃.length() > 32) {
        ☃ = ☃.substring(0, 32);
      }
      ☃.a(☃);
      if (☃.b("TeamColor", 8)) {
        ☃.a(a.b(☃.j("TeamColor")));
      }
      ☃.b(☃.j("Prefix"));
      ☃.c(☃.j("Suffix"));
      if (☃.b("AllowFriendlyFire", 99)) {
        ☃.a(☃.n("AllowFriendlyFire"));
      }
      if (☃.b("SeeFriendlyInvisibles", 99)) {
        ☃.b(☃.n("SeeFriendlyInvisibles"));
      }
      if (☃.b("NameTagVisibility", 8))
      {
        auq.a ☃ = auq.a.a(☃.j("NameTagVisibility"));
        if (☃ != null) {
          ☃.a(☃);
        }
      }
      if (☃.b("DeathMessageVisibility", 8))
      {
        auq.a ☃ = auq.a.a(☃.j("DeathMessageVisibility"));
        if (☃ != null) {
          ☃.b(☃);
        }
      }
      a(☃, ☃.c("Players", 8));
    }
  }
  
  protected void a(aul ☃, du ☃)
  {
    for (int ☃ = 0; ☃ < ☃.c(); ☃++) {
      c.a(☃.f(☃), ☃.b());
    }
  }
  
  protected void c(dn ☃)
  {
    for (int ☃ = 0; ☃ < 19; ☃++) {
      if (☃.b("slot_" + ☃, 8))
      {
        String ☃ = ☃.j("slot_" + ☃);
        auk ☃ = c.b(☃);
        c.a(☃, ☃);
      }
    }
  }
  
  protected void b(du ☃)
  {
    for (int ☃ = 0; ☃ < ☃.c(); ☃++)
    {
      dn ☃ = ☃.b(☃);
      
      auu ☃ = (auu)auu.a.get(☃.j("CriteriaName"));
      if (☃ != null)
      {
        String ☃ = ☃.j("Name");
        if (☃.length() > 16) {
          ☃ = ☃.substring(0, 16);
        }
        auk ☃ = c.a(☃, ☃);
        ☃.a(☃.j("DisplayName"));
        ☃.a(auu.a.a(☃.j("RenderType")));
      }
    }
  }
  
  protected void c(du ☃)
  {
    for (int ☃ = 0; ☃ < ☃.c(); ☃++)
    {
      dn ☃ = ☃.b(☃);
      
      auk ☃ = c.b(☃.j("Objective"));
      String ☃ = ☃.j("Name");
      if (☃.length() > 40) {
        ☃ = ☃.substring(0, 40);
      }
      aum ☃ = c.c(☃, ☃);
      ☃.c(☃.f("Score"));
      if (☃.c("Locked")) {
        ☃.a(☃.n("Locked"));
      }
    }
  }
  
  public void b(dn ☃)
  {
    if (c == null)
    {
      b.warn("Tried to save scoreboard without having a scoreboard...");
      return;
    }
    ☃.a("Objectives", b());
    ☃.a("PlayerScores", e());
    ☃.a("Teams", a());
    
    d(☃);
  }
  
  protected du a()
  {
    du ☃ = new du();
    Collection<aul> ☃ = c.g();
    for (aul ☃ : ☃)
    {
      dn ☃ = new dn();
      
      ☃.a("Name", ☃.b());
      ☃.a("DisplayName", ☃.c());
      if (☃.l().b() >= 0) {
        ☃.a("TeamColor", ☃.l().e());
      }
      ☃.a("Prefix", ☃.e());
      ☃.a("Suffix", ☃.f());
      ☃.a("AllowFriendlyFire", ☃.g());
      ☃.a("SeeFriendlyInvisibles", ☃.h());
      ☃.a("NameTagVisibility", ie);
      ☃.a("DeathMessageVisibility", je);
      
      du ☃ = new du();
      for (String ☃ : ☃.d()) {
        ☃.a(new ea(☃));
      }
      ☃.a("Players", ☃);
      
      ☃.a(☃);
    }
    return ☃;
  }
  
  protected void d(dn ☃)
  {
    dn ☃ = new dn();
    boolean ☃ = false;
    for (int ☃ = 0; ☃ < 19; ☃++)
    {
      auk ☃ = c.a(☃);
      if (☃ != null)
      {
        ☃.a("slot_" + ☃, ☃.b());
        ☃ = true;
      }
    }
    if (☃) {
      ☃.a("DisplaySlots", ☃);
    }
  }
  
  protected du b()
  {
    du ☃ = new du();
    Collection<auk> ☃ = c.c();
    for (auk ☃ : ☃) {
      if (☃.c() != null)
      {
        dn ☃ = new dn();
        ☃.a("Name", ☃.b());
        ☃.a("CriteriaName", ☃.c().a());
        ☃.a("DisplayName", ☃.d());
        ☃.a("RenderType", ☃.e().a());
        
        ☃.a(☃);
      }
    }
    return ☃;
  }
  
  protected du e()
  {
    du ☃ = new du();
    Collection<aum> ☃ = c.e();
    for (aum ☃ : ☃) {
      if (☃.d() != null)
      {
        dn ☃ = new dn();
        ☃.a("Name", ☃.e());
        ☃.a("Objective", ☃.d().b());
        ☃.a("Score", ☃.c());
        ☃.a("Locked", ☃.g());
        
        ☃.a(☃);
      }
    }
    return ☃;
  }
}
