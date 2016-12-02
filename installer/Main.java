package installer;

import installer.labystudio.frame.FrameMain;
import java.io.File;
import java.util.ArrayList;

public class Main
{
  public static final String modVersion = "2.7.9";
  public static final String mcVersion = "1.8.8";
  public static final String mcClientUrl = "https://launcher.mojang.com/mc/game/1.8.8/client/0983f08be6a4e624f5d85689d1aca869ed99c738/client.jar";
  public static File[] mods = null;
  public static File path = Utils.getWorkingDirectory();
  public static final String debug = "[DEBUG] ";
  public static final String text = "This installer will automatically install LabyMod and if you wish,\nyou can add several mods provided on our website.\n\nIf you've successfully installed LabyMod,\nopen the Minecraft launcher and select the LabyMod profile.\n\nMake sure you've closed Minecraft before the\ninstallation and launch the installer from your desktop.";
  public static ArrayList<ModTemplate> modTempates = new ArrayList();
  
  private static void setupTemplates()
  {
    String dir = "http://www.labymod.net/mods/";
    modTempates.add(new ModTemplate("OptiFine 1.8.8 HD U H5", "sp614x", false, dir + "OptiFine_1.8.8_HD_U_H5.jar", false));
    modTempates.add(new ModTemplate("OptiFine 1.8.8 HD U G7", "sp614x", true, dir + "OptiFine_1.8.8_HD_U_G7.jar", false));
    modTempates.add(new ModTemplate("Resourcepack24Mod", "LabyStudio", true, dir + "Resourcepack24Mod_mc1.8.8.jar", false));
    modTempates.add(new ModTemplate("Toggle Sneak/Sprint", "deez", false, dir + "ToggleSneak_v5_mc1.8.8.zip", true));
    modTempates.add(new ModTemplate("ItemPhysics", "CreativeMD", false, dir + "ItemPhysics_v1_mc1.8.8.zip", false));
    modTempates.add(new ModTemplate("BetterHat", "thehippomaster21", false, dir + "BetterHat_v1_mc1.8.8.zip", false));
    modTempates.add(new ModTemplate("Damage Indicator", "LabyStudio", false, dir + "DamageIndicator_v3.zip", true));
    modTempates.add(new ModTemplate("WorldEdit CUI", "lahwran", false, dir + "WorldEditCUI_v1_mc1.8.8.zip", false));
    modTempates.add(new ModTemplate("XaerosMinimap", "xaero96", false, dir + "XaerosMinimap_v2.zip", true));
    modTempates.add(new ModTemplate("DirectionHUD", "bspkrs", false, dir + "DirectionHud_v3_mc1.8.8.zip", false));
    modTempates.add(new ModTemplate("AccountManager", "qlow", false, dir + "AccountManager_v1_mc1.8.8.zip", false));
    modTempates.add(new ModTemplate("BattysCoordinates", "BatHeart", false, dir + "BattysCoordinates_v1_mc1.8.8.zip", false));
    modTempates.add(new ModTemplate("Keystrokes Mod", "Fyu", false, dir + "Keystrokes_v1_mc1.8.8.zip", false));
    modTempates.add(new ModTemplate("SettingsProfile Mod", "LabyStudio", false, dir + "SettingsProfilesMod_mc1.8.8.zip", false));
  }
  
  public static void main(String[] args)
  {
    System.setProperty("java.net.preferIPv4Stack", "true");
    setupTemplates();
    new FrameMain();
  }
}
