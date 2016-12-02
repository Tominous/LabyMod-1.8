import com.google.common.collect.Maps;
import java.util.Map;
import java.util.Random;

public class tv
  extends tm
{
  private final xp bm = new xp(new xi()
  {
    public boolean a(wn ☃)
    {
      return false;
    }
  }, 2, 1);
  private static final Map<zd, float[]> bo = Maps.newEnumMap(zd.class);
  private int bp;
  
  static
  {
    bo.put(zd.a, new float[] { 1.0F, 1.0F, 1.0F });
    bo.put(zd.b, new float[] { 0.85F, 0.5F, 0.2F });
    bo.put(zd.c, new float[] { 0.7F, 0.3F, 0.85F });
    bo.put(zd.d, new float[] { 0.4F, 0.6F, 0.85F });
    bo.put(zd.e, new float[] { 0.9F, 0.9F, 0.2F });
    bo.put(zd.f, new float[] { 0.5F, 0.8F, 0.1F });
    bo.put(zd.g, new float[] { 0.95F, 0.5F, 0.65F });
    bo.put(zd.h, new float[] { 0.3F, 0.3F, 0.3F });
    bo.put(zd.i, new float[] { 0.6F, 0.6F, 0.6F });
    bo.put(zd.j, new float[] { 0.3F, 0.5F, 0.6F });
    bo.put(zd.k, new float[] { 0.5F, 0.25F, 0.7F });
    bo.put(zd.l, new float[] { 0.2F, 0.3F, 0.7F });
    bo.put(zd.m, new float[] { 0.4F, 0.3F, 0.2F });
    bo.put(zd.n, new float[] { 0.4F, 0.5F, 0.2F });
    bo.put(zd.o, new float[] { 0.6F, 0.2F, 0.2F });
    bo.put(zd.p, new float[] { 0.1F, 0.1F, 0.1F });
  }
  
  public static float[] a(zd ☃)
  {
    return (float[])bo.get(☃);
  }
  
  private qy bq = new qy(this);
  
  public tv(adm ☃)
  {
    super(☃);
    a(0.9F, 1.3F);
    
    ((sv)s()).a(true);
    i.a(0, new ra(this));
    i.a(1, new rv(this, 1.25D));
    i.a(2, new qv(this, 1.0D));
    i.a(3, new sh(this, 1.1D, zy.O, false));
    i.a(4, new rc(this, 1.1D));
    i.a(5, bq);
    i.a(6, new rz(this, 1.0D));
    i.a(7, new ri(this, wn.class, 6.0F));
    i.a(8, new ry(this));
    
    bm.a(0, new zx(zy.aW, 1, 0));
    bm.a(1, new zx(zy.aW, 1, 0));
  }
  
  protected void E()
  {
    bp = bq.f();
    super.E();
  }
  
  public void m()
  {
    if (o.D) {
      bp = Math.max(0, bp - 1);
    }
    super.m();
  }
  
  protected void aX()
  {
    super.aX();
    
    a(vy.a).a(8.0D);
    a(vy.d).a(0.23000000417232513D);
  }
  
  protected void h()
  {
    super.h();
    
    ac.a(16, new Byte((byte)0));
  }
  
  protected void b(boolean ☃, int ☃)
  {
    if (!cm()) {
      a(new zx(zw.a(afi.L), 1, cl().a()), 0.0F);
    }
    int ☃ = V.nextInt(2) + 1 + V.nextInt(1 + ☃);
    for (int ☃ = 0; ☃ < ☃; ☃++) {
      if (at()) {
        a(zy.bn, 1);
      } else {
        a(zy.bm, 1);
      }
    }
  }
  
  protected zw A()
  {
    return zw.a(afi.L);
  }
  
  public void a(byte ☃)
  {
    if (☃ == 10) {
      bp = 40;
    } else {
      super.a(☃);
    }
  }
  
  public float p(float ☃)
  {
    if (bp <= 0) {
      return 0.0F;
    }
    if ((bp >= 4) && (bp <= 36)) {
      return 1.0F;
    }
    if (bp < 4) {
      return (bp - ☃) / 4.0F;
    }
    return -(bp - 40 - ☃) / 4.0F;
  }
  
  public float q(float ☃)
  {
    if ((bp > 4) && (bp <= 36))
    {
      float ☃ = (bp - 4 - ☃) / 32.0F;
      return 0.62831855F + 0.21991149F * ns.a(☃ * 28.7F);
    }
    if (bp > 0) {
      return 0.62831855F;
    }
    return z / 57.295776F;
  }
  
  public boolean a(wn ☃)
  {
    zx ☃ = bi.h();
    if ((☃ != null) && (☃.b() == zy.be) && (!cm()) && (!j_()))
    {
      if (!o.D)
      {
        l(true);
        int ☃ = 1 + V.nextInt(3);
        for (int ☃ = 0; ☃ < ☃; ☃++)
        {
          uz ☃ = a(new zx(zw.a(afi.L), 1, cl().a()), 1.0F);
          w += V.nextFloat() * 0.05F;
          v += (V.nextFloat() - V.nextFloat()) * 0.1F;
          x += (V.nextFloat() - V.nextFloat()) * 0.1F;
        }
      }
      ☃.a(1, ☃);
      a("mob.sheep.shear", 1.0F, 1.0F);
    }
    return super.a(☃);
  }
  
  public void b(dn ☃)
  {
    super.b(☃);
    ☃.a("Sheared", cm());
    ☃.a("Color", (byte)cl().a());
  }
  
  public void a(dn ☃)
  {
    super.a(☃);
    l(☃.n("Sheared"));
    b(zd.b(☃.d("Color")));
  }
  
  protected String z()
  {
    return "mob.sheep.say";
  }
  
  protected String bo()
  {
    return "mob.sheep.say";
  }
  
  protected String bp()
  {
    return "mob.sheep.say";
  }
  
  protected void a(cj ☃, afh ☃)
  {
    a("mob.sheep.step", 0.15F, 1.0F);
  }
  
  public zd cl()
  {
    return zd.b(ac.a(16) & 0xF);
  }
  
  public void b(zd ☃)
  {
    byte ☃ = ac.a(16);
    ac.b(16, Byte.valueOf((byte)(☃ & 0xF0 | ☃.a() & 0xF)));
  }
  
  public boolean cm()
  {
    return (ac.a(16) & 0x10) != 0;
  }
  
  public void l(boolean ☃)
  {
    byte ☃ = ac.a(16);
    if (☃) {
      ac.b(16, Byte.valueOf((byte)(☃ | 0x10)));
    } else {
      ac.b(16, Byte.valueOf((byte)(☃ & 0xFFFFFFEF)));
    }
  }
  
  public static zd a(Random ☃)
  {
    int ☃ = ☃.nextInt(100);
    if (☃ < 5) {
      return zd.p;
    }
    if (☃ < 10) {
      return zd.h;
    }
    if (☃ < 15) {
      return zd.i;
    }
    if (☃ < 18) {
      return zd.m;
    }
    if (☃.nextInt(500) == 0) {
      return zd.g;
    }
    return zd.a;
  }
  
  public tv b(ph ☃)
  {
    tv ☃ = (tv)☃;
    tv ☃ = new tv(o);
    
    ☃.b(a(this, ☃));
    
    return ☃;
  }
  
  public void v()
  {
    l(false);
    if (j_()) {
      a(60);
    }
  }
  
  public pu a(ok ☃, pu ☃)
  {
    ☃ = super.a(☃, ☃);
    
    b(a(o.s));
    return ☃;
  }
  
  private zd a(tm ☃, tm ☃)
  {
    int ☃ = ((tv)☃).cl().b();
    int ☃ = ((tv)☃).cl().b();
    
    bm.a(0).b(☃);
    bm.a(1).b(☃);
    
    zx ☃ = abt.a().a(bm, o);
    int ☃;
    int ☃;
    if ((☃ != null) && (☃.b() == zy.aW)) {
      ☃ = ☃.i();
    } else {
      ☃ = o.s.nextBoolean() ? ☃ : ☃;
    }
    return zd.a(☃);
  }
  
  public float aS()
  {
    return 0.95F * K;
  }
}
