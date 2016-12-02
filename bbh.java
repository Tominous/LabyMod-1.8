public class bbh
  extends bbo
{
  private bct a;
  private bct b;
  private bct c;
  private bct d;
  private bct e;
  private bct f;
  private bct g;
  private bct h;
  private bct i;
  private bct j;
  private bct k;
  private bct l;
  private bct m;
  private bct n;
  private bct o;
  private bct v;
  private bct w;
  private bct x;
  private bct y;
  private bct z;
  private bct A;
  private bct B;
  private bct C;
  private bct D;
  private bct E;
  private bct F;
  private bct G;
  private bct H;
  private bct I;
  private bct J;
  private bct K;
  private bct L;
  private bct M;
  private bct N;
  private bct O;
  private bct P;
  private bct Q;
  private bct R;
  private bct S;
  
  public bbh()
  {
    t = 128;
    u = 128;
    
    k = new bct(this, 0, 34);
    k.a(-5.0F, -8.0F, -19.0F, 10, 10, 24);
    k.a(0.0F, 11.0F, 9.0F);
    
    l = new bct(this, 44, 0);
    l.a(-1.0F, -1.0F, 0.0F, 2, 2, 3);
    l.a(0.0F, 3.0F, 14.0F);
    a(l, -1.134464F, 0.0F, 0.0F);
    
    m = new bct(this, 38, 7);
    m.a(-1.5F, -2.0F, 3.0F, 3, 4, 7);
    m.a(0.0F, 3.0F, 14.0F);
    a(m, -1.134464F, 0.0F, 0.0F);
    
    n = new bct(this, 24, 3);
    n.a(-1.5F, -4.5F, 9.0F, 3, 4, 7);
    n.a(0.0F, 3.0F, 14.0F);
    a(n, -1.40215F, 0.0F, 0.0F);
    
    o = new bct(this, 78, 29);
    o.a(-2.5F, -2.0F, -2.5F, 4, 9, 5);
    o.a(4.0F, 9.0F, 11.0F);
    
    v = new bct(this, 78, 43);
    v.a(-2.0F, 0.0F, -1.5F, 3, 5, 3);
    v.a(4.0F, 16.0F, 11.0F);
    
    w = new bct(this, 78, 51);
    w.a(-2.5F, 5.1F, -2.0F, 4, 3, 4);
    w.a(4.0F, 16.0F, 11.0F);
    
    x = new bct(this, 96, 29);
    x.a(-1.5F, -2.0F, -2.5F, 4, 9, 5);
    x.a(-4.0F, 9.0F, 11.0F);
    
    y = new bct(this, 96, 43);
    y.a(-1.0F, 0.0F, -1.5F, 3, 5, 3);
    y.a(-4.0F, 16.0F, 11.0F);
    
    z = new bct(this, 96, 51);
    z.a(-1.5F, 5.1F, -2.0F, 4, 3, 4);
    z.a(-4.0F, 16.0F, 11.0F);
    
    A = new bct(this, 44, 29);
    A.a(-1.9F, -1.0F, -2.1F, 3, 8, 4);
    A.a(4.0F, 9.0F, -8.0F);
    
    B = new bct(this, 44, 41);
    B.a(-1.9F, 0.0F, -1.6F, 3, 5, 3);
    B.a(4.0F, 16.0F, -8.0F);
    
    C = new bct(this, 44, 51);
    C.a(-2.4F, 5.1F, -2.1F, 4, 3, 4);
    C.a(4.0F, 16.0F, -8.0F);
    
    D = new bct(this, 60, 29);
    D.a(-1.1F, -1.0F, -2.1F, 3, 8, 4);
    D.a(-4.0F, 9.0F, -8.0F);
    
    E = new bct(this, 60, 41);
    E.a(-1.1F, 0.0F, -1.6F, 3, 5, 3);
    E.a(-4.0F, 16.0F, -8.0F);
    
    F = new bct(this, 60, 51);
    F.a(-1.6F, 5.1F, -2.1F, 4, 3, 4);
    F.a(-4.0F, 16.0F, -8.0F);
    
    a = new bct(this, 0, 0);
    a.a(-2.5F, -10.0F, -1.5F, 5, 5, 7);
    a.a(0.0F, 4.0F, -10.0F);
    a(a, 0.5235988F, 0.0F, 0.0F);
    
    b = new bct(this, 24, 18);
    b.a(-2.0F, -10.0F, -7.0F, 4, 3, 6);
    b.a(0.0F, 3.95F, -10.0F);
    a(b, 0.5235988F, 0.0F, 0.0F);
    
    c = new bct(this, 24, 27);
    c.a(-2.0F, -7.0F, -6.5F, 4, 2, 5);
    c.a(0.0F, 4.0F, -10.0F);
    a(c, 0.5235988F, 0.0F, 0.0F);
    
    a.a(b);
    a.a(c);
    
    d = new bct(this, 0, 0);
    d.a(0.45F, -12.0F, 4.0F, 2, 3, 1);
    d.a(0.0F, 4.0F, -10.0F);
    a(d, 0.5235988F, 0.0F, 0.0F);
    
    e = new bct(this, 0, 0);
    e.a(-2.45F, -12.0F, 4.0F, 2, 3, 1);
    e.a(0.0F, 4.0F, -10.0F);
    a(e, 0.5235988F, 0.0F, 0.0F);
    
    f = new bct(this, 0, 12);
    f.a(-2.0F, -16.0F, 4.0F, 2, 7, 1);
    f.a(0.0F, 4.0F, -10.0F);
    a(f, 0.5235988F, 0.0F, 0.2617994F);
    
    g = new bct(this, 0, 12);
    g.a(0.0F, -16.0F, 4.0F, 2, 7, 1);
    g.a(0.0F, 4.0F, -10.0F);
    a(g, 0.5235988F, 0.0F, -0.2617994F);
    
    h = new bct(this, 0, 12);
    h.a(-2.05F, -9.8F, -2.0F, 4, 14, 8);
    h.a(0.0F, 4.0F, -10.0F);
    a(h, 0.5235988F, 0.0F, 0.0F);
    
    G = new bct(this, 0, 34);
    G.a(-3.0F, 0.0F, 0.0F, 8, 8, 3);
    G.a(-7.5F, 3.0F, 10.0F);
    a(G, 0.0F, 1.5707964F, 0.0F);
    
    H = new bct(this, 0, 47);
    H.a(-3.0F, 0.0F, 0.0F, 8, 8, 3);
    H.a(4.5F, 3.0F, 10.0F);
    a(H, 0.0F, 1.5707964F, 0.0F);
    
    I = new bct(this, 80, 0);
    I.a(-5.0F, 0.0F, -3.0F, 10, 1, 8);
    I.a(0.0F, 2.0F, 2.0F);
    
    J = new bct(this, 106, 9);
    J.a(-1.5F, -1.0F, -3.0F, 3, 1, 2);
    J.a(0.0F, 2.0F, 2.0F);
    
    K = new bct(this, 80, 9);
    K.a(-4.0F, -1.0F, 3.0F, 8, 1, 2);
    K.a(0.0F, 2.0F, 2.0F);
    
    M = new bct(this, 74, 0);
    M.a(-0.5F, 6.0F, -1.0F, 1, 2, 2);
    M.a(5.0F, 3.0F, 2.0F);
    
    L = new bct(this, 70, 0);
    L.a(-0.5F, 0.0F, -0.5F, 1, 6, 1);
    L.a(5.0F, 3.0F, 2.0F);
    
    O = new bct(this, 74, 4);
    O.a(-0.5F, 6.0F, -1.0F, 1, 2, 2);
    O.a(-5.0F, 3.0F, 2.0F);
    
    N = new bct(this, 80, 0);
    N.a(-0.5F, 0.0F, -0.5F, 1, 6, 1);
    N.a(-5.0F, 3.0F, 2.0F);
    
    P = new bct(this, 74, 13);
    P.a(1.5F, -8.0F, -4.0F, 1, 2, 2);
    P.a(0.0F, 4.0F, -10.0F);
    a(P, 0.5235988F, 0.0F, 0.0F);
    
    Q = new bct(this, 74, 13);
    Q.a(-2.5F, -8.0F, -4.0F, 1, 2, 2);
    Q.a(0.0F, 4.0F, -10.0F);
    a(Q, 0.5235988F, 0.0F, 0.0F);
    
    R = new bct(this, 44, 10);
    R.a(2.6F, -6.0F, -6.0F, 0, 3, 16);
    R.a(0.0F, 4.0F, -10.0F);
    
    S = new bct(this, 44, 5);
    S.a(-2.6F, -6.0F, -6.0F, 0, 3, 16);
    S.a(0.0F, 4.0F, -10.0F);
    
    j = new bct(this, 58, 0);
    j.a(-1.0F, -11.5F, 5.0F, 2, 16, 4);
    j.a(0.0F, 4.0F, -10.0F);
    a(j, 0.5235988F, 0.0F, 0.0F);
    
    i = new bct(this, 80, 12);
    i.a(-2.5F, -10.1F, -7.0F, 5, 5, 12, 0.2F);
    i.a(0.0F, 4.0F, -10.0F);
    a(i, 0.5235988F, 0.0F, 0.0F);
  }
  
  public void a(pk ☃, float ☃, float ☃, float ☃, float ☃, float ☃, float ☃)
  {
    tp ☃ = (tp)☃;
    
    int ☃ = ☃.cl();
    float ☃ = ☃.p(0.0F);
    boolean ☃ = ☃.cn();
    boolean ☃ = (☃) && (☃.cG());
    boolean ☃ = (☃) && (☃.cw());
    boolean ☃ = (☃ == 1) || (☃ == 2);
    float ☃ = ☃.cu();
    
    boolean ☃ = l != null;
    if (☃)
    {
      i.a(☃);
      I.a(☃);
      J.a(☃);
      K.a(☃);
      L.a(☃);
      M.a(☃);
      N.a(☃);
      O.a(☃);
      P.a(☃);
      Q.a(☃);
      if (☃)
      {
        R.a(☃);
        S.a(☃);
      }
    }
    if (!☃)
    {
      bfl.E();
      bfl.a(☃, 0.5F + ☃ * 0.5F, ☃);
      bfl.b(0.0F, 0.95F * (1.0F - ☃), 0.0F);
    }
    o.a(☃);
    v.a(☃);
    w.a(☃);
    
    x.a(☃);
    y.a(☃);
    z.a(☃);
    
    A.a(☃);
    B.a(☃);
    C.a(☃);
    
    D.a(☃);
    E.a(☃);
    F.a(☃);
    if (!☃)
    {
      bfl.F();
      
      bfl.E();
      bfl.a(☃, ☃, ☃);
      bfl.b(0.0F, 1.35F * (1.0F - ☃), 0.0F);
    }
    k.a(☃);
    l.a(☃);
    m.a(☃);
    n.a(☃);
    h.a(☃);
    j.a(☃);
    if (!☃)
    {
      bfl.F();
      
      bfl.E();
      float ☃ = 0.5F + ☃ * ☃ * 0.5F;
      bfl.a(☃, ☃, ☃);
      if (☃ <= 0.0F) {
        bfl.b(0.0F, 1.35F * (1.0F - ☃), 0.0F);
      } else {
        bfl.b(0.0F, 0.9F * (1.0F - ☃) * ☃ + 1.35F * (1.0F - ☃) * (1.0F - ☃), 0.15F * (1.0F - ☃) * ☃);
      }
    }
    if (☃)
    {
      f.a(☃);
      g.a(☃);
    }
    else
    {
      d.a(☃);
      e.a(☃);
    }
    a.a(☃);
    if (!☃) {
      bfl.F();
    }
    if (☃)
    {
      G.a(☃);
      H.a(☃);
    }
  }
  
  private void a(bct ☃, float ☃, float ☃, float ☃)
  {
    f = ☃;
    g = ☃;
    h = ☃;
  }
  
  private float a(float ☃, float ☃, float ☃)
  {
    float ☃ = ☃ - ☃;
    while (☃ < -180.0F) {
      ☃ += 360.0F;
    }
    while (☃ >= 180.0F) {
      ☃ -= 360.0F;
    }
    return ☃ + ☃ * ☃;
  }
  
  public void a(pr ☃, float ☃, float ☃, float ☃)
  {
    super.a(☃, ☃, ☃, ☃);
    
    float ☃ = a(aJ, aI, ☃);
    float ☃ = a(aL, aK, ☃);
    float ☃ = B + (z - B) * ☃;
    float ☃ = ☃ - ☃;
    
    float ☃ = ☃ / 57.295776F;
    if (☃ > 20.0F) {
      ☃ = 20.0F;
    }
    if (☃ < -20.0F) {
      ☃ = -20.0F;
    }
    if (☃ > 0.2F) {
      ☃ += ns.b(☃ * 0.4F) * 0.15F * ☃;
    }
    tp ☃ = (tp)☃;
    float ☃ = ☃.p(☃);
    float ☃ = ☃.q(☃);
    float ☃ = 1.0F - ☃;
    float ☃ = ☃.r(☃);
    boolean ☃ = bm != 0;
    boolean ☃ = ☃.cG();
    boolean ☃ = l != null;
    float ☃ = W + ☃;
    
    float ☃ = ns.b(☃ * 0.6662F + 3.1415927F);
    float ☃ = ☃ * 0.8F * ☃;
    
    a.d = 4.0F;
    a.e = -10.0F;
    l.d = 3.0F;
    m.e = 14.0F;
    H.d = 3.0F;
    H.e = 10.0F;
    k.f = 0.0F;
    
    a.f = (0.5235988F + ☃);
    a.g = (☃ / 57.295776F);
    
    a.f = (☃ * (0.2617994F + ☃) + ☃ * 2.18166F + (1.0F - Math.max(☃, ☃)) * a.f);
    a.g = (☃ * ☃ / 57.295776F + (1.0F - Math.max(☃, ☃)) * a.g);
    
    a.d = (☃ * -6.0F + ☃ * 11.0F + (1.0F - Math.max(☃, ☃)) * a.d);
    a.e = (☃ * -1.0F + ☃ * -10.0F + (1.0F - Math.max(☃, ☃)) * a.e);
    
    l.d = (☃ * 9.0F + ☃ * l.d);
    m.e = (☃ * 18.0F + ☃ * m.e);
    H.d = (☃ * 5.5F + ☃ * H.d);
    H.e = (☃ * 15.0F + ☃ * H.e);
    k.f = (☃ * -45.0F / 57.295776F + ☃ * k.f);
    
    d.d = a.d;
    e.d = a.d;
    f.d = a.d;
    g.d = a.d;
    h.d = a.d;
    b.d = 0.02F;
    c.d = 0.0F;
    j.d = a.d;
    
    d.e = a.e;
    e.e = a.e;
    f.e = a.e;
    g.e = a.e;
    h.e = a.e;
    b.e = (0.02F - ☃ * 1.0F);
    c.e = (0.0F + ☃ * 1.0F);
    j.e = a.e;
    
    d.f = a.f;
    e.f = a.f;
    f.f = a.f;
    g.f = a.f;
    h.f = a.f;
    b.f = (0.0F - 0.09424778F * ☃);
    c.f = (0.0F + 0.15707964F * ☃);
    
    j.f = a.f;
    
    d.g = a.g;
    e.g = a.g;
    f.g = a.g;
    g.g = a.g;
    h.g = a.g;
    b.g = 0.0F;
    c.g = 0.0F;
    j.g = a.g;
    
    G.f = (☃ / 5.0F);
    H.f = (-☃ / 5.0F);
    
    float ☃ = 1.5707964F;
    float ☃ = 4.712389F;
    float ☃ = -1.0471976F;
    float ☃ = 0.2617994F * ☃;
    float ☃ = ns.b(☃ * 0.6F + 3.1415927F);
    
    A.d = (-2.0F * ☃ + 9.0F * ☃);
    A.e = (-2.0F * ☃ + -8.0F * ☃);
    D.d = A.d;
    D.e = A.e;
    
    v.d = (o.d + ns.a(1.5707964F + ☃ + ☃ * -☃ * 0.5F * ☃) * 7.0F);
    v.e = (o.e + ns.b(4.712389F + ☃ + ☃ * -☃ * 0.5F * ☃) * 7.0F);
    
    y.d = (x.d + ns.a(1.5707964F + ☃ + ☃ * ☃ * 0.5F * ☃) * 7.0F);
    y.e = (x.e + ns.b(4.712389F + ☃ + ☃ * ☃ * 0.5F * ☃) * 7.0F);
    
    float ☃ = (-1.0471976F + ☃) * ☃ + ☃ * ☃;
    float ☃ = (-1.0471976F + -☃) * ☃ + -☃ * ☃;
    B.d = (A.d + ns.a(1.5707964F + ☃) * 7.0F);
    B.e = (A.e + ns.b(4.712389F + ☃) * 7.0F);
    
    E.d = (D.d + ns.a(1.5707964F + ☃) * 7.0F);
    E.e = (D.e + ns.b(4.712389F + ☃) * 7.0F);
    
    o.f = (☃ + -☃ * 0.5F * ☃ * ☃);
    v.f = (-0.08726646F * ☃ + (-☃ * 0.5F * ☃ - Math.max(0.0F, ☃ * 0.5F * ☃)) * ☃);
    w.f = v.f;
    
    x.f = (☃ + ☃ * 0.5F * ☃ * ☃);
    y.f = (-0.08726646F * ☃ + (☃ * 0.5F * ☃ - Math.max(0.0F, -☃ * 0.5F * ☃)) * ☃);
    z.f = y.f;
    
    A.f = ☃;
    B.f = ((A.f + 3.1415927F * Math.max(0.0F, 0.2F + ☃ * 0.2F)) * ☃ + (☃ + Math.max(0.0F, ☃ * 0.5F * ☃)) * ☃);
    C.f = B.f;
    
    D.f = ☃;
    E.f = ((D.f + 3.1415927F * Math.max(0.0F, 0.2F - ☃ * 0.2F)) * ☃ + (-☃ + Math.max(0.0F, -☃ * 0.5F * ☃)) * ☃);
    F.f = E.f;
    
    w.d = v.d;
    w.e = v.e;
    z.d = y.d;
    z.e = y.e;
    C.d = B.d;
    C.e = B.e;
    F.d = E.d;
    F.e = E.e;
    if (☃)
    {
      I.d = (☃ * 0.5F + ☃ * 2.0F);
      I.e = (☃ * 11.0F + ☃ * 2.0F);
      
      J.d = I.d;
      K.d = I.d;
      L.d = I.d;
      N.d = I.d;
      M.d = I.d;
      O.d = I.d;
      G.d = H.d;
      
      J.e = I.e;
      K.e = I.e;
      L.e = I.e;
      N.e = I.e;
      M.e = I.e;
      O.e = I.e;
      G.e = H.e;
      
      I.f = k.f;
      J.f = k.f;
      K.f = k.f;
      
      R.d = a.d;
      S.d = a.d;
      i.d = a.d;
      P.d = a.d;
      Q.d = a.d;
      
      R.e = a.e;
      S.e = a.e;
      i.e = a.e;
      P.e = a.e;
      Q.e = a.e;
      
      R.f = ☃;
      S.f = ☃;
      i.f = a.f;
      P.f = a.f;
      Q.f = a.f;
      i.g = a.g;
      P.g = a.g;
      R.g = a.g;
      Q.g = a.g;
      S.g = a.g;
      if (☃)
      {
        L.f = -1.0471976F;
        M.f = -1.0471976F;
        N.f = -1.0471976F;
        O.f = -1.0471976F;
        
        L.h = 0.0F;
        M.h = 0.0F;
        N.h = 0.0F;
        O.h = 0.0F;
      }
      else
      {
        L.f = (☃ / 3.0F);
        M.f = (☃ / 3.0F);
        N.f = (☃ / 3.0F);
        O.f = (☃ / 3.0F);
        
        L.h = (☃ / 5.0F);
        M.h = (☃ / 5.0F);
        N.h = (-☃ / 5.0F);
        O.h = (-☃ / 5.0F);
      }
    }
    float ☃ = -1.3089F + ☃ * 1.5F;
    if (☃ > 0.0F) {
      ☃ = 0.0F;
    }
    if (☃)
    {
      l.g = ns.b(☃ * 0.7F);
      ☃ = 0.0F;
    }
    else
    {
      l.g = 0.0F;
    }
    m.g = l.g;
    n.g = l.g;
    
    m.d = l.d;
    n.d = l.d;
    m.e = l.e;
    n.e = l.e;
    
    l.f = ☃;
    m.f = ☃;
    n.f = (-0.2618F + ☃);
  }
}
