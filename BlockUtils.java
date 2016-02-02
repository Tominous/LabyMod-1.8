import java.util.IdentityHashMap;
import java.util.Map;

public class BlockUtils
{
  private static ReflectorClass ForgeBlock = new ReflectorClass(afh.class);
  private static ReflectorMethod ForgeBlock_setLightOpacity = new ReflectorMethod(ForgeBlock, "func_149713_g");
  private static boolean directAccessValid = true;
  private static Map mapOriginalOpacity = new IdentityHashMap();
  
  public static void setLightOpacity(afh block, int opacity)
  {
    if (!mapOriginalOpacity.containsKey(block)) {
      mapOriginalOpacity.put(block, Integer.valueOf(block.p()));
    }
    if (directAccessValid) {
      try
      {
        block.e(opacity);
        return;
      }
      catch (IllegalAccessError e)
      {
        directAccessValid = false;
        if (!ForgeBlock_setLightOpacity.exists()) {
          throw e;
        }
      }
    }
    Reflector.callVoid(block, ForgeBlock_setLightOpacity, new Object[] { Integer.valueOf(opacity) });
  }
  
  public static void restoreLightOpacity(afh block)
  {
    if (!mapOriginalOpacity.containsKey(block)) {
      return;
    }
    int opacity = ((Integer)mapOriginalOpacity.get(block)).intValue();
    
    setLightOpacity(block, opacity);
  }
}
