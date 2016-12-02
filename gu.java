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
    a = ☃;
    b = ☃;
    c = ((atf[])☃.toArray(new atf[☃.size()]));
    d = ☃;
    e = ☃;
    f = ☃;
    g = ☃;
    
    h = new byte[☃ * ☃];
    for (int ☃ = 0; ☃ < ☃; ☃++) {
      for (int ☃ = 0; ☃ < ☃; ☃++) {
        h[(☃ + ☃ * ☃)] = ☃[(☃ + ☃ + (☃ + ☃) * 128)];
      }
    }
  }
  
  public void a(em ☃)
    throws IOException
  {
    a = ☃.e();
    b = ☃.readByte();
    c = new atf[☃.e()];
    for (int ☃ = 0; ☃ < c.length; ☃++)
    {
      short ☃ = (short)☃.readByte();
      c[☃] = new atf((byte)(☃ >> 4 & 0xF), ☃.readByte(), ☃.readByte(), (byte)(☃ & 0xF));
    }
    f = ☃.readUnsignedByte();
    if (f > 0)
    {
      g = ☃.readUnsignedByte();
      d = ☃.readUnsignedByte();
      e = ☃.readUnsignedByte();
      h = ☃.a();
    }
  }
  
  public void b(em ☃)
    throws IOException
  {
    ☃.b(a);
    ☃.writeByte(b);
    ☃.b(c.length);
    for (atf ☃ : c)
    {
      ☃.writeByte((☃.a() & 0xF) << 4 | ☃.d() & 0xF);
      ☃.writeByte(☃.b());
      ☃.writeByte(☃.c());
    }
    ☃.writeByte(f);
    if (f > 0)
    {
      ☃.writeByte(g);
      ☃.writeByte(d);
      ☃.writeByte(e);
      ☃.a(h);
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
  
  public void a(atg ☃)
  {
    e = b;
    h.clear();
    for (int ☃ = 0; ☃ < c.length; ☃++)
    {
      atf ☃ = c[☃];
      h.put("icon-" + ☃, ☃);
    }
    for (int ☃ = 0; ☃ < f; ☃++) {
      for (int ☃ = 0; ☃ < g; ☃++) {
        f[(d + ☃ + (e + ☃) * 128)] = h[(☃ + ☃ * f)];
      }
    }
  }
}
