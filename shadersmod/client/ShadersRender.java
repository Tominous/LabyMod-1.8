package shadersmod.client;

import Reflector;
import adf;
import afh;
import auz;
import avc;
import ave;
import avh;
import bew;
import bfk;
import bfl;
import bfn;
import bfr;
import bia;
import bic;
import bid;
import bmh;
import bmj;
import bmk;
import bqs;
import java.nio.IntBuffer;
import nt;
import org.lwjgl.opengl.EXTFramebufferObject;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL20;
import org.lwjgl.opengl.GL30;
import pk;
import shadersmod.common.SMCEnvironment;
import yo;
import zw;
import zx;

public class ShadersRender
{
  public static void setFrustrumPosition(bic frustrum, double x, double y, double z)
  {
    frustrum.a(x, y, z);
  }
  
  public static void setupTerrain(bfr renderGlobal, pk viewEntity, double partialTicks, bia camera, int frameCount, boolean playerSpectator)
  {
    renderGlobal.a(viewEntity, partialTicks, camera, frameCount, playerSpectator);
  }
  
  public static void updateChunks(bfr renderGlobal, long finishTimeNano)
  {
    renderGlobal.a(finishTimeNano);
  }
  
  public static void beginTerrainSolid()
  {
    if (Shaders.isRenderingWorld)
    {
      Shaders.fogEnabled = true;
      Shaders.useProgram(7);
    }
  }
  
  public static void beginTerrainCutoutMipped()
  {
    if (Shaders.isRenderingWorld) {
      Shaders.useProgram(7);
    }
  }
  
  public static void beginTerrainCutout()
  {
    if (Shaders.isRenderingWorld) {
      Shaders.useProgram(7);
    }
  }
  
  public static void endTerrain()
  {
    if (Shaders.isRenderingWorld) {
      Shaders.useProgram(3);
    }
  }
  
  public static void beginTranslucent()
  {
    if (Shaders.isRenderingWorld)
    {
      if (Shaders.usedDepthBuffers >= 2)
      {
        bfl.g(33995);
        Shaders.checkGLError("pre copy depth");
        GL11.glCopyTexSubImage2D(3553, 0, 0, 0, 0, 0, Shaders.renderWidth, Shaders.renderHeight);
        Shaders.checkGLError("copy depth");
        bfl.g(33984);
      }
      Shaders.useProgram(12);
    }
  }
  
  public static void endTranslucent()
  {
    if (Shaders.isRenderingWorld) {
      Shaders.useProgram(3);
    }
  }
  
  public static void renderHand0(bfk er, float par1, int par2)
  {
    if (!Shaders.isShadowPass)
    {
      zw item = Shaders.itemToRender != null ? Shaders.itemToRender.b() : null;
      afh block = (item instanceof yo) ? ((yo)item).d() : null;
      if ((!(item instanceof yo)) || (!(block instanceof afh)) || (block.m() == adf.a))
      {
        Shaders.readCenterDepth();
        Shaders.beginHand();
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        er.b(par1, par2);
        Shaders.endHand();
        Shaders.isHandRendered = true;
      }
    }
  }
  
  public static void renderHand1(bfk er, float par1, int par2)
  {
    if (!Shaders.isShadowPass) {
      if (!Shaders.isHandRendered)
      {
        Shaders.readCenterDepth();
        bfl.l();
        Shaders.beginHand();
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        er.b(par1, par2);
        Shaders.endHand();
        Shaders.isHandRendered = true;
      }
    }
  }
  
  public static void renderItemFP(bfn itemRenderer, float par1)
  {
    bfl.a(true);
    
    bfl.c(519);
    GL11.glPushMatrix();
    IntBuffer drawBuffers = Shaders.activeDrawBuffers;
    Shaders.setDrawBuffers(Shaders.drawBuffersNone);
    Shaders.renderItemPass1DepthMask = true;
    itemRenderer.a(par1);
    Shaders.renderItemPass1DepthMask = false;
    Shaders.setDrawBuffers(drawBuffers);
    GL11.glPopMatrix();
    
    bfl.c(515);
    
    GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
    itemRenderer.a(par1);
  }
  
  public static void renderFPOverlay(bfk er, float par1, int par2)
  {
    if (!Shaders.isShadowPass)
    {
      Shaders.beginFPOverlay();
      er.b(par1, par2);
      Shaders.endFPOverlay();
    }
  }
  
  public static void beginBlockDamage()
  {
    if (Shaders.isRenderingWorld)
    {
      Shaders.useProgram(11);
      if (Shaders.programsID[11] == Shaders.programsID[7])
      {
        Shaders.setDrawBuffers(Shaders.drawBuffersColorAtt0);
        bfl.a(false);
      }
    }
  }
  
  public static void endBlockDamage()
  {
    if (Shaders.isRenderingWorld)
    {
      bfl.a(true);
      Shaders.useProgram(3);
    }
  }
  
  public static void renderShadowMap(bfk entityRenderer, int pass, float partialTicks, long finishTimeNano)
  {
    if ((Shaders.usedShadowDepthBuffers > 0) && (--Shaders.shadowPassCounter <= 0))
    {
      ave mc = ave.A();
      A.c("shadow pass");
      
      bfr renderGlobal = g;
      Shaders.isShadowPass = true;
      Shaders.shadowPassCounter = Shaders.shadowPassInterval;
      Shaders.preShadowPassThirdPersonView = t.aA;
      t.aA = 1;
      
      Shaders.checkGLError("pre shadow");
      GL11.glMatrixMode(5889);
      GL11.glPushMatrix();
      GL11.glMatrixMode(5888);
      GL11.glPushMatrix();
      
      A.c("shadow clear");
      EXTFramebufferObject.glBindFramebufferEXT(36160, Shaders.sfb);
      Shaders.checkGLError("shadow bind sfb");
      Shaders.useProgram(30);
      
      A.c("shadow camera");
      entityRenderer.a(partialTicks, 2);
      Shaders.setCameraShadow(partialTicks);
      auz.a(h, t.aA == 2);
      Shaders.checkGLError("shadow camera");
      
      GL20.glDrawBuffers(Shaders.sfbDrawBuffers);
      Shaders.checkGLError("shadow drawbuffers");
      GL11.glReadBuffer(0);
      Shaders.checkGLError("shadow readbuffer");
      
      EXTFramebufferObject.glFramebufferTexture2DEXT(36160, 36096, 3553, Shaders.sfbDepthTextures.get(0), 0);
      if (Shaders.usedShadowColorBuffers != 0) {
        EXTFramebufferObject.glFramebufferTexture2DEXT(36160, 36064, 3553, Shaders.sfbColorTextures.get(0), 0);
      }
      Shaders.checkFramebufferStatus("shadow fb");
      GL11.glClearColor(1.0F, 1.0F, 1.0F, 1.0F);
      GL11.glClear(Shaders.usedShadowColorBuffers != 0 ? 16640 : 256);
      Shaders.checkGLError("shadow clear");
      
      A.c("shadow frustum");
      bid clippingHelper = ClippingHelperShadow.getInstance();
      A.c("shadow culling");
      bic frustum = new bic(clippingHelper);
      
      pk viewEntity = mc.ac();
      double viewPosX = P + (s - P) * partialTicks;
      double viewPosY = Q + (t - Q) * partialTicks;
      double viewPosZ = R + (u - R) * partialTicks;
      frustum.a(viewPosX, viewPosY, viewPosZ);
      
      bfl.j(7425);
      bfl.j();
      bfl.c(515);
      bfl.a(true);
      bfl.a(true, true, true, true);
      
      bfl.p();
      
      A.c("shadow prepareterrain");
      mc.P().a(bmh.g);
      
      A.c("shadow setupterrain");
      int frameCount = 0;
      frameCount = ae;
      ae = (frameCount + 1);
      renderGlobal.a(viewEntity, partialTicks, frustum, frameCount, h.v());
      A.c("shadow updatechunks");
      
      A.c("shadow terrain");
      
      bfl.n(5888);
      bfl.E();
      bfl.c();
      renderGlobal.a(adf.a, partialTicks, 2, viewEntity);
      Shaders.checkGLError("shadow terrain solid");
      bfl.d();
      renderGlobal.a(adf.b, partialTicks, 2, viewEntity);
      Shaders.checkGLError("shadow terrain cutoutmipped");
      mc.P().b(bmh.g).b(false, false);
      renderGlobal.a(adf.c, partialTicks, 2, viewEntity);
      Shaders.checkGLError("shadow terrain cutout");
      mc.P().b(bmh.g).a();
      bfl.j(7424);
      bfl.a(516, 0.1F);
      
      bfl.n(5888);
      bfl.F();
      bfl.E();
      
      A.c("shadow entities");
      if (SMCEnvironment.hasForge) {
        Reflector.call(Reflector.ForgeHooksClient_setRenderPass, new Object[] { Integer.valueOf(0) });
      }
      renderGlobal.a(viewEntity, frustum, partialTicks);
      Shaders.checkGLError("shadow entities");
      
      bfl.n(5888);
      bfl.F();
      
      bfl.a(true);
      
      bfl.k();
      bfl.o();
      bfl.a(770, 771, 1, 0);
      bfl.a(516, 0.1F);
      if (Shaders.usedShadowDepthBuffers >= 2)
      {
        bfl.g(33989);
        Shaders.checkGLError("pre copy shadow depth");
        GL11.glCopyTexSubImage2D(3553, 0, 0, 0, 0, 0, Shaders.shadowMapWidth, Shaders.shadowMapHeight);
        Shaders.checkGLError("copy shadow depth");
        bfl.g(33984);
      }
      bfl.k();
      bfl.a(true);
      mc.P().a(bmh.g);
      bfl.j(7425);
      Shaders.checkGLError("shadow pre-translucent");
      GL20.glDrawBuffers(Shaders.sfbDrawBuffers);
      Shaders.checkGLError("shadow drawbuffers pre-translucent");
      Shaders.checkFramebufferStatus("shadow pre-translucent");
      
      A.c("shadow translucent");
      renderGlobal.a(adf.d, partialTicks, 2, viewEntity);
      Shaders.checkGLError("shadow translucent");
      if (SMCEnvironment.hasForge)
      {
        avc.b();
        Reflector.call(Reflector.ForgeHooksClient_setRenderPass, new Object[] { Integer.valueOf(1) });
        renderGlobal.a(viewEntity, frustum, partialTicks);
        Reflector.call(Reflector.ForgeHooksClient_setRenderPass, new Object[] { Integer.valueOf(-1) });
        avc.a();
        Shaders.checkGLError("shadow entities 1");
      }
      bfl.j(7424);
      bfl.a(true);
      bfl.o();
      bfl.k();
      
      GL11.glFlush();
      Shaders.checkGLError("shadow flush");
      
      Shaders.isShadowPass = false;
      t.aA = Shaders.preShadowPassThirdPersonView;
      
      A.c("shadow postprocess");
      if (Shaders.hasGlGenMipmap)
      {
        if (Shaders.usedShadowDepthBuffers >= 1)
        {
          if (Shaders.shadowMipmapEnabled[0] != 0)
          {
            bfl.g(33988);
            bfl.i(Shaders.sfbDepthTextures.get(0));
            GL30.glGenerateMipmap(3553);
            GL11.glTexParameteri(3553, 10241, Shaders.shadowFilterNearest[0] != 0 ? 9984 : 9987);
          }
          if (Shaders.usedShadowDepthBuffers >= 2) {
            if (Shaders.shadowMipmapEnabled[1] != 0)
            {
              bfl.g(33989);
              bfl.i(Shaders.sfbDepthTextures.get(1));
              GL30.glGenerateMipmap(3553);
              GL11.glTexParameteri(3553, 10241, Shaders.shadowFilterNearest[1] != 0 ? 9984 : 9987);
            }
          }
          bfl.g(33984);
        }
        if (Shaders.usedShadowColorBuffers >= 1)
        {
          if (Shaders.shadowColorMipmapEnabled[0] != 0)
          {
            bfl.g(33997);
            bfl.i(Shaders.sfbColorTextures.get(0));
            GL30.glGenerateMipmap(3553);
            GL11.glTexParameteri(3553, 10241, Shaders.shadowColorFilterNearest[0] != 0 ? 9984 : 9987);
          }
          if (Shaders.usedShadowColorBuffers >= 2) {
            if (Shaders.shadowColorMipmapEnabled[1] != 0)
            {
              bfl.g(33998);
              bfl.i(Shaders.sfbColorTextures.get(1));
              GL30.glGenerateMipmap(3553);
              GL11.glTexParameteri(3553, 10241, Shaders.shadowColorFilterNearest[1] != 0 ? 9984 : 9987);
            }
          }
          bfl.g(33984);
        }
      }
      Shaders.checkGLError("shadow postprocess");
      EXTFramebufferObject.glBindFramebufferEXT(36160, Shaders.dfb);
      GL11.glViewport(0, 0, Shaders.renderWidth, Shaders.renderHeight);
      Shaders.activeDrawBuffers = null;
      mc.P().a(bmh.g);
      Shaders.useProgram(7);
      GL11.glMatrixMode(5888);
      GL11.glPopMatrix();
      GL11.glMatrixMode(5889);
      GL11.glPopMatrix();
      GL11.glMatrixMode(5888);
      Shaders.checkGLError("shadow end");
    }
  }
  
  public static void preRenderChunkLayer()
  {
    if (bqs.f())
    {
      GL11.glEnableClientState(32885);
      GL20.glEnableVertexAttribArray(Shaders.midTexCoordAttrib);
      GL20.glEnableVertexAttribArray(Shaders.tangentAttrib);
      GL20.glEnableVertexAttribArray(Shaders.entityAttrib);
    }
  }
  
  public static void postRenderChunkLayer()
  {
    if (bqs.f())
    {
      GL11.glDisableClientState(32885);
      GL20.glDisableVertexAttribArray(Shaders.midTexCoordAttrib);
      GL20.glDisableVertexAttribArray(Shaders.tangentAttrib);
      GL20.glDisableVertexAttribArray(Shaders.entityAttrib);
    }
  }
  
  public static void setupArrayPointersVbo()
  {
    int vertexSizeI = 14;
    GL11.glVertexPointer(3, 5126, 56, 0L);
    GL11.glColorPointer(4, 5121, 56, 12L);
    GL11.glTexCoordPointer(2, 5126, 56, 16L);
    bqs.l(bqs.r);
    GL11.glTexCoordPointer(2, 5122, 56, 24L);
    bqs.l(bqs.q);
    GL11.glNormalPointer(5120, 56, 28L);
    GL20.glVertexAttribPointer(Shaders.midTexCoordAttrib, 2, 5126, false, 56, 32L);
    GL20.glVertexAttribPointer(Shaders.tangentAttrib, 4, 5122, false, 56, 40L);
    GL20.glVertexAttribPointer(Shaders.entityAttrib, 3, 5122, false, 56, 48L);
  }
  
  public static void beaconBeamBegin()
  {
    Shaders.useProgram(14);
  }
  
  public static void beaconBeamStartQuad1() {}
  
  public static void beaconBeamStartQuad2() {}
  
  public static void beaconBeamDraw1() {}
  
  public static void beaconBeamDraw2() {}
  
  public static void layerArmorBaseDrawEnchantedGlintBegin()
  {
    Shaders.useProgram(17);
  }
  
  public static void layerArmorBaseDrawEnchantedGlintEnd()
  {
    if (Shaders.isRenderingWorld) {
      Shaders.useProgram(16);
    } else {
      Shaders.useProgram(0);
    }
  }
}
