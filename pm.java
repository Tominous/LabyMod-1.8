import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.lang.reflect.Constructor;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class pm
{
  private static final Logger b = ;
  private static final Map<String, Class<? extends pk>> c = Maps.newHashMap();
  private static final Map<Class<? extends pk>, String> d = Maps.newHashMap();
  private static final Map<Integer, Class<? extends pk>> e = Maps.newHashMap();
  private static final Map<Class<? extends pk>, Integer> f = Maps.newHashMap();
  private static final Map<String, Integer> g = Maps.newHashMap();
  public static final Map<Integer, pm.a> a = Maps.newLinkedHashMap();
  
  private static void a(Class<? extends pk> ☃, String ☃, int ☃)
  {
    if (c.containsKey(☃)) {
      throw new IllegalArgumentException("ID is already registered: " + ☃);
    }
    if (e.containsKey(Integer.valueOf(☃))) {
      throw new IllegalArgumentException("ID is already registered: " + ☃);
    }
    if (☃ == 0) {
      throw new IllegalArgumentException("Cannot register to reserved id: " + ☃);
    }
    if (☃ == null) {
      throw new IllegalArgumentException("Cannot register null clazz for id: " + ☃);
    }
    c.put(☃, ☃);
    d.put(☃, ☃);
    e.put(Integer.valueOf(☃), ☃);
    f.put(☃, Integer.valueOf(☃));
    g.put(☃, Integer.valueOf(☃));
  }
  
  private static void a(Class<? extends pk> ☃, String ☃, int ☃, int ☃, int ☃)
  {
    a(☃, ☃, ☃);
    
    a.put(Integer.valueOf(☃), new pm.a(☃, ☃, ☃));
  }
  
  static
  {
    a(uz.class, "Item", 1);
    a(pp.class, "XPOrb", 2);
    
    a(wz.class, "ThrownEgg", 7);
    a(up.class, "LeashKnot", 8);
    a(uq.class, "Painting", 9);
    a(wq.class, "Arrow", 10);
    a(wx.class, "Snowball", 11);
    a(wu.class, "Fireball", 12);
    a(ww.class, "SmallFireball", 13);
    a(xa.class, "ThrownEnderpearl", 14);
    a(wr.class, "EyeOfEnderSignal", 15);
    a(xc.class, "ThrownPotion", 16);
    a(xb.class, "ThrownExpBottle", 17);
    a(uo.class, "ItemFrame", 18);
    a(xd.class, "WitherSkull", 19);
    
    a(vj.class, "PrimedTnt", 20);
    a(uy.class, "FallingSand", 21);
    
    a(wt.class, "FireworksRocketEntity", 22);
    
    a(um.class, "ArmorStand", 30);
    
    a(ux.class, "Boat", 41);
    a(vg.class, va.a.a.b(), 42);
    a(vb.class, va.a.b.b(), 43);
    a(ve.class, va.a.c.b(), 44);
    a(vi.class, va.a.d.b(), 45);
    a(vf.class, va.a.f.b(), 46);
    a(vh.class, va.a.e.b(), 47);
    a(vc.class, va.a.g.b(), 40);
    
    a(ps.class, "Mob", 48);
    a(vv.class, "Monster", 49);
    
    a(vn.class, "Creeper", 50, 894731, 0);
    a(wa.class, "Skeleton", 51, 12698049, 4802889);
    a(wc.class, "Spider", 52, 3419431, 11013646);
    a(vs.class, "Giant", 53);
    a(we.class, "Zombie", 54, 44975, 7969893);
    a(wb.class, "Slime", 55, 5349438, 8306542);
    a(vr.class, "Ghast", 56, 16382457, 12369084);
    a(vw.class, "PigZombie", 57, 15373203, 5009705);
    a(vo.class, "Enderman", 58, 1447446, 0);
    a(vm.class, "CaveSpider", 59, 803406, 11013646);
    a(vz.class, "Silverfish", 60, 7237230, 3158064);
    a(vl.class, "Blaze", 61, 16167425, 16775294);
    a(vu.class, "LavaSlime", 62, 3407872, 16579584);
    a(ug.class, "EnderDragon", 63);
    a(uk.class, "WitherBoss", 64);
    a(tk.class, "Bat", 65, 4996656, 986895);
    a(wd.class, "Witch", 66, 3407872, 5349438);
    a(vp.class, "Endermite", 67, 1447446, 7237230);
    a(vt.class, "Guardian", 68, 5931634, 15826224);
    
    a(tt.class, "Pig", 90, 15771042, 14377823);
    a(tv.class, "Sheep", 91, 15198183, 16758197);
    a(to.class, "Cow", 92, 4470310, 10592673);
    a(tn.class, "Chicken", 93, 10592673, 16711680);
    a(tx.class, "Squid", 94, 2243405, 7375001);
    a(ua.class, "Wolf", 95, 14144467, 13545366);
    a(tr.class, "MushroomCow", 96, 10489616, 12040119);
    a(tw.class, "SnowMan", 97);
    a(ts.class, "Ozelot", 98, 15720061, 5653556);
    a(ty.class, "VillagerGolem", 99);
    a(tp.class, "EntityHorse", 100, 12623485, 15656192);
    a(tu.class, "Rabbit", 101, 10051392, 7555121);
    
    a(wi.class, "Villager", 120, 5651507, 12422002);
    
    a(uf.class, "EnderCrystal", 200);
  }
  
  public static pk a(String ☃, adm ☃)
  {
    pk ☃ = null;
    try
    {
      Class<? extends pk> ☃ = (Class)c.get(☃);
      if (☃ != null) {
        ☃ = (pk)☃.getConstructor(new Class[] { adm.class }).newInstance(new Object[] { ☃ });
      }
    }
    catch (Exception ☃)
    {
      ☃.printStackTrace();
    }
    return ☃;
  }
  
  public static pk a(dn ☃, adm ☃)
  {
    pk ☃ = null;
    if ("Minecart".equals(☃.j("id")))
    {
      ☃.a("id", va.a.a(☃.f("Type")).b());
      ☃.o("Type");
    }
    try
    {
      Class<? extends pk> ☃ = (Class)c.get(☃.j("id"));
      if (☃ != null) {
        ☃ = (pk)☃.getConstructor(new Class[] { adm.class }).newInstance(new Object[] { ☃ });
      }
    }
    catch (Exception ☃)
    {
      ☃.printStackTrace();
    }
    if (☃ != null) {
      ☃.f(☃);
    } else {
      b.warn("Skipping Entity with id " + ☃.j("id"));
    }
    return ☃;
  }
  
  public static pk a(int ☃, adm ☃)
  {
    pk ☃ = null;
    try
    {
      Class<? extends pk> ☃ = a(☃);
      if (☃ != null) {
        ☃ = (pk)☃.getConstructor(new Class[] { adm.class }).newInstance(new Object[] { ☃ });
      }
    }
    catch (Exception ☃)
    {
      ☃.printStackTrace();
    }
    if (☃ == null) {
      b.warn("Skipping Entity with id " + ☃);
    }
    return ☃;
  }
  
  public static int a(pk ☃)
  {
    Integer ☃ = (Integer)f.get(☃.getClass());
    return ☃ == null ? 0 : ☃.intValue();
  }
  
  public static Class<? extends pk> a(int ☃)
  {
    return (Class)e.get(Integer.valueOf(☃));
  }
  
  public static String b(pk ☃)
  {
    return (String)d.get(☃.getClass());
  }
  
  public static int a(String ☃)
  {
    Integer ☃ = (Integer)g.get(☃);
    if (☃ == null) {
      return 90;
    }
    return ☃.intValue();
  }
  
  public static String b(int ☃)
  {
    return (String)d.get(a(☃));
  }
  
  public static List<String> b()
  {
    Set<String> ☃ = c.keySet();
    List<String> ☃ = Lists.newArrayList();
    for (String ☃ : ☃)
    {
      Class<? extends pk> ☃ = (Class)c.get(☃);
      if ((☃.getModifiers() & 0x400) != 1024) {
        ☃.add(☃);
      }
    }
    ☃.add("LightningBolt");
    return ☃;
  }
  
  public static boolean a(pk ☃, String ☃)
  {
    String ☃ = b(☃);
    if ((☃ == null) && ((☃ instanceof wn))) {
      ☃ = "Player";
    } else if ((☃ == null) && ((☃ instanceof uv))) {
      ☃ = "LightningBolt";
    }
    return ☃.equals(☃);
  }
  
  public static boolean b(String ☃)
  {
    return ("Player".equals(☃)) || (b().contains(☃));
  }
  
  public static void a() {}
  
  public static class a
  {
    public final int a;
    public final int b;
    public final int c;
    public final mw d;
    public final mw e;
    
    public a(int ☃, int ☃, int ☃)
    {
      a = ☃;
      b = ☃;
      c = ☃;
      d = na.a(this);
      e = na.b(this);
    }
  }
}
