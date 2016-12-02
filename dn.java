import com.google.common.collect.Maps;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.Callable;

public class dn
  extends eb
{
  private Map<String, eb> b = Maps.newHashMap();
  
  void a(DataOutput ☃)
    throws IOException
  {
    for (String ☃ : this.b.keySet())
    {
      eb ☃ = (eb)this.b.get(☃);
      a(☃, ☃, ☃);
    }
    ☃.writeByte(0);
  }
  
  void a(DataInput ☃, int ☃, dw ☃)
    throws IOException
  {
    ☃.a(384L);
    if (☃ > 512) {
      throw new RuntimeException("Tried to read NBT tag with too high complexity, depth > 512");
    }
    this.b.clear();
    byte ☃;
    while ((☃ = a(☃, ☃)) != 0)
    {
      String ☃ = b(☃, ☃);
      ☃.a(224 + 16 * ☃.length());
      
      eb ☃ = a(☃, ☃, ☃, ☃ + 1, ☃);
      if (this.b.put(☃, ☃) != null) {
        ☃.a(288L);
      }
    }
  }
  
  public Set<String> c()
  {
    return this.b.keySet();
  }
  
  public byte a()
  {
    return 10;
  }
  
  public void a(String ☃, eb ☃)
  {
    this.b.put(☃, ☃);
  }
  
  public void a(String ☃, byte ☃)
  {
    this.b.put(☃, new dm(☃));
  }
  
  public void a(String ☃, short ☃)
  {
    this.b.put(☃, new dz(☃));
  }
  
  public void a(String ☃, int ☃)
  {
    this.b.put(☃, new dt(☃));
  }
  
  public void a(String ☃, long ☃)
  {
    this.b.put(☃, new dv(☃));
  }
  
  public void a(String ☃, float ☃)
  {
    this.b.put(☃, new dr(☃));
  }
  
  public void a(String ☃, double ☃)
  {
    this.b.put(☃, new dp(☃));
  }
  
  public void a(String ☃, String ☃)
  {
    this.b.put(☃, new ea(☃));
  }
  
  public void a(String ☃, byte[] ☃)
  {
    this.b.put(☃, new dl(☃));
  }
  
  public void a(String ☃, int[] ☃)
  {
    this.b.put(☃, new ds(☃));
  }
  
  public void a(String ☃, boolean ☃)
  {
    a(☃, (byte)(☃ ? 1 : 0));
  }
  
  public eb a(String ☃)
  {
    return (eb)this.b.get(☃);
  }
  
  public byte b(String ☃)
  {
    eb ☃ = (eb)this.b.get(☃);
    if (☃ != null) {
      return ☃.a();
    }
    return 0;
  }
  
  public boolean c(String ☃)
  {
    return this.b.containsKey(☃);
  }
  
  public boolean b(String ☃, int ☃)
  {
    int ☃ = b(☃);
    if (☃ == ☃) {
      return true;
    }
    if (☃ == 99) {
      return (☃ == 1) || (☃ == 2) || (☃ == 3) || (☃ == 4) || (☃ == 5) || (☃ == 6);
    }
    if (☃ > 0) {}
    return false;
  }
  
  public byte d(String ☃)
  {
    try
    {
      if (!b(☃, 99)) {
        return 0;
      }
      return ((eb.a)this.b.get(☃)).f();
    }
    catch (ClassCastException ☃) {}
    return 0;
  }
  
  public short e(String ☃)
  {
    try
    {
      if (!b(☃, 99)) {
        return 0;
      }
      return ((eb.a)this.b.get(☃)).e();
    }
    catch (ClassCastException ☃) {}
    return 0;
  }
  
  public int f(String ☃)
  {
    try
    {
      if (!b(☃, 99)) {
        return 0;
      }
      return ((eb.a)this.b.get(☃)).d();
    }
    catch (ClassCastException ☃) {}
    return 0;
  }
  
  public long g(String ☃)
  {
    try
    {
      if (!b(☃, 99)) {
        return 0L;
      }
      return ((eb.a)this.b.get(☃)).c();
    }
    catch (ClassCastException ☃) {}
    return 0L;
  }
  
  public float h(String ☃)
  {
    try
    {
      if (!b(☃, 99)) {
        return 0.0F;
      }
      return ((eb.a)this.b.get(☃)).h();
    }
    catch (ClassCastException ☃) {}
    return 0.0F;
  }
  
  public double i(String ☃)
  {
    try
    {
      if (!b(☃, 99)) {
        return 0.0D;
      }
      return ((eb.a)this.b.get(☃)).g();
    }
    catch (ClassCastException ☃) {}
    return 0.0D;
  }
  
  public String j(String ☃)
  {
    try
    {
      if (!b(☃, 8)) {
        return "";
      }
      return ((eb)this.b.get(☃)).a_();
    }
    catch (ClassCastException ☃) {}
    return "";
  }
  
  public byte[] k(String ☃)
  {
    try
    {
      if (!b(☃, 7)) {
        return new byte[0];
      }
      return ((dl)this.b.get(☃)).c();
    }
    catch (ClassCastException ☃)
    {
      throw new e(a(☃, 7, ☃));
    }
  }
  
  public int[] l(String ☃)
  {
    try
    {
      if (!b(☃, 11)) {
        return new int[0];
      }
      return ((ds)this.b.get(☃)).c();
    }
    catch (ClassCastException ☃)
    {
      throw new e(a(☃, 11, ☃));
    }
  }
  
  public dn m(String ☃)
  {
    try
    {
      if (!b(☃, 10)) {
        return new dn();
      }
      return (dn)this.b.get(☃);
    }
    catch (ClassCastException ☃)
    {
      throw new e(a(☃, 10, ☃));
    }
  }
  
  public du c(String ☃, int ☃)
  {
    try
    {
      if (b(☃) != 9) {
        return new du();
      }
      du ☃ = (du)this.b.get(☃);
      if ((☃.c() > 0) && (☃.f() != ☃)) {
        return new du();
      }
      return ☃;
    }
    catch (ClassCastException ☃)
    {
      throw new e(a(☃, 9, ☃));
    }
  }
  
  public boolean n(String ☃)
  {
    return d(☃) != 0;
  }
  
  public void o(String ☃)
  {
    this.b.remove(☃);
  }
  
  public String toString()
  {
    StringBuilder ☃ = new StringBuilder("{");
    for (Map.Entry<String, eb> ☃ : this.b.entrySet())
    {
      if (☃.length() != 1) {
        ☃.append(',');
      }
      ☃.append((String)☃.getKey()).append(':').append(☃.getValue());
    }
    return '}';
  }
  
  public boolean c_()
  {
    return this.b.isEmpty();
  }
  
  private b a(final String ☃, final int ☃, ClassCastException ☃)
  {
    b ☃ = b.a(☃, "Reading NBT data");
    c ☃ = ☃.a("Corrupt NBT tag", 1);
    
    ☃.a("Tag type found", new Callable()
    {
      public String a()
        throws Exception
      {
        return eb.a[((eb)dn.b(dn.this).get(☃)).a()];
      }
    });
    ☃.a("Tag type expected", new Callable()
    {
      public String a()
        throws Exception
      {
        return eb.a[☃];
      }
    });
    ☃.a("Tag name", ☃);
    
    return ☃;
  }
  
  public eb b()
  {
    dn ☃ = new dn();
    for (String ☃ : this.b.keySet()) {
      ☃.a(☃, ((eb)this.b.get(☃)).b());
    }
    return ☃;
  }
  
  public boolean equals(Object ☃)
  {
    if (super.equals(☃))
    {
      dn ☃ = (dn)☃;
      return this.b.entrySet().equals(☃.b.entrySet());
    }
    return false;
  }
  
  public int hashCode()
  {
    return super.hashCode() ^ this.b.hashCode();
  }
  
  private static void a(String ☃, eb ☃, DataOutput ☃)
    throws IOException
  {
    ☃.writeByte(☃.a());
    if (☃.a() == 0) {
      return;
    }
    ☃.writeUTF(☃);
    
    ☃.a(☃);
  }
  
  private static byte a(DataInput ☃, dw ☃)
    throws IOException
  {
    return ☃.readByte();
  }
  
  private static String b(DataInput ☃, dw ☃)
    throws IOException
  {
    return ☃.readUTF();
  }
  
  static eb a(byte ☃, String ☃, DataInput ☃, int ☃, dw ☃)
    throws IOException
  {
    eb ☃ = eb.a(☃);
    try
    {
      ☃.a(☃, ☃, ☃);
    }
    catch (IOException ☃)
    {
      b ☃ = b.a(☃, "Loading NBT data");
      c ☃ = ☃.a("NBT Tag");
      ☃.a("Tag name", ☃);
      ☃.a("Tag type", Byte.valueOf(☃));
      throw new e(☃);
    }
    return ☃;
  }
  
  public void a(dn ☃)
  {
    for (String ☃ : ☃.b.keySet())
    {
      eb ☃ = (eb)☃.b.get(☃);
      if (☃.a() == 10)
      {
        if (b(☃, 10))
        {
          dn ☃ = m(☃);
          ☃.a((dn)☃);
        }
        else
        {
          a(☃, ☃.b());
        }
      }
      else {
        a(☃, ☃.b());
      }
    }
  }
}
