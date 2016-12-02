package net.minecraft.realms;

import aws;

public class RealmsScrolledSelectionList
{
  private final aws proxy;
  
  public RealmsScrolledSelectionList(int ☃, int ☃, int ☃, int ☃, int ☃)
  {
    proxy = new aws(this, ☃, ☃, ☃, ☃, ☃);
  }
  
  public void render(int ☃, int ☃, float ☃)
  {
    proxy.a(☃, ☃, ☃);
  }
  
  public int width()
  {
    return proxy.e();
  }
  
  public int ym()
  {
    return proxy.f();
  }
  
  public int xm()
  {
    return proxy.g();
  }
  
  protected void renderItem(int ☃, int ☃, int ☃, int ☃, Tezzelator ☃, int ☃, int ☃) {}
  
  public void renderItem(int ☃, int ☃, int ☃, int ☃, int ☃, int ☃)
  {
    renderItem(☃, ☃, ☃, ☃, Tezzelator.instance, ☃, ☃);
  }
  
  public int getItemCount()
  {
    return 0;
  }
  
  public void selectItem(int ☃, boolean ☃, int ☃, int ☃) {}
  
  public boolean isSelectedItem(int ☃)
  {
    return false;
  }
  
  public void renderBackground() {}
  
  public int getMaxPosition()
  {
    return 0;
  }
  
  public int getScrollbarPosition()
  {
    return proxy.e() / 2 + 124;
  }
  
  public void mouseEvent()
  {
    proxy.p();
  }
  
  public void scroll(int ☃)
  {
    proxy.h(☃);
  }
  
  public int getScroll()
  {
    return proxy.n();
  }
  
  protected void renderList(int ☃, int ☃, int ☃, int ☃) {}
}
