import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

public class dp
  extends eb.a
{
  private double b;
  
  dp() {}
  
  public dp(double ☃)
  {
    b = ☃;
  }
  
  void a(DataOutput ☃)
    throws IOException
  {
    ☃.writeDouble(b);
  }
  
  void a(DataInput ☃, int ☃, dw ☃)
    throws IOException
  {
    ☃.a(128L);
    b = ☃.readDouble();
  }
  
  public byte a()
  {
    return 6;
  }
  
  public String toString()
  {
    return "" + b + "d";
  }
  
  public eb b()
  {
    return new dp(b);
  }
  
  public boolean equals(Object ☃)
  {
    if (super.equals(☃))
    {
      dp ☃ = (dp)☃;
      return b == b;
    }
    return false;
  }
  
  public int hashCode()
  {
    long ☃ = Double.doubleToLongBits(b);
    return super.hashCode() ^ (int)(☃ ^ ☃ >>> 32);
  }
  
  public long c()
  {
    return Math.floor(b);
  }
  
  public int d()
  {
    return ns.c(b);
  }
  
  public short e()
  {
    return (short)(ns.c(b) & 0xFFFF);
  }
  
  public byte f()
  {
    return (byte)(ns.c(b) & 0xFF);
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
