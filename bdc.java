import com.google.common.base.Objects;
import com.mojang.authlib.GameProfile;
import com.mojang.authlib.minecraft.MinecraftProfileTexture;
import com.mojang.authlib.minecraft.MinecraftProfileTexture.Type;
import de.labystudio.capes.CapeManager;
import de.labystudio.labymod.LabyMod;
import java.util.HashMap;

public class bdc
{
  private final GameProfile a;
  private adp.a b;
  private int c;
  private boolean d = false;
  private jy e;
  private jy f;
  private String g;
  private eu h;
  
  public void setLocationCape(jy locationCape)
  {
    this.f = locationCape;
  }
  
  private int i = 0;
  private int j = 0;
  private long k = 0L;
  private long l = 0L;
  private long m = 0L;
  
  public bdc(GameProfile p_i46294_1_)
  {
    this.a = p_i46294_1_;
  }
  
  public bdc(gz.b p_i46295_1_)
  {
    this.a = p_i46295_1_.a();
    this.b = p_i46295_1_.c();
    this.c = p_i46295_1_.b();
    this.h = p_i46295_1_.d();
  }
  
  public GameProfile a()
  {
    return this.a;
  }
  
  public adp.a b()
  {
    return this.b;
  }
  
  public int c()
  {
    return this.c;
  }
  
  protected void a(adp.a p_178839_1_)
  {
    this.b = p_178839_1_;
  }
  
  protected void a(int p_178838_1_)
  {
    this.c = p_178838_1_;
  }
  
  public boolean e()
  {
    return this.e != null;
  }
  
  public String f()
  {
    return this.g == null ? bmz.b(this.a.getId()) : this.g;
  }
  
  public jy g()
  {
    if (this.e == null) {
      j();
    }
    return (jy)Objects.firstNonNull(this.e, bmz.a(this.a.getId()));
  }
  
  public jy h()
  {
    if ((this.a != null) && 
      (LabyMod.getInstance().getCapeManager().getLocationCape().containsKey(this.a.getId()))) {
      this.f = ((jy)LabyMod.getInstance().getCapeManager().getLocationCape().get(this.a.getId()));
    }
    if (this.f == null) {
      j();
    }
    return this.f;
  }
  
  public aul i()
  {
    return ave.A().f.Z().h(a().getName());
  }
  
  protected void j()
  {
    synchronized (this)
    {
      if (!this.d)
      {
        this.d = true;
        ave.A().ab().a(this.a, new bnp.a()
        {
          public void a(MinecraftProfileTexture.Type p_180521_1_, jy location, MinecraftProfileTexture profileTexture)
          {
            switch (bdc.2.$SwitchMap$com$mojang$authlib$minecraft$MinecraftProfileTexture$Type[p_180521_1_.ordinal()])
            {
            case 1: 
              bdc.a(bdc.this, location);
              bdc.a(bdc.this, profileTexture.getMetadata("model"));
              if (bdc.a(bdc.this) == null) {
                bdc.a(bdc.this, "default");
              }
              break;
            case 2: 
              bdc.b(bdc.this, location);
            }
          }
        }, true);
      }
    }
  }
  
  public void a(eu displayNameIn)
  {
    this.h = displayNameIn;
  }
  
  public eu k()
  {
    return this.h;
  }
  
  public int l()
  {
    return this.i;
  }
  
  public void b(int p_178836_1_)
  {
    this.i = p_178836_1_;
  }
  
  public int m()
  {
    return this.j;
  }
  
  public void c(int p_178857_1_)
  {
    this.j = p_178857_1_;
  }
  
  public long n()
  {
    return this.k;
  }
  
  public void a(long p_178846_1_)
  {
    this.k = p_178846_1_;
  }
  
  public long o()
  {
    return this.l;
  }
  
  public void b(long p_178844_1_)
  {
    this.l = p_178844_1_;
  }
  
  public long p()
  {
    return this.m;
  }
  
  public void c(long p_178843_1_)
  {
    this.m = p_178843_1_;
  }
}
