import com.google.common.collect.AbstractIterator;
import java.util.Iterator;

final class BlockPosM$1
  implements Iterable
{
  BlockPosM$1(cj paramcj1, cj paramcj2) {}
  
  public Iterator iterator()
  {
    new AbstractIterator()
    {
      private BlockPosM theBlockPosM = null;
      
      protected BlockPosM computeNext0()
      {
        if (this.theBlockPosM == null)
        {
          this.theBlockPosM = new BlockPosM(BlockPosM.1.this.val$posFrom.n(), BlockPosM.1.this.val$posFrom.o(), BlockPosM.1.this.val$posFrom.p(), 3);
          return this.theBlockPosM;
        }
        if (this.theBlockPosM.equals(BlockPosM.1.this.val$posTo)) {
          return (BlockPosM)endOfData();
        }
        int bx = this.theBlockPosM.n();
        int by = this.theBlockPosM.o();
        int bz = this.theBlockPosM.p();
        if (bx < BlockPosM.1.this.val$posTo.n())
        {
          bx++;
        }
        else if (by < BlockPosM.1.this.val$posTo.o())
        {
          bx = BlockPosM.1.this.val$posFrom.n();
          by++;
        }
        else if (bz < BlockPosM.1.this.val$posTo.p())
        {
          bx = BlockPosM.1.this.val$posFrom.n();
          by = BlockPosM.1.this.val$posFrom.o();
          bz++;
        }
        this.theBlockPosM.setXyz(bx, by, bz);
        return this.theBlockPosM;
      }
      
      protected Object computeNext()
      {
        return computeNext0();
      }
    };
  }
}
