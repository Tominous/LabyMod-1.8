import com.google.common.collect.Lists;
import java.io.IOException;
import java.util.List;

public class gk
  implements ff<fj>
{
  private double a;
  private double b;
  private double c;
  private float d;
  private List<cj> e;
  private float f;
  private float g;
  private float h;
  
  public gk() {}
  
  public gk(double ☃, double ☃, double ☃, float ☃, List<cj> ☃, aui ☃)
  {
    a = ☃;
    b = ☃;
    c = ☃;
    d = ☃;
    e = Lists.newArrayList(☃);
    if (☃ != null)
    {
      f = ((float)a);
      g = ((float)b);
      h = ((float)c);
    }
  }
  
  public void a(em ☃)
    throws IOException
  {
    a = ☃.readFloat();
    b = ☃.readFloat();
    c = ☃.readFloat();
    d = ☃.readFloat();
    int ☃ = ☃.readInt();
    
    e = Lists.newArrayListWithCapacity(☃);
    
    int ☃ = (int)a;
    int ☃ = (int)b;
    int ☃ = (int)c;
    for (int ☃ = 0; ☃ < ☃; ☃++)
    {
      int ☃ = ☃.readByte() + ☃;
      int ☃ = ☃.readByte() + ☃;
      int ☃ = ☃.readByte() + ☃;
      e.add(new cj(☃, ☃, ☃));
    }
    f = ☃.readFloat();
    g = ☃.readFloat();
    h = ☃.readFloat();
  }
  
  public void b(em ☃)
    throws IOException
  {
    ☃.writeFloat((float)a);
    ☃.writeFloat((float)b);
    ☃.writeFloat((float)c);
    ☃.writeFloat(d);
    ☃.writeInt(e.size());
    
    int ☃ = (int)a;
    int ☃ = (int)b;
    int ☃ = (int)c;
    for (cj ☃ : e)
    {
      int ☃ = ☃.n() - ☃;
      int ☃ = ☃.o() - ☃;
      int ☃ = ☃.p() - ☃;
      ☃.writeByte(☃);
      ☃.writeByte(☃);
      ☃.writeByte(☃);
    }
    ☃.writeFloat(f);
    ☃.writeFloat(g);
    ☃.writeFloat(h);
  }
  
  public void a(fj ☃)
  {
    ☃.a(this);
  }
  
  public float a()
  {
    return f;
  }
  
  public float b()
  {
    return g;
  }
  
  public float c()
  {
    return h;
  }
  
  public double d()
  {
    return a;
  }
  
  public double e()
  {
    return b;
  }
  
  public double f()
  {
    return c;
  }
  
  public float g()
  {
    return d;
  }
  
  public List<cj> h()
  {
    return e;
  }
}
