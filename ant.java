import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import java.lang.reflect.Type;

public class ant
{
  public final float a;
  public final float b;
  public final float c;
  public final float d;
  public final float e;
  public final float f;
  public final float g;
  public final float h;
  public final float i;
  public final float j;
  public final float k;
  public final float l;
  public final float m;
  public final float n;
  public final float o;
  public final float p;
  public final int q;
  public final boolean r;
  public final boolean s;
  public final int t;
  public final boolean u;
  public final boolean v;
  public final boolean w;
  public final boolean x;
  public final boolean y;
  public final boolean z;
  public final boolean A;
  public final int B;
  public final boolean C;
  public final int D;
  public final boolean E;
  public final int F;
  public final int G;
  public final int H;
  public final int I;
  public final int J;
  public final int K;
  public final int L;
  public final int M;
  public final int N;
  public final int O;
  public final int P;
  public final int Q;
  public final int R;
  public final int S;
  public final int T;
  public final int U;
  public final int V;
  public final int W;
  public final int X;
  public final int Y;
  public final int Z;
  public final int aa;
  public final int ab;
  public final int ac;
  public final int ad;
  public final int ae;
  public final int af;
  public final int ag;
  public final int ah;
  public final int ai;
  public final int aj;
  public final int ak;
  public final int al;
  public final int am;
  public final int an;
  public final int ao;
  public final int ap;
  public final int aq;
  public final int ar;
  public final int as;
  public final int at;
  public final int au;
  public final int av;
  public final int aw;
  public final int ax;
  public final int ay;
  public final int az;
  
  private ant(ant.a ☃)
  {
    a = b;
    b = c;
    c = d;
    d = e;
    e = f;
    f = g;
    g = h;
    h = i;
    i = j;
    j = k;
    k = l;
    l = m;
    m = n;
    n = o;
    o = p;
    p = q;
    q = r;
    
    r = s;
    s = t;
    t = u;
    u = v;
    v = w;
    w = x;
    x = y;
    y = z;
    z = A;
    A = B;
    B = C;
    C = D;
    D = E;
    E = F;
    
    F = G;
    G = H;
    H = I;
    
    I = J;
    J = K;
    K = L;
    L = M;
    M = N;
    N = O;
    O = P;
    P = Q;
    Q = R;
    R = S;
    S = T;
    T = U;
    U = V;
    V = W;
    W = X;
    X = Y;
    Y = Z;
    Z = aa;
    aa = ab;
    ab = ac;
    ac = ad;
    ad = ae;
    ae = af;
    af = ag;
    ag = ah;
    ah = ai;
    ai = aj;
    aj = ak;
    ak = al;
    al = am;
    am = an;
    an = ao;
    ao = ap;
    ap = aq;
    aq = ar;
    ar = as;
    as = at;
    at = au;
    au = av;
    av = aw;
    aw = ax;
    ax = ay;
    ay = az;
    az = aA;
  }
  
  public static class a
  {
    static final Gson a = new GsonBuilder().registerTypeAdapter(a.class, new ant.b()).create();
    
    public static a a(String ☃)
    {
      if (☃.length() == 0) {
        return new a();
      }
      try
      {
        return (a)a.fromJson(☃, a.class);
      }
      catch (Exception ☃) {}
      return new a();
    }
    
    public String toString()
    {
      return a.toJson(this);
    }
    
    public float b = 684.412F;
    public float c = 684.412F;
    public float d = 512.0F;
    public float e = 512.0F;
    public float f = 200.0F;
    public float g = 200.0F;
    public float h = 0.5F;
    public float i = 80.0F;
    public float j = 160.0F;
    public float k = 80.0F;
    public float l = 8.5F;
    public float m = 12.0F;
    public float n = 1.0F;
    public float o = 0.0F;
    public float p = 1.0F;
    public float q = 0.0F;
    public int r = 63;
    public boolean s = true;
    public boolean t = true;
    public int u = 8;
    public boolean v = true;
    public boolean w = true;
    public boolean x = true;
    public boolean y = true;
    public boolean z = true;
    public boolean A = true;
    public boolean B = true;
    public int C = 4;
    public boolean D = true;
    public int E = 80;
    public boolean F = false;
    public int G = -1;
    public int H = 4;
    public int I = 4;
    public int J = 33;
    public int K = 10;
    public int L = 0;
    public int M = 256;
    public int N = 33;
    public int O = 8;
    public int P = 0;
    public int Q = 256;
    public int R = 33;
    public int S = 10;
    public int T = 0;
    public int U = 80;
    public int V = 33;
    public int W = 10;
    public int X = 0;
    public int Y = 80;
    public int Z = 33;
    public int aa = 10;
    public int ab = 0;
    public int ac = 80;
    public int ad = 17;
    public int ae = 20;
    public int af = 0;
    public int ag = 128;
    public int ah = 9;
    public int ai = 20;
    public int aj = 0;
    public int ak = 64;
    public int al = 9;
    public int am = 2;
    public int an = 0;
    public int ao = 32;
    public int ap = 8;
    public int aq = 8;
    public int ar = 0;
    public int as = 16;
    public int at = 8;
    public int au = 1;
    public int av = 0;
    public int aw = 16;
    public int ax = 7;
    public int ay = 1;
    public int az = 16;
    public int aA = 16;
    
    public a()
    {
      a();
    }
    
    public void a()
    {
      b = 684.412F;
      c = 684.412F;
      d = 512.0F;
      e = 512.0F;
      f = 200.0F;
      g = 200.0F;
      h = 0.5F;
      i = 80.0F;
      j = 160.0F;
      k = 80.0F;
      l = 8.5F;
      m = 12.0F;
      n = 1.0F;
      o = 0.0F;
      p = 1.0F;
      q = 0.0F;
      r = 63;
      
      s = true;
      t = true;
      u = 8;
      v = true;
      w = true;
      x = true;
      y = true;
      z = true;
      A = true;
      B = true;
      C = 4;
      D = true;
      E = 80;
      F = false;
      
      G = -1;
      H = 4;
      I = 4;
      
      J = 33;
      K = 10;
      L = 0;
      M = 256;
      N = 33;
      O = 8;
      P = 0;
      Q = 256;
      R = 33;
      S = 10;
      T = 0;
      U = 80;
      V = 33;
      W = 10;
      X = 0;
      Y = 80;
      Z = 33;
      aa = 10;
      ab = 0;
      ac = 80;
      ad = 17;
      ae = 20;
      af = 0;
      ag = 128;
      ah = 9;
      ai = 20;
      aj = 0;
      ak = 64;
      al = 9;
      am = 2;
      an = 0;
      ao = 32;
      ap = 8;
      aq = 8;
      ar = 0;
      as = 16;
      at = 8;
      au = 1;
      av = 0;
      aw = 16;
      ax = 7;
      ay = 1;
      az = 16;
      aA = 16;
    }
    
    public boolean equals(Object ☃)
    {
      if (this == ☃) {
        return true;
      }
      if ((☃ == null) || (getClass() != ☃.getClass())) {
        return false;
      }
      a ☃ = (a)☃;
      if (aa != aa) {
        return false;
      }
      if (ac != ac) {
        return false;
      }
      if (ab != ab) {
        return false;
      }
      if (Z != Z) {
        return false;
      }
      if (Float.compare(l, l) != 0) {
        return false;
      }
      if (Float.compare(o, o) != 0) {
        return false;
      }
      if (Float.compare(n, n) != 0) {
        return false;
      }
      if (Float.compare(q, q) != 0) {
        return false;
      }
      if (Float.compare(p, p) != 0) {
        return false;
      }
      if (H != H) {
        return false;
      }
      if (ae != ae) {
        return false;
      }
      if (ag != ag) {
        return false;
      }
      if (af != af) {
        return false;
      }
      if (ad != ad) {
        return false;
      }
      if (Float.compare(b, b) != 0) {
        return false;
      }
      if (Float.compare(h, h) != 0) {
        return false;
      }
      if (Float.compare(f, f) != 0) {
        return false;
      }
      if (Float.compare(g, g) != 0) {
        return false;
      }
      if (au != au) {
        return false;
      }
      if (aw != aw) {
        return false;
      }
      if (av != av) {
        return false;
      }
      if (at != at) {
        return false;
      }
      if (W != W) {
        return false;
      }
      if (Y != Y) {
        return false;
      }
      if (X != X) {
        return false;
      }
      if (V != V) {
        return false;
      }
      if (K != K) {
        return false;
      }
      if (M != M) {
        return false;
      }
      if (L != L) {
        return false;
      }
      if (J != J) {
        return false;
      }
      if (u != u) {
        return false;
      }
      if (G != G) {
        return false;
      }
      if (am != am) {
        return false;
      }
      if (ao != ao) {
        return false;
      }
      if (an != an) {
        return false;
      }
      if (al != al) {
        return false;
      }
      if (S != S) {
        return false;
      }
      if (U != U) {
        return false;
      }
      if (T != T) {
        return false;
      }
      if (R != R) {
        return false;
      }
      if (O != O) {
        return false;
      }
      if (Q != Q) {
        return false;
      }
      if (P != P) {
        return false;
      }
      if (N != N) {
        return false;
      }
      if (Float.compare(c, c) != 0) {
        return false;
      }
      if (ai != ai) {
        return false;
      }
      if (ak != ak) {
        return false;
      }
      if (aj != aj) {
        return false;
      }
      if (ah != ah) {
        return false;
      }
      if (az != az) {
        return false;
      }
      if (ay != ay) {
        return false;
      }
      if (ax != ax) {
        return false;
      }
      if (aA != aA) {
        return false;
      }
      if (E != E) {
        return false;
      }
      if (Float.compare(e, e) != 0) {
        return false;
      }
      if (Float.compare(i, i) != 0) {
        return false;
      }
      if (Float.compare(j, j) != 0) {
        return false;
      }
      if (Float.compare(k, k) != 0) {
        return false;
      }
      if (aq != aq) {
        return false;
      }
      if (as != as) {
        return false;
      }
      if (ar != ar) {
        return false;
      }
      if (ap != ap) {
        return false;
      }
      if (I != I) {
        return false;
      }
      if (r != r) {
        return false;
      }
      if (Float.compare(m, m) != 0) {
        return false;
      }
      if (Float.compare(d, d) != 0) {
        return false;
      }
      if (s != s) {
        return false;
      }
      if (t != t) {
        return false;
      }
      if (D != D) {
        return false;
      }
      if (F != F) {
        return false;
      }
      if (x != x) {
        return false;
      }
      if (A != A) {
        return false;
      }
      if (v != v) {
        return false;
      }
      if (y != y) {
        return false;
      }
      if (z != z) {
        return false;
      }
      if (w != w) {
        return false;
      }
      if (B != B) {
        return false;
      }
      if (C != C) {
        return false;
      }
      return true;
    }
    
    public int hashCode()
    {
      int ☃ = b != 0.0F ? Float.floatToIntBits(b) : 0;
      ☃ = 31 * ☃ + (c != 0.0F ? Float.floatToIntBits(c) : 0);
      ☃ = 31 * ☃ + (d != 0.0F ? Float.floatToIntBits(d) : 0);
      ☃ = 31 * ☃ + (e != 0.0F ? Float.floatToIntBits(e) : 0);
      ☃ = 31 * ☃ + (f != 0.0F ? Float.floatToIntBits(f) : 0);
      ☃ = 31 * ☃ + (g != 0.0F ? Float.floatToIntBits(g) : 0);
      ☃ = 31 * ☃ + (h != 0.0F ? Float.floatToIntBits(h) : 0);
      ☃ = 31 * ☃ + (i != 0.0F ? Float.floatToIntBits(i) : 0);
      ☃ = 31 * ☃ + (j != 0.0F ? Float.floatToIntBits(j) : 0);
      ☃ = 31 * ☃ + (k != 0.0F ? Float.floatToIntBits(k) : 0);
      ☃ = 31 * ☃ + (l != 0.0F ? Float.floatToIntBits(l) : 0);
      ☃ = 31 * ☃ + (m != 0.0F ? Float.floatToIntBits(m) : 0);
      ☃ = 31 * ☃ + (n != 0.0F ? Float.floatToIntBits(n) : 0);
      ☃ = 31 * ☃ + (o != 0.0F ? Float.floatToIntBits(o) : 0);
      ☃ = 31 * ☃ + (p != 0.0F ? Float.floatToIntBits(p) : 0);
      ☃ = 31 * ☃ + (q != 0.0F ? Float.floatToIntBits(q) : 0);
      ☃ = 31 * ☃ + r;
      ☃ = 31 * ☃ + (s ? 1 : 0);
      ☃ = 31 * ☃ + (t ? 1 : 0);
      ☃ = 31 * ☃ + u;
      ☃ = 31 * ☃ + (v ? 1 : 0);
      ☃ = 31 * ☃ + (w ? 1 : 0);
      ☃ = 31 * ☃ + (x ? 1 : 0);
      ☃ = 31 * ☃ + (y ? 1 : 0);
      ☃ = 31 * ☃ + (z ? 1 : 0);
      ☃ = 31 * ☃ + (A ? 1 : 0);
      ☃ = 31 * ☃ + (B ? 1 : 0);
      ☃ = 31 * ☃ + C;
      ☃ = 31 * ☃ + (D ? 1 : 0);
      ☃ = 31 * ☃ + E;
      ☃ = 31 * ☃ + (F ? 1 : 0);
      ☃ = 31 * ☃ + G;
      ☃ = 31 * ☃ + H;
      ☃ = 31 * ☃ + I;
      ☃ = 31 * ☃ + J;
      ☃ = 31 * ☃ + K;
      ☃ = 31 * ☃ + L;
      ☃ = 31 * ☃ + M;
      ☃ = 31 * ☃ + N;
      ☃ = 31 * ☃ + O;
      ☃ = 31 * ☃ + P;
      ☃ = 31 * ☃ + Q;
      ☃ = 31 * ☃ + R;
      ☃ = 31 * ☃ + S;
      ☃ = 31 * ☃ + T;
      ☃ = 31 * ☃ + U;
      ☃ = 31 * ☃ + V;
      ☃ = 31 * ☃ + W;
      ☃ = 31 * ☃ + X;
      ☃ = 31 * ☃ + Y;
      ☃ = 31 * ☃ + Z;
      ☃ = 31 * ☃ + aa;
      ☃ = 31 * ☃ + ab;
      ☃ = 31 * ☃ + ac;
      ☃ = 31 * ☃ + ad;
      ☃ = 31 * ☃ + ae;
      ☃ = 31 * ☃ + af;
      ☃ = 31 * ☃ + ag;
      ☃ = 31 * ☃ + ah;
      ☃ = 31 * ☃ + ai;
      ☃ = 31 * ☃ + aj;
      ☃ = 31 * ☃ + ak;
      ☃ = 31 * ☃ + al;
      ☃ = 31 * ☃ + am;
      ☃ = 31 * ☃ + an;
      ☃ = 31 * ☃ + ao;
      ☃ = 31 * ☃ + ap;
      ☃ = 31 * ☃ + aq;
      ☃ = 31 * ☃ + ar;
      ☃ = 31 * ☃ + as;
      ☃ = 31 * ☃ + at;
      ☃ = 31 * ☃ + au;
      ☃ = 31 * ☃ + av;
      ☃ = 31 * ☃ + aw;
      ☃ = 31 * ☃ + ax;
      ☃ = 31 * ☃ + ay;
      ☃ = 31 * ☃ + az;
      ☃ = 31 * ☃ + aA;
      return ☃;
    }
    
    public ant b()
    {
      return new ant(this, null);
    }
  }
  
  public static class b
    implements JsonDeserializer<ant.a>, JsonSerializer<ant.a>
  {
    public ant.a a(JsonElement ☃, Type ☃, JsonDeserializationContext ☃)
      throws JsonParseException
    {
      JsonObject ☃ = ☃.getAsJsonObject();
      
      ant.a ☃ = new ant.a();
      try
      {
        b = ni.a(☃, "coordinateScale", b);
        c = ni.a(☃, "heightScale", c);
        e = ni.a(☃, "lowerLimitScale", e);
        d = ni.a(☃, "upperLimitScale", d);
        f = ni.a(☃, "depthNoiseScaleX", f);
        g = ni.a(☃, "depthNoiseScaleZ", g);
        h = ni.a(☃, "depthNoiseScaleExponent", h);
        i = ni.a(☃, "mainNoiseScaleX", i);
        j = ni.a(☃, "mainNoiseScaleY", j);
        k = ni.a(☃, "mainNoiseScaleZ", k);
        l = ni.a(☃, "baseSize", l);
        m = ni.a(☃, "stretchY", m);
        n = ni.a(☃, "biomeDepthWeight", n);
        o = ni.a(☃, "biomeDepthOffset", o);
        p = ni.a(☃, "biomeScaleWeight", p);
        q = ni.a(☃, "biomeScaleOffset", q);
        r = ni.a(☃, "seaLevel", r);
        
        s = ni.a(☃, "useCaves", s);
        t = ni.a(☃, "useDungeons", t);
        u = ni.a(☃, "dungeonChance", u);
        v = ni.a(☃, "useStrongholds", v);
        w = ni.a(☃, "useVillages", w);
        x = ni.a(☃, "useMineShafts", x);
        y = ni.a(☃, "useTemples", y);
        z = ni.a(☃, "useMonuments", z);
        A = ni.a(☃, "useRavines", A);
        B = ni.a(☃, "useWaterLakes", B);
        C = ni.a(☃, "waterLakeChance", C);
        D = ni.a(☃, "useLavaLakes", D);
        E = ni.a(☃, "lavaLakeChance", E);
        F = ni.a(☃, "useLavaOceans", F);
        
        G = ni.a(☃, "fixedBiome", G);
        if ((G >= 38) || (G < -1)) {
          G = -1;
        } else if (G >= xaz) {
          G += 2;
        }
        H = ni.a(☃, "biomeSize", H);
        I = ni.a(☃, "riverSize", I);
        
        J = ni.a(☃, "dirtSize", J);
        K = ni.a(☃, "dirtCount", K);
        L = ni.a(☃, "dirtMinHeight", L);
        M = ni.a(☃, "dirtMaxHeight", M);
        N = ni.a(☃, "gravelSize", N);
        O = ni.a(☃, "gravelCount", O);
        P = ni.a(☃, "gravelMinHeight", P);
        Q = ni.a(☃, "gravelMaxHeight", Q);
        R = ni.a(☃, "graniteSize", R);
        S = ni.a(☃, "graniteCount", S);
        T = ni.a(☃, "graniteMinHeight", T);
        U = ni.a(☃, "graniteMaxHeight", U);
        V = ni.a(☃, "dioriteSize", V);
        W = ni.a(☃, "dioriteCount", W);
        X = ni.a(☃, "dioriteMinHeight", X);
        Y = ni.a(☃, "dioriteMaxHeight", Y);
        Z = ni.a(☃, "andesiteSize", Z);
        aa = ni.a(☃, "andesiteCount", aa);
        ab = ni.a(☃, "andesiteMinHeight", ab);
        ac = ni.a(☃, "andesiteMaxHeight", ac);
        ad = ni.a(☃, "coalSize", ad);
        ae = ni.a(☃, "coalCount", ae);
        af = ni.a(☃, "coalMinHeight", af);
        ag = ni.a(☃, "coalMaxHeight", ag);
        ah = ni.a(☃, "ironSize", ah);
        ai = ni.a(☃, "ironCount", ai);
        aj = ni.a(☃, "ironMinHeight", aj);
        ak = ni.a(☃, "ironMaxHeight", ak);
        al = ni.a(☃, "goldSize", al);
        am = ni.a(☃, "goldCount", am);
        an = ni.a(☃, "goldMinHeight", an);
        ao = ni.a(☃, "goldMaxHeight", ao);
        ap = ni.a(☃, "redstoneSize", ap);
        aq = ni.a(☃, "redstoneCount", aq);
        ar = ni.a(☃, "redstoneMinHeight", ar);
        as = ni.a(☃, "redstoneMaxHeight", as);
        at = ni.a(☃, "diamondSize", at);
        au = ni.a(☃, "diamondCount", au);
        av = ni.a(☃, "diamondMinHeight", av);
        aw = ni.a(☃, "diamondMaxHeight", aw);
        ax = ni.a(☃, "lapisSize", ax);
        ay = ni.a(☃, "lapisCount", ay);
        az = ni.a(☃, "lapisCenterHeight", az);
        aA = ni.a(☃, "lapisSpread", aA);
      }
      catch (Exception localException) {}
      return ☃;
    }
    
    public JsonElement a(ant.a ☃, Type ☃, JsonSerializationContext ☃)
    {
      JsonObject ☃ = new JsonObject();
      
      ☃.addProperty("coordinateScale", Float.valueOf(b));
      ☃.addProperty("heightScale", Float.valueOf(c));
      ☃.addProperty("lowerLimitScale", Float.valueOf(e));
      ☃.addProperty("upperLimitScale", Float.valueOf(d));
      ☃.addProperty("depthNoiseScaleX", Float.valueOf(f));
      ☃.addProperty("depthNoiseScaleZ", Float.valueOf(g));
      ☃.addProperty("depthNoiseScaleExponent", Float.valueOf(h));
      ☃.addProperty("mainNoiseScaleX", Float.valueOf(i));
      ☃.addProperty("mainNoiseScaleY", Float.valueOf(j));
      ☃.addProperty("mainNoiseScaleZ", Float.valueOf(k));
      ☃.addProperty("baseSize", Float.valueOf(l));
      ☃.addProperty("stretchY", Float.valueOf(m));
      ☃.addProperty("biomeDepthWeight", Float.valueOf(n));
      ☃.addProperty("biomeDepthOffset", Float.valueOf(o));
      ☃.addProperty("biomeScaleWeight", Float.valueOf(p));
      ☃.addProperty("biomeScaleOffset", Float.valueOf(q));
      ☃.addProperty("seaLevel", Integer.valueOf(r));
      
      ☃.addProperty("useCaves", Boolean.valueOf(s));
      ☃.addProperty("useDungeons", Boolean.valueOf(t));
      ☃.addProperty("dungeonChance", Integer.valueOf(u));
      ☃.addProperty("useStrongholds", Boolean.valueOf(v));
      ☃.addProperty("useVillages", Boolean.valueOf(w));
      ☃.addProperty("useMineShafts", Boolean.valueOf(x));
      ☃.addProperty("useTemples", Boolean.valueOf(y));
      ☃.addProperty("useMonuments", Boolean.valueOf(z));
      ☃.addProperty("useRavines", Boolean.valueOf(A));
      ☃.addProperty("useWaterLakes", Boolean.valueOf(B));
      ☃.addProperty("waterLakeChance", Integer.valueOf(C));
      ☃.addProperty("useLavaLakes", Boolean.valueOf(D));
      ☃.addProperty("lavaLakeChance", Integer.valueOf(E));
      ☃.addProperty("useLavaOceans", Boolean.valueOf(F));
      
      ☃.addProperty("fixedBiome", Integer.valueOf(G));
      ☃.addProperty("biomeSize", Integer.valueOf(H));
      ☃.addProperty("riverSize", Integer.valueOf(I));
      
      ☃.addProperty("dirtSize", Integer.valueOf(J));
      ☃.addProperty("dirtCount", Integer.valueOf(K));
      ☃.addProperty("dirtMinHeight", Integer.valueOf(L));
      ☃.addProperty("dirtMaxHeight", Integer.valueOf(M));
      ☃.addProperty("gravelSize", Integer.valueOf(N));
      ☃.addProperty("gravelCount", Integer.valueOf(O));
      ☃.addProperty("gravelMinHeight", Integer.valueOf(P));
      ☃.addProperty("gravelMaxHeight", Integer.valueOf(Q));
      ☃.addProperty("graniteSize", Integer.valueOf(R));
      ☃.addProperty("graniteCount", Integer.valueOf(S));
      ☃.addProperty("graniteMinHeight", Integer.valueOf(T));
      ☃.addProperty("graniteMaxHeight", Integer.valueOf(U));
      ☃.addProperty("dioriteSize", Integer.valueOf(V));
      ☃.addProperty("dioriteCount", Integer.valueOf(W));
      ☃.addProperty("dioriteMinHeight", Integer.valueOf(X));
      ☃.addProperty("dioriteMaxHeight", Integer.valueOf(Y));
      ☃.addProperty("andesiteSize", Integer.valueOf(Z));
      ☃.addProperty("andesiteCount", Integer.valueOf(aa));
      ☃.addProperty("andesiteMinHeight", Integer.valueOf(ab));
      ☃.addProperty("andesiteMaxHeight", Integer.valueOf(ac));
      ☃.addProperty("coalSize", Integer.valueOf(ad));
      ☃.addProperty("coalCount", Integer.valueOf(ae));
      ☃.addProperty("coalMinHeight", Integer.valueOf(af));
      ☃.addProperty("coalMaxHeight", Integer.valueOf(ag));
      ☃.addProperty("ironSize", Integer.valueOf(ah));
      ☃.addProperty("ironCount", Integer.valueOf(ai));
      ☃.addProperty("ironMinHeight", Integer.valueOf(aj));
      ☃.addProperty("ironMaxHeight", Integer.valueOf(ak));
      ☃.addProperty("goldSize", Integer.valueOf(al));
      ☃.addProperty("goldCount", Integer.valueOf(am));
      ☃.addProperty("goldMinHeight", Integer.valueOf(an));
      ☃.addProperty("goldMaxHeight", Integer.valueOf(ao));
      ☃.addProperty("redstoneSize", Integer.valueOf(ap));
      ☃.addProperty("redstoneCount", Integer.valueOf(aq));
      ☃.addProperty("redstoneMinHeight", Integer.valueOf(ar));
      ☃.addProperty("redstoneMaxHeight", Integer.valueOf(as));
      ☃.addProperty("diamondSize", Integer.valueOf(at));
      ☃.addProperty("diamondCount", Integer.valueOf(au));
      ☃.addProperty("diamondMinHeight", Integer.valueOf(av));
      ☃.addProperty("diamondMaxHeight", Integer.valueOf(aw));
      ☃.addProperty("lapisSize", Integer.valueOf(ax));
      ☃.addProperty("lapisCount", Integer.valueOf(ay));
      ☃.addProperty("lapisCenterHeight", Integer.valueOf(az));
      ☃.addProperty("lapisSpread", Integer.valueOf(aA));
      
      return ☃;
    }
  }
}
