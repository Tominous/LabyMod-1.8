import com.google.common.collect.Lists;
import java.io.IOException;
import java.util.Collection;
import java.util.List;
import java.util.UUID;

public class ia
  implements ff<fj>
{
  private int a;
  private final List<ia.a> b = Lists.newArrayList();
  
  public ia() {}
  
  public ia(int ☃, Collection<qc> ☃)
  {
    a = ☃;
    for (qc ☃ : ☃) {
      b.add(new ia.a(☃.a().a(), ☃.b(), ☃.c()));
    }
  }
  
  public void a(em ☃)
    throws IOException
  {
    a = ☃.e();
    
    int ☃ = ☃.readInt();
    for (int ☃ = 0; ☃ < ☃; ☃++)
    {
      String ☃ = ☃.c(64);
      double ☃ = ☃.readDouble();
      List<qd> ☃ = Lists.newArrayList();
      int ☃ = ☃.e();
      for (int ☃ = 0; ☃ < ☃; ☃++)
      {
        UUID ☃ = ☃.g();
        ☃.add(new qd(☃, "Unknown synced attribute modifier", ☃.readDouble(), ☃.readByte()));
      }
      b.add(new ia.a(☃, ☃, ☃));
    }
  }
  
  public void b(em ☃)
    throws IOException
  {
    ☃.b(a);
    ☃.writeInt(b.size());
    for (ia.a ☃ : b)
    {
      ☃.a(☃.a());
      ☃.writeDouble(☃.b());
      ☃.b(☃.c().size());
      for (qd ☃ : ☃.c())
      {
        ☃.a(☃.a());
        ☃.writeDouble(☃.d());
        ☃.writeByte(☃.c());
      }
    }
  }
  
  public void a(fj ☃)
  {
    ☃.a(this);
  }
  
  public int a()
  {
    return a;
  }
  
  public List<ia.a> b()
  {
    return b;
  }
  
  public class a
  {
    private final String b;
    private final double c;
    private final Collection<qd> d;
    
    public a(double ☃, Collection<qd> arg4)
    {
      b = ☃;
      c = ☃;
      d = ☃;
    }
    
    public String a()
    {
      return b;
    }
    
    public double b()
    {
      return c;
    }
    
    public Collection<qd> c()
    {
      return d;
    }
  }
}
