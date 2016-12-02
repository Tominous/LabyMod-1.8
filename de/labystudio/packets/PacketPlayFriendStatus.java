package de.labystudio.packets;

import de.labystudio.chat.LabyModPlayer;
import de.labystudio.chat.ServerInfo;
import de.labystudio.handling.PacketHandler;

public class PacketPlayFriendStatus
  extends Packet
{
  private LabyModPlayer player;
  private ServerInfo playerInfo;
  
  public PacketPlayFriendStatus(LabyModPlayer player, ServerInfo playerInfo)
  {
    this.player = player;
    this.playerInfo = playerInfo;
  }
  
  public PacketPlayFriendStatus() {}
  
  public void read(PacketBuf buf)
  {
    player = buf.readPlayer();
    playerInfo = buf.readServerInfo();
  }
  
  public void write(PacketBuf buf)
  {
    buf.writePlayer(player);
    buf.writeServerInfo(playerInfo);
  }
  
  public void handle(PacketHandler packetHandler)
  {
    packetHandler.handle(this);
  }
  
  public LabyModPlayer getPlayer()
  {
    return player;
  }
  
  public ServerInfo getPlayerInfo()
  {
    return playerInfo;
  }
}
