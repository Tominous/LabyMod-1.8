package de.labystudio.gui;

import ave;
import avo;
import avs;
import avt;
import avw;
import awv;
import axu;
import de.labystudio.gui.extras.GuiCustomButton;
import de.labystudio.gui.extras.ModGuiTextField;
import de.labystudio.labymod.LabyMod;
import de.labystudio.utils.AutoTextLoader;
import de.labystudio.utils.Color;
import de.labystudio.utils.DrawUtils;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.lwjgl.input.Keyboard;
import org.lwjgl.input.Mouse;

public class GuiAutoText
  extends axu
{
  private DrawUtils draw;
  private ModGuiTextField commandInput;
  private avw chatField;
  private avs addButton;
  private avs toggle;
  private avs help;
  private boolean allowScroll;
  private String text;
  private ArrayList<avs> buttons = new ArrayList();
  
  public GuiAutoText(String text)
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
  
  public void initAutoText()
  {
    buttons.clear();
    AutoTextLoader.listening = false;
    AutoTextLoader.key = -1;
    AutoTextLoader.alt = false;
    AutoTextLoader.shift = false;
    AutoTextLoader.ctrl = false;
    Object toRem = null;
    for (String set : AutoTextLoader.autoText.keySet())
    {
      GuiCustomButton b = new GuiCustomButton(-3, 0, 0, 20, 20, Color.cl("c") + "X");
      run = set;
      n.add(b);
      buttons.add(b);
    }
  }
  
  public void drawAutoText()
  {
    int i = 25 + scroll;
    int a = 0;
    for (String m : AutoTextLoader.autoText.keySet()) {
      if (a < buttons.size())
      {
        GuiCustomButton b = (GuiCustomButton)buttons.get(a);
        m = ((6 + i > 15) && (6 + i < 160));
        if (m)
        {
          h = (l - 190);
          i = (6 + i);
          DrawUtils.a(l - 170, 6 + i, l - 7, 6 + i + 20, Integer.MIN_VALUE);
          String extra = "";
          if (AutoTextLoader.isAlt(m)) {
            extra = extra + "Alt+";
          }
          if (AutoTextLoader.isShift(m)) {
            extra = extra + "Shift+";
          }
          if (AutoTextLoader.isCtrl(m)) {
            extra = extra + "Ctrl+";
          }
          draw.drawString(Color.cl("7") + "[" + Color.cl("c") + extra + Keyboard.getKeyName(AutoTextLoader.getNormalKey(m)) + Color.cl("7") + "] " + Color.cl("e") + (String)AutoTextLoader.autoText.get(m), l - 167, 12 + i);
        }
        allowScroll = (6 + i > 160);
        i += 22;
        a++;
      }
    }
    if (AutoTextLoader.autoText.size() < 5) {
      scroll = 0;
    }
  }
  
  public void add()
  {
    if (addButton.l)
    {
      String buildHotkey = "";
      if (AutoTextLoader.alt) {
        buildHotkey = buildHotkey + "#ALT";
      }
      if (AutoTextLoader.ctrl) {
        buildHotkey = buildHotkey + "#CTRL";
      }
      if (AutoTextLoader.shift) {
        buildHotkey = buildHotkey + "#SHIFT";
      }
      String key = buildHotkey + AutoTextLoader.key;
      while (AutoTextLoader.autoText.containsKey(key)) {
        key = key + ";";
      }
      AutoTextLoader.autoText.put(key, commandInput.b());
      initAutoText();
      AutoTextLoader.save();
    }
  }
  
  protected void a(int mouseX, int mouseY, int mouseButton)
    throws IOException
  {
    commandInput.a(mouseX, mouseY, mouseButton);
    chatField.a(mouseX, mouseY, mouseButton);
    super.a(mouseX, mouseY, mouseButton);
  }
  
  public void a(char typedChar, int keyCode)
    throws IOException
  {
    super.a(typedChar, keyCode);
    if (chatField.m())
    {
      text = chatField.b();
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
            chatField.a(typedChar, keyCode);
          }
        }
      }
      else
      {
        String var3 = chatField.b().trim();
        if (var3.length() > 0) {
          f(var3);
        }
        j.a((axu)null);
      }
    }
    if ((commandInput.m()) && (!AutoTextLoader.listening)) {
      commandInput.a(typedChar, keyCode);
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
    addButton = new avs(1, l - 192, 4, 30, 20, "");
    n.add(addButton);
    n.add(new avs(0, l - 48, 4, 45, 20, Color.cl("c") + "Close"));
    help = new avs(-1, l - 215, 4, 20, 20, Color.cl("b") + "?");
    n.add(help);
    String a = "✖";
    if (AutoTextLoader.enabled) {
      a = "✔";
    }
    a = Color.booleanToColor(Boolean.valueOf(AutoTextLoader.enabled)) + a;
    toggle = new avs(2, l - 215, 27, 20, 20, a);
    n.add(toggle);
    initAutoText();
    
    Keyboard.enableRepeatEvents(true);
    chatField = new avw(0, q, 4, m - 12, l - 4, 12);
    chatField.f(500);
    chatField.a(false);
    chatField.b(true);
    chatField.a(text);
    chatField.f();
    
    commandInput = new ModGuiTextField(0, q, l - 160, 6, 110, 17);
    commandInput.f(100);
    commandInput.b(false);
  }
  
  protected void a(avs button)
  {
    switch (k)
    {
    case 0: 
      j.a(new awv(text));
      break;
    case 1: 
      if (!commandInput.b().replace(" ", "").isEmpty())
      {
        AutoTextLoader.key = -1;
        AutoTextLoader.listening = true;
        AutoTextLoader.alt = false;
        AutoTextLoader.shift = false;
        AutoTextLoader.ctrl = false;
      }
      break;
    case 2: 
      AutoTextLoader.enabled = !AutoTextLoader.enabled;
      b();
    }
    if (k == -5)
    {
      chatField.a("&".charAt(0), 0);
      chatField.a(j.replace(Color.c + "", "").substring(0, 1).charAt(0), 0);
    }
    if ((button instanceof GuiCustomButton))
    {
      if (run.equals("true")) {
        chatField.a(j.charAt(0), 0);
      }
      if (k == -3)
      {
        AutoTextLoader.autoText.remove(run);
        buttons.remove(button);
        b();
        AutoTextLoader.save();
      }
    }
  }
  
  public void a(int mouseX, int mouseY, float partialTicks)
  {
    draw = getInstancedraw;
    a(2, m - 14, l - 2, m - 2, Integer.MIN_VALUE);
    a(l - 193, 27, l - 3, 169, Integer.MIN_VALUE);
    a(l - 193, 3, l - 3, 25, Integer.MIN_VALUE);
    addButton.l = (!commandInput.b().replace(" ", "").isEmpty());
    chatField.g();
    commandInput.g();
    drawAutoText();
    if (AutoTextLoader.listening)
    {
      addButton.j = "> <";
      if (AutoTextLoader.key != -1)
      {
        if (!contains(AutoTextLoader.key + "")) {
          add();
        }
        AutoTextLoader.key = -1;
        AutoTextLoader.listening = false;
        AutoTextLoader.alt = false;
        AutoTextLoader.shift = false;
        AutoTextLoader.ctrl = false;
        commandInput.a("");
      }
    }
    else
    {
      addButton.j = (Color.cl("a") + "Add");
    }
    super.a(mouseX, mouseY, partialTicks);
    if (help.a())
    {
      draw.drawRightString("First write a sentence then enter your hotkey", mouseX, mouseY);
      draw.drawRightString("and by pressing the hotkey during gameplay", mouseX, mouseY + 10);
      draw.drawRightString("your sentence will be written in the chat!", mouseX, mouseY + 20);
    }
    if (toggle.a()) {
      if (AutoTextLoader.enabled) {
        draw.drawRightString(Color.cl("a") + "AutoText enabled", mouseX, mouseY);
      } else {
        draw.drawRightString(Color.cl("c") + "AutoText disabled", mouseX, mouseY);
      }
    }
  }
  
  private boolean contains(String i)
  {
    for (String m : AutoTextLoader.autoText.keySet()) {
      if (m.equals(i)) {
        return true;
      }
    }
    return false;
  }
}
