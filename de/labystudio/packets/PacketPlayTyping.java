package de.labystudio.packets;

import de.labystudio.chat.LabyModPlayer;
import de.labystudio.handling.PacketHandler;

public class PacketPlayTyping
  extends Packet
{
  private LabyModPlayer player;
  private LabyModPlayer inChatWith;
  private boolean typing;
  
  public PacketPlayTyping(LabyModPlayer player, LabyModPlayer inChatWith, boolean typing)
  {
    this.player = player;
    this.inChatWith = inChatWith;
    this.typing = typing;
  }
  
  public PacketPlayTyping() {}
  
  public void read(PacketBuf buf)
  {
    player = buf.readPlayer();
    inChatWith = buf.readPlayer();
    typing = buf.readBoolean();
  }
  
  public void write(PacketBuf buf)
  {
    buf.writePlayer(player);
    buf.writePlayer(inChatWith);
    buf.writeBoolean(typing);
  }
  
  public void handle(PacketHandler packetHandler)
  {
    packetHandler.handle(this);
  }
  
  public LabyModPlayer getInChatWith()
  {
    return inChatWith;
  }
  
  public LabyModPlayer getPlayer()
  {
    return player;
  }
  
  public boolean isTyping()
  {
    return typing;
  }
}
