import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

public class dt
  extends eb.a
{
  private int b;
  
  dt() {}
  
  public dt(int ☃)
  {
    b = ☃;
  }
  
  void a(DataOutput ☃)
    throws IOException
  {
    ☃.writeInt(b);
  }
  
  void a(DataInput ☃, int ☃, dw ☃)
    throws IOException
  {
    ☃.a(96L);
    b = ☃.readInt();
  }
  
  public byte a()
  {
    return 3;
  }
  
  public String toString()
  {
    return "" + b;
  }
  
  public eb b()
  {
    return new dt(b);
  }
  
  public boolean equals(Object ☃)
  {
    if (super.equals(☃))
    {
      dt ☃ = (dt)☃;
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
    return (short)(b & 0xFFFF);
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
