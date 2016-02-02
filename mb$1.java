import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;

final class mb$1
  implements ParameterizedType
{
  public Type[] getActualTypeArguments()
  {
    return new Type[] { ma.class };
  }
  
  public Type getRawType()
  {
    return List.class;
  }
  
  public Type getOwnerType()
  {
    return null;
  }
}
