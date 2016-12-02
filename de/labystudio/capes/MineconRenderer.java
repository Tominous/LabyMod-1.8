package de.labystudio.capes;

import ave;
import bet;
import bfl;
import bmj;
import de.labystudio.labymod.LabyMod;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
import jy;
import ns;

public class MineconRenderer
{
  private static jy starTexture = new jy("star.png");
  private static Random random = LabyMod.random;
  private long lastSpawn = 0L;
  private ArrayList<Star> stars;
  
  public void render(bet abstractClientPlayer)
  {
    if (this.stars == null) {
      this.stars = new ArrayList();
    }
    ave mc = ave.A();
    float partialTicks = LabyMod.getInstance().getPartialTicks();
    mc.P().a(starTexture);
    if (this.lastSpawn < System.currentTimeMillis())
    {
      this.stars.add(new Star(random));
      this.lastSpawn = (System.currentTimeMillis() + random.nextInt(1000));
    }
    bfl.E();
    transform(abstractClientPlayer, partialTicks);
    Iterator<Star> it = this.stars.iterator();
    while (it.hasNext())
    {
      Star star = (Star)it.next();
      if (star.isKilled()) {
        it.remove();
      }
      star.draw();
    }
    bfl.F();
  }
  
  private void transform(bet entity, float partialTicks)
  {
    bfl.b(0.0F, 0.0F, 0.125F);
    double d0 = entity.bq + (entity.bt - entity.bq) * partialTicks - (entity.p + (entity.s - entity.p) * partialTicks);
    double d1 = entity.br + (entity.bu - entity.br) * partialTicks - (entity.q + (entity.t - entity.q) * partialTicks);
    double d2 = entity.bs + (entity.bv - entity.bs) * partialTicks - (entity.r + (entity.u - entity.r) * partialTicks);
    float f = entity.aJ + (entity.aI - entity.aJ) * partialTicks;
    double d3 = ns.a(f * 3.1415927F / 180.0F);
    double d4 = -ns.b(f * 3.1415927F / 180.0F);
    float f1 = (float)d1 * 10.0F;
    f1 = ns.a(f1, -6.0F, 32.0F);
    float f2 = (float)(d0 * d3 + d2 * d4) * 100.0F;
    float f3 = (float)(d0 * d4 - d2 * d3) * 100.0F;
    if (f2 < 0.0F) {
      f2 = 0.0F;
    }
    float f4 = entity.bn + (entity.bo - entity.bn) * partialTicks;
    f1 += ns.a((entity.L + (entity.M - entity.L) * partialTicks) * 6.0F) * 32.0F * f4;
    if (entity.av()) {
      f1 += 25.0F;
    }
    bfl.b(6.0F + f2 / 2.0F + f1, 1.0F, 0.0F, 0.0F);
    bfl.b(f3 / 2.0F, 0.0F, 0.0F, 1.0F);
    bfl.b(-f3 / 2.0F, 0.0F, 1.0F, 0.0F);
    bfl.b(180.0F, 0.0F, 1.0F, 0.0F);
  }
}
