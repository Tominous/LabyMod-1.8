import com.google.common.base.Objects;
import com.mojang.authlib.GameProfile;
import com.mojang.authlib.minecraft.MinecraftProfileTexture;
import com.mojang.authlib.minecraft.MinecraftProfileTexture.Type;

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
  private int i = 0;
  private int j = 0;
  private long k = 0L;
  private long l = 0L;
  private long m = 0L;
  
  public bdc(GameProfile ☃)
  {
    this.a = ☃;
  }
  
  public bdc(gz.b ☃)
  {
    this.a = ☃.a();
    this.b = ☃.c();
    this.c = ☃.b();
    this.h = ☃.d();
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
  
  protected void a(adp.a ☃)
  {
    this.b = ☃;
  }
  
  protected void a(int ☃)
  {
    this.c = ☃;
  }
  
  public boolean e()
  {
    return this.e != null;
  }
  
  public String f()
  {
    if (this.g == null) {
      return bmz.b(this.a.getId());
    }
    return this.g;
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
          public void a(MinecraftProfileTexture.Type ☃, jy ☃, MinecraftProfileTexture ☃)
          {
            switch (bdc.2.a[☃.ordinal()])
            {
            case 1: 
              bdc.a(bdc.this, ☃);
              bdc.a(bdc.this, ☃.getMetadata("model"));
              if (bdc.a(bdc.this) == null) {
                bdc.a(bdc.this, "default");
              }
              break;
            case 2: 
              bdc.b(bdc.this, ☃);
            }
          }
        }, true);
      }
    }
  }
  
  public void a(eu ☃)
  {
    this.h = ☃;
  }
  
  public eu k()
  {
    return this.h;
  }
  
  public int l()
  {
    return this.i;
  }
  
  public void b(int ☃)
  {
    this.i = ☃;
  }
  
  public int m()
  {
    return this.j;
  }
  
  public void c(int ☃)
  {
    this.j = ☃;
  }
  
  public long n()
  {
    return this.k;
  }
  
  public void a(long ☃)
  {
    this.k = ☃;
  }
  
  public long o()
  {
    return this.l;
  }
  
  public void b(long ☃)
  {
    this.l = ☃;
  }
  
  public long p()
  {
    return this.m;
  }
  
  public void c(long ☃)
  {
    this.m = ☃;
  }
}
