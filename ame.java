import com.google.common.base.Joiner;
import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.lang.reflect.Array;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.StringUtils;

public class ame
{
  private static final Joiner a = Joiner.on(",");
  private final List<String[]> b = Lists.newArrayList();
  private final Map<Character, Predicate<amc>> c = Maps.newHashMap();
  private int d;
  private int e;
  
  private ame()
  {
    c.put(Character.valueOf(' '), Predicates.alwaysTrue());
  }
  
  public ame a(String... ☃)
  {
    if ((ArrayUtils.isEmpty(☃)) || (StringUtils.isEmpty(☃[0]))) {
      throw new IllegalArgumentException("Empty pattern for aisle");
    }
    if (b.isEmpty())
    {
      d = ☃.length;
      e = ☃[0].length();
    }
    if (☃.length != d) {
      throw new IllegalArgumentException("Expected aisle with height of " + d + ", but was given one with a height of " + ☃.length + ")");
    }
    for (String ☃ : ☃)
    {
      if (☃.length() != e) {
        throw new IllegalArgumentException("Not all rows in the given aisle are the correct width (expected " + e + ", found one with " + ☃.length() + ")");
      }
      for (char ☃ : ☃.toCharArray()) {
        if (!c.containsKey(Character.valueOf(☃))) {
          c.put(Character.valueOf(☃), null);
        }
      }
    }
    b.add(☃);
    
    return this;
  }
  
  public static ame a()
  {
    return new ame();
  }
  
  public ame a(char ☃, Predicate<amc> ☃)
  {
    c.put(Character.valueOf(☃), ☃);
    
    return this;
  }
  
  public amd b()
  {
    return new amd(c());
  }
  
  private Predicate<amc>[][][] c()
  {
    d();
    
    Predicate<amc>[][][] ☃ = (Predicate[][][])Array.newInstance(Predicate.class, new int[] { b.size(), d, e });
    for (int ☃ = 0; ☃ < b.size(); ☃++) {
      for (int ☃ = 0; ☃ < d; ☃++) {
        for (int ☃ = 0; ☃ < e; ☃++) {
          ☃[☃][☃][☃] = ((Predicate)c.get(Character.valueOf(((String[])b.get(☃))[☃].charAt(☃))));
        }
      }
    }
    return ☃;
  }
  
  private void d()
  {
    List<Character> ☃ = Lists.newArrayList();
    for (Map.Entry<Character, Predicate<amc>> ☃ : c.entrySet()) {
      if (☃.getValue() == null) {
        ☃.add(☃.getKey());
      }
    }
    if (!☃.isEmpty()) {
      throw new IllegalStateException("Predicates for character(s) " + a.join(☃) + " are missing");
    }
  }
}
