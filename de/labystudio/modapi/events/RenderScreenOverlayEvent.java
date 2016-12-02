package de.labystudio.modapi.events;

import axu;
import de.labystudio.modapi.Event;
import de.labystudio.modapi.Listener;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RenderScreenOverlayEvent
  extends Event
{
  public static final Map<Listener, List<Method>> listenerMethods = new HashMap();
  private axu screen;
  private int mouseX;
  private int mouseY;
  
  public RenderScreenOverlayEvent(axu screen, int mouseX, int mouseY)
  {
    this.screen = screen;
    this.mouseX = mouseX;
    this.mouseY = mouseY;
  }
  
  public axu getScreen()
  {
    return screen;
  }
  
  public int getMouseX()
  {
    return mouseX;
  }
  
  public int getMouseY()
  {
    return mouseY;
  }
  
  public Map<Listener, List<Method>> getListenerMethods()
  {
    return listenerMethods;
  }
}
