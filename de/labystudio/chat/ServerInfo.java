package de.labystudio.chat;

public class ServerInfo
{
  private String serverIp;
  private int serverPort;
  private String specifiedServerName;
  
  public ServerInfo(String serverIp, int serverPort, String specifiedServerName)
  {
    this.serverIp = serverIp;
    this.serverPort = serverPort;
    this.specifiedServerName = specifiedServerName;
  }
  
  public ServerInfo(String serverIp, int serverPort)
  {
    this.serverIp = serverIp;
    this.serverPort = serverPort;
    specifiedServerName = null;
  }
  
  public ServerInfo()
  {
    serverIp = "";
  }
  
  public String getServerIp()
  {
    return serverIp;
  }
  
  public int getServerPort()
  {
    return serverPort;
  }
  
  public String getSpecifiedServerName()
  {
    return specifiedServerName;
  }
}
