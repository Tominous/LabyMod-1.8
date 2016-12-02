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
    mc = mcIn;
    draw = getInstancedraw;
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
    if (!settingspotionEffects) {
      return;
    }
    if (!Allowed.potions()) {
      return;
    }
    double aa = 1.7D;
    double bb = 0.7D;
    if (settingspotionsize == 0)
    {
      aa = 2.4D;
      bb = 0.5D;
    }
    else if (settingspotionsize != 1)
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
    Collection var4 = mc.h.bl();
    if (!var4.isEmpty())
    {
      bfl.a(bb, bb, bb);
      bfl.c(1.0F, 1.0F, 1.0F, 1.0F);
      bfl.f();
      int var5 = 23;
      if (var4.size() > 5) {
        var5 = 132 / (var4.size() - 1);
      }
      for (Iterator var6 = mc.h.bl().iterator(); var6.hasNext(); var2 += var5)
      {
        pf var7 = (pf)var6.next();
        pe var8 = pe.a[var7.a()];
        bfl.c(1.0F, 1.0F, 1.0F, 1.0F);
        mc.P().a(inventoryBackground);
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
        draw.fontRenderer.a(Color.c(1) + var11, var1 + 10 + 18, var2 + 6, 16777215);
        String var10 = pe.a(var7);
        draw.fontRenderer.a(Color.c(3) + var10, var1 + 10 + 18, var2 + 6 + 10, 8355711);
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
    if (settingsshowFPS) {
      ModGui.addMainLabel("FPS", ModGui.getFPS() + "", ModGui.mainList);
    }
    if (settingsshowCoords)
    {
      ModGui.addMainLabel("X", ModGui.getX() + "", ModGui.mainList);
      ModGui.addMainLabel("Y", ModGui.getY() + "", ModGui.mainList);
      ModGui.addMainLabel("Z", ModGui.getZ() + "", ModGui.mainList);
    }
    String f = "";
    if (settingsfLayoutNumber) {
      f = f + ModGui.getF();
    }
    if (settingsfLayoutDirection) {
      f = f + ModGui.getD();
    }
    if (settingsfLayoutXAndZ) {
      f = f + ModGui.getXZD();
    }
    if (!f.isEmpty()) {
      ModGui.addMainLabel("F", f, ModGui.mainList);
    }
    if (settingsshowBiome) {
      ModGui.addMainLabel("Biome", ModGui.getBiom() + "", ModGui.mainList);
    }
    if ((!mc.F()) && (getInstanceplayerPing != 0) && (settingsshowPing)) {
      ModGui.addMainLabel("Ping", getInstanceplayerPing + "", ModGui.mainList);
    }
    if ((settingsshowOnlinePlayers) && (getInstanceonlinePlayers.size() >= 2)) {
      ModGui.addMainLabel("Online", getInstanceonlinePlayers.size() + "", ModGui.mainList);
    }
    if ((settingsshowServerIP) && (!getInstanceip.isEmpty())) {
      ModGui.addMainLabel("IP", getInstanceip + "", ModGui.mainList);
    }
    if ((settingslavaTime) && (getInstancelavaTime != 0)) {
      if (getInstanceremoveChallenge == 0) {
        ModGui.addMainLabel("Timer", ModGui.translateTimer(getInstancelavaTime) + "", ModGui.mainList);
      } else {
        ModGui.addMainLabel("Timer", Color.cl("c") + ModGui.translateTimer(getInstancelavaTime) + "", ModGui.mainList);
      }
    }
    if ((settingsclickTest) && (ClickCounter.getClickResult() != 0.0D)) {
      ModGui.addMainLabel("Clicks", (int)ClickCounter.getClickResult() + "", ModGui.mainList);
    }
    if (settingsafkTimer) {
      if (getInstanceisAFK) {
        ModGui.addMainLabel("AFK", ModGui.translateTimer((int)((getInstancelastMove - System.currentTimeMillis()) * -1L / 1000L)) + "", ModGui.mainList);
      } else if (getInstancekeepTime + 5000L > System.currentTimeMillis()) {
        ModGui.addMainLabel("AFK", Color.cl("c") + ModGui.translateTimer((int)((getInstancelastTimeAFK - getInstancekeepTime) * -1L / 1000L)) + "", ModGui.mainList);
      }
    }
    if ((settingsshowKills) && (Games.kills != 0)) {
      ModGui.addMainLabel("Kills", Games.kills + "", ModGui.mainList);
    }
    if ((settingsshowNickname) && (!getInstancenickname.isEmpty())) {
      ModGui.addMainLabel("Nick", getInstancenickname, ModGui.mainList);
    }
    if (settingsshowClock)
    {
      if (lastTimeCacheUpdate < System.currentTimeMillis())
      {
        lastTimeCacheUpdate = (System.currentTimeMillis() + 2000L);
        if (settingstwelveHourClock) {
          timeCache = dt2.format(Long.valueOf(System.currentTimeMillis()));
        } else {
          timeCache = dt1.format(Long.valueOf(System.currentTimeMillis()));
        }
      }
      ModGui.addMainLabel("Clock", "" + timeCache, ModGui.mainList);
    }
    if (settingsshowDate)
    {
      if (lastDateCacheUpdate < System.currentTimeMillis())
      {
        lastDateCacheUpdate = (System.currentTimeMillis() + 2000L);
        dateCache = ModGui.getDate();
      }
      ModGui.addMainLabel("Date", dateCache, ModGui.mainList);
    }
  }
  
  public Boolean isNotEmpty(int slot)
  {
    if (slot == -1) {
      return Boolean.valueOf(mc.h.bi.h() != null);
    }
    return Boolean.valueOf(mc.h.bi.e(slot) != null);
  }
  
  public void drawArmorTop()
  {
    if ((settingshud != 0) && (Allowed.armorHud()) && 
      (settingsarmorHudPositionOnTop))
    {
      if (isNotEmpty(-1).booleanValue()) {
        addArmor(mc.h.bi.h());
      }
      if (isNotEmpty(3).booleanValue()) {
        addArmor(mc.h.bi.e(3));
      }
      if (isNotEmpty(2).booleanValue()) {
        addArmor(mc.h.bi.e(2));
      }
      if (isNotEmpty(1).booleanValue()) {
        addArmor(mc.h.bi.e(1));
      }
      if (isNotEmpty(0).booleanValue()) {
        addArmor(mc.h.bi.e(0));
      }
    }
  }
  
  public void drawArmorHotbar()
  {
    boolean armorAdd = false;
    if ((settingshud != 0) && (Allowed.armorHud()) && 
      (!settingsarmorHudPositionOnTop))
    {
      int nextY = 0;
      if (isNotEmpty(2).booleanValue())
      {
        zx item = mc.h.bi.e(2);
        draw.drawItem(item, draw.getWidth() / 2 - 110, draw.getHeight() - 18 - nextY);
        drawArmorStatus(item, draw.getWidth() / 2 - 110, draw.getHeight() - 18 - nextY + 4, false);
        nextY += 15;
        armorAdd = true;
      }
      if (isNotEmpty(3).booleanValue())
      {
        zx item = mc.h.bi.e(3);
        draw.drawItem(item, draw.getWidth() / 2 - 110, draw.getHeight() - 18 - nextY);
        drawArmorStatus(item, draw.getWidth() / 2 - 110, draw.getHeight() - 18 - nextY + 5, false);
        armorAdd = true;
      }
      nextY = 0;
      if (isNotEmpty(0).booleanValue())
      {
        zx item = mc.h.bi.e(0);
        draw.drawItem(item, draw.getWidth() / 2 + 96, draw.getHeight() - 18 - nextY);
        drawArmorStatus(item, draw.getWidth() / 2 + 113, draw.getHeight() - 18 - nextY + 4, true);
        nextY += 15;
      }
      if (isNotEmpty(1).booleanValue())
      {
        zx item = mc.h.bi.e(1);
        draw.drawItem(item, draw.getWidth() / 2 + 96, draw.getHeight() - 18 - nextY);
        drawArmorStatus(item, draw.getWidth() / 2 + 113, draw.getHeight() - 18 - nextY + 5, true);
      }
    }
    if ((settingsshowArrow) && (mc.h != null) && (mc.h.bi.b(zw.b(261))))
    {
      int left = 0;
      if ((!settingsarmorHudPositionOnTop) && (armorAdd)) {
        switch (settingshud)
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
      if (mc.h.bi.a != null) {
        for (zx item : mc.h.bi.a) {
          if ((item != null) && (item.b() != null) && (zw.b(item.b()) == 262)) {
            count += b;
          }
        }
      }
      draw.drawItem(itemArrow, draw.getWidth() / 2 - 116 - left, draw.getHeight() - 20, count + "x");
    }
  }
  
  public void addArmor(zx item)
  {
    if (ModGui.isSwitch())
    {
      draw.drawItem(item, 2, ModGui.offList);
      drawArmorStatus(item, 20, ModGui.offList + 5, true);
    }
    else
    {
      double k = getInstancedraw.getScale(settingssize);
      draw.drawRightItem(item, (int)((draw.getWidth() - 28) / k), ModGui.offList);
      drawArmorStatus(item, (int)((draw.getWidth() - 20) / k), ModGui.offList + 5, false);
    }
    ModGui.offListNext(14);
  }
  
  public void drawArmorStatus(zx item, int x, int y, boolean left)
  {
    if (left)
    {
      if ((settingshud == 1) && 
        (item.j() - item.h() > 0)) {
        draw.drawString(item.j() - item.h() + "", x, y);
      }
      if ((settingshud == 2) && 
        (item.j() - item.h() > 0)) {
        draw.drawString(item.j() - item.h() + "/" + item.j(), x, y);
      }
      if ((settingshud == 4) && 
        (item.j() - item.h() > 0))
      {
        double armor = item.j() - item.h();
        double max = item.j();
        String name = Math.round(100.0D / max * armor) + "%";
        draw.drawString(name, x, y);
      }
    }
    else
    {
      double k = getInstancedraw.getScale(settingssize);
      String name = "";
      if (item.j() - item.h() > 0)
      {
        if (settingshud == 2) {
          name = item.j() - item.h() + "/" + item.j();
        }
        if (settingshud == 1) {
          name = item.j() - item.h() + "";
        }
        if (settingshud == 4)
        {
          double armor = item.j() - item.h();
          double max = item.j();
          name = Math.round(100.0D / max * armor) + "%";
        }
        draw.drawRightString(name, x, y);
      }
    }
  }
  
  public void drawRadar()
  {
    int b = 0;
    if (settingsshowLiveTicker)
    {
      draw.drawCenteredString(getInstanceLIVETICKER.replace("&", Color.c), draw.getWidth() / 2, 2);
      b += 10;
    }
    if (((!settingsradarCoordinate) && (!settingsradarDirection)) || (!Allowed.gui())) {
      return;
    }
    int point = draw.getWidth() / 2;
    int i = (int)ns.g(mc.h.y) * -1 - 360;
    int o = 45;
    if ((bfc.c != null) && (bfc.b > 0)) {
      if (settingsshowBossBar) {
        b += 15;
      } else {
        b += 9;
      }
    }
    for (int a = 0; a <= 2; a++) {
      for (double k = 0.0D; k <= 3.5D; k += 0.5D)
      {
        if ((draw.getWidth() / 2 + i > point - 50) && (draw.getWidth() / 2 + i < point + 50))
        {
          int m = 0;
          if (settingsradarCoordinate)
          {
            draw.drawCenteredString(Color.c(3) + k, draw.getWidth() / 2 + i, 4 + b + m);
            m += 10;
          }
          if (settingsradarDirection)
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
            draw.drawCenteredString(Color.c(3) + n, draw.getWidth() / 2 + i, 4 + b + m);
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
  }
  
  private void drawOnlineFriendsOnServer()
  {
    int friendSlots = 4;
    try
    {
      if ((settingsshowOnlineFriends) && 
        (!LabyMod.getInstance().isChatGUI()) && (ChatHandler.getMyFriends() != null) && (FriendsLoader.friends != null))
      {
        ArrayList<String> chatFriends = new ArrayList();
        Iterator<LabyModPlayer> itera = ChatHandler.getMyFriends().iterator();
        while (itera.hasNext()) {
          chatFriends.add(((LabyModPlayer)itera.next()).getName().toLowerCase());
        }
        Iterator<bdc> iter = getInstanceonlinePlayers.iterator();
        while (iter.hasNext())
        {
          bdc p = (bdc)iter.next();
          if (getInstancedraw.getWidth() / 2 - 120 - friendSlots * 16 > 0) {
            if ((p != null) && (FriendsLoader.friends != null) && (p.a() != null) && (p.a().getName() != null)) {
              if ((FriendsLoader.friends.containsKey(p.a().getName())) || (chatFriends.contains(p.a().getName().toLowerCase()))) {
                if (settingsonlineFriendsPositionOnTop)
                {
                  int x = getInstancedraw.getWidth() / 6 * 5;
                  a(x - friendSlots * 10 - 2, 0, x - friendSlots * 10 + 8, 9, Integer.MIN_VALUE);
                  a(x - friendSlots * 10 - 1, 1, x - friendSlots * 10 + 7, 8, Integer.MAX_VALUE);
                  bfl.c(1.0F, 1.0F, 1.0F);
                  getInstancetextureManager.drawPlayerHead(p.a().getName(), x - friendSlots * 10, 4.5D, 0.19D);
                  friendSlots++;
                }
                else
                {
                  int x = getInstancedraw.getWidth() / 2 - 120;
                  a(x - friendSlots * 16 - 2, draw.getHeight() - 1, x - friendSlots * 16 + 14, draw.getHeight() - 18, Integer.MIN_VALUE);
                  a(x - friendSlots * 16 - 1, draw.getHeight() - 2, x - friendSlots * 16 + 13, draw.getHeight() - 17, Integer.MAX_VALUE);
                  bfl.c(1.0F, 1.0F, 1.0F);
                  getInstancetextureManager.drawPlayerHead(p.a().getName(), x - friendSlots * 16 + 0.4D, draw.getHeight() - 12.5D, 0.37D);
                  friendSlots++;
                }
              }
            }
          }
        }
      }
    }
    catch (Exception localException) {}
  }
  
  public void drawTeamSpeak()
  {
    if (!settingsteamSpeak) {
      return;
    }
    if ((!settingsteamSpakIngame) && (!settingsteamSpakIngameClients)) {
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
    if (settingsteamSpakIngame) {
      ModGui.addMainLabel(channelName, "", ModGui.mainList);
    }
    if (settingsteamSpakIngameClients) {
      for (TeamSpeakUser user : users)
      {
        String client = TeamSpeak.getTalkColor(user) + "  ⬤ " + Color.cl("f") + user.getNickName() + TeamSpeak.getAway(user);
        if (ModGui.isSwitch()) {
          client = Color.cl("f") + user.getNickName() + TeamSpeak.getAway(user) + TeamSpeak.getTalkColor(user) + "  ⬤ ";
        }
        draw.addString(client, ModGui.mainList);
        ModGui.mainListNext();
      }
    }
  }
  
  public void drawSpotify()
  {
    if (!settingsspotfiyTrack) {
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
      if (((settingsradarCoordinate) || (settingsradarDirection)) && (Allowed.gui())) {
        if ((settingsradarCoordinate) && (settingsradarDirection)) {
          b = 22;
        } else {
          b = 11;
        }
      }
      if ((bfc.c != null) && (bfc.b > 0)) {
        if (settingsshowBossBar) {
          b += 15;
        } else {
          b += 9;
        }
      }
      draw.drawCenteredString(GuiStopWatch.parseTime(GuiStopWatch.getTimer()), draw.getWidth() / 2, b + 5, 2.0D);
    }
  }
  
  public void drawGui()
  {
    if (!settingsgui) {
      return;
    }
    if (!LabyMod.getInstance().isInGame()) {
      return;
    }
    if (mc.t.aB) {
      return;
    }
    if (!Allowed.gui()) {
      return;
    }
    ModGui.mainList = 2;
    ModGui.offList = 2;
    
    GL11.glPushMatrix();
    GL11.glScaled(draw.getScale(settingssize), draw.getScale(settingssize), draw.getScale(settingssize));
    if (settingsalertsChat)
    {
      LabyMod.getInstance().getClient();
      if (!Client.isBusy())
      {
        int amount = 0;
        ArrayList<LabyModPlayer> temp = new ArrayList();
        temp.addAll(LabyMod.getInstance().getClient().getFriends());
        for (LabyModPlayer p : temp) {
          if (p.isNotify()) {
            amount += messages;
          }
        }
        if (amount != 0)
        {
          String a = "";
          if (amount != 1) {
            a = "s";
          }
          String s = Color.cl("c") + amount + " new message" + a;
          draw.addRightString(s, ModGui.offList);
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
    if (!settingshideMod)
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
    if ((mouseLocation != Mouse.getX()) || (mc.h.ba != 0.0F) || (mc.h.O != 0.0F))
    {
      if (getInstanceisAFK)
      {
        ChatHandler.setAFK(false);
        getInstancelastTimeAFK = getInstancelastMove;
        getInstancekeepTime = System.currentTimeMillis();
      }
      getInstancelastMove = System.currentTimeMillis();
    }
    mouseLocation = Mouse.getX();
    if (getInstancelastMove + 20000L < System.currentTimeMillis())
    {
      if (!getInstanceisAFK) {
        ChatHandler.setAFK(true);
      }
      getInstanceisAFK = true;
    }
    else
    {
      getInstanceisAFK = false;
    }
    if (ModAPI.enabled()) {
      ModAPI.callEvent(new RenderOverlayEvent(p_175180_1_));
    }
    LabyMod.getInstance().overlay(0, 0);
  }
}
