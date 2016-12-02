package mods.worldeditcui.debug;

import java.io.File;
import java.io.IOException;
import java.util.logging.ConsoleHandler;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import mods.worldeditcui.InitialisationFactory;
import mods.worldeditcui.WorldEditCUI;
import mods.worldeditcui.config.CUIConfiguration;
import mods.worldeditcui.exceptions.InitialisationException;
import mods.worldeditcui.util.ConsoleLogFormatter;

public class CUIDebug
  implements InitialisationFactory
{
  protected WorldEditCUI controller;
  protected File debugFile;
  protected boolean debugMode;
  
  public CUIDebug(WorldEditCUI controller)
  {
    debugMode = false;
    this.controller = controller;
  }
  
  public void initialise()
    throws InitialisationException
  {
    ConsoleLogFormatter formatter = new ConsoleLogFormatter();
    ConsoleHandler handler = new ConsoleHandler();
    handler.setFormatter(formatter);
    logger.setUseParentHandlers(false);
    logger.addHandler(handler);
    try
    {
      debugFile = new File("worldeditcui.debug.log");
      debugMode = controller.getConfiguration().isDebugMode();
      if (debugMode)
      {
        FileHandler newHandler = new FileHandler(debugFile.getAbsolutePath());
        newHandler.setFormatter(formatter);
        logger.addHandler(newHandler);
      }
    }
    catch (IOException e)
    {
      e.printStackTrace(System.err);
      throw new InitialisationException();
    }
  }
  
  public void debug(String message)
  {
    if (debugMode) {
      logger.info("WorldEditCUI Debug - " + message);
    }
  }
  
  public void info(String message)
  {
    logger.info(message);
  }
  
  public void info(String message, Throwable e)
  {
    logger.log(Level.INFO, message, e);
  }
  
  protected static final Logger logger = Logger.getLogger("WorldEditCUI");
}
