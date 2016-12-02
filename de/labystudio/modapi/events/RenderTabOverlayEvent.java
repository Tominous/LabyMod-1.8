package de.labystudio.modapi.events;

import aul;
import de.labystudio.modapi.Event;
import de.labystudio.modapi.Listener;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RenderTabOverlayEvent
  extends Event
{
  public static final Map<Listener, List<Method>> listenerMethods = new HashMap();
  private aul scorePlayerTeam;
  private String result = null;
  
  public Map<Listener, List<Method>> getListenerMethods()
  {
    return listenerMethods;
  }
  
  public RenderTabOverlayEvent(aul scorePlayerTeam)
  {
    this.scorePlayerTeam = scorePlayerTeam;
  }
  
  public aul getScorePlayerTeam()
  {
    return this.scorePlayerTeam;
  }
  
  public String getResult()
  {
    return this.result;
  }
  
  public void setResult(String result)
  {
    this.result = result;
  }
}
