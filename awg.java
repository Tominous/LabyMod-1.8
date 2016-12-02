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
    z = ☃;
    x = ☃;
    k = false;
    
    s();
    t();
  }
  
  private void s()
  {
    for (awg.f[] ☃ : x) {
      for (int ☃ = 0; ☃ < ☃.length; ☃ += 2)
      {
        awg.f ☃ = ☃[☃];
        awg.f ☃ = ☃ < ☃.length - 1 ? ☃[(☃ + 1)] : null;
        avp ☃ = a(☃, 0, ☃ == null);
        avp ☃ = a(☃, 160, ☃ == null);
        awg.d ☃ = new awg.d(☃, ☃);
        u.add(☃);
        if ((☃ != null) && (☃ != null))
        {
          v.a(☃.b(), ☃);
          if ((☃ instanceof avw)) {
            w.add((avw)☃);
          }
        }
        if ((☃ != null) && (☃ != null))
        {
          v.a(☃.b(), ☃);
          if ((☃ instanceof avw)) {
            w.add((avw)☃);
          }
        }
      }
    }
  }
  
  private void t()
  {
    u.clear();
    for (int ☃ = 0; ☃ < x[y].length; ☃ += 2)
    {
      awg.f ☃ = x[y][☃];
      awg.f ☃ = ☃ < x[y].length - 1 ? x[y][(☃ + 1)] : null;
      avp ☃ = (avp)v.a(☃.b());
      avp ☃ = ☃ != null ? (avp)v.a(☃.b()) : null;
      awg.d ☃ = new awg.d(☃, ☃);
      u.add(☃);
    }
  }
  
  public void c(int ☃)
  {
    if (☃ == y) {
      return;
    }
    int ☃ = y;
    y = ☃;
    t();
    e(☃, ☃);
    n = 0.0F;
  }
  
  public int e()
  {
    return y;
  }
  
  public int f()
  {
    return x.length;
  }
  
  public avp g()
  {
    return A;
  }
  
  public void h()
  {
    if (y > 0) {
      c(y - 1);
    }
  }
  
  public void i()
  {
    if (y < x.length - 1) {
      c(y + 1);
    }
  }
  
  public avp d(int ☃)
  {
    return (avp)v.a(☃);
  }
  
  private void e(int ☃, int ☃)
  {
    for (awg.f ☃ : x[☃]) {
      if (☃ != null) {
        a((avp)v.a(☃.b()), false);
      }
    }
    for (awg.f ☃ : x[☃]) {
      if (☃ != null) {
        a((avp)v.a(☃.b()), true);
      }
    }
  }
  
  private void a(avp ☃, boolean ☃)
  {
    if ((☃ instanceof avs)) {
      m = ☃;
    } else if ((☃ instanceof avw)) {
      ((avw)☃).e(☃);
    } else if ((☃ instanceof avy)) {
      j = ☃;
    }
  }
  
  private avp a(awg.f ☃, int ☃, boolean ☃)
  {
    if ((☃ instanceof awg.g)) {
      return a(b / 2 - 155 + ☃, 0, (awg.g)☃);
    }
    if ((☃ instanceof awg.a)) {
      return a(b / 2 - 155 + ☃, 0, (awg.a)☃);
    }
    if ((☃ instanceof awg.c)) {
      return a(b / 2 - 155 + ☃, 0, (awg.c)☃);
    }
    if ((☃ instanceof awg.e)) {
      return a(b / 2 - 155 + ☃, 0, (awg.e)☃, ☃);
    }
    return null;
  }
  
  public void a(boolean ☃)
  {
    for (awg.d ☃ : u)
    {
      if ((awg.d.a(☃) instanceof avs)) {
        al = ☃;
      }
      if ((awg.d.b(☃) instanceof avs)) {
        bl = ☃;
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
      if ((A != awg.d.c(☃)) && (A != null) && ((A instanceof avw))) {
        ((avw)A).b(false);
      }
      A = awg.d.c(☃);
    }
    return ☃;
  }
  
  private avx a(int ☃, int ☃, awg.g ☃)
  {
    avx ☃ = new avx(z, ☃.b(), ☃, ☃, ☃.c(), ☃.e(), ☃.f(), ☃.g(), ☃.a());
    m = ☃.d();
    return ☃;
  }
  
  private awb a(int ☃, int ☃, awg.a ☃)
  {
    awb ☃ = new awb(z, ☃.b(), ☃, ☃, ☃.c(), ☃.a());
    m = ☃.d();
    return ☃;
  }
  
  private avw a(int ☃, int ☃, awg.c ☃)
  {
    avw ☃ = new avw(☃.b(), a.k, ☃, ☃, 150, 20);
    ☃.a(☃.c());
    ☃.a(z);
    ☃.e(☃.d());
    ☃.a(☃.a());
    return ☃;
  }
  
  private avy a(int ☃, int ☃, awg.e ☃, boolean ☃)
  {
    avy ☃;
    avy ☃;
    if (☃) {
      ☃ = new avy(a.k, ☃.b(), ☃, ☃, b - ☃ * 2, 20, -1);
    } else {
      ☃ = new avy(a.k, ☃.b(), ☃, ☃, 150, 20, -1);
    }
    j = ☃.d();
    ☃.a(☃.c());
    ☃.a();
    return ☃;
  }
  
  public void a(char ☃, int ☃)
  {
    if (!(A instanceof avw)) {
      return;
    }
    avw ☃ = (avw)A;
    if (axu.e(☃))
    {
      String ☃ = axu.o();
      String[] ☃ = ☃.split(";");
      int ☃ = w.indexOf(A);
      int ☃ = ☃;
      for (String ☃ : ☃)
      {
        ((avw)w.get(☃)).a(☃);
        if (☃ == w.size() - 1) {
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
      int ☃ = w.indexOf(A);
      if (axu.r())
      {
        if (☃ == 0) {
          ☃ = w.size() - 1;
        } else {
          ☃--;
        }
      }
      else if (☃ == w.size() - 1) {
        ☃ = 0;
      } else {
        ☃++;
      }
      A = ((avp)w.get(☃));
      ☃ = (avw)A;
      ☃.b(true);
      int ☃ = f + h;
      int ☃ = f;
      if (☃ > e) {
        n += ☃ - e;
      } else if (☃ < d) {
        n = ☃;
      }
    }
    else
    {
      ☃.a(☃, ☃);
    }
  }
  
  public awg.d e(int ☃)
  {
    return (awg.d)u.get(☃);
  }
  
  public int b()
  {
    return u.size();
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
      a = ave.A();
      b = ☃;
      c = ☃;
    }
    
    public avp a()
    {
      return b;
    }
    
    public avp b()
    {
      return c;
    }
    
    public void a(int ☃, int ☃, int ☃, int ☃, int ☃, int ☃, int ☃, boolean ☃)
    {
      a(b, ☃, ☃, ☃, false);
      a(c, ☃, ☃, ☃, false);
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
      i = ☃;
      if (!☃) {
        ☃.a(a, ☃, ☃);
      }
    }
    
    private void a(avw ☃, int ☃, boolean ☃)
    {
      f = ☃;
      if (!☃) {
        ☃.g();
      }
    }
    
    private void a(avy ☃, int ☃, int ☃, int ☃, boolean ☃)
    {
      h = ☃;
      if (!☃) {
        ☃.a(a, ☃, ☃);
      }
    }
    
    public void a(int ☃, int ☃, int ☃)
    {
      a(b, ☃, 0, 0, true);
      a(c, ☃, 0, 0, true);
    }
    
    public boolean a(int ☃, int ☃, int ☃, int ☃, int ☃, int ☃)
    {
      boolean ☃ = a(b, ☃, ☃, ☃);
      boolean ☃ = a(c, ☃, ☃, ☃);
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
      boolean ☃ = ☃.c(a, ☃, ☃);
      if (☃) {
        d = ☃;
      }
      return ☃;
    }
    
    private void a(avw ☃, int ☃, int ☃, int ☃)
    {
      ☃.a(☃, ☃, ☃);
      if (☃.m()) {
        d = ☃;
      }
    }
    
    public void b(int ☃, int ☃, int ☃, int ☃, int ☃, int ☃)
    {
      b(b, ☃, ☃, ☃);
      b(c, ☃, ☃, ☃);
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
      a = ☃;
      b = ☃;
      c = ☃;
    }
    
    public int b()
    {
      return a;
    }
    
    public String c()
    {
      return b;
    }
    
    public boolean d()
    {
      return c;
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
      a = ☃;
      b = ☃;
      c = ☃;
      d = ☃;
    }
    
    public avx.a a()
    {
      return a;
    }
    
    public float e()
    {
      return b;
    }
    
    public float f()
    {
      return c;
    }
    
    public float g()
    {
      return d;
    }
  }
  
  public static class a
    extends awg.f
  {
    private final boolean a;
    
    public a(int ☃, String ☃, boolean ☃, boolean ☃)
    {
      super(☃, ☃);
      a = ☃;
    }
    
    public boolean a()
    {
      return a;
    }
  }
  
  public static class c
    extends awg.f
  {
    private final Predicate<String> a;
    
    public c(int ☃, String ☃, boolean ☃, Predicate<String> ☃)
    {
      super(☃, ☃);
      a = ((Predicate)Objects.firstNonNull(☃, Predicates.alwaysTrue()));
    }
    
    public Predicate<String> a()
    {
      return a;
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
