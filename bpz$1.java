import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Map;

final class bpz$1
  implements ParameterizedType
{
  public Type[] getActualTypeArguments()
  {
    return new Type[] { String.class, bph.class };
  }
  
  public Type getRawType()
  {
    return Map.class;
  }
  
  public Type getOwnerType()
  {
    return null;
  }
}
