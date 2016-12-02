import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import net.minecraft.server.MinecraftServer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class la
{
  private static final Logger a = ;
  private final le b;
  private Set<lh> c = Sets.newHashSet();
  private nm<lh> d = new nm();
  private int e;
  
  public la(le ☃)
  {
    this.b = ☃;
    this.e = ☃.r().ap().d();
  }
  
  public void a(pk ☃)
  {
    lf ☃;
    if ((☃ instanceof lf))
    {
      a(☃, 512, 2);
      ☃ = (lf)☃;
      for (lh ☃ : this.c) {
        if (☃.a != ☃) {
          ☃.b(☃);
        }
      }
    }
    else if ((☃ instanceof ur))
    {
      a(☃, 64, 5, true);
    }
    else if ((☃ instanceof wq))
    {
      a(☃, 64, 20, false);
    }
    else if ((☃ instanceof ww))
    {
      a(☃, 64, 10, false);
    }
    else if ((☃ instanceof ws))
    {
      a(☃, 64, 10, false);
    }
    else if ((☃ instanceof wx))
    {
      a(☃, 64, 10, true);
    }
    else if ((☃ instanceof xa))
    {
      a(☃, 64, 10, true);
    }
    else if ((☃ instanceof wr))
    {
      a(☃, 64, 4, true);
    }
    else if ((☃ instanceof wz))
    {
      a(☃, 64, 10, true);
    }
    else if ((☃ instanceof xc))
    {
      a(☃, 64, 10, true);
    }
    else if ((☃ instanceof xb))
    {
      a(☃, 64, 10, true);
    }
    else if ((☃ instanceof wt))
    {
      a(☃, 64, 10, true);
    }
    else if ((☃ instanceof uz))
    {
      a(☃, 64, 20, true);
    }
    else if ((☃ instanceof va))
    {
      a(☃, 80, 3, true);
    }
    else if ((☃ instanceof ux))
    {
      a(☃, 80, 3, true);
    }
    else if ((☃ instanceof tx))
    {
      a(☃, 64, 3, true);
    }
    else if ((☃ instanceof uk))
    {
      a(☃, 80, 3, false);
    }
    else if ((☃ instanceof tk))
    {
      a(☃, 80, 3, false);
    }
    else if ((☃ instanceof ug))
    {
      a(☃, 160, 3, true);
    }
    else if ((☃ instanceof pi))
    {
      a(☃, 80, 3, true);
    }
    else if ((☃ instanceof vj))
    {
      a(☃, 160, 10, true);
    }
    else if ((☃ instanceof uy))
    {
      a(☃, 160, 20, true);
    }
    else if ((☃ instanceof un))
    {
      a(☃, 160, Integer.MAX_VALUE, false);
    }
    else if ((☃ instanceof um))
    {
      a(☃, 160, 3, true);
    }
    else if ((☃ instanceof pp))
    {
      a(☃, 160, 20, true);
    }
    else if ((☃ instanceof uf))
    {
      a(☃, 256, Integer.MAX_VALUE, false);
    }
  }
  
  public void a(pk ☃, int ☃, int ☃)
  {
    a(☃, ☃, ☃, false);
  }
  
  public void a(pk ☃, int ☃, final int ☃, boolean ☃)
  {
    if (☃ > this.e) {
      ☃ = this.e;
    }
    try
    {
      if (this.d.b(☃.F())) {
        throw new IllegalStateException("Entity is already tracked!");
      }
      lh ☃ = new lh(☃, ☃, ☃, ☃);
      this.c.add(☃);
      this.d.a(☃.F(), ☃);
      ☃.b(this.b.j);
    }
    catch (Throwable ☃)
    {
      b ☃ = b.a(☃, "Adding entity to track");
      c ☃ = ☃.a("Entity To Track");
      
      ☃.a("Tracking range", ☃ + " blocks");
      ☃.a("Update interval", new Callable()
      {
        public String a()
          throws Exception
        {
          String ☃ = "Once per " + ☃ + " ticks";
          if (☃ == Integer.MAX_VALUE) {
            ☃ = "Maximum (" + ☃ + ")";
          }
          return ☃;
        }
      });
      ☃.a(☃);
      
      c ☃ = ☃.a("Entity That Is Already Tracked");
      ((lh)this.d.a(☃.F())).a.a(☃);
      try
      {
        throw new e(☃);
      }
      catch (e ☃)
      {
        a.error("\"Silently\" catching entity tracking error.", ☃);
      }
    }
  }
  
  public void b(pk ☃)
  {
    lf ☃;
    if ((☃ instanceof lf))
    {
      ☃ = (lf)☃;
      for (lh ☃ : this.c) {
        ☃.a(☃);
      }
    }
    lh ☃ = (lh)this.d.d(☃.F());
    if (☃ != null)
    {
      this.c.remove(☃);
      ☃.a();
    }
  }
  
  public void a()
  {
    List<lf> ☃ = Lists.newArrayList();
    for (lh ☃ : this.c)
    {
      ☃.a(this.b.j);
      if ((☃.n) && ((☃.a instanceof lf))) {
        ☃.add((lf)☃.a);
      }
    }
    lf ☃;
    for (int ☃ = 0; ☃ < ☃.size(); ☃++)
    {
      ☃ = (lf)☃.get(☃);
      for (lh ☃ : this.c) {
        if (☃.a != ☃) {
          ☃.b(☃);
        }
      }
    }
  }
  
  public void a(lf ☃)
  {
    for (lh ☃ : this.c) {
      if (☃.a == ☃) {
        ☃.b(this.b.j);
      } else {
        ☃.b(☃);
      }
    }
  }
  
  public void a(pk ☃, ff ☃)
  {
    lh ☃ = (lh)this.d.a(☃.F());
    if (☃ != null) {
      ☃.a(☃);
    }
  }
  
  public void b(pk ☃, ff ☃)
  {
    lh ☃ = (lh)this.d.a(☃.F());
    if (☃ != null) {
      ☃.b(☃);
    }
  }
  
  public void b(lf ☃)
  {
    for (lh ☃ : this.c) {
      ☃.d(☃);
    }
  }
  
  public void a(lf ☃, amy ☃)
  {
    for (lh ☃ : this.c) {
      if ((☃.a != ☃) && (☃.a.ae == ☃.a) && (☃.a.ag == ☃.b)) {
        ☃.b(☃);
      }
    }
  }
}
