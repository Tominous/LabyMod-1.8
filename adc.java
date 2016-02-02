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
    return this.b;
  }
  
  public eu k()
  {
    return this.d;
  }
  
  public void a(dn ☃)
  {
    ☃.a("Command", this.e);
    ☃.a("SuccessCount", this.b);
    ☃.a("CustomName", this.f);
    ☃.a("TrackOutput", this.c);
    if ((this.d != null) && (this.c)) {
      ☃.a("LastOutput", eu.a.a(this.d));
    }
    this.g.b(☃);
  }
  
  public void b(dn ☃)
  {
    this.e = ☃.j("Command");
    this.b = ☃.f("SuccessCount");
    if (☃.b("CustomName", 8)) {
      this.f = ☃.j("CustomName");
    }
    if (☃.b("TrackOutput", 1)) {
      this.c = ☃.n("TrackOutput");
    }
    if ((☃.b("LastOutput", 8)) && (this.c)) {
      this.d = eu.a.a(☃.j("LastOutput"));
    }
    this.g.a(☃);
  }
  
  public boolean a(int ☃, String ☃)
  {
    return ☃ <= 2;
  }
  
  public void a(String ☃)
  {
    this.e = ☃;
    this.b = 0;
  }
  
  public String l()
  {
    return this.e;
  }
  
  public void a(adm ☃)
  {
    if (☃.D) {
      this.b = 0;
    }
    MinecraftServer ☃ = MinecraftServer.N();
    if ((☃ != null) && (☃.O()) && (☃.al()))
    {
      l ☃ = ☃.P();
      try
      {
        this.d = null;
        this.b = ☃.a(this, this.e);
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
            return adc.this.l();
          }
        });
        ☃.a("Name", new Callable()
        {
          public String a()
            throws Exception
          {
            return adc.this.e_();
          }
        });
        throw new e(☃);
      }
    }
    else
    {
      this.b = 0;
    }
  }
  
  public String e_()
  {
    return this.f;
  }
  
  public eu f_()
  {
    return new fa(e_());
  }
  
  public void b(String ☃)
  {
    this.f = ☃;
  }
  
  public void a(eu ☃)
  {
    if ((this.c) && (e() != null) && (!e().D))
    {
      this.d = new fa("[" + a.format(new Date()) + "] ").a(☃);
      h();
    }
  }
  
  public boolean u_()
  {
    MinecraftServer ☃ = MinecraftServer.N();
    return (☃ == null) || (!☃.O()) || (☃.d[0].Q().b("commandBlockOutput"));
  }
  
  public void a(n.a ☃, int ☃)
  {
    this.g.a(this, ☃, ☃);
  }
  
  public abstract void h();
  
  public abstract int i();
  
  public abstract void a(ByteBuf paramByteBuf);
  
  public void b(eu ☃)
  {
    this.d = ☃;
  }
  
  public void a(boolean ☃)
  {
    this.c = ☃;
  }
  
  public boolean m()
  {
    return this.c;
  }
  
  public boolean a(wn ☃)
  {
    if (!☃.bA.d) {
      return false;
    }
    if (☃.e().D) {
      ☃.a(this);
    }
    return true;
  }
  
  public n n()
  {
    return this.g;
  }
}
