import java.io.File;

public class ResourceUtils
{
  private static ReflectorClass ForgeAbstractResourcePack = new ReflectorClass(bmx.class);
  private static ReflectorField ForgeAbstractResourcePack_resourcePackFile = new ReflectorField(ForgeAbstractResourcePack, "field_110597_b");
  private static boolean directAccessValid = true;
  
  public static File getResourcePackFile(bmx arp)
  {
    if (directAccessValid) {
      try
      {
        return a;
      }
      catch (IllegalAccessError e)
      {
        directAccessValid = false;
        if (!ForgeAbstractResourcePack_resourcePackFile.exists()) {
          throw e;
        }
      }
    }
    return (File)Reflector.getFieldValue(arp, ForgeAbstractResourcePack_resourcePackFile);
  }
}
