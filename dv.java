import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

public class dv
  extends eb.a
{
  private long b;
  
  dv() {}
  
  public dv(long ☃)
  {
    b = ☃;
  }
  
  void a(DataOutput ☃)
    throws IOException
  {
    ☃.writeLong(b);
  }
  
  void a(DataInput ☃, int ☃, dw ☃)
    throws IOException
  {
    ☃.a(128L);
    b = ☃.readLong();
  }
  
  public byte a()
  {
    return 4;
  }
  
  public String toString()
  {
    return "" + b + "L";
  }
  
  public eb b()
  {
    return new dv(b);
  }
  
  public boolean equals(Object ☃)
  {
    if (super.equals(☃))
    {
      dv ☃ = (dv)☃;
      return b == b;
    }
    return false;
  }
  
  public int hashCode()
  {
    return super.hashCode() ^ (int)(b ^ b >>> 32);
  }
  
  public long c()
  {
    return b;
  }
  
  public int d()
  {
    return (int)(b & 0xFFFFFFFFFFFFFFFF);
  }
  
  public short e()
  {
    return (short)(int)(b & 0xFFFF);
  }
  
  public byte f()
  {
    return (byte)(int)(b & 0xFF);
  }
  
  public double g()
  {
    return b;
  }
  
  public float h()
  {
    return (float)b;
  }
}
