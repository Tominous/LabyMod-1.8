import java.lang.management.ManagementFactory;
import java.lang.management.RuntimeMXBean;
import java.util.List;
import java.util.concurrent.Callable;

class b$6
  implements Callable<String>
{
  b$6(b paramb) {}
  
  public String a()
  {
    RuntimeMXBean ☃ = ManagementFactory.getRuntimeMXBean();
    List<String> ☃ = ☃.getInputArguments();
    int ☃ = 0;
    StringBuilder ☃ = new StringBuilder();
    for (String ☃ : ☃) {
      if (☃.startsWith("-X"))
      {
        if (☃++ > 0) {
          ☃.append(" ");
        }
        ☃.append(☃);
      }
    }
    return String.format("%d total; %s", new Object[] { Integer.valueOf(☃), ☃.toString() });
  }
}
