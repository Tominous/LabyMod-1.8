package net.minecraft.realms;

import ave;
import avp;
import awr;
import bet;
import bmj;
import bmz;
import bnq;
import com.mojang.util.UUIDTypeAdapter;
import java.util.List;
import jy;
import zx;

public class RealmsScreen
{
  public static final int SKIN_HEAD_U = 8;
  public static final int SKIN_HEAD_V = 8;
  public static final int SKIN_HEAD_WIDTH = 8;
  public static final int SKIN_HEAD_HEIGHT = 8;
  public static final int SKIN_HAT_U = 40;
  public static final int SKIN_HAT_V = 8;
  public static final int SKIN_HAT_WIDTH = 8;
  public static final int SKIN_HAT_HEIGHT = 8;
  public static final int SKIN_TEX_WIDTH = 64;
  public static final int SKIN_TEX_HEIGHT = 64;
  protected ave minecraft;
  public int width;
  public int height;
  private awr proxy;
  
  public RealmsScreen()
  {
    proxy = new awr(this);
  }
  
  public awr getProxy()
  {
    return proxy;
  }
  
  public void init() {}
  
  public void init(ave ☃, int ☃, int ☃) {}
  
  public void drawCenteredString(String ☃, int ☃, int ☃, int ☃)
  {
    proxy.a(☃, ☃, ☃, ☃);
  }
  
  public void drawString(String ☃, int ☃, int ☃, int ☃)
  {
    proxy.b(☃, ☃, ☃, ☃);
  }
  
  public void blit(int ☃, int ☃, int ☃, int ☃, int ☃, int ☃)
  {
    proxy.b(☃, ☃, ☃, ☃, ☃, ☃);
  }
  
  public static void blit(int ☃, int ☃, float ☃, float ☃, int ☃, int ☃, int ☃, int ☃, float ☃, float ☃)
  {
    avp.a(☃, ☃, ☃, ☃, ☃, ☃, ☃, ☃, ☃, ☃);
  }
  
  public static void blit(int ☃, int ☃, float ☃, float ☃, int ☃, int ☃, float ☃, float ☃)
  {
    avp.a(☃, ☃, ☃, ☃, ☃, ☃, ☃, ☃);
  }
  
  public void fillGradient(int ☃, int ☃, int ☃, int ☃, int ☃, int ☃)
  {
    proxy.a(☃, ☃, ☃, ☃, ☃, ☃);
  }
  
  public void renderBackground()
  {
    proxy.c();
  }
  
  public boolean isPauseScreen()
  {
    return proxy.d();
  }
  
  public void renderBackground(int ☃)
  {
    proxy.b_(☃);
  }
  
  public void render(int ☃, int ☃, float ☃)
  {
    for (int ☃ = 0; ☃ < proxy.j().size(); ☃++) {
      ((RealmsButton)proxy.j().get(☃)).render(☃, ☃);
    }
  }
  
  public void renderTooltip(zx ☃, int ☃, int ☃)
  {
    proxy.a(☃, ☃, ☃);
  }
  
  public void renderTooltip(String ☃, int ☃, int ☃)
  {
    proxy.a(☃, ☃, ☃);
  }
  
  public void renderTooltip(List<String> ☃, int ☃, int ☃)
  {
    proxy.a(☃, ☃, ☃);
  }
  
  public static void bindFace(String ☃, String ☃)
  {
    jy ☃ = bet.c(☃);
    if (☃ == null) {
      ☃ = bmz.a(UUIDTypeAdapter.fromString(☃));
    }
    bet.a(☃, ☃);
    ave.A().P().a(☃);
  }
  
  public static void bind(String ☃)
  {
    jy ☃ = new jy(☃);
    ave.A().P().a(☃);
  }
  
  public void tick() {}
  
  public int width()
  {
    return proxy.l;
  }
  
  public int height()
  {
    return proxy.m;
  }
  
  public int fontLineHeight()
  {
    return proxy.h();
  }
  
  public int fontWidth(String ☃)
  {
    return proxy.c(☃);
  }
  
  public void fontDrawShadow(String ☃, int ☃, int ☃, int ☃)
  {
    proxy.c(☃, ☃, ☃, ☃);
  }
  
  public List<String> fontSplit(String ☃, int ☃)
  {
    return proxy.a(☃, ☃);
  }
  
  public void buttonClicked(RealmsButton ☃) {}
  
  public static RealmsButton newButton(int ☃, int ☃, int ☃, String ☃)
  {
    return new RealmsButton(☃, ☃, ☃, ☃);
  }
  
  public static RealmsButton newButton(int ☃, int ☃, int ☃, int ☃, int ☃, String ☃)
  {
    return new RealmsButton(☃, ☃, ☃, ☃, ☃, ☃);
  }
  
  public void buttonsClear()
  {
    proxy.i();
  }
  
  public void buttonsAdd(RealmsButton ☃)
  {
    proxy.a(☃);
  }
  
  public List<RealmsButton> buttons()
  {
    return proxy.j();
  }
  
  public void buttonsRemove(RealmsButton ☃)
  {
    proxy.b(☃);
  }
  
  public RealmsEditBox newEditBox(int ☃, int ☃, int ☃, int ☃, int ☃)
  {
    return new RealmsEditBox(☃, ☃, ☃, ☃, ☃);
  }
  
  public void mouseClicked(int ☃, int ☃, int ☃) {}
  
  public void mouseEvent() {}
  
  public void keyboardEvent() {}
  
  public void mouseReleased(int ☃, int ☃, int ☃) {}
  
  public void mouseDragged(int ☃, int ☃, int ☃, long ☃) {}
  
  public void keyPressed(char ☃, int ☃) {}
  
  public void confirmResult(boolean ☃, int ☃) {}
  
  public static String getLocalizedString(String ☃)
  {
    return bnq.a(☃, new Object[0]);
  }
  
  public static String getLocalizedString(String ☃, Object... ☃)
  {
    return bnq.a(☃, ☃);
  }
  
  public RealmsAnvilLevelStorageSource getLevelStorageSource()
  {
    return new RealmsAnvilLevelStorageSource(ave.A().f());
  }
  
  public void removed() {}
}
