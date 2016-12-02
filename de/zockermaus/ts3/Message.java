package de.zockermaus.ts3;

public class Message
{
  private TeamSpeakUser user;
  private String message;
  
  public Message(TeamSpeakUser user, String message)
  {
    this.user = user;
    this.message = message;
  }
  
  public TeamSpeakUser getUser()
  {
    return user;
  }
  
  public String getMessage()
  {
    return message;
  }
}
