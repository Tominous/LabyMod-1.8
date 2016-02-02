import java.util.Collection;
import java.util.UUID;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class vy
{
  private static final Logger f = ;
  public static final qb a = new qj(null, "generic.maxHealth", 20.0D, 0.0D, 1024.0D).a("Max Health").a(true);
  public static final qb b = new qj(null, "generic.followRange", 32.0D, 0.0D, 2048.0D).a("Follow Range");
  public static final qb c = new qj(null, "generic.knockbackResistance", 0.0D, 0.0D, 1.0D).a("Knockback Resistance");
  public static final qb d = new qj(null, "generic.movementSpeed", 0.699999988079071D, 0.0D, 1024.0D).a("Movement Speed").a(true);
  public static final qb e = new qj(null, "generic.attackDamage", 2.0D, 0.0D, 2048.0D);
  
  public static du a(qf ☃)
  {
    du ☃ = new du();
    for (qc ☃ : ☃.a()) {
      ☃.a(a(☃));
    }
    return ☃;
  }
  
  private static dn a(qc ☃)
  {
    dn ☃ = new dn();
    qb ☃ = ☃.a();
    
    ☃.a("Name", ☃.a());
    ☃.a("Base", ☃.b());
    
    Collection<qd> ☃ = ☃.c();
    if ((☃ != null) && (!☃.isEmpty()))
    {
      du ☃ = new du();
      for (qd ☃ : ☃) {
        if (☃.e()) {
          ☃.a(a(☃));
        }
      }
      ☃.a("Modifiers", ☃);
    }
    return ☃;
  }
  
  private static dn a(qd ☃)
  {
    dn ☃ = new dn();
    
    ☃.a("Name", ☃.b());
    ☃.a("Amount", ☃.d());
    ☃.a("Operation", ☃.c());
    ☃.a("UUIDMost", ☃.a().getMostSignificantBits());
    ☃.a("UUIDLeast", ☃.a().getLeastSignificantBits());
    
    return ☃;
  }
  
  public static void a(qf ☃, du ☃)
  {
    for (int ☃ = 0; ☃ < ☃.c(); ☃++)
    {
      dn ☃ = ☃.b(☃);
      qc ☃ = ☃.a(☃.j("Name"));
      if (☃ != null) {
        a(☃, ☃);
      } else {
        f.warn("Ignoring unknown attribute '" + ☃.j("Name") + "'");
      }
    }
  }
  
  private static void a(qc ☃, dn ☃)
  {
    ☃.a(☃.i("Base"));
    if (☃.b("Modifiers", 9))
    {
      du ☃ = ☃.c("Modifiers", 10);
      for (int ☃ = 0; ☃ < ☃.c(); ☃++)
      {
        qd ☃ = a(☃.b(☃));
        if (☃ != null)
        {
          qd ☃ = ☃.a(☃.a());
          if (☃ != null) {
            ☃.c(☃);
          }
          ☃.b(☃);
        }
      }
    }
  }
  
  public static qd a(dn ☃)
  {
    UUID ☃ = new UUID(☃.g("UUIDMost"), ☃.g("UUIDLeast"));
    try
    {
      return new qd(☃, ☃.j("Name"), ☃.i("Amount"), ☃.f("Operation"));
    }
    catch (Exception ☃)
    {
      f.warn("Unable to create attribute: " + ☃.getMessage());
    }
    return null;
  }
}
