import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToByteEncoder;
import java.util.zip.Deflater;

public class ej
  extends MessageToByteEncoder<ByteBuf>
{
  private final byte[] a = new byte[' '];
  private final Deflater b;
  private int c;
  
  public ej(int ☃)
  {
    c = ☃;
    b = new Deflater();
  }
  
  protected void a(ChannelHandlerContext ☃, ByteBuf ☃, ByteBuf ☃)
    throws Exception
  {
    int ☃ = ☃.readableBytes();
    em ☃ = new em(☃);
    if (☃ < c)
    {
      ☃.b(0);
      ☃.writeBytes(☃);
    }
    else
    {
      byte[] ☃ = new byte[☃];
      ☃.readBytes(☃);
      
      ☃.b(☃.length);
      
      b.setInput(☃, 0, ☃);
      b.finish();
      while (!b.finished())
      {
        int ☃ = b.deflate(a);
        ☃.writeBytes(a, 0, ☃);
      }
      b.reset();
    }
  }
  
  public void a(int ☃)
  {
    c = ☃;
  }
}
