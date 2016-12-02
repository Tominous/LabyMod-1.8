package de.labystudio.gui;

import ave;
import avs;
import bfl;
import de.labystudio.labymod.ConfigManager;
import de.labystudio.labymod.LabyMod;
import de.labystudio.labymod.ModSettings;
import de.labystudio.utils.Color;
import de.labystudio.utils.DrawUtils;
import de.labystudio.utils.Scrollbar;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.lwjgl.input.Keyboard;

public class GuiStopWatch
  extends GuiMenuScreen
{
  DrawUtils draw;
  Scrollbar scrollbar;
  int selectedRound = 0;
  public static int timer = 0;
  public static long start = 0L;
  public static boolean running = false;
  public static boolean repeat = false;
  public static ArrayList<Round> rounds = new ArrayList();
  avs startStop;
  avs reset;
  avs round;
  
  public GuiStopWatch()
  {
    super(null);
    childScreen = this;
    draw = getInstancedraw;
    id = "Stopwatch";
    scrollbar = new Scrollbar(10);
  }
  
  public static class Round
  {
    private int ms = 0;
    private String parsed = "";
    
    public Round(int ms, String parsed)
    {
      this.ms = ms;
      this.parsed = parsed;
    }
    
    public int getMs()
    {
      return ms;
    }
    
    public String getParsed()
    {
      return parsed;
    }
  }
  
  public void b()
  {
    Keyboard.enableRepeatEvents(true);
    n.clear();
    
    super.b();
    
    n.add(startStop = new avs(0, l / 2 - 50 - 30, 125, 103, 20, ""));
    n.add(reset = new avs(1, l / 2 - 50 + 75, 125, 50, 20, Color.cl("4") + "Reset"));
    
    n.add(round = new avs(2, l - 60, 125, 50, 20, Color.cl("b") + "Round"));
    refreshButtons();
    
    scrollbar.setPosition(l - 11, 150, l - 5, m - 30);
  }
  
  public void refreshButtons()
  {
    if (running)
    {
      startStop.j = (Color.cl("c") + "Stop");
      round.l = true;
    }
    else
    {
      startStop.j = (Color.cl("a") + "Start");
      round.l = true;
    }
    if (getTimer() == 0) {
      reset.l = false;
    } else {
      reset.l = true;
    }
    scrollbar.update(rounds.size());
  }
  
  protected void a(int mouseX, int mouseY, int mouseButton)
    throws IOException
  {
    scrollbar.mouseAction(mouseX, mouseY, false);
    
    int i = 0;
    int top = rounds.size() * 10 + scrollbar.getScrollY();
    for (Round round : rounds)
    {
      if ((top + 145 - i > 130) && 
        (mouseX > 15) && (mouseX < l - 20) && (mouseY > top + 145 - i - 3) && (mouseY < top + 145 - i + 9))
      {
        selectedRound = round.getMs();
        break;
      }
      i += 10;
    }
    super.a(mouseX, mouseY, mouseButton);
  }
  
  public static void handleKeys(int key)
  {
    if (!settingsstopWatch) {
      return;
    }
    if (key == -1)
    {
      repeat = false;
      return;
    }
    if ((getInstancemc.m == null) && (!repeat))
    {
      if ((Keyboard.isKeyDown(29)) && (Keyboard.isKeyDown(208)))
      {
        repeat = true;
        if (running)
        {
          timer = getTimer();
          running = false;
        }
        else
        {
          start = System.currentTimeMillis();
          running = true;
        }
        return;
      }
      if ((Keyboard.isKeyDown(29)) && (Keyboard.isKeyDown(205)))
      {
        int last = 0;
        if (rounds.size() != 0) {
          last = ((Round)rounds.get(rounds.size() - 1)).getMs();
        }
        if ((getTimer() != last) && (getTimer() != 0))
        {
          repeat = true;
          int t = getTimer();
          rounds.add(new Round(t, parseTime(t)));
        }
        return;
      }
    }
  }
  
  public void a(avs button)
    throws IOException
  {
    super.actionPermformed(button);
    if (k == 0) {
      if (running)
      {
        timer = getTimer();
        running = false;
      }
      else
      {
        start = System.currentTimeMillis();
        running = true;
      }
    }
    if (k == 1)
    {
      running = false;
      timer = 0;
      rounds.clear();
    }
    if (k == 2)
    {
      int t = getTimer();
      rounds.add(new Round(t, parseTime(t)));
      scrollbar.setScrollY(0);
      selectedRound = t;
    }
    refreshButtons();
  }
  
  protected void a(int mouseX, int mouseY, int clickedMouseButton, long timeSinceLastClick)
  {
    scrollbar.mouseAction(mouseX, mouseY, true);
    super.a(mouseX, mouseY, clickedMouseButton, timeSinceLastClick);
  }
  
  public void k()
    throws IOException
  {
    scrollbar.mouseInput();
    super.k();
  }
  
  protected void a(char typedChar, int keyCode)
    throws IOException
  {
    if (keyCode == 0) {
      j.a(childScreen);
    }
    super.a(typedChar, keyCode);
  }
  
  public static int getTimer()
  {
    if (!running) {
      start = System.currentTimeMillis();
    }
    return (int)(timer + (System.currentTimeMillis() / 100L - start / 100L));
  }
  
  public static String parseTime(int time)
  {
    String formata = time / 600 % 60 + "";
    String formatb = time / 10 % 60 + "";
    String formatc = time % 10 + "";
    String formatd = time / 600 / 60 % 24 + "";
    String formate = time / 600 / 60 / 24 + "";
    if (formata.length() == 1) {
      formata = "0" + formata;
    }
    if (formatb.length() == 1) {
      formatb = "0" + formatb;
    }
    if (!formatd.equals("0")) {
      formatd = formatd + "h ";
    } else {
      formatd = "";
    }
    if (!formate.equals("0")) {
      formate = formate + "d ";
    } else {
      formate = "";
    }
    return formate + formatd + formata + ":" + formatb + "." + formatc;
  }
  
  public void a(int mouseX, int mouseY, float partialTicks)
  {
    if (LabyMod.getInstance().isInGame())
    {
      bfl.l();
      draw.drawTransparentBackground(0, 52, l, 120);
      draw.drawTransparentBackground(10, 150, l - 10, m - 30);
      bfl.k();
    }
    else
    {
      c();
      draw.drawChatBackground(0, 52, l, 120);
      draw.drawChatBackground(10, 150, l - 10, m - 30);
    }
    String currentParsedTime = parseTime(getTimer());
    draw.drawCenteredStringWithoutShadow(currentParsedTime, l / 2, 65.0D, 5.0D);
    
    int i = 0;
    int roundId = 1;
    int top = rounds.size() * 10 + scrollbar.getScrollY();
    for (Round round : rounds)
    {
      if (top + 145 - i > 130) {
        if (selectedRound == round.getMs())
        {
          DrawUtils.a(10, top + 145 - i - 1, l - 10, top + 145 - i + 9, Integer.MIN_VALUE);
          draw.drawString(Color.cl("a") + "" + roundId + ".  " + Color.cl("b") + round.getParsed() + " " + Color.cl("7") + " (" + parseTime(getTimer() - round.getMs()) + " ago)", 15.0D, top + 145 - i, 1.0D);
        }
        else
        {
          draw.drawString(Color.cl("e") + "" + roundId + ".  " + Color.cl("f") + round.getParsed(), 15.0D, top + 145 - i, 1.0D);
        }
      }
      roundId++;
      i += 10;
    }
    int last = 0;
    if (rounds.size() != 0) {
      last = ((Round)rounds.get(rounds.size() - 1)).getMs();
    }
    roundl = ((getTimer() != last) && (getTimer() != 0));
    
    draw.overlayBackground(0, 52);
    draw.overlayBackground(120, 150);
    draw.overlayBackground(m - 30, m);
    
    draw.overlayBackground(0, 150, 10, m - 30);
    draw.overlayBackground(l - 10, 150, l, m - 30);
    
    draw.drawRightString("Ctrl + Arrow Down = Start/Stop", l - 5, 5.0D, 0.5D);
    draw.drawRightString("Ctrl + Arrow Right = Round", l - 5, 10.0D, 0.5D);
    
    scrollbar.draw();
    
    super.a(mouseX, mouseY, partialTicks);
  }
}
