package de.labystudio.gui;

import ave;
import avs;
import avw;
import axu;
import de.labystudio.cosmetic.Cosmetic;
import de.labystudio.cosmetic.CosmeticManager;
import de.labystudio.cosmetic.EnumCosmetic;
import de.labystudio.labymod.ConfigManager;
import de.labystudio.labymod.LabyMod;
import de.labystudio.labymod.ModSettings;
import de.labystudio.slider.CustomSlider;
import de.labystudio.slider.SliderCallback;
import de.labystudio.slider.SliderOption;
import de.labystudio.utils.Color;
import de.labystudio.utils.DrawUtils;
import de.labystudio.utils.Utils;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import zw;
import zx;

public class GuiCosmetics
  extends axu
{
  private axu lastScreen;
  private EnumCosmetic selected;
  private avw toolId;
  private avs buttonEnableAll;
  private avs buttonDone;
  private avs buttonTemplate;
  
  public GuiCosmetics(axu lastScreen)
  {
    this.lastScreen = lastScreen;
  }
  
  public void b()
  {
    refreshButtons();
  }
  
  private void refreshButtons()
  {
    n.clear();
    boolean flag = false;
    int y = 0;
    int x = 0;
    UUID uuid = LabyMod.getInstance().getPlayerUUID();
    ArrayList<Cosmetic> onlineList = new ArrayList();
    String hash = Utils.sha1(uuid.toString());
    if ((uuid != null) && (LabyMod.getInstance().getCosmeticManager().getOnlineCosmetics().containsKey(hash))) {
      onlineList = (ArrayList)LabyMod.getInstance().getCosmeticManager().getOnlineCosmetics().get(hash);
    }
    n.add(
      buttonEnableAll = new avs(2, 3, 3, 100, 20, "Cosmetics: " + (settingscosmetics ? Color.cl("a") + "Enabled" : new StringBuilder().append(Color.cl("c")).append("Disabled").toString())));
    n.add(buttonDone = new avs(0, l / 2 - 100, m - 43, "Done"));
    SliderOption option = new SliderOption(0.0F, 50.0F, new SliderCallback()
    {
      public void setValue(int i)
      {
        settingswingsScale = i;
      }
      
      public int getValue()
      {
        return settingswingsScale;
      }
      
      public String getTitle(int value)
      {
        return value + 75 + "%";
      }
    });
    n.add(new CustomSlider(10, l - 52, 4, option, 50, 20));
    for (EnumCosmetic cosmetic : EnumCosmetic.values()) {
      if ((cosmetic != EnumCosmetic.TAG) && (cosmetic != EnumCosmetic.NONE) && (cosmetic != EnumCosmetic.CENSORED) && (cosmetic != EnumCosmetic.PIXELBIESTER) && (cosmetic != EnumCosmetic.RANK) && (cosmetic != EnumCosmetic.HALLOWEEN))
      {
        avs button;
        n.add(button = new avs(-1, l / 2 + x - 175, m / 4 + y, 70, 20, Color.booleanToColor(Boolean.valueOf(isEnabled(cosmetic))) + cosmetic.name()));
        l = (selected != cosmetic);
        for (Cosmetic onlineCos : onlineList) {
          if (onlineCos.getType() == cosmetic)
          {
            l = false;
            j = (Color.cl("7") + cosmetic.name() + Color.cl("a") + " ✔");
          }
        }
        x += 70;
        if (x > 280)
        {
          y += 21;
          x = 0;
        }
      }
    }
    if (selected != null)
    {
      if (selected != EnumCosmetic.TOOL) {
        n.add(new avs(1, l / 2 - 100 - 50, m / 2, selected.name() + ": " + (
          isEnabled(selected) ? Color.cl("a") + "Enabled" : new StringBuilder().append(Color.cl("c")).append("Disabled").toString())));
      }
      if (selected == EnumCosmetic.TOOL)
      {
        toolId = new avw(-1, getInstancedraw.fontRenderer, l / 2, m / 2, 50, 20);
        toolId.a(settingscosmeticsTool + "");
      }
      if ((selected == EnumCosmetic.WOLFTAIL) || (selected == EnumCosmetic.OCELOTTAIL) || (selected == EnumCosmetic.DEADMAU5)) {
        n.add(buttonTemplate = new avs(3, l / 2 - 150, m / 2 + 25, "Download Skin Template"));
      }
    }
    n.add(new avs(4, 105, 3, 80, 20, "Open Webpanel"));
  }
  
  private boolean isEnabled(EnumCosmetic cosmetic)
  {
    return getCosmetic(cosmetic) != null;
  }
  
  private Cosmetic getCosmetic(EnumCosmetic cosmetic)
  {
    UUID uuid = LabyMod.getInstance().getPlayerUUID();
    if (uuid == null) {
      return null;
    }
    String hash = Utils.sha1(uuid.toString());
    if (!LabyMod.getInstance().getCosmeticManager().getOfflineCosmetics().containsKey(hash)) {
      return null;
    }
    ArrayList<Cosmetic> list = (ArrayList)LabyMod.getInstance().getCosmeticManager().getOfflineCosmetics().get(hash);
    for (Cosmetic cos : list) {
      if (cos.getType() == cosmetic) {
        return cos;
      }
    }
    return null;
  }
  
  public static Cosmetic setCosmetic(Cosmetic cosmetic, boolean overwrite)
  {
    UUID uuid = LabyMod.getInstance().getPlayerUUID();
    if (uuid == null) {
      return null;
    }
    String hash = Utils.sha1(uuid.toString());
    if (!LabyMod.getInstance().getCosmeticManager().getOfflineCosmetics().containsKey(hash)) {
      LabyMod.getInstance().getCosmeticManager().getOfflineCosmetics().put(hash, new ArrayList());
    }
    ArrayList<Cosmetic> setList = new ArrayList();
    ArrayList<Cosmetic> list = (ArrayList)LabyMod.getInstance().getCosmeticManager().getOfflineCosmetics().get(hash);
    for (Cosmetic cos : list) {
      if ((cos.getType() != cosmetic.getType()) || (!overwrite)) {
        setList.add(cos);
      }
    }
    if (overwrite) {
      setList.add(cosmetic);
    }
    LabyMod.getInstance().getCosmeticManager().getOfflineCosmetics().put(hash, setList);
    return null;
  }
  
  private Cosmetic removeCosmetic(EnumCosmetic type)
  {
    UUID uuid = LabyMod.getInstance().getPlayerUUID();
    if (uuid == null) {
      return null;
    }
    String hash = Utils.sha1(uuid.toString());
    if (!LabyMod.getInstance().getCosmeticManager().getOfflineCosmetics().containsKey(hash)) {
      return null;
    }
    ArrayList<Cosmetic> list = (ArrayList)LabyMod.getInstance().getCosmeticManager().getOfflineCosmetics().get(hash);
    Iterator it = list.iterator();
    while (it.hasNext())
    {
      Cosmetic next = (Cosmetic)it.next();
      if (next.getType() == type) {
        it.remove();
      }
    }
    return null;
  }
  
  protected void a(avs button)
    throws IOException
  {
    if (k == -1) {
      for (EnumCosmetic cosmetic : EnumCosmetic.values()) {
        if ((cosmetic != EnumCosmetic.TAG) && (cosmetic != EnumCosmetic.NONE)) {
          if (j.contains(cosmetic.name()))
          {
            selected = cosmetic;
            refreshButtons();
          }
        }
      }
    }
    if (k == 0)
    {
      ConfigManager.save();
      ave.A().a(lastScreen);
    }
    if (k == 2)
    {
      settingscosmetics = (!settingscosmetics);
      ConfigManager.save();
      refreshButtons();
    }
    if (k == 3) {
      LabyMod.getInstance().openWebpage("https://www.labymod.net/images/skin_template.png");
    }
    if (k == 4) {
      LabyMod.getInstance().openWebpage("https://labymod.net/#getKeyModal");
    }
    if ((k == 1) && (selected != null))
    {
      if (isEnabled(selected))
      {
        removeCosmetic(selected);
        if (selected == EnumCosmetic.WOLFTAIL) {
          settingscosmeticsWolfTail = false;
        }
        if (selected == EnumCosmetic.WINGS) {
          settingscosmeticsWings = false;
        }
        if (selected == EnumCosmetic.OCELOTTAIL) {
          settingscosmeticsOcelot = false;
        }
        if (selected == EnumCosmetic.DEADMAU5) {
          settingscosmeticsDeadmau = false;
        }
        if (selected == EnumCosmetic.BLAZE) {
          settingscosmeticsBlaze = false;
        }
        if (selected == EnumCosmetic.WITHER) {
          settingscosmeticsWither = false;
        }
        if (selected == EnumCosmetic.HAT) {
          settingscosmeticsHat = false;
        }
        if (selected == EnumCosmetic.TOOL) {
          settingscosmeticsTool = 0;
        }
        if (selected == EnumCosmetic.HALO) {
          settingscosmeticsHalo = false;
        }
        ConfigManager.save();
      }
      else
      {
        Cosmetic cos = new Cosmetic(selected, "");
        if (selected == EnumCosmetic.WOLFTAIL) {
          settingscosmeticsWolfTail = true;
        }
        if (selected == EnumCosmetic.WINGS)
        {
          a = settingscolorR;
          b = settingscolorG;
          c = settingscolorB;
          settingscosmeticsWings = true;
        }
        if (selected == EnumCosmetic.OCELOTTAIL) {
          settingscosmeticsOcelot = true;
        }
        if (selected == EnumCosmetic.DEADMAU5) {
          settingscosmeticsDeadmau = true;
        }
        if (selected == EnumCosmetic.BLAZE) {
          settingscosmeticsBlaze = true;
        }
        if (selected == EnumCosmetic.WITHER) {
          settingscosmeticsWither = true;
        }
        if (selected == EnumCosmetic.HAT) {
          settingscosmeticsHat = true;
        }
        if (selected == EnumCosmetic.TOOL) {
          settingscosmeticsTool = 0;
        }
        if (selected == EnumCosmetic.HALO) {
          settingscosmeticsHalo = true;
        }
        setCosmetic(cos, true);
        ConfigManager.save();
      }
      refreshButtons();
    }
  }
  
  public void a(int mouseX, int mouseY, float partialTicks)
  {
    c(0);
    
    getInstancedraw.drawCenteredString("LabyMod Cosmetics", l / 2, m / 4 - 20);
    getInstancedraw.drawRightString("Wings scale", l - 55, 10.0D);
    if (selected != null)
    {
      getInstancedraw.drawString("Offline cosmetic:", l / 2 - 150, m / 2 - 15);
      if (Ah != null)
      {
        if ((selected == EnumCosmetic.TOOL) || (selected == EnumCosmetic.WINGS) || (selected == EnumCosmetic.WOLFTAIL) || (selected == EnumCosmetic.OCELOTTAIL)) {
          DrawUtils.drawEntityOnScreen(l / 2 + 50 + 60, m / 2 + 50 + 40, 20, mouseX - l / 2 - 10 - 100, -mouseY + m / 2 - 30 + 40, 180, 
            Ah);
        } else {
          DrawUtils.drawEntityOnScreen(l / 2 + 50 + 60, m / 2 + 50 + 40, 20, -mouseX + l / 2 + 10 + 100, -mouseY + m / 2 - 30 + 40, 0, 
            Ah);
        }
        if (j.F()) {
          getInstancedraw.drawString(Color.cl("c") + "Preview is not live!", 3.0D, m - 10);
        }
      }
      if ((toolId != null) && (selected != null) && (selected == EnumCosmetic.TOOL))
      {
        getInstancedraw.drawRightString(Color.cl("c") + "OFF " + Color.cl("f") + "     Item id:", l / 2 - 10, m / 2 + 5);
        zx item = new zx(zw.b(settingscosmeticsTool));
        if ((item != null) && (item.b() != null)) {
          getInstancedraw.drawItem(item, l / 2 - 85, m / 2);
        }
        toolId.g();
      }
      if (selected == EnumCosmetic.WINGS)
      {
        int x = 50;
        
        int colorPickerPositionY = m / 2 + 40;
        a(l / 2 - 100 - x, colorPickerPositionY, l / 2 + 100 - x, colorPickerPositionY + 10, Integer.MIN_VALUE);
        float percent = settingscolorR / 255.0F * 200.0F;
        a((int)percent + l / 2 - 101 - x, colorPickerPositionY - 3, (int)percent + 2 + l / 2 - 99 - x, colorPickerPositionY + 10 + 3, Integer.MAX_VALUE);
        
        a((int)percent + l / 2 - 100 - x, colorPickerPositionY - 2, (int)percent + 2 + l / 2 - 100 - x, colorPickerPositionY + 10 + 2, 
          Color.toRGB(settingscolorR, 0, 0, 200));
        getInstancedraw.drawCenteredString(Color.cl("c") + settingscolorR + "", l / 2 - x, colorPickerPositionY + 1);
        
        colorPickerPositionY = m / 2 + 60;
        a(l / 2 - 100 - x, colorPickerPositionY, l / 2 + 100 - x, colorPickerPositionY + 10, Integer.MIN_VALUE);
        percent = settingscolorG / 255.0F * 200.0F;
        a((int)percent + l / 2 - 101 - x, colorPickerPositionY - 3, (int)percent + 2 + l / 2 - 99 - x, colorPickerPositionY + 10 + 3, Integer.MAX_VALUE);
        
        a((int)percent + l / 2 - 100 - x, colorPickerPositionY - 2, (int)percent + 2 + l / 2 - 100 - x, colorPickerPositionY + 10 + 2, 
          Color.toRGB(0, settingscolorG, 0, 200));
        getInstancedraw.drawCenteredString(Color.cl("2") + settingscolorG + "", l / 2 - x, colorPickerPositionY + 1);
        
        colorPickerPositionY = m / 2 + 80;
        a(l / 2 - 100 - x, colorPickerPositionY, l / 2 + 100 - x, colorPickerPositionY + 10, Integer.MIN_VALUE);
        percent = settingscolorB / 255.0F * 200.0F;
        a((int)percent + l / 2 - 101 - x, colorPickerPositionY - 3, (int)percent + 2 + l / 2 - 99 - x, colorPickerPositionY + 10 + 3, Integer.MAX_VALUE);
        
        a((int)percent + l / 2 - 100 - x, colorPickerPositionY - 2, (int)percent + 2 + l / 2 - 100 - x, colorPickerPositionY + 10 + 2, 
          Color.toRGB(0, 0, settingscolorB, 200));
        getInstancedraw.drawCenteredString(Color.cl("9") + settingscolorB + "", l / 2 - x, colorPickerPositionY + 1);
      }
    }
    super.a(mouseX, mouseY, partialTicks);
  }
  
  protected void a(char typedChar, int keyCode)
    throws IOException
  {
    try
    {
      if ((toolId != null) && (toolId.a(typedChar, keyCode)))
      {
        try
        {
          settingscosmeticsTool = Integer.parseInt(toolId.b());
        }
        catch (Exception error)
        {
          settingscosmeticsTool = 0;
          toolId.a("0");
        }
        if (zw.b(settingscosmeticsTool) != null)
        {
          setCosmetic(new Cosmetic(EnumCosmetic.TOOL, "1:" + settingscosmeticsTool), true);
        }
        else
        {
          settingscosmeticsTool = 0;
          removeCosmetic(EnumCosmetic.TOOL);
        }
        avw field = toolId;
        refreshButtons();
        toolId = field;
      }
      if (keyCode == 1)
      {
        ConfigManager.save();
        ave.A().a(lastScreen);
        return;
      }
    }
    catch (Exception error)
    {
      error.printStackTrace();
    }
    super.a(typedChar, keyCode);
  }
  
  protected void a(int mouseX, int mouseY, int mouseButton)
    throws IOException
  {
    if ((selected != null) && (selected == EnumCosmetic.TOOL) && (toolId != null)) {
      toolId.a(mouseX, mouseY, mouseButton);
    }
    super.a(mouseX, mouseY, mouseButton);
  }
  
  protected void a(int mouseX, int mouseY, int clickedMouseButton, long timeSinceLastClick)
  {
    int x = -50;
    int colorPickerPositionY = m / 2 + 40;
    if ((mouseX > l / 2 + x - 100) && (mouseX < l / 2 + x + 100) && 
      (mouseY > colorPickerPositionY) && (mouseY < colorPickerPositionY + 10))
    {
      settingscolorR = ((int)((mouseX - (l / 2 - 100 + x)) * 1.285D));
      
      Cosmetic cos = getCosmetic(EnumCosmetic.WINGS);
      if (cos != null)
      {
        a = settingscolorR;
        setCosmetic(cos, true);
      }
    }
    colorPickerPositionY = m / 2 + 60;
    if ((mouseX > l / 2 + x - 100) && (mouseX < l / 2 + x + 100) && 
      (mouseY > colorPickerPositionY) && (mouseY < colorPickerPositionY + 10))
    {
      settingscolorG = ((int)((mouseX - (l / 2 - 100 + x)) * 1.285D));
      
      Cosmetic cos = getCosmetic(EnumCosmetic.WINGS);
      if (cos != null)
      {
        b = settingscolorG;
        setCosmetic(cos, true);
      }
    }
    colorPickerPositionY = m / 2 + 80;
    if ((mouseX > l / 2 + x - 100) && (mouseX < l / 2 + x + 100) && 
      (mouseY > colorPickerPositionY) && (mouseY < colorPickerPositionY + 10))
    {
      settingscolorB = ((int)((mouseX - (l / 2 - 100 + x)) * 1.285D));
      
      Cosmetic cos = getCosmetic(EnumCosmetic.WINGS);
      if (cos != null)
      {
        c = settingscolorB;
        setCosmetic(cos, true);
      }
    }
    super.a(mouseX, mouseY, clickedMouseButton, timeSinceLastClick);
  }
}
