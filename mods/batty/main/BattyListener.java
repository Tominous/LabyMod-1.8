package mods.batty.main;

import avb;
import aya;
import de.labystudio.modapi.EventHandler;
import de.labystudio.modapi.Listener;
import de.labystudio.modapi.events.GameTickEvent;
import de.labystudio.modapi.events.InitScreenEvent;
import de.labystudio.modapi.events.RenderOverlayEvent;

public class BattyListener
  implements Listener
{
  @EventHandler
  public void onRenderOverlay(RenderOverlayEvent event)
  {
    BattyUtils.updateTimer(BattyMod.getInstance().getUpdateCounter());
    BattyMod.getInstance().getBatheartgui().renderPlayerInfo();
  }
  
  @EventHandler
  public void onInitScreen(InitScreenEvent event)
  {
    if ((event.getScreen() instanceof aya))
    {
      BattyMod.getInstance().getBatheartgui().timerRunning = false;
      BattyConfig.storeRuntimeOptions();
    }
  }
  
  @EventHandler
  public void onGameTick(GameTickEvent event)
  {
    BattyMod.getInstance().upUpdateCounter();
    BattyUI gui = BattyMod.getInstance().getBatheartgui();
    if (BattyUI.hideunhideCoordskey.f()) {
      gui.hideUnhideCoords();
    }
    if (BattyUI.hideunhideTimerkey.f()) {
      gui.hideUnhideStopWatch();
    }
    if (BattyUI.resetTimerkey.f()) {
      gui.resetTimer = true;
    }
    if (BattyUI.startstopTimerkey.f()) {
      gui.toggleTimer = true;
    }
    if (BattyUI.moveCoordScreenPos.f()) {
      gui.rotateScreenCoords();
    }
    if (BattyUI.copyCoordsClipboard.f()) {
      gui.copyScreenCoords();
    }
    if (BattyUI.moveTimerScreenPos.f()) {
      gui.rotateScreenTimer();
    }
    if (BattyUI.hideunhideFPSkey.f()) {
      gui.hideUnhideFPS();
    }
    if (BattyUI.moveFPSScreenPos.f()) {
      gui.rotateScreenFPS();
    }
  }
}
