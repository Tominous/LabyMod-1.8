import java.io.IOException;
import java.util.List;

public class gp
  implements ff<fj>
{
  private int[] a;
  private int[] b;
  private go.a[] c;
  private boolean d;
  
  public gp() {}
  
  public gp(List<amy> ☃)
  {
    int ☃ = ☃.size();
    
    this.a = new int[☃];
    this.b = new int[☃];
    this.c = new go.a[☃];
    this.d = (!((amy)☃.get(0)).p().t.o());
    for (int ☃ = 0; ☃ < ☃; ☃++)
    {
      amy ☃ = (amy)☃.get(☃);
      go.a ☃ = go.a(☃, true, this.d, 65535);
      
      this.a[☃] = ☃.a;
      this.b[☃] = ☃.b;
      this.c[☃] = ☃;
    }
  }
  
  public void a(em ☃)
    throws IOException
  {
    this.d = ☃.readBoolean();
    
    int ☃ = ☃.e();
    this.a = new int[☃];
    this.b = new int[☃];
    this.c = new go.a[☃];
    for (int ☃ = 0; ☃ < ☃; ☃++)
    {
      this.a[☃] = ☃.readInt();
      this.b[☃] = ☃.readInt();
      this.c[☃] = new go.a();
      this.c[☃].b = (☃.readShort() & 0xFFFF);
      this.c[☃].a = new byte[go.a(Integer.bitCount(this.c[☃].b), this.d, true)];
    }
    for (int ☃ = 0; ☃ < ☃; ☃++) {
      ☃.readBytes(this.c[☃].a);
    }
  }
  
  public void b(em ☃)
    throws IOException
  {
    ☃.writeBoolean(this.d);
    ☃.b(this.c.length);
    for (int ☃ = 0; ☃ < this.a.length; ☃++)
    {
      ☃.writeInt(this.a[☃]);
      ☃.writeInt(this.b[☃]);
      ☃.writeShort((short)(this.c[☃].b & 0xFFFF));
    }
    for (int ☃ = 0; ☃ < this.a.length; ☃++) {
      ☃.writeBytes(this.c[☃].a);
    }
  }
  
  public void a(fj ☃)
  {
    ☃.a(this);
  }
  
  public int a(int ☃)
  {
    return this.a[☃];
  }
  
  public int b(int ☃)
  {
    return this.b[☃];
  }
  
  public int a()
  {
    return this.a.length;
  }
  
  public byte[] c(int ☃)
  {
    return this.c[☃].a;
  }
  
  public int d(int ☃)
  {
    return this.c[☃].b;
  }
}
