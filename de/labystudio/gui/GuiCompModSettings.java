package de.labystudio.gui;

import ave;
import avs;
import axu;
import de.labystudio.labymod.ConfigManager;
import de.labystudio.labymod.ModSettings;
import de.labystudio.modapi.ModManager;
import de.labystudio.utils.Color;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

public class GuiCompModSettings
  extends axu
{
  axu lastScreen;
  avs cancel;
  
  public GuiCompModSettings(axu lastScreen)
  {
    this.lastScreen = lastScreen;
  }
  
  public void b()
  {
    cancel = new avs(0, l / 2 - 100, m / 6 + 168, "Done");
    n.add(cancel);
    int id = 1;
    boolean left = true;
    int y = 0;
    for (String mod : ModManager.getSettings().keySet())
    {
      int x = -100;
      int le = 98;
      if (!left) {
        x = 2;
      } else if (ModManager.getSettings().keySet().size() == id) {
        le = 200;
      }
      if (id <= 12)
      {
        avs b = new avs(id, l / 2 + x, 70 + y, le, 20, mod);
        l = settingsapi;
        n.add(b);
        if (!left) {
          y += 22;
        }
        left = !left;
        id++;
      }
    }
    super.b();
  }
  
  protected void a(char typedChar, int keyCode)
    throws IOException
  {
    if (keyCode == 1)
    {
      j.a(lastScreen);
      return;
    }
    super.a(typedChar, keyCode);
  }
  
  protected void a(avs button)
    throws IOException
  {
    int id = 1;
    for (axu mod : ModManager.getSettings().values())
    {
      if (k == id)
      {
        ModManager.updateLastScreen(this);
        j.a(mod);
        break;
      }
      id++;
    }
    if (k == 0)
    {
      j.a(lastScreen);
      return;
    }
    super.a(button);
  }
  
  public void a(int mouseX, int mouseY, float partialTicks)
  {
    c();
    String s = "s";
    if (ModManager.getSettings().size() == 1) {
      s = "";
    }
    a(q, Color.cl("c") + "LabyMod API is disabled! (LabyMod Settings -> Extras -> LabyMod API)", l / 2, 15, 16777215);
    super.a(mouseX, mouseY, partialTicks);
  }
}
