package installer;

import installer.labystudio.frame.FrameMain;
import java.io.File;
import java.util.ArrayList;

public class Main
{
  public static String modVersion = "2.7.7";
  public static String mcVersion = "1.8.8";
  public static File[] mods = null;
  public static String debug = "[DEBUG] ";
  public static String text = "This installer will automatically install LabyMod and if you wish,\nyou can add several mods provided on our website.\n\nIf you've successfully installed LabyMod,\nopen the Minecraft launcher and select the LabyMod profile.\n\nMake sure you've closed Minecraft before the\ninstallation and launch the installer from your desktop.";
  public static ArrayList<ModTemplate> modTempates = new ArrayList();
  
  private static void setupTemplates()
  {
    String dir = "https://www.labymod.net/mods/";
    modTempates.add(new ModTemplate("Optifine 1.8.8 HD U G7", true, dir + "OptiFine_1.8.8_HD_U_G7.jar", false));
    modTempates.add(new ModTemplate("Toggle Sneak/Sprint", false, dir + "ToggleSneak_v5_mc1.8.8.zip", true));
    modTempates.add(new ModTemplate("Damage Indicator", false, dir + "DamageIndicator_v3.zip", true));
    modTempates.add(new ModTemplate("XaerosMinimap", false, dir + "XaerosMinimap_v2.zip", true));
    modTempates.add(new ModTemplate("DirectionHUD", false, dir + "DirectionHud_v3_mc1.8.8.zip", false));
    modTempates.add(new ModTemplate("ItemPhysics", false, dir + "ItemPhysics_v1_mc1.8.8.zip", false));
  }
  
  public static class ModTemplate
  {
    private String modName;
    private boolean recommended;
    private String download;
    private boolean prohibited;
    
    public ModTemplate(String modName, boolean recommended, String download, boolean prohibited)
    {
      this.modName = modName;
      this.recommended = recommended;
      this.download = download;
      this.prohibited = prohibited;
    }
    
    public boolean isEnabled()
    {
      return this.recommended;
    }
    
    public String getModName()
    {
      return this.modName;
    }
    
    public void setEnabled(boolean enabled)
    {
      this.recommended = enabled;
    }
    
    public String getDownload()
    {
      return this.download;
    }
    
    public boolean isProhibited()
    {
      return this.prohibited;
    }
  }
  
  public static void main(String[] args)
  {
    setupTemplates();
    new FrameMain();
  }
}
