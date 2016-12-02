package net.minecraft.realms;

import ave;
import avw;

public class RealmsEditBox
{
  private final avw editBox;
  
  public RealmsEditBox(int ☃, int ☃, int ☃, int ☃, int ☃)
  {
    editBox = new avw(☃, Ak, ☃, ☃, ☃, ☃);
  }
  
  public String getValue()
  {
    return editBox.b();
  }
  
  public void tick()
  {
    editBox.a();
  }
  
  public void setFocus(boolean ☃)
  {
    editBox.b(☃);
  }
  
  public void setValue(String ☃)
  {
    editBox.a(☃);
  }
  
  public void keyPressed(char ☃, int ☃)
  {
    editBox.a(☃, ☃);
  }
  
  public boolean isFocused()
  {
    return editBox.m();
  }
  
  public void mouseClicked(int ☃, int ☃, int ☃)
  {
    editBox.a(☃, ☃, ☃);
  }
  
  public void render()
  {
    editBox.g();
  }
  
  public void setMaxLength(int ☃)
  {
    editBox.f(☃);
  }
  
  public void setIsEditable(boolean ☃)
  {
    editBox.c(☃);
  }
}
