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
    boolean hand = ConfigManager.settings.leftHand;
    if (entity == null) {
      return hand;
    }
    if (!ConfigManager.settings.leftBow) {
      return hand;
    }
    if (!(entity instanceof bet)) {
      return hand;
    }
    bet clientPlayer = (bet)entity;
    if (clientPlayer.bi == null) {
      return hand;
    }
    if (clientPlayer.bi.h() == null) {
      return hand;
    }
    if (clientPlayer.bi.h().b() == null) {
      return hand;
    }
    if ((clientPlayer.bi.h().b() instanceof yt)) {
      return !hand;
    }
    return hand;
  }
  
  public static boolean use(zx itemToRender)
  {
    boolean hand = ConfigManager.settings.leftHand;
    if ((itemToRender != null) && (itemToRender.b() != null) && ((itemToRender.b() instanceof aab))) {
      return false;
    }
    if (!ConfigManager.settings.leftBow) {
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
