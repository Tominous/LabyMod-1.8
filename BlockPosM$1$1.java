import com.google.common.collect.AbstractIterator;

class BlockPosM$1$1
  extends AbstractIterator
{
  private BlockPosM theBlockPosM = null;
  
  BlockPosM$1$1(BlockPosM.1 param1) {}
  
  protected BlockPosM computeNext0()
  {
    if (theBlockPosM == null)
    {
      theBlockPosM = new BlockPosM(this$0.val$posFrom.n(), this$0.val$posFrom.o(), this$0.val$posFrom.p(), 3);
      return theBlockPosM;
    }
    if (theBlockPosM.equals(this$0.val$posTo)) {
      return (BlockPosM)endOfData();
    }
    int bx = theBlockPosM.n();
    int by = theBlockPosM.o();
    int bz = theBlockPosM.p();
    if (bx < this$0.val$posTo.n())
    {
      bx++;
    }
    else if (by < this$0.val$posTo.o())
    {
      bx = this$0.val$posFrom.n();
      by++;
    }
    else if (bz < this$0.val$posTo.p())
    {
      bx = this$0.val$posFrom.n();
      by = this$0.val$posFrom.o();
      bz++;
    }
    theBlockPosM.setXyz(bx, by, bz);
    return theBlockPosM;
  }
  
  protected Object computeNext()
  {
    return computeNext0();
  }
}
