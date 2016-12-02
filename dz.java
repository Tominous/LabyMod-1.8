import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

public class dz
  extends eb.a
{
  private short b;
  
  public dz() {}
  
  public dz(short ☃)
  {
    b = ☃;
  }
  
  void a(DataOutput ☃)
    throws IOException
  {
    ☃.writeShort(b);
  }
  
  void a(DataInput ☃, int ☃, dw ☃)
    throws IOException
  {
    ☃.a(80L);
    b = ☃.readShort();
  }
  
  public byte a()
  {
    return 2;
  }
  
  public String toString()
  {
    return "" + b + "s";
  }
  
  public eb b()
  {
    return new dz(b);
  }
  
  public boolean equals(Object ☃)
  {
    if (super.equals(☃))
    {
      dz ☃ = (dz)☃;
      return b == b;
    }
    return false;
  }
  
  public int hashCode()
  {
    return super.hashCode() ^ b;
  }
  
  public long c()
  {
    return b;
  }
  
  public int d()
  {
    return b;
  }
  
  public short e()
  {
    return b;
  }
  
  public byte f()
  {
    return (byte)(b & 0xFF);
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
