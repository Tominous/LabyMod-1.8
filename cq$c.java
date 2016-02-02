import com.google.common.base.Predicate;
import com.google.common.collect.Iterators;
import java.util.Iterator;
import java.util.Random;

public enum cq$c
  implements Predicate, Iterable
{
  private static final c[] c = { a, b };
  private static final String __OBFID = "CL_00002319";
  
  public cq[] a()
  {
    switch (cq.1.c[ordinal()])
    {
    case 1: 
      return new cq[] { cq.c, cq.f, cq.d, cq.e };
    case 2: 
      return new cq[] { cq.b, cq.a };
    }
    throw new Error("Someone's been tampering with the universe!");
  }
  
  public cq a(Random rand)
  {
    cq[] var2 = a();
    return var2[rand.nextInt(var2.length)];
  }
  
  public boolean a(cq facing)
  {
    return (facing != null) && (facing.k().d() == this);
  }
  
  public Iterator iterator()
  {
    return Iterators.forArray(a());
  }
  
  public boolean apply(Object p_apply_1_)
  {
    return a((cq)p_apply_1_);
  }
}
