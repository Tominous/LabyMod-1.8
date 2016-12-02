import java.util.Set;
import java.util.concurrent.Callable;

class bdb$2
  implements Callable<String>
{
  bdb$2(bdb parambdb) {}
  
  public String a()
  {
    return bdb.b(this.a).size() + " total; " + bdb.b(this.a).toString();
  }
}
