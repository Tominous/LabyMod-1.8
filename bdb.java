import com.google.common.collect.Sets;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.Callable;

public class bdb
  extends adm
{
  private bcy a;
  private bcz b;
  private final Set c = Sets.newHashSet();
  private final Set d = Sets.newHashSet();
  private final ave I = ave.A();
  private final Set J = Sets.newHashSet();
  private static final String __OBFID = "CL_00000882";
  private BlockPosM randomTickPosM = new BlockPosM(0, 0, 0, 3);
  
  public bdb(bcy p_i45063_1_, adp p_i45063_2_, int p_i45063_3_, oj p_i45063_4_, nt p_i45063_5_)
  {
    super(new atx(), new ato(p_i45063_2_, "MpServer"), anm.a(p_i45063_3_), p_i45063_5_, true);
    this.a = p_i45063_1_;
    P().a(p_i45063_4_);
    
    this.t.a(this);
    B(new cj(8, 64, 8));
    
    this.v = k();
    this.z = new atz();
    B();
    C();
    
    Reflector.postForgeBusEvent(Reflector.WorldEvent_Load_Constructor, new Object[] { this });
  }
  
  public void c()
  {
    super.c();
    a(K() + 1L);
    if (Q().b("doDaylightCycle")) {
      b(L() + 1L);
    }
    this.B.a("reEntryProcessing");
    for (int var1 = 0; (var1 < 10) && (!this.d.isEmpty()); var1++)
    {
      pk var2 = (pk)this.d.iterator().next();
      this.d.remove(var2);
      if (!this.f.contains(var2)) {
        d(var2);
      }
    }
    this.B.c("chunkCache");
    this.b.d();
    this.B.c("blocks");
    h();
    this.B.b();
  }
  
  public void a(int p_73031_1_, int p_73031_2_, int p_73031_3_, int p_73031_4_, int p_73031_5_, int p_73031_6_) {}
  
  protected amv k()
  {
    this.b = new bcz(this);
    return this.b;
  }
  
  protected void h()
  {
    super.h();
    this.J.retainAll(this.E);
    if (this.J.size() == this.E.size()) {
      this.J.clear();
    }
    int var1 = 0;
    Iterator var2 = this.E.iterator();
    while (var2.hasNext())
    {
      adg var3 = (adg)var2.next();
      if (!this.J.contains(var3))
      {
        int var4 = var3.a * 16;
        int var5 = var3.b * 16;
        this.B.a("getChunk");
        amy var6 = a(var3.a, var3.b);
        a(var4, var5, var6);
        this.B.b();
        this.J.add(var3);
        var1++;
        if (var1 >= 10) {
          return;
        }
      }
    }
  }
  
  public void b(int p_73025_1_, int p_73025_2_, boolean p_73025_3_)
  {
    if (p_73025_3_) {
      this.b.c(p_73025_1_, p_73025_2_);
    } else {
      this.b.b(p_73025_1_, p_73025_2_);
    }
    if (!p_73025_3_) {
      b(p_73025_1_ * 16, 0, p_73025_2_ * 16, p_73025_1_ * 16 + 15, 256, p_73025_2_ * 16 + 15);
    }
  }
  
  public boolean d(pk p_72838_1_)
  {
    boolean var2 = super.d(p_72838_1_);
    this.c.add(p_72838_1_);
    if (!var2) {
      this.d.add(p_72838_1_);
    } else if ((p_72838_1_ instanceof va)) {
      this.I.W().a(new bpd((va)p_72838_1_));
    }
    return var2;
  }
  
  public void e(pk p_72900_1_)
  {
    super.e(p_72900_1_);
    this.c.remove(p_72900_1_);
  }
  
  protected void a(pk p_72923_1_)
  {
    super.a(p_72923_1_);
    if (this.d.contains(p_72923_1_)) {
      this.d.remove(p_72923_1_);
    }
  }
  
  protected void b(pk p_72847_1_)
  {
    super.b(p_72847_1_);
    boolean var2 = false;
    if (this.c.contains(p_72847_1_)) {
      if (p_72847_1_.ai())
      {
        this.d.add(p_72847_1_);
        var2 = true;
      }
      else
      {
        this.c.remove(p_72847_1_);
      }
    }
  }
  
  public void a(int p_73027_1_, pk p_73027_2_)
  {
    pk var3 = a(p_73027_1_);
    if (var3 != null) {
      e(var3);
    }
    this.c.add(p_73027_2_);
    p_73027_2_.d(p_73027_1_);
    if (!d(p_73027_2_)) {
      this.d.add(p_73027_2_);
    }
    this.l.a(p_73027_1_, p_73027_2_);
  }
  
  public pk a(int p_73045_1_)
  {
    return p_73045_1_ == this.I.h.F() ? this.I.h : super.a(p_73045_1_);
  }
  
  public pk e(int p_73028_1_)
  {
    pk var2 = (pk)this.l.d(p_73028_1_);
    if (var2 != null)
    {
      this.c.remove(var2);
      e(var2);
    }
    return var2;
  }
  
  public boolean b(cj p_180503_1_, alz p_180503_2_)
  {
    int var3 = p_180503_1_.n();
    int var4 = p_180503_1_.o();
    int var5 = p_180503_1_.p();
    a(var3, var4, var5, var3, var4, var5);
    return super.a(p_180503_1_, p_180503_2_, 3);
  }
  
  public void H()
  {
    this.a.a().a(new fa("Quitting"));
  }
  
  protected void p() {}
  
  protected int q()
  {
    return this.I.t.c;
  }
  
  public void b(int p_73029_1_, int p_73029_2_, int p_73029_3_)
  {
    byte var4 = 16;
    Random var5 = new Random();
    zx var6 = this.I.h.bA();
    boolean var7 = (this.I.c.l() == adp.a.c) && (var6 != null) && (afh.a(var6.b()) == afi.cv);
    
    BlockPosM var8 = this.randomTickPosM;
    for (int var9 = 0; var9 < 1000; var9++)
    {
      int var10 = p_73029_1_ + this.s.nextInt(var4) - this.s.nextInt(var4);
      int var11 = p_73029_2_ + this.s.nextInt(var4) - this.s.nextInt(var4);
      int var12 = p_73029_3_ + this.s.nextInt(var4) - this.s.nextInt(var4);
      var8.setXyz(var10, var11, var12);
      alz var13 = p(var8);
      var13.c().c(this, var8, var13, var5);
      if ((var7) && (var13.c() == afi.cv)) {
        a(cy.J, var10 + 0.5F, var11 + 0.5F, var12 + 0.5F, 0.0D, 0.0D, 0.0D, new int[0]);
      }
    }
  }
  
  public void a()
  {
    this.f.removeAll(this.g);
    for (int var1 = 0; var1 < this.g.size(); var1++)
    {
      pk var2 = (pk)this.g.get(var1);
      int var3 = var2.ae;
      int var4 = var2.ag;
      if ((var2.ad) && (a(var3, var4, true))) {
        a(var3, var4).b(var2);
      }
    }
    for (var1 = 0; var1 < this.g.size(); var1++) {
      b((pk)this.g.get(var1));
    }
    this.g.clear();
    for (var1 = 0; var1 < this.f.size(); var1++)
    {
      pk var2 = (pk)this.f.get(var1);
      if (var2.m != null)
      {
        if ((var2.m.I) || (var2.m.l != var2))
        {
          var2.m.l = null;
          var2.m = null;
        }
      }
      else if (var2.I)
      {
        int var3 = var2.ae;
        int var4 = var2.ag;
        if ((var2.ad) && (a(var3, var4, true))) {
          a(var3, var4).b(var2);
        }
        this.f.remove(var1--);
        b(var2);
      }
    }
  }
  
  public c a(b report)
  {
    c var2 = super.a(report);
    var2.a("Forced entities", new Callable()
    {
      private static final String __OBFID = "CL_00000883";
      
      public String a()
      {
        return bdb.a(bdb.this).size() + " total; " + bdb.a(bdb.this).toString();
      }
    });
    var2.a("Retry entities", new Callable()
    {
      private static final String __OBFID = "CL_00000884";
      
      public String a()
      {
        return bdb.b(bdb.this).size() + " total; " + bdb.b(bdb.this).toString();
      }
    });
    var2.a("Server brand", new Callable()
    {
      private static final String __OBFID = "CL_00000885";
      
      public String a()
        throws Exception
      {
        return bdb.c(bdb.this).h.w();
      }
    });
    var2.a("Server type", new Callable()
    {
      private static final String __OBFID = "CL_00000886";
      
      public String a()
        throws Exception
      {
        return bdb.c(bdb.this).G() == null ? "Non-integrated multiplayer server" : "Integrated singleplayer server";
      }
    });
    return var2;
  }
  
  public void a(cj p_175731_1_, String p_175731_2_, float p_175731_3_, float p_175731_4_, boolean p_175731_5_)
  {
    a(p_175731_1_.n() + 0.5D, p_175731_1_.o() + 0.5D, p_175731_1_.p() + 0.5D, p_175731_2_, p_175731_3_, p_175731_4_, p_175731_5_);
  }
  
  public void a(double x, double y, double z, String soundName, float volume, float pitch, boolean distanceDelay)
  {
    double var11 = this.I.ac().e(x, y, z);
    bpf var13 = new bpf(new jy(soundName), volume, pitch, (float)x, (float)y, (float)z);
    if ((distanceDelay) && (var11 > 100.0D))
    {
      double var14 = Math.sqrt(var11) / 40.0D;
      this.I.W().a(var13, (int)(var14 * 20.0D));
    }
    else
    {
      this.I.W().a(var13);
    }
  }
  
  public void a(double x, double y, double z, double motionX, double motionY, double motionZ, dn compund)
  {
    this.I.j.a(new bdq.c(this, x, y, z, motionX, motionY, motionZ, this.I.j, compund));
  }
  
  public void a(auo p_96443_1_)
  {
    this.C = p_96443_1_;
  }
  
  public void b(long time)
  {
    if (time < 0L)
    {
      time = -time;
      Q().a("doDaylightCycle", "false");
    }
    else
    {
      Q().a("doDaylightCycle", "true");
    }
    super.b(time);
  }
}
