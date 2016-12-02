package de.labystudio.packets;

import com.google.common.base.Charsets;
import de.labystudio.chat.LabyModPlayer;
import de.labystudio.chat.LabyModPlayer.OnlineStatus;
import de.labystudio.chat.LabyModPlayerRequester;
import de.labystudio.chat.ServerInfo;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.ByteBufAllocator;
import io.netty.buffer.ByteBufProcessor;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.GatheringByteChannel;
import java.nio.channels.ScatteringByteChannel;
import java.nio.charset.Charset;
import java.util.UUID;

public class PacketBuf
  extends ByteBuf
{
  private ByteBuf buf;
  
  public PacketBuf(ByteBuf buf)
  {
    this.buf = buf;
  }
  
  public ServerInfo readServerInfo()
  {
    String serverIp = readString();
    int serverPort = readInt();
    if (readBoolean()) {
      return new ServerInfo(serverIp, serverPort, readString());
    }
    return new ServerInfo(serverIp, serverPort);
  }
  
  public void writeByteArray(byte[] data)
  {
    writeInt(data.length);
    writeBytes(data);
  }
  
  public byte[] readByteArray()
  {
    byte[] b = new byte[readInt()];
    for (int i = 0; i < b.length; i++) {
      b[i] = readByte();
    }
    return b;
  }
  
  public PacketBuf writeServerInfo(ServerInfo info)
  {
    writeString(info.getServerIp());
    writeInt(info.getServerPort());
    if (info.getSpecifiedServerName() != null)
    {
      writeBoolean(true);
      writeString(info.getSpecifiedServerName());
    }
    else
    {
      writeBoolean(false);
    }
    return this;
  }
  
  public PacketBuf writeOnlineStatus(LabyModPlayer.OnlineStatus status)
  {
    writeByte(status.getPacketId());
    return this;
  }
  
  public LabyModPlayer.OnlineStatus readOnlineStatus()
  {
    return LabyModPlayer.OnlineStatus.fromPacketId(readByte());
  }
  
  public LabyModPlayer readPlayer()
  {
    String name = readString();
    UUID uuid = readUUID();
    String motd = readString();
    LabyModPlayer.OnlineStatus status = readOnlineStatus();
    boolean request = readBoolean();
    String timeZone = readString();
    int contactsAmound = readInt();
    long lastOnline = readLong();
    long firstJoined = readLong();
    ServerInfo serverInfo = readServerInfo();
    if (request) {
      return new LabyModPlayerRequester(name, uuid);
    }
    LabyModPlayer a = new LabyModPlayer(name, uuid, motd, status, timeZone, lastOnline, firstJoined, contactsAmound);
    a.updateServer(serverInfo);
    return a;
  }
  
  public void writeEnum(Enum<?> enume)
  {
    writeInt(enume.ordinal());
  }
  
  public void writePlayer(LabyModPlayer player)
  {
    writeString(player.getName());
    writeUUID(player.getId());
    writeString(player.getMotd());
    writeOnlineStatus(player.getStatus());
    writeBoolean(player.isRequest());
    writeString(player.getTimeZone());
    writeInt(player.getContactsAmount());
    writeLong(player.getLastOnline());
    writeLong(player.getJoinedFirst());
    writeServerInfo(player.getServerInfo());
  }
  
  public void writeUUID(UUID uuid)
  {
    writeString(uuid.toString());
  }
  
  public UUID readUUID()
  {
    return UUID.fromString(readString());
  }
  
  public void writeString(String string)
  {
    writeInt(string.getBytes(Charsets.UTF_8).length);
    writeBytes(string.getBytes(Charsets.UTF_8));
  }
  
  public String readString()
  {
    byte[] a = new byte[readInt()];
    for (int i = 0; i < a.length; i++) {
      a[i] = readByte();
    }
    return new String(a, Charsets.UTF_8);
  }
  
  public int refCnt()
  {
    return buf.refCnt();
  }
  
  public boolean release()
  {
    return buf.release();
  }
  
  public boolean release(int arg0)
  {
    return buf.release(arg0);
  }
  
  public ByteBufAllocator alloc()
  {
    return buf.alloc();
  }
  
  public byte[] array()
  {
    return buf.array();
  }
  
  public int arrayOffset()
  {
    return buf.arrayOffset();
  }
  
  public int bytesBefore(byte arg0)
  {
    return buf.bytesBefore(arg0);
  }
  
  public int bytesBefore(int arg0, byte arg1)
  {
    return buf.bytesBefore(arg0, arg1);
  }
  
  public int bytesBefore(int arg0, int arg1, byte arg2)
  {
    return buf.bytesBefore(arg0, arg1, arg2);
  }
  
  public int capacity()
  {
    return buf.capacity();
  }
  
  public ByteBuf capacity(int arg0)
  {
    return buf.capacity(arg0);
  }
  
  public ByteBuf clear()
  {
    return buf.clear();
  }
  
  public int compareTo(ByteBuf arg0)
  {
    return buf.compareTo(arg0);
  }
  
  public ByteBuf copy()
  {
    return buf.copy();
  }
  
  public ByteBuf copy(int arg0, int arg1)
  {
    return buf.copy(arg0, arg1);
  }
  
  public ByteBuf discardReadBytes()
  {
    return buf.discardReadBytes();
  }
  
  public ByteBuf discardSomeReadBytes()
  {
    return buf.discardSomeReadBytes();
  }
  
  public ByteBuf duplicate()
  {
    return buf.duplicate();
  }
  
  public ByteBuf ensureWritable(int arg0)
  {
    return buf.ensureWritable(arg0);
  }
  
  public int ensureWritable(int arg0, boolean arg1)
  {
    return buf.ensureWritable(arg0, arg1);
  }
  
  public boolean equals(Object arg0)
  {
    return buf.equals(arg0);
  }
  
  public int forEachByte(ByteBufProcessor arg0)
  {
    return buf.forEachByte(arg0);
  }
  
  public int forEachByte(int arg0, int arg1, ByteBufProcessor arg2)
  {
    return buf.forEachByte(arg0, arg1, arg2);
  }
  
  public int forEachByteDesc(ByteBufProcessor arg0)
  {
    return buf.forEachByteDesc(arg0);
  }
  
  public int forEachByteDesc(int arg0, int arg1, ByteBufProcessor arg2)
  {
    return buf.forEachByteDesc(arg0, arg1, arg2);
  }
  
  public boolean getBoolean(int arg0)
  {
    return buf.getBoolean(arg0);
  }
  
  public byte getByte(int arg0)
  {
    return buf.getByte(arg0);
  }
  
  public ByteBuf getBytes(int arg0, ByteBuf arg1)
  {
    return buf.getBytes(arg0, arg1);
  }
  
  public ByteBuf getBytes(int arg0, byte[] arg1)
  {
    return buf.getBytes(arg0, arg1);
  }
  
  public ByteBuf getBytes(int arg0, ByteBuffer arg1)
  {
    return buf.getBytes(arg0, arg1);
  }
  
  public ByteBuf getBytes(int arg0, ByteBuf arg1, int arg2)
  {
    return buf.getBytes(arg0, arg1, arg2);
  }
  
  public ByteBuf getBytes(int arg0, OutputStream arg1, int arg2)
    throws IOException
  {
    return buf.getBytes(arg0, arg1, arg2);
  }
  
  public int getBytes(int arg0, GatheringByteChannel arg1, int arg2)
    throws IOException
  {
    return buf.getBytes(arg0, arg1, arg2);
  }
  
  public ByteBuf getBytes(int arg0, ByteBuf arg1, int arg2, int arg3)
  {
    return buf.getBytes(arg0, arg1, arg2, arg3);
  }
  
  public ByteBuf getBytes(int arg0, byte[] arg1, int arg2, int arg3)
  {
    return buf.getBytes(arg0, arg1, arg2, arg3);
  }
  
  public char getChar(int arg0)
  {
    return buf.getChar(arg0);
  }
  
  public double getDouble(int arg0)
  {
    return buf.getDouble(arg0);
  }
  
  public float getFloat(int arg0)
  {
    return buf.getFloat(arg0);
  }
  
  public int getInt(int arg0)
  {
    return buf.getInt(arg0);
  }
  
  public long getLong(int arg0)
  {
    return buf.getLong(arg0);
  }
  
  public int getMedium(int arg0)
  {
    return buf.getMedium(arg0);
  }
  
  public short getShort(int arg0)
  {
    return buf.getShort(arg0);
  }
  
  public short getUnsignedByte(int arg0)
  {
    return buf.getUnsignedByte(arg0);
  }
  
  public long getUnsignedInt(int arg0)
  {
    return buf.getUnsignedInt(arg0);
  }
  
  public int getUnsignedMedium(int arg0)
  {
    return buf.getUnsignedMedium(arg0);
  }
  
  public int getUnsignedShort(int arg0)
  {
    return buf.getUnsignedShort(arg0);
  }
  
  public boolean hasArray()
  {
    return buf.hasArray();
  }
  
  public boolean hasMemoryAddress()
  {
    return buf.hasMemoryAddress();
  }
  
  public int hashCode()
  {
    return buf.hashCode();
  }
  
  public int indexOf(int arg0, int arg1, byte arg2)
  {
    return buf.indexOf(arg0, arg1, arg2);
  }
  
  public ByteBuffer internalNioBuffer(int arg0, int arg1)
  {
    return buf.internalNioBuffer(arg0, arg1);
  }
  
  public boolean isDirect()
  {
    return buf.isDirect();
  }
  
  public boolean isReadable()
  {
    return buf.isReadable();
  }
  
  public boolean isReadable(int arg0)
  {
    return buf.isReadable(arg0);
  }
  
  public boolean isWritable()
  {
    return buf.isWritable();
  }
  
  public boolean isWritable(int arg0)
  {
    return buf.isWritable(arg0);
  }
  
  public ByteBuf markReaderIndex()
  {
    return buf.markReaderIndex();
  }
  
  public ByteBuf markWriterIndex()
  {
    return buf.markWriterIndex();
  }
  
  public int maxCapacity()
  {
    return buf.maxCapacity();
  }
  
  public int maxWritableBytes()
  {
    return buf.maxWritableBytes();
  }
  
  public long memoryAddress()
  {
    return buf.memoryAddress();
  }
  
  public ByteBuffer nioBuffer()
  {
    return buf.nioBuffer();
  }
  
  public ByteBuffer nioBuffer(int arg0, int arg1)
  {
    return buf.nioBuffer(arg0, arg1);
  }
  
  public int nioBufferCount()
  {
    return buf.nioBufferCount();
  }
  
  public ByteBuffer[] nioBuffers()
  {
    return buf.nioBuffers();
  }
  
  public ByteBuffer[] nioBuffers(int arg0, int arg1)
  {
    return buf.nioBuffers(arg0, arg1);
  }
  
  public ByteOrder order()
  {
    return buf.order();
  }
  
  public ByteBuf order(ByteOrder arg0)
  {
    return buf.order(arg0);
  }
  
  public boolean readBoolean()
  {
    return buf.readBoolean();
  }
  
  public byte readByte()
  {
    return buf.readByte();
  }
  
  public ByteBuf readBytes(int arg0)
  {
    return buf.readBytes(arg0);
  }
  
  public ByteBuf readBytes(ByteBuf arg0)
  {
    return buf.readBytes(arg0);
  }
  
  public ByteBuf readBytes(byte[] arg0)
  {
    return buf.readBytes(arg0);
  }
  
  public ByteBuf readBytes(ByteBuffer arg0)
  {
    return buf.readBytes(arg0);
  }
  
  public ByteBuf readBytes(ByteBuf arg0, int arg1)
  {
    return buf.readBytes(arg0, arg1);
  }
  
  public ByteBuf readBytes(OutputStream arg0, int arg1)
    throws IOException
  {
    return buf.readBytes(arg0, arg1);
  }
  
  public int readBytes(GatheringByteChannel arg0, int arg1)
    throws IOException
  {
    return buf.readBytes(arg0, arg1);
  }
  
  public ByteBuf readBytes(ByteBuf arg0, int arg1, int arg2)
  {
    return buf.readBytes(arg0, arg1, arg2);
  }
  
  public ByteBuf readBytes(byte[] arg0, int arg1, int arg2)
  {
    return buf.readBytes(arg0, arg1, arg2);
  }
  
  public char readChar()
  {
    return buf.readChar();
  }
  
  public double readDouble()
  {
    return buf.readDouble();
  }
  
  public float readFloat()
  {
    return buf.readFloat();
  }
  
  public int readInt()
  {
    return buf.readInt();
  }
  
  public long readLong()
  {
    return buf.readLong();
  }
  
  public int readMedium()
  {
    return buf.readMedium();
  }
  
  public short readShort()
  {
    return buf.readShort();
  }
  
  public ByteBuf readSlice(int arg0)
  {
    return buf.readSlice(arg0);
  }
  
  public short readUnsignedByte()
  {
    return buf.readUnsignedByte();
  }
  
  public long readUnsignedInt()
  {
    return buf.readUnsignedInt();
  }
  
  public int readUnsignedMedium()
  {
    return buf.readUnsignedMedium();
  }
  
  public int readUnsignedShort()
  {
    return buf.readUnsignedShort();
  }
  
  public int readableBytes()
  {
    return buf.readableBytes();
  }
  
  public int readerIndex()
  {
    return buf.readerIndex();
  }
  
  public ByteBuf readerIndex(int arg0)
  {
    return buf.readerIndex(arg0);
  }
  
  public ByteBuf resetReaderIndex()
  {
    return buf.resetReaderIndex();
  }
  
  public ByteBuf resetWriterIndex()
  {
    return buf.resetWriterIndex();
  }
  
  public ByteBuf retain()
  {
    return buf.retain();
  }
  
  public ByteBuf retain(int arg0)
  {
    return buf.retain(arg0);
  }
  
  public ByteBuf setBoolean(int arg0, boolean arg1)
  {
    return buf.setBoolean(arg0, arg1);
  }
  
  public ByteBuf setByte(int arg0, int arg1)
  {
    return buf.setByte(arg0, arg1);
  }
  
  public ByteBuf setBytes(int arg0, ByteBuf arg1)
  {
    return buf.setBytes(arg0, arg1);
  }
  
  public ByteBuf setBytes(int arg0, byte[] arg1)
  {
    return buf.setBytes(arg0, arg1);
  }
  
  public ByteBuf setBytes(int arg0, ByteBuffer arg1)
  {
    return buf.setBytes(arg0, arg1);
  }
  
  public ByteBuf setBytes(int arg0, ByteBuf arg1, int arg2)
  {
    return buf.setBytes(arg0, arg1, arg2);
  }
  
  public int setBytes(int arg0, InputStream arg1, int arg2)
    throws IOException
  {
    return buf.setBytes(arg0, arg1, arg2);
  }
  
  public int setBytes(int arg0, ScatteringByteChannel arg1, int arg2)
    throws IOException
  {
    return buf.setBytes(arg0, arg1, arg2);
  }
  
  public ByteBuf setBytes(int arg0, ByteBuf arg1, int arg2, int arg3)
  {
    return buf.setBytes(arg0, arg1, arg2, arg3);
  }
  
  public ByteBuf setBytes(int arg0, byte[] arg1, int arg2, int arg3)
  {
    return buf.setBytes(arg0, arg1, arg2, arg3);
  }
  
  public ByteBuf setChar(int arg0, int arg1)
  {
    return buf.setChar(arg0, arg1);
  }
  
  public ByteBuf setDouble(int arg0, double arg1)
  {
    return buf.setDouble(arg0, arg1);
  }
  
  public ByteBuf setFloat(int arg0, float arg1)
  {
    return buf.setFloat(arg0, arg1);
  }
  
  public ByteBuf setIndex(int arg0, int arg1)
  {
    return buf.setIndex(arg0, arg1);
  }
  
  public ByteBuf setInt(int arg0, int arg1)
  {
    return buf.setInt(arg0, arg1);
  }
  
  public ByteBuf setLong(int arg0, long arg1)
  {
    return buf.setLong(arg0, arg1);
  }
  
  public ByteBuf setMedium(int arg0, int arg1)
  {
    return buf.setMedium(arg0, arg1);
  }
  
  public ByteBuf setShort(int arg0, int arg1)
  {
    return buf.setShort(arg0, arg1);
  }
  
  public ByteBuf setZero(int arg0, int arg1)
  {
    return buf.setZero(arg0, arg1);
  }
  
  public ByteBuf skipBytes(int arg0)
  {
    return buf.skipBytes(arg0);
  }
  
  public ByteBuf slice()
  {
    return buf.slice();
  }
  
  public ByteBuf slice(int arg0, int arg1)
  {
    return buf.slice(arg0, arg1);
  }
  
  public String toString()
  {
    return buf.toString();
  }
  
  public String toString(Charset arg0)
  {
    return buf.toString(arg0);
  }
  
  public String toString(int arg0, int arg1, Charset arg2)
  {
    return buf.toString(arg0, arg1, arg2);
  }
  
  public ByteBuf unwrap()
  {
    return buf.unwrap();
  }
  
  public int writableBytes()
  {
    return buf.writableBytes();
  }
  
  public ByteBuf writeBoolean(boolean arg0)
  {
    return buf.writeBoolean(arg0);
  }
  
  public ByteBuf writeByte(int arg0)
  {
    return buf.writeByte(arg0);
  }
  
  public ByteBuf writeBytes(ByteBuf arg0)
  {
    return buf.writeBytes(arg0);
  }
  
  public ByteBuf writeBytes(byte[] arg0)
  {
    return buf.writeBytes(arg0);
  }
  
  public ByteBuf writeBytes(ByteBuffer arg0)
  {
    return buf.writeBytes(arg0);
  }
  
  public ByteBuf writeBytes(ByteBuf arg0, int arg1)
  {
    return buf.writeBytes(arg0, arg1);
  }
  
  public int writeBytes(InputStream arg0, int arg1)
    throws IOException
  {
    return buf.writeBytes(arg0, arg1);
  }
  
  public int writeBytes(ScatteringByteChannel arg0, int arg1)
    throws IOException
  {
    return buf.writeBytes(arg0, arg1);
  }
  
  public ByteBuf writeBytes(ByteBuf arg0, int arg1, int arg2)
  {
    return buf.writeBytes(arg0, arg1, arg2);
  }
  
  public ByteBuf writeBytes(byte[] arg0, int arg1, int arg2)
  {
    return buf.writeBytes(arg0, arg1, arg2);
  }
  
  public ByteBuf writeChar(int arg0)
  {
    return buf.writeChar(arg0);
  }
  
  public ByteBuf writeDouble(double arg0)
  {
    return buf.writeDouble(arg0);
  }
  
  public ByteBuf writeFloat(float arg0)
  {
    return buf.writeFloat(arg0);
  }
  
  public ByteBuf writeInt(int arg0)
  {
    return buf.writeInt(arg0);
  }
  
  public ByteBuf writeLong(long arg0)
  {
    return buf.writeLong(arg0);
  }
  
  public ByteBuf writeMedium(int arg0)
  {
    return buf.writeMedium(arg0);
  }
  
  public ByteBuf writeShort(int arg0)
  {
    return buf.writeShort(arg0);
  }
  
  public ByteBuf writeZero(int arg0)
  {
    return buf.writeZero(arg0);
  }
  
  public int writerIndex()
  {
    return buf.writerIndex();
  }
  
  public ByteBuf writerIndex(int arg0)
  {
    return buf.writerIndex(arg0);
  }
  
  public static int getVarIntSize(int input)
  {
    for (int var1 = 1; var1 < 5; var1++) {
      if ((input & -1 << var1 * 7) == 0) {
        return var1;
      }
    }
    return 5;
  }
  
  public int readVarIntFromBuffer()
  {
    int var1 = 0;
    int var2 = 0;
    byte var3;
    do
    {
      var3 = readByte();
      var1 |= (var3 & 0x7F) << var2++ * 7;
      if (var2 > 5) {
        throw new RuntimeException("VarInt too big");
      }
    } while ((var3 & 0x80) == 128);
    return var1;
  }
  
  public void writeVarIntToBuffer(int input)
  {
    while ((input & 0xFFFFFF80) != 0)
    {
      writeByte(input & 0x7F | 0x80);
      input >>>= 7;
    }
    writeByte(input);
  }
}
