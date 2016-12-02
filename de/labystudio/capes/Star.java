package de.labystudio.capes;

import bfl;
import de.labystudio.labymod.LabyMod;
import de.labystudio.utils.DrawUtils;
import java.util.Random;
import org.lwjgl.opengl.GL11;

public class Star
{
  private double x = 0.0D;
  private double y = 0.0D;
  private long duration = 0L;
  private int lastDuration = 700;
  private double motion = 0.0D;
  private double maxSize = 0.0D;
  private boolean killed = false;
  
  public Star(Random random)
  {
    this.x = (random.nextDouble() * 400.0D);
    this.y = (random.nextDouble() * 900.0D * 2.0D);
    this.duration = System.currentTimeMillis();
    this.motion = ((random.nextDouble() - 0.5D) * 10.0D);
    this.maxSize = (random.nextDouble() + 0.9D);
  }
  
  public void draw()
  {
    long zero = System.currentTimeMillis() - this.duration;
    double scale = zero / this.lastDuration / this.maxSize;
    if (zero >= this.lastDuration)
    {
      this.killed = true;
      return;
    }
    bfl.E();
    bfl.a(5.0E-4D, 5.0E-4D, 5.0E-4D);
    bfl.a(scale, scale, scale);
    bfl.l();
    GL11.glColor4f(255.0F, 255.0F, 255.0F, (float)(0.6000000238418579D - scale));
    bfl.b((this.x - 200.0D - (scale + this.motion) * 100.0D) / scale, (this.y + 150.0D - scale * 100.0D) / scale, -135.0D / scale);
    LabyMod.getInstance().draw.b(0, 0, 0, 0, 240, 250);
    bfl.k();
    GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
    bfl.F();
  }
  
  public boolean isKilled()
  {
    return this.killed;
  }
}
