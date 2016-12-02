package mods.worldeditcui.event.listeners;

import ave;
import bfl;
import bqs;
import mods.worldeditcui.WorldEditCUI;
import mods.worldeditcui.render.region.BaseRegion;
import mods.worldeditcui.util.Vector3;
import org.lwjgl.opengl.GL11;

public class CUIListenerWorldRender
{
  private WorldEditCUI controller;
  private ave minecraft;
  
  public CUIListenerWorldRender(WorldEditCUI controller, ave minecraft)
  {
    this.controller = controller;
    this.minecraft = minecraft;
  }
  
  public void onRender(double partialTicks)
  {
    try
    {
      bqs.a(bqs.r, 240.0F, 240.0F);
      GL11.glBlendFunc(770, 771);
      bfl.l();
      bfl.d();
      GL11.glAlphaFunc(516, 0.0F);
      bfl.x();
      bfl.j();
      GL11.glDepthMask(false);
      GL11.glPushMatrix();
      bfl.n();
      try
      {
        Vector3 cameraPos = new Vector3(minecraft.ac(), partialTicks);
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 0.5F);
        if (controller.getSelection() != null) {
          controller.getSelection().render(cameraPos);
        }
      }
      catch (Exception localException) {}
      GL11.glDepthFunc(515);
      GL11.glPopMatrix();
      GL11.glDepthMask(true);
      bfl.w();
      bfl.k();
      GL11.glAlphaFunc(516, 0.1F);
    }
    catch (Exception localException1) {}
  }
}
