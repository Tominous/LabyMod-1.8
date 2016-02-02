import com.google.common.base.Function;
import com.google.common.base.Joiner;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableTable;
import com.google.common.collect.Iterables;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map.Entry;

public abstract class aly
  implements alz
{
  private static final Joiner a = Joiner.on(',');
  private static final Function b = new Function()
  {
    private static final String __OBFID = "CL_00002031";
    
    public String a(Map.Entry p_177225_1_)
    {
      if (p_177225_1_ == null) {
        return "<NULL>";
      }
      amo var2 = (amo)p_177225_1_.getKey();
      return var2.a() + "=" + var2.a((Comparable)p_177225_1_.getValue());
    }
    
    public Object apply(Object p_apply_1_)
    {
      return a((Map.Entry)p_apply_1_);
    }
  };
  private static final String __OBFID = "CL_00002032";
  private int blockId = -1;
  private int blockStateId = -1;
  private int metadata = -1;
  private jy blockLocation = null;
  
  public int getBlockId()
  {
    if (this.blockId < 0) {
      this.blockId = afh.a(c());
    }
    return this.blockId;
  }
  
  public int getBlockStateId()
  {
    if (this.blockStateId < 0) {
      this.blockStateId = afh.f(this);
    }
    return this.blockStateId;
  }
  
  public int getMetadata()
  {
    if (this.metadata < 0) {
      this.metadata = c().c(this);
    }
    return this.metadata;
  }
  
  public jy getBlockLocation()
  {
    if (this.blockLocation == null) {
      this.blockLocation = ((jy)afh.c.c(c()));
    }
    return this.blockLocation;
  }
  
  public alz a(amo property)
  {
    return a(property, (Comparable)a(property.c(), b(property)));
  }
  
  protected static Object a(Collection values, Object currentValue)
  {
    Iterator var2 = values.iterator();
    do
    {
      if (!var2.hasNext()) {
        return var2.next();
      }
    } while (!var2.next().equals(currentValue));
    if (var2.hasNext()) {
      return var2.next();
    }
    return values.iterator().next();
  }
  
  public String toString()
  {
    StringBuilder var1 = new StringBuilder();
    var1.append(afh.c.c(c()));
    if (!b().isEmpty())
    {
      var1.append("[");
      a.appendTo(var1, Iterables.transform(b().entrySet(), b));
      var1.append("]");
    }
    return var1.toString();
  }
  
  public ImmutableTable<amo, Comparable, alz> getPropertyValueTable()
  {
    return null;
  }
}
