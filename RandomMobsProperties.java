import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class RandomMobsProperties
{
  public String name = null;
  public String basePath = null;
  public jy[] resourceLocations = null;
  public RandomMobsRule[] rules = null;
  
  public RandomMobsProperties(String path, jy[] variants)
  {
    ConnectedParser cp = new ConnectedParser("RandomMobs");
    
    name = cp.parseName(path);
    basePath = cp.parseBasePath(path);
    
    resourceLocations = variants;
  }
  
  public RandomMobsProperties(Properties props, String path, jy baseResLoc)
  {
    ConnectedParser cp = new ConnectedParser("RandomMobs");
    
    name = cp.parseName(path);
    basePath = cp.parseBasePath(path);
    
    rules = parseRules(props, baseResLoc, cp);
  }
  
  public jy getTextureLocation(jy loc, ps el)
  {
    if (rules != null) {
      for (int i = 0; i < rules.length; i++)
      {
        RandomMobsRule rule = rules[i];
        if (rule.matches(el)) {
          return rule.getTextureLocation(loc, randomMobsId);
        }
      }
    }
    if (resourceLocations != null)
    {
      int randomId = randomMobsId;
      
      int index = randomId % resourceLocations.length;
      
      return resourceLocations[index];
    }
    return loc;
  }
  
  private RandomMobsRule[] parseRules(Properties props, jy baseResLoc, ConnectedParser cp)
  {
    List list = new ArrayList();
    int count = props.size();
    for (int i = 0; i < count; i++)
    {
      int index = i + 1;
      String valSkins = props.getProperty("skins." + index);
      if (valSkins != null)
      {
        int[] skins = cp.parseIntList(valSkins);
        int[] weights = cp.parseIntList(props.getProperty("weights." + index));
        ady[] biomes = cp.parseBiomes(props.getProperty("biomes." + index));
        RangeListInt heights = cp.parseRangeListInt(props.getProperty("heights." + index));
        if (heights == null) {
          heights = parseMinMaxHeight(props, index);
        }
        RandomMobsRule rule = new RandomMobsRule(baseResLoc, skins, weights, biomes, heights);
        list.add(rule);
      }
    }
    RandomMobsRule[] rules = (RandomMobsRule[])list.toArray(new RandomMobsRule[list.size()]);
    
    return rules;
  }
  
  private RangeListInt parseMinMaxHeight(Properties props, int index)
  {
    String minHeightStr = props.getProperty("minHeight." + index);
    String maxHeightStr = props.getProperty("maxHeight." + index);
    if ((minHeightStr == null) && (maxHeightStr == null)) {
      return null;
    }
    int minHeight = 0;
    if (minHeightStr != null)
    {
      minHeight = Config.parseInt(minHeightStr, -1);
      if (minHeight < 0)
      {
        Config.warn("Invalid minHeight: " + minHeightStr);
        return null;
      }
    }
    int maxHeight = 256;
    if (maxHeightStr != null)
    {
      maxHeight = Config.parseInt(maxHeightStr, -1);
      if (maxHeight < 0)
      {
        Config.warn("Invalid maxHeight: " + maxHeightStr);
        return null;
      }
    }
    if (maxHeight < 0)
    {
      Config.warn("Invalid minHeight, maxHeight: " + minHeightStr + ", " + maxHeightStr);
      return null;
    }
    RangeListInt list = new RangeListInt();
    list.addRange(new RangeInt(minHeight, maxHeight));
    
    return list;
  }
  
  public boolean isValid(String path)
  {
    if ((resourceLocations == null) && (rules == null))
    {
      Config.warn("No skins specified: " + path);
      return false;
    }
    if (rules != null) {
      for (int i = 0; i < rules.length; i++)
      {
        RandomMobsRule rule = rules[i];
        if (!rule.isValid(path)) {
          return false;
        }
      }
    }
    if (resourceLocations != null) {
      for (int i = 0; i < resourceLocations.length; i++)
      {
        jy loc = resourceLocations[i];
        if (!Config.hasResource(loc))
        {
          Config.warn("Texture not found: " + loc.a());
          return false;
        }
      }
    }
    return true;
  }
}
