package de.labystudio.listener;

import de.labystudio.chat.ChatHandler;
import de.labystudio.labymod.ConfigManager;
import de.labystudio.labymod.LabyMod;
import de.labystudio.labymod.ModSettings;
import de.labystudio.utils.ModGui;
import java.util.ArrayList;

public class Brawl
{
  public static String minifeast = "";
  public static int feastTime = 300;
  public static String feast_x = "";
  public static String feast_z = "";
  public static String compassTarget = "Nobody";
  public static boolean invinc = false;
  public static boolean tournament = false;
  public static int elapsedTime = 0;
  public static int invincTime = 120;
  public static int startedPlayers = 0;
  public static String last_killed = "";
  public static String last_killed_kit = "";
  public static int startingTime = 0;
  public static boolean relog = false;
  public static int Tournament_online = 0;
  public static int maxPlayers = 0;
  public static String kit = null;
  public static boolean isHG = false;
  
  public static void updateHG()
  {
    if ((!LabyMod.getInstance().ip.isEmpty()) && (
      (LabyMod.getInstance().ip.contains("mc-hg.com")) || (LabyMod.getInstance().ip.contains("nosoup")) || (LabyMod.getInstance().ip.contains("likekits.eu")) || (LabyMod.getInstance().ip.contains("minehg.net")) || (LabyMod.getInstance().ip.contains("rumblemc.com")) || (LabyMod.getInstance().ip.contains("rumblehg.com")))) {
      isHG = true;
    }
    isHG = false;
  }
  
  public static boolean isHG()
  {
    return isHG;
  }
  
  public static void resetHG()
  {
    kit = "";
    tournament = false;
    elapsedTime = 0;
    invinc = false;
    maxPlayers = 0;
    Tournament_online = 0;
    compassTarget = "Nobody";
    invincTime = 120;
    feast_x = "";
    feast_z = "";
    feastTime = 300;
    startedPlayers = 0;
    minifeast = "";
    last_killed = "Nobody";
    last_killed_kit = "";
    startingTime = 0;
    relog = false;
  }
  
  public static void setRelog()
  {
    if (!tournament)
    {
      tournament = true;
      invinc = false;
      relog = true;
      startedPlayers = Tournament_online;
      LabyMod.getInstance().sendCommand("ip");
    }
  }
  
  public static void addKill(String clean)
  {
    last_killed = clean.replace("entered the next life, courtesy of " + LabyMod.getInstance().getPlayerName(), "").replace("was killed by " + LabyMod.getInstance().getPlayerName(), "").replace("was poked too hard by " + LabyMod.getInstance().getPlayerName(), "").replace("put out of their misery.", "").replace("(" + kit + ")", "").replace(LabyMod.getInstance().getPlayerName(), "").replace("'s", "").split(" ")[0];
    if (last_killed.length() > 20) {
      last_killed = last_killed.substring(0, 20);
    }
    Games.kills += 1;
  }
  
  public static void loop()
  {
    if (tournament)
    {
      elapsedTime += 1;
      if (invincTime > 0)
      {
        invincTime -= 1;
      }
      else
      {
        invinc = false;
        invincTime = 120;
      }
      if ((!feast_x.equals("")) && 
        (feastTime > 0)) {
        feastTime -= 1;
      }
    }
  }
  
  public static void serverMCPvPChat(String clean, String raw)
  {
    if (clean.startsWith("Connected to Brawl Lobby")) {
      LabyMod.getInstance().resetMod();
    }
    if (clean.startsWith("Choose your kit:")) {
      tournament = false;
    }
    if (clean.startsWith("!! The tournament is about to begin! You are paralyzed until then."))
    {
      LabyMod.getInstance().sendCommand("ip");
      updateGameMode();
    }
    if ((clean.contains("Tournament starting in ")) && (!clean.contains(">")))
    {
      tournament = false;
      relog = false;
      String i = clean.replace("Tournament starting in ", "").replace(" seconds", "").replace(" second", "").replace(" minutes", "").replace(" minute", "").replace(".", "");
      try
      {
        int k = Integer.parseInt(i);
        if (clean.contains("minute")) {
          k *= 60;
        }
        startingTime = k + 1;
      }
      catch (Exception error)
      {
        startingTime = 0;
      }
    }
    if (clean.contains(" players remaining."))
    {
      String s = clean.replace(" players remaining.", "");
      try
      {
        Tournament_online = Integer.parseInt(s);
      }
      catch (Exception error)
      {
        Tournament_online = LabyMod.getInstance().onlinePlayers.size();
      }
      setRelog();
    }
    if ((clean.contains("Invincibility wears off in ")) && (!clean.contains(">"))) {
      setRelog();
    }
    if (clean.startsWith("!! You are no longer invincible!"))
    {
      setRelog();
      elapsedTime = 120;
    }
    if (clean.startsWith("> Selected "))
    {
      String k = clean.replace("> Selected ", "");
      kit = k;
    }
    if (clean.startsWith("You are now a "))
    {
      String k = clean.replace("You are now a ", "");
      kit = k;
    }
    if (clean.startsWith("Server Address: "))
    {
      String k = clean.replace("Server Address: ", "");
      LabyMod.getInstance().ip = k;
    }
    if (((clean.startsWith("The Tournament has begun!")) || (clean.startsWith("The Tournment has begun!"))) && 
      (!tournament))
    {
      tournament = true;
      invinc = true;
      minifeast = "";
      feast_x = "";
      feast_z = "";
      feastTime = 300;
      relog = false;
      startedPlayers = LabyMod.getInstance().onlinePlayers.size();
      updateGameMode();
      LabyMod.getInstance().sendCommand("ip");
    }
    if (clean.startsWith("* There are "))
    {
      String s = clean.replace("* There are ", "").replace(" players playing", "");
      Tournament_online = Integer.parseInt(s);
      startedPlayers = Tournament_online;
    }
    if ((clean.startsWith("There are ")) && (clean.contains(" players participating.")))
    {
      String s = clean.replace("There are ", "").replace(" players participating.", "");
      Tournament_online = Integer.parseInt(s);
      startedPlayers = Tournament_online;
    }
    if (clean.startsWith("* Compass pointing at "))
    {
      String s = clean.replace("* Compass pointing at ", "");
      compassTarget = s;
    }
    if (clean.startsWith("* No valid compass target!")) {
      compassTarget = "Spawn";
    }
    if (clean.startsWith("* Your compass is now pointing at the Feast")) {
      compassTarget = "Feast";
    }
    if ((!LabyMod.getInstance().getPlayerName().isEmpty()) && 
      (!LabyMod.getInstance().ip.contains("minehg.net")))
    {
      if (clean.contains("entered the next life, courtesy of " + LabyMod.getInstance().getPlayerName())) {
        addKill(clean);
      }
      if (clean.contains("was killed by " + LabyMod.getInstance().getPlayerName())) {
        addKill(clean);
      }
      if (clean.contains("was poked too hard by " + LabyMod.getInstance().getPlayerName())) {
        addKill(clean);
      }
      if ((clean.contains(LabyMod.getInstance().getPlayerName())) && (clean.endsWith("out of their misery.")) && (!clean.contains(">"))) {
        addKill(clean);
      }
    }
    if ((clean.startsWith("!! The Feast will begin at (")) && (clean.contains("5 minutes")))
    {
      String s = clean.replace("!! The Feast will begin at (", "").replace(") in 5 minutes! /feast", "");
      int u = 0;
      for (String split : s.split(", "))
      {
        if (u == 0) {
          feast_x = split;
        }
        if (u == 2) {
          feast_z = split;
        }
        u++;
      }
    }
    if ((clean.contains("A mini feast has appeared")) && (!clean.contains(">"))) {
      minifeast = clean.replace("!! A mini feast has appeared between ", "");
    }
    if (clean.startsWith("You lost!")) {
      LabyMod.getInstance().resetMod();
    }
  }
  
  private static void updateGameMode()
  {
    ChatHandler.updateGameMode("HardcoreGames");
  }
  
  public static void drawBrawl()
  {
    if (!ConfigManager.settings.gameBrawl.booleanValue()) {
      return;
    }
    if ((tournament) && (isHG()) && 
      (Games.kills != 0)) {
      ModGui.addMainLabel("Kills", Games.kills + "", ModGui.mainList);
    }
  }
}
