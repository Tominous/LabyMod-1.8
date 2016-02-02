package de.labystudio.listener;

import de.labystudio.chat.ChatHandler;
import de.labystudio.labymod.ConfigManager;
import de.labystudio.labymod.LabyMod;
import de.labystudio.labymod.ModSettings;
import de.labystudio.utils.Color;
import de.labystudio.utils.DrawUtils;
import de.labystudio.utils.ModGui;
import java.util.ArrayList;

public class Timolia
{
  public static String timoliaLobby = "";
  public static String timoliaRequestPlayer = "";
  public static String timoliaRequestKit = "";
  public static ArrayList<String> timoliaSettings = new ArrayList();
  public static int timoliaStatsPlus = 0;
  public static int timoliaStatsMinus = 0;
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
    timoliaSettings.clear();
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
    if ((clean.contains(" hat dich mit dem Kit '")) && (clean.contains("' zu einem Kampf herausgefordert (1vs1)!"))) {
      try
      {
        String[] split = clean.replace("' zu einem Kampf herausgefordert (1vs1)!", "").split(" hat dich mit dem Kit '");
        String player = split[0];
        if (player != null) {
          timoliaRequestPlayer = player;
        }
        String kit = split[1];
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
    if ((clean.startsWith("Du hast ")) && (clean.contains(" zu einem Kampf herausgefordert (1vs1)!")))
    {
      String player = clean.replace(" zu einem Kampf herausgefordert (1vs1)!", "").replace("Du hast ", "");
      timoliaRequestPlayer = player;
      timoliaRequestKit = "?";
    }
    if (clean.startsWith("Du wurdest zur Warteschlange hinzugefügt!"))
    {
      timoliaRequestPlayer = "?";
      timoliaRequestKit = "?";
    }
    if ((clean.startsWith("Kit: ")) && (clean.contains(" | Einstellungen: ")) && 
      (!clean.contains(" | Einstellungen: -")))
    {
      ArrayList<String> list = new ArrayList();
      String settings = "";
      if ((!clean.contains(timoliaRequestKit)) || (!timoliaRequestKit.isEmpty()) || (timoliaRequestKit.equals("?"))) {
        try
        {
          String[] msg = clean.split("Einstellungen");
          timoliaRequestKit = msg[0].replace("Kit: ", "").replace(" | ", "");
          settings = msg[1].replace(": ", "");
        }
        catch (Exception error)
        {
          settings = "";
        }
      } else {
        settings = clean.replace("Kit: " + timoliaRequestKit + " | Einstellungen: ", "");
      }
      if (settings.contains(", "))
      {
        String[] split = settings.split(", ");
        for (String s : split) {
          list.add(s);
        }
      }
      else
      {
        list.add(settings);
      }
      timoliaSettings = list;
    }
    if (clean.startsWith(timoliaRequestPlayer + " hat seine Herausforderung zurückgezogen!"))
    {
      timoliaRequestPlayer = "";
      timoliaRequestKit = "";
      timoliaSettings.clear();
    }
    if ((clean.startsWith("Du hast den Kampf gegen ")) || (clean.startsWith("Dein Team hat den Kampf gegen das Team von ")))
    {
      if (clean.contains("gewonnen")) {
        timoliaStatsPlus += 1;
      }
      if (clean.contains("verloren")) {
        timoliaStatsMinus += 1;
      }
      timoliaRequestPlayer = "";
      timoliaRequestKit = "";
      timoliaSettings.clear();
    }
  }
  
  public static void drawTimoliaGui()
  {
    if (!ConfigManager.settings.gameTimolia.booleanValue()) {
      return;
    }
    if ((LabyMod.getInstance().ip.isEmpty()) || (!LabyMod.getInstance().ip.toLowerCase().contains("timolia.de"))) {
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
        LabyMod.getInstance().draw.drawString(Color.c(1) + "Kampf herausforderung:", 2.0D, ModGui.mainList);
        ModGui.mainListNext();
        if (!timoliaRequestPlayer.equals("?"))
        {
          LabyMod.getInstance().draw.addString(Color.c(1) + "Gegner" + Color.c(2) + ": " + Color.c(3) + timoliaRequestPlayer, ModGui.mainList);
          ModGui.mainListNext();
        }
        if (!timoliaRequestKit.equalsIgnoreCase(timoliaRequestPlayer))
        {
          LabyMod.getInstance().draw.addString(Color.c(1) + "Kit" + Color.c(2) + ": " + Color.c(3) + timoliaRequestKit, ModGui.mainList);
          ModGui.mainListNext();
        }
        if (!timoliaSettings.isEmpty())
        {
          LabyMod.getInstance().draw.addString(Color.c(1) + "Einstellungen:", ModGui.mainList);
          ModGui.mainListNext();
          for (String s : timoliaSettings)
          {
            LabyMod.getInstance().draw.addString(Color.c(2) + "- " + Color.c(3) + s, ModGui.mainList);
            ModGui.mainListNext();
          }
        }
      }
    }
  }
}
