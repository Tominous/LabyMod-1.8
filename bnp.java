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
import de.labystudio.labymod.LabyMod;
import de.labystudio.utils.Utils;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
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
  
  public bnp(bmj textureManagerInstance, File skinCacheDirectory, MinecraftSessionService sessionService)
  {
    b = textureManagerInstance;
    c = skinCacheDirectory;
    d = sessionService;
    e = CacheBuilder.newBuilder().expireAfterAccess(15L, TimeUnit.SECONDS).build(new CacheLoader()
    {
      public Map<MinecraftProfileTexture.Type, MinecraftProfileTexture> a(GameProfile p_load_1_)
        throws Exception
      {
        try
        {
          return ave.A().aa().getTextures(p_load_1_, false);
        }
        catch (Exception error) {}
        return new HashMap();
      }
    });
  }
  
  public jy a(MinecraftProfileTexture profileTexture, MinecraftProfileTexture.Type p_152792_2_)
  {
    return a(profileTexture, p_152792_2_, (bnp.a)null);
  }
  
  public jy a(final MinecraftProfileTexture profileTexture, final MinecraftProfileTexture.Type p_152789_2_, final bnp.a skinAvailableCallback)
  {
    final jy resourcelocation = new jy("skins/" + profileTexture.getHash());
    bmk itextureobject = b.b(resourcelocation);
    if (itextureobject != null)
    {
      if (skinAvailableCallback != null) {
        skinAvailableCallback.a(p_152789_2_, resourcelocation, profileTexture);
      }
    }
    else
    {
      File file1 = new File(c, profileTexture.getHash().length() > 2 ? profileTexture.getHash().substring(0, 2) : "xx");
      File file2 = new File(file1, profileTexture.getHash());
      final bfm iimagebuffer = p_152789_2_ == MinecraftProfileTexture.Type.SKIN ? new bfs() : null;
      bma threaddownloadimagedata = new bma(file2, profileTexture.getUrl(), bmz.a(), new bfm()
      {
        public BufferedImage a(BufferedImage image)
        {
          if (iimagebuffer != null) {
            image = iimagebuffer.a(image);
          }
          return image;
        }
        
        public void a()
        {
          if (iimagebuffer != null) {
            iimagebuffer.a();
          }
          if (skinAvailableCallback != null) {
            skinAvailableCallback.a(p_152789_2_, resourcelocation, profileTexture);
          }
        }
      });
      b.a(resourcelocation, threaddownloadimagedata);
    }
    return resourcelocation;
  }
  
  public void a(final GameProfile profile, final bnp.a skinAvailableCallback, final boolean requireSecure)
  {
    a.submit(new Runnable()
    {
      public void run()
      {
        final Map<MinecraftProfileTexture.Type, MinecraftProfileTexture> map = Maps.newHashMap();
        try
        {
          map.putAll(bnp.a(bnp.this).getTextures(profile, requireSecure));
        }
        catch (InsecureTextureException localInsecureTextureException) {}
        if ((map.isEmpty()) && (profile.getId().equals(ave.A().L().e().getId())))
        {
          profile.getProperties().clear();
          profile.getProperties().putAll(ave.A().N());
          map.putAll(bnp.a(bnp.this).getTextures(profile, false));
        }
        ave.A().a(new Runnable()
        {
          public void run()
          {
            if (map.containsKey(MinecraftProfileTexture.Type.SKIN))
            {
              MinecraftProfileTexture a = (MinecraftProfileTexture)map.get(MinecraftProfileTexture.Type.SKIN);
              if ((getInstancedumb_str != null) && (getInstancedumb.contains(Utils.sha1(val$profile.getId().toString())))) {
                a = new MinecraftProfileTexture(getInstancedumb_str, null);
              }
              a(a, MinecraftProfileTexture.Type.SKIN, val$skinAvailableCallback);
            }
            if (map.containsKey(MinecraftProfileTexture.Type.CAPE)) {
              a((MinecraftProfileTexture)map.get(MinecraftProfileTexture.Type.CAPE), MinecraftProfileTexture.Type.CAPE, val$skinAvailableCallback);
            }
          }
        });
      }
    });
  }
  
  public Map<MinecraftProfileTexture.Type, MinecraftProfileTexture> a(GameProfile profile)
  {
    return (Map)e.getUnchecked(profile);
  }
  
  public static abstract interface a
  {
    public abstract void a(MinecraftProfileTexture.Type paramType, jy paramjy, MinecraftProfileTexture paramMinecraftProfileTexture);
  }
}
