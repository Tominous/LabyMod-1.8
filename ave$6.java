import java.util.concurrent.Callable;
import org.lwjgl.Sys;

class ave$6
  implements Callable<String>
{
  ave$6(ave this$0) {}
  
  public String a()
  {
    return Sys.getVersion();
  }
}
