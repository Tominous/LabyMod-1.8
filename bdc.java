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
    a = ☃;
  }
  
  public bdc(gz.b ☃)
  {
    a = ☃.a();
    b = ☃.c();
    c = ☃.b();
    h = ☃.d();
  }
  
  public GameProfile a()
  {
    return a;
  }
  
  public adp.a b()
  {
    return b;
  }
  
  public int c()
  {
    return c;
  }
  
  protected void a(adp.a ☃)
  {
    b = ☃;
  }
  
  protected void a(int ☃)
  {
    c = ☃;
  }
  
  public boolean e()
  {
    return e != null;
  }
  
  public String f()
  {
    if (g == null) {
      return bmz.b(a.getId());
    }
    return g;
  }
  
  public jy g()
  {
    if (e == null) {
      j();
    }
    return (jy)Objects.firstNonNull(e, bmz.a(a.getId()));
  }
  
  public jy h()
  {
    if (f == null) {
      j();
    }
    return f;
  }
  
  public aul i()
  {
    return Af.Z().h(a().getName());
  }
  
  protected void j()
  {
    synchronized (this)
    {
      if (!d)
      {
        d = true;
        ave.A().ab().a(a, new bnp.a()
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
    h = ☃;
  }
  
  public eu k()
  {
    return h;
  }
  
  public int l()
  {
    return i;
  }
  
  public void b(int ☃)
  {
    i = ☃;
  }
  
  public int m()
  {
    return j;
  }
  
  public void c(int ☃)
  {
    j = ☃;
  }
  
  public long n()
  {
    return k;
  }
  
  public void a(long ☃)
  {
    k = ☃;
  }
  
  public long o()
  {
    return l;
  }
  
  public void b(long ☃)
  {
    l = ☃;
  }
  
  public long p()
  {
    return m;
  }
  
  public void c(long ☃)
  {
    m = ☃;
  }
}
