import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import java.lang.reflect.Type;

public class ant$b
  implements JsonDeserializer<ant.a>, JsonSerializer<ant.a>
{
  public ant.a a(JsonElement ☃, Type ☃, JsonDeserializationContext ☃)
    throws JsonParseException
  {
    JsonObject ☃ = ☃.getAsJsonObject();
    
    ant.a ☃ = new ant.a();
    try
    {
      ☃.b = ni.a(☃, "coordinateScale", ☃.b);
      ☃.c = ni.a(☃, "heightScale", ☃.c);
      ☃.e = ni.a(☃, "lowerLimitScale", ☃.e);
      ☃.d = ni.a(☃, "upperLimitScale", ☃.d);
      ☃.f = ni.a(☃, "depthNoiseScaleX", ☃.f);
      ☃.g = ni.a(☃, "depthNoiseScaleZ", ☃.g);
      ☃.h = ni.a(☃, "depthNoiseScaleExponent", ☃.h);
      ☃.i = ni.a(☃, "mainNoiseScaleX", ☃.i);
      ☃.j = ni.a(☃, "mainNoiseScaleY", ☃.j);
      ☃.k = ni.a(☃, "mainNoiseScaleZ", ☃.k);
      ☃.l = ni.a(☃, "baseSize", ☃.l);
      ☃.m = ni.a(☃, "stretchY", ☃.m);
      ☃.n = ni.a(☃, "biomeDepthWeight", ☃.n);
      ☃.o = ni.a(☃, "biomeDepthOffset", ☃.o);
      ☃.p = ni.a(☃, "biomeScaleWeight", ☃.p);
      ☃.q = ni.a(☃, "biomeScaleOffset", ☃.q);
      ☃.r = ni.a(☃, "seaLevel", ☃.r);
      
      ☃.s = ni.a(☃, "useCaves", ☃.s);
      ☃.t = ni.a(☃, "useDungeons", ☃.t);
      ☃.u = ni.a(☃, "dungeonChance", ☃.u);
      ☃.v = ni.a(☃, "useStrongholds", ☃.v);
      ☃.w = ni.a(☃, "useVillages", ☃.w);
      ☃.x = ni.a(☃, "useMineShafts", ☃.x);
      ☃.y = ni.a(☃, "useTemples", ☃.y);
      ☃.z = ni.a(☃, "useMonuments", ☃.z);
      ☃.A = ni.a(☃, "useRavines", ☃.A);
      ☃.B = ni.a(☃, "useWaterLakes", ☃.B);
      ☃.C = ni.a(☃, "waterLakeChance", ☃.C);
      ☃.D = ni.a(☃, "useLavaLakes", ☃.D);
      ☃.E = ni.a(☃, "lavaLakeChance", ☃.E);
      ☃.F = ni.a(☃, "useLavaOceans", ☃.F);
      
      ☃.G = ni.a(☃, "fixedBiome", ☃.G);
      if ((☃.G >= 38) || (☃.G < -1)) {
        ☃.G = -1;
      } else if (☃.G >= ady.x.az) {
        ☃.G += 2;
      }
      ☃.H = ni.a(☃, "biomeSize", ☃.H);
      ☃.I = ni.a(☃, "riverSize", ☃.I);
      
      ☃.J = ni.a(☃, "dirtSize", ☃.J);
      ☃.K = ni.a(☃, "dirtCount", ☃.K);
      ☃.L = ni.a(☃, "dirtMinHeight", ☃.L);
      ☃.M = ni.a(☃, "dirtMaxHeight", ☃.M);
      ☃.N = ni.a(☃, "gravelSize", ☃.N);
      ☃.O = ni.a(☃, "gravelCount", ☃.O);
      ☃.P = ni.a(☃, "gravelMinHeight", ☃.P);
      ☃.Q = ni.a(☃, "gravelMaxHeight", ☃.Q);
      ☃.R = ni.a(☃, "graniteSize", ☃.R);
      ☃.S = ni.a(☃, "graniteCount", ☃.S);
      ☃.T = ni.a(☃, "graniteMinHeight", ☃.T);
      ☃.U = ni.a(☃, "graniteMaxHeight", ☃.U);
      ☃.V = ni.a(☃, "dioriteSize", ☃.V);
      ☃.W = ni.a(☃, "dioriteCount", ☃.W);
      ☃.X = ni.a(☃, "dioriteMinHeight", ☃.X);
      ☃.Y = ni.a(☃, "dioriteMaxHeight", ☃.Y);
      ☃.Z = ni.a(☃, "andesiteSize", ☃.Z);
      ☃.aa = ni.a(☃, "andesiteCount", ☃.aa);
      ☃.ab = ni.a(☃, "andesiteMinHeight", ☃.ab);
      ☃.ac = ni.a(☃, "andesiteMaxHeight", ☃.ac);
      ☃.ad = ni.a(☃, "coalSize", ☃.ad);
      ☃.ae = ni.a(☃, "coalCount", ☃.ae);
      ☃.af = ni.a(☃, "coalMinHeight", ☃.af);
      ☃.ag = ni.a(☃, "coalMaxHeight", ☃.ag);
      ☃.ah = ni.a(☃, "ironSize", ☃.ah);
      ☃.ai = ni.a(☃, "ironCount", ☃.ai);
      ☃.aj = ni.a(☃, "ironMinHeight", ☃.aj);
      ☃.ak = ni.a(☃, "ironMaxHeight", ☃.ak);
      ☃.al = ni.a(☃, "goldSize", ☃.al);
      ☃.am = ni.a(☃, "goldCount", ☃.am);
      ☃.an = ni.a(☃, "goldMinHeight", ☃.an);
      ☃.ao = ni.a(☃, "goldMaxHeight", ☃.ao);
      ☃.ap = ni.a(☃, "redstoneSize", ☃.ap);
      ☃.aq = ni.a(☃, "redstoneCount", ☃.aq);
      ☃.ar = ni.a(☃, "redstoneMinHeight", ☃.ar);
      ☃.as = ni.a(☃, "redstoneMaxHeight", ☃.as);
      ☃.at = ni.a(☃, "diamondSize", ☃.at);
      ☃.au = ni.a(☃, "diamondCount", ☃.au);
      ☃.av = ni.a(☃, "diamondMinHeight", ☃.av);
      ☃.aw = ni.a(☃, "diamondMaxHeight", ☃.aw);
      ☃.ax = ni.a(☃, "lapisSize", ☃.ax);
      ☃.ay = ni.a(☃, "lapisCount", ☃.ay);
      ☃.az = ni.a(☃, "lapisCenterHeight", ☃.az);
      ☃.aA = ni.a(☃, "lapisSpread", ☃.aA);
    }
    catch (Exception localException) {}
    return ☃;
  }
  
  public JsonElement a(ant.a ☃, Type ☃, JsonSerializationContext ☃)
  {
    JsonObject ☃ = new JsonObject();
    
    ☃.addProperty("coordinateScale", Float.valueOf(☃.b));
    ☃.addProperty("heightScale", Float.valueOf(☃.c));
    ☃.addProperty("lowerLimitScale", Float.valueOf(☃.e));
    ☃.addProperty("upperLimitScale", Float.valueOf(☃.d));
    ☃.addProperty("depthNoiseScaleX", Float.valueOf(☃.f));
    ☃.addProperty("depthNoiseScaleZ", Float.valueOf(☃.g));
    ☃.addProperty("depthNoiseScaleExponent", Float.valueOf(☃.h));
    ☃.addProperty("mainNoiseScaleX", Float.valueOf(☃.i));
    ☃.addProperty("mainNoiseScaleY", Float.valueOf(☃.j));
    ☃.addProperty("mainNoiseScaleZ", Float.valueOf(☃.k));
    ☃.addProperty("baseSize", Float.valueOf(☃.l));
    ☃.addProperty("stretchY", Float.valueOf(☃.m));
    ☃.addProperty("biomeDepthWeight", Float.valueOf(☃.n));
    ☃.addProperty("biomeDepthOffset", Float.valueOf(☃.o));
    ☃.addProperty("biomeScaleWeight", Float.valueOf(☃.p));
    ☃.addProperty("biomeScaleOffset", Float.valueOf(☃.q));
    ☃.addProperty("seaLevel", Integer.valueOf(☃.r));
    
    ☃.addProperty("useCaves", Boolean.valueOf(☃.s));
    ☃.addProperty("useDungeons", Boolean.valueOf(☃.t));
    ☃.addProperty("dungeonChance", Integer.valueOf(☃.u));
    ☃.addProperty("useStrongholds", Boolean.valueOf(☃.v));
    ☃.addProperty("useVillages", Boolean.valueOf(☃.w));
    ☃.addProperty("useMineShafts", Boolean.valueOf(☃.x));
    ☃.addProperty("useTemples", Boolean.valueOf(☃.y));
    ☃.addProperty("useMonuments", Boolean.valueOf(☃.z));
    ☃.addProperty("useRavines", Boolean.valueOf(☃.A));
    ☃.addProperty("useWaterLakes", Boolean.valueOf(☃.B));
    ☃.addProperty("waterLakeChance", Integer.valueOf(☃.C));
    ☃.addProperty("useLavaLakes", Boolean.valueOf(☃.D));
    ☃.addProperty("lavaLakeChance", Integer.valueOf(☃.E));
    ☃.addProperty("useLavaOceans", Boolean.valueOf(☃.F));
    
    ☃.addProperty("fixedBiome", Integer.valueOf(☃.G));
    ☃.addProperty("biomeSize", Integer.valueOf(☃.H));
    ☃.addProperty("riverSize", Integer.valueOf(☃.I));
    
    ☃.addProperty("dirtSize", Integer.valueOf(☃.J));
    ☃.addProperty("dirtCount", Integer.valueOf(☃.K));
    ☃.addProperty("dirtMinHeight", Integer.valueOf(☃.L));
    ☃.addProperty("dirtMaxHeight", Integer.valueOf(☃.M));
    ☃.addProperty("gravelSize", Integer.valueOf(☃.N));
    ☃.addProperty("gravelCount", Integer.valueOf(☃.O));
    ☃.addProperty("gravelMinHeight", Integer.valueOf(☃.P));
    ☃.addProperty("gravelMaxHeight", Integer.valueOf(☃.Q));
    ☃.addProperty("graniteSize", Integer.valueOf(☃.R));
    ☃.addProperty("graniteCount", Integer.valueOf(☃.S));
    ☃.addProperty("graniteMinHeight", Integer.valueOf(☃.T));
    ☃.addProperty("graniteMaxHeight", Integer.valueOf(☃.U));
    ☃.addProperty("dioriteSize", Integer.valueOf(☃.V));
    ☃.addProperty("dioriteCount", Integer.valueOf(☃.W));
    ☃.addProperty("dioriteMinHeight", Integer.valueOf(☃.X));
    ☃.addProperty("dioriteMaxHeight", Integer.valueOf(☃.Y));
    ☃.addProperty("andesiteSize", Integer.valueOf(☃.Z));
    ☃.addProperty("andesiteCount", Integer.valueOf(☃.aa));
    ☃.addProperty("andesiteMinHeight", Integer.valueOf(☃.ab));
    ☃.addProperty("andesiteMaxHeight", Integer.valueOf(☃.ac));
    ☃.addProperty("coalSize", Integer.valueOf(☃.ad));
    ☃.addProperty("coalCount", Integer.valueOf(☃.ae));
    ☃.addProperty("coalMinHeight", Integer.valueOf(☃.af));
    ☃.addProperty("coalMaxHeight", Integer.valueOf(☃.ag));
    ☃.addProperty("ironSize", Integer.valueOf(☃.ah));
    ☃.addProperty("ironCount", Integer.valueOf(☃.ai));
    ☃.addProperty("ironMinHeight", Integer.valueOf(☃.aj));
    ☃.addProperty("ironMaxHeight", Integer.valueOf(☃.ak));
    ☃.addProperty("goldSize", Integer.valueOf(☃.al));
    ☃.addProperty("goldCount", Integer.valueOf(☃.am));
    ☃.addProperty("goldMinHeight", Integer.valueOf(☃.an));
    ☃.addProperty("goldMaxHeight", Integer.valueOf(☃.ao));
    ☃.addProperty("redstoneSize", Integer.valueOf(☃.ap));
    ☃.addProperty("redstoneCount", Integer.valueOf(☃.aq));
    ☃.addProperty("redstoneMinHeight", Integer.valueOf(☃.ar));
    ☃.addProperty("redstoneMaxHeight", Integer.valueOf(☃.as));
    ☃.addProperty("diamondSize", Integer.valueOf(☃.at));
    ☃.addProperty("diamondCount", Integer.valueOf(☃.au));
    ☃.addProperty("diamondMinHeight", Integer.valueOf(☃.av));
    ☃.addProperty("diamondMaxHeight", Integer.valueOf(☃.aw));
    ☃.addProperty("lapisSize", Integer.valueOf(☃.ax));
    ☃.addProperty("lapisCount", Integer.valueOf(☃.ay));
    ☃.addProperty("lapisCenterHeight", Integer.valueOf(☃.az));
    ☃.addProperty("lapisSpread", Integer.valueOf(☃.aA));
    
    return ☃;
  }
}
