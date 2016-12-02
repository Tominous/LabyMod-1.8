package de.labystudio.packets;

import de.labystudio.chat.ServerInfo;
import de.labystudio.handling.PacketHandler;

public class PacketPlayServerStatus
  extends Packet
{
  private String serverIp;
  private int port;
  private String serverName = null;
  
  public PacketPlayServerStatus(String serverIp, int port)
  {
    this.serverIp = serverIp;
    this.port = port;
    serverName = null;
  }
  
  public PacketPlayServerStatus() {}
  
  public PacketPlayServerStatus(String serverIp, int port, String serverName)
  {
    this.serverIp = serverIp;
    this.port = port;
    this.serverName = serverName;
  }
  
  public void read(PacketBuf buf)
  {
    serverIp = buf.readString();
    port = buf.readInt();
    if (buf.readBoolean()) {
      serverName = buf.readString();
    }
  }
  
  public void write(PacketBuf buf)
  {
    buf.writeString(serverIp);
    buf.writeInt(port);
    if (serverName != null)
    {
      buf.writeBoolean(true);
      buf.writeString(serverName);
    }
    else
    {
      buf.writeBoolean(false);
    }
  }
  
  public void handle(PacketHandler packetHandler)
  {
    packetHandler.handle(this);
  }
  
  public String getServerIp()
  {
    return serverIp;
  }
  
  public int getPort()
  {
    return port;
  }
  
  public String getServerName()
  {
    return serverName;
  }
  
  public ServerInfo build()
  {
    if (serverName == null) {
      return new ServerInfo(serverIp, port);
    }
    return new ServerInfo(serverIp, port, serverName);
  }
}
