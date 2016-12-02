package mods.worldeditcui;

import avc;
import ave;
import bdb;
import bew;
import de.labystudio.modapi.ModAPI;
import de.labystudio.modapi.Module;
import mods.worldeditcui.event.listeners.CUIListenerWorldRender;

public class LabyModWorldEditCUI
  extends Module
{
  private static final int DELAYED_HELO_TICKS = 10;
  private static final String CHANNEL_WECUI = "WECUI";
  public WorldEditCUI controller;
  private bdb lastWorld;
  private bew lastPlayer;
  boolean visible;
  private boolean alwaysOnTop;
  private CUIListenerWorldRender worldRenderListener;
  private int delayedHelo;
  
  public LabyModWorldEditCUI()
  {
    visible = true;
    alwaysOnTop = false;
    delayedHelo = 0;
  }
  
  public void onEnable()
  {
    (controller = new WorldEditCUI()).initialise();
    
    worldRenderListener = new CUIListenerWorldRender(controller, ave.A());
    
    ModAPI.addSettingsButton("WorldEditCUI", new LabyModWorldEditCUISettings(this));
    ModAPI.registerListener(new LabyModWorldEditCUIEvents(this));
  }
  
  public void onPostRenderEntities(double partialTicks)
  {
    if ((visible) && (!alwaysOnTop))
    {
      avc.a();
      worldRenderListener.onRender(partialTicks);
      avc.b();
    }
  }
  
  public WorldEditCUI getController()
  {
    return controller;
  }
}
