package net.minecraft.realms;

import atq;
import atr;
import ats;
import com.google.common.collect.Lists;
import java.util.List;
import nu;

public class RealmsAnvilLevelStorageSource
{
  private atr levelStorageSource;
  
  public RealmsAnvilLevelStorageSource(atr ☃)
  {
    this.levelStorageSource = ☃;
  }
  
  public String getName()
  {
    return this.levelStorageSource.a();
  }
  
  public boolean levelExists(String ☃)
  {
    return this.levelStorageSource.f(☃);
  }
  
  public boolean convertLevel(String ☃, nu ☃)
  {
    return this.levelStorageSource.a(☃, ☃);
  }
  
  public boolean requiresConversion(String ☃)
  {
    return this.levelStorageSource.b(☃);
  }
  
  public boolean isNewLevelIdAcceptable(String ☃)
  {
    return this.levelStorageSource.d(☃);
  }
  
  public boolean deleteLevel(String ☃)
  {
    return this.levelStorageSource.e(☃);
  }
  
  public boolean isConvertible(String ☃)
  {
    return this.levelStorageSource.a(☃);
  }
  
  public void renameLevel(String ☃, String ☃)
  {
    this.levelStorageSource.a(☃, ☃);
  }
  
  public void clearAll()
  {
    this.levelStorageSource.d();
  }
  
  public List<RealmsLevelSummary> getLevelList()
    throws atq
  {
    List<RealmsLevelSummary> ☃ = Lists.newArrayList();
    for (ats ☃ : this.levelStorageSource.b()) {
      ☃.add(new RealmsLevelSummary(☃));
    }
    return ☃;
  }
}
