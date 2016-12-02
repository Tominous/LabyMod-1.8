import java.util.BitSet;
import java.util.List;

public class RenderEnv
{
  private adq blockAccess;
  private alz blockState;
  private cj blockPos;
  private avh gameSettings;
  private int blockId = -1;
  private int metadata = -1;
  private int breakingAnimation = -1;
  private float[] quadBounds = new float[cq.n.length * 2];
  private BitSet boundsFlags = new BitSet(3);
  private bgf.b aoFace = new bgf.b();
  private BlockPosM colorizerBlockPos = null;
  private boolean[] borderFlags = null;
  private static ThreadLocal threadLocalInstance = new ThreadLocal();
  
  private RenderEnv(adq blockAccess, alz blockState, cj blockPos)
  {
    this.blockAccess = blockAccess;
    this.blockState = blockState;
    this.blockPos = blockPos;
    gameSettings = Config.getGameSettings();
  }
  
  public static RenderEnv getInstance(adq blockAccessIn, alz blockStateIn, cj blockPosIn)
  {
    RenderEnv re = (RenderEnv)threadLocalInstance.get();
    if (re == null)
    {
      re = new RenderEnv(blockAccessIn, blockStateIn, blockPosIn);
      threadLocalInstance.set(re);
      return re;
    }
    re.reset(blockAccessIn, blockStateIn, blockPosIn);
    return re;
  }
  
  private void reset(adq blockAccessIn, alz blockStateIn, cj blockPosIn)
  {
    blockAccess = blockAccessIn;
    blockState = blockStateIn;
    blockPos = blockPosIn;
    
    blockId = -1;
    metadata = -1;
    breakingAnimation = -1;
    boundsFlags.clear();
  }
  
  public int getBlockId()
  {
    if (blockId < 0) {
      blockId = afh.a(blockState.c());
    }
    return blockId;
  }
  
  public int getMetadata()
  {
    if (metadata < 0) {
      metadata = blockState.c().c(blockState);
    }
    return metadata;
  }
  
  public float[] getQuadBounds()
  {
    return quadBounds;
  }
  
  public BitSet getBoundsFlags()
  {
    return boundsFlags;
  }
  
  public bgf.b getAoFace()
  {
    return aoFace;
  }
  
  public boolean isBreakingAnimation(List listQuads)
  {
    if (breakingAnimation < 0) {
      if (listQuads.size() > 0) {
        if ((listQuads.get(0) instanceof bgn)) {
          breakingAnimation = 1;
        } else {
          breakingAnimation = 0;
        }
      }
    }
    return breakingAnimation == 1;
  }
  
  public boolean isBreakingAnimation(bgg quad)
  {
    if (breakingAnimation < 0) {
      if ((quad instanceof bgn)) {
        breakingAnimation = 1;
      } else {
        breakingAnimation = 0;
      }
    }
    return breakingAnimation == 1;
  }
  
  public boolean isBreakingAnimation()
  {
    return breakingAnimation == 1;
  }
  
  public alz getBlockState()
  {
    return blockState;
  }
  
  public BlockPosM getColorizerBlockPos()
  {
    if (colorizerBlockPos == null) {
      colorizerBlockPos = new BlockPosM(0, 0, 0);
    }
    return colorizerBlockPos;
  }
  
  public boolean[] getBorderFlags()
  {
    if (borderFlags == null) {
      borderFlags = new boolean[4];
    }
    return borderFlags;
  }
}
