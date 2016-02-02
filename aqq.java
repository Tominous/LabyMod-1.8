import com.google.common.collect.Maps;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.Callable;

public abstract class aqq
  extends any
{
  private aqs d;
  protected Map e = Maps.newHashMap();
  private static final String __OBFID = "CL_00000505";
  private nq structureLongMap = new nq();
  
  public abstract String a();
  
  protected final void a(adm worldIn, final int p_180701_2_, final int p_180701_3_, int p_180701_4_, int p_180701_5_, ans p_180701_6_)
  {
    a(worldIn);
    if (!this.structureLongMap.b(adg.a(p_180701_2_, p_180701_3_)))
    {
      this.b.nextInt();
      try
      {
        if (a(p_180701_2_, p_180701_3_))
        {
          aqu var7 = b(p_180701_2_, p_180701_3_);
          this.e.put(Long.valueOf(adg.a(p_180701_2_, p_180701_3_)), var7);
          
          this.structureLongMap.a(adg.a(p_180701_2_, p_180701_3_), var7);
          
          a(p_180701_2_, p_180701_3_, var7);
        }
      }
      catch (Throwable var10)
      {
        b var8 = b.a(var10, "Exception preparing structure feature");
        c var9 = var8.a("Feature being prepared");
        var9.a("Is feature chunk", new Callable()
        {
          private static final String __OBFID = "CL_00000506";
          
          public String a()
            throws Exception
          {
            return aqq.this.a(p_180701_2_, p_180701_3_) ? "True" : "False";
          }
        });
        var9.a("Chunk location", String.format("%d,%d", new Object[] { Integer.valueOf(p_180701_2_), Integer.valueOf(p_180701_3_) }));
        var9.a("Chunk pos hash", new Callable()
        {
          private static final String __OBFID = "CL_00000507";
          
          public String a()
            throws Exception
          {
            return String.valueOf(adg.a(p_180701_2_, p_180701_3_));
          }
        });
        var9.a("Structure type", new Callable()
        {
          private static final String __OBFID = "CL_00000508";
          
          public String a()
            throws Exception
          {
            return aqq.this.getClass().getCanonicalName();
          }
        });
        throw new e(var8);
      }
    }
  }
  
  public boolean a(adm worldIn, Random p_175794_2_, adg p_175794_3_)
  {
    a(worldIn);
    int var4 = (p_175794_3_.a << 4) + 8;
    int var5 = (p_175794_3_.b << 4) + 8;
    boolean var6 = false;
    Iterator var7 = this.e.values().iterator();
    while (var7.hasNext())
    {
      aqu var8 = (aqu)var7.next();
      if ((var8.d()) && (var8.a(p_175794_3_)) && (var8.a().a(var4, var5, var4 + 15, var5 + 15)))
      {
        var8.a(worldIn, p_175794_2_, new aqe(var4, var5, var4 + 15, var5 + 15));
        var8.b(p_175794_3_);
        var6 = true;
        a(var8.e(), var8.f(), var8);
      }
    }
    return var6;
  }
  
  public boolean b(cj p_175795_1_)
  {
    a(this.c);
    return c(p_175795_1_) != null;
  }
  
  protected aqu c(cj p_175797_1_)
  {
    Iterator var2 = this.e.values().iterator();
    while (var2.hasNext())
    {
      aqu var3 = (aqu)var2.next();
      if ((var3.d()) && (var3.a().b(p_175797_1_)))
      {
        Iterator var4 = var3.b().iterator();
        while (var4.hasNext())
        {
          aqt var5 = (aqt)var4.next();
          if (var5.c().b(p_175797_1_)) {
            return var3;
          }
        }
      }
    }
    return null;
  }
  
  public boolean a(adm worldIn, cj p_175796_2_)
  {
    a(worldIn);
    Iterator var3 = this.e.values().iterator();
    aqu var4;
    do
    {
      if (!var3.hasNext()) {
        return false;
      }
      var4 = (aqu)var3.next();
    } while ((!var4.d()) || (!var4.a().b(p_175796_2_)));
    return true;
  }
  
  public cj b(adm worldIn, cj p_180706_2_)
  {
    this.c = worldIn;
    a(worldIn);
    this.b.setSeed(worldIn.J());
    long var3 = this.b.nextLong();
    long var5 = this.b.nextLong();
    long var7 = (p_180706_2_.n() >> 4) * var3;
    long var9 = (p_180706_2_.p() >> 4) * var5;
    this.b.setSeed(var7 ^ var9 ^ worldIn.J());
    a(worldIn, p_180706_2_.n() >> 4, p_180706_2_.p() >> 4, 0, 0, (ans)null);
    double var11 = Double.MAX_VALUE;
    cj var13 = null;
    Iterator var14 = this.e.values().iterator();
    while (var14.hasNext())
    {
      aqu var15 = (aqu)var14.next();
      if (var15.d())
      {
        aqt var16 = (aqt)var15.b().get(0);
        cj var17 = var16.a();
        double var18 = var17.i(p_180706_2_);
        if (var18 < var11)
        {
          var11 = var18;
          var13 = var17;
        }
      }
    }
    if (var13 != null) {
      return var13;
    }
    List var20 = z_();
    if (var20 != null)
    {
      cj var21 = null;
      Iterator var22 = var20.iterator();
      while (var22.hasNext())
      {
        cj var17 = (cj)var22.next();
        double var18 = var17.i(p_180706_2_);
        if (var18 < var11)
        {
          var11 = var18;
          var21 = var17;
        }
      }
      return var21;
    }
    return null;
  }
  
  protected List z_()
  {
    return null;
  }
  
  private void a(adm worldIn)
  {
    if (this.d == null)
    {
      if (Reflector.ForgeWorld_getPerWorldStorage.exists())
      {
        aua mapStorage = (aua)Reflector.call(worldIn, Reflector.ForgeWorld_getPerWorldStorage, new Object[0]);
        this.d = ((aqs)mapStorage.a(aqs.class, a()));
      }
      else
      {
        this.d = ((aqs)worldIn.a(aqs.class, a()));
      }
      if (this.d == null)
      {
        this.d = new aqs(a());
        if (Reflector.ForgeWorld_getPerWorldStorage.exists())
        {
          aua mapStorage = (aua)Reflector.call(worldIn, Reflector.ForgeWorld_getPerWorldStorage, new Object[0]);
          mapStorage.a(a(), this.d);
        }
        else
        {
          worldIn.a(a(), this.d);
        }
      }
      else
      {
        dn var2 = this.d.a();
        Iterator var3 = var2.c().iterator();
        while (var3.hasNext())
        {
          String var4 = (String)var3.next();
          eb var5 = var2.a(var4);
          if (var5.a() == 10)
          {
            dn var6 = (dn)var5;
            if ((var6.c("ChunkX")) && (var6.c("ChunkZ")))
            {
              int var7 = var6.f("ChunkX");
              int var8 = var6.f("ChunkZ");
              aqu var9 = aqr.a(var6, worldIn);
              if (var9 != null)
              {
                this.e.put(Long.valueOf(adg.a(var7, var8)), var9);
                
                this.structureLongMap.a(adg.a(var7, var8), var9);
              }
            }
          }
        }
      }
    }
  }
  
  private void a(int p_143026_1_, int p_143026_2_, aqu p_143026_3_)
  {
    this.d.a(p_143026_3_.a(p_143026_1_, p_143026_2_), p_143026_1_, p_143026_2_);
    this.d.c();
  }
  
  protected abstract boolean a(int paramInt1, int paramInt2);
  
  protected abstract aqu b(int paramInt1, int paramInt2);
}
