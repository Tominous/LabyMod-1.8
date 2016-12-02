public class MatchBlock
{
  private int blockId = -1;
  private int[] metadatas = null;
  
  public MatchBlock(int blockId)
  {
    this.blockId = blockId;
  }
  
  public MatchBlock(int blockId, int[] metadatas)
  {
    this.blockId = blockId;
    this.metadatas = metadatas;
  }
  
  public int getBlockId()
  {
    return blockId;
  }
  
  public int[] getMetadatas()
  {
    return metadatas;
  }
  
  public boolean matches(aly blockState)
  {
    if (blockState.getBlockId() != blockId) {
      return false;
    }
    if (metadatas != null)
    {
      boolean matchMetadata = false;
      int metadata = blockState.getMetadata();
      for (int i = 0; i < metadatas.length; i++)
      {
        int md = metadatas[i];
        if (md == metadata)
        {
          matchMetadata = true;
          break;
        }
      }
      if (!matchMetadata) {
        return false;
      }
    }
    return true;
  }
}
