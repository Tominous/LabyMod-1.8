import io.netty.buffer.ByteBuf;
import io.netty.buffer.ByteBufAllocator;
import io.netty.channel.ChannelHandlerContext;
import javax.crypto.Cipher;
import javax.crypto.ShortBufferException;

public class ef
{
  private final Cipher a;
  private byte[] b = new byte[0];
  private byte[] c = new byte[0];
  
  protected ef(Cipher ☃)
  {
    a = ☃;
  }
  
  private byte[] a(ByteBuf ☃)
  {
    int ☃ = ☃.readableBytes();
    if (b.length < ☃) {
      b = new byte[☃];
    }
    ☃.readBytes(b, 0, ☃);
    return b;
  }
  
  protected ByteBuf a(ChannelHandlerContext ☃, ByteBuf ☃)
    throws ShortBufferException
  {
    int ☃ = ☃.readableBytes();
    byte[] ☃ = a(☃);
    
    ByteBuf ☃ = ☃.alloc().heapBuffer(a.getOutputSize(☃));
    ☃.writerIndex(a.update(☃, 0, ☃, ☃.array(), ☃.arrayOffset()));
    
    return ☃;
  }
  
  protected void a(ByteBuf ☃, ByteBuf ☃)
    throws ShortBufferException
  {
    int ☃ = ☃.readableBytes();
    byte[] ☃ = a(☃);
    
    int ☃ = a.getOutputSize(☃);
    if (c.length < ☃) {
      c = new byte[☃];
    }
    ☃.writeBytes(c, 0, a.update(☃, 0, ☃, c));
  }
}
