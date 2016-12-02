package net.minecraft.realms;

import ave;
import avs;
import awp;
import jy;

public class RealmsButton
{
  protected static final jy WIDGETS_LOCATION = new jy("textures/gui/widgets.png");
  private awp proxy;
  
  public RealmsButton(int ☃, int ☃, int ☃, String ☃)
  {
    proxy = new awp(this, ☃, ☃, ☃, ☃);
  }
  
  public RealmsButton(int ☃, int ☃, int ☃, int ☃, int ☃, String ☃)
  {
    proxy = new awp(this, ☃, ☃, ☃, ☃, ☃, ☃);
  }
  
  public avs getProxy()
  {
    return proxy;
  }
  
  public int id()
  {
    return proxy.c();
  }
  
  public boolean active()
  {
    return proxy.d();
  }
  
  public void active(boolean ☃)
  {
    proxy.b(☃);
  }
  
  public void msg(String ☃)
  {
    proxy.a(☃);
  }
  
  public int getWidth()
  {
    return proxy.b();
  }
  
  public int getHeight()
  {
    return proxy.g();
  }
  
  public int y()
  {
    return proxy.e();
  }
  
  public void render(int ☃, int ☃)
  {
    proxy.a(ave.A(), ☃, ☃);
  }
  
  public void clicked(int ☃, int ☃) {}
  
  public void released(int ☃, int ☃) {}
  
  public void blit(int ☃, int ☃, int ☃, int ☃, int ☃, int ☃)
  {
    proxy.b(☃, ☃, ☃, ☃, ☃, ☃);
  }
  
  public void renderBg(int ☃, int ☃) {}
  
  public int getYImage(boolean ☃)
  {
    return proxy.c(☃);
  }
}
