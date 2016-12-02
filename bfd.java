import com.google.common.primitives.Floats;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.nio.ShortBuffer;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Comparator;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class bfd
{
  private ByteBuffer a;
  private IntBuffer b;
  private ShortBuffer c;
  private FloatBuffer d;
  private int e;
  private bmv f;
  private int g;
  private boolean h;
  private int i;
  private double j;
  private double k;
  private double l;
  private bmu m;
  private boolean n;
  
  public bfd(int ☃)
  {
    this.a = avd.c(☃ * 4);
    this.b = this.a.asIntBuffer();
    this.c = this.a.asShortBuffer();
    this.d = this.a.asFloatBuffer();
  }
  
  private void b(int ☃)
  {
    if (☃ <= this.b.remaining()) {
      return;
    }
    int ☃ = this.a.capacity();
    int ☃ = ☃ % 2097152;
    int ☃ = ☃ + (((this.b.position() + ☃) * 4 - ☃) / 2097152 + 1) * 2097152;
    
    LogManager.getLogger().warn("Needed to grow BufferBuilder buffer: Old size " + ☃ + " bytes, new size " + ☃ + " bytes.");
    
    int ☃ = this.b.position();
    
    ByteBuffer ☃ = avd.c(☃);
    this.a.position(0);
    ☃.put(this.a);
    ☃.rewind();
    
    this.a = ☃;
    this.d = this.a.asFloatBuffer().asReadOnlyBuffer();
    this.b = this.a.asIntBuffer();
    this.b.position(☃);
    this.c = this.a.asShortBuffer();
    this.c.position(☃ << 1);
  }
  
  public void a(float ☃, float ☃, float ☃)
  {
    int ☃ = this.e / 4;
    final float[] ☃ = new float[☃];
    for (int ☃ = 0; ☃ < ☃; ☃++) {
      ☃[☃] = a(this.d, (float)(☃ + this.j), (float)(☃ + this.k), (float)(☃ + this.l), this.m.f(), ☃ * this.m.g());
    }
    Integer[] ☃ = new Integer[☃];
    for (int ☃ = 0; ☃ < ☃.length; ☃++) {
      ☃[☃] = Integer.valueOf(☃);
    }
    Arrays.sort(☃, new Comparator()
    {
      public int a(Integer ☃, Integer ☃)
      {
        return Floats.compare(☃[☃.intValue()], ☃[☃.intValue()]);
      }
    });
    BitSet ☃ = new BitSet();
    
    int ☃ = this.m.g();
    int[] ☃ = new int[☃];
    
    int ☃ = 0;
    while ((☃ = ☃.nextClearBit(☃)) < ☃.length)
    {
      int ☃ = ☃[☃].intValue();
      if (☃ != ☃)
      {
        this.b.limit(☃ * ☃ + ☃);
        this.b.position(☃ * ☃);
        this.b.get(☃);
        
        int ☃ = ☃;
        int ☃ = ☃[☃].intValue();
        while (☃ != ☃)
        {
          this.b.limit(☃ * ☃ + ☃);
          this.b.position(☃ * ☃);
          IntBuffer ☃ = this.b.slice();
          
          this.b.limit(☃ * ☃ + ☃);
          this.b.position(☃ * ☃);
          this.b.put(☃);
          
          ☃.set(☃);
          
          ☃ = ☃;
          ☃ = ☃[☃].intValue();
        }
        this.b.limit(☃ * ☃ + ☃);
        this.b.position(☃ * ☃);
        this.b.put(☃);
      }
      ☃.set(☃);
      
      ☃++;
    }
  }
  
  public bfd.a a()
  {
    this.b.rewind();
    int ☃ = j();
    this.b.limit(☃);
    
    int[] ☃ = new int[☃];
    this.b.get(☃);
    
    this.b.limit(this.b.capacity());
    this.b.position(☃);
    
    return new bfd.a(☃, new bmu(this.m));
  }
  
  private int j()
  {
    return this.e * this.m.f();
  }
  
  private static float a(FloatBuffer ☃, float ☃, float ☃, float ☃, int ☃, int ☃)
  {
    float ☃ = ☃.get(☃ + ☃ * 0 + 0);
    float ☃ = ☃.get(☃ + ☃ * 0 + 1);
    float ☃ = ☃.get(☃ + ☃ * 0 + 2);
    float ☃ = ☃.get(☃ + ☃ * 1 + 0);
    float ☃ = ☃.get(☃ + ☃ * 1 + 1);
    float ☃ = ☃.get(☃ + ☃ * 1 + 2);
    float ☃ = ☃.get(☃ + ☃ * 2 + 0);
    float ☃ = ☃.get(☃ + ☃ * 2 + 1);
    float ☃ = ☃.get(☃ + ☃ * 2 + 2);
    float ☃ = ☃.get(☃ + ☃ * 3 + 0);
    float ☃ = ☃.get(☃ + ☃ * 3 + 1);
    float ☃ = ☃.get(☃ + ☃ * 3 + 2);
    
    float ☃ = (☃ + ☃ + ☃ + ☃) * 0.25F - ☃;
    float ☃ = (☃ + ☃ + ☃ + ☃) * 0.25F - ☃;
    float ☃ = (☃ + ☃ + ☃ + ☃) * 0.25F - ☃;
    
    return ☃ * ☃ + ☃ * ☃ + ☃ * ☃;
  }
  
  public void a(bfd.a ☃)
  {
    this.b.clear();
    b(☃.a().length);
    
    this.b.put(☃.a());
    
    this.e = ☃.b();
    this.m = new bmu(☃.c());
  }
  
  public void b()
  {
    this.e = 0;
    this.f = null;
    this.g = 0;
  }
  
  public void a(int ☃, bmu ☃)
  {
    if (this.n) {
      throw new IllegalStateException("Already building!");
    }
    this.n = true;
    
    b();
    this.i = ☃;
    this.m = ☃;
    this.f = ☃.c(this.g);
    this.h = false;
    this.a.limit(this.a.capacity());
  }
  
  public bfd a(double ☃, double ☃)
  {
    int ☃ = this.e * this.m.g() + this.m.d(this.g);
    switch (bfd.2.a[this.f.a().ordinal()])
    {
    case 1: 
      this.a.putFloat(☃, (float)☃);
      this.a.putFloat(☃ + 4, (float)☃);
      break;
    case 2: 
    case 3: 
      this.a.putInt(☃, (int)☃);
      this.a.putInt(☃ + 4, (int)☃);
      break;
    case 4: 
    case 5: 
      this.a.putShort(☃, (short)(int)☃);
      this.a.putShort(☃ + 2, (short)(int)☃);
      break;
    case 6: 
    case 7: 
      this.a.put(☃, (byte)(int)☃);
      this.a.put(☃ + 1, (byte)(int)☃);
    }
    k();
    return this;
  }
  
  public bfd a(int ☃, int ☃)
  {
    int ☃ = this.e * this.m.g() + this.m.d(this.g);
    switch (bfd.2.a[this.f.a().ordinal()])
    {
    case 1: 
      this.a.putFloat(☃, ☃);
      this.a.putFloat(☃ + 4, ☃);
      break;
    case 2: 
    case 3: 
      this.a.putInt(☃, ☃);
      this.a.putInt(☃ + 4, ☃);
      break;
    case 4: 
    case 5: 
      this.a.putShort(☃, (short)☃);
      this.a.putShort(☃ + 2, (short)☃);
      break;
    case 6: 
    case 7: 
      this.a.put(☃, (byte)☃);
      this.a.put(☃ + 1, (byte)☃);
    }
    k();
    return this;
  }
  
  public void a(int ☃, int ☃, int ☃, int ☃)
  {
    int ☃ = (this.e - 4) * this.m.f() + this.m.b(1) / 4;
    int ☃ = this.m.g() >> 2;
    this.b.put(☃, ☃);
    this.b.put(☃ + ☃, ☃);
    this.b.put(☃ + ☃ * 2, ☃);
    this.b.put(☃ + ☃ * 3, ☃);
  }
  
  public void a(double ☃, double ☃, double ☃)
  {
    int ☃ = this.m.f();
    int ☃ = (this.e - 4) * ☃;
    for (int ☃ = 0; ☃ < 4; ☃++)
    {
      int ☃ = ☃ + ☃ * ☃;
      int ☃ = ☃ + 1;
      int ☃ = ☃ + 1;
      this.b.put(☃, Float.floatToRawIntBits((float)(☃ + this.j) + Float.intBitsToFloat(this.b.get(☃))));
      this.b.put(☃, Float.floatToRawIntBits((float)(☃ + this.k) + Float.intBitsToFloat(this.b.get(☃))));
      this.b.put(☃, Float.floatToRawIntBits((float)(☃ + this.l) + Float.intBitsToFloat(this.b.get(☃))));
    }
  }
  
  private int c(int ☃)
  {
    return ((this.e - ☃) * this.m.g() + this.m.e()) / 4;
  }
  
  public void a(float ☃, float ☃, float ☃, int ☃)
  {
    int ☃ = c(☃);
    int ☃ = -1;
    if (!this.h)
    {
      ☃ = this.b.get(☃);
      if (ByteOrder.nativeOrder() == ByteOrder.LITTLE_ENDIAN)
      {
        int ☃ = (int)((☃ & 0xFF) * ☃);
        int ☃ = (int)((☃ >> 8 & 0xFF) * ☃);
        int ☃ = (int)((☃ >> 16 & 0xFF) * ☃);
        ☃ &= 0xFF000000;
        ☃ |= ☃ << 16 | ☃ << 8 | ☃;
      }
      else
      {
        int ☃ = (int)((☃ >> 24 & 0xFF) * ☃);
        int ☃ = (int)((☃ >> 16 & 0xFF) * ☃);
        int ☃ = (int)((☃ >> 8 & 0xFF) * ☃);
        ☃ &= 0xFF;
        ☃ |= ☃ << 24 | ☃ << 16 | ☃ << 8;
      }
    }
    this.b.put(☃, ☃);
  }
  
  private void b(int ☃, int ☃)
  {
    int ☃ = c(☃);
    int ☃ = ☃ >> 16 & 0xFF;
    int ☃ = ☃ >> 8 & 0xFF;
    int ☃ = ☃ & 0xFF;
    int ☃ = ☃ >> 24 & 0xFF;
    a(☃, ☃, ☃, ☃, ☃);
  }
  
  public void b(float ☃, float ☃, float ☃, int ☃)
  {
    int ☃ = c(☃);
    int ☃ = ns.a((int)(☃ * 255.0F), 0, 255);
    int ☃ = ns.a((int)(☃ * 255.0F), 0, 255);
    int ☃ = ns.a((int)(☃ * 255.0F), 0, 255);
    a(☃, ☃, ☃, ☃, 255);
  }
  
  private void a(int ☃, int ☃, int ☃, int ☃, int ☃)
  {
    if (ByteOrder.nativeOrder() == ByteOrder.LITTLE_ENDIAN) {
      this.b.put(☃, ☃ << 24 | ☃ << 16 | ☃ << 8 | ☃);
    } else {
      this.b.put(☃, ☃ << 24 | ☃ << 16 | ☃ << 8 | ☃);
    }
  }
  
  public void c()
  {
    this.h = true;
  }
  
  public bfd a(float ☃, float ☃, float ☃, float ☃)
  {
    return b((int)(☃ * 255.0F), (int)(☃ * 255.0F), (int)(☃ * 255.0F), (int)(☃ * 255.0F));
  }
  
  public bfd b(int ☃, int ☃, int ☃, int ☃)
  {
    if (this.h) {
      return this;
    }
    int ☃ = this.e * this.m.g() + this.m.d(this.g);
    switch (bfd.2.a[this.f.a().ordinal()])
    {
    case 1: 
      this.a.putFloat(☃, ☃ / 255.0F);
      this.a.putFloat(☃ + 4, ☃ / 255.0F);
      this.a.putFloat(☃ + 8, ☃ / 255.0F);
      this.a.putFloat(☃ + 12, ☃ / 255.0F);
      break;
    case 2: 
    case 3: 
      this.a.putFloat(☃, ☃);
      this.a.putFloat(☃ + 4, ☃);
      this.a.putFloat(☃ + 8, ☃);
      this.a.putFloat(☃ + 12, ☃);
      break;
    case 4: 
    case 5: 
      this.a.putShort(☃, (short)☃);
      this.a.putShort(☃ + 2, (short)☃);
      this.a.putShort(☃ + 4, (short)☃);
      this.a.putShort(☃ + 6, (short)☃);
      break;
    case 6: 
    case 7: 
      if (ByteOrder.nativeOrder() == ByteOrder.LITTLE_ENDIAN)
      {
        this.a.put(☃, (byte)☃);
        this.a.put(☃ + 1, (byte)☃);
        this.a.put(☃ + 2, (byte)☃);
        this.a.put(☃ + 3, (byte)☃);
      }
      else
      {
        this.a.put(☃, (byte)☃);
        this.a.put(☃ + 1, (byte)☃);
        this.a.put(☃ + 2, (byte)☃);
        this.a.put(☃ + 3, (byte)☃);
      }
      break;
    }
    k();
    return this;
  }
  
  public void a(int[] ☃)
  {
    b(☃.length);
    
    this.b.position(j());
    this.b.put(☃);
    this.e += ☃.length / this.m.f();
  }
  
  public void d()
  {
    this.e += 1;
    b(this.m.f());
  }
  
  public bfd b(double ☃, double ☃, double ☃)
  {
    int ☃ = this.e * this.m.g() + this.m.d(this.g);
    switch (bfd.2.a[this.f.a().ordinal()])
    {
    case 1: 
      this.a.putFloat(☃, (float)(☃ + this.j));
      this.a.putFloat(☃ + 4, (float)(☃ + this.k));
      this.a.putFloat(☃ + 8, (float)(☃ + this.l));
      break;
    case 2: 
    case 3: 
      this.a.putInt(☃, Float.floatToRawIntBits((float)(☃ + this.j)));
      this.a.putInt(☃ + 4, Float.floatToRawIntBits((float)(☃ + this.k)));
      this.a.putInt(☃ + 8, Float.floatToRawIntBits((float)(☃ + this.l)));
      break;
    case 4: 
    case 5: 
      this.a.putShort(☃, (short)(int)(☃ + this.j));
      this.a.putShort(☃ + 2, (short)(int)(☃ + this.k));
      this.a.putShort(☃ + 4, (short)(int)(☃ + this.l));
      break;
    case 6: 
    case 7: 
      this.a.put(☃, (byte)(int)(☃ + this.j));
      this.a.put(☃ + 1, (byte)(int)(☃ + this.k));
      this.a.put(☃ + 2, (byte)(int)(☃ + this.l));
    }
    k();
    return this;
  }
  
  public void b(float ☃, float ☃, float ☃)
  {
    int ☃ = (byte)(int)(☃ * 127.0F) & 0xFF;
    int ☃ = (byte)(int)(☃ * 127.0F) & 0xFF;
    int ☃ = (byte)(int)(☃ * 127.0F) & 0xFF;
    int ☃ = ☃ | ☃ << 8 | ☃ << 16;
    
    int ☃ = this.m.g() >> 2;
    int ☃ = (this.e - 4) * ☃ + this.m.c() / 4;
    
    this.b.put(☃, ☃);
    this.b.put(☃ + ☃, ☃);
    this.b.put(☃ + ☃ * 2, ☃);
    this.b.put(☃ + ☃ * 3, ☃);
  }
  
  private void k()
  {
    this.g += 1;
    this.g %= this.m.i();
    this.f = this.m.c(this.g);
    if (this.f.b() == bmv.b.g) {
      k();
    }
  }
  
  public bfd c(float ☃, float ☃, float ☃)
  {
    int ☃ = this.e * this.m.g() + this.m.d(this.g);
    switch (bfd.2.a[this.f.a().ordinal()])
    {
    case 1: 
      this.a.putFloat(☃, ☃);
      this.a.putFloat(☃ + 4, ☃);
      this.a.putFloat(☃ + 8, ☃);
      break;
    case 2: 
    case 3: 
      this.a.putInt(☃, (int)☃);
      this.a.putInt(☃ + 4, (int)☃);
      this.a.putInt(☃ + 8, (int)☃);
      break;
    case 4: 
    case 5: 
      this.a.putShort(☃, (short)((int)☃ * 32767 & 0xFFFF));
      this.a.putShort(☃ + 2, (short)((int)☃ * 32767 & 0xFFFF));
      this.a.putShort(☃ + 4, (short)((int)☃ * 32767 & 0xFFFF));
      break;
    case 6: 
    case 7: 
      this.a.put(☃, (byte)((int)☃ * 127 & 0xFF));
      this.a.put(☃ + 1, (byte)((int)☃ * 127 & 0xFF));
      this.a.put(☃ + 2, (byte)((int)☃ * 127 & 0xFF));
    }
    k();
    return this;
  }
  
  public void c(double ☃, double ☃, double ☃)
  {
    this.j = ☃;
    this.k = ☃;
    this.l = ☃;
  }
  
  public void e()
  {
    if (!this.n) {
      throw new IllegalStateException("Not building!");
    }
    this.n = false;
    
    this.a.position(0);
    this.a.limit(j() * 4);
  }
  
  public ByteBuffer f()
  {
    return this.a;
  }
  
  public bmu g()
  {
    return this.m;
  }
  
  public int h()
  {
    return this.e;
  }
  
  public int i()
  {
    return this.i;
  }
  
  public void a(int ☃)
  {
    for (int ☃ = 0; ☃ < 4; ☃++) {
      b(☃, ☃ + 1);
    }
  }
  
  public void d(float ☃, float ☃, float ☃)
  {
    for (int ☃ = 0; ☃ < 4; ☃++) {
      b(☃, ☃, ☃, ☃ + 1);
    }
  }
  
  public class a
  {
    private final int[] b;
    private final bmu c;
    
    public a(int[] ☃, bmu ☃)
    {
      this.b = ☃;
      this.c = ☃;
    }
    
    public int[] a()
    {
      return this.b;
    }
    
    public int b()
    {
      return this.b.length / this.c.f();
    }
    
    public bmu c()
    {
      return this.c;
    }
  }
}
