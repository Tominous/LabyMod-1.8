import java.util.Map;
import java.util.concurrent.Callable;

class akw$1
  implements Callable<String>
{
  akw$1(akw paramakw) {}
  
  public String a()
    throws Exception
  {
    return (String)akw.G().get(this.a.getClass()) + " // " + this.a.getClass().getCanonicalName();
  }
}
