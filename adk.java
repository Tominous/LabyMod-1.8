import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

public class adk
{
  private TreeMap a = new TreeMap();
  private static final String __OBFID = "CL_00000136";
  
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
  
  public void a(String key, String value, adk.b type)
  {
    this.a.put(key, new adk.a(value, type));
  }
  
  public void a(String key, String ruleValue)
  {
    adk.a var3 = (adk.a)this.a.get(key);
    if (var3 != null) {
      var3.a(ruleValue);
    } else {
      a(key, ruleValue, adk.b.a);
    }
  }
  
  public String a(String name)
  {
    adk.a var2 = (adk.a)this.a.get(name);
    return var2 != null ? var2.a() : "";
  }
  
  public boolean b(String name)
  {
    adk.a var2 = (adk.a)this.a.get(name);
    return var2 != null ? var2.b() : false;
  }
  
  public int c(String name)
  {
    adk.a var2 = (adk.a)this.a.get(name);
    return var2 != null ? var2.c() : 0;
  }
  
  public dn a()
  {
    dn var1 = new dn();
    Iterator var2 = this.a.keySet().iterator();
    while (var2.hasNext())
    {
      String var3 = (String)var2.next();
      adk.a var4 = (adk.a)this.a.get(var3);
      var1.a(var3, var4.a());
    }
    return var1;
  }
  
  public void a(dn nbt)
  {
    Set var2 = nbt.c();
    Iterator var3 = var2.iterator();
    while (var3.hasNext())
    {
      String var4 = (String)var3.next();
      String var6 = nbt.j(var4);
      a(var4, var6);
    }
  }
  
  public String[] b()
  {
    Set var1 = this.a.keySet();
    return (String[])var1.toArray(new String[var1.size()]);
  }
  
  public boolean e(String name)
  {
    return this.a.containsKey(name);
  }
  
  public boolean a(String key, adk.b otherValue)
  {
    adk.a var3 = (adk.a)this.a.get(key);
    return (var3 != null) && ((var3.e() == otherValue) || (otherValue == adk.b.a));
  }
  
  static class a
  {
    private String a;
    private boolean b;
    private int c;
    private double d;
    private final adk.b e;
    private static final String __OBFID = "CL_00000137";
    
    public a(String value, adk.b type)
    {
      this.e = type;
      a(value);
    }
    
    public void a(String value)
    {
      this.a = value;
      if (value != null)
      {
        if (value.equals("false"))
        {
          this.b = false;
          return;
        }
        if (value.equals("true"))
        {
          this.b = true;
          return;
        }
      }
      this.b = Boolean.parseBoolean(value);
      this.c = (this.b ? 1 : 0);
      try
      {
        this.c = Integer.parseInt(value);
      }
      catch (NumberFormatException var4) {}
      try
      {
        this.d = Double.parseDouble(value);
      }
      catch (NumberFormatException var3) {}
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
  
  public static enum b
  {
    private static final b[] d = { a, b, c };
    private static final String __OBFID = "CL_00002151";
  }
}
