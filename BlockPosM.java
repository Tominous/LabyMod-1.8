import com.google.common.collect.AbstractIterator;
import java.util.Iterator;

public class BlockPosM
  extends cj
{
  private int mx;
  private int my;
  private int mz;
  private int level;
  private BlockPosM[] facings;
  private boolean needsUpdate;
  
  public BlockPosM(int x, int y, int z)
  {
    this(x, y, z, 0);
  }
  
  public BlockPosM(double xIn, double yIn, double zIn)
  {
    this(ns.c(xIn), ns.c(yIn), ns.c(zIn));
  }
  
  public BlockPosM(int x, int y, int z, int level)
  {
    super(0, 0, 0);
    mx = x;
    my = y;
    mz = z;
    this.level = level;
  }
  
  public int n()
  {
    return mx;
  }
  
  public int o()
  {
    return my;
  }
  
  public int p()
  {
    return mz;
  }
  
  public void setXyz(int x, int y, int z)
  {
    mx = x;
    my = y;
    mz = z;
    needsUpdate = true;
  }
  
  public void setXyz(double xIn, double yIn, double zIn)
  {
    setXyz(ns.c(xIn), ns.c(yIn), ns.c(zIn));
  }
  
  public cj a(cq facing)
  {
    if (level <= 0) {
      return super.a(facing, 1);
    }
    if (facings == null) {
      facings = new BlockPosM[cq.n.length];
    }
    if (needsUpdate) {
      update();
    }
    int index = facing.a();
    BlockPosM bpm = facings[index];
    if (bpm == null)
    {
      int nx = mx + facing.g();
      int ny = my + facing.h();
      int nz = mz + facing.i();
      
      bpm = new BlockPosM(nx, ny, nz, level - 1);
      facings[index] = bpm;
    }
    return bpm;
  }
  
  public cj a(cq facing, int n)
  {
    if (n == 1) {
      return a(facing);
    }
    return super.a(facing, n);
  }
  
  private void update()
  {
    for (int i = 0; i < 6; i++)
    {
      BlockPosM bpm = facings[i];
      if (bpm != null)
      {
        cq facing = cq.n[i];
        int nx = mx + facing.g();
        int ny = my + facing.h();
        int nz = mz + facing.i();
        bpm.setXyz(nx, ny, nz);
      }
    }
    needsUpdate = false;
  }
  
  public static Iterable getAllInBoxMutable(cj from, cj to)
  {
    cj posFrom = new cj(Math.min(from.n(), to.n()), Math.min(from.o(), to.o()), Math.min(from.p(), to.p()));
    final cj posTo = new cj(Math.max(from.n(), to.n()), Math.max(from.o(), to.o()), Math.max(from.p(), to.p()));
    new Iterable()
    {
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
    };
  }
}
