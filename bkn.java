import com.google.common.collect.Maps;
import java.util.Map;

public abstract class bkn<T extends bbo>
  implements blb<pr>
{
  protected static final jy b = new jy("textures/misc/enchanted_item_glint.png");
  protected T c;
  protected T d;
  private final bjl<?> a;
  private float e = 1.0F;
  private float f = 1.0F;
  private float g = 1.0F;
  private float h = 1.0F;
  private boolean i;
  
  public bkn(bjl<?> ☃)
  {
    this.a = ☃;
    
    a();
  }
  
  public void a(pr ☃, float ☃, float ☃, float ☃, float ☃, float ☃, float ☃, float ☃)
  {
    a(☃, ☃, ☃, ☃, ☃, ☃, ☃, ☃, 4);
    a(☃, ☃, ☃, ☃, ☃, ☃, ☃, ☃, 3);
    a(☃, ☃, ☃, ☃, ☃, ☃, ☃, ☃, 2);
    a(☃, ☃, ☃, ☃, ☃, ☃, ☃, ☃, 1);
  }
  
  public boolean b()
  {
    return false;
  }
  
  private void a(pr ☃, float ☃, float ☃, float ☃, float ☃, float ☃, float ☃, float ☃, int ☃)
  {
    zx ☃ = a(☃, ☃);
    if ((☃ == null) || (!(☃.b() instanceof yj))) {
      return;
    }
    yj ☃ = (yj)☃.b();
    
    T ☃ = a(☃);
    
    ☃.a(this.a.b());
    ☃.a(☃, ☃, ☃, ☃);
    
    a(☃, ☃);
    
    boolean ☃ = b(☃);
    this.a.a(a(☃, ☃));
    switch (bkn.1.a[☃.x_().ordinal()])
    {
    case 1: 
      int ☃ = ☃.b(☃);
      float ☃ = (☃ >> 16 & 0xFF) / 255.0F;
      float ☃ = (☃ >> 8 & 0xFF) / 255.0F;
      float ☃ = (☃ & 0xFF) / 255.0F;
      
      bfl.c(this.f * ☃, this.g * ☃, this.h * ☃, this.e);
      ☃.a(☃, ☃, ☃, ☃, ☃, ☃, ☃);
      
      this.a.a(a(☃, ☃, "overlay"));
    case 2: 
    case 3: 
    case 4: 
    case 5: 
      bfl.c(this.f, this.g, this.h, this.e);
      ☃.a(☃, ☃, ☃, ☃, ☃, ☃, ☃);
    }
    if ((!this.i) && (☃.w())) {
      a(☃, ☃, ☃, ☃, ☃, ☃, ☃, ☃, ☃);
    }
  }
  
  public zx a(pr ☃, int ☃)
  {
    return ☃.q(☃ - 1);
  }
  
  public T a(int ☃)
  {
    return b(☃) ? this.c : this.d;
  }
  
  private boolean b(int ☃)
  {
    return ☃ == 2;
  }
  
  private void a(pr ☃, T ☃, float ☃, float ☃, float ☃, float ☃, float ☃, float ☃, float ☃)
  {
    float ☃ = ☃.W + ☃;
    this.a.a(b);
    
    bfl.l();
    bfl.c(514);
    bfl.a(false);
    
    float ☃ = 0.5F;
    bfl.c(☃, ☃, ☃, 1.0F);
    for (int ☃ = 0; ☃ < 2; ☃++)
    {
      bfl.f();
      bfl.b(768, 1);
      
      float ☃ = 0.76F;
      bfl.c(0.5F * ☃, 0.25F * ☃, 0.8F * ☃, 1.0F);
      
      bfl.n(5890);
      bfl.D();
      
      float ☃ = 0.33333334F;
      bfl.a(☃, ☃, ☃);
      
      bfl.b(30.0F - ☃ * 60.0F, 0.0F, 0.0F, 1.0F);
      bfl.b(0.0F, ☃ * (0.001F + ☃ * 0.003F) * 20.0F, 0.0F);
      bfl.n(5888);
      
      ☃.a(☃, ☃, ☃, ☃, ☃, ☃, ☃);
    }
    bfl.n(5890);
    bfl.D();
    bfl.n(5888);
    
    bfl.e();
    
    bfl.a(true);
    bfl.c(515);
    bfl.k();
  }
  
  private static final Map<String, jy> j = Maps.newHashMap();
  
  private jy a(yj ☃, boolean ☃)
  {
    return a(☃, ☃, null);
  }
  
  private jy a(yj ☃, boolean ☃, String ☃)
  {
    String ☃ = String.format("textures/models/armor/%s_layer_%d%s.png", new Object[] { ☃.x_().c(), Integer.valueOf(☃ ? 2 : 1), ☃ == null ? "" : String.format("_%s", new Object[] { ☃ }) });
    
    jy ☃ = (jy)j.get(☃);
    if (☃ == null)
    {
      ☃ = new jy(☃);
      j.put(☃, ☃);
    }
    return ☃;
  }
  
  protected abstract void a();
  
  protected abstract void a(T paramT, int paramInt);
}
