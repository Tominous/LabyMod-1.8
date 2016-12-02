import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.util.Arrays;

public class ds
  extends eb
{
  private int[] b;
  
  ds() {}
  
  public ds(int[] ☃)
  {
    b = ☃;
  }
  
  void a(DataOutput ☃)
    throws IOException
  {
    ☃.writeInt(b.length);
    for (int ☃ = 0; ☃ < b.length; ☃++) {
      ☃.writeInt(b[☃]);
    }
  }
  
  void a(DataInput ☃, int ☃, dw ☃)
    throws IOException
  {
    ☃.a(192L);
    
    int ☃ = ☃.readInt();
    ☃.a(32 * ☃);
    b = new int[☃];
    for (int ☃ = 0; ☃ < ☃; ☃++) {
      b[☃] = ☃.readInt();
    }
  }
  
  public byte a()
  {
    return 11;
  }
  
  public String toString()
  {
    String ☃ = "[";
    for (int ☃ : b) {
      ☃ = ☃ + ☃ + ",";
    }
    return ☃ + "]";
  }
  
  public eb b()
  {
    int[] ☃ = new int[b.length];
    System.arraycopy(b, 0, ☃, 0, b.length);
    return new ds(☃);
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
  
  public int[] c()
  {
    return b;
  }
}
