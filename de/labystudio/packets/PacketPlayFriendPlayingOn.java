package de.labystudio.packets;

import de.labystudio.chat.LabyModPlayer;
import de.labystudio.handling.PacketHandler;

public class PacketPlayFriendPlayingOn
  extends Packet
{
  private LabyModPlayer player;
  private String gameModeName;
  
  public PacketPlayFriendPlayingOn(LabyModPlayer player, String gameModeName)
  {
    this.player = player;
    this.gameModeName = gameModeName;
  }
  
  public PacketPlayFriendPlayingOn() {}
  
  public void read(PacketBuf buf)
  {
    player = buf.readPlayer();
    gameModeName = buf.readString();
  }
  
  public void write(PacketBuf buf)
  {
    buf.writePlayer(player);
    buf.writeString(gameModeName);
  }
  
  public void handle(PacketHandler packetHandler)
  {
    packetHandler.handle(this);
  }
  
  public String getGameModeName()
  {
    return gameModeName;
  }
  
  public LabyModPlayer getPlayer()
  {
    return player;
  }
}
