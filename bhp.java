import com.google.common.collect.Lists;
import com.google.common.util.concurrent.FutureCallback;
import com.google.common.util.concurrent.Futures;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.locks.ReentrantLock;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class bhp
  implements Runnable
{
  private static final Logger a = ;
  private final bho b;
  private final bfg c;
  
  public bhp(bho ☃)
  {
    this(☃, null);
  }
  
  public bhp(bho ☃, bfg ☃)
  {
    b = ☃;
    c = ☃;
  }
  
  public void run()
  {
    try
    {
      for (;;)
      {
        a(b.d());
      }
      b ☃;
      return;
    }
    catch (InterruptedException ☃)
    {
      a.debug("Stopping due to interrupt");
      return;
    }
    catch (Throwable ☃)
    {
      ☃ = b.a(☃, "Batching chunks");
      ave.A().a(ave.A().b(☃));
    }
  }
  
  protected void a(final bhn ☃)
    throws InterruptedException
  {
    ☃.f().lock();
    try
    {
      if (☃.a() != bhn.a.a)
      {
        if (!☃.h()) {
          a.warn("Chunk render task was " + ☃.a() + " when I expected it to be pending; ignoring task");
        }
        return;
      }
      ☃.a(bhn.a.b);
    }
    finally
    {
      ☃.f().unlock();
    }
    pk ☃ = ave.A().ac();
    if (☃ == null)
    {
      ☃.e();
      return;
    }
    ☃.a(b());
    
    float ☃ = (float)s;
    float ☃ = (float)t + ☃.aS();
    float ☃ = (float)u;
    
    bhn.b ☃ = ☃.g();
    if (☃ == bhn.b.a) {
      ☃.b().b(☃, ☃, ☃, ☃);
    } else if (☃ == bhn.b.b) {
      ☃.b().a(☃, ☃, ☃, ☃);
    }
    ☃.f().lock();
    try
    {
      if (☃.a() != bhn.a.b)
      {
        if (!☃.h()) {
          a.warn("Chunk render task was " + ☃.a() + " when I expected it to be compiling; aborting task");
        }
        b(☃); return;
      }
      ☃.a(bhn.a.c);
    }
    finally
    {
      ☃.f().unlock();
    }
    final bhq ☃ = ☃.c();
    List<ListenableFuture<Object>> ☃ = Lists.newArrayList();
    if (☃ == bhn.b.a) {
      for (adf ☃ : adf.values()) {
        if (☃.d(☃)) {
          ☃.add(b.a(☃, ☃.d().a(☃), ☃.b(), ☃));
        }
      }
    } else if (☃ == bhn.b.b) {
      ☃.add(b.a(adf.d, ☃.d().a(adf.d), ☃.b(), ☃));
    }
    final ListenableFuture<List<Object>> ☃ = Futures.allAsList(☃);
    ☃.a(new Runnable()
    {
      public void run()
      {
        ☃.cancel(false);
      }
    });
    Futures.addCallback(☃, new FutureCallback()
    {
      public void a(List<Object> ☃)
      {
        bhp.a(bhp.this, ☃);
        
        ☃.f().lock();
        try
        {
          if (☃.a() != bhn.a.c)
          {
            if (!☃.h()) {
              bhp.a().warn("Chunk render task was " + ☃.a() + " when I expected it to be uploading; aborting task");
            }
            return;
          }
          ☃.a(bhn.a.d);
        }
        finally
        {
          ☃.f().unlock();
        }
        ☃.b().a(☃);
      }
      
      public void onFailure(Throwable ☃)
      {
        bhp.a(bhp.this, ☃);
        if ((!(☃ instanceof CancellationException)) && (!(☃ instanceof InterruptedException))) {
          ave.A().a(b.a(☃, "Rendering chunk"));
        }
      }
    });
  }
  
  private bfg b()
    throws InterruptedException
  {
    return c != null ? c : b.c();
  }
  
  private void b(bhn ☃)
  {
    if (c == null) {
      b.a(☃.d());
    }
  }
}
