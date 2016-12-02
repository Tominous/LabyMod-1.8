import java.io.IOException;
import java.util.Collection;
import java.util.Map;

public class gu
  implements ff<fj>
{
  private int a;
  private byte b;
  private atf[] c;
  private int d;
  private int e;
  private int f;
  private int g;
  private byte[] h;
  
  public gu() {}
  
  public gu(int ☃, byte ☃, Collection<atf> ☃, byte[] ☃, int ☃, int ☃, int ☃, int ☃)
  {
    this.a = ☃;
    this.b = ☃;
    this.c = ((atf[])☃.toArray(new atf[☃.size()]));
    this.d = ☃;
    this.e = ☃;
    this.f = ☃;
    this.g = ☃;
    
    this.h = new byte[☃ * ☃];
    for (int ☃ = 0; ☃ < ☃; ☃++) {
      for (int ☃ = 0; ☃ < ☃; ☃++) {
        this.h[(☃ + ☃ * ☃)] = ☃[(☃ + ☃ + (☃ + ☃) * 128)];
      }
    }
  }
  
  public void a(em ☃)
    throws IOException
  {
    this.a = ☃.e();
    this.b = ☃.readByte();
    this.c = new atf[☃.e()];
    for (int ☃ = 0; ☃ < this.c.length; ☃++)
    {
      short ☃ = (short)☃.readByte();
      this.c[☃] = new atf((byte)(☃ >> 4 & 0xF), ☃.readByte(), ☃.readByte(), (byte)(☃ & 0xF));
    }
    this.f = ☃.readUnsignedByte();
    if (this.f > 0)
    {
      this.g = ☃.readUnsignedByte();
      this.d = ☃.readUnsignedByte();
      this.e = ☃.readUnsignedByte();
      this.h = ☃.a();
    }
  }
  
  public void b(em ☃)
    throws IOException
  {
    ☃.b(this.a);
    ☃.writeByte(this.b);
    ☃.b(this.c.length);
    for (atf ☃ : this.c)
    {
      ☃.writeByte((☃.a() & 0xF) << 4 | ☃.d() & 0xF);
      ☃.writeByte(☃.b());
      ☃.writeByte(☃.c());
    }
    ☃.writeByte(this.f);
    if (this.f > 0)
    {
      ☃.writeByte(this.g);
      ☃.writeByte(this.d);
      ☃.writeByte(this.e);
      ☃.a(this.h);
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
  
  public void a(atg ☃)
  {
    ☃.e = this.b;
    ☃.h.clear();
    for (int ☃ = 0; ☃ < this.c.length; ☃++)
    {
      atf ☃ = this.c[☃];
      ☃.h.put("icon-" + ☃, ☃);
    }
    for (int ☃ = 0; ☃ < this.f; ☃++) {
      for (int ☃ = 0; ☃ < this.g; ☃++) {
        ☃.f[(this.d + ☃ + (this.e + ☃) * 128)] = this.h[(☃ + ☃ * this.f)];
      }
    }
  }
}
