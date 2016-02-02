import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;
import com.google.common.collect.Maps;
import com.mojang.authlib.GameProfile;
import com.mojang.authlib.minecraft.InsecureTextureException;
import com.mojang.authlib.minecraft.MinecraftProfileTexture;
import com.mojang.authlib.minecraft.MinecraftProfileTexture.Type;
import com.mojang.authlib.minecraft.MinecraftSessionService;
import com.mojang.authlib.properties.PropertyMap;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class bnp
{
  private static final ExecutorService a = new ThreadPoolExecutor(0, 2, 1L, TimeUnit.MINUTES, new LinkedBlockingQueue());
  private final bmj b;
  private final File c;
  private final MinecraftSessionService d;
  private final LoadingCache<GameProfile, Map<MinecraftProfileTexture.Type, MinecraftProfileTexture>> e;
  
  public bnp(bmj ☃, File ☃, MinecraftSessionService ☃)
  {
    this.b = ☃;
    this.c = ☃;
    this.d = ☃;
    
    this.e = CacheBuilder.newBuilder().expireAfterAccess(15L, TimeUnit.SECONDS).build(new CacheLoader()
    {
      public Map<MinecraftProfileTexture.Type, MinecraftProfileTexture> a(GameProfile ☃)
        throws Exception
      {
        return ave.A().aa().getTextures(☃, false);
      }
    });
  }
  
  public jy a(MinecraftProfileTexture ☃, MinecraftProfileTexture.Type ☃)
  {
    return a(☃, ☃, null);
  }
  
  public jy a(final MinecraftProfileTexture ☃, final MinecraftProfileTexture.Type ☃, final bnp.a ☃)
  {
    final jy ☃ = new jy("skins/" + ☃.getHash());
    bmk ☃ = this.b.b(☃);
    if (☃ != null)
    {
      if (☃ != null) {
        ☃.a(☃, ☃, ☃);
      }
    }
    else
    {
      File ☃ = new File(this.c, ☃.getHash().length() > 2 ? ☃.getHash().substring(0, 2) : "xx");
      File ☃ = new File(☃, ☃.getHash());
      final bfm ☃ = ☃ == MinecraftProfileTexture.Type.SKIN ? new bfs() : null;
      bma ☃ = new bma(☃, ☃.getUrl(), bmz.a(), new bfm()
      {
        public BufferedImage a(BufferedImage ☃)
        {
          if (☃ != null) {
            ☃ = ☃.a(☃);
          }
          return ☃;
        }
        
        public void a()
        {
          if (☃ != null) {
            ☃.a();
          }
          if (☃ != null) {
            ☃.a(☃, ☃, ☃);
          }
        }
      });
      this.b.a(☃, ☃);
    }
    return ☃;
  }
  
  public void a(final GameProfile ☃, final bnp.a ☃, final boolean ☃)
  {
    a.submit(new Runnable()
    {
      public void run()
      {
        final Map<MinecraftProfileTexture.Type, MinecraftProfileTexture> ☃ = Maps.newHashMap();
        try
        {
          ☃.putAll(bnp.a(bnp.this).getTextures(☃, ☃));
        }
        catch (InsecureTextureException localInsecureTextureException) {}
        if ((☃.isEmpty()) && (☃.getId().equals(ave.A().L().e().getId())))
        {
          ☃.getProperties().clear();
          ☃.getProperties().putAll(ave.A().N());
          ☃.putAll(bnp.a(bnp.this).getTextures(☃, false));
        }
        ave.A().a(new Runnable()
        {
          public void run()
          {
            if (☃.containsKey(MinecraftProfileTexture.Type.SKIN)) {
              bnp.this.a((MinecraftProfileTexture)☃.get(MinecraftProfileTexture.Type.SKIN), MinecraftProfileTexture.Type.SKIN, bnp.3.this.c);
            }
            if (☃.containsKey(MinecraftProfileTexture.Type.CAPE)) {
              bnp.this.a((MinecraftProfileTexture)☃.get(MinecraftProfileTexture.Type.CAPE), MinecraftProfileTexture.Type.CAPE, bnp.3.this.c);
            }
          }
        });
      }
    });
  }
  
  public Map<MinecraftProfileTexture.Type, MinecraftProfileTexture> a(GameProfile ☃)
  {
    return (Map)this.e.getUnchecked(☃);
  }
  
  public static abstract interface a
  {
    public abstract void a(MinecraftProfileTexture.Type paramType, jy paramjy, MinecraftProfileTexture paramMinecraftProfileTexture);
  }
}
