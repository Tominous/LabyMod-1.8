import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import net.minecraft.server.MinecraftServer;

public class kk
  extends auo
{
  private final MinecraftServer a;
  private final Set<auk> b = Sets.newHashSet();
  private aup c;
  
  public kk(MinecraftServer ☃)
  {
    this.a = ☃;
  }
  
  public void a(aum ☃)
  {
    super.a(☃);
    if (this.b.contains(☃.d())) {
      this.a.ap().a(new hs(☃));
    }
    b();
  }
  
  public void a(String ☃)
  {
    super.a(☃);
    this.a.ap().a(new hs(☃));
    b();
  }
  
  public void a(String ☃, auk ☃)
  {
    super.a(☃, ☃);
    this.a.ap().a(new hs(☃, ☃));
    b();
  }
  
  public void a(int ☃, auk ☃)
  {
    auk ☃ = a(☃);
    
    super.a(☃, ☃);
    if ((☃ != ☃) && (☃ != null)) {
      if (h(☃) > 0) {
        this.a.ap().a(new hj(☃, ☃));
      } else {
        g(☃);
      }
    }
    if (☃ != null) {
      if (this.b.contains(☃)) {
        this.a.ap().a(new hj(☃, ☃));
      } else {
        e(☃);
      }
    }
    b();
  }
  
  public boolean a(String ☃, String ☃)
  {
    if (super.a(☃, ☃))
    {
      aul ☃ = d(☃);
      this.a.ap().a(new hr(☃, Arrays.asList(new String[] { ☃ }), 3));
      b();
      
      return true;
    }
    return false;
  }
  
  public void a(String ☃, aul ☃)
  {
    super.a(☃, ☃);
    
    this.a.ap().a(new hr(☃, Arrays.asList(new String[] { ☃ }), 4));
    
    b();
  }
  
  public void a(auk ☃)
  {
    super.a(☃);
    b();
  }
  
  public void b(auk ☃)
  {
    super.b(☃);
    if (this.b.contains(☃)) {
      this.a.ap().a(new hq(☃, 2));
    }
    b();
  }
  
  public void c(auk ☃)
  {
    super.c(☃);
    if (this.b.contains(☃)) {
      g(☃);
    }
    b();
  }
  
  public void a(aul ☃)
  {
    super.a(☃);
    
    this.a.ap().a(new hr(☃, 0));
    
    b();
  }
  
  public void b(aul ☃)
  {
    super.b(☃);
    
    this.a.ap().a(new hr(☃, 2));
    
    b();
  }
  
  public void c(aul ☃)
  {
    super.c(☃);
    
    this.a.ap().a(new hr(☃, 1));
    
    b();
  }
  
  public void a(aup ☃)
  {
    this.c = ☃;
  }
  
  protected void b()
  {
    if (this.c != null) {
      this.c.c();
    }
  }
  
  public List<ff> d(auk ☃)
  {
    List<ff> ☃ = Lists.newArrayList();
    ☃.add(new hq(☃, 0));
    for (int ☃ = 0; ☃ < 19; ☃++) {
      if (a(☃) == ☃) {
        ☃.add(new hj(☃, ☃));
      }
    }
    for (aum ☃ : i(☃)) {
      ☃.add(new hs(☃));
    }
    return ☃;
  }
  
  public void e(auk ☃)
  {
    List<ff> ☃ = d(☃);
    for (Iterator ☃ = this.a.ap().v().iterator(); ☃.hasNext();)
    {
      ☃ = (lf)☃.next();
      for (ff ☃ : ☃) {
        ☃.a.a(☃);
      }
    }
    lf ☃;
    this.b.add(☃);
  }
  
  public List<ff> f(auk ☃)
  {
    List<ff> ☃ = Lists.newArrayList();
    ☃.add(new hq(☃, 1));
    for (int ☃ = 0; ☃ < 19; ☃++) {
      if (a(☃) == ☃) {
        ☃.add(new hj(☃, ☃));
      }
    }
    return ☃;
  }
  
  public void g(auk ☃)
  {
    List<ff> ☃ = f(☃);
    for (Iterator ☃ = this.a.ap().v().iterator(); ☃.hasNext();)
    {
      ☃ = (lf)☃.next();
      for (ff ☃ : ☃) {
        ☃.a.a(☃);
      }
    }
    lf ☃;
    this.b.remove(☃);
  }
  
  public int h(auk ☃)
  {
    int ☃ = 0;
    for (int ☃ = 0; ☃ < 19; ☃++) {
      if (a(☃) == ☃) {
        ☃++;
      }
    }
    return ☃;
  }
}
