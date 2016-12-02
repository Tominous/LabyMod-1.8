import com.google.common.collect.Maps;
import java.util.Map;

public class avq
{
  private static final jy a = new jy("textures/map/map_icons.png");
  private final bmj b;
  private final Map<String, avq.a> c = Maps.newHashMap();
  
  public avq(bmj ☃)
  {
    b = ☃;
  }
  
  public void a(atg ☃)
  {
    avq.a.a(b(☃));
  }
  
  public void a(atg ☃, boolean ☃)
  {
    avq.a.a(b(☃), ☃);
  }
  
  private avq.a b(atg ☃)
  {
    avq.a ☃ = (avq.a)c.get(a);
    if (☃ == null)
    {
      ☃ = new avq.a(☃, null);
      c.put(a, ☃);
    }
    return ☃;
  }
  
  public void a()
  {
    for (avq.a ☃ : c.values()) {
      b.c(avq.a.b(☃));
    }
    c.clear();
  }
  
  class a
  {
    private final atg b;
    private final blz c;
    private final jy d;
    private final int[] e;
    
    private a(atg ☃)
    {
      b = ☃;
      c = new blz(128, 128);
      e = c.e();
      d = avq.a(avq.this).a("map/" + a, c);
      for (int ☃ = 0; ☃ < e.length; ☃++) {
        e[☃] = 0;
      }
    }
    
    private void a()
    {
      for (int ☃ = 0; ☃ < 16384; ☃++)
      {
        int ☃ = b.f[☃] & 0xFF;
        if (☃ / 4 == 0) {
          e[☃] = ((☃ + ☃ / 128 & 0x1) * 8 + 16 << 24);
        } else {
          e[☃] = arn.a[(☃ / 4)].a(☃ & 0x3);
        }
      }
      c.d();
    }
    
    private void a(boolean ☃)
    {
      int ☃ = 0;
      int ☃ = 0;
      bfx ☃ = bfx.a();
      bfd ☃ = ☃.c();
      
      float ☃ = 0.0F;
      
      avq.a(avq.this).a(d);
      bfl.l();
      bfl.a(1, 771, 0, 1);
      bfl.c();
      ☃.a(7, bms.g);
      ☃.b(☃ + 0 + ☃, ☃ + 128 - ☃, -0.009999999776482582D).a(0.0D, 1.0D).d();
      ☃.b(☃ + 128 - ☃, ☃ + 128 - ☃, -0.009999999776482582D).a(1.0D, 1.0D).d();
      ☃.b(☃ + 128 - ☃, ☃ + 0 + ☃, -0.009999999776482582D).a(1.0D, 0.0D).d();
      ☃.b(☃ + 0 + ☃, ☃ + 0 + ☃, -0.009999999776482582D).a(0.0D, 0.0D).d();
      ☃.b();
      bfl.d();
      bfl.k();
      
      avq.a(avq.this).a(avq.b());
      int ☃ = 0;
      for (atf ☃ : b.h.values()) {
        if ((!☃) || (☃.a() == 1))
        {
          bfl.E();
          bfl.b(☃ + ☃.b() / 2.0F + 64.0F, ☃ + ☃.c() / 2.0F + 64.0F, -0.02F);
          bfl.b(☃.d() * 360 / 16.0F, 0.0F, 0.0F, 1.0F);
          bfl.a(4.0F, 4.0F, 3.0F);
          bfl.b(-0.125F, 0.125F, 0.0F);
          
          byte ☃ = ☃.a();
          float ☃ = (☃ % 4 + 0) / 4.0F;
          float ☃ = (☃ / 4 + 0) / 4.0F;
          float ☃ = (☃ % 4 + 1) / 4.0F;
          float ☃ = (☃ / 4 + 1) / 4.0F;
          
          ☃.a(7, bms.g);
          float ☃ = -0.001F;
          ☃.b(-1.0D, 1.0D, ☃ * -0.001F).a(☃, ☃).d();
          ☃.b(1.0D, 1.0D, ☃ * -0.001F).a(☃, ☃).d();
          ☃.b(1.0D, -1.0D, ☃ * -0.001F).a(☃, ☃).d();
          ☃.b(-1.0D, -1.0D, ☃ * -0.001F).a(☃, ☃).d();
          ☃.b();
          bfl.F();
          ☃++;
        }
      }
      bfl.E();
      bfl.b(0.0F, 0.0F, -0.04F);
      bfl.a(1.0F, 1.0F, 1.0F);
      bfl.F();
    }
  }
}
