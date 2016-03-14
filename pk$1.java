import java.util.concurrent.Callable;

class pk$1
  implements Callable<String>
{
  pk$1(pk this$0) {}
  
  public String a()
    throws Exception
  {
    return pm.b(this.this$0) + " (" + this.this$0.getClass().getCanonicalName() + ")";
  }
}
