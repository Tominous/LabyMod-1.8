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
    this.a = p_i1033_1_;
    this.f = p_i1033_2_;
  }
  
  public void e()
  {
    this.h.a();
    this.g.a();
    this.serverAutocommand.a();
  }
  
  public void b()
  {
    Keyboard.enableRepeatEvents(true);
    this.n.clear();
    this.n.add(new avs(0, this.l / 2 - 100, this.m / 4 + 96 + 18 + 22, bnq.a("addServer.add", new Object[0])));
    this.n.add(new avs(1, this.l / 2 - 100, this.m / 4 + 120 + 18 + 22, bnq.a("gui.cancel", new Object[0])));
    this.n.add(this.i = new avs(2, this.l / 2 - 100, this.m / 4 + 92 + 20, bnq.a("addServer.resourcePack", new Object[0]) + ": " + this.f.b().a().d()));
    this.h = new avw(0, this.q, this.l / 2 - 100, 66, 200, 20);
    this.h.b(true);
    this.h.a(this.f.a);
    this.g = new avw(1, this.q, this.l / 2 - 100, 106, 200, 20);
    this.g.f(128);
    this.g.a(this.f.b);
    this.g.a(this.r);
    ((avs)this.n.get(0)).l = ((this.g.b().length() > 0) && (this.g.b().split(":").length > 0) && (this.h.b().length() > 0));
    this.serverAutocommand = new avw(1, this.q, this.l / 2 - 100, 146, 200, 20);
    this.serverAutocommand.f(128);
    this.serverAutocommand.a("/" + this.f.serverCommand);
    ((avs)this.n.get(0)).l = ((this.serverAutocommand.b().length() > 0) && (this.serverAutocommand.b().split(":").length > 0) && (this.serverAutocommand.b().length() > 0));
  }
  
  public void m()
  {
    Keyboard.enableRepeatEvents(false);
  }
  
  protected void a(avs button)
    throws IOException
  {
    if (button.l) {
      if (button.k == 2)
      {
        this.f.a(bde.a.values()[((this.f.b().ordinal() + 1) % bde.a.values().length)]);
        this.i.j = (bnq.a("addServer.resourcePack", new Object[0]) + ": " + this.f.b().a().d());
      }
      else if (button.k == 1)
      {
        this.a.a(false, 0);
      }
      else if (button.k == 0)
      {
        this.f.a = this.h.b();
        this.f.b = this.g.b();
        this.f.serverCommand = this.serverAutocommand.b().replace("/", "");
        this.a.a(true, 0);
      }
    }
  }
  
  protected void a(char typedChar, int keyCode)
    throws IOException
  {
    this.h.a(typedChar, keyCode);
    this.g.a(typedChar, keyCode);
    if ((this.serverAutocommand.a(typedChar, keyCode)) && 
      (!this.serverAutocommand.b().startsWith("/"))) {
      this.serverAutocommand.a("/" + this.serverAutocommand.b());
    }
    if (keyCode == 15) {
      if (this.h.m())
      {
        this.h.b(false);
        this.g.b(true);
      }
      else if (this.g.m())
      {
        this.g.b(false);
        this.serverAutocommand.b(true);
      }
      else if (this.serverAutocommand.m())
      {
        this.serverAutocommand.b(false);
        this.h.b(true);
      }
    }
    if ((keyCode == 28) || (keyCode == 156)) {
      a((avs)this.n.get(0));
    }
    ((avs)this.n.get(0)).l = ((this.g.b().length() > 0) && (this.g.b().split(":").length > 0) && (this.h.b().length() > 0));
  }
  
  protected void a(int mouseX, int mouseY, int mouseButton)
    throws IOException
  {
    super.a(mouseX, mouseY, mouseButton);
    this.g.a(mouseX, mouseY, mouseButton);
    this.h.a(mouseX, mouseY, mouseButton);
    this.serverAutocommand.a(mouseX, mouseY, mouseButton);
  }
  
  public void a(int mouseX, int mouseY, float partialTicks)
  {
    c();
    a(this.q, bnq.a("addServer.title", new Object[0]), this.l / 2, 17, 16777215);
    c(this.q, bnq.a("addServer.enterName", new Object[0]), this.l / 2 - 100, 53, 10526880);
    c(this.q, bnq.a("addServer.enterIp", new Object[0]), this.l / 2 - 100, 94, 10526880);
    c(this.q, "Autocommand:", this.l / 2 - 100, 134, 10526880);
    this.h.g();
    this.g.g();
    this.serverAutocommand.g();
    if (this.serverAutocommand.b().replace("/", "").isEmpty()) {
      c(this.q, Color.cl("c") + "No command defined", this.l / 2 - 50, 152, 10526880);
    }
    super.a(mouseX, mouseY, partialTicks);
  }
}
