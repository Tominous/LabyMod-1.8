package de.labystudio.modapi.events;

import bbj;
import de.labystudio.modapi.Event;
import de.labystudio.modapi.Listener;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import pk;

public class ModelBipedRotationAnglesEvent
  extends Event
{
  public static final Map<Listener, List<Method>> listenerMethods = new HashMap();
  bbj modelBiped;
  pk entity;
  private boolean cancelled;
  
  public ModelBipedRotationAnglesEvent(bbj modelBiped, pk entityIn)
  {
    this.modelBiped = modelBiped;
    this.entity = entityIn;
  }
  
  public bbj getModelBiped()
  {
    return this.modelBiped;
  }
  
  public pk getEntity()
  {
    return this.entity;
  }
  
  public void setCancelled(boolean cancelled)
  {
    this.cancelled = cancelled;
  }
  
  public boolean isCancelled()
  {
    return this.cancelled;
  }
  
  public Map<Listener, List<Method>> getListenerMethods()
  {
    return listenerMethods;
  }
}
