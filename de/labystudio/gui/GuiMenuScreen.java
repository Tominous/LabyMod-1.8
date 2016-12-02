package de.labystudio.gui;

import ave;
import avp;
import avs;
import axu;
import de.labystudio.chat.Client;
import de.labystudio.chat.LabyModPlayer;
import de.labystudio.labymod.ConfigManager;
import de.labystudio.labymod.LabyMod;
import de.labystudio.labymod.ModSettings;
import de.labystudio.language.L;
import de.labystudio.utils.Color;
import de.labystudio.utils.DrawUtils;
import java.io.IOException;
import java.io.PrintStream;
import java.util.List;
import org.lwjgl.opengl.GL11;

public class GuiMenuScreen
  extends axu
{
  private avp parentScreen;
  public axu childScreen;
  public String id = "";
  
  public GuiMenuScreen(axu parent)
  {
    parentScreen = parent;
  }
  
  public avp getParent()
  {
    return parentScreen;
  }
  
  protected void actionPermformed(avs button)
    throws IOException
  {
    super.a(button);
    if (k == 100)
    {
      LabyMod.getInstance();getInstanceopenMenu = null;
      LabyMod.getInstance();LabyMod.getInstance().back();
    }
    if (k == 102)
    {
      axu screen = new GuiOnlineChat();
      LabyMod.getInstance();getInstanceopenMenu = screen;
      j.a(screen);
    }
    if (k == 103)
    {
      axu screen = new GuiTags();
      LabyMod.getInstance();getInstanceopenMenu = screen;
      j.a(screen);
    }
    if (k == 104)
    {
      axu screen = new GuiTeamSpeak();
      LabyMod.getInstance();getInstanceopenMenu = screen;
      j.a(screen);
    }
    if (k == 105)
    {
      axu screen = new GuiGames();
      LabyMod.getInstance();getInstanceopenMenu = screen;
      j.a(screen);
    }
    if (k == 106)
    {
      axu screen = new GuiStopWatch();
      LabyMod.getInstance();getInstanceopenMenu = screen;
      j.a(screen);
    }
    if (k == 107)
    {
      axu screen = new GuiNotePad();
      LabyMod.getInstance();getInstanceopenMenu = screen;
      j.a(screen);
    }
  }
  
  public void b()
  {
    LabyMod.getInstance();getInstancechatChange = false;
    LabyMod.getInstance();
    if (getInstanceopenMenu != null) {
      if (childScreen == null)
      {
        System.out.println("Can't find childScreen");
        LabyMod.getInstance();j.a(getInstanceopenMenu);
      }
      else
      {
        LabyMod.getInstance();
        if (!childScreen.getClass().getSimpleName().equalsIgnoreCase(getInstanceopenMenu.getClass().getSimpleName()))
        {
          LabyMod.getInstance();j.a(getInstanceopenMenu);
          return;
        }
      }
    }
    super.b();
    next = 2;
    LabyMod.getInstance();LabyMod.getInstance();addButton(100, LabyMod.getInstance().isInGame() ? L.f("tab_menu", new Object[0]) : L.f("tab_multiplayer", new Object[0]), LabyMod.getInstance().isInGame() ? "Menu" : "Multiplayer");
    
    addButton(102, L.f("tab_chat", new Object[0]), "Chat");
    if (settingstags) {
      addButton(103, L.f("tab_tags", new Object[0]), "Tags");
    }
    if (settingsteamSpeak) {
      addButton(104, L.f("tab_teamspeak", new Object[0]), "TeamSpeak");
    }
    if (settingsminiGames) {
      addButton(105, L.f("tab_games", new Object[0]), "Games");
    }
    if (settingsstopWatch) {
      addButton(106, L.f("tab_stopwatch", new Object[0]), "Stopwatch");
    }
    if (settingsnotePad) {
      addButton(107, L.f("tab_notepad", new Object[0]), "Notepad");
    }
  }
  
  int chat = 0;
  int next = 2;
  
  public void addButton(int id, String title, String uid)
  {
    LabyMod.getInstance();avs b = new avs(id, next, 4, getInstancedraw.getStringWidth(title) + 10, 20, title);
    if (this.id.toLowerCase().contains(uid.toLowerCase())) {
      l = false;
    }
    n.add(b);
    LabyMod.getInstance();next += getInstancedraw.getStringWidth(title) + 11;
    if (title.toLowerCase().contains(L.f("tab_chat", new Object[0]))) {
      chat = next;
    }
  }
  
  public void a(int mouseX, int mouseY, float partialTicks)
  {
    super.a(mouseX, mouseY, partialTicks);
    LabyMod.getInstance();LabyMod.getInstance().overlay(mouseX, mouseY);
    if (chat != 0) {
      try
      {
        int amount = 0;
        for (LabyModPlayer p : LabyMod.getInstance().getClient().getFriends()) {
          amount += messages;
        }
        if (amount != 0)
        {
          GL11.glPushMatrix();
          GL11.glScaled(0.5D, 0.5D, 0.5D);
          getInstancedraw.drawRightString(Color.cl("c") + amount, (chat - 5) / 0.5D, 38.0D);
          GL11.glPopMatrix();
        }
      }
      catch (Exception localException) {}
    }
  }
}
