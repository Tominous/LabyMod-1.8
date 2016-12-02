package de.labystudio.listener;

import afh;
import alz;
import auh;
import ave;
import bda;
import bdb;
import cj;
import de.labystudio.chat.ChatHandler;
import de.labystudio.gommehd.EnumBWMap;
import de.labystudio.gommehd.EnumBWTeam;
import de.labystudio.gommehd.GommeHDBed;
import de.labystudio.labymod.ConfigManager;
import de.labystudio.labymod.LabyMod;
import de.labystudio.labymod.ModSettings;
import de.labystudio.utils.Color;
import de.labystudio.utils.DrawUtils;
import de.labystudio.utils.ModGui;
import eu;
import java.util.ArrayList;
import zw;
import zx;

public class GommeHD
{
  public static boolean gommeHDServer_BW = false;
  public static String gommeHDServer_BW_Team = "";
  public static boolean gommeHDServer_BW_Bed = true;
  public static int elapsedTime;
  public static String skyBlockOwner = null;
  private static long stoppedBedLong = 0L;
  private static int stoppedBedPercent = 0;
  public static boolean isGommeHD = false;
  
  public static void updateGommeHD()
  {
    isGommeHD = LabyMod.getInstance().ip.toLowerCase().contains("gommehd.net");
  }
  
  public static boolean isGommeHD()
  {
    return isGommeHD;
  }
  
  public static void resetGommeHD()
  {
    gommeHDServer_BW = false;
    gommeHDServer_BW_Team = "";
    gommeHDServer_BW_Bed = true;
    skyBlockOwner = null;
    GommeHDBed.reset();
  }
  
  public static void loop()
  {
    if (gommeHDServer_BW) {
      elapsedTime += 1;
    }
    if ((LabyMod.getInstance().header != null) && (LabyMod.getInstance().header.d().contains("Lobby"))) {
      resetGommeHD();
    }
  }
  
  public static void serverGommeHDChat(String clean, String raw)
  {
    if (!LabyMod.getInstance().ip.toLowerCase().contains("gommehd.net")) {
      return;
    }
    String NickPrefix = "[NICK] ";
    if ((clean.startsWith(NickPrefix + "Du spielst als: ")) || (clean.startsWith(NickPrefix + "Aktueller Nickname: "))) {
      LabyMod.getInstance().nickname = clean.replace(NickPrefix + "Du spielst als: ", "").replace(NickPrefix + "Aktueller Nickname: ", "");
    }
    if (clean.startsWith(NickPrefix + "Dein Nickname wurde entfernt")) {
      LabyMod.getInstance().nickname = "";
    }
    chatBedWars(clean, raw);
    chatSurvivalGames(clean, raw);
    
    chatOther(clean, raw);
  }
  
  private static void chatOther(String clean, String raw)
  {
    String RagePrefix = "[RageMode] ";
    if (clean.startsWith(RagePrefix)) {
      ChatHandler.updateGameMode("RageMode");
    }
    String TTTPrefix = "[TTT] ";
    if (clean.startsWith(TTTPrefix)) {
      ChatHandler.updateGameMode("TTT");
    }
    String SurfPrefix = "[Surf] ";
    if (clean.startsWith(SurfPrefix)) {
      ChatHandler.updateGameMode("Surf");
    }
    String ConPrefix = "[Conquest] ";
    if (clean.startsWith(ConPrefix)) {
      ChatHandler.updateGameMode("Conquest");
    }
    String AuraPrefix = "[AuraPvP] ";
    if (clean.startsWith(AuraPrefix)) {
      ChatHandler.updateGameMode("AuraPvP");
    }
    String EnderPrefix = "[EnderGames] ";
    if (clean.startsWith(EnderPrefix)) {
      ChatHandler.updateGameMode("EnderGames");
    }
    String SkyWarsPrefix = "[SkyWars] ";
    if (clean.startsWith(SkyWarsPrefix)) {
      ChatHandler.updateGameMode("SkyWars");
    }
    String SurPrefix = "[Survival] ";
    if (clean.startsWith(SurPrefix)) {
      ChatHandler.updateGameMode("Survival");
    }
  }
  
  private static void chatSurvivalGames(String clean, String raw)
  {
    String SGPrefix = "[SurvivalGames] ";
    if (clean.startsWith(SGPrefix)) {
      ChatHandler.updateGameMode("SG");
    }
    if (clean.startsWith(SGPrefix + "Die Spiele beginnen!")) {
      Games.kills = 0;
    }
    if ((clean.startsWith(SGPrefix)) && (clean.contains(" wurde von " + LabyMod.getInstance().getPlayerName())) && (clean.contains("getötet"))) {
      Games.kills += 1;
    }
  }
  
  private static void chatBedWars(String clean, String raw)
  {
    String BWPrefix = "[BedWars] ";
    String str1;
    String u;
    if (clean.startsWith(BWPrefix + "Du bist nun in Team "))
    {
      ArrayList<String> i = new ArrayList();
      String[] arrayOfString = raw.split(" ");int i = arrayOfString.length;
      for (str1 = 0; str1 < i; str1++)
      {
        u = arrayOfString[str1];
        i.add(u);
      }
      gommeHDServer_BW_Team = (String)i.get(i.size() - 1);
    }
    if (clean.startsWith(BWPrefix + "Das Bett deines Teams")) {
      gommeHDServer_BW_Bed = false;
    }
    if (clean.startsWith(BWPrefix + "Diese Runde ging: ")) {
      LabyMod.getInstance().resetMod();
    }
    if (clean.startsWith(BWPrefix + "Server startet in ")) {
      LabyMod.getInstance().resetMod();
    }
    if (clean.startsWith(BWPrefix + "Das Spiel beginnt"))
    {
      gommeHDServer_BW_Bed = true;
      gommeHDServer_BW = true;
      elapsedTime = 0;
      ChatHandler.updateGameMode("BedWars");
      GommeHDBed.noBeds.clear();
    }
    if (clean.startsWith(BWPrefix + "Du bist nun Spectator")) {
      gommeHDServer_BW_Team = "Spectator";
    }
    boolean k;
    if (clean.startsWith(BWPrefix + "Map: "))
    {
      String map = clean.replace(BWPrefix + "Map: ", "");
      k = false;
      EnumBWMap[] arrayOfEnumBWMap = EnumBWMap.values();str1 = arrayOfEnumBWMap.length;
      for (u = 0; u < str1; u++)
      {
        EnumBWMap type = arrayOfEnumBWMap[u];
        if (map.toLowerCase().contains(type.name().toLowerCase()))
        {
          GommeHDBed.setPreset(type);
          k = true;
        }
      }
      if (!k) {
        GommeHDBed.reset();
      }
    }
    if (clean.startsWith(BWPrefix + "Das Bett von Team "))
    {
      String s = clean.replace(BWPrefix + "Das Bett von Team ", "");
      for (EnumBWTeam type : EnumBWTeam.values()) {
        if (s.toLowerCase().contains(type.name().toLowerCase()))
        {
          GommeHDBed.noBeds.add(type);
          GommeHDBed.updateHolograms();
        }
      }
    }
    if ((clean.startsWith(BWPrefix + "Es konnte kein passendes Team gefunden werden. Die Party ist NICHT im selben Team.")) && 
      (ConfigManager.settings.autoLeave)) {
      LabyMod.getInstance().sendCommand("hub");
    }
    if (clean.startsWith("Du betrittst nun die Insel von: ")) {
      skyBlockOwner = clean.replace("Du betrittst nun die Insel von: ", "");
    }
  }
  
  public static void drawGommeHDGui()
  {
    if (!ConfigManager.settings.gameGommeHD) {
      return;
    }
    if ((ConfigManager.settings.skyblock) && (skyBlockOwner != null)) {
      ModGui.addMainLabel("Island", skyBlockOwner, ModGui.mainList);
    }
    if (!gommeHDServer_BW) {
      return;
    }
    if (!gommeHDServer_BW_Team.isEmpty())
    {
      ModGui.addMainLabel("Elapsed Time", ModGui.translateTimer(elapsedTime), ModGui.mainList);
      if (gommeHDServer_BW_Team.contains("Spectator"))
      {
        ModGui.addMainLabel("Mode", Color.cl("7") + "Spectator", ModGui.mainList);
      }
      else
      {
        ModGui.addMainLabel("Team", gommeHDServer_BW_Team + "", ModGui.mainList);
        String status = "" + Color.c + "2Yes";
        if (!gommeHDServer_BW_Bed) {
          status = "" + Color.c + "4No";
        }
        ModGui.addMainLabel("Bed", status + "", ModGui.mainList);
      }
      if (ConfigManager.settings.showBWTimer) {
        drawTimer();
      }
    }
    if (ConfigManager.settings.gommeBedTimer)
    {
      boolean bed = false;
      bdb world = ave.A().f;
      if ((world != null) && (ave.A().s != null))
      {
        cj current = ave.A().s.a();
        if (current != null)
        {
          alz blockstate = world.p(current);
          if (blockstate != null)
          {
            zw item = blockstate.c().c(world, current);
            bed = (item != null) && (item == zw.b(355));
          }
        }
      }
      if ((ave.A().c.e != 0.0F) && (bed))
      {
        stoppedBedPercent = (int)(ave.A().c.e * 100.0F);
        stoppedBedLong = System.currentTimeMillis() + 3000L;
      }
      if (stoppedBedLong > System.currentTimeMillis())
      {
        if (ave.A().c.g != 0) {
          stoppedBedPercent = 100;
        }
        if ((stoppedBedPercent != 0) && (
          (ave.A().c.g == 0) || (stoppedBedPercent == 100))) {
          LabyMod.getInstance().draw.drawCenteredString(Color.cl("a") + stoppedBedPercent + "% ", 
            LabyMod.getInstance().draw.getWidth() / 2 + 3, LabyMod.getInstance().draw.getHeight() / 2 - 10, 1.0D);
        }
      }
      else
      {
        stoppedBedPercent = 0;
        if ((ave.A().c.g != 0) && (bed)) {
          LabyMod.getInstance().draw.drawCenteredString(Color.cl("c") + ave.A().c.g, 
            LabyMod.getInstance().draw.getWidth() / 2 + 1, LabyMod.getInstance().draw.getHeight() / 2 - 10, 1.0D);
        }
      }
    }
  }
  
  private static void drawTimer()
  {
    int gold = 30 - elapsedTime % 30;
    int iron = 10 - elapsedTime % 10;
    String c = "";
    if (gold <= 5) {
      c = Color.cl("c");
    }
    String c2 = "";
    if (iron <= 5) {
      c2 = Color.cl("c");
    }
    int pos = getPos();
    double k = LabyMod.getInstance().draw.getScale(ConfigManager.settings.size);
    if (ConfigManager.settings.gommePosLeft)
    {
      LabyMod.getInstance().draw.drawItem(new zx(zw.b(266)), 2.0D, pos, "" + c + gold + "");
      LabyMod.getInstance().draw.drawString(c + " sec", 17.0D, pos + 9);
      pos += 16;
      LabyMod.getInstance().draw.drawItem(new zx(zw.b(265)), 2.0D, pos, "" + c + iron + "");
      LabyMod.getInstance().draw.drawString(c + " sec", 17.0D, pos + 9);
    }
    else
    {
      int l = LabyMod.getInstance().draw.getWidth() - 39;
      LabyMod.getInstance().draw.drawItem(new zx(zw.b(266)), l / k, pos, "" + c + gold + "");
      LabyMod.getInstance().draw.drawString(c + " sec", (l + 15) / k, pos + 9);
      pos += 16;
      LabyMod.getInstance().draw.drawItem(new zx(zw.b(265)), l / k, pos, "" + c + iron + "");
      LabyMod.getInstance().draw.drawString(c + " sec", (l + 15) / k, pos + 9);
    }
    pos += 20;
    setPos(pos);
  }
  
  private static void setPos(int pos)
  {
    if (ModGui.isSwitch())
    {
      if (ConfigManager.settings.gommePosLeft) {
        ModGui.offList = pos;
      } else {
        ModGui.mainList = pos;
      }
    }
    else if (ConfigManager.settings.gommePosLeft) {
      ModGui.mainList = pos;
    } else {
      ModGui.offList = pos;
    }
  }
  
  private static int getPos()
  {
    if (ModGui.isSwitch())
    {
      if (ConfigManager.settings.gommePosLeft) {
        return ModGui.offList;
      }
      return ModGui.mainList;
    }
    if (ConfigManager.settings.gommePosLeft) {
      return ModGui.mainList;
    }
    return ModGui.offList;
  }
}
