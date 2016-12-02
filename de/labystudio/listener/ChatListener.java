package de.labystudio.listener;

import ave;
import bew;
import bpf;
import bpz;
import de.labystudio.labymod.ConfigManager;
import de.labystudio.labymod.LabyMod;
import de.labystudio.labymod.ModSettings;
import de.labystudio.modapi.ModAPI;
import de.labystudio.modapi.events.ChatReceivedEvent;
import de.labystudio.utils.Allowed;
import de.labystudio.utils.Color;
import de.labystudio.utils.FilterLoader;
import de.labystudio.utils.FriendsLoader;
import eu;
import java.util.Map;
import jy;

public class ChatListener
{
  public static long init = 0L;
  private static jy soundLocation = new jy("note.bassattack");
  
  public static void serverChat(String raw, String clean)
  {
    GommeHD.serverGommeHDChat(clean, raw);
    JumpLeague.serverPlayMinityChat(clean, raw);
    Timolia.serverTimoliaChat(clean, raw);
    Revayd.serverRevaydChat(clean, raw);
    HiveMC.serverHiveChat(clean, raw);
  }
  
  public static boolean allowedToPrint(eu component)
  {
    if ((component == null) || (component.d() == null)) {
      return true;
    }
    serverChat(component.d(), component.c());
    if ((ModAPI.enabled()) && 
      (((ChatReceivedEvent)ModAPI.callEvent(new ChatReceivedEvent(component))).isCancelled())) {
      return false;
    }
    if ((settingsskyblock) && ((component.c().startsWith("Du betrittst nun die Insel von: ")) || (component.c().startsWith("Du verlässt nun die Insel von: ")))) {
      return false;
    }
    return true;
  }
  
  public static String replaceMessage(String raw, String clean)
  {
    if (Allowed.nick())
    {
      boolean clear = false;
      for (String friends : FriendsLoader.friends.keySet()) {
        if ((FriendsLoader.friends.get(friends) != null) && (!((String)FriendsLoader.friends.get(friends)).replace(" ", "").isEmpty())) {
          if (clean.contains(friends))
          {
            if ((raw.contains(":")) && (raw.split(":")[0].contains(friends))) {
              return raw.replaceFirst(friends, ((String)FriendsLoader.friends.get(friends)).replace("&", "§") + "§r");
            }
            if ((raw.contains(">")) && (raw.split(":")[0].contains(friends))) {
              return raw.replaceFirst(friends, ((String)FriendsLoader.friends.get(friends)).replace("&", "§") + "§r");
            }
            if ((raw.contains(":")) && (raw.split(":")[1].contains(friends))) {
              return raw;
            }
            if ((raw.contains(">")) && (raw.split(":")[1].contains(friends))) {
              return raw;
            }
            try
            {
              return raw.replaceFirst(friends, ((String)FriendsLoader.friends.get(friends)).replace("&", "§") + "§r");
            }
            catch (Exception error)
            {
              clear = true;
            }
          }
        }
      }
      if (clear)
      {
        FriendsLoader.friends.clear();
        FriendsLoader.saveFriends();
      }
    }
    return raw;
  }
  
  public static boolean isServerMSG(String msg)
  {
    if ((settingschatFilter) && (FilterLoader.enabled)) {
      for (String filter : FilterLoader.filters)
      {
        String m = filter.toLowerCase();
        if ((contains(msg, m)) && (!m.contains("%k%")) && (
          (!m.contains("%s%")) || (m.contains("%k%")))) {
          return true;
        }
      }
    }
    if (settingsextraChat)
    {
      if ((getInstanceip == null) || (getInstanceip.isEmpty())) {
        return false;
      }
      if (((getInstanceip.toLowerCase().contains("gommehd.net")) || (getInstanceip.toLowerCase().contains("minekits"))) && 
        ((msg.toLowerCase().contains(LabyMod.getInstance().getPlayerName().toLowerCase())) || (msg.contains("Du")) || (msg.contains("Dir"))) && 
        (msg.startsWith("[F")) && ((msg.contains(" -> ")) || (msg.contains(" <- ")))) {
        return true;
      }
      if (((getInstanceip.toLowerCase().contains("infect")) || (getInstanceip.toLowerCase().contains("kitpvp"))) && 
        (msg.contains("me")) && ((msg.contains(" -> ")) || (msg.contains(" <- ")))) {
        return true;
      }
      if ((getInstanceip.toLowerCase().contains("timolia")) && 
        (msg.startsWith(Color.c + "1")) && (msg.contains("MSG")) && (msg.contains("Du"))) {
        return true;
      }
      if (((getInstanceip.toLowerCase().contains("brawl")) || (getInstanceip.toLowerCase().contains("mcpvp")) || (getInstanceip.toLowerCase().contains("mc-hg"))) && (
        (msg.startsWith("(To ")) || (msg.startsWith("(From ")))) {
        return true;
      }
      if ((getInstanceip.toLowerCase().contains("hivemc")) && 
        (msg.toLowerCase().contains(LabyMod.getInstance().getPlayerName().toLowerCase())) && (msg.contains("PRIVATE"))) {
        return true;
      }
      if (((getInstanceip.toLowerCase().contains("mineplex")) || (getInstanceip.toLowerCase().contains("playminity"))) && 
        (msg.toLowerCase().contains(LabyMod.getInstance().getPlayerName().toLowerCase())) && ((msg.contains(" > ")) || (msg.contains(" < ")))) {
        return true;
      }
    }
    return false;
  }
  
  private static boolean contains(String msg, String m)
  {
    if (m.contains("%b%"))
    {
      String[] list = m.replace("%s%", "").replace("%k%", "").split("%b%");
      boolean output = false;
      boolean first = true;
      for (String value : list) {
        if (!value.isEmpty()) {
          if (first)
          {
            if (msg.toLowerCase().contains(value))
            {
              output = true;
            }
            else
            {
              output = false;
              break;
            }
            first = false;
          }
          else if (!msg.toLowerCase().contains(value))
          {
            output = true;
          }
          else
          {
            output = false;
            break;
          }
        }
      }
      if (output)
      {
        playSound(m);
        return true;
      }
    }
    else if (msg.toLowerCase().contains(m.replace("%s%", "").replace("%k%", "")))
    {
      playSound(m);
      return true;
    }
    return false;
  }
  
  private static void playSound(String m)
  {
    if ((m.contains("%s%")) && (init + 1000L < ave.J()) && (LabyMod.getInstance().isInGame())) {
      ave.A().W().a(new bpf(soundLocation, 5.0F, 1.0F, (float)Ah.s, (float)Ah.t, (float)Ah.u));
    }
  }
  
  public static boolean isMarked(String msg)
  {
    for (String filter : FilterLoader.filters)
    {
      String m = filter.toLowerCase();
      if ((m.startsWith("%k%")) && (contains(msg, m.replace("%k%", "").replace("%s%", "")))) {
        return true;
      }
    }
    return false;
  }
}
