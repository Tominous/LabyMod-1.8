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
    this.a = ☃;
    this.b = ((int)(☃ * 8.0D));
    this.c = ((int)(☃ * 8.0D));
    this.d = ((int)(☃ * 8.0D));
    this.e = ☃;
    this.f = ((int)(☃ * 63.0F));
    
    ☃ = ns.a(☃, 0.0F, 255.0F);
  }
  
  public void a(em ☃)
    throws IOException
  {
    this.a = ☃.c(256);
    this.b = ☃.readInt();
    this.c = ☃.readInt();
    this.d = ☃.readInt();
    this.e = ☃.readFloat();
    this.f = ☃.readUnsignedByte();
  }
  
  public void b(em ☃)
    throws IOException
  {
    ☃.a(this.a);
    ☃.writeInt(this.b);
    ☃.writeInt(this.c);
    ☃.writeInt(this.d);
    ☃.writeFloat(this.e);
    ☃.writeByte(this.f);
  }
  
  public String a()
  {
    return this.a;
  }
  
  public double b()
  {
    return this.b / 8.0F;
  }
  
  public double c()
  {
    return this.c / 8.0F;
  }
  
  public double d()
  {
    return this.d / 8.0F;
  }
  
  public float e()
  {
    return this.e;
  }
  
  public float f()
  {
    return this.f / 63.0F;
  }
  
  public void a(fj ☃)
  {
    ☃.a(this);
  }
}
