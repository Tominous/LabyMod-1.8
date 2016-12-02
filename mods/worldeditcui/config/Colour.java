package mods.worldeditcui.config;

public class Colour
{
  private String hex;
  private transient String defaultColour;
  
  public Colour(String defaultColour)
  {
    this.hex = defaultColour;
    this.defaultColour = defaultColour;
  }
  
  public Colour() {}
  
  public static Colour setDefault(Colour colour, String defaultColour)
  {
    if (colour == null) {
      return new Colour(defaultColour);
    }
    if (colour.hex == null)
    {
      colour.hex = defaultColour;
      colour.defaultColour = defaultColour;
    }
    else
    {
      colour.hex = parseColour(colour.hex, defaultColour);
    }
    return colour;
  }
  
  private static String parseColour(String colour, String def)
  {
    if (colour == null) {
      return def;
    }
    if (!colour.startsWith("#")) {
      return def;
    }
    if ((colour.length() != 7) && (colour.length() != 9)) {
      return def;
    }
    return colour.matches("(?i)^#[0-9a-f]{6,8}$") ? colour : def;
  }
  
  public void setHex(String hex)
  {
    if (hex.length() < 8) {
      hex = "00000000".substring(0, 8 - hex.length()) + hex;
    }
    this.hex = ("#" + hex);
  }
  
  public String getHex()
  {
    if (this.hex == null) {
      this.hex = this.defaultColour;
    }
    if (this.hex.length() == 7) {
      this.hex += "CC";
    }
    return this.hex;
  }
  
  public int getIntARGB()
  {
    String hex = getHex();
    return (int)Long.parseLong(hex.substring(7, 9) + hex.substring(1, 7), 16);
  }
  
  public float red()
  {
    String hex = getHex();
    return Integer.valueOf(Integer.parseInt(hex.substring(1, 3), 16)).intValue() / 256.0F;
  }
  
  public float green()
  {
    String hex = getHex();
    return Integer.valueOf(Integer.parseInt(hex.substring(3, 5), 16)).intValue() / 256.0F;
  }
  
  public float blue()
  {
    String hex = getHex();
    return Integer.valueOf(Integer.parseInt(hex.substring(5, 7), 16)).intValue() / 256.0F;
  }
  
  public float alpha()
  {
    String hex = getHex();
    return Integer.valueOf(Integer.parseInt(hex.substring(7, 9), 16)).intValue() / 256.0F;
  }
  
  public Colour copyFrom(Colour other)
  {
    this.hex = other.getHex();
    return this;
  }
}
