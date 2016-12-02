package mods.worldeditcui;

import mods.worldeditcui.config.CUIConfiguration;
import mods.worldeditcui.debug.CUIDebug;
import mods.worldeditcui.exceptions.InitialisationException;
import mods.worldeditcui.render.region.BaseRegion;
import mods.worldeditcui.render.region.CuboidRegion;

public class WorldEditCUI
{
  public static final int PROTOCOL_VERSION = 3;
  private BaseRegion selection;
  private CUIDebug debugger;
  private CUIConfiguration configuration;
  private static WorldEditCUI instance;
  
  public void initialise()
  {
    instance = this;
    selection = new CuboidRegion(this);
    configuration = CUIConfiguration.create();
    debugger = new CUIDebug(this);
    try
    {
      selection.initialise();
      configuration.initialise();
      debugger.initialise();
    }
    catch (InitialisationException e)
    {
      e.printStackTrace();
    }
  }
  
  public static WorldEditCUI getInstance()
  {
    return instance;
  }
  
  public CUIConfiguration getConfiguration()
  {
    return configuration;
  }
  
  public CUIDebug getDebugger()
  {
    return debugger;
  }
  
  public BaseRegion getSelection()
  {
    return selection;
  }
  
  public void setSelection(BaseRegion selection)
  {
    this.selection = selection;
  }
}
