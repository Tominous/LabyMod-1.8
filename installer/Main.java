package installer;

import java.awt.Rectangle;
import java.io.File;

public class Main
{
  public static String modVersion = "2.7.5";
  public static String mcVersion = "1.8.8";
  public static String mcVanillaJar = "1.8.8";
  public static String installerStatus = "None";
  public static Installer mainFrame;
  public static Modlist offFrame;
  public static String notCompatible = null;
  public static String optifine = "1.8.8_HD_U_G7";
  public static File[] mods = null;
  public static boolean installing = false;
  public static String debug = "[DEBUG] ";
  public static String compatibleMods = "http://LabyMod.net/compatible_mods";
  public static int status = 0;
  protected static boolean installMods = false;
  public static String text = "This installer will install LabyMod and if you want install other mods automaticly\nIf you're done you can start the Launcher and select the new profile.\n\nImportant:\nBe sure you have closed minecraft and have launched the installer from your desktop.";
  
  public static void main(String[] args)
  {
    Installer.main();
    Modlist.main();
    
    new Update().start();
  }
  
  static class Update
    extends Thread
  {
    public void run()
    {
      for (;;)
      {
        Main.offFrame.setBounds(Main.mainFrame.getBounds().x + 332, Main.mainFrame.getBounds().y, Main.offFrame.getWidth(), Main.offFrame.getHeight());
        if ((Main.mainFrame.isFocused()) && 
          (Utils.getPlatform() == Utils.OS.WINDOWS))
        {
          Main.offFrame.setAlwaysOnTop(true);
          Main.offFrame.setAlwaysOnTop(false);
        }
      }
    }
  }
}
