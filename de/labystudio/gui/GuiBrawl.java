package de.labystudio.gui;

import ave;
import avs;
import azh;
import bde;
import bdg;
import bfl;
import bmj;
import de.labystudio.labymod.ConfigManager;
import de.labystudio.labymod.LabyMod;
import de.labystudio.labymod.ModSettings;
import de.labystudio.labymod.Timings;
import de.labystudio.utils.DrawUtils;
import de.labystudio.utils.ServerManager;
import de.labystudio.utils.TextureManager;
import de.zockermaus.serverpinger.ServerData;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.lwjgl.input.Mouse;

public class GuiBrawl
  extends GuiMenuScreen
{
  DrawUtils draw;
  
  public GuiBrawl()
  {
    super(null);
    this.childScreen = this;
    this.draw = LabyMod.getInstance().draw;
    this.id = "Brawl";
  }
  
  String mainIP = "brawl.com";
  ArrayList<bde> servers = new ArrayList();
  ArrayList<String> games = new ArrayList();
  boolean typeSelector = false;
  String selectedServer = "";
  boolean allowScroll = false;
  avs refresh;
  avs change;
  avs con;
  long doubleClick = 0L;
  int loadingBar;
  
  public void b()
  {
    Timings.start();
    this.con = new avs(0, this.l / 2 - 100, this.m - 50, 100, 20, "Join Server");
    this.n.add(this.con);
    
    this.refresh = new avs(1, this.l / 2 + 2, this.m - 50, 100, 20, "Refresh");
    this.n.add(this.refresh);
    
    this.change = new avs(2, this.l / 2 - 100, this.m - 28, 202, 20, "");
    this.n.add(this.change);
    
    super.b();
    refreshList();
    addGames();
    if (!this.allowScroll) {
      this.scrollY = 0;
    }
    Timings.stop();
  }
  
  private void refreshList()
  {
    new DownloadPing().start();
    sortServers();
  }
  
  class DownloadPing
    extends Thread
  {
    DownloadPing() {}
    
    public void run()
    {
      if (GuiBrawl.this.loadingBar != 0) {
        return;
      }
      GuiBrawl.this.loadingBar = 0;
      for (int i = 0; i <= LabyMod.getInstance().serverAddress.size() - 1; i++)
      {
        String server = (String)LabyMod.getInstance().serverAddress.get(i);
        try
        {
          new azh(null).g().a(new bde("", server, false));
        }
        catch (Exception e) {}
        if (GuiBrawl.this.loadingBar < LabyMod.getInstance().serverAddress.size()) {
          GuiBrawl.this.loadingBar += 1;
        }
        GuiBrawl.this.sortServers();
      }
      GuiBrawl.this.loadingBar = 0;
    }
  }
  
  public void sortServers()
  {
    Timings.start();
    this.servers.clear();
    for (int sort = 0; sort <= 1; sort++) {
      for (int i = 0; i <= LabyMod.getInstance().serverAddress.size() - 1; i++)
      {
        String ip = (String)LabyMod.getInstance().serverAddress.get(i);
        if (ServerManager.contains(ip))
        {
          ServerData server = ServerManager.get(ip);
          
          String typ = ip;
          typ = typ.replace("brawl.com", "");
          typ = typ.replace(".com", "");
          for (int j = 0; j <= 10; j++) {
            typ = typ.replace(j + "", "").replace(".", "");
          }
          registerNewGame(typ);
          
          String a = "";
          if (!ip.contains("kit")) {
            a = ".";
          }
          if (ip.contains(ConfigManager.settings.showListOf + a)) {
            if (server != null) {
              server.serverName = ip;
            }
          }
        }
      }
    }
    Timings.stop();
  }
  
  private void registerNewGame(String typ)
  {
    if (!this.games.contains(typ)) {
      this.games.add(typ);
    }
  }
  
  int scrollY = 0;
  int clickY;
  
  private void drawServers()
  {
    int listY = 0;
    ArrayList<bde> l = new ArrayList();
    l.addAll(this.servers);
    for (bde server : l)
    {
      if (this.selectedServer.equalsIgnoreCase(server.b)) {
        this.draw.drawBox(this.l / 2 - 153, 50 + this.scrollY + listY - 4, this.l / 2 + 157, 50 + this.scrollY + listY + 31);
      }
      bfl.c(1.0F, 1.0F, 1.0F);
      LabyMod.getInstance().textureManager.drawServerIcon(this.mainIP, this.l / 2 - 147, 48 + this.scrollY + listY, 0.12D);
      this.draw.drawString(de.labystudio.utils.Color.cl("l") + server.b, this.l / 2 - 110, 50 + this.scrollY + listY);
      if (server.d.contains("\n"))
      {
        String[] m = server.d.split("\n");
        if (m.length != 0) {
          this.draw.drawString("" + m[0] + de.labystudio.utils.Color.cl("r"), this.l / 2 - 235 + 124, 25 + this.scrollY + listY + 35);
        }
        if ((m.length >= 2) && 
          (m[1] != null)) {
          this.draw.drawString("" + m[1] + de.labystudio.utils.Color.cl("r"), this.l / 2 - 235 + 124, 35 + this.scrollY + listY + 35);
        }
      }
      else
      {
        this.draw.drawString("" + server.d + de.labystudio.utils.Color.cl("r"), this.l / 2 - 235 + 124, 25 + this.scrollY + listY + 35);
      }
      this.j.P().a(d);
      
      long ping = server.e;
      byte var7;
      byte var7;
      if (ping < 0L)
      {
        var7 = 5;
      }
      else
      {
        byte var7;
        if (ping < 150L)
        {
          var7 = 0;
        }
        else
        {
          byte var7;
          if (ping < 300L)
          {
            var7 = 1;
          }
          else
          {
            byte var7;
            if (ping < 600L)
            {
              var7 = 2;
            }
            else
            {
              byte var7;
              if (ping < 1000L) {
                var7 = 3;
              } else {
                var7 = 4;
              }
            }
          }
        }
      }
      if (server.d.toLowerCase().contains("offline")) {
        var7 = 5;
      }
      b(this.l / 2 + 144, 15 + this.scrollY + listY + 35, 0, 15 + var7 * 8, 10, 9);
      this.draw.drawRightString(server.c, this.l / 2 + 142, 15 + this.scrollY + listY + 35);
      
      listY += 35;
      this.allowScroll = (listY + this.scrollY > this.m - 120);
    }
  }
  
  protected void a(int mouseX, int mouseY, int mouseButton)
    throws IOException
  {
    super.a(mouseX, mouseY, mouseButton);
    if (this.typeSelector) {
      return;
    }
    int listY = 0;
    ArrayList<bde> l = new ArrayList();
    l.addAll(this.servers);
    for (bde server : l) {
      if ((mouseY >= 32) && (mouseY <= this.m - 63))
      {
        if ((mouseX > this.l / 2 - 151) && (mouseX < this.l / 2 + 160) && (mouseY > 50 + this.scrollY + listY - 4) && (mouseY < 50 + this.scrollY + listY + 31))
        {
          if (this.selectedServer.equalsIgnoreCase(server.b))
          {
            if (this.doubleClick + 500L > System.currentTimeMillis()) {
              LabyMod.getInstance().connectToServer(server.b);
            }
            this.doubleClick = System.currentTimeMillis();
          }
          this.selectedServer = server.b;
          break;
        }
        listY += 35;
      }
    }
    if ((mouseX > this.l / 2 + 155) && (mouseX < this.l / 2 + 170))
    {
      this.clickMoveID = 1;
      this.clickY = (-mouseY - this.scrollY);
    }
    else if ((mouseX < this.l / 2 + 155) && (mouseX > this.l / 2 - 160))
    {
      this.clickMoveID = 2;
      this.clickY = (mouseY - this.scrollY);
    }
    else
    {
      this.clickMoveID = 0;
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
        if (this.scrollY < 0) {
          this.scrollY += 15;
        }
      }
      else if (this.allowScroll) {
        this.scrollY -= 15;
      }
    }
  }
  
  public void a(avs button)
    throws IOException
  {
    super.actionPermformed(button);
    if (!this.typeSelector)
    {
      if ((button.k == 0) && 
        (!this.selectedServer.isEmpty())) {
        LabyMod.getInstance().connectToServer(this.selectedServer);
      }
      if (button.k == 1) {
        refreshList();
      }
    }
    if (button.k == 2)
    {
      this.typeSelector = (!this.typeSelector);
      addGames();
      if (!this.typeSelector) {
        this.j.a(this);
      }
    }
    if (button.k == -1)
    {
      ConfigManager.settings.showListOf = button.j;
      ConfigManager.save();
      this.typeSelector = false;
      this.scrollY = 0;
      this.selectedServer = "";
      this.j.a(this);
    }
  }
  
  int clickMoveID = 0;
  
  protected void a(int mouseX, int mouseY, int clickedMouseButton, long timeSinceLastClick)
  {
    int trackBack = this.scrollY;
    if (this.clickMoveID == 1) {
      this.scrollY = (-mouseY - this.clickY);
    }
    if (this.clickMoveID == 2) {
      this.scrollY = (mouseY - this.clickY);
    }
    if ((!this.allowScroll) && 
      (this.scrollY < trackBack)) {
      this.scrollY = trackBack;
    }
    if (this.scrollY > 0) {
      this.scrollY = 0;
    }
    super.a(mouseX, mouseY, clickedMouseButton, timeSinceLastClick);
  }
  
  private void addGames()
  {
    int y;
    int x;
    boolean right;
    if (this.typeSelector)
    {
      y = 0;
      x = 0;
      right = false;
      for (String game : this.games)
      {
        avs b = new avs(-1, this.l / 2 - 95 + x, 30 + y, 95, 20, "" + game);
        this.n.add(b);
        if (right)
        {
          y += 22;
          x = 0;
          right = false;
        }
        else
        {
          x = 95;
          right = true;
        }
      }
    }
  }
  
  public void a(int mouseX, int mouseY, float partialTicks)
  {
    
    if (LabyMod.getInstance().isInGame())
    {
      bfl.l();
      this.draw.drawTransparentBackground(0, 32, this.l, this.m - 64);
    }
    else
    {
      c();
      this.draw.drawChatBackground(0, 32, this.l, this.m - 64);
    }
    drawServers();
    if (this.loadingBar != 0) {
      this.refresh.j = (this.loadingBar + "/" + LabyMod.getInstance().serverAddress.size() + " loaded");
    } else {
      this.refresh.j = "Refresh";
    }
    if (this.typeSelector) {
      this.change.j = "Done";
    } else {
      this.change.j = ("Servers: " + de.labystudio.utils.Color.cl("e") + ConfigManager.settings.showListOf.toUpperCase());
    }
    this.refresh.l = ((!this.typeSelector) && (this.loadingBar == 0));
    this.con.l = ((!this.typeSelector) && (!this.selectedServer.replace(" ", "").isEmpty()));
    if ((this.allowScroll) || (this.scrollY != 0)) {
      a(this.l / 2 + 160, 0, this.l / 2 + 167, this.m, java.awt.Color.BLACK.getRGB());
    }
    ArrayList<bde> l = new ArrayList();
    l.addAll(this.servers);
    int listY = 0;
    for (bde server : l) {
      if ((mouseY >= 32) && (mouseY <= this.m - 63))
      {
        if ((mouseY > 50 + this.scrollY + listY - 4) && (mouseY < 50 + this.scrollY + listY + 8) && 
          (mouseX > this.l / 2 + 143) && (mouseX < this.l / 2 + 155)) {
          if (server.d.toLowerCase().contains("offline"))
          {
            this.draw.drawBox(mouseX + 5, mouseY - 15, mouseX + 104, mouseY + 3);
            this.draw.drawString("Server is offline!", mouseX + 10, mouseY - 10);
          }
          else
          {
            this.draw.drawBox(mouseX + 5, mouseY - 15, mouseX + this.draw.getStringWidth(server.e + "ms") + 13, mouseY + 3);
            this.draw.drawString(server.e + "ms", mouseX + 10, mouseY - 10);
          }
        }
        listY += 35;
      }
    }
    bfl.k();
    this.draw.overlayBackground(0, 32);
    this.draw.overlayBackground(this.m - 64, this.m);
    
    drawTypeSelector();
    
    super.a(mouseX, mouseY, partialTicks);
    Timings.stop();
  }
  
  private void drawTypeSelector()
  {
    if (!this.typeSelector) {
      return;
    }
    this.draw.drawBox(this.l / 2 - 100, 25, this.l / 2 + 100, this.m - 54);
  }
}
