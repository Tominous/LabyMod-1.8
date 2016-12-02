package de.resourcepacks24.gui;

import ave;
import azp;
import azu;
import java.util.List;

public class ModGuiResourcePacks
  extends azu
{
  private String title;
  
  public ModGuiResourcePacks(ave mcIn, int p_i45054_2_, int p_i45054_3_, List<azp> p_i45054_4_)
  {
    super(mcIn, p_i45054_2_, p_i45054_3_, p_i45054_4_);
  }
  
  protected String e()
  {
    return title;
  }
  
  public void setTitle(String title)
  {
    this.title = title;
  }
}
