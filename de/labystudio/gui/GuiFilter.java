package de.labystudio.gui;

import ave;
import avo;
import avs;
import avt;
import avw;
import awv;
import axu;
import de.labystudio.gui.extras.GuiCustomButton;
import de.labystudio.labymod.LabyMod;
import de.labystudio.utils.Color;
import de.labystudio.utils.DrawUtils;
import de.labystudio.utils.FilterLoader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.lwjgl.input.Keyboard;
import org.lwjgl.input.Mouse;

public class GuiFilter
  extends axu
{
  private DrawUtils draw;
  private avw inputField;
  private avw input;
  private avs addButton;
  private avs toggle;
  private avs help;
  private boolean allowScroll;
  private String text;
  private ArrayList<avs> buttons = new ArrayList();
  
  public GuiFilter(String text)
  {
    this.text = text;
  }
  
  int z = 0;
  int y = 0;
  int lines = 8;
  int scroll = 0;
  
  public void addSymbol(String symbol)
  {
    GuiCustomButton button = new GuiCustomButton(-1, l - 4 - 20 - z, 4 + y, 20, 20, symbol);
    run = "true";
    n.add(button);
    z += 24;
    if (z % (24 * lines) == 0)
    {
      z = 0;
      y += 24;
    }
  }
  
  public void initFilters()
  {
    buttons.clear();
    for (String filter : FilterLoader.filters)
    {
      GuiCustomButton b = new GuiCustomButton(-3, 0, 0, 20, 20, Color.cl("c") + "X");
      run = filter;
      n.add(b);
      buttons.add(b);
    }
  }
  
  public void drawFilters()
  {
    int i = 25 + scroll;
    int a = 0;
    for (String filter : FilterLoader.filters) {
      if (a < buttons.size())
      {
        GuiCustomButton b = (GuiCustomButton)buttons.get(a);
        m = ((6 + i > 15) && (6 + i < 160));
        if (m)
        {
          h = (l - 190);
          i = (6 + i);
          DrawUtils.a(l - 170, 6 + i, l - 7, 6 + i + 20, Integer.MIN_VALUE);
          draw.drawString(filter.replace("%b%", " | " + Color.cl("c")).replace("%k%", Color.cl("6") + "").replace("%s%", Color.cl("b") + " (Sound) "), l - 167, 12 + i);
        }
        allowScroll = (6 + i > 160);
        i += 22;
        a++;
      }
    }
    if (FilterLoader.filters.size() < 5) {
      scroll = 0;
    }
  }
  
  public void add()
  {
    if (addButton.l)
    {
      FilterLoader.filters.add(input.b());
      input.a("");
      initFilters();
      FilterLoader.saveFilters();
    }
  }
  
  protected void a(int mouseX, int mouseY, int mouseButton)
    throws IOException
  {
    input.a(mouseX, mouseY, mouseButton);
    inputField.a(mouseX, mouseY, mouseButton);
    super.a(mouseX, mouseY, mouseButton);
  }
  
  public void a(char typedChar, int keyCode)
    throws IOException
  {
    super.a(typedChar, keyCode);
    if (inputField.m())
    {
      text = inputField.b();
      if (keyCode == 1)
      {
        j.a((axu)null);
      }
      else if ((keyCode != 28) && (keyCode != 156))
      {
        if ((keyCode != 200) && 
          (keyCode != 208)) {
          if (keyCode == 201) {
            j.q.d().b(j.q.d().i() - 1);
          } else if (keyCode == 209) {
            j.q.d().b(-j.q.d().i() + 1);
          } else {
            inputField.a(typedChar, keyCode);
          }
        }
      }
      else
      {
        String var3 = inputField.b().trim();
        if (var3.length() > 0) {
          f(var3);
        }
        j.a((axu)null);
      }
    }
    if (input.m()) {
      if (keyCode == 1) {
        j.a((axu)null);
      } else if (keyCode == 28) {
        add();
      } else {
        input.a(typedChar, keyCode);
      }
    }
  }
  
  public void k()
    throws IOException
  {
    super.k();
    int var1 = Mouse.getEventDWheel();
    if (var1 != 0)
    {
      if (var1 > 1) {
        var1 = 1;
      }
      if (var1 < -1) {
        var1 = -1;
      }
      if (var1 > 0)
      {
        if (scroll < 0) {
          scroll += 22;
        }
      }
      else if (allowScroll) {
        scroll -= 22;
      }
    }
  }
  
  public void b()
  {
    n.clear();
    addButton = new avs(1, l - 192, 4, 30, 20, Color.cl("c") + "Add");
    n.add(addButton);
    n.add(new avs(0, l - 48, 4, 45, 20, Color.cl("c") + "Close"));
    help = new avs(-1, l - 215, 4, 20, 20, Color.cl("b") + "?");
    n.add(help);
    String a = "✖";
    if (FilterLoader.enabled) {
      a = "✔";
    }
    a = Color.booleanToColor(Boolean.valueOf(FilterLoader.enabled)) + a;
    toggle = new avs(2, l - 215, 27, 20, 20, a);
    n.add(toggle);
    initFilters();
    
    Keyboard.enableRepeatEvents(true);
    inputField = new avw(0, q, 4, m - 12, l - 4, 12);
    inputField.f(500);
    inputField.a(false);
    inputField.b(true);
    inputField.a(text);
    inputField.f();
    
    input = new avw(0, q, l - 160, 6, 110, 17);
    input.f(500);
    input.b(false);
  }
  
  protected void a(avs button)
  {
    switch (k)
    {
    case 0: 
      j.a(new awv(text));
      break;
    case 1: 
      add();
      break;
    case 2: 
      FilterLoader.enabled = !FilterLoader.enabled;
      b();
    }
    if (k == -5)
    {
      inputField.a("&".charAt(0), 0);
      inputField.a(j.replace(Color.c + "", "").substring(0, 1).charAt(0), 0);
    }
    if ((button instanceof GuiCustomButton))
    {
      if (run.equals("true")) {
        inputField.a(j.charAt(0), 0);
      }
      if (k == -3)
      {
        FilterLoader.filters.remove(run);
        buttons.remove(button);
        b();
        FilterLoader.saveFilters();
      }
    }
  }
  
  public void a(int mouseX, int mouseY, float partialTicks)
  {
    draw = getInstancedraw;
    a(2, m - 14, l - 2, m - 2, Integer.MIN_VALUE);
    a(l - 193, 27, l - 3, 169, Integer.MIN_VALUE);
    a(l - 193, 3, l - 3, 25, Integer.MIN_VALUE);
    addButton.l = ((!input.b().replace(" ", "").isEmpty()) && (!contains(input.b())));
    inputField.g();
    input.g();
    drawFilters();
    super.a(mouseX, mouseY, partialTicks);
    if (help.a())
    {
      int i = 0;
      draw.drawRightString("If a word of this list is written", mouseX, mouseY);i += 10;
      draw.drawRightString("in the chat, it will automatically", mouseX, mouseY + i);i += 10;
      draw.drawRightString("be displayed in an extra chat to ", mouseX, mouseY + i);i += 10;
      draw.drawRightString("the right of the normal chat.", mouseX, mouseY + i);i += 10;
      draw.drawRightString("If you add " + Color.cl("b") + "%k%" + Color.cl("f") + " in front of a specific word,", mouseX, mouseY + i, 0.5D);i += 5;
      draw.drawRightString("you want to filter out of the chat " + Color.cl("c") + "(e.g. %k%Test)" + Color.cl("f") + ",", mouseX, mouseY + i, 0.5D);i += 5;
      draw.drawRightString("the message will be highlighted and WON'T be shown on the extra Chat.", mouseX, mouseY + i, 0.5D);i += 10;
      draw.drawRightString("To avoid specific words from a message,", mouseX, mouseY + i, 0.5D);i += 5;
      draw.drawRightString("you can create a blacklist with " + Color.cl("b") + "%b%" + Color.cl("f") + ". " + Color.cl("c") + "(e.g. Test%b%Hello)" + Color.cl("f") + "", mouseX, mouseY + i, 0.5D);i += 5;
      draw.drawRightString("Now, the word 'Test' would be filtered, but", mouseX, mouseY + i, 0.5D);i += 5;
      draw.drawRightString("if the same message contains 'Hello' it would be ignored.", mouseX, mouseY + i, 0.5D);i += 5;
      draw.drawRightString("This you can do also with more Words", mouseX, mouseY + i, 0.5D);i += 5;
      draw.drawRightString("" + Color.cl("c") + "(e.g. Test%b%Hello%b%How are you%b%Minecraft)" + Color.cl("f") + "", mouseX, mouseY + i, 0.5D);i += 10;
      draw.drawRightString("To get a Sound alert on specific Messages,", mouseX, mouseY + i, 0.5D);i += 5;
      draw.drawRightString("just add " + Color.cl("b") + "%s%" + Color.cl("f") + " at the end of the word " + Color.cl("c") + "(e.g. Test%s%)", mouseX, mouseY + i, 0.5D);i += 5;
      draw.drawRightString("Now you would hear a sound, when 'Test' is written in the Chat.", mouseX, mouseY + i, 0.5D);i += 10;
      draw.drawRightString("The whole thing with " + Color.cl("b") + "%k%" + Color.cl("f") + ", " + Color.cl("b") + "%b%" + Color.cl("f") + " and " + Color.cl("b") + "%s%" + Color.cl("f") + " can also be combined:", mouseX, mouseY + i, 0.5D);i += 5;
      draw.drawRightString("" + Color.cl("c") + "%k%Test%b%Hello%s%", mouseX, mouseY + i, 0.5D);i += 5;
      draw.drawRightString("->Now, the message would be", mouseX, mouseY + i, 0.5D);i += 5;
      draw.drawRightString("highlighted and you can hear a sound alert,", mouseX, mouseY + i, 0.5D);i += 5;
      draw.drawRightString("if it isn't containing the word 'Hello'", mouseX, mouseY + i, 0.5D);i += 5;
    }
    if (toggle.a()) {
      if (FilterLoader.enabled) {
        draw.drawRightString(Color.cl("a") + "Filter enabled", mouseX, mouseY);
      } else {
        draw.drawRightString(Color.cl("c") + "Filter disabled", mouseX, mouseY);
      }
    }
  }
  
  private boolean contains(String s)
  {
    for (String filter : FilterLoader.filters) {
      if (s.equalsIgnoreCase(filter)) {
        return true;
      }
    }
    return false;
  }
}
