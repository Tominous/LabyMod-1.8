public class BetterSnow
{
  private static boq modelSnowLayer = null;
  
  public static void update()
  {
    modelSnowLayer = Config.getMinecraft().ae().a().b(afi.aH.Q());
  }
  
  public static boq getModelSnowLayer()
  {
    return modelSnowLayer;
  }
  
  public static alz getStateSnowLayer()
  {
    return afi.aH.Q();
  }
  
  public static boolean shouldRender(adq blockAccess, afh block, alz blockState, cj blockPos)
  {
    if (!checkBlock(block, blockState)) {
      return false;
    }
    return hasSnowNeighbours(blockAccess, blockPos);
  }
  
  private static boolean hasSnowNeighbours(adq blockAccess, cj pos)
  {
    afh blockSnow = afi.aH;
    if ((blockAccess.p(pos.c()).c() == blockSnow) || (blockAccess.p(pos.d()).c() == blockSnow) || (blockAccess.p(pos.e()).c() == blockSnow) || (blockAccess.p(pos.f()).c() == blockSnow)) {
      return blockAccess.p(pos.b()).c().c();
    }
    return false;
  }
  
  private static boolean checkBlock(afh block, alz blockState)
  {
    if (block.d()) {
      return false;
    }
    if (block.c()) {
      return false;
    }
    if ((block instanceof ajp)) {
      return false;
    }
    if ((block instanceof afm)) {
      if (((block instanceof agi)) || ((block instanceof agw)) || ((block instanceof aia)) || ((block instanceof ajj)) || ((block instanceof akc))) {
        return true;
      }
    }
    if (((block instanceof agt)) || ((block instanceof agu)) || ((block instanceof agx)) || ((block instanceof akd)) || ((block instanceof aje)) || ((block instanceof akl))) {
      return true;
    }
    if ((block instanceof ajd)) {
      if (blockState.b(akf.a) == cq.b) {
        return true;
      }
    }
    if ((block instanceof ahu))
    {
      Object orient = blockState.b(ahu.a);
      if ((orient == ahu.a.g) || (orient == ahu.a.f)) {
        return true;
      }
    }
    return false;
  }
}
