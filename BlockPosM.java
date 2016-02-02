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
    this.mx = x;
    this.my = y;
    this.mz = z;
    this.level = level;
  }
  
  public int n()
  {
    return this.mx;
  }
  
  public int o()
  {
    return this.my;
  }
  
  public int p()
  {
    return this.mz;
  }
  
  public void setXyz(int x, int y, int z)
  {
    this.mx = x;
    this.my = y;
    this.mz = z;
    this.needsUpdate = true;
  }
  
  public void setXyz(double xIn, double yIn, double zIn)
  {
    setXyz(ns.c(xIn), ns.c(yIn), ns.c(zIn));
  }
  
  public cj a(cq facing)
  {
    if (this.level <= 0) {
      return super.a(facing, 1);
    }
    if (this.facings == null) {
      this.facings = new BlockPosM[cq.n.length];
    }
    if (this.needsUpdate) {
      update();
    }
    int index = facing.a();
    BlockPosM bpm = this.facings[index];
    if (bpm == null)
    {
      int nx = this.mx + facing.g();
      int ny = this.my + facing.h();
      int nz = this.mz + facing.i();
      
      bpm = new BlockPosM(nx, ny, nz, this.level - 1);
      this.facings[index] = bpm;
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
      BlockPosM bpm = this.facings[i];
      if (bpm != null)
      {
        cq facing = cq.n[i];
        int nx = this.mx + facing.g();
        int ny = this.my + facing.h();
        int nz = this.mz + facing.i();
        bpm.setXyz(nx, ny, nz);
      }
    }
    this.needsUpdate = false;
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
    };
  }
}
