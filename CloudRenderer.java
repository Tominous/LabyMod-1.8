import org.lwjgl.opengl.GL11;

public class CloudRenderer
{
  private ave mc;
  private boolean updated = false;
  private boolean renderFancy = false;
  int cloudTickCounter;
  float partialTicks;
  private int glListClouds = -1;
  private int cloudTickCounterUpdate = 0;
  private double cloudPlayerX = 0.0D;
  private double cloudPlayerY = 0.0D;
  private double cloudPlayerZ = 0.0D;
  
  public CloudRenderer(ave mc)
  {
    this.mc = mc;
    
    glListClouds = avd.a(1);
  }
  
  public void prepareToRender(boolean renderFancy, int cloudTickCounter, float partialTicks)
  {
    if (this.renderFancy != renderFancy) {
      updated = false;
    }
    this.renderFancy = renderFancy;
    this.cloudTickCounter = cloudTickCounter;
    this.partialTicks = partialTicks;
  }
  
  public boolean shouldUpdateGlList()
  {
    if (!updated) {
      return true;
    }
    if (cloudTickCounter >= cloudTickCounterUpdate + 20) {
      return true;
    }
    pk rve = mc.ac();
    boolean belowCloudsPrev = cloudPlayerY + rve.aS() < 128.0D + mc.t.ofCloudsHeight * 128.0F;
    boolean belowClouds = q + rve.aS() < 128.0D + mc.t.ofCloudsHeight * 128.0F;
    if (belowClouds != belowCloudsPrev) {
      return true;
    }
    return false;
  }
  
  public void startUpdateGlList()
  {
    GL11.glNewList(glListClouds, 4864);
  }
  
  public void endUpdateGlList()
  {
    GL11.glEndList();
    
    cloudTickCounterUpdate = cloudTickCounter;
    cloudPlayerX = mc.ac().p;
    cloudPlayerY = mc.ac().q;
    cloudPlayerZ = mc.ac().r;
    
    updated = true;
    
    bfl.G();
  }
  
  public void renderGlList()
  {
    pk entityliving = mc.ac();
    double exactPlayerX = p + (s - p) * partialTicks;
    double exactPlayerY = q + (t - q) * partialTicks;
    double exactPlayerZ = r + (u - r) * partialTicks;
    double dc = cloudTickCounter - cloudTickCounterUpdate + partialTicks;
    float cdx = (float)(exactPlayerX - cloudPlayerX + dc * 0.03D);
    float cdy = (float)(exactPlayerY - cloudPlayerY);
    float cdz = (float)(exactPlayerZ - cloudPlayerZ);
    
    bfl.E();
    if (renderFancy) {
      bfl.b(-cdx / 12.0F, -cdy, -cdz / 12.0F);
    } else {
      bfl.b(-cdx, -cdy, -cdz);
    }
    bfl.o(glListClouds);
    
    bfl.F();
    
    bfl.G();
  }
  
  public void reset()
  {
    updated = false;
  }
}
