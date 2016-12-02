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
    isGommeHD = getInstanceip.toLowerCase().contains("gommehd.net");
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
    if ((getInstanceheader != null) && (getInstanceheader.d().contains("Lobby"))) {
      resetGommeHD();
    }
  }
  
  public static void serverGommeHDChat(String clean, String raw)
  {
    if (!getInstanceip.toLowerCase().contains("gommehd.net")) {
      return;
    }
    String NickPrefix = "[NICK] ";
    if ((clean.startsWith(NickPrefix + "Du spielst als: ")) || (clean.startsWith(NickPrefix + "Aktueller Nickname: "))) {
      getInstancenickname = clean.replace(NickPrefix + "Du spielst als: ", "").replace(NickPrefix + "Aktueller Nickname: ", "");
    }
    if (clean.startsWith(NickPrefix + "Dein Nickname wurde entfernt")) {
      getInstancenickname = "";
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
      (settingsautoLeave)) {
      LabyMod.getInstance().sendCommand("hub");
    }
    if (clean.startsWith("Du betrittst nun die Insel von: ")) {
      skyBlockOwner = clean.replace("Du betrittst nun die Insel von: ", "");
    }
  }
  
  public static void drawGommeHDGui()
  {
    if (!settingsgameGommeHD) {
      return;
    }
    if ((settingsskyblock) && (skyBlockOwner != null)) {
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
      if (settingsshowBWTimer) {
        drawTimer();
      }
    }
    if (settingsgommeBedTimer)
    {
      boolean bed = false;
      bdb world = Af;
      if ((world != null) && (As != null))
      {
        cj current = As.a();
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
      if ((Ac.e != 0.0F) && (bed))
      {
        stoppedBedPercent = (int)(Ac.e * 100.0F);
        stoppedBedLong = System.currentTimeMillis() + 3000L;
      }
      if (stoppedBedLong > System.currentTimeMillis())
      {
        if (Ac.g != 0) {
          stoppedBedPercent = 100;
        }
        if ((stoppedBedPercent != 0) && (
          (Ac.g == 0) || (stoppedBedPercent == 100))) {
          getInstancedraw.drawCenteredString(Color.cl("a") + stoppedBedPercent + "% ", 
            getInstancedraw.getWidth() / 2 + 3, getInstancedraw.getHeight() / 2 - 10, 1.0D);
        }
      }
      else
      {
        stoppedBedPercent = 0;
        if ((Ac.g != 0) && (bed)) {
          getInstancedraw.drawCenteredString(Color.cl("c") + Ac.g, 
            getInstancedraw.getWidth() / 2 + 1, getInstancedraw.getHeight() / 2 - 10, 1.0D);
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
    double k = getInstancedraw.getScale(settingssize);
    if (settingsgommePosLeft)
    {
      getInstancedraw.drawItem(new zx(zw.b(266)), 2.0D, pos, "" + c + gold + "");
      getInstancedraw.drawString(c + " sec", 17.0D, pos + 9);
      pos += 16;
      getInstancedraw.drawItem(new zx(zw.b(265)), 2.0D, pos, "" + c + iron + "");
      getInstancedraw.drawString(c + " sec", 17.0D, pos + 9);
    }
    else
    {
      int l = getInstancedraw.getWidth() - 39;
      getInstancedraw.drawItem(new zx(zw.b(266)), l / k, pos, "" + c + gold + "");
      getInstancedraw.drawString(c + " sec", (l + 15) / k, pos + 9);
      pos += 16;
      getInstancedraw.drawItem(new zx(zw.b(265)), l / k, pos, "" + c + iron + "");
      getInstancedraw.drawString(c + " sec", (l + 15) / k, pos + 9);
    }
    pos += 20;
    setPos(pos);
  }
  
  private static void setPos(int pos)
  {
    if (ModGui.isSwitch())
    {
      if (settingsgommePosLeft) {
        ModGui.offList = pos;
      } else {
        ModGui.mainList = pos;
      }
    }
    else if (settingsgommePosLeft) {
      ModGui.mainList = pos;
    } else {
      ModGui.offList = pos;
    }
  }
  
  private static int getPos()
  {
    if (ModGui.isSwitch())
    {
      if (settingsgommePosLeft) {
        return ModGui.offList;
      }
      return ModGui.mainList;
    }
    if (settingsgommePosLeft) {
      return ModGui.mainList;
    }
    return ModGui.offList;
  }
}
