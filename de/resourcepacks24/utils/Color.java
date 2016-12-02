package de.resourcepacks24.utils;

public class Color
{
  public static String c = "§";
  
  public static String cl(String color)
  {
    return c + color;
  }
  
  public static int toRGB(int r, int g, int b, int a)
  {
    return (a & 0xFF) << 24 | (r & 0xFF) << 16 | (g & 0xFF) << 8 | (b & 0xFF) << 0;
  }
}
