package de.labystudio.chat;

import io.netty.channel.socket.nio.NioSocketChannel;

public class ReconnectHandler
  extends Thread
{
  private ClientConnection clientConnection;
  private long lastTry;
  
  public ReconnectHandler(ClientConnection clientConnection)
  {
    this.clientConnection = clientConnection;
    lastTry = System.currentTimeMillis();
  }
  
  public void run()
  {
    for (;;)
    {
      if (clientConnection.ch.isOpen())
      {
        try
        {
          wait();
        }
        catch (InterruptedException e)
        {
          e.printStackTrace();
        }
      }
      else if (lastTry + 5000L < System.currentTimeMillis())
      {
        lastTry = System.currentTimeMillis();
        clientConnection.init();
        clientConnection.connect();
      }
    }
  }
}
