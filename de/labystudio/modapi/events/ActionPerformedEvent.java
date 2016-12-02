package de.labystudio.modapi.events;

import avs;
import axu;
import de.labystudio.modapi.Event;
import de.labystudio.modapi.Listener;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ActionPerformedEvent
  extends Event
{
  public static final Map<Listener, List<Method>> listenerMethods = new HashMap();
  private axu screen;
  private avs button;
  
  public ActionPerformedEvent(axu screen, avs button)
  {
    this.screen = screen;
    this.button = button;
  }
  
  public axu getScreen()
  {
    return screen;
  }
  
  public avs getButton()
  {
    return button;
  }
  
  public Map<Listener, List<Method>> getListenerMethods()
  {
    return listenerMethods;
  }
}
