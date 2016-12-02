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
    levelStorageSource = ☃;
  }
  
  public String getName()
  {
    return levelStorageSource.a();
  }
  
  public boolean levelExists(String ☃)
  {
    return levelStorageSource.f(☃);
  }
  
  public boolean convertLevel(String ☃, nu ☃)
  {
    return levelStorageSource.a(☃, ☃);
  }
  
  public boolean requiresConversion(String ☃)
  {
    return levelStorageSource.b(☃);
  }
  
  public boolean isNewLevelIdAcceptable(String ☃)
  {
    return levelStorageSource.d(☃);
  }
  
  public boolean deleteLevel(String ☃)
  {
    return levelStorageSource.e(☃);
  }
  
  public boolean isConvertible(String ☃)
  {
    return levelStorageSource.a(☃);
  }
  
  public void renameLevel(String ☃, String ☃)
  {
    levelStorageSource.a(☃, ☃);
  }
  
  public void clearAll()
  {
    levelStorageSource.d();
  }
  
  public List<RealmsLevelSummary> getLevelList()
    throws atq
  {
    List<RealmsLevelSummary> ☃ = Lists.newArrayList();
    for (ats ☃ : levelStorageSource.b()) {
      ☃.add(new RealmsLevelSummary(☃));
    }
    return ☃;
  }
}
