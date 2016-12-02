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
import java.util.Collection;
import java.util.HashMap;
import java.util.UUID;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import pk;

public class CosmeticManager
{
  private HashMap<String, CosmeticUser> offlineCosmetics = new HashMap();
  private HashMap<String, CosmeticUser> onlineCosmetics = new HashMap();
  private LoadingCache<String, String> hashCache = CacheBuilder.newBuilder().expireAfterAccess(30L, TimeUnit.SECONDS).build(new CacheLoader()
  {
    public String load(String uuid)
      throws Exception
    {
      return Utils.sha1(uuid);
    }
  });
  public boolean colorPicker = false;
  
  public HashMap<String, CosmeticUser> getOfflineCosmetics()
  {
    return this.offlineCosmetics;
  }
  
  public HashMap<String, CosmeticUser> getOnlineCosmetics()
  {
    return this.onlineCosmetics;
  }
  
  public CosmeticUser getCosmeticUser(pk entityIn)
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
    String hash = null;
    try
    {
      hash = (String)this.hashCache.get(entityIn.aK().toString());
    }
    catch (ExecutionException e)
    {
      e.printStackTrace();
      return null;
    }
    if (!this.offlineCosmetics.containsKey(hash)) {
      return null;
    }
    return (CosmeticUser)this.offlineCosmetics.get(hash);
  }
  
  public boolean hasCosmetic(EnumCosmetic[] types)
  {
    if (!LabyMod.getInstance().isInGame()) {
      return false;
    }
    CosmeticUser user = getCosmeticUser(ave.A().h);
    if (user == null) {
      return false;
    }
    for (EnumCosmetic cos : types) {
      if (user.getEnumList().contains(cos)) {
        return true;
      }
    }
    return false;
  }
  
  public Cosmetic getCosmeticByType(EnumCosmetic type)
  {
    if (!LabyMod.getInstance().isInGame()) {
      return null;
    }
    CosmeticUser user = getCosmeticUser(ave.A().h);
    return user == null ? null : (Cosmetic)user.getCosmeticHashMap().get(type);
  }
  
  public boolean hasCosmetic(EnumCosmetic type)
  {
    if (!LabyMod.getInstance().isInGame()) {
      return false;
    }
    CosmeticUser user = getCosmeticUser(ave.A().h);
    return user == null ? false : user.getEnumList().contains(type);
  }
  
  public double getNameTagHeight(pk entityIn)
  {
    CosmeticUser user = getCosmeticUser(entityIn);
    return user == null ? 0.0D : user.getNameTagHeight();
  }
  
  public void load()
  {
    if (ConfigManager.settings.cosmeticsWolfTail) {
      GuiCosmetics.setCosmetic(new Cosmetic(EnumCosmetic.WOLFTAIL, ""), false);
    }
    if (ConfigManager.settings.cosmeticsWings)
    {
      Cosmetic cos = new Cosmetic(EnumCosmetic.WINGS, "");
      cos.a = ConfigManager.settings.colorR;
      cos.b = ConfigManager.settings.colorG;
      cos.c = ConfigManager.settings.colorB;
      GuiCosmetics.setCosmetic(cos, false);
    }
    if (ConfigManager.settings.cosmeticsOcelot) {
      GuiCosmetics.setCosmetic(new Cosmetic(EnumCosmetic.OCELOTTAIL, ""), false);
    }
    if (ConfigManager.settings.cosmeticsDeadmau) {
      GuiCosmetics.setCosmetic(new Cosmetic(EnumCosmetic.DEADMAU5, ""), false);
    }
    if (ConfigManager.settings.cosmeticsBlaze) {
      GuiCosmetics.setCosmetic(new Cosmetic(EnumCosmetic.BLAZE, ""), false);
    }
    if (ConfigManager.settings.cosmeticsWither) {
      GuiCosmetics.setCosmetic(new Cosmetic(EnumCosmetic.WITHER, ""), false);
    }
    if (ConfigManager.settings.cosmeticsHat) {
      GuiCosmetics.setCosmetic(new Cosmetic(EnumCosmetic.HAT, ""), false);
    }
    if (ConfigManager.settings.cosmeticsTool != 0) {
      GuiCosmetics.setCosmetic(new Cosmetic(EnumCosmetic.TOOL, "1:" + ConfigManager.settings.cosmeticsTool), false);
    }
    if (ConfigManager.settings.cosmeticsHalo) {
      GuiCosmetics.setCosmetic(new Cosmetic(EnumCosmetic.HALO, ""), false);
    }
  }
}
