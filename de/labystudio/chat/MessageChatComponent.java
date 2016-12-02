package de.labystudio.chat;

import de.labystudio.labymod.LabyMod;
import de.labystudio.utils.Color;
import de.labystudio.utils.DrawUtils;
import de.labystudio.utils.Utils;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Random;

public class MessageChatComponent
{
  public static final SimpleDateFormat format = new SimpleDateFormat("HH:mm");
  protected String message;
  private String sender;
  private long sentTime;
  private int range = 0;
  int max;
  private SingleChat chat;
  protected boolean downloaded = true;
  long id = 0L;
  int gx;
  int gy;
  
  public MessageChatComponent(String sender, long sentTime, String message)
  {
    this.message = message;
    this.sender = sender;
    this.sentTime = sentTime;
    id = LabyMod.random.nextLong();
    if (id == 0L) {
      id += 1L;
    }
  }
  
  public void setChat(SingleChat chat)
  {
    this.chat = chat;
  }
  
  public SingleChat getChat()
  {
    return chat;
  }
  
  public boolean isDownloaded()
  {
    return downloaded;
  }
  
  public long getId()
  {
    return id;
  }
  
  public void draw(int x, int y)
  {
    gx = x;
    gy = y;
    max = (getInstancedraw.getWidth() - 150);
    String prefix = Color.cl("7");
    if (getSender().equals(LabyMod.getInstance().getPlayerName())) {
      prefix = Color.cl("f");
    }
    String msg = Color.cl("6") + "[" + format.format(new Date(getSentTime())) + "] " + prefix + getSender() + ": " + Color.cl("f") + getMessage().replace("´", "'");
    range = getRange(msg);
    y -= range * 12;
    
    String next = getFirstStrings(max, msg);
    String done = "";
    for (int i = 0; i <= range; i++)
    {
      getInstancedraw.drawString(next, x, y + i * 12);
      done = done + next;
      next = getFirstStrings(max, msg.replace(done, ""));
    }
  }
  
  private String getFirstStrings(int pixels, String string)
  {
    int k = 0;
    String result = "";
    for (int i = 0; i < string.length(); i++)
    {
      char c = string.charAt(i);
      k += getInstancedraw.getStringWidth(new String(new char[] { c }));
      if (pixels > k)
      {
        result = result + new String(new char[] { c });
      }
      else
      {
        if (pixels != k) {
          break;
        }
        result = result + c;
        break;
      }
    }
    return result;
  }
  
  private int getRange(String msg)
  {
    int k = 0;
    int range = 0;
    String line = msg;
    for (int i = 0; i <= line.length() - 1; i++)
    {
      char a = line.charAt(i);
      if (k > max)
      {
        range++;
        k = 0;
      }
      k += getInstancedraw.getStringWidth("" + a);
    }
    return range;
  }
  
  public int getYSize()
  {
    return (range + 1) * 12;
  }
  
  public String getMessage()
  {
    return message;
  }
  
  public String getSender()
  {
    return sender;
  }
  
  public long getSentTime()
  {
    return sentTime;
  }
  
  public void click(int mouseX, int mouseY, int mouseButton)
  {
    range = getRange(message);
    if ((mouseX > gx) && (mouseX < gx + getInstancedraw.getStringWidth(message) + 100) && (mouseY < gy + 12) && (mouseY > gy - getYSize() + 12))
    {
      ArrayList<String> urls = Utils.extractDomains(message);
      if (!urls.isEmpty()) {
        LabyMod.getInstance().openWebpage((String)urls.get(0));
      }
    }
  }
  
  public void drawOpen() {}
  
  public void handleMouseInput() {}
  
  public void mouseClickMove(int mouseX, int mouseY, int clickedMouseButton, long timeSinceLastClick) {}
  
  public void mouseRelease(int mouseX, int mouseY, int state) {}
}
