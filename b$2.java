import java.util.concurrent.Callable;

class b$2
  implements Callable
{
  private static final String __OBFID = "CL_00001222";
  
  b$2(b paramb) {}
  
  public String a()
  {
    return System.getProperty("os.name") + " (" + System.getProperty("os.arch") + ") version " + System.getProperty("os.version");
  }
}
