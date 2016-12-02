import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import com.google.common.collect.ComparisonChain;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import net.minecraft.server.MinecraftServer;

public class o
{
  private static final Pattern a = Pattern.compile("^@([pare])(?:\\[([\\w=,!-]*)\\])?$");
  private static final Pattern b = Pattern.compile("\\G([-!]?[\\w-]*)(?:$|,)");
  private static final Pattern c = Pattern.compile("\\G(\\w+)=([-!]?[\\w-]*)(?:$|,)");
  private static final Set<String> d = Sets.newHashSet(new String[] { "x", "y", "z", "dx", "dy", "dz", "rm", "r" });
  
  public static lf a(m ☃, String ☃)
  {
    return (lf)a(☃, ☃, lf.class);
  }
  
  public static <T extends pk> T a(m ☃, String ☃, Class<? extends T> ☃)
  {
    List<T> ☃ = b(☃, ☃, ☃);
    return ☃.size() == 1 ? (pk)☃.get(0) : null;
  }
  
  public static eu b(m ☃, String ☃)
  {
    List<pk> ☃ = b(☃, ☃, pk.class);
    if (☃.isEmpty()) {
      return null;
    }
    List<eu> ☃ = Lists.newArrayList();
    for (pk ☃ : ☃) {
      ☃.add(☃.f_());
    }
    return i.a(☃);
  }
  
  public static <T extends pk> List<T> b(m ☃, String ☃, Class<? extends T> ☃)
  {
    Matcher ☃ = a.matcher(☃);
    if ((☃.matches()) && (☃.a(1, "@")))
    {
      Map<String, String> ☃ = c(☃.group(2));
      if (!b(☃, ☃)) {
        return Collections.emptyList();
      }
      String ☃ = ☃.group(1);
      cj ☃ = b(☃, ☃.c());
      List<adm> ☃ = a(☃, ☃);
      List<T> ☃ = Lists.newArrayList();
      for (adm ☃ : ☃) {
        if (☃ != null)
        {
          List<Predicate<pk>> ☃ = Lists.newArrayList();
          ☃.addAll(a(☃, ☃));
          ☃.addAll(b(☃));
          ☃.addAll(c(☃));
          ☃.addAll(d(☃));
          ☃.addAll(e(☃));
          ☃.addAll(f(☃));
          ☃.addAll(a(☃, ☃));
          ☃.addAll(g(☃));
          
          ☃.addAll(a(☃, ☃, ☃, ☃, ☃, ☃));
        }
      }
      return a(☃, ☃, ☃, ☃, ☃, ☃);
    }
    return Collections.emptyList();
  }
  
  private static List<adm> a(m ☃, Map<String, String> ☃)
  {
    List<adm> ☃ = Lists.newArrayList();
    if (h(☃)) {
      ☃.add(☃.e());
    } else {
      Collections.addAll(☃, Nd);
    }
    return ☃;
  }
  
  private static <T extends pk> boolean b(m ☃, Map<String, String> ☃)
  {
    String ☃ = b(☃, "type");
    ☃ = (☃ != null) && (☃.startsWith("!")) ? ☃.substring(1) : ☃;
    if ((☃ != null) && (!pm.b(☃)))
    {
      fb ☃ = new fb("commands.generic.entity.invalidType", new Object[] { ☃ });
      ☃.b().a(a.m);
      ☃.a(☃);
      return false;
    }
    return true;
  }
  
  private static List<Predicate<pk>> a(Map<String, String> ☃, String ☃)
  {
    List<Predicate<pk>> ☃ = Lists.newArrayList();
    String ☃ = b(☃, "type");
    final boolean ☃ = (☃ != null) && (☃.startsWith("!"));
    if (☃) {
      ☃ = ☃.substring(1);
    }
    String ☃ = ☃;
    
    boolean ☃ = !☃.equals("e");
    boolean ☃ = (☃.equals("r")) && (☃ != null);
    if (((☃ != null) && (☃.equals("e"))) || (☃)) {
      ☃.add(new Predicate()
      {
        public boolean a(pk ☃)
        {
          return pm.a(☃, a) != ☃;
        }
      });
    } else if (☃) {
      ☃.add(new Predicate()
      {
        public boolean a(pk ☃)
        {
          return ☃ instanceof wn;
        }
      });
    }
    return ☃;
  }
  
  private static List<Predicate<pk>> b(Map<String, String> ☃)
  {
    List<Predicate<pk>> ☃ = Lists.newArrayList();
    int ☃ = a(☃, "lm", -1);
    final int ☃ = a(☃, "l", -1);
    if ((☃ > -1) || (☃ > -1)) {
      ☃.add(new Predicate()
      {
        public boolean a(pk ☃)
        {
          if (!(☃ instanceof lf)) {
            return false;
          }
          lf ☃ = (lf)☃;
          return ((a <= -1) || (bB >= a)) && ((☃ <= -1) || (bB <= ☃));
        }
      });
    }
    return ☃;
  }
  
  private static List<Predicate<pk>> c(Map<String, String> ☃)
  {
    List<Predicate<pk>> ☃ = Lists.newArrayList();
    int ☃ = a(☃, "m", adp.a.a.a());
    if (☃ != adp.a.a.a()) {
      ☃.add(new Predicate()
      {
        public boolean a(pk ☃)
        {
          if (!(☃ instanceof lf)) {
            return false;
          }
          lf ☃ = (lf)☃;
          return c.b().a() == a;
        }
      });
    }
    return ☃;
  }
  
  private static List<Predicate<pk>> d(Map<String, String> ☃)
  {
    List<Predicate<pk>> ☃ = Lists.newArrayList();
    String ☃ = b(☃, "team");
    final boolean ☃ = (☃ != null) && (☃.startsWith("!"));
    if (☃) {
      ☃ = ☃.substring(1);
    }
    String ☃ = ☃;
    if (☃ != null) {
      ☃.add(new Predicate()
      {
        public boolean a(pk ☃)
        {
          if (!(☃ instanceof pr)) {
            return false;
          }
          pr ☃ = (pr)☃;
          auq ☃ = ☃.bO();
          String ☃ = ☃ == null ? "" : ☃.b();
          return ☃.equals(a) != ☃;
        }
      });
    }
    return ☃;
  }
  
  private static List<Predicate<pk>> e(Map<String, String> ☃)
  {
    List<Predicate<pk>> ☃ = Lists.newArrayList();
    Map<String, Integer> ☃ = a(☃);
    if ((☃ != null) && (☃.size() > 0)) {
      ☃.add(new Predicate()
      {
        public boolean a(pk ☃)
        {
          auo ☃ = MinecraftServer.N().a(0).Z();
          for (Map.Entry<String, Integer> ☃ : a.entrySet())
          {
            String ☃ = (String)☃.getKey();
            boolean ☃ = false;
            if ((☃.endsWith("_min")) && (☃.length() > 4))
            {
              ☃ = true;
              ☃ = ☃.substring(0, ☃.length() - 4);
            }
            auk ☃ = ☃.b(☃);
            if (☃ == null) {
              return false;
            }
            String ☃ = (☃ instanceof lf) ? ☃.e_() : ☃.aK().toString();
            if (!☃.b(☃, ☃)) {
              return false;
            }
            aum ☃ = ☃.c(☃, ☃);
            int ☃ = ☃.c();
            if ((☃ < ((Integer)☃.getValue()).intValue()) && (☃)) {
              return false;
            }
            if ((☃ > ((Integer)☃.getValue()).intValue()) && (!☃)) {
              return false;
            }
          }
          return true;
        }
      });
    }
    return ☃;
  }
  
  private static List<Predicate<pk>> f(Map<String, String> ☃)
  {
    List<Predicate<pk>> ☃ = Lists.newArrayList();
    String ☃ = b(☃, "name");
    final boolean ☃ = (☃ != null) && (☃.startsWith("!"));
    if (☃) {
      ☃ = ☃.substring(1);
    }
    String ☃ = ☃;
    if (☃ != null) {
      ☃.add(new Predicate()
      {
        public boolean a(pk ☃)
        {
          return ☃.e_().equals(a) != ☃;
        }
      });
    }
    return ☃;
  }
  
  private static List<Predicate<pk>> a(Map<String, String> ☃, cj ☃)
  {
    List<Predicate<pk>> ☃ = Lists.newArrayList();
    final int ☃ = a(☃, "rm", -1);
    final int ☃ = a(☃, "r", -1);
    if ((☃ != null) && ((☃ >= 0) || (☃ >= 0)))
    {
      final int ☃ = ☃ * ☃;
      final int ☃ = ☃ * ☃;
      
      ☃.add(new Predicate()
      {
        public boolean a(pk ☃)
        {
          int ☃ = (int)☃.c(a);
          return ((☃ < 0) || (☃ >= ☃)) && ((☃ < 0) || (☃ <= ☃));
        }
      });
    }
    return ☃;
  }
  
  private static List<Predicate<pk>> g(Map<String, String> ☃)
  {
    List<Predicate<pk>> ☃ = Lists.newArrayList();
    if ((☃.containsKey("rym")) || (☃.containsKey("ry")))
    {
      int ☃ = a(a(☃, "rym", 0));
      final int ☃ = a(a(☃, "ry", 359));
      
      ☃.add(new Predicate()
      {
        public boolean a(pk ☃)
        {
          int ☃ = o.a((int)Math.floor(y));
          if (a > ☃) {
            return (☃ >= a) || (☃ <= ☃);
          }
          return (☃ >= a) && (☃ <= ☃);
        }
      });
    }
    if ((☃.containsKey("rxm")) || (☃.containsKey("rx")))
    {
      int ☃ = a(a(☃, "rxm", 0));
      final int ☃ = a(a(☃, "rx", 359));
      
      ☃.add(new Predicate()
      {
        public boolean a(pk ☃)
        {
          int ☃ = o.a((int)Math.floor(z));
          if (a > ☃) {
            return (☃ >= a) || (☃ <= ☃);
          }
          return (☃ >= a) && (☃ <= ☃);
        }
      });
    }
    return ☃;
  }
  
  private static <T extends pk> List<T> a(Map<String, String> ☃, Class<? extends T> ☃, List<Predicate<pk>> ☃, String ☃, adm ☃, cj ☃)
  {
    List<T> ☃ = Lists.newArrayList();
    String ☃ = b(☃, "type");
    ☃ = (☃ != null) && (☃.startsWith("!")) ? ☃.substring(1) : ☃;
    
    boolean ☃ = !☃.equals("e");
    boolean ☃ = (☃.equals("r")) && (☃ != null);
    
    int ☃ = a(☃, "dx", 0);
    int ☃ = a(☃, "dy", 0);
    int ☃ = a(☃, "dz", 0);
    
    int ☃ = a(☃, "r", -1);
    
    Predicate<pk> ☃ = Predicates.and(☃);
    Predicate<pk> ☃ = Predicates.and(po.a, ☃);
    if (☃ != null)
    {
      int ☃ = j.size();
      int ☃ = f.size();
      boolean ☃ = ☃ < ☃ / 16;
      if ((☃.containsKey("dx")) || (☃.containsKey("dy")) || (☃.containsKey("dz")))
      {
        aug ☃ = a(☃, ☃, ☃, ☃);
        if ((☃) && (☃) && (!☃))
        {
          Predicate<pk> ☃ = new Predicate()
          {
            public boolean a(pk ☃)
            {
              if ((s < a.a) || (t < a.b) || (u < a.c)) {
                return false;
              }
              if ((s >= a.d) || (t >= a.e) || (u >= a.f)) {
                return false;
              }
              return true;
            }
          };
          ☃.addAll(☃.b(☃, Predicates.and(☃, ☃)));
        }
        else
        {
          ☃.addAll(☃.a(☃, ☃, ☃));
        }
      }
      else if (☃ >= 0)
      {
        aug ☃ = new aug(☃.n() - ☃, ☃.o() - ☃, ☃.p() - ☃, ☃.n() + ☃ + 1, ☃.o() + ☃ + 1, ☃.p() + ☃ + 1);
        if ((☃) && (☃) && (!☃)) {
          ☃.addAll(☃.b(☃, ☃));
        } else {
          ☃.addAll(☃.a(☃, ☃, ☃));
        }
      }
      else if (☃.equals("a"))
      {
        ☃.addAll(☃.b(☃, ☃));
      }
      else if ((☃.equals("p")) || ((☃.equals("r")) && (!☃)))
      {
        ☃.addAll(☃.b(☃, ☃));
      }
      else
      {
        ☃.addAll(☃.a(☃, ☃));
      }
    }
    else if (☃.equals("a"))
    {
      ☃.addAll(☃.b(☃, ☃));
    }
    else if ((☃.equals("p")) || ((☃.equals("r")) && (!☃)))
    {
      ☃.addAll(☃.b(☃, ☃));
    }
    else
    {
      ☃.addAll(☃.a(☃, ☃));
    }
    return ☃;
  }
  
  private static <T extends pk> List<T> a(List<T> ☃, Map<String, String> ☃, m ☃, Class<? extends T> ☃, String ☃, cj ☃)
  {
    int ☃ = a(☃, "c", (☃.equals("a")) || (☃.equals("e")) ? 0 : 1);
    if ((☃.equals("p")) || (☃.equals("a")) || (☃.equals("e")))
    {
      if (☃ != null) {
        Collections.sort(☃, new Comparator()
        {
          public int a(pk ☃, pk ☃)
          {
            return ComparisonChain.start().compare(☃.b(a), ☃.b(a)).result();
          }
        });
      }
    }
    else if (☃.equals("r")) {
      Collections.shuffle(☃);
    }
    pk ☃ = ☃.f();
    if ((☃ != null) && (☃.isAssignableFrom(☃.getClass())) && (☃ == 1) && (☃.contains(☃)) && (!"r".equals(☃))) {
      ☃ = Lists.newArrayList(new pk[] { ☃ });
    }
    if (☃ != 0)
    {
      if (☃ < 0) {
        Collections.reverse(☃);
      }
      ☃ = ☃.subList(0, Math.min(Math.abs(☃), ☃.size()));
    }
    return ☃;
  }
  
  private static aug a(cj ☃, int ☃, int ☃, int ☃)
  {
    boolean ☃ = ☃ < 0;
    boolean ☃ = ☃ < 0;
    boolean ☃ = ☃ < 0;
    int ☃ = ☃.n() + (☃ ? ☃ : 0);
    int ☃ = ☃.o() + (☃ ? ☃ : 0);
    int ☃ = ☃.p() + (☃ ? ☃ : 0);
    int ☃ = ☃.n() + (☃ ? 0 : ☃) + 1;
    int ☃ = ☃.o() + (☃ ? 0 : ☃) + 1;
    int ☃ = ☃.p() + (☃ ? 0 : ☃) + 1;
    return new aug(☃, ☃, ☃, ☃, ☃, ☃);
  }
  
  public static int a(int ☃)
  {
    ☃ %= 360;
    if (☃ >= 160) {
      ☃ -= 360;
    }
    if (☃ < 0) {
      ☃ += 360;
    }
    return ☃;
  }
  
  private static cj b(Map<String, String> ☃, cj ☃)
  {
    return new cj(a(☃, "x", ☃.n()), a(☃, "y", ☃.o()), a(☃, "z", ☃.p()));
  }
  
  private static boolean h(Map<String, String> ☃)
  {
    for (String ☃ : d) {
      if (☃.containsKey(☃)) {
        return true;
      }
    }
    return false;
  }
  
  private static int a(Map<String, String> ☃, String ☃, int ☃)
  {
    return ☃.containsKey(☃) ? ns.a((String)☃.get(☃), ☃) : ☃;
  }
  
  private static String b(Map<String, String> ☃, String ☃)
  {
    return (String)☃.get(☃);
  }
  
  public static Map<String, Integer> a(Map<String, String> ☃)
  {
    Map<String, Integer> ☃ = Maps.newHashMap();
    for (String ☃ : ☃.keySet()) {
      if ((☃.startsWith("score_")) && (☃.length() > "score_".length())) {
        ☃.put(☃.substring("score_".length()), Integer.valueOf(ns.a((String)☃.get(☃), 1)));
      }
    }
    return ☃;
  }
  
  public static boolean a(String ☃)
  {
    Matcher ☃ = a.matcher(☃);
    if (☃.matches())
    {
      Map<String, String> ☃ = c(☃.group(2));
      String ☃ = ☃.group(1);
      int ☃ = ("a".equals(☃)) || ("e".equals(☃)) ? 0 : 1;
      return a(☃, "c", ☃) != 1;
    }
    return false;
  }
  
  public static boolean b(String ☃)
  {
    return a.matcher(☃).matches();
  }
  
  private static Map<String, String> c(String ☃)
  {
    Map<String, String> ☃ = Maps.newHashMap();
    if (☃ == null) {
      return ☃;
    }
    int ☃ = 0;
    int ☃ = -1;
    
    Matcher ☃ = b.matcher(☃);
    while (☃.find())
    {
      String ☃ = null;
      switch (☃++)
      {
      case 0: 
        ☃ = "x";
        break;
      case 1: 
        ☃ = "y";
        break;
      case 2: 
        ☃ = "z";
        break;
      case 3: 
        ☃ = "r";
      }
      if ((☃ != null) && (☃.group(1).length() > 0)) {
        ☃.put(☃, ☃.group(1));
      }
      ☃ = ☃.end();
    }
    if (☃ < ☃.length())
    {
      Matcher ☃ = c.matcher(☃ == -1 ? ☃ : ☃.substring(☃));
      while (☃.find()) {
        ☃.put(☃.group(1), ☃.group(2));
      }
    }
    return ☃;
  }
}
