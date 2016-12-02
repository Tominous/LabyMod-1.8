import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.util.List;
import java.util.Map;

public class atg
  extends ate
{
  public int b;
  public int c;
  public byte d;
  public byte e;
  
  public class a
  {
    public final wn a;
    private boolean d = true;
    private int e = 0;
    private int f = 0;
    private int g = 127;
    private int h = 127;
    private int i;
    public int b;
    
    public a(wn ☃)
    {
      a = ☃;
    }
    
    public ff a(zx ☃)
    {
      if (d)
      {
        d = false;
        return new gu(☃.i(), e, h.values(), f, e, f, g + 1 - e, h + 1 - f);
      }
      if (i++ % 5 == 0) {
        return new gu(☃.i(), e, h.values(), f, 0, 0, 0, 0);
      }
      return null;
    }
    
    public void a(int ☃, int ☃)
    {
      if (d)
      {
        e = Math.min(e, ☃);
        f = Math.min(f, ☃);
        g = Math.max(g, ☃);
        h = Math.max(h, ☃);
      }
      else
      {
        d = true;
        e = ☃;
        f = ☃;
        g = ☃;
        h = ☃;
      }
    }
  }
  
  public byte[] f = new byte['䀀'];
  public List<atg.a> g = Lists.newArrayList();
  private Map<wn, atg.a> i = Maps.newHashMap();
  public Map<String, atf> h = Maps.newLinkedHashMap();
  
  public atg(String ☃)
  {
    super(☃);
  }
  
  public void a(double ☃, double ☃, int ☃)
  {
    int ☃ = 128 * (1 << ☃);
    
    int ☃ = ns.c((☃ + 64.0D) / ☃);
    int ☃ = ns.c((☃ + 64.0D) / ☃);
    
    b = (☃ * ☃ + ☃ / 2 - 64);
    c = (☃ * ☃ + ☃ / 2 - 64);
  }
  
  public void a(dn ☃)
  {
    d = ☃.d("dimension");
    b = ☃.f("xCenter");
    c = ☃.f("zCenter");
    e = ☃.d("scale");
    e = ((byte)ns.a(e, 0, 4));
    
    int ☃ = ☃.e("width");
    int ☃ = ☃.e("height");
    if ((☃ == 128) && (☃ == 128))
    {
      f = ☃.k("colors");
    }
    else
    {
      byte[] ☃ = ☃.k("colors");
      f = new byte['䀀'];
      int ☃ = (128 - ☃) / 2;
      int ☃ = (128 - ☃) / 2;
      for (int ☃ = 0; ☃ < ☃; ☃++)
      {
        int ☃ = ☃ + ☃;
        if ((☃ >= 0) || (☃ < 128)) {
          for (int ☃ = 0; ☃ < ☃; ☃++)
          {
            int ☃ = ☃ + ☃;
            if ((☃ >= 0) || (☃ < 128)) {
              f[(☃ + ☃ * 128)] = ☃[(☃ + ☃ * ☃)];
            }
          }
        }
      }
    }
  }
  
  public void b(dn ☃)
  {
    ☃.a("dimension", d);
    ☃.a("xCenter", b);
    ☃.a("zCenter", c);
    ☃.a("scale", e);
    ☃.a("width", (short)128);
    ☃.a("height", (short)128);
    ☃.a("colors", f);
  }
  
  public void a(wn ☃, zx ☃)
  {
    if (!i.containsKey(☃))
    {
      atg.a ☃ = new atg.a(☃);
      i.put(☃, ☃);
      g.add(☃);
    }
    if (!bi.c(☃)) {
      h.remove(☃.e_());
    }
    for (int ☃ = 0; ☃ < g.size(); ☃++)
    {
      atg.a ☃ = (atg.a)g.get(☃);
      if ((a.I) || ((!a.bi.c(☃)) && (!☃.y())))
      {
        i.remove(a);
        g.remove(☃);
      }
      else if ((!☃.y()) && (a.am == d))
      {
        a(0, a.o, a.e_(), a.s, a.u, a.y);
      }
    }
    if (☃.y())
    {
      uo ☃ = ☃.z();
      cj ☃ = ☃.n();
      a(1, o, "frame-" + ☃.F(), ☃.n(), ☃.p(), b.b() * 90);
    }
    if ((☃.n()) && (☃.o().b("Decorations", 9)))
    {
      du ☃ = ☃.o().c("Decorations", 10);
      for (int ☃ = 0; ☃ < ☃.c(); ☃++)
      {
        dn ☃ = ☃.b(☃);
        if (!h.containsKey(☃.j("id"))) {
          a(☃.d("type"), o, ☃.j("id"), ☃.i("x"), ☃.i("z"), ☃.i("rot"));
        }
      }
    }
  }
  
  private void a(int ☃, adm ☃, String ☃, double ☃, double ☃, double ☃)
  {
    int ☃ = 1 << e;
    float ☃ = (float)(☃ - b) / ☃;
    float ☃ = (float)(☃ - c) / ☃;
    byte ☃ = (byte)(int)(☃ * 2.0F + 0.5D);
    byte ☃ = (byte)(int)(☃ * 2.0F + 0.5D);
    
    int ☃ = 63;
    if ((☃ >= -☃) && (☃ >= -☃) && (☃ <= ☃) && (☃ <= ☃))
    {
      ☃ += (☃ < 0.0D ? -8.0D : 8.0D);
      byte ☃ = (byte)(int)(☃ * 16.0D / 360.0D);
      if (d < 0)
      {
        int ☃ = (int)(☃.P().g() / 10L);
        ☃ = (byte)(☃ * ☃ * 34187121 + ☃ * 121 >> 15 & 0xF);
      }
    }
    else if ((Math.abs(☃) < 320.0F) && (Math.abs(☃) < 320.0F))
    {
      ☃ = 6;
      byte ☃ = 0;
      if (☃ <= -☃) {
        ☃ = (byte)(int)(☃ * 2 + 2.5D);
      }
      if (☃ <= -☃) {
        ☃ = (byte)(int)(☃ * 2 + 2.5D);
      }
      if (☃ >= ☃) {
        ☃ = (byte)(☃ * 2 + 1);
      }
      if (☃ >= ☃) {
        ☃ = (byte)(☃ * 2 + 1);
      }
    }
    else
    {
      h.remove(☃); return;
    }
    byte ☃;
    h.put(☃, new atf((byte)☃, ☃, ☃, ☃));
  }
  
  public ff a(zx ☃, adm ☃, wn ☃)
  {
    atg.a ☃ = (atg.a)i.get(☃);
    if (☃ == null) {
      return null;
    }
    return ☃.a(☃);
  }
  
  public void a(int ☃, int ☃)
  {
    super.c();
    for (atg.a ☃ : g) {
      ☃.a(☃, ☃);
    }
  }
  
  public atg.a a(wn ☃)
  {
    atg.a ☃ = (atg.a)i.get(☃);
    if (☃ == null)
    {
      ☃ = new atg.a(☃);
      i.put(☃, ☃);
      g.add(☃);
    }
    return ☃;
  }
}
