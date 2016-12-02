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
          ☃.writeShort(7 + 2 * bdg.2.this.a.a().length());
          ☃.writeByte(127);
          ☃ = bdg.2.this.a.a().toCharArray();
          ☃.writeShort(☃.length);
          for (char ☃ : ☃) {
            ☃.writeChar(☃);
          }
          ☃.writeInt(bdg.2.this.a.b());
          
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
            
            bdg.2.this.b.f = -1;
            bdg.2.this.b.g = ☃;
            bdg.2.this.b.d = ☃;
            bdg.2.this.b.c = (a.h + "" + ☃ + "" + a.i + "/" + a.h + ☃);
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
}
