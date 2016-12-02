package net.minecraft.realms;

import ave;
import avh;
import avm;
import bcx;
import bnm;
import ek;
import el;
import fb;
import java.net.InetAddress;
import java.net.UnknownHostException;
import jc;
import jl;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class RealmsConnect
{
  private static final Logger LOGGER = ;
  private final RealmsScreen onlineScreen;
  private volatile boolean aborted = false;
  private ek connection;
  
  public RealmsConnect(RealmsScreen ☃)
  {
    onlineScreen = ☃;
  }
  
  public void connect(final String ☃, final int ☃)
  {
    Realms.setConnectedToRealms(true);
    
    new Thread("Realms-connect-task")
    {
      public void run()
      {
        InetAddress ☃ = null;
        try
        {
          ☃ = InetAddress.getByName(☃);
          if (aborted) {
            return;
          }
          connection = ek.a(☃, ☃, At.f());
          if (aborted) {
            return;
          }
          connection.a(new bcx(connection, ave.A(), onlineScreen.getProxy()));
          if (aborted) {
            return;
          }
          connection.a(new jc(47, ☃, ☃, el.d));
          if (aborted) {
            return;
          }
          connection.a(new jl(ave.A().L().e()));
        }
        catch (UnknownHostException ☃)
        {
          Realms.clearResourcePack();
          if (aborted) {
            return;
          }
          RealmsConnect.LOGGER.error("Couldn't connect to world", ☃);
          ave.A().R().f();
          Realms.setScreen(new DisconnectedRealmsScreen(onlineScreen, "connect.failed", new fb("disconnect.genericReason", new Object[] { "Unknown host '" + ☃ + "'" })));
        }
        catch (Exception ☃)
        {
          Realms.clearResourcePack();
          if (aborted) {
            return;
          }
          RealmsConnect.LOGGER.error("Couldn't connect to world", ☃);
          String ☃ = ☃.toString();
          if (☃ != null)
          {
            String ☃ = ☃.toString() + ":" + ☃;
            ☃ = ☃.replaceAll(☃, "");
          }
          Realms.setScreen(new DisconnectedRealmsScreen(onlineScreen, "connect.failed", new fb("disconnect.genericReason", new Object[] { ☃ })));
        }
      }
    }.start();
  }
  
  public void abort()
  {
    aborted = true;
  }
  
  public void tick()
  {
    if (connection != null) {
      if (connection.g()) {
        connection.a();
      } else {
        connection.l();
      }
    }
  }
}
