package net.minecraft.realms;

import com.google.common.collect.Lists;
import com.mojang.authlib.GameProfile;
import ek;
import el;
import eu;
import fa;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import jc;
import jp;
import jq;
import jr;
import js;
import js.a;
import ju;
import jv;
import org.apache.commons.lang3.ArrayUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class RealmsServerStatusPinger
{
  private static final Logger LOGGER = ;
  private final List<ek> connections = Collections.synchronizedList(Lists.newArrayList());
  
  public void pingServer(final String ☃, final RealmsServerPing ☃)
    throws UnknownHostException
  {
    if ((☃ == null) || (☃.startsWith("0.0.0.0")) || (☃.isEmpty())) {
      return;
    }
    RealmsServerAddress ☃ = RealmsServerAddress.parseString(☃);
    final ek ☃ = ek.a(InetAddress.getByName(☃.getHost()), ☃.getPort(), false);
    
    connections.add(☃);
    
    ☃.a(new jp()
    {
      private boolean e = false;
      
      public void a(jr ☃)
      {
        js ☃ = ☃.a();
        if (☃.b() != null)
        {
          ☃nrOfPlayers = String.valueOf(☃.b().b());
          if (ArrayUtils.isNotEmpty(☃.b().c()))
          {
            StringBuilder ☃ = new StringBuilder();
            for (GameProfile ☃ : ☃.b().c())
            {
              if (☃.length() > 0) {
                ☃.append("\n");
              }
              ☃.append(☃.getName());
            }
            if (☃.b().c().length < ☃.b().b())
            {
              if (☃.length() > 0) {
                ☃.append("\n");
              }
              ☃.append("... and ").append(☃.b().b() - ☃.b().c().length).append(" more ...");
            }
            ☃playerList = ☃.toString();
          }
        }
        else
        {
          ☃playerList = "";
        }
        ☃.a(new ju(Realms.currentTimeMillis()));
        e = true;
      }
      
      public void a(jq ☃)
      {
        ☃.a(new fa("Finished"));
      }
      
      public void a(eu ☃)
      {
        if (!e) {
          RealmsServerStatusPinger.LOGGER.error("Can't ping " + ☃ + ": " + ☃.c());
        }
      }
    });
    try
    {
      ☃.a(new jc(RealmsSharedConstants.NETWORK_PROTOCOL_VERSION, ☃.getHost(), ☃.getPort(), el.c));
      ☃.a(new jv());
    }
    catch (Throwable ☃)
    {
      LOGGER.error(☃);
    }
  }
  
  public void tick()
  {
    synchronized (connections)
    {
      Iterator<ek> ☃ = connections.iterator();
      while (☃.hasNext())
      {
        ek ☃ = (ek)☃.next();
        if (☃.g())
        {
          ☃.a();
        }
        else
        {
          ☃.remove();
          ☃.l();
        }
      }
    }
  }
  
  public void removeAll()
  {
    synchronized (connections)
    {
      Iterator<ek> ☃ = connections.iterator();
      while (☃.hasNext())
      {
        ek ☃ = (ek)☃.next();
        if (☃.g())
        {
          ☃.remove();
          ☃.a(new fa("Cancelled"));
        }
      }
    }
  }
}
