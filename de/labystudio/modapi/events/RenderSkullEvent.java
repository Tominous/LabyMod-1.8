package de.labystudio.modapi.events;

import alo;
import de.labystudio.modapi.Event;
import de.labystudio.modapi.Listener;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RenderSkullEvent
  extends Event
{
  public static final Map<Listener, List<Method>> listenerMethods = new HashMap();
  private alo skull;
  private double x;
  private double y;
  private double z;
  
  public RenderSkullEvent(alo skull, double x, double y, double z)
  {
    this.skull = skull;
    this.x = x;
    this.y = y;
    this.z = z;
  }
  
  public alo getSkull()
  {
    return skull;
  }
  
  public double getX()
  {
    return x;
  }
  
  public double getY()
  {
    return y;
  }
  
  public double getZ()
  {
    return z;
  }
  
  public Map<Listener, List<Method>> getListenerMethods()
  {
    return listenerMethods;
  }
}
