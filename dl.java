import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.util.Arrays;

public class dl
  extends eb
{
  private byte[] b;
  
  dl() {}
  
  public dl(byte[] ☃)
  {
    b = ☃;
  }
  
  void a(DataOutput ☃)
    throws IOException
  {
    ☃.writeInt(b.length);
    ☃.write(b);
  }
  
  void a(DataInput ☃, int ☃, dw ☃)
    throws IOException
  {
    ☃.a(192L);
    int ☃ = ☃.readInt();
    ☃.a(8 * ☃);
    b = new byte[☃];
    ☃.readFully(b);
  }
  
  public byte a()
  {
    return 7;
  }
  
  public String toString()
  {
    return "[" + b.length + " bytes]";
  }
  
  public eb b()
  {
    byte[] ☃ = new byte[b.length];
    System.arraycopy(b, 0, ☃, 0, b.length);
    return new dl(☃);
  }
  
  public boolean equals(Object ☃)
  {
    if (super.equals(☃)) {
      return Arrays.equals(b, b);
    }
    return false;
  }
  
  public int hashCode()
  {
    return super.hashCode() ^ Arrays.hashCode(b);
  }
  
  public byte[] c()
  {
    return b;
  }
}
