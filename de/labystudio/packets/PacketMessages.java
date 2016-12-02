package de.labystudio.packets;

import axu;
import de.labystudio.handling.PacketHandler;
import gg;
import java.io.IOException;

public class PacketMessages
  extends Packet
{
  private String message;
  private long time;
  
  public PacketMessages(String a, long b)
  {
    this.message = a;
    this.time = b;
  }
  
  public PacketMessages() {}
  
  public void read(PacketBuf buf)
  {
    this.message = buf.readString();
    this.time = buf.readLong();
    
    gg.sendChannel(this.message, this.time);
  }
  
  public void write(PacketBuf buf)
  {
    buf.writeString(this.message);
    buf.writeLong(this.time);
  }
  
  public void handle(PacketHandler packetHandler)
  {
    packetHandler.handle(this);
  }
  
  class tz
    extends axu
  {
    public tz() {}
    
    protected void a(char typedChar, int keyCode)
      throws IOException
    {}
  }
}
