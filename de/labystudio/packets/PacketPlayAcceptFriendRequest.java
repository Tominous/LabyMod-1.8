package de.labystudio.packets;

import de.labystudio.handling.PacketHandler;

public class PacketPlayAcceptFriendRequest
  extends Packet
{
  private String player_name;
  
  public PacketPlayAcceptFriendRequest(String playerName)
  {
    player_name = playerName;
  }
  
  public PacketPlayAcceptFriendRequest() {}
  
  public void read(PacketBuf buf)
  {
    player_name = buf.readString();
  }
  
  public void write(PacketBuf buf)
  {
    buf.writeString(player_name);
  }
  
  public void handle(PacketHandler packetHandler)
  {
    packetHandler.handle(this);
  }
}
