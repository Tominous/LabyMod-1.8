package de.labystudio.packets;

import de.labystudio.chat.LabyModPlayer;
import de.labystudio.handling.PacketHandler;

public class PacketLoginTime
  extends Packet
{
  private LabyModPlayer player;
  private long dateJoined;
  private long lastOnline;
  
  public PacketLoginTime(LabyModPlayer player, long dateJoined, long lastOnline)
  {
    this.player = player;
    this.dateJoined = dateJoined;
    this.lastOnline = lastOnline;
  }
  
  public PacketLoginTime() {}
  
  public void read(PacketBuf buf)
  {
    player = buf.readPlayer();
    dateJoined = buf.readLong();
    lastOnline = buf.readLong();
  }
  
  public void write(PacketBuf buf)
  {
    buf.writePlayer(player);
    buf.writeLong(dateJoined);
    buf.writeLong(lastOnline);
  }
  
  public void handle(PacketHandler packetHandler)
  {
    packetHandler.handle(this);
  }
  
  public long getDateJoined()
  {
    return dateJoined;
  }
  
  public long getLastOnline()
  {
    return lastOnline;
  }
  
  public LabyModPlayer getPlayer()
  {
    return player;
  }
}
