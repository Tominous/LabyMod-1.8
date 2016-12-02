public class RandomMobsRule
{
  private jy baseResLoc = null;
  private int[] skins = null;
  private jy[] resourceLocations = null;
  private int[] weights = null;
  private ady[] biomes = null;
  private RangeListInt heights = null;
  public int[] sumWeights = null;
  public int sumAllWeights = 1;
  
  public RandomMobsRule(jy baseResLoc, int[] skins, int[] weights, ady[] biomes, RangeListInt heights)
  {
    this.baseResLoc = baseResLoc;
    this.skins = skins;
    this.weights = weights;
    this.biomes = biomes;
    this.heights = heights;
  }
  
  public boolean isValid(String path)
  {
    resourceLocations = new jy[skins.length];
    
    jy locMcp = RandomMobs.getMcpatcherLocation(baseResLoc);
    if (locMcp == null)
    {
      Config.warn("Invalid path: " + baseResLoc.a());
      return false;
    }
    for (int i = 0; i < resourceLocations.length; i++)
    {
      int index = skins[i];
      if (index <= 1)
      {
        resourceLocations[i] = baseResLoc;
      }
      else
      {
        jy locNew = RandomMobs.getLocationIndexed(locMcp, index);
        if (locNew == null)
        {
          Config.warn("Invalid path: " + baseResLoc.a());
          return false;
        }
        if (!Config.hasResource(locNew))
        {
          Config.warn("Texture not found: " + locNew.a());
          return false;
        }
        resourceLocations[i] = locNew;
      }
    }
    if (weights != null)
    {
      if (weights.length > resourceLocations.length)
      {
        Config.warn("More weights defined than skins, trimming weights: " + path);
        int[] weights2 = new int[resourceLocations.length];
        System.arraycopy(weights, 0, weights2, 0, weights2.length);
        weights = weights2;
      }
      if (weights.length < resourceLocations.length)
      {
        Config.warn("Less weights defined than skins, expanding weights: " + path);
        int[] weights2 = new int[resourceLocations.length];
        System.arraycopy(weights, 0, weights2, 0, weights.length);
        int avgWeight = MathUtils.getAverage(weights);
        for (int i = weights.length; i < weights2.length; i++) {
          weights2[i] = avgWeight;
        }
        weights = weights2;
      }
      sumWeights = new int[weights.length];
      int sum = 0;
      for (int i = 0; i < weights.length; i++)
      {
        if (weights[i] < 0)
        {
          Config.warn("Invalid weight: " + weights[i]);
          return false;
        }
        sum += weights[i];
        sumWeights[i] = sum;
      }
      sumAllWeights = sum;
      if (sumAllWeights <= 0)
      {
        Config.warn("Invalid sum of all weights: " + sum);
        sumAllWeights = 1;
      }
    }
    return true;
  }
  
  public boolean matches(ps el)
  {
    if (biomes != null)
    {
      ady spawnBiome = spawnBiome;
      boolean matchBiome = false;
      for (int i = 0; i < biomes.length; i++)
      {
        ady biome = biomes[i];
        if (biome == spawnBiome)
        {
          matchBiome = true;
          break;
        }
      }
      if (!matchBiome) {
        return false;
      }
    }
    if ((heights != null) && (spawnPosition != null)) {
      return heights.isInRange(spawnPosition.o());
    }
    return true;
  }
  
  public jy getTextureLocation(jy loc, int randomId)
  {
    int index = 0;
    if (weights == null)
    {
      index = randomId % resourceLocations.length;
    }
    else
    {
      int randWeight = randomId % sumAllWeights;
      for (int i = 0; i < sumWeights.length; i++) {
        if (sumWeights[i] > randWeight)
        {
          index = i;
          break;
        }
      }
    }
    return resourceLocations[index];
  }
}
