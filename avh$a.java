public enum avh$a
{
  private final boolean S;
  private final boolean T;
  private final String U;
  private final float V;
  private float W;
  private float X;
  private static final a[] Y = { a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, r, s, t, u, v, w, x, y, z, A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R };
  private static final String __OBFID = "CL_00000653";
  
  public static a a(int p_74379_0_)
  {
    a[] var1 = values();
    int var2 = var1.length;
    for (int var3 = 0; var3 < var2; var3++)
    {
      a var4 = var1[var3];
      if (var4.c() == p_74379_0_) {
        return var4;
      }
    }
    return null;
  }
  
  private avh$a(String p_i1015_1_, int p_i1015_2_, String p_i1015_3_, boolean p_i1015_4_, boolean p_i1015_5_)
  {
    this(p_i1015_1_, p_i1015_2_, p_i1015_3_, p_i1015_4_, p_i1015_5_, 0.0F, 1.0F, 0.0F);
  }
  
  private avh$a(String p_i45004_1_, int p_i45004_2_, String p_i45004_3_, boolean p_i45004_4_, boolean p_i45004_5_, float p_i45004_6_, float p_i45004_7_, float p_i45004_8_)
  {
    U = p_i45004_3_;
    S = p_i45004_4_;
    T = p_i45004_5_;
    W = p_i45004_6_;
    X = p_i45004_7_;
    V = p_i45004_8_;
  }
  
  public boolean a()
  {
    return S;
  }
  
  public boolean b()
  {
    return T;
  }
  
  public int c()
  {
    return ordinal();
  }
  
  public String d()
  {
    return U;
  }
  
  public float f()
  {
    return X;
  }
  
  public void a(float p_148263_1_)
  {
    X = p_148263_1_;
  }
  
  public float c(float p_148266_1_)
  {
    return ns.a((e(p_148266_1_) - W) / (X - W), 0.0F, 1.0F);
  }
  
  public float d(float p_148262_1_)
  {
    return e(W + (X - W) * ns.a(p_148262_1_, 0.0F, 1.0F));
  }
  
  public float e(float p_148268_1_)
  {
    p_148268_1_ = f(p_148268_1_);
    return ns.a(p_148268_1_, W, X);
  }
  
  protected float f(float p_148264_1_)
  {
    if (V > 0.0F) {
      p_148264_1_ = V * Math.round(p_148264_1_ / V);
    }
    return p_148264_1_;
  }
}
