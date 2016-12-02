package net.minecraft.realms;

import awq;

public class RealmsClickableScrolledSelectionList
{
  private final awq proxy;
  
  public RealmsClickableScrolledSelectionList(int ☃, int ☃, int ☃, int ☃, int ☃)
  {
    proxy = new awq(this, ☃, ☃, ☃, ☃, ☃);
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
  
  public void customMouseEvent(int ☃, int ☃, int ☃, float ☃, int ☃) {}
  
  public void scroll(int ☃)
  {
    proxy.h(☃);
  }
  
  public int getScroll()
  {
    return proxy.n();
  }
  
  protected void renderList(int ☃, int ☃, int ☃, int ☃) {}
  
  public void itemClicked(int ☃, int ☃, int ☃, int ☃, int ☃) {}
  
  public void renderSelected(int ☃, int ☃, int ☃, Tezzelator ☃) {}
  
  public void setLeftPos(int ☃)
  {
    proxy.i(☃);
  }
}
