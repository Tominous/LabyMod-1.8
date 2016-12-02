package net.minecraft.realms;

import bdd;

public class RealmsServerAddress
{
  private final String host;
  private final int port;
  
  protected RealmsServerAddress(String ☃, int ☃)
  {
    this.host = ☃;
    this.port = ☃;
  }
  
  public String getHost()
  {
    return this.host;
  }
  
  public int getPort()
  {
    return this.port;
  }
  
  public static RealmsServerAddress parseString(String ☃)
  {
    bdd ☃ = bdd.a(☃);
    return new RealmsServerAddress(☃.a(), ☃.b());
  }
}
