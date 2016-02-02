package de.labystudio.labymod;

import de.labystudio.utils.Color;
import de.labystudio.utils.Debug;
import de.labystudio.utils.DrawUtils;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashMap;
import org.lwjgl.opengl.GL11;

public class Timings
{
  public static HashMap<String, Long> timings = new HashMap();
  public static HashMap<String, Long> result = new HashMap();
  static String p = "[Timings] ";
  
  public static void start()
  {
    try
    {
      String path = "";
      int a = 0;
      for (int i = Thread.currentThread().getStackTrace().length - 1; i > 0; i--)
      {
        String name = Thread.currentThread().getStackTrace()[i].getMethodName();
        path = name + "/" + path;
        a++;
        if (a > 5) {
          break;
        }
      }
      path = path.replace("start/", "").replace("stop/", "") + " (" + Thread.currentThread().getName() + ")";
      timings.put(path, Long.valueOf(System.currentTimeMillis()));
    }
    catch (Exception error)
    {
      System.out.println(p + "Error: " + error.getMessage());
    }
  }
  
  public static void stop()
  {
    try
    {
      String path = "";
      int a = 0;
      for (int i = Thread.currentThread().getStackTrace().length - 1; i > 0; i--)
      {
        String name = Thread.currentThread().getStackTrace()[i].getMethodName();
        path = name + "/" + path;
        a++;
        if (a > 5) {
          break;
        }
      }
      path = path.replace("start/", "").replace("stop/", "") + " (" + Thread.currentThread().getName() + ")";
      if (timings.containsKey(path))
      {
        long start = ((Long)timings.get(path)).longValue();
        result.put(path, Long.valueOf(System.currentTimeMillis() - start));
      }
    }
    catch (Exception error)
    {
      System.out.println(p + "Error: " + error.getMessage());
    }
  }
  
  public static void draw()
  {
    if (!isTiming()) {
      return;
    }
    LabyMod.getInstance().draw.drawBox(5, 5, LabyMod.getInstance().draw.getWidth() - 25, result.size() * 10);
    int i = 0;
    GL11.glPushMatrix();
    GL11.glScaled(0.7D, 0.7D, 0.5D);
    ArrayList<String> m = new ArrayList();
    m.addAll(result.keySet());
    for (String methode : m)
    {
      long ms = ((Long)result.get(methode)).longValue();
      String color = "a";
      if (ms > 30L) {
        color = "e";
      }
      if (ms > 70L) {
        color = "6";
      }
      if (ms > 150L) {
        color = "c";
      }
      if (ms > 300L) {
        color = "4";
      }
      LabyMod.getInstance().draw.drawString(Color.cl(color) + ms + "ms " + Color.cl("7") + "| " + Color.cl("c") + methode.replace("/", new StringBuilder().append(Color.cl("8")).append("/").append(Color.cl("f")).toString()).replace("(", new StringBuilder().append(Color.cl("9")).append("(").toString()), 15.0D, 15 + i);
      i += 10;
    }
    GL11.glPopMatrix();
  }
  
  public static boolean isTiming()
  {
    if (ConfigManager.settings == null) {
      return false;
    }
    return Debug.timings();
  }
}
