import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

public class dr
  extends eb.a
{
  private float b;
  
  dr() {}
  
  public dr(float ☃)
  {
    b = ☃;
  }
  
  void a(DataOutput ☃)
    throws IOException
  {
    ☃.writeFloat(b);
  }
  
  void a(DataInput ☃, int ☃, dw ☃)
    throws IOException
  {
    ☃.a(96L);
    b = ☃.readFloat();
  }
  
  public byte a()
  {
    return 5;
  }
  
  public String toString()
  {
    return "" + b + "f";
  }
  
  public eb b()
  {
    return new dr(b);
  }
  
  public boolean equals(Object ☃)
  {
    if (super.equals(☃))
    {
      dr ☃ = (dr)☃;
      return b == b;
    }
    return false;
  }
  
  public int hashCode()
  {
    return super.hashCode() ^ Float.floatToIntBits(b);
  }
  
  public long c()
  {
    return b;
  }
  
  public int d()
  {
    return ns.d(b);
  }
  
  public short e()
  {
    return (short)(ns.d(b) & 0xFFFF);
  }
  
  public byte f()
  {
    return (byte)(ns.d(b) & 0xFF);
  }
  
  public double g()
  {
    return b;
  }
  
  public float h()
  {
    return b;
  }
}
