import com.google.common.collect.Queues;
import com.google.common.util.concurrent.ThreadFactoryBuilder;
import io.netty.bootstrap.Bootstrap;
import io.netty.channel.Channel;
import io.netty.channel.ChannelConfig;
import io.netty.channel.ChannelException;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelFutureListener;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelOption;
import io.netty.channel.ChannelPipeline;
import io.netty.channel.EventLoop;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.SimpleChannelInboundHandler;
import io.netty.channel.epoll.Epoll;
import io.netty.channel.epoll.EpollEventLoopGroup;
import io.netty.channel.epoll.EpollSocketChannel;
import io.netty.channel.local.LocalChannel;
import io.netty.channel.local.LocalEventLoopGroup;
import io.netty.channel.local.LocalServerChannel;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.SocketChannel;
import io.netty.channel.socket.nio.NioSocketChannel;
import io.netty.handler.timeout.ReadTimeoutHandler;
import io.netty.handler.timeout.TimeoutException;
import io.netty.util.Attribute;
import io.netty.util.AttributeKey;
import io.netty.util.concurrent.Future;
import io.netty.util.concurrent.GenericFutureListener;
import java.net.InetAddress;
import java.net.SocketAddress;
import java.util.Queue;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock;
import java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock;
import javax.crypto.SecretKey;
import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.Validate;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.Marker;
import org.apache.logging.log4j.MarkerManager;

public class ek
  extends SimpleChannelInboundHandler<ff>
{
  private static final Logger g = ;
  public static final Marker a = MarkerManager.getMarker("NETWORK");
  public static final Marker b = MarkerManager.getMarker("NETWORK_PACKETS", a);
  public static final AttributeKey<el> c = AttributeKey.valueOf("protocol");
  public static final no<NioEventLoopGroup> d = new no()
  {
    protected NioEventLoopGroup a()
    {
      return new NioEventLoopGroup(0, new ThreadFactoryBuilder().setNameFormat("Netty Client IO #%d").setDaemon(true).build());
    }
  };
  public static final no<EpollEventLoopGroup> e = new no()
  {
    protected EpollEventLoopGroup a()
    {
      return new EpollEventLoopGroup(0, new ThreadFactoryBuilder().setNameFormat("Netty Epoll Client IO #%d").setDaemon(true).build());
    }
  };
  public static final no<LocalEventLoopGroup> f = new no()
  {
    protected LocalEventLoopGroup a()
    {
      return new LocalEventLoopGroup(0, new ThreadFactoryBuilder().setNameFormat("Netty Local Client IO #%d").setDaemon(true).build());
    }
  };
  private final fg h;
  private final Queue<ek.a> i = Queues.newConcurrentLinkedQueue();
  private final ReentrantReadWriteLock j = new ReentrantReadWriteLock();
  private Channel k;
  private SocketAddress l;
  private ep m;
  private eu n;
  private boolean o;
  private boolean p;
  
  public ek(fg ☃)
  {
    h = ☃;
  }
  
  public void channelActive(ChannelHandlerContext ☃)
    throws Exception
  {
    super.channelActive(☃);
    k = ☃.channel();
    l = k.remoteAddress();
    try
    {
      a(el.a);
    }
    catch (Throwable ☃)
    {
      g.fatal(☃);
    }
  }
  
  public void a(el ☃)
  {
    k.attr(c).set(☃);
    k.config().setAutoRead(true);
    g.debug("Enabled auto read");
  }
  
  public void channelInactive(ChannelHandlerContext ☃)
    throws Exception
  {
    a(new fb("disconnect.endOfStream", new Object[0]));
  }
  
  public void exceptionCaught(ChannelHandlerContext ☃, Throwable ☃)
    throws Exception
  {
    fb ☃;
    fb ☃;
    if ((☃ instanceof TimeoutException)) {
      ☃ = new fb("disconnect.timeout", new Object[0]);
    } else {
      ☃ = new fb("disconnect.genericReason", new Object[] { "Internal Exception: " + ☃ });
    }
    a(☃);
  }
  
  protected void a(ChannelHandlerContext ☃, ff ☃)
    throws Exception
  {
    if (k.isOpen()) {
      try
      {
        ☃.a(m);
      }
      catch (ki localki) {}
    }
  }
  
  public void a(ep ☃)
  {
    Validate.notNull(☃, "packetListener", new Object[0]);
    g.debug("Set listener of {} to {}", new Object[] { this, ☃ });
    m = ☃;
  }
  
  public void a(ff ☃)
  {
    if (g())
    {
      m();
      a(☃, null);
    }
    else
    {
      j.writeLock().lock();
      try
      {
        i.add(new ek.a(☃, null));
      }
      finally
      {
        j.writeLock().unlock();
      }
    }
  }
  
  public void a(ff ☃, GenericFutureListener<? extends Future<? super Void>> ☃, GenericFutureListener<? extends Future<? super Void>>... ☃)
  {
    if (g())
    {
      m();
      a(☃, (GenericFutureListener[])ArrayUtils.add(☃, 0, ☃));
    }
    else
    {
      j.writeLock().lock();
      try
      {
        i.add(new ek.a(☃, (GenericFutureListener[])ArrayUtils.add(☃, 0, ☃)));
      }
      finally
      {
        j.writeLock().unlock();
      }
    }
  }
  
  private void a(final ff ☃, final GenericFutureListener<? extends Future<? super Void>>[] ☃)
  {
    final el ☃ = el.a(☃);
    final el ☃ = (el)k.attr(c).get();
    if (☃ != ☃)
    {
      g.debug("Disabled auto read");
      k.config().setAutoRead(false);
    }
    if (k.eventLoop().inEventLoop())
    {
      if (☃ != ☃) {
        a(☃);
      }
      ChannelFuture ☃ = k.writeAndFlush(☃);
      if (☃ != null) {
        ☃.addListeners(☃);
      }
      ☃.addListener(ChannelFutureListener.FIRE_EXCEPTION_ON_FAILURE);
    }
    else
    {
      k.eventLoop().execute(new Runnable()
      {
        public void run()
        {
          if (☃ != ☃) {
            a(☃);
          }
          ChannelFuture ☃ = ek.a(ek.this).writeAndFlush(☃);
          if (☃ != null) {
            ☃.addListeners(☃);
          }
          ☃.addListener(ChannelFutureListener.FIRE_EXCEPTION_ON_FAILURE);
        }
      });
    }
  }
  
  private void m()
  {
    if ((k == null) || (!k.isOpen())) {
      return;
    }
    j.readLock().lock();
    try
    {
      while (!i.isEmpty())
      {
        ek.a ☃ = (ek.a)i.poll();
        a(ek.a.a(☃), ek.a.b(☃));
      }
    }
    finally
    {
      j.readLock().unlock();
    }
  }
  
  public void a()
  {
    m();
    if ((m instanceof km)) {
      ((km)m).c();
    }
    k.flush();
  }
  
  public SocketAddress b()
  {
    return l;
  }
  
  public void a(eu ☃)
  {
    if (k.isOpen())
    {
      k.close().awaitUninterruptibly();
      
      n = ☃;
    }
  }
  
  public boolean c()
  {
    return ((k instanceof LocalChannel)) || ((k instanceof LocalServerChannel));
  }
  
  public static ek a(InetAddress ☃, int ☃, boolean ☃)
  {
    ek ☃ = new ek(fg.b);
    no<? extends EventLoopGroup> ☃;
    Class<? extends SocketChannel> ☃;
    no<? extends EventLoopGroup> ☃;
    if ((Epoll.isAvailable()) && (☃))
    {
      Class<? extends SocketChannel> ☃ = EpollSocketChannel.class;
      ☃ = e;
    }
    else
    {
      ☃ = NioSocketChannel.class;
      ☃ = d;
    }
    ((Bootstrap)((Bootstrap)((Bootstrap)new Bootstrap().group((EventLoopGroup)☃.c())).handler(new ChannelInitializer()
    {
      protected void initChannel(Channel ☃)
        throws Exception
      {
        try
        {
          ☃.config().setOption(ChannelOption.TCP_NODELAY, Boolean.valueOf(true));
        }
        catch (ChannelException localChannelException) {}
        ☃.pipeline().addLast("timeout", new ReadTimeoutHandler(30)).addLast("splitter", new eq()).addLast("decoder", new en(fg.b)).addLast("prepender", new er()).addLast("encoder", new eo(fg.a)).addLast("packet_handler", a);
      }
    })).channel(☃)).connect(☃, ☃).syncUninterruptibly();
    
    return ☃;
  }
  
  public static ek a(SocketAddress ☃)
  {
    ek ☃ = new ek(fg.b);
    
    ((Bootstrap)((Bootstrap)((Bootstrap)new Bootstrap().group((EventLoopGroup)f.c())).handler(new ChannelInitializer()
    {
      protected void initChannel(Channel ☃)
        throws Exception
      {
        ☃.pipeline().addLast("packet_handler", a);
      }
    })).channel(LocalChannel.class)).connect(☃).syncUninterruptibly();
    
    return ☃;
  }
  
  public void a(SecretKey ☃)
  {
    o = true;
    k.pipeline().addBefore("splitter", "decrypt", new eg(ng.a(2, ☃)));
    k.pipeline().addBefore("prepender", "encrypt", new eh(ng.a(1, ☃)));
  }
  
  public boolean f()
  {
    return o;
  }
  
  public boolean g()
  {
    return (k != null) && (k.isOpen());
  }
  
  public boolean h()
  {
    return k == null;
  }
  
  public ep i()
  {
    return m;
  }
  
  public eu j()
  {
    return n;
  }
  
  public void k()
  {
    k.config().setAutoRead(false);
  }
  
  public void a(int ☃)
  {
    if (☃ >= 0)
    {
      if ((k.pipeline().get("decompress") instanceof ei)) {
        ((ei)k.pipeline().get("decompress")).a(☃);
      } else {
        k.pipeline().addBefore("decoder", "decompress", new ei(☃));
      }
      if ((k.pipeline().get("compress") instanceof ej)) {
        ((ej)k.pipeline().get("decompress")).a(☃);
      } else {
        k.pipeline().addBefore("encoder", "compress", new ej(☃));
      }
    }
    else
    {
      if ((k.pipeline().get("decompress") instanceof ei)) {
        k.pipeline().remove("decompress");
      }
      if ((k.pipeline().get("compress") instanceof ej)) {
        k.pipeline().remove("compress");
      }
    }
  }
  
  public void l()
  {
    if ((k == null) || (k.isOpen())) {
      return;
    }
    if (!p)
    {
      p = true;
      if (j() != null) {
        i().a(j());
      } else if (i() != null) {
        i().a(new fa("Disconnected"));
      }
    }
    else
    {
      g.warn("handleDisconnection() called twice");
    }
  }
  
  static class a
  {
    private final ff a;
    private final GenericFutureListener<? extends Future<? super Void>>[] b;
    
    public a(ff ☃, GenericFutureListener<? extends Future<? super Void>>... ☃)
    {
      a = ☃;
      b = ☃;
    }
  }
}
