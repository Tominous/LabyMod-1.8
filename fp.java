import com.mojang.authlib.GameProfile;
import java.io.IOException;
import java.util.List;
import java.util.UUID;

public class fp
  implements ff<fj>
{
  private int a;
  private UUID b;
  private int c;
  private int d;
  private int e;
  private byte f;
  private byte g;
  private int h;
  private pz i;
  private List<pz.a> j;
  
  public fp() {}
  
  public fp(wn ☃)
  {
    this.a = ☃.F();
    this.b = ☃.cd().getId();
    this.c = ns.c(☃.s * 32.0D);
    this.d = ns.c(☃.t * 32.0D);
    this.e = ns.c(☃.u * 32.0D);
    this.f = ((byte)(int)(☃.y * 256.0F / 360.0F));
    this.g = ((byte)(int)(☃.z * 256.0F / 360.0F));
    
    zx ☃ = ☃.bi.h();
    this.h = (☃ == null ? 0 : zw.b(☃.b()));
    
    this.i = ☃.H();
  }
  
  public void a(em ☃)
    throws IOException
  {
    this.a = ☃.e();
    this.b = ☃.g();
    this.c = ☃.readInt();
    this.d = ☃.readInt();
    this.e = ☃.readInt();
    this.f = ☃.readByte();
    this.g = ☃.readByte();
    this.h = ☃.readShort();
    this.j = pz.b(☃);
  }
  
  public void b(em ☃)
    throws IOException
  {
    ☃.b(this.a);
    ☃.a(this.b);
    ☃.writeInt(this.c);
    ☃.writeInt(this.d);
    ☃.writeInt(this.e);
    ☃.writeByte(this.f);
    ☃.writeByte(this.g);
    ☃.writeShort(this.h);
    this.i.a(☃);
  }
  
  public void a(fj ☃)
  {
    ☃.a(this);
  }
  
  public List<pz.a> a()
  {
    if (this.j == null) {
      this.j = this.i.c();
    }
    return this.j;
  }
  
  public int b()
  {
    return this.a;
  }
  
  public UUID c()
  {
    return this.b;
  }
  
  public int d()
  {
    return this.c;
  }
  
  public int e()
  {
    return this.d;
  }
  
  public int f()
  {
    return this.e;
  }
  
  public byte g()
  {
    return this.f;
  }
  
  public byte h()
  {
    return this.g;
  }
  
  public int i()
  {
    return this.h;
  }
}
