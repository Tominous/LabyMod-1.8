import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

public class dm
  extends eb.a
{
  private byte b;
  
  dm() {}
  
  public dm(byte ☃)
  {
    b = ☃;
  }
  
  void a(DataOutput ☃)
    throws IOException
  {
    ☃.writeByte(b);
  }
  
  void a(DataInput ☃, int ☃, dw ☃)
    throws IOException
  {
    ☃.a(72L);
    b = ☃.readByte();
  }
  
  public byte a()
  {
    return 1;
  }
  
  public String toString()
  {
    return "" + b + "b";
  }
  
  public eb b()
  {
    return new dm(b);
  }
  
  public boolean equals(Object ☃)
  {
    if (super.equals(☃))
    {
      dm ☃ = (dm)☃;
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
    return (short)b;
  }
  
  public byte f()
  {
    return b;
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
