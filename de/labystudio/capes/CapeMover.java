package de.labystudio.capes;

import de.labystudio.chat.Client;
import de.labystudio.chat.ClientConnection;
import de.labystudio.chat.EnumAlertType;
import de.labystudio.gui.GuiAchievementMod;
import de.labystudio.labymod.LabyMod;
import de.labystudio.utils.Color;
import de.labystudio.utils.Utils;

public class CapeMover
  extends Thread
{
  String move;
  CapeCallback callback;
  public static boolean moving = false;
  
  public CapeMover(String move, CapeCallback callback)
  {
    moving = true;
    this.move = move;
    this.callback = callback;
  }
  
  public void run()
  {
    LabyMod.getInstance().getClient().getClientConnection();String output = Utils.getContentString("http://info.labymod.net/php/moveCape.php?username=" + LabyMod.getInstance().getPlayerName() + "&capeKey=" + ClientConnection.getCapeKey() + "&move=" + move);
    if (output.equalsIgnoreCase("OK"))
    {
      getInstanceachievementGui.displayBroadcast("CapeManager", Color.cl("a") + "Cape moved to " + move + "!", EnumAlertType.LABYMOD);
      LabyMod.getInstance().getCapeManager().refresh();
      callback.done();
    }
    else
    {
      getInstanceachievementGui.displayBroadcast("CapeManager", Color.cl("c") + "Error: " + output, EnumAlertType.LABYMOD);
      callback.failed(output);
    }
    moving = false;
  }
}
