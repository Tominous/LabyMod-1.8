package de.labystudio.cosmetic;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

public class CosmeticUser
{
  private HashMap<EnumCosmetic, Cosmetic> cosmeticList = new HashMap();
  private double maxNameTagHeight = -1.0D;
  
  public CosmeticUser()
  {
    this(null);
  }
  
  public CosmeticUser(ArrayList<Cosmetic> setList)
  {
    if (setList != null) {
      for (Cosmetic cos : setList) {
        addToCosmeticList(cos);
      }
    }
    updateData();
  }
  
  public Collection<EnumCosmetic> getEnumList()
  {
    return this.cosmeticList.keySet();
  }
  
  public HashMap<EnumCosmetic, Cosmetic> getCosmeticHashMap()
  {
    return this.cosmeticList;
  }
  
  public Collection<Cosmetic> getCosmeticsData()
  {
    return this.cosmeticList.values();
  }
  
  public void addToCosmeticList(Cosmetic cosmetic)
  {
    this.cosmeticList.put(cosmetic.getType(), cosmetic);
  }
  
  public void addAllToCosmeticList(ArrayList<Cosmetic> cosmetics)
  {
    for (Cosmetic cos : cosmetics) {
      addToCosmeticList(cos);
    }
  }
  
  public double getNameTagHeight()
  {
    return this.maxNameTagHeight == -1.0D ? 0.0D : this.maxNameTagHeight;
  }
  
  public void updateData()
  {
    this.maxNameTagHeight = 0.0D;
    for (Cosmetic cosmetic : this.cosmeticList.values()) {
      if (cosmetic.height > this.maxNameTagHeight) {
        this.maxNameTagHeight = cosmetic.height;
      }
    }
  }
}
