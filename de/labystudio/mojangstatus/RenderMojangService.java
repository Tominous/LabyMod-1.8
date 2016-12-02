package de.labystudio.mojangstatus;

import ave;
import bfl;
import bmj;
import de.labystudio.labymod.ConfigManager;
import de.labystudio.labymod.LabyMod;
import de.labystudio.labymod.ModSettings;
import de.labystudio.utils.Color;
import de.labystudio.utils.DrawUtils;
import de.labystudio.utils.ServiceStatus;
import de.labystudio.utils.Utils;
import java.util.ArrayList;
import java.util.HashMap;
import jy;

public class RenderMojangService
{
  public static void renderOnMultiplayerGui()
  {
    if (!settingsmojangStatus) {
      return;
    }
    bfl.E();
    int y = 0;
    ArrayList<String> services = new ArrayList(getInstancemojangStatus.keySet());
    for (String service : services)
    {
      ServiceStatus status = (ServiceStatus)getInstancemojangStatus.get(service);
      float i = (float)((System.currentTimeMillis() + y * 4) % 1000L * 0.1D) / 10.0F;
      if (i > 5.0F) {
        i = 10.0F - i;
      }
      i = 0.1F * i + 0.5F;
      long time = (System.currentTimeMillis() - status.getCreated()) / 1000L;
      String downTime = time + "s";
      if (time >= 60L) {
        downTime = Utils.parseTimeNormal(time);
      }
      float a = 0.3F;
      if (status.getColor().equals("red")) {
        a = i;
      }
      float b = 0.3F;
      if (status.getColor().equals("green"))
      {
        b = i;
        downTime = "Is back online!";
        if (time > 10L) {
          getInstancemojangStatus.remove(service);
        }
      }
      float c = 0.3F;
      if (status.getColor().equals("yellow"))
      {
        a = i;
        b = i;
      }
      bfl.c(a, b, c);
      getInstancemc.P().a(new jy("textures/gui/achievement/achievement_background.png"));
      getInstancedraw.b(1, 35 + y, 257, 459, 23, 23);
      getInstancedraw.drawRect(25.0D, 38 + y, (getInstancedraw.getStringWidth(service) + 40) * 0.7D, 45 + y, Color.toRGB(50, 50, 50, 170));
      getInstancedraw.drawRect(25.0D, 48 + y, (getInstancedraw.getStringWidth(downTime) + 49) * 0.6D, 54 + y, Color.toRGB(70, 70, 70, 170));
      getInstancedraw.drawString(Color.cl(status.getChatColor()) + service, 27.0D, 39 + y, 0.7D);
      getInstancedraw.drawString(downTime, 27.0D, 49 + y, 0.6D);
      getInstancedraw.drawCenteredString(status.getStatus(), 13.0D, 45 + y, 0.5D);
      y += 23;
    }
    bfl.F();
  }
}
