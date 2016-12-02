import com.google.common.primitives.Floats;
import java.util.Comparator;

class bfd$1
  implements Comparator
{
  final float[] a;
  final bfd b;
  
  bfd$1(bfd p_i46380_1_, float[] p_i46380_2_)
  {
    b = p_i46380_1_;
    a = p_i46380_2_;
  }
  
  public int a(Integer p_a_1_, Integer p_a_2_)
  {
    return Floats.compare(a[p_a_2_.intValue()], a[p_a_1_.intValue()]);
  }
  
  public int compare(Object p_compare_1_, Object p_compare_2_)
  {
    return a((Integer)p_compare_1_, (Integer)p_compare_2_);
  }
}
