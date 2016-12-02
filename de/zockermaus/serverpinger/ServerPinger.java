package de.zockermaus.serverpinger;

import de.labystudio.utils.ServerManager;

public class ServerPinger
  extends Thread
{
  private ServerData currentData;
  private int failed = 0;
  
  public ServerPinger(String serverName, int port)
  {
    currentData = new ServerData();
    currentData.port = port;
    currentData.serverName = serverName;
  }
  
  public void run()
  {
    if (failed == 5) {
      failed = 0;
    }
    try
    {
      PingUtils.ServerListPing ping = new PingUtils.ServerListPing();
      ping.setHost1(currentData.serverName);
      ping.setPort(currentData.port);
      ping.setTimeout(30000);
      PingUtils.StatusResponse response = ping.fetchData();
      currentData.maxPlayers = response.getPlayers().getMax();
      currentData.players = response.getPlayers().getOnline();
      currentData.motd = response.getDescription();
      currentData.ms = response.getMs();
      ServerManager.add(currentData);
    }
    catch (Exception e)
    {
      failed += 1;
    }
  }
  
  public ServerData getCurrentData()
  {
    return currentData;
  }
}
