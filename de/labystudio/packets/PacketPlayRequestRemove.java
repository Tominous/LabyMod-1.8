package de.labystudio.packets;

import de.labystudio.handling.PacketHandler;

public class PacketPlayRequestRemove
  extends Packet
{
  private String playerName;
  
  public PacketPlayRequestRemove(String playerName)
  {
    this.playerName = playerName;
  }
  
  public PacketPlayRequestRemove() {}
  
  public void read(PacketBuf buf)
  {
    playerName = buf.readString();
  }
  
  public void write(PacketBuf buf)
  {
    buf.writeString(playerName);
  }
  
  public void handle(PacketHandler packetHandler)
  {
    packetHandler.handle(this);
  }
  
  public String getPlayerName()
  {
    return playerName;
  }
}
