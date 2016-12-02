import com.google.common.collect.Lists;
import com.google.common.collect.Queues;
import com.google.common.util.concurrent.Futures;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.ListenableFutureTask;
import com.google.common.util.concurrent.ThreadFactoryBuilder;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.locks.ReentrantLock;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.lwjgl.opengl.GL11;

public class bho
{
  private static final Logger a = ;
  private static final ThreadFactory b = new ThreadFactoryBuilder().setNameFormat("Chunk Batcher %d").setDaemon(true).build();
  private final List<bhp> c = Lists.newArrayList();
  private final BlockingQueue<bhn> d = Queues.newArrayBlockingQueue(100);
  private final BlockingQueue<bfg> e = Queues.newArrayBlockingQueue(5);
  private final bfe f = new bfe();
  private final bfz g = new bfz();
  private final Queue<ListenableFutureTask<?>> h = Queues.newArrayDeque();
  private final bhp i;
  
  public bho()
  {
    for (int ☃ = 0; ☃ < 2; ☃++)
    {
      bhp ☃ = new bhp(this);
      Thread ☃ = b.newThread(☃);
      ☃.start();
      c.add(☃);
    }
    for (int ☃ = 0; ☃ < 5; ☃++) {
      e.add(new bfg());
    }
    i = new bhp(this, new bfg());
  }
  
  public String a()
  {
    return String.format("pC: %03d, pU: %1d, aB: %1d", new Object[] { Integer.valueOf(d.size()), Integer.valueOf(h.size()), Integer.valueOf(e.size()) });
  }
  
  public boolean a(long ☃)
  {
    boolean ☃ = false;
    for (;;)
    {
      boolean ☃ = false;
      synchronized (h)
      {
        if (!h.isEmpty())
        {
          ((ListenableFutureTask)h.poll()).run();
          ☃ = true;
          ☃ = true;
        }
      }
      if ((☃ == 0L) || (!☃)) {
        break;
      }
      long ☃ = ☃ - System.nanoTime();
      if (☃ < 0L) {
        break;
      }
    }
    return ☃;
  }
  
  public boolean a(bht ☃)
  {
    ☃.c().lock();
    try
    {
      final bhn ☃ = ☃.d();
      ☃.a(new Runnable()
      {
        public void run()
        {
          bho.a(bho.this).remove(☃);
        }
      });
      boolean ☃ = d.offer(☃);
      if (!☃) {
        ☃.e();
      }
      return ☃;
    }
    finally
    {
      ☃.c().unlock();
    }
  }
  
  public boolean b(bht ☃)
  {
    ☃.c().lock();
    try
    {
      bhn ☃ = ☃.d();
      try
      {
        i.a(☃);
      }
      catch (InterruptedException localInterruptedException) {}
      return 1;
    }
    finally
    {
      ☃.c().unlock();
    }
  }
  
  public void b()
  {
    e();
    while (a(0L)) {}
    List<bfg> ☃ = Lists.newArrayList();
    while (☃.size() != 5) {
      try
      {
        ☃.add(c());
      }
      catch (InterruptedException localInterruptedException) {}
    }
    e.addAll(☃);
  }
  
  public void a(bfg ☃)
  {
    e.add(☃);
  }
  
  public bfg c()
    throws InterruptedException
  {
    return (bfg)e.take();
  }
  
  public bhn d()
    throws InterruptedException
  {
    return (bhn)d.take();
  }
  
  public boolean c(bht ☃)
  {
    ☃.c().lock();
    try
    {
      final bhn ☃ = ☃.e();
      boolean bool;
      if (☃ != null)
      {
        ☃.a(new Runnable()
        {
          public void run()
          {
            bho.a(bho.this).remove(☃);
          }
        });
        return d.offer(☃);
      }
      return true;
    }
    finally
    {
      ☃.c().unlock();
    }
  }
  
  public ListenableFuture<Object> a(final adf ☃, final bfd ☃, final bht ☃, final bhq ☃)
  {
    if (ave.A().aJ())
    {
      if (bqs.f()) {
        a(☃, ☃.b(☃.ordinal()));
      } else {
        a(☃, ((bhs)☃).a(☃, ☃), ☃);
      }
      ☃.c(0.0D, 0.0D, 0.0D);
      return Futures.immediateFuture(null);
    }
    ListenableFutureTask<Object> ☃ = ListenableFutureTask.create(new Runnable()
    {
      public void run()
      {
        a(☃, ☃, ☃, ☃);
      }
    }, null);
    synchronized (h)
    {
      h.add(☃);
    }
    return ☃;
  }
  
  private void a(bfd ☃, int ☃, bht ☃)
  {
    GL11.glNewList(☃, 4864);
    
    bfl.E();
    ☃.f();
    f.a(☃);
    bfl.F();
    
    GL11.glEndList();
  }
  
  private void a(bfd ☃, bmt ☃)
  {
    g.a(☃);
    g.a(☃);
  }
  
  public void e()
  {
    while (!d.isEmpty())
    {
      bhn ☃ = (bhn)d.poll();
      if (☃ != null) {
        ☃.e();
      }
    }
  }
}
