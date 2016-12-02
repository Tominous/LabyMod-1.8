package de.labystudio.packets;

import de.labystudio.handling.PacketHandler;

public class PacketHelloPong
  extends Packet
{
  private long a;
  
  public PacketHelloPong() {}
  
  public PacketHelloPong(long a)
  {
    this.a = a;
  }
  
  public void read(PacketBuf buf)
  {
    a = buf.readLong();
  }
  
  public void write(PacketBuf buf)
  {
    buf.writeLong(a);
  }
  
  public int getId()
  {
    return 1;
  }
  
  public void handle(PacketHandler packetHandler)
  {
    packetHandler.handle(this);
  }
}
