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
    this.proxy = new awp(this, ☃, ☃, ☃, ☃);
  }
  
  public RealmsButton(int ☃, int ☃, int ☃, int ☃, int ☃, String ☃)
  {
    this.proxy = new awp(this, ☃, ☃, ☃, ☃, ☃, ☃);
  }
  
  public avs getProxy()
  {
    return this.proxy;
  }
  
  public int id()
  {
    return this.proxy.c();
  }
  
  public boolean active()
  {
    return this.proxy.d();
  }
  
  public void active(boolean ☃)
  {
    this.proxy.b(☃);
  }
  
  public void msg(String ☃)
  {
    this.proxy.a(☃);
  }
  
  public int getWidth()
  {
    return this.proxy.b();
  }
  
  public int getHeight()
  {
    return this.proxy.g();
  }
  
  public int y()
  {
    return this.proxy.e();
  }
  
  public void render(int ☃, int ☃)
  {
    this.proxy.a(ave.A(), ☃, ☃);
  }
  
  public void clicked(int ☃, int ☃) {}
  
  public void released(int ☃, int ☃) {}
  
  public void blit(int ☃, int ☃, int ☃, int ☃, int ☃, int ☃)
  {
    this.proxy.b(☃, ☃, ☃, ☃, ☃, ☃);
  }
  
  public void renderBg(int ☃, int ☃) {}
  
  public int getYImage(boolean ☃)
  {
    return this.proxy.c(☃);
  }
}
