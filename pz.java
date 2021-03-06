import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import org.apache.commons.lang3.ObjectUtils;

public class pz
{
  private final pk a;
  private boolean b = true;
  private static final Map<Class<?>, Integer> c = ;
  
  static
  {
    c.put(Byte.class, Integer.valueOf(0));
    c.put(Short.class, Integer.valueOf(1));
    c.put(Integer.class, Integer.valueOf(2));
    c.put(Float.class, Integer.valueOf(3));
    c.put(String.class, Integer.valueOf(4));
    c.put(zx.class, Integer.valueOf(5));
    c.put(cj.class, Integer.valueOf(6));
    c.put(dc.class, Integer.valueOf(7));
  }
  
  private final Map<Integer, pz.a> d = Maps.newHashMap();
  private boolean e;
  private ReadWriteLock f = new ReentrantReadWriteLock();
  
  public pz(pk ☃)
  {
    this.a = ☃;
  }
  
  public <T> void a(int ☃, T ☃)
  {
    Integer ☃ = (Integer)c.get(☃.getClass());
    if (☃ == null) {
      throw new IllegalArgumentException("Unknown data type: " + ☃.getClass());
    }
    if (☃ > 31) {
      throw new IllegalArgumentException("Data value id is too big with " + ☃ + "! (Max is " + 31 + ")");
    }
    if (this.d.containsKey(Integer.valueOf(☃))) {
      throw new IllegalArgumentException("Duplicate id value for " + ☃ + "!");
    }
    pz.a ☃ = new pz.a(☃.intValue(), ☃, ☃);
    this.f.writeLock().lock();
    this.d.put(Integer.valueOf(☃), ☃);
    this.f.writeLock().unlock();
    this.b = false;
  }
  
  public void a(int ☃, int ☃)
  {
    pz.a ☃ = new pz.a(☃, ☃, null);
    this.f.writeLock().lock();
    this.d.put(Integer.valueOf(☃), ☃);
    this.f.writeLock().unlock();
    this.b = false;
  }
  
  public byte a(int ☃)
  {
    return ((Byte)j(☃).b()).byteValue();
  }
  
  public short b(int ☃)
  {
    return ((Short)j(☃).b()).shortValue();
  }
  
  public int c(int ☃)
  {
    return ((Integer)j(☃).b()).intValue();
  }
  
  public float d(int ☃)
  {
    return ((Float)j(☃).b()).floatValue();
  }
  
  public String e(int ☃)
  {
    return (String)j(☃).b();
  }
  
  public zx f(int ☃)
  {
    return (zx)j(☃).b();
  }
  
  private pz.a j(int ☃)
  {
    this.f.readLock().lock();
    pz.a ☃;
    try
    {
      ☃ = (pz.a)this.d.get(Integer.valueOf(☃));
    }
    catch (Throwable ☃)
    {
      b ☃ = b.a(☃, "Getting synched entity data");
      c ☃ = ☃.a("Synched entity data");
      
      ☃.a("Data ID", Integer.valueOf(☃));
      throw new e(☃);
    }
    this.f.readLock().unlock();
    return ☃;
  }
  
  public dc h(int ☃)
  {
    return (dc)j(☃).b();
  }
  
  public <T> void b(int ☃, T ☃)
  {
    pz.a ☃ = j(☃);
    if (ObjectUtils.notEqual(☃, ☃.b()))
    {
      ☃.a(☃);
      this.a.i(☃);
      ☃.a(true);
      this.e = true;
    }
  }
  
  public void i(int ☃)
  {
    pz.a.a(j(☃), true);
    this.e = true;
  }
  
  public boolean a()
  {
    return this.e;
  }
  
  public static void a(List<pz.a> ☃, em ☃)
    throws IOException
  {
    if (☃ != null) {
      for (pz.a ☃ : ☃) {
        a(☃, ☃);
      }
    }
    ☃.writeByte(127);
  }
  
  public List<pz.a> b()
  {
    List<pz.a> ☃ = null;
    if (this.e)
    {
      this.f.readLock().lock();
      for (pz.a ☃ : this.d.values()) {
        if (☃.d())
        {
          ☃.a(false);
          if (☃ == null) {
            ☃ = Lists.newArrayList();
          }
          ☃.add(☃);
        }
      }
      this.f.readLock().unlock();
    }
    this.e = false;
    
    return ☃;
  }
  
  public void a(em ☃)
    throws IOException
  {
    this.f.readLock().lock();
    for (pz.a ☃ : this.d.values()) {
      a(☃, ☃);
    }
    this.f.readLock().unlock();
    
    ☃.writeByte(127);
  }
  
  public List<pz.a> c()
  {
    List<pz.a> ☃ = null;
    
    this.f.readLock().lock();
    for (pz.a ☃ : this.d.values())
    {
      if (☃ == null) {
        ☃ = Lists.newArrayList();
      }
      ☃.add(☃);
    }
    this.f.readLock().unlock();
    
    return ☃;
  }
  
  private static void a(em ☃, pz.a ☃)
    throws IOException
  {
    int ☃ = (☃.c() << 5 | ☃.a() & 0x1F) & 0xFF;
    ☃.writeByte(☃);
    switch (☃.c())
    {
    case 0: 
      ☃.writeByte(((Byte)☃.b()).byteValue());
      break;
    case 1: 
      ☃.writeShort(((Short)☃.b()).shortValue());
      break;
    case 2: 
      ☃.writeInt(((Integer)☃.b()).intValue());
      break;
    case 3: 
      ☃.writeFloat(((Float)☃.b()).floatValue());
      break;
    case 4: 
      ☃.a((String)☃.b());
      break;
    case 5: 
      zx ☃ = (zx)☃.b();
      ☃.a(☃);
      break;
    case 6: 
      cj ☃ = (cj)☃.b();
      ☃.writeInt(☃.n());
      ☃.writeInt(☃.o());
      ☃.writeInt(☃.p());
      break;
    case 7: 
      dc ☃ = (dc)☃.b();
      ☃.writeFloat(☃.b());
      ☃.writeFloat(☃.c());
      ☃.writeFloat(☃.d());
    }
  }
  
  public static List<pz.a> b(em ☃)
    throws IOException
  {
    List<pz.a> ☃ = null;
    
    int ☃ = ☃.readByte();
    while (☃ != 127)
    {
      if (☃ == null) {
        ☃ = Lists.newArrayList();
      }
      int ☃ = (☃ & 0xE0) >> 5;
      int ☃ = ☃ & 0x1F;
      
      pz.a ☃ = null;
      switch (☃)
      {
      case 0: 
        ☃ = new pz.a(☃, ☃, Byte.valueOf(☃.readByte()));
        break;
      case 1: 
        ☃ = new pz.a(☃, ☃, Short.valueOf(☃.readShort()));
        break;
      case 2: 
        ☃ = new pz.a(☃, ☃, Integer.valueOf(☃.readInt()));
        break;
      case 3: 
        ☃ = new pz.a(☃, ☃, Float.valueOf(☃.readFloat()));
        break;
      case 4: 
        ☃ = new pz.a(☃, ☃, ☃.c(32767));
        break;
      case 5: 
        ☃ = new pz.a(☃, ☃, ☃.i());
        break;
      case 6: 
        int ☃ = ☃.readInt();
        int ☃ = ☃.readInt();
        int ☃ = ☃.readInt();
        ☃ = new pz.a(☃, ☃, new cj(☃, ☃, ☃));
        break;
      case 7: 
        float ☃ = ☃.readFloat();
        float ☃ = ☃.readFloat();
        float ☃ = ☃.readFloat();
        ☃ = new pz.a(☃, ☃, new dc(☃, ☃, ☃));
      }
      ☃.add(☃);
      
      ☃ = ☃.readByte();
    }
    return ☃;
  }
  
  public void a(List<pz.a> ☃)
  {
    this.f.writeLock().lock();
    for (pz.a ☃ : ☃)
    {
      pz.a ☃ = (pz.a)this.d.get(Integer.valueOf(☃.a()));
      if (☃ != null)
      {
        ☃.a(☃.b());
        this.a.i(☃.a());
      }
    }
    this.f.writeLock().unlock();
    
    this.e = true;
  }
  
  public boolean d()
  {
    return this.b;
  }
  
  public void e()
  {
    this.e = false;
  }
  
  public static class a
  {
    private final int a;
    private final int b;
    private Object c;
    private boolean d;
    
    public a(int ☃, int ☃, Object ☃)
    {
      this.b = ☃;
      this.c = ☃;
      this.a = ☃;
      this.d = true;
    }
    
    public int a()
    {
      return this.b;
    }
    
    public void a(Object ☃)
    {
      this.c = ☃;
    }
    
    public Object b()
    {
      return this.c;
    }
    
    public int c()
    {
      return this.a;
    }
    
    public boolean d()
    {
      return this.d;
    }
    
    public void a(boolean ☃)
    {
      this.d = ☃;
    }
  }
}
