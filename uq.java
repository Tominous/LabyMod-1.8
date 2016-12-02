import com.google.common.collect.Lists;
import java.util.List;
import java.util.Random;

public class uq
  extends un
{
  public uq.a c;
  
  public static enum a
  {
    public static final int A = "SkullAndRoses".length();
    public final String B;
    public final int C;
    public final int D;
    public final int E;
    public final int F;
    
    private a(String ☃, int ☃, int ☃, int ☃, int ☃)
    {
      this.B = ☃;
      this.C = ☃;
      this.D = ☃;
      this.E = ☃;
      this.F = ☃;
    }
  }
  
  public uq(adm ☃)
  {
    super(☃);
  }
  
  public uq(adm ☃, cj ☃, cq ☃)
  {
    super(☃, ☃);
    
    List<uq.a> ☃ = Lists.newArrayList();
    for (uq.a ☃ : uq.a.values())
    {
      this.c = ☃;
      a(☃);
      if (j()) {
        ☃.add(☃);
      }
    }
    if (!☃.isEmpty()) {
      this.c = ((uq.a)☃.get(this.V.nextInt(☃.size())));
    }
    a(☃);
  }
  
  public uq(adm ☃, cj ☃, cq ☃, String ☃)
  {
    this(☃, ☃, ☃);
    for (uq.a ☃ : uq.a.values()) {
      if (☃.B.equals(☃))
      {
        this.c = ☃;
        break;
      }
    }
    a(☃);
  }
  
  public void b(dn ☃)
  {
    ☃.a("Motive", this.c.B);
    super.b(☃);
  }
  
  public void a(dn ☃)
  {
    String ☃ = ☃.j("Motive");
    for (uq.a ☃ : uq.a.values()) {
      if (☃.B.equals(☃)) {
        this.c = ☃;
      }
    }
    if (this.c == null) {
      this.c = uq.a.a;
    }
    super.a(☃);
  }
  
  public int l()
  {
    return this.c.C;
  }
  
  public int m()
  {
    return this.c.D;
  }
  
  public void b(pk ☃)
  {
    if (!this.o.Q().b("doEntityDrops")) {
      return;
    }
    if ((☃ instanceof wn))
    {
      wn ☃ = (wn)☃;
      if (☃.bA.d) {
        return;
      }
    }
    a(new zx(zy.an), 0.0F);
  }
  
  public void b(double ☃, double ☃, double ☃, float ☃, float ☃)
  {
    cj ☃ = this.a.a(☃ - this.s, ☃ - this.t, ☃ - this.u);
    b(☃.n(), ☃.o(), ☃.p());
  }
  
  public void a(double ☃, double ☃, double ☃, float ☃, float ☃, int ☃, boolean ☃)
  {
    cj ☃ = this.a.a(☃ - this.s, ☃ - this.t, ☃ - this.u);
    b(☃.n(), ☃.o(), ☃.p());
  }
}
