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
    this.gameSettings = Config.getGameSettings();
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
    this.blockAccess = blockAccessIn;
    this.blockState = blockStateIn;
    this.blockPos = blockPosIn;
    
    this.blockId = -1;
    this.metadata = -1;
    this.breakingAnimation = -1;
    this.boundsFlags.clear();
  }
  
  public int getBlockId()
  {
    if (this.blockId < 0) {
      this.blockId = afh.a(this.blockState.c());
    }
    return this.blockId;
  }
  
  public int getMetadata()
  {
    if (this.metadata < 0) {
      this.metadata = this.blockState.c().c(this.blockState);
    }
    return this.metadata;
  }
  
  public float[] getQuadBounds()
  {
    return this.quadBounds;
  }
  
  public BitSet getBoundsFlags()
  {
    return this.boundsFlags;
  }
  
  public bgf.b getAoFace()
  {
    return this.aoFace;
  }
  
  public boolean isBreakingAnimation(List listQuads)
  {
    if (this.breakingAnimation < 0) {
      if (listQuads.size() > 0) {
        if ((listQuads.get(0) instanceof bgn)) {
          this.breakingAnimation = 1;
        } else {
          this.breakingAnimation = 0;
        }
      }
    }
    return this.breakingAnimation == 1;
  }
  
  public boolean isBreakingAnimation(bgg quad)
  {
    if (this.breakingAnimation < 0) {
      if ((quad instanceof bgn)) {
        this.breakingAnimation = 1;
      } else {
        this.breakingAnimation = 0;
      }
    }
    return this.breakingAnimation == 1;
  }
  
  public boolean isBreakingAnimation()
  {
    return this.breakingAnimation == 1;
  }
  
  public alz getBlockState()
  {
    return this.blockState;
  }
  
  public BlockPosM getColorizerBlockPos()
  {
    if (this.colorizerBlockPos == null) {
      this.colorizerBlockPos = new BlockPosM(0, 0, 0);
    }
    return this.colorizerBlockPos;
  }
  
  public boolean[] getBorderFlags()
  {
    if (this.borderFlags == null) {
      this.borderFlags = new boolean[4];
    }
    return this.borderFlags;
  }
}
