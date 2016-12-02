package net.minecraft.realms;

import bdd;

public class RealmsServerAddress
{
  private final String host;
  private final int port;
  
  protected RealmsServerAddress(String ☃, int ☃)
  {
    host = ☃;
    port = ☃;
  }
  
  public String getHost()
  {
    return host;
  }
  
  public int getPort()
  {
    return port;
  }
  
  public static RealmsServerAddress parseString(String ☃)
  {
    bdd ☃ = bdd.a(☃);
    return new RealmsServerAddress(☃.a(), ☃.b());
  }
}
