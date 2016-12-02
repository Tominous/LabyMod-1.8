package de.labystudio.packets;

import de.labystudio.chat.LabyModPlayer;
import de.labystudio.handling.PacketHandler;

public class PacketMessage
  extends Packet
{
  private LabyModPlayer sender;
  private LabyModPlayer to;
  private String message;
  private long sentTime;
  private long fileSize;
  private double audioTime;
  
  public PacketMessage(LabyModPlayer sender, LabyModPlayer to, String message, long fileSize, double time, long sentTime)
  {
    this.sender = sender;
    this.to = to;
    this.message = message;
    this.fileSize = fileSize;
    audioTime = time;
    this.sentTime = sentTime;
  }
  
  public PacketMessage() {}
  
  public void read(PacketBuf buf)
  {
    sender = buf.readPlayer();
    to = buf.readPlayer();
    message = buf.readString();
    fileSize = buf.readLong();
    audioTime = buf.readDouble();
    sentTime = buf.readLong();
  }
  
  public void write(PacketBuf buf)
  {
    buf.writePlayer(sender);
    buf.writePlayer(to);
    buf.writeString(message);
    buf.writeLong(fileSize);
    buf.writeDouble(audioTime);
    buf.writeLong(sentTime);
  }
  
  public void handle(PacketHandler packetHandler)
  {
    packetHandler.handle(this);
  }
  
  public double getAudioTime()
  {
    return audioTime;
  }
  
  public long getFileSize()
  {
    return fileSize;
  }
  
  public String getMessage()
  {
    return message;
  }
  
  public LabyModPlayer getSender()
  {
    return sender;
  }
  
  public LabyModPlayer getTo()
  {
    return to;
  }
  
  public long getSentTime()
  {
    return sentTime;
  }
}
