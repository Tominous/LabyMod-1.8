import com.google.common.collect.Lists;
import com.google.gson.JsonParseException;
import io.netty.buffer.Unpooled;
import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.lwjgl.input.Keyboard;

public class ayo
  extends axu
{
  private static final Logger a = ;
  private static final jy f = new jy("textures/gui/book.png");
  private final wn g;
  private final zx h;
  private final boolean i;
  private boolean r;
  private boolean s;
  private int t;
  private int u = 192;
  private int v = 192;
  private int w = 1;
  private int x;
  private du y;
  private String z = "";
  private List<eu> A;
  private int B = -1;
  private ayo.a C;
  private ayo.a D;
  private avs E;
  private avs F;
  private avs G;
  private avs H;
  
  public ayo(wn ☃, zx ☃, boolean ☃)
  {
    g = ☃;
    h = ☃;
    i = ☃;
    if (☃.n())
    {
      dn ☃ = ☃.o();
      y = ☃.c("pages", 8);
      if (y != null)
      {
        y = ((du)y.b());
        w = y.c();
        if (w < 1) {
          w = 1;
        }
      }
    }
    if ((y == null) && (☃))
    {
      y = new du();
      y.a(new ea(""));
      
      w = 1;
    }
  }
  
  public void e()
  {
    super.e();
    t += 1;
  }
  
  public void b()
  {
    n.clear();
    Keyboard.enableRepeatEvents(true);
    if (i)
    {
      n.add(F = new avs(3, l / 2 - 100, 4 + v, 98, 20, bnq.a("book.signButton", new Object[0])));
      n.add(E = new avs(0, l / 2 + 2, 4 + v, 98, 20, bnq.a("gui.done", new Object[0])));
      
      n.add(G = new avs(5, l / 2 - 100, 4 + v, 98, 20, bnq.a("book.finalizeButton", new Object[0])));
      n.add(H = new avs(4, l / 2 + 2, 4 + v, 98, 20, bnq.a("gui.cancel", new Object[0])));
    }
    else
    {
      n.add(E = new avs(0, l / 2 - 100, 4 + v, 200, 20, bnq.a("gui.done", new Object[0])));
    }
    int ☃ = (l - u) / 2;
    int ☃ = 2;
    
    n.add(C = new ayo.a(1, ☃ + 120, ☃ + 154, true));
    n.add(D = new ayo.a(2, ☃ + 38, ☃ + 154, false));
    
    f();
  }
  
  public void m()
  {
    Keyboard.enableRepeatEvents(false);
  }
  
  private void f()
  {
    C.m = ((!s) && ((x < w - 1) || (i)));
    D.m = ((!s) && (x > 0));
    
    E.m = ((!i) || (!s));
    if (i)
    {
      F.m = (!s);
      H.m = s;
      G.m = s;
      G.l = (z.trim().length() > 0);
    }
  }
  
  private void a(boolean ☃)
  {
    if ((!i) || (!r)) {
      return;
    }
    if (y != null)
    {
      while (y.c() > 1)
      {
        String ☃ = y.f(y.c() - 1);
        if (☃.length() != 0) {
          break;
        }
        y.a(y.c() - 1);
      }
      if (h.n())
      {
        dn ☃ = h.o();
        ☃.a("pages", y);
      }
      else
      {
        h.a("pages", y);
      }
      String ☃ = "MC|BEdit";
      if (☃)
      {
        ☃ = "MC|BSign";
        h.a("author", new ea(g.e_()));
        h.a("title", new ea(z.trim()));
        for (int ☃ = 0; ☃ < y.c(); ☃++)
        {
          String ☃ = y.f(☃);
          eu ☃ = new fa(☃);
          ☃ = eu.a.a(☃);
          y.a(☃, new ea(☃));
        }
        h.a(zy.bN);
      }
      em ☃ = new em(Unpooled.buffer());
      
      ☃.a(h);
      j.u().a(new im(☃, ☃));
    }
  }
  
  protected void a(avs ☃)
  {
    if (!l) {
      return;
    }
    if (k == 0)
    {
      j.a(null);
      a(false);
    }
    else if ((k == 3) && (i))
    {
      s = true;
    }
    else if (k == 1)
    {
      if (x < w - 1)
      {
        x += 1;
      }
      else if (i)
      {
        g();
        if (x < w - 1) {
          x += 1;
        }
      }
    }
    else if (k == 2)
    {
      if (x > 0) {
        x -= 1;
      }
    }
    else if ((k == 5) && (s))
    {
      a(true);
      j.a(null);
    }
    else if ((k == 4) && (s))
    {
      s = false;
    }
    f();
  }
  
  private void g()
  {
    if ((y == null) || (y.c() >= 50)) {
      return;
    }
    y.a(new ea(""));
    w += 1;
    
    r = true;
  }
  
  protected void a(char ☃, int ☃)
  {
    super.a(☃, ☃);
    if (!i) {
      return;
    }
    if (s) {
      c(☃, ☃);
    } else {
      b(☃, ☃);
    }
  }
  
  private void b(char ☃, int ☃)
  {
    if (axu.e(☃))
    {
      b(axu.o());
      return;
    }
    switch (☃)
    {
    case 14: 
      String ☃ = h();
      if (☃.length() > 0) {
        a(☃.substring(0, ☃.length() - 1));
      }
      return;
    case 28: 
    case 156: 
      b("\n");
      return;
    }
    if (f.a(☃))
    {
      b(Character.toString(☃));
      return;
    }
  }
  
  private void c(char ☃, int ☃)
  {
    switch (☃)
    {
    case 14: 
      if (!z.isEmpty())
      {
        z = z.substring(0, z.length() - 1);
        f();
      }
      return;
    case 28: 
    case 156: 
      if (!z.isEmpty())
      {
        a(true);
        j.a(null);
      }
      return;
    }
    if ((z.length() < 16) && (f.a(☃)))
    {
      z += Character.toString(☃);
      f();
      r = true;
    }
  }
  
  private String h()
  {
    if ((y != null) && (x >= 0) && (x < y.c())) {
      return y.f(x);
    }
    return "";
  }
  
  private void a(String ☃)
  {
    if ((y != null) && (x >= 0) && (x < y.c()))
    {
      y.a(x, new ea(☃));
      
      r = true;
    }
  }
  
  private void b(String ☃)
  {
    String ☃ = h();
    String ☃ = ☃ + ☃;
    
    int ☃ = q.b(☃ + "" + a.a + "_", 118);
    if ((☃ <= 128) && (☃.length() < 256)) {
      a(☃);
    }
  }
  
  public void a(int ☃, int ☃, float ☃)
  {
    bfl.c(1.0F, 1.0F, 1.0F, 1.0F);
    j.P().a(f);
    int ☃ = (l - u) / 2;
    int ☃ = 2;
    b(☃, ☃, 0, 0, u, v);
    if (s)
    {
      String ☃ = z;
      if (i) {
        if (t / 6 % 2 == 0) {
          ☃ = ☃ + "" + a.a + "_";
        } else {
          ☃ = ☃ + "" + a.h + "_";
        }
      }
      String ☃ = bnq.a("book.editTitle", new Object[0]);
      int ☃ = q.a(☃);
      q.a(☃, ☃ + 36 + (116 - ☃) / 2, ☃ + 16 + 16, 0);
      
      int ☃ = q.a(☃);
      q.a(☃, ☃ + 36 + (116 - ☃) / 2, ☃ + 48, 0);
      String ☃ = bnq.a("book.byAuthor", new Object[] { g.e_() });
      int ☃ = q.a(☃);
      q.a(a.i + ☃, ☃ + 36 + (116 - ☃) / 2, ☃ + 48 + 10, 0);
      
      String ☃ = bnq.a("book.finalizeWarning", new Object[0]);
      q.a(☃, ☃ + 36, ☃ + 80, 116, 0);
    }
    else
    {
      String ☃ = bnq.a("book.pageIndicator", new Object[] { Integer.valueOf(x + 1), Integer.valueOf(w) });
      String ☃ = "";
      if ((y != null) && (x >= 0) && (x < y.c())) {
        ☃ = y.f(x);
      }
      if (i)
      {
        if (q.b()) {
          ☃ = ☃ + "_";
        } else if (t / 6 % 2 == 0) {
          ☃ = ☃ + "" + a.a + "_";
        } else {
          ☃ = ☃ + "" + a.h + "_";
        }
      }
      else if (B != x)
      {
        if (abd.b(h.o()))
        {
          try
          {
            eu ☃ = eu.a.a(☃);
            A = (☃ != null ? avu.a(☃, 116, q, true, true) : null);
          }
          catch (JsonParseException ☃)
          {
            A = null;
          }
        }
        else
        {
          fa ☃ = new fa(a.e.toString() + "* Invalid book tag *");
          A = Lists.newArrayList(☃);
        }
        B = x;
      }
      int ☃ = q.a(☃);
      q.a(☃, ☃ - ☃ + u - 44, ☃ + 16, 0);
      if (A == null)
      {
        q.a(☃, ☃ + 36, ☃ + 16 + 16, 116, 0);
      }
      else
      {
        int ☃ = Math.min(128 / q.a, A.size());
        for (int ☃ = 0; ☃ < ☃; ☃++)
        {
          eu ☃ = (eu)A.get(☃);
          q.a(☃.c(), ☃ + 36, ☃ + 16 + 16 + ☃ * q.a, 0);
        }
        eu ☃ = b(☃, ☃);
        if (☃ != null) {
          a(☃, ☃, ☃);
        }
      }
    }
    super.a(☃, ☃, ☃);
  }
  
  protected void a(int ☃, int ☃, int ☃)
  {
    if (☃ == 0)
    {
      eu ☃ = b(☃, ☃);
      if (a(☃)) {
        return;
      }
    }
    super.a(☃, ☃, ☃);
  }
  
  protected boolean a(eu ☃)
  {
    et ☃ = ☃ == null ? null : ☃.b().h();
    if (☃ == null) {
      return false;
    }
    if (☃.a() == et.a.f)
    {
      String ☃ = ☃.b();
      try
      {
        int ☃ = Integer.parseInt(☃) - 1;
        if ((☃ >= 0) && (☃ < w) && (☃ != x))
        {
          x = ☃;
          f();
          return true;
        }
      }
      catch (Throwable localThrowable) {}
      return false;
    }
    boolean ☃ = super.a(☃);
    if ((☃ == true) && (☃.a() == et.a.c)) {
      j.a(null);
    }
    return ☃;
  }
  
  public eu b(int ☃, int ☃)
  {
    if (A == null) {
      return null;
    }
    int ☃ = ☃ - (l - u) / 2 - 36;
    int ☃ = ☃ - 2 - 16 - 16;
    if ((☃ < 0) || (☃ < 0)) {
      return null;
    }
    int ☃ = Math.min(128 / q.a, A.size());
    if ((☃ <= 116) && (☃ < j.k.a * ☃ + ☃))
    {
      int ☃ = ☃ / j.k.a;
      int ☃;
      if ((☃ >= 0) && (☃ < A.size()))
      {
        eu ☃ = (eu)A.get(☃);
        ☃ = 0;
        for (eu ☃ : ☃) {
          if ((☃ instanceof fa))
          {
            ☃ += j.k.a(((fa)☃).g());
            if (☃ > ☃) {
              return ☃;
            }
          }
        }
      }
      return null;
    }
    return null;
  }
  
  static class a
    extends avs
  {
    private final boolean o;
    
    public a(int ☃, int ☃, int ☃, boolean ☃)
    {
      super(☃, ☃, 23, 13, "");
      o = ☃;
    }
    
    public void a(ave ☃, int ☃, int ☃)
    {
      if (!m) {
        return;
      }
      boolean ☃ = (☃ >= h) && (☃ >= i) && (☃ < h + f) && (☃ < i + g);
      
      bfl.c(1.0F, 1.0F, 1.0F, 1.0F);
      ☃.P().a(ayo.a());
      
      int ☃ = 0;
      int ☃ = 192;
      if (☃) {
        ☃ += 23;
      }
      if (!o) {
        ☃ += 13;
      }
      b(h, i, ☃, ☃, 23, 13);
    }
  }
}
