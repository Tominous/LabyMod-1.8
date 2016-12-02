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
      wm ☃ = ☃.bi;
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
      int ☃ = (this.a.size() + 9 - 1) / 9 - 5;
      
      int ☃ = (int)(☃ * ☃ + 0.5D);
      if (☃ < 0) {
        ☃ = 0;
      }
      for (int ☃ = 0; ☃ < 5; ☃++) {
        for (int ☃ = 0; ☃ < 9; ☃++)
        {
          int ☃ = ☃ + (☃ + ☃) * 9;
          if ((☃ >= 0) && (☃ < this.a.size())) {
            ayu.g().a(☃ + ☃ * 9, (zx)this.a.get(☃));
          } else {
            ayu.g().a(☃ + ☃ * 9, null);
          }
        }
      }
    }
    
    public boolean e()
    {
      return this.a.size() > 45;
    }
    
    protected void a(int ☃, int ☃, boolean ☃, wn ☃) {}
    
    public zx b(wn ☃, int ☃)
    {
      if ((☃ >= this.c.size() - 9) && (☃ < this.c.size()))
      {
        yg ☃ = (yg)this.c.get(☃);
        if ((☃ != null) && (☃.e())) {
          ☃.d(null);
        }
      }
      return null;
    }
    
    public boolean a(zx ☃, yg ☃)
    {
      return ☃.g > 90;
    }
    
    public boolean b(yg ☃)
    {
      return ((☃.d instanceof wm)) || ((☃.g > 90) && (☃.f <= 162));
    }
  }
  
  public ayu(wn ☃)
  {
    super(new ayu.a(☃));
    ☃.bk = this.h;
    this.p = true;
    this.g = 136;
    this.f = 195;
  }
  
  public void e()
  {
    if (!this.j.c.h()) {
      this.j.a(new azc(this.j.h));
    }
    a();
  }
  
  protected void a(yg ☃, int ☃, int ☃, int ☃)
  {
    this.D = true;
    boolean ☃ = ☃ == 1;
    ☃ = (☃ == 64537) && (☃ == 0) ? 4 : ☃;
    if ((☃ != null) || (w == yz.m.a()) || (☃ == 5))
    {
      if ((☃ == this.C) && (☃))
      {
        for (int ☃ = 0; ☃ < this.j.h.bj.a().size(); ☃++) {
          this.j.c.a(null, ☃);
        }
      }
      else if (w == yz.m.a())
      {
        if (☃ == this.C)
        {
          this.j.h.bi.b(null);
        }
        else if ((☃ == 4) && (☃ != null) && (☃.e()))
        {
          zx ☃ = ☃.a(☃ == 0 ? 1 : ☃.d().c());
          this.j.h.a(☃, true);
          this.j.c.a(☃);
        }
        else if ((☃ == 4) && (this.j.h.bi.p() != null))
        {
          this.j.h.a(this.j.h.bi.p(), true);
          this.j.c.a(this.j.h.bi.p());
          this.j.h.bi.b(null);
        }
        else
        {
          this.j.h.bj.a(☃ == null ? ☃ : ayu.b.a((ayu.b)☃).e, ☃, ☃, this.j.h);
          this.j.h.bj.b();
        }
      }
      else if ((☃ != 5) && (☃.d == v))
      {
        wm ☃ = this.j.h.bi;
        zx ☃ = ☃.p();
        zx ☃ = ☃.d();
        if (☃ == 2)
        {
          if ((☃ != null) && (☃ >= 0) && (☃ < 9))
          {
            zx ☃ = ☃.k();
            ☃.b = ☃.c();
            this.j.h.bi.a(☃, ☃);
            this.j.h.bj.b();
          }
          return;
        }
        if (☃ == 3)
        {
          if ((☃.p() == null) && (☃.e()))
          {
            zx ☃ = ☃.d().k();
            ☃.b = ☃.c();
            ☃.b(☃);
          }
          return;
        }
        if (☃ == 4)
        {
          if (☃ != null)
          {
            zx ☃ = ☃.k();
            ☃.b = (☃ == 0 ? 1 : ☃.c());
            this.j.h.a(☃, true);
            this.j.c.a(☃);
          }
          return;
        }
        if ((☃ != null) && (☃ != null) && (☃.a(☃)))
        {
          if (☃ == 0)
          {
            if (☃) {
              ☃.b = ☃.c();
            } else if (☃.b < ☃.c()) {
              ☃.b += 1;
            }
          }
          else if (☃.b <= 1) {
            ☃.b(null);
          } else {
            ☃.b -= 1;
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
            ☃.b = ☃.c();
          }
        }
      }
      else
      {
        this.h.a(☃ == null ? ☃ : ☃.e, ☃, ☃, this.j.h);
        if (xi.c(☃) == 2)
        {
          for (int ☃ = 0; ☃ < 9; ☃++) {
            this.j.c.a(this.h.a(45 + ☃).d(), 36 + ☃);
          }
        }
        else if (☃ != null)
        {
          zx ☃ = this.h.a(☃.e).d();
          this.j.c.a(☃, ☃.e - this.h.c.size() + 9 + 36);
        }
      }
    }
    else
    {
      wm ☃ = this.j.h.bi;
      if (☃.p() != null)
      {
        if (☃ == 0)
        {
          this.j.h.a(☃.p(), true);
          this.j.c.a(☃.p());
          ☃.b(null);
        }
        if (☃ == 1)
        {
          zx ☃ = ☃.p().a(1);
          this.j.h.a(☃, true);
          this.j.c.a(☃);
          if (☃.p().b == 0) {
            ☃.b(null);
          }
        }
      }
    }
  }
  
  protected void a()
  {
    int ☃ = this.i;
    super.a();
    if ((this.A != null) && (this.i != ☃)) {
      this.A.a = (this.i + 82);
    }
  }
  
  public void b()
  {
    if (this.j.c.h())
    {
      super.b();
      this.n.clear();
      
      Keyboard.enableRepeatEvents(true);
      
      this.A = new avw(0, this.q, this.i + 82, this.r + 6, 89, this.q.a);
      this.A.f(15);
      this.A.a(false);
      this.A.e(false);
      this.A.g(16777215);
      
      int ☃ = w;
      w = -1;
      b(yz.a[☃]);
      
      this.E = new ayt(this.j);
      this.j.h.bj.a(this.E);
    }
    else
    {
      this.j.a(new azc(this.j.h));
    }
  }
  
  public void m()
  {
    super.m();
    if ((this.j.h != null) && (this.j.h.bi != null)) {
      this.j.h.bj.b(this.E);
    }
    Keyboard.enableRepeatEvents(false);
  }
  
  protected void a(char ☃, int ☃)
  {
    if (w != yz.g.a())
    {
      if (avh.a(this.j.t.aj)) {
        b(yz.g);
      } else {
        super.a(☃, ☃);
      }
      return;
    }
    if (this.D)
    {
      this.D = false;
      this.A.a("");
    }
    if (b(☃)) {
      return;
    }
    if (this.A.a(☃, ☃)) {
      h();
    } else {
      super.a(☃, ☃);
    }
  }
  
  private void h()
  {
    ayu.a ☃ = (ayu.a)this.h;
    ☃.a.clear();
    for (zw ☃ : zw.e) {
      if (☃ != null) {
        if (☃.c() != null) {
          ☃.a(☃, null, ☃.a);
        }
      }
    }
    for (aci ☃ : aci.b) {
      if ((☃ != null) && (☃.C != null)) {
        zy.cd.a(☃, ☃.a);
      }
    }
    Iterator<zx> ☃ = ☃.a.iterator();
    String ☃ = this.A.b().toLowerCase();
    while (☃.hasNext())
    {
      zx ☃ = (zx)☃.next();
      boolean ☃ = false;
      for (String ☃ : ☃.a(this.j.h, this.j.t.y)) {
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
    this.x = 0.0F;
    ☃.a(0.0F);
  }
  
  protected void b(int ☃, int ☃)
  {
    yz ☃ = yz.a[w];
    if (☃.h())
    {
      bfl.k();
      this.q.a(bnq.a(☃.c(), new Object[0]), 8, 6, 4210752);
    }
  }
  
  protected void a(int ☃, int ☃, int ☃)
  {
    if (☃ == 0)
    {
      int ☃ = ☃ - this.i;
      int ☃ = ☃ - this.r;
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
      int ☃ = ☃ - this.i;
      int ☃ = ☃ - this.r;
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
    return (w != yz.m.a()) && (yz.a[w].j()) && (((ayu.a)this.h).e());
  }
  
  private void b(yz ☃)
  {
    int ☃ = w;
    w = ☃.a();
    ayu.a ☃ = (ayu.a)this.h;
    
    this.s.clear();
    ☃.a.clear();
    ☃.a(☃.a);
    if (☃ == yz.m)
    {
      xi ☃ = this.j.h.bj;
      if (this.B == null) {
        this.B = ☃.c;
      }
      ☃.c = Lists.newArrayList();
      for (int ☃ = 0; ☃ < ☃.c.size(); ☃++)
      {
        yg ☃ = new ayu.b((yg)☃.c.get(☃), ☃);
        ☃.c.add(☃);
        if ((☃ >= 5) && (☃ < 9))
        {
          int ☃ = ☃ - 5;
          int ☃ = ☃ / 2;
          int ☃ = ☃ % 2;
          
          ☃.f = (9 + ☃ * 54);
          ☃.g = (6 + ☃ * 27);
        }
        else if ((☃ >= 0) && (☃ < 5))
        {
          ☃.g = 63536;
          ☃.f = 63536;
        }
        else if (☃ < ☃.c.size())
        {
          int ☃ = ☃ - 9;
          int ☃ = ☃ % 9;
          int ☃ = ☃ / 9;
          
          ☃.f = (9 + ☃ * 18);
          if (☃ >= 36) {
            ☃.g = 112;
          } else {
            ☃.g = (54 + ☃ * 18);
          }
        }
      }
      this.C = new yg(v, 0, 173, 112);
      ☃.c.add(this.C);
    }
    else if (☃ == yz.m.a())
    {
      ☃.c = this.B;
      this.B = null;
    }
    if (this.A != null) {
      if (☃ == yz.g)
      {
        this.A.e(true);
        this.A.d(false);
        this.A.b(true);
        this.A.a("");
        h();
      }
      else
      {
        this.A.e(false);
        this.A.d(true);
        this.A.b(false);
      }
    }
    this.x = 0.0F;
    ☃.a(0.0F);
  }
  
  public void k()
  {
    super.k();
    
    int ☃ = Mouse.getEventDWheel();
    if ((☃ != 0) && (i()))
    {
      int ☃ = ((ayu.a)this.h).a.size() / 9 - 5;
      if (☃ > 0) {
        ☃ = 1;
      }
      if (☃ < 0) {
        ☃ = -1;
      }
      this.x = ((float)(this.x - ☃ / ☃));
      this.x = ns.a(this.x, 0.0F, 1.0F);
      ((ayu.a)this.h).a(this.x);
    }
  }
  
  public void a(int ☃, int ☃, float ☃)
  {
    boolean ☃ = Mouse.isButtonDown(0);
    int ☃ = this.i;
    int ☃ = this.r;
    
    int ☃ = ☃ + 175;
    int ☃ = ☃ + 18;
    int ☃ = ☃ + 14;
    int ☃ = ☃ + 112;
    if ((!this.z) && (☃) && 
      (☃ >= ☃) && (☃ >= ☃) && (☃ < ☃) && (☃ < ☃)) {
      this.y = i();
    }
    if (!☃) {
      this.y = false;
    }
    this.z = ☃;
    if (this.y)
    {
      this.x = ((☃ - ☃ - 7.5F) / (☃ - ☃ - 15.0F));
      this.x = ns.a(this.x, 0.0F, 1.0F);
      ((ayu.a)this.h).a(this.x);
    }
    super.a(☃, ☃, ☃);
    for (yz ☃ : yz.a) {
      if (b(☃, ☃, ☃)) {
        break;
      }
    }
    if ((this.C != null) && (w == yz.m.a()) && (c(this.C.f, this.C.g, 16, 16, ☃, ☃))) {
      a(bnq.a("inventory.binSlot", new Object[0]), ☃, ☃);
    }
    bfl.c(1.0F, 1.0F, 1.0F, 1.0F);
    bfl.f();
  }
  
  protected void a(zx ☃, int ☃, int ☃)
  {
    if (w == yz.g.a())
    {
      List<String> ☃ = ☃.a(this.j.h, this.j.t.y);
      
      yz ☃ = ☃.b().c();
      if ((☃ == null) && (☃.b() == zy.cd))
      {
        Map<Integer, Integer> ☃ = ack.a(☃);
        if (☃.size() == 1)
        {
          aci ☃ = aci.c(((Integer)☃.keySet().iterator().next()).intValue());
          for (yz ☃ : yz.a) {
            if (☃.a(☃.C))
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
          ☃.set(☃, ☃.u().e + (String)☃.get(☃));
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
      this.j.P().a(u);
      if (☃.a() != w) {
        a(☃);
      }
    }
    this.j.P().a(new jy("textures/gui/container/creative_inventory/tab_" + ☃.g()));
    b(this.i, this.r, 0, 0, this.f, this.g);
    
    this.A.g();
    bfl.c(1.0F, 1.0F, 1.0F, 1.0F);
    
    int ☃ = this.i + 175;
    int ☃ = this.r + 18;
    int ☃ = ☃ + 112;
    this.j.P().a(u);
    if (☃.j()) {
      b(☃, ☃ + (int)((☃ - ☃ - 17) * this.x), 'è' + (i() ? 0 : 12), 0, 12, 15);
    }
    a(☃);
    if (☃ == yz.m) {
      azc.a(this.i + 43, this.r + 45, 20, this.i + 43 - ☃, this.r + 45 - 30 - ☃, this.j.h);
    }
  }
  
  protected boolean a(yz ☃, int ☃, int ☃)
  {
    int ☃ = ☃.l();
    int ☃ = 28 * ☃;
    int ☃ = 0;
    if (☃ == 5) {
      ☃ = this.f - 28 + 2;
    } else if (☃ > 0) {
      ☃ += ☃;
    }
    if (☃.m()) {
      ☃ -= 32;
    } else {
      ☃ += this.g;
    }
    return (☃ >= ☃) && (☃ <= ☃ + 28) && (☃ >= ☃) && (☃ <= ☃ + 32);
  }
  
  protected boolean b(yz ☃, int ☃, int ☃)
  {
    int ☃ = ☃.l();
    int ☃ = 28 * ☃;
    int ☃ = 0;
    if (☃ == 5) {
      ☃ = this.f - 28 + 2;
    } else if (☃ > 0) {
      ☃ += ☃;
    }
    if (☃.m()) {
      ☃ -= 32;
    } else {
      ☃ += this.g;
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
    int ☃ = this.i + 28 * ☃;
    int ☃ = this.r;
    int ☃ = 32;
    if (☃) {
      ☃ += 32;
    }
    if (☃ == 5) {
      ☃ = this.i + this.f - 28;
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
      ☃ += this.g - 4;
    }
    bfl.f();
    b(☃, ☃, ☃, ☃, 28, ☃);
    
    this.e = 100.0F;
    this.k.a = 100.0F;
    ☃ += 6;
    ☃ += 8 + (☃ ? 1 : -1);
    
    bfl.e();
    bfl.B();
    zx ☃ = ☃.d();
    this.k.b(☃, ☃, ☃);
    this.k.a(this.q, ☃, ☃, ☃);
    bfl.f();
    
    this.k.a = 0.0F;
    this.e = 0.0F;
  }
  
  protected void a(avs ☃)
  {
    if (☃.k == 0) {
      this.j.a(new aye(this, this.j.h.x()));
    }
    if (☃.k == 1) {
      this.j.a(new ayf(this, this.j.h.x()));
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
      this.b = ☃;
    }
    
    public void a(wn ☃, zx ☃)
    {
      this.b.a(☃, ☃);
    }
    
    public boolean a(zx ☃)
    {
      return this.b.a(☃);
    }
    
    public zx d()
    {
      return this.b.d();
    }
    
    public boolean e()
    {
      return this.b.e();
    }
    
    public void d(zx ☃)
    {
      this.b.d(☃);
    }
    
    public void f()
    {
      this.b.f();
    }
    
    public int a()
    {
      return this.b.a();
    }
    
    public int b(zx ☃)
    {
      return this.b.b(☃);
    }
    
    public String c()
    {
      return this.b.c();
    }
    
    public zx a(int ☃)
    {
      return this.b.a(☃);
    }
    
    public boolean a(og ☃, int ☃)
    {
      return this.b.a(☃, ☃);
    }
  }
}
