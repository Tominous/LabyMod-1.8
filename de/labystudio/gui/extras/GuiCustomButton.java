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
    this.f = 200;
    this.g = 20;
    this.l = true;
    this.m = true;
    this.k = buttonId;
    this.h = x;
    this.i = y;
    this.f = widthIn;
    this.g = heightIn;
    this.j = buttonText;
  }
  
  protected int a(boolean mouseOver)
  {
    int i = 1;
    if (!this.l) {
      i = 0;
    } else if (mouseOver) {
      i = 2;
    }
    return i;
  }
  
  public void drawInfoBox()
  {
    if (!this.n) {
      this.showInfo = System.currentTimeMillis();
    }
    if (this.info.isEmpty()) {
      return;
    }
    if (this.showInfo + 300L > System.currentTimeMillis()) {
      return;
    }
    int l = Integer.MIN_VALUE;
    GL11.glPushMatrix();
    double k = 0.7D;
    GL11.glScaled(k, k, k);
    for (int i = 0; i < 3; i++) {
      DrawUtils.a((int)((LabyMod.getInstance().draw.getWidth() / 2 - 140) / k), 
        (int)((LabyMod.getInstance().draw.getHeight() - 30 - 10 * getRange(this.info, 300)) / k), 
        (int)((LabyMod.getInstance().draw.getWidth() / 2 + 140) / k), (int)((LabyMod.getInstance().draw.getHeight() - 15) / k), l);
    }
    drawContent(this.info, (int)(LabyMod.getInstance().draw.getWidth() / 2 / k), (int)((LabyMod.getInstance().draw.getHeight() - 25 - 10 * getRange(this.info, 300)) / k), 300);
    GL11.glPopMatrix();
  }
  
  private void drawContent(String msg, int x, int y, int max)
  {
    int range = getRange(msg, max);
    String next = getFirstStrings(max, msg);
    String done = "";
    for (int i = 0; i <= range; i++)
    {
      LabyMod.getInstance().draw.drawCenteredString(next, x, y + i * 12);
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
      k += LabyMod.getInstance().draw.getStringWidth(new String(new char[] { c }));
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
      k += LabyMod.getInstance().draw.getStringWidth("" + a);
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
    if (this.m)
    {
      avn var4 = mc.k;
      mc.P().a(buttonTextures);
      bfl.c(1.0F, 1.0F, 1.0F, 1.0F);
      this.n = ((mouseX >= this.h) && (mouseY >= this.i) && (mouseX < this.h + this.f) && (mouseY < this.i + this.g));
      int var5 = a(this.n);
      bfl.l();
      bfl.a(770, 771, 1, 0);
      bfl.b(770, 771);
      if (!this.noGui)
      {
        b(this.h, this.i, 0, 46 + var5 * 20, this.f / 2, this.g);
        b(this.h + this.f / 2, this.i, 200 - this.f / 2, 46 + var5 * 20, this.f / 2, this.g);
      }
      b(mc, mouseX, mouseY);
      int var6 = 14737632;
      if (!this.l) {
        var6 = 10526880;
      } else if (this.n) {
        var6 = 16777120;
      }
      if (this.centered)
      {
        a(var4, this.j, this.h + this.f / 2, this.i + (this.g - 8) / 2, var6);
      }
      else
      {
        c(mc.k, Color.cl("f") + this.j, this.h + 6, this.i + (this.g - 8) / 2, 0);
        a(var4, this.subTitle, this.h + 40 + (this.h + this.f / 2 - (this.h + 30)) * 2 - this.subTitle.length(), this.i + (this.g - 8) / 2, var6);
      }
    }
  }
  
  protected void b(ave mc, int mouseX, int mouseY) {}
  
  public void a(int mouseX, int mouseY) {}
  
  public boolean c(ave mc, int mouseX, int mouseY)
  {
    return (this.l) && (this.m) && (mouseX >= this.h) && (mouseY >= this.i) && (mouseX < this.h + this.f) && (mouseY < this.i + this.g);
  }
  
  public boolean a()
  {
    return this.n;
  }
  
  public void b(int mouseX, int mouseY) {}
  
  public void a(bpz soundHandlerIn)
  {
    soundHandlerIn.a(bpf.a(new jy("gui.button.press"), 1.0F));
  }
  
  public int b()
  {
    return this.f;
  }
  
  public void a(int width)
  {
    this.f = width;
  }
}
