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
  
  public void a(final bde server)
    throws UnknownHostException
  {
    bdd serveraddress = bdd.a(server.b);
    final ek networkmanager = ek.a(InetAddress.getByName(serveraddress.a()), serveraddress.b(), false);
    this.c.add(networkmanager);
    server.d = "Pinging...";
    server.e = -1L;
    server.i = null;
    networkmanager.a(new jp()
    {
      private boolean d = false;
      private boolean e = false;
      private long f = 0L;
      
      public void a(jr packetIn)
      {
        if (this.e)
        {
          networkmanager.a(new fa("Received unrequested status"));
        }
        else
        {
          this.e = true;
          js serverstatusresponse = packetIn.a();
          if (serverstatusresponse.a() != null) {
            server.d = serverstatusresponse.a().d();
          } else {
            server.d = "";
          }
          if (serverstatusresponse.c() != null)
          {
            server.g = serverstatusresponse.c().a();
            server.f = serverstatusresponse.c().b();
          }
          else
          {
            server.g = "Old";
            server.f = 0;
          }
          if (serverstatusresponse.b() != null)
          {
            server.c = (a.h + "" + serverstatusresponse.b().b() + "" + a.i + "/" + a.h + serverstatusresponse.b().a());
            if (ArrayUtils.isNotEmpty(serverstatusresponse.b().c()))
            {
              StringBuilder stringbuilder = new StringBuilder();
              for (GameProfile gameprofile : serverstatusresponse.b().c())
              {
                if (stringbuilder.length() > 0) {
                  stringbuilder.append("\n");
                }
                stringbuilder.append(gameprofile.getName());
              }
              if (serverstatusresponse.b().c().length < serverstatusresponse.b().b())
              {
                if (stringbuilder.length() > 0) {
                  stringbuilder.append("\n");
                }
                stringbuilder.append("... and ").append(serverstatusresponse.b().b() - serverstatusresponse.b().c().length).append(" more ...");
              }
              server.i = stringbuilder.toString();
            }
          }
          else
          {
            server.c = (a.i + "???");
          }
          if (serverstatusresponse.d() != null)
          {
            String s = serverstatusresponse.d();
            if (s.startsWith("data:image/png;base64,")) {
              server.a(s.substring("data:image/png;base64,".length()));
            } else {
              bdg.c().error("Invalid server icon (unknown format)");
            }
          }
          else
          {
            server.a((String)null);
          }
          this.f = ave.J();
          networkmanager.a(new ju(this.f));
          this.d = true;
        }
      }
      
      public void a(jq packetIn)
      {
        long i = this.f;
        long j = ave.J();
        server.e = (j - i);
        networkmanager.a(new fa("Finished"));
      }
      
      public void a(eu reason)
      {
        if (!this.d)
        {
          bdg.c().error("Can't ping " + server.b + ": " + reason.c());
          server.d = (a.e + "Can't connect to server.");
          server.c = "";
          bdg.a(bdg.this, server);
        }
      }
    });
    try
    {
      networkmanager.a(new jc(47, serveraddress.a(), serveraddress.b(), el.c));
      networkmanager.a(new jv());
    }
    catch (Throwable throwable)
    {
      b.error(throwable);
    }
  }
  
  private void b(final bde server)
  {
    final bdd serveraddress = bdd.a(server.b);
    ((Bootstrap)((Bootstrap)((Bootstrap)new Bootstrap().group((EventLoopGroup)ek.d.c())).handler(new ChannelInitializer()
    {
      protected void initChannel(Channel p_initChannel_1_)
        throws Exception
      {
        try
        {
          p_initChannel_1_.config().setOption(ChannelOption.TCP_NODELAY, Boolean.valueOf(true));
        }
        catch (ChannelException var3) {}
        p_initChannel_1_.pipeline().addLast(new ChannelHandler[] { new SimpleChannelInboundHandler()
        {
          public void channelActive(ChannelHandlerContext p_channelActive_1_)
            throws Exception
          {
            super.channelActive(p_channelActive_1_);
            ByteBuf bytebuf = Unpooled.buffer();
            try
            {
              bytebuf.writeByte(254);
              bytebuf.writeByte(1);
              bytebuf.writeByte(250);
              char[] achar = "MC|PingHost".toCharArray();
              bytebuf.writeShort(achar.length);
              for (char c0 : achar) {
                bytebuf.writeChar(c0);
              }
              bytebuf.writeShort(7 + 2 * bdg.2.this.val$serveraddress.a().length());
              bytebuf.writeByte(127);
              achar = bdg.2.this.val$serveraddress.a().toCharArray();
              bytebuf.writeShort(achar.length);
              for (char c1 : achar) {
                bytebuf.writeChar(c1);
              }
              bytebuf.writeInt(bdg.2.this.val$serveraddress.b());
              p_channelActive_1_.channel().writeAndFlush(bytebuf).addListener(ChannelFutureListener.CLOSE_ON_FAILURE);
            }
            finally
            {
              bytebuf.release();
            }
          }
          
          protected void a(ChannelHandlerContext p_channelRead0_1_, ByteBuf p_channelRead0_2_)
            throws Exception
          {
            short short1 = p_channelRead0_2_.readUnsignedByte();
            if (short1 == 255)
            {
              String s = new String(p_channelRead0_2_.readBytes(p_channelRead0_2_.readShort() * 2).array(), Charsets.UTF_16BE);
              String[] astring = (String[])Iterables.toArray(bdg.d().split(s), String.class);
              if ("§1".equals(astring[0]))
              {
                int i = ns.a(astring[1], 0);
                String s1 = astring[2];
                String s2 = astring[3];
                int j = ns.a(astring[4], -1);
                int k = ns.a(astring[5], -1);
                bdg.2.this.val$server.f = -1;
                bdg.2.this.val$server.g = s1;
                bdg.2.this.val$server.d = s2;
                bdg.2.this.val$server.c = (a.h + "" + j + "" + a.i + "/" + a.h + k);
              }
            }
            p_channelRead0_1_.close();
          }
          
          public void exceptionCaught(ChannelHandlerContext p_exceptionCaught_1_, Throwable p_exceptionCaught_2_)
            throws Exception
          {
            p_exceptionCaught_1_.close();
          }
        } });
      }
    })).channel(NioSocketChannel.class)).connect(serveraddress.a(), serveraddress.b());
  }
  
  public void a()
  {
    synchronized (this.c)
    {
      Iterator<ek> iterator = this.c.iterator();
      while (iterator.hasNext())
      {
        ek networkmanager = (ek)iterator.next();
        if (networkmanager.g())
        {
          networkmanager.a();
        }
        else
        {
          iterator.remove();
          networkmanager.l();
        }
      }
    }
  }
  
  public void b()
  {
    synchronized (this.c)
    {
      Iterator<ek> iterator = this.c.iterator();
      while (iterator.hasNext())
      {
        ek networkmanager = (ek)iterator.next();
        if (networkmanager.g())
        {
          iterator.remove();
          networkmanager.a(new fa("Cancelled"));
        }
      }
    }
  }
}
