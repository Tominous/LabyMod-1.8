package net.labymod.spm;

import bfd;
import bfl;
import bfx;
import bms;
import org.lwjgl.input.Mouse;

public class Scrollbar
{
  private int listSize;
  private int entryHeight;
  private int scrollY;
  public double barLength;
  private double backLength;
  private int posTop;
  private int posBottom;
  private int left;
  public int top;
  private int right;
  private int speed = 1;
  int clickY;
  boolean hold;
  
  public int getScrollY()
  {
    return scrollY;
  }
  
  public void reset()
  {
    scrollY = 0;
  }
  
  public void setScrollY(int scrollY)
  {
    this.scrollY = scrollY;
  }
  
  public void setSpeed(int speed)
  {
    this.speed = speed;
  }
  
  public int getSpeed()
  {
    return speed;
  }
  
  public void init() {}
  
  public void setEntryHeight(int entryHeight)
  {
    this.entryHeight = entryHeight;
  }
  
  public Scrollbar(int entryHeight)
  {
    this.entryHeight = entryHeight;
  }
  
  public void update(int listSize)
  {
    this.listSize = (listSize + 1);
  }
  
  public void setPosition(int left, int top, int right, int bottom)
  {
    this.left = left;
    posTop = top;
    this.right = right;
    posBottom = bottom;
    calc();
  }
  
  public void calc()
  {
    double s = entryHeight;
    double totalPixels = listSize * entryHeight;
    double backLength = posBottom - posTop;
    double pixelInView = backLength;
    if (pixelInView >= totalPixels) {
      return;
    }
    double dPixelInView = pixelInView;
    double dTotalPixels = totalPixels;
    double scale = dPixelInView / dTotalPixels;
    double barLength = scale * backLength;
    double scroll = scrollY / scale * scale * scale;
    top = ((int)-scroll + posTop);
    this.barLength = barLength;
    this.backLength = backLength;
  }
  
  public boolean isHidden()
  {
    if (listSize == 0) {
      return true;
    }
    if (posBottom - posTop >= listSize * entryHeight) {
      return true;
    }
    return false;
  }
  
  public void draw()
  {
    if (isHidden()) {
      return;
    }
    calc();
    bfx tessellator = bfx.a();
    bfd worldrenderer = tessellator.c();
    bfl.l();
    bfl.a(770, 771, 0, 1);
    bfl.c();
    bfl.j(7425);
    bfl.x();
    worldrenderer.a(7, bms.i);
    worldrenderer.b(left, posBottom, 0.0D).a(0.0D, 1.0D).b(0, 0, 0, 255).d();
    worldrenderer.b(right, posBottom, 0.0D).a(1.0D, 1.0D).b(0, 0, 0, 255).d();
    worldrenderer.b(right, posTop, 0.0D).a(1.0D, 0.0D).b(0, 0, 0, 255).d();
    worldrenderer.b(left, posTop, 0.0D).a(0.0D, 0.0D).b(0, 0, 0, 255).d();
    tessellator.b();
    worldrenderer.a(7, bms.i);
    worldrenderer.b(left, top + barLength, 0.0D).a(0.0D, 1.0D).b(128, 128, 128, 255).d();
    worldrenderer.b(right, top + barLength, 0.0D).a(1.0D, 1.0D).b(128, 128, 128, 255).d();
    worldrenderer.b(right, top, 0.0D).a(1.0D, 0.0D).b(128, 128, 128, 255).d();
    worldrenderer.b(left, top, 0.0D).a(0.0D, 0.0D).b(128, 128, 128, 255).d();
    tessellator.b();
    worldrenderer.a(7, bms.i);
    worldrenderer.b(left, top + barLength - 1.0D, 0.0D).a(0.0D, 1.0D).b(192, 192, 192, 255).d();
    worldrenderer.b(right - 1, top + barLength - 1.0D, 0.0D).a(1.0D, 1.0D).b(192, 192, 192, 255).d();
    worldrenderer.b(right - 1, top, 0.0D).a(1.0D, 0.0D).b(192, 192, 192, 255).d();
    worldrenderer.b(left, top, 0.0D).a(0.0D, 0.0D).b(192, 192, 192, 255).d();
    tessellator.b();
    bfl.w();
    bfl.j(7424);
    bfl.d();
    bfl.k();
  }
  
  public void mouseAction(int x, int y, boolean drag)
  {
    calc();
    boolean click = false;
    if (!drag)
    {
      hold = false;
      if ((x < right) && (x > left) && (y > top) && (y < top + barLength))
      {
        hold = true;
      }
      else if ((x < right) && (x > left) && (y > posTop) && (y < posBottom))
      {
        drag = true;
        click = true;
      }
    }
    else if (!hold)
    {
      return;
    }
    int b = scrollY;
    double scale = backLength / (listSize * entryHeight);
    int calc = (int)(-y / scale);
    if (drag) {
      scrollY = (calc - clickY);
    } else {
      clickY = (calc - scrollY);
    }
    if ((listSize * entryHeight + scrollY < posBottom - posTop) && 
      (!click)) {
      scrollY = b;
    }
    if ((scrollY > 0) && 
      (!click)) {
      scrollY = b;
    }
    if (click)
    {
      if (listSize * entryHeight + scrollY < posBottom - posTop) {
        scrollY += posBottom - posTop - (listSize * entryHeight + scrollY);
      }
      if (scrollY > 0) {
        scrollY = 0;
      }
    }
  }
  
  public void mouseInput()
  {
    int wheel = Mouse.getEventDWheel();
    if (wheel > 0)
    {
      if (scrollY < 0) {
        scrollY += speed;
      }
    }
    else if ((wheel < 0) && 
      (listSize * entryHeight + scrollY > posBottom - posTop)) {
      scrollY -= speed;
    }
    if (listSize * entryHeight + scrollY < posBottom - posTop) {
      scrollY += posBottom - posTop - (listSize * entryHeight + scrollY);
    }
    if (scrollY > 0) {
      scrollY = 0;
    }
  }
}
