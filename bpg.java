import com.google.common.collect.Maps;
import java.util.Map;

public enum bpg
{
  private static final Map<String, bpg> j;
  private static final Map<Integer, bpg> k;
  private final String l;
  private final int m;
  
  private bpg(String ☃, int ☃)
  {
    this.l = ☃;
    this.m = ☃;
  }
  
  public String a()
  {
    return this.l;
  }
  
  public int b()
  {
    return this.m;
  }
  
  static
  {
    j = Maps.newHashMap();
    k = Maps.newHashMap();
    for (bpg ☃ : values())
    {
      if ((j.containsKey(☃.a())) || (k.containsKey(Integer.valueOf(☃.b())))) {
        throw new Error("Clash in Sound Category ID & Name pools! Cannot insert " + ☃);
      }
      j.put(☃.a(), ☃);
      k.put(Integer.valueOf(☃.b()), ☃);
    }
  }
  
  public static bpg a(String ☃)
  {
    return (bpg)j.get(☃);
  }
}
