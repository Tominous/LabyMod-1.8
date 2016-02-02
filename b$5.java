import java.util.concurrent.Callable;

class b$5
  implements Callable
{
  private static final String __OBFID = "CL_00001275";
  
  b$5(b paramb) {}
  
  public String a()
  {
    return System.getProperty("java.vm.name") + " (" + System.getProperty("java.vm.info") + "), " + System.getProperty("java.vm.vendor");
  }
}
