import com.google.common.collect.Lists;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Random;
import org.apache.commons.io.IOUtils;
import org.apache.commons.lang3.ArrayUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class bpz
  implements bnj, km
{
  private static final Logger b = ;
  private static final Gson c = new GsonBuilder().registerTypeAdapter(bph.class, new bpi()).create();
  private static final ParameterizedType d = new ParameterizedType()
  {
    public Type[] getActualTypeArguments()
    {
      return new Type[] { String.class, bph.class };
    }
    
    public Type getRawType()
    {
      return Map.class;
    }
    
    public Type getOwnerType()
    {
      return null;
    }
  };
  public static final bpw a = new bpw(new jy("meta:missing_sound"), 0.0D, 0.0D, false);
  private final bqa e = new bqa();
  private final bpx f;
  private final bni g;
  
  public bpz(bni ☃, avh ☃)
  {
    this.g = ☃;
    this.f = new bpx(this, ☃);
  }
  
  public void a(bni ☃)
  {
    this.f.a();
    
    this.e.a();
    for (String ☃ : ☃.a()) {
      try
      {
        List<bnh> ☃ = ☃.b(new jy(☃, "sounds.json"));
        for (bnh ☃ : ☃) {
          try
          {
            Map<String, bph> ☃ = a(☃.b());
            for (Map.Entry<String, bph> ☃ : ☃.entrySet()) {
              a(new jy(☃, (String)☃.getKey()), (bph)☃.getValue());
            }
          }
          catch (RuntimeException ☃)
          {
            b.warn("Invalid sounds.json", ☃);
          }
        }
      }
      catch (IOException localIOException) {}
    }
  }
  
  protected Map<String, bph> a(InputStream ☃)
  {
    try
    {
      return (Map)c.fromJson(new InputStreamReader(☃), d);
    }
    finally
    {
      IOUtils.closeQuietly(☃);
    }
  }
  
  private void a(jy ☃, bph ☃)
  {
    boolean ☃ = !this.e.d(☃);
    bpy ☃;
    if ((☃) || (☃.b()))
    {
      if (!☃) {
        b.debug("Replaced sound event location {}", new Object[] { ☃ });
      }
      bpy ☃ = new bpy(☃, 1.0D, 1.0D, ☃.c());
      this.e.a(☃);
    }
    else
    {
      ☃ = (bpy)this.e.a(☃);
    }
    for (final bph.a ☃ : ☃.a())
    {
      String ☃ = ☃.a();
      
      jy ☃ = new jy(☃);
      final String ☃ = ☃.contains(":") ? ☃.b() : ☃.b();
      bqb<bpw> ☃;
      switch (bpz.3.a[☃.e().ordinal()])
      {
      case 1: 
        jy ☃ = new jy(☃, "sounds/" + ☃.a() + ".ogg");
        
        InputStream ☃ = null;
        try
        {
          ☃ = this.g.a(☃).b();
        }
        catch (FileNotFoundException ☃)
        {
          b.warn("File {} does not exist, cannot add it to event {}", new Object[] { ☃, ☃ });
          
          IOUtils.closeQuietly(☃); continue;
        }
        catch (IOException ☃)
        {
          b.warn("Could not load sound file " + ☃ + ", cannot add it to event " + ☃, ☃);
          
          IOUtils.closeQuietly(☃); continue;
        }
        finally
        {
          IOUtils.closeQuietly(☃);
        }
        ☃ = new bqc(new bpw(☃, ☃.c(), ☃.b(), ☃.f()), ☃.d());
        break;
      case 2: 
        ☃ = new bqb()
        {
          final jy a = new jy(☃, ☃.a());
          
          public int a()
          {
            bpy ☃ = (bpy)bpz.a(bpz.this).a(this.a);
            return ☃ == null ? 0 : ☃.a();
          }
          
          public bpw b()
          {
            bpy ☃ = (bpy)bpz.a(bpz.this).a(this.a);
            return ☃ == null ? bpz.a : ☃.b();
          }
        };
        break;
      default: 
        throw new IllegalStateException("IN YOU FACE");
        
        ☃.a(☃);
      }
    }
  }
  
  public bpy a(jy ☃)
  {
    return (bpy)this.e.a(☃);
  }
  
  public void a(bpj ☃)
  {
    this.f.c(☃);
  }
  
  public void a(bpj ☃, int ☃)
  {
    this.f.a(☃, ☃);
  }
  
  public void a(wn ☃, float ☃)
  {
    this.f.a(☃, ☃);
  }
  
  public void a()
  {
    this.f.e();
  }
  
  public void b()
  {
    this.f.c();
  }
  
  public void d()
  {
    this.f.b();
  }
  
  public void c()
  {
    this.f.d();
  }
  
  public void e()
  {
    this.f.f();
  }
  
  public void a(bpg ☃, float ☃)
  {
    if ((☃ == bpg.a) && (☃ <= 0.0F)) {
      b();
    }
    this.f.a(☃, ☃);
  }
  
  public void b(bpj ☃)
  {
    this.f.b(☃);
  }
  
  public bpy a(bpg... ☃)
  {
    List<bpy> ☃ = Lists.newArrayList();
    for (jy ☃ : this.e.c())
    {
      bpy ☃ = (bpy)this.e.a(☃);
      if (ArrayUtils.contains(☃, ☃.d())) {
        ☃.add(☃);
      }
    }
    if (☃.isEmpty()) {
      return null;
    }
    return (bpy)☃.get(new Random().nextInt(☃.size()));
  }
  
  public boolean c(bpj ☃)
  {
    return this.f.a(☃);
  }
}
