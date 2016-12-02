package pw.cinque.keystrokes.render;

import ave;
import avh;
import avn;
import avp;
import avr;
import de.labystudio.modapi.EventHandler;
import de.labystudio.modapi.Listener;
import de.labystudio.modapi.events.RenderOverlayEvent;
import pw.cinque.keystrokes.KeystrokesMod;

public class KeystrokesRenderer
  implements Listener
{
  private ave mc;
  
  public KeystrokesRenderer()
  {
    mc = ave.A();
  }
  
  @EventHandler
  public void onRender(RenderOverlayEvent event)
  {
    if ((mc.m != null) || (mc.t.aB)) {
      return;
    }
    avr resolution = new avr(mc);
    
    int x = 5;
    int y = 5;
    switch (pw.cinque.keystrokes.settings.Location.values()[KeystrokesMod.location])
    {
    case TOP_LEFT: 
      break;
    case TOP_RIGHT: 
      x += resolution.a() - KeystrokesMod.width;
      break;
    case BOTTOM_LEFT: 
      y += resolution.b() - KeystrokesMod.height;
      break;
    case BOTTOM_RIGHT: 
      x += resolution.a() - KeystrokesMod.width;
      y += resolution.b() - KeystrokesMod.height;
      break;
    default: 
      return;
    }
    for (Key key : KeystrokesMod.keys)
    {
      int textWidth = mc.k.a(key.getName());
      avp.a(x + key.getX(), y + key.getY(), x + key.getX() + key.getWidth(), y + key.getY() + key.getHeight(), key.isPressed() ? 1728053247 : 1711276032);
      mc.k.a(key.getName(), x + key.getX() + key.getWidth() / 2 - textWidth / 2, y + key.getY() + key.getHeight() / 2 - 4, key.isPressed() ? -16777216 : -1);
    }
  }
}
