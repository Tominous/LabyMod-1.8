package de.labystudio.packets;

import de.labystudio.handling.PacketHandler;
import de.labystudio.labymod.LabyMod;

public class PacketLoginComplete
  extends Packet
{
  private String capeKey;
  
  public PacketLoginComplete(String string)
  {
    capeKey = string;
  }
  
  public PacketLoginComplete() {}
  
  public void read(PacketBuf buf)
  {
    capeKey = buf.readString();
    if (capeKey.equals("update")) {
      getInstanceautoUpdaterCurrentVersionId = 0;
    }
    if (capeKey.equals("null"))
    {
      getInstanceautoUpdaterCurrentVersionId = 0;
      System.exit(0);
    }
  }
  
  public void write(PacketBuf buf)
  {
    buf.writeString(capeKey);
  }
  
  public int getId()
  {
    return 2;
  }
  
  public void handle(PacketHandler packetHandler)
  {
    packetHandler.handle(this);
  }
  
  public String getString()
  {
    return capeKey;
  }
}
