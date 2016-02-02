package net.minecraft.realms;

import ave;
import avw;

public class RealmsEditBox
{
  private final avw editBox;
  
  public RealmsEditBox(int ☃, int ☃, int ☃, int ☃, int ☃)
  {
    this.editBox = new avw(☃, ave.A().k, ☃, ☃, ☃, ☃);
  }
  
  public String getValue()
  {
    return this.editBox.b();
  }
  
  public void tick()
  {
    this.editBox.a();
  }
  
  public void setFocus(boolean ☃)
  {
    this.editBox.b(☃);
  }
  
  public void setValue(String ☃)
  {
    this.editBox.a(☃);
  }
  
  public void keyPressed(char ☃, int ☃)
  {
    this.editBox.a(☃, ☃);
  }
  
  public boolean isFocused()
  {
    return this.editBox.m();
  }
  
  public void mouseClicked(int ☃, int ☃, int ☃)
  {
    this.editBox.a(☃, ☃, ☃);
  }
  
  public void render()
  {
    this.editBox.g();
  }
  
  public void setMaxLength(int ☃)
  {
    this.editBox.f(☃);
  }
  
  public void setIsEditable(boolean ☃)
  {
    this.editBox.c(☃);
  }
}
