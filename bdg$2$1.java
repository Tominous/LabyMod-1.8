import com.google.common.base.Charsets;
import com.google.common.base.Splitter;
import com.google.common.collect.Iterables;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelFutureListener;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;

class bdg$2$1
  extends SimpleChannelInboundHandler<ByteBuf>
{
  bdg$2$1(bdg.2 param2) {}
  
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
      ☃.writeShort(7 + 2 * a.a.a().length());
      ☃.writeByte(127);
      ☃ = a.a.a().toCharArray();
      ☃.writeShort(☃.length);
      for (char ☃ : ☃) {
        ☃.writeChar(☃);
      }
      ☃.writeInt(a.a.b());
      
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
        
        a.b.f = -1;
        a.b.g = ☃;
        a.b.d = ☃;
        a.b.c = (a.h + "" + ☃ + "" + a.i + "/" + a.h + ☃);
      }
    }
    ☃.close();
  }
  
  public void exceptionCaught(ChannelHandlerContext ☃, Throwable ☃)
    throws Exception
  {
    ☃.close();
  }
}
