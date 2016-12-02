package net.minecraft.realms;

import ave;
import axu;
import java.lang.reflect.Constructor;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class RealmsBridge
  extends RealmsScreen
{
  private static final Logger LOGGER = ;
  private axu previousScreen;
  
  public void switchToRealms(axu ☃)
  {
    previousScreen = ☃;
    try
    {
      Class<?> ☃ = Class.forName("com.mojang.realmsclient.RealmsMainScreen");
      Constructor<?> ☃ = ☃.getDeclaredConstructor(new Class[] { RealmsScreen.class });
      ☃.setAccessible(true);
      Object ☃ = ☃.newInstance(new Object[] { this });
      ave.A().a(((RealmsScreen)☃).getProxy());
    }
    catch (Exception ☃)
    {
      LOGGER.error("Realms module missing", ☃);
    }
  }
  
  public void init()
  {
    ave.A().a(previousScreen);
  }
}
