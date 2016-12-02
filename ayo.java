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
    this.g = ☃;
    this.h = ☃;
    this.i = ☃;
    if (☃.n())
    {
      dn ☃ = ☃.o();
      this.y = ☃.c("pages", 8);
      if (this.y != null)
      {
        this.y = ((du)this.y.b());
        this.w = this.y.c();
        if (this.w < 1) {
          this.w = 1;
        }
      }
    }
    if ((this.y == null) && (☃))
    {
      this.y = new du();
      this.y.a(new ea(""));
      
      this.w = 1;
    }
  }
  
  public void e()
  {
    super.e();
    this.t += 1;
  }
  
  public void b()
  {
    this.n.clear();
    Keyboard.enableRepeatEvents(true);
    if (this.i)
    {
      this.n.add(this.F = new avs(3, this.l / 2 - 100, 4 + this.v, 98, 20, bnq.a("book.signButton", new Object[0])));
      this.n.add(this.E = new avs(0, this.l / 2 + 2, 4 + this.v, 98, 20, bnq.a("gui.done", new Object[0])));
      
      this.n.add(this.G = new avs(5, this.l / 2 - 100, 4 + this.v, 98, 20, bnq.a("book.finalizeButton", new Object[0])));
      this.n.add(this.H = new avs(4, this.l / 2 + 2, 4 + this.v, 98, 20, bnq.a("gui.cancel", new Object[0])));
    }
    else
    {
      this.n.add(this.E = new avs(0, this.l / 2 - 100, 4 + this.v, 200, 20, bnq.a("gui.done", new Object[0])));
    }
    int ☃ = (this.l - this.u) / 2;
    int ☃ = 2;
    
    this.n.add(this.C = new ayo.a(1, ☃ + 120, ☃ + 154, true));
    this.n.add(this.D = new ayo.a(2, ☃ + 38, ☃ + 154, false));
    
    f();
  }
  
  public void m()
  {
    Keyboard.enableRepeatEvents(false);
  }
  
  private void f()
  {
    this.C.m = ((!this.s) && ((this.x < this.w - 1) || (this.i)));
    this.D.m = ((!this.s) && (this.x > 0));
    
    this.E.m = ((!this.i) || (!this.s));
    if (this.i)
    {
      this.F.m = (!this.s);
      this.H.m = this.s;
      this.G.m = this.s;
      this.G.l = (this.z.trim().length() > 0);
    }
  }
  
  private void a(boolean ☃)
  {
    if ((!this.i) || (!this.r)) {
      return;
    }
    if (this.y != null)
    {
      while (this.y.c() > 1)
      {
        String ☃ = this.y.f(this.y.c() - 1);
        if (☃.length() != 0) {
          break;
        }
        this.y.a(this.y.c() - 1);
      }
      if (this.h.n())
      {
        dn ☃ = this.h.o();
        ☃.a("pages", this.y);
      }
      else
      {
        this.h.a("pages", this.y);
      }
      String ☃ = "MC|BEdit";
      if (☃)
      {
        ☃ = "MC|BSign";
        this.h.a("author", new ea(this.g.e_()));
        this.h.a("title", new ea(this.z.trim()));
        for (int ☃ = 0; ☃ < this.y.c(); ☃++)
        {
          String ☃ = this.y.f(☃);
          eu ☃ = new fa(☃);
          ☃ = eu.a.a(☃);
          this.y.a(☃, new ea(☃));
        }
        this.h.a(zy.bN);
      }
      em ☃ = new em(Unpooled.buffer());
      
      ☃.a(this.h);
      this.j.u().a(new im(☃, ☃));
    }
  }
  
  protected void a(avs ☃)
  {
    if (!☃.l) {
      return;
    }
    if (☃.k == 0)
    {
      this.j.a(null);
      a(false);
    }
    else if ((☃.k == 3) && (this.i))
    {
      this.s = true;
    }
    else if (☃.k == 1)
    {
      if (this.x < this.w - 1)
      {
        this.x += 1;
      }
      else if (this.i)
      {
        g();
        if (this.x < this.w - 1) {
          this.x += 1;
        }
      }
    }
    else if (☃.k == 2)
    {
      if (this.x > 0) {
        this.x -= 1;
      }
    }
    else if ((☃.k == 5) && (this.s))
    {
      a(true);
      this.j.a(null);
    }
    else if ((☃.k == 4) && (this.s))
    {
      this.s = false;
    }
    f();
  }
  
  private void g()
  {
    if ((this.y == null) || (this.y.c() >= 50)) {
      return;
    }
    this.y.a(new ea(""));
    this.w += 1;
    
    this.r = true;
  }
  
  protected void a(char ☃, int ☃)
  {
    super.a(☃, ☃);
    if (!this.i) {
      return;
    }
    if (this.s) {
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
      if (!this.z.isEmpty())
      {
        this.z = this.z.substring(0, this.z.length() - 1);
        f();
      }
      return;
    case 28: 
    case 156: 
      if (!this.z.isEmpty())
      {
        a(true);
        this.j.a(null);
      }
      return;
    }
    if ((this.z.length() < 16) && (f.a(☃)))
    {
      this.z += Character.toString(☃);
      f();
      this.r = true;
    }
  }
  
  private String h()
  {
    if ((this.y != null) && (this.x >= 0) && (this.x < this.y.c())) {
      return this.y.f(this.x);
    }
    return "";
  }
  
  private void a(String ☃)
  {
    if ((this.y != null) && (this.x >= 0) && (this.x < this.y.c()))
    {
      this.y.a(this.x, new ea(☃));
      
      this.r = true;
    }
  }
  
  private void b(String ☃)
  {
    String ☃ = h();
    String ☃ = ☃ + ☃;
    
    int ☃ = this.q.b(☃ + "" + a.a + "_", 118);
    if ((☃ <= 128) && (☃.length() < 256)) {
      a(☃);
    }
  }
  
  public void a(int ☃, int ☃, float ☃)
  {
    bfl.c(1.0F, 1.0F, 1.0F, 1.0F);
    this.j.P().a(f);
    int ☃ = (this.l - this.u) / 2;
    int ☃ = 2;
    b(☃, ☃, 0, 0, this.u, this.v);
    if (this.s)
    {
      String ☃ = this.z;
      if (this.i) {
        if (this.t / 6 % 2 == 0) {
          ☃ = ☃ + "" + a.a + "_";
        } else {
          ☃ = ☃ + "" + a.h + "_";
        }
      }
      String ☃ = bnq.a("book.editTitle", new Object[0]);
      int ☃ = this.q.a(☃);
      this.q.a(☃, ☃ + 36 + (116 - ☃) / 2, ☃ + 16 + 16, 0);
      
      int ☃ = this.q.a(☃);
      this.q.a(☃, ☃ + 36 + (116 - ☃) / 2, ☃ + 48, 0);
      String ☃ = bnq.a("book.byAuthor", new Object[] { this.g.e_() });
      int ☃ = this.q.a(☃);
      this.q.a(a.i + ☃, ☃ + 36 + (116 - ☃) / 2, ☃ + 48 + 10, 0);
      
      String ☃ = bnq.a("book.finalizeWarning", new Object[0]);
      this.q.a(☃, ☃ + 36, ☃ + 80, 116, 0);
    }
    else
    {
      String ☃ = bnq.a("book.pageIndicator", new Object[] { Integer.valueOf(this.x + 1), Integer.valueOf(this.w) });
      String ☃ = "";
      if ((this.y != null) && (this.x >= 0) && (this.x < this.y.c())) {
        ☃ = this.y.f(this.x);
      }
      if (this.i)
      {
        if (this.q.b()) {
          ☃ = ☃ + "_";
        } else if (this.t / 6 % 2 == 0) {
          ☃ = ☃ + "" + a.a + "_";
        } else {
          ☃ = ☃ + "" + a.h + "_";
        }
      }
      else if (this.B != this.x)
      {
        if (abd.b(this.h.o()))
        {
          try
          {
            eu ☃ = eu.a.a(☃);
            this.A = (☃ != null ? avu.a(☃, 116, this.q, true, true) : null);
          }
          catch (JsonParseException ☃)
          {
            this.A = null;
          }
        }
        else
        {
          fa ☃ = new fa(a.e.toString() + "* Invalid book tag *");
          this.A = Lists.newArrayList(☃);
        }
        this.B = this.x;
      }
      int ☃ = this.q.a(☃);
      this.q.a(☃, ☃ - ☃ + this.u - 44, ☃ + 16, 0);
      if (this.A == null)
      {
        this.q.a(☃, ☃ + 36, ☃ + 16 + 16, 116, 0);
      }
      else
      {
        int ☃ = Math.min(128 / this.q.a, this.A.size());
        for (int ☃ = 0; ☃ < ☃; ☃++)
        {
          eu ☃ = (eu)this.A.get(☃);
          this.q.a(☃.c(), ☃ + 36, ☃ + 16 + 16 + ☃ * this.q.a, 0);
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
        if ((☃ >= 0) && (☃ < this.w) && (☃ != this.x))
        {
          this.x = ☃;
          f();
          return true;
        }
      }
      catch (Throwable localThrowable) {}
      return false;
    }
    boolean ☃ = super.a(☃);
    if ((☃ == true) && (☃.a() == et.a.c)) {
      this.j.a(null);
    }
    return ☃;
  }
  
  public eu b(int ☃, int ☃)
  {
    if (this.A == null) {
      return null;
    }
    int ☃ = ☃ - (this.l - this.u) / 2 - 36;
    int ☃ = ☃ - 2 - 16 - 16;
    if ((☃ < 0) || (☃ < 0)) {
      return null;
    }
    int ☃ = Math.min(128 / this.q.a, this.A.size());
    if ((☃ <= 116) && (☃ < this.j.k.a * ☃ + ☃))
    {
      int ☃ = ☃ / this.j.k.a;
      int ☃;
      if ((☃ >= 0) && (☃ < this.A.size()))
      {
        eu ☃ = (eu)this.A.get(☃);
        ☃ = 0;
        for (eu ☃ : ☃) {
          if ((☃ instanceof fa))
          {
            ☃ += this.j.k.a(((fa)☃).g());
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
      this.o = ☃;
    }
    
    public void a(ave ☃, int ☃, int ☃)
    {
      if (!this.m) {
        return;
      }
      boolean ☃ = (☃ >= this.h) && (☃ >= this.i) && (☃ < this.h + this.f) && (☃ < this.i + this.g);
      
      bfl.c(1.0F, 1.0F, 1.0F, 1.0F);
      ☃.P().a(ayo.a());
      
      int ☃ = 0;
      int ☃ = 192;
      if (☃) {
        ☃ += 23;
      }
      if (!this.o) {
        ☃ += 13;
      }
      b(this.h, this.i, ☃, ☃, 23, 13);
    }
  }
}
