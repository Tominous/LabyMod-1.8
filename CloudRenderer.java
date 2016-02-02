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
    
    this.glListClouds = avd.a(1);
  }
  
  public void prepareToRender(boolean renderFancy, int cloudTickCounter, float partialTicks)
  {
    if (this.renderFancy != renderFancy) {
      this.updated = false;
    }
    this.renderFancy = renderFancy;
    this.cloudTickCounter = cloudTickCounter;
    this.partialTicks = partialTicks;
  }
  
  public boolean shouldUpdateGlList()
  {
    if (!this.updated) {
      return true;
    }
    if (this.cloudTickCounter >= this.cloudTickCounterUpdate + 20) {
      return true;
    }
    pk rve = this.mc.ac();
    boolean belowCloudsPrev = this.cloudPlayerY + rve.aS() < 128.0D + this.mc.t.ofCloudsHeight * 128.0F;
    boolean belowClouds = rve.q + rve.aS() < 128.0D + this.mc.t.ofCloudsHeight * 128.0F;
    if (belowClouds != belowCloudsPrev) {
      return true;
    }
    return false;
  }
  
  public void startUpdateGlList()
  {
    GL11.glNewList(this.glListClouds, 4864);
  }
  
  public void endUpdateGlList()
  {
    GL11.glEndList();
    
    this.cloudTickCounterUpdate = this.cloudTickCounter;
    this.cloudPlayerX = this.mc.ac().p;
    this.cloudPlayerY = this.mc.ac().q;
    this.cloudPlayerZ = this.mc.ac().r;
    
    this.updated = true;
    
    bfl.G();
  }
  
  public void renderGlList()
  {
    pk entityliving = this.mc.ac();
    double exactPlayerX = entityliving.p + (entityliving.s - entityliving.p) * this.partialTicks;
    double exactPlayerY = entityliving.q + (entityliving.t - entityliving.q) * this.partialTicks;
    double exactPlayerZ = entityliving.r + (entityliving.u - entityliving.r) * this.partialTicks;
    double dc = this.cloudTickCounter - this.cloudTickCounterUpdate + this.partialTicks;
    float cdx = (float)(exactPlayerX - this.cloudPlayerX + dc * 0.03D);
    float cdy = (float)(exactPlayerY - this.cloudPlayerY);
    float cdz = (float)(exactPlayerZ - this.cloudPlayerZ);
    
    bfl.E();
    if (this.renderFancy) {
      bfl.b(-cdx / 12.0F, -cdy, -cdz / 12.0F);
    } else {
      bfl.b(-cdx, -cdy, -cdz);
    }
    bfl.o(this.glListClouds);
    
    bfl.F();
    
    bfl.G();
  }
  
  public void reset()
  {
    this.updated = false;
  }
}
