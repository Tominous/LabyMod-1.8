import com.google.common.base.Predicate;
import com.google.common.primitives.Floats;

class axd$1
  implements Predicate<String>
{
  axd$1(axd paramaxd) {}
  
  public boolean a(String ☃)
  {
    Float ☃ = Floats.tryParse(☃);
    return (☃.length() == 0) || ((☃ != null) && (Floats.isFinite(☃.floatValue())) && (☃.floatValue() >= 0.0F));
  }
}
