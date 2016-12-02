package de.labystudio.packets;

import de.labystudio.chat.LabyModPlayer;
import de.labystudio.handling.PacketHandler;

public class PacketPlayPlayerOnline
  extends Packet
{
  private LabyModPlayer newOnlinePlayer;
  
  public PacketPlayPlayerOnline(LabyModPlayer newOnlinePlayer)
  {
    this.newOnlinePlayer = newOnlinePlayer;
  }
  
  public PacketPlayPlayerOnline() {}
  
  public void read(PacketBuf buf)
  {
    newOnlinePlayer = buf.readPlayer();
  }
  
  public void write(PacketBuf buf)
  {
    buf.writePlayer(newOnlinePlayer);
  }
  
  public void handle(PacketHandler packetHandler)
  {
    packetHandler.handle(this);
  }
  
  public LabyModPlayer getPlayer()
  {
    return newOnlinePlayer;
  }
}
