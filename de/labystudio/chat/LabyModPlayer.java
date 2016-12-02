package de.labystudio.chat;

import java.util.UUID;

public class LabyModPlayer
{
  private String timeZone;
  private long lastOnline;
  private long joinedFirst;
  private int contactsAmount;
  private String name;
  protected UUID id;
  private String motd;
  private ServerInfo serverInfo;
  private OnlineStatus status;
  public int messages = 0;
  private boolean notify = true;
  private boolean typing = false;
  private long lastMessage;
  
  public LabyModPlayer(String name, UUID id, boolean notify)
  {
    this(name, id, "* Offline *", OnlineStatus.OFFLINE);
    this.notify = notify;
  }
  
  public LabyModPlayer(String name, UUID uuid, String motd, OnlineStatus status)
  {
    id = uuid;
    this.name = name;
    this.motd = motd;
    this.status = status;
    timeZone = "";
    lastOnline = 0L;
    contactsAmount = 0;
    joinedFirst = 0L;
    serverInfo = new ServerInfo();
  }
  
  public LabyModPlayer(String name, UUID uuid, String motd, OnlineStatus status, String timeZone, long lastOnline, long joinedFirst, int contactsAmount)
  {
    this(name, uuid, motd, status);
    this.timeZone = timeZone;
    this.lastOnline = lastOnline;
    this.joinedFirst = joinedFirst;
    this.contactsAmount = contactsAmount;
  }
  
  public boolean isNotify()
  {
    return notify;
  }
  
  public void setNotify(boolean notify)
  {
    this.notify = notify;
  }
  
  public OnlineStatus getStatus()
  {
    return status;
  }
  
  public String getMotd()
  {
    return motd;
  }
  
  public UUID getId()
  {
    return id;
  }
  
  public String getName()
  {
    return name;
  }
  
  public void updateMotd(String motd)
  {
    this.motd = motd;
  }
  
  public void setOnline(OnlineStatus status)
  {
    this.status = status;
  }
  
  public boolean isRequest()
  {
    return false;
  }
  
  public int getContactsAmount()
  {
    return contactsAmount;
  }
  
  public long getJoinedFirst()
  {
    return joinedFirst;
  }
  
  public boolean isOnline()
  {
    return status != OnlineStatus.OFFLINE;
  }
  
  public long getLastOnline()
  {
    if (isOnline())
    {
      lastOnline = System.currentTimeMillis();
      return System.currentTimeMillis();
    }
    return lastOnline;
  }
  
  public void setLastOnline(long lastOnline)
  {
    this.lastOnline = lastOnline;
  }
  
  public String getTimeZone()
  {
    return timeZone;
  }
  
  public ServerInfo getServerInfo()
  {
    return serverInfo;
  }
  
  public boolean equals(Object obj)
  {
    if (!(obj instanceof LabyModPlayer)) {
      return false;
    }
    LabyModPlayer player = (LabyModPlayer)obj;
    if (player.isRequest() != isRequest()) {
      return false;
    }
    if (player.getId() != getId()) {
      return false;
    }
    return true;
  }
  
  public void updateServer(ServerInfo info)
  {
    serverInfo = info;
  }
  
  public void set(LabyModPlayer player)
  {
    updateServer(player.getServerInfo());
    updateMotd(player.getMotd());
    status = player.getStatus();
    contactsAmount = player.getContactsAmount();
    timeZone = player.getTimeZone();
  }
  
  public static enum OnlineStatus
  {
    ONLINE((byte)0),  AWAY((byte)1),  BUSY((byte)2),  OFFLINE((byte)-1);
    
    private byte packetId;
    
    private OnlineStatus(byte packetId)
    {
      this.packetId = packetId;
    }
    
    public byte getPacketId()
    {
      return packetId;
    }
    
    public static OnlineStatus fromPacketId(int packetId)
    {
      for (OnlineStatus status : ) {
        if (packetId == packetId) {
          return status;
        }
      }
      return OFFLINE;
    }
  }
  
  public void updateTyping(boolean typing)
  {
    this.typing = typing;
  }
  
  public boolean isTyping()
  {
    return typing;
  }
  
  public void setLastMessage(long lastMessage)
  {
    this.lastMessage = lastMessage;
  }
  
  public long getLastMessage()
  {
    return lastMessage;
  }
}
