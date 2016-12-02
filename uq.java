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
      B = ☃;
      C = ☃;
      D = ☃;
      E = ☃;
      F = ☃;
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
      c = ☃;
      a(☃);
      if (j()) {
        ☃.add(☃);
      }
    }
    if (!☃.isEmpty()) {
      c = ((uq.a)☃.get(V.nextInt(☃.size())));
    }
    a(☃);
  }
  
  public uq(adm ☃, cj ☃, cq ☃, String ☃)
  {
    this(☃, ☃, ☃);
    for (uq.a ☃ : uq.a.values()) {
      if (B.equals(☃))
      {
        c = ☃;
        break;
      }
    }
    a(☃);
  }
  
  public void b(dn ☃)
  {
    ☃.a("Motive", c.B);
    super.b(☃);
  }
  
  public void a(dn ☃)
  {
    String ☃ = ☃.j("Motive");
    for (uq.a ☃ : uq.a.values()) {
      if (B.equals(☃)) {
        c = ☃;
      }
    }
    if (c == null) {
      c = uq.a.a;
    }
    super.a(☃);
  }
  
  public int l()
  {
    return c.C;
  }
  
  public int m()
  {
    return c.D;
  }
  
  public void b(pk ☃)
  {
    if (!o.Q().b("doEntityDrops")) {
      return;
    }
    if ((☃ instanceof wn))
    {
      wn ☃ = (wn)☃;
      if (bA.d) {
        return;
      }
    }
    a(new zx(zy.an), 0.0F);
  }
  
  public void b(double ☃, double ☃, double ☃, float ☃, float ☃)
  {
    cj ☃ = a.a(☃ - s, ☃ - t, ☃ - u);
    b(☃.n(), ☃.o(), ☃.p());
  }
  
  public void a(double ☃, double ☃, double ☃, float ☃, float ☃, int ☃, boolean ☃)
  {
    cj ☃ = a.a(☃ - s, ☃ - t, ☃ - u);
    b(☃.n(), ☃.o(), ☃.p());
  }
}
