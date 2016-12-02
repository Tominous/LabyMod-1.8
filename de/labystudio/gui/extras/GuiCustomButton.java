package de.labystudio.gui.extras;

import ave;
import avn;
import avs;
import bfl;
import bmj;
import bpf;
import bpz;
import de.labystudio.labymod.LabyMod;
import de.labystudio.utils.Color;
import de.labystudio.utils.DrawUtils;
import jy;
import org.lwjgl.opengl.GL11;

public class GuiCustomButton
  extends avs
{
  protected static final jy buttonTextures = new jy("textures/gui/widgets.png");
  public int f;
  public int g;
  public int h;
  public int i;
  public String j;
  public int k;
  public boolean l;
  public boolean m;
  protected boolean n;
  
  public GuiCustomButton(int buttonId, int x, int y, String buttonText)
  {
    this(buttonId, x, y, 200, 20, buttonText);
  }
  
  public GuiCustomButton(int buttonId, int x, int y, int widthIn, int heightIn, String buttonText)
  {
    super(buttonId, x, y, widthIn, heightIn, buttonText);
    f = 200;
    g = 20;
    l = true;
    m = true;
    k = buttonId;
    h = x;
    i = y;
    f = widthIn;
    g = heightIn;
    j = buttonText;
  }
  
  protected int a(boolean mouseOver)
  {
    int i = 1;
    if (!l) {
      i = 0;
    } else if (mouseOver) {
      i = 2;
    }
    return i;
  }
  
  public void drawInfoBox()
  {
    if (!n) {
      showInfo = System.currentTimeMillis();
    }
    if (info.isEmpty()) {
      return;
    }
    if (showInfo + 300L > System.currentTimeMillis()) {
      return;
    }
    int l = Integer.MIN_VALUE;
    GL11.glPushMatrix();
    double k = 0.7D;
    GL11.glScaled(k, k, k);
    for (int i = 0; i < 3; i++) {
      DrawUtils.a((int)((getInstancedraw.getWidth() / 2 - 140) / k), 
        (int)((getInstancedraw.getHeight() - 30 - 10 * getRange(info, 300)) / k), 
        (int)((getInstancedraw.getWidth() / 2 + 140) / k), (int)((getInstancedraw.getHeight() - 15) / k), l);
    }
    drawContent(info, (int)(getInstancedraw.getWidth() / 2 / k), (int)((getInstancedraw.getHeight() - 25 - 10 * getRange(info, 300)) / k), 300);
    GL11.glPopMatrix();
  }
  
  private void drawContent(String msg, int x, int y, int max)
  {
    int range = getRange(msg, max);
    String next = getFirstStrings(max, msg);
    String done = "";
    for (int i = 0; i <= range; i++)
    {
      getInstancedraw.drawCenteredString(next, x, y + i * 12);
      done = done + next;
      next = getFirstStrings(max, msg.replace(done, ""));
    }
  }
  
  private String getFirstStrings(int pixels, String string)
  {
    int k = 0;
    String result = "";
    for (int i = 0; i < string.length(); i++)
    {
      char c = string.charAt(i);
      k += getInstancedraw.getStringWidth(new String(new char[] { c }));
      if (pixels > k)
      {
        result = result + new String(new char[] { c });
      }
      else
      {
        if (pixels != k) {
          break;
        }
        result = result + c;
        break;
      }
    }
    return result;
  }
  
  private int getRange(String msg, int max)
  {
    int k = 0;
    int range = 0;
    String line = msg;
    for (int i = 0; i <= line.length() - 1; i++)
    {
      char a = line.charAt(i);
      if (k > max)
      {
        range++;
        k = 0;
      }
      k += getInstancedraw.getStringWidth("" + a);
    }
    return range;
  }
  
  public boolean centered = true;
  public String subTitle = "";
  long showInfo = 0L;
  public String info = "";
  public String run = "";
  public boolean noGui = false;
  
  public void a(ave mc, int mouseX, int mouseY)
  {
    if (m)
    {
      avn var4 = k;
      mc.P().a(buttonTextures);
      bfl.c(1.0F, 1.0F, 1.0F, 1.0F);
      n = ((mouseX >= h) && (mouseY >= i) && (mouseX < h + f) && (mouseY < i + g));
      int var5 = a(n);
      bfl.l();
      bfl.a(770, 771, 1, 0);
      bfl.b(770, 771);
      if (!noGui)
      {
        b(h, i, 0, 46 + var5 * 20, f / 2, g);
        b(h + f / 2, i, 200 - f / 2, 46 + var5 * 20, f / 2, g);
      }
      b(mc, mouseX, mouseY);
      int var6 = 14737632;
      if (!l) {
        var6 = 10526880;
      } else if (n) {
        var6 = 16777120;
      }
      if (centered)
      {
        a(var4, j, h + f / 2, i + (g - 8) / 2, var6);
      }
      else
      {
        c(k, Color.cl("f") + j, h + 6, i + (g - 8) / 2, 0);
        a(var4, subTitle, h + 40 + (h + f / 2 - (h + 30)) * 2 - subTitle.length(), i + (g - 8) / 2, var6);
      }
    }
  }
  
  protected void b(ave mc, int mouseX, int mouseY) {}
  
  public void a(int mouseX, int mouseY) {}
  
  public boolean c(ave mc, int mouseX, int mouseY)
  {
    return (l) && (m) && (mouseX >= h) && (mouseY >= i) && (mouseX < h + f) && (mouseY < i + g);
  }
  
  public boolean a()
  {
    return n;
  }
  
  public void b(int mouseX, int mouseY) {}
  
  public void a(bpz soundHandlerIn)
  {
    soundHandlerIn.a(bpf.a(new jy("gui.button.press"), 1.0F));
  }
  
  public int b()
  {
    return f;
  }
  
  public void a(int width)
  {
    f = width;
  }
}
