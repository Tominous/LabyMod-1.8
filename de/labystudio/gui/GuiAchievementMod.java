package de.labystudio.gui;

import ave;
import avn;
import avp;
import avr;
import bfl;
import bmj;
import de.labystudio.chat.EnumAlertType;
import de.labystudio.labymod.ConfigManager;
import de.labystudio.labymod.LabyMod;
import de.labystudio.labymod.ModSettings;
import de.labystudio.utils.DrawUtils;
import de.labystudio.utils.ModGui;
import de.labystudio.utils.TextureManager;
import java.util.ArrayList;
import jy;

public class GuiAchievementMod
  extends avp
{
  private static final jy achievementBg = new jy("textures/gui/achievement/achievement_background.png");
  private ave mc;
  private int width;
  private int height;
  private boolean large = false;
  private static final String __OBFID = "CL_00000721";
  ArrayList<String> title = new ArrayList();
  ArrayList<String> message = new ArrayList();
  public ArrayList<Long> time = new ArrayList();
  public ArrayList<Boolean> out = new ArrayList();
  public ArrayList<Integer> type = new ArrayList();
  
  public GuiAchievementMod(ave mc)
  {
    this.mc = mc;
  }
  
  public void displayBroadcast(String title, String message, EnumAlertType type)
  {
    if ((type == EnumAlertType.CHAT) && (!settingsalertsChat)) {
      return;
    }
    if ((type == EnumAlertType.TEAMSPEAK) && (!settingsalertsTeamSpeak)) {
      return;
    }
    this.title.add(title);
    this.message.add(message);
    time.add(Long.valueOf(ave.J()));
    out.add(Boolean.valueOf(false));
    this.type.add(Integer.valueOf(0));
    single();
  }
  
  boolean single = true;
  
  private void single()
  {
    single = true;
  }
  
  public void displayMessage(String player, String message, EnumAlertType type)
  {
    if ((type == EnumAlertType.CHAT) && (!settingsalertsChat)) {
      return;
    }
    if ((type == EnumAlertType.TEAMSPEAK) && (!settingsalertsTeamSpeak)) {
      return;
    }
    if (title.contains(player))
    {
      int i = title.indexOf(player);
      this.message.set(i, message);
      out.set(i, Boolean.valueOf(false));
      time.set(i, Long.valueOf(ave.J() - 150L));
      return;
    }
    title.add(player);
    this.message.add(message);
    time.add(Long.valueOf(ave.J()));
    out.add(Boolean.valueOf(false));
    this.type.add(Integer.valueOf(1));
    single();
  }
  
  private void updateAchievementWindowScale()
  {
    bfl.b(0, 0, mc.d, mc.e);
    bfl.n(5889);
    bfl.D();
    bfl.n(5888);
    bfl.D();
    width = mc.d;
    height = mc.e;
    avr var1 = new avr(mc);
    width = var1.a();
    height = var1.b();
    bfl.m(256);
    bfl.n(5889);
    bfl.D();
    bfl.a(0.0D, width, height, 0.0D, 1000.0D, 3000.0D);
    bfl.n(5888);
    bfl.D();
    bfl.b(0.0F, 0.0F, -2000.0F);
    if (time.size() >= 3) {
      single = false;
    }
  }
  
  public void updateAchievementWindow()
  {
    int y = 0;
    for (int stack = this.time.size() - 1; stack > 0; stack--)
    {
      String title = (String)this.title.get(stack);
      String message = (String)this.message.get(stack);
      long time = ((Long)this.time.get(stack)).longValue();
      message = ModGui.shortString(message, getInstancedraw.getWidth() / 8);
      double var1 = (ave.J() - time) / 3000.0D;
      
      double backup = var1;
      if ((var1 < 0.0D) || (var1 > 1.0D)) {
        out.set(stack, Boolean.valueOf(true));
      }
      if (var1 > 0.5D) {
        var1 = 0.5D;
      }
      updateAchievementWindowScale();
      double var3 = var1 * 2.0D;
      if (var3 > 1.0D) {
        var3 = 2.0D - var3;
      }
      var3 *= 4.0D;
      var3 = 1.0D - var3;
      if (var3 < 0.0D) {
        var3 = 0.0D;
      }
      var3 *= var3;
      var3 *= var3;
      int var5 = width - 160;
      int var6 = 0 - (int)(var3 * 36.0D);
      int x = 0;
      bfl.c(1.0F, 1.0F, 1.0F, 1.0F);
      if (((Boolean)out.get(stack)).booleanValue())
      {
        int var62 = (int)(var6 - backup * 300.0D + 300.0D);
        if (var62 + 72 < 0.0D)
        {
          this.title.remove(stack);
          this.message.remove(stack);
          this.time.remove(stack);
          out.remove(stack);
          this.type.remove(stack);
          continue;
        }
        if (!single) {
          x = var62 * 4 * -1;
        } else {
          var6 = var62;
        }
      }
      var6 += y;
      y = var6 + 32;
      int type = ((Integer)this.type.get(stack)).intValue();
      bfl.w();
      mc.P().a(achievementBg);
      bfl.f();
      draw(title, message, var6, type, x);
    }
  }
  
  private void draw(String title, String message, int y, int type, int xx)
  {
    int length = getInstancedraw.getStringWidth(message);
    if (length < 160) {
      length = 160;
    }
    if (length > 160) {
      length += 10;
    }
    if (type == 1) {
      length += 26;
    }
    length += 10;
    int x = getInstancedraw.getWidth() - length + xx;
    if (length > 160)
    {
      for (int i = length; i >= 0; i--) {
        if (i <= length - 10) {
          b(x + i, y, 96, 202, 7, 32);
        }
      }
      b(x + length - 10, y, 246, 202, 10, 32);
    }
    else
    {
      b(x, y, 96, 202, 160, 32);
    }
    if (type == 0)
    {
      mc.k.a(title, x + 6, y + 7, 65280);
      mc.k.a(message, x + 6, y + 18, -1);
    }
    if (type == 1)
    {
      mc.k.a(title, x + 6 + 24, y + 7, 65280);
      mc.k.a(message, x + 6 + 24, y + 18, -1);
      bfl.c(1.0F, 1.0F, 1.0F, 1.0F);
      getInstancetextureManager.drawPlayerHead(title, x + 5, y + 8, 0.7D);
    }
  }
}
