import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import java.util.EnumSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class ajb
  extends afh
{
  public static final amm<ajb.a> a = amm.a("north", ajb.a.class);
  public static final amm<ajb.a> b = amm.a("east", ajb.a.class);
  public static final amm<ajb.a> N = amm.a("south", ajb.a.class);
  public static final amm<ajb.a> O = amm.a("west", ajb.a.class);
  public static final amn P = amn.a("power", 0, 15);
  private boolean Q = true;
  private final Set<cj> R = Sets.newHashSet();
  
  public ajb()
  {
    super(arm.q);
    j(this.M.b().a(a, ajb.a.c).a(b, ajb.a.c).a(N, ajb.a.c).a(O, ajb.a.c).a(P, Integer.valueOf(0)));
    a(0.0F, 0.0F, 0.0F, 1.0F, 0.0625F, 1.0F);
  }
  
  public alz a(alz ☃, adq ☃, cj ☃)
  {
    ☃ = ☃.a(O, c(☃, ☃, cq.e));
    ☃ = ☃.a(b, c(☃, ☃, cq.f));
    ☃ = ☃.a(a, c(☃, ☃, cq.c));
    ☃ = ☃.a(N, c(☃, ☃, cq.d));
    
    return ☃;
  }
  
  private ajb.a c(adq ☃, cj ☃, cq ☃)
  {
    cj ☃ = ☃.a(☃);
    afh ☃ = ☃.p(☃.a(☃)).c();
    if ((a(☃.p(☃), ☃)) || ((!☃.u()) && (d(☃.p(☃.b()))))) {
      return ajb.a.b;
    }
    afh ☃ = ☃.p(☃.a()).c();
    if ((!☃.u()) && (☃.u()) && (d(☃.p(☃.a())))) {
      return ajb.a.a;
    }
    return ajb.a.c;
  }
  
  public aug a(adm ☃, cj ☃, alz ☃)
  {
    return null;
  }
  
  public boolean c()
  {
    return false;
  }
  
  public boolean d()
  {
    return false;
  }
  
  public int a(adq ☃, cj ☃, int ☃)
  {
    alz ☃ = ☃.p(☃);
    if (☃.c() != this) {
      return super.a(☃, ☃, ☃);
    }
    return b(((Integer)☃.b(P)).intValue());
  }
  
  public boolean d(adm ☃, cj ☃)
  {
    return (adm.a(☃, ☃.b())) || (☃.p(☃.b()).c() == afi.aX);
  }
  
  private alz e(adm ☃, cj ☃, alz ☃)
  {
    ☃ = a(☃, ☃, ☃, ☃);
    
    List<cj> ☃ = Lists.newArrayList(this.R);
    this.R.clear();
    for (cj ☃ : ☃) {
      ☃.c(☃, this);
    }
    return ☃;
  }
  
  private alz a(adm ☃, cj ☃, cj ☃, alz ☃)
  {
    alz ☃ = ☃;
    int ☃ = ((Integer)☃.b(P)).intValue();
    int ☃ = 0;
    
    ☃ = a(☃, ☃, ☃);
    
    this.Q = false;
    int ☃ = ☃.A(☃);
    this.Q = true;
    if ((☃ > 0) && (☃ > ☃ - 1)) {
      ☃ = ☃;
    }
    int ☃ = 0;
    for (cq ☃ : cq.c.a)
    {
      cj ☃ = ☃.a(☃);
      boolean ☃ = (☃.n() != ☃.n()) || (☃.p() != ☃.p());
      if (☃) {
        ☃ = a(☃, ☃, ☃);
      }
      if ((☃.p(☃).c().v()) && (!☃.p(☃.a()).c().v()))
      {
        if ((☃) && (☃.o() >= ☃.o())) {
          ☃ = a(☃, ☃.a(), ☃);
        }
      }
      else if ((!☃.p(☃).c().v()) && 
        (☃) && (☃.o() <= ☃.o())) {
        ☃ = a(☃, ☃.b(), ☃);
      }
    }
    if (☃ > ☃) {
      ☃ = ☃ - 1;
    } else if (☃ > 0) {
      ☃--;
    } else {
      ☃ = 0;
    }
    if (☃ > ☃ - 1) {
      ☃ = ☃;
    }
    if (☃ != ☃)
    {
      ☃ = ☃.a(P, Integer.valueOf(☃));
      if (☃.p(☃) == ☃) {
        ☃.a(☃, ☃, 2);
      }
      this.R.add(☃);
      for (cq ☃ : cq.values()) {
        this.R.add(☃.a(☃));
      }
    }
    return ☃;
  }
  
  private void e(adm ☃, cj ☃)
  {
    if (☃.p(☃).c() != this) {
      return;
    }
    ☃.c(☃, this);
    for (cq ☃ : cq.values()) {
      ☃.c(☃.a(☃), this);
    }
  }
  
  public void c(adm ☃, cj ☃, alz ☃)
  {
    if (☃.D) {
      return;
    }
    e(☃, ☃, ☃);
    for (cq ☃ : cq.c.b) {
      ☃.c(☃.a(☃), this);
    }
    for (cq ☃ : cq.c.a) {
      e(☃, ☃.a(☃));
    }
    for (cq ☃ : cq.c.a)
    {
      cj ☃ = ☃.a(☃);
      if (☃.p(☃).c().v()) {
        e(☃, ☃.a());
      } else {
        e(☃, ☃.b());
      }
    }
  }
  
  public void b(adm ☃, cj ☃, alz ☃)
  {
    super.b(☃, ☃, ☃);
    if (☃.D) {
      return;
    }
    for (cq ☃ : cq.values()) {
      ☃.c(☃.a(☃), this);
    }
    e(☃, ☃, ☃);
    for (cq ☃ : cq.c.a) {
      e(☃, ☃.a(☃));
    }
    for (cq ☃ : cq.c.a)
    {
      cj ☃ = ☃.a(☃);
      if (☃.p(☃).c().v()) {
        e(☃, ☃.a());
      } else {
        e(☃, ☃.b());
      }
    }
  }
  
  private int a(adm ☃, cj ☃, int ☃)
  {
    if (☃.p(☃).c() != this) {
      return ☃;
    }
    int ☃ = ((Integer)☃.p(☃).b(P)).intValue();
    if (☃ > ☃) {
      return ☃;
    }
    return ☃;
  }
  
  public void a(adm ☃, cj ☃, alz ☃, afh ☃)
  {
    if (☃.D) {
      return;
    }
    if (d(☃, ☃))
    {
      e(☃, ☃, ☃);
    }
    else
    {
      b(☃, ☃, ☃, 0);
      ☃.g(☃);
    }
  }
  
  public zw a(alz ☃, Random ☃, int ☃)
  {
    return zy.aC;
  }
  
  public int b(adq ☃, cj ☃, alz ☃, cq ☃)
  {
    if (!this.Q) {
      return 0;
    }
    return a(☃, ☃, ☃, ☃);
  }
  
  public int a(adq ☃, cj ☃, alz ☃, cq ☃)
  {
    if (!this.Q) {
      return 0;
    }
    int ☃ = ((Integer)☃.b(P)).intValue();
    if (☃ == 0) {
      return 0;
    }
    if (☃ == cq.b) {
      return ☃;
    }
    EnumSet<cq> ☃ = EnumSet.noneOf(cq.class);
    for (cq ☃ : cq.c.a) {
      if (d(☃, ☃, ☃)) {
        ☃.add(☃);
      }
    }
    if ((☃.k().c()) && (☃.isEmpty())) {
      return ☃;
    }
    if ((☃.contains(☃)) && (!☃.contains(☃.f())) && (!☃.contains(☃.e()))) {
      return ☃;
    }
    return 0;
  }
  
  private boolean d(adq ☃, cj ☃, cq ☃)
  {
    cj ☃ = ☃.a(☃);
    alz ☃ = ☃.p(☃);
    afh ☃ = ☃.c();
    boolean ☃ = ☃.v();
    
    boolean ☃ = ☃.p(☃.a()).c().v();
    if ((!☃) && (☃) && (e(☃, ☃.a()))) {
      return true;
    }
    if (a(☃, ☃)) {
      return true;
    }
    if ((☃ == afi.bc) && (☃.b(agd.O) == ☃)) {
      return true;
    }
    if ((!☃) && (e(☃, ☃.b()))) {
      return true;
    }
    return false;
  }
  
  protected static boolean e(adq ☃, cj ☃)
  {
    return d(☃.p(☃));
  }
  
  protected static boolean d(alz ☃)
  {
    return a(☃, null);
  }
  
  protected static boolean a(alz ☃, cq ☃)
  {
    afh ☃ = ☃.c();
    if (☃ == afi.af) {
      return true;
    }
    if (afi.bb.e(☃))
    {
      cq ☃ = (cq)☃.b(ajf.O);
      return (☃ == ☃) || (☃.d() == ☃);
    }
    return (☃.i()) && (☃ != null);
  }
  
  public boolean i()
  {
    return this.Q;
  }
  
  private int b(int ☃)
  {
    float ☃ = ☃ / 15.0F;
    float ☃ = ☃ * 0.6F + 0.4F;
    if (☃ == 0) {
      ☃ = 0.3F;
    }
    float ☃ = ☃ * ☃ * 0.7F - 0.5F;
    float ☃ = ☃ * ☃ * 0.6F - 0.7F;
    if (☃ < 0.0F) {
      ☃ = 0.0F;
    }
    if (☃ < 0.0F) {
      ☃ = 0.0F;
    }
    int ☃ = ns.a((int)(☃ * 255.0F), 0, 255);
    int ☃ = ns.a((int)(☃ * 255.0F), 0, 255);
    int ☃ = ns.a((int)(☃ * 255.0F), 0, 255);
    return 0xFF000000 | ☃ << 16 | ☃ << 8 | ☃;
  }
  
  public void c(adm ☃, cj ☃, alz ☃, Random ☃)
  {
    int ☃ = ((Integer)☃.b(P)).intValue();
    if (☃ == 0) {
      return;
    }
    double ☃ = ☃.n() + 0.5D + (☃.nextFloat() - 0.5D) * 0.2D;
    double ☃ = ☃.o() + 0.0625F;
    double ☃ = ☃.p() + 0.5D + (☃.nextFloat() - 0.5D) * 0.2D;
    
    float ☃ = ☃ / 15.0F;
    float ☃ = ☃ * 0.6F + 0.4F;
    float ☃ = Math.max(0.0F, ☃ * ☃ * 0.7F - 0.5F);
    float ☃ = Math.max(0.0F, ☃ * ☃ * 0.6F - 0.7F);
    
    ☃.a(cy.E, ☃, ☃, ☃, ☃, ☃, ☃, new int[0]);
  }
  
  public zw c(adm ☃, cj ☃)
  {
    return zy.aC;
  }
  
  public adf m()
  {
    return adf.c;
  }
  
  public alz a(int ☃)
  {
    return Q().a(P, Integer.valueOf(☃));
  }
  
  public int c(alz ☃)
  {
    return ((Integer)☃.b(P)).intValue();
  }
  
  protected ama e()
  {
    return new ama(this, new amo[] { a, b, N, O, P });
  }
  
  static enum a
    implements nw
  {
    private final String d;
    
    private a(String ☃)
    {
      this.d = ☃;
    }
    
    public String toString()
    {
      return l();
    }
    
    public String l()
    {
      return this.d;
    }
  }
}
