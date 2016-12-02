package mods.itemphysic;

import ave;
import avs;
import axu;
import de.labystudio.modapi.ModAPI;
import de.labystudio.modapi.Module;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import mods.itemphysic.config.Configuration;
import mods.itemphysic.config.Property;

public class ItemPhysic
  extends Module
{
  public static float rotationSpeed = 1.0F;
  private static Configuration config;
  
  public void onEnable()
  {
    Map<String, Object> defaultValues = new HashMap();
    defaultValues.put("rotationSpeed", Float.valueOf(rotationSpeed));
    
    config = new Configuration("ItemPhysics_LabyMod", defaultValues);
    rotationSpeed = config.get("rotationSpeed").getFloat();
    
    ModAPI.addSettingsButton("ItemPhysic", new ItemPhysicGUI());
  }
  
  public static class ItemPhysicGUI
    extends axu
  {
    private GuiSlideControl rotationSpeedControl;
    
    public void b()
    {
      n.clear();
      n.add(rotationSpeedControl = new GuiSlideControl(1, l / 2 - 50, m / 2 - 10, 100, 20, "Rotation Speed: ", 0.0F, 100.0F, ItemPhysic.rotationSpeed, true));
      
      n.add(new avs(2, l / 2 - 30, m / 2 + 20, 60, 20, "Save"));
      
      super.b();
    }
    
    protected void a(int mouseX, int mouseY, int mouseButton)
      throws IOException
    {
      super.a(mouseX, mouseY, mouseButton);
      
      ItemPhysic.rotationSpeed = rotationSpeedControl.GetValueAsFloat();
      ItemPhysic.config.set("rotationSpeed", new Property(String.valueOf(ItemPhysic.rotationSpeed)));
      ItemPhysic.config.save();
    }
    
    public void a(int mouseX, int mouseY, float partialTicks)
    {
      super.c();
      super.a(mouseX, mouseY, partialTicks);
    }
    
    protected void b(int mouseX, int mouseY, int state)
    {
      super.b(mouseX, mouseY, state);
      
      ItemPhysic.rotationSpeed = rotationSpeedControl.GetValueAsFloat();
      ItemPhysic.config.set("rotationSpeed", new Property(String.valueOf(ItemPhysic.rotationSpeed)));
      ItemPhysic.config.save();
    }
    
    protected void a(avs button)
      throws IOException
    {
      if (k == 2) {
        j.a(ModAPI.getLastScreen());
      }
      super.a(button);
    }
  }
}
