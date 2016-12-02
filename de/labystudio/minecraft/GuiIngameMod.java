package de.labystudio.minecraft;

import ave;
import avh;
import avn;
import avo;
import bdc;
import bew;
import bfc;
import bfl;
import bmj;
import bnq;
import com.mojang.authlib.GameProfile;
import de.labystudio.chat.ChatHandler;
import de.labystudio.chat.Client;
import de.labystudio.chat.LabyModPlayer;
import de.labystudio.gui.GuiStopWatch;
import de.labystudio.labymod.ClickCounter;
import de.labystudio.labymod.ConfigManager;
import de.labystudio.labymod.LabyMod;
import de.labystudio.labymod.ModSettings;
import de.labystudio.listener.Games;
import de.labystudio.listener.GommeHD;
import de.labystudio.listener.HiveMC;
import de.labystudio.listener.JumpLeague;
import de.labystudio.listener.Revayd;
import de.labystudio.listener.Timolia;
import de.labystudio.modapi.ModAPI;
import de.labystudio.modapi.events.RenderOverlayEvent;
import de.labystudio.spotify.SpotifyManager;
import de.labystudio.utils.Allowed;
import de.labystudio.utils.Color;
import de.labystudio.utils.DrawUtils;
import de.labystudio.utils.FriendsLoader;
import de.labystudio.utils.ModGui;
import de.labystudio.utils.TextureManager;
import de.zockermaus.ts3.TeamSpeak;
import de.zockermaus.ts3.TeamSpeakBridge;
import de.zockermaus.ts3.TeamSpeakChannel;
import de.zockermaus.ts3.TeamSpeakController;
import de.zockermaus.ts3.TeamSpeakUser;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import jy;
import ns;
import org.apache.commons.lang3.SystemUtils;
import org.lwjgl.input.Mouse;
import org.lwjgl.opengl.GL11;
import pe;
import pf;
import wm;
import zw;
import zx;

public class GuiIngameMod
  extends avo
{
  public GuiIngameMod(ave mcIn)
  {
    super(mcIn);
    this.mc = mcIn;
    this.draw = LabyMod.getInstance().draw;
  }
  
  jy inventoryBackground = new jy("textures/gui/container/inventory.png");
  SimpleDateFormat dt1 = new SimpleDateFormat("HH:mm");
  SimpleDateFormat dt2 = new SimpleDateFormat("hh:mm a");
  zx itemArrow = new zx(zw.b(262));
  private String timeCache = "";
  private long lastTimeCacheUpdate = 0L;
  private String dateCache = "";
  private long lastDateCacheUpdate = 0L;
  private final ave mc;
  private final DrawUtils draw;
  
  public void drawPotions()
  {
    if (LabyMod.getInstance().isChatGUI()) {
      return;
    }
    if (!ConfigManager.settings.potionEffects) {
      return;
    }
    if (!Allowed.potions()) {
      return;
    }
    double aa = 1.7D;
    double bb = 0.7D;
    if (ConfigManager.settings.potionsize == 0)
    {
      aa = 2.4D;
      bb = 0.5D;
    }
    else if (ConfigManager.settings.potionsize != 1)
    {
      aa = 1.3D;
      bb = 0.9D;
    }
    int last = ModGui.mainList;
    if (ModGui.isSwitch()) {
      last = ModGui.offList;
    }
    int var2 = (int)(last * aa);
    int var1 = -5;
    Collection var4 = this.mc.h.bl();
    if (!var4.isEmpty())
    {
      bfl.a(bb, bb, bb);
      bfl.c(1.0F, 1.0F, 1.0F, 1.0F);
      bfl.f();
      int var5 = 23;
      if (var4.size() > 5) {
        var5 = 132 / (var4.size() - 1);
      }
      for (Iterator var6 = this.mc.h.bl().iterator(); var6.hasNext(); var2 += var5)
      {
        pf var7 = (pf)var6.next();
        pe var8 = pe.a[var7.a()];
        bfl.c(1.0F, 1.0F, 1.0F, 1.0F);
        this.mc.P().a(this.inventoryBackground);
        if (var8.e())
        {
          int var9 = var8.f();
          b(var1 + 6, var2 + 7, 0 + var9 % 8 * 18, 198 + var9 / 8 * 18, 18, 18);
        }
        String var11 = bnq.a(var8.a(), new Object[0]);
        if (var7.c() == 1) {
          var11 = var11 + " " + bnq.a("enchantment.level.2", new Object[0]);
        } else if (var7.c() == 2) {
          var11 = var11 + " " + bnq.a("enchantment.level.3", new Object[0]);
        } else if (var7.c() == 3) {
          var11 = var11 + " " + bnq.a("enchantment.level.4", new Object[0]);
        }
        this.draw.fontRenderer.a(Color.c(1) + var11, var1 + 10 + 18, var2 + 6, 16777215);
        String var10 = pe.a(var7);
        this.draw.fontRenderer.a(Color.c(3) + var10, var1 + 10 + 18, var2 + 6 + 10, 8355711);
      }
    }
  }
  
  public static String toUpperCaseFirstLetter(String userIdea)
  {
    char[] stringArray = userIdea.toCharArray();
    stringArray[0] = Character.toUpperCase(stringArray[0]);
    return userIdea = new String(stringArray);
  }
  
  public void drawMainGui(int set)
  {
    ModGui.mainList = set;
    if (ConfigManager.settings.showFPS) {
      ModGui.addMainLabel("FPS", ModGui.getFPS() + "", ModGui.mainList);
    }
    if (ConfigManager.settings.showCoords)
    {
      ModGui.addMainLabel("X", ModGui.getX() + "", ModGui.mainList);
      ModGui.addMainLabel("Y", ModGui.getY() + "", ModGui.mainList);
      ModGui.addMainLabel("Z", ModGui.getZ() + "", ModGui.mainList);
    }
    String f = "";
    if (ConfigManager.settings.fLayoutNumber) {
      f = f + ModGui.getF();
    }
    if (ConfigManager.settings.fLayoutDirection) {
      f = f + ModGui.getD();
    }
    if (ConfigManager.settings.fLayoutXAndZ) {
      f = f + ModGui.getXZD();
    }
    if (!f.isEmpty()) {
      ModGui.addMainLabel("F", f, ModGui.mainList);
    }
    if (ConfigManager.settings.showBiome) {
      ModGui.addMainLabel("Biome", ModGui.getBiom() + "", ModGui.mainList);
    }
    if ((!this.mc.F()) && (LabyMod.getInstance().playerPing != 0) && (ConfigManager.settings.showPing)) {
      ModGui.addMainLabel("Ping", LabyMod.getInstance().playerPing + "", ModGui.mainList);
    }
    if ((ConfigManager.settings.showOnlinePlayers) && (LabyMod.getInstance().onlinePlayers.size() >= 2)) {
      ModGui.addMainLabel("Online", LabyMod.getInstance().onlinePlayers.size() + "", ModGui.mainList);
    }
    if ((ConfigManager.settings.showServerIP) && (!LabyMod.getInstance().ip.isEmpty())) {
      ModGui.addMainLabel("IP", LabyMod.getInstance().ip + "", ModGui.mainList);
    }
    if ((ConfigManager.settings.lavaTime) && (LabyMod.getInstance().lavaTime != 0)) {
      if (LabyMod.getInstance().removeChallenge == 0) {
        ModGui.addMainLabel("Timer", ModGui.translateTimer(LabyMod.getInstance().lavaTime) + "", ModGui.mainList);
      } else {
        ModGui.addMainLabel("Timer", Color.cl("c") + ModGui.translateTimer(LabyMod.getInstance().lavaTime) + "", ModGui.mainList);
      }
    }
    if ((ConfigManager.settings.clickTest) && (ClickCounter.getClickResult() != 0.0D)) {
      ModGui.addMainLabel("Clicks", (int)ClickCounter.getClickResult() + "", ModGui.mainList);
    }
    if (ConfigManager.settings.afkTimer) {
      if (LabyMod.getInstance().isAFK) {
        ModGui.addMainLabel("AFK", ModGui.translateTimer((int)((LabyMod.getInstance().lastMove - System.currentTimeMillis()) * -1L / 1000L)) + "", ModGui.mainList);
      } else if (LabyMod.getInstance().keepTime + 5000L > System.currentTimeMillis()) {
        ModGui.addMainLabel("AFK", Color.cl("c") + ModGui.translateTimer((int)((LabyMod.getInstance().lastTimeAFK - LabyMod.getInstance().keepTime) * -1L / 1000L)) + "", ModGui.mainList);
      }
    }
    if ((ConfigManager.settings.showKills) && (Games.kills != 0)) {
      ModGui.addMainLabel("Kills", Games.kills + "", ModGui.mainList);
    }
    if (ConfigManager.settings.showClock)
    {
      if (this.lastTimeCacheUpdate < System.currentTimeMillis())
      {
        this.lastTimeCacheUpdate = (System.currentTimeMillis() + 2000L);
        if (ConfigManager.settings.twelveHourClock) {
          this.timeCache = this.dt2.format(Long.valueOf(System.currentTimeMillis()));
        } else {
          this.timeCache = this.dt1.format(Long.valueOf(System.currentTimeMillis()));
        }
      }
      ModGui.addMainLabel("Clock", "" + this.timeCache, ModGui.mainList);
    }
    if (ConfigManager.settings.showDate)
    {
      if (this.lastDateCacheUpdate < System.currentTimeMillis())
      {
        this.lastDateCacheUpdate = (System.currentTimeMillis() + 2000L);
        this.dateCache = ModGui.getDate();
      }
      ModGui.addMainLabel("Date", this.dateCache, ModGui.mainList);
    }
  }
  
  public Boolean isNotEmpty(int slot)
  {
    if (slot == -1) {
      return Boolean.valueOf(this.mc.h.bi.h() != null);
    }
    return Boolean.valueOf(this.mc.h.bi.e(slot) != null);
  }
  
  public void drawArmorTop()
  {
    if ((ConfigManager.settings.hud != 0) && (Allowed.armorHud()) && 
      (ConfigManager.settings.armorHudPositionOnTop))
    {
      if (isNotEmpty(-1).booleanValue()) {
        addArmor(this.mc.h.bi.h());
      }
      if (isNotEmpty(3).booleanValue()) {
        addArmor(this.mc.h.bi.e(3));
      }
      if (isNotEmpty(2).booleanValue()) {
        addArmor(this.mc.h.bi.e(2));
      }
      if (isNotEmpty(1).booleanValue()) {
        addArmor(this.mc.h.bi.e(1));
      }
      if (isNotEmpty(0).booleanValue()) {
        addArmor(this.mc.h.bi.e(0));
      }
    }
  }
  
  public void drawArmorHotbar()
  {
    boolean armorAdd = false;
    if ((ConfigManager.settings.hud != 0) && (Allowed.armorHud()) && 
      (!ConfigManager.settings.armorHudPositionOnTop))
    {
      int nextY = 0;
      if (isNotEmpty(2).booleanValue())
      {
        zx item = this.mc.h.bi.e(2);
        this.draw.drawItem(item, this.draw.getWidth() / 2 - 110, this.draw.getHeight() - 18 - nextY);
        drawArmorStatus(item, this.draw.getWidth() / 2 - 110, this.draw.getHeight() - 18 - nextY + 4, false);
        nextY += 15;
        armorAdd = true;
      }
      if (isNotEmpty(3).booleanValue())
      {
        zx item = this.mc.h.bi.e(3);
        this.draw.drawItem(item, this.draw.getWidth() / 2 - 110, this.draw.getHeight() - 18 - nextY);
        drawArmorStatus(item, this.draw.getWidth() / 2 - 110, this.draw.getHeight() - 18 - nextY + 5, false);
        armorAdd = true;
      }
      nextY = 0;
      if (isNotEmpty(0).booleanValue())
      {
        zx item = this.mc.h.bi.e(0);
        this.draw.drawItem(item, this.draw.getWidth() / 2 + 96, this.draw.getHeight() - 18 - nextY);
        drawArmorStatus(item, this.draw.getWidth() / 2 + 113, this.draw.getHeight() - 18 - nextY + 4, true);
        nextY += 15;
      }
      if (isNotEmpty(1).booleanValue())
      {
        zx item = this.mc.h.bi.e(1);
        this.draw.drawItem(item, this.draw.getWidth() / 2 + 96, this.draw.getHeight() - 18 - nextY);
        drawArmorStatus(item, this.draw.getWidth() / 2 + 113, this.draw.getHeight() - 18 - nextY + 5, true);
      }
    }
    if ((ConfigManager.settings.showArrow) && (this.mc.h != null) && (this.mc.h.bi.b(zw.b(261))))
    {
      int left = 0;
      if ((!ConfigManager.settings.armorHudPositionOnTop) && (armorAdd)) {
        switch (ConfigManager.settings.hud)
        {
        case 1: 
          left = 43;
          break;
        case 2: 
          left = 65;
          break;
        case 3: 
          left = 13;
          break;
        case 4: 
          left = 42;
        }
      }
      int count = 0;
      if (this.mc.h.bi.a != null) {
        for (zx item : this.mc.h.bi.a) {
          if ((item != null) && (item.b() != null) && (zw.b(item.b()) == 262)) {
            count += item.b;
          }
        }
      }
      this.draw.drawItem(this.itemArrow, this.draw.getWidth() / 2 - 116 - left, this.draw.getHeight() - 20, count + "x");
    }
  }
  
  public void addArmor(zx item)
  {
    if (ModGui.isSwitch())
    {
      this.draw.drawItem(item, 2, ModGui.offList);
      drawArmorStatus(item, 20, ModGui.offList + 5, true);
    }
    else
    {
      double k = LabyMod.getInstance().draw.getScale(ConfigManager.settings.size);
      this.draw.drawRightItem(item, (int)((this.draw.getWidth() - 28) / k), ModGui.offList);
      drawArmorStatus(item, (int)((this.draw.getWidth() - 20) / k), ModGui.offList + 5, false);
    }
    ModGui.offListNext(14);
  }
  
  public void drawArmorStatus(zx item, int x, int y, boolean left)
  {
    if (left)
    {
      if ((ConfigManager.settings.hud == 1) && 
        (item.j() - item.h() > 0)) {
        this.draw.drawString(item.j() - item.h() + "", x, y);
      }
      if ((ConfigManager.settings.hud == 2) && 
        (item.j() - item.h() > 0)) {
        this.draw.drawString(item.j() - item.h() + "/" + item.j(), x, y);
      }
      if ((ConfigManager.settings.hud == 4) && 
        (item.j() - item.h() > 0))
      {
        double armor = item.j() - item.h();
        double max = item.j();
        String name = Math.round(100.0D / max * armor) + "%";
        this.draw.drawString(name, x, y);
      }
    }
    else
    {
      double k = LabyMod.getInstance().draw.getScale(ConfigManager.settings.size);
      String name = "";
      if (item.j() - item.h() > 0)
      {
        if (ConfigManager.settings.hud == 2) {
          name = item.j() - item.h() + "/" + item.j();
        }
        if (ConfigManager.settings.hud == 1) {
          name = item.j() - item.h() + "";
        }
        if (ConfigManager.settings.hud == 4)
        {
          double armor = item.j() - item.h();
          double max = item.j();
          name = Math.round(100.0D / max * armor) + "%";
        }
        this.draw.drawRightString(name, x, y);
      }
    }
  }
  
  public void drawRadar()
  {
    int b = 0;
    if (ConfigManager.settings.showLiveTicker)
    {
      this.draw.drawCenteredString(LabyMod.getInstance().LIVETICKER.replace("&", Color.c), this.draw.getWidth() / 2, 2);
      b += 10;
    }
    if (((!ConfigManager.settings.radarCoordinate) && (!ConfigManager.settings.radarDirection)) || (!Allowed.gui())) {
      return;
    }
    int point = this.draw.getWidth() / 2;
    int i = (int)ns.g(this.mc.h.y) * -1 - 360;
    int o = 45;
    if ((bfc.c != null) && (bfc.b > 0)) {
      if (ConfigManager.settings.showBossBar) {
        b += 15;
      } else {
        b += 9;
      }
    }
    for (int a = 0; a <= 2; a++) {
      for (double k = 0.0D; k <= 3.5D; k += 0.5D)
      {
        if ((this.draw.getWidth() / 2 + i > point - 50) && (this.draw.getWidth() / 2 + i < point + 50))
        {
          int m = 0;
          if (ConfigManager.settings.radarCoordinate)
          {
            this.draw.drawCenteredString(Color.c(3) + k, this.draw.getWidth() / 2 + i, 4 + b + m);
            m += 10;
          }
          if (ConfigManager.settings.radarDirection)
          {
            String n = "South";
            if (k == 0.5D) {
              n = "South/West";
            }
            if (k == 1.0D) {
              n = "West";
            }
            if (k == 1.5D) {
              n = "West/North";
            }
            if (k == 2.0D) {
              n = "North";
            }
            if (k == 2.5D) {
              n = "North/East";
            }
            if (k == 3.0D) {
              n = "East";
            }
            if (k == 3.5D) {
              n = "East/South";
            }
            if ((k + "").endsWith(".5")) {
              n = Color.c(2) + n;
            } else {
              n = Color.c(1) + n;
            }
            this.draw.drawCenteredString(Color.c(3) + n, this.draw.getWidth() / 2 + i, 4 + b + m);
          }
        }
        i += o;
      }
    }
  }
  
  public void drawGameModes()
  {
    GommeHD.drawGommeHDGui();
    JumpLeague.drawPlayMinityGui();
    Timolia.drawTimoliaGui();
    Revayd.drawRevaydGui();
    HiveMC.drawHiveGui();
    if ((ConfigManager.settings.showNickname) && (!LabyMod.getInstance().nickname.isEmpty())) {
      ModGui.addMainLabel("Nick", LabyMod.getInstance().nickname, ModGui.mainList);
    }
  }
  
  private void drawOnlineFriendsOnServer()
  {
    int friendSlots = 4;
    if (ConfigManager.settings.showOnlineFriends) {
      try
      {
        if ((!LabyMod.getInstance().isChatGUI()) && (ChatHandler.getMyFriends() != null) && (FriendsLoader.friends != null))
        {
          ArrayList<String> chatFriends = new ArrayList();
          Iterator<LabyModPlayer> itera = ChatHandler.getMyFriends().iterator();
          while (itera.hasNext()) {
            chatFriends.add(((LabyModPlayer)itera.next()).getName().toLowerCase());
          }
          Iterator<bdc> iter = LabyMod.getInstance().onlinePlayers.iterator();
          while (iter.hasNext())
          {
            bdc p = (bdc)iter.next();
            if (LabyMod.getInstance().draw.getWidth() / 2 - 120 - friendSlots * 16 > 0) {
              if ((p != null) && (FriendsLoader.friends != null) && (p.a() != null) && (p.a().getName() != null)) {
                if ((FriendsLoader.friends.containsKey(p.a().getName())) || (chatFriends.contains(p.a().getName().toLowerCase()))) {
                  if (ConfigManager.settings.onlineFriendsPositionOnTop)
                  {
                    int x = LabyMod.getInstance().draw.getWidth() / 6 * 5;
                    a(x - friendSlots * 10 - 2, 0, x - friendSlots * 10 + 8, 9, Integer.MIN_VALUE);
                    a(x - friendSlots * 10 - 1, 1, x - friendSlots * 10 + 7, 8, Integer.MAX_VALUE);
                    bfl.c(1.0F, 1.0F, 1.0F);
                    LabyMod.getInstance().textureManager.drawPlayerHead(p.a().getName(), x - friendSlots * 10, 4.5D, 0.19D);
                    friendSlots++;
                  }
                  else
                  {
                    int x = LabyMod.getInstance().draw.getWidth() / 2 - 120;
                    a(x - friendSlots * 16 - 2, this.draw.getHeight() - 1, x - friendSlots * 16 + 14, this.draw.getHeight() - 18, Integer.MIN_VALUE);
                    a(x - friendSlots * 16 - 1, this.draw.getHeight() - 2, x - friendSlots * 16 + 13, this.draw.getHeight() - 17, Integer.MAX_VALUE);
                    bfl.c(1.0F, 1.0F, 1.0F);
                    LabyMod.getInstance().textureManager.drawPlayerHead(p.a().getName(), x - friendSlots * 16 + 0.4D, this.draw.getHeight() - 12.5D, 0.37D);
                    friendSlots++;
                  }
                }
              }
            }
          }
        }
      }
      catch (Exception error)
      {
        error.printStackTrace();
      }
    }
  }
  
  public void drawTeamSpeak()
  {
    if (!ConfigManager.settings.teamSpeak) {
      return;
    }
    if ((!ConfigManager.settings.teamSpakIngame) && (!ConfigManager.settings.teamSpakIngameClients)) {
      return;
    }
    TeamSpeakUser me = TeamSpeakController.getInstance().me();
    if (me == null) {
      return;
    }
    List<TeamSpeakUser> users = TeamSpeakBridge.getChannelUsers(me.getChannelId());
    
    TeamSpeakChannel channel = TeamSpeakController.getInstance().getChannel(me.getChannelId());
    if (channel == null) {
      return;
    }
    String channelName = channel.getChannelName();
    if (ConfigManager.settings.teamSpakIngame) {
      ModGui.addMainLabel(channelName, "", ModGui.mainList);
    }
    if (ConfigManager.settings.teamSpakIngameClients) {
      for (TeamSpeakUser user : users)
      {
        String client = TeamSpeak.getTalkColor(user) + "  ⬤ " + Color.cl("f") + user.getNickName() + TeamSpeak.getAway(user);
        if (ModGui.isSwitch()) {
          client = Color.cl("f") + user.getNickName() + TeamSpeak.getAway(user) + TeamSpeak.getTalkColor(user) + "  ⬤ ";
        }
        this.draw.addString(client, ModGui.mainList);
        ModGui.mainListNext();
      }
    }
  }
  
  public void drawSpotify()
  {
    if (!ConfigManager.settings.spotfiyTrack) {
      return;
    }
    if ((LabyMod.getInstance().getSpotifyManager() == null) || (!SystemUtils.IS_OS_WINDOWS))
    {
      ModGui.mainListNext();
      ModGui.addMainLabel("Spotify", "Windows support only", ModGui.mainList);
      return;
    }
    if (LabyMod.getInstance().getSpotifyManager().getArtistName() == null)
    {
      if ((LabyMod.getInstance().getSpotifyManager().getSpotifyTitle() != null) && (!LabyMod.getInstance().getSpotifyManager().getSpotifyTitle().equals("?")) && 
        (LabyMod.getInstance().getSpotifyManager().getDisplayTime() + 10000L > System.currentTimeMillis()))
      {
        if (ModGui.mainList != 2) {
          ModGui.mainListNext();
        }
        ModGui.addMainLabel("Spotify", LabyMod.getInstance().getSpotifyManager().getSpotifyTitle(), ModGui.mainList);
      }
    }
    else
    {
      if (ModGui.mainList != 2) {
        ModGui.mainListNext();
      }
      String track = LabyMod.getInstance().getSpotifyManager().getTrackName();
      String artist = LabyMod.getInstance().getSpotifyManager().getArtistName();
      if (track.length() > 30) {
        track = track.substring(0, 30);
      }
      if (artist.length() > 30) {
        artist = artist.substring(0, 30);
      }
      ModGui.addMainLabel("Track", track, ModGui.mainList);
      ModGui.addMainLabel("Artist", artist, ModGui.mainList);
    }
  }
  
  private void drawStopWatch()
  {
    if (GuiStopWatch.running)
    {
      int b = 0;
      if (((ConfigManager.settings.radarCoordinate) || (ConfigManager.settings.radarDirection)) && (Allowed.gui())) {
        if ((ConfigManager.settings.radarCoordinate) && (ConfigManager.settings.radarDirection)) {
          b = 22;
        } else {
          b = 11;
        }
      }
      if ((bfc.c != null) && (bfc.b > 0)) {
        if (ConfigManager.settings.showBossBar) {
          b += 15;
        } else {
          b += 9;
        }
      }
      this.draw.drawCenteredString(GuiStopWatch.parseTime(GuiStopWatch.getTimer()), this.draw.getWidth() / 2, b + 5, 2.0D);
    }
  }
  
  public void drawGui()
  {
    if (!ConfigManager.settings.gui) {
      return;
    }
    if (!LabyMod.getInstance().isInGame()) {
      return;
    }
    if (this.mc.t.aB) {
      return;
    }
    if (!Allowed.gui()) {
      return;
    }
    ModGui.mainList = 2;
    ModGui.offList = 2;
    
    GL11.glPushMatrix();
    GL11.glScaled(this.draw.getScale(ConfigManager.settings.size), this.draw.getScale(ConfigManager.settings.size), this.draw.getScale(ConfigManager.settings.size));
    if (ConfigManager.settings.alertsChat)
    {
      LabyMod.getInstance().getClient();
      if (!Client.isBusy())
      {
        int amount = 0;
        ArrayList<LabyModPlayer> temp = new ArrayList();
        temp.addAll(LabyMod.getInstance().getClient().getFriends());
        for (LabyModPlayer p : temp) {
          if (p.isNotify()) {
            amount += p.messages;
          }
        }
        if (amount != 0)
        {
          String a = "";
          if (amount != 1) {
            a = "s";
          }
          String s = Color.cl("c") + amount + " new message" + a;
          this.draw.addRightString(s, ModGui.offList);
          ModGui.offListNext();
        }
      }
    }
    drawArmorTop();
    
    drawMainGui(2);
    drawGameModes();
    drawTeamSpeak();
    drawSpotify();
    drawPotions();
    
    GL11.glPopMatrix();
    drawArmorHotbar();
  }
  
  int mouseLocation = 0;
  
  public void a(float p_175180_1_)
  {
    super.a(p_175180_1_);
    
    ModGui.mainList = 0;
    ModGui.offList = 0;
    if (!ConfigManager.settings.hideMod)
    {
      drawGui();
      drawOnlineFriendsOnServer();
      drawRadar();
      drawStopWatch();
    }
    LabyMod.getInstance().onRender();
    if (ModGui.frameTimer + 1000L > System.currentTimeMillis())
    {
      ModGui.frames += 1;
    }
    else
    {
      ModGui.fps = ModGui.frames;
      ModGui.frames = 0;
      ModGui.frameTimer = System.currentTimeMillis();
    }
    if ((this.mouseLocation != Mouse.getX()) || (this.mc.h.ba != 0.0F) || (this.mc.h.O != 0.0F))
    {
      if (LabyMod.getInstance().isAFK)
      {
        ChatHandler.setAFK(false);
        LabyMod.getInstance().lastTimeAFK = LabyMod.getInstance().lastMove;
        LabyMod.getInstance().keepTime = System.currentTimeMillis();
      }
      LabyMod.getInstance().lastMove = System.currentTimeMillis();
    }
    this.mouseLocation = Mouse.getX();
    if (LabyMod.getInstance().lastMove + 20000L < System.currentTimeMillis())
    {
      if (!LabyMod.getInstance().isAFK) {
        ChatHandler.setAFK(true);
      }
      LabyMod.getInstance().isAFK = true;
    }
    else
    {
      LabyMod.getInstance().isAFK = false;
    }
    if (ModAPI.enabled()) {
      ModAPI.callEvent(new RenderOverlayEvent(p_175180_1_));
    }
    LabyMod.getInstance().overlay(0, 0);
  }
}
