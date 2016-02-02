import com.google.common.collect.AbstractIterator;

class BlockPosM$1$1
  extends AbstractIterator
{
  private BlockPosM theBlockPosM = null;
  
  BlockPosM$1$1(BlockPosM.1 param1) {}
  
  protected BlockPosM computeNext0()
  {
    if (this.theBlockPosM == null)
    {
      this.theBlockPosM = new BlockPosM(this.this$0.val$posFrom.n(), this.this$0.val$posFrom.o(), this.this$0.val$posFrom.p(), 3);
      return this.theBlockPosM;
    }
    if (this.theBlockPosM.equals(this.this$0.val$posTo)) {
      return (BlockPosM)endOfData();
    }
    int bx = this.theBlockPosM.n();
    int by = this.theBlockPosM.o();
    int bz = this.theBlockPosM.p();
    if (bx < this.this$0.val$posTo.n())
    {
      bx++;
    }
    else if (by < this.this$0.val$posTo.o())
    {
      bx = this.this$0.val$posFrom.n();
      by++;
    }
    else if (bz < this.this$0.val$posTo.p())
    {
      bx = this.this$0.val$posFrom.n();
      by = this.this$0.val$posFrom.o();
      bz++;
    }
    this.theBlockPosM.setXyz(bx, by, bz);
    return this.theBlockPosM;
  }
  
  protected Object computeNext()
  {
    return computeNext0();
  }
}
