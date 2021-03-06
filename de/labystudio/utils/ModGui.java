package de.labystudio.utils;

import ady;
import aug;
import auh;
import aui;
import avc;
import ave;
import bdb;
import bew;
import bfl;
import biu;
import bqs;
import cj;
import de.labystudio.labymod.ConfigManager;
import de.labystudio.labymod.LabyMod;
import de.labystudio.labymod.ModSettings;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import ns;
import pk;
import pr;
import uo;

public class ModGui
{
  public static int mainList = 0;
  public static int offList = 2;
  public static pk pointedEntity = null;
  public static int frames = 0;
  public static int fps = 0;
  public static long frameTimer = 0L;
  private static SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
  
  public static String translateTimer(int time)
  {
    String formata = time / 60 < 10 ? "0" + time / 60 : Integer.toString(time / 60);
    String formatb = time % 60 < 10 ? "0" + time % 60 : Integer.toString(time % 60);
    return formata + ":" + formatb;
  }
  
  public static String shortString(String s, int i)
  {
    if (s.length() > i) {
      s = s.substring(0, i);
    }
    return s;
  }
  
  static int smoothFPS = 0;
  
  public static void smoothFPS()
  {
    if (!ConfigManager.settings.smoothFPS) {
      return;
    }
    try
    {
      int fps = getRealFPS();
      if (smoothFPS == 0) {
        smoothFPS = fps;
      }
      if (fps > smoothFPS) {
        smoothFPS += 1;
      }
      if (fps < smoothFPS) {
        smoothFPS -= 1;
      }
    }
    catch (Exception error)
    {
      smoothFPS = 0;
    }
  }
  
  public static int getFPS()
  {
    if (ConfigManager.settings.smoothFPS) {
      return smoothFPS;
    }
    return getRealFPS();
  }
  
  public static String getF()
  {
    if (!LabyMod.getInstance().isInGame()) {
      return "0.0 ";
    }
    double f = ns.g(ave.A().h.y);
    if (f <= 0.0D) {
      f += 360.0D;
    }
    f /= 8.0D;
    f /= 11.0D;
    String output = "" + String.valueOf(f).charAt(0) + String.valueOf(f).charAt(1) + String.valueOf(f).charAt(2);
    if ((output.equals("4.0")) || (output.startsWith("9"))) {
      output = "0.0";
    }
    return output + " ";
  }
  
  public static String getD()
  {
    String XZD = getXZD();
    if (XZD.contains("Z-")) {
      return "North ";
    }
    if (XZD.contains("X+")) {
      return "East ";
    }
    if (XZD.contains("Z+")) {
      return "South ";
    }
    if (XZD.contains("X-")) {
      return "West ";
    }
    return "";
  }
  
  public static String getDesignD()
  {
    String XZD = getXZD();
    if ((XZD.contains("X-")) && (XZD.contains("Z-"))) {
      return "WN";
    }
    if ((XZD.contains("Z-")) && (XZD.contains("X+"))) {
      return "NE";
    }
    if ((XZD.contains("X+")) && (XZD.contains("Z+"))) {
      return "ES";
    }
    if ((XZD.contains("Z+")) && (XZD.contains("X-"))) {
      return "SW";
    }
    if (XZD.contains("Z-")) {
      return "North ";
    }
    if (XZD.contains("X+")) {
      return "East";
    }
    if (XZD.contains("Z+")) {
      return "South";
    }
    if (XZD.contains("X-")) {
      return "West";
    }
    return "";
  }
  
  public static String getXZD()
  {
    double f = Double.parseDouble(getF());
    String a = "[";
    String b = ", ";
    String c = "]";
    String xP = "X+";
    String xN = "X-";
    String zP = "Z+";
    String zN = "Z-";
    if (ConfigManager.settings.layout == 1)
    {
      a = "";
      b = " ";
      c = "";
    }
    if (ConfigManager.settings.layout == 2)
    {
      a = "[";
      b = ", ";
      c = "]";
    }
    if (ConfigManager.settings.layout == 3)
    {
      a = "<";
      b = ", ";
      c = ">";
    }
    if (ConfigManager.settings.layout == 4)
    {
      a = "(";
      b = ", ";
      c = ")";
    }
    a = Color.c(2) + a + Color.c(1);
    b = Color.c(2) + b + Color.c(1);
    c = Color.c(2) + c;
    if ((f >= 0.0D) && (f < 0.3D)) {
      return a + zP + c;
    }
    if ((f > 0.2D) && (f < 0.8D)) {
      return a + xN + b + zP + c;
    }
    if ((f > 0.7D) && (f < 1.4D)) {
      return a + xN + c;
    }
    if ((f > 1.3D) && (f < 1.8D)) {
      return a + xN + b + zN + c;
    }
    if ((f > 1.7D) && (f < 2.4D)) {
      return a + zN + c;
    }
    if ((f > 2.3D) && (f < 2.8D)) {
      return a + xP + b + zN + c;
    }
    if ((f > 2.7D) && (f < 3.4D)) {
      return a + xP + c;
    }
    if ((f > 3.3D) && (f < 3.8D)) {
      return a + xP + b + zP + c;
    }
    if ((f > 3.7D) && (f <= 4.0D)) {
      return a + zP + c;
    }
    return "";
  }
  
  public static String getDesignXZD(boolean x)
  {
    double f = Double.parseDouble(getF());
    String p = "+";
    String n = "-";
    if ((f >= 0.0D) && (f < 0.3D))
    {
      if (x) {
        return "";
      }
      return p;
    }
    if ((f > 0.2D) && (f < 0.8D))
    {
      if (x) {
        return n;
      }
      return p;
    }
    if ((f > 0.7D) && (f < 1.4D))
    {
      if (x) {
        return n;
      }
      return "";
    }
    if ((f > 1.3D) && (f < 1.8D))
    {
      if (x) {
        return n;
      }
      return n;
    }
    if ((f > 1.7D) && (f < 2.4D))
    {
      if (x) {
        return "";
      }
      return n;
    }
    if ((f > 2.3D) && (f < 2.8D))
    {
      if (x) {
        return p;
      }
      return n;
    }
    if ((f > 2.7D) && (f < 3.4D))
    {
      if (x) {
        return p;
      }
      return "";
    }
    if ((f > 3.3D) && (f < 3.8D))
    {
      if (x) {
        return p;
      }
      return p;
    }
    if ((f > 3.7D) && (f <= 4.0D))
    {
      if (x) {
        return "";
      }
      return p;
    }
    return "";
  }
  
  public static int getRealFPS()
  {
    return fps;
  }
  
  public static String getBiom()
  {
    if (ave.A().f == null) {
      return "?";
    }
    if (ave.A().h == null) {
      return "?";
    }
    if (ave.A().h.c() == null) {
      return "?";
    }
    ady gen = ave.A().f.b(ave.A().h.c());
    if (gen == null) {
      return "?";
    }
    return gen.ah;
  }
  
  public static String getX()
  {
    if (!LabyMod.getInstance().isInGame()) {
      return "?";
    }
    if (ConfigManager.settings.truncateCoords == 0) {
      return "" + ave.A().h.c().n();
    }
    return truncateCoords(ave.A().h.s);
  }
  
  public static String getY()
  {
    if (!LabyMod.getInstance().isInGame()) {
      return "?";
    }
    if (ConfigManager.settings.truncateCoords == 0) {
      return "" + ave.A().h.c().o();
    }
    return truncateCoords(ave.A().h.t);
  }
  
  public static String getZ()
  {
    if (!LabyMod.getInstance().isInGame()) {
      return "?";
    }
    if (ConfigManager.settings.truncateCoords == 0) {
      return "" + ave.A().h.c().p();
    }
    return truncateCoords(ave.A().h.u);
  }
  
  public static String truncateCoords(double i)
  {
    if (ConfigManager.settings.truncateCoords != 0) {
      return truncateDecimal(i, ConfigManager.settings.truncateCoords) + "";
    }
    return (int)i + "";
  }
  
  private static BigDecimal truncateDecimal(double x, int numberofDecimals)
  {
    try
    {
      if (x > 0.0D) {
        return new BigDecimal(String.valueOf(x)).setScale(numberofDecimals, 3);
      }
      return new BigDecimal(String.valueOf(x)).setScale(numberofDecimals, 2);
    }
    catch (Exception error) {}
    return new BigDecimal(0);
  }
  
  public static double truncateTo(double number, int amount)
  {
    int truncatedNumberInt = (int)(number * Math.pow(10.0D, amount));
    double truncatedNumber = truncatedNumberInt / Math.pow(10.0D, amount);
    return truncatedNumber;
  }
  
  public static String createLabel(String get, String set)
  {
    if (ConfigManager.settings.layout == 0) {
      return "";
    }
    if (ConfigManager.settings.layout == 1) {
      return Color.c(1) + get + Color.c(2) + ": " + Color.c(3) + set;
    }
    if (ConfigManager.settings.layout == 2) {
      return Color.c(2) + "[" + Color.c(1) + get + Color.c(2) + "] " + Color.c(3) + set;
    }
    if (ConfigManager.settings.layout == 3) {
      return Color.c(1) + get + Color.c(2) + "> " + Color.c(3) + set;
    }
    if (ConfigManager.settings.layout == 4) {
      return Color.c(2) + "(" + Color.c(1) + get + Color.c(2) + ") " + Color.c(3) + set;
    }
    return "Error";
  }
  
  public static void addMainLabel(String prefix, String text, int y)
  {
    if (isSwitch()) {
      LabyMod.getInstance().draw.addRightLabel(prefix, text, y);
    } else {
      LabyMod.getInstance().draw.addLabel(prefix, text, y);
    }
    mainListNext();
  }
  
  public static void addOffLabel(String prefix, String text, int y)
  {
    if (isSwitch()) {
      LabyMod.getInstance().draw.addLabel(prefix, text, y);
    } else {
      LabyMod.getInstance().draw.addRightLabel(prefix, text, y);
    }
    offListNext();
  }
  
  public static void addBoxLabel(String prefix, String text, int y)
  {
    if (isSwitch()) {
      LabyMod.getInstance().draw.drawCenteredString(prefix + text, LabyMod.getInstance().draw.getWidth() - 60, y);
    } else {
      LabyMod.getInstance().draw.drawCenteredString(prefix + text, 60, y);
    }
    mainListNext();
  }
  
  public static void addDoubleBoxLabel(String prefix, String text, int y)
  {
    if (isSwitch())
    {
      LabyMod.getInstance().draw.drawCenteredString(prefix, LabyMod.getInstance().draw.getWidth() - 60 - 4, y);
      mainListNext();
      LabyMod.getInstance().draw.drawCenteredString(text, LabyMod.getInstance().draw.getWidth() - 60 - 4, y + 10);
      mainListNext();
    }
    else
    {
      LabyMod.getInstance().draw.drawCenteredString(prefix, 64, y);
      mainListNext();
      LabyMod.getInstance().draw.drawCenteredString(text, 64, y + 10);
      mainListNext();
    }
  }
  
  public static void reset()
  {
    offList = 0;
    mainList = 0;
  }
  
  public static void offListNext()
  {
    offList += 10;
  }
  
  public static void offListNext(int i)
  {
    offList += i;
  }
  
  public static void mainListNext()
  {
    mainList += 10;
  }
  
  public static void mainListNext(int i)
  {
    mainList += i;
  }
  
  public static boolean isSwitch()
  {
    return ConfigManager.settings.guiPositionRight;
  }
  
  public static void drawEntityOnScreen(double x, double y, double size, pr entity)
  {
    if (entity == null) {
      return;
    }
    bfl.g();
    bfl.E();
    bfl.b((float)x, (float)y, 50.0F);
    bfl.a((float)-size - 25.0F, (float)size + 25.0F, (float)size);
    bfl.b(180.0F, 0.0F, 0.0F, 1.0F);
    float var6 = entity.aI;
    float var7 = entity.y;
    float var8 = entity.z;
    float var9 = entity.aL;
    float var10 = entity.aK;
    bfl.b(135.0F, 0.0F, 1.0F, 0.0F);
    
    bfl.b(-135.0F, 0.0F, 1.0F, 0.0F);
    bfl.b(0.0F, 0.0F, 0.0F);
    biu var11 = ave.A().af();
    var11.a(180.0F);
    var11.a(false);
    var11.a(entity, 0.0D, 0.0D, 0.0D, 0.0F, 1.0F);
    var11.a(true);
    entity.aI = var6;
    entity.y = var7;
    entity.z = var8;
    entity.aL = var9;
    entity.aK = var10;
    bfl.F();
    avc.a();
    bfl.C();
    bfl.g(bqs.r);
    bfl.x();
    bfl.g(bqs.q);
  }
  
  public static void getMouseOver(float p_78473_1_)
  {
    pk var2 = LabyMod.getInstance().mc.ac();
    if (var2 != null) {
      if (LabyMod.getInstance().mc.f != null)
      {
        LabyMod.getInstance().mc.i = null;
        double var3 = 30.0D;
        LabyMod.getInstance().mc.s = var2.a(var3, p_78473_1_);
        double var5 = var3;
        aui var7 = var2.d(p_78473_1_);
        if (LabyMod.getInstance().mc.s != null) {
          var5 = LabyMod.getInstance().mc.s.c.f(var7);
        }
        aui var8 = var2.d(p_78473_1_);
        aui var9 = var7.b(var8.a * var3, var8.b * var3, var8.c * var3);
        pointedEntity = null;
        aui var10 = null;
        float var11 = 1.0F;
        List var12 = LabyMod.getInstance().mc.f.b(var2, var2.aR().a(var8.a * var3, var8.b * var3, var8.c * var3).b(var11, var11, var11));
        double var13 = var5;
        for (int var15 = 0; var15 < var12.size(); var15++)
        {
          pk var16 = (pk)var12.get(var15);
          if (var16.ad())
          {
            float var17 = var16.ao();
            aug var18 = var16.aR().b(var17, var17, var17);
            auh var19 = var18.a(var7, var9);
            if (var18.a(var7))
            {
              if ((0.0D < var13) || (var13 == 0.0D))
              {
                pointedEntity = var16;
                var10 = var19 == null ? var7 : var19.c;
                var13 = 0.0D;
              }
            }
            else if (var19 != null)
            {
              double var20 = var7.f(var19.c);
              if ((var20 < var13) || (var13 == 0.0D)) {
                if (var16 == var2.m)
                {
                  if (var13 == 0.0D)
                  {
                    pointedEntity = var16;
                    var10 = var19.c;
                  }
                }
                else
                {
                  pointedEntity = var16;
                  var10 = var19.c;
                  var13 = var20;
                }
              }
            }
          }
        }
        if ((pointedEntity != null) && ((var13 < var5) || (LabyMod.getInstance().mc.s == null)))
        {
          LabyMod.getInstance().mc.s = new auh(pointedEntity, var10);
          if (((pointedEntity instanceof pr)) || ((pointedEntity instanceof uo))) {
            LabyMod.getInstance().mc.i = pointedEntity;
          }
        }
      }
    }
  }
  
  public static String getDate()
  {
    return dateFormat.format(new Date());
  }
}
