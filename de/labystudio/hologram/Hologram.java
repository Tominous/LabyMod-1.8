package de.labystudio.hologram;

public class Hologram
{
  public String text = "";
  int x = 0;
  int y = 0;
  int z = 0;
  public Object memory;
  SetColor color;
  
  public Hologram(String text, int x, int y, int z, SetColor color)
  {
    this.text = text;
    this.x = x;
    this.y = y;
    this.z = z;
    this.color = color;
  }
  
  public String getText()
  {
    return text;
  }
  
  public SetColor getColor()
  {
    return color;
  }
  
  public int getX()
  {
    return x;
  }
  
  public int getY()
  {
    return y;
  }
  
  public int getZ()
  {
    return z;
  }
}
