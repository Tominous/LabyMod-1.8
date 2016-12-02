package de.labystudio.cosmetic;

public class Cosmetic
{
  private EnumCosmetic type = EnumCosmetic.NONE;
  private String data;
  public double a;
  public double b;
  public double c;
  public double height;
  public String d;
  
  public Cosmetic(EnumCosmetic type)
  {
    this.type = type;
    parseData();
  }
  
  public Cosmetic(EnumCosmetic type, String data)
  {
    this.type = type;
    this.data = data;
    parseData();
  }
  
  public Cosmetic(int id)
  {
    type = getById(id);
    parseData();
  }
  
  public Cosmetic(int id, String data)
  {
    type = getById(id);
    this.data = data;
    parseData();
  }
  
  public EnumCosmetic getById(int id)
  {
    int i = 0;
    for (EnumCosmetic t : EnumCosmetic.values())
    {
      if (id == i) {
        return t;
      }
      i++;
    }
    return EnumCosmetic.NONE;
  }
  
  public EnumCosmetic getType()
  {
    return type;
  }
  
  public String getData()
  {
    return data;
  }
  
  private void parseData()
  {
    if (type == null) {
      return;
    }
    if ((type == EnumCosmetic.WINGS) && 
      (data != null) && 
      (data.contains(","))) {
      try
      {
        String[] d = data.replace(" ", "").split(",");
        if (d.length >= 3)
        {
          a = Double.parseDouble(d[0]);
          b = Double.parseDouble(d[1]);
          c = Double.parseDouble(d[2]);
        }
      }
      catch (Exception error)
      {
        error.printStackTrace();
      }
    }
    if (type == EnumCosmetic.HAT)
    {
      height = 0.5D;
      if ((data != null) && (!data.contains(" "))) {
        this.d = data;
      }
    }
    if (type == EnumCosmetic.DEADMAU5) {
      height = 0.25D;
    }
    if (type == EnumCosmetic.PIXELBIESTER) {
      height = 0.25D;
    }
    if (type == EnumCosmetic.RABBIT) {
      height = 0.25D;
    }
    if ((type == EnumCosmetic.TOOL) && 
      (data != null) && (data.contains(":"))) {
      try
      {
        String[] d = data.replace(" ", "").split(":");
        a = Integer.parseInt(d[0]);
        b = Integer.parseInt(d[1]);
      }
      catch (Exception error)
      {
        error.printStackTrace();
      }
    }
    if (type == EnumCosmetic.HALO) {
      height = 0.25D;
    }
    if (type == EnumCosmetic.TAG) {
      this.d = data;
    }
    if (type == EnumCosmetic.CENSORED) {
      this.d = data;
    }
    if (type == EnumCosmetic.RANK) {
      this.d = data;
    }
    if ((type == EnumCosmetic.HALLOWEEN) && 
      (data != null)) {
      try
      {
        a = Integer.parseInt(data);
      }
      catch (Exception error)
      {
        error.printStackTrace();
      }
    }
  }
}
