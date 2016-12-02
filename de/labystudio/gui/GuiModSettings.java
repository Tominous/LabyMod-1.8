package de.labystudio.gui;

import ave;
import avh;
import avs;
import awx;
import axu;
import bfl;
import de.labystudio.capes.CapeManager;
import de.labystudio.gui.extras.GuiCustomButton;
import de.labystudio.gui.extras.SliderColor;
import de.labystudio.gui.extras.SliderCoords;
import de.labystudio.gui.extras.SliderSize;
import de.labystudio.labymod.ConfigManager;
import de.labystudio.labymod.LabyMod;
import de.labystudio.labymod.ModSettings;
import de.labystudio.utils.Color;
import de.labystudio.utils.ControllerInput;
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
    draw = getInstancedraw;
    field_146441_g = p_i1046_1_;
    game_settings_1 = p_i1046_2_;
    currentTab = "Ingame";
  }
  
  public boolean slider = false;
  avs theSlider;
  String currentTab = "";
  
  public void b()
  {
    n.clear();
    
    tabY = 28;
    
    sy = (m / 7);
    if (sy > 60) {
      sy = 60;
    }
    ey = (m / 14);
    if (ey > 21) {
      ey = 21;
    }
    n.add(new avs(1, 2, m - 21, 99, 20, "Done"));
    
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
    y = 46;
    x = 120;
    if (currentTab.equals("Ingame"))
    {
      addToggle(r, Boolean.valueOf(settingspotionEffects), 6, "Potion Effects", "Shows your current potion effects");
      addToggle(r, Boolean.valueOf(settingsshowOnlinePlayers), 5, "Online Players", "Shows how many players are online");
      
      addToggle(r, Boolean.valueOf(settingsshowCoords), 22, "Show coords", "Shows the coordinates");
      addToggle(r, Boolean.valueOf(settingsshowServerIP), 34, "Show Server IP", "Displays the IP adress of the server you're currently playing on.");
      
      addToggle(r, Boolean.valueOf(settingsshowFPS), 37, "Show FPS", "Shows the FPS");
      addToggle(r, Boolean.valueOf(settingsshowKills), 51, "Kills", "Shows the amount of killed players (In Hardcore Games and Survival Games)");
      addToggle(r, Boolean.valueOf(settingsshowPing), 33, "Show ping", "Shows your current ping");
      
      addToggle(r, Boolean.valueOf(settingsshowBossBar), 63, "Bossbar", "This option allows you to remove the boss health bar, but the text above it will still be displayed.");
      addToggle(r, Boolean.valueOf(settingsshowClock), 83, "Clock", "Displays your current real life time.");
      
      addToggle(r, Boolean.valueOf(settingsshowArrow), 93, "Arrow amount", "Displays the current amount of arrows in your inventory");
      
      addToggle(r, Boolean.valueOf(settingsshowBiome), 97, "Show biome", "Shows the world biome of your position");
      addToggle(r, Boolean.valueOf(settingsshowDate), 106, "Show Date", "Shows the date ingame");
      addToggle(r, Boolean.valueOf(settingsshowLiveTicker), 107, "EM LIVETICKER", "Shows the EM LIVE-STATS");
    }
    if (currentTab.equals("Formatting"))
    {
      addSwitchNoOff(r, settingslayout, 8, 9, "Colon", 10, "Brackets", 11, "Angle brackets", "Gui layout");
      
      addToggle(r, Boolean.valueOf(settingsbold), 29, "Bold", "");
      addToggle(r, Boolean.valueOf(settingsunderline), 30, "Underline", "");
      addToggle(r, Boolean.valueOf(settingsitalic), 31, "Italic", "");
      
      addSliderCoords(r, "Number precision");
      addToggle(r, Boolean.valueOf(settingstwelveHourClock), 104, "12-hour clock", "It displays the 12-hour clock (0-12 hours)");
      
      addSliderColor(r, "Prefix", 1);
      addSliderColor(r, "Brackets", 2);
      addSliderColor(r, "Text", 3);
      
      addSliderColor(r, "Title", 4);
      addSliderColor(r, "Info", 5);
      
      draw.drawString(Color.c(4) + "Preview:", 108.0D, 5.0D);
      draw.drawString(ModGui.createLabel("X", ModGui.getX()), 108.0D, 15.0D);
    }
    if (currentTab.equals("Animations"))
    {
      addToggleA(r, Boolean.valueOf(settingsoldDMG), 32, "Damage", "In the 1.8. a damaged player will flash up red for a short time. In the 1.7 the armor will flash up aswell.");
      addToggleA(r, Boolean.valueOf(settingsoldHearts), 40, "Heart", "In the 1.8 your hearts that you lost will light up in white shortly. This does not happen in 1.7");
      addToggleA(r, Boolean.valueOf(settingsoldBow), 41, "Bow", "In the 1.8 the bow is scaled different, in the 1.7 we scaled it as u are used to it");
      addToggleCustom(r, Boolean.valueOf(settingsoldTablist), 58, "Tablist", "1.8 Design", "1.7 Design", "The 1.8 Tablist is showing you more information such as playerheads and is sorted alphabetically");
      addToggleA(r, Boolean.valueOf(settingsoldBlockBuild), 81, "BlockBuild", "In 1.7 it was possible to build a block and destory it the same time. We integrated this feature into 1.8 - This feature is only available on GommeHD.net");
      addToggleA(r, Boolean.valueOf(settingsoldSword), 42, "Sword", "In the 1.7 setting you will see the typical Swordblockanimation in third Personview");
      addToggleA(r, Boolean.valueOf(settingsoldBlockhit), 43, "Blockhit", "the 1.8 does not support the blockhit animation. By choosing 1.7 you will see the wellknown animation again");
      addToggleA(r, Boolean.valueOf(settingsoldFishing), 46, "Fishing", "In the 1.8 the rod is scaled different and shown in another angle, in the 1.7 we scaled it as u are used to it");
      addToggleA(r, Boolean.valueOf(settingsoldSneak), 79, "Sneaking", "In the 1.7 sneaking is made smoother similar to the sneaking animation in 1.7 - This feature is only available on GommeHD.net");
      addToggleCustom(r, Boolean.valueOf(settingsoldInventory), 102, "Inventory", Color.cl("c") + "1.8 Shift", "1.7 Shift", "In 1.7, the inventory will stay in the middle of the screen, regardless of whether you've got an active effect or not. In 1.8, the inventory is shifted to the right, if you've got an active effect.");
    }
    if (currentTab.equals("Gui Settings"))
    {
      addSwitch(r, settingshud, 12, 13, "Durability only", 14, "Durability/Max", 15, "Item only", 44, "Percent", "Armor HUD");
      addMToggle(r, "Direction F Layout", new SettingsButton[] { new SettingsButton(19, "Number", settingsfLayoutNumber), new SettingsButton(20, "Cardinal Direction", settingsfLayoutDirection), new SettingsButton(21, "X and Z", settingsfLayoutXAndZ) }, "Shows the F Direction");
      
      addMToggle(r, "Direction HUD", new SettingsButton[] { new SettingsButton(2, "F Coordinate", settingsradarCoordinate), new SettingsButton(3, "Cardinal Direction", settingsradarDirection) }, "Shows the current direction you are facing at (F Coordinate) in the top of the screen");
      
      addSliderSize(r, "Mod Scale");
      
      addToggleS(r, settingspotionsize, 50, "Potion size");
      addToggleCustomNC(r, Boolean.valueOf(settingsguiPositionRight), 59, "Gui position", "Left", "Right", "Change the position of all important informations");
      addToggleCustomNC(r, Boolean.valueOf(settingsonlineFriendsPositionOnTop), 60, "Online Friends position", "Bottom", "Top", "Change the position of the ingame friendlist");
      addToggleCustomNC(r, Boolean.valueOf(settingsarmorHudPositionOnTop), 86, "Armor HUD position", "Hotbar", "Top", "Change the position of the armor hud");
      
      draw.drawString(Color.c(4) + "Preview:", 108.0D, 5.0D);
      draw.drawString(ModGui.createLabel("X", ModGui.getX()), 108.0D, 15.0D);
    }
    if (currentTab.equals("Extras"))
    {
      addToggle(r, Boolean.valueOf(settingsbox), 7, "HG Box", "All game information from Brawl Hardcore Games in an information box");
      addToggle(r, Boolean.valueOf(settingsclickTest), 90, "Clicktest", "Test your clickspeed");
      
      addToggle(r, Boolean.valueOf(settingslavaTime), 35, "Lavachallenge Timer", "It starts a Timer as you touch lava");
      addToggle(r, Boolean.valueOf(settingsshowMyName), 55, "Show my Name", "It will displays your own ingame name above your Head");
      addToggle(r, Boolean.valueOf(settingscapes), 62, "Capes", "Enable/Disable all Capes");
      
      addToggle(r, Boolean.valueOf(settingsfoodSaturation), 52, "Food saturation", "It displays how long you are saturated");
      addToggle(r, Boolean.valueOf(settingssmoothFPS), 48, "Smooth FPS", "The FPS display will be updated more often");
      addToggle(r, Boolean.valueOf(settingsafkTimer), 56, "AFK Timer", "Its starts a timer once you are AFK");
      
      addToggle(r, Boolean.valueOf(settingstabPing), 45, "Ping on Tab", "You can see the ping of every player on the tablist");
      addToggle(r, Boolean.valueOf(settingsshowOnlineFriends), 57, "Show Online Friends", "Shows the player head of all online friends in the top or bottom of the screen");
      addToggle(r, Boolean.valueOf(settingsspeedFOV), 71, "SpeedFOV", "If this option is set to OFF, the speed potion effect will no longer increase your FOV.");
      addToggleCustomNC(r, Boolean.valueOf(settingsleftHand), 87, "Main hand", "Right", "Left", "Swap the position of your main hand");
      addToggle(r, Boolean.valueOf(settingsleftBow), 92, "Swap bow", "Swap the position of your hand if you holding a bow");
      
      addToggle(r, Boolean.valueOf(settingsspotfiyTrack), 96, "Spotify Track", "Shows you your current playing spotify track");
      
      addToggle(r, Boolean.valueOf(settingscosmetics), 98, "Cosmetics", "Shows cosmetics like wings, hats..");
      
      addToggle(r, Boolean.valueOf(settingshiveAutoScramble), 101, "Hive autoscramble", "Automaticly run the command '/scramble' if you join a SG Server");
      
      addToggle(r, Boolean.valueOf(settingsapi), 105, "LabyMod API", "This option enable/disable all addons (ToggleSprint, DamageIndicator, ItemPhysics..)");
      addToggle(r, Boolean.valueOf(settingscontroller), 108, "Controller BETA", "Play minecraft with your controller (Restart Minecraft and install a driver for your controller - Tested on XBOX 360 CONTROLLER + Windows 10)");
      addToggle(r, Boolean.valueOf(settingsmineconParticle), 114, "Minecon Particle", "All original Minecon capes have some sparkling particles (Restart required)");
    }
    if (currentTab.equals("Server Support"))
    {
      addToggle(r, Boolean.valueOf(settingsgameBrawl), 39, "Brawl", "Shows the game information about Brawl");
      addToggle(r, Boolean.valueOf(settingsgameTimolia), 16, "Timolia", "Shows the game information about Timolia");
      
      addToggle(r, Boolean.valueOf(settingsgamePlayMinity), 17, "PlayMinity", "Shows the game information about PlayMinity");
      addToggle(r, Boolean.valueOf(settingsgameGommeHD), 18, "GommeHD", "Shows the game information about GommeHD");
      addToggle(r, Boolean.valueOf(settingsgameHiveMC), 74, "HiveMC", "Shows the game information about HiveMC");
    }
    if (currentTab.equals("GommeHD.net"))
    {
      addToggleCustomNC(r, Boolean.valueOf(settingsgommePosLeft), 73, "BedWars Timer", "Right", "Left", "Change the position of the GommeHD Gold cooldown");
      
      addToggle(r, Boolean.valueOf(settingsautoLeave), 80, "Auto Leave", "If your party doesn't find a team in bedwars you will automatically connect to the hub.");
      addToggle(r, Boolean.valueOf(settingsshowBWTimer), 75, "BedWars Timer", "Indicates the time until the next gold/iron will spawn at BedWars");
      addToggle(r, Boolean.valueOf(settingsshowNickname), 23, "Show Nickname", "Displays your nickname of the youtuber-nick plugin (on GommeHD.net).");
      addToggle(r, Boolean.valueOf(settingsskyblock), 109, "Show Skyblock Owner", "Displays the island owner in Skyblock (on GommeHD for example).");
      addToggle(r, Boolean.valueOf(settingsgommeBedTimer), 112, "Bed Percentage", "Displays the block break percentage of the bed in bedwars (GommeHD)");
    }
    if (currentTab.equals("Menu"))
    {
      addToggle(r, Boolean.valueOf(settingssmoothScroll), 64, "Smooth scrolling", "Reduces the scroll-speed for the Serverlist");
      addToggle(r, Boolean.valueOf(settingsbackground), 82, "Gui background", "This option allows you to enable and disable the background of the GUI");
      addToggle(r, Boolean.valueOf(settingsbetterRefresh), 49, "Better Refresh", "Adds an auto refresh button in the multiplayer gui");
      addToggle(r, Boolean.valueOf(settingsconfirmDisconnect), 61, "Confirm Disconnect", "You have to confirm with pressing the button again if you want to disconnect the server");
      addToggle(r, Boolean.valueOf(settingsinfoInMenu), 47, "Serverstatus in Menu", "Shows you all server information in the ESCAPE menu (Server icon, motd, slots, online players, ping)");
      addToggle(r, Boolean.valueOf(settingsdirectConnectInfo), 54, "Directconnect Serverstatus", "Shows you all important server information in the direct connent gui (online players, slots, ping)");
      addToggle(r, Boolean.valueOf(settingstags), 68, "Tags", "This option allows you to change the names of your friends and costumize them using colorcodes. The nicknames can be seen in the tablist, over their heads and in chat.");
      
      addToggle(r, Boolean.valueOf(settingsminiGames), 36, "Minigames", "Minigames in Minecraft");
      addToggle(r, Boolean.valueOf(settingsquickPlay), 84, "QuickPlay", "Shows in the main menu the latest server and your directconnect server");
      addToggle(r, Boolean.valueOf(settingsstopWatch), 85, "Stopwatch", "A simple stopwatch in Minecraft. It lets you measure the time, which will also be displayed in the GUI.");
      
      addToggle(r, Boolean.valueOf(settingsmojangStatus), 94, "Mojang Status", "Displays the current offline servers of Mojang in your server list");
    }
    if (currentTab.equals("TeamSpeak"))
    {
      addToggle(r, Boolean.valueOf(settingsteamSpeak), 65, "TeamSpeak", "If you run TeamSpeak you're able to accses it using Minecraft, you'll be able to see channels, join them, etc.");
      addToggle(r, Boolean.valueOf(settingsalertsTeamSpeak), 4, "TS Alerts", "Shows a message from TeamSpeak as an achievement or chat message");
      addToggleSub(r, Boolean.valueOf(settingsteamSpakIngameClients), Boolean.valueOf(settingsteamSpeak), 70, "TS Clients", "Showing you who is in the channel and who is currently talking.");
      addToggleSub(r, Boolean.valueOf(settingsteamSpakIngame), Boolean.valueOf(settingsteamSpeak), 69, "TS Channel", "If this option is on, the channel you're currently in will be displayed below your coordinates.");
      addToggleCustomNC(r, Boolean.valueOf(settingsteamSpeakAlertTypeChat), 88, "Alert type", "Achievement", "Chat", "With this function you can choose the type of the Teamspeak message. Either as Achievement or in the normal chat.");
      
      addSliderColor(r, "TS Silent", 6);
      addSliderColor(r, "TS Talking", 7);
      addSliderColor(r, "TS Away", 10);
      
      addSliderColor(r, "TS Micro muted", 8);
      addSliderColor(r, "TS Sound muted", 9);
    }
    if (currentTab.equals("Minecraft Chat"))
    {
      addToggle(r, Boolean.valueOf(settingschatFilter), 78, "Chat Filter", "You can filter your chat by certain keywords, or commands definded at \"filters\"");
      addToggle(r, Boolean.valueOf(settingsautoText), 77, "AutoText", "Your previously defined chat messages will be sended by pressing a single key");
      addToggle(r, Boolean.valueOf(settingsextraChat), 38, "Extra Chat", "You can see all private messages in an extra chat on the right side of the screen");
      addToggleCustomNC(r, Boolean.valueOf(settingschatAlertType), 89, "LabyMod Chat Notify Type", "Achievement", "Chat", "With this function you can choose the type of the LabyMod Chat message. Either as Achievement or in the normal chat.");
      addToggleCustomNC(r, Boolean.valueOf(settingschatPositionRight), 91, "Chat Position", "Right", "Left", "The Position of the Minecraft Chat");
      addToggleCustomNC(r, Boolean.valueOf(settingsmojangStatusChat), 95, "Mojang Status type", "Achievement", "Chat", "With this function you can choose the type of the Mojang Status message. Either as Achievement or in the normal chat.");
      addToggle(r, Boolean.valueOf(settingsnameHistory), 111, "Minecraft Name History", "Get the full name history of a player in an ingame GUI!");
    }
  }
  
  protected void a(avs button)
  {
    if (k == -1)
    {
      currentTab = j;
      if (k != -3) {
        b();
      }
      return;
    }
    switch (k)
    {
    case 0: 
      settingsalertsChat = (!settingsalertsChat);
      break;
    case 1: 
      j.a(field_146441_g);
      break;
    case 2: 
      settingsradarCoordinate = (!settingsradarCoordinate);
      break;
    case 3: 
      settingsradarDirection = (!settingsradarDirection);
      break;
    case 4: 
      settingsalertsTeamSpeak = (!settingsalertsTeamSpeak);
      break;
    case 5: 
      settingsshowOnlinePlayers = (!settingsshowOnlinePlayers);
      break;
    case 6: 
      settingspotionEffects = (!settingspotionEffects);
      break;
    case 7: 
      settingsbox = (!settingsbox);
      break;
    case 8: 
      settingslayout = 0;
      break;
    case 9: 
      settingslayout = 1;
      break;
    case 10: 
      settingslayout = 2;
      break;
    case 11: 
      settingslayout = 3;
      break;
    case 12: 
      settingshud = 0;
      break;
    case 13: 
      settingshud = 1;
      break;
    case 14: 
      settingshud = 2;
      break;
    case 15: 
      settingshud = 3;
      break;
    case 16: 
      settingsgameTimolia = (!settingsgameTimolia);
      break;
    case 17: 
      settingsgamePlayMinity = (!settingsgamePlayMinity);
      break;
    case 18: 
      settingsgameGommeHD = (!settingsgameGommeHD);
      break;
    case 19: 
      settingsfLayoutNumber = (!settingsfLayoutNumber);
      break;
    case 20: 
      settingsfLayoutDirection = (!settingsfLayoutDirection);
      break;
    case 21: 
      settingsfLayoutXAndZ = (!settingsfLayoutXAndZ);
      break;
    case 22: 
      settingsshowCoords = (!settingsshowCoords);
      break;
    case 23: 
      settingsshowNickname = (!settingsshowNickname);
      break;
    case 24: 
      int i = Color.colorToID(settingscolor1);
      i = manageInt(i);
      settingscolor1 = Color.IDToColor(i);
      b();
      break;
    case 25: 
      int i = Color.colorToID(settingscolor2);
      i = manageInt(i);
      settingscolor2 = Color.IDToColor(i);
      b();
      break;
    case 26: 
      int i = Color.colorToID(settingscolor3);
      i = manageInt(i);
      settingscolor3 = Color.IDToColor(i);
      b();
      break;
    case 27: 
      int i = Color.colorToID(settingscolor4);
      i = manageInt(i);
      settingscolor4 = Color.IDToColor(i);
      b();
      break;
    case 28: 
      int i = Color.colorToID(settingscolor5);
      i = manageInt(i);
      settingscolor5 = Color.IDToColor(i);
      b();
      break;
    case 29: 
      settingsbold = (!settingsbold);
      break;
    case 30: 
      settingsunderline = (!settingsunderline);
      break;
    case 31: 
      settingsitalic = (!settingsitalic);
      break;
    case 32: 
      settingsoldDMG = (!settingsoldDMG);
      break;
    case 33: 
      settingsshowPing = (!settingsshowPing);
      break;
    case 34: 
      settingsshowServerIP = (!settingsshowServerIP);
      break;
    case 35: 
      settingslavaTime = (!settingslavaTime);
      break;
    case 36: 
      settingsminiGames = (!settingsminiGames);
      break;
    case 37: 
      settingsshowFPS = (!settingsshowFPS);
      break;
    case 38: 
      settingsextraChat = (!settingsextraChat);
      break;
    case 39: 
      settingsgameBrawl = (!settingsgameBrawl);
      break;
    case 40: 
      settingsoldHearts = (!settingsoldHearts);
      break;
    case 41: 
      settingsoldBow = (!settingsoldBow);
      break;
    case 42: 
      settingsoldSword = (!settingsoldSword);
      break;
    case 43: 
      settingsoldBlockhit = (!settingsoldBlockhit);
      break;
    case 44: 
      settingshud = 4;
      break;
    case 45: 
      settingstabPing = (!settingstabPing);
      break;
    case 46: 
      settingsoldFishing = (!settingsoldFishing);
      break;
    case 47: 
      settingsinfoInMenu = (!settingsinfoInMenu);
      break;
    case 48: 
      settingssmoothFPS = (!settingssmoothFPS);
      break;
    case 49: 
      settingsbetterRefresh = (!settingsbetterRefresh);
      break;
    case 50: 
      int i = settingspotionsize;
      i = manageInt2(i);
      settingspotionsize = i;
      break;
    case 51: 
      settingsshowKills = (!settingsshowKills);
      break;
    case 52: 
      settingsfoodSaturation = (!settingsfoodSaturation);
      break;
    case 53: 
      settingsarmorRating = (!settingsarmorRating);
      break;
    case 54: 
      settingsdirectConnectInfo = (!settingsdirectConnectInfo);
      break;
    case 55: 
      settingsshowMyName = (!settingsshowMyName);
      break;
    case 56: 
      settingsafkTimer = (!settingsafkTimer);
      break;
    case 57: 
      settingsshowOnlineFriends = (!settingsshowOnlineFriends);
      break;
    case 58: 
      settingsoldTablist = (!settingsoldTablist);
      break;
    case 59: 
      settingsguiPositionRight = (!settingsguiPositionRight);
      break;
    case 60: 
      settingsonlineFriendsPositionOnTop = (!settingsonlineFriendsPositionOnTop);
      break;
    case 61: 
      settingsconfirmDisconnect = (!settingsconfirmDisconnect);
      break;
    case 62: 
      settingscapes = (!settingscapes);
      LabyMod.getInstance().getCapeManager().refresh();
      break;
    case 63: 
      settingsshowBossBar = (!settingsshowBossBar);
      break;
    case 64: 
      settingssmoothScroll = (!settingssmoothScroll);
      break;
    case 65: 
      settingsteamSpeak = (!settingsteamSpeak);
      if (!settingsteamSpeak)
      {
        settingsteamSpakIngame = false;
        settingsteamSpakIngameClients = false;
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
      settingsbrawl = (!settingsbrawl);
      break;
    case 68: 
      settingstags = (!settingstags);
      break;
    case 69: 
      settingsteamSpakIngame = (!settingsteamSpakIngame);
      break;
    case 70: 
      settingsteamSpakIngameClients = (!settingsteamSpakIngameClients);
      break;
    case 71: 
      settingsspeedFOV = (!settingsspeedFOV);
      break;
    case 72: 
      break;
    case 73: 
      settingsgommePosLeft = (!settingsgommePosLeft);
      break;
    case 74: 
      settingsgameHiveMC = (!settingsgameHiveMC);
      break;
    case 75: 
      settingsshowBWTimer = (!settingsshowBWTimer);
      break;
    case 76: 
      settingsshowBWTeams = (!settingsshowBWTeams);
      break;
    case 77: 
      settingsautoText = (!settingsautoText);
      break;
    case 78: 
      settingschatFilter = (!settingschatFilter);
      break;
    case 79: 
      settingsoldSneak = (!settingsoldSneak);
      break;
    case 80: 
      settingsautoLeave = (!settingsautoLeave);
      break;
    case 81: 
      settingsoldBlockBuild = (!settingsoldBlockBuild);
      break;
    case 82: 
      settingsbackground = (!settingsbackground);
      break;
    case 83: 
      settingsshowClock = (!settingsshowClock);
      break;
    case 84: 
      settingsquickPlay = (!settingsquickPlay);
      break;
    case 85: 
      settingsstopWatch = (!settingsstopWatch);
      break;
    case 86: 
      settingsarmorHudPositionOnTop = (!settingsarmorHudPositionOnTop);
      break;
    case 87: 
      settingsleftHand = (!settingsleftHand);
      break;
    case 88: 
      settingsteamSpeakAlertTypeChat = (!settingsteamSpeakAlertTypeChat);
      break;
    case 89: 
      settingschatAlertType = (!settingschatAlertType);
      break;
    case 90: 
      settingsclickTest = (!settingsclickTest);
      break;
    case 91: 
      settingschatPositionRight = (!settingschatPositionRight);
      break;
    case 92: 
      settingsleftBow = (!settingsleftBow);
      break;
    case 93: 
      settingsshowArrow = (!settingsshowArrow);
      break;
    case 94: 
      settingsmojangStatus = (!settingsmojangStatus);
      break;
    case 95: 
      settingsmojangStatusChat = (!settingsmojangStatusChat);
      break;
    case 96: 
      settingsspotfiyTrack = (!settingsspotfiyTrack);
      break;
    case 97: 
      settingsshowBiome = (!settingsshowBiome);
      break;
    case 98: 
      settingscosmetics = (!settingscosmetics);
      break;
    case 101: 
      settingshiveAutoScramble = (!settingshiveAutoScramble);
      break;
    case 102: 
      settingsoldInventory = (!settingsoldInventory);
      break;
    case 104: 
      settingstwelveHourClock = (!settingstwelveHourClock);
      break;
    case 105: 
      settingsapi = (!settingsapi);
      break;
    case 106: 
      settingsshowDate = (!settingsshowDate);
      break;
    case 107: 
      settingsshowLiveTicker = (!settingsshowLiveTicker);
      break;
    case 108: 
      settingscontroller = (!settingscontroller);
      if (settingscontroller) {
        ControllerInput.init();
      } else {
        ControllerInput.exit();
      }
      break;
    case 109: 
      settingsskyblock = (!settingsskyblock);
      break;
    case 110: 
      settingsgommeOldUserColor = (!settingsgommeOldUserColor);
      break;
    case 111: 
      settingsnameHistory = (!settingsnameHistory);
      break;
    case 112: 
      settingsgommeBedTimer = (!settingsgommeBedTimer);
      break;
    case 113: 
      settingsnotePad = (!settingsnotePad);
      break;
    case 114: 
      settingsmineconParticle = (!settingsmineconParticle);
    }
    if (k != -3) {
      b();
    }
    ConfigManager.save();
  }
  
  public void drawPreview()
  {
    int ex = m - 10;
    if (settingslayout != 0)
    {
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
      if (!f.isEmpty())
      {
        draw.addNoScaleLabel("F", f, ex);
        ex -= 11;
      }
      if (settingsshowCoords)
      {
        draw.addNoScaleLabel("Z", ModGui.getZ(), ex);
        ex -= 11;
        draw.addNoScaleLabel("Y", ModGui.getY(), ex);
        ex -= 11;
        draw.addNoScaleLabel("Z", ModGui.getZ(), ex);
        ex -= 11;
      }
      if (settingsshowFPS)
      {
        draw.addNoScaleLabel("FPS", ModGui.getFPS() + "", ex);
        ex -= 11;
      }
    }
    if (ex == m - 10)
    {
      draw.addNoScaleString(Color.cl("c") + Color.cl("o") + "Gui disabled!", ex);
      ex -= 11;
    }
    draw.addNoScaleString(Color.c(4) + "Preview:", ex);
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
      draw.drawString(title + ":", x + 1, y - 12);
      x += 100;
      if (x > l - 110)
      {
        x = 120;
        y += sy;
      }
      return;
    }
    SliderSize b = new SliderSize(-3, x, y, 77);
    n.add(b);
    x += 100;
    if (x > l - 110)
    {
      x = 120;
      y += sy;
    }
  }
  
  private void addSliderCoords(boolean refresh, String title)
  {
    if (refresh)
    {
      draw.drawString(title + ":", x + 1, y - 12);
      x += 100;
      if (x > l - 110)
      {
        x = 120;
        y += sy;
      }
      return;
    }
    SliderCoords b = new SliderCoords(x, y, 75);
    n.add(b);
    x += 100;
    if (x > l - 110)
    {
      x = 120;
      y += sy;
    }
  }
  
  private void addSliderColor(boolean refresh, String title, int color)
  {
    if (refresh)
    {
      draw.drawString(title + ":", x + 1, y - 12);
      x += 100;
      if (x > l - 110)
      {
        x = 120;
        y += sy;
      }
      return;
    }
    SliderColor b = new SliderColor(-3, x, y, 80, color);
    n.add(b);
    x += 100;
    if (x > l - 110)
    {
      x = 120;
      y += sy;
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
        draw.drawString(title + ":", x + 1, y - 8, 0.55D);
      } else if (title.length() > 22) {
        draw.drawString(title + ":", x + 1, y - 8, 0.65D);
      } else if (title.length() > 20) {
        draw.drawString(title + ":", x + 1, y - 9, 0.6D);
      } else if (title.length() > 16) {
        draw.drawString(title + ":", x + 1, y - 10, 0.7D);
      } else if (title.length() > 15) {
        draw.drawString(title + ":", x + 1, y - 10, 0.8D);
      } else {
        draw.drawString(title + ":", x + 1, y - 12);
      }
      x += 100;
      if (x > l - 110)
      {
        x = 120;
        y += sy;
      }
      return;
    }
    String s = Color.cl("c") + disabled;
    if (t.booleanValue()) {
      s = Color.cl("a") + enabled;
    }
    GuiCustomButton b = new GuiCustomButton(id, x, y, 80, 20, s);
    info = info;
    n.add(b);
    x += 100;
    if (x > l - 110)
    {
      x = 120;
      y += sy;
    }
  }
  
  public void addToggleCustomNC(boolean refresh, Boolean t, int id, String title, String disabled, String enabled, String info)
  {
    if (refresh)
    {
      if (title.length() > 25) {
        draw.drawString(title + ":", x + 1, y - 8, 0.55D);
      } else if (title.length() > 22) {
        draw.drawString(title + ":", x + 1, y - 8, 0.65D);
      } else if (title.length() > 20) {
        draw.drawString(title + ":", x + 1, y - 9, 0.6D);
      } else if (title.length() > 16) {
        draw.drawString(title + ":", x + 1, y - 10, 0.7D);
      } else if (title.length() > 15) {
        draw.drawString(title + ":", x + 1, y - 10, 0.8D);
      } else {
        draw.drawString(title + ":", x + 1, y - 12);
      }
      x += 100;
      if (x > l - 110)
      {
        x = 120;
        y += sy;
      }
      return;
    }
    String s = disabled;
    if (t.booleanValue()) {
      s = enabled;
    }
    GuiCustomButton b = new GuiCustomButton(id, x, y, 80, 20, s);
    info = info;
    n.add(b);
    x += 100;
    if (x > l - 110)
    {
      x = 120;
      y += sy;
    }
  }
  
  public void addToggleCustomSub(boolean refresh, Boolean t, Boolean sub, int id, String title, String disabled, String enabled, String info)
  {
    if (refresh)
    {
      if (title.length() > 25) {
        draw.drawString(title + ":", x + 1, y - 8, 0.55D);
      } else if (title.length() > 22) {
        draw.drawString(title + ":", x + 1, y - 8, 0.65D);
      } else if (title.length() > 20) {
        draw.drawString(title + ":", x + 1, y - 9, 0.6D);
      } else if (title.length() > 16) {
        draw.drawString(title + ":", x + 1, y - 10, 0.7D);
      } else if (title.length() > 15) {
        draw.drawString(title + ":", x + 1, y - 10, 0.8D);
      } else {
        draw.drawString(title + ":", x + 1, y - 12);
      }
      x += 100;
      if (x > l - 110)
      {
        x = 120;
        y += sy;
      }
      return;
    }
    String s = Color.cl("c") + disabled;
    if (t.booleanValue()) {
      s = Color.cl("a") + enabled;
    }
    GuiCustomButton b = new GuiCustomButton(id, x, y, 80, 20, s);
    info = info;
    l = sub.booleanValue();
    n.add(b);
    x += 100;
    if (x > l - 110)
    {
      x = 120;
      y += sy;
    }
  }
  
  public void addToggleS(boolean refresh, int t, int id, String title)
  {
    if (refresh)
    {
      draw.drawString(title + ":", x + 1, y - 12);
      x += 100;
      if (x > l - 110)
      {
        x = 120;
        y += sy;
      }
      return;
    }
    String s = "Small";
    if (t == 1) {
      s = "Normal";
    } else if (t == 2) {
      s = "Large";
    }
    avs b = new avs(id, x, y, 80, 20, s);
    n.add(b);
    x += 100;
    if (x > l - 110)
    {
      x = 120;
      y += sy;
    }
  }
  
  public void addSwitch(boolean refresh, int s, int id, int id2, String Title1, int id3, String Title2, int id4, String Title3, int id5, String Title4, String title)
  {
    if (refresh)
    {
      draw.drawString(title + ":", x + 1, y - 12);
      x = 120;
      y += sy;
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
      avs b = new avs(setId, x + yy, y, draw.getStringWidth(l) + 13, 20, l);
      if (s == layout) {
        l = false;
      }
      n.add(b);
      yy += draw.getStringWidth(l) + 14;
    }
    x = 120;
    y += sy;
  }
  
  public void addSwitchNoOff(boolean refresh, int s, int id, int id2, String Title1, int id3, String Title2, int id4, String Title3, String title)
  {
    if (refresh)
    {
      draw.drawString(title + ":", x + 1, y - 12);
      x = 120;
      y += sy;
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
      avs b = new avs(id + layout, x + yy, y, draw.getStringWidth(l) + 13, 20, l);
      if (s == layout) {
        l = false;
      }
      n.add(b);
      yy += draw.getStringWidth(l) + 14;
    }
    x = 120;
    y += sy;
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
      draw.drawString(title + ":", x + 1, y - 12);
      x = 120;
      y += sy;
      return;
    }
    int k = 0;
    for (int i = 0; i < button.length; i++)
    {
      SettingsButton b = button[i];
      String c = Color.cl("c");
      if (enabled) {
        c = Color.cl("a");
      }
      GuiCustomButton bt = new GuiCustomButton(id, x + k, y, draw.getStringWidth(text) + 8, 20, c + text);
      info = info;
      n.add(bt);
      k += draw.getStringWidth(text) + 10;
    }
    x = 120;
    y += sy;
  }
  
  public void addTitle(String title)
  {
    y += 42;
    draw.drawString(title + ":", x + 1, y - 12);
  }
  
  public void addColorSwitcher(String color, int id, String title, int plus)
  {
    avs b = new avs(id, x + plus, y, draw.getStringWidth(title) + 10, 20, color + title);
    n.add(b);
  }
  
  protected void a(char typedChar, int keyCode)
  {
    if (keyCode == 1) {
      j.a(field_146441_g);
    }
  }
  
  public void a(int mouseX, int mouseY, float partialTicks)
  {
    if (LabyMod.getInstance().isInGame())
    {
      bfl.l();
      draw.drawTransparentBackground(105, 28, l - 10, m - 10);
    }
    else
    {
      c();
      draw.drawChatBackground(105, 28, l - 10, m - 10);
    }
    draw.overlayBackground(0, 0, 105, m);
    draw.overlayBackground(0, 0, l, 28);
    draw.overlayBackground(l - 10, 0, l, m);
    DrawUtils.a(103, 0, 104, m, Integer.MAX_VALUE);
    
    drawModInfo();
    
    initSettings(true);
    
    super.a(mouseX, mouseY, partialTicks);
    draw.overlayBackground(105, m - 10, l, m);
    for (avs button : n) {
      if ((button instanceof GuiCustomButton)) {
        ((GuiCustomButton)button).drawInfoBox();
      }
    }
  }
  
  public void drawModInfo()
  {
    draw.drawCenteredString(currentTab, (l + 105) / 2, 10);
    draw.drawCenteredString("LabyMod Settings", 51, 10);
    draw.drawRightString(Color.cc(4) + "LabyMod" + " v" + "2.7.97", l - 10, 10.0D);
  }
  
  public void addTab(String title)
  {
    avs button = new avs(-1, 2, tabY, 99, 20, title);
    l = (!title.equals(currentTab));
    n.add(button);
    tabY += ey;
  }
}
