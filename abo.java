import com.google.common.collect.Maps;
import java.util.Map;
import java.util.Map.Entry;

public class abo
{
  private static final abo a = new abo();
  private Map<zx, zx> b = Maps.newHashMap();
  private Map<zx, Float> c = Maps.newHashMap();
  
  public static abo a()
  {
    return a;
  }
  
  private abo()
  {
    a(afi.p, new zx(zy.j), 0.7F);
    a(afi.o, new zx(zy.k), 1.0F);
    a(afi.ag, new zx(zy.i), 1.0F);
    a(afi.m, new zx(afi.w), 0.1F);
    
    a(zy.al, new zx(zy.am), 0.35F);
    a(zy.bi, new zx(zy.bj), 0.35F);
    a(zy.bk, new zx(zy.bl), 0.35F);
    a(zy.bo, new zx(zy.bp), 0.35F);
    a(zy.bm, new zx(zy.bn), 0.35F);
    a(afi.e, new zx(afi.b), 0.1F);
    a(new zx(afi.bf, 1, ajz.b), new zx(afi.bf, 1, ajz.O), 0.1F);
    a(zy.aI, new zx(zy.aH), 0.3F);
    a(afi.aL, new zx(afi.cz), 0.35F);
    a(afi.aK, new zx(zy.aW, 1, zd.n.b()), 0.2F);
    a(afi.r, new zx(zy.h, 1, 1), 0.15F);
    a(afi.s, new zx(zy.h, 1, 1), 0.15F);
    a(afi.bP, new zx(zy.bO), 1.0F);
    a(zy.bS, new zx(zy.bT), 0.35F);
    a(afi.aV, new zx(zy.cf), 0.1F);
    a(new zx(afi.v, 1, 1), new zx(afi.v, 1, 0), 0.15F);
    for (zp.a ☃ : zp.a.values()) {
      if (☃.g()) {
        a(new zx(zy.aU, 1, ☃.a()), new zx(zy.aV, 1, ☃.a()), 0.35F);
      }
    }
    a(afi.q, new zx(zy.h), 0.1F);
    a(afi.aC, new zx(zy.aC), 0.7F);
    
    a(afi.x, new zx(zy.aW, 1, zd.l.b()), 0.2F);
    a(afi.co, new zx(zy.cg), 0.2F);
  }
  
  public void a(afh ☃, zx ☃, float ☃)
  {
    a(zw.a(☃), ☃, ☃);
  }
  
  public void a(zw ☃, zx ☃, float ☃)
  {
    a(new zx(☃, 1, 32767), ☃, ☃);
  }
  
  public void a(zx ☃, zx ☃, float ☃)
  {
    this.b.put(☃, ☃);
    this.c.put(☃, Float.valueOf(☃));
  }
  
  public zx a(zx ☃)
  {
    for (Map.Entry<zx, zx> ☃ : this.b.entrySet()) {
      if (a(☃, (zx)☃.getKey())) {
        return (zx)☃.getValue();
      }
    }
    return null;
  }
  
  private boolean a(zx ☃, zx ☃)
  {
    return (☃.b() == ☃.b()) && ((☃.i() == 32767) || (☃.i() == ☃.i()));
  }
  
  public Map<zx, zx> b()
  {
    return this.b;
  }
  
  public float b(zx ☃)
  {
    for (Map.Entry<zx, Float> ☃ : this.c.entrySet()) {
      if (a(☃, (zx)☃.getKey())) {
        return ((Float)☃.getValue()).floatValue();
      }
    }
    return 0.0F;
  }
}
