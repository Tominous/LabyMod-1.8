package de.labystudio.modapi.events;

import de.labystudio.modapi.Event;
import de.labystudio.modapi.Listener;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import pr;

public class RenderNametagEvent
  extends Event
{
  public static final Map<Listener, List<Method>> listenerMethods = new HashMap();
  private pr entity;
  private double x;
  private double y;
  private double z;
  
  public Map<Listener, List<Method>> getListenerMethods()
  {
    return listenerMethods;
  }
  
  public RenderNametagEvent(pr entity, double x, double y, double z)
  {
    this.entity = entity;
    this.x = x;
    this.y = y;
    this.z = z;
  }
  
  public pr getEntity()
  {
    return entity;
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
}
