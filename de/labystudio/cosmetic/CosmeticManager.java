package de.labystudio.cosmetic;

import ave;
import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;
import de.labystudio.gui.GuiCosmetics;
import de.labystudio.labymod.ConfigManager;
import de.labystudio.labymod.LabyMod;
import de.labystudio.labymod.ModSettings;
import de.labystudio.utils.Utils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.UUID;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import pk;

public class CosmeticManager
{
  private HashMap<String, ArrayList<Cosmetic>> offlineCosmetics = new HashMap();
  private HashMap<String, ArrayList<Cosmetic>> onlineCosmetics = new HashMap();
  private LoadingCache<String, String> hashCache = CacheBuilder.newBuilder().expireAfterAccess(30L, TimeUnit.SECONDS).build(new CacheLoader()
  {
    public String load(String uuid)
      throws Exception
    {
      return Utils.sha1(uuid);
    }
  });
  public boolean colorPicker = false;
  
  public HashMap<String, ArrayList<Cosmetic>> getOfflineCosmetics()
  {
    return offlineCosmetics;
  }
  
  public HashMap<String, ArrayList<Cosmetic>> getOnlineCosmetics()
  {
    return onlineCosmetics;
  }
  
  public ArrayList<Cosmetic> getCosmetic(pk entityIn)
  {
    if (entityIn == null) {
      return null;
    }
    if (entityIn.aK() == null) {
      return null;
    }
    if (!settingscosmetics) {
      return null;
    }
    String hash = null;
    try
    {
      hash = (String)hashCache.get(entityIn.aK().toString());
    }
    catch (ExecutionException e)
    {
      e.printStackTrace();
      return null;
    }
    if (!offlineCosmetics.containsKey(hash)) {
      return null;
    }
    return (ArrayList)offlineCosmetics.get(hash);
  }
  
  public boolean hasCosmetic(EnumCosmetic[] types)
  {
    if (!LabyMod.getInstance().isInGame()) {
      return false;
    }
    ArrayList<Cosmetic> all = getCosmetic(Ah);
    if (all == null) {
      return false;
    }
    for (Cosmetic cos : all) {
      for (EnumCosmetic type : types) {
        if (type == cos.getType()) {
          return true;
        }
      }
    }
    return false;
  }
  
  public boolean hasCosmetic(EnumCosmetic type)
  {
    return hasCosmetic(new EnumCosmetic[] { type });
  }
  
  public double getNameTagHeight(pk entityIn)
  {
    return getNameTagHeight(getCosmetic(entityIn));
  }
  
  public double getNameTagHeight(ArrayList<Cosmetic> cos)
  {
    if (cos == null) {
      return 0.0D;
    }
    double out = 0.0D;
    for (Cosmetic cosmetic : cos) {
      if (height > out) {
        out = height;
      }
    }
    return out;
  }
  
  public void load()
  {
    if (settingscosmeticsWolfTail) {
      GuiCosmetics.setCosmetic(new Cosmetic(EnumCosmetic.WOLFTAIL, ""), false);
    }
    if (settingscosmeticsWings)
    {
      Cosmetic cos = new Cosmetic(EnumCosmetic.WINGS, "");
      a = settingscolorR;
      b = settingscolorG;
      c = settingscolorB;
      GuiCosmetics.setCosmetic(cos, false);
    }
    if (settingscosmeticsOcelot) {
      GuiCosmetics.setCosmetic(new Cosmetic(EnumCosmetic.OCELOTTAIL, ""), false);
    }
    if (settingscosmeticsDeadmau) {
      GuiCosmetics.setCosmetic(new Cosmetic(EnumCosmetic.DEADMAU5, ""), false);
    }
    if (settingscosmeticsBlaze) {
      GuiCosmetics.setCosmetic(new Cosmetic(EnumCosmetic.BLAZE, ""), false);
    }
    if (settingscosmeticsWither) {
      GuiCosmetics.setCosmetic(new Cosmetic(EnumCosmetic.WITHER, ""), false);
    }
    if (settingscosmeticsHat) {
      GuiCosmetics.setCosmetic(new Cosmetic(EnumCosmetic.HAT, ""), false);
    }
    if (settingscosmeticsTool != 0) {
      GuiCosmetics.setCosmetic(new Cosmetic(EnumCosmetic.TOOL, "1:" + settingscosmeticsTool), false);
    }
    if (settingscosmeticsHalo) {
      GuiCosmetics.setCosmetic(new Cosmetic(EnumCosmetic.HALO, ""), false);
    }
  }
}
