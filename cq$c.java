import com.google.common.base.Predicate;
import com.google.common.collect.Iterators;
import java.util.Iterator;
import java.util.Random;

public enum cq$c
  implements Predicate<cq>, Iterable<cq>
{
  private cq$c() {}
  
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
  
  public cq a(Random ☃)
  {
    cq[] ☃ = a();
    return ☃[☃.nextInt(☃.length)];
  }
  
  public boolean a(cq ☃)
  {
    return (☃ != null) && (☃.k().d() == this);
  }
  
  public Iterator<cq> iterator()
  {
    return Iterators.forArray(a());
  }
}
