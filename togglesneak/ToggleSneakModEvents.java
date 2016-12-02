package togglesneak;

import ave;
import avn;
import avr;
import awv;
import de.labystudio.modapi.EventHandler;
import de.labystudio.modapi.Listener;
import de.labystudio.modapi.events.RenderOverlayEvent;

public class ToggleSneakModEvents
  implements Listener
{
  private static String hudText = "ToggleSneak";
  
  public static void SetHUDText(String text)
  {
    hudText = text;
  }
  
  @EventHandler
  public void onRender(RenderOverlayEvent e)
  {
    if (ToggleSneakMod.optionShowHUDText)
    {
      avr resolution = new avr(ave.A());
      switch (PositionMode.getByName(ToggleSneakMod.optionPositionMode))
      {
      case CUSTOM: 
        Ak.a(hudText, ToggleSneakMod.optionHUDTextPosX, ToggleSneakMod.optionHUDTextPosY, 16777215);
        break;
      case BOTTOMRIGHT: 
        Ak.a(hudText, resolution.a() - Ak.a(hudText) - 2, resolution.b() - 10, 16777215);
        break;
      case UNDERCHAT: 
        if (!(Am instanceof awv)) {
          Ak.a(hudText, 2, resolution.b() - 10, 16777215);
        }
        break;
      case TOPCENTER: 
        Ak.a(hudText, resolution.a() / 2 - Ak.a(hudText) / 2, 2, 16777215);
      }
    }
  }
}
