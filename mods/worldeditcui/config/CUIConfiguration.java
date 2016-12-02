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
    this.debugMode = false;
    this.ignoreUpdates = false;
    this.promiscuous = false;
    this.alwaysOnTop = false;
    this.cuboidGridColor = new Colour("#CC3333CC");
    this.cuboidEdgeColor = new Colour("#CC4C4CCC");
    this.cuboidFirstPointColor = new Colour("#33CC33CC");
    this.cuboidSecondPointColor = new Colour("#3333CCCC");
    this.polyGridColor = new Colour("#CC3333CC");
    this.polyEdgeColor = new Colour("#CC4C4CCC");
    this.polyPointColor = new Colour("#33CCCCCC");
    this.ellipsoidGridColor = new Colour("#CC4C4CCC");
    this.ellipsoidPointColor = new Colour("#CCCC33CC");
    this.cylinderGridColor = new Colour("#CC3333CC");
    this.cylinderEdgeColor = new Colour("#CC4C4CCC");
    this.cylinderPointColor = new Colour("#CC33CCCC");
  }
  
  public void initialise()
  {
    this.cuboidGridColor = Colour.setDefault(this.cuboidGridColor, "#CC3333CC");
    this.cuboidEdgeColor = Colour.setDefault(this.cuboidEdgeColor, "#CC4C4CCC");
    this.cuboidFirstPointColor = Colour.setDefault(this.cuboidFirstPointColor, "#33CC33CC");
    this.cuboidSecondPointColor = Colour.setDefault(this.cuboidSecondPointColor, "#3333CCCC");
    this.polyGridColor = Colour.setDefault(this.polyGridColor, "#CC3333CC");
    this.polyEdgeColor = Colour.setDefault(this.polyEdgeColor, "#CC4C4CCC");
    this.polyPointColor = Colour.setDefault(this.polyPointColor, "#33CCCCCC");
    this.ellipsoidGridColor = Colour.setDefault(this.ellipsoidGridColor, "#CC4C4CCC");
    this.ellipsoidPointColor = Colour.setDefault(this.ellipsoidPointColor, "#CCCC33CC");
    this.cylinderGridColor = Colour.setDefault(this.cylinderGridColor, "#CC3333CC");
    this.cylinderEdgeColor = Colour.setDefault(this.cylinderEdgeColor, "#CC4C4CCC");
    this.cylinderPointColor = Colour.setDefault(this.cylinderPointColor, "#CC33CCCC");
    LineColour.CUBOIDBOX.setColour(this.cuboidEdgeColor);
    LineColour.CUBOIDGRID.setColour(this.cuboidGridColor);
    LineColour.CUBOIDPOINT1.setColour(this.cuboidFirstPointColor);
    LineColour.CUBOIDPOINT2.setColour(this.cuboidSecondPointColor);
    LineColour.POLYGRID.setColour(this.polyGridColor);
    LineColour.POLYBOX.setColour(this.polyEdgeColor);
    LineColour.POLYPOINT.setColour(this.polyPointColor);
    LineColour.ELLIPSOIDGRID.setColour(this.ellipsoidGridColor);
    LineColour.ELLIPSOIDCENTRE.setColour(this.ellipsoidPointColor);
    LineColour.CYLINDERGRID.setColour(this.cylinderGridColor);
    LineColour.CYLINDERBOX.setColour(this.cylinderEdgeColor);
    LineColour.CYLINDERCENTRE.setColour(this.cylinderPointColor);
    save();
  }
  
  public boolean isDebugMode()
  {
    return this.debugMode;
  }
  
  public boolean ignoreUpdates()
  {
    return this.ignoreUpdates;
  }
  
  public boolean isPromiscuous()
  {
    return this.promiscuous;
  }
  
  public void setPromiscuous(boolean promiscuous)
  {
    this.promiscuous = promiscuous;
  }
  
  public boolean isAlwaysOnTop()
  {
    return this.alwaysOnTop;
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
