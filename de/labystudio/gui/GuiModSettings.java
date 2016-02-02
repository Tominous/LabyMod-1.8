package de.labystudio.gui;

import ave;
import avh;
import avs;
import awx;
import axu;
import bfl;
import de.labystudio.capes.CapeManager;
import de.labystudio.gui.extras.SliderClicks;
import de.labystudio.gui.extras.SliderColor;
import de.labystudio.gui.extras.SliderCoords;
import de.labystudio.gui.extras.SliderSize;
import de.labystudio.labymod.ConfigManager;
import de.labystudio.labymod.LabyMod;
import de.labystudio.labymod.ModSettings;
import de.labystudio.labymod.Source;
import de.labystudio.utils.Color;
import de.labystudio.utils.DrawUtils;
import de.labystudio.utils.ModGui;
import de.zockermaus.ts3.TeamSpeak;
import de.zockermaus.ts3.TeamSpeakController;
import java.util.List;

public class GuiModSettings
  extends axu
  implements awx
{
  private final avh game_settings_1;
  private final axu field_146441_g;
  private DrawUtils draw;
  private int tabY = 0;
  int x;
  int y;
  int sy = 40;
  int ey = 21;
  
  public GuiModSettings(axu p_i1046_1_, avh p_i1046_2_)
  {
    this.draw = LabyMod.getInstance().draw;
    this.field_146441_g = p_i1046_1_;
    this.game_settings_1 = p_i1046_2_;
    this.currentTab = "Ingame";
  }
  
  public boolean slider = false;
  avs theSlider;
  String currentTab = "";
  
  public void b()
  {
    this.n.clear();
    
    this.tabY = 28;
    
    this.sy = (this.m / 7);
    if (this.sy > 60) {
      this.sy = 60;
    }
    this.ey = (this.m / 14);
    if (this.ey > 21) {
      this.ey = 21;
    }
    this.n.add(new avs(1, 2, this.m - 21, 99, 20, "Done"));
    this.n.add(new avs(-5, 110, 4, 20, 20, "?"));
    
    addTab("Ingame");
    addTab("Formatting");
    addTab("Animations");
    addTab("Gui Settings");
    addTab("Extras");
    addTab("Server Support");
    addTab("GommeHD.net");
    addTab("Menu");
    addTab("TeamSpeak");
    addTab("Minecraft Chat");
    initSettings(false);
  }
  
  public void initSettings(boolean r)
  {
    this.y = 46;
    this.x = 120;
    if (this.currentTab.equals("Ingame"))
    {
      addToggle(r, Boolean.valueOf(ConfigManager.settings.potionEffects), 6, "Potion Effects", "Shows your current potion effects");
      addToggle(r, Boolean.valueOf(ConfigManager.settings.showOnlinePlayers), 5, "Online Players", "Shows how many players are online");
      
      addToggle(r, Boolean.valueOf(ConfigManager.settings.showCoords), 22, "Show coords", "Shows the coordinates");
      addToggle(r, ConfigManager.settings.showServerIP, 34, "Show Server IP", "Displays the IP adress of the server you're currently playing on.");
      
      addToggle(r, ConfigManager.settings.showFPS, 37, "Show FPS", "Shows the FPS");
      addToggle(r, Boolean.valueOf(ConfigManager.settings.showKills), 51, "Kills", "Shows the amount of killed players (In Hardcore Games and Survival Games)");
      addToggle(r, Boolean.valueOf(ConfigManager.settings.showPing), 33, "Show ping", "Shows your current ping");
      
      addToggle(r, Boolean.valueOf(ConfigManager.settings.showBossBar), 63, "Bossbar", "This option allows you to remove the boss health bar, but the text above it will still be displayed.");
      addToggle(r, Boolean.valueOf(ConfigManager.settings.showClock), 83, "Clock", "Displays your current real life time.");
    }
    if (this.currentTab.equals("Formatting"))
    {
      addSwitchNoOff(r, ConfigManager.settings.layout, 8, 9, "Brackets", 10, "Colon", 11, "Angle brackets", "Gui layout");
      
      addToggle(r, Boolean.valueOf(ConfigManager.settings.bold), 29, "Bold", "");
      addToggle(r, Boolean.valueOf(ConfigManager.settings.underline), 30, "Underline", "");
      addToggle(r, Boolean.valueOf(ConfigManager.settings.italic), 31, "Italic", "");
      
      addSliderColor(r, "Prefix", 1);
      addSliderColor(r, "Brackets", 2);
      addSliderColor(r, "Text", 3);
      
      addSliderColor(r, "Title", 4);
      addSliderColor(r, "Info", 5);
      
      this.draw.drawString(Color.c(4) + "Preview:", 135.0D, 5.0D);
      this.draw.drawString(ModGui.createLabel("X", ModGui.getX()), 135.0D, 15.0D);
    }
    if (this.currentTab.equals("Animations"))
    {
      addToggleA(r, ConfigManager.settings.oldDMG, 32, "Damage", "In the 1.8. a damaged player will flash up red for a short time. In the 1.7 the armor will flash up aswell.");
      addToggleA(r, ConfigManager.settings.oldHearts, 40, "Heart", "In the 1.8 your hearts that you lost will light up in white shortly. This does not happen in 1.7");
      addToggleA(r, ConfigManager.settings.oldBow, 41, "Bow", "In the 1.8 the bow is scaled different, in the 1.7 we scaled it as u are used to it");
      addToggleCustom(r, Boolean.valueOf(ConfigManager.settings.oldTablist), 58, "Tablist", "1.8 Design", "1.7 Design", "The 1.8 Tablist is showing you more information such as playerheads and is sorted alphabetically");
      addToggleA(r, Boolean.valueOf(ConfigManager.settings.oldBlockBuild), 81, "BlockBuild", "In 1.7 it was possible to build a block and destory it the same time. We integrated this feature into 1.8 - This feature is only available on GommeHD.net");
      addToggleA(r, ConfigManager.settings.oldSword, 42, "Sword", "In the 1.7 setting you will see the typical Swordblockanimation in third Personview");
      addToggleA(r, ConfigManager.settings.oldBlockhit, 43, "Blockhit", "the 1.8 does not support the blockhit animation. By choosing 1.7 you will see the wellknown animation again");
      addToggleA(r, Boolean.valueOf(ConfigManager.settings.oldFishing), 46, "Fishing", "In the 1.8 the rod is scaled different and shown in another angle, in the 1.7 we scaled it as u are used to it");
      addToggleA(r, Boolean.valueOf(ConfigManager.settings.oldSneak), 79, "Sneaking", "In the 1.7 sneaking is made smoother similar to the sneaking animation in 1.7");
    }
    if (this.currentTab.equals("Gui Settings"))
    {
      addSwitch(r, ConfigManager.settings.hud, 12, 13, "Durability only", 14, "Durability/Max", 15, "Item only", 44, "Percent", "Armor HUD");
      addMToggle(r, "Direction F Layout", new SettingsButton[] { new SettingsButton(19, "Number", ConfigManager.settings.fLayoutNumber), new SettingsButton(20, "Cardinal Direction", ConfigManager.settings.fLayoutDirection), new SettingsButton(21, "X and Z", ConfigManager.settings.fLayoutXAndZ) }, "Shows the F Direction");
      
      addMToggle(r, "Direction HUD", new SettingsButton[] { new SettingsButton(2, "F Coordinate", ConfigManager.settings.radarCoordinate), new SettingsButton(3, "Cardinal Direction", ConfigManager.settings.radarDirection) }, "Shows the current direction you are facing at (F Coordinate) in the top of the screen");
      
      addSliderCoords(r, "Number precision");
      addSliderSize(r, "Mod Scale");
      
      addToggleS(r, ConfigManager.settings.potionsize, 50, "Potion size");
      addToggleCustomNC(r, ConfigManager.settings.guiPositionRight, 59, "Gui position", "Left", "Right", "Change the position of all important informations");
      addToggleCustomNC(r, Boolean.valueOf(ConfigManager.settings.onlineFriendsPositionOnTop), 60, "Online Friends position", "Bottom", "Top", "Change the position of the ingame friendlist");
      addToggleCustomNC(r, Boolean.valueOf(ConfigManager.settings.armorHudPositionOnTop), 86, "Armor HUD position", "Hotbar", "Top", "Change the position of the armor hud");
      
      this.draw.drawString(Color.c(4) + "Preview:", 135.0D, 5.0D);
      this.draw.drawString(ModGui.createLabel("X", ModGui.getX()), 135.0D, 15.0D);
    }
    if (this.currentTab.equals("Extras"))
    {
      addToggle(r, Boolean.valueOf(ConfigManager.settings.box), 7, "HG Box", "All game information from Brawl Hardcore Games in an information box");
      addSliderClicks(r, "Clicktest");
      
      addToggle(r, Boolean.valueOf(ConfigManager.settings.lavaTime), 35, "Lavachallenge Timer", "It starts a Timer as you touch lava");
      addToggle(r, Boolean.valueOf(ConfigManager.settings.showMyName), 55, "Show my Name", "It will displays your own ingame name above your Head");
      addToggle(r, ConfigManager.settings.capes, 62, "Capes", "Enable/Disable all Capes");
      
      addToggle(r, Boolean.valueOf(ConfigManager.settings.foodSaturation), 52, "Food saturation", "It displays how long you are saturated");
      addToggle(r, Boolean.valueOf(ConfigManager.settings.smoothFPS), 48, "Smooth FPS", "The FPS display will be updated more often");
      addToggle(r, ConfigManager.settings.afkTimer, 56, "AFK Timer", "Its starts a timer once you are AFK");
      
      addToggle(r, ConfigManager.settings.tabPing, 45, "Ping on Tab", "You can see the ping of every player on the tablist");
      addToggle(r, Boolean.valueOf(ConfigManager.settings.showOnlineFriends), 57, "Show Online Friends", "Shows the player head of all online friends in the top or bottom of the screen");
      addToggle(r, Boolean.valueOf(ConfigManager.settings.speedFOV), 71, "SpeedFOV", "If this option is set to OFF, the speed potion effect will no longer increase your FOV.");
      addToggle(r, Boolean.valueOf(ConfigManager.settings.leftHand), 87, "Use left hand", "Switch your first person hand to the left side");
    }
    if (this.currentTab.equals("Server Support"))
    {
      addToggle(r, ConfigManager.settings.gameBrawl, 39, "Brawl", "Shows the game information about Brawl");
      addToggle(r, ConfigManager.settings.gameTimolia, 16, "Timolia", "Shows the game information about Timolia");
      
      addToggle(r, ConfigManager.settings.gamePlayMinity, 17, "PlayMinity", "Shows the game information about PlayMinity");
      addToggle(r, ConfigManager.settings.gameGommeHD, 18, "GommeHD", "Shows the game information about GommeHD");
    }
    if (this.currentTab.equals("GommeHD.net"))
    {
      addToggleCustomNC(r, Boolean.valueOf(ConfigManager.settings.gommePosLeft), 73, "BedWars Timer", "Right", "Left", "Change the position of the GommeHD Gold cooldown");
      addToggle(r, ConfigManager.settings.showBWTeams, 76, "BedWars Teams", "Displays the name of the teams above their bases in BedWars");
      addToggle(r, Boolean.valueOf(ConfigManager.settings.autoLeave), 80, "Auto Leave", "If your party doesn't find a team in bedwars you will automatically connect to the hub.");
      addToggle(r, ConfigManager.settings.showBWTimer, 75, "BedWars Timer", "Indicates the time until the next gold/iron will spawn at BedWars");
      addToggle(r, ConfigManager.settings.showNickname, 23, "Show Nickname", "Displays your nickname of the youtuber-nick plugin (on GommeHD for instance).");
    }
    if (this.currentTab.equals("Menu"))
    {
      addToggle(r, ConfigManager.settings.smoothScroll, 64, "Smooth scrolling", "Reduces the scroll-speed for the Serverlist");
      addToggle(r, Boolean.valueOf(ConfigManager.settings.background), 82, "Gui background", "This option allows you to enable and disable the background of the GUI");
      addToggle(r, Boolean.valueOf(ConfigManager.settings.betterRefresh), 49, "Better Refresh", "Adds an auto refresh button in the multiplayer gui");
      addToggle(r, Boolean.valueOf(ConfigManager.settings.confirmDisconnect), 61, "Confirm Disconnect", "You have to confirm with pressing the button again if you want to disconnect the server");
      addToggle(r, Boolean.valueOf(ConfigManager.settings.infoInMenu), 47, "Serverstatus in Menu", "Shows you all server information in the ESCAPE menu (Server icon, motd, slots, online players, ping)");
      addToggle(r, Boolean.valueOf(ConfigManager.settings.directConnectInfo), 54, "Directconnect Serverstatus", "Shows you all important server information in the direct connent gui (online players, slots, ping)");
      addToggle(r, ConfigManager.settings.tags, 68, "Tags", "This option allows you to change the names of your friends and costumize them using colorcodes. The nicknames can be seen in the tablist, over their heads and in chat.");
      
      addToggle(r, Boolean.valueOf(ConfigManager.settings.miniGames), 36, "Minigames", "Minigames in Minecraft");
      addToggle(r, Boolean.valueOf(ConfigManager.settings.quickPlay), 84, "QuickPlay", "Shows in the main menu the latest server and your directconnect server");
      addToggle(r, Boolean.valueOf(ConfigManager.settings.stopWatch), 85, "Stopwatch", "A simple stopwatch in Minecraft. It lets you measure the time, which will also be displayed in the GUI.");
    }
    if (this.currentTab.equals("TeamSpeak"))
    {
      addToggle(r, ConfigManager.settings.teamSpeak, 65, "TeamSpeak", "If you run TeamSpeak you're able to accses it using Minecraft, you'll be able to see channels, join them, etc.");
      addToggle(r, Boolean.valueOf(ConfigManager.settings.alertsTeamSpeak), 4, "TS Alerts", "Shows a message from TeamSpeak as an achievement");
      addToggleSub(r, ConfigManager.settings.teamSpakIngameClients, ConfigManager.settings.teamSpeak, 70, "TS Clients", "Showing you who is in the channel and who is currently talking.");
      addToggleSub(r, Boolean.valueOf(ConfigManager.settings.teamSpakIngame), ConfigManager.settings.teamSpeak, 69, "TS Channel", "If this option is on, the channel you're currently in will be displayed below your coordinates.");
      addSliderColor(r, "TS Silent", 6);
      addSliderColor(r, "TS Talking", 7);
      addSliderColor(r, "TS Away", 10);
      
      addSliderColor(r, "TS Micro muted", 8);
      addSliderColor(r, "TS Sound muted", 9);
    }
    if (this.currentTab.equals("Minecraft Chat"))
    {
      addToggle(r, ConfigManager.settings.chatFilter, 78, "Chat Filter", "You can filter your chat by certain keywords, or commands definded at \"filters\"");
      addToggle(r, Boolean.valueOf(ConfigManager.settings.autoText), 77, "AutoText", "Your previously defined chat messages will be sended by pressing a single key");
      addToggle(r, ConfigManager.settings.extraChat, 38, "Extra Chat", "You can see all private messages in an extra chat on the right side of the screen");
    }
  }
  
  protected void a(avs button)
  {
    if (button.k == -1)
    {
      this.currentTab = button.j;
      if (button.k != -3) {
        b();
      }
      return;
    }
    if (button.k == -5) {
      this.j.a(new GuiLabyModMenu(this));
    }
    int i;
    switch (button.k)
    {
    case 0: 
      ConfigManager.settings.alertsChat = (!ConfigManager.settings.alertsChat);
      break;
    case 1: 
      this.j.a(this.field_146441_g);
      break;
    case 2: 
      ConfigManager.settings.radarCoordinate = (!ConfigManager.settings.radarCoordinate);
      break;
    case 3: 
      ConfigManager.settings.radarDirection = (!ConfigManager.settings.radarDirection);
      break;
    case 4: 
      ConfigManager.settings.alertsTeamSpeak = (!ConfigManager.settings.alertsTeamSpeak);
      break;
    case 5: 
      ConfigManager.settings.showOnlinePlayers = (!ConfigManager.settings.showOnlinePlayers);
      break;
    case 6: 
      ConfigManager.settings.potionEffects = (!ConfigManager.settings.potionEffects);
      break;
    case 7: 
      ConfigManager.settings.box = (!ConfigManager.settings.box);
      break;
    case 8: 
      ConfigManager.settings.layout = 0;
      break;
    case 9: 
      ConfigManager.settings.layout = 1;
      break;
    case 10: 
      ConfigManager.settings.layout = 2;
      break;
    case 11: 
      ConfigManager.settings.layout = 3;
      break;
    case 12: 
      ConfigManager.settings.hud = 0;
      break;
    case 13: 
      ConfigManager.settings.hud = 1;
      break;
    case 14: 
      ConfigManager.settings.hud = 2;
      break;
    case 15: 
      ConfigManager.settings.hud = 3;
      break;
    case 16: 
      ConfigManager.settings.gameTimolia = Boolean.valueOf(!ConfigManager.settings.gameTimolia.booleanValue());
      break;
    case 17: 
      ConfigManager.settings.gamePlayMinity = Boolean.valueOf(!ConfigManager.settings.gamePlayMinity.booleanValue());
      break;
    case 18: 
      ConfigManager.settings.gameGommeHD = Boolean.valueOf(!ConfigManager.settings.gameGommeHD.booleanValue());
      break;
    case 19: 
      ConfigManager.settings.fLayoutNumber = (!ConfigManager.settings.fLayoutNumber);
      break;
    case 20: 
      ConfigManager.settings.fLayoutDirection = (!ConfigManager.settings.fLayoutDirection);
      break;
    case 21: 
      ConfigManager.settings.fLayoutXAndZ = (!ConfigManager.settings.fLayoutXAndZ);
      break;
    case 22: 
      ConfigManager.settings.showCoords = (!ConfigManager.settings.showCoords);
      break;
    case 23: 
      ConfigManager.settings.showNickname = Boolean.valueOf(!ConfigManager.settings.showNickname.booleanValue());
      break;
    case 24: 
      i = Color.colorToID(ConfigManager.settings.color1);
      i = manageInt(i);
      ConfigManager.settings.color1 = Color.IDToColor(i);
      b();
      break;
    case 25: 
      i = Color.colorToID(ConfigManager.settings.color2);
      i = manageInt(i);
      ConfigManager.settings.color2 = Color.IDToColor(i);
      b();
      break;
    case 26: 
      i = Color.colorToID(ConfigManager.settings.color3);
      i = manageInt(i);
      ConfigManager.settings.color3 = Color.IDToColor(i);
      b();
      break;
    case 27: 
      i = Color.colorToID(ConfigManager.settings.color4);
      i = manageInt(i);
      ConfigManager.settings.color4 = Color.IDToColor(i);
      b();
      break;
    case 28: 
      i = Color.colorToID(ConfigManager.settings.color5);
      i = manageInt(i);
      ConfigManager.settings.color5 = Color.IDToColor(i);
      b();
      break;
    case 29: 
      ConfigManager.settings.bold = (!ConfigManager.settings.bold);
      break;
    case 30: 
      ConfigManager.settings.underline = (!ConfigManager.settings.underline);
      break;
    case 31: 
      ConfigManager.settings.italic = (!ConfigManager.settings.italic);
      break;
    case 32: 
      ConfigManager.settings.oldDMG = Boolean.valueOf(!ConfigManager.settings.oldDMG.booleanValue());
      break;
    case 33: 
      ConfigManager.settings.showPing = (!ConfigManager.settings.showPing);
      break;
    case 34: 
      ConfigManager.settings.showServerIP = Boolean.valueOf(!ConfigManager.settings.showServerIP.booleanValue());
      break;
    case 35: 
      ConfigManager.settings.lavaTime = (!ConfigManager.settings.lavaTime);
      break;
    case 36: 
      ConfigManager.settings.miniGames = (!ConfigManager.settings.miniGames);
      break;
    case 37: 
      ConfigManager.settings.showFPS = Boolean.valueOf(!ConfigManager.settings.showFPS.booleanValue());
      break;
    case 38: 
      ConfigManager.settings.extraChat = Boolean.valueOf(!ConfigManager.settings.extraChat.booleanValue());
      break;
    case 39: 
      ConfigManager.settings.gameBrawl = Boolean.valueOf(!ConfigManager.settings.gameBrawl.booleanValue());
      break;
    case 40: 
      ConfigManager.settings.oldHearts = Boolean.valueOf(!ConfigManager.settings.oldHearts.booleanValue());
      break;
    case 41: 
      ConfigManager.settings.oldBow = Boolean.valueOf(!ConfigManager.settings.oldBow.booleanValue());
      break;
    case 42: 
      ConfigManager.settings.oldSword = Boolean.valueOf(!ConfigManager.settings.oldSword.booleanValue());
      break;
    case 43: 
      ConfigManager.settings.oldBlockhit = Boolean.valueOf(!ConfigManager.settings.oldBlockhit.booleanValue());
      break;
    case 44: 
      ConfigManager.settings.hud = 4;
      break;
    case 45: 
      ConfigManager.settings.tabPing = Boolean.valueOf(!ConfigManager.settings.tabPing.booleanValue());
      break;
    case 46: 
      ConfigManager.settings.oldFishing = (!ConfigManager.settings.oldFishing);
      break;
    case 47: 
      ConfigManager.settings.infoInMenu = (!ConfigManager.settings.infoInMenu);
      break;
    case 48: 
      ConfigManager.settings.smoothFPS = (!ConfigManager.settings.smoothFPS);
      break;
    case 49: 
      ConfigManager.settings.betterRefresh = (!ConfigManager.settings.betterRefresh);
      break;
    case 50: 
      i = ConfigManager.settings.potionsize;
      i = manageInt2(i);
      ConfigManager.settings.potionsize = i;
      break;
    case 51: 
      ConfigManager.settings.showKills = (!ConfigManager.settings.showKills);
      break;
    case 52: 
      ConfigManager.settings.foodSaturation = (!ConfigManager.settings.foodSaturation);
      break;
    case 53: 
      ConfigManager.settings.armorRating = Boolean.valueOf(!ConfigManager.settings.armorRating.booleanValue());
      break;
    case 54: 
      ConfigManager.settings.directConnectInfo = (!ConfigManager.settings.directConnectInfo);
      break;
    case 55: 
      ConfigManager.settings.showMyName = (!ConfigManager.settings.showMyName);
      break;
    case 56: 
      ConfigManager.settings.afkTimer = Boolean.valueOf(!ConfigManager.settings.afkTimer.booleanValue());
      break;
    case 57: 
      ConfigManager.settings.showOnlineFriends = (!ConfigManager.settings.showOnlineFriends);
      break;
    case 58: 
      ConfigManager.settings.oldTablist = (!ConfigManager.settings.oldTablist);
      break;
    case 59: 
      ConfigManager.settings.guiPositionRight = Boolean.valueOf(!ConfigManager.settings.guiPositionRight.booleanValue());
      break;
    case 60: 
      ConfigManager.settings.onlineFriendsPositionOnTop = (!ConfigManager.settings.onlineFriendsPositionOnTop);
      break;
    case 61: 
      ConfigManager.settings.confirmDisconnect = (!ConfigManager.settings.confirmDisconnect);
      break;
    case 62: 
      ConfigManager.settings.capes = Boolean.valueOf(!ConfigManager.settings.capes.booleanValue());
      CapeManager.refresh();
      break;
    case 63: 
      ConfigManager.settings.showBossBar = (!ConfigManager.settings.showBossBar);
      break;
    case 64: 
      ConfigManager.settings.smoothScroll = Boolean.valueOf(!ConfigManager.settings.smoothScroll.booleanValue());
      break;
    case 65: 
      ConfigManager.settings.teamSpeak = Boolean.valueOf(!ConfigManager.settings.teamSpeak.booleanValue());
      if (!ConfigManager.settings.teamSpeak.booleanValue())
      {
        ConfigManager.settings.teamSpakIngame = false;
        ConfigManager.settings.teamSpakIngameClients = Boolean.valueOf(false);
        TeamSpeakController.getInstance().quit();
      }
      else
      {
        TeamSpeak.enable();
      }
      break;
    case 66: 
      break;
    case 67: 
      ConfigManager.settings.brawl = Boolean.valueOf(!ConfigManager.settings.brawl.booleanValue());
      break;
    case 68: 
      ConfigManager.settings.tags = Boolean.valueOf(!ConfigManager.settings.tags.booleanValue());
      break;
    case 69: 
      ConfigManager.settings.teamSpakIngame = (!ConfigManager.settings.teamSpakIngame);
      break;
    case 70: 
      ConfigManager.settings.teamSpakIngameClients = Boolean.valueOf(!ConfigManager.settings.teamSpakIngameClients.booleanValue());
      break;
    case 71: 
      ConfigManager.settings.speedFOV = (!ConfigManager.settings.speedFOV);
      break;
    case 72: 
      break;
    case 73: 
      ConfigManager.settings.gommePosLeft = (!ConfigManager.settings.gommePosLeft);
      break;
    case 74: 
      break;
    case 75: 
      ConfigManager.settings.showBWTimer = Boolean.valueOf(!ConfigManager.settings.showBWTimer.booleanValue());
      break;
    case 76: 
      ConfigManager.settings.showBWTeams = Boolean.valueOf(!ConfigManager.settings.showBWTeams.booleanValue());
      break;
    case 77: 
      ConfigManager.settings.autoText = (!ConfigManager.settings.autoText);
      break;
    case 78: 
      ConfigManager.settings.chatFilter = Boolean.valueOf(!ConfigManager.settings.chatFilter.booleanValue());
      break;
    case 79: 
      ConfigManager.settings.oldSneak = (!ConfigManager.settings.oldSneak);
      break;
    case 80: 
      ConfigManager.settings.autoLeave = (!ConfigManager.settings.autoLeave);
      break;
    case 81: 
      ConfigManager.settings.oldBlockBuild = (!ConfigManager.settings.oldBlockBuild);
      break;
    case 82: 
      ConfigManager.settings.background = (!ConfigManager.settings.background);
      break;
    case 83: 
      ConfigManager.settings.showClock = (!ConfigManager.settings.showClock);
      break;
    case 84: 
      ConfigManager.settings.quickPlay = (!ConfigManager.settings.quickPlay);
      break;
    case 85: 
      ConfigManager.settings.stopWatch = (!ConfigManager.settings.stopWatch);
      break;
    case 86: 
      ConfigManager.settings.armorHudPositionOnTop = (!ConfigManager.settings.armorHudPositionOnTop);
      break;
    case 87: 
      ConfigManager.settings.leftHand = (!ConfigManager.settings.leftHand);
    }
    if (button.k != -3) {
      b();
    }
    ConfigManager.save();
  }
  
  public void drawPreview()
  {
    int ex = this.m - 10;
    if (ConfigManager.settings.layout != 0)
    {
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
      if (!f.isEmpty())
      {
        this.draw.addNoScaleLabel("F", f, ex);
        ex -= 11;
      }
      if (ConfigManager.settings.showCoords)
      {
        this.draw.addNoScaleLabel("Z", ModGui.getZ(), ex);
        ex -= 11;
        this.draw.addNoScaleLabel("Y", ModGui.getY(), ex);
        ex -= 11;
        this.draw.addNoScaleLabel("Z", ModGui.getZ(), ex);
        ex -= 11;
      }
      if (ConfigManager.settings.showFPS.booleanValue())
      {
        this.draw.addNoScaleLabel("FPS", ModGui.getFPS() + "", ex);
        ex -= 11;
      }
    }
    if (ex == this.m - 10)
    {
      this.draw.addNoScaleString(Color.cl("c") + Color.cl("o") + "Gui disabled!", ex);
      ex -= 11;
    }
    this.draw.addNoScaleString(Color.c(4) + "Preview:", ex);
  }
  
  public boolean toggle(boolean c)
  {
    if (c) {
      return false;
    }
    return true;
  }
  
  public int manageInt(int i)
  {
    if (i >= 15) {
      i = -1;
    }
    i++;
    return i;
  }
  
  public int manageInt2(int i)
  {
    if (i >= 2) {
      i = -1;
    }
    i++;
    return i;
  }
  
  private void addSliderSize(boolean refresh, String title)
  {
    if (refresh)
    {
      this.draw.drawString(title + ":", this.x + 1, this.y - 12);
      this.x += 100;
      if (this.x > this.l - 110)
      {
        this.x = 120;
        this.y += this.sy;
      }
      return;
    }
    SliderSize b = new SliderSize(-3, this.x, this.y, 77);
    this.n.add(b);
    this.x += 100;
    if (this.x > this.l - 110)
    {
      this.x = 120;
      this.y += this.sy;
    }
  }
  
  private void addSliderClicks(boolean refresh, String title)
  {
    if (refresh)
    {
      this.draw.drawString(title + ":", this.x + 1, this.y - 12);
      this.x += 100;
      if (this.x > this.l - 110)
      {
        this.x = 120;
        this.y += this.sy;
      }
      return;
    }
    SliderClicks b = new SliderClicks(-3, this.x, this.y, 80);
    this.n.add(b);
    this.x += 100;
    if (this.x > this.l - 110)
    {
      this.x = 120;
      this.y += this.sy;
    }
  }
  
  private void addSliderCoords(boolean refresh, String title)
  {
    if (refresh)
    {
      this.draw.drawString(title + ":", this.x + 1, this.y - 12);
      this.x += 100;
      if (this.x > this.l - 110)
      {
        this.x = 120;
        this.y += this.sy;
      }
      return;
    }
    SliderCoords b = new SliderCoords(this.x, this.y, 75);
    this.n.add(b);
    this.x += 100;
    if (this.x > this.l - 110)
    {
      this.x = 120;
      this.y += this.sy;
    }
  }
  
  private void addSliderColor(boolean refresh, String title, int color)
  {
    if (refresh)
    {
      this.draw.drawString(title + ":", this.x + 1, this.y - 12);
      this.x += 100;
      if (this.x > this.l - 110)
      {
        this.x = 120;
        this.y += this.sy;
      }
      return;
    }
    SliderColor b = new SliderColor(-3, this.x, this.y, 80, color);
    this.n.add(b);
    this.x += 100;
    if (this.x > this.l - 110)
    {
      this.x = 120;
      this.y += this.sy;
    }
  }
  
  public void addToggle(boolean refresh, Boolean t, int id, String title, String info)
  {
    addToggleCustom(refresh, t, id, title, "OFF", "ON", info);
  }
  
  public void addToggleSub(boolean refresh, Boolean t, Boolean sub, int id, String title, String info)
  {
    addToggleCustomSub(refresh, t, sub, id, title, "OFF", "ON", info);
  }
  
  private void addToggleA(boolean r, Boolean old, int i, String title, String info)
  {
    addToggleCustom(r, old, i, title, "1.8 Animation", "1.7 Animation", info);
  }
  
  public void addToggleCustom(boolean refresh, Boolean t, int id, String title, String disabled, String enabled, String info)
  {
    if (refresh)
    {
      if (title.length() > 25) {
        this.draw.drawString(title + ":", this.x + 1, this.y - 8, 0.55D);
      } else if (title.length() > 22) {
        this.draw.drawString(title + ":", this.x + 1, this.y - 8, 0.65D);
      } else if (title.length() > 20) {
        this.draw.drawString(title + ":", this.x + 1, this.y - 9, 0.6D);
      } else if (title.length() > 16) {
        this.draw.drawString(title + ":", this.x + 1, this.y - 10, 0.7D);
      } else if (title.length() > 15) {
        this.draw.drawString(title + ":", this.x + 1, this.y - 10, 0.8D);
      } else {
        this.draw.drawString(title + ":", this.x + 1, this.y - 12);
      }
      this.x += 100;
      if (this.x > this.l - 110)
      {
        this.x = 120;
        this.y += this.sy;
      }
      return;
    }
    String s = Color.cl("c") + disabled;
    if (t.booleanValue()) {
      s = Color.cl("a") + enabled;
    }
    avs b = new avs(id, this.x, this.y, 80, 20, s);
    b.info = info;
    this.n.add(b);
    this.x += 100;
    if (this.x > this.l - 110)
    {
      this.x = 120;
      this.y += this.sy;
    }
  }
  
  public void addToggleCustomNC(boolean refresh, Boolean t, int id, String title, String disabled, String enabled, String info)
  {
    if (refresh)
    {
      if (title.length() > 25) {
        this.draw.drawString(title + ":", this.x + 1, this.y - 8, 0.55D);
      } else if (title.length() > 22) {
        this.draw.drawString(title + ":", this.x + 1, this.y - 8, 0.65D);
      } else if (title.length() > 20) {
        this.draw.drawString(title + ":", this.x + 1, this.y - 9, 0.6D);
      } else if (title.length() > 16) {
        this.draw.drawString(title + ":", this.x + 1, this.y - 10, 0.7D);
      } else if (title.length() > 15) {
        this.draw.drawString(title + ":", this.x + 1, this.y - 10, 0.8D);
      } else {
        this.draw.drawString(title + ":", this.x + 1, this.y - 12);
      }
      this.x += 100;
      if (this.x > this.l - 110)
      {
        this.x = 120;
        this.y += this.sy;
      }
      return;
    }
    String s = disabled;
    if (t.booleanValue()) {
      s = enabled;
    }
    avs b = new avs(id, this.x, this.y, 80, 20, s);
    b.info = info;
    this.n.add(b);
    this.x += 100;
    if (this.x > this.l - 110)
    {
      this.x = 120;
      this.y += this.sy;
    }
  }
  
  public void addToggleCustomSub(boolean refresh, Boolean t, Boolean sub, int id, String title, String disabled, String enabled, String info)
  {
    if (refresh)
    {
      if (title.length() > 25) {
        this.draw.drawString(title + ":", this.x + 1, this.y - 8, 0.55D);
      } else if (title.length() > 22) {
        this.draw.drawString(title + ":", this.x + 1, this.y - 8, 0.65D);
      } else if (title.length() > 20) {
        this.draw.drawString(title + ":", this.x + 1, this.y - 9, 0.6D);
      } else if (title.length() > 16) {
        this.draw.drawString(title + ":", this.x + 1, this.y - 10, 0.7D);
      } else if (title.length() > 15) {
        this.draw.drawString(title + ":", this.x + 1, this.y - 10, 0.8D);
      } else {
        this.draw.drawString(title + ":", this.x + 1, this.y - 12);
      }
      this.x += 100;
      if (this.x > this.l - 110)
      {
        this.x = 120;
        this.y += this.sy;
      }
      return;
    }
    String s = Color.cl("c") + disabled;
    if (t.booleanValue()) {
      s = Color.cl("a") + enabled;
    }
    avs b = new avs(id, this.x, this.y, 80, 20, s);
    b.info = info;
    b.l = sub.booleanValue();
    this.n.add(b);
    this.x += 100;
    if (this.x > this.l - 110)
    {
      this.x = 120;
      this.y += this.sy;
    }
  }
  
  public void addToggleS(boolean refresh, int t, int id, String title)
  {
    if (refresh)
    {
      this.draw.drawString(title + ":", this.x + 1, this.y - 12);
      this.x += 100;
      if (this.x > this.l - 110)
      {
        this.x = 120;
        this.y += this.sy;
      }
      return;
    }
    String s = "Small";
    if (t == 1) {
      s = "Normal";
    } else if (t == 2) {
      s = "Large";
    }
    avs b = new avs(id, this.x, this.y, 80, 20, s);
    this.n.add(b);
    this.x += 100;
    if (this.x > this.l - 110)
    {
      this.x = 120;
      this.y += this.sy;
    }
  }
  
  public void addSwitch(boolean refresh, int s, int id, int id2, String Title1, int id3, String Title2, int id4, String Title3, int id5, String Title4, String title)
  {
    if (refresh)
    {
      this.draw.drawString(title + ":", this.x + 1, this.y - 12);
      this.x = 120;
      this.y += this.sy;
      return;
    }
    int max = 0;
    if (id2 != -1) {
      max++;
    }
    if (id3 != -1) {
      max++;
    }
    if (id4 != -1) {
      max++;
    }
    if (id5 != -1) {
      max++;
    }
    int yy = 0;
    for (int layout = 0; layout <= max; layout++)
    {
      int setId = id;
      String l = "Layout " + layout;
      if (layout == 1)
      {
        l = Title1;
        setId = id2;
      }
      if (layout == 2)
      {
        l = Title2;
        setId = id3;
      }
      if (layout == 3)
      {
        l = Title3;
        setId = id4;
      }
      if (layout == 4)
      {
        l = Title4;
        setId = id5;
      }
      int k = 50;
      int t = -20;
      if (layout == 0)
      {
        l = Color.cl("c") + "OFF";
        k = 30;
        t = 0;
      }
      avs b = new avs(setId, this.x + yy, this.y, this.draw.getStringWidth(l) + 13, 20, l);
      if (s == layout) {
        b.l = false;
      }
      this.n.add(b);
      yy += this.draw.getStringWidth(l) + 14;
    }
    this.x = 120;
    this.y += this.sy;
  }
  
  public void addSwitchNoOff(boolean refresh, int s, int id, int id2, String Title1, int id3, String Title2, int id4, String Title3, String title)
  {
    if (refresh)
    {
      this.draw.drawString(title + ":", this.x + 1, this.y - 12);
      this.x = 120;
      this.y += this.sy;
      return;
    }
    int max = 0;
    if (id2 != -1) {
      max++;
    }
    if (id3 != -1) {
      max++;
    }
    if (id4 != -1) {
      max++;
    }
    int yy = 0;
    for (int layout = 1; layout <= max; layout++)
    {
      String l = "Layout " + layout;
      if (layout == 1) {
        l = Title1;
      }
      if (layout == 2) {
        l = Title2;
      }
      if (layout == 3) {
        l = Title3;
      }
      int k = 50;
      int t = -20;
      avs b = new avs(id + layout, this.x + yy, this.y, this.draw.getStringWidth(l) + 13, 20, l);
      if (s == layout) {
        b.l = false;
      }
      this.n.add(b);
      yy += this.draw.getStringWidth(l) + 14;
    }
    this.x = 120;
    this.y += this.sy;
  }
  
  class SettingsButton
  {
    boolean enabled;
    String text;
    int id;
    
    public SettingsButton(int id, String text, boolean enabled)
    {
      this.id = id;
      this.text = text;
      this.enabled = enabled;
    }
  }
  
  public void addMToggle(boolean refresh, String title, SettingsButton[] button, String info)
  {
    if (refresh)
    {
      this.draw.drawString(title + ":", this.x + 1, this.y - 12);
      this.x = 120;
      this.y += this.sy;
      return;
    }
    int k = 0;
    for (int i = 0; i < button.length; i++)
    {
      SettingsButton b = button[i];
      String c = Color.cl("c");
      if (b.enabled) {
        c = Color.cl("a");
      }
      avs bt = new avs(b.id, this.x + k, this.y, this.draw.getStringWidth(b.text) + 8, 20, c + b.text);
      bt.info = info;
      this.n.add(bt);
      k += this.draw.getStringWidth(b.text) + 10;
    }
    this.x = 120;
    this.y += this.sy;
  }
  
  public void addTitle(String title)
  {
    this.y += 42;
    this.draw.drawString(title + ":", this.x + 1, this.y - 12);
  }
  
  public void addColorSwitcher(String color, int id, String title, int plus)
  {
    avs b = new avs(id, this.x + plus, this.y, this.draw.getStringWidth(title) + 10, 20, color + title);
    this.n.add(b);
  }
  
  protected void a(char typedChar, int keyCode)
  {
    if (keyCode == 1) {
      this.j.a(this.field_146441_g);
    }
  }
  
  public void a(int mouseX, int mouseY, float partialTicks)
  {
    if (LabyMod.getInstance().isInGame())
    {
      bfl.l();
      this.draw.drawTransparentBackground(105, 28, this.l - 10, this.m - 10);
    }
    else
    {
      c();
      this.draw.drawChatBackground(105, 28, this.l - 10, this.m - 10);
    }
    this.draw.overlayBackground(0, 0, 105, this.m);
    this.draw.overlayBackground(0, 0, this.l, 28);
    this.draw.overlayBackground(this.l - 10, 0, this.l, this.m);
    DrawUtils.a(103, 0, 104, this.m, Integer.MAX_VALUE);
    
    drawModInfo();
    
    initSettings(true);
    
    super.a(mouseX, mouseY, partialTicks);
    this.draw.overlayBackground(105, this.m - 10, this.l, this.m);
    for (avs button : this.n) {
      button.drawInfoBox();
    }
  }
  
  public void drawModInfo()
  {
    this.draw.drawCenteredString(this.currentTab, (this.l + 105) / 2, 10);
    this.draw.drawCenteredString("LabyMod Settings", 51, 10);
    this.draw.drawRightString(Color.cc(4) + Source.mod_Name + " v" + Source.mod_VersionName, this.l - 5, 5.0D);
    this.draw.drawRightString(Color.cc(5) + "by " + Source.mod_Author, this.l - 5, 15.0D);
  }
  
  public void addTab(String title)
  {
    avs button = new avs(-1, 2, this.tabY, 99, 20, title);
    button.l = (!title.equals(this.currentTab));
    this.n.add(button);
    this.tabY += this.ey;
  }
}
