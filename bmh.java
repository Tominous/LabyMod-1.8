import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.Callable;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class bmh
  extends bly
  implements bmn
{
  private static final Logger h = ;
  public static final jy f = new jy("missingno");
  public static final jy g = new jy("textures/atlas/blocks.png");
  private final List<bmi> i;
  private final Map<String, bmi> j;
  private final Map<String, bmi> k;
  private final String l;
  private final bmb m;
  private int n;
  private final bmi o;
  
  public bmh(String p_i46099_1_)
  {
    this(p_i46099_1_, (bmb)null);
  }
  
  public bmh(String p_i46100_1_, bmb iconCreatorIn)
  {
    this.i = Lists.newArrayList();
    this.j = Maps.newHashMap();
    this.k = Maps.newHashMap();
    this.o = new bmi("missingno");
    this.l = p_i46100_1_;
    this.m = iconCreatorIn;
  }
  
  private void g()
  {
    int[] aint = bml.b;
    this.o.b(16);
    this.o.c(16);
    int[][] aint1 = new int[this.n + 1][];
    aint1[0] = aint;
    this.o.a(Lists.newArrayList(new int[][][] { aint1 }));
  }
  
  public void a(bni resourceManager)
    throws IOException
  {
    if (this.m != null) {
      a(resourceManager, this.m);
    }
  }
  
  public void a(bni resourceManager, bmb p_174943_2_)
  {
    this.j.clear();
    p_174943_2_.a(this);
    g();
    c();
    b(resourceManager);
  }
  
  public void b(bni resourceManager)
  {
    int i = ave.C();
    bmf stitcher = new bmf(i, i, true, 0, this.n);
    this.k.clear();
    this.i.clear();
    int j = Integer.MAX_VALUE;
    int k = 1 << this.n;
    for (Map.Entry<String, bmi> entry : this.j.entrySet())
    {
      textureatlassprite = (bmi)entry.getValue();
      jy resourcelocation = new jy(textureatlassprite.i());
      jy resourcelocation1 = a(resourcelocation, 0);
      try
      {
        bnh iresource = resourceManager.a(resourcelocation1);
        BufferedImage[] abufferedimage = new BufferedImage[1 + this.n];
        abufferedimage[0] = bml.a(iresource.b());
        bon texturemetadatasection = (bon)iresource.a("texture");
        if (texturemetadatasection != null)
        {
          List<Integer> list = texturemetadatasection.c();
          if (!list.isEmpty())
          {
            int l = abufferedimage[0].getWidth();
            int i1 = abufferedimage[0].getHeight();
            if ((ns.b(l) != l) || (ns.b(i1) != i1)) {
              throw new RuntimeException("Unable to load extra miplevels, source-texture is not power of two");
            }
          }
          Iterator iterator = list.iterator();
          while (iterator.hasNext())
          {
            int i2 = ((Integer)iterator.next()).intValue();
            if ((i2 > 0) && (i2 < abufferedimage.length - 1) && (abufferedimage[i2] == null))
            {
              jy resourcelocation2 = a(resourcelocation, i2);
              try
              {
                abufferedimage[i2] = bml.a(resourceManager.a(resourcelocation2).b());
              }
              catch (IOException ioexception)
              {
                h.error("Unable to load miplevel {} from: {}", new Object[] { Integer.valueOf(i2), resourcelocation2, ioexception });
              }
            }
          }
        }
        boa animationmetadatasection = (boa)iresource.a("animation");
        textureatlassprite.a(abufferedimage, animationmetadatasection);
      }
      catch (RuntimeException runtimeexception)
      {
        h.error("Unable to parse metadata from " + resourcelocation1, runtimeexception);
        continue;
      }
      catch (IOException ioexception1)
      {
        h.error("Using missing texture, unable to load " + resourcelocation1, ioexception1);
      }
      continue;
      
      j = Math.min(j, Math.min(textureatlassprite.c(), textureatlassprite.d()));
      int l1 = Math.min(Integer.lowestOneBit(textureatlassprite.c()), Integer.lowestOneBit(textureatlassprite.d()));
      if (l1 < k)
      {
        h.warn("Texture {} with size {}x{} limits mip level from {} to {}", new Object[] { resourcelocation1, Integer.valueOf(textureatlassprite.c()), Integer.valueOf(textureatlassprite.d()), Integer.valueOf(ns.c(k)), Integer.valueOf(ns.c(l1)) });
        k = l1;
      }
      stitcher.a(textureatlassprite);
    }
    int j1 = Math.min(j, k);
    int k1 = ns.c(j1);
    if (k1 < this.n)
    {
      h.warn("{}: dropping miplevel from {} to {}, because of minimum power of two: {}", new Object[] { this.l, Integer.valueOf(this.n), Integer.valueOf(k1), Integer.valueOf(j1) });
      this.n = k1;
    }
    for (bmi textureatlassprite = this.j.values().iterator(); textureatlassprite.hasNext();)
    {
      textureatlassprite1 = (bmi)textureatlassprite.next();
      try
      {
        textureatlassprite1.d(this.n);
      }
      catch (Throwable throwable1)
      {
        b crashreport = b.a(throwable1, "Applying mipmap");
        c crashreportcategory = crashreport.a("Sprite being mipmapped");
        crashreportcategory.a("Sprite name", new Callable()
        {
          public String a()
            throws Exception
          {
            return textureatlassprite1.i();
          }
        });
        crashreportcategory.a("Sprite size", new Callable()
        {
          public String a()
            throws Exception
          {
            return textureatlassprite1.c() + " x " + textureatlassprite1.d();
          }
        });
        crashreportcategory.a("Sprite frames", new Callable()
        {
          public String a()
            throws Exception
          {
            return textureatlassprite1.k() + " frames";
          }
        });
        crashreportcategory.a("Mipmap levels", Integer.valueOf(this.n));
        throw new e(crashreport);
      }
    }
    final bmi textureatlassprite1;
    this.o.d(this.n);
    stitcher.a(this.o);
    try
    {
      stitcher.c();
    }
    catch (bmg stitcherexception)
    {
      throw stitcherexception;
    }
    h.info("Created: {}x{} {}-atlas", new Object[] { Integer.valueOf(stitcher.a()), Integer.valueOf(stitcher.b()), this.l });
    bml.a(b(), this.n, stitcher.a(), stitcher.b());
    Map<String, bmi> map = Maps.newHashMap(this.j);
    for (bmi textureatlassprite2 : stitcher.d())
    {
      String s = textureatlassprite2.i();
      map.remove(s);
      this.k.put(s, textureatlassprite2);
      try
      {
        bml.a(textureatlassprite2.a(0), textureatlassprite2.c(), textureatlassprite2.d(), textureatlassprite2.a(), textureatlassprite2.b(), false, false);
      }
      catch (Throwable throwable)
      {
        b crashreport1 = b.a(throwable, "Stitching texture atlas");
        c crashreportcategory1 = crashreport1.a("Texture being stitched together");
        crashreportcategory1.a("Atlas path", this.l);
        crashreportcategory1.a("Sprite", textureatlassprite2);
        throw new e(crashreport1);
      }
      if (textureatlassprite2.m()) {
        this.i.add(textureatlassprite2);
      }
    }
    for (bmi textureatlassprite3 : map.values()) {
      textureatlassprite3.a(this.o);
    }
    com.minimap.minimap.Minimap.clearBlockColours = true;
  }
  
  private jy a(jy location, int p_147634_2_)
  {
    return p_147634_2_ == 0 ? new jy(location.b(), String.format("%s/%s%s", new Object[] { this.l, location.a(), ".png" })) : new jy(location.b(), String.format("%s/mipmaps/%s.%d%s", new Object[] { this.l, location.a(), Integer.valueOf(p_147634_2_), ".png" }));
  }
  
  public bmi a(String iconName)
  {
    bmi textureatlassprite = (bmi)this.k.get(iconName);
    if (textureatlassprite == null) {
      textureatlassprite = this.o;
    }
    return textureatlassprite;
  }
  
  public void d()
  {
    bml.b(b());
    for (bmi textureatlassprite : this.i) {
      textureatlassprite.j();
    }
  }
  
  public bmi a(jy location)
  {
    if (location == null) {
      throw new IllegalArgumentException("Location cannot be null!");
    }
    bmi textureatlassprite = (bmi)this.j.get(location);
    if (textureatlassprite == null)
    {
      textureatlassprite = bmi.a(location);
      this.j.put(location.toString(), textureatlassprite);
    }
    return textureatlassprite;
  }
  
  public void e()
  {
    d();
  }
  
  public void a(int mipmapLevelsIn)
  {
    this.n = mipmapLevelsIn;
  }
  
  public bmi f()
  {
    return this.o;
  }
}
