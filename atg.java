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
      this.a = ☃;
    }
    
    public ff a(zx ☃)
    {
      if (this.d)
      {
        this.d = false;
        return new gu(☃.i(), atg.this.e, atg.this.h.values(), atg.this.f, this.e, this.f, this.g + 1 - this.e, this.h + 1 - this.f);
      }
      if (this.i++ % 5 == 0) {
        return new gu(☃.i(), atg.this.e, atg.this.h.values(), atg.this.f, 0, 0, 0, 0);
      }
      return null;
    }
    
    public void a(int ☃, int ☃)
    {
      if (this.d)
      {
        this.e = Math.min(this.e, ☃);
        this.f = Math.min(this.f, ☃);
        this.g = Math.max(this.g, ☃);
        this.h = Math.max(this.h, ☃);
      }
      else
      {
        this.d = true;
        this.e = ☃;
        this.f = ☃;
        this.g = ☃;
        this.h = ☃;
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
    
    this.b = (☃ * ☃ + ☃ / 2 - 64);
    this.c = (☃ * ☃ + ☃ / 2 - 64);
  }
  
  public void a(dn ☃)
  {
    this.d = ☃.d("dimension");
    this.b = ☃.f("xCenter");
    this.c = ☃.f("zCenter");
    this.e = ☃.d("scale");
    this.e = ((byte)ns.a(this.e, 0, 4));
    
    int ☃ = ☃.e("width");
    int ☃ = ☃.e("height");
    if ((☃ == 128) && (☃ == 128))
    {
      this.f = ☃.k("colors");
    }
    else
    {
      byte[] ☃ = ☃.k("colors");
      this.f = new byte['䀀'];
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
              this.f[(☃ + ☃ * 128)] = ☃[(☃ + ☃ * ☃)];
            }
          }
        }
      }
    }
  }
  
  public void b(dn ☃)
  {
    ☃.a("dimension", this.d);
    ☃.a("xCenter", this.b);
    ☃.a("zCenter", this.c);
    ☃.a("scale", this.e);
    ☃.a("width", (short)128);
    ☃.a("height", (short)128);
    ☃.a("colors", this.f);
  }
  
  public void a(wn ☃, zx ☃)
  {
    if (!this.i.containsKey(☃))
    {
      atg.a ☃ = new atg.a(☃);
      this.i.put(☃, ☃);
      this.g.add(☃);
    }
    if (!☃.bi.c(☃)) {
      this.h.remove(☃.e_());
    }
    for (int ☃ = 0; ☃ < this.g.size(); ☃++)
    {
      atg.a ☃ = (atg.a)this.g.get(☃);
      if ((☃.a.I) || ((!☃.a.bi.c(☃)) && (!☃.y())))
      {
        this.i.remove(☃.a);
        this.g.remove(☃);
      }
      else if ((!☃.y()) && (☃.a.am == this.d))
      {
        a(0, ☃.a.o, ☃.a.e_(), ☃.a.s, ☃.a.u, ☃.a.y);
      }
    }
    if (☃.y())
    {
      uo ☃ = ☃.z();
      cj ☃ = ☃.n();
      a(1, ☃.o, "frame-" + ☃.F(), ☃.n(), ☃.p(), ☃.b.b() * 90);
    }
    if ((☃.n()) && (☃.o().b("Decorations", 9)))
    {
      du ☃ = ☃.o().c("Decorations", 10);
      for (int ☃ = 0; ☃ < ☃.c(); ☃++)
      {
        dn ☃ = ☃.b(☃);
        if (!this.h.containsKey(☃.j("id"))) {
          a(☃.d("type"), ☃.o, ☃.j("id"), ☃.i("x"), ☃.i("z"), ☃.i("rot"));
        }
      }
    }
  }
  
  private void a(int ☃, adm ☃, String ☃, double ☃, double ☃, double ☃)
  {
    int ☃ = 1 << this.e;
    float ☃ = (float)(☃ - this.b) / ☃;
    float ☃ = (float)(☃ - this.c) / ☃;
    byte ☃ = (byte)(int)(☃ * 2.0F + 0.5D);
    byte ☃ = (byte)(int)(☃ * 2.0F + 0.5D);
    
    int ☃ = 63;
    if ((☃ >= -☃) && (☃ >= -☃) && (☃ <= ☃) && (☃ <= ☃))
    {
      ☃ += (☃ < 0.0D ? -8.0D : 8.0D);
      byte ☃ = (byte)(int)(☃ * 16.0D / 360.0D);
      if (this.d < 0)
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
      this.h.remove(☃); return;
    }
    byte ☃;
    this.h.put(☃, new atf((byte)☃, ☃, ☃, ☃));
  }
  
  public ff a(zx ☃, adm ☃, wn ☃)
  {
    atg.a ☃ = (atg.a)this.i.get(☃);
    if (☃ == null) {
      return null;
    }
    return ☃.a(☃);
  }
  
  public void a(int ☃, int ☃)
  {
    super.c();
    for (atg.a ☃ : this.g) {
      ☃.a(☃, ☃);
    }
  }
  
  public atg.a a(wn ☃)
  {
    atg.a ☃ = (atg.a)this.i.get(☃);
    if (☃ == null)
    {
      ☃ = new atg.a(☃);
      this.i.put(☃, ☃);
      this.g.add(☃);
    }
    return ☃;
  }
}
