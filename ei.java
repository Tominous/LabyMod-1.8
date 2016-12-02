import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.ByteToMessageDecoder;
import io.netty.handler.codec.DecoderException;
import java.util.List;
import java.util.zip.Inflater;

public class ei
  extends ByteToMessageDecoder
{
  private final Inflater a;
  private int b;
  
  public ei(int ☃)
  {
    b = ☃;
    a = new Inflater();
  }
  
  protected void decode(ChannelHandlerContext ☃, ByteBuf ☃, List<Object> ☃)
    throws Exception
  {
    if (☃.readableBytes() == 0) {
      return;
    }
    em ☃ = new em(☃);
    int ☃ = ☃.e();
    if (☃ == 0)
    {
      ☃.add(☃.readBytes(☃.readableBytes()));
    }
    else
    {
      if (☃ < b) {
        throw new DecoderException("Badly compressed packet - size of " + ☃ + " is below server threshold of " + b);
      }
      if (☃ > 2097152) {
        throw new DecoderException("Badly compressed packet - size of " + ☃ + " is larger than protocol maximum of " + 2097152);
      }
      byte[] ☃ = new byte[☃.readableBytes()];
      ☃.readBytes(☃);
      a.setInput(☃);
      
      byte[] ☃ = new byte[☃];
      a.inflate(☃);
      ☃.add(Unpooled.wrappedBuffer(☃));
      
      a.reset();
    }
  }
  
  public void a(int ☃)
  {
    b = ☃;
  }
}
