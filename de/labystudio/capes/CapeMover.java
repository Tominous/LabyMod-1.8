package de.labystudio.capes;

import de.labystudio.chat.Client;
import de.labystudio.chat.ClientConnection;
import de.labystudio.chat.EnumAlertType;
import de.labystudio.gui.GuiAchievementMod;
import de.labystudio.labymod.LabyMod;
import de.labystudio.labymod.Source;
import de.labystudio.utils.Color;
import de.labystudio.utils.Utils;

public class CapeMover
  extends Thread
{
  String move;
  MoveCallback callback;
  public static boolean moving = false;
  
  public CapeMover(String move, MoveCallback callback)
  {
    moving = true;
    this.move = move;
    this.callback = callback;
  }
  
  public void run()
  {
    LabyMod.getInstance().getClient().getClientConnection();String output = Utils.getContentString(Source.url_moveCape + "?username=" + LabyMod.getInstance().getPlayerName() + "&capeKey=" + ClientConnection.getCapeKey() + "&move=" + this.move);
    if (output.equalsIgnoreCase("OK"))
    {
      LabyMod.getInstance().achievementGui.displayBroadcast("CapeManager", Color.cl("a") + "Cape moved to " + this.move + "!", EnumAlertType.LABYMOD);
      CapeManager.refresh();
      this.callback.done();
    }
    else
    {
      LabyMod.getInstance().achievementGui.displayBroadcast("CapeManager", Color.cl("c") + "Error: " + output, EnumAlertType.LABYMOD);
      this.callback.failed();
    }
    moving = false;
  }
}
