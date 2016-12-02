package com.minimap.gui;

import avs;
import com.minimap.settings.ModOptions;

public class MySmallButton
  extends avs
{
  private final ModOptions modOptions;
  
  public MySmallButton(int par1, int par2, int par3, String par4Str)
  {
    this(par1, par2, par3, null, par4Str);
  }
  
  public MySmallButton(int par1, int par2, int par3, int par4, int par5, String par6Str)
  {
    super(par1, par2, par3, par4, par5, par6Str);
    this.modOptions = null;
  }
  
  public MySmallButton(int par1, int par2, int par3, ModOptions par4EnumOptions, String par5Str)
  {
    super(par1, par2, par3, 150, 20, par5Str);
    this.modOptions = par4EnumOptions;
  }
  
  public ModOptions returnModOptions()
  {
    return this.modOptions;
  }
}
