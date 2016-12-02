package de.labystudio.utils;

public class ServiceStatus
{
  private String color;
  private long created;
  private String status;
  private String chatColor;
  
  public ServiceStatus(String color)
  {
    status = color;
    created = System.currentTimeMillis();
    this.color = color;
    if (color.equals("red"))
    {
      chatColor = "c";
      status = "Offline";
    }
    float b = 0.3F;
    if (color.equals("green"))
    {
      chatColor = "a";
      status = "Online";
    }
    float c = 0.3F;
    if (color.equals("yellow"))
    {
      chatColor = "e";
      status = "Slowly";
    }
  }
  
  public long getCreated()
  {
    return created;
  }
  
  public String getStatus()
  {
    return status;
  }
  
  public String getColor()
  {
    return color;
  }
  
  public String getChatColor()
  {
    return chatColor;
  }
}
