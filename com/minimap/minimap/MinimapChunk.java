package com.minimap.minimap;

import adm;
import anm;
import ave;
import com.minimap.XaeroMinimap;
import com.minimap.settings.ModSettings;
import java.util.Random;
import net.minecraft.server.MinecraftServer;

public class MinimapChunk
{
  public MinimapChunk(int X, int Z)
  {
    colors = new int[16][16];
    chunkGrid = ((X & 0x1) == (Z & 0x1));
    slimeChunk = isSlimeChunk(X, Z);
  }
  
  public static boolean isSlimeChunk(int xPosition, int zPosition)
  {
    try
    {
      MinecraftServer sp = ave.A().G();
      long seed;
      long seed;
      if (sp == null)
      {
        seed = getSettingsserverSlimeSeed;
      }
      else
      {
        seed = sp.e().J();
        if (et.q() != 0) {
          return false;
        }
      }
      if (seed == 0L) {
        return false;
      }
      Random rnd = new Random(seed + xPosition * xPosition * 4987142 + xPosition * 5947611 + zPosition * zPosition * 4392871L + zPosition * 389711 ^ 0x3AD8025F);
      return rnd.nextInt(10) == 0;
    }
    catch (Exception e) {}
    return false;
  }
  
  public static Random rand = new Random();
  public int[][] colors;
  public boolean chunkGrid;
  public boolean slimeChunk;
}
