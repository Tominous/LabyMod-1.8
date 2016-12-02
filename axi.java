import com.google.common.base.Predicate;
import de.labystudio.utils.Color;
import java.io.IOException;
import java.net.IDN;
import java.util.List;
import org.lwjgl.input.Keyboard;

public class axi
  extends axu
{
  private final axu a;
  private final bde f;
  private avw g;
  private avw h;
  private avw serverAutocommand;
  private avs i;
  private Predicate<String> r = new Predicate()
  {
    public boolean a(String p_apply_1_)
    {
      if (p_apply_1_.length() == 0) {
        return true;
      }
      String[] astring = p_apply_1_.split(":");
      if (astring.length == 0) {
        return true;
      }
      try
      {
        String s = IDN.toASCII(astring[0]);
        return true;
      }
      catch (IllegalArgumentException var4) {}
      return false;
    }
  };
  
  public axi(axu p_i1033_1_, bde p_i1033_2_)
  {
    a = p_i1033_1_;
    f = p_i1033_2_;
  }
  
  public void e()
  {
    h.a();
    g.a();
    serverAutocommand.a();
  }
  
  public void b()
  {
    Keyboard.enableRepeatEvents(true);
    n.clear();
    n.add(new avs(0, l / 2 - 100, m / 4 + 96 + 18 + 22, bnq.a("addServer.add", new Object[0])));
    n.add(new avs(1, l / 2 - 100, m / 4 + 120 + 18 + 22, bnq.a("gui.cancel", new Object[0])));
    n.add(i = new avs(2, l / 2 - 100, m / 4 + 92 + 20, bnq.a("addServer.resourcePack", new Object[0]) + ": " + f.b().a().d()));
    h = new avw(0, q, l / 2 - 100, 66, 200, 20);
    h.b(true);
    h.a(f.a);
    g = new avw(1, q, l / 2 - 100, 106, 200, 20);
    g.f(128);
    g.a(f.b);
    g.a(r);
    n.get(0)).l = ((g.b().length() > 0) && (g.b().split(":").length > 0) && (h.b().length() > 0));
    serverAutocommand = new avw(1, q, l / 2 - 100, 146, 200, 20);
    serverAutocommand.f(128);
    serverAutocommand.a("/" + f.serverCommand);
    n.get(0)).l = ((serverAutocommand.b().length() > 0) && (serverAutocommand.b().split(":").length > 0) && (serverAutocommand.b().length() > 0));
  }
  
  public void m()
  {
    Keyboard.enableRepeatEvents(false);
  }
  
  protected void a(avs button)
    throws IOException
  {
    if (l) {
      if (k == 2)
      {
        f.a(bde.a.values()[((f.b().ordinal() + 1) % bde.a.values().length)]);
        i.j = (bnq.a("addServer.resourcePack", new Object[0]) + ": " + f.b().a().d());
      }
      else if (k == 1)
      {
        a.a(false, 0);
      }
      else if (k == 0)
      {
        f.a = h.b();
        f.b = g.b();
        f.serverCommand = serverAutocommand.b().replace("/", "");
        a.a(true, 0);
      }
    }
  }
  
  protected void a(char typedChar, int keyCode)
    throws IOException
  {
    h.a(typedChar, keyCode);
    g.a(typedChar, keyCode);
    if ((serverAutocommand.a(typedChar, keyCode)) && 
      (!serverAutocommand.b().startsWith("/"))) {
      serverAutocommand.a("/" + serverAutocommand.b());
    }
    if (keyCode == 15) {
      if (h.m())
      {
        h.b(false);
        g.b(true);
      }
      else if (g.m())
      {
        g.b(false);
        serverAutocommand.b(true);
      }
      else if (serverAutocommand.m())
      {
        serverAutocommand.b(false);
        h.b(true);
      }
    }
    if ((keyCode == 28) || (keyCode == 156)) {
      a((avs)n.get(0));
    }
    n.get(0)).l = ((g.b().length() > 0) && (g.b().split(":").length > 0) && (h.b().length() > 0));
  }
  
  protected void a(int mouseX, int mouseY, int mouseButton)
    throws IOException
  {
    super.a(mouseX, mouseY, mouseButton);
    g.a(mouseX, mouseY, mouseButton);
    h.a(mouseX, mouseY, mouseButton);
    serverAutocommand.a(mouseX, mouseY, mouseButton);
  }
  
  public void a(int mouseX, int mouseY, float partialTicks)
  {
    c();
    a(q, bnq.a("addServer.title", new Object[0]), l / 2, 17, 16777215);
    c(q, bnq.a("addServer.enterName", new Object[0]), l / 2 - 100, 53, 10526880);
    c(q, bnq.a("addServer.enterIp", new Object[0]), l / 2 - 100, 94, 10526880);
    c(q, "Autocommand:", l / 2 - 100, 134, 10526880);
    h.g();
    g.g();
    serverAutocommand.g();
    if (serverAutocommand.b().replace("/", "").isEmpty()) {
      c(q, Color.cl("c") + "No command defined", l / 2 - 50, 152, 10526880);
    }
    super.a(mouseX, mouseY, partialTicks);
  }
}
