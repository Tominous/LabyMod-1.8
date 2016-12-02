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
    u = defaultText;
  }
  
  public void b()
  {
    Keyboard.enableRepeatEvents(true);
    h = j.q.d().c().size();
    a = new avw(0, q, 4, m - 12, l - 4 - 20, 12);
    a.f(100);
    a.a(false);
    a.b(true);
    a.a(u);
    a.d(false);
    
    int i = 0;
    if (settingschatFilter)
    {
      avs button;
      n.add(button = new avs(2, l - 48 - i, 4, 45, 20, Color.cl("a") + "Filter"));
      l = Allowed.chat();
      i += 47;
    }
    if (settingsautoText)
    {
      avs button;
      n.add(button = new avs(3, l - 54 - i, 4, 50, 20, Color.cl("a") + "AutoText"));
      l = Allowed.chat();
      i += 47;
    }
    if (settingsnameHistory)
    {
      avs button;
      n.add(button = new avs(4, l - 76 - i, 4, 67, 20, Color.cl("a") + "NameHistory"));
    }
    a.f();
    
    scrollbar.setPosition(l - 6, m - 145, l - 5, m - 20);
    scrollbar.update(20);
    scrollbar.setSpeed(10);
    scrollbar.setEntryHeight(20);
  }
  
  protected void a(avs button)
    throws IOException
  {
    super.a(button);
    if (k == 2) {
      j.a(new GuiFilter(a.b()));
    }
    if (k == 3) {
      j.a(new GuiAutoText(a.b()));
    }
    if (k == 4) {
      j.a(new GuiNameHistory(a.b()));
    }
  }
  
  public void m()
  {
    Keyboard.enableRepeatEvents(false);
    j.q.d().d();
  }
  
  public void e()
  {
    a.a();
  }
  
  protected void a(char typedChar, int keyCode)
    throws IOException
  {
    r = false;
    if (keyCode == 15) {
      a();
    } else {
      i = false;
    }
    if (keyCode == 1)
    {
      j.a((axu)null);
    }
    else if ((keyCode != 28) && (keyCode != 156))
    {
      if (keyCode == 200)
      {
        b(-1);
        a.f();
      }
      else if (keyCode == 208)
      {
        b(1);
        a.f();
      }
      else if (keyCode == 201)
      {
        j.q.d().b(j.q.d().i() - 1);
      }
      else if (keyCode == 209)
      {
        j.q.d().b(-j.q.d().i() + 1);
      }
      else
      {
        a.a(typedChar, keyCode);
      }
    }
    else
    {
      String s = a.b().trim();
      if (s.length() > 0) {
        f(s);
      }
      j.a((axu)null);
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
      j.q.d().b(i);
    }
    scrollbar.mouseInput();
  }
  
  protected void a(int mouseX, int mouseY, int mouseButton)
    throws IOException
  {
    if (mouseButton == 0)
    {
      eu ichatcomponent = j.q.d().a(Mouse.getX(), Mouse.getY());
      if (a(ichatcomponent))
      {
        a.f();
        return;
      }
    }
    if (mouseButton == 1)
    {
      eu iChatClickHover = j.q.d().a(Mouse.getX(), Mouse.getY());
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
    boolean hoverSymbols = (mouseX > l - 2 - 13) && (mouseX < l - 2) && (mouseY > m - 14) && (mouseY < m - 2);
    if ((hoverSymbols) && (Allowed.chat())) {
      symbolsGui = (!symbolsGui);
    }
    scrollbar.mouseAction(mouseX, mouseY, false);
    if (symbolsGui)
    {
      int row = 0;
      int column = 0;
      for (int i = 0; i < symbolsString.length(); i++)
      {
        String symbol = symbolsString.charAt(i) + "";
        if ((column * 10 + scrollbar.getScrollY() > -5) && (column * 10 + scrollbar.getScrollY() < 125))
        {
          if ((mouseX > l - 93 + row * 10 - 5) && (mouseX < l - 93 + row * 10 + 6)) {}
          boolean hoverSymbol = (mouseY > m - 147 + column * 10 + scrollbar.getScrollY() - 5) && (mouseY < m - 147 + column * 10 + scrollbar.getScrollY() + 6);
          if (hoverSymbol)
          {
            a.a(symbol.charAt(0), 0);
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
    a.a(mouseX, mouseY, mouseButton);
    super.a(mouseX, mouseY, mouseButton);
  }
  
  protected void a(String newChatText, boolean shouldOverwrite)
  {
    if (shouldOverwrite) {
      a.a(newChatText);
    } else {
      a.b(newChatText);
    }
  }
  
  public void a()
  {
    String s;
    if (this.i)
    {
      a.b(a.a(-1, a.i(), false) - a.i());
      if (this.s >= t.size()) {
        this.s = 0;
      }
    }
    else
    {
      int i = a.a(-1, a.i(), false);
      t.clear();
      this.s = 0;
      s = a.b().substring(i).toLowerCase();
      String s1 = a.b().substring(0, a.i());
      a(s1, s);
      if (t.isEmpty()) {
        return;
      }
      this.i = true;
      a.b(i - a.i());
    }
    if (t.size() > 1)
    {
      StringBuilder stringbuilder = new StringBuilder();
      for (String s2 : t)
      {
        if (stringbuilder.length() > 0) {
          stringbuilder.append(", ");
        }
        stringbuilder.append(s2);
      }
      j.q.d().a(new fa(stringbuilder.toString()), 1);
    }
    a.b((String)t.get(this.s++));
  }
  
  private void a(String p_146405_1_, String p_146405_2_)
  {
    if (p_146405_1_.length() >= 1)
    {
      cj blockpos = null;
      if ((j.s != null) && (j.s.a == auh.a.b)) {
        blockpos = j.s.a();
      }
      j.h.a.a(new id(p_146405_1_, blockpos));
      r = true;
    }
  }
  
  public void b(int msgPos)
  {
    int i = h + msgPos;
    int j = jq.d().c().size();
    i = ns.a(i, 0, j);
    if (i != h) {
      if (i == j)
      {
        h = j;
        a.a(g);
      }
      else
      {
        if (h == j) {
          g = a.b();
        }
        a.a((String)jq.d().c().get(i));
        h = i;
      }
    }
  }
  
  public void a(int mouseX, int mouseY, float partialTicks)
  {
    a(2, m - 14, l - 2 - 15, m - 2, Integer.MIN_VALUE);
    a.g();
    eu ichatcomponent = j.q.d().a(Mouse.getX(), Mouse.getY());
    if ((ichatcomponent != null) && (ichatcomponent.b().i() != null)) {
      a(ichatcomponent, mouseX, mouseY);
    }
    eu iChatClickHover = j.q.d().a(Mouse.getX(), Mouse.getY());
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
              if (changedToAt != 0L)
              {
                long time = System.currentTimeMillis() - changedToAt;
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
                lines.add(Color.cl(c) + name + Color.cl("8") + " - " + Color.cl("8") + date);
              }
              else
              {
                lines.add(Color.cl("a") + name);
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
    a(l - 2 - 13, m - 14, l - 2, m - 2, Integer.MIN_VALUE);
    boolean hoverSymbols = (mouseX > l - 2 - 13) && (mouseX < l - 2) && (mouseY > m - 14) && (mouseY < m - 2);
    a(j.k, symbolsGui ? "-" : "+", l - 8, m - 12, hoverSymbols ? -100000 : -1);
    if (symbolsGui)
    {
      scrollbar.calc();
      a(l - 100, m - 150, l - 2, m - 16, Integer.MIN_VALUE);
      a(l - 6, m - 145, l - 5, m - 20, Integer.MIN_VALUE);
      a(l - 7, scrollbar.top, l - 4, (int)(scrollbar.top + scrollbar.barLength), Integer.MAX_VALUE);
      
      int row = 0;
      int column = 0;
      for (int i = 0; i < symbolsString.length(); i++)
      {
        String symbol = symbolsString.charAt(i) + "";
        if ((column * 10 + scrollbar.getScrollY() > -5) && (column * 10 + scrollbar.getScrollY() < 125))
        {
          if ((mouseX > l - 93 + row * 10 - 5) && (mouseX < l - 93 + row * 10 + 6)) {}
          boolean hoverSymbol = (mouseY > m - 147 + column * 10 + scrollbar.getScrollY() - 5) && (mouseY < m - 147 + column * 10 + scrollbar.getScrollY() + 6);
          a(j.k, symbol, l - 93 + row * 10, m - 147 + column * 10 + scrollbar
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
    scrollbar.mouseAction(mouseX, mouseY, true);
    super.a(mouseX, mouseY, clickedMouseButton, timeSinceLastClick);
  }
  
  public void a(String[] p_146406_1_)
  {
    if (r)
    {
      i = false;
      t.clear();
      for (String s : p_146406_1_) {
        if (s.length() > 0) {
          t.add(s);
        }
      }
      String s1 = a.b().substring(a.a(-1, a.i(), false));
      String s2 = StringUtils.getCommonPrefix(p_146406_1_);
      if ((s2.length() > 0) && (!s1.equalsIgnoreCase(s2)))
      {
        a.b(a.a(-1, a.i(), false) - a.i());
        a.b(s2);
      }
      else if (t.size() > 0)
      {
        i = true;
        a();
      }
    }
  }
  
  public boolean d()
  {
    return false;
  }
}
