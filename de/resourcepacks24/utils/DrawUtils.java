package de.resourcepacks24.utils;

import avc;
import ave;
import avn;
import avp;
import avr;
import bfd;
import bfl;
import bfx;
import bjh;
import bmj;
import bms;
import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import org.lwjgl.opengl.GL11;
import zx;

public class DrawUtils
  extends avp
{
  private ave mc;
  private final bjh itemRenderer;
  public avn fontRenderer;
  private static int mouseX = 0;
  private static int mouseY = 0;
  
  public DrawUtils()
  {
    mc = ave.A();
    itemRenderer = mc.ag();
    fontRenderer = mc.k;
  }
  
  public bjh getItemRenderer()
  {
    return itemRenderer;
  }
  
  public avn getFontRenderer()
  {
    return fontRenderer;
  }
  
  public List<String> listFormattedStringToWidth(String str, int wrapWidth)
  {
    return fontRenderer.c(str, wrapWidth);
  }
  
  public static void updateMouse(int x, int y)
  {
    if ((x == 0) && (y == 0)) {
      return;
    }
    mouseX = x;
    mouseY = y;
  }
  
  public static int getMouseX()
  {
    return mouseX;
  }
  
  public static int getMouseY()
  {
    return mouseY;
  }
  
  public void drawRightString(String text, double x, double y)
  {
    drawString(text, x - getStringWidth(text), y);
  }
  
  public void drawString(String text, double x, double y)
  {
    c(fontRenderer, text, (int)x, (int)y, 16777215);
  }
  
  public void drawString(String text, double x, double y, double size)
  {
    GL11.glPushMatrix();
    GL11.glScaled(size, size, size);
    c(fontRenderer, text, (int)(x / size), (int)(y / size), 16777215);
    GL11.glPopMatrix();
  }
  
  public void drawCenteredString(String text, int x, int y)
  {
    a(fontRenderer, text, x, y, 16777215);
  }
  
  public void drawCenteredString(String text, double x, double y, double size)
  {
    GL11.glPushMatrix();
    GL11.glScaled(size, size, size);
    a(fontRenderer, text, (int)(x / size), (int)(y / size), 16777215);
    GL11.glPopMatrix();
  }
  
  public void drawRightString(String text, double x, double y, double size)
  {
    GL11.glPushMatrix();
    GL11.glScaled(size, size, size);
    c(fontRenderer, text, (int)(x / size - getStringWidth(text)), (int)(y / size), 16777215);
    GL11.glPopMatrix();
  }
  
  public void drawCenteredStringWithoutShadow(String text, double x, double y, double size)
  {
    GL11.glPushMatrix();
    GL11.glScaled(size, size, size);
    fontRenderer.a(text, (int)(x / size - fontRenderer.a(text) / 2), (int)(y / size), 16777215);
    GL11.glPopMatrix();
  }
  
  public void drawItem(zx item, int x, int y)
  {
    avc.c();
    itemRenderer.b(item, x, y);
    itemRenderer.a(fontRenderer, item, x, y, "");
    itemRenderer.a(fontRenderer, item, x, y);
    bfl.f();
  }
  
  public void drawRightItem(zx item, int x, int y)
  {
    avc.c();
    itemRenderer.b(item, x, y);
    itemRenderer.a(fontRenderer, item, x, y, "");
    itemRenderer.a(fontRenderer, item, x, y);
    bfl.f();
  }
  
  public void drawItem(zx item, double x, double y, String s)
  {
    avc.c();
    itemRenderer.b(item, (int)x, (int)y);
    itemRenderer.a(fontRenderer, item, (int)x, (int)y, s);
    bfl.f();
  }
  
  public void bindRightString(String text, int y)
  {
    drawString(text, getWidth() - getStringWidth(text) - 2, y);
  }
  
  public int getHeight()
  {
    avr res = new avr(mc);
    return res.b();
  }
  
  public int getWidth()
  {
    avr res = new avr(mc);
    return res.a();
  }
  
  public int getRight(String text)
  {
    return fontRenderer.a(text) - 2;
  }
  
  public List<String> splitEqually(String text, int size)
  {
    List<String> ret = new ArrayList((text.length() + size - 1) / size);
    for (int start = 0; start < text.length(); start += size) {
      ret.add(text.substring(start, Math.min(text.length(), start + size)));
    }
    return ret;
  }
  
  public int getRightScreen(int settings)
  {
    String s = "";
    for (int u = 0; u <= settings; u++) {
      s = s + " ";
    }
    avr res = new avr(mc);
    return res.a() - fontRenderer.a(s) - 5;
  }
  
  public int getMiddleScreen(int settings)
  {
    String s = "";
    for (int u = 0; u <= settings; u++) {
      s = s + " ";
    }
    avr res = new avr(mc);
    return res.a() / 2 - fontRenderer.a(s);
  }
  
  public int getStringWidth(String text)
  {
    return fontRenderer.a(text);
  }
  
  public double getScale(int scale)
  {
    int s = scale;
    if (s < 50) {
      s = 25 + s / 2;
    }
    return s * 0.02D;
  }
  
  public void drawRect(double left, double top, double right, double bottom, int color)
  {
    a((int)left, (int)top, (int)right, (int)bottom, color);
  }
  
  public void drawBox(int left, int top, int right, int bottom)
  {
    bfl.c(1.0F, 1.0F, 1.0F);
    GL11.glColor4f(0.0F, 0.0F, 0.0F, 0.9F);
    a(left, top, right, bottom, Color.WHITE.getRGB());
    GL11.glColor4f(1.0F, 1.0F, 1.0F, 0.9F);
    a(left, top, right, top + 1, Color.WHITE.getRGB());
    a(left, top, left + 1, bottom, Color.WHITE.getRGB());
    a(right - 1, top, right, bottom, Color.WHITE.getRGB());
    a(left, bottom - 1, right, bottom, Color.WHITE.getRGB());
  }
  
  public void drawBackground(int tint)
  {
    bfl.f();
    bfl.n();
    bfx tessellator = bfx.a();
    bfd worldrenderer = tessellator.c();
    mc.P().a(b);
    bfl.c(1.0F, 1.0F, 1.0F, 1.0F);
    float f = 32.0F;
    worldrenderer.a(7, bms.i);
    worldrenderer.b(0.0D, getHeight(), 0.0D).a(0.0D, getHeight() / 32.0F + tint).b(64, 64, 64, 255).d();
    worldrenderer.b(getWidth(), getHeight(), 0.0D).a(getWidth() / 32.0F, getHeight() / 32.0F + tint).b(64, 64, 64, 255).d();
    worldrenderer.b(getWidth(), 0.0D, 0.0D).a(getWidth() / 32.0F, tint).b(64, 64, 64, 255).d();
    worldrenderer.b(0.0D, 0.0D, 0.0D).a(0.0D, tint).b(64, 64, 64, 255).d();
    tessellator.b();
  }
  
  public void drawChatBackground(int left, int top, int right, int bottom, int amountScrolled)
  {
    bfl.f();
    bfl.n();
    bfx tessellator = bfx.a();
    bfd worldrenderer = tessellator.c();
    mc.P().a(avp.b);
    bfl.c(1.0F, 1.0F, 1.0F, 1.0F);
    float f = 32.0F;
    worldrenderer.a(7, bms.i);
    worldrenderer.b(left, bottom, 0.0D).a(left / f, (bottom + amountScrolled) / f).b(32, 32, 32, 255).d();
    worldrenderer.b(right, bottom, 0.0D).a(right / f, (bottom + amountScrolled) / f).b(32, 32, 32, 255).d();
    worldrenderer.b(right, top, 0.0D).a(right / f, (top + amountScrolled) / f).b(32, 32, 32, 255).d();
    worldrenderer.b(left, top, 0.0D).a(left / f, (top + amountScrolled) / f).b(32, 32, 32, 255).d();
    tessellator.b();
    bfl.l();
    bfl.a(770, 771, 0, 1);
    bfl.c();
    bfl.j(7425);
    bfl.i();
    int i1 = 4;
    bfl.l();
    bfl.a(770, 771, 0, 1);
    bfl.c();
    bfl.j(7425);
    bfl.w();
    worldrenderer.a(7, bms.i);
    worldrenderer.b(left, top + i1, 0.0D).a(0.0D, 1.0D).b(0, 0, 0, 0).d();
    worldrenderer.b(right, top + i1, 0.0D).a(1.0D, 1.0D).b(0, 0, 0, 0).d();
    worldrenderer.b(right, top, 0.0D).a(1.0D, 0.0D).b(0, 0, 0, 255).d();
    worldrenderer.b(left, top, 0.0D).a(0.0D, 0.0D).b(0, 0, 0, 255).d();
    tessellator.b();
    worldrenderer.a(7, bms.i);
    worldrenderer.b(left, bottom, 0.0D).a(0.0D, 1.0D).b(0, 0, 0, 255).d();
    worldrenderer.b(right, bottom, 0.0D).a(1.0D, 1.0D).b(0, 0, 0, 255).d();
    worldrenderer.b(right, bottom - i1, 0.0D).a(1.0D, 0.0D).b(0, 0, 0, 0).d();
    worldrenderer.b(left, bottom - i1, 0.0D).a(0.0D, 0.0D).b(0, 0, 0, 0).d();
    tessellator.b();
    bfl.j(7424);
    bfl.d();
    bfl.k();
  }
  
  public void drawTransparentBackground(int left, int top, int right, int bottom)
  {
    try
    {
      bfl.f();
      bfl.n();
      bfx tessellator = bfx.a();
      bfd worldrenderer = tessellator.c();
      mc.P().a(avp.b);
      float f = 32.0F;
      int amountScrolled = 0;
      a(left, top, right, bottom, Integer.MIN_VALUE);
      
      bfl.l();
      bfl.a(770, 771, 0, 1);
      bfl.c();
      bfl.j(7425);
      bfl.i();
      int i1 = 4;
      bfl.l();
      bfl.a(770, 771, 0, 1);
      bfl.c();
      bfl.j(7425);
      bfl.w();
      worldrenderer.a(7, bms.i);
      worldrenderer.b(left, top + i1, 0.0D).a(0.0D, 1.0D).b(0, 0, 0, 0).d();
      worldrenderer.b(right, top + i1, 0.0D).a(1.0D, 1.0D).b(0, 0, 0, 0).d();
      worldrenderer.b(right, top, 0.0D).a(1.0D, 0.0D).b(0, 0, 0, 255).d();
      worldrenderer.b(left, top, 0.0D).a(0.0D, 0.0D).b(0, 0, 0, 255).d();
      tessellator.b();
      worldrenderer.a(7, bms.i);
      worldrenderer.b(left, bottom, 0.0D).a(0.0D, 1.0D).b(0, 0, 0, 255).d();
      worldrenderer.b(right, bottom, 0.0D).a(1.0D, 1.0D).b(0, 0, 0, 255).d();
      worldrenderer.b(right, bottom - i1, 0.0D).a(1.0D, 0.0D).b(0, 0, 0, 0).d();
      worldrenderer.b(left, bottom - i1, 0.0D).a(0.0D, 0.0D).b(0, 0, 0, 0).d();
      tessellator.b();
      bfl.j(7424);
      bfl.d();
    }
    catch (Exception error)
    {
      error.printStackTrace();
    }
  }
  
  public void overlayBackground(int startY, int endY)
  {
    int endAlpha = 255;
    int startAlpha = 255;
    bfx tessellator = bfx.a();
    bfd worldrenderer = tessellator.c();
    mc.P().a(avp.b);
    bfl.c(1.0F, 1.0F, 1.0F, 1.0F);
    float f = 32.0F;
    worldrenderer.a(7, bms.i);
    worldrenderer.b(0.0D, endY, 0.0D).a(0.0D, endY / 32.0F).b(64, 64, 64, endAlpha).d();
    worldrenderer.b(0 + getWidth(), endY, 0.0D).a(getWidth() / 32.0F, endY / 32.0F).b(64, 64, 64, endAlpha).d();
    worldrenderer.b(0 + getWidth(), startY, 0.0D).a(getWidth() / 32.0F, startY / 32.0F).b(64, 64, 64, startAlpha).d();
    worldrenderer.b(0.0D, startY, 0.0D).a(0.0D, startY / 32.0F).b(64, 64, 64, startAlpha).d();
    tessellator.b();
  }
  
  public void overlayBackground(int startX, int startY, int endX, int endY)
  {
    int endAlpha = 255;
    int startAlpha = 255;
    bfx tessellator = bfx.a();
    bfd worldrenderer = tessellator.c();
    mc.P().a(avp.b);
    bfl.c(1.0F, 1.0F, 1.0F, 1.0F);
    float f = 32.0F;
    worldrenderer.a(7, bms.i);
    worldrenderer.b(startX, endY, 0.0D).a(0.0D, endY / 32.0F).b(64, 64, 64, endAlpha).d();
    worldrenderer.b(startX + endX, endY, 0.0D).a(endX / 32.0F, endY / 32.0F).b(64, 64, 64, endAlpha).d();
    worldrenderer.b(startX + endX, startY, 0.0D).a(endX / 32.0F, startY / 32.0F).b(64, 64, 64, startAlpha).d();
    worldrenderer.b(startX, startY, 0.0D).a(0.0D, startY / 32.0F).b(64, 64, 64, startAlpha).d();
    tessellator.b();
  }
  
  public void drawTexturedModalRect(double x, double y, double textureX, double textureY, double width, double height)
  {
    b((int)x, (int)y, (int)textureX, (int)textureY, (int)width, (int)height);
  }
  
  public void drawTexturedModalRect(double left, double top, double right, double bottom)
  {
    double textureX = 0.0D;
    double textureY = 0.0D;
    double x = left;
    double y = top;
    double width = right - left;
    double height = bottom - top;
    float f = 0.00390625F;
    float f1 = 0.00390625F;
    bfx tessellator = bfx.a();
    bfd worldrenderer = tessellator.c();
    worldrenderer.a(7, bms.g);
    worldrenderer.b(x + 0.0D, y + height, e).a((float)(textureX + 0.0D) * f, (float)(textureY + height) * f1).d();
    worldrenderer.b(x + width, y + height, e).a((float)(textureX + width) * f, (float)(textureY + height) * f1).d();
    worldrenderer.b(x + width, y + 0.0D, e).a((float)(textureX + width) * f, (float)(textureY + 0.0D) * f1).d();
    worldrenderer.b(x + 0.0D, y + 0.0D, e).a((float)(textureX + 0.0D) * f, (float)(textureY + 0.0D) * f1).d();
    tessellator.b();
  }
}
