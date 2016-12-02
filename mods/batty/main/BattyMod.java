package mods.batty.main;

import ave;
import de.labystudio.modapi.ModAPI;
import de.labystudio.modapi.Module;

public class BattyMod
  extends Module
{
  private static BattyMod instance;
  private BattyUI batheartgui = null;
  private BattyListener listener = new BattyListener();
  private int updateCounter;
  
  public void onEnable()
  {
    instance = this;
    ModAPI.registerListener(listener);
    batheartgui = new BattyUI(ave.A());
  }
  
  public static BattyMod getInstance()
  {
    return instance;
  }
  
  public BattyUI getBatheartgui()
  {
    return batheartgui;
  }
  
  public BattyListener getListener()
  {
    return listener;
  }
  
  public int getUpdateCounter()
  {
    return updateCounter;
  }
  
  public void upUpdateCounter()
  {
    updateCounter += 1;
  }
  
  public void setBatheartgui(BattyUI batheartgui)
  {
    this.batheartgui = batheartgui;
  }
}
