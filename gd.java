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
    this.a = ☃;
    this.b = new zx[☃.size()];
    for (int ☃ = 0; ☃ < this.b.length; ☃++)
    {
      zx ☃ = (zx)☃.get(☃);
      this.b[☃] = (☃ == null ? null : ☃.k());
    }
  }
  
  public void a(em ☃)
    throws IOException
  {
    this.a = ☃.readUnsignedByte();
    int ☃ = ☃.readShort();
    this.b = new zx[☃];
    for (int ☃ = 0; ☃ < ☃; ☃++) {
      this.b[☃] = ☃.i();
    }
  }
  
  public void b(em ☃)
    throws IOException
  {
    ☃.writeByte(this.a);
    ☃.writeShort(this.b.length);
    for (zx ☃ : this.b) {
      ☃.a(☃);
    }
  }
  
  public void a(fj ☃)
  {
    ☃.a(this);
  }
  
  public int a()
  {
    return this.a;
  }
  
  public zx[] b()
  {
    return this.b;
  }
}
