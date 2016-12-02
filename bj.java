import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import net.minecraft.server.MinecraftServer;

public class bj
  extends i
{
  public String c()
  {
    return "spreadplayers";
  }
  
  public int a()
  {
    return 2;
  }
  
  public String c(m ☃)
  {
    return "commands.spreadplayers.usage";
  }
  
  public void a(m ☃, String[] ☃)
    throws bz
  {
    if (☃.length < 6) {
      throw new cf("commands.spreadplayers.usage", new Object[0]);
    }
    int ☃ = 0;
    cj ☃ = ☃.c();
    double ☃ = b(☃.n(), ☃[(☃++)], true);
    double ☃ = b(☃.p(), ☃[(☃++)], true);
    double ☃ = a(☃[(☃++)], 0.0D);
    double ☃ = a(☃[(☃++)], ☃ + 1.0D);
    boolean ☃ = d(☃[(☃++)]);
    
    List<pk> ☃ = Lists.newArrayList();
    while (☃ < ☃.length)
    {
      String ☃ = ☃[(☃++)];
      if (o.b(☃))
      {
        List<pk> ☃ = o.b(☃, ☃, pk.class);
        if (☃.size() == 0) {
          throw new ca();
        }
        ☃.addAll(☃);
      }
      else
      {
        wn ☃ = MinecraftServer.N().ap().a(☃);
        if (☃ == null) {
          throw new cd();
        }
        ☃.add(☃);
      }
    }
    ☃.a(n.a.c, ☃.size());
    if (☃.isEmpty()) {
      throw new ca();
    }
    ☃.a(new fb("commands.spreadplayers.spreading." + (☃ ? "teams" : "players"), new Object[] { Integer.valueOf(☃.size()), Double.valueOf(☃), Double.valueOf(☃), Double.valueOf(☃), Double.valueOf(☃) }));
    
    a(☃, ☃, new bj.a(☃, ☃), ☃, ☃, get0o, ☃);
  }
  
  private void a(m ☃, List<pk> ☃, bj.a ☃, double ☃, double ☃, adm ☃, boolean ☃)
    throws bz
  {
    Random ☃ = new Random();
    double ☃ = a - ☃;
    double ☃ = b - ☃;
    double ☃ = a + ☃;
    double ☃ = b + ☃;
    
    bj.a[] ☃ = a(☃, ☃ ? b(☃) : ☃.size(), ☃, ☃, ☃, ☃);
    int ☃ = a(☃, ☃, ☃, ☃, ☃, ☃, ☃, ☃, ☃, ☃);
    double ☃ = a(☃, ☃, ☃, ☃);
    
    a(☃, this, "commands.spreadplayers.success." + (☃ ? "teams" : "players"), new Object[] { Integer.valueOf(☃.length), Double.valueOf(a), Double.valueOf(b) });
    if (☃.length > 1) {
      ☃.a(new fb("commands.spreadplayers.info." + (☃ ? "teams" : "players"), new Object[] { String.format("%.2f", new Object[] { Double.valueOf(☃) }), Integer.valueOf(☃) }));
    }
  }
  
  private int b(List<pk> ☃)
  {
    Set<auq> ☃ = Sets.newHashSet();
    for (pk ☃ : ☃) {
      if ((☃ instanceof wn)) {
        ☃.add(((wn)☃).bO());
      } else {
        ☃.add(null);
      }
    }
    return ☃.size();
  }
  
  private int a(bj.a ☃, double ☃, adm ☃, Random ☃, double ☃, double ☃, double ☃, double ☃, bj.a[] ☃, boolean ☃)
    throws bz
  {
    boolean ☃ = true;
    
    double ☃ = 3.4028234663852886E38D;
    for (int ☃ = 0; (☃ < 10000) && (☃); ☃++)
    {
      ☃ = false;
      ☃ = 3.4028234663852886E38D;
      for (int ☃ = 0; ☃ < ☃.length; ☃++)
      {
        bj.a ☃ = ☃[☃];
        int ☃ = 0;
        bj.a ☃ = new bj.a();
        for (int ☃ = 0; ☃ < ☃.length; ☃++) {
          if (☃ != ☃)
          {
            bj.a ☃ = ☃[☃];
            
            double ☃ = ☃.a(☃);
            ☃ = Math.min(☃, ☃);
            if (☃ < ☃)
            {
              ☃++;
              a += a - a;
              b += b - b;
            }
          }
        }
        if (☃ > 0)
        {
          a /= ☃;
          b /= ☃;
          double ☃ = ☃.b();
          if (☃ > 0.0D)
          {
            ☃.a();
            
            ☃.b(☃);
          }
          else
          {
            ☃.a(☃, ☃, ☃, ☃, ☃);
          }
          ☃ = true;
        }
        if (☃.a(☃, ☃, ☃, ☃)) {
          ☃ = true;
        }
      }
      if (!☃) {
        for (bj.a ☃ : ☃) {
          if (!☃.b(☃))
          {
            ☃.a(☃, ☃, ☃, ☃, ☃);
            ☃ = true;
          }
        }
      }
    }
    if (☃ >= 10000) {
      throw new bz("commands.spreadplayers.failure." + (☃ ? "teams" : "players"), new Object[] { Integer.valueOf(☃.length), Double.valueOf(a), Double.valueOf(b), String.format("%.2f", new Object[] { Double.valueOf(☃) }) });
    }
    return ☃;
  }
  
  private double a(List<pk> ☃, adm ☃, bj.a[] ☃, boolean ☃)
  {
    double ☃ = 0.0D;
    int ☃ = 0;
    Map<auq, bj.a> ☃ = Maps.newHashMap();
    for (int ☃ = 0; ☃ < ☃.size(); ☃++)
    {
      pk ☃ = (pk)☃.get(☃);
      bj.a ☃;
      bj.a ☃;
      if (☃)
      {
        auq ☃ = (☃ instanceof wn) ? ((wn)☃).bO() : null;
        if (!☃.containsKey(☃)) {
          ☃.put(☃, ☃[(☃++)]);
        }
        ☃ = (bj.a)☃.get(☃);
      }
      else
      {
        ☃ = ☃[(☃++)];
      }
      ☃.a(ns.c(a) + 0.5F, ☃.a(☃), ns.c(b) + 0.5D);
      
      double ☃ = Double.MAX_VALUE;
      for (int ☃ = 0; ☃ < ☃.length; ☃++) {
        if (☃ != ☃[☃])
        {
          double ☃ = ☃.a(☃[☃]);
          ☃ = Math.min(☃, ☃);
        }
      }
      ☃ += ☃;
    }
    ☃ /= ☃.size();
    return ☃;
  }
  
  private bj.a[] a(Random ☃, int ☃, double ☃, double ☃, double ☃, double ☃)
  {
    bj.a[] ☃ = new bj.a[☃];
    for (int ☃ = 0; ☃ < ☃.length; ☃++)
    {
      bj.a ☃ = new bj.a();
      ☃.a(☃, ☃, ☃, ☃, ☃);
      ☃[☃] = ☃;
    }
    return ☃;
  }
  
  public List<String> a(m ☃, String[] ☃, cj ☃)
  {
    if ((☃.length >= 1) && (☃.length <= 2)) {
      return b(☃, 0, ☃);
    }
    return null;
  }
  
  static class a
  {
    double a;
    double b;
    
    a() {}
    
    a(double ☃, double ☃)
    {
      a = ☃;
      b = ☃;
    }
    
    double a(a ☃)
    {
      double ☃ = a - a;
      double ☃ = b - b;
      
      return Math.sqrt(☃ * ☃ + ☃ * ☃);
    }
    
    void a()
    {
      double ☃ = b();
      a /= ☃;
      b /= ☃;
    }
    
    float b()
    {
      return ns.a(a * a + b * b);
    }
    
    public void b(a ☃)
    {
      a -= a;
      b -= b;
    }
    
    public boolean a(double ☃, double ☃, double ☃, double ☃)
    {
      boolean ☃ = false;
      if (a < ☃)
      {
        a = ☃;
        ☃ = true;
      }
      else if (a > ☃)
      {
        a = ☃;
        ☃ = true;
      }
      if (b < ☃)
      {
        b = ☃;
        ☃ = true;
      }
      else if (b > ☃)
      {
        b = ☃;
        ☃ = true;
      }
      return ☃;
    }
    
    public int a(adm ☃)
    {
      cj ☃ = new cj(a, 256.0D, b);
      while (☃.o() > 0)
      {
        ☃ = ☃.b();
        if (☃.p(☃).c().t() != arm.a) {
          return ☃.o() + 1;
        }
      }
      return 257;
    }
    
    public boolean b(adm ☃)
    {
      cj ☃ = new cj(a, 256.0D, b);
      while (☃.o() > 0)
      {
        ☃ = ☃.b();
        
        arm ☃ = ☃.p(☃).c().t();
        if (☃ != arm.a) {
          return (!☃.d()) && (☃ != arm.o);
        }
      }
      return false;
    }
    
    public void a(Random ☃, double ☃, double ☃, double ☃, double ☃)
    {
      a = ns.a(☃, ☃, ☃);
      b = ns.a(☃, ☃, ☃);
    }
  }
}
