import java.util.Set;
import java.util.concurrent.Callable;

class bdb$1
  implements Callable
{
  private static final String __OBFID = "CL_00000883";
  
  bdb$1(bdb parambdb) {}
  
  public String a()
  {
    return bdb.a(this$0).size() + " total; " + bdb.a(this$0).toString();
  }
}
