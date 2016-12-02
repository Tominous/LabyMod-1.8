import com.google.common.collect.Lists;
import de.labystudio.gui.GuiAutoText;
import de.labystudio.gui.GuiFilter;
import de.labystudio.gui.GuiNameHistory;
import de.labystudio.labymod.ConfigManager;
import de.labystudio.labymod.ModSettings;
import de.labystudio.utils.Allowed;
import de.labystudio.utils.Color;
import de.labystudio.utils.DrawUtils;
import de.labystudio.utils.NameHistory;
import de.labystudio.utils.NameMCUtil;
import de.labystudio.utils.Scrollbar;
import de.labystudio.utils.UUIDFetcher;
import java.io.IOException;
import java.util.ArrayList;
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
  private boolean symbolsGui = false;
  private Scrollbar scrollbar = new Scrollbar(15);
  private String symbolsString = getSymbols();
  
  public awv() {}
  
  public awv(String defaultText)
  {
    this.u = defaultText;
  }
  
  public void b()
  {
    Keyboard.enableRepeatEvents(true);
    this.h = this.j.q.d().c().size();
    this.a = new avw(0, this.q, 4, this.m - 12, this.l - 4 - 20, 12);
    this.a.f(100);
    this.a.a(false);
    this.a.b(true);
    this.a.a(this.u);
    this.a.d(false);
    
    int i = 0;
    if (ConfigManager.settings.chatFilter)
    {
      avs button;
      this.n.add(button = new avs(2, this.l - 48 - i, 4, 45, 20, Color.cl("a") + "Filter"));
      button.l = Allowed.chat();
      i += 47;
    }
    if (ConfigManager.settings.autoText)
    {
      avs button;
      this.n.add(button = new avs(3, this.l - 54 - i, 4, 50, 20, Color.cl("a") + "AutoText"));
      button.l = Allowed.chat();
      i += 47;
    }
    if (ConfigManager.settings.nameHistory)
    {
      avs button;
      this.n.add(button = new avs(4, this.l - 76 - i, 4, 67, 20, Color.cl("a") + "NameHistory"));
    }
    this.a.f();
    
    this.scrollbar.setPosition(this.l - 6, this.m - 145, this.l - 5, this.m - 20);
    this.scrollbar.update(20);
    this.scrollbar.setSpeed(10);
    this.scrollbar.setEntryHeight(20);
  }
  
  protected void a(avs button)
    throws IOException
  {
    super.a(button);
    if (button.k == 2) {
      this.j.a(new GuiFilter(this.a.b()));
    }
    if (button.k == 3) {
      this.j.a(new GuiAutoText(this.a.b()));
    }
    if (button.k == 4) {
      this.j.a(new GuiNameHistory(this.a.b()));
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
      if (keyCode == 200)
      {
        b(-1);
        this.a.f();
      }
      else if (keyCode == 208)
      {
        b(1);
        this.a.f();
      }
      else if (keyCode == 201)
      {
        this.j.q.d().b(this.j.q.d().i() - 1);
      }
      else if (keyCode == 209)
      {
        this.j.q.d().b(-this.j.q.d().i() + 1);
      }
      else
      {
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
    this.scrollbar.mouseInput();
  }
  
  protected void a(int mouseX, int mouseY, int mouseButton)
    throws IOException
  {
    if (mouseButton == 0)
    {
      eu ichatcomponent = this.j.q.d().a(Mouse.getX(), Mouse.getY());
      if (a(ichatcomponent))
      {
        this.a.f();
        return;
      }
    }
    if (mouseButton == 1)
    {
      eu iChatClickHover = this.j.q.d().a(Mouse.getX(), Mouse.getY());
      if ((iChatClickHover != null) && (iChatClickHover.b() != null) && (iChatClickHover.b().h() != null))
      {
        String value = iChatClickHover.b().h().b();
        if ((value != null) && (value.startsWith("/msg ")))
        {
          String name = value.replace("/msg ", "").replace(" ", "");
          if (!NameMCUtil.isInCache(name)) {
            NameMCUtil.getNameHistory(name);
          }
        }
      }
    }
    boolean hoverSymbols = (mouseX > this.l - 2 - 13) && (mouseX < this.l - 2) && (mouseY > this.m - 14) && (mouseY < this.m - 2);
    if ((hoverSymbols) && (Allowed.chat())) {
      this.symbolsGui = (!this.symbolsGui);
    }
    this.scrollbar.mouseAction(mouseX, mouseY, false);
    if (this.symbolsGui)
    {
      int row = 0;
      int column = 0;
      for (int i = 0; i < this.symbolsString.length(); i++)
      {
        String symbol = this.symbolsString.charAt(i) + "";
        if ((column * 10 + this.scrollbar.getScrollY() > -5) && (column * 10 + this.scrollbar.getScrollY() < 125))
        {
          if ((mouseX > this.l - 93 + row * 10 - 5) && (mouseX < this.l - 93 + row * 10 + 6)) {}
          boolean hoverSymbol = (mouseY > this.m - 147 + column * 10 + this.scrollbar.getScrollY() - 5) && (mouseY < this.m - 147 + column * 10 + this.scrollbar.getScrollY() + 6);
          if (hoverSymbol)
          {
            this.a.a(symbol.charAt(0), 0);
            break;
          }
        }
        row++;
        if (row > 8)
        {
          row = 0;
          column++;
        }
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
    a(2, this.m - 14, this.l - 2 - 15, this.m - 2, Integer.MIN_VALUE);
    this.a.g();
    eu ichatcomponent = this.j.q.d().a(Mouse.getX(), Mouse.getY());
    if ((ichatcomponent != null) && (ichatcomponent.b().i() != null)) {
      a(ichatcomponent, mouseX, mouseY);
    }
    eu iChatClickHover = this.j.q.d().a(Mouse.getX(), Mouse.getY());
    try
    {
      if ((iChatClickHover != null) && (iChatClickHover.b() != null) && (iChatClickHover.b().h() != null))
      {
        String value = iChatClickHover.b().h().b();
        if ((value != null) && (value.startsWith("/msg ")))
        {
          String name = value.replace("/msg ", "").replace(" ", "");
          if (NameMCUtil.isInCache(name))
          {
            NameHistory history = NameMCUtil.getNameHistory(name);
            ArrayList<String> lines = new ArrayList();
            boolean currentName = true;
            for (UUIDFetcher change : history.getChanges()) {
              if (change.changedToAt != 0L)
              {
                long time = System.currentTimeMillis() - change.changedToAt;
                long secs = time / 1000L;
                long mins = secs / 60L;
                long hours = mins / 60L;
                long days = hours / 24L;
                long months = days / 31L;
                long years = months / 12L;
                
                String date = null;
                if (months >= 12L) {
                  date = years + " year" + (years == 1L ? "" : "s");
                } else if (days >= 31L) {
                  date = months + " month" + (months == 1L ? "" : "s");
                } else if (hours >= 24L) {
                  date = days + " day" + (days == 1L ? "" : "s");
                } else if (mins >= 60L) {
                  date = hours + " hour" + (hours == 1L ? "" : "s");
                } else if (secs >= 60L) {
                  date = mins + " min" + (mins == 1L ? "" : "s");
                } else {
                  date = secs + "sec" + (secs == 1L ? "" : "s");
                }
                if (time < 0L) {
                  date = "In the future!";
                }
                String c = "7";
                if (currentName) {
                  c = "6";
                }
                currentName = false;
                lines.add(Color.cl(c) + change.name + Color.cl("8") + " - " + Color.cl("8") + date);
              }
              else
              {
                lines.add(Color.cl("a") + change.name);
              }
            }
            a(lines, mouseX, mouseY);
            bfl.f();
          }
          else
          {
            ArrayList<String> lines = new ArrayList();
            lines.add(Color.cl("a") + "Rightclick this name to view all name changes!");
            a(lines, mouseX, mouseY);
            bfl.f();
          }
        }
      }
    }
    catch (Exception error)
    {
      error.printStackTrace();
    }
    a(this.l - 2 - 13, this.m - 14, this.l - 2, this.m - 2, Integer.MIN_VALUE);
    boolean hoverSymbols = (mouseX > this.l - 2 - 13) && (mouseX < this.l - 2) && (mouseY > this.m - 14) && (mouseY < this.m - 2);
    a(this.j.k, this.symbolsGui ? "-" : "+", this.l - 8, this.m - 12, hoverSymbols ? -100000 : -1);
    if (this.symbolsGui)
    {
      this.scrollbar.calc();
      a(this.l - 100, this.m - 150, this.l - 2, this.m - 16, Integer.MIN_VALUE);
      a(this.l - 6, this.m - 145, this.l - 5, this.m - 20, Integer.MIN_VALUE);
      a(this.l - 7, this.scrollbar.top, this.l - 4, (int)(this.scrollbar.top + this.scrollbar.barLength), Integer.MAX_VALUE);
      
      int row = 0;
      int column = 0;
      for (int i = 0; i < this.symbolsString.length(); i++)
      {
        String symbol = this.symbolsString.charAt(i) + "";
        if ((column * 10 + this.scrollbar.getScrollY() > -5) && (column * 10 + this.scrollbar.getScrollY() < 125))
        {
          if ((mouseX > this.l - 93 + row * 10 - 5) && (mouseX < this.l - 93 + row * 10 + 6)) {}
          boolean hoverSymbol = (mouseY > this.m - 147 + column * 10 + this.scrollbar.getScrollY() - 5) && (mouseY < this.m - 147 + column * 10 + this.scrollbar.getScrollY() + 6);
          a(this.j.k, symbol, this.l - 93 + row * 10, this.m - 147 + column * 10 + this.scrollbar
            .getScrollY(), hoverSymbol ? 41536 : -1);
        }
        row++;
        if (row > 8)
        {
          row = 0;
          column++;
        }
      }
    }
    super.a(mouseX, mouseY, partialTicks);
    DrawUtils.updateMouse(mouseX, mouseY);
  }
  
  public String getSymbols()
  {
    String str = "❤❥✔✖✗✘❂⋆✢✣✤✥✦✩✪✫✬✭✮✯✰★✱✲✳✴✵✶✷✸✹✺✻✼❄❅❆❇❈❉❊❋☆✡❂✽✾✿❀❁❃❋✌♼♽✂✄✈➡⬅⬆⬇➟➡➢➣➤➥➦➧➨➚➘➙➛➜➝➞➸➲➳➳➴➵➶➷➸➹➺➻➼➽Ⓜ⬛⬜█▛▀▜▆▄▌☕ℹ™⚑⚐☃⚠⚔⚖⚒⚙⚜⚀⚁⚂⚃⚄⚅⚊⚋⚌⚍⚎⚏☰☱☲☳☴☵☶☷⚆⚇⚈⚉♿♩♪♫♬♭♮♯♠♡♢♣♤♥♦♧♔♕♖♗♘♙♚♛♜♝♞♟⚪⚫☯☮☣☏➀➁➂➃➄➅➆➇➈➉➊➋➌➍➎➏➐➑➒➓ⓐⓑⓒⓓⓔⓕⓖⓗⓘⓙⓚⓛⓜⓝⓞⓟⓠⓡⓢⓣⓤⓥⓦⓧⓨⓩ❤❥웃유♋☮✌☏☢☠✔☑♚▲♪✈⌚¿♥❣♂♀☿Ⓐ✍✉☣☤✘☒♛▼♫⌘⌛¡♡ღツ☼☁❅♒✎©®™Σ✪✯☭➳✞℃℉✿ϟ☃☂✄¢£∞✫★½☯✡☪✿☺☻☹☼☂☃⌇⚛⌨✆☎⌥⇧↩✞✡☭←→↑↓➫⬇⬆☜☞☝☟✍✎✌☮✔★☆♺⚑⚐✉✄⌲✈♦♣♠♥❤♡♪♩♫♬♯♀♂⚢⚣❑❒◈◐◑✖∞«»‹›–—⁄¶¡¿‽⁂※±×≈÷≠π†‡¥€¢£™‰…·•●";
    
    String dub = "";
    for (int i = 0; i < str.length(); i++)
    {
      String input = str.charAt(i) + "";
      if ((!input.equals(" ")) && 
        (!dub.contains(input))) {
        dub = dub + input;
      }
    }
    return dub;
  }
  
  protected void a(int mouseX, int mouseY, int clickedMouseButton, long timeSinceLastClick)
  {
    this.scrollbar.mouseAction(mouseX, mouseY, true);
    super.a(mouseX, mouseY, clickedMouseButton, timeSinceLastClick);
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
