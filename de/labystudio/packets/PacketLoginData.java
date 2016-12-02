package de.labystudio.packets;

import de.labystudio.handling.PacketHandler;
import java.util.UUID;

public class PacketLoginData
  extends Packet
{
  private UUID id;
  private String name;
  private String motd;
  
  public PacketLoginData() {}
  
  public PacketLoginData(UUID id, String name, String motd)
  {
    this.id = id;
    this.name = name;
    this.motd = motd;
  }
  
  public void read(PacketBuf buf)
  {
    id = UUID.fromString(buf.readString());
    name = buf.readString();
    motd = buf.readString();
  }
  
  public void write(PacketBuf buf)
  {
    if (id == null) {
      buf.writeString(UUID.randomUUID().toString());
    } else {
      buf.writeString(id.toString());
    }
    buf.writeString(name);
    buf.writeString(motd);
  }
  
  public int getId()
  {
    return 0;
  }
  
  public UUID getUUID()
  {
    return id;
  }
  
  public String getName()
  {
    return name;
  }
  
  public void handle(PacketHandler packetHandler)
  {
    packetHandler.handle(this);
  }
  
  public String getMotd()
  {
    return motd;
  }
}
