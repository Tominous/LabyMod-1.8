package de.labystudio.packets;

import de.labystudio.chat.LabyModPlayer;
import de.labystudio.handling.PacketHandler;

public class PacketPlayFriendRemove
  extends Packet
{
  private LabyModPlayer toRemove;
  
  public PacketPlayFriendRemove(LabyModPlayer toRemove)
  {
    this.toRemove = toRemove;
  }
  
  public PacketPlayFriendRemove() {}
  
  public void read(PacketBuf buf)
  {
    toRemove = buf.readPlayer();
  }
  
  public void write(PacketBuf buf)
  {
    buf.writePlayer(toRemove);
  }
  
  public void handle(PacketHandler packetHandler)
  {
    packetHandler.handle(this);
  }
  
  public LabyModPlayer getToRemove()
  {
    return toRemove;
  }
}
