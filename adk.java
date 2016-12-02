import java.util.Set;
import java.util.TreeMap;

public class adk
{
  private TreeMap<String, adk.a> a = new TreeMap();
  
  public adk()
  {
    a("doFireTick", "true", adk.b.b);
    a("mobGriefing", "true", adk.b.b);
    a("keepInventory", "false", adk.b.b);
    a("doMobSpawning", "true", adk.b.b);
    a("doMobLoot", "true", adk.b.b);
    a("doTileDrops", "true", adk.b.b);
    a("doEntityDrops", "true", adk.b.b);
    a("commandBlockOutput", "true", adk.b.b);
    a("naturalRegeneration", "true", adk.b.b);
    a("doDaylightCycle", "true", adk.b.b);
    a("logAdminCommands", "true", adk.b.b);
    a("showDeathMessages", "true", adk.b.b);
    a("randomTickSpeed", "3", adk.b.c);
    a("sendCommandFeedback", "true", adk.b.b);
    a("reducedDebugInfo", "false", adk.b.b);
  }
  
  public void a(String ☃, String ☃, adk.b ☃)
  {
    this.a.put(☃, new adk.a(☃, ☃));
  }
  
  public void a(String ☃, String ☃)
  {
    adk.a ☃ = (adk.a)this.a.get(☃);
    if (☃ != null) {
      ☃.a(☃);
    } else {
      a(☃, ☃, adk.b.a);
    }
  }
  
  public String a(String ☃)
  {
    adk.a ☃ = (adk.a)this.a.get(☃);
    if (☃ != null) {
      return ☃.a();
    }
    return "";
  }
  
  public boolean b(String ☃)
  {
    adk.a ☃ = (adk.a)this.a.get(☃);
    if (☃ != null) {
      return ☃.b();
    }
    return false;
  }
  
  public int c(String ☃)
  {
    adk.a ☃ = (adk.a)this.a.get(☃);
    if (☃ != null) {
      return ☃.c();
    }
    return 0;
  }
  
  public dn a()
  {
    dn ☃ = new dn();
    for (String ☃ : this.a.keySet())
    {
      adk.a ☃ = (adk.a)this.a.get(☃);
      ☃.a(☃, ☃.a());
    }
    return ☃;
  }
  
  public void a(dn ☃)
  {
    Set<String> ☃ = ☃.c();
    for (String ☃ : ☃)
    {
      String ☃ = ☃;
      String ☃ = ☃.j(☃);
      
      a(☃, ☃);
    }
  }
  
  public String[] b()
  {
    Set<String> ☃ = this.a.keySet();
    return (String[])☃.toArray(new String[☃.size()]);
  }
  
  public boolean e(String ☃)
  {
    return this.a.containsKey(☃);
  }
  
  public boolean a(String ☃, adk.b ☃)
  {
    adk.a ☃ = (adk.a)this.a.get(☃);
    if ((☃ != null) && ((☃.e() == ☃) || (☃ == adk.b.a))) {
      return true;
    }
    return false;
  }
  
  public static enum b
  {
    private b() {}
  }
  
  static class a
  {
    private String a;
    private boolean b;
    private int c;
    private double d;
    private final adk.b e;
    
    public a(String ☃, adk.b ☃)
    {
      this.e = ☃;
      a(☃);
    }
    
    public void a(String ☃)
    {
      this.a = ☃;
      this.b = Boolean.parseBoolean(☃);
      this.c = (this.b ? 1 : 0);
      try
      {
        this.c = Integer.parseInt(☃);
      }
      catch (NumberFormatException localNumberFormatException) {}
      try
      {
        this.d = Double.parseDouble(☃);
      }
      catch (NumberFormatException localNumberFormatException1) {}
    }
    
    public String a()
    {
      return this.a;
    }
    
    public boolean b()
    {
      return this.b;
    }
    
    public int c()
    {
      return this.c;
    }
    
    public adk.b e()
    {
      return this.e;
    }
  }
}
