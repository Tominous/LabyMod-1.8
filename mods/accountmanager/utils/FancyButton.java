package mods.accountmanager.utils;

import ave;
import avn;
import avp;
import avs;
import bfl;
import bmj;
import java.awt.Color;

public class FancyButton
  extends avs
{
  public FancyButton(int buttonId, int x, int y, int widthIn, int heightIn, String buttonText)
  {
    super(buttonId, x, y, widthIn, heightIn, buttonText);
  }
  
  private int fade = 70;
  
  public void a(ave mc, int mouseX, int mouseY)
  {
    if (this.m)
    {
      avn fontrenderer = mc.k;
      mc.P().a(a);
      bfl.c(1.0F, 1.0F, 1.0F, 1.0F);
      this.n = ((mouseX >= this.h) && (mouseY >= this.i) && (mouseX < this.h + this.f) && (mouseY < this.i + this.g));
      
      int k = a(this.n);
      if (this.l)
      {
        if ((!this.n) && (this.fade < 100)) {
          this.fade += 2;
        }
        if ((this.n) && (this.fade > 70)) {
          this.fade -= 2;
        }
        avp.a(this.h, this.i, this.h + this.f, this.i + this.g, new Color(52, 152, 219, this.fade)
          .getRGB());
      }
      else
      {
        avp.a(this.h, this.i, this.h + this.f, this.i + this.g, new Color(44, 62, 80, 100)
          .getRGB());
      }
      b(mc, mouseX, mouseY);
      int l = 14737632;
      
      a(fontrenderer, this.j, this.h + this.f / 2, this.i + (this.g - 8) / 2, l);
    }
  }
}
