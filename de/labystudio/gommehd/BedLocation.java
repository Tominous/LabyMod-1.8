package de.labystudio.gommehd;

public class BedLocation
{
  int x = 0;
  int y = 0;
  int z = 0;
  EnumBWTeam team = EnumBWTeam.NONE;
  
  public BedLocation(EnumBWTeam team, int x, int y, int z)
  {
    this.team = team;
    this.x = x;
    this.y = y;
    this.z = z;
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
  
  public EnumBWTeam getTeam()
  {
    return team;
  }
}
