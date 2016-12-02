import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class auo
{
  private final Map<String, auk> a = Maps.newHashMap();
  private final Map<auu, List<auk>> b = Maps.newHashMap();
  private final Map<String, Map<auk, aum>> c = Maps.newHashMap();
  private final auk[] d = new auk[19];
  private final Map<String, aul> e = Maps.newHashMap();
  private final Map<String, aul> f = Maps.newHashMap();
  
  public auk b(String ☃)
  {
    return (auk)a.get(☃);
  }
  
  public auk a(String ☃, auu ☃)
  {
    if (☃.length() > 16) {
      throw new IllegalArgumentException("The objective name '" + ☃ + "' is too long!");
    }
    auk ☃ = b(☃);
    if (☃ != null) {
      throw new IllegalArgumentException("An objective with the name '" + ☃ + "' already exists!");
    }
    ☃ = new auk(this, ☃, ☃);
    
    List<auk> ☃ = (List)b.get(☃);
    if (☃ == null)
    {
      ☃ = Lists.newArrayList();
      b.put(☃, ☃);
    }
    ☃.add(☃);
    a.put(☃, ☃);
    a(☃);
    
    return ☃;
  }
  
  public Collection<auk> a(auu ☃)
  {
    Collection<auk> ☃ = (Collection)b.get(☃);
    
    return ☃ == null ? Lists.newArrayList() : Lists.newArrayList(☃);
  }
  
  public boolean b(String ☃, auk ☃)
  {
    Map<auk, aum> ☃ = (Map)c.get(☃);
    if (☃ == null) {
      return false;
    }
    aum ☃ = (aum)☃.get(☃);
    if (☃ == null) {
      return false;
    }
    return true;
  }
  
  public aum c(String ☃, auk ☃)
  {
    if (☃.length() > 40) {
      throw new IllegalArgumentException("The player name '" + ☃ + "' is too long!");
    }
    Map<auk, aum> ☃ = (Map)c.get(☃);
    if (☃ == null)
    {
      ☃ = Maps.newHashMap();
      c.put(☃, ☃);
    }
    aum ☃ = (aum)☃.get(☃);
    if (☃ == null)
    {
      ☃ = new aum(this, ☃, ☃);
      ☃.put(☃, ☃);
    }
    return ☃;
  }
  
  public Collection<aum> i(auk ☃)
  {
    List<aum> ☃ = Lists.newArrayList();
    for (Map<auk, aum> ☃ : c.values())
    {
      aum ☃ = (aum)☃.get(☃);
      if (☃ != null) {
        ☃.add(☃);
      }
    }
    Collections.sort(☃, aum.a);
    
    return ☃;
  }
  
  public Collection<auk> c()
  {
    return a.values();
  }
  
  public Collection<String> d()
  {
    return c.keySet();
  }
  
  public void d(String ☃, auk ☃)
  {
    if (☃ == null)
    {
      Map<auk, aum> ☃ = (Map)c.remove(☃);
      if (☃ != null) {
        a(☃);
      }
    }
    else
    {
      Map<auk, aum> ☃ = (Map)c.get(☃);
      if (☃ != null)
      {
        aum ☃ = (aum)☃.remove(☃);
        if (☃.size() < 1)
        {
          Map<auk, aum> ☃ = (Map)c.remove(☃);
          if (☃ != null) {
            a(☃);
          }
        }
        else if (☃ != null)
        {
          a(☃, ☃);
        }
      }
    }
  }
  
  public Collection<aum> e()
  {
    Collection<Map<auk, aum>> ☃ = c.values();
    List<aum> ☃ = Lists.newArrayList();
    for (Map<auk, aum> ☃ : ☃) {
      ☃.addAll(☃.values());
    }
    return ☃;
  }
  
  public Map<auk, aum> c(String ☃)
  {
    Map<auk, aum> ☃ = (Map)c.get(☃);
    if (☃ == null) {
      ☃ = Maps.newHashMap();
    }
    return ☃;
  }
  
  public void k(auk ☃)
  {
    a.remove(☃.b());
    for (int ☃ = 0; ☃ < 19; ☃++) {
      if (a(☃) == ☃) {
        a(☃, null);
      }
    }
    List<auk> ☃ = (List)b.get(☃.c());
    if (☃ != null) {
      ☃.remove(☃);
    }
    for (Map<auk, aum> ☃ : c.values()) {
      ☃.remove(☃);
    }
    c(☃);
  }
  
  public void a(int ☃, auk ☃)
  {
    d[☃] = ☃;
  }
  
  public auk a(int ☃)
  {
    return d[☃];
  }
  
  public aul d(String ☃)
  {
    return (aul)e.get(☃);
  }
  
  public aul e(String ☃)
  {
    if (☃.length() > 16) {
      throw new IllegalArgumentException("The team name '" + ☃ + "' is too long!");
    }
    aul ☃ = d(☃);
    if (☃ != null) {
      throw new IllegalArgumentException("A team with the name '" + ☃ + "' already exists!");
    }
    ☃ = new aul(this, ☃);
    e.put(☃, ☃);
    a(☃);
    
    return ☃;
  }
  
  public void d(aul ☃)
  {
    e.remove(☃.b());
    for (String ☃ : ☃.d()) {
      f.remove(☃);
    }
    c(☃);
  }
  
  public boolean a(String ☃, String ☃)
  {
    if (☃.length() > 40) {
      throw new IllegalArgumentException("The player name '" + ☃ + "' is too long!");
    }
    if (!e.containsKey(☃)) {
      return false;
    }
    aul ☃ = d(☃);
    if (h(☃) != null) {
      f(☃);
    }
    f.put(☃, ☃);
    ☃.d().add(☃);
    return true;
  }
  
  public boolean f(String ☃)
  {
    aul ☃ = h(☃);
    if (☃ != null)
    {
      a(☃, ☃);
      return true;
    }
    return false;
  }
  
  public void a(String ☃, aul ☃)
  {
    if (h(☃) != ☃) {
      throw new IllegalStateException("Player is either on another team or not on any team. Cannot remove from team '" + ☃.b() + "'.");
    }
    f.remove(☃);
    ☃.d().remove(☃);
  }
  
  public Collection<String> f()
  {
    return e.keySet();
  }
  
  public Collection<aul> g()
  {
    return e.values();
  }
  
  public aul h(String ☃)
  {
    return (aul)f.get(☃);
  }
  
  public void a(auk ☃) {}
  
  public void b(auk ☃) {}
  
  public void c(auk ☃) {}
  
  public void a(aum ☃) {}
  
  public void a(String ☃) {}
  
  public void a(String ☃, auk ☃) {}
  
  public void a(aul ☃) {}
  
  public void b(aul ☃) {}
  
  public void c(aul ☃) {}
  
  public static String b(int ☃)
  {
    switch (☃)
    {
    case 0: 
      return "list";
    case 1: 
      return "sidebar";
    case 2: 
      return "belowName";
    }
    if ((☃ >= 3) && (☃ <= 18))
    {
      a ☃ = a.a(☃ - 3);
      if ((☃ != null) && (☃ != a.v)) {
        return "sidebar.team." + ☃.e();
      }
    }
    return null;
  }
  
  public static int i(String ☃)
  {
    if (☃.equalsIgnoreCase("list")) {
      return 0;
    }
    if (☃.equalsIgnoreCase("sidebar")) {
      return 1;
    }
    if (☃.equalsIgnoreCase("belowName")) {
      return 2;
    }
    if (☃.startsWith("sidebar.team."))
    {
      String ☃ = ☃.substring("sidebar.team.".length());
      a ☃ = a.b(☃);
      if ((☃ != null) && (☃.b() >= 0)) {
        return ☃.b() + 3;
      }
    }
    return -1;
  }
  
  private static String[] g = null;
  
  public static String[] h()
  {
    if (g == null)
    {
      g = new String[19];
      for (int ☃ = 0; ☃ < 19; ☃++) {
        g[☃] = b(☃);
      }
    }
    return g;
  }
  
  public void a(pk ☃)
  {
    if ((☃ == null) || ((☃ instanceof wn)) || (☃.ai())) {
      return;
    }
    String ☃ = ☃.aK().toString();
    d(☃, null);
    f(☃);
  }
}
