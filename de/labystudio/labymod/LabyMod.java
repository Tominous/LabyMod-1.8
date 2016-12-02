package de.labystudio.labymod;

import arm;
import aug;
import ave;
import avm;
import avo;
import avp;
import avt;
import awz;
import axp;
import axu;
import aya;
import azh;
import bcy;
import bdb;
import bdc;
import bde;
import bew;
import com.mojang.authlib.GameProfile;
import de.labystudio.capes.CapeManager;
import de.labystudio.chat.ChatHandler;
import de.labystudio.chat.Client;
import de.labystudio.chat.ClientConnection;
import de.labystudio.chat.EnumAlertType;
import de.labystudio.chat.LabyModPlayer;
import de.labystudio.cosmetic.CosmeticManager;
import de.labystudio.cosmetic.CosmeticTick;
import de.labystudio.downloader.ModInfoDownloader;
import de.labystudio.downloader.UserCapesDownloader;
import de.labystudio.downloader.UserCosmeticsDownloader;
import de.labystudio.gui.GuiAchievementMod;
import de.labystudio.hologram.Manager;
import de.labystudio.language.L;
import de.labystudio.listener.Games;
import de.labystudio.listener.GommeHD;
import de.labystudio.listener.HiveMC;
import de.labystudio.listener.JumpLeague;
import de.labystudio.listener.KeyListener;
import de.labystudio.listener.Revayd;
import de.labystudio.listener.Timolia;
import de.labystudio.minecraft.GuiIngameMod;
import de.labystudio.modapi.ModAPI;
import de.labystudio.modapi.ModManager;
import de.labystudio.modapi.events.GameTickEvent;
import de.labystudio.modapi.events.JoinedServerEvent;
import de.labystudio.modapi.events.PluginMessageReceivedEvent;
import de.labystudio.packets.EnumConnectionState;
import de.labystudio.packets.PacketPlayServerStatus;
import de.labystudio.spotify.SpotifyManager;
import de.labystudio.utils.Allowed;
import de.labystudio.utils.AutoTextLoader;
import de.labystudio.utils.Color;
import de.labystudio.utils.ControllerInput;
import de.labystudio.utils.CrashFix;
import de.labystudio.utils.Debug;
import de.labystudio.utils.DrawUtils;
import de.labystudio.utils.FilterLoader;
import de.labystudio.utils.FriendsLoader;
import de.labystudio.utils.LOGO;
import de.labystudio.utils.ModGui;
import de.labystudio.utils.ServerBroadcast;
import de.labystudio.utils.ServiceStatus;
import de.labystudio.utils.StatsLoader;
import de.labystudio.utils.SupportLog;
import de.labystudio.utils.TextureManager;
import de.labystudio.utils.Utils;
import de.zockermaus.ts3.TeamSpeak;
import de.zockermaus.ts3.TeamSpeakController;
import em;
import eu;
import fa;
import im;
import io.netty.buffer.Unpooled;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.PrintStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.UUID;
import jy;
import org.apache.commons.lang3.SystemUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.lwjgl.opengl.Display;

public class LabyMod
  extends avp
{
  public Logger logger = LogManager.getLogger();
  public static Random random = new Random();
  public String ip = "";
  public int port = 25565;
  public String gameMode = "";
  public ave mc = null;
  public boolean refresh = false;
  public int scroll = 0;
  public int playerPing = 0;
  public int lavaTime = 0;
  public String nickname = "";
  public eu footer;
  public eu header;
  public float foodSaturationLevel = 0.0F;
  public ArrayList<String> onlinePlayerList = new ArrayList();
  public ArrayList<String> gameTypes = new ArrayList();
  public ArrayList<String> serverMSG = new ArrayList();
  public HashMap<String, String> serverPing = new HashMap();
  public ArrayList<String> dumb = new ArrayList();
  public String dumb_str = null;
  public HashMap<String, ServiceStatus> mojangStatus = new HashMap();
  public ArrayList<String> commandQueue = new ArrayList();
  public ArrayList<bdc> onlinePlayers = new ArrayList();
  public boolean chat = true;
  public GuiAchievementMod achievementGui;
  public String line1 = "";
  public String line2 = "";
  public int animation = 0;
  public axu lastScreen;
  public boolean joined = false;
  public boolean intentionally;
  private int min;
  private long secondLoop;
  public int removeChallenge = 0;
  private long lastReport = 0L;
  public boolean out = false;
  public axu onlineChat;
  public DrawUtils draw;
  public Client client;
  public boolean newMessage = false;
  public long lastRecon = 0L;
  public String lastKickReason = "";
  public LabyModPlayer selectedPlayer = null;
  public jy texture_img = new jy("img.png");
  public jy texture_status = new jy("status.png");
  public jy texture_mic = new jy("mic.png");
  public jy texture_box = new jy("box.png");
  public jy texture_teamSpeak = new jy("teamspeak.png");
  public ChatHandler handler;
  public TextureManager textureManager;
  public boolean chatVisibility = false;
  public boolean chatChange = false;
  public axu openMenu = null;
  public boolean isAFK = false;
  public long lastTimeAFK = 0L;
  public long keepTime = 0L;
  public long lastMove = 0L;
  public int autoUpdaterLatestVersionId = 0;
  public int autoUpdaterCurrentVersionId = 0;
  public String latestVersionName = "?";
  public boolean chatPacketUpdate = false;
  private float partialTicks;
  private ServerBroadcast serverBroadcast;
  private CapeManager capeManager;
  private CosmeticManager cosmeticManager;
  private SpotifyManager spotifyManager;
  public String LIVETICKER = "";
  public boolean supportApply;
  private static LabyMod instance;
  private static boolean overwrite = false;
  
  public static LabyMod getInstance()
  {
    if (instance == null) {
      new LabyMod();
    }
    return instance;
  }
  
  public static void overWrite()
  {
    if (!overwrite)
    {
      overwrite = true;
      ave.A().q = new GuiIngameMod(ave.A());
    }
    try
    {
      Display.setTitle("Minecraft 1.8.8 | LabyMod 2.7.98");
    }
    catch (Exception e)
    {
      e.printStackTrace();
    }
  }
  
  public LabyMod()
  {
    instance = this;
    SupportLog.overwrite();
    System.out.println("[LabyMod] Loading labymod..");
    L.load();
    this.mc = ave.A();
    this.textureManager = new TextureManager();
    this.draw = new DrawUtils();
    ConfigManager.loadProperties(true);
    this.achievementGui = new GuiAchievementMod(this.mc);
    this.client = new Client();
    this.handler = new ChatHandler();
    
    this.client.init();
    FriendsLoader.loadFriends();
    FilterLoader.loadFilters();
    AutoTextLoader.load();
    this.capeManager = new CapeManager();
    this.cosmeticManager = new CosmeticManager();
    if (SystemUtils.IS_OS_WINDOWS) {
      this.spotifyManager = new SpotifyManager();
    }
    if (ConfigManager.settings == null) {
      return;
    }
    if (ConfigManager.settings.teamSpeak) {
      TeamSpeak.enable();
    }
    Debug.debug("[LabyMod] Download all cape and cosmetic infos..");
    new ModInfoDownloader();
    new UserCosmeticsDownloader();
    new UserCapesDownloader();
    Debug.debug("[LabyMod] Loaded " + getCosmeticManager().getOnlineCosmetics().size() + " cosmetics!");
    Debug.debug("[LabyMod] Loaded " + getCapeManager().countUserCapes() + " capes!");
    ModManager.loadMods();
    if (!LOGO.isLogo(getPlayerName())) {
      ConfigManager.settings.logomode = false;
    }
    updaterHook();
    StatsLoader.loadstats();
    if (ConfigManager.settings.controller) {
      ControllerInput.init();
    }
    System.out.println("[LabyMod] LabyMod Version 2.7.98 for Minecraft 1.8.8 loaded!");
  }
  
  private void updaterHook()
  {
    Runtime.getRuntime().addShutdownHook(new Thread()
    {
      public void run()
      {
        try
        {
          CrashFix.fixOptifineCrash();
          System.out.println("[LabyMod] Checking if you are using an outdated LabyMod version..");
          if (LabyMod.getInstance().autoUpdaterLatestVersionId > LabyMod.getInstance().autoUpdaterCurrentVersionId)
          {
            System.out.println("[LabyMod] You are outdated! You are still on Version v2.7.98, the latest version v" + LabyMod.this.latestVersionName + " will now be installed..");
            
            Runtime.getRuntime().exec("java -jar LabyMod/Updater-1.8.8.jar");
          }
          else
          {
            System.out.println("[LabyMod] You are using the latest LabyMod version v2.7.98");
          }
        }
        catch (Exception e)
        {
          e.printStackTrace();
        }
      }
    });
  }
  
  public SpotifyManager getSpotifyManager()
  {
    return this.spotifyManager;
  }
  
  public CapeManager getCapeManager()
  {
    return this.capeManager;
  }
  
  public CosmeticManager getCosmeticManager()
  {
    return this.cosmeticManager;
  }
  
  public Client getClient()
  {
    return this.client;
  }
  
  public float getPartialTicks()
  {
    return this.partialTicks;
  }
  
  public void setPartialTicks(float partialTicks)
  {
    this.partialTicks = partialTicks;
  }
  
  public ServerBroadcast getServerBroadcast()
  {
    return this.serverBroadcast;
  }
  
  public void setServerBroadcast(ServerBroadcast serverBroadcast)
  {
    this.serverBroadcast = serverBroadcast;
  }
  
  public boolean isUpdateAvailable()
  {
    if (getInstance().autoUpdaterLatestVersionId == 0) {
      return false;
    }
    return getInstance().autoUpdaterLatestVersionId > getInstance().autoUpdaterCurrentVersionId;
  }
  
  public void resetIP()
  {
    if (((this.ip == null) || (!this.ip.replace(" ", "").isEmpty())) && 
      (this.client.getClientConnection().getState() == EnumConnectionState.PLAY)) {
      this.client.getClientConnection().sendPacket(new PacketPlayServerStatus(" ", 0));
    }
    this.ip = "";
    this.gameMode = "";
    this.joined = false;
  }
  
  public void resetMod()
  {
    this.scroll = 0;
    this.lavaTime = 0;
    this.playerPing = 0;
    this.lavaTime = 0;
    this.nickname = "";
    Manager.holograms.clear();
    
    ChatHandler.resetTyping();
    if (this.gameMode == null) {
      this.gameMode = "";
    }
    if (!this.gameMode.isEmpty())
    {
      this.gameMode = "";
      ChatHandler.updateGameMode("");
    }
    this.header = null;
    this.footer = null;
    JumpLeague.resetJumpLeague();
    GommeHD.resetGommeHD();
    Timolia.resetTimolia();
    ModGui.reset();
    Games.reset();
    Revayd.reset();
    HiveMC.reset();
  }
  
  public String getHeader()
  {
    if ((this.header == null) || (this.header.c() == null)) {
      return "";
    }
    return this.header.c();
  }
  
  public String getFooter()
  {
    if ((this.footer == null) || (this.footer.c() == null)) {
      return "";
    }
    return this.footer.c();
  }
  
  public void sendCommand(String send)
  {
    if (isInGame()) {
      this.mc.h.e("/" + send);
    }
  }
  
  public void sendChatMessage(String message)
  {
    if (isInGame()) {
      this.mc.h.e(message);
    }
  }
  
  public void displayMessageInChat(String message)
  {
    if (ave.A().q != null) {
      ave.A().q.d().a(new fa(message));
    }
  }
  
  public void sendMessage(String prefix, LabyModPlayer player, String message)
  {
    getClient();
    if (Client.isBusy()) {
      return;
    }
    if (!this.client.hasNotifications(player)) {
      return;
    }
    if (ConfigManager.settings.chatAlertType)
    {
      if (ConfigManager.settings.alertsChat) {
        getInstance().displayMessageInChat(ClientConnection.chatPrefix + Color.cl("e") + prefix + player.getName() + Color.cl("7") + " " + message);
      }
    }
    else {
      this.achievementGui.displayMessage(prefix + player.getName(), message, EnumAlertType.CHAT);
    }
  }
  
  public String getPlayerName()
  {
    return this.mc.L().c();
  }
  
  public UUID getPlayerUUID()
  {
    UUID uuid = this.mc.L().e().getId();
    if (uuid == null) {
      return UUID.randomUUID();
    }
    return uuid;
  }
  
  public boolean isInGame()
  {
    try
    {
      return (this.mc != null) && (this.mc.h != null) && (this.mc.h != null);
    }
    catch (Exception error) {}
    return false;
  }
  
  public boolean isChatGUI()
  {
    if (this.mc.m != null) {
      return this.mc.m.toString().contains("GuiChat");
    }
    return false;
  }
  
  public void gameTick()
  {
    if (ModAPI.enabled()) {
      ModAPI.callEvent(new GameTickEvent());
    }
    ClickCounter.tick();
    SupportLog.listenKey();
    CosmeticTick.tickAllCosmetics();
    if (ConfigManager.settings.controller) {
      ControllerInput.tick();
    }
    this.secondLoop += 1L;
    if (this.secondLoop >= 20L)
    {
      this.secondLoop = 0L;
      secondLoop();
    }
  }
  
  public void secondLoop()
  {
    this.min += 1;
    if ((getSpotifyManager() != null) && (ConfigManager.settings.spotfiyTrack)) {
      getSpotifyManager().updateTitle();
    }
    if (isInGame())
    {
      this.onlinePlayers.clear();
      this.onlinePlayers.addAll(this.mc.h.a.d());
      if (ConfigManager.settings.lavaTime) {
        if ((this.mc.f.a(this.mc.h.aR().b(0.0D, -0.4000000059604645D, 0.0D).d(0.001D, 0.001D, 0.001D), arm.i, this.mc.h)) && 
          (this.mc.h.at()))
        {
          this.lavaTime += 1;
          this.removeChallenge = 0;
        }
        else
        {
          this.removeChallenge += 1;
          if (this.removeChallenge > 2)
          {
            this.lavaTime = 0;
            this.removeChallenge = 0;
          }
        }
      }
    }
    else
    {
      this.isAFK = false;
    }
    if (this.mc.m == null) {
      ChatHandler.updateIsWriting(null, "");
    }
    if (this.min >= 60)
    {
      this.min = 0;
      minutesLoop();
    }
    GommeHD.loop();
    if ((ConfigManager.settings.teamSpeak) && (TeamSpeakController.getInstance() != null)) {
      TeamSpeakController.getInstance().tick();
    }
  }
  
  public void minutesLoop()
  {
    if (random.nextInt(6) == 0) {
      getClient().getClientConnection().reconnect();
    }
  }
  
  public boolean openWebpage(String urlString, boolean request)
  {
    try
    {
      if ((!urlString.toLowerCase().startsWith("https://")) && 
        (!urlString.toLowerCase().startsWith("http://"))) {
        urlString = "http://" + urlString;
      }
      Utils.openWebpage(new URL(urlString).toURI(), request);
      return true;
    }
    catch (Exception e)
    {
      e.printStackTrace();
    }
    return false;
  }
  
  public void connectToServer(String address)
  {
    if (ave.A().f != null)
    {
      ave.A().f.H();
      ave.A().a((bdb)null);
    }
    ave.A().a(new awz(new aya(), this.mc, new bde("Server", address, false)));
  }
  
  public Boolean hasFocus()
  {
    if (isInGame()) {
      return Boolean.valueOf(this.mc.w);
    }
    return Boolean.valueOf(false);
  }
  
  public ArrayList<String> toLowerCaseList(ArrayList<String> list)
  {
    ArrayList<String> output = new ArrayList();
    for (String s : list) {
      output.add(s.toLowerCase());
    }
    return output;
  }
  
  public void back()
  {
    if (isInGame()) {
      this.mc.a(new axp());
    } else {
      this.mc.a(new azh(null));
    }
  }
  
  public void updateServerIP(String address, int port)
  {
    resetMod();
    if (address == null) {
      this.ip = "";
    } else {
      this.ip = address;
    }
    this.port = port;
    ConfigManager.settings.last_Server = address;
    Allowed.update(address);
    if (this.client.getClientConnection().getState() != EnumConnectionState.OFFLINE) {
      this.client.getClientConnection().sendPacket(new PacketPlayServerStatus(address, port));
    }
  }
  
  public boolean createPath(File file)
  {
    if (file.exists()) {
      return false;
    }
    file.getParentFile().mkdirs();
    try
    {
      file.createNewFile();
    }
    catch (IOException e)
    {
      e.printStackTrace();
      return false;
    }
    return true;
  }
  
  public void overlay(int mouseX, int mouseY)
  {
    if ((this.achievementGui != null) && (
      (!ConfigManager.settings.chatAlertType) || (!ConfigManager.settings.teamSpeakAlertTypeChat) || (!ConfigManager.settings.mojangStatusChat))) {
      this.achievementGui.updateAchievementWindow();
    }
    DrawUtils.updateMouse(mouseX, mouseY);
    KeyListener.handle();
  }
  
  public void onRender()
  {
    if (getInstance().isInGame())
    {
      JumpLeague.isFallingDown();
      ModGui.smoothFPS();
      if (!this.joined)
      {
        this.joined = true;
        onJoin();
      }
    }
    if (ConfigManager.settings.controller) {
      ControllerInput.mouseTick();
    }
  }
  
  public void onJoin()
  {
    if (ModAPI.enabled()) {
      ModAPI.callEvent(new JoinedServerEvent(this.ip, this.port));
    }
    if ((!this.mc.F()) && 
      (!getInstance().commandQueue.isEmpty())) {
      getInstance().sendCommand((String)getInstance().commandQueue.get(0));
    }
    em packetBuffer = new em(Unpooled.buffer());
    packetBuffer.a("LabyMod v2.7.98");
    this.mc.u().a(new im("LABYMOD", packetBuffer));
    if (this.chatPacketUpdate) {
      displayMessageInChat(Color.cl("c") + "LabyMod is outdated!" + Color.cl("7") + " Download the latest version " + Color.cl("e") + "v" + this.latestVersionName + Color.cl("7") + " at " + 
        Color.cl("9") + "https://www.LabyMod.net" + "");
    }
    if (this.ip.toLowerCase().contains("bessererange.tk"))
    {
      displayMessageInChat(Color.cl("4") + Color.cl("l") + "Du glaubst doch nicht wirklich,");
      displayMessageInChat(Color.cl("4") + Color.cl("l") + "dass dir diese IP einen Vorteil bringt, oder?");
    }
  }
  
  public void pluginMessage(String channel, em data)
  {
    if (ModAPI.enabled()) {
      ModAPI.callEvent(new PluginMessageReceivedEvent(channel, data));
    }
    try
    {
      if ((data != null) && (channel != null) && (channel.equals("LABYMOD")))
      {
        ByteArrayInputStream byteIn = new ByteArrayInputStream(data.array());
        ObjectInputStream in = new ObjectInputStream(byteIn);
        list = (Map)in.readObject();
        for (String key : list.keySet())
        {
          Allowed.set(key, ((Boolean)list.get(key)).booleanValue());
          ave.A().q.d()
            .a(new fa(Color.cl("c") + "The " + Color.cl("e") + key + Color.cl("c") + " function was " + 
            ((Boolean)list.get(key)).toString().replace("true", new StringBuilder().append(Color.cl("a")).append("enabled").toString()).replace("false", new StringBuilder().append(Color.cl("4")).append("disabled").toString()) + Color.cl("c") + " by the server."));
        }
      }
    }
    catch (Exception error)
    {
      Map<String, Boolean> list;
      error.printStackTrace();
    }
  }
  
  public boolean onSendChatMessage(String msg)
  {
    String m = msg.toLowerCase();
    if ((m.startsWith("/capereport")) || (m.startsWith("/reportcape")))
    {
      if (msg.contains(" "))
      {
        if (this.lastReport < System.currentTimeMillis())
        {
          final String user = msg.split(" ")[1];
          new Thread(new Runnable()
          {
            public void run()
            {
              try
              {
                LabyMod.this.lastReport = (System.currentTimeMillis() + 20000L);
                LabyMod.this.displayMessageInChat(Utils.jsonPost("http://api.labymod.net/php/capeReport.php", "reporter=" + LabyMod.this.getPlayerName() + "&capeowner=" + user));
              }
              catch (Exception e)
              {
                e.printStackTrace();
              }
            }
          })
          
            .start();
        }
        else
        {
          displayMessageInChat(Color.cl("c") + "You've just reported a cape, please wait for a short while..");
        }
      }
      else {
        displayMessageInChat(Color.cl("c") + msg + " <player>");
      }
      return false;
    }
    return true;
  }
}
