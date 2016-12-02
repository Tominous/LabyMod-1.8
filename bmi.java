import com.google.common.collect.Lists;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;

public class bmi
{
  private final String j;
  protected List<int[][]> a = Lists.newArrayList();
  protected int[][] b;
  private boa k;
  protected boolean c;
  protected int d;
  protected int e;
  protected int f;
  protected int g;
  private float l;
  private float m;
  private float n;
  private float o;
  protected int h;
  protected int i;
  private static String p = "builtin/clock";
  private static String q = "builtin/compass";
  
  protected bmi(String ☃)
  {
    this.j = ☃;
  }
  
  protected static bmi a(jy ☃)
  {
    String ☃ = ☃.toString();
    if (p.equals(☃)) {
      return new bmo(☃);
    }
    if (q.equals(☃)) {
      return new bmp(☃);
    }
    return new bmi(☃);
  }
  
  public static void a(String ☃)
  {
    p = ☃;
  }
  
  public static void b(String ☃)
  {
    q = ☃;
  }
  
  public void a(int ☃, int ☃, int ☃, int ☃, boolean ☃)
  {
    this.d = ☃;
    this.e = ☃;
    this.c = ☃;
    
    float ☃ = (float)(0.009999999776482582D / ☃);
    float ☃ = (float)(0.009999999776482582D / ☃);
    
    this.l = (☃ / (float)☃ + ☃);
    this.m = ((☃ + this.f) / (float)☃ - ☃);
    this.n = (☃ / ☃ + ☃);
    this.o = ((☃ + this.g) / ☃ - ☃);
  }
  
  public void a(bmi ☃)
  {
    this.d = ☃.d;
    this.e = ☃.e;
    
    this.f = ☃.f;
    this.g = ☃.g;
    
    this.c = ☃.c;
    
    this.l = ☃.l;
    this.m = ☃.m;
    this.n = ☃.n;
    this.o = ☃.o;
  }
  
  public int a()
  {
    return this.d;
  }
  
  public int b()
  {
    return this.e;
  }
  
  public int c()
  {
    return this.f;
  }
  
  public int d()
  {
    return this.g;
  }
  
  public float e()
  {
    return this.l;
  }
  
  public float f()
  {
    return this.m;
  }
  
  public float a(double ☃)
  {
    float ☃ = this.m - this.l;
    return this.l + ☃ * (float)☃ / 16.0F;
  }
  
  public float g()
  {
    return this.n;
  }
  
  public float h()
  {
    return this.o;
  }
  
  public float b(double ☃)
  {
    float ☃ = this.o - this.n;
    return this.n + ☃ * ((float)☃ / 16.0F);
  }
  
  public String i()
  {
    return this.j;
  }
  
  public void j()
  {
    this.i += 1;
    if (this.i >= this.k.a(this.h))
    {
      int ☃ = this.k.c(this.h);
      int ☃ = this.k.c() == 0 ? this.a.size() : this.k.c();
      this.h = ((this.h + 1) % ☃);
      this.i = 0;
      
      int ☃ = this.k.c(this.h);
      if ((☃ != ☃) && (☃ >= 0) && (☃ < this.a.size())) {
        bml.a((int[][])this.a.get(☃), this.f, this.g, this.d, this.e, false, false);
      }
    }
    else if (this.k.e())
    {
      n();
    }
  }
  
  private void n()
  {
    double ☃ = 1.0D - this.i / this.k.a(this.h);
    
    int ☃ = this.k.c(this.h);
    int ☃ = this.k.c() == 0 ? this.a.size() : this.k.c();
    int ☃ = this.k.c((this.h + 1) % ☃);
    if ((☃ != ☃) && (☃ >= 0) && (☃ < this.a.size()))
    {
      int[][] ☃ = (int[][])this.a.get(☃);
      int[][] ☃ = (int[][])this.a.get(☃);
      if ((this.b == null) || (this.b.length != ☃.length)) {
        this.b = new int[☃.length][];
      }
      for (int ☃ = 0; ☃ < ☃.length; ☃++)
      {
        if (this.b[☃] == null) {
          this.b[☃] = new int[☃[☃].length];
        }
        if ((☃ < ☃.length) && (☃[☃].length == ☃[☃].length)) {
          for (int ☃ = 0; ☃ < ☃[☃].length; ☃++)
          {
            int ☃ = ☃[☃][☃];
            int ☃ = ☃[☃][☃];
            int ☃ = (int)(((☃ & 0xFF0000) >> 16) * ☃ + ((☃ & 0xFF0000) >> 16) * (1.0D - ☃));
            int ☃ = (int)(((☃ & 0xFF00) >> 8) * ☃ + ((☃ & 0xFF00) >> 8) * (1.0D - ☃));
            int ☃ = (int)((☃ & 0xFF) * ☃ + (☃ & 0xFF) * (1.0D - ☃));
            
            this.b[☃][☃] = (☃ & 0xFF000000 | ☃ << 16 | ☃ << 8 | ☃);
          }
        }
      }
      bml.a(this.b, this.f, this.g, this.d, this.e, false, false);
    }
  }
  
  public int[][] a(int ☃)
  {
    return (int[][])this.a.get(☃);
  }
  
  public int k()
  {
    return this.a.size();
  }
  
  public void b(int ☃)
  {
    this.f = ☃;
  }
  
  public void c(int ☃)
  {
    this.g = ☃;
  }
  
  public void a(BufferedImage[] ☃, boa ☃)
    throws IOException
  {
    o();
    
    int ☃ = ☃[0].getWidth();
    int ☃ = ☃[0].getHeight();
    
    this.f = ☃;
    this.g = ☃;
    
    int[][] ☃ = new int[☃.length][];
    for (int ☃ = 0; ☃ < ☃.length; ☃++)
    {
      BufferedImage ☃ = ☃[☃];
      if (☃ != null)
      {
        if ((☃ > 0) && ((☃.getWidth() != ☃ >> ☃) || (☃.getHeight() != ☃ >> ☃))) {
          throw new RuntimeException(String.format("Unable to load miplevel: %d, image is size: %dx%d, expected %dx%d", new Object[] { Integer.valueOf(☃), Integer.valueOf(☃.getWidth()), Integer.valueOf(☃.getHeight()), Integer.valueOf(☃ >> ☃), Integer.valueOf(☃ >> ☃) }));
        }
        ☃[☃] = new int[☃.getWidth() * ☃.getHeight()];
        ☃.getRGB(0, 0, ☃.getWidth(), ☃.getHeight(), ☃[☃], 0, ☃.getWidth());
      }
    }
    if (☃ == null)
    {
      if (☃ != ☃) {
        throw new RuntimeException("broken aspect ratio and not an animation");
      }
      this.a.add(☃);
    }
    else
    {
      int ☃ = ☃ / ☃;
      int ☃ = ☃;
      int ☃ = ☃;
      this.g = this.f;
      if (☃.c() > 0)
      {
        for (Iterator ☃ = ☃.f().iterator(); ☃.hasNext();)
        {
          int ☃ = ((Integer)☃.next()).intValue();
          if (☃ >= ☃) {
            throw new RuntimeException("invalid frameindex " + ☃);
          }
          e(☃);
          this.a.set(☃, a(☃, ☃, ☃, ☃));
        }
        this.k = ☃;
      }
      else
      {
        List<bnz> ☃ = Lists.newArrayList();
        for (int ☃ = 0; ☃ < ☃; ☃++)
        {
          this.a.add(a(☃, ☃, ☃, ☃));
          
          ☃.add(new bnz(☃, -1));
        }
        this.k = new boa(☃, this.f, this.g, ☃.d(), ☃.e());
      }
    }
  }
  
  public void d(int ☃)
  {
    List<int[][]> ☃ = Lists.newArrayList();
    for (int ☃ = 0; ☃ < this.a.size(); ☃++)
    {
      final int[][] ☃ = (int[][])this.a.get(☃);
      if (☃ != null) {
        try
        {
          ☃.add(bml.a(☃, this.f, ☃));
        }
        catch (Throwable ☃)
        {
          b ☃ = b.a(☃, "Generating mipmaps for frame");
          c ☃ = ☃.a("Frame being iterated");
          
          ☃.a("Frame index", Integer.valueOf(☃));
          ☃.a("Frame sizes", new Callable()
          {
            public String a()
              throws Exception
            {
              StringBuilder ☃ = new StringBuilder();
              for (int[] ☃ : ☃)
              {
                if (☃.length() > 0) {
                  ☃.append(", ");
                }
                ☃.append(☃ == null ? "null" : Integer.valueOf(☃.length));
              }
              return ☃.toString();
            }
          });
          throw new e(☃);
        }
      }
    }
    a(☃);
  }
  
  private void e(int ☃)
  {
    if (this.a.size() > ☃) {
      return;
    }
    for (int ☃ = this.a.size(); ☃ <= ☃; ☃++) {
      this.a.add(null);
    }
  }
  
  private static int[][] a(int[][] ☃, int ☃, int ☃, int ☃)
  {
    int[][] ☃ = new int[☃.length][];
    for (int ☃ = 0; ☃ < ☃.length; ☃++)
    {
      int[] ☃ = ☃[☃];
      if (☃ != null)
      {
        ☃[☃] = new int[(☃ >> ☃) * (☃ >> ☃)];
        System.arraycopy(☃, ☃ * ☃[☃].length, ☃[☃], 0, ☃[☃].length);
      }
    }
    return ☃;
  }
  
  public void l()
  {
    this.a.clear();
  }
  
  public boolean m()
  {
    return this.k != null;
  }
  
  public void a(List<int[][]> ☃)
  {
    this.a = ☃;
  }
  
  private void o()
  {
    this.k = null;
    a(Lists.newArrayList());
    this.h = 0;
    this.i = 0;
  }
  
  public String toString()
  {
    return "TextureAtlasSprite{name='" + this.j + '\'' + ", frameCount=" + this.a.size() + ", rotated=" + this.c + ", x=" + this.d + ", y=" + this.e + ", height=" + this.g + ", width=" + this.f + ", u0=" + this.l + ", u1=" + this.m + ", v0=" + this.n + ", v1=" + this.o + '}';
  }
}
