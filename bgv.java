import com.google.common.base.Objects;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import java.util.Collections;
import java.util.Map;
import java.util.Set;

public class bgv
{
  private Map<afh, bgy> a = Maps.newIdentityHashMap();
  private Set<afh> b = Sets.newIdentityHashSet();
  
  public void a(afh ☃, bgy ☃)
  {
    this.a.put(☃, ☃);
  }
  
  public void a(afh... ☃)
  {
    Collections.addAll(this.b, ☃);
  }
  
  public Map<alz, bov> a()
  {
    Map<alz, bov> ☃ = Maps.newIdentityHashMap();
    for (afh ☃ : afh.c) {
      if (!this.b.contains(☃)) {
        ☃.putAll(((bgy)Objects.firstNonNull(this.a.get(☃), new bgw())).a(☃));
      }
    }
    return ☃;
  }
}
