package com.minimap.events;

import avb;
import ave;
import com.minimap.XaeroMinimap;
import com.minimap.minimap.Minimap;
import com.minimap.settings.ModSettings;
import de.labystudio.modapi.EventHandler;
import de.labystudio.modapi.Listener;
import de.labystudio.modapi.events.GameTickEvent;
import java.util.ArrayList;

public class FMLEvents
  implements Listener
{
  public ArrayList<KeyEvent> keyEvents;
  public ArrayList<KeyEvent> oldKeyEvents;
  
  public FMLEvents()
  {
    keyEvents = new ArrayList();
    oldKeyEvents = new ArrayList();
  }
  
  private boolean eventExists(avb kb)
  {
    for (KeyEvent o : keyEvents) {
      if (kb == kb) {
        return true;
      }
    }
    return oldEventExists(kb);
  }
  
  private boolean oldEventExists(avb kb)
  {
    for (KeyEvent o : oldKeyEvents) {
      if (kb == kb) {
        return true;
      }
    }
    return false;
  }
  
  @EventHandler
  public void onGameTick(GameTickEvent e)
  {
    if ((XaeroMinimap.getSettings() != null) && ((XaeroMinimap.getSettings().getDeathpoints()) || (XaeroMinimap.getSettings().getShowWaypoints()) || (XaeroMinimap.getSettings().getShowIngameWaypoints()))) {
      Minimap.updateWaypoints();
    } else if (Minimap.waypoints != null) {
      Minimap.waypoints = null;
    }
    ave mc = XaeroMinimap.mc;
    for (int i = 0; i < keyEvents.size(); i++)
    {
      KeyEvent ke = (KeyEvent)keyEvents.get(i);
      if (m == null) {
        XaeroMinimap.ch.keyDown(kb, tickEnd, isRepeat);
      }
      if (!isRepeat)
      {
        if (!oldEventExists(kb)) {
          oldKeyEvents.add(ke);
        }
        keyEvents.remove(i);
        i--;
      }
      else if (!ControlsHandler.isDown(kb))
      {
        XaeroMinimap.ch.keyUp(kb, tickEnd);
        keyEvents.remove(i);
        i--;
      }
    }
    for (int i = 0; i < oldKeyEvents.size(); i++)
    {
      KeyEvent ke = (KeyEvent)oldKeyEvents.get(i);
      if (!ControlsHandler.isDown(kb))
      {
        XaeroMinimap.ch.keyUp(kb, tickEnd);
        oldKeyEvents.remove(i);
        i--;
      }
    }
  }
}
