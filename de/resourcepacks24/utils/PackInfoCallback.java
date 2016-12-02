package de.resourcepacks24.utils;

import de.resourcepacks24.main.Pack;
import java.util.ArrayList;

public abstract interface PackInfoCallback
{
  public abstract void result(ArrayList<Pack> paramArrayList);
  
  public abstract void progress(int paramInt);
}
