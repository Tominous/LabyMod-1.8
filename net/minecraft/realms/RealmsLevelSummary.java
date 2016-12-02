package net.minecraft.realms;

import adp.a;
import ats;

public class RealmsLevelSummary
  implements Comparable<RealmsLevelSummary>
{
  private ats levelSummary;
  
  public RealmsLevelSummary(ats ☃)
  {
    levelSummary = ☃;
  }
  
  public int getGameMode()
  {
    return levelSummary.f().a();
  }
  
  public String getLevelId()
  {
    return levelSummary.a();
  }
  
  public boolean hasCheats()
  {
    return levelSummary.h();
  }
  
  public boolean isHardcore()
  {
    return levelSummary.g();
  }
  
  public boolean isRequiresConversion()
  {
    return levelSummary.d();
  }
  
  public String getLevelName()
  {
    return levelSummary.b();
  }
  
  public long getLastPlayed()
  {
    return levelSummary.e();
  }
  
  public int compareTo(ats ☃)
  {
    return levelSummary.a(☃);
  }
  
  public long getSizeOnDisk()
  {
    return levelSummary.c();
  }
  
  public int compareTo(RealmsLevelSummary ☃)
  {
    if (levelSummary.e() < ☃.getLastPlayed()) {
      return 1;
    }
    if (levelSummary.e() > ☃.getLastPlayed()) {
      return -1;
    }
    return levelSummary.a().compareTo(☃.getLevelId());
  }
}
