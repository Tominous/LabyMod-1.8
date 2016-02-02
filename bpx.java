import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;
import com.google.common.collect.HashMultimap;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Multimap;
import io.netty.util.internal.ThreadLocalRandom;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLStreamHandler;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.UUID;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.Marker;
import org.apache.logging.log4j.MarkerManager;
import paulscode.sound.Library;
import paulscode.sound.SoundSystem;
import paulscode.sound.SoundSystemConfig;
import paulscode.sound.SoundSystemException;
import paulscode.sound.SoundSystemLogger;
import paulscode.sound.Source;
import paulscode.sound.codecs.CodecJOrbis;
import paulscode.sound.libraries.LibraryLWJGLOpenAL;

public class bpx
{
  private static final Marker a = MarkerManager.getMarker("SOUNDS");
  private static final Logger b = LogManager.getLogger();
  private final bpz c;
  private final avh d;
  private bpx.a e;
  private boolean f;
  private int g = 0;
  private final Map<String, bpj> h = HashBiMap.create();
  private final Map<bpj, String> i = ((BiMap)this.h).inverse();
  private Map<bpj, bpw> j = Maps.newHashMap();
  private final Multimap<bpg, String> k = HashMultimap.create();
  private final List<bpk> l = Lists.newArrayList();
  private final Map<bpj, Integer> m = Maps.newHashMap();
  private final Map<String, Integer> n = Maps.newHashMap();
  
  public bpx(bpz ☃, avh ☃)
  {
    this.c = ☃;
    this.d = ☃;
    try
    {
      SoundSystemConfig.addLibrary(LibraryLWJGLOpenAL.class);
      SoundSystemConfig.setCodec("ogg", CodecJOrbis.class);
    }
    catch (SoundSystemException ☃)
    {
      b.error(a, "Error linking with the LibraryJavaSound plug-in", ☃);
    }
  }
  
  public void a()
  {
    b();
    i();
  }
  
  private synchronized void i()
  {
    if (this.f) {
      return;
    }
    try
    {
      new Thread(new Runnable()
      {
        public void run()
        {
          SoundSystemConfig.setLogger(new SoundSystemLogger()
          {
            public void message(String ☃, int ☃)
            {
              if (!☃.isEmpty()) {
                bpx.g().info(☃);
              }
            }
            
            public void importantMessage(String ☃, int ☃)
            {
              if (!☃.isEmpty()) {
                bpx.g().warn(☃);
              }
            }
            
            public void errorMessage(String ☃, String ☃, int ☃)
            {
              if (!☃.isEmpty())
              {
                bpx.g().error("Error in class '" + ☃ + "'");
                bpx.g().error(☃);
              }
            }
          });
          bpx.a(bpx.this, new bpx.a(bpx.this, null));
          bpx.a(bpx.this, true);
          bpx.b(bpx.this).setMasterVolume(bpx.a(bpx.this).a(bpg.a));
          bpx.g().info(bpx.h(), "Sound engine started");
        }
      }, "Sound Library Loader").start();
    }
    catch (RuntimeException ☃)
    {
      b.error(a, "Error starting SoundSystem. Turning off sounds & music", ☃);
      
      this.d.a(bpg.a, 0.0F);
      this.d.b();
    }
  }
  
  private float a(bpg ☃)
  {
    if ((☃ == null) || (☃ == bpg.a)) {
      return 1.0F;
    }
    return this.d.a(☃);
  }
  
  public void a(bpg ☃, float ☃)
  {
    if (!this.f) {
      return;
    }
    if (☃ == bpg.a)
    {
      this.e.setMasterVolume(☃);
      return;
    }
    for (String ☃ : this.k.get(☃))
    {
      bpj ☃ = (bpj)this.h.get(☃);
      float ☃ = a(☃, (bpw)this.j.get(☃), ☃);
      if (☃ <= 0.0F) {
        b(☃);
      } else {
        this.e.setVolume(☃, ☃);
      }
    }
  }
  
  public void b()
  {
    if (this.f)
    {
      c();
      
      this.e.cleanup();
      this.f = false;
    }
  }
  
  public void c()
  {
    if (this.f)
    {
      for (String ☃ : this.h.keySet()) {
        this.e.stop(☃);
      }
      this.h.clear();
      this.m.clear();
      this.l.clear();
      this.k.clear();
      this.j.clear();
      this.n.clear();
    }
  }
  
  public void d()
  {
    this.g += 1;
    for (bpk ☃ : this.l)
    {
      ☃.c();
      if (☃.k())
      {
        b(☃);
      }
      else
      {
        String ☃ = (String)this.i.get(☃);
        
        this.e.setVolume(☃, a(☃, (bpw)this.j.get(☃), this.c.a(☃.a()).d()));
        this.e.setPitch(☃, a(☃, (bpw)this.j.get(☃)));
        this.e.setPosition(☃, ☃.g(), ☃.h(), ☃.i());
      }
    }
    Iterator<Map.Entry<String, bpj>> ☃ = this.h.entrySet().iterator();
    while (☃.hasNext())
    {
      Map.Entry<String, bpj> ☃ = (Map.Entry)☃.next();
      
      String ☃ = (String)☃.getKey();
      bpj ☃ = (bpj)☃.getValue();
      if (!this.e.playing(☃))
      {
        int ☃ = ((Integer)this.n.get(☃)).intValue();
        if (☃ <= this.g)
        {
          int ☃ = ☃.d();
          if ((☃.b()) && (☃ > 0)) {
            this.m.put(☃, Integer.valueOf(this.g + ☃));
          }
          ☃.remove();
          b.debug(a, "Removed channel {} because it's not playing anymore", new Object[] { ☃ });
          this.e.removeSource(☃);
          this.n.remove(☃);
          
          this.j.remove(☃);
          try
          {
            this.k.remove(this.c.a(☃.a()).d(), ☃);
          }
          catch (RuntimeException localRuntimeException) {}
          if ((☃ instanceof bpk)) {
            this.l.remove(☃);
          }
        }
      }
    }
    Iterator<Map.Entry<bpj, Integer>> ☃ = this.m.entrySet().iterator();
    while (☃.hasNext())
    {
      Map.Entry<bpj, Integer> ☃ = (Map.Entry)☃.next();
      if (this.g >= ((Integer)☃.getValue()).intValue())
      {
        bpj ☃ = (bpj)☃.getKey();
        if ((☃ instanceof bpk)) {
          ((bpk)☃).c();
        }
        c(☃);
        ☃.remove();
      }
    }
  }
  
  public boolean a(bpj ☃)
  {
    if (!this.f) {
      return false;
    }
    String ☃ = (String)this.i.get(☃);
    if (☃ == null) {
      return false;
    }
    return (this.e.playing(☃)) || ((this.n.containsKey(☃)) && (((Integer)this.n.get(☃)).intValue() <= this.g));
  }
  
  public void b(bpj ☃)
  {
    if (!this.f) {
      return;
    }
    String ☃ = (String)this.i.get(☃);
    if (☃ != null) {
      this.e.stop(☃);
    }
  }
  
  public void c(bpj ☃)
  {
    if (!this.f) {
      return;
    }
    if (this.e.getMasterVolume() <= 0.0F)
    {
      b.debug(a, "Skipped playing soundEvent: {}, master volume was zero", new Object[] { ☃.a() });
      return;
    }
    bpy ☃ = this.c.a(☃.a());
    if (☃ == null)
    {
      b.warn(a, "Unable to play unknown soundEvent: {}", new Object[] { ☃.a() });
      return;
    }
    bpw ☃ = ☃.b();
    if (☃ == bpz.a)
    {
      b.warn(a, "Unable to play empty soundEvent: {}", new Object[] { ☃.c() });
      return;
    }
    float ☃ = ☃.e();
    float ☃ = 16.0F;
    if (☃ > 1.0F) {
      ☃ *= ☃;
    }
    bpg ☃ = ☃.d();
    float ☃ = a(☃, ☃, ☃);
    double ☃ = a(☃, ☃);
    
    jy ☃ = ☃.a();
    if (☃ == 0.0F)
    {
      b.debug(a, "Skipped playing sound {}, volume was zero.", new Object[] { ☃ });
      return;
    }
    boolean ☃ = (☃.b()) && (☃.d() == 0);
    
    String ☃ = ns.a(ThreadLocalRandom.current()).toString();
    if (☃.d()) {
      this.e.newStreamingSource(false, ☃, a(☃), ☃.toString(), ☃, ☃.g(), ☃.h(), ☃.i(), ☃.j().a(), ☃);
    } else {
      this.e.newSource(false, ☃, a(☃), ☃.toString(), ☃, ☃.g(), ☃.h(), ☃.i(), ☃.j().a(), ☃);
    }
    b.debug(a, "Playing sound {} for event {} as channel {}", new Object[] { ☃.a(), ☃.c(), ☃ });
    
    this.e.setPitch(☃, (float)☃);
    this.e.setVolume(☃, ☃);
    this.e.play(☃);
    
    this.n.put(☃, Integer.valueOf(this.g + 20));
    this.h.put(☃, ☃);
    this.j.put(☃, ☃);
    if (☃ != bpg.a) {
      this.k.put(☃, ☃);
    }
    if ((☃ instanceof bpk)) {
      this.l.add((bpk)☃);
    }
  }
  
  private float a(bpj ☃, bpw ☃)
  {
    return (float)ns.a(☃.f() * ☃.b(), 0.5D, 2.0D);
  }
  
  private float a(bpj ☃, bpw ☃, bpg ☃)
  {
    return (float)ns.a(☃.e() * ☃.c(), 0.0D, 1.0D) * a(☃);
  }
  
  public void e()
  {
    for (String ☃ : this.h.keySet())
    {
      b.debug(a, "Pausing channel {}", new Object[] { ☃ });
      this.e.pause(☃);
    }
  }
  
  public void f()
  {
    for (String ☃ : this.h.keySet())
    {
      b.debug(a, "Resuming channel {}", new Object[] { ☃ });
      this.e.play(☃);
    }
  }
  
  public void a(bpj ☃, int ☃)
  {
    this.m.put(☃, Integer.valueOf(this.g + ☃));
  }
  
  private static URL a(jy ☃)
  {
    String ☃ = String.format("%s:%s:%s", new Object[] { "mcsounddomain", ☃.b(), ☃.a() });
    
    URLStreamHandler ☃ = new URLStreamHandler()
    {
      protected URLConnection openConnection(URL ☃)
      {
        new URLConnection(☃)
        {
          public void connect()
            throws IOException
          {}
          
          public InputStream getInputStream()
            throws IOException
          {
            return ave.A().Q().a(bpx.2.this.a).b();
          }
        };
      }
    };
    try
    {
      return new URL(null, ☃, ☃);
    }
    catch (MalformedURLException ☃)
    {
      throw new Error("TODO: Sanely handle url exception! :D");
    }
  }
  
  public void a(wn ☃, float ☃)
  {
    if ((!this.f) || (☃ == null)) {
      return;
    }
    float ☃ = ☃.B + (☃.z - ☃.B) * ☃;
    float ☃ = ☃.A + (☃.y - ☃.A) * ☃;
    
    double ☃ = ☃.p + (☃.s - ☃.p) * ☃;
    double ☃ = ☃.q + (☃.t - ☃.q) * ☃ + ☃.aS();
    double ☃ = ☃.r + (☃.u - ☃.r) * ☃;
    
    float ☃ = ns.b((☃ + 90.0F) * 0.017453292F);
    float ☃ = ns.a((☃ + 90.0F) * 0.017453292F);
    
    float ☃ = ns.b(-☃ * 0.017453292F);
    float ☃ = ns.a(-☃ * 0.017453292F);
    
    float ☃ = ns.b((-☃ + 90.0F) * 0.017453292F);
    float ☃ = ns.a((-☃ + 90.0F) * 0.017453292F);
    
    float ☃ = ☃ * ☃;
    float ☃ = ☃;
    float ☃ = ☃ * ☃;
    
    float ☃ = ☃ * ☃;
    float ☃ = ☃;
    float ☃ = ☃ * ☃;
    
    this.e.setListenerPosition((float)☃, (float)☃, (float)☃);
    this.e.setListenerOrientation(☃, ☃, ☃, ☃, ☃, ☃);
  }
  
  class a
    extends SoundSystem
  {
    private a() {}
    
    public boolean playing(String ☃)
    {
      synchronized (SoundSystemConfig.THREAD_SYNC)
      {
        if (this.soundLibrary == null) {
          return false;
        }
        Source ☃ = (Source)this.soundLibrary.getSources().get(☃);
        if (☃ == null) {
          return false;
        }
        return (☃.playing()) || (☃.paused()) || (☃.preLoad);
      }
    }
  }
}
