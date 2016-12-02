import com.google.common.collect.Lists;
import java.util.Collections;
import java.util.List;
import net.minecraft.realms.RealmsButton;
import net.minecraft.realms.RealmsScreen;

public class awr
  extends axu
{
  private RealmsScreen a;
  
  public awr(RealmsScreen ☃)
  {
    a = ☃;
    n = Collections.synchronizedList(Lists.newArrayList());
  }
  
  public RealmsScreen a()
  {
    return a;
  }
  
  public void b()
  {
    a.init();
    super.b();
  }
  
  public void a(String ☃, int ☃, int ☃, int ☃)
  {
    super.a(q, ☃, ☃, ☃, ☃);
  }
  
  public void b(String ☃, int ☃, int ☃, int ☃)
  {
    super.c(q, ☃, ☃, ☃, ☃);
  }
  
  public void b(int ☃, int ☃, int ☃, int ☃, int ☃, int ☃)
  {
    a.blit(☃, ☃, ☃, ☃, ☃, ☃);
    super.b(☃, ☃, ☃, ☃, ☃, ☃);
  }
  
  public void a(int ☃, int ☃, int ☃, int ☃, int ☃, int ☃)
  {
    super.a(☃, ☃, ☃, ☃, ☃, ☃);
  }
  
  public void c()
  {
    super.c();
  }
  
  public boolean d()
  {
    return super.d();
  }
  
  public void b_(int ☃)
  {
    super.b_(☃);
  }
  
  public void a(int ☃, int ☃, float ☃)
  {
    a.render(☃, ☃, ☃);
  }
  
  public void a(zx ☃, int ☃, int ☃)
  {
    super.a(☃, ☃, ☃);
  }
  
  public void a(String ☃, int ☃, int ☃)
  {
    super.a(☃, ☃, ☃);
  }
  
  public void a(List<String> ☃, int ☃, int ☃)
  {
    super.a(☃, ☃, ☃);
  }
  
  public void e()
  {
    a.tick();
    super.e();
  }
  
  public int h()
  {
    return q.a;
  }
  
  public int c(String ☃)
  {
    return q.a(☃);
  }
  
  public void c(String ☃, int ☃, int ☃, int ☃)
  {
    q.a(☃, ☃, ☃, ☃);
  }
  
  public List<String> a(String ☃, int ☃)
  {
    return q.c(☃, ☃);
  }
  
  public final void a(avs ☃)
  {
    a.buttonClicked(((awp)☃).f());
  }
  
  public void i()
  {
    n.clear();
  }
  
  public void a(RealmsButton ☃)
  {
    n.add(☃.getProxy());
  }
  
  public List<RealmsButton> j()
  {
    List<RealmsButton> ☃ = Lists.newArrayListWithExpectedSize(n.size());
    for (avs ☃ : n) {
      ☃.add(((awp)☃).f());
    }
    return ☃;
  }
  
  public void b(RealmsButton ☃)
  {
    n.remove(☃);
  }
  
  public void a(int ☃, int ☃, int ☃)
  {
    a.mouseClicked(☃, ☃, ☃);
    super.a(☃, ☃, ☃);
  }
  
  public void k()
  {
    a.mouseEvent();
    super.k();
  }
  
  public void l()
  {
    a.keyboardEvent();
    super.l();
  }
  
  public void b(int ☃, int ☃, int ☃)
  {
    a.mouseReleased(☃, ☃, ☃);
  }
  
  public void a(int ☃, int ☃, int ☃, long ☃)
  {
    a.mouseDragged(☃, ☃, ☃, ☃);
  }
  
  public void a(char ☃, int ☃)
  {
    a.keyPressed(☃, ☃);
  }
  
  public void a(boolean ☃, int ☃)
  {
    a.confirmResult(☃, ☃);
  }
  
  public void m()
  {
    a.removed();
    super.m();
  }
}
