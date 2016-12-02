package mods.dmi.main;

import auk;
import auo;
import ave;
import avn;
import bet;
import bfd;
import bfl;
import bfx;
import biu;
import bms;
import de.labystudio.labymod.LabyMod;
import de.labystudio.utils.Color;
import de.labystudio.utils.DrawUtils;
import org.lwjgl.opengl.GL11;
import pr;
import um;

public class RenderEntity
{
  public static void renderNameTag(pr entity, double x, double y, double z)
  {
    if ((!settingsenabled) || (!DamageIndicator.allowed(getInstanceip))) {
      return;
    }
    int scale = settingsscale;
    if ((entity instanceof bet))
    {
      bet c = (bet)entity;
      if (c.ax()) {
        return;
      }
    }
    if (((entity instanceof um)) || (entity.av())) {
      return;
    }
    biu renderManager = ave.A().af();
    avn var13 = renderManager.c();
    bfl.E();
    bfl.b((float)x, (float)y + K + 0.5F - (entity.j_() ? K / 2.0F : 0.0F), (float)z);
    GL11.glNormal3f(0.0F, 1.0F, 0.0F);
    bfl.b(-e, 0.0F, 1.0F, 0.0F);
    bfl.b(f, 1.0F, 0.0F, 0.0F);
    bfl.a(-0.02666667F, -0.02666667F, 0.02666667F);
    bfl.f();
    bfl.a(false);
    bfl.i();
    bfl.l();
    bfl.a(770, 771, 1, 0);
    int hj = -10;
    if ((K < 100.0D) && ((entity instanceof bet)))
    {
      auo var128 = ((bet)entity).cp();
      auk var138 = var128.a(2);
      if (var138 != null) {
        hj = (int)(hj - (25.0D - getInstancedraw.getScale(scale) * 10.0D));
      }
    }
    bfl.x();
    bfx tessellator = bfx.a();
    bfd worldrenderer = tessellator.c();
    worldrenderer.a(7, bms.f);
    String var144 = "";
    int g = 0;
    double health = entity.bn();
    if (!settingsDMILayout)
    {
      var144 = Math.ceil(health) / 2.0D + Color.cl("c") + " ❤";
      g = 16;
    }
    else
    {
      String r = Color.cl("4");
      String d = Color.cl("7");
      String h = Color.cl("c");
      int max = (int)(entity.bu() / 2.0F);
      if (health == 0.0D)
      {
        for (int i = 0; i < max; i++) {
          var144 = var144 + d + "❤";
        }
      }
      else
      {
        for (int i = 1; i < (int)Math.ceil(health / 2.0D); i++) {
          var144 = var144 + r + "❤";
        }
        if (health % 2.0D != 0.0D) {
          var144 = var144 + h + "❤";
        } else {
          var144 = var144 + r + "❤";
        }
        for (int i = (int)Math.ceil(health / 2.0D); i < max; i++) {
          var144 = var144 + d + "❤";
        }
        g = 40;
      }
    }
    double k = getInstancedraw.getScale(scale);
    GL11.glScaled(k, k, k);
    int i = getInstancedraw.getStringWidth(var144) / 2;
    worldrenderer.b(-i - 1, hj, 0.0D).a(0.0F, 0.0F, 0.0F, 0.25F).d();
    worldrenderer.b(-i - 1, hj + 8, 0.0D).a(0.0F, 0.0F, 0.0F, 0.25F).d();
    worldrenderer.b(i + 1, hj + 8, 0.0D).a(0.0F, 0.0F, 0.0F, 0.25F).d();
    worldrenderer.b(i + 1, hj, 0.0D).a(0.0F, 0.0F, 0.0F, 0.25F).d();
    tessellator.b();
    bfl.w();
    bfl.a(true);
    bfl.j();
    var13.a(var144, -getInstancedraw.getStringWidth(var144) / 2 + 2, hj, -1);
    bfl.e();
    bfl.k();
    bfl.c(1.0F, 1.0F, 1.0F, 1.0F);
    bfl.F();
  }
}
