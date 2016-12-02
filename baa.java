import com.google.common.collect.Lists;
import com.mojang.authlib.properties.PropertyMap;
import java.lang.reflect.Method;
import java.net.URI;
import java.util.Arrays;
import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.lwjgl.opengl.ContextCapabilities;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GLContext;
import tv.twitch.ErrorCode;

public class baa
  extends axu
{
  private static final Logger a = ;
  private final eu f = new fb("stream.unavailable.title", new Object[0]);
  private final axu g;
  private final baa.a h;
  private final List<fb> i;
  private final List<String> r = Lists.newArrayList();
  
  public baa(axu ☃, baa.a ☃)
  {
    this(☃, ☃, null);
  }
  
  public baa(axu ☃, baa.a ☃, List<fb> ☃)
  {
    this.g = ☃;
    this.h = ☃;
    this.i = ☃;
  }
  
  public void b()
  {
    if (this.r.isEmpty())
    {
      this.r.addAll(this.q.c(this.h.a().d(), (int)(this.l * 0.75F)));
      if (this.i != null)
      {
        this.r.add("");
        for (fb ☃ : this.i) {
          this.r.add(☃.e());
        }
      }
    }
    if (this.h.b() != null)
    {
      this.n.add(new avs(0, this.l / 2 - 155, this.m - 50, 150, 20, bnq.a("gui.cancel", new Object[0])));
      this.n.add(new avs(1, this.l / 2 - 155 + 160, this.m - 50, 150, 20, bnq.a(this.h.b().d(), new Object[0])));
    }
    else
    {
      this.n.add(new avs(0, this.l / 2 - 75, this.m - 50, 150, 20, bnq.a("gui.cancel", new Object[0])));
    }
  }
  
  public void m() {}
  
  public void a(int ☃, int ☃, float ☃)
  {
    c();
    
    int ☃ = Math.max((int)(this.m * 0.85D / 2.0D - this.r.size() * this.q.a / 2.0F), 50);
    a(this.q, this.f.d(), this.l / 2, ☃ - this.q.a * 2, 16777215);
    for (String ☃ : this.r)
    {
      a(this.q, ☃, this.l / 2, ☃, 10526880);
      ☃ += this.q.a;
    }
    super.a(☃, ☃, ☃);
  }
  
  protected void a(avs ☃)
  {
    if (!☃.l) {
      return;
    }
    if (☃.k == 1) {
      switch (baa.1.a[this.h.ordinal()])
      {
      case 1: 
      case 2: 
        a("https://account.mojang.com/me/settings");
        break;
      case 3: 
        a("https://account.mojang.com/migrate");
        break;
      case 4: 
        a("http://www.apple.com/osx/");
        break;
      case 5: 
      case 6: 
      case 7: 
        a("http://bugs.mojang.com/browse/MC");
      }
    }
    this.j.a(this.g);
  }
  
  private void a(String ☃)
  {
    try
    {
      Class<?> ☃ = Class.forName("java.awt.Desktop");
      Object ☃ = ☃.getMethod("getDesktop", new Class[0]).invoke(null, new Object[0]);
      ☃.getMethod("browse", new Class[] { URI.class }).invoke(☃, new Object[] { new URI(☃) });
    }
    catch (Throwable ☃)
    {
      a.error("Couldn't open link", ☃);
    }
  }
  
  public static void a(axu ☃)
  {
    ave ☃ = ave.A();
    bqm ☃ = ☃.Y();
    if (!bqs.l)
    {
      List<fb> ☃ = Lists.newArrayList();
      ☃.add(new fb("stream.unavailable.no_fbo.version", new Object[] { GL11.glGetString(7938) }));
      ☃.add(new fb("stream.unavailable.no_fbo.blend", new Object[] { Boolean.valueOf(GLContext.getCapabilities().GL_EXT_blend_func_separate) }));
      ☃.add(new fb("stream.unavailable.no_fbo.arb", new Object[] { Boolean.valueOf(GLContext.getCapabilities().GL_ARB_framebuffer_object) }));
      ☃.add(new fb("stream.unavailable.no_fbo.ext", new Object[] { Boolean.valueOf(GLContext.getCapabilities().GL_EXT_framebuffer_object) }));
      
      ☃.a(new baa(☃, baa.a.a, ☃));
    }
    else if ((☃ instanceof bqo))
    {
      if (((bqo)☃).a().getMessage().contains("Can't load AMD 64-bit .dll on a IA 32-bit platform")) {
        ☃.a(new baa(☃, baa.a.b));
      } else {
        ☃.a(new baa(☃, baa.a.c));
      }
    }
    else
    {
      if ((!☃.A()) && (☃.B() == ErrorCode.TTV_EC_OS_TOO_OLD)) {}
      switch (baa.1.b[g.a().ordinal()])
      {
      case 1: 
        ☃.a(new baa(☃, baa.a.d));
        break;
      case 2: 
        ☃.a(new baa(☃, baa.a.e));
        break;
      default: 
        ☃.a(new baa(☃, baa.a.f)); break;
        if (!☃.M().containsKey("twitch_access_token"))
        {
          if (☃.L().f() == avm.a.a) {
            ☃.a(new baa(☃, baa.a.g));
          } else {
            ☃.a(new baa(☃, baa.a.h));
          }
        }
        else if (!☃.C())
        {
          switch (baa.1.c[☃.E().ordinal()])
          {
          case 1: 
            ☃.a(new baa(☃, baa.a.i));
            break;
          case 2: 
          default: 
            ☃.a(new baa(☃, baa.a.j));break;
          }
        }
        else if (☃.B() != null)
        {
          List<fb> ☃ = Arrays.asList(new fb[] { new fb("stream.unavailable.initialization_failure.extra", new Object[] { ErrorCode.getString(☃.B()) }) });
          ☃.a(new baa(☃, baa.a.k, ☃));
        }
        else
        {
          ☃.a(new baa(☃, baa.a.l));
        }
        break;
      }
    }
  }
  
  public static enum a
  {
    private final eu m;
    private final eu n;
    
    private a(eu ☃)
    {
      this(☃, null);
    }
    
    private a(eu ☃, eu ☃)
    {
      this.m = ☃;
      this.n = ☃;
    }
    
    public eu a()
    {
      return this.m;
    }
    
    public eu b()
    {
      return this.n;
    }
  }
}
