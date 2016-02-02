import com.google.common.base.Charsets;
import com.google.common.base.Splitter;
import com.google.common.collect.Iterables;
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
import io.netty.channel.SimpleChannelInboundHandler;

class bdg$2
  extends ChannelInitializer<Channel>
{
  bdg$2(bdg parambdg, bdd parambdd, bde parambde) {}
  
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
}
