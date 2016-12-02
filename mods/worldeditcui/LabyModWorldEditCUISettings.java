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
    this.n.add(new avs(1, 2, 2, 60, 20, "WorldEditCUI: " + booleanToString(this.controller.visible)));
    this.n.add(new avs(2, 2, 24, 60, 20, "CLEAR SELECTION"));
  }
  
  protected void a(avs button)
    throws IOException
  {
    super.a(button);
    if (button.k == 1)
    {
      this.controller.visible = (!this.controller.visible);
      button.j = ("WorldEditCUI: " + booleanToString(this.controller.visible));
    }
    if ((button.k == 2) && (this.j.h != null)) {
      this.j.h.e("//sel");
    }
  }
  
  private String booleanToString(boolean bool)
  {
    return bool ? "§a§lON" : "§c§lOFF";
  }
}
