public class Blender
{
  public static final int BLEND_ALPHA = 0;
  public static final int BLEND_ADD = 1;
  public static final int BLEND_SUBSTRACT = 2;
  public static final int BLEND_MULTIPLY = 3;
  public static final int BLEND_DODGE = 4;
  public static final int BLEND_BURN = 5;
  public static final int BLEND_SCREEN = 6;
  public static final int BLEND_OVERLAY = 7;
  public static final int BLEND_REPLACE = 8;
  public static final int BLEND_DEFAULT = 1;
  
  public static int parseBlend(String str)
  {
    if (str == null) {
      return 1;
    }
    str = str.toLowerCase().trim();
    if (str.equals("alpha")) {
      return 0;
    }
    if (str.equals("add")) {
      return 1;
    }
    if (str.equals("subtract")) {
      return 2;
    }
    if (str.equals("multiply")) {
      return 3;
    }
    if (str.equals("dodge")) {
      return 4;
    }
    if (str.equals("burn")) {
      return 5;
    }
    if (str.equals("screen")) {
      return 6;
    }
    if (str.equals("overlay")) {
      return 7;
    }
    if (str.equals("replace")) {
      return 8;
    }
    Config.warn("Unknown blend: " + str);
    
    return 1;
  }
  
  public static void setupBlend(int blend, float brightness)
  {
    switch (blend)
    {
    case 0: 
      bfl.c();
      bfl.l();
      bfl.b(770, 771);
      bfl.c(1.0F, 1.0F, 1.0F, brightness);
      break;
    case 1: 
      bfl.c();
      bfl.l();
      bfl.b(770, 1);
      bfl.c(1.0F, 1.0F, 1.0F, brightness);
      break;
    case 2: 
      bfl.c();
      bfl.l();
      bfl.b(775, 0);
      bfl.c(brightness, brightness, brightness, 1.0F);
      break;
    case 3: 
      bfl.c();
      bfl.l();
      bfl.b(774, 771);
      bfl.c(brightness, brightness, brightness, brightness);
      break;
    case 4: 
      bfl.c();
      bfl.l();
      bfl.b(1, 1);
      bfl.c(brightness, brightness, brightness, 1.0F);
      break;
    case 5: 
      bfl.c();
      bfl.l();
      bfl.b(0, 769);
      bfl.c(brightness, brightness, brightness, 1.0F);
      break;
    case 6: 
      bfl.c();
      bfl.l();
      bfl.b(1, 769);
      bfl.c(brightness, brightness, brightness, 1.0F);
      break;
    case 7: 
      bfl.c();
      bfl.l();
      bfl.b(774, 768);
      bfl.c(brightness, brightness, brightness, 1.0F);
      break;
    case 8: 
      bfl.d();
      bfl.k();
      bfl.c(1.0F, 1.0F, 1.0F, brightness);
    }
    bfl.w();
  }
  
  public static void clearBlend(float rainBrightness)
  {
    bfl.c();
    bfl.l();
    bfl.b(770, 1);
    bfl.c(1.0F, 1.0F, 1.0F, rainBrightness);
  }
}
