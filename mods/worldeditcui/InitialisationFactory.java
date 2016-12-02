package mods.worldeditcui;

import mods.worldeditcui.exceptions.InitialisationException;

public abstract interface InitialisationFactory
{
  public abstract void initialise()
    throws InitialisationException;
}
