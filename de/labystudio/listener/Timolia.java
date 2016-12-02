package de.labystudio.listener;

import de.labystudio.chat.ChatHandler;
import de.labystudio.labymod.ConfigManager;
import de.labystudio.labymod.LabyMod;
import de.labystudio.labymod.ModSettings;
import de.labystudio.utils.Color;
import de.labystudio.utils.ModGui;

public class Timolia
{
  public static String timoliaLobby = "";
  public static String timoliaRequestPlayer = "";
  public static String timoliaRequestKit = "";
  public static int timoliaStatsPlus = 0;
  public static int timoliaStatsMinus = 0;
  public static int winStreak = 0;
  public static boolean isTimolia = false;
  
  public static void updateTimolia()
  {
    isTimolia = LabyMod.getInstance().ip.toLowerCase().contains("timolia.de");
  }
  
  public static boolean isTimolia()
  {
    return isTimolia;
  }
  
  public static void resetTimolia()
  {
    timoliaLobby = "";
    timoliaRequestPlayer = "";
    timoliaRequestKit = "";
    timoliaStatsPlus = 0;
    timoliaStatsMinus = 0;
  }
  
  public static void listenToTablist()
  {
    if (LabyMod.getInstance().getHeader().contains("Timolia"))
    {
      String footer = LabyMod.getInstance().getFooter();
      if (!footer.contains(".")) {
        return;
      }
      int i = footer.indexOf(".");
      String f = footer.substring(0, i);
      f = f.replace(" ", "");
      if (f.startsWith("Duspielstauf"))
      {
        String lobby = f.replace("Duspielstauf", "");
        if (!timoliaLobby.equals(lobby)) {
          ChatHandler.updateGameMode(lobby);
        }
        timoliaLobby = lobby;
      }
      else
      {
        timoliaLobby = "";
      }
    }
    else
    {
      timoliaLobby = "";
    }
  }
  
  public static void serverTimoliaChat(String clean, String raw)
  {
    if (!isTimolia()) {
      return;
    }
    String timoliaPrefix = Color.cl("r") + Color.cl("1") + "│" + Color.cl("r") + Color.cl("9");
    if ((raw.startsWith(timoliaPrefix + " Nick")) && (clean.contains("Du wirst jetzt als "))) {
      LabyMod.getInstance().nickname = clean.split("Du wirst jetzt als ")[1].replace(" angezeigt.", "");
    }
    if ((raw.startsWith(timoliaPrefix + " Nick")) && (clean.contains("Du wirst jetzt wieder als "))) {
      LabyMod.getInstance().nickname = "";
    }
    if ((raw.startsWith(Color.cl("r") + Color.cl("7") + Color.cl("1"))) && (clean.contains(" hat dich mit dem Kit ")) && (clean.contains("herausgefordert."))) {
      try
      {
        String[] split = raw.split(Color.cl("7") + " " + Color.cl("r") + Color.cl("7"))[1].split(" hat dich mit dem Kit " + Color.cl("6"));
        String player = split[0];
        if (player != null) {
          timoliaRequestPlayer = player;
        }
        String kit = split[1].split(" ")[0];
        if (kit != null) {
          timoliaRequestKit = kit;
        }
      }
      catch (Exception error)
      {
        timoliaRequestKit = "";
        timoliaRequestPlayer = "";
      }
    }
    if ((raw.startsWith(Color.cl("r") + Color.cl("1"))) && (clean.contains(" Du hast ")) && (clean.contains("herausgefordert.")))
    {
      String[] split = clean.split(" Du hast ")[1].split(" mit dem Kit ");
      timoliaRequestPlayer = split[0];
      timoliaRequestKit = split[1].split(" herausgefordert.")[0];
    }
    if ((raw.startsWith(Color.cl("r") + Color.cl("1"))) && (clean.contains(" Der Kampf gegen ")) && (clean.contains(" beginnt."))) {
      timoliaRequestPlayer = clean.split(" Der Kampf gegen ")[1].split(" beginnt.")[0];
    }
    if ((raw.startsWith(Color.cl("r") + Color.cl("1"))) && (raw.contains(Color.cl("7") + "Kit: " + Color.cl("6"))) && 
      (raw.contains(" " + Color.cl("8") + "- " + Color.cl("7") + "Einstellungen:"))) {
      timoliaRequestKit = raw.split(Color.cl("7") + "Kit: " + Color.cl("6"))[1].split(" " + Color.cl("8") + "- " + Color.cl("7") + "Einstellungen:")[0];
    }
    if ((raw.startsWith(Color.cl("r") + Color.cl("1"))) && (clean.contains(" Du wurdest zur Warteschlange hinzugefügt.")))
    {
      timoliaRequestPlayer = "[Warteschlange]";
      timoliaRequestKit = "?";
    }
    if ((raw.startsWith(Color.cl("r") + Color.cl("1"))) && (clean.contains(" Du wurdest aus der Warteschlange entfernt")))
    {
      timoliaRequestPlayer = "?";
      timoliaRequestKit = "?";
    }
    if ((raw.startsWith(Color.cl("r") + Color.cl("1"))) && (clean.contains(" hat seine Herausforderung zurückgezogen.")))
    {
      timoliaRequestPlayer = "?";
      timoliaRequestKit = "?";
    }
    if ((raw.startsWith(Color.cl("r") + Color.cl("7") + Color.cl("1"))) && ((clean.contains("hast den Kampf gegen")) || (clean.contains("habt den Kampf gegen "))))
    {
      if (clean.contains("gewonnen"))
      {
        timoliaStatsPlus += 1;
        winStreak += 1;
      }
      if (clean.contains("verloren"))
      {
        timoliaStatsMinus += 1;
        winStreak = 0;
      }
      timoliaRequestPlayer = "";
      timoliaRequestKit = "";
    }
  }
  
  public static void drawTimoliaGui()
  {
    if (!ConfigManager.settings.gameTimolia) {
      return;
    }
    if (!isTimolia()) {
      return;
    }
    listenToTablist();
    
    ModGui.mainListNext();
    ModGui.addMainLabel("Lobby", timoliaLobby, ModGui.mainList);
    if (timoliaLobby.startsWith("games"))
    {
      timoliaStatsPlus = 0;
      timoliaStatsMinus = 0;
    }
    if (timoliaLobby.startsWith("pvp"))
    {
      ModGui.addMainLabel("Stats", Color.cl("a") + timoliaStatsPlus + Color.cl("7") + " | " + Color.cl("c") + timoliaStatsMinus, ModGui.mainList);
      if (!timoliaRequestPlayer.isEmpty())
      {
        String gegner = "Gegner";
        if (!isInMatch()) {
          gegner = "Herausforderung";
        }
        if (!timoliaRequestPlayer.equals("?")) {
          ModGui.addMainLabel(gegner, timoliaRequestPlayer, ModGui.mainList);
        }
        if (isInMatch()) {
          ModGui.addMainLabel("Kit", timoliaRequestKit, ModGui.mainList);
        }
      }
      if (winStreak != 0) {
        ModGui.addMainLabel("Winstreak", "" + winStreak, ModGui.mainList);
      }
    }
  }
  
  public static boolean isInMatch()
  {
    return !timoliaRequestKit.equalsIgnoreCase(timoliaRequestPlayer);
  }
}
