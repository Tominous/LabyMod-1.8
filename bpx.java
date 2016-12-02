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
  private final Map<bpj, String> i = ((BiMap)h).inverse();
  private Map<bpj, bpw> j = Maps.newHashMap();
  private final Multimap<bpg, String> k = HashMultimap.create();
  private final List<bpk> l = Lists.newArrayList();
  private final Map<bpj, Integer> m = Maps.newHashMap();
  private final Map<String, Integer> n = Maps.newHashMap();
  
  public bpx(bpz ☃, avh ☃)
  {
    c = ☃;
    d = ☃;
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
    if (f) {
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
      
      d.a(bpg.a, 0.0F);
      d.b();
    }
  }
  
  private float a(bpg ☃)
  {
    if ((☃ == null) || (☃ == bpg.a)) {
      return 1.0F;
    }
    return d.a(☃);
  }
  
  public void a(bpg ☃, float ☃)
  {
    if (!f) {
      return;
    }
    if (☃ == bpg.a)
    {
      e.setMasterVolume(☃);
      return;
    }
    for (String ☃ : k.get(☃))
    {
      bpj ☃ = (bpj)h.get(☃);
      float ☃ = a(☃, (bpw)j.get(☃), ☃);
      if (☃ <= 0.0F) {
        b(☃);
      } else {
        e.setVolume(☃, ☃);
      }
    }
  }
  
  public void b()
  {
    if (f)
    {
      c();
      
      e.cleanup();
      f = false;
    }
  }
  
  public void c()
  {
    if (f)
    {
      for (String ☃ : h.keySet()) {
        e.stop(☃);
      }
      h.clear();
      m.clear();
      l.clear();
      k.clear();
      j.clear();
      n.clear();
    }
  }
  
  public void d()
  {
    g += 1;
    for (bpk ☃ : l)
    {
      ☃.c();
      if (☃.k())
      {
        b(☃);
      }
      else
      {
        String ☃ = (String)i.get(☃);
        
        e.setVolume(☃, a(☃, (bpw)j.get(☃), c.a(☃.a()).d()));
        e.setPitch(☃, a(☃, (bpw)j.get(☃)));
        e.setPosition(☃, ☃.g(), ☃.h(), ☃.i());
      }
    }
    Iterator<Map.Entry<String, bpj>> ☃ = h.entrySet().iterator();
    while (☃.hasNext())
    {
      Map.Entry<String, bpj> ☃ = (Map.Entry)☃.next();
      
      String ☃ = (String)☃.getKey();
      bpj ☃ = (bpj)☃.getValue();
      if (!e.playing(☃))
      {
        int ☃ = ((Integer)n.get(☃)).intValue();
        if (☃ <= g)
        {
          int ☃ = ☃.d();
          if ((☃.b()) && (☃ > 0)) {
            m.put(☃, Integer.valueOf(g + ☃));
          }
          ☃.remove();
          b.debug(a, "Removed channel {} because it's not playing anymore", new Object[] { ☃ });
          e.removeSource(☃);
          n.remove(☃);
          
          j.remove(☃);
          try
          {
            k.remove(c.a(☃.a()).d(), ☃);
          }
          catch (RuntimeException localRuntimeException) {}
          if ((☃ instanceof bpk)) {
            l.remove(☃);
          }
        }
      }
    }
    Iterator<Map.Entry<bpj, Integer>> ☃ = m.entrySet().iterator();
    while (☃.hasNext())
    {
      Map.Entry<bpj, Integer> ☃ = (Map.Entry)☃.next();
      if (g >= ((Integer)☃.getValue()).intValue())
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
    if (!f) {
      return false;
    }
    String ☃ = (String)i.get(☃);
    if (☃ == null) {
      return false;
    }
    return (e.playing(☃)) || ((n.containsKey(☃)) && (((Integer)n.get(☃)).intValue() <= g));
  }
  
  public void b(bpj ☃)
  {
    if (!f) {
      return;
    }
    String ☃ = (String)i.get(☃);
    if (☃ != null) {
      e.stop(☃);
    }
  }
  
  public void c(bpj ☃)
  {
    if (!f) {
      return;
    }
    if (e.getMasterVolume() <= 0.0F)
    {
      b.debug(a, "Skipped playing soundEvent: {}, master volume was zero", new Object[] { ☃.a() });
      return;
    }
    bpy ☃ = c.a(☃.a());
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
      e.newStreamingSource(false, ☃, a(☃), ☃.toString(), ☃, ☃.g(), ☃.h(), ☃.i(), ☃.j().a(), ☃);
    } else {
      e.newSource(false, ☃, a(☃), ☃.toString(), ☃, ☃.g(), ☃.h(), ☃.i(), ☃.j().a(), ☃);
    }
    b.debug(a, "Playing sound {} for event {} as channel {}", new Object[] { ☃.a(), ☃.c(), ☃ });
    
    e.setPitch(☃, (float)☃);
    e.setVolume(☃, ☃);
    e.play(☃);
    
    n.put(☃, Integer.valueOf(g + 20));
    h.put(☃, ☃);
    j.put(☃, ☃);
    if (☃ != bpg.a) {
      k.put(☃, ☃);
    }
    if ((☃ instanceof bpk)) {
      l.add((bpk)☃);
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
    for (String ☃ : h.keySet())
    {
      b.debug(a, "Pausing channel {}", new Object[] { ☃ });
      e.pause(☃);
    }
  }
  
  public void f()
  {
    for (String ☃ : h.keySet())
    {
      b.debug(a, "Resuming channel {}", new Object[] { ☃ });
      e.play(☃);
    }
  }
  
  public void a(bpj ☃, int ☃)
  {
    m.put(☃, Integer.valueOf(g + ☃));
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
            return ave.A().Q().a(a).b();
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
    if ((!f) || (☃ == null)) {
      return;
    }
    float ☃ = B + (z - B) * ☃;
    float ☃ = A + (y - A) * ☃;
    
    double ☃ = p + (s - p) * ☃;
    double ☃ = q + (t - q) * ☃ + ☃.aS();
    double ☃ = r + (u - r) * ☃;
    
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
    
    e.setListenerPosition((float)☃, (float)☃, (float)☃);
    e.setListenerOrientation(☃, ☃, ☃, ☃, ☃, ☃);
  }
  
  class a
    extends SoundSystem
  {
    private a() {}
    
    public boolean playing(String ☃)
    {
      synchronized (SoundSystemConfig.THREAD_SYNC)
      {
        if (soundLibrary == null) {
          return false;
        }
        Source ☃ = (Source)soundLibrary.getSources().get(☃);
        if (☃ == null) {
          return false;
        }
        return (☃.playing()) || (☃.paused()) || (preLoad);
      }
    }
  }
}
