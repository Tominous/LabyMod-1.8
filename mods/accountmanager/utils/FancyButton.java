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
    if (m)
    {
      avn fontrenderer = k;
      mc.P().a(a);
      bfl.c(1.0F, 1.0F, 1.0F, 1.0F);
      n = ((mouseX >= h) && (mouseY >= i) && (mouseX < h + f) && (mouseY < i + g));
      
      int k = a(n);
      if (this.l)
      {
        if ((!n) && (fade < 100)) {
          fade += 2;
        }
        if ((n) && (fade > 70)) {
          fade -= 2;
        }
        avp.a(h, i, h + f, i + g, new Color(52, 152, 219, fade)
          .getRGB());
      }
      else
      {
        avp.a(h, i, h + f, i + g, new Color(44, 62, 80, 100)
          .getRGB());
      }
      b(mc, mouseX, mouseY);
      int l = 14737632;
      
      a(fontrenderer, j, h + f / 2, i + (g - 8) / 2, l);
    }
  }
}
