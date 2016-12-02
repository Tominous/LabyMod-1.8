import com.google.common.base.Charsets;
import com.google.common.base.Joiner;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Queues;
import com.google.common.collect.Sets;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.StringReader;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Deque;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import org.apache.commons.io.IOUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class bot
{
  private static final Set<jy> b = Sets.newHashSet(new jy[] { new jy("blocks/water_flow"), new jy("blocks/water_still"), new jy("blocks/lava_flow"), new jy("blocks/lava_still"), new jy("blocks/destroy_stage_0"), new jy("blocks/destroy_stage_1"), new jy("blocks/destroy_stage_2"), new jy("blocks/destroy_stage_3"), new jy("blocks/destroy_stage_4"), new jy("blocks/destroy_stage_5"), new jy("blocks/destroy_stage_6"), new jy("blocks/destroy_stage_7"), new jy("blocks/destroy_stage_8"), new jy("blocks/destroy_stage_9"), new jy("items/empty_armor_slot_helmet"), new jy("items/empty_armor_slot_chestplate"), new jy("items/empty_armor_slot_leggings"), new jy("items/empty_armor_slot_boots") });
  private static final Logger c = LogManager.getLogger();
  protected static final bov a = new bov("builtin/missing", "missing");
  private static final Map<String, String> d = Maps.newHashMap();
  private static final Joiner e;
  private final bni f;
  private final Map<jy, bmi> g = Maps.newHashMap();
  private final Map<jy, bgl> h = Maps.newLinkedHashMap();
  private final Map<bov, bgm.d> i = Maps.newLinkedHashMap();
  private final bmh j;
  private final bgc k;
  private final bgo l = new bgo();
  private final bgp m = new bgp();
  private dd<bov, boq> n = new dd();
  private static final bgl o;
  private static final bgl p;
  private static final bgl q;
  private static final bgl r;
  
  static
  {
    d.put("missing", "{ \"textures\": {   \"particle\": \"missingno\",   \"missingno\": \"missingno\"}, \"elements\": [ {     \"from\": [ 0, 0, 0 ],     \"to\": [ 16, 16, 16 ],     \"faces\": {         \"down\":  { \"uv\": [ 0, 0, 16, 16 ], \"cullface\": \"down\", \"texture\": \"#missingno\" },         \"up\":    { \"uv\": [ 0, 0, 16, 16 ], \"cullface\": \"up\", \"texture\": \"#missingno\" },         \"north\": { \"uv\": [ 0, 0, 16, 16 ], \"cullface\": \"north\", \"texture\": \"#missingno\" },         \"south\": { \"uv\": [ 0, 0, 16, 16 ], \"cullface\": \"south\", \"texture\": \"#missingno\" },         \"west\":  { \"uv\": [ 0, 0, 16, 16 ], \"cullface\": \"west\", \"texture\": \"#missingno\" },         \"east\":  { \"uv\": [ 0, 0, 16, 16 ], \"cullface\": \"east\", \"texture\": \"#missingno\" }    }}]}");
    
    e = Joiner.on(" -> ");
    
    o = bgl.a("{\"elements\":[{  \"from\": [0, 0, 0],   \"to\": [16, 16, 16],   \"faces\": {       \"down\": {\"uv\": [0, 0, 16, 16], \"texture\":\"\"}   }}]}");
    p = bgl.a("{\"elements\":[{  \"from\": [0, 0, 0],   \"to\": [16, 16, 16],   \"faces\": {       \"down\": {\"uv\": [0, 0, 16, 16], \"texture\":\"\"}   }}]}");
    q = bgl.a("{\"elements\":[{  \"from\": [0, 0, 0],   \"to\": [16, 16, 16],   \"faces\": {       \"down\": {\"uv\": [0, 0, 16, 16], \"texture\":\"\"}   }}]}");
    r = bgl.a("{\"elements\":[{  \"from\": [0, 0, 0],   \"to\": [16, 16, 16],   \"faces\": {       \"down\": {\"uv\": [0, 0, 16, 16], \"texture\":\"\"}   }}]}");
    
    ob = "generation marker";
    pb = "compass generation marker";
    qb = "class generation marker";
    rb = "block entity marker";
  }
  
  private Map<String, jy> s = Maps.newLinkedHashMap();
  private final Map<jy, bgm> t = Maps.newHashMap();
  private Map<zw, List<String>> u = Maps.newIdentityHashMap();
  
  public bot(bni ☃, bmh ☃, bgc ☃)
  {
    f = ☃;
    j = ☃;
    k = ☃;
  }
  
  public db<bov, boq> a()
  {
    b();
    
    h();
    
    j();
    
    l();
    
    f();
    
    return n;
  }
  
  private void b()
  {
    a(k.a().a().values());
    
    i.put(a, new bgm.d(a.c(), Lists.newArrayList(new bgm.c[] { new bgm.c(new jy(a.a()), bor.a, false, 1) })));
    
    jy ☃ = new jy("item_frame");
    bgm ☃ = a(☃);
    a(☃, new bov(☃, "normal"));
    a(☃, new bov(☃, "map"));
    
    c();
    d();
  }
  
  private void a(Collection<bov> ☃)
  {
    for (bov ☃ : ☃) {
      try
      {
        bgm ☃ = a(☃);
        try
        {
          a(☃, ☃);
        }
        catch (Exception ☃)
        {
          c.warn("Unable to load variant: " + ☃.c() + " from " + ☃);
        }
      }
      catch (Exception ☃)
      {
        c.warn("Unable to load definition " + ☃, ☃);
      }
    }
  }
  
  private void a(bgm ☃, bov ☃)
  {
    i.put(☃, ☃.b(☃.c()));
  }
  
  private bgm a(jy ☃)
  {
    jy ☃ = b(☃);
    
    bgm ☃ = (bgm)t.get(☃);
    if (☃ == null)
    {
      List<bgm> ☃ = Lists.newArrayList();
      try
      {
        for (bnh ☃ : f.b(☃))
        {
          InputStream ☃ = null;
          try
          {
            ☃ = ☃.b();
            bgm ☃ = bgm.a(new InputStreamReader(☃, Charsets.UTF_8));
            ☃.add(☃);
          }
          catch (Exception ☃)
          {
            throw new RuntimeException("Encountered an exception when loading model definition of '" + ☃ + "' from: '" + ☃.a() + "' in resourcepack: '" + ☃.d() + "'", ☃);
          }
          finally
          {
            IOUtils.closeQuietly(☃);
          }
        }
      }
      catch (IOException ☃)
      {
        throw new RuntimeException("Encountered an exception when loading model definition of model " + ☃.toString(), ☃);
      }
      ☃ = new bgm(☃);
      t.put(☃, ☃);
    }
    return ☃;
  }
  
  private jy b(jy ☃)
  {
    return new jy(☃.b(), "blockstates/" + ☃.a() + ".json");
  }
  
  private void c()
  {
    for (Iterator ☃ = i.keySet().iterator(); ☃.hasNext();)
    {
      ☃ = (bov)☃.next();
      for (bgm.c ☃ : ((bgm.d)i.get(☃)).b())
      {
        jy ☃ = ☃.a();
        if (h.get(☃) == null) {
          try
          {
            bgl ☃ = c(☃);
            h.put(☃, ☃);
          }
          catch (Exception ☃)
          {
            c.warn("Unable to load block model: '" + ☃ + "' for variant: '" + ☃ + "'", ☃);
          }
        }
      }
    }
    bov ☃;
  }
  
  private bgl c(jy ☃)
    throws IOException
  {
    String ☃ = ☃.a();
    if ("builtin/generated".equals(☃)) {
      return o;
    }
    if ("builtin/compass".equals(☃)) {
      return p;
    }
    if ("builtin/clock".equals(☃)) {
      return q;
    }
    if ("builtin/entity".equals(☃)) {
      return r;
    }
    String ☃;
    Reader ☃;
    Reader ☃;
    if (☃.startsWith("builtin/"))
    {
      String ☃ = ☃.substring("builtin/".length());
      ☃ = (String)d.get(☃);
      if (☃ == null) {
        throw new FileNotFoundException(☃.toString());
      }
      ☃ = new StringReader(☃);
    }
    else
    {
      bnh ☃ = f.a(d(☃));
      ☃ = new InputStreamReader(☃.b(), Charsets.UTF_8);
    }
    try
    {
      bgl ☃ = bgl.a(☃);
      b = ☃.toString();
      return ☃;
    }
    finally
    {
      ☃.close();
    }
  }
  
  private jy d(jy ☃)
  {
    return new jy(☃.b(), "models/" + ☃.a() + ".json");
  }
  
  private void d()
  {
    e();
    for (Iterator ☃ = zw.e.iterator(); ☃.hasNext();)
    {
      ☃ = (zw)☃.next();
      List<String> ☃ = a(☃);
      for (String ☃ : ☃)
      {
        jy ☃ = a(☃);
        s.put(☃, ☃);
        if (h.get(☃) == null) {
          try
          {
            bgl ☃ = c(☃);
            h.put(☃, ☃);
          }
          catch (Exception ☃)
          {
            c.warn("Unable to load item model: '" + ☃ + "' for item: '" + zw.e.c(☃) + "'", ☃);
          }
        }
      }
    }
    zw ☃;
  }
  
  private void e()
  {
    u.put(zw.a(afi.b), Lists.newArrayList(new String[] { "stone", "granite", "granite_smooth", "diorite", "diorite_smooth", "andesite", "andesite_smooth" }));
    u.put(zw.a(afi.d), Lists.newArrayList(new String[] { "dirt", "coarse_dirt", "podzol" }));
    u.put(zw.a(afi.f), Lists.newArrayList(new String[] { "oak_planks", "spruce_planks", "birch_planks", "jungle_planks", "acacia_planks", "dark_oak_planks" }));
    u.put(zw.a(afi.g), Lists.newArrayList(new String[] { "oak_sapling", "spruce_sapling", "birch_sapling", "jungle_sapling", "acacia_sapling", "dark_oak_sapling" }));
    u.put(zw.a(afi.m), Lists.newArrayList(new String[] { "sand", "red_sand" }));
    u.put(zw.a(afi.r), Lists.newArrayList(new String[] { "oak_log", "spruce_log", "birch_log", "jungle_log" }));
    u.put(zw.a(afi.t), Lists.newArrayList(new String[] { "oak_leaves", "spruce_leaves", "birch_leaves", "jungle_leaves" }));
    u.put(zw.a(afi.v), Lists.newArrayList(new String[] { "sponge", "sponge_wet" }));
    u.put(zw.a(afi.A), Lists.newArrayList(new String[] { "sandstone", "chiseled_sandstone", "smooth_sandstone" }));
    u.put(zw.a(afi.cM), Lists.newArrayList(new String[] { "red_sandstone", "chiseled_red_sandstone", "smooth_red_sandstone" }));
    u.put(zw.a(afi.H), Lists.newArrayList(new String[] { "dead_bush", "tall_grass", "fern" }));
    u.put(zw.a(afi.I), Lists.newArrayList(new String[] { "dead_bush" }));
    u.put(zw.a(afi.L), Lists.newArrayList(new String[] { "black_wool", "red_wool", "green_wool", "brown_wool", "blue_wool", "purple_wool", "cyan_wool", "silver_wool", "gray_wool", "pink_wool", "lime_wool", "yellow_wool", "light_blue_wool", "magenta_wool", "orange_wool", "white_wool" }));
    u.put(zw.a(afi.N), Lists.newArrayList(new String[] { "dandelion" }));
    u.put(zw.a(afi.O), Lists.newArrayList(new String[] { "poppy", "blue_orchid", "allium", "houstonia", "red_tulip", "orange_tulip", "white_tulip", "pink_tulip", "oxeye_daisy" }));
    u.put(zw.a(afi.U), Lists.newArrayList(new String[] { "stone_slab", "sandstone_slab", "cobblestone_slab", "brick_slab", "stone_brick_slab", "nether_brick_slab", "quartz_slab" }));
    u.put(zw.a(afi.cP), Lists.newArrayList(new String[] { "red_sandstone_slab" }));
    u.put(zw.a(afi.cG), Lists.newArrayList(new String[] { "black_stained_glass", "red_stained_glass", "green_stained_glass", "brown_stained_glass", "blue_stained_glass", "purple_stained_glass", "cyan_stained_glass", "silver_stained_glass", "gray_stained_glass", "pink_stained_glass", "lime_stained_glass", "yellow_stained_glass", "light_blue_stained_glass", "magenta_stained_glass", "orange_stained_glass", "white_stained_glass" }));
    u.put(zw.a(afi.be), Lists.newArrayList(new String[] { "stone_monster_egg", "cobblestone_monster_egg", "stone_brick_monster_egg", "mossy_brick_monster_egg", "cracked_brick_monster_egg", "chiseled_brick_monster_egg" }));
    u.put(zw.a(afi.bf), Lists.newArrayList(new String[] { "stonebrick", "mossy_stonebrick", "cracked_stonebrick", "chiseled_stonebrick" }));
    u.put(zw.a(afi.bM), Lists.newArrayList(new String[] { "oak_slab", "spruce_slab", "birch_slab", "jungle_slab", "acacia_slab", "dark_oak_slab" }));
    u.put(zw.a(afi.bZ), Lists.newArrayList(new String[] { "cobblestone_wall", "mossy_cobblestone_wall" }));
    u.put(zw.a(afi.cf), Lists.newArrayList(new String[] { "anvil_intact", "anvil_slightly_damaged", "anvil_very_damaged" }));
    u.put(zw.a(afi.cq), Lists.newArrayList(new String[] { "quartz_block", "chiseled_quartz_block", "quartz_column" }));
    u.put(zw.a(afi.cu), Lists.newArrayList(new String[] { "black_stained_hardened_clay", "red_stained_hardened_clay", "green_stained_hardened_clay", "brown_stained_hardened_clay", "blue_stained_hardened_clay", "purple_stained_hardened_clay", "cyan_stained_hardened_clay", "silver_stained_hardened_clay", "gray_stained_hardened_clay", "pink_stained_hardened_clay", "lime_stained_hardened_clay", "yellow_stained_hardened_clay", "light_blue_stained_hardened_clay", "magenta_stained_hardened_clay", "orange_stained_hardened_clay", "white_stained_hardened_clay" }));
    u.put(zw.a(afi.cH), Lists.newArrayList(new String[] { "black_stained_glass_pane", "red_stained_glass_pane", "green_stained_glass_pane", "brown_stained_glass_pane", "blue_stained_glass_pane", "purple_stained_glass_pane", "cyan_stained_glass_pane", "silver_stained_glass_pane", "gray_stained_glass_pane", "pink_stained_glass_pane", "lime_stained_glass_pane", "yellow_stained_glass_pane", "light_blue_stained_glass_pane", "magenta_stained_glass_pane", "orange_stained_glass_pane", "white_stained_glass_pane" }));
    u.put(zw.a(afi.u), Lists.newArrayList(new String[] { "acacia_leaves", "dark_oak_leaves" }));
    u.put(zw.a(afi.s), Lists.newArrayList(new String[] { "acacia_log", "dark_oak_log" }));
    u.put(zw.a(afi.cI), Lists.newArrayList(new String[] { "prismarine", "prismarine_bricks", "dark_prismarine" }));
    u.put(zw.a(afi.cy), Lists.newArrayList(new String[] { "black_carpet", "red_carpet", "green_carpet", "brown_carpet", "blue_carpet", "purple_carpet", "cyan_carpet", "silver_carpet", "gray_carpet", "pink_carpet", "lime_carpet", "yellow_carpet", "light_blue_carpet", "magenta_carpet", "orange_carpet", "white_carpet" }));
    u.put(zw.a(afi.cF), Lists.newArrayList(new String[] { "sunflower", "syringa", "double_grass", "double_fern", "double_rose", "paeonia" }));
    u.put(zy.f, Lists.newArrayList(new String[] { "bow", "bow_pulling_0", "bow_pulling_1", "bow_pulling_2" }));
    u.put(zy.h, Lists.newArrayList(new String[] { "coal", "charcoal" }));
    u.put(zy.aR, Lists.newArrayList(new String[] { "fishing_rod", "fishing_rod_cast" }));
    u.put(zy.aU, Lists.newArrayList(new String[] { "cod", "salmon", "clownfish", "pufferfish" }));
    u.put(zy.aV, Lists.newArrayList(new String[] { "cooked_cod", "cooked_salmon" }));
    u.put(zy.aW, Lists.newArrayList(new String[] { "dye_black", "dye_red", "dye_green", "dye_brown", "dye_blue", "dye_purple", "dye_cyan", "dye_silver", "dye_gray", "dye_pink", "dye_lime", "dye_yellow", "dye_light_blue", "dye_magenta", "dye_orange", "dye_white" }));
    u.put(zy.bz, Lists.newArrayList(new String[] { "bottle_drinkable", "bottle_splash" }));
    u.put(zy.bX, Lists.newArrayList(new String[] { "skull_skeleton", "skull_wither", "skull_zombie", "skull_char", "skull_creeper" }));
    
    u.put(zw.a(afi.bo), Lists.newArrayList(new String[] { "oak_fence_gate" }));
    u.put(zw.a(afi.aO), Lists.newArrayList(new String[] { "oak_fence" }));
    u.put(zy.aq, Lists.newArrayList(new String[] { "oak_door" }));
  }
  
  private List<String> a(zw ☃)
  {
    List<String> ☃ = (List)u.get(☃);
    if (☃ == null) {
      ☃ = Collections.singletonList(((jy)zw.e.c(☃)).toString());
    }
    return ☃;
  }
  
  private jy a(String ☃)
  {
    jy ☃ = new jy(☃);
    return new jy(☃.b(), "item/" + ☃.a());
  }
  
  private void f()
  {
    for (bov ☃ : i.keySet())
    {
      box.a ☃ = new box.a();
      
      int ☃ = 0;
      for (bgm.c ☃ : ((bgm.d)i.get(☃)).b())
      {
        bgl ☃ = (bgl)h.get(☃.a());
        if ((☃ == null) || (!☃.d()))
        {
          c.warn("Missing model for: " + ☃);
        }
        else
        {
          ☃++;
          ☃.a(a(☃, ☃.b(), ☃.c()), ☃.d());
        }
      }
      if (☃ == 0) {
        c.warn("No weighted models for: " + ☃);
      } else if (☃ == 1) {
        n.a(☃, ☃.b());
      } else {
        n.a(☃, ☃.a());
      }
    }
    for (Map.Entry<String, jy> ☃ : s.entrySet())
    {
      jy ☃ = (jy)☃.getValue();
      bov ☃ = new bov((String)☃.getKey(), "inventory");
      bgl ☃ = (bgl)h.get(☃);
      if ((☃ == null) || (!☃.d())) {
        c.warn("Missing model for: " + ☃);
      } else if (c(☃)) {
        n.a(☃, new bos(☃.g()));
      } else {
        n.a(☃, a(☃, bor.a, false));
      }
    }
  }
  
  private Set<jy> g()
  {
    Set<jy> ☃ = Sets.newHashSet();
    
    List<bov> ☃ = Lists.newArrayList(i.keySet());
    Collections.sort(☃, new Comparator()
    {
      public int a(bov ☃, bov ☃)
      {
        return ☃.toString().compareTo(☃.toString());
      }
    });
    for (Iterator ☃ = ☃.iterator(); ☃.hasNext();)
    {
      ☃ = (bov)☃.next();
      bgm.d ☃ = (bgm.d)i.get(☃);
      for (bgm.c ☃ : ☃.b())
      {
        bgl ☃ = (bgl)h.get(☃.a());
        if (☃ == null) {
          c.warn("Missing model for: " + ☃);
        } else {
          ☃.addAll(a(☃));
        }
      }
    }
    bov ☃;
    ☃.addAll(b);
    
    return ☃;
  }
  
  private boq a(bgl ☃, bor ☃, boolean ☃)
  {
    bmi ☃ = (bmi)g.get(new jy(☃.c("particle")));
    
    bow.a ☃ = new bow.a(☃).a(☃);
    for (Iterator ☃ = ☃.a().iterator(); ☃.hasNext();)
    {
      ☃ = (bgh)☃.next();
      for (cq ☃ : c.keySet())
      {
        bgi ☃ = (bgi)c.get(☃);
        bmi ☃ = (bmi)g.get(new jy(☃.c(d)));
        if (b == null) {
          ☃.a(a(☃, ☃, ☃, ☃, ☃, ☃));
        } else {
          ☃.a(☃.a(b), a(☃, ☃, ☃, ☃, ☃, ☃));
        }
      }
    }
    bgh ☃;
    return ☃.b();
  }
  
  private bgg a(bgh ☃, bgi ☃, bmi ☃, cq ☃, bor ☃, boolean ☃)
  {
    return l.a(a, b, ☃, ☃, ☃, ☃, d, ☃, e);
  }
  
  private void h()
  {
    i();
    for (bgl ☃ : h.values()) {
      ☃.a(h);
    }
    bgl.b(h);
  }
  
  private void i()
  {
    Deque<jy> ☃ = Queues.newArrayDeque();
    Set<jy> ☃ = Sets.newHashSet();
    for (jy ☃ : h.keySet())
    {
      ☃.add(☃);
      
      jy ☃ = ((bgl)h.get(☃)).e();
      if (☃ != null) {
        ☃.add(☃);
      }
    }
    while (!☃.isEmpty())
    {
      jy ☃ = (jy)☃.pop();
      try
      {
        if (h.get(☃) != null) {
          continue;
        }
        bgl ☃ = c(☃);
        h.put(☃, ☃);
        
        jy ☃ = ☃.e();
        if ((☃ != null) && (!☃.contains(☃))) {
          ☃.add(☃);
        }
      }
      catch (Exception ☃)
      {
        c.warn("In parent chain: " + e.join(e(☃)) + "; unable to load model: '" + ☃ + "'", ☃);
      }
      ☃.add(☃);
    }
  }
  
  private List<jy> e(jy ☃)
  {
    List<jy> ☃ = Lists.newArrayList(new jy[] { ☃ });
    jy ☃ = ☃;
    while ((☃ = f(☃)) != null) {
      ☃.add(0, ☃);
    }
    return ☃;
  }
  
  private jy f(jy ☃)
  {
    for (Map.Entry<jy, bgl> ☃ : h.entrySet())
    {
      bgl ☃ = (bgl)☃.getValue();
      if ((☃ != null) && (☃.equals(☃.e()))) {
        return (jy)☃.getKey();
      }
    }
    return null;
  }
  
  private Set<jy> a(bgl ☃)
  {
    Set<jy> ☃ = Sets.newHashSet();
    for (bgh ☃ : ☃.a()) {
      for (bgi ☃ : c.values())
      {
        jy ☃ = new jy(☃.c(d));
        ☃.add(☃);
      }
    }
    ☃.add(new jy(☃.c("particle")));
    
    return ☃;
  }
  
  private void j()
  {
    final Set<jy> ☃ = g();
    ☃.addAll(k());
    
    ☃.remove(bmh.f);
    
    bmb ☃ = new bmb()
    {
      public void a(bmh ☃)
      {
        for (jy ☃ : ☃)
        {
          bmi ☃ = ☃.a(☃);
          bot.a(bot.this).put(☃, ☃);
        }
      }
    };
    j.a(f, ☃);
    
    g.put(new jy("missingno"), j.f());
  }
  
  private Set<jy> k()
  {
    Set<jy> ☃ = Sets.newHashSet();
    for (jy ☃ : s.values())
    {
      ☃ = (bgl)h.get(☃);
      if (☃ != null)
      {
        ☃.add(new jy(☃.c("particle")));
        if (b(☃)) {
          for (String ☃ : bgp.a)
          {
            jy ☃ = new jy(☃.c(☃));
            if ((☃.f() == p) && (!bmh.f.equals(☃))) {
              bmi.b(☃.toString());
            } else if ((☃.f() == q) && (!bmh.f.equals(☃))) {
              bmi.a(☃.toString());
            }
            ☃.add(☃);
          }
        } else if (!c(☃)) {
          for (bgh ☃ : ☃.a()) {
            for (bgi ☃ : c.values())
            {
              jy ☃ = new jy(☃.c(d));
              ☃.add(☃);
            }
          }
        }
      }
    }
    bgl ☃;
    return ☃;
  }
  
  private boolean b(bgl ☃)
  {
    if (☃ == null) {
      return false;
    }
    bgl ☃ = ☃.f();
    return (☃ == o) || (☃ == p) || (☃ == q);
  }
  
  private boolean c(bgl ☃)
  {
    if (☃ == null) {
      return false;
    }
    bgl ☃ = ☃.f();
    return ☃ == r;
  }
  
  private void l()
  {
    for (jy ☃ : s.values())
    {
      bgl ☃ = (bgl)h.get(☃);
      if (b(☃))
      {
        bgl ☃ = d(☃);
        if (☃ != null) {
          b = ☃.toString();
        }
        h.put(☃, ☃);
      }
      else if (c(☃))
      {
        h.put(☃, ☃);
      }
    }
    for (bmi ☃ : g.values()) {
      if (!☃.m()) {
        ☃.l();
      }
    }
  }
  
  private bgl d(bgl ☃)
  {
    return m.a(j, ☃);
  }
}
