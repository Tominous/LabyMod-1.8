import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Random;
import java.util.UUID;

public class RandomMobs
{
  private static Map locationProperties = new HashMap();
  private static bfr renderGlobal = null;
  private static boolean initialized = false;
  private static Random random = new Random();
  private static boolean working = false;
  public static final String SUFFIX_PNG = ".png";
  public static final String SUFFIX_PROPERTIES = ".properties";
  public static final String PREFIX_TEXTURES_ENTITY = "textures/entity/";
  public static final String PREFIX_MCPATCHER_MOB = "mcpatcher/mob/";
  private static final String[] DEPENDANT_SUFFIXES = { "_armor", "_eyes", "_exploding", "_shooting", "_fur", "_eyes", "_invulnerable", "_angry", "_tame", "_collar" };
  
  public static void entityLoaded(pk entity)
  {
    if (!(entity instanceof ps)) {
      return;
    }
    ps el = (ps)entity;
    
    le ws = Config.getWorldServer();
    if (ws == null) {
      return;
    }
    pk es = ws.a(entity.F());
    if (!(es instanceof ps)) {
      return;
    }
    ps els = (ps)es;
    
    UUID uuid = els.aK();
    
    long uuidLow = uuid.getLeastSignificantBits();
    
    int id = (int)(uuidLow & 0x7FFFFFFF);
    
    randomMobsId = id;
    
    spawnPosition = el.c();
    
    spawnBiome = ws.b(spawnPosition);
  }
  
  public static void worldChanged(adm oldWorld, adm newWorld)
  {
    if (newWorld != null)
    {
      List entityList = newWorld.E();
      for (int e = 0; e < entityList.size(); e++)
      {
        pk entity = (pk)entityList.get(e);
        entityLoaded(entity);
      }
    }
  }
  
  public static jy getTextureLocation(jy loc)
  {
    if (working) {
      return loc;
    }
    try
    {
      working = true;
      if (!initialized) {
        initialize();
      }
      if (renderGlobal == null) {
        return loc;
      }
      pk entity = renderGlobalrenderedEntity;
      if (!(entity instanceof ps)) {
        return loc;
      }
      ps entityLiving = (ps)entity;
      
      String name = loc.a();
      if (!name.startsWith("textures/entity/")) {
        return loc;
      }
      RandomMobsProperties props = getProperties(loc);
      jy localjy4;
      if (props == null) {
        return loc;
      }
      return props.getTextureLocation(loc, entityLiving);
    }
    finally
    {
      working = false;
    }
  }
  
  private static RandomMobsProperties getProperties(jy loc)
  {
    String name = loc.a();
    RandomMobsProperties props = (RandomMobsProperties)locationProperties.get(name);
    if (props == null)
    {
      props = makeProperties(loc);
      locationProperties.put(name, props);
    }
    return props;
  }
  
  private static RandomMobsProperties makeProperties(jy loc)
  {
    String path = loc.a();
    
    jy propLoc = getPropertyLocation(loc);
    if (propLoc != null)
    {
      RandomMobsProperties props = parseProperties(propLoc, loc);
      if (props != null) {
        return props;
      }
    }
    jy[] variants = getTextureVariants(loc);
    
    return new RandomMobsProperties(path, variants);
  }
  
  private static RandomMobsProperties parseProperties(jy propLoc, jy resLoc)
  {
    try
    {
      String path = propLoc.a();
      Config.dbg("RandomMobs: " + resLoc.a() + ", variants: " + path);
      
      InputStream in = Config.getResourceStream(propLoc);
      if (in == null)
      {
        Config.warn("RandomMobs properties not found: " + path);
        return null;
      }
      Properties props = new Properties();
      props.load(in);
      in.close();
      
      RandomMobsProperties rmp = new RandomMobsProperties(props, path, resLoc);
      if (!rmp.isValid(path)) {
        return null;
      }
      return rmp;
    }
    catch (FileNotFoundException e)
    {
      Config.warn("RandomMobs file not found: " + resLoc.a());
      return null;
    }
    catch (IOException e)
    {
      e.printStackTrace();
    }
    return null;
  }
  
  private static jy getPropertyLocation(jy loc)
  {
    jy locMcp = getMcpatcherLocation(loc);
    if (locMcp == null) {
      return null;
    }
    String domain = locMcp.b();
    String path = locMcp.a();
    
    String pathBase = path;
    if (pathBase.endsWith(".png")) {
      pathBase = pathBase.substring(0, pathBase.length() - ".png".length());
    }
    String pathProps = pathBase + ".properties";
    jy locProps = new jy(domain, pathProps);
    if (Config.hasResource(locProps)) {
      return locProps;
    }
    String pathParent = getParentPath(pathBase);
    if (pathParent == null) {
      return null;
    }
    jy locParentProps = new jy(domain, pathParent + ".properties");
    if (Config.hasResource(locParentProps)) {
      return locParentProps;
    }
    return null;
  }
  
  public static jy getMcpatcherLocation(jy loc)
  {
    String path = loc.a();
    if (!path.startsWith("textures/entity/")) {
      return null;
    }
    String pathMcp = "mcpatcher/mob/" + path.substring("textures/entity/".length());
    
    return new jy(loc.b(), pathMcp);
  }
  
  public static jy getLocationIndexed(jy loc, int index)
  {
    if (loc == null) {
      return null;
    }
    String path = loc.a();
    int pos = path.lastIndexOf('.');
    if (pos < 0) {
      return null;
    }
    String prefix = path.substring(0, pos);
    String suffix = path.substring(pos);
    
    String pathNew = prefix + index + suffix;
    jy locNew = new jy(loc.b(), pathNew);
    
    return locNew;
  }
  
  private static String getParentPath(String path)
  {
    for (int i = 0; i < DEPENDANT_SUFFIXES.length; i++)
    {
      String suffix = DEPENDANT_SUFFIXES[i];
      if (path.endsWith(suffix))
      {
        String pathParent = path.substring(0, path.length() - suffix.length());
        
        return pathParent;
      }
    }
    return null;
  }
  
  private static jy[] getTextureVariants(jy loc)
  {
    List list = new ArrayList();
    
    list.add(loc);
    
    jy locMcp = getMcpatcherLocation(loc);
    if (locMcp == null) {
      return null;
    }
    for (int i = 1; i < list.size() + 10; i++)
    {
      int index = i + 1;
      jy locIndex = getLocationIndexed(locMcp, index);
      if (Config.hasResource(locIndex)) {
        list.add(locIndex);
      }
    }
    if (list.size() <= 1) {
      return null;
    }
    jy[] locs = (jy[])list.toArray(new jy[list.size()]);
    Config.dbg("RandomMobs: " + loc.a() + ", variants: " + locs.length);
    
    return locs;
  }
  
  public static void resetTextures()
  {
    locationProperties.clear();
    if (Config.isRandomMobs()) {
      initialize();
    }
  }
  
  private static void initialize()
  {
    renderGlobal = Config.getRenderGlobal();
    if (renderGlobal == null) {
      return;
    }
    initialized = true;
    
    List list = new ArrayList();
    
    list.add("bat");
    list.add("blaze");
    list.add("cat/black");
    list.add("cat/ocelot");
    list.add("cat/red");
    list.add("cat/siamese");
    list.add("chicken");
    list.add("cow/cow");
    list.add("cow/mooshroom");
    list.add("creeper/creeper");
    list.add("enderman/enderman");
    list.add("enderman/enderman_eyes");
    list.add("ghast/ghast");
    list.add("ghast/ghast_shooting");
    list.add("iron_golem");
    list.add("pig/pig");
    list.add("sheep/sheep");
    list.add("sheep/sheep_fur");
    list.add("silverfish");
    list.add("skeleton/skeleton");
    list.add("skeleton/wither_skeleton");
    list.add("slime/slime");
    list.add("slime/magmacube");
    list.add("snowman");
    list.add("spider/cave_spider");
    list.add("spider/spider");
    list.add("spider_eyes");
    list.add("squid");
    list.add("villager/villager");
    list.add("villager/butcher");
    list.add("villager/farmer");
    list.add("villager/librarian");
    list.add("villager/priest");
    list.add("villager/smith");
    list.add("wither/wither");
    list.add("wither/wither_armor");
    list.add("wither/wither_invulnerable");
    list.add("wolf/wolf");
    list.add("wolf/wolf_angry");
    list.add("wolf/wolf_collar");
    list.add("wolf/wolf_tame");
    list.add("zombie_pigman");
    list.add("zombie/zombie");
    list.add("zombie/zombie_villager");
    for (int i = 0; i < list.size(); i++)
    {
      String name = (String)list.get(i);
      String tex = "textures/entity/" + name + ".png";
      jy texLoc = new jy(tex);
      if (!Config.hasResource(texLoc)) {
        Config.warn("Not found: " + texLoc);
      }
      getProperties(texLoc);
    }
  }
}
