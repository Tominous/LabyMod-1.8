package de.labystudio.cosmetic;

import ave;
import bew;
import de.labystudio.labymod.LabyMod;
import java.util.Collection;

public class CosmeticTick
{
  public static float LOCAL_XMAS_YAW = 0.0F;
  public static float LOCAL_XMAS_TICK_VALUE = 0.0F;
  public static float LOCAL_XMAS_FPS_VALUE = 0.0F;
  
  public static void tickAllCosmetics()
  {
    if (!LabyMod.getInstance().isInGame()) {
      return;
    }
    CosmeticUser cosmeticUser = LabyMod.getInstance().getCosmeticManager().getCosmeticUser(ave.A().h);
    if (cosmeticUser == null) {
      return;
    }
    if (cosmeticUser.getEnumList().contains(EnumCosmetic.XMAS))
    {
      float pos = ave.A().h.y;
      if (pos != LOCAL_XMAS_YAW) {
        LOCAL_XMAS_TICK_VALUE += Math.abs(pos - LOCAL_XMAS_YAW) / 190.0F;
      }
      if (LOCAL_XMAS_TICK_VALUE > 0.0F) {
        LOCAL_XMAS_TICK_VALUE -= 0.15F;
      }
      if (LOCAL_XMAS_TICK_VALUE > 1.0F) {
        LOCAL_XMAS_TICK_VALUE = 1.0F;
      }
      if (LOCAL_XMAS_TICK_VALUE < 0.0F) {
        LOCAL_XMAS_TICK_VALUE = 0.0F;
      }
      LOCAL_XMAS_YAW = pos;
    }
  }
}
