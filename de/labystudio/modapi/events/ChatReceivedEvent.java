package de.labystudio.modapi.events;

import de.labystudio.modapi.Event;
import de.labystudio.modapi.Listener;
import eu;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ChatReceivedEvent
  extends Event
{
  public static final Map<Listener, List<Method>> listenerMethods = new HashMap();
  private boolean cancelled;
  private eu component;
  
  public ChatReceivedEvent(eu component)
  {
    this.component = component;
  }
  
  public Map<Listener, List<Method>> getListenerMethods()
  {
    return listenerMethods;
  }
  
  public boolean isCancelled()
  {
    return cancelled;
  }
  
  public void setCancelled(boolean cancelled)
  {
    this.cancelled = cancelled;
  }
  
  public eu getComponent()
  {
    return component;
  }
  
  public String getCleanMsg()
  {
    return component.c();
  }
  
  public String getMsg()
  {
    return component.d();
  }
}
