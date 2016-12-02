package togglesneak;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Configuration
{
  private Map<String, Property> configValues = new HashMap();
  private File configFile;
  
  public Configuration(File configFile)
  {
    File exactFile = new File("config/" + configFile.getName());
    if (!exactFile.getParentFile().exists()) {
      exactFile.getParentFile().mkdir();
    }
    if (!exactFile.exists()) {
      try
      {
        exactFile.createNewFile();
      }
      catch (IOException e)
      {
        e.printStackTrace();
      }
    }
    this.configFile = exactFile;
  }
  
  public void load()
  {
    try
    {
      BufferedReader reader = new BufferedReader(new FileReader(configFile));
      
      String line = null;
      while ((line = reader.readLine()) != null) {
        if (!line.equals(""))
        {
          String[] optionSplit = line.split(":");
          configValues.put(optionSplit[0], new Property(optionSplit[1]));
        }
      }
      reader.close();
    }
    catch (FileNotFoundException e)
    {
      e.printStackTrace();
    }
    catch (IOException e)
    {
      e.printStackTrace();
    }
  }
  
  public Property get(String key, Object defaultValue)
  {
    if (!configValues.containsKey(key)) {
      configValues.put(key, new Property(defaultValue.toString()));
    }
    return (Property)configValues.get(key);
  }
  
  public void save()
  {
    configFile.delete();
    try
    {
      configFile.createNewFile();
    }
    catch (IOException e)
    {
      e.printStackTrace();
    }
    try
    {
      PrintWriter writer = new PrintWriter(configFile);
      for (Map.Entry<String, Property> values : configValues.entrySet()) {
        writer.println((String)values.getKey() + ":" + ((Property)values.getValue()).getValue());
      }
      writer.close();
    }
    catch (IOException e)
    {
      e.printStackTrace();
    }
  }
}
