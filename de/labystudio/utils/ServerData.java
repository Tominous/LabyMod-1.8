package de.labystudio.utils;

public class ServerData
{
  private String version;
  private String favicon;
  private String latency;
  private String online;
  private String max;
  private String motd;
  private String strippedmotd;
  private String protocol;
  private String server;
  private String address;
  private int ping;
  
  public String getVersion()
  {
    return version;
  }
  
  public void setVersion(String s)
  {
    motd = s;
  }
  
  public String getFavicon()
  {
    return favicon;
  }
  
  public void setFavicon(String s)
  {
    favicon = s;
  }
  
  public String getLatency()
  {
    return latency;
  }
  
  public void setLatency(String s)
  {
    latency = s;
  }
  
  public String getOnline()
  {
    return online;
  }
  
  public void setOnline(String s)
  {
    online = s;
  }
  
  public String getMax()
  {
    return max;
  }
  
  public void setMax(String s)
  {
    max = s;
  }
  
  public String getMotd()
  {
    return motd;
  }
  
  public void setMotd(String s)
  {
    motd = s;
  }
  
  public String getStrippedMotd()
  {
    return strippedmotd;
  }
  
  public void setStrippedMotd(String s)
  {
    strippedmotd = s;
  }
  
  public String getProtocol()
  {
    return protocol;
  }
  
  public void setProtocol(String s)
  {
    protocol = s;
  }
  
  public String getServer()
  {
    return server;
  }
  
  public void setServer(String s)
  {
    server = s;
  }
  
  public String getAddress()
  {
    return address;
  }
  
  public void setAddress(String s)
  {
    address = s;
  }
  
  public void setPing(int ping)
  {
    this.ping = ping;
  }
  
  public int getPing()
  {
    return ping;
  }
}
