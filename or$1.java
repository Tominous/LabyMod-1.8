import com.google.common.collect.Maps;
import java.util.Map;
import java.util.TimerTask;

class or$1
  extends TimerTask
{
  or$1(or paramor) {}
  
  public void run()
  {
    if (!or.a(a).ad()) {
      return;
    }
    Map<String, Object> ☃;
    synchronized (or.b(a))
    {
      ☃ = Maps.newHashMap(or.c(a));
      if (or.d(a) == 0) {
        ☃.putAll(or.e(a));
      }
      ☃.put("snooper_count", Integer.valueOf(or.f(a)));
      ☃.put("snooper_token", or.g(a));
    }
    nj.a(or.h(a), ☃, true);
  }
}
