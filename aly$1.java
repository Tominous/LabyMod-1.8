import com.google.common.base.Function;
import java.util.Map.Entry;

final class aly$1
  implements Function
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
}
