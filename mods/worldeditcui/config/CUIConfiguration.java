package mods.worldeditcui.config;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import mods.worldeditcui.InitialisationFactory;
import mods.worldeditcui.render.LineColour;

public class CUIConfiguration
  implements InitialisationFactory
{
  private static final String CONFIG_FILE_NAME = "worldeditcui.config.json";
  
  public CUIConfiguration()
  {
    debugMode = false;
    ignoreUpdates = false;
    promiscuous = false;
    alwaysOnTop = false;
    cuboidGridColor = new Colour("#CC3333CC");
    cuboidEdgeColor = new Colour("#CC4C4CCC");
    cuboidFirstPointColor = new Colour("#33CC33CC");
    cuboidSecondPointColor = new Colour("#3333CCCC");
    polyGridColor = new Colour("#CC3333CC");
    polyEdgeColor = new Colour("#CC4C4CCC");
    polyPointColor = new Colour("#33CCCCCC");
    ellipsoidGridColor = new Colour("#CC4C4CCC");
    ellipsoidPointColor = new Colour("#CCCC33CC");
    cylinderGridColor = new Colour("#CC3333CC");
    cylinderEdgeColor = new Colour("#CC4C4CCC");
    cylinderPointColor = new Colour("#CC33CCCC");
  }
  
  public void initialise()
  {
    cuboidGridColor = Colour.setDefault(cuboidGridColor, "#CC3333CC");
    cuboidEdgeColor = Colour.setDefault(cuboidEdgeColor, "#CC4C4CCC");
    cuboidFirstPointColor = Colour.setDefault(cuboidFirstPointColor, "#33CC33CC");
    cuboidSecondPointColor = Colour.setDefault(cuboidSecondPointColor, "#3333CCCC");
    polyGridColor = Colour.setDefault(polyGridColor, "#CC3333CC");
    polyEdgeColor = Colour.setDefault(polyEdgeColor, "#CC4C4CCC");
    polyPointColor = Colour.setDefault(polyPointColor, "#33CCCCCC");
    ellipsoidGridColor = Colour.setDefault(ellipsoidGridColor, "#CC4C4CCC");
    ellipsoidPointColor = Colour.setDefault(ellipsoidPointColor, "#CCCC33CC");
    cylinderGridColor = Colour.setDefault(cylinderGridColor, "#CC3333CC");
    cylinderEdgeColor = Colour.setDefault(cylinderEdgeColor, "#CC4C4CCC");
    cylinderPointColor = Colour.setDefault(cylinderPointColor, "#CC33CCCC");
    LineColour.CUBOIDBOX.setColour(cuboidEdgeColor);
    LineColour.CUBOIDGRID.setColour(cuboidGridColor);
    LineColour.CUBOIDPOINT1.setColour(cuboidFirstPointColor);
    LineColour.CUBOIDPOINT2.setColour(cuboidSecondPointColor);
    LineColour.POLYGRID.setColour(polyGridColor);
    LineColour.POLYBOX.setColour(polyEdgeColor);
    LineColour.POLYPOINT.setColour(polyPointColor);
    LineColour.ELLIPSOIDGRID.setColour(ellipsoidGridColor);
    LineColour.ELLIPSOIDCENTRE.setColour(ellipsoidPointColor);
    LineColour.CYLINDERGRID.setColour(cylinderGridColor);
    LineColour.CYLINDERBOX.setColour(cylinderEdgeColor);
    LineColour.CYLINDERCENTRE.setColour(cylinderPointColor);
    save();
  }
  
  public boolean isDebugMode()
  {
    return debugMode;
  }
  
  public boolean ignoreUpdates()
  {
    return ignoreUpdates;
  }
  
  public boolean isPromiscuous()
  {
    return promiscuous;
  }
  
  public void setPromiscuous(boolean promiscuous)
  {
    this.promiscuous = promiscuous;
  }
  
  public boolean isAlwaysOnTop()
  {
    return alwaysOnTop;
  }
  
  public void setAlwaysOnTop(boolean alwaysOnTop)
  {
    this.alwaysOnTop = alwaysOnTop;
  }
  
  public static CUIConfiguration create()
  {
    File jsonFile = new File("worldeditcui.config.json");
    if (jsonFile.exists())
    {
      FileReader fileReader = null;
      try
      {
        fileReader = new FileReader(jsonFile);
        CUIConfiguration config = (CUIConfiguration)gson.fromJson(fileReader, CUIConfiguration.class);
        return config;
      }
      catch (Exception ex)
      {
        ex.printStackTrace();
      }
      finally
      {
        try
        {
          if (fileReader != null) {
            fileReader.close();
          }
        }
        catch (IOException localIOException2) {}
      }
    }
    return new CUIConfiguration();
  }
  
  public void save()
  {
    File jsonFile = new File("worldeditcui.config.json");
    FileWriter fileWriter = null;
    try
    {
      fileWriter = new FileWriter(jsonFile);
      gson.toJson(this, fileWriter); return;
    }
    catch (Exception ex)
    {
      ex.printStackTrace();
      try
      {
        if (fileWriter != null) {
          fileWriter.close();
        }
      }
      catch (IOException ex2)
      {
        ex2.printStackTrace();
      }
    }
    finally
    {
      try
      {
        if (fileWriter != null) {
          fileWriter.close();
        }
      }
      catch (IOException ex3)
      {
        ex3.printStackTrace();
      }
    }
  }
  
  private static Gson gson = new GsonBuilder().setPrettyPrinting().create();
  private boolean debugMode;
  private boolean ignoreUpdates;
  private boolean promiscuous;
  private boolean alwaysOnTop;
  private Colour cuboidGridColor;
  private Colour cuboidEdgeColor;
  private Colour cuboidFirstPointColor;
  private Colour cuboidSecondPointColor;
  private Colour polyGridColor;
  private Colour polyEdgeColor;
  private Colour polyPointColor;
  private Colour ellipsoidGridColor;
  private Colour ellipsoidPointColor;
  private Colour cylinderGridColor;
  private Colour cylinderEdgeColor;
  private Colour cylinderPointColor;
}
