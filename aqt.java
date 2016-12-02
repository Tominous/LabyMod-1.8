import java.util.List;
import java.util.Random;

public abstract class aqt
{
  protected aqe l;
  protected cq m;
  protected int n;
  
  public aqt() {}
  
  protected aqt(int ☃)
  {
    this.n = ☃;
  }
  
  public dn b()
  {
    dn ☃ = new dn();
    
    ☃.a("id", aqr.a(this));
    ☃.a("BB", this.l.g());
    ☃.a("O", this.m == null ? -1 : this.m.b());
    ☃.a("GD", this.n);
    
    a(☃);
    
    return ☃;
  }
  
  protected abstract void a(dn paramdn);
  
  public void a(adm ☃, dn ☃)
  {
    if (☃.c("BB")) {
      this.l = new aqe(☃.l("BB"));
    }
    int ☃ = ☃.f("O");
    this.m = (☃ == -1 ? null : cq.b(☃));
    this.n = ☃.f("GD");
    
    b(☃);
  }
  
  protected abstract void b(dn paramdn);
  
  public void a(aqt ☃, List<aqt> ☃, Random ☃) {}
  
  public abstract boolean a(adm paramadm, Random paramRandom, aqe paramaqe);
  
  public aqe c()
  {
    return this.l;
  }
  
  public int d()
  {
    return this.n;
  }
  
  public static aqt a(List<aqt> ☃, aqe ☃)
  {
    for (aqt ☃ : ☃) {
      if ((☃.c() != null) && (☃.c().a(☃))) {
        return ☃;
      }
    }
    return null;
  }
  
  public cj a()
  {
    return new cj(this.l.f());
  }
  
  protected boolean a(adm ☃, aqe ☃)
  {
    int ☃ = Math.max(this.l.a - 1, ☃.a);
    int ☃ = Math.max(this.l.b - 1, ☃.b);
    int ☃ = Math.max(this.l.c - 1, ☃.c);
    int ☃ = Math.min(this.l.d + 1, ☃.d);
    int ☃ = Math.min(this.l.e + 1, ☃.e);
    int ☃ = Math.min(this.l.f + 1, ☃.f);
    
    cj.a ☃ = new cj.a();
    for (int ☃ = ☃; ☃ <= ☃; ☃++) {
      for (int ☃ = ☃; ☃ <= ☃; ☃++)
      {
        if (☃.p(☃.c(☃, ☃, ☃)).c().t().d()) {
          return true;
        }
        if (☃.p(☃.c(☃, ☃, ☃)).c().t().d()) {
          return true;
        }
      }
    }
    for (int ☃ = ☃; ☃ <= ☃; ☃++) {
      for (int ☃ = ☃; ☃ <= ☃; ☃++)
      {
        if (☃.p(☃.c(☃, ☃, ☃)).c().t().d()) {
          return true;
        }
        if (☃.p(☃.c(☃, ☃, ☃)).c().t().d()) {
          return true;
        }
      }
    }
    for (int ☃ = ☃; ☃ <= ☃; ☃++) {
      for (int ☃ = ☃; ☃ <= ☃; ☃++)
      {
        if (☃.p(☃.c(☃, ☃, ☃)).c().t().d()) {
          return true;
        }
        if (☃.p(☃.c(☃, ☃, ☃)).c().t().d()) {
          return true;
        }
      }
    }
    return false;
  }
  
  protected int a(int ☃, int ☃)
  {
    if (this.m == null) {
      return ☃;
    }
    switch (aqt.1.a[this.m.ordinal()])
    {
    case 1: 
    case 2: 
      return this.l.a + ☃;
    case 3: 
      return this.l.d - ☃;
    case 4: 
      return this.l.a + ☃;
    }
    return ☃;
  }
  
  protected int d(int ☃)
  {
    if (this.m == null) {
      return ☃;
    }
    return ☃ + this.l.b;
  }
  
  protected int b(int ☃, int ☃)
  {
    if (this.m == null) {
      return ☃;
    }
    switch (aqt.1.a[this.m.ordinal()])
    {
    case 1: 
      return this.l.f - ☃;
    case 2: 
      return this.l.c + ☃;
    case 3: 
    case 4: 
      return this.l.c + ☃;
    }
    return ☃;
  }
  
  protected int a(afh ☃, int ☃)
  {
    if (☃ == afi.av)
    {
      if ((this.m == cq.e) || (this.m == cq.f))
      {
        if (☃ == 1) {
          return 0;
        }
        return 1;
      }
    }
    else if ((☃ instanceof agh))
    {
      if (this.m == cq.d)
      {
        if (☃ == 0) {
          return 2;
        }
        if (☃ == 2) {
          return 0;
        }
      }
      else
      {
        if (this.m == cq.e) {
          return ☃ + 1 & 0x3;
        }
        if (this.m == cq.f) {
          return ☃ + 3 & 0x3;
        }
      }
    }
    else if ((☃ == afi.aw) || (☃ == afi.ad) || (☃ == afi.bA) || (☃ == afi.bv) || (☃ == afi.bO))
    {
      if (this.m == cq.d)
      {
        if (☃ == 2) {
          return 3;
        }
        if (☃ == 3) {
          return 2;
        }
      }
      else if (this.m == cq.e)
      {
        if (☃ == 0) {
          return 2;
        }
        if (☃ == 1) {
          return 3;
        }
        if (☃ == 2) {
          return 0;
        }
        if (☃ == 3) {
          return 1;
        }
      }
      else if (this.m == cq.f)
      {
        if (☃ == 0) {
          return 2;
        }
        if (☃ == 1) {
          return 3;
        }
        if (☃ == 2) {
          return 1;
        }
        if (☃ == 3) {
          return 0;
        }
      }
    }
    else if (☃ == afi.au)
    {
      if (this.m == cq.d)
      {
        if (☃ == cq.c.a()) {
          return cq.d.a();
        }
        if (☃ == cq.d.a()) {
          return cq.c.a();
        }
      }
      else if (this.m == cq.e)
      {
        if (☃ == cq.c.a()) {
          return cq.e.a();
        }
        if (☃ == cq.d.a()) {
          return cq.f.a();
        }
        if (☃ == cq.e.a()) {
          return cq.c.a();
        }
        if (☃ == cq.f.a()) {
          return cq.d.a();
        }
      }
      else if (this.m == cq.f)
      {
        if (☃ == cq.c.a()) {
          return cq.f.a();
        }
        if (☃ == cq.d.a()) {
          return cq.e.a();
        }
        if (☃ == cq.e.a()) {
          return cq.c.a();
        }
        if (☃ == cq.f.a()) {
          return cq.d.a();
        }
      }
    }
    else if (☃ == afi.aG)
    {
      if (this.m == cq.d)
      {
        if (☃ == 3) {
          return 4;
        }
        if (☃ == 4) {
          return 3;
        }
      }
      else if (this.m == cq.e)
      {
        if (☃ == 3) {
          return 1;
        }
        if (☃ == 4) {
          return 2;
        }
        if (☃ == 2) {
          return 3;
        }
        if (☃ == 1) {
          return 4;
        }
      }
      else if (this.m == cq.f)
      {
        if (☃ == 3) {
          return 2;
        }
        if (☃ == 4) {
          return 1;
        }
        if (☃ == 2) {
          return 3;
        }
        if (☃ == 1) {
          return 4;
        }
      }
    }
    else if ((☃ == afi.bR) || ((☃ instanceof age)))
    {
      cq ☃ = cq.b(☃);
      if (this.m == cq.d)
      {
        if ((☃ == cq.d) || (☃ == cq.c)) {
          return ☃.d().b();
        }
      }
      else if (this.m == cq.e)
      {
        if (☃ == cq.c) {
          return cq.e.b();
        }
        if (☃ == cq.d) {
          return cq.f.b();
        }
        if (☃ == cq.e) {
          return cq.c.b();
        }
        if (☃ == cq.f) {
          return cq.d.b();
        }
      }
      else if (this.m == cq.f)
      {
        if (☃ == cq.c) {
          return cq.f.b();
        }
        if (☃ == cq.d) {
          return cq.e.b();
        }
        if (☃ == cq.e) {
          return cq.c.b();
        }
        if (☃ == cq.f) {
          return cq.d.b();
        }
      }
    }
    else if ((☃ == afi.J) || (☃ == afi.F) || (☃ == afi.ay) || (☃ == afi.z))
    {
      if (this.m == cq.d)
      {
        if ((☃ == cq.c.a()) || (☃ == cq.d.a())) {
          return cq.a(☃).d().a();
        }
      }
      else if (this.m == cq.e)
      {
        if (☃ == cq.c.a()) {
          return cq.e.a();
        }
        if (☃ == cq.d.a()) {
          return cq.f.a();
        }
        if (☃ == cq.e.a()) {
          return cq.c.a();
        }
        if (☃ == cq.f.a()) {
          return cq.d.a();
        }
      }
      else if (this.m == cq.f)
      {
        if (☃ == cq.c.a()) {
          return cq.f.a();
        }
        if (☃ == cq.d.a()) {
          return cq.e.a();
        }
        if (☃ == cq.e.a()) {
          return cq.c.a();
        }
        if (☃ == cq.f.a()) {
          return cq.d.a();
        }
      }
    }
    return ☃;
  }
  
  protected void a(adm ☃, alz ☃, int ☃, int ☃, int ☃, aqe ☃)
  {
    cj ☃ = new cj(a(☃, ☃), d(☃), b(☃, ☃));
    if (!☃.b(☃)) {
      return;
    }
    ☃.a(☃, ☃, 2);
  }
  
  protected alz a(adm ☃, int ☃, int ☃, int ☃, aqe ☃)
  {
    int ☃ = a(☃, ☃);
    int ☃ = d(☃);
    int ☃ = b(☃, ☃);
    
    cj ☃ = new cj(☃, ☃, ☃);
    if (!☃.b(☃)) {
      return afi.a.Q();
    }
    return ☃.p(☃);
  }
  
  protected void a(adm ☃, aqe ☃, int ☃, int ☃, int ☃, int ☃, int ☃, int ☃)
  {
    for (int ☃ = ☃; ☃ <= ☃; ☃++) {
      for (int ☃ = ☃; ☃ <= ☃; ☃++) {
        for (int ☃ = ☃; ☃ <= ☃; ☃++) {
          a(☃, afi.a.Q(), ☃, ☃, ☃, ☃);
        }
      }
    }
  }
  
  protected void a(adm ☃, aqe ☃, int ☃, int ☃, int ☃, int ☃, int ☃, int ☃, alz ☃, alz ☃, boolean ☃)
  {
    for (int ☃ = ☃; ☃ <= ☃; ☃++) {
      for (int ☃ = ☃; ☃ <= ☃; ☃++) {
        for (int ☃ = ☃; ☃ <= ☃; ☃++) {
          if ((!☃) || (a(☃, ☃, ☃, ☃, ☃).c().t() != arm.a)) {
            if ((☃ == ☃) || (☃ == ☃) || (☃ == ☃) || (☃ == ☃) || (☃ == ☃) || (☃ == ☃)) {
              a(☃, ☃, ☃, ☃, ☃, ☃);
            } else {
              a(☃, ☃, ☃, ☃, ☃, ☃);
            }
          }
        }
      }
    }
  }
  
  protected void a(adm ☃, aqe ☃, int ☃, int ☃, int ☃, int ☃, int ☃, int ☃, boolean ☃, Random ☃, aqt.a ☃)
  {
    for (int ☃ = ☃; ☃ <= ☃; ☃++) {
      for (int ☃ = ☃; ☃ <= ☃; ☃++) {
        for (int ☃ = ☃; ☃ <= ☃; ☃++) {
          if ((!☃) || (a(☃, ☃, ☃, ☃, ☃).c().t() != arm.a))
          {
            ☃.a(☃, ☃, ☃, ☃, (☃ == ☃) || (☃ == ☃) || (☃ == ☃) || (☃ == ☃) || (☃ == ☃) || (☃ == ☃));
            a(☃, ☃.a(), ☃, ☃, ☃, ☃);
          }
        }
      }
    }
  }
  
  protected void a(adm ☃, aqe ☃, Random ☃, float ☃, int ☃, int ☃, int ☃, int ☃, int ☃, int ☃, alz ☃, alz ☃, boolean ☃)
  {
    for (int ☃ = ☃; ☃ <= ☃; ☃++) {
      for (int ☃ = ☃; ☃ <= ☃; ☃++) {
        for (int ☃ = ☃; ☃ <= ☃; ☃++) {
          if (☃.nextFloat() <= ☃) {
            if ((!☃) || (a(☃, ☃, ☃, ☃, ☃).c().t() != arm.a)) {
              if ((☃ == ☃) || (☃ == ☃) || (☃ == ☃) || (☃ == ☃) || (☃ == ☃) || (☃ == ☃)) {
                a(☃, ☃, ☃, ☃, ☃, ☃);
              } else {
                a(☃, ☃, ☃, ☃, ☃, ☃);
              }
            }
          }
        }
      }
    }
  }
  
  protected void a(adm ☃, aqe ☃, Random ☃, float ☃, int ☃, int ☃, int ☃, alz ☃)
  {
    if (☃.nextFloat() < ☃) {
      a(☃, ☃, ☃, ☃, ☃, ☃);
    }
  }
  
  protected void a(adm ☃, aqe ☃, int ☃, int ☃, int ☃, int ☃, int ☃, int ☃, alz ☃, boolean ☃)
  {
    float ☃ = ☃ - ☃ + 1;
    float ☃ = ☃ - ☃ + 1;
    float ☃ = ☃ - ☃ + 1;
    float ☃ = ☃ + ☃ / 2.0F;
    float ☃ = ☃ + ☃ / 2.0F;
    for (int ☃ = ☃; ☃ <= ☃; ☃++)
    {
      float ☃ = (☃ - ☃) / ☃;
      for (int ☃ = ☃; ☃ <= ☃; ☃++)
      {
        float ☃ = (☃ - ☃) / (☃ * 0.5F);
        for (int ☃ = ☃; ☃ <= ☃; ☃++)
        {
          float ☃ = (☃ - ☃) / (☃ * 0.5F);
          if ((!☃) || (a(☃, ☃, ☃, ☃, ☃).c().t() != arm.a))
          {
            float ☃ = ☃ * ☃ + ☃ * ☃ + ☃ * ☃;
            if (☃ <= 1.05F) {
              a(☃, ☃, ☃, ☃, ☃, ☃);
            }
          }
        }
      }
    }
  }
  
  protected void b(adm ☃, int ☃, int ☃, int ☃, aqe ☃)
  {
    cj ☃ = new cj(a(☃, ☃), d(☃), b(☃, ☃));
    if (!☃.b(☃)) {
      return;
    }
    while ((!☃.d(☃)) && (☃.o() < 255))
    {
      ☃.a(☃, afi.a.Q(), 2);
      ☃ = ☃.a();
    }
  }
  
  protected void b(adm ☃, alz ☃, int ☃, int ☃, int ☃, aqe ☃)
  {
    int ☃ = a(☃, ☃);
    int ☃ = d(☃);
    int ☃ = b(☃, ☃);
    if (!☃.b(new cj(☃, ☃, ☃))) {
      return;
    }
    while (((☃.d(new cj(☃, ☃, ☃))) || (☃.p(new cj(☃, ☃, ☃)).c().t().d())) && (☃ > 1))
    {
      ☃.a(new cj(☃, ☃, ☃), ☃, 2);
      ☃--;
    }
  }
  
  protected boolean a(adm ☃, aqe ☃, Random ☃, int ☃, int ☃, int ☃, List<ob> ☃, int ☃)
  {
    cj ☃ = new cj(a(☃, ☃), d(☃), b(☃, ☃));
    if ((☃.b(☃)) && 
      (☃.p(☃).c() != afi.ae))
    {
      alz ☃ = afi.ae.Q();
      ☃.a(☃, afi.ae.f(☃, ☃, ☃), 2);
      
      akw ☃ = ☃.s(☃);
      if ((☃ instanceof aky)) {
        ob.a(☃, ☃, (aky)☃, ☃);
      }
      return true;
    }
    return false;
  }
  
  protected boolean a(adm ☃, aqe ☃, Random ☃, int ☃, int ☃, int ☃, int ☃, List<ob> ☃, int ☃)
  {
    cj ☃ = new cj(a(☃, ☃), d(☃), b(☃, ☃));
    if ((☃.b(☃)) && 
      (☃.p(☃).c() != afi.z))
    {
      ☃.a(☃, afi.z.a(a(afi.z, ☃)), 2);
      
      akw ☃ = ☃.s(☃);
      if ((☃ instanceof alc)) {
        ob.a(☃, ☃, (alc)☃, ☃);
      }
      return true;
    }
    return false;
  }
  
  protected void a(adm ☃, aqe ☃, Random ☃, int ☃, int ☃, int ☃, cq ☃)
  {
    cj ☃ = new cj(a(☃, ☃), d(☃), b(☃, ☃));
    if (☃.b(☃)) {
      zb.a(☃, ☃, ☃.f(), afi.ao);
    }
  }
  
  public void a(int ☃, int ☃, int ☃)
  {
    this.l.a(☃, ☃, ☃);
  }
  
  public static abstract class a
  {
    protected alz a = afi.a.Q();
    
    public abstract void a(Random paramRandom, int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean);
    
    public alz a()
    {
      return this.a;
    }
  }
}
