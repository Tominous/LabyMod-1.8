import com.google.common.collect.ImmutableMap;
import java.util.Collection;

public abstract interface alz
{
  public abstract Collection<amo> a();
  
  public abstract <T extends Comparable<T>> T b(amo<T> paramamo);
  
  public abstract <T extends Comparable<T>, V extends T> alz a(amo<T> paramamo, V paramV);
  
  public abstract <T extends Comparable<T>> alz a(amo<T> paramamo);
  
  public abstract ImmutableMap<amo, Comparable> b();
  
  public abstract afh c();
}
