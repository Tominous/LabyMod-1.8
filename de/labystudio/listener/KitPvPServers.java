package de.labystudio.listener;

import de.labystudio.labymod.LabyMod;
import java.util.ArrayList;

public class KitPvPServers
{
  public static boolean kitPvP = false;
  
  public static void updateKitPvP()
  {
    kitPvP = (LabyMod.getInstance().ip.toLowerCase().contains("minekits.eu")) || (LabyMod.getInstance().ip.toLowerCase().contains("kitpvp.de"));
  }
  
  public static boolean isKitPvP()
  {
    return kitPvP;
  }
  
  public static void addMineHGKill(String clean)
  {
    if (clean.contains("10 Coins"))
    {
      Brawl.setRelog();
      Games.kills += 1;
      Brawl.last_killed = clean.replace(" » ", "").replace("You earned 10 Coins for killing ", "").replace(".", "");
      if (Brawl.last_killed.length() > 20) {
        Brawl.last_killed = Brawl.last_killed.substring(0, 20);
      }
    }
  }
  
  public static void serverMineHGChat(String clean, String raw)
  {
    String MHGPrefix = " » ";
    if (clean.startsWith(MHGPrefix + "Welcome to MineHG ")) {
      LabyMod.getInstance().resetMod();
    }
    if ((clean.startsWith(MHGPrefix + "The game has started! ")) && 
      (!Brawl.tournament))
    {
      Brawl.tournament = true;
      Brawl.invinc = true;
      Brawl.minifeast = "";
      Brawl.feast_x = "";
      Brawl.feast_z = "";
      Brawl.feastTime = 300;
      Brawl.startedPlayers = LabyMod.getInstance().onlinePlayers.size();
    }
    if (clean.startsWith(MHGPrefix + "You selected the "))
    {
      String k = clean.replace(MHGPrefix + "You selected the ", "").replace(" kit.", "");
      Brawl.kit = k;
    }
    String MHGPrefix2 = " ➥ ";
    if (clean.startsWith(MHGPrefix2 + "Invulnerability has wearn off! "))
    {
      Brawl.setRelog();
      Brawl.elapsedTime = 120;
    }
    if ((!LabyMod.getInstance().getPlayerName().isEmpty()) && 
      (clean.contains("You earned ")) && (clean.contains("for killing ")) && (!clean.contains("»"))) {
      addMineHGKill(clean);
    }
    if (clean.startsWith(MHGPrefix + "Compass pointing at "))
    {
      Brawl.setRelog();
      String s = clean.replace(MHGPrefix + "Compass pointing at ", "");
      Brawl.compassTarget = s;
    }
    if (LabyMod.getInstance().ip.contains("minehg")) {
      Brawl.Tournament_online = LabyMod.getInstance().onlinePlayers.size();
    }
  }
  
  public static void serverMineKitsChat(String clean, String raw)
  {
    String MKPrefix = "» ";
    if (clean.startsWith(MKPrefix + "You have chosen the "))
    {
      String k = clean.replace(MKPrefix + "You have chosen the ", "").replace(" kit.", "");
      Brawl.kit = k;
    }
    if ((clean.startsWith("You earned ")) && (clean.contains(" for killing ")))
    {
      Games.kills += 1;
      Brawl.last_killed = clean.replace("You earned 8,36c for killing ", "");
      if (Brawl.last_killed.length() > 20) {
        Brawl.last_killed = Brawl.last_killed.substring(0, 20);
      }
    }
    if ((clean.contains(" had ")) && (clean.contains(" hearths, ")) && (clean.contains(" soups in his hotbar"))) {
      Games.kills = 0;
    }
    if ((clean.startsWith(MKPrefix)) && (clean.contains("Your nickname is now "))) {
      LabyMod.getInstance().nickname = clean.replace(MKPrefix + "Your nickname is now ", "").replace("!", "");
    }
    if ((clean.startsWith(MKPrefix)) && (clean.contains("You no longer have a nickname!"))) {
      LabyMod.getInstance().nickname = "";
    }
  }
  
  static void serverInfectMCChat(String clean, String raw)
  {
    String IPrefix = "[InfectMC]";
    if ((clean.startsWith(IPrefix + " You got the ")) && (clean.contains(" kit!"))) {
      Brawl.kit = clean.replace(IPrefix + " You got the ", "").replace(" kit!", "");
    }
    if ((clean.startsWith(IPrefix + " You gained $")) && (clean.contains(" for killing "))) {
      Games.kills += 1;
    }
    if ((clean.startsWith(IPrefix)) && (clean.contains(" killed you with ")))
    {
      Games.kills = 0;
      Brawl.kit = "";
    }
    if ((clean.startsWith(IPrefix)) && (clean.contains("Du bist nun genickt als "))) {
      LabyMod.getInstance().nickname = clean.replace(IPrefix + "Du bist nun genickt als ", "");
    }
    if ((clean.startsWith(IPrefix)) && (clean.contains("Dein Nickname wurde zurückgesetzt."))) {
      LabyMod.getInstance().nickname = "";
    }
  }
}
