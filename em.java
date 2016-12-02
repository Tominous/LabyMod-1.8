import com.google.common.base.Charsets;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.ByteBufAllocator;
import io.netty.buffer.ByteBufInputStream;
import io.netty.buffer.ByteBufOutputStream;
import io.netty.buffer.ByteBufProcessor;
import io.netty.handler.codec.DecoderException;
import io.netty.handler.codec.EncoderException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.GatheringByteChannel;
import java.nio.channels.ScatteringByteChannel;
import java.nio.charset.Charset;
import java.util.UUID;

public class em
  extends ByteBuf
{
  private final ByteBuf a;
  
  public em(ByteBuf ☃)
  {
    a = ☃;
  }
  
  public static int a(int ☃)
  {
    for (int ☃ = 1; ☃ < 5; ☃++) {
      if ((☃ & -1 << ☃ * 7) == 0) {
        return ☃;
      }
    }
    return 5;
  }
  
  public void a(byte[] ☃)
  {
    b(☃.length);
    writeBytes(☃);
  }
  
  public byte[] a()
  {
    byte[] ☃ = new byte[e()];
    readBytes(☃);
    
    return ☃;
  }
  
  public cj c()
  {
    return cj.a(readLong());
  }
  
  public void a(cj ☃)
  {
    writeLong(☃.g());
  }
  
  public eu d()
    throws IOException
  {
    return eu.a.a(c(32767));
  }
  
  public void a(eu ☃)
    throws IOException
  {
    a(eu.a.a(☃));
  }
  
  public <T extends Enum<T>> T a(Class<T> ☃)
  {
    return ((Enum[])☃.getEnumConstants())[e()];
  }
  
  public void a(Enum<?> ☃)
  {
    b(☃.ordinal());
  }
  
  public int e()
  {
    int ☃ = 0;
    int ☃ = 0;
    for (;;)
    {
      byte ☃ = readByte();
      
      ☃ |= (☃ & 0x7F) << ☃++ * 7;
      if (☃ > 5) {
        throw new RuntimeException("VarInt too big");
      }
      if ((☃ & 0x80) != 128) {
        break;
      }
    }
    return ☃;
  }
  
  public long f()
  {
    long ☃ = 0L;
    int ☃ = 0;
    for (;;)
    {
      byte ☃ = readByte();
      
      ☃ |= (☃ & 0x7F) << ☃++ * 7;
      if (☃ > 10) {
        throw new RuntimeException("VarLong too big");
      }
      if ((☃ & 0x80) != 128) {
        break;
      }
    }
    return ☃;
  }
  
  public void a(UUID ☃)
  {
    writeLong(☃.getMostSignificantBits());
    writeLong(☃.getLeastSignificantBits());
  }
  
  public UUID g()
  {
    return new UUID(readLong(), readLong());
  }
  
  public void b(int ☃)
  {
    for (;;)
    {
      if ((☃ & 0xFFFFFF80) == 0)
      {
        writeByte(☃);
        return;
      }
      writeByte(☃ & 0x7F | 0x80);
      ☃ >>>= 7;
    }
  }
  
  public void b(long ☃)
  {
    for (;;)
    {
      if ((☃ & 0xFFFFFFFFFFFFFF80) == 0L)
      {
        writeByte((int)☃);
        return;
      }
      writeByte((int)(☃ & 0x7F) | 0x80);
      ☃ >>>= 7;
    }
  }
  
  public void a(dn ☃)
  {
    if (☃ == null) {
      writeByte(0);
    } else {
      try
      {
        dx.a(☃, new ByteBufOutputStream(this));
      }
      catch (IOException ☃)
      {
        throw new EncoderException(☃);
      }
    }
  }
  
  public dn h()
    throws IOException
  {
    int ☃ = readerIndex();
    byte ☃ = readByte();
    if (☃ == 0) {
      return null;
    }
    readerIndex(☃);
    return dx.a(new ByteBufInputStream(this), new dw(2097152L));
  }
  
  public void a(zx ☃)
  {
    if (☃ == null)
    {
      writeShort(-1);
    }
    else
    {
      writeShort(zw.b(☃.b()));
      writeByte(b);
      writeShort(☃.i());
      
      dn ☃ = null;
      if ((☃.b().m()) || (☃.b().p())) {
        ☃ = ☃.o();
      }
      a(☃);
    }
  }
  
  public zx i()
    throws IOException
  {
    zx ☃ = null;
    int ☃ = readShort();
    if (☃ >= 0)
    {
      int ☃ = readByte();
      int ☃ = readShort();
      
      ☃ = new zx(zw.b(☃), ☃, ☃);
      ☃.d(h());
    }
    return ☃;
  }
  
  public String c(int ☃)
  {
    int ☃ = e();
    if (☃ > ☃ * 4) {
      throw new DecoderException("The received encoded string buffer length is longer than maximum allowed (" + ☃ + " > " + ☃ * 4 + ")");
    }
    if (☃ < 0) {
      throw new DecoderException("The received encoded string buffer length is less than zero! Weird string!");
    }
    String ☃ = new String(readBytes(☃).array(), Charsets.UTF_8);
    if (☃.length() > ☃) {
      throw new DecoderException("The received string length is longer than maximum allowed (" + ☃ + " > " + ☃ + ")");
    }
    return ☃;
  }
  
  public em a(String ☃)
  {
    byte[] ☃ = ☃.getBytes(Charsets.UTF_8);
    if (☃.length > 32767) {
      throw new EncoderException("String too big (was " + ☃.length() + " bytes encoded, max " + 32767 + ")");
    }
    b(☃.length);
    writeBytes(☃);
    return this;
  }
  
  public int capacity()
  {
    return a.capacity();
  }
  
  public ByteBuf capacity(int ☃)
  {
    return a.capacity(☃);
  }
  
  public int maxCapacity()
  {
    return a.maxCapacity();
  }
  
  public ByteBufAllocator alloc()
  {
    return a.alloc();
  }
  
  public ByteOrder order()
  {
    return a.order();
  }
  
  public ByteBuf order(ByteOrder ☃)
  {
    return a.order(☃);
  }
  
  public ByteBuf unwrap()
  {
    return a.unwrap();
  }
  
  public boolean isDirect()
  {
    return a.isDirect();
  }
  
  public int readerIndex()
  {
    return a.readerIndex();
  }
  
  public ByteBuf readerIndex(int ☃)
  {
    return a.readerIndex(☃);
  }
  
  public int writerIndex()
  {
    return a.writerIndex();
  }
  
  public ByteBuf writerIndex(int ☃)
  {
    return a.writerIndex(☃);
  }
  
  public ByteBuf setIndex(int ☃, int ☃)
  {
    return a.setIndex(☃, ☃);
  }
  
  public int readableBytes()
  {
    return a.readableBytes();
  }
  
  public int writableBytes()
  {
    return a.writableBytes();
  }
  
  public int maxWritableBytes()
  {
    return a.maxWritableBytes();
  }
  
  public boolean isReadable()
  {
    return a.isReadable();
  }
  
  public boolean isReadable(int ☃)
  {
    return a.isReadable(☃);
  }
  
  public boolean isWritable()
  {
    return a.isWritable();
  }
  
  public boolean isWritable(int ☃)
  {
    return a.isWritable(☃);
  }
  
  public ByteBuf clear()
  {
    return a.clear();
  }
  
  public ByteBuf markReaderIndex()
  {
    return a.markReaderIndex();
  }
  
  public ByteBuf resetReaderIndex()
  {
    return a.resetReaderIndex();
  }
  
  public ByteBuf markWriterIndex()
  {
    return a.markWriterIndex();
  }
  
  public ByteBuf resetWriterIndex()
  {
    return a.resetWriterIndex();
  }
  
  public ByteBuf discardReadBytes()
  {
    return a.discardReadBytes();
  }
  
  public ByteBuf discardSomeReadBytes()
  {
    return a.discardSomeReadBytes();
  }
  
  public ByteBuf ensureWritable(int ☃)
  {
    return a.ensureWritable(☃);
  }
  
  public int ensureWritable(int ☃, boolean ☃)
  {
    return a.ensureWritable(☃, ☃);
  }
  
  public boolean getBoolean(int ☃)
  {
    return a.getBoolean(☃);
  }
  
  public byte getByte(int ☃)
  {
    return a.getByte(☃);
  }
  
  public short getUnsignedByte(int ☃)
  {
    return a.getUnsignedByte(☃);
  }
  
  public short getShort(int ☃)
  {
    return a.getShort(☃);
  }
  
  public int getUnsignedShort(int ☃)
  {
    return a.getUnsignedShort(☃);
  }
  
  public int getMedium(int ☃)
  {
    return a.getMedium(☃);
  }
  
  public int getUnsignedMedium(int ☃)
  {
    return a.getUnsignedMedium(☃);
  }
  
  public int getInt(int ☃)
  {
    return a.getInt(☃);
  }
  
  public long getUnsignedInt(int ☃)
  {
    return a.getUnsignedInt(☃);
  }
  
  public long getLong(int ☃)
  {
    return a.getLong(☃);
  }
  
  public char getChar(int ☃)
  {
    return a.getChar(☃);
  }
  
  public float getFloat(int ☃)
  {
    return a.getFloat(☃);
  }
  
  public double getDouble(int ☃)
  {
    return a.getDouble(☃);
  }
  
  public ByteBuf getBytes(int ☃, ByteBuf ☃)
  {
    return a.getBytes(☃, ☃);
  }
  
  public ByteBuf getBytes(int ☃, ByteBuf ☃, int ☃)
  {
    return a.getBytes(☃, ☃, ☃);
  }
  
  public ByteBuf getBytes(int ☃, ByteBuf ☃, int ☃, int ☃)
  {
    return a.getBytes(☃, ☃, ☃, ☃);
  }
  
  public ByteBuf getBytes(int ☃, byte[] ☃)
  {
    return a.getBytes(☃, ☃);
  }
  
  public ByteBuf getBytes(int ☃, byte[] ☃, int ☃, int ☃)
  {
    return a.getBytes(☃, ☃, ☃, ☃);
  }
  
  public ByteBuf getBytes(int ☃, ByteBuffer ☃)
  {
    return a.getBytes(☃, ☃);
  }
  
  public ByteBuf getBytes(int ☃, OutputStream ☃, int ☃)
    throws IOException
  {
    return a.getBytes(☃, ☃, ☃);
  }
  
  public int getBytes(int ☃, GatheringByteChannel ☃, int ☃)
    throws IOException
  {
    return a.getBytes(☃, ☃, ☃);
  }
  
  public ByteBuf setBoolean(int ☃, boolean ☃)
  {
    return a.setBoolean(☃, ☃);
  }
  
  public ByteBuf setByte(int ☃, int ☃)
  {
    return a.setByte(☃, ☃);
  }
  
  public ByteBuf setShort(int ☃, int ☃)
  {
    return a.setShort(☃, ☃);
  }
  
  public ByteBuf setMedium(int ☃, int ☃)
  {
    return a.setMedium(☃, ☃);
  }
  
  public ByteBuf setInt(int ☃, int ☃)
  {
    return a.setInt(☃, ☃);
  }
  
  public ByteBuf setLong(int ☃, long ☃)
  {
    return a.setLong(☃, ☃);
  }
  
  public ByteBuf setChar(int ☃, int ☃)
  {
    return a.setChar(☃, ☃);
  }
  
  public ByteBuf setFloat(int ☃, float ☃)
  {
    return a.setFloat(☃, ☃);
  }
  
  public ByteBuf setDouble(int ☃, double ☃)
  {
    return a.setDouble(☃, ☃);
  }
  
  public ByteBuf setBytes(int ☃, ByteBuf ☃)
  {
    return a.setBytes(☃, ☃);
  }
  
  public ByteBuf setBytes(int ☃, ByteBuf ☃, int ☃)
  {
    return a.setBytes(☃, ☃, ☃);
  }
  
  public ByteBuf setBytes(int ☃, ByteBuf ☃, int ☃, int ☃)
  {
    return a.setBytes(☃, ☃, ☃, ☃);
  }
  
  public ByteBuf setBytes(int ☃, byte[] ☃)
  {
    return a.setBytes(☃, ☃);
  }
  
  public ByteBuf setBytes(int ☃, byte[] ☃, int ☃, int ☃)
  {
    return a.setBytes(☃, ☃, ☃, ☃);
  }
  
  public ByteBuf setBytes(int ☃, ByteBuffer ☃)
  {
    return a.setBytes(☃, ☃);
  }
  
  public int setBytes(int ☃, InputStream ☃, int ☃)
    throws IOException
  {
    return a.setBytes(☃, ☃, ☃);
  }
  
  public int setBytes(int ☃, ScatteringByteChannel ☃, int ☃)
    throws IOException
  {
    return a.setBytes(☃, ☃, ☃);
  }
  
  public ByteBuf setZero(int ☃, int ☃)
  {
    return a.setZero(☃, ☃);
  }
  
  public boolean readBoolean()
  {
    return a.readBoolean();
  }
  
  public byte readByte()
  {
    return a.readByte();
  }
  
  public short readUnsignedByte()
  {
    return a.readUnsignedByte();
  }
  
  public short readShort()
  {
    return a.readShort();
  }
  
  public int readUnsignedShort()
  {
    return a.readUnsignedShort();
  }
  
  public int readMedium()
  {
    return a.readMedium();
  }
  
  public int readUnsignedMedium()
  {
    return a.readUnsignedMedium();
  }
  
  public int readInt()
  {
    return a.readInt();
  }
  
  public long readUnsignedInt()
  {
    return a.readUnsignedInt();
  }
  
  public long readLong()
  {
    return a.readLong();
  }
  
  public char readChar()
  {
    return a.readChar();
  }
  
  public float readFloat()
  {
    return a.readFloat();
  }
  
  public double readDouble()
  {
    return a.readDouble();
  }
  
  public ByteBuf readBytes(int ☃)
  {
    return a.readBytes(☃);
  }
  
  public ByteBuf readSlice(int ☃)
  {
    return a.readSlice(☃);
  }
  
  public ByteBuf readBytes(ByteBuf ☃)
  {
    return a.readBytes(☃);
  }
  
  public ByteBuf readBytes(ByteBuf ☃, int ☃)
  {
    return a.readBytes(☃, ☃);
  }
  
  public ByteBuf readBytes(ByteBuf ☃, int ☃, int ☃)
  {
    return a.readBytes(☃, ☃, ☃);
  }
  
  public ByteBuf readBytes(byte[] ☃)
  {
    return a.readBytes(☃);
  }
  
  public ByteBuf readBytes(byte[] ☃, int ☃, int ☃)
  {
    return a.readBytes(☃, ☃, ☃);
  }
  
  public ByteBuf readBytes(ByteBuffer ☃)
  {
    return a.readBytes(☃);
  }
  
  public ByteBuf readBytes(OutputStream ☃, int ☃)
    throws IOException
  {
    return a.readBytes(☃, ☃);
  }
  
  public int readBytes(GatheringByteChannel ☃, int ☃)
    throws IOException
  {
    return a.readBytes(☃, ☃);
  }
  
  public ByteBuf skipBytes(int ☃)
  {
    return a.skipBytes(☃);
  }
  
  public ByteBuf writeBoolean(boolean ☃)
  {
    return a.writeBoolean(☃);
  }
  
  public ByteBuf writeByte(int ☃)
  {
    return a.writeByte(☃);
  }
  
  public ByteBuf writeShort(int ☃)
  {
    return a.writeShort(☃);
  }
  
  public ByteBuf writeMedium(int ☃)
  {
    return a.writeMedium(☃);
  }
  
  public ByteBuf writeInt(int ☃)
  {
    return a.writeInt(☃);
  }
  
  public ByteBuf writeLong(long ☃)
  {
    return a.writeLong(☃);
  }
  
  public ByteBuf writeChar(int ☃)
  {
    return a.writeChar(☃);
  }
  
  public ByteBuf writeFloat(float ☃)
  {
    return a.writeFloat(☃);
  }
  
  public ByteBuf writeDouble(double ☃)
  {
    return a.writeDouble(☃);
  }
  
  public ByteBuf writeBytes(ByteBuf ☃)
  {
    return a.writeBytes(☃);
  }
  
  public ByteBuf writeBytes(ByteBuf ☃, int ☃)
  {
    return a.writeBytes(☃, ☃);
  }
  
  public ByteBuf writeBytes(ByteBuf ☃, int ☃, int ☃)
  {
    return a.writeBytes(☃, ☃, ☃);
  }
  
  public ByteBuf writeBytes(byte[] ☃)
  {
    return a.writeBytes(☃);
  }
  
  public ByteBuf writeBytes(byte[] ☃, int ☃, int ☃)
  {
    return a.writeBytes(☃, ☃, ☃);
  }
  
  public ByteBuf writeBytes(ByteBuffer ☃)
  {
    return a.writeBytes(☃);
  }
  
  public int writeBytes(InputStream ☃, int ☃)
    throws IOException
  {
    return a.writeBytes(☃, ☃);
  }
  
  public int writeBytes(ScatteringByteChannel ☃, int ☃)
    throws IOException
  {
    return a.writeBytes(☃, ☃);
  }
  
  public ByteBuf writeZero(int ☃)
  {
    return a.writeZero(☃);
  }
  
  public int indexOf(int ☃, int ☃, byte ☃)
  {
    return a.indexOf(☃, ☃, ☃);
  }
  
  public int bytesBefore(byte ☃)
  {
    return a.bytesBefore(☃);
  }
  
  public int bytesBefore(int ☃, byte ☃)
  {
    return a.bytesBefore(☃, ☃);
  }
  
  public int bytesBefore(int ☃, int ☃, byte ☃)
  {
    return a.bytesBefore(☃, ☃, ☃);
  }
  
  public int forEachByte(ByteBufProcessor ☃)
  {
    return a.forEachByte(☃);
  }
  
  public int forEachByte(int ☃, int ☃, ByteBufProcessor ☃)
  {
    return a.forEachByte(☃, ☃, ☃);
  }
  
  public int forEachByteDesc(ByteBufProcessor ☃)
  {
    return a.forEachByteDesc(☃);
  }
  
  public int forEachByteDesc(int ☃, int ☃, ByteBufProcessor ☃)
  {
    return a.forEachByteDesc(☃, ☃, ☃);
  }
  
  public ByteBuf copy()
  {
    return a.copy();
  }
  
  public ByteBuf copy(int ☃, int ☃)
  {
    return a.copy(☃, ☃);
  }
  
  public ByteBuf slice()
  {
    return a.slice();
  }
  
  public ByteBuf slice(int ☃, int ☃)
  {
    return a.slice(☃, ☃);
  }
  
  public ByteBuf duplicate()
  {
    return a.duplicate();
  }
  
  public int nioBufferCount()
  {
    return a.nioBufferCount();
  }
  
  public ByteBuffer nioBuffer()
  {
    return a.nioBuffer();
  }
  
  public ByteBuffer nioBuffer(int ☃, int ☃)
  {
    return a.nioBuffer(☃, ☃);
  }
  
  public ByteBuffer internalNioBuffer(int ☃, int ☃)
  {
    return a.internalNioBuffer(☃, ☃);
  }
  
  public ByteBuffer[] nioBuffers()
  {
    return a.nioBuffers();
  }
  
  public ByteBuffer[] nioBuffers(int ☃, int ☃)
  {
    return a.nioBuffers(☃, ☃);
  }
  
  public boolean hasArray()
  {
    return a.hasArray();
  }
  
  public byte[] array()
  {
    return a.array();
  }
  
  public int arrayOffset()
  {
    return a.arrayOffset();
  }
  
  public boolean hasMemoryAddress()
  {
    return a.hasMemoryAddress();
  }
  
  public long memoryAddress()
  {
    return a.memoryAddress();
  }
  
  public String toString(Charset ☃)
  {
    return a.toString(☃);
  }
  
  public String toString(int ☃, int ☃, Charset ☃)
  {
    return a.toString(☃, ☃, ☃);
  }
  
  public int hashCode()
  {
    return a.hashCode();
  }
  
  public boolean equals(Object ☃)
  {
    return a.equals(☃);
  }
  
  public int compareTo(ByteBuf ☃)
  {
    return a.compareTo(☃);
  }
  
  public String toString()
  {
    return a.toString();
  }
  
  public ByteBuf retain(int ☃)
  {
    return a.retain(☃);
  }
  
  public ByteBuf retain()
  {
    return a.retain();
  }
  
  public int refCnt()
  {
    return a.refCnt();
  }
  
  public boolean release()
  {
    return a.release();
  }
  
  public boolean release(int ☃)
  {
    return a.release(☃);
  }
}
