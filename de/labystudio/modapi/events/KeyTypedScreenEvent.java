package de.labystudio.modapi.events;

import axu;
import de.labystudio.modapi.Event;
import de.labystudio.modapi.Listener;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class KeyTypedScreenEvent
  extends Event
{
  public static final Map<Listener, List<Method>> listenerMethods = new HashMap();
  private axu screen;
  private char typedChar;
  private int keyCode;
  
  public KeyTypedScreenEvent(axu screen, char typedChar, int keyCode)
  {
    this.screen = screen;
    this.typedChar = typedChar;
    this.keyCode = keyCode;
  }
  
  public axu getScreen()
  {
    return screen;
  }
  
  public int getKeyCode()
  {
    return keyCode;
  }
  
  public char getTypedChar()
  {
    return typedChar;
  }
  
  public Map<Listener, List<Method>> getListenerMethods()
  {
    return listenerMethods;
  }
}
