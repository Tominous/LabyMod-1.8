package de.zockermaus.ts3;

import java.util.ArrayList;

public class Chat
{
  private TeamSpeakUser sender;
  private TeamSpeakUser chatOwner;
  private EnumTargetMode mode;
  private int global;
  private ArrayList<Message> log = new ArrayList();
  
  public Chat(TeamSpeakUser chatOwner, TeamSpeakUser sender, EnumTargetMode targetMode, String message)
  {
    this.sender = sender;
    mode = targetMode;
    this.chatOwner = chatOwner;
    log.add(new Message(sender, message));
  }
  
  public Chat(TeamSpeakUser chatOwner, TeamSpeakUser sender, EnumTargetMode targetMode)
  {
    this.sender = sender;
    mode = targetMode;
    this.chatOwner = chatOwner;
  }
  
  public Chat(int id, EnumTargetMode targetMode)
  {
    sender = null;
    mode = targetMode;
    global = id;
  }
  
  public TeamSpeakUser getSender()
  {
    return sender;
  }
  
  public TeamSpeakUser getChatOwner()
  {
    return chatOwner;
  }
  
  public ArrayList<Message> getLog()
  {
    return log;
  }
  
  public void addMessage(TeamSpeakUser sender, String msg)
  {
    log.add(new Message(sender, msg));
  }
  
  public EnumTargetMode getTargetMode()
  {
    return mode;
  }
  
  public int getSlotId()
  {
    if (chatOwner == null) {
      return global;
    }
    return chatOwner.getClientId();
  }
}
