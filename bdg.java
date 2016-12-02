import com.google.common.base.Charsets;
import com.google.common.base.Splitter;
import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import com.mojang.authlib.GameProfile;
import io.netty.bootstrap.Bootstrap;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;
import io.netty.channel.ChannelConfig;
import io.netty.channel.ChannelException;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelFutureListener;
import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelOption;
import io.netty.channel.ChannelPipeline;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.SimpleChannelInboundHandler;
import io.netty.channel.socket.nio.NioSocketChannel;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.apache.commons.lang3.ArrayUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class bdg
{
  private static final Splitter a = Splitter.on('\000').limit(6);
  private static final Logger b = LogManager.getLogger();
  private final List<ek> c = Collections.synchronizedList(Lists.newArrayList());
  
  public void a(final bde ☃)
    throws UnknownHostException
  {
    bdd ☃ = bdd.a(b);
    final ek ☃ = ek.a(InetAddress.getByName(☃.a()), ☃.b(), false);
    
    c.add(☃);
    
    d = "Pinging...";
    e = -1L;
    i = null;
    
    ☃.a(new jp()
    {
      private boolean d = false;
      private boolean e = false;
      private long f = 0L;
      
      public void a(jr ☃)
      {
        if (e)
        {
          ☃.a(new fa("Received unrequested status"));
          return;
        }
        e = true;
        js ☃ = ☃.a();
        if (☃.a() != null) {
          ☃d = ☃.a().d();
        } else {
          ☃d = "";
        }
        if (☃.c() != null)
        {
          ☃g = ☃.c().a();
          ☃f = ☃.c().b();
        }
        else
        {
          ☃g = "Old";
          ☃f = 0;
        }
        if (☃.b() != null)
        {
          ☃c = (a.h + "" + ☃.b().b() + "" + a.i + "/" + a.h + ☃.b().a());
          if (ArrayUtils.isNotEmpty(☃.b().c()))
          {
            StringBuilder ☃ = new StringBuilder();
            for (GameProfile ☃ : ☃.b().c())
            {
              if (☃.length() > 0) {
                ☃.append("\n");
              }
              ☃.append(☃.getName());
            }
            if (☃.b().c().length < ☃.b().b())
            {
              if (☃.length() > 0) {
                ☃.append("\n");
              }
              ☃.append("... and ").append(☃.b().b() - ☃.b().c().length).append(" more ...");
            }
            ☃i = ☃.toString();
          }
        }
        else
        {
          ☃c = (a.i + "???");
        }
        if (☃.d() != null)
        {
          String ☃ = ☃.d();
          if (☃.startsWith("data:image/png;base64,")) {
            ☃.a(☃.substring("data:image/png;base64,".length()));
          } else {
            bdg.c().error("Invalid server icon (unknown format)");
          }
        }
        else
        {
          ☃.a(null);
        }
        f = ave.J();
        ☃.a(new ju(f));
        d = true;
      }
      
      public void a(jq ☃)
      {
        long ☃ = f;
        long ☃ = ave.J();
        ☃e = (☃ - ☃);
        
        ☃.a(new fa("Finished"));
      }
      
      public void a(eu ☃)
      {
        if (!d)
        {
          bdg.c().error("Can't ping " + ☃b + ": " + ☃.c());
          ☃d = (a.e + "Can't connect to server.");
          ☃c = "";
          
          bdg.a(bdg.this, ☃);
        }
      }
    });
    try
    {
      ☃.a(new jc(47, ☃.a(), ☃.b(), el.c));
      ☃.a(new jv());
    }
    catch (Throwable ☃)
    {
      b.error(☃);
    }
  }
  
  private void b(final bde ☃)
  {
    final bdd ☃ = bdd.a(b);
    
    ((Bootstrap)((Bootstrap)((Bootstrap)new Bootstrap().group((EventLoopGroup)ek.d.c())).handler(new ChannelInitializer()
    {
      protected void initChannel(Channel ☃)
        throws Exception
      {
        try
        {
          ☃.config().setOption(ChannelOption.TCP_NODELAY, Boolean.valueOf(true));
        }
        catch (ChannelException localChannelException) {}
        ☃.pipeline().addLast(new ChannelHandler[] { new SimpleChannelInboundHandler()
        {
          public void channelActive(ChannelHandlerContext ☃)
            throws Exception
          {
            super.channelActive(☃);
            ByteBuf ☃ = Unpooled.buffer();
            try
            {
              ☃.writeByte(254);
              ☃.writeByte(1);
              ☃.writeByte(250);
              
              char[] ☃ = "MC|PingHost".toCharArray();
              ☃.writeShort(☃.length);
              for (char ☃ : ☃) {
                ☃.writeChar(☃);
              }
              ☃.writeShort(7 + 2 * a.a().length());
              ☃.writeByte(127);
              ☃ = a.a().toCharArray();
              ☃.writeShort(☃.length);
              for (char ☃ : ☃) {
                ☃.writeChar(☃);
              }
              ☃.writeInt(a.b());
              
              ☃.channel().writeAndFlush(☃).addListener(ChannelFutureListener.CLOSE_ON_FAILURE);
            }
            finally
            {
              ☃.release();
            }
          }
          
          protected void a(ChannelHandlerContext ☃, ByteBuf ☃)
            throws Exception
          {
            short ☃ = ☃.readUnsignedByte();
            if (☃ == 255)
            {
              String ☃ = new String(☃.readBytes(☃.readShort() * 2).array(), Charsets.UTF_16BE);
              String[] ☃ = (String[])Iterables.toArray(bdg.d().split(☃), String.class);
              if ("§1".equals(☃[0]))
              {
                int ☃ = ns.a(☃[1], 0);
                String ☃ = ☃[2];
                String ☃ = ☃[3];
                int ☃ = ns.a(☃[4], -1);
                int ☃ = ns.a(☃[5], -1);
                
                b.f = -1;
                b.g = ☃;
                b.d = ☃;
                b.c = (a.h + "" + ☃ + "" + a.i + "/" + a.h + ☃);
              }
            }
            ☃.close();
          }
          
          public void exceptionCaught(ChannelHandlerContext ☃, Throwable ☃)
            throws Exception
          {
            ☃.close();
          }
        } });
      }
    })).channel(NioSocketChannel.class)).connect(☃.a(), ☃.b());
  }
  
  public void a()
  {
    synchronized (c)
    {
      Iterator<ek> ☃ = c.iterator();
      while (☃.hasNext())
      {
        ek ☃ = (ek)☃.next();
        if (☃.g())
        {
          ☃.a();
        }
        else
        {
          ☃.remove();
          ☃.l();
        }
      }
    }
  }
  
  public void b()
  {
    synchronized (c)
    {
      Iterator<ek> ☃ = c.iterator();
      while (☃.hasNext())
      {
        ek ☃ = (ek)☃.next();
        if (☃.g())
        {
          ☃.remove();
          ☃.a(new fa("Cancelled"));
        }
      }
    }
  }
}
