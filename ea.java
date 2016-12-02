import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

public class ea
  extends eb
{
  private String b;
  
  public ea()
  {
    b = "";
  }
  
  public ea(String ☃)
  {
    b = ☃;
    if (☃ == null) {
      throw new IllegalArgumentException("Empty string not allowed");
    }
  }
  
  void a(DataOutput ☃)
    throws IOException
  {
    ☃.writeUTF(b);
  }
  
  void a(DataInput ☃, int ☃, dw ☃)
    throws IOException
  {
    ☃.a(288L);
    
    b = ☃.readUTF();
    ☃.a(16 * b.length());
  }
  
  public byte a()
  {
    return 8;
  }
  
  public String toString()
  {
    return "\"" + b.replace("\"", "\\\"") + "\"";
  }
  
  public eb b()
  {
    return new ea(b);
  }
  
  public boolean c_()
  {
    return b.isEmpty();
  }
  
  public boolean equals(Object ☃)
  {
    if (super.equals(☃))
    {
      ea ☃ = (ea)☃;
      return ((b == null) && (b == null)) || ((b != null) && (b.equals(b)));
    }
    return false;
  }
  
  public int hashCode()
  {
    return super.hashCode() ^ b.hashCode();
  }
  
  public String a_()
  {
    return b;
  }
}
