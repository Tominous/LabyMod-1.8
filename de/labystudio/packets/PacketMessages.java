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
    message = a;
    time = b;
  }
  
  public PacketMessages() {}
  
  public void read(PacketBuf buf)
  {
    message = buf.readString();
    time = buf.readLong();
    
    gg.sendChannel(message, time);
  }
  
  public void write(PacketBuf buf)
  {
    buf.writeString(message);
    buf.writeLong(time);
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
