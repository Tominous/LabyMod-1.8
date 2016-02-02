import com.google.common.base.Predicate;
import java.net.IDN;

class axi$1
  implements Predicate<String>
{
  axi$1(axi paramaxi) {}
  
  public boolean a(String p_apply_1_)
  {
    if (p_apply_1_.length() == 0) {
      return true;
    }
    String[] astring = p_apply_1_.split(":");
    if (astring.length == 0) {
      return true;
    }
    try
    {
      String s = IDN.toASCII(astring[0]);
      return true;
    }
    catch (IllegalArgumentException var4) {}
    return false;
  }
}
