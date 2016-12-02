package de.labystudio.packets;

import de.labystudio.handling.PacketHandler;

public class PacketLoginVersion
  extends Packet
{
  private int versionId;
  private String versionName;
  private String updateLink;
  
  public PacketLoginVersion(int internalVersion, String externalVersion)
  {
    versionId = internalVersion;
    versionName = externalVersion;
  }
  
  public PacketLoginVersion() {}
  
  public void read(PacketBuf buf)
  {
    versionId = buf.readInt();
    versionName = buf.readString();
    updateLink = buf.readString();
  }
  
  public void write(PacketBuf buf)
  {
    buf.writeInt(versionId);
    buf.writeString(versionName);
    buf.writeString("");
  }
  
  public void handle(PacketHandler packetHandler)
  {
    packetHandler.handle(this);
  }
  
  public String getVersionName()
  {
    return versionName;
  }
  
  public int getVersionID()
  {
    return versionId;
  }
  
  public String getUpdateLink()
  {
    return updateLink;
  }
}
