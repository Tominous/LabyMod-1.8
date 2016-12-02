package de.labystudio.chat;

import ave;
import de.labystudio.labymod.ConfigManager;
import de.labystudio.labymod.LabyMod;
import de.labystudio.labymod.ModSettings;
import de.labystudio.packets.PacketPlayServerStatus;
import de.labystudio.packets.PacketPlayTyping;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.UUID;

public class ChatHandler
{
  private List<SingleChat> chats;
  private static ChatHandler instance;
  
  public static ChatHandler getHandler()
  {
    return instance;
  }
  
  public static boolean getServerStatus()
  {
    return false;
  }
  
  public ChatHandler()
  {
    instance = this;
    chats = new ArrayList();
  }
  
  public SingleChat getChat(String player)
  {
    for (SingleChat chat : chats) {
      if (chat.getFriend().getName().equalsIgnoreCase(player)) {
        return chat;
      }
    }
    return null;
  }
  
  public SingleChat getChat(LabyModPlayer player)
  {
    for (SingleChat chat : chats)
    {
      if (chat.getFriend().getId().equals(player.getId())) {
        return chat;
      }
      if (chat.getFriend().getName().equalsIgnoreCase(player.getName())) {
        return chat;
      }
    }
    return createSingleChat(player);
  }
  
  public SingleChat getOnlyChat(LabyModPlayer player)
  {
    for (SingleChat chat : chats)
    {
      if (chat.getFriend().getId().equals(player.getId())) {
        return chat;
      }
      if (chat.getFriend().getName().equalsIgnoreCase(player.getName())) {
        return chat;
      }
    }
    return null;
  }
  
  public static LabyModPlayer getInfo(String name)
  {
    if (name.equalsIgnoreCase(LabyMod.getInstance().getPlayerName()))
    {
      LabyMod.getInstance().getClient();return new LabyModPlayer(LabyMod.getInstance().getPlayerName(), LabyMod.getInstance().getPlayerUUID(), settingsmotd, Client.getOnlineStatus());
    }
    List<LabyModPlayer> a = new ArrayList();
    a.addAll(getInstanceclient.friends);
    for (LabyModPlayer p : a) {
      if (p.getName().equalsIgnoreCase(name)) {
        return p;
      }
    }
    return null;
  }
  
  public static List<LabyModPlayer> getMyFriends()
  {
    List<LabyModPlayer> list = new ArrayList();
    list.addAll(getInstanceclient.requests);
    
    List<LabyModPlayer> f = new ArrayList();
    f.addAll(getInstanceclient.friends);
    if (settingsshowSettingsFriend == 3)
    {
      list.addAll(f);
      Collections.sort(list, new Comparator()
      {
        public int compare(LabyModPlayer a, LabyModPlayer b)
        {
          return (int)(a.getLastMessage() - b.getLastMessage());
        }
      });
    }
    else
    {
      for (LabyModPlayer p : f) {
        if (p.isOnline()) {
          list.add(p);
        }
      }
      for (LabyModPlayer p : f) {
        if (!p.isOnline()) {
          list.add(p);
        }
      }
    }
    return list;
  }
  
  public static File getLogFile(int i)
  {
    String multiple = "";
    if (i > 0) {
      multiple = "_" + i;
    }
    File file = new File("LabyMod/Chatlog/" + LabyMod.getInstance().getPlayerName() + "/chatlog" + multiple);
    if (!file.exists()) {
      file.getParentFile().mkdirs();
    }
    return file;
  }
  
  public void updateChats(LabyModPlayer player)
  {
    for (int i = 0; i < chats.size(); i++)
    {
      SingleChat chat = (SingleChat)chats.get(i);
      if (chat.getFriend().getName().equalsIgnoreCase(player.getName())) {
        chat.updateFriend(player);
      }
    }
  }
  
  public SingleChat createSingleChat(LabyModPlayer friend)
  {
    if (getOnlyChat(friend) != null) {
      return getOnlyChat(friend);
    }
    SingleChat chat = new SingleChat(chats.size(), friend, new ArrayList());
    chats.add(chat);
    return chat;
  }
  
  static void addNewMessageInfo(String sender)
  {
    int newMessages = 0;
    for (LabyModPlayer p : getInstanceclient.getFriends()) {
      if (p.getName().equals(sender))
      {
        messages += 1;
        p.setLastMessage(System.currentTimeMillis());
      }
    }
  }
  
  public static void setAFK(boolean isAFK)
  {
    if (LabyMod.getInstance().getClient() == null) {
      return;
    }
    if (isAFK)
    {
      LabyMod.getInstance().getClient();
      if (Client.getOnlineStatus() == LabyModPlayer.OnlineStatus.ONLINE)
      {
        LabyMod.getInstance().getClient().setOnlineStatus(LabyModPlayer.OnlineStatus.AWAY);
        playerStatus = 1; return;
      }
    }
    LabyMod.getInstance().getClient();
    if (Client.getOnlineStatus() == LabyModPlayer.OnlineStatus.AWAY)
    {
      LabyMod.getInstance().getClient().setOnlineStatus(LabyModPlayer.OnlineStatus.ONLINE);
      playerStatus = 0;
    }
  }
  
  public static int playerStatus = 0;
  
  public static void setStatus(int i)
  {
    if (playerStatus != i)
    {
      playerStatus = i;
      LabyMod.getInstance().getClient().setOnlineStatus(LabyModPlayer.OnlineStatus.fromPacketId(i));
    }
  }
  
  public static void updateGameMode(String lobby)
  {
    if (lobby.isEmpty()) {
      lobby = null;
    }
    if (!getInstancegameMode.equals(lobby)) {
      if ((lobby == null) && (!getInstancegameMode.isEmpty()))
      {
        getInstancegameMode = "";
        getInstanceclient.getClientConnection().sendPacket(new PacketPlayServerStatus("", 0, null));
      }
      else
      {
        getInstancegameMode = lobby;
        getInstanceclient.getClientConnection().sendPacket(new PacketPlayServerStatus(getInstanceip, getInstanceport, getInstancegameMode));
        de.labystudio.gommehd.GommeHDSign.autoJoin = false;
      }
    }
    if (getInstancegameMode == null) {
      getInstancegameMode = "";
    }
  }
  
  public void newAccount()
  {
    chats.clear();
  }
  
  public static boolean isTyping = false;
  public static ArrayList<LabyModPlayer> typingPartner = new ArrayList();
  
  public static void resetTyping()
  {
    if (isTyping)
    {
      isTyping = false;
      for (LabyModPlayer partner : typingPartner) {
        LabyMod.getInstance().getClient().getClientConnection().sendPacket(new PacketPlayTyping(getInstanceclient.build(), partner, true));
      }
    }
  }
  
  public static void updateIsWriting(LabyModPlayer selectedPlayer, String textField)
  {
    if ((!isTyping) && (!textField.replace(" ", "").isEmpty()) && (selectedPlayer != null))
    {
      isTyping = true;
      typingPartner.add(selectedPlayer);
      LabyMod.getInstance().getClient().getClientConnection().sendPacket(new PacketPlayTyping(getInstanceclient.build(), selectedPlayer, false));
    }
    if (((isTyping) && (textField.replace(" ", "").isEmpty())) || (selectedPlayer == null) || (getInstancemc.m == null))
    {
      isTyping = false;
      resetTyping();
    }
  }
}
