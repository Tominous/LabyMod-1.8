import com.google.common.collect.Lists;
import de.labystudio.gui.GuiAutoText;
import de.labystudio.gui.GuiFilter;
import de.labystudio.gui.GuiSymbolSelector;
import de.labystudio.labymod.ConfigManager;
import de.labystudio.labymod.ModSettings;
import de.labystudio.utils.Color;
import de.labystudio.utils.DrawUtils;
import java.io.IOException;
import java.util.List;
import org.apache.commons.lang3.StringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.lwjgl.input.Keyboard;
import org.lwjgl.input.Mouse;

public class awv
  extends axu
{
  private static final Logger f = ;
  private String g = "";
  private int h = -1;
  private boolean i;
  private boolean r;
  private int s;
  private List<String> t = Lists.newArrayList();
  protected avw a;
  private String u = "";
  
  public awv() {}
  
  public awv(String defaultText)
  {
    this.u = defaultText;
  }
  
  public void b()
  {
    Keyboard.enableRepeatEvents(true);
    this.h = this.j.q.d().c().size();
    this.a = new avw(0, this.q, 4, this.m - 12, this.l - 4, 12);
    this.a.f(100);
    this.a.a(false);
    this.a.b(true);
    this.a.a(this.u);
    this.a.d(false);
    
    int i = 0;
    this.n.add(new avs(1, this.l - 48 - i, 4, 45, 20, Color.cl("a") + "Symbols"));
    i += 47;
    if (ConfigManager.settings.chatFilter.booleanValue())
    {
      this.n.add(new avs(2, this.l - 48 - i, 4, 45, 20, Color.cl("a") + "Filter"));
      i += 47;
    }
    if (ConfigManager.settings.autoText)
    {
      this.n.add(new avs(3, this.l - 54 - i, 4, 50, 20, Color.cl("a") + "AutoText"));
      i += 47;
    }
  }
  
  protected void a(avs button)
    throws IOException
  {
    super.a(button);
    if (button.k == 1) {
      this.j.a(new GuiSymbolSelector(this.a.b()));
    }
    if (button.k == 2) {
      this.j.a(new GuiFilter(this.a.b()));
    }
    if (button.k == 3) {
      this.j.a(new GuiAutoText(this.a.b()));
    }
  }
  
  public void m()
  {
    Keyboard.enableRepeatEvents(false);
    this.j.q.d().d();
  }
  
  public void e()
  {
    this.a.a();
  }
  
  protected void a(char typedChar, int keyCode)
    throws IOException
  {
    this.r = false;
    if (keyCode == 15) {
      a();
    } else {
      this.i = false;
    }
    if (keyCode == 1)
    {
      this.j.a((axu)null);
    }
    else if ((keyCode != 28) && (keyCode != 156))
    {
      if (keyCode == 200) {
        b(-1);
      } else if (keyCode == 208) {
        b(1);
      } else if (keyCode == 201) {
        this.j.q.d().b(this.j.q.d().i() - 1);
      } else if (keyCode == 209) {
        this.j.q.d().b(-this.j.q.d().i() + 1);
      } else {
        this.a.a(typedChar, keyCode);
      }
    }
    else
    {
      String s = this.a.b().trim();
      if (s.length() > 0) {
        f(s);
      }
      this.j.a((axu)null);
    }
  }
  
  public void k()
    throws IOException
  {
    super.k();
    int i = Mouse.getEventDWheel();
    if (i != 0)
    {
      if (i > 1) {
        i = 1;
      }
      if (i < -1) {
        i = -1;
      }
      if (!r()) {
        i *= 7;
      }
      this.j.q.d().b(i);
    }
  }
  
  protected void a(int mouseX, int mouseY, int mouseButton)
    throws IOException
  {
    if (mouseButton == 0)
    {
      eu ichatcomponent = this.j.q.d().a(Mouse.getX(), Mouse.getY());
      if (a(ichatcomponent)) {
        return;
      }
    }
    this.a.a(mouseX, mouseY, mouseButton);
    super.a(mouseX, mouseY, mouseButton);
  }
  
  protected void a(String newChatText, boolean shouldOverwrite)
  {
    if (shouldOverwrite) {
      this.a.a(newChatText);
    } else {
      this.a.b(newChatText);
    }
  }
  
  public void a()
  {
    String s;
    if (this.i)
    {
      this.a.b(this.a.a(-1, this.a.i(), false) - this.a.i());
      if (this.s >= this.t.size()) {
        this.s = 0;
      }
    }
    else
    {
      int i = this.a.a(-1, this.a.i(), false);
      this.t.clear();
      this.s = 0;
      s = this.a.b().substring(i).toLowerCase();
      String s1 = this.a.b().substring(0, this.a.i());
      a(s1, s);
      if (this.t.isEmpty()) {
        return;
      }
      this.i = true;
      this.a.b(i - this.a.i());
    }
    if (this.t.size() > 1)
    {
      StringBuilder stringbuilder = new StringBuilder();
      for (String s2 : this.t)
      {
        if (stringbuilder.length() > 0) {
          stringbuilder.append(", ");
        }
        stringbuilder.append(s2);
      }
      this.j.q.d().a(new fa(stringbuilder.toString()), 1);
    }
    this.a.b((String)this.t.get(this.s++));
  }
  
  private void a(String p_146405_1_, String p_146405_2_)
  {
    if (p_146405_1_.length() >= 1)
    {
      cj blockpos = null;
      if ((this.j.s != null) && (this.j.s.a == auh.a.b)) {
        blockpos = this.j.s.a();
      }
      this.j.h.a.a(new id(p_146405_1_, blockpos));
      this.r = true;
    }
  }
  
  public void b(int msgPos)
  {
    int i = this.h + msgPos;
    int j = this.j.q.d().c().size();
    i = ns.a(i, 0, j);
    if (i != this.h) {
      if (i == j)
      {
        this.h = j;
        this.a.a(this.g);
      }
      else
      {
        if (this.h == j) {
          this.g = this.a.b();
        }
        this.a.a((String)this.j.q.d().c().get(i));
        this.h = i;
      }
    }
  }
  
  public void a(int mouseX, int mouseY, float partialTicks)
  {
    a(2, this.m - 14, this.l - 2, this.m - 2, Integer.MIN_VALUE);
    this.a.g();
    eu ichatcomponent = this.j.q.d().a(Mouse.getX(), Mouse.getY());
    if ((ichatcomponent != null) && (ichatcomponent.b().i() != null)) {
      a(ichatcomponent, mouseX, mouseY);
    }
    super.a(mouseX, mouseY, partialTicks);
    DrawUtils.updateMouse(mouseX, mouseY);
  }
  
  public void a(String[] p_146406_1_)
  {
    if (this.r)
    {
      this.i = false;
      this.t.clear();
      for (String s : p_146406_1_) {
        if (s.length() > 0) {
          this.t.add(s);
        }
      }
      String s1 = this.a.b().substring(this.a.a(-1, this.a.i(), false));
      String s2 = StringUtils.getCommonPrefix(p_146406_1_);
      if ((s2.length() > 0) && (!s1.equalsIgnoreCase(s2)))
      {
        this.a.b(this.a.a(-1, this.a.i(), false) - this.a.i());
        this.a.b(s2);
      }
      else if (this.t.size() > 0)
      {
        this.i = true;
        a();
      }
    }
  }
  
  public boolean d()
  {
    return false;
  }
}
