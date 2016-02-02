import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import com.google.common.collect.Collections2;
import com.google.common.collect.Lists;
import java.util.Collection;

public class aml
  extends amm<cq>
{
  protected aml(String ☃, Collection<cq> ☃)
  {
    super(☃, cq.class, ☃);
  }
  
  public static aml a(String ☃)
  {
    return a(☃, Predicates.alwaysTrue());
  }
  
  public static aml a(String ☃, Predicate<cq> ☃)
  {
    return a(☃, Collections2.filter(Lists.newArrayList(cq.values()), ☃));
  }
  
  public static aml a(String ☃, Collection<cq> ☃)
  {
    return new aml(☃, ☃);
  }
}
