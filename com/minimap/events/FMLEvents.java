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
    this.keyEvents = new ArrayList();
    this.oldKeyEvents = new ArrayList();
  }
  
  private boolean eventExists(avb kb)
  {
    for (KeyEvent o : this.keyEvents) {
      if (o.kb == kb) {
        return true;
      }
    }
    return oldEventExists(kb);
  }
  
  private boolean oldEventExists(avb kb)
  {
    for (KeyEvent o : this.oldKeyEvents) {
      if (o.kb == kb) {
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
    for (int i = 0; i < this.keyEvents.size(); i++)
    {
      KeyEvent ke = (KeyEvent)this.keyEvents.get(i);
      if (mc.m == null) {
        XaeroMinimap.ch.keyDown(ke.kb, ke.tickEnd, ke.isRepeat);
      }
      if (!ke.isRepeat)
      {
        if (!oldEventExists(ke.kb)) {
          this.oldKeyEvents.add(ke);
        }
        this.keyEvents.remove(i);
        i--;
      }
      else if (!ControlsHandler.isDown(ke.kb))
      {
        XaeroMinimap.ch.keyUp(ke.kb, ke.tickEnd);
        this.keyEvents.remove(i);
        i--;
      }
    }
    for (int i = 0; i < this.oldKeyEvents.size(); i++)
    {
      KeyEvent ke = (KeyEvent)this.oldKeyEvents.get(i);
      if (!ControlsHandler.isDown(ke.kb))
      {
        XaeroMinimap.ch.keyUp(ke.kb, ke.tickEnd);
        this.oldKeyEvents.remove(i);
        i--;
      }
    }
  }
}
