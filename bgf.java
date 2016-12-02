import java.util.BitSet;
import java.util.List;

public class bgf
{
  public boolean a(adq ☃, boq ☃, alz ☃, cj ☃, bfd ☃)
  {
    afh ☃ = ☃.c();
    ☃.a(☃, ☃);
    return a(☃, ☃, ☃, ☃, ☃, true);
  }
  
  public boolean a(adq ☃, boq ☃, alz ☃, cj ☃, bfd ☃, boolean ☃)
  {
    boolean ☃ = (ave.x()) && (☃.c().r() == 0) && (☃.b());
    try
    {
      afh ☃ = ☃.c();
      if (☃) {
        return a(☃, ☃, ☃, ☃, ☃, ☃);
      }
      return b(☃, ☃, ☃, ☃, ☃, ☃);
    }
    catch (Throwable ☃)
    {
      b ☃ = b.a(☃, "Tesselating block model");
      c ☃ = ☃.a("Block model being tesselated");
      
      c.a(☃, ☃, ☃);
      ☃.a("Using AO", Boolean.valueOf(☃));
      throw new e(☃);
    }
  }
  
  public boolean a(adq ☃, boq ☃, afh ☃, cj ☃, bfd ☃, boolean ☃)
  {
    boolean ☃ = false;
    
    float[] ☃ = new float[cq.values().length * 2];
    BitSet ☃ = new BitSet(3);
    bgf.b ☃ = new bgf.b();
    for (cq ☃ : cq.values())
    {
      List<bgg> ☃ = ☃.a(☃);
      if (!☃.isEmpty())
      {
        cj ☃ = ☃.a(☃);
        if ((!☃) || (☃.a(☃, ☃, ☃)))
        {
          a(☃, ☃, ☃, ☃, ☃, ☃, ☃, ☃);
          ☃ = true;
        }
      }
    }
    List<bgg> ☃ = ☃.a();
    if (☃.size() > 0)
    {
      a(☃, ☃, ☃, ☃, ☃, ☃, ☃, ☃);
      ☃ = true;
    }
    return ☃;
  }
  
  public boolean b(adq ☃, boq ☃, afh ☃, cj ☃, bfd ☃, boolean ☃)
  {
    boolean ☃ = false;
    
    BitSet ☃ = new BitSet(3);
    for (cq ☃ : cq.values())
    {
      List<bgg> ☃ = ☃.a(☃);
      if (!☃.isEmpty())
      {
        cj ☃ = ☃.a(☃);
        if ((!☃) || (☃.a(☃, ☃, ☃)))
        {
          int ☃ = ☃.c(☃, ☃);
          
          a(☃, ☃, ☃, ☃, ☃, false, ☃, ☃, ☃);
          ☃ = true;
        }
      }
    }
    List<bgg> ☃ = ☃.a();
    if (☃.size() > 0)
    {
      a(☃, ☃, ☃, null, -1, true, ☃, ☃, ☃);
      ☃ = true;
    }
    return ☃;
  }
  
  private void a(adq ☃, afh ☃, cj ☃, bfd ☃, List<bgg> ☃, float[] ☃, BitSet ☃, bgf.b ☃)
  {
    double ☃ = ☃.n();
    double ☃ = ☃.o();
    double ☃ = ☃.p();
    
    afh.a ☃ = ☃.R();
    if (☃ != afh.a.a)
    {
      long ☃ = ns.a(☃);
      
      ☃ += ((float)(☃ >> 16 & 0xF) / 15.0F - 0.5D) * 0.5D;
      ☃ += ((float)(☃ >> 24 & 0xF) / 15.0F - 0.5D) * 0.5D;
      if (☃ == afh.a.c) {
        ☃ += ((float)(☃ >> 20 & 0xF) / 15.0F - 1.0D) * 0.2D;
      }
    }
    for (bgg ☃ : ☃)
    {
      a(☃, ☃.a(), ☃.d(), ☃, ☃);
      ☃.a(☃, ☃, ☃, ☃.d(), ☃, ☃);
      
      ☃.a(☃.a());
      ☃.a(bgf.b.a(☃)[0], bgf.b.a(☃)[1], bgf.b.a(☃)[2], bgf.b.a(☃)[3]);
      if (☃.b())
      {
        int ☃ = ☃.a(☃, ☃, ☃.c());
        if (bfk.a) {
          ☃ = bml.c(☃);
        }
        float ☃ = (☃ >> 16 & 0xFF) / 255.0F;
        float ☃ = (☃ >> 8 & 0xFF) / 255.0F;
        float ☃ = (☃ & 0xFF) / 255.0F;
        
        ☃.a(bgf.b.b(☃)[0] * ☃, bgf.b.b(☃)[0] * ☃, bgf.b.b(☃)[0] * ☃, 4);
        ☃.a(bgf.b.b(☃)[1] * ☃, bgf.b.b(☃)[1] * ☃, bgf.b.b(☃)[1] * ☃, 3);
        ☃.a(bgf.b.b(☃)[2] * ☃, bgf.b.b(☃)[2] * ☃, bgf.b.b(☃)[2] * ☃, 2);
        ☃.a(bgf.b.b(☃)[3] * ☃, bgf.b.b(☃)[3] * ☃, bgf.b.b(☃)[3] * ☃, 1);
      }
      else
      {
        ☃.a(bgf.b.b(☃)[0], bgf.b.b(☃)[0], bgf.b.b(☃)[0], 4);
        ☃.a(bgf.b.b(☃)[1], bgf.b.b(☃)[1], bgf.b.b(☃)[1], 3);
        ☃.a(bgf.b.b(☃)[2], bgf.b.b(☃)[2], bgf.b.b(☃)[2], 2);
        ☃.a(bgf.b.b(☃)[3], bgf.b.b(☃)[3], bgf.b.b(☃)[3], 1);
      }
      ☃.a(☃, ☃, ☃);
    }
  }
  
  private void a(afh ☃, int[] ☃, cq ☃, float[] ☃, BitSet ☃)
  {
    float ☃ = 32.0F;
    float ☃ = 32.0F;
    float ☃ = 32.0F;
    float ☃ = -32.0F;
    float ☃ = -32.0F;
    float ☃ = -32.0F;
    for (int ☃ = 0; ☃ < 4; ☃++)
    {
      float ☃ = Float.intBitsToFloat(☃[(☃ * 7)]);
      float ☃ = Float.intBitsToFloat(☃[(☃ * 7 + 1)]);
      float ☃ = Float.intBitsToFloat(☃[(☃ * 7 + 2)]);
      ☃ = Math.min(☃, ☃);
      ☃ = Math.min(☃, ☃);
      ☃ = Math.min(☃, ☃);
      ☃ = Math.max(☃, ☃);
      ☃ = Math.max(☃, ☃);
      ☃ = Math.max(☃, ☃);
    }
    if (☃ != null)
    {
      ☃[cq.e.a()] = ☃;
      ☃[cq.f.a()] = ☃;
      ☃[cq.a.a()] = ☃;
      ☃[cq.b.a()] = ☃;
      ☃[cq.c.a()] = ☃;
      ☃[cq.d.a()] = ☃;
      ☃[(cq.e.a() + cq.values().length)] = (1.0F - ☃);
      ☃[(cq.f.a() + cq.values().length)] = (1.0F - ☃);
      ☃[(cq.a.a() + cq.values().length)] = (1.0F - ☃);
      ☃[(cq.b.a() + cq.values().length)] = (1.0F - ☃);
      ☃[(cq.c.a() + cq.values().length)] = (1.0F - ☃);
      ☃[(cq.d.a() + cq.values().length)] = (1.0F - ☃);
    }
    float ☃ = 1.0E-4F;
    float ☃ = 0.9999F;
    switch (bgf.1.a[☃.ordinal()])
    {
    case 1: 
      ☃.set(1, (☃ >= 1.0E-4F) || (☃ >= 1.0E-4F) || (☃ <= 0.9999F) || (☃ <= 0.9999F));
      ☃.set(0, ((☃ < 1.0E-4F) || (☃.d())) && (☃ == ☃));
      break;
    case 2: 
      ☃.set(1, (☃ >= 1.0E-4F) || (☃ >= 1.0E-4F) || (☃ <= 0.9999F) || (☃ <= 0.9999F));
      ☃.set(0, ((☃ > 0.9999F) || (☃.d())) && (☃ == ☃));
      break;
    case 3: 
      ☃.set(1, (☃ >= 1.0E-4F) || (☃ >= 1.0E-4F) || (☃ <= 0.9999F) || (☃ <= 0.9999F));
      ☃.set(0, ((☃ < 1.0E-4F) || (☃.d())) && (☃ == ☃));
      break;
    case 4: 
      ☃.set(1, (☃ >= 1.0E-4F) || (☃ >= 1.0E-4F) || (☃ <= 0.9999F) || (☃ <= 0.9999F));
      ☃.set(0, ((☃ > 0.9999F) || (☃.d())) && (☃ == ☃));
      break;
    case 5: 
      ☃.set(1, (☃ >= 1.0E-4F) || (☃ >= 1.0E-4F) || (☃ <= 0.9999F) || (☃ <= 0.9999F));
      ☃.set(0, ((☃ < 1.0E-4F) || (☃.d())) && (☃ == ☃));
      break;
    case 6: 
      ☃.set(1, (☃ >= 1.0E-4F) || (☃ >= 1.0E-4F) || (☃ <= 0.9999F) || (☃ <= 0.9999F));
      ☃.set(0, ((☃ > 0.9999F) || (☃.d())) && (☃ == ☃));
    }
  }
  
  private void a(adq ☃, afh ☃, cj ☃, cq ☃, int ☃, boolean ☃, bfd ☃, List<bgg> ☃, BitSet ☃)
  {
    double ☃ = ☃.n();
    double ☃ = ☃.o();
    double ☃ = ☃.p();
    
    afh.a ☃ = ☃.R();
    if (☃ != afh.a.a)
    {
      int ☃ = ☃.n();
      int ☃ = ☃.p();
      
      long ☃ = ☃ * 3129871 ^ ☃ * 116129781L;
      ☃ = ☃ * ☃ * 42317861L + ☃ * 11L;
      
      ☃ += ((float)(☃ >> 16 & 0xF) / 15.0F - 0.5D) * 0.5D;
      ☃ += ((float)(☃ >> 24 & 0xF) / 15.0F - 0.5D) * 0.5D;
      if (☃ == afh.a.c) {
        ☃ += ((float)(☃ >> 20 & 0xF) / 15.0F - 1.0D) * 0.2D;
      }
    }
    for (bgg ☃ : ☃)
    {
      if (☃)
      {
        a(☃, ☃.a(), ☃.d(), null, ☃);
        
        ☃ = ☃.get(0) ? ☃.c(☃, ☃.a(☃.d())) : ☃.c(☃, ☃);
      }
      ☃.a(☃.a());
      ☃.a(☃, ☃, ☃, ☃);
      if (☃.b())
      {
        int ☃ = ☃.a(☃, ☃, ☃.c());
        if (bfk.a) {
          ☃ = bml.c(☃);
        }
        float ☃ = (☃ >> 16 & 0xFF) / 255.0F;
        float ☃ = (☃ >> 8 & 0xFF) / 255.0F;
        float ☃ = (☃ & 0xFF) / 255.0F;
        
        ☃.a(☃, ☃, ☃, 4);
        ☃.a(☃, ☃, ☃, 3);
        ☃.a(☃, ☃, ☃, 2);
        ☃.a(☃, ☃, ☃, 1);
      }
      ☃.a(☃, ☃, ☃);
    }
  }
  
  public void a(boq ☃, float ☃, float ☃, float ☃, float ☃)
  {
    for (cq ☃ : ) {
      a(☃, ☃, ☃, ☃, ☃.a(☃));
    }
    a(☃, ☃, ☃, ☃, ☃.a());
  }
  
  public void a(boq ☃, alz ☃, float ☃, boolean ☃)
  {
    afh ☃ = ☃.c();
    ☃.j();
    bfl.b(90.0F, 0.0F, 1.0F, 0.0F);
    
    int ☃ = ☃.h(☃.b(☃));
    if (bfk.a) {
      ☃ = bml.c(☃);
    }
    float ☃ = (☃ >> 16 & 0xFF) / 255.0F;
    float ☃ = (☃ >> 8 & 0xFF) / 255.0F;
    float ☃ = (☃ & 0xFF) / 255.0F;
    if (!☃) {
      bfl.c(☃, ☃, ☃, 1.0F);
    }
    a(☃, ☃, ☃, ☃, ☃);
  }
  
  private void a(float ☃, float ☃, float ☃, float ☃, List<bgg> ☃)
  {
    bfx ☃ = bfx.a();
    bfd ☃ = ☃.c();
    for (bgg ☃ : ☃)
    {
      ☃.a(7, bms.b);
      ☃.a(☃.a());
      if (☃.b()) {
        ☃.d(☃ * ☃, ☃ * ☃, ☃ * ☃);
      } else {
        ☃.d(☃, ☃, ☃);
      }
      df ☃ = ☃.d().m();
      ☃.b(☃.n(), ☃.o(), ☃.p());
      ☃.b();
    }
  }
  
  static enum c
  {
    private final int g;
    private final int h;
    private final int i;
    private final int j;
    private static final c[] k;
    
    static
    {
      k = new c[6];
      
      k[cq.a.a()] = a;
      k[cq.b.a()] = b;
      k[cq.c.a()] = c;
      k[cq.d.a()] = d;
      k[cq.e.a()] = e;
      k[cq.f.a()] = f;
    }
    
    private c(int ☃, int ☃, int ☃, int ☃)
    {
      this.g = ☃;
      this.h = ☃;
      this.i = ☃;
      this.j = ☃;
    }
    
    public static c a(cq ☃)
    {
      return k[☃.a()];
    }
  }
  
  class b
  {
    private final float[] b = new float[4];
    private final int[] c = new int[4];
    
    public b() {}
    
    public void a(adq ☃, afh ☃, cj ☃, cq ☃, float[] ☃, BitSet ☃)
    {
      cj ☃ = ☃.get(0) ? ☃.a(☃) : ☃;
      
      bgf.a ☃ = bgf.a.a(☃);
      cj ☃ = ☃.a(☃.g[0]);
      cj ☃ = ☃.a(☃.g[1]);
      cj ☃ = ☃.a(☃.g[2]);
      cj ☃ = ☃.a(☃.g[3]);
      
      int ☃ = ☃.c(☃, ☃);
      int ☃ = ☃.c(☃, ☃);
      int ☃ = ☃.c(☃, ☃);
      int ☃ = ☃.c(☃, ☃);
      
      float ☃ = ☃.p(☃).c().h();
      float ☃ = ☃.p(☃).c().h();
      float ☃ = ☃.p(☃).c().h();
      float ☃ = ☃.p(☃).c().h();
      
      boolean ☃ = ☃.p(☃.a(☃)).c().q();
      boolean ☃ = ☃.p(☃.a(☃)).c().q();
      boolean ☃ = ☃.p(☃.a(☃)).c().q();
      boolean ☃ = ☃.p(☃.a(☃)).c().q();
      int ☃;
      float ☃;
      int ☃;
      if ((☃) || (☃))
      {
        cj ☃ = ☃.a(☃.g[2]);
        float ☃ = ☃.p(☃).c().h();
        ☃ = ☃.c(☃, ☃);
      }
      else
      {
        ☃ = ☃;
        ☃ = ☃;
      }
      int ☃;
      float ☃;
      int ☃;
      if ((☃) || (☃))
      {
        cj ☃ = ☃.a(☃.g[3]);
        float ☃ = ☃.p(☃).c().h();
        ☃ = ☃.c(☃, ☃);
      }
      else
      {
        ☃ = ☃;
        ☃ = ☃;
      }
      int ☃;
      float ☃;
      int ☃;
      if ((☃) || (☃))
      {
        cj ☃ = ☃.a(☃.g[2]);
        float ☃ = ☃.p(☃).c().h();
        ☃ = ☃.c(☃, ☃);
      }
      else
      {
        ☃ = ☃;
        ☃ = ☃;
      }
      int ☃;
      float ☃;
      int ☃;
      if ((☃) || (☃))
      {
        cj ☃ = ☃.a(☃.g[3]);
        float ☃ = ☃.p(☃).c().h();
        ☃ = ☃.c(☃, ☃);
      }
      else
      {
        ☃ = ☃;
        ☃ = ☃;
      }
      int ☃ = ☃.c(☃, ☃);
      if ((☃.get(0)) || (!☃.p(☃.a(☃)).c().c())) {
        ☃ = ☃.c(☃, ☃.a(☃));
      }
      float ☃ = ☃.get(0) ? ☃.p(☃).c().h() : ☃.p(☃).c().h();
      
      bgf.c ☃ = bgf.c.a(☃);
      if ((!☃.get(1)) || (!☃.i))
      {
        float ☃ = (☃ + ☃ + ☃ + ☃) * 0.25F;
        float ☃ = (☃ + ☃ + ☃ + ☃) * 0.25F;
        float ☃ = (☃ + ☃ + ☃ + ☃) * 0.25F;
        float ☃ = (☃ + ☃ + ☃ + ☃) * 0.25F;
        
        this.c[bgf.c.a(☃)] = a(☃, ☃, ☃, ☃);
        this.c[bgf.c.b(☃)] = a(☃, ☃, ☃, ☃);
        this.c[bgf.c.c(☃)] = a(☃, ☃, ☃, ☃);
        this.c[bgf.c.d(☃)] = a(☃, ☃, ☃, ☃);
        
        this.b[bgf.c.a(☃)] = ☃;
        this.b[bgf.c.b(☃)] = ☃;
        this.b[bgf.c.c(☃)] = ☃;
        this.b[bgf.c.d(☃)] = ☃;
      }
      else
      {
        float ☃ = (☃ + ☃ + ☃ + ☃) * 0.25F;
        float ☃ = (☃ + ☃ + ☃ + ☃) * 0.25F;
        float ☃ = (☃ + ☃ + ☃ + ☃) * 0.25F;
        float ☃ = (☃ + ☃ + ☃ + ☃) * 0.25F;
        
        float ☃ = ☃[☃.j[0].m] * ☃[☃.j[1].m];
        float ☃ = ☃[☃.j[2].m] * ☃[☃.j[3].m];
        float ☃ = ☃[☃.j[4].m] * ☃[☃.j[5].m];
        float ☃ = ☃[☃.j[6].m] * ☃[☃.j[7].m];
        
        float ☃ = ☃[☃.k[0].m] * ☃[☃.k[1].m];
        float ☃ = ☃[☃.k[2].m] * ☃[☃.k[3].m];
        float ☃ = ☃[☃.k[4].m] * ☃[☃.k[5].m];
        float ☃ = ☃[☃.k[6].m] * ☃[☃.k[7].m];
        
        float ☃ = ☃[☃.l[0].m] * ☃[☃.l[1].m];
        float ☃ = ☃[☃.l[2].m] * ☃[☃.l[3].m];
        float ☃ = ☃[☃.l[4].m] * ☃[☃.l[5].m];
        float ☃ = ☃[☃.l[6].m] * ☃[☃.l[7].m];
        
        float ☃ = ☃[☃.m[0].m] * ☃[☃.m[1].m];
        float ☃ = ☃[☃.m[2].m] * ☃[☃.m[3].m];
        float ☃ = ☃[☃.m[4].m] * ☃[☃.m[5].m];
        float ☃ = ☃[☃.m[6].m] * ☃[☃.m[7].m];
        
        this.b[bgf.c.a(☃)] = (☃ * ☃ + ☃ * ☃ + ☃ * ☃ + ☃ * ☃);
        this.b[bgf.c.b(☃)] = (☃ * ☃ + ☃ * ☃ + ☃ * ☃ + ☃ * ☃);
        this.b[bgf.c.c(☃)] = (☃ * ☃ + ☃ * ☃ + ☃ * ☃ + ☃ * ☃);
        this.b[bgf.c.d(☃)] = (☃ * ☃ + ☃ * ☃ + ☃ * ☃ + ☃ * ☃);
        
        int ☃ = a(☃, ☃, ☃, ☃);
        int ☃ = a(☃, ☃, ☃, ☃);
        int ☃ = a(☃, ☃, ☃, ☃);
        int ☃ = a(☃, ☃, ☃, ☃);
        
        this.c[bgf.c.a(☃)] = a(☃, ☃, ☃, ☃, ☃, ☃, ☃, ☃);
        this.c[bgf.c.b(☃)] = a(☃, ☃, ☃, ☃, ☃, ☃, ☃, ☃);
        this.c[bgf.c.c(☃)] = a(☃, ☃, ☃, ☃, ☃, ☃, ☃, ☃);
        this.c[bgf.c.d(☃)] = a(☃, ☃, ☃, ☃, ☃, ☃, ☃, ☃);
      }
    }
    
    private int a(int ☃, int ☃, int ☃, int ☃)
    {
      if (☃ == 0) {
        ☃ = ☃;
      }
      if (☃ == 0) {
        ☃ = ☃;
      }
      if (☃ == 0) {
        ☃ = ☃;
      }
      return ☃ + ☃ + ☃ + ☃ >> 2 & 0xFF00FF;
    }
    
    private int a(int ☃, int ☃, int ☃, int ☃, float ☃, float ☃, float ☃, float ☃)
    {
      int ☃ = (int)((☃ >> 16 & 0xFF) * ☃ + (☃ >> 16 & 0xFF) * ☃ + (☃ >> 16 & 0xFF) * ☃ + (☃ >> 16 & 0xFF) * ☃) & 0xFF;
      int ☃ = (int)((☃ & 0xFF) * ☃ + (☃ & 0xFF) * ☃ + (☃ & 0xFF) * ☃ + (☃ & 0xFF) * ☃) & 0xFF;
      return ☃ << 16 | ☃;
    }
  }
  
  public static enum d
  {
    protected final int m;
    
    private d(cq ☃, boolean ☃)
    {
      this.m = (☃.a() + (☃ ? cq.values().length : 0));
    }
  }
  
  public static enum a
  {
    protected final cq[] g;
    protected final float h;
    protected final boolean i;
    protected final bgf.d[] j;
    protected final bgf.d[] k;
    protected final bgf.d[] l;
    protected final bgf.d[] m;
    private static final a[] n;
    
    static
    {
      n = new a[6];
      
      n[cq.a.a()] = a;
      n[cq.b.a()] = b;
      n[cq.c.a()] = c;
      n[cq.d.a()] = d;
      n[cq.e.a()] = e;
      n[cq.f.a()] = f;
    }
    
    private a(cq[] ☃, float ☃, boolean ☃, bgf.d[] ☃, bgf.d[] ☃, bgf.d[] ☃, bgf.d[] ☃)
    {
      this.g = ☃;
      this.h = ☃;
      this.i = ☃;
      this.j = ☃;
      this.k = ☃;
      this.l = ☃;
      this.m = ☃;
    }
    
    public static a a(cq ☃)
    {
      return n[☃.a()];
    }
  }
}
