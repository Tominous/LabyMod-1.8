package de.labystudio.listener;

import ave;
import bew;
import cj;
import de.labystudio.chat.ChatHandler;
import de.labystudio.labymod.ConfigManager;
import de.labystudio.labymod.LabyMod;
import de.labystudio.labymod.ModSettings;
import de.labystudio.utils.ModGui;

public class JumpLeague
{
  public static boolean playminityServer_jl_lock = false;
  public static boolean playminityServer_jl = false;
  public static int playminityServer_jl_module = -1;
  public static int playminityServer_jl_falls = 0;
  public static int playminityServer_jl_kills = 0;
  public static boolean isPlayMinity = false;
  static cj lastPos;
  
  public static void updatePlayMinity()
  {
    isPlayMinity = (LabyMod.getInstance().ip.toLowerCase().contains("playminity.net")) || (LabyMod.getInstance().ip.toLowerCase().contains("playminity.com"));
  }
  
  public static boolean isPlayMinity()
  {
    return isPlayMinity;
  }
  
  public static void resetJumpLeague()
  {
    playminityServer_jl = false;
    playminityServer_jl_lock = false;
    playminityServer_jl_kills = 0;
    playminityServer_jl_falls = 0;
    playminityServer_jl_module = -1;
  }
  
  public static void isFallingDown()
  {
    if (!playminityServer_jl) {
      return;
    }
    if (playminityServer_jl_module == -1) {
      return;
    }
    if (!LabyMod.getInstance().isInGame()) {
      return;
    }
    if (lastPos == null) {
      lastPos = ave.A().h.c();
    }
    if (ave.A().h.c().c(lastPos.n(), ave.A().h.c().o(), lastPos.p()) > 4.0D)
    {
      if (!playminityServer_jl_lock)
      {
        playminityServer_jl_lock = true;
        playminityServer_jl_falls += 1;
      }
    }
    else {
      playminityServer_jl_lock = false;
    }
    lastPos = ave.A().h.c();
  }
  
  public static void serverPlayMinityChat(String clean, String raw)
  {
    if (!isPlayMinity()) {
      return;
    }
    String JLPrefix = "[JumpLeague] ";
    if (clean.startsWith(JLPrefix + ""))
    {
      playminityServer_jl = true;
      ChatHandler.updateGameMode("JumpLeague");
    }
    if ((clean.startsWith(JLPrefix + "The round has started!")) || (clean.startsWith(JLPrefix + "Die Runde beginnt!")))
    {
      playminityServer_jl_module = 1;
      playminityServer_jl_kills = 0;
      playminityServer_jl_falls = 0;
    }
    if ((clean.startsWith(" [PM]")) && 
      (playminityServer_jl_module != -1)) {
      playminityServer_jl_module += 1;
    }
    if ((clean.startsWith(JLPrefix + " Teleporting all players to the arena")) || (clean.startsWith(JLPrefix + "Teleportiere alle Spieler in die Arena..."))) {
      playminityServer_jl_module = -1;
    }
    if ((clean.startsWith(JLPrefix + " +5 Points | +3 Minitys")) || (clean.startsWith(JLPrefix + " +5 Punkte | +3 Minitys"))) {
      playminityServer_jl_kills += 1;
    }
    if (((clean.contains("> Willkommen auf mc.PlayMinity.com")) || (clean.contains("> Welcome to mc.PlayMinity.com")) || (clean.startsWith("[!] Verbinde zum Hub-Server")) || 
      (clean.contains("Du bist nun ein Zuschauer")) || (clean.startsWith("[!] Connecting to hub server"))) && (!clean.contains(":"))) {
      LabyMod.getInstance().resetMod();
    }
    if ((clean.startsWith(" [PM] Dein aktueller Nickname ist: ")) || (clean.startsWith(" [PM] Your current nickname is: "))) {
      LabyMod.getInstance().nickname = clean.replace(" [PM] Dein aktueller Nickname ist: ", "").replace(" [PM] Your current nickname is: ", "");
    }
  }
  
  public static void drawPlayMinityGui()
  {
    if (!ConfigManager.settings.gamePlayMinity) {
      return;
    }
    if (!playminityServer_jl) {
      return;
    }
    ModGui.mainListNext();
    if (playminityServer_jl_module != -1) {
      ModGui.addMainLabel("Module", playminityServer_jl_module + "", ModGui.mainList);
    }
    if (playminityServer_jl_falls != 0) {
      ModGui.addMainLabel("Falls", playminityServer_jl_falls + "", ModGui.mainList);
    }
    if (playminityServer_jl_kills != 0) {
      ModGui.addMainLabel("Kills", playminityServer_jl_kills + "", ModGui.mainList);
    }
  }
}
