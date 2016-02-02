import com.google.common.base.Predicate;
import com.google.common.collect.Maps;
import com.google.common.collect.Queues;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentLinkedQueue;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class amy
{
  private static final Logger c = ;
  private final amz[] d;
  private final byte[] e;
  private final int[] f;
  private final boolean[] g;
  private boolean h;
  private final adm i;
  private final int[] j;
  public final int a;
  public final int b;
  private boolean k;
  private final Map<cj, akw> l;
  private final ne<pk>[] m;
  private boolean n;
  private boolean o;
  private boolean p;
  private boolean q;
  private boolean r;
  private long s;
  private int t;
  private long u;
  private int v;
  private ConcurrentLinkedQueue<cj> w;
  
  public amy(adm worldIn, int x, int z)
  {
    this.d = new amz[16];
    this.e = new byte['Ā'];
    this.f = new int['Ā'];
    this.g = new boolean['Ā'];
    this.l = Maps.newHashMap();
    this.v = 4096;
    this.w = Queues.newConcurrentLinkedQueue();
    this.m = ((ne[])new ne[16]);
    this.i = worldIn;
    this.a = x;
    this.b = z;
    this.j = new int['Ā'];
    for (int i = 0; i < this.m.length; i++) {
      this.m[i] = new ne(pk.class);
    }
    Arrays.fill((int[])this.f, 64537);
    Arrays.fill(this.e, (byte)-1);
  }
  
  public amy(adm worldIn, ans primer, int x, int z)
  {
    this(worldIn, x, z);
    int i = 256;
    boolean flag = !worldIn.t.o();
    for (int j = 0; j < 16; j++) {
      for (int k = 0; k < 16; k++) {
        for (int l = 0; l < i; l++)
        {
          int i1 = j * i * 16 | k * i | l;
          alz iblockstate = primer.a(i1);
          if (iblockstate.c().t() != arm.a)
          {
            int j1 = l >> 4;
            if (this.d[j1] == null) {
              this.d[j1] = new amz(j1 << 4, flag);
            }
            this.d[j1].a(j, l & 0xF, k, iblockstate);
          }
        }
      }
    }
  }
  
  public boolean a(int x, int z)
  {
    return (x == this.a) && (z == this.b);
  }
  
  public int f(cj pos)
  {
    return b(pos.n() & 0xF, pos.p() & 0xF);
  }
  
  public int b(int x, int z)
  {
    return this.j[(z << 4 | x)];
  }
  
  public int g()
  {
    for (int i = this.d.length - 1; i >= 0; i--) {
      if (this.d[i] != null) {
        return this.d[i].d();
      }
    }
    return 0;
  }
  
  public amz[] h()
  {
    return this.d;
  }
  
  protected void a()
  {
    int i = g();
    this.t = Integer.MAX_VALUE;
    for (int j = 0; j < 16; j++) {
      for (int k = 0; k < 16; k++)
      {
        this.f[(j + (k << 4))] = 64537;
        for (int l = i + 16; l > 0; l--)
        {
          afh block = f(j, l - 1, k);
          if (block.p() != 0)
          {
            this.j[(k << 4 | j)] = l;
            if (l >= this.t) {
              break;
            }
            this.t = l; break;
          }
        }
      }
    }
    this.q = true;
  }
  
  public void b()
  {
    int i = g();
    this.t = Integer.MAX_VALUE;
    for (int j = 0; j < 16; j++) {
      for (int k = 0; k < 16; k++)
      {
        this.f[(j + (k << 4))] = 64537;
        for (int l = i + 16; l > 0; l--) {
          if (e(j, l - 1, k) != 0)
          {
            this.j[(k << 4 | j)] = l;
            if (l >= this.t) {
              break;
            }
            this.t = l; break;
          }
        }
        if (!this.i.t.o())
        {
          int k1 = 15;
          int i1 = i + 16 - 1;
          for (;;)
          {
            int j1 = e(j, i1, k);
            if ((j1 == 0) && (k1 != 15)) {
              j1 = 1;
            }
            k1 -= j1;
            if (k1 > 0)
            {
              amz extendedblockstorage = this.d[(i1 >> 4)];
              if (extendedblockstorage != null)
              {
                extendedblockstorage.a(j, i1 & 0xF, k, k1);
                this.i.n(new cj((this.a << 4) + j, i1, (this.b << 4) + k));
              }
            }
            i1--;
            if ((i1 <= 0) || (k1 <= 0)) {
              break;
            }
          }
        }
      }
    }
    this.q = true;
  }
  
  private void d(int x, int z)
  {
    this.g[(x + z * 16)] = true;
    this.k = true;
  }
  
  private void h(boolean p_150803_1_)
  {
    this.i.B.a("recheckGaps");
    if (this.i.a(new cj(this.a * 16 + 8, 0, this.b * 16 + 8), 16))
    {
      for (int i = 0; i < 16; i++) {
        for (int j = 0; j < 16; j++) {
          if (this.g[(i + j * 16)] != 0)
          {
            this.g[(i + j * 16)] = false;
            int k = b(i, j);
            int l = this.a * 16 + i;
            int i1 = this.b * 16 + j;
            int j1 = Integer.MAX_VALUE;
            for (cq enumfacing : cq.c.a) {
              j1 = Math.min(j1, this.i.b(l + enumfacing.g(), i1 + enumfacing.i()));
            }
            c(l, i1, j1);
            for (cq enumfacing1 : cq.c.a) {
              c(l + enumfacing1.g(), i1 + enumfacing1.i(), k);
            }
            if (p_150803_1_)
            {
              this.i.B.b();
              return;
            }
          }
        }
      }
      this.k = false;
    }
    this.i.B.b();
  }
  
  private void c(int x, int z, int maxValue)
  {
    int i = this.i.m(new cj(x, 0, z)).o();
    if (i > maxValue) {
      a(x, z, maxValue, i + 1);
    } else if (i < maxValue) {
      a(x, z, i, maxValue + 1);
    }
  }
  
  private void a(int x, int z, int startY, int endY)
  {
    if ((endY > startY) && (this.i.a(new cj(x, 0, z), 16)))
    {
      for (int i = startY; i < endY; i++) {
        this.i.c(ads.a, new cj(x, i, z));
      }
      this.q = true;
    }
  }
  
  private void d(int x, int y, int z)
  {
    int i = this.j[(z << 4 | x)] & 0xFF;
    int j = i;
    if (y > i) {
      j = y;
    }
    while ((j > 0) && (e(x, j - 1, z) == 0)) {
      j--;
    }
    if (j != i)
    {
      this.i.a(x + this.a * 16, z + this.b * 16, j, i);
      this.j[(z << 4 | x)] = j;
      int k = this.a * 16 + x;
      int l = this.b * 16 + z;
      if (!this.i.t.o())
      {
        if (j < i) {
          for (int j1 = j; j1 < i; j1++)
          {
            amz extendedblockstorage2 = this.d[(j1 >> 4)];
            if (extendedblockstorage2 != null)
            {
              extendedblockstorage2.a(x, j1 & 0xF, z, 15);
              this.i.n(new cj((this.a << 4) + x, j1, (this.b << 4) + z));
            }
          }
        } else {
          for (int i1 = i; i1 < j; i1++)
          {
            amz extendedblockstorage = this.d[(i1 >> 4)];
            if (extendedblockstorage != null)
            {
              extendedblockstorage.a(x, i1 & 0xF, z, 0);
              this.i.n(new cj((this.a << 4) + x, i1, (this.b << 4) + z));
            }
          }
        }
        int k1 = 15;
        while ((j > 0) && (k1 > 0))
        {
          j--;
          int i2 = e(x, j, z);
          if (i2 == 0) {
            i2 = 1;
          }
          k1 -= i2;
          if (k1 < 0) {
            k1 = 0;
          }
          amz extendedblockstorage1 = this.d[(j >> 4)];
          if (extendedblockstorage1 != null) {
            extendedblockstorage1.a(x, j & 0xF, z, k1);
          }
        }
      }
      int l1 = this.j[(z << 4 | x)];
      int j2 = i;
      int k2 = l1;
      if (l1 < i)
      {
        j2 = l1;
        k2 = i;
      }
      if (l1 < this.t) {
        this.t = l1;
      }
      if (!this.i.t.o())
      {
        for (cq enumfacing : cq.c.a) {
          a(k + enumfacing.g(), l + enumfacing.i(), j2, k2);
        }
        a(k, l, j2, k2);
      }
      this.q = true;
    }
  }
  
  public int b(cj pos)
  {
    return a(pos).p();
  }
  
  private int e(int x, int y, int z)
  {
    return f(x, y, z).p();
  }
  
  private afh f(int x, int y, int z)
  {
    afh block = afi.a;
    if ((y >= 0) && (y >> 4 < this.d.length))
    {
      amz extendedblockstorage = this.d[(y >> 4)];
      if (extendedblockstorage != null) {
        try
        {
          block = extendedblockstorage.b(x, y & 0xF, z);
        }
        catch (Throwable throwable)
        {
          b crashreport = b.a(throwable, "Getting block");
          throw new e(crashreport);
        }
      }
    }
    return block;
  }
  
  public afh a(final int x, final int y, final int z)
  {
    try
    {
      return f(x & 0xF, y, z & 0xF);
    }
    catch (e reportedexception)
    {
      c crashreportcategory = reportedexception.a().a("Block being got");
      crashreportcategory.a("Location", new Callable()
      {
        public String a()
          throws Exception
        {
          return c.a(new cj(amy.this.a * 16 + x, y, amy.this.b * 16 + z));
        }
      });
      throw reportedexception;
    }
  }
  
  public afh a(final cj pos)
  {
    try
    {
      return f(pos.n() & 0xF, pos.o(), pos.p() & 0xF);
    }
    catch (e reportedexception)
    {
      c crashreportcategory = reportedexception.a().a("Block being got");
      crashreportcategory.a("Location", new Callable()
      {
        public String a()
          throws Exception
        {
          return c.a(pos);
        }
      });
      throw reportedexception;
    }
  }
  
  public alz g(final cj pos)
  {
    if (this.i.G() == adr.g)
    {
      alz iblockstate = null;
      if (pos.o() == 60) {
        iblockstate = afi.cv.Q();
      }
      if (pos.o() == 70) {
        iblockstate = anu.b(pos.n(), pos.p());
      }
      return iblockstate == null ? afi.a.Q() : iblockstate;
    }
    try
    {
      if ((pos.o() >= 0) && (pos.o() >> 4 < this.d.length))
      {
        amz extendedblockstorage = this.d[(pos.o() >> 4)];
        if (extendedblockstorage != null)
        {
          int j = pos.n() & 0xF;
          int k = pos.o() & 0xF;
          int i = pos.p() & 0xF;
          return extendedblockstorage.a(j, k, i);
        }
      }
      return afi.a.Q();
    }
    catch (Throwable throwable)
    {
      b crashreport = b.a(throwable, "Getting block state");
      c crashreportcategory = crashreport.a("Block being got");
      crashreportcategory.a("Location", new Callable()
      {
        public String a()
          throws Exception
        {
          return c.a(pos);
        }
      });
      throw new e(crashreport);
    }
  }
  
  private int g(int x, int y, int z)
  {
    if (y >> 4 >= this.d.length) {
      return 0;
    }
    amz extendedblockstorage = this.d[(y >> 4)];
    return extendedblockstorage != null ? extendedblockstorage.c(x, y & 0xF, z) : 0;
  }
  
  public int c(cj pos)
  {
    return g(pos.n() & 0xF, pos.o(), pos.p() & 0xF);
  }
  
  public alz a(cj pos, alz state)
  {
    int i = pos.n() & 0xF;
    int j = pos.o();
    int k = pos.p() & 0xF;
    int l = k << 4 | i;
    if (j >= this.f[l] - 1) {
      this.f[l] = 64537;
    }
    int i1 = this.j[l];
    alz iblockstate = g(pos);
    if (iblockstate == state) {
      return null;
    }
    afh block = state.c();
    afh block1 = iblockstate.c();
    amz extendedblockstorage = this.d[(j >> 4)];
    boolean flag = false;
    if (extendedblockstorage == null)
    {
      if (block == afi.a) {
        return null;
      }
      extendedblockstorage = this.d[(j >> 4)] = new amz(j >> 4 << 4, !this.i.t.o());
      flag = j >= i1;
    }
    extendedblockstorage.a(i, j & 0xF, k, state);
    if (block1 != block) {
      if (!this.i.D) {
        block1.b(this.i, pos, iblockstate);
      } else if ((block1 instanceof agq)) {
        this.i.t(pos);
      }
    }
    if (extendedblockstorage.b(i, j & 0xF, k) != block) {
      return null;
    }
    if (flag)
    {
      b();
    }
    else
    {
      int j1 = block.p();
      int k1 = block1.p();
      if (j1 > 0)
      {
        if (j >= i1) {
          d(i, j + 1, k);
        }
      }
      else if (j == i1 - 1) {
        d(i, j, k);
      }
      if ((j1 != k1) && ((j1 < k1) || (a(ads.a, pos) > 0) || (a(ads.b, pos) > 0))) {
        d(i, k);
      }
    }
    if ((block1 instanceof agq))
    {
      akw tileentity = a(pos, amy.a.c);
      if (tileentity != null) {
        tileentity.E();
      }
    }
    if ((!this.i.D) && (block1 != block)) {
      block.c(this.i, pos, state);
    }
    if ((block instanceof agq))
    {
      akw tileentity1 = a(pos, amy.a.c);
      if (tileentity1 == null)
      {
        tileentity1 = ((agq)block).a(this.i, block.c(state));
        this.i.a(pos, tileentity1);
      }
      if (tileentity1 != null) {
        tileentity1.E();
      }
    }
    this.q = true;
    return iblockstate;
  }
  
  public int a(ads p_177413_1_, cj pos)
  {
    int i = pos.n() & 0xF;
    int j = pos.o();
    int k = pos.p() & 0xF;
    amz extendedblockstorage = this.d[(j >> 4)];
    return p_177413_1_ == ads.b ? extendedblockstorage.e(i, j & 0xF, k) : p_177413_1_ == ads.a ? extendedblockstorage.d(i, j & 0xF, k) : this.i.t.o() ? 0 : extendedblockstorage == null ? 0 : d(pos) ? p_177413_1_.c : p_177413_1_.c;
  }
  
  public void a(ads p_177431_1_, cj pos, int value)
  {
    int i = pos.n() & 0xF;
    int j = pos.o();
    int k = pos.p() & 0xF;
    amz extendedblockstorage = this.d[(j >> 4)];
    if (extendedblockstorage == null)
    {
      extendedblockstorage = this.d[(j >> 4)] = new amz(j >> 4 << 4, !this.i.t.o());
      b();
    }
    this.q = true;
    if (p_177431_1_ == ads.a)
    {
      if (!this.i.t.o()) {
        extendedblockstorage.a(i, j & 0xF, k, value);
      }
    }
    else if (p_177431_1_ == ads.b) {
      extendedblockstorage.b(i, j & 0xF, k, value);
    }
  }
  
  public int a(cj pos, int amount)
  {
    int i = pos.n() & 0xF;
    int j = pos.o();
    int k = pos.p() & 0xF;
    amz extendedblockstorage = this.d[(j >> 4)];
    if (extendedblockstorage == null) {
      return (!this.i.t.o()) && (amount < ads.a.c) ? ads.a.c - amount : 0;
    }
    int l = this.i.t.o() ? 0 : extendedblockstorage.d(i, j & 0xF, k);
    l -= amount;
    int i1 = extendedblockstorage.e(i, j & 0xF, k);
    if (i1 > l) {
      l = i1;
    }
    return l;
  }
  
  public void a(pk entityIn)
  {
    this.r = true;
    int i = ns.c(entityIn.s / 16.0D);
    int j = ns.c(entityIn.u / 16.0D);
    if ((i != this.a) || (j != this.b))
    {
      c.warn("Wrong location! (" + i + ", " + j + ") should be (" + this.a + ", " + this.b + "), " + entityIn, new Object[] { entityIn });
      entityIn.J();
    }
    int k = ns.c(entityIn.t / 16.0D);
    if (k < 0) {
      k = 0;
    }
    if (k >= this.m.length) {
      k = this.m.length - 1;
    }
    entityIn.ad = true;
    entityIn.ae = this.a;
    entityIn.af = k;
    entityIn.ag = this.b;
    this.m[k].add(entityIn);
  }
  
  public void b(pk entityIn)
  {
    a(entityIn, entityIn.af);
  }
  
  public void a(pk entityIn, int p_76608_2_)
  {
    if (p_76608_2_ < 0) {
      p_76608_2_ = 0;
    }
    if (p_76608_2_ >= this.m.length) {
      p_76608_2_ = this.m.length - 1;
    }
    this.m[p_76608_2_].remove(entityIn);
  }
  
  public boolean d(cj pos)
  {
    int i = pos.n() & 0xF;
    int j = pos.o();
    int k = pos.p() & 0xF;
    return j >= this.j[(k << 4 | i)];
  }
  
  private akw i(cj pos)
  {
    afh block = a(pos);
    return !block.z() ? null : ((agq)block).a(this.i, c(pos));
  }
  
  public akw a(cj pos, amy.a p_177424_2_)
  {
    akw tileentity = (akw)this.l.get(pos);
    if (tileentity == null)
    {
      if (p_177424_2_ == amy.a.a)
      {
        tileentity = i(pos);
        this.i.a(pos, tileentity);
      }
      else if (p_177424_2_ == amy.a.b)
      {
        this.w.add(pos);
      }
    }
    else if (tileentity.x())
    {
      this.l.remove(pos);
      return null;
    }
    return tileentity;
  }
  
  public void a(akw tileEntityIn)
  {
    a(tileEntityIn.v(), tileEntityIn);
    if (this.h) {
      this.i.a(tileEntityIn);
    }
  }
  
  public void a(cj pos, akw tileEntityIn)
  {
    tileEntityIn.a(this.i);
    tileEntityIn.a(pos);
    if ((a(pos) instanceof agq))
    {
      if (this.l.containsKey(pos)) {
        ((akw)this.l.get(pos)).y();
      }
      tileEntityIn.D();
      this.l.put(pos, tileEntityIn);
    }
  }
  
  public void e(cj pos)
  {
    if (this.h)
    {
      akw tileentity = (akw)this.l.remove(pos);
      if (tileentity != null) {
        tileentity.y();
      }
    }
  }
  
  public void c()
  {
    this.h = true;
    this.i.a(this.l.values());
    for (int i = 0; i < this.m.length; i++)
    {
      for (pk entity : this.m[i]) {
        entity.ah();
      }
      this.i.b(this.m[i]);
    }
  }
  
  public void d()
  {
    this.h = false;
    for (akw tileentity : this.l.values()) {
      this.i.b(tileentity);
    }
    for (int i = 0; i < this.m.length; i++) {
      this.i.c(this.m[i]);
    }
  }
  
  public void e()
  {
    this.q = true;
  }
  
  public void a(pk entityIn, aug aabb, List<pk> listToFill, Predicate<? super pk> p_177414_4_)
  {
    int i = ns.c((aabb.b - 2.0D) / 16.0D);
    int j = ns.c((aabb.e + 2.0D) / 16.0D);
    i = ns.a(i, 0, this.m.length - 1);
    j = ns.a(j, 0, this.m.length - 1);
    for (int k = i; k <= j; k++) {
      if (!this.m[k].isEmpty()) {
        for (pk entity : this.m[k]) {
          if ((entity.aR().b(aabb)) && (entity != entityIn))
          {
            if ((p_177414_4_ == null) || (p_177414_4_.apply(entity))) {
              listToFill.add(entity);
            }
            pk[] aentity = entity.aB();
            if (aentity != null) {
              for (int l = 0; l < aentity.length; l++)
              {
                entity = aentity[l];
                if ((entity != entityIn) && (entity.aR().b(aabb)) && ((p_177414_4_ == null) || (p_177414_4_.apply(entity)))) {
                  listToFill.add(entity);
                }
              }
            }
          }
        }
      }
    }
  }
  
  public <T extends pk> void a(Class<? extends T> entityClass, aug aabb, List<T> listToFill, Predicate<? super T> p_177430_4_)
  {
    int i = ns.c((aabb.b - 2.0D) / 16.0D);
    int j = ns.c((aabb.e + 2.0D) / 16.0D);
    i = ns.a(i, 0, this.m.length - 1);
    j = ns.a(j, 0, this.m.length - 1);
    for (int k = i; k <= j; k++) {
      for (T t : this.m[k].c(entityClass)) {
        if ((t.aR().b(aabb)) && ((p_177430_4_ == null) || (p_177430_4_.apply(t)))) {
          listToFill.add(t);
        }
      }
    }
  }
  
  public boolean a(boolean p_76601_1_)
  {
    if (p_76601_1_)
    {
      if (((this.r) && (this.i.K() != this.s)) || (this.q)) {
        return true;
      }
    }
    else if ((this.r) && (this.i.K() >= this.s + 600L)) {
      return true;
    }
    return this.q;
  }
  
  public Random a(long seed)
  {
    return new Random(this.i.J() + this.a * this.a * 4987142 + this.a * 5947611 + this.b * this.b * 4392871L + this.b * 389711 ^ seed);
  }
  
  public boolean f()
  {
    return false;
  }
  
  public void a(amv p_76624_1_, amv p_76624_2_, int p_76624_3_, int p_76624_4_)
  {
    boolean flag = p_76624_1_.a(p_76624_3_, p_76624_4_ - 1);
    boolean flag1 = p_76624_1_.a(p_76624_3_ + 1, p_76624_4_);
    boolean flag2 = p_76624_1_.a(p_76624_3_, p_76624_4_ + 1);
    boolean flag3 = p_76624_1_.a(p_76624_3_ - 1, p_76624_4_);
    boolean flag4 = p_76624_1_.a(p_76624_3_ - 1, p_76624_4_ - 1);
    boolean flag5 = p_76624_1_.a(p_76624_3_ + 1, p_76624_4_ + 1);
    boolean flag6 = p_76624_1_.a(p_76624_3_ - 1, p_76624_4_ + 1);
    boolean flag7 = p_76624_1_.a(p_76624_3_ + 1, p_76624_4_ - 1);
    if ((flag1) && (flag2) && (flag5)) {
      if (!this.n) {
        p_76624_1_.a(p_76624_2_, p_76624_3_, p_76624_4_);
      } else {
        p_76624_1_.a(p_76624_2_, this, p_76624_3_, p_76624_4_);
      }
    }
    if ((flag3) && (flag2) && (flag6))
    {
      amy chunk = p_76624_1_.d(p_76624_3_ - 1, p_76624_4_);
      if (!chunk.n) {
        p_76624_1_.a(p_76624_2_, p_76624_3_ - 1, p_76624_4_);
      } else {
        p_76624_1_.a(p_76624_2_, chunk, p_76624_3_ - 1, p_76624_4_);
      }
    }
    if ((flag) && (flag1) && (flag7))
    {
      amy chunk1 = p_76624_1_.d(p_76624_3_, p_76624_4_ - 1);
      if (!chunk1.n) {
        p_76624_1_.a(p_76624_2_, p_76624_3_, p_76624_4_ - 1);
      } else {
        p_76624_1_.a(p_76624_2_, chunk1, p_76624_3_, p_76624_4_ - 1);
      }
    }
    if ((flag4) && (flag) && (flag3))
    {
      amy chunk2 = p_76624_1_.d(p_76624_3_ - 1, p_76624_4_ - 1);
      if (!chunk2.n) {
        p_76624_1_.a(p_76624_2_, p_76624_3_ - 1, p_76624_4_ - 1);
      } else {
        p_76624_1_.a(p_76624_2_, chunk2, p_76624_3_ - 1, p_76624_4_ - 1);
      }
    }
  }
  
  public cj h(cj pos)
  {
    int i = pos.n() & 0xF;
    int j = pos.p() & 0xF;
    int k = i | j << 4;
    cj blockpos = new cj(pos.n(), this.f[k], pos.p());
    if (blockpos.o() == 64537)
    {
      int l = g() + 15;
      blockpos = new cj(pos.n(), l, pos.p());
      int i1 = -1;
      while ((blockpos.o() > 0) && (i1 == -1))
      {
        afh block = a(blockpos);
        arm material = block.t();
        if ((!material.c()) && (!material.d())) {
          blockpos = blockpos.b();
        } else {
          i1 = blockpos.o() + 1;
        }
      }
      this.f[k] = i1;
    }
    return new cj(pos.n(), this.f[k], pos.p());
  }
  
  public void b(boolean p_150804_1_)
  {
    if ((this.k) && (!this.i.t.o()) && (!p_150804_1_)) {
      h(this.i.D);
    }
    this.p = true;
    if ((!this.o) && (this.n)) {
      n();
    }
    while (!this.w.isEmpty())
    {
      cj blockpos = (cj)this.w.poll();
      if ((a(blockpos, amy.a.c) == null) && (a(blockpos).z()))
      {
        akw tileentity = i(blockpos);
        this.i.a(blockpos, tileentity);
        this.i.b(blockpos, blockpos);
      }
    }
  }
  
  public boolean i()
  {
    return (this.p) && (this.n) && (this.o);
  }
  
  public adg j()
  {
    return new adg(this.a, this.b);
  }
  
  public boolean c(int startY, int endY)
  {
    if (startY < 0) {
      startY = 0;
    }
    if (endY >= 256) {
      endY = 255;
    }
    for (int i = startY; i <= endY; i += 16)
    {
      amz extendedblockstorage = this.d[(i >> 4)];
      if ((extendedblockstorage != null) && (!extendedblockstorage.a())) {
        return false;
      }
    }
    return true;
  }
  
  public void a(amz[] newStorageArrays)
  {
    if (this.d.length != newStorageArrays.length) {
      c.warn("Could not set level chunk sections, array length is " + newStorageArrays.length + " instead of " + this.d.length);
    } else {
      for (int i = 0; i < this.d.length; i++) {
        this.d[i] = newStorageArrays[i];
      }
    }
  }
  
  public void a(byte[] p_177439_1_, int p_177439_2_, boolean p_177439_3_)
  {
    int i = 0;
    boolean flag = !this.i.t.o();
    for (int j = 0; j < this.d.length; j++) {
      if ((p_177439_2_ & 1 << j) != 0)
      {
        if (this.d[j] == null) {
          this.d[j] = new amz(j << 4, flag);
        }
        char[] achar = this.d[j].g();
        for (int k = 0; k < achar.length; k++)
        {
          achar[k] = ((char)((p_177439_1_[(i + 1)] & 0xFF) << 8 | p_177439_1_[i] & 0xFF));
          i += 2;
        }
      }
      else if ((p_177439_3_) && (this.d[j] != null))
      {
        this.d[j] = null;
      }
    }
    for (int l = 0; l < this.d.length; l++) {
      if (((p_177439_2_ & 1 << l) != 0) && (this.d[l] != null))
      {
        amw nibblearray = this.d[l].h();
        System.arraycopy(p_177439_1_, i, nibblearray.a(), 0, nibblearray.a().length);
        i += nibblearray.a().length;
      }
    }
    if (flag) {
      for (int i1 = 0; i1 < this.d.length; i1++) {
        if (((p_177439_2_ & 1 << i1) != 0) && (this.d[i1] != null))
        {
          amw nibblearray1 = this.d[i1].i();
          System.arraycopy(p_177439_1_, i, nibblearray1.a(), 0, nibblearray1.a().length);
          i += nibblearray1.a().length;
        }
      }
    }
    int k1;
    if (p_177439_3_)
    {
      System.arraycopy(p_177439_1_, i, this.e, 0, this.e.length);
      k1 = i + this.e.length;
    }
    for (int j1 = 0; j1 < this.d.length; j1++) {
      if ((this.d[j1] != null) && ((p_177439_2_ & 1 << j1) != 0)) {
        this.d[j1].e();
      }
    }
    this.o = true;
    this.n = true;
    a();
    for (akw tileentity : this.l.values()) {
      tileentity.E();
    }
  }
  
  public ady a(cj pos, aec chunkManager)
  {
    int i = pos.n() & 0xF;
    int j = pos.p() & 0xF;
    int k = this.e[(j << 4 | i)] & 0xFF;
    if (k == 255)
    {
      ady biomegenbase = chunkManager.a(pos, ady.q);
      k = biomegenbase.az;
      this.e[(j << 4 | i)] = ((byte)(k & 0xFF));
    }
    ady biomegenbase1 = ady.e(k);
    return biomegenbase1 == null ? ady.q : biomegenbase1;
  }
  
  public byte[] k()
  {
    return this.e;
  }
  
  public void a(byte[] biomeArray)
  {
    if (this.e.length != biomeArray.length) {
      c.warn("Could not set level chunk biomes, array length is " + biomeArray.length + " instead of " + this.e.length);
    } else {
      for (int i = 0; i < this.e.length; i++) {
        this.e[i] = biomeArray[i];
      }
    }
  }
  
  public void l()
  {
    this.v = 0;
  }
  
  public void m()
  {
    cj blockpos = new cj(this.a << 4, 0, this.b << 4);
    for (int i = 0; i < 8; i++)
    {
      if (this.v >= 4096) {
        return;
      }
      int j = this.v % 16;
      int k = this.v / 16 % 16;
      int l = this.v / 256;
      this.v += 1;
      for (int i1 = 0; i1 < 16; i1++)
      {
        cj blockpos1 = blockpos.a(k, (j << 4) + i1, l);
        boolean flag = (i1 == 0) || (i1 == 15) || (k == 0) || (k == 15) || (l == 0) || (l == 15);
        if (((this.d[j] == null) && (flag)) || ((this.d[j] != null) && (this.d[j].b(k, i1, l).t() == arm.a)))
        {
          for (cq enumfacing : cq.values())
          {
            cj blockpos2 = blockpos1.a(enumfacing);
            if (this.i.p(blockpos2).c().r() > 0) {
              this.i.x(blockpos2);
            }
          }
          this.i.x(blockpos1);
        }
      }
    }
  }
  
  public void n()
  {
    this.n = true;
    this.o = true;
    cj blockpos = new cj(this.a << 4, 0, this.b << 4);
    if (!this.i.t.o()) {
      if (this.i.a(blockpos.a(-1, 0, -1), blockpos.a(16, this.i.F(), 16)))
      {
        for (int i = 0; i < 16; i++) {
          for (int j = 0; j < 16; j++) {
            if (!e(i, j))
            {
              this.o = false;
              break label121;
            }
          }
        }
        label121:
        if (this.o)
        {
          for (cq enumfacing : cq.c.a)
          {
            int k = enumfacing.c() == cq.b.a ? 16 : 1;
            this.i.f(blockpos.a(enumfacing, k)).a(enumfacing.d());
          }
          y();
        }
      }
      else
      {
        this.o = false;
      }
    }
  }
  
  private void y()
  {
    for (int i = 0; i < this.g.length; i++) {
      this.g[i] = true;
    }
    h(false);
  }
  
  private void a(cq p_180700_1_)
  {
    if (this.n) {
      if (p_180700_1_ == cq.f) {
        for (int i = 0; i < 16; i++) {
          e(15, i);
        }
      } else if (p_180700_1_ == cq.e) {
        for (int j = 0; j < 16; j++) {
          e(0, j);
        }
      } else if (p_180700_1_ == cq.d) {
        for (int k = 0; k < 16; k++) {
          e(k, 15);
        }
      } else if (p_180700_1_ == cq.c) {
        for (int l = 0; l < 16; l++) {
          e(l, 0);
        }
      }
    }
  }
  
  private boolean e(int x, int z)
  {
    int i = g();
    boolean flag = false;
    boolean flag1 = false;
    cj.a blockpos$mutableblockpos = new cj.a((this.a << 4) + x, 0, (this.b << 4) + z);
    for (int j = i + 16 - 1; (j > this.i.F()) || ((j > 0) && (!flag1)); j--)
    {
      blockpos$mutableblockpos.c(blockpos$mutableblockpos.n(), j, blockpos$mutableblockpos.p());
      int k = b(blockpos$mutableblockpos);
      if ((k == 255) && (blockpos$mutableblockpos.o() < this.i.F())) {
        flag1 = true;
      }
      if ((!flag) && (k > 0)) {
        flag = true;
      } else if ((flag) && (k == 0) && (!this.i.x(blockpos$mutableblockpos))) {
        return false;
      }
    }
    for (int l = blockpos$mutableblockpos.o(); l > 0; l--)
    {
      blockpos$mutableblockpos.c(blockpos$mutableblockpos.n(), l, blockpos$mutableblockpos.p());
      if (a(blockpos$mutableblockpos).r() > 0) {
        this.i.x(blockpos$mutableblockpos);
      }
    }
    return true;
  }
  
  public boolean o()
  {
    return this.h;
  }
  
  public void c(boolean loaded)
  {
    this.h = loaded;
  }
  
  public adm p()
  {
    return this.i;
  }
  
  public int[] q()
  {
    return this.j;
  }
  
  public void a(int[] newHeightMap)
  {
    if (this.j.length != newHeightMap.length) {
      c.warn("Could not set level chunk heightmap, array length is " + newHeightMap.length + " instead of " + this.j.length);
    } else {
      for (int i = 0; i < this.j.length; i++) {
        this.j[i] = newHeightMap[i];
      }
    }
  }
  
  public Map<cj, akw> r()
  {
    return this.l;
  }
  
  public ne<pk>[] s()
  {
    return this.m;
  }
  
  public boolean t()
  {
    return this.n;
  }
  
  public void d(boolean terrainPopulated)
  {
    this.n = terrainPopulated;
  }
  
  public boolean u()
  {
    return this.o;
  }
  
  public void e(boolean lightPopulated)
  {
    this.o = lightPopulated;
  }
  
  public void f(boolean modified)
  {
    this.q = modified;
  }
  
  public void g(boolean hasEntitiesIn)
  {
    this.r = hasEntitiesIn;
  }
  
  public void b(long saveTime)
  {
    this.s = saveTime;
  }
  
  public int v()
  {
    return this.t;
  }
  
  public long w()
  {
    return this.u;
  }
  
  public void c(long newInhabitedTime)
  {
    this.u = newInhabitedTime;
  }
  
  public static enum a
  {
    private a() {}
  }
}
