package mods.betterhat.main;

import de.labystudio.modapi.ModAPI;
import de.labystudio.modapi.Module;

public class BetterHat
  extends Module
{
  private static BetterHat instance;
  
  public void onEnable()
  {
    instance = this;
    ModAPI.registerListener(new BetterHatListener());
  }
  
  public static BetterHat getInstance()
  {
    return instance;
  }
  
  public static final String[] fTextureOffsetX = { "field_78803_o", "r", "textureOffsetX" };
  public static final String[] fTextureOffsetY = { "field_78813_p", "s", "textureOffsetY" };
}
