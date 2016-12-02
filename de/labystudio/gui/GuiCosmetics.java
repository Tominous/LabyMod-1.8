package de.labystudio.gui;

import ave;
import avs;
import avw;
import axu;
import de.labystudio.cosmetic.Cosmetic;
import de.labystudio.cosmetic.CosmeticManager;
import de.labystudio.cosmetic.CosmeticUser;
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
import java.util.Collection;
import java.util.HashMap;
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
    this.n.clear();
    boolean flag = false;
    int y = 0;
    int x = 0;
    UUID uuid = LabyMod.getInstance().getPlayerUUID();
    CosmeticUser cosmeticUser = null;
    String hash = Utils.sha1(uuid.toString());
    
    CosmeticUser cosmeticOnlineUser = uuid == null ? null : (CosmeticUser)LabyMod.getInstance().getCosmeticManager().getOnlineCosmetics().get(hash);
    CosmeticUser cosmeticOfflineUser = uuid == null ? null : (CosmeticUser)LabyMod.getInstance().getCosmeticManager().getOfflineCosmetics().get(hash);
    
    this.n.add(this.buttonEnableAll = new avs(2, 3, 3, 100, 20, "Cosmetics: " + (ConfigManager.settings.cosmetics ? Color.cl("a") + "Enabled" : new StringBuilder().append(Color.cl("c")).append("Disabled").toString())));
    this.n.add(this.buttonDone = new avs(0, this.l / 2 - 100, this.m - 43, "Done"));
    SliderOption option = new SliderOption(0.0F, 50.0F, new SliderCallback()
    {
      public void setValue(int i)
      {
        ConfigManager.settings.wingsScale = i;
      }
      
      public int getValue()
      {
        return ConfigManager.settings.wingsScale;
      }
      
      public String getTitle(int value)
      {
        return value + 75 + "%";
      }
    });
    this.n.add(new CustomSlider(10, this.l - 52, 4, option, 50, 20));
    for (EnumCosmetic enumCosmetic : EnumCosmetic.values()) {
      if ((enumCosmetic != EnumCosmetic.TAG) && (enumCosmetic != EnumCosmetic.NONE) && (enumCosmetic != EnumCosmetic.CENSORED) && (enumCosmetic != EnumCosmetic.PIXELBIESTER) && (enumCosmetic != EnumCosmetic.RANK) && (enumCosmetic != EnumCosmetic.HALLOWEEN) && (enumCosmetic != EnumCosmetic.XMAS))
      {
        avs button;
        this.n.add(button = new avs(-1, this.l / 2 + x - 175, this.m / 4 + y, 70, 20, Color.booleanToColor(Boolean.valueOf(isEnabled(enumCosmetic))) + enumCosmetic.name()));
        button.l = (this.selected != enumCosmetic);
        if ((cosmeticOnlineUser != null) && (cosmeticOnlineUser.getEnumList().contains(enumCosmetic)))
        {
          button.l = false;
          button.j = (Color.cl("7") + enumCosmetic.name() + Color.cl("a") + " ✔");
        }
        x += 70;
        if (x > 280)
        {
          y += 21;
          x = 0;
        }
      }
    }
    if (this.selected != null)
    {
      if (this.selected != EnumCosmetic.TOOL) {
        this.n.add(new avs(1, this.l / 2 - 100 - 50, this.m / 2, this.selected.name() + ": " + (isEnabled(this.selected) ? Color.cl("a") + "Enabled" : new StringBuilder().append(Color.cl("c")).append("Disabled").toString())));
      }
      if (this.selected == EnumCosmetic.TOOL)
      {
        this.toolId = new avw(-1, LabyMod.getInstance().draw.fontRenderer, this.l / 2, this.m / 2, 50, 20);
        this.toolId.a(ConfigManager.settings.cosmeticsTool + "");
      }
      if ((this.selected == EnumCosmetic.WOLFTAIL) || (this.selected == EnumCosmetic.OCELOTTAIL) || (this.selected == EnumCosmetic.DEADMAU5)) {
        this.n.add(this.buttonTemplate = new avs(3, this.l / 2 - 150, this.m / 2 + 25, "Download Skin Template"));
      }
    }
    this.n.add(new avs(4, 105, 3, 100, 20, Color.cl("e") + "Online Cosmetics"));
  }
  
  private boolean isEnabled(EnumCosmetic cosmetic)
  {
    return LabyMod.getInstance().getCosmeticManager().hasCosmetic(cosmetic);
  }
  
  public static Cosmetic setCosmetic(Cosmetic cosmetic, boolean overwrite)
  {
    UUID uuid = LabyMod.getInstance().getPlayerUUID();
    if (uuid == null) {
      return null;
    }
    String hash = Utils.sha1(uuid.toString());
    CosmeticUser user = (CosmeticUser)LabyMod.getInstance().getCosmeticManager().getOfflineCosmetics().get(hash);
    if (user == null) {
      user = new CosmeticUser();
    }
    if ((!user.getEnumList().contains(cosmetic.getType())) || (overwrite)) {
      user.addToCosmeticList(cosmetic);
    }
    user.updateData();
    LabyMod.getInstance().getCosmeticManager().getOfflineCosmetics().put(hash, user);
    return null;
  }
  
  private Cosmetic removeCosmetic(EnumCosmetic type)
  {
    UUID uuid = LabyMod.getInstance().getPlayerUUID();
    if (uuid == null) {
      return null;
    }
    String hash = Utils.sha1(uuid.toString());
    CosmeticUser user = (CosmeticUser)LabyMod.getInstance().getCosmeticManager().getOfflineCosmetics().get(hash);
    if (user == null) {
      return null;
    }
    user.getCosmeticHashMap().remove(type);
    return null;
  }
  
  protected void a(avs button)
    throws IOException
  {
    if (button.k == -1) {
      for (EnumCosmetic cosmetic : EnumCosmetic.values()) {
        if ((cosmetic != EnumCosmetic.TAG) && (cosmetic != EnumCosmetic.NONE)) {
          if (button.j.contains(cosmetic.name()))
          {
            this.selected = cosmetic;
            refreshButtons();
          }
        }
      }
    }
    if (button.k == 0)
    {
      ConfigManager.save();
      ave.A().a(this.lastScreen);
    }
    if (button.k == 2)
    {
      ConfigManager.settings.cosmetics = (!ConfigManager.settings.cosmetics);
      ConfigManager.save();
      refreshButtons();
    }
    if (button.k == 3) {
      LabyMod.getInstance().openWebpage("https://www.labymod.net/images/skin_template.png", true);
    }
    if (button.k == 4) {
      LabyMod.getInstance().openWebpage("https://www.labymod.net/#login", true);
    }
    if ((button.k == 1) && (this.selected != null))
    {
      if (isEnabled(this.selected))
      {
        removeCosmetic(this.selected);
        if (this.selected == EnumCosmetic.WOLFTAIL) {
          ConfigManager.settings.cosmeticsWolfTail = false;
        }
        if (this.selected == EnumCosmetic.WINGS) {
          ConfigManager.settings.cosmeticsWings = false;
        }
        if (this.selected == EnumCosmetic.OCELOTTAIL) {
          ConfigManager.settings.cosmeticsOcelot = false;
        }
        if (this.selected == EnumCosmetic.DEADMAU5) {
          ConfigManager.settings.cosmeticsDeadmau = false;
        }
        if (this.selected == EnumCosmetic.BLAZE) {
          ConfigManager.settings.cosmeticsBlaze = false;
        }
        if (this.selected == EnumCosmetic.WITHER) {
          ConfigManager.settings.cosmeticsWither = false;
        }
        if (this.selected == EnumCosmetic.HAT) {
          ConfigManager.settings.cosmeticsHat = false;
        }
        if (this.selected == EnumCosmetic.TOOL) {
          ConfigManager.settings.cosmeticsTool = 0;
        }
        if (this.selected == EnumCosmetic.HALO) {
          ConfigManager.settings.cosmeticsHalo = false;
        }
        ConfigManager.save();
      }
      else
      {
        Cosmetic cos = new Cosmetic(this.selected, "");
        if (this.selected == EnumCosmetic.WOLFTAIL) {
          ConfigManager.settings.cosmeticsWolfTail = true;
        }
        if (this.selected == EnumCosmetic.WINGS)
        {
          cos.a = ConfigManager.settings.colorR;
          cos.b = ConfigManager.settings.colorG;
          cos.c = ConfigManager.settings.colorB;
          ConfigManager.settings.cosmeticsWings = true;
        }
        if (this.selected == EnumCosmetic.OCELOTTAIL) {
          ConfigManager.settings.cosmeticsOcelot = true;
        }
        if (this.selected == EnumCosmetic.DEADMAU5) {
          ConfigManager.settings.cosmeticsDeadmau = true;
        }
        if (this.selected == EnumCosmetic.BLAZE) {
          ConfigManager.settings.cosmeticsBlaze = true;
        }
        if (this.selected == EnumCosmetic.WITHER) {
          ConfigManager.settings.cosmeticsWither = true;
        }
        if (this.selected == EnumCosmetic.HAT) {
          ConfigManager.settings.cosmeticsHat = true;
        }
        if (this.selected == EnumCosmetic.TOOL) {
          ConfigManager.settings.cosmeticsTool = 0;
        }
        if (this.selected == EnumCosmetic.HALO) {
          ConfigManager.settings.cosmeticsHalo = true;
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
    
    LabyMod.getInstance().draw.drawCenteredString("Free LabyMod Offline Cosmetics", this.l / 2, this.m / 4 - 20);
    LabyMod.getInstance().draw.drawRightString("Wings scale", this.l - 55, 10.0D);
    if (this.selected != null)
    {
      LabyMod.getInstance().draw.drawString("Offline cosmetic:", this.l / 2 - 150, this.m / 2 - 15);
      if (ave.A().h != null)
      {
        if ((this.selected == EnumCosmetic.TOOL) || (this.selected == EnumCosmetic.WINGS) || (this.selected == EnumCosmetic.WOLFTAIL) || (this.selected == EnumCosmetic.OCELOTTAIL)) {
          DrawUtils.drawEntityOnScreen(this.l / 2 + 50 + 60, this.m / 2 + 50 + 40, 20, mouseX - this.l / 2 - 10 - 100, -mouseY + this.m / 2 - 30 + 40, 180, 0, 
            ave.A().h);
        } else {
          DrawUtils.drawEntityOnScreen(this.l / 2 + 50 + 60, this.m / 2 + 50 + 40, 20, -mouseX + this.l / 2 + 10 + 100, -mouseY + this.m / 2 - 30 + 40, 0, 0, 
            ave.A().h);
        }
        if (this.j.F()) {
          LabyMod.getInstance().draw.drawString(Color.cl("c") + "Live preview only in multiplayer!", 3.0D, this.m - 10);
        }
      }
      if ((this.toolId != null) && (this.selected != null) && (this.selected == EnumCosmetic.TOOL))
      {
        LabyMod.getInstance().draw.drawRightString(Color.cl("c") + "OFF " + Color.cl("f") + "     Item id:", this.l / 2 - 10, this.m / 2 + 5);
        
        zx item = new zx(zw.b(ConfigManager.settings.cosmeticsTool));
        if ((item != null) && (item.b() != null)) {
          LabyMod.getInstance().draw.drawItem(item, this.l / 2 - 85, this.m / 2);
        }
        this.toolId.g();
      }
      if (this.selected == EnumCosmetic.WINGS)
      {
        int x = 50;
        
        int colorPickerPositionY = this.m / 2 + 40;
        a(this.l / 2 - 100 - x, colorPickerPositionY, this.l / 2 + 100 - x, colorPickerPositionY + 10, Integer.MIN_VALUE);
        float percent = ConfigManager.settings.colorR / 255.0F * 200.0F;
        a((int)percent + this.l / 2 - 101 - x, colorPickerPositionY - 3, (int)percent + 2 + this.l / 2 - 99 - x, colorPickerPositionY + 10 + 3, Integer.MAX_VALUE);
        a((int)percent + this.l / 2 - 100 - x, colorPickerPositionY - 2, (int)percent + 2 + this.l / 2 - 100 - x, colorPickerPositionY + 10 + 2, 
          Color.toRGB(ConfigManager.settings.colorR, 0, 0, 200));
        LabyMod.getInstance().draw.drawCenteredString(Color.cl("c") + ConfigManager.settings.colorR + "", this.l / 2 - x, colorPickerPositionY + 1);
        
        colorPickerPositionY = this.m / 2 + 60;
        a(this.l / 2 - 100 - x, colorPickerPositionY, this.l / 2 + 100 - x, colorPickerPositionY + 10, Integer.MIN_VALUE);
        percent = ConfigManager.settings.colorG / 255.0F * 200.0F;
        a((int)percent + this.l / 2 - 101 - x, colorPickerPositionY - 3, (int)percent + 2 + this.l / 2 - 99 - x, colorPickerPositionY + 10 + 3, Integer.MAX_VALUE);
        a((int)percent + this.l / 2 - 100 - x, colorPickerPositionY - 2, (int)percent + 2 + this.l / 2 - 100 - x, colorPickerPositionY + 10 + 2, 
          Color.toRGB(0, ConfigManager.settings.colorG, 0, 200));
        LabyMod.getInstance().draw.drawCenteredString(Color.cl("2") + ConfigManager.settings.colorG + "", this.l / 2 - x, colorPickerPositionY + 1);
        
        colorPickerPositionY = this.m / 2 + 80;
        a(this.l / 2 - 100 - x, colorPickerPositionY, this.l / 2 + 100 - x, colorPickerPositionY + 10, Integer.MIN_VALUE);
        percent = ConfigManager.settings.colorB / 255.0F * 200.0F;
        a((int)percent + this.l / 2 - 101 - x, colorPickerPositionY - 3, (int)percent + 2 + this.l / 2 - 99 - x, colorPickerPositionY + 10 + 3, Integer.MAX_VALUE);
        a((int)percent + this.l / 2 - 100 - x, colorPickerPositionY - 2, (int)percent + 2 + this.l / 2 - 100 - x, colorPickerPositionY + 10 + 2, 
          Color.toRGB(0, 0, ConfigManager.settings.colorB, 200));
        LabyMod.getInstance().draw.drawCenteredString(Color.cl("9") + ConfigManager.settings.colorB + "", this.l / 2 - x, colorPickerPositionY + 1);
      }
    }
    super.a(mouseX, mouseY, partialTicks);
  }
  
  protected void a(char typedChar, int keyCode)
    throws IOException
  {
    try
    {
      if ((this.toolId != null) && (this.toolId.a(typedChar, keyCode)))
      {
        try
        {
          ConfigManager.settings.cosmeticsTool = Integer.parseInt(this.toolId.b());
        }
        catch (Exception error)
        {
          ConfigManager.settings.cosmeticsTool = 0;
          this.toolId.a("0");
        }
        if (zw.b(ConfigManager.settings.cosmeticsTool) != null)
        {
          setCosmetic(new Cosmetic(EnumCosmetic.TOOL, "1:" + ConfigManager.settings.cosmeticsTool), true);
        }
        else
        {
          ConfigManager.settings.cosmeticsTool = 0;
          removeCosmetic(EnumCosmetic.TOOL);
        }
        avw field = this.toolId;
        refreshButtons();
        this.toolId = field;
      }
      if (keyCode == 1)
      {
        ConfigManager.save();
        ave.A().a(this.lastScreen);
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
    if ((this.selected != null) && (this.selected == EnumCosmetic.TOOL) && (this.toolId != null)) {
      this.toolId.a(mouseX, mouseY, mouseButton);
    }
    super.a(mouseX, mouseY, mouseButton);
  }
  
  protected void a(int mouseX, int mouseY, int clickedMouseButton, long timeSinceLastClick)
  {
    int x = -50;
    int colorPickerPositionY = this.m / 2 + 40;
    if ((mouseX > this.l / 2 + x - 100) && (mouseX < this.l / 2 + x + 100) && 
      (mouseY > colorPickerPositionY) && (mouseY < colorPickerPositionY + 10))
    {
      ConfigManager.settings.colorR = ((int)((mouseX - (this.l / 2 - 100 + x)) * 1.285D));
      
      Cosmetic cos = LabyMod.getInstance().getCosmeticManager().getCosmeticByType(EnumCosmetic.WINGS);
      if (cos != null)
      {
        cos.a = ConfigManager.settings.colorR;
        setCosmetic(cos, true);
      }
    }
    colorPickerPositionY = this.m / 2 + 60;
    if ((mouseX > this.l / 2 + x - 100) && (mouseX < this.l / 2 + x + 100) && 
      (mouseY > colorPickerPositionY) && (mouseY < colorPickerPositionY + 10))
    {
      ConfigManager.settings.colorG = ((int)((mouseX - (this.l / 2 - 100 + x)) * 1.285D));
      
      Cosmetic cos = LabyMod.getInstance().getCosmeticManager().getCosmeticByType(EnumCosmetic.WINGS);
      if (cos != null)
      {
        cos.b = ConfigManager.settings.colorG;
        setCosmetic(cos, true);
      }
    }
    colorPickerPositionY = this.m / 2 + 80;
    if ((mouseX > this.l / 2 + x - 100) && (mouseX < this.l / 2 + x + 100) && 
      (mouseY > colorPickerPositionY) && (mouseY < colorPickerPositionY + 10))
    {
      ConfigManager.settings.colorB = ((int)((mouseX - (this.l / 2 - 100 + x)) * 1.285D));
      
      Cosmetic cos = LabyMod.getInstance().getCosmeticManager().getCosmeticByType(EnumCosmetic.WINGS);
      if (cos != null)
      {
        cos.c = ConfigManager.settings.colorB;
        setCosmetic(cos, true);
      }
    }
    super.a(mouseX, mouseY, clickedMouseButton, timeSinceLastClick);
  }
}
