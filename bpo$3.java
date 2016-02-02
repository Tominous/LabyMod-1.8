import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.Iterator;

class bpo$3
  implements Runnable
{
  private static final String __OBFID = "CL_00002380";
  
  bpo$3(bpo parambpo) {}
  
  public void run()
  {
    ArrayList var1 = Lists.newArrayList(this.this$0.ap().v());
    Iterator var2 = var1.iterator();
    while (var2.hasNext())
    {
      lf var3 = (lf)var2.next();
      this.this$0.ap().e(var3);
    }
  }
}
