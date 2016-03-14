package de.labystudio.capes;

import jy;

public class Cape
{
  private jy optifine;
  private jy labymod;
  private boolean mineconCape = false;
  
  public jy getLabymod()
  {
    return this.labymod;
  }
  
  public jy getOptifine()
  {
    return this.optifine;
  }
  
  public boolean isMineconCape()
  {
    return this.mineconCape;
  }
  
  public void setLabymod(jy labymod)
  {
    this.labymod = labymod;
  }
  
  public void setOptifine(jy optifine)
  {
    this.optifine = optifine;
  }
  
  public void setMineconCape(boolean mineconCape)
  {
    this.mineconCape = mineconCape;
  }
}
