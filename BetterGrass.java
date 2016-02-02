import java.util.ArrayList;
import java.util.List;

public class BetterGrass
{
  private static boq modelEmpty = new bow(new ArrayList(), new ArrayList(), false, false, null, null);
  private static boq modelCubeMycelium = null;
  private static boq modelCubeGrassSnowy = null;
  private static boq modelCubeGrass = null;
  
  public static void update()
  {
    modelCubeGrass = BlockModelUtils.makeModelCube("minecraft:blocks/grass_top", 0);
    modelCubeGrassSnowy = BlockModelUtils.makeModelCube("minecraft:blocks/snow", -1);
    modelCubeMycelium = BlockModelUtils.makeModelCube("minecraft:blocks/mycelium_top", -1);
  }
  
  public static List getFaceQuads(adq blockAccess, afh block, cj blockPos, cq facing, List quads)
  {
    if ((facing == cq.b) || (facing == cq.a)) {
      return quads;
    }
    if ((block instanceof aib))
    {
      if (Config.isBetterGrassFancy())
      {
        if (getBlockAt(blockPos.b(), facing, blockAccess) == afi.bw) {
          return modelCubeMycelium.a(facing);
        }
        return quads;
      }
      return modelCubeMycelium.a(facing);
    }
    if ((block instanceof ahe))
    {
      afh blockUp = blockAccess.p(blockPos.a()).c();
      boolean snowy = (blockUp == afi.aJ) || (blockUp == afi.aH);
      if (Config.isBetterGrassFancy())
      {
        if (snowy)
        {
          if (getBlockAt(blockPos, facing, blockAccess) == afi.aH) {
            return modelCubeGrassSnowy.a(facing);
          }
        }
        else if (getBlockAt(blockPos.b(), facing, blockAccess) == afi.c) {
          return modelCubeGrass.a(facing);
        }
      }
      else
      {
        if (snowy) {
          return modelCubeGrassSnowy.a(facing);
        }
        return modelCubeGrass.a(facing);
      }
    }
    return quads;
  }
  
  private static afh getBlockAt(cj blockPos, cq facing, adq blockAccess)
  {
    cj pos = blockPos.a(facing);
    
    afh block = blockAccess.p(pos).c();
    
    return block;
  }
}
