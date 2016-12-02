import com.google.common.collect.Lists;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.lwjgl.input.Keyboard;
import org.lwjgl.input.Mouse;

public class ayu
  extends ayw
{
  private static final jy u = new jy("textures/gui/container/creative_inventory/tabs.png");
  private static oq v = new oq("tmp", true, 45);
  private static int w = yz.b.a();
  private float x;
  private boolean y;
  private boolean z;
  private avw A;
  private List<yg> B;
  private yg C;
  private boolean D;
  private ayt E;
  
  static class a
    extends xi
  {
    public List<zx> a = Lists.newArrayList();
    
    public a(wn ☃)
    {
      wm ☃ = bi;
      for (int ☃ = 0; ☃ < 5; ☃++) {
        for (int ☃ = 0; ☃ < 9; ☃++) {
          a(new yg(ayu.g(), ☃ * 9 + ☃, 9 + ☃ * 18, 18 + ☃ * 18));
        }
      }
      for (int ☃ = 0; ☃ < 9; ☃++) {
        a(new yg(☃, ☃, 9 + ☃ * 18, 112));
      }
      a(0.0F);
    }
    
    public boolean a(wn ☃)
    {
      return true;
    }
    
    public void a(float ☃)
    {
      int ☃ = (a.size() + 9 - 1) / 9 - 5;
      
      int ☃ = (int)(☃ * ☃ + 0.5D);
      if (☃ < 0) {
        ☃ = 0;
      }
      for (int ☃ = 0; ☃ < 5; ☃++) {
        for (int ☃ = 0; ☃ < 9; ☃++)
        {
          int ☃ = ☃ + (☃ + ☃) * 9;
          if ((☃ >= 0) && (☃ < a.size())) {
            ayu.g().a(☃ + ☃ * 9, (zx)a.get(☃));
          } else {
            ayu.g().a(☃ + ☃ * 9, null);
          }
        }
      }
    }
    
    public boolean e()
    {
      return a.size() > 45;
    }
    
    protected void a(int ☃, int ☃, boolean ☃, wn ☃) {}
    
    public zx b(wn ☃, int ☃)
    {
      if ((☃ >= c.size() - 9) && (☃ < c.size()))
      {
        yg ☃ = (yg)c.get(☃);
        if ((☃ != null) && (☃.e())) {
          ☃.d(null);
        }
      }
      return null;
    }
    
    public boolean a(zx ☃, yg ☃)
    {
      return g > 90;
    }
    
    public boolean b(yg ☃)
    {
      return ((d instanceof wm)) || ((g > 90) && (f <= 162));
    }
  }
  
  public ayu(wn ☃)
  {
    super(new ayu.a(☃));
    bk = h;
    p = true;
    g = 136;
    f = 195;
  }
  
  public void e()
  {
    if (!j.c.h()) {
      j.a(new azc(j.h));
    }
    a();
  }
  
  protected void a(yg ☃, int ☃, int ☃, int ☃)
  {
    D = true;
    boolean ☃ = ☃ == 1;
    ☃ = (☃ == 64537) && (☃ == 0) ? 4 : ☃;
    if ((☃ != null) || (w == yz.m.a()) || (☃ == 5))
    {
      if ((☃ == C) && (☃))
      {
        for (int ☃ = 0; ☃ < j.h.bj.a().size(); ☃++) {
          j.c.a(null, ☃);
        }
      }
      else if (w == yz.m.a())
      {
        if (☃ == C)
        {
          j.h.bi.b(null);
        }
        else if ((☃ == 4) && (☃ != null) && (☃.e()))
        {
          zx ☃ = ☃.a(☃ == 0 ? 1 : ☃.d().c());
          j.h.a(☃, true);
          j.c.a(☃);
        }
        else if ((☃ == 4) && (j.h.bi.p() != null))
        {
          j.h.a(j.h.bi.p(), true);
          j.c.a(j.h.bi.p());
          j.h.bi.b(null);
        }
        else
        {
          j.h.bj.a(☃ == null ? ☃ : ae, ☃, ☃, j.h);
          j.h.bj.b();
        }
      }
      else if ((☃ != 5) && (d == v))
      {
        wm ☃ = j.h.bi;
        zx ☃ = ☃.p();
        zx ☃ = ☃.d();
        if (☃ == 2)
        {
          if ((☃ != null) && (☃ >= 0) && (☃ < 9))
          {
            zx ☃ = ☃.k();
            b = ☃.c();
            j.h.bi.a(☃, ☃);
            j.h.bj.b();
          }
          return;
        }
        if (☃ == 3)
        {
          if ((☃.p() == null) && (☃.e()))
          {
            zx ☃ = ☃.d().k();
            b = ☃.c();
            ☃.b(☃);
          }
          return;
        }
        if (☃ == 4)
        {
          if (☃ != null)
          {
            zx ☃ = ☃.k();
            b = (☃ == 0 ? 1 : ☃.c());
            j.h.a(☃, true);
            j.c.a(☃);
          }
          return;
        }
        if ((☃ != null) && (☃ != null) && (☃.a(☃)))
        {
          if (☃ == 0)
          {
            if (☃) {
              b = ☃.c();
            } else if (b < ☃.c()) {
              b += 1;
            }
          }
          else if (b <= 1) {
            ☃.b(null);
          } else {
            b -= 1;
          }
        }
        else if ((☃ == null) || (☃ != null))
        {
          ☃.b(null);
        }
        else
        {
          ☃.b(zx.b(☃));
          ☃ = ☃.p();
          if (☃) {
            b = ☃.c();
          }
        }
      }
      else
      {
        h.a(☃ == null ? ☃ : e, ☃, ☃, j.h);
        if (xi.c(☃) == 2)
        {
          for (int ☃ = 0; ☃ < 9; ☃++) {
            j.c.a(h.a(45 + ☃).d(), 36 + ☃);
          }
        }
        else if (☃ != null)
        {
          zx ☃ = h.a(e).d();
          j.c.a(☃, e - h.c.size() + 9 + 36);
        }
      }
    }
    else
    {
      wm ☃ = j.h.bi;
      if (☃.p() != null)
      {
        if (☃ == 0)
        {
          j.h.a(☃.p(), true);
          j.c.a(☃.p());
          ☃.b(null);
        }
        if (☃ == 1)
        {
          zx ☃ = ☃.p().a(1);
          j.h.a(☃, true);
          j.c.a(☃);
          if (pb == 0) {
            ☃.b(null);
          }
        }
      }
    }
  }
  
  protected void a()
  {
    int ☃ = i;
    super.a();
    if ((A != null) && (i != ☃)) {
      A.a = (i + 82);
    }
  }
  
  public void b()
  {
    if (j.c.h())
    {
      super.b();
      n.clear();
      
      Keyboard.enableRepeatEvents(true);
      
      A = new avw(0, q, i + 82, r + 6, 89, q.a);
      A.f(15);
      A.a(false);
      A.e(false);
      A.g(16777215);
      
      int ☃ = w;
      w = -1;
      b(yz.a[☃]);
      
      E = new ayt(j);
      j.h.bj.a(E);
    }
    else
    {
      j.a(new azc(j.h));
    }
  }
  
  public void m()
  {
    super.m();
    if ((j.h != null) && (j.h.bi != null)) {
      j.h.bj.b(E);
    }
    Keyboard.enableRepeatEvents(false);
  }
  
  protected void a(char ☃, int ☃)
  {
    if (w != yz.g.a())
    {
      if (avh.a(j.t.aj)) {
        b(yz.g);
      } else {
        super.a(☃, ☃);
      }
      return;
    }
    if (D)
    {
      D = false;
      A.a("");
    }
    if (b(☃)) {
      return;
    }
    if (A.a(☃, ☃)) {
      h();
    } else {
      super.a(☃, ☃);
    }
  }
  
  private void h()
  {
    ayu.a ☃ = (ayu.a)h;
    a.clear();
    for (zw ☃ : zw.e) {
      if (☃ != null) {
        if (☃.c() != null) {
          ☃.a(☃, null, a);
        }
      }
    }
    for (aci ☃ : aci.b) {
      if ((☃ != null) && (C != null)) {
        zy.cd.a(☃, a);
      }
    }
    Iterator<zx> ☃ = a.iterator();
    String ☃ = A.b().toLowerCase();
    while (☃.hasNext())
    {
      zx ☃ = (zx)☃.next();
      boolean ☃ = false;
      for (String ☃ : ☃.a(j.h, j.t.y)) {
        if (a.a(☃).toLowerCase().contains(☃))
        {
          ☃ = true;
          break;
        }
      }
      if (!☃) {
        ☃.remove();
      }
    }
    x = 0.0F;
    ☃.a(0.0F);
  }
  
  protected void b(int ☃, int ☃)
  {
    yz ☃ = yz.a[w];
    if (☃.h())
    {
      bfl.k();
      q.a(bnq.a(☃.c(), new Object[0]), 8, 6, 4210752);
    }
  }
  
  protected void a(int ☃, int ☃, int ☃)
  {
    if (☃ == 0)
    {
      int ☃ = ☃ - i;
      int ☃ = ☃ - r;
      for (yz ☃ : yz.a) {
        if (a(☃, ☃, ☃)) {
          return;
        }
      }
    }
    super.a(☃, ☃, ☃);
  }
  
  protected void b(int ☃, int ☃, int ☃)
  {
    if (☃ == 0)
    {
      int ☃ = ☃ - i;
      int ☃ = ☃ - r;
      for (yz ☃ : yz.a) {
        if (a(☃, ☃, ☃))
        {
          b(☃);
          return;
        }
      }
    }
    super.b(☃, ☃, ☃);
  }
  
  private boolean i()
  {
    return (w != yz.m.a()) && (yz.a[w].j()) && (((ayu.a)h).e());
  }
  
  private void b(yz ☃)
  {
    int ☃ = w;
    w = ☃.a();
    ayu.a ☃ = (ayu.a)h;
    
    s.clear();
    a.clear();
    ☃.a(a);
    if (☃ == yz.m)
    {
      xi ☃ = j.h.bj;
      if (B == null) {
        B = c;
      }
      c = Lists.newArrayList();
      for (int ☃ = 0; ☃ < c.size(); ☃++)
      {
        yg ☃ = new ayu.b((yg)c.get(☃), ☃);
        c.add(☃);
        if ((☃ >= 5) && (☃ < 9))
        {
          int ☃ = ☃ - 5;
          int ☃ = ☃ / 2;
          int ☃ = ☃ % 2;
          
          f = (9 + ☃ * 54);
          g = (6 + ☃ * 27);
        }
        else if ((☃ >= 0) && (☃ < 5))
        {
          g = 63536;
          f = 63536;
        }
        else if (☃ < c.size())
        {
          int ☃ = ☃ - 9;
          int ☃ = ☃ % 9;
          int ☃ = ☃ / 9;
          
          f = (9 + ☃ * 18);
          if (☃ >= 36) {
            g = 112;
          } else {
            g = (54 + ☃ * 18);
          }
        }
      }
      C = new yg(v, 0, 173, 112);
      c.add(C);
    }
    else if (☃ == yz.m.a())
    {
      c = B;
      B = null;
    }
    if (A != null) {
      if (☃ == yz.g)
      {
        A.e(true);
        A.d(false);
        A.b(true);
        A.a("");
        h();
      }
      else
      {
        A.e(false);
        A.d(true);
        A.b(false);
      }
    }
    x = 0.0F;
    ☃.a(0.0F);
  }
  
  public void k()
  {
    super.k();
    
    int ☃ = Mouse.getEventDWheel();
    if ((☃ != 0) && (i()))
    {
      int ☃ = h).a.size() / 9 - 5;
      if (☃ > 0) {
        ☃ = 1;
      }
      if (☃ < 0) {
        ☃ = -1;
      }
      x = ((float)(x - ☃ / ☃));
      x = ns.a(x, 0.0F, 1.0F);
      ((ayu.a)h).a(x);
    }
  }
  
  public void a(int ☃, int ☃, float ☃)
  {
    boolean ☃ = Mouse.isButtonDown(0);
    int ☃ = i;
    int ☃ = r;
    
    int ☃ = ☃ + 175;
    int ☃ = ☃ + 18;
    int ☃ = ☃ + 14;
    int ☃ = ☃ + 112;
    if ((!z) && (☃) && 
      (☃ >= ☃) && (☃ >= ☃) && (☃ < ☃) && (☃ < ☃)) {
      y = i();
    }
    if (!☃) {
      y = false;
    }
    z = ☃;
    if (y)
    {
      x = ((☃ - ☃ - 7.5F) / (☃ - ☃ - 15.0F));
      x = ns.a(x, 0.0F, 1.0F);
      ((ayu.a)h).a(x);
    }
    super.a(☃, ☃, ☃);
    for (yz ☃ : yz.a) {
      if (b(☃, ☃, ☃)) {
        break;
      }
    }
    if ((C != null) && (w == yz.m.a()) && (c(C.f, C.g, 16, 16, ☃, ☃))) {
      a(bnq.a("inventory.binSlot", new Object[0]), ☃, ☃);
    }
    bfl.c(1.0F, 1.0F, 1.0F, 1.0F);
    bfl.f();
  }
  
  protected void a(zx ☃, int ☃, int ☃)
  {
    if (w == yz.g.a())
    {
      List<String> ☃ = ☃.a(j.h, j.t.y);
      
      yz ☃ = ☃.b().c();
      if ((☃ == null) && (☃.b() == zy.cd))
      {
        Map<Integer, Integer> ☃ = ack.a(☃);
        if (☃.size() == 1)
        {
          aci ☃ = aci.c(((Integer)☃.keySet().iterator().next()).intValue());
          for (yz ☃ : yz.a) {
            if (☃.a(C))
            {
              ☃ = ☃;
              break;
            }
          }
        }
      }
      if (☃ != null) {
        ☃.add(1, "" + a.r + a.j + bnq.a(☃.c(), new Object[0]));
      }
      for (int ☃ = 0; ☃ < ☃.size(); ☃++) {
        if (☃ == 0) {
          ☃.set(☃, ue + (String)☃.get(☃));
        } else {
          ☃.set(☃, a.h + (String)☃.get(☃));
        }
      }
      a(☃, ☃, ☃);
    }
    else
    {
      super.a(☃, ☃, ☃);
    }
  }
  
  protected void a(float ☃, int ☃, int ☃)
  {
    bfl.c(1.0F, 1.0F, 1.0F, 1.0F);
    avc.c();
    yz ☃ = yz.a[w];
    for (yz ☃ : yz.a)
    {
      j.P().a(u);
      if (☃.a() != w) {
        a(☃);
      }
    }
    j.P().a(new jy("textures/gui/container/creative_inventory/tab_" + ☃.g()));
    b(i, r, 0, 0, f, g);
    
    A.g();
    bfl.c(1.0F, 1.0F, 1.0F, 1.0F);
    
    int ☃ = i + 175;
    int ☃ = r + 18;
    int ☃ = ☃ + 112;
    j.P().a(u);
    if (☃.j()) {
      b(☃, ☃ + (int)((☃ - ☃ - 17) * x), 'è' + (i() ? 0 : 12), 0, 12, 15);
    }
    a(☃);
    if (☃ == yz.m) {
      azc.a(i + 43, r + 45, 20, i + 43 - ☃, r + 45 - 30 - ☃, j.h);
    }
  }
  
  protected boolean a(yz ☃, int ☃, int ☃)
  {
    int ☃ = ☃.l();
    int ☃ = 28 * ☃;
    int ☃ = 0;
    if (☃ == 5) {
      ☃ = f - 28 + 2;
    } else if (☃ > 0) {
      ☃ += ☃;
    }
    if (☃.m()) {
      ☃ -= 32;
    } else {
      ☃ += g;
    }
    return (☃ >= ☃) && (☃ <= ☃ + 28) && (☃ >= ☃) && (☃ <= ☃ + 32);
  }
  
  protected boolean b(yz ☃, int ☃, int ☃)
  {
    int ☃ = ☃.l();
    int ☃ = 28 * ☃;
    int ☃ = 0;
    if (☃ == 5) {
      ☃ = f - 28 + 2;
    } else if (☃ > 0) {
      ☃ += ☃;
    }
    if (☃.m()) {
      ☃ -= 32;
    } else {
      ☃ += g;
    }
    if (c(☃ + 3, ☃ + 3, 23, 27, ☃, ☃))
    {
      a(bnq.a(☃.c(), new Object[0]), ☃, ☃);
      return true;
    }
    return false;
  }
  
  protected void a(yz ☃)
  {
    boolean ☃ = ☃.a() == w;
    boolean ☃ = ☃.m();
    int ☃ = ☃.l();
    int ☃ = ☃ * 28;
    int ☃ = 0;
    int ☃ = i + 28 * ☃;
    int ☃ = r;
    int ☃ = 32;
    if (☃) {
      ☃ += 32;
    }
    if (☃ == 5) {
      ☃ = i + f - 28;
    } else if (☃ > 0) {
      ☃ += ☃;
    }
    if (☃)
    {
      ☃ -= 28;
    }
    else
    {
      ☃ += 64;
      ☃ += g - 4;
    }
    bfl.f();
    b(☃, ☃, ☃, ☃, 28, ☃);
    
    e = 100.0F;
    k.a = 100.0F;
    ☃ += 6;
    ☃ += 8 + (☃ ? 1 : -1);
    
    bfl.e();
    bfl.B();
    zx ☃ = ☃.d();
    k.b(☃, ☃, ☃);
    k.a(q, ☃, ☃, ☃);
    bfl.f();
    
    k.a = 0.0F;
    e = 0.0F;
  }
  
  protected void a(avs ☃)
  {
    if (k == 0) {
      j.a(new aye(this, j.h.x()));
    }
    if (k == 1) {
      j.a(new ayf(this, j.h.x()));
    }
  }
  
  public int f()
  {
    return w;
  }
  
  class b
    extends yg
  {
    private final yg b;
    
    public b(yg ☃, int ☃)
    {
      super(☃, 0, 0);
      b = ☃;
    }
    
    public void a(wn ☃, zx ☃)
    {
      b.a(☃, ☃);
    }
    
    public boolean a(zx ☃)
    {
      return b.a(☃);
    }
    
    public zx d()
    {
      return b.d();
    }
    
    public boolean e()
    {
      return b.e();
    }
    
    public void d(zx ☃)
    {
      b.d(☃);
    }
    
    public void f()
    {
      b.f();
    }
    
    public int a()
    {
      return b.a();
    }
    
    public int b(zx ☃)
    {
      return b.b(☃);
    }
    
    public String c()
    {
      return b.c();
    }
    
    public zx a(int ☃)
    {
      return b.a(☃);
    }
    
    public boolean a(og ☃, int ☃)
    {
      return b.a(☃, ☃);
    }
  }
}
