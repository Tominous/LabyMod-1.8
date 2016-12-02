import java.lang.reflect.Method;
import java.net.URI;
import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class axf
  extends axu
{
  private static final Logger a = ;
  private static final jy f = new jy("textures/gui/demo_background.png");
  
  public void b()
  {
    n.clear();
    
    int ☃ = -16;
    
    n.add(new avs(1, l / 2 - 116, m / 2 + 62 + ☃, 114, 20, bnq.a("demo.help.buy", new Object[0])));
    n.add(new avs(2, l / 2 + 2, m / 2 + 62 + ☃, 114, 20, bnq.a("demo.help.later", new Object[0])));
  }
  
  protected void a(avs ☃)
  {
    switch (k)
    {
    case 2: 
      j.a(null);
      j.n();
      break;
    case 1: 
      l = false;
      try
      {
        Class<?> ☃ = Class.forName("java.awt.Desktop");
        Object ☃ = ☃.getMethod("getDesktop", new Class[0]).invoke(null, new Object[0]);
        ☃.getMethod("browse", new Class[] { URI.class }).invoke(☃, new Object[] { new URI("http://www.minecraft.net/store?source=demo") });
      }
      catch (Throwable ☃)
      {
        a.error("Couldn't open link", ☃);
      }
    }
  }
  
  public void e()
  {
    super.e();
  }
  
  public void c()
  {
    super.c();
    
    bfl.c(1.0F, 1.0F, 1.0F, 1.0F);
    j.P().a(f);
    int ☃ = (l - 248) / 2;
    int ☃ = (m - 166) / 2;
    b(☃, ☃, 0, 0, 248, 166);
  }
  
  public void a(int ☃, int ☃, float ☃)
  {
    c();
    
    int ☃ = (l - 248) / 2 + 10;
    
    int ☃ = (m - 166) / 2 + 8;
    
    q.a(bnq.a("demo.help.title", new Object[0]), ☃, ☃, 2039583);
    ☃ += 12;
    
    avh ☃ = j.t;
    
    q.a(bnq.a("demo.help.movementShort", new Object[] { avh.c(X.i()), avh.c(Y.i()), avh.c(Z.i()), avh.c(aa.i()) }), ☃, ☃, 5197647);
    
    q.a(bnq.a("demo.help.movementMouse", new Object[0]), ☃, ☃ + 12, 5197647);
    
    q.a(bnq.a("demo.help.jump", new Object[] { avh.c(ab.i()) }), ☃, ☃ + 24, 5197647);
    
    q.a(bnq.a("demo.help.inventory", new Object[] { avh.c(ae.i()) }), ☃, ☃ + 36, 5197647);
    
    q.a(bnq.a("demo.help.fullWrapped", new Object[0]), ☃, ☃ + 68, 218, 2039583);
    
    super.a(☃, ☃, ☃);
  }
}
