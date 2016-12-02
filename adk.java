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
    a.put(key, new adk.a(value, type));
  }
  
  public void a(String key, String ruleValue)
  {
    adk.a var3 = (adk.a)a.get(key);
    if (var3 != null) {
      var3.a(ruleValue);
    } else {
      a(key, ruleValue, adk.b.a);
    }
  }
  
  public String a(String name)
  {
    adk.a var2 = (adk.a)a.get(name);
    return var2 != null ? var2.a() : "";
  }
  
  public boolean b(String name)
  {
    adk.a var2 = (adk.a)a.get(name);
    return var2 != null ? var2.b() : false;
  }
  
  public int c(String name)
  {
    adk.a var2 = (adk.a)a.get(name);
    return var2 != null ? var2.c() : 0;
  }
  
  public dn a()
  {
    dn var1 = new dn();
    Iterator var2 = a.keySet().iterator();
    while (var2.hasNext())
    {
      String var3 = (String)var2.next();
      adk.a var4 = (adk.a)a.get(var3);
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
    Set var1 = a.keySet();
    return (String[])var1.toArray(new String[var1.size()]);
  }
  
  public boolean e(String name)
  {
    return a.containsKey(name);
  }
  
  public boolean a(String key, adk.b otherValue)
  {
    adk.a var3 = (adk.a)a.get(key);
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
      e = type;
      a(value);
    }
    
    public void a(String value)
    {
      a = value;
      if (value != null)
      {
        if (value.equals("false"))
        {
          b = false;
          return;
        }
        if (value.equals("true"))
        {
          b = true;
          return;
        }
      }
      b = Boolean.parseBoolean(value);
      c = (b ? 1 : 0);
      try
      {
        c = Integer.parseInt(value);
      }
      catch (NumberFormatException var4) {}
      try
      {
        d = Double.parseDouble(value);
      }
      catch (NumberFormatException var3) {}
    }
    
    public String a()
    {
      return a;
    }
    
    public boolean b()
    {
      return b;
    }
    
    public int c()
    {
      return c;
    }
    
    public adk.b e()
    {
      return e;
    }
  }
  
  public static enum b
  {
    private static final b[] d = { a, b, c };
    private static final String __OBFID = "CL_00002151";
  }
}
