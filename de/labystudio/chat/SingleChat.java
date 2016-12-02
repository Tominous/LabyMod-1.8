package de.labystudio.chat;

import ave;
import bpf;
import bpz;
import de.labystudio.labymod.ConfigManager;
import de.labystudio.labymod.LabyMod;
import de.labystudio.labymod.ModSettings;
import de.labystudio.packets.PacketMessage;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import jy;

public class SingleChat
{
  private final int id;
  private LabyModPlayer friend;
  private List<MessageChatComponent> messages;
  
  public SingleChat(int id, LabyModPlayer friend, List<MessageChatComponent> messages)
  {
    this.id = id;
    this.friend = friend;
    this.messages = messages;
    if (this.messages == null) {
      this.messages = new ArrayList();
    }
  }
  
  public int getId()
  {
    return id;
  }
  
  public LabyModPlayer getFriend()
  {
    return friend;
  }
  
  public List<MessageChatComponent> getMessages()
  {
    return messages;
  }
  
  public void addMessage(MessageChatComponent message)
  {
    Collections.reverse(messages);
    messages.add(message);
    Collections.reverse(messages);
    
    message.setChat(this);
    if (message.getSender().equalsIgnoreCase(LabyMod.getInstance().getPlayerName()))
    {
      if (settingsplaySounds) {
        synchronized (ave.A())
        {
          ave.A().W().a(bpf.a(new jy("random.pop"), 1.5F));
        }
      }
      if (!(message instanceof TitleChatComponent)) {
        getInstanceclient.getClientConnection().sendPacket(new PacketMessage(getInstanceclient.build(), getFriend(), message.getMessage(), 0L, 0.0D, System.currentTimeMillis()));
      }
    }
    else if (settingsplaySounds)
    {
      LabyMod.getInstance().getClient();
      if ((!Client.isBusy()) && 
        (LabyMod.getInstance().getClient().hasNotifications(getFriend()))) {
        ave.A().W().a(bpf.a(new jy("random.pop"), 2.5F));
      }
    }
    getInstancenewMessage = true;
  }
  
  public void updateFriend(LabyModPlayer player)
  {
    friend = player;
  }
  
  public void draw(int xStart, int yStart) {}
  
  public MessageChatComponent findDownloadableMessage(String name)
  {
    Iterator<MessageChatComponent> iter = getMessages().iterator();
    while (iter.hasNext())
    {
      MessageChatComponent msg = (MessageChatComponent)iter.next();
      if (msg.getMessage().equalsIgnoreCase(name)) {
        return msg;
      }
    }
    return null;
  }
}
