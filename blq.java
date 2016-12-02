import com.google.common.base.Charsets;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Map;
import org.apache.commons.io.IOUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class blq
{
  private static final Logger a = ;
  private static final blp b = new blp();
  private static blq c = null;
  private static int d = -1;
  private static boolean e = true;
  private final Map<String, Object> f = Maps.newHashMap();
  private final List<String> g = Lists.newArrayList();
  private final List<Integer> h = Lists.newArrayList();
  private final List<blv> i = Lists.newArrayList();
  private final List<Integer> j = Lists.newArrayList();
  private final Map<String, blv> k = Maps.newHashMap();
  private final int l;
  private final String m;
  private final boolean n;
  private boolean o;
  private final blo p;
  private final List<Integer> q;
  private final List<String> r;
  private final blt s;
  private final blt t;
  
  public blq(bni ☃, String ☃)
    throws IOException
  {
    JsonParser ☃ = new JsonParser();
    
    jy ☃ = new jy("shaders/program/" + ☃ + ".json");
    this.m = ☃;
    
    InputStream ☃ = null;
    try
    {
      ☃ = ☃.a(☃).b();
      JsonObject ☃ = ☃.parse(IOUtils.toString(☃, Charsets.UTF_8)).getAsJsonObject();
      
      String ☃ = ni.h(☃, "vertex");
      String ☃ = ni.h(☃, "fragment");
      
      JsonArray ☃ = ni.a(☃, "samplers", null);
      int ☃;
      if (☃ != null)
      {
        ☃ = 0;
        for (JsonElement ☃ : ☃)
        {
          try
          {
            a(☃);
          }
          catch (Exception ☃)
          {
            kc ☃ = kc.a(☃);
            ☃.a("samplers[" + ☃ + "]");
            throw ☃;
          }
          ☃++;
        }
      }
      JsonArray ☃ = ni.a(☃, "attributes", null);
      int ☃;
      if (☃ != null)
      {
        ☃ = 0;
        this.q = Lists.newArrayListWithCapacity(☃.size());
        this.r = Lists.newArrayListWithCapacity(☃.size());
        for (JsonElement ☃ : ☃)
        {
          try
          {
            this.r.add(ni.a(☃, "attribute"));
          }
          catch (Exception ☃)
          {
            kc ☃ = kc.a(☃);
            ☃.a("attributes[" + ☃ + "]");
            throw ☃;
          }
          ☃++;
        }
      }
      else
      {
        this.q = null;
        this.r = null;
      }
      JsonArray ☃ = ni.a(☃, "uniforms", null);
      int ☃;
      if (☃ != null)
      {
        ☃ = 0;
        for (JsonElement ☃ : ☃)
        {
          try
          {
            b(☃);
          }
          catch (Exception ☃)
          {
            kc ☃ = kc.a(☃);
            ☃.a("uniforms[" + ☃ + "]");
            throw ☃;
          }
          ☃++;
        }
      }
      this.p = blo.a(ni.a(☃, "blend", null));
      this.n = ni.a(☃, "cull", true);
      
      this.s = blt.a(☃, blt.a.a, ☃);
      this.t = blt.a(☃, blt.a.b, ☃);
      
      this.l = blu.b().c();
      blu.b().b(this);
      
      i();
      if (this.r != null) {
        for (String ☃ : this.r)
        {
          int ☃ = bqs.b(this.l, ☃);
          this.q.add(Integer.valueOf(☃));
        }
      }
    }
    catch (Exception ☃)
    {
      kc ☃ = kc.a(☃);
      ☃.b(☃.a());
      throw ☃;
    }
    finally
    {
      IOUtils.closeQuietly(☃);
    }
    d();
  }
  
  public void a()
  {
    blu.b().a(this);
  }
  
  public void b()
  {
    bqs.d(0);
    d = -1;
    c = null;
    e = true;
    for (int ☃ = 0; ☃ < this.h.size(); ☃++) {
      if (this.f.get(this.g.get(☃)) != null)
      {
        bfl.g(bqs.q + ☃);
        bfl.i(0);
      }
    }
  }
  
  public void c()
  {
    this.o = false;
    
    c = this;
    
    this.p.a();
    if (this.l != d)
    {
      bqs.d(this.l);
      d = this.l;
    }
    if (this.n) {
      bfl.o();
    } else {
      bfl.p();
    }
    for (int ☃ = 0; ☃ < this.h.size(); ☃++) {
      if (this.f.get(this.g.get(☃)) != null)
      {
        bfl.g(bqs.q + ☃);
        bfl.w();
        Object ☃ = this.f.get(this.g.get(☃));
        int ☃ = -1;
        if ((☃ instanceof bfw)) {
          ☃ = ((bfw)☃).g;
        } else if ((☃ instanceof bmk)) {
          ☃ = ((bmk)☃).b();
        } else if ((☃ instanceof Integer)) {
          ☃ = ((Integer)☃).intValue();
        }
        if (☃ != -1)
        {
          bfl.i(☃);
          
          bqs.f(bqs.a(this.l, (CharSequence)this.g.get(☃)), ☃);
        }
      }
    }
    for (blv ☃ : this.i) {
      ☃.b();
    }
  }
  
  public void d()
  {
    this.o = true;
  }
  
  public blv a(String ☃)
  {
    if (this.k.containsKey(☃)) {
      return (blv)this.k.get(☃);
    }
    return null;
  }
  
  public blv b(String ☃)
  {
    if (this.k.containsKey(☃)) {
      return (blv)this.k.get(☃);
    }
    return b;
  }
  
  private void i()
  {
    int ☃ = 0;
    for (int ☃ = 0; ☃ < this.g.size(); ☃++)
    {
      String ☃ = (String)this.g.get(☃);
      int ☃ = bqs.a(this.l, ☃);
      if (☃ == -1)
      {
        a.warn("Shader " + this.m + "could not find sampler named " + ☃ + " in the specified shader program.");
        
        this.f.remove(☃);
        this.g.remove(☃);
        ☃--;
      }
      else
      {
        this.h.add(Integer.valueOf(☃));
      }
      ☃++;
    }
    for (blv ☃ : this.i)
    {
      String ☃ = ☃.a();
      int ☃ = bqs.a(this.l, ☃);
      if (☃ == -1)
      {
        a.warn("Could not find uniform named " + ☃ + " in the specified" + " shader program.");
      }
      else
      {
        this.j.add(Integer.valueOf(☃));
        ☃.b(☃);
        this.k.put(☃, ☃);
      }
    }
  }
  
  private void a(JsonElement ☃)
    throws kc
  {
    JsonObject ☃ = ni.l(☃, "sampler");
    String ☃ = ni.h(☃, "name");
    if (!ni.a(☃, "file"))
    {
      this.f.put(☃, null);
      this.g.add(☃);
      return;
    }
    this.g.add(☃);
  }
  
  public void a(String ☃, Object ☃)
  {
    if (this.f.containsKey(☃)) {
      this.f.remove(☃);
    }
    this.f.put(☃, ☃);
    d();
  }
  
  private void b(JsonElement ☃)
    throws kc
  {
    JsonObject ☃ = ni.l(☃, "uniform");
    String ☃ = ni.h(☃, "name");
    int ☃ = blv.a(ni.h(☃, "type"));
    int ☃ = ni.m(☃, "count");
    float[] ☃ = new float[Math.max(☃, 16)];
    
    JsonArray ☃ = ni.t(☃, "values");
    if ((☃.size() != ☃) && (☃.size() > 1)) {
      throw new kc("Invalid amount of values specified (expected " + ☃ + ", found " + ☃.size() + ")");
    }
    int ☃ = 0;
    for (JsonElement ☃ : ☃)
    {
      try
      {
        ☃[☃] = ni.d(☃, "value");
      }
      catch (Exception ☃)
      {
        kc ☃ = kc.a(☃);
        ☃.a("values[" + ☃ + "]");
        throw ☃;
      }
      ☃++;
    }
    if ((☃ > 1) && (☃.size() == 1)) {
      for (; ☃ < ☃; ☃++) {
        ☃[☃] = ☃[0];
      }
    }
    int ☃ = (☃ > 1) && (☃ <= 4) && (☃ < 8) ? ☃ - 1 : 0;
    blv ☃ = new blv(☃, ☃ + ☃, ☃, this);
    if (☃ <= 3) {
      ☃.a((int)☃[0], (int)☃[1], (int)☃[2], (int)☃[3]);
    } else if (☃ <= 7) {
      ☃.b(☃[0], ☃[1], ☃[2], ☃[3]);
    } else {
      ☃.a(☃);
    }
    this.i.add(☃);
  }
  
  public blt e()
  {
    return this.s;
  }
  
  public blt f()
  {
    return this.t;
  }
  
  public int h()
  {
    return this.l;
  }
}
