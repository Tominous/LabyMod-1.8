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
        if (theBlockPosM == null)
        {
          theBlockPosM = new BlockPosM(val$posFrom.n(), val$posFrom.o(), val$posFrom.p(), 3);
          return theBlockPosM;
        }
        if (theBlockPosM.equals(val$posTo)) {
          return (BlockPosM)endOfData();
        }
        int bx = theBlockPosM.n();
        int by = theBlockPosM.o();
        int bz = theBlockPosM.p();
        if (bx < val$posTo.n())
        {
          bx++;
        }
        else if (by < val$posTo.o())
        {
          bx = val$posFrom.n();
          by++;
        }
        else if (bz < val$posTo.p())
        {
          bx = val$posFrom.n();
          by = val$posFrom.o();
          bz++;
        }
        theBlockPosM.setXyz(bx, by, bz);
        return theBlockPosM;
      }
      
      protected Object computeNext()
      {
        return computeNext0();
      }
    };
  }
}
