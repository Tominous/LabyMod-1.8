import com.google.common.collect.HashMultimap;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Multimap;
import java.text.DecimalFormat;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Random;

public class aai
  extends zw
{
  private Map<Integer, List<pf>> a = Maps.newHashMap();
  private static final Map<List<pf>, Integer> b = ;
  
  public aai()
  {
    c(1);
    a(true);
    d(0);
    a(yz.k);
  }
  
  public List<pf> h(zx ☃)
  {
    if ((!☃.n()) || (!☃.o().b("CustomPotionEffects", 9)))
    {
      List<pf> ☃ = (List)a.get(Integer.valueOf(☃.i()));
      if (☃ == null)
      {
        ☃ = abe.b(☃.i(), false);
        a.put(Integer.valueOf(☃.i()), ☃);
      }
      return ☃;
    }
    List<pf> ☃ = Lists.newArrayList();
    du ☃ = ☃.o().c("CustomPotionEffects", 10);
    for (int ☃ = 0; ☃ < ☃.c(); ☃++)
    {
      dn ☃ = ☃.b(☃);
      pf ☃ = pf.b(☃);
      if (☃ != null) {
        ☃.add(☃);
      }
    }
    return ☃;
  }
  
  public List<pf> e(int ☃)
  {
    List<pf> ☃ = (List)a.get(Integer.valueOf(☃));
    if (☃ == null)
    {
      ☃ = abe.b(☃, false);
      a.put(Integer.valueOf(☃), ☃);
    }
    return ☃;
  }
  
  public zx b(zx ☃, adm ☃, wn ☃)
  {
    if (!bA.d) {
      b -= 1;
    }
    if (!D)
    {
      List<pf> ☃ = h(☃);
      if (☃ != null) {
        for (pf ☃ : ☃) {
          ☃.c(new pf(☃));
        }
      }
    }
    ☃.b(na.ad[zw.b(this)]);
    if (!bA.d)
    {
      if (b <= 0) {
        return new zx(zy.bA);
      }
      bi.a(new zx(zy.bA));
    }
    return ☃;
  }
  
  public int d(zx ☃)
  {
    return 32;
  }
  
  public aba e(zx ☃)
  {
    return aba.c;
  }
  
  public zx a(zx ☃, adm ☃, wn ☃)
  {
    if (f(☃.i()))
    {
      if (!bA.d) {
        b -= 1;
      }
      ☃.a(☃, "random.bow", 0.5F, 0.4F / (g.nextFloat() * 0.4F + 0.8F));
      if (!D) {
        ☃.d(new xc(☃, ☃, ☃));
      }
      ☃.b(na.ad[zw.b(this)]);
      return ☃;
    }
    ☃.a(☃, d(☃));
    return ☃;
  }
  
  public static boolean f(int ☃)
  {
    return (☃ & 0x4000) != 0;
  }
  
  public int g(int ☃)
  {
    return abe.a(☃, false);
  }
  
  public int a(zx ☃, int ☃)
  {
    if (☃ > 0) {
      return 16777215;
    }
    return g(☃.i());
  }
  
  public boolean h(int ☃)
  {
    List<pf> ☃ = e(☃);
    if ((☃ == null) || (☃.isEmpty())) {
      return false;
    }
    for (pf ☃ : ☃) {
      if (pe.a[☃.a()].b()) {
        return true;
      }
    }
    return false;
  }
  
  public String a(zx ☃)
  {
    if (☃.i() == 0) {
      return di.a("item.emptyPotion.name").trim();
    }
    String ☃ = "";
    if (f(☃.i())) {
      ☃ = di.a("potion.prefix.grenade").trim() + " ";
    }
    List<pf> ☃ = zy.bz.h(☃);
    if ((☃ != null) && (!☃.isEmpty()))
    {
      String ☃ = ((pf)☃.get(0)).g();
      ☃ = ☃ + ".postfix";
      return ☃ + di.a(☃).trim();
    }
    String ☃ = abe.c(☃.i());
    return di.a(☃).trim() + " " + super.a(☃);
  }
  
  public void a(zx ☃, wn ☃, List<String> ☃, boolean ☃)
  {
    if (☃.i() == 0) {
      return;
    }
    List<pf> ☃ = zy.bz.h(☃);
    Multimap<String, qd> ☃ = HashMultimap.create();
    if ((☃ != null) && (!☃.isEmpty()))
    {
      for (pf ☃ : ☃)
      {
        String ☃ = di.a(☃.g()).trim();
        pe ☃ = pe.a[☃.a()];
        Map<qb, qd> ☃ = ☃.l();
        if ((☃ != null) && (☃.size() > 0)) {
          for (Map.Entry<qb, qd> ☃ : ☃.entrySet())
          {
            qd ☃ = (qd)☃.getValue();
            qd ☃ = new qd(☃.b(), ☃.a(☃.c(), ☃), ☃.c());
            ☃.put(((qb)☃.getKey()).a(), ☃);
          }
        }
        if (☃.c() > 0) {
          ☃ = ☃ + " " + di.a(new StringBuilder().append("potion.potency.").append(☃.c()).toString()).trim();
        }
        if (☃.b() > 20) {
          ☃ = ☃ + " (" + pe.a(☃) + ")";
        }
        if (☃.g()) {
          ☃.add(a.m + ☃);
        } else {
          ☃.add(a.h + ☃);
        }
      }
    }
    else
    {
      String ☃ = di.a("potion.empty").trim();
      ☃.add(a.h + ☃);
    }
    if (!☃.isEmpty())
    {
      ☃.add("");
      ☃.add(a.f + di.a("potion.effects.whenDrank"));
      for (Map.Entry<String, qd> ☃ : ☃.entries())
      {
        qd ☃ = (qd)☃.getValue();
        double ☃ = ☃.d();
        double ☃;
        double ☃;
        if ((☃.c() == 1) || (☃.c() == 2)) {
          ☃ = ☃.d() * 100.0D;
        } else {
          ☃ = ☃.d();
        }
        if (☃ > 0.0D)
        {
          ☃.add(a.j + di.a(new StringBuilder().append("attribute.modifier.plus.").append(☃.c()).toString(), new Object[] { zx.a.format(☃), di.a("attribute.name." + (String)☃.getKey()) }));
        }
        else if (☃ < 0.0D)
        {
          ☃ *= -1.0D;
          ☃.add(a.m + di.a(new StringBuilder().append("attribute.modifier.take.").append(☃.c()).toString(), new Object[] { zx.a.format(☃), di.a("attribute.name." + (String)☃.getKey()) }));
        }
      }
    }
  }
  
  public boolean f(zx ☃)
  {
    List<pf> ☃ = h(☃);
    return (☃ != null) && (!☃.isEmpty());
  }
  
  public void a(zw ☃, yz ☃, List<zx> ☃)
  {
    super.a(☃, ☃, ☃);
    if (b.isEmpty()) {
      for (int ☃ = 0; ☃ <= 15; ☃++) {
        for (int ☃ = 0; ☃ <= 1; ☃++)
        {
          int ☃ = ☃;
          if (☃ == 0) {
            ☃ |= 0x2000;
          } else {
            ☃ |= 0x4000;
          }
          for (int ☃ = 0; ☃ <= 2; ☃++)
          {
            int ☃ = ☃;
            if (☃ != 0) {
              if (☃ == 1) {
                ☃ |= 0x20;
              } else if (☃ == 2) {
                ☃ |= 0x40;
              }
            }
            List<pf> ☃ = abe.b(☃, false);
            if ((☃ != null) && (!☃.isEmpty())) {
              b.put(☃, Integer.valueOf(☃));
            }
          }
        }
      }
    }
    for (Iterator ☃ = b.values().iterator(); ☃.hasNext();)
    {
      int ☃ = ((Integer)☃.next()).intValue();
      ☃.add(new zx(☃, 1, ☃));
    }
  }
}
