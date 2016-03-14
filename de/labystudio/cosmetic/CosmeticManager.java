package de.labystudio.cosmetic;

import de.labystudio.labymod.ConfigManager;
import de.labystudio.labymod.ModSettings;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.UUID;
import pk;

public class CosmeticManager
{
  private HashMap<UUID, ArrayList<Cosmetic>> cosmetics = new HashMap();
  
  public HashMap<UUID, ArrayList<Cosmetic>> getCosmetics()
  {
    return this.cosmetics;
  }
  
  public ArrayList<Cosmetic> getCosmetic(pk entityIn)
  {
    if (entityIn == null) {
      return null;
    }
    if (entityIn.aK() == null) {
      return null;
    }
    if (!ConfigManager.settings.cosmetics) {
      return null;
    }
    if (!this.cosmetics.containsKey(entityIn.aK())) {
      return null;
    }
    return (ArrayList)this.cosmetics.get(entityIn.aK());
  }
  
  public double getNameTagHeight(pk entityIn)
  {
    ArrayList<Cosmetic> cos = getCosmetic(entityIn);
    if (cos == null) {
      return 0.0D;
    }
    double out = 0.0D;
    for (Cosmetic cosmetic : cos) {
      if (cosmetic.height > out) {
        out = cosmetic.height;
      }
    }
    return out;
  }
}
