import io.netty.buffer.ByteBuf;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.Callable;
import net.minecraft.server.MinecraftServer;

public abstract class adc
  implements m
{
  private static final SimpleDateFormat a = new SimpleDateFormat("HH:mm:ss");
  private int b;
  private boolean c = true;
  private eu d = null;
  private String e = "";
  private String f = "@";
  private final n g = new n();
  
  public int j()
  {
    return b;
  }
  
  public eu k()
  {
    return d;
  }
  
  public void a(dn ☃)
  {
    ☃.a("Command", e);
    ☃.a("SuccessCount", b);
    ☃.a("CustomName", f);
    ☃.a("TrackOutput", c);
    if ((d != null) && (c)) {
      ☃.a("LastOutput", eu.a.a(d));
    }
    g.b(☃);
  }
  
  public void b(dn ☃)
  {
    e = ☃.j("Command");
    b = ☃.f("SuccessCount");
    if (☃.b("CustomName", 8)) {
      f = ☃.j("CustomName");
    }
    if (☃.b("TrackOutput", 1)) {
      c = ☃.n("TrackOutput");
    }
    if ((☃.b("LastOutput", 8)) && (c)) {
      d = eu.a.a(☃.j("LastOutput"));
    }
    g.a(☃);
  }
  
  public boolean a(int ☃, String ☃)
  {
    return ☃ <= 2;
  }
  
  public void a(String ☃)
  {
    e = ☃;
    b = 0;
  }
  
  public String l()
  {
    return e;
  }
  
  public void a(adm ☃)
  {
    if (D) {
      b = 0;
    }
    MinecraftServer ☃ = MinecraftServer.N();
    if ((☃ != null) && (☃.O()) && (☃.al()))
    {
      l ☃ = ☃.P();
      try
      {
        d = null;
        b = ☃.a(this, e);
      }
      catch (Throwable ☃)
      {
        b ☃ = b.a(☃, "Executing command block");
        c ☃ = ☃.a("Command to be executed");
        
        ☃.a("Command", new Callable()
        {
          public String a()
            throws Exception
          {
            return l();
          }
        });
        ☃.a("Name", new Callable()
        {
          public String a()
            throws Exception
          {
            return e_();
          }
        });
        throw new e(☃);
      }
    }
    else
    {
      b = 0;
    }
  }
  
  public String e_()
  {
    return f;
  }
  
  public eu f_()
  {
    return new fa(e_());
  }
  
  public void b(String ☃)
  {
    f = ☃;
  }
  
  public void a(eu ☃)
  {
    if ((c) && (e() != null) && (!eD))
    {
      d = new fa("[" + a.format(new Date()) + "] ").a(☃);
      h();
    }
  }
  
  public boolean u_()
  {
    MinecraftServer ☃ = MinecraftServer.N();
    return (☃ == null) || (!☃.O()) || (d[0].Q().b("commandBlockOutput"));
  }
  
  public void a(n.a ☃, int ☃)
  {
    g.a(this, ☃, ☃);
  }
  
  public abstract void h();
  
  public abstract int i();
  
  public abstract void a(ByteBuf paramByteBuf);
  
  public void b(eu ☃)
  {
    d = ☃;
  }
  
  public void a(boolean ☃)
  {
    c = ☃;
  }
  
  public boolean m()
  {
    return c;
  }
  
  public boolean a(wn ☃)
  {
    if (!bA.d) {
      return false;
    }
    if (eD) {
      ☃.a(this);
    }
    return true;
  }
  
  public n n()
  {
    return g;
  }
}
