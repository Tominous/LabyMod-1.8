import java.util.Set;
import java.util.concurrent.Callable;

class bdb$1
  implements Callable<String>
{
  bdb$1(bdb parambdb) {}
  
  public String a()
  {
    return bdb.a(this.a).size() + " total; " + bdb.a(this.a).toString();
  }
}
