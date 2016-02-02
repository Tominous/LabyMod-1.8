import java.util.Set;
import java.util.concurrent.Callable;

class bdb$2
  implements Callable
{
  private static final String __OBFID = "CL_00000884";
  
  bdb$2(bdb parambdb) {}
  
  public String a()
  {
    return bdb.b(this.this$0).size() + " total; " + bdb.b(this.this$0).toString();
  }
}
