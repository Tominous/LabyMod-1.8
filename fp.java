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
    a = ☃.F();
    b = ☃.cd().getId();
    c = ns.c(s * 32.0D);
    d = ns.c(t * 32.0D);
    e = ns.c(u * 32.0D);
    f = ((byte)(int)(y * 256.0F / 360.0F));
    g = ((byte)(int)(z * 256.0F / 360.0F));
    
    zx ☃ = bi.h();
    h = (☃ == null ? 0 : zw.b(☃.b()));
    
    i = ☃.H();
  }
  
  public void a(em ☃)
    throws IOException
  {
    a = ☃.e();
    b = ☃.g();
    c = ☃.readInt();
    d = ☃.readInt();
    e = ☃.readInt();
    f = ☃.readByte();
    g = ☃.readByte();
    h = ☃.readShort();
    j = pz.b(☃);
  }
  
  public void b(em ☃)
    throws IOException
  {
    ☃.b(a);
    ☃.a(b);
    ☃.writeInt(c);
    ☃.writeInt(d);
    ☃.writeInt(e);
    ☃.writeByte(f);
    ☃.writeByte(g);
    ☃.writeShort(h);
    i.a(☃);
  }
  
  public void a(fj ☃)
  {
    ☃.a(this);
  }
  
  public List<pz.a> a()
  {
    if (j == null) {
      j = i.c();
    }
    return j;
  }
  
  public int b()
  {
    return a;
  }
  
  public UUID c()
  {
    return b;
  }
  
  public int d()
  {
    return c;
  }
  
  public int e()
  {
    return d;
  }
  
  public int f()
  {
    return e;
  }
  
  public byte g()
  {
    return f;
  }
  
  public byte h()
  {
    return g;
  }
  
  public int i()
  {
    return h;
  }
}
