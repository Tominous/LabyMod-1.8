import com.google.common.base.Objects;
import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import com.google.common.collect.Lists;
import java.util.List;

public class awg
  extends awd
{
  private final List<awg.d> u = Lists.newArrayList();
  private final nm<avp> v = new nm();
  private final List<avw> w = Lists.newArrayList();
  private final awg.f[][] x;
  private int y;
  private awg.b z;
  private avp A;
  
  public awg(ave ☃, int ☃, int ☃, int ☃, int ☃, int ☃, awg.b ☃, awg.f[]... ☃)
  {
    super(☃, ☃, ☃, ☃, ☃, ☃);
    this.z = ☃;
    this.x = ☃;
    this.k = false;
    
    s();
    t();
  }
  
  private void s()
  {
    for (awg.f[] ☃ : this.x) {
      for (int ☃ = 0; ☃ < ☃.length; ☃ += 2)
      {
        awg.f ☃ = ☃[☃];
        awg.f ☃ = ☃ < ☃.length - 1 ? ☃[(☃ + 1)] : null;
        avp ☃ = a(☃, 0, ☃ == null);
        avp ☃ = a(☃, 160, ☃ == null);
        awg.d ☃ = new awg.d(☃, ☃);
        this.u.add(☃);
        if ((☃ != null) && (☃ != null))
        {
          this.v.a(☃.b(), ☃);
          if ((☃ instanceof avw)) {
            this.w.add((avw)☃);
          }
        }
        if ((☃ != null) && (☃ != null))
        {
          this.v.a(☃.b(), ☃);
          if ((☃ instanceof avw)) {
            this.w.add((avw)☃);
          }
        }
      }
    }
  }
  
  private void t()
  {
    this.u.clear();
    for (int ☃ = 0; ☃ < this.x[this.y].length; ☃ += 2)
    {
      awg.f ☃ = this.x[this.y][☃];
      awg.f ☃ = ☃ < this.x[this.y].length - 1 ? this.x[this.y][(☃ + 1)] : null;
      avp ☃ = (avp)this.v.a(☃.b());
      avp ☃ = ☃ != null ? (avp)this.v.a(☃.b()) : null;
      awg.d ☃ = new awg.d(☃, ☃);
      this.u.add(☃);
    }
  }
  
  public void c(int ☃)
  {
    if (☃ == this.y) {
      return;
    }
    int ☃ = this.y;
    this.y = ☃;
    t();
    e(☃, ☃);
    this.n = 0.0F;
  }
  
  public int e()
  {
    return this.y;
  }
  
  public int f()
  {
    return this.x.length;
  }
  
  public avp g()
  {
    return this.A;
  }
  
  public void h()
  {
    if (this.y > 0) {
      c(this.y - 1);
    }
  }
  
  public void i()
  {
    if (this.y < this.x.length - 1) {
      c(this.y + 1);
    }
  }
  
  public avp d(int ☃)
  {
    return (avp)this.v.a(☃);
  }
  
  private void e(int ☃, int ☃)
  {
    for (awg.f ☃ : this.x[☃]) {
      if (☃ != null) {
        a((avp)this.v.a(☃.b()), false);
      }
    }
    for (awg.f ☃ : this.x[☃]) {
      if (☃ != null) {
        a((avp)this.v.a(☃.b()), true);
      }
    }
  }
  
  private void a(avp ☃, boolean ☃)
  {
    if ((☃ instanceof avs)) {
      ((avs)☃).m = ☃;
    } else if ((☃ instanceof avw)) {
      ((avw)☃).e(☃);
    } else if ((☃ instanceof avy)) {
      ((avy)☃).j = ☃;
    }
  }
  
  private avp a(awg.f ☃, int ☃, boolean ☃)
  {
    if ((☃ instanceof awg.g)) {
      return a(this.b / 2 - 155 + ☃, 0, (awg.g)☃);
    }
    if ((☃ instanceof awg.a)) {
      return a(this.b / 2 - 155 + ☃, 0, (awg.a)☃);
    }
    if ((☃ instanceof awg.c)) {
      return a(this.b / 2 - 155 + ☃, 0, (awg.c)☃);
    }
    if ((☃ instanceof awg.e)) {
      return a(this.b / 2 - 155 + ☃, 0, (awg.e)☃, ☃);
    }
    return null;
  }
  
  public void a(boolean ☃)
  {
    for (awg.d ☃ : this.u)
    {
      if ((awg.d.a(☃) instanceof avs)) {
        ((avs)awg.d.a(☃)).l = ☃;
      }
      if ((awg.d.b(☃) instanceof avs)) {
        ((avs)awg.d.b(☃)).l = ☃;
      }
    }
  }
  
  public boolean b(int ☃, int ☃, int ☃)
  {
    boolean ☃ = super.b(☃, ☃, ☃);
    int ☃ = c(☃, ☃);
    if (☃ >= 0)
    {
      awg.d ☃ = e(☃);
      if ((this.A != awg.d.c(☃)) && (this.A != null) && ((this.A instanceof avw))) {
        ((avw)this.A).b(false);
      }
      this.A = awg.d.c(☃);
    }
    return ☃;
  }
  
  private avx a(int ☃, int ☃, awg.g ☃)
  {
    avx ☃ = new avx(this.z, ☃.b(), ☃, ☃, ☃.c(), ☃.e(), ☃.f(), ☃.g(), ☃.a());
    ☃.m = ☃.d();
    return ☃;
  }
  
  private awb a(int ☃, int ☃, awg.a ☃)
  {
    awb ☃ = new awb(this.z, ☃.b(), ☃, ☃, ☃.c(), ☃.a());
    ☃.m = ☃.d();
    return ☃;
  }
  
  private avw a(int ☃, int ☃, awg.c ☃)
  {
    avw ☃ = new avw(☃.b(), this.a.k, ☃, ☃, 150, 20);
    ☃.a(☃.c());
    ☃.a(this.z);
    ☃.e(☃.d());
    ☃.a(☃.a());
    return ☃;
  }
  
  private avy a(int ☃, int ☃, awg.e ☃, boolean ☃)
  {
    avy ☃;
    avy ☃;
    if (☃) {
      ☃ = new avy(this.a.k, ☃.b(), ☃, ☃, this.b - ☃ * 2, 20, -1);
    } else {
      ☃ = new avy(this.a.k, ☃.b(), ☃, ☃, 150, 20, -1);
    }
    ☃.j = ☃.d();
    ☃.a(☃.c());
    ☃.a();
    return ☃;
  }
  
  public void a(char ☃, int ☃)
  {
    if (!(this.A instanceof avw)) {
      return;
    }
    avw ☃ = (avw)this.A;
    if (axu.e(☃))
    {
      String ☃ = axu.o();
      String[] ☃ = ☃.split(";");
      int ☃ = this.w.indexOf(this.A);
      int ☃ = ☃;
      for (String ☃ : ☃)
      {
        ((avw)this.w.get(☃)).a(☃);
        if (☃ == this.w.size() - 1) {
          ☃ = 0;
        } else {
          ☃++;
        }
        if (☃ == ☃) {
          break;
        }
      }
      return;
    }
    if (☃ == 15)
    {
      ☃.b(false);
      int ☃ = this.w.indexOf(this.A);
      if (axu.r())
      {
        if (☃ == 0) {
          ☃ = this.w.size() - 1;
        } else {
          ☃--;
        }
      }
      else if (☃ == this.w.size() - 1) {
        ☃ = 0;
      } else {
        ☃++;
      }
      this.A = ((avp)this.w.get(☃));
      ☃ = (avw)this.A;
      ☃.b(true);
      int ☃ = ☃.f + this.h;
      int ☃ = ☃.f;
      if (☃ > this.e) {
        this.n += ☃ - this.e;
      } else if (☃ < this.d) {
        this.n = ☃;
      }
    }
    else
    {
      ☃.a(☃, ☃);
    }
  }
  
  public awg.d e(int ☃)
  {
    return (awg.d)this.u.get(☃);
  }
  
  public int b()
  {
    return this.u.size();
  }
  
  public int c()
  {
    return 400;
  }
  
  protected int d()
  {
    return super.d() + 32;
  }
  
  public static class d
    implements awd.a
  {
    private final ave a;
    private final avp b;
    private final avp c;
    private avp d;
    
    public d(avp ☃, avp ☃)
    {
      this.a = ave.A();
      this.b = ☃;
      this.c = ☃;
    }
    
    public avp a()
    {
      return this.b;
    }
    
    public avp b()
    {
      return this.c;
    }
    
    public void a(int ☃, int ☃, int ☃, int ☃, int ☃, int ☃, int ☃, boolean ☃)
    {
      a(this.b, ☃, ☃, ☃, false);
      a(this.c, ☃, ☃, ☃, false);
    }
    
    private void a(avp ☃, int ☃, int ☃, int ☃, boolean ☃)
    {
      if (☃ == null) {
        return;
      }
      if ((☃ instanceof avs)) {
        a((avs)☃, ☃, ☃, ☃, ☃);
      } else if ((☃ instanceof avw)) {
        a((avw)☃, ☃, ☃);
      } else if ((☃ instanceof avy)) {
        a((avy)☃, ☃, ☃, ☃, ☃);
      }
    }
    
    private void a(avs ☃, int ☃, int ☃, int ☃, boolean ☃)
    {
      ☃.i = ☃;
      if (!☃) {
        ☃.a(this.a, ☃, ☃);
      }
    }
    
    private void a(avw ☃, int ☃, boolean ☃)
    {
      ☃.f = ☃;
      if (!☃) {
        ☃.g();
      }
    }
    
    private void a(avy ☃, int ☃, int ☃, int ☃, boolean ☃)
    {
      ☃.h = ☃;
      if (!☃) {
        ☃.a(this.a, ☃, ☃);
      }
    }
    
    public void a(int ☃, int ☃, int ☃)
    {
      a(this.b, ☃, 0, 0, true);
      a(this.c, ☃, 0, 0, true);
    }
    
    public boolean a(int ☃, int ☃, int ☃, int ☃, int ☃, int ☃)
    {
      boolean ☃ = a(this.b, ☃, ☃, ☃);
      boolean ☃ = a(this.c, ☃, ☃, ☃);
      return (☃) || (☃);
    }
    
    private boolean a(avp ☃, int ☃, int ☃, int ☃)
    {
      if (☃ == null) {
        return false;
      }
      if ((☃ instanceof avs)) {
        return a((avs)☃, ☃, ☃, ☃);
      }
      if ((☃ instanceof avw)) {
        a((avw)☃, ☃, ☃, ☃);
      }
      return false;
    }
    
    private boolean a(avs ☃, int ☃, int ☃, int ☃)
    {
      boolean ☃ = ☃.c(this.a, ☃, ☃);
      if (☃) {
        this.d = ☃;
      }
      return ☃;
    }
    
    private void a(avw ☃, int ☃, int ☃, int ☃)
    {
      ☃.a(☃, ☃, ☃);
      if (☃.m()) {
        this.d = ☃;
      }
    }
    
    public void b(int ☃, int ☃, int ☃, int ☃, int ☃, int ☃)
    {
      b(this.b, ☃, ☃, ☃);
      b(this.c, ☃, ☃, ☃);
    }
    
    private void b(avp ☃, int ☃, int ☃, int ☃)
    {
      if (☃ == null) {
        return;
      }
      if ((☃ instanceof avs)) {
        b((avs)☃, ☃, ☃, ☃);
      }
    }
    
    private void b(avs ☃, int ☃, int ☃, int ☃)
    {
      ☃.a(☃, ☃);
    }
  }
  
  public static class f
  {
    private final int a;
    private final String b;
    private final boolean c;
    
    public f(int ☃, String ☃, boolean ☃)
    {
      this.a = ☃;
      this.b = ☃;
      this.c = ☃;
    }
    
    public int b()
    {
      return this.a;
    }
    
    public String c()
    {
      return this.b;
    }
    
    public boolean d()
    {
      return this.c;
    }
  }
  
  public static class g
    extends awg.f
  {
    private final avx.a a;
    private final float b;
    private final float c;
    private final float d;
    
    public g(int ☃, String ☃, boolean ☃, avx.a ☃, float ☃, float ☃, float ☃)
    {
      super(☃, ☃);
      this.a = ☃;
      this.b = ☃;
      this.c = ☃;
      this.d = ☃;
    }
    
    public avx.a a()
    {
      return this.a;
    }
    
    public float e()
    {
      return this.b;
    }
    
    public float f()
    {
      return this.c;
    }
    
    public float g()
    {
      return this.d;
    }
  }
  
  public static class a
    extends awg.f
  {
    private final boolean a;
    
    public a(int ☃, String ☃, boolean ☃, boolean ☃)
    {
      super(☃, ☃);
      this.a = ☃;
    }
    
    public boolean a()
    {
      return this.a;
    }
  }
  
  public static class c
    extends awg.f
  {
    private final Predicate<String> a;
    
    public c(int ☃, String ☃, boolean ☃, Predicate<String> ☃)
    {
      super(☃, ☃);
      this.a = ((Predicate)Objects.firstNonNull(☃, Predicates.alwaysTrue()));
    }
    
    public Predicate<String> a()
    {
      return this.a;
    }
  }
  
  public static class e
    extends awg.f
  {
    public e(int ☃, String ☃, boolean ☃)
    {
      super(☃, ☃);
    }
  }
  
  public static abstract interface b
  {
    public abstract void a(int paramInt, boolean paramBoolean);
    
    public abstract void a(int paramInt, float paramFloat);
    
    public abstract void a(int paramInt, String paramString);
  }
}
