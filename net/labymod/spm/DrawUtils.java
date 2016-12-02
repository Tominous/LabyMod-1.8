package net.labymod.spm;

import ave;
import avp;
import bfd;
import bfl;
import bfx;
import bmj;
import bms;

public class DrawUtils
{
  public static void drawBackground(int left, int top, int right, int bottom)
  {
    bfl.f();
    bfl.n();
    bfx tessellator = bfx.a();
    bfd worldrenderer = tessellator.c();
    ave.A().P().a(avp.b);
    bfl.c(1.0F, 1.0F, 1.0F, 1.0F);
    float f = 32.0F;
    int amountScrolled = 0;
    worldrenderer.a(7, bms.i);
    worldrenderer.b(left, bottom, 0.0D).a(left / f, (bottom + amountScrolled) / f).b(32, 32, 32, 255).d();
    worldrenderer.b(right, bottom, 0.0D).a(right / f, (bottom + amountScrolled) / f).b(32, 32, 32, 255).d();
    worldrenderer.b(right, top, 0.0D).a(right / f, (top + amountScrolled) / f).b(32, 32, 32, 255).d();
    worldrenderer.b(left, top, 0.0D).a(left / f, (top + amountScrolled) / f).b(32, 32, 32, 255).d();
    tessellator.b();
    bfl.l();
    bfl.a(770, 771, 0, 1);
    bfl.c();
    bfl.j(7425);
    bfl.i();
    int i1 = 4;
    bfl.l();
    bfl.a(770, 771, 0, 1);
    bfl.c();
    bfl.j(7425);
    bfl.w();
    worldrenderer.a(7, bms.i);
    worldrenderer.b(left, top + i1, 0.0D).a(0.0D, 1.0D).b(0, 0, 0, 0).d();
    worldrenderer.b(right, top + i1, 0.0D).a(1.0D, 1.0D).b(0, 0, 0, 0).d();
    worldrenderer.b(right, top, 0.0D).a(1.0D, 0.0D).b(0, 0, 0, 255).d();
    worldrenderer.b(left, top, 0.0D).a(0.0D, 0.0D).b(0, 0, 0, 255).d();
    tessellator.b();
    worldrenderer.a(7, bms.i);
    worldrenderer.b(left, bottom, 0.0D).a(0.0D, 1.0D).b(0, 0, 0, 255).d();
    worldrenderer.b(right, bottom, 0.0D).a(1.0D, 1.0D).b(0, 0, 0, 255).d();
    worldrenderer.b(right, bottom - i1, 0.0D).a(1.0D, 0.0D).b(0, 0, 0, 0).d();
    worldrenderer.b(left, bottom - i1, 0.0D).a(0.0D, 0.0D).b(0, 0, 0, 0).d();
    tessellator.b();
    bfl.j(7424);
    bfl.d();
    bfl.k();
  }
  
  public static void overlayBackground(int startX, int startY, int endX, int endY)
  {
    int endAlpha = 255;
    int startAlpha = 255;
    bfx tessellator = bfx.a();
    bfd worldrenderer = tessellator.c();
    ave.A().P().a(avp.b);
    bfl.c(1.0F, 1.0F, 1.0F, 1.0F);
    float f = 32.0F;
    worldrenderer.a(7, bms.i);
    worldrenderer.b(startX, endY, 0.0D).a(0.0D, endY / 32.0F).b(64, 64, 64, endAlpha).d();
    worldrenderer.b(startX + endX, endY, 0.0D).a(endX / 32.0F, endY / 32.0F).b(64, 64, 64, endAlpha).d();
    worldrenderer.b(startX + endX, startY, 0.0D).a(endX / 32.0F, startY / 32.0F).b(64, 64, 64, startAlpha).d();
    worldrenderer.b(startX, startY, 0.0D).a(0.0D, startY / 32.0F).b(64, 64, 64, startAlpha).d();
    tessellator.b();
  }
}
