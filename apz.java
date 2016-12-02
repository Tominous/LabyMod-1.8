import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class apz
{
  private final List<aqa> a = Lists.newArrayList();
  private final Map<String, Map<String, String>> b = Maps.newHashMap();
  private int c;
  
  public int a()
  {
    return c;
  }
  
  public void a(int ☃)
  {
    c = ☃;
  }
  
  public Map<String, Map<String, String>> b()
  {
    return b;
  }
  
  public List<aqa> c()
  {
    return a;
  }
  
  public void d()
  {
    int ☃ = 0;
    for (aqa ☃ : a)
    {
      ☃.b(☃);
      ☃ += ☃.b();
    }
  }
  
  public String toString()
  {
    StringBuilder ☃ = new StringBuilder();
    
    ☃.append(3);
    ☃.append(";");
    for (int ☃ = 0; ☃ < a.size(); ☃++)
    {
      if (☃ > 0) {
        ☃.append(",");
      }
      ☃.append(((aqa)a.get(☃)).toString());
    }
    ☃.append(";");
    ☃.append(c);
    int ☃;
    if (!b.isEmpty())
    {
      ☃.append(";");
      ☃ = 0;
      for (Map.Entry<String, Map<String, String>> ☃ : b.entrySet())
      {
        if (☃++ > 0) {
          ☃.append(",");
        }
        ☃.append(((String)☃.getKey()).toLowerCase());
        
        Map<String, String> ☃ = (Map)☃.getValue();
        if (!☃.isEmpty())
        {
          ☃.append("(");
          int ☃ = 0;
          for (Map.Entry<String, String> ☃ : ☃.entrySet())
          {
            if (☃++ > 0) {
              ☃.append(" ");
            }
            ☃.append((String)☃.getKey());
            ☃.append("=");
            ☃.append((String)☃.getValue());
          }
          ☃.append(")");
        }
      }
    }
    else
    {
      ☃.append(";");
    }
    return ☃.toString();
  }
  
  private static aqa a(int ☃, String ☃, int ☃)
  {
    String[] ☃ = ☃ >= 3 ? ☃.split("\\*", 2) : ☃.split("x", 2);
    int ☃ = 1;
    int ☃ = 0;
    if (☃.length == 2) {
      try
      {
        ☃ = Integer.parseInt(☃[0]);
        if (☃ + ☃ >= 256) {
          ☃ = 256 - ☃;
        }
        if (☃ < 0) {
          ☃ = 0;
        }
      }
      catch (Throwable ☃)
      {
        return null;
      }
    }
    afh ☃ = null;
    try
    {
      String ☃ = ☃[(☃.length - 1)];
      if (☃ < 3)
      {
        ☃ = ☃.split(":", 2);
        if (☃.length > 1) {
          ☃ = Integer.parseInt(☃[1]);
        }
        ☃ = afh.c(Integer.parseInt(☃[0]));
      }
      else
      {
        ☃ = ☃.split(":", 3);
        ☃ = ☃.length > 1 ? afh.b(☃[0] + ":" + ☃[1]) : null;
        if (☃ != null)
        {
          ☃ = ☃.length > 2 ? Integer.parseInt(☃[2]) : 0;
        }
        else
        {
          ☃ = afh.b(☃[0]);
          if (☃ != null) {
            ☃ = ☃.length > 1 ? Integer.parseInt(☃[1]) : 0;
          }
        }
        if (☃ == null) {
          return null;
        }
      }
      if (☃ == afi.a) {
        ☃ = 0;
      }
      if ((☃ < 0) || (☃ > 15)) {
        ☃ = 0;
      }
    }
    catch (Throwable ☃)
    {
      return null;
    }
    aqa ☃ = new aqa(☃, ☃, ☃, ☃);
    ☃.b(☃);
    return ☃;
  }
  
  private static List<aqa> a(int ☃, String ☃)
  {
    if ((☃ == null) || (☃.length() < 1)) {
      return null;
    }
    List<aqa> ☃ = Lists.newArrayList();
    String[] ☃ = ☃.split(",");
    int ☃ = 0;
    for (String ☃ : ☃)
    {
      aqa ☃ = a(☃, ☃, ☃);
      if (☃ == null) {
        return null;
      }
      ☃.add(☃);
      ☃ += ☃.b();
    }
    return ☃;
  }
  
  public static apz a(String ☃)
  {
    if (☃ == null) {
      return e();
    }
    String[] ☃ = ☃.split(";", -1);
    int ☃ = ☃.length == 1 ? 0 : ns.a(☃[0], 0);
    if ((☃ < 0) || (☃ > 3)) {
      return e();
    }
    apz ☃ = new apz();
    int ☃ = ☃.length == 1 ? 0 : 1;
    List<aqa> ☃ = a(☃, ☃[(☃++)]);
    if ((☃ == null) || (☃.isEmpty())) {
      return e();
    }
    ☃.c().addAll(☃);
    ☃.d();
    
    int ☃ = qaz;
    if ((☃ > 0) && (☃.length > ☃)) {
      ☃ = ns.a(☃[(☃++)], ☃);
    }
    ☃.a(☃);
    if ((☃ > 0) && (☃.length > ☃))
    {
      String[] ☃ = ☃[(☃++)].toLowerCase().split(",");
      for (String ☃ : ☃)
      {
        String[] ☃ = ☃.split("\\(", 2);
        Map<String, String> ☃ = Maps.newHashMap();
        if (☃[0].length() > 0)
        {
          ☃.b().put(☃[0], ☃);
          if ((☃.length > 1) && (☃[1].endsWith(")")) && (☃[1].length() > 1))
          {
            String[] ☃ = ☃[1].substring(0, ☃[1].length() - 1).split(" ");
            for (int ☃ = 0; ☃ < ☃.length; ☃++)
            {
              String[] ☃ = ☃[☃].split("=", 2);
              if (☃.length == 2) {
                ☃.put(☃[0], ☃[1]);
              }
            }
          }
        }
      }
    }
    else
    {
      ☃.b().put("village", Maps.newHashMap());
    }
    return ☃;
  }
  
  public static apz e()
  {
    apz ☃ = new apz();
    
    ☃.a(qaz);
    ☃.c().add(new aqa(1, afi.h));
    ☃.c().add(new aqa(2, afi.d));
    ☃.c().add(new aqa(1, afi.c));
    ☃.d();
    ☃.b().put("village", Maps.newHashMap());
    
    return ☃;
  }
}
