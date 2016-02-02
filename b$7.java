import java.lang.management.ManagementFactory;
import java.lang.management.RuntimeMXBean;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;

class b$7
  implements Callable
{
  private static final String __OBFID = "CL_00001329";
  
  b$7(b paramb) {}
  
  public String a()
  {
    RuntimeMXBean var1 = ManagementFactory.getRuntimeMXBean();
    List var2 = var1.getInputArguments();
    int var3 = 0;
    StringBuilder var4 = new StringBuilder();
    Iterator var5 = var2.iterator();
    while (var5.hasNext())
    {
      String var6 = (String)var5.next();
      if (var6.startsWith("-X"))
      {
        if (var3++ > 0) {
          var4.append(" ");
        }
        var4.append(var6);
      }
    }
    return String.format("%d total; %s", new Object[] { Integer.valueOf(var3), var4.toString() });
  }
}
