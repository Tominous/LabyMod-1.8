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
    bhp.a(this.c, this.a);
    
    this.a.f().lock();
    try
    {
      if (this.a.a() != bhn.a.c)
      {
        if (!this.a.h()) {
          bhp.a().warn("Chunk render task was " + this.a.a() + " when I expected it to be uploading; aborting task");
        }
        return;
      }
      this.a.a(bhn.a.d);
    }
    finally
    {
      this.a.f().unlock();
    }
    this.a.b().a(this.b);
  }
  
  public void onFailure(Throwable ☃)
  {
    bhp.a(this.c, this.a);
    if ((!(☃ instanceof CancellationException)) && (!(☃ instanceof InterruptedException))) {
      ave.A().a(b.a(☃, "Rendering chunk"));
    }
  }
}
