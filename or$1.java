import com.google.common.collect.Maps;
import java.util.Map;
import java.util.TimerTask;

class or$1
  extends TimerTask
{
  or$1(or paramor) {}
  
  public void run()
  {
    if (!or.a(this.a).ad()) {
      return;
    }
    Map<String, Object> ☃;
    synchronized (or.b(this.a))
    {
      ☃ = Maps.newHashMap(or.c(this.a));
      if (or.d(this.a) == 0) {
        ☃.putAll(or.e(this.a));
      }
      ☃.put("snooper_count", Integer.valueOf(or.f(this.a)));
      ☃.put("snooper_token", or.g(this.a));
    }
    nj.a(or.h(this.a), ☃, true);
  }
}
