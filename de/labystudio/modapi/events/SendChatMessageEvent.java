package de.labystudio.modapi.events;

import de.labystudio.modapi.Cancellable;
import de.labystudio.modapi.Event;
import de.labystudio.modapi.Listener;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SendChatMessageEvent
  extends Event
  implements Cancellable
{
  public static final Map<Listener, List<Method>> listenerMethods = new HashMap();
  private String message;
  private boolean cancelled;
  
  public SendChatMessageEvent(String message)
  {
    this.message = message;
  }
  
  public void setCancelled(boolean cancel)
  {
    cancelled = cancel;
  }
  
  public boolean isCancelled()
  {
    return cancelled;
  }
  
  public String getMessage()
  {
    return message;
  }
  
  public Map<Listener, List<Method>> getListenerMethods()
  {
    return listenerMethods;
  }
}
