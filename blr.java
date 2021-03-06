import com.google.common.base.Charsets;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.JsonSyntaxException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Map;
import org.apache.commons.io.IOUtils;
import org.lwjgl.opengl.GL11;
import org.lwjgl.util.vector.Matrix4f;

public class blr
{
  private bfw a;
  private bni b;
  private String c;
  private final List<bls> d = Lists.newArrayList();
  private final Map<String, bfw> e = Maps.newHashMap();
  private final List<bfw> f = Lists.newArrayList();
  private Matrix4f g;
  private int h;
  private int i;
  private float j;
  private float k;
  
  public blr(bmj ☃, bni ☃, bfw ☃, jy ☃)
    throws IOException, JsonSyntaxException
  {
    this.b = ☃;
    this.a = ☃;
    this.j = 0.0F;
    this.k = 0.0F;
    this.h = ☃.c;
    this.i = ☃.d;
    this.c = ☃.toString();
    c();
    
    a(☃, ☃);
  }
  
  public void a(bmj ☃, jy ☃)
    throws IOException, JsonSyntaxException
  {
    JsonParser ☃ = new JsonParser();
    InputStream ☃ = null;
    try
    {
      bnh ☃ = this.b.a(☃);
      ☃ = ☃.b();
      JsonObject ☃ = ☃.parse(IOUtils.toString(☃, Charsets.UTF_8)).getAsJsonObject();
      int ☃;
      if (ni.d(☃, "targets"))
      {
        JsonArray ☃ = ☃.getAsJsonArray("targets");
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
            ☃.a("targets[" + ☃ + "]");
            throw ☃;
          }
          ☃++;
        }
      }
      if (ni.d(☃, "passes"))
      {
        JsonArray ☃ = ☃.getAsJsonArray("passes");
        ☃ = 0;
        for (JsonElement ☃ : ☃)
        {
          try
          {
            a(☃, ☃);
          }
          catch (Exception ☃)
          {
            kc ☃ = kc.a(☃);
            ☃.a("passes[" + ☃ + "]");
            throw ☃;
          }
          ☃++;
        }
      }
    }
    catch (Exception ☃)
    {
      int ☃;
      kc ☃ = kc.a(☃);
      ☃.b(☃.a());
      throw ☃;
    }
    finally
    {
      IOUtils.closeQuietly(☃);
    }
  }
  
  private void a(JsonElement ☃)
    throws kc
  {
    if (ni.a(☃))
    {
      a(☃.getAsString(), this.h, this.i);
    }
    else
    {
      JsonObject ☃ = ni.l(☃, "target");
      
      String ☃ = ni.h(☃, "name");
      int ☃ = ni.a(☃, "width", this.h);
      int ☃ = ni.a(☃, "height", this.i);
      if (this.e.containsKey(☃)) {
        throw new kc(☃ + " is already defined");
      }
      a(☃, ☃, ☃);
    }
  }
  
  private void a(bmj ☃, JsonElement ☃)
    throws IOException
  {
    JsonObject ☃ = ni.l(☃, "pass");
    
    String ☃ = ni.h(☃, "name");
    String ☃ = ni.h(☃, "intarget");
    String ☃ = ni.h(☃, "outtarget");
    bfw ☃ = b(☃);
    bfw ☃ = b(☃);
    if (☃ == null) {
      throw new kc("Input target '" + ☃ + "' does not exist");
    }
    if (☃ == null) {
      throw new kc("Output target '" + ☃ + "' does not exist");
    }
    bls ☃ = a(☃, ☃, ☃);
    
    JsonArray ☃ = ni.a(☃, "auxtargets", null);
    int ☃;
    if (☃ != null)
    {
      ☃ = 0;
      for (JsonElement ☃ : ☃)
      {
        try
        {
          JsonObject ☃ = ni.l(☃, "auxtarget");
          String ☃ = ni.h(☃, "name");
          String ☃ = ni.h(☃, "id");
          bfw ☃ = b(☃);
          if (☃ == null)
          {
            jy ☃ = new jy("textures/effect/" + ☃ + ".png");
            try
            {
              this.b.a(☃);
            }
            catch (FileNotFoundException ☃)
            {
              throw new kc("Render target or texture '" + ☃ + "' does not exist");
            }
            ☃.a(☃);
            bmk ☃ = ☃.b(☃);
            int ☃ = ni.m(☃, "width");
            int ☃ = ni.m(☃, "height");
            boolean ☃ = ni.i(☃, "bilinear");
            if (☃)
            {
              GL11.glTexParameteri(3553, 10241, 9729);
              GL11.glTexParameteri(3553, 10240, 9729);
            }
            else
            {
              GL11.glTexParameteri(3553, 10241, 9728);
              GL11.glTexParameteri(3553, 10240, 9728);
            }
            ☃.a(☃, Integer.valueOf(☃.b()), ☃, ☃);
          }
          else
          {
            ☃.a(☃, ☃, ☃.a, ☃.b);
          }
        }
        catch (Exception ☃)
        {
          kc ☃ = kc.a(☃);
          ☃.a("auxtargets[" + ☃ + "]");
          throw ☃;
        }
        ☃++;
      }
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
  }
  
  private void b(JsonElement ☃)
    throws kc
  {
    JsonObject ☃ = ni.l(☃, "uniform");
    String ☃ = ni.h(☃, "name");
    blv ☃ = ((bls)this.d.get(this.d.size() - 1)).c().a(☃);
    if (☃ == null) {
      throw new kc("Uniform '" + ☃ + "' does not exist");
    }
    float[] ☃ = new float[4];
    int ☃ = 0;
    JsonArray ☃ = ni.t(☃, "values");
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
    switch (☃)
    {
    case 0: 
      break;
    case 1: 
      ☃.a(☃[0]);
      break;
    case 2: 
      ☃.a(☃[0], ☃[1]);
      break;
    case 3: 
      ☃.a(☃[0], ☃[1], ☃[2]);
      break;
    case 4: 
      ☃.a(☃[0], ☃[1], ☃[2], ☃[3]);
    }
  }
  
  public bfw a(String ☃)
  {
    return (bfw)this.e.get(☃);
  }
  
  public void a(String ☃, int ☃, int ☃)
  {
    bfw ☃ = new bfw(☃, ☃, true);
    ☃.a(0.0F, 0.0F, 0.0F, 0.0F);
    this.e.put(☃, ☃);
    if ((☃ == this.h) && (☃ == this.i)) {
      this.f.add(☃);
    }
  }
  
  public void a()
  {
    for (bfw ☃ : this.e.values()) {
      ☃.a();
    }
    for (bls ☃ : this.d) {
      ☃.b();
    }
    this.d.clear();
  }
  
  public bls a(String ☃, bfw ☃, bfw ☃)
    throws IOException
  {
    bls ☃ = new bls(this.b, ☃, ☃, ☃);
    this.d.add(this.d.size(), ☃);
    return ☃;
  }
  
  private void c()
  {
    this.g = new Matrix4f();
    this.g.setIdentity();
    this.g.m00 = (2.0F / this.a.a);
    this.g.m11 = (2.0F / -this.a.b);
    this.g.m22 = -0.0020001999F;
    this.g.m33 = 1.0F;
    this.g.m03 = -1.0F;
    this.g.m13 = 1.0F;
    this.g.m23 = -1.0001999F;
  }
  
  public void a(int ☃, int ☃)
  {
    this.h = this.a.a;
    this.i = this.a.b;
    c();
    for (bls ☃ : this.d) {
      ☃.a(this.g);
    }
    for (bfw ☃ : this.f) {
      ☃.a(☃, ☃);
    }
  }
  
  public void a(float ☃)
  {
    if (☃ < this.k)
    {
      this.j += 1.0F - this.k;
      this.j += ☃;
    }
    else
    {
      this.j += ☃ - this.k;
    }
    this.k = ☃;
    while (this.j > 20.0F) {
      this.j -= 20.0F;
    }
    for (bls ☃ : this.d) {
      ☃.a(this.j / 20.0F);
    }
  }
  
  public final String b()
  {
    return this.c;
  }
  
  private bfw b(String ☃)
  {
    if (☃ == null) {
      return null;
    }
    if (☃.equals("minecraft:main")) {
      return this.a;
    }
    return (bfw)this.e.get(☃);
  }
}
