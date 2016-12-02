package de.labystudio.utils;

import aab;
import bet;
import de.labystudio.labymod.ConfigManager;
import de.labystudio.labymod.ModSettings;
import pk;
import wm;
import yt;
import zx;

public class LeftHand
{
  public static boolean use(pk entity)
  {
    boolean hand = settingsleftHand;
    if (entity == null) {
      return hand;
    }
    if (!settingsleftBow) {
      return hand;
    }
    if (!(entity instanceof bet)) {
      return hand;
    }
    bet clientPlayer = (bet)entity;
    if (bi == null) {
      return hand;
    }
    if (bi.h() == null) {
      return hand;
    }
    if (bi.h().b() == null) {
      return hand;
    }
    if ((bi.h().b() instanceof yt)) {
      return !hand;
    }
    return hand;
  }
  
  public static boolean use(zx itemToRender)
  {
    boolean hand = settingsleftHand;
    if ((itemToRender != null) && (itemToRender.b() != null) && ((itemToRender.b() instanceof aab))) {
      return false;
    }
    if (!settingsleftBow) {
      return hand;
    }
    if (itemToRender == null) {
      return hand;
    }
    if (itemToRender.b() == null) {
      return hand;
    }
    if ((itemToRender.b() instanceof yt)) {
      return !hand;
    }
    return hand;
  }
}
