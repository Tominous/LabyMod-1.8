package mods.itemphysic.config;

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
  private Map<String, Object> defaultValues;
  
  public Configuration(String configName, Map<String, Object> defaultValues)
  {
    this.defaultValues = defaultValues;
    File exactFile = new File("config/" + configName);
    if (!exactFile.getParentFile().exists()) {
      exactFile.getParentFile().mkdir();
    }
    configFile = exactFile;
    if (!exactFile.exists()) {
      createConfig();
    }
    load();
  }
  
  public void load()
  {
    try
    {
      for (Map.Entry<String, Object> defaultValue : defaultValues.entrySet()) {
        configValues.put(defaultValue.getKey(), new Property((String)defaultValue.getValue()));
      }
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
    catch (Exception e)
    {
      createConfig();
    }
  }
  
  private void createConfig()
  {
    configValues.clear();
    for (Map.Entry<String, Object> defaultValue : defaultValues.entrySet()) {
      configValues.put(defaultValue.getKey(), new Property(String.valueOf(defaultValue.getValue())));
    }
    save();
  }
  
  public Property get(String key)
  {
    return (Property)configValues.get(key);
  }
  
  public void set(String key, Property property)
  {
    configValues.put(key, property);
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
