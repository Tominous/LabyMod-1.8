package mods.worldeditcui;

import ave;
import avs;
import axu;
import bew;
import java.io.IOException;
import java.util.List;

public class LabyModWorldEditCUISettings
  extends axu
{
  private LabyModWorldEditCUI controller;
  
  public LabyModWorldEditCUISettings(LabyModWorldEditCUI controller)
  {
    this.controller = controller;
  }
  
  public void b()
  {
    n.add(new avs(1, 2, 2, 60, 20, "WorldEditCUI: " + booleanToString(controller.visible)));
    n.add(new avs(2, 2, 24, 60, 20, "CLEAR SELECTION"));
  }
  
  protected void a(avs button)
    throws IOException
  {
    super.a(button);
    if (k == 1)
    {
      controller.visible = (!controller.visible);
      j = ("WorldEditCUI: " + booleanToString(controller.visible));
    }
    if ((k == 2) && (j.h != null)) {
      j.h.e("//sel");
    }
  }
  
  private String booleanToString(boolean bool)
  {
    return bool ? "§a§lON" : "§c§lOFF";
  }
}
