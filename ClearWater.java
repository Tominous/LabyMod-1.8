public class ClearWater
{
  public static void updateWaterOpacity(avh settings, adm world)
  {
    if (settings != null)
    {
      int opacity = 3;
      if (settings.ofClearWater) {
        opacity = 1;
      }
      BlockUtils.setLightOpacity(afi.j, opacity);
      BlockUtils.setLightOpacity(afi.i, opacity);
    }
    if (world == null) {
      return;
    }
    amv cp = world.N();
    if (cp == null) {
      return;
    }
    pk rve = Config.getMinecraft().ac();
    if (rve == null) {
      return;
    }
    int cViewX = (int)rve.s / 16;
    int cViewZ = (int)rve.u / 16;
    
    int cXMin = cViewX - 512;
    int cXMax = cViewX + 512;
    int cZMin = cViewZ - 512;
    int cZMax = cViewZ + 512;
    
    int countUpdated = 0;
    for (int cx = cXMin; cx < cXMax; cx++) {
      for (int cz = cZMin; cz < cZMax; cz++) {
        if (cp.a(cx, cz))
        {
          amy c = cp.d(cx, cz);
          if ((c != null) && (!(c instanceof amx)))
          {
            int x0 = cx << 4;
            int z0 = cz << 4;
            int x1 = x0 + 16;
            int z1 = z0 + 16;
            BlockPosM posXZ = new BlockPosM(0, 0, 0);
            BlockPosM posXYZ = new BlockPosM(0, 0, 0);
            for (int x = x0; x < x1; x++) {
              for (int z = z0; z < z1; z++)
              {
                posXZ.setXyz(x, 0, z);
                
                cj posH = world.q(posXZ);
                for (int y = 0; y < posH.o(); y++)
                {
                  posXYZ.setXyz(x, y, z);
                  alz bs = world.p(posXYZ);
                  if (bs.c().t() == arm.h)
                  {
                    world.a(x, z, posXYZ.o(), posH.o());
                    countUpdated++;
                    break;
                  }
                }
              }
            }
          }
        }
      }
    }
    if (countUpdated > 0)
    {
      String threadName = "server";
      if (Config.isMinecraftThread()) {
        threadName = "client";
      }
      Config.dbg("ClearWater (" + threadName + ") relighted " + countUpdated + " chunks");
    }
  }
}
