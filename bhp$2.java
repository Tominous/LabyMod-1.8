import com.google.common.util.concurrent.FutureCallback;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.locks.ReentrantLock;
import org.apache.logging.log4j.Logger;

class bhp$2
  implements FutureCallback<List<Object>>
{
  bhp$2(bhp parambhp, bhn parambhn, bhq parambhq) {}
  
  public void a(List<Object> ☃)
  {
    bhp.a(c, a);
    
    a.f().lock();
    try
    {
      if (a.a() != bhn.a.c)
      {
        if (!a.h()) {
          bhp.a().warn("Chunk render task was " + a.a() + " when I expected it to be uploading; aborting task");
        }
        return;
      }
      a.a(bhn.a.d);
    }
    finally
    {
      a.f().unlock();
    }
    a.b().a(b);
  }
  
  public void onFailure(Throwable ☃)
  {
    bhp.a(c, a);
    if ((!(☃ instanceof CancellationException)) && (!(☃ instanceof InterruptedException))) {
      ave.A().a(b.a(☃, "Rendering chunk"));
    }
  }
}
