import com.google.common.base.Predicate;

class bfk$1
  implements Predicate
{
  final bfk a;
  
  bfk$1(bfk p_i46382_1_)
  {
    a = p_i46382_1_;
  }
  
  public boolean a(pk p_a_1_)
  {
    return p_a_1_.ad();
  }
  
  public boolean apply(Object p_apply_1_)
  {
    return a((pk)p_apply_1_);
  }
}
