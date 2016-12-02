package de.labystudio.modapi.events;

import avs;
import axu;
import de.labystudio.modapi.Event;
import de.labystudio.modapi.Listener;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class InitScreenEvent
  extends Event
{
  public static final Map<Listener, List<Method>> listenerMethods = new HashMap();
  private axu screen;
  private List<avs> buttonList;
  
  public InitScreenEvent(axu screen, List<avs> buttonList)
  {
    this.screen = screen;
    this.buttonList = buttonList;
  }
  
  public axu getScreen()
  {
    return this.screen;
  }
  
  public List<avs> getButtonList()
  {
    return this.buttonList;
  }
  
  public Map<Listener, List<Method>> getListenerMethods()
  {
    return listenerMethods;
  }
}
