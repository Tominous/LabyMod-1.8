import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.util.List;
import java.util.Map;
import org.lwjgl.util.vector.Vector3f;

public class bgp
{
  public static final List<String> a = Lists.newArrayList(new String[] { "layer0", "layer1", "layer2", "layer3", "layer4" });
  
  public bgl a(bmh ☃, bgl ☃)
  {
    Map<String, String> ☃ = Maps.newHashMap();
    
    List<bgh> ☃ = Lists.newArrayList();
    for (int ☃ = 0; ☃ < a.size(); ☃++)
    {
      String ☃ = (String)a.get(☃);
      if (!☃.b(☃)) {
        break;
      }
      String ☃ = ☃.c(☃);
      ☃.put(☃, ☃);
      
      bmi ☃ = ☃.a(new jy(☃).toString());
      ☃.addAll(a(☃, ☃, ☃));
    }
    if (☃.isEmpty()) {
      return null;
    }
    ☃.put("particle", ☃.b("particle") ? ☃.c("particle") : (String)☃.get("layer0"));
    
    return new bgl(☃, ☃, false, false, ☃.g());
  }
  
  private List<bgh> a(int ☃, String ☃, bmi ☃)
  {
    Map<cq, bgi> ☃ = Maps.newHashMap();
    ☃.put(cq.d, new bgi(null, ☃, ☃, new bgk(new float[] { 0.0F, 0.0F, 16.0F, 16.0F }, 0)));
    ☃.put(cq.c, new bgi(null, ☃, ☃, new bgk(new float[] { 16.0F, 0.0F, 0.0F, 16.0F }, 0)));
    
    List<bgh> ☃ = Lists.newArrayList();
    ☃.add(new bgh(new Vector3f(0.0F, 0.0F, 7.5F), new Vector3f(16.0F, 16.0F, 8.5F), ☃, null, true));
    
    ☃.addAll(a(☃, ☃, ☃));
    
    return ☃;
  }
  
  private List<bgh> a(bmi ☃, String ☃, int ☃)
  {
    float ☃ = ☃.c();
    float ☃ = ☃.d();
    List<bgh> ☃ = Lists.newArrayList();
    for (bgp.a ☃ : a(☃))
    {
      float ☃ = 0.0F;
      float ☃ = 0.0F;
      float ☃ = 0.0F;
      float ☃ = 0.0F;
      float ☃ = 0.0F;
      float ☃ = 0.0F;
      float ☃ = 0.0F;
      float ☃ = 0.0F;
      float ☃ = 0.0F;
      float ☃ = 0.0F;
      
      float ☃ = ☃.b();
      float ☃ = ☃.c();
      float ☃ = ☃.d();
      
      bgp.b ☃ = ☃.a();
      switch (bgp.1.a[☃.ordinal()])
      {
      case 1: 
        ☃ = ☃ = ☃;
        ☃ = ☃ = ☃ + 1.0F;
        ☃ = ☃ = ☃;
        ☃ = ☃ = ☃;
        
        ☃ = 16.0F / ☃;
        ☃ = 16.0F / (☃ - 1.0F);
        break;
      case 2: 
        ☃ = ☃ = ☃;
        
        ☃ = ☃ = ☃;
        ☃ = ☃ = ☃ + 1.0F;
        ☃ = ☃ + 1.0F;
        ☃ = ☃ + 1.0F;
        
        ☃ = 16.0F / ☃;
        ☃ = 16.0F / (☃ - 1.0F);
        break;
      case 3: 
        ☃ = ☃ = ☃;
        ☃ = ☃ = ☃;
        ☃ = ☃ = ☃;
        ☃ = ☃ = ☃ + 1.0F;
        
        ☃ = 16.0F / (☃ - 1.0F);
        ☃ = 16.0F / ☃;
        break;
      case 4: 
        ☃ = ☃ = ☃;
        
        ☃ = ☃ + 1.0F;
        ☃ = ☃ + 1.0F;
        ☃ = ☃ = ☃;
        ☃ = ☃ = ☃ + 1.0F;
        
        ☃ = 16.0F / (☃ - 1.0F);
        ☃ = 16.0F / ☃;
      }
      float ☃ = 16.0F / ☃;
      float ☃ = 16.0F / ☃;
      
      ☃ *= ☃;
      ☃ *= ☃;
      ☃ *= ☃;
      ☃ *= ☃;
      
      ☃ = 16.0F - ☃;
      ☃ = 16.0F - ☃;
      
      ☃ *= ☃;
      ☃ *= ☃;
      ☃ *= ☃;
      ☃ *= ☃;
      
      Map<cq, bgi> ☃ = Maps.newHashMap();
      ☃.put(☃.a(), new bgi(null, ☃, ☃, new bgk(new float[] { ☃, ☃, ☃, ☃ }, 0)));
      switch (bgp.1.a[☃.ordinal()])
      {
      case 1: 
        ☃.add(new bgh(new Vector3f(☃, ☃, 7.5F), new Vector3f(☃, ☃, 8.5F), ☃, null, true));
        break;
      case 2: 
        ☃.add(new bgh(new Vector3f(☃, ☃, 7.5F), new Vector3f(☃, ☃, 8.5F), ☃, null, true));
        break;
      case 3: 
        ☃.add(new bgh(new Vector3f(☃, ☃, 7.5F), new Vector3f(☃, ☃, 8.5F), ☃, null, true));
        break;
      case 4: 
        ☃.add(new bgh(new Vector3f(☃, ☃, 7.5F), new Vector3f(☃, ☃, 8.5F), ☃, null, true));
      }
    }
    return ☃;
  }
  
  private List<bgp.a> a(bmi ☃)
  {
    int ☃ = ☃.c();
    int ☃ = ☃.d();
    
    List<bgp.a> ☃ = Lists.newArrayList();
    for (int ☃ = 0; ☃ < ☃.k(); ☃++)
    {
      int[] ☃ = ☃.a(☃)[0];
      for (int ☃ = 0; ☃ < ☃; ☃++) {
        for (int ☃ = 0; ☃ < ☃; ☃++)
        {
          boolean ☃ = !a(☃, ☃, ☃, ☃, ☃);
          
          a(bgp.b.a, ☃, ☃, ☃, ☃, ☃, ☃, ☃);
          a(bgp.b.b, ☃, ☃, ☃, ☃, ☃, ☃, ☃);
          a(bgp.b.c, ☃, ☃, ☃, ☃, ☃, ☃, ☃);
          a(bgp.b.d, ☃, ☃, ☃, ☃, ☃, ☃, ☃);
        }
      }
    }
    return ☃;
  }
  
  private void a(bgp.b ☃, List<bgp.a> ☃, int[] ☃, int ☃, int ☃, int ☃, int ☃, boolean ☃)
  {
    boolean ☃ = (a(☃, ☃ + ☃.b(), ☃ + ☃.c(), ☃, ☃)) && (☃);
    if (☃) {
      a(☃, ☃, ☃, ☃);
    }
  }
  
  private void a(List<bgp.a> ☃, bgp.b ☃, int ☃, int ☃)
  {
    bgp.a ☃ = null;
    for (bgp.a ☃ : ☃) {
      if (☃.a() == ☃)
      {
        int ☃ = bgp.b.a(☃) ? ☃ : ☃;
        if (☃.d() == ☃)
        {
          ☃ = ☃;
          break;
        }
      }
    }
    int ☃ = bgp.b.a(☃) ? ☃ : ☃;
    int ☃ = bgp.b.a(☃) ? ☃ : ☃;
    if (☃ == null) {
      ☃.add(new bgp.a(☃, ☃, ☃));
    } else {
      ☃.a(☃);
    }
  }
  
  private boolean a(int[] ☃, int ☃, int ☃, int ☃, int ☃)
  {
    if ((☃ < 0) || (☃ < 0) || (☃ >= ☃) || (☃ >= ☃)) {
      return true;
    }
    return (☃[(☃ * ☃ + ☃)] >> 24 & 0xFF) == 0;
  }
  
  static enum b
  {
    private final cq e;
    private final int f;
    private final int g;
    
    private b(cq ☃, int ☃, int ☃)
    {
      e = ☃;
      f = ☃;
      g = ☃;
    }
    
    public cq a()
    {
      return e;
    }
    
    public int b()
    {
      return f;
    }
    
    public int c()
    {
      return g;
    }
    
    private boolean d()
    {
      return (this == b) || (this == a);
    }
  }
  
  static class a
  {
    private final bgp.b a;
    private int b;
    private int c;
    private final int d;
    
    public a(bgp.b ☃, int ☃, int ☃)
    {
      a = ☃;
      b = ☃;
      c = ☃;
      d = ☃;
    }
    
    public void a(int ☃)
    {
      if (☃ < b) {
        b = ☃;
      } else if (☃ > c) {
        c = ☃;
      }
    }
    
    public bgp.b a()
    {
      return a;
    }
    
    public int b()
    {
      return b;
    }
    
    public int c()
    {
      return c;
    }
    
    public int d()
    {
      return d;
    }
  }
}
