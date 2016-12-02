import java.io.IOException;
import org.apache.commons.lang3.Validate;

public class gs
  implements ff<fj>
{
  private String a;
  private int b;
  private int c = Integer.MAX_VALUE;
  private int d;
  private float e;
  private int f;
  
  public gs() {}
  
  public gs(String ☃, double ☃, double ☃, double ☃, float ☃, float ☃)
  {
    Validate.notNull(☃, "name", new Object[0]);
    a = ☃;
    b = ((int)(☃ * 8.0D));
    c = ((int)(☃ * 8.0D));
    d = ((int)(☃ * 8.0D));
    e = ☃;
    f = ((int)(☃ * 63.0F));
    
    ☃ = ns.a(☃, 0.0F, 255.0F);
  }
  
  public void a(em ☃)
    throws IOException
  {
    a = ☃.c(256);
    b = ☃.readInt();
    c = ☃.readInt();
    d = ☃.readInt();
    e = ☃.readFloat();
    f = ☃.readUnsignedByte();
  }
  
  public void b(em ☃)
    throws IOException
  {
    ☃.a(a);
    ☃.writeInt(b);
    ☃.writeInt(c);
    ☃.writeInt(d);
    ☃.writeFloat(e);
    ☃.writeByte(f);
  }
  
  public String a()
  {
    return a;
  }
  
  public double b()
  {
    return b / 8.0F;
  }
  
  public double c()
  {
    return c / 8.0F;
  }
  
  public double d()
  {
    return d / 8.0F;
  }
  
  public float e()
  {
    return e;
  }
  
  public float f()
  {
    return f / 63.0F;
  }
  
  public void a(fj ☃)
  {
    ☃.a(this);
  }
}
