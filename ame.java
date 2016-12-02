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
    this.c.put(Character.valueOf(' '), Predicates.alwaysTrue());
  }
  
  public ame a(String... ☃)
  {
    if ((ArrayUtils.isEmpty(☃)) || (StringUtils.isEmpty(☃[0]))) {
      throw new IllegalArgumentException("Empty pattern for aisle");
    }
    if (this.b.isEmpty())
    {
      this.d = ☃.length;
      this.e = ☃[0].length();
    }
    if (☃.length != this.d) {
      throw new IllegalArgumentException("Expected aisle with height of " + this.d + ", but was given one with a height of " + ☃.length + ")");
    }
    for (String ☃ : ☃)
    {
      if (☃.length() != this.e) {
        throw new IllegalArgumentException("Not all rows in the given aisle are the correct width (expected " + this.e + ", found one with " + ☃.length() + ")");
      }
      for (char ☃ : ☃.toCharArray()) {
        if (!this.c.containsKey(Character.valueOf(☃))) {
          this.c.put(Character.valueOf(☃), null);
        }
      }
    }
    this.b.add(☃);
    
    return this;
  }
  
  public static ame a()
  {
    return new ame();
  }
  
  public ame a(char ☃, Predicate<amc> ☃)
  {
    this.c.put(Character.valueOf(☃), ☃);
    
    return this;
  }
  
  public amd b()
  {
    return new amd(c());
  }
  
  private Predicate<amc>[][][] c()
  {
    d();
    
    Predicate<amc>[][][] ☃ = (Predicate[][][])Array.newInstance(Predicate.class, new int[] { this.b.size(), this.d, this.e });
    for (int ☃ = 0; ☃ < this.b.size(); ☃++) {
      for (int ☃ = 0; ☃ < this.d; ☃++) {
        for (int ☃ = 0; ☃ < this.e; ☃++) {
          ☃[☃][☃][☃] = ((Predicate)this.c.get(Character.valueOf(((String[])this.b.get(☃))[☃].charAt(☃))));
        }
      }
    }
    return ☃;
  }
  
  private void d()
  {
    List<Character> ☃ = Lists.newArrayList();
    for (Map.Entry<Character, Predicate<amc>> ☃ : this.c.entrySet()) {
      if (☃.getValue() == null) {
        ☃.add(☃.getKey());
      }
    }
    if (!☃.isEmpty()) {
      throw new IllegalStateException("Predicates for character(s) " + a.join(☃) + " are missing");
    }
  }
}
