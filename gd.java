import java.io.IOException;
import java.util.List;

public class gd
  implements ff<fj>
{
  private int a;
  private zx[] b;
  
  public gd() {}
  
  public gd(int ☃, List<zx> ☃)
  {
    a = ☃;
    b = new zx[☃.size()];
    for (int ☃ = 0; ☃ < b.length; ☃++)
    {
      zx ☃ = (zx)☃.get(☃);
      b[☃] = (☃ == null ? null : ☃.k());
    }
  }
  
  public void a(em ☃)
    throws IOException
  {
    a = ☃.readUnsignedByte();
    int ☃ = ☃.readShort();
    b = new zx[☃];
    for (int ☃ = 0; ☃ < ☃; ☃++) {
      b[☃] = ☃.i();
    }
  }
  
  public void b(em ☃)
    throws IOException
  {
    ☃.writeByte(a);
    ☃.writeShort(b.length);
    for (zx ☃ : b) {
      ☃.a(☃);
    }
  }
  
  public void a(fj ☃)
  {
    ☃.a(this);
  }
  
  public int a()
  {
    return a;
  }
  
  public zx[] b()
  {
    return b;
  }
}
