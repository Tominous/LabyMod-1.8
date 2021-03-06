package de.labystudio.gommehd;

import aln;
import ave;
import avn;
import avu;
import bcy;
import bfl;
import bpf;
import bpz;
import cj;
import cq;
import de.labystudio.listener.GommeHD;
import de.labystudio.utils.Color;
import eu;
import ir;
import ir.a;
import java.util.ArrayList;
import java.util.List;
import jy;

public class GommeHDSign
{
  public static String search = "";
  public static boolean allowed = false;
  public static boolean sound = false;
  public static int partySize = 0;
  public static String blacklist = "";
  public static boolean autoJoin = false;
  public static boolean nightMode = false;
  private static jy soundLocation = new jy("mob.creeper.death");
  
  public static boolean isGommeSign(ArrayList<String> text)
  {
    if (!GommeHD.isGommeHD()) {
      return false;
    }
    if (text.size() == 0) {
      return false;
    }
    if ((!((String)text.get(0)).contains("- ")) || (!((String)text.get(0)).contains(" -"))) {
      return false;
    }
    if (((String)text.get(0)).contains("---")) {
      return false;
    }
    return true;
  }
  
  public static ArrayList<String> getText(aln sign)
  {
    ArrayList<String> text = new ArrayList();
    avn var20 = ave.A().k;
    byte var14 = 0;
    for (int var15 = 0; var15 < sign.a.length; var15++) {
      if (sign.a[var15] != null)
      {
        eu var16 = sign.a[var15];
        List var17 = avu.a(var16, 90, var20, false, true);
        String var18 = (var17 != null) && (var17.size() > 0) ? ((eu)var17.get(0)).d() : "";
        text.add(var18);
      }
    }
    if (!isGommeSign(text)) {
      return new ArrayList();
    }
    return text;
  }
  
  public static boolean isAvailable(ArrayList<String> text)
  {
    ArrayList<String> t = new ArrayList();
    t.addAll(text);
    if ((t.size() > 2) && (!t.isEmpty())) {
      try
      {
        String a = (String)t.get(1);
        if ((a != null) && 
          (a.contains("aLobby"))) {
          return true;
        }
      }
      catch (Exception localException) {}
    }
    return false;
  }
  
  public static boolean isFull(ArrayList<String> text)
  {
    ArrayList<String> t = new ArrayList();
    t.addAll(text);
    if ((!t.isEmpty()) && 
      (t.size() > 2) && (t.get(1) != null) && 
      (((String)t.get(1)).contains("6Lobby"))) {
      return true;
    }
    return false;
  }
  
  public static boolean isEmpty(ArrayList<String> text)
  {
    ArrayList<String> t = new ArrayList();
    t.addAll(text);
    if ((!t.isEmpty()) && 
      (t.size() > 2) && (t.get(3) != null) && 
      (Color.removeColor((String)t.get(3)).startsWith("0"))) {
      return true;
    }
    return false;
  }
  
  public static String getMap(ArrayList<String> text)
  {
    ArrayList<String> t = new ArrayList();
    t.addAll(text);
    if ((t.size() > 3) && (!t.isEmpty()) && 
      (t.get(2) != null)) {
      return (String)t.get(2);
    }
    return "";
  }
  
  public static boolean size(ArrayList<String> text)
  {
    if (partySize == 0) {
      return true;
    }
    ArrayList<String> tt = new ArrayList();
    tt.addAll(text);
    try
    {
      if ((tt.size() > 3) && (!tt.isEmpty()) && 
        (tt.get(3) != null))
      {
        String d = Color.removeColor((String)tt.get(3));
        if (d.contains("/"))
        {
          String[] online = d.split("/");
          if ((Integer.parseInt(online[1]) - Integer.parseInt(online[0]) >= partySize) && 
            (tt.get(2) != null))
          {
            String t = Color.removeColor((String)tt.get(2));
            if ((t.contains(" ")) && (t.contains("x")))
            {
              String[] map = t.split(" ");
              String[] maxPlayers = map[1].split("x");
              if (Integer.parseInt(maxPlayers[1]) >= partySize) {
                return true;
              }
            }
            else
            {
              return true;
            }
          }
        }
      }
    }
    catch (Exception error)
    {
      error.printStackTrace();
    }
    return false;
  }
  
  public static boolean search(ArrayList<String> text)
  {
    try
    {
      String map = getMap(text).toLowerCase();
      String[] arrayOfString1;
      int i;
      String str1;
      if ((!blacklist.isEmpty()) && (search.isEmpty()))
      {
        arrayOfString1 = blacklist.toLowerCase().split(",");i = arrayOfString1.length;
        for (str1 = 0; str1 < i; str1++)
        {
          String l = arrayOfString1[str1];
          if (map.contains(l)) {
            return false;
          }
        }
        return true;
      }
      if (search.isEmpty()) {
        return true;
      }
      String l;
      if (blacklist.isEmpty())
      {
        arrayOfString1 = search.toLowerCase().split(",");i = arrayOfString1.length;
        for (str1 = 0; str1 < i; str1++)
        {
          l = arrayOfString1[str1];
          if (map.contains(l)) {
            return true;
          }
        }
      }
      else
      {
        boolean result = false;
        String[] arrayOfString2 = search.toLowerCase().split(",");str1 = arrayOfString2.length;
        for (l = 0; l < str1; l++)
        {
          String l = arrayOfString2[l];
          if (map.contains(l)) {
            result = true;
          }
        }
        arrayOfString2 = blacklist.toLowerCase().split(",");String str2 = arrayOfString2.length;
        for (l = 0; l < str2; l++)
        {
          String l = arrayOfString2[l];
          if (map.contains(l)) {
            result = false;
          }
        }
        return result;
      }
    }
    catch (Exception error)
    {
      error.printStackTrace();
    }
    return false;
  }
  
  public static void green()
  {
    bfl.c(0.6F, 23.6F, 0.6F, 0.6F);
  }
  
  public static void red()
  {
    bfl.c(10.0F, 0.6F, 0.6F, 0.6F);
  }
  
  public static void orange()
  {
    bfl.c(10.0F, 1.6F, 0.6F, 0.6F);
  }
  
  public static void blue()
  {
    bfl.c(0.6F, 0.6F, 0.6F, 0.7F);
  }
  
  static int noSpam = 0;
  
  public static void sendJoinPacket(cj b)
  {
    if (noSpam > 10) {
      noSpam = 0;
    }
    if (noSpam == 0)
    {
      cq c = cq.b;
      ir packet = new ir(ir.a.a, b, c);
      ave.A().u().a(packet);
    }
    noSpam += 1;
  }
  
  public static void render(aln sign)
  {
    if (sign.updateSign > 50) {
      sign.updateSign = 0;
    }
    if ((sign.updateSign == 0) && (allowed) && (GommeHD.isGommeHD()))
    {
      sign.setText(new ArrayList());
      sign.setAvailable(sign.getText());
      sign.setFull(sign.getText());
      sign.setSearch(sign.getText());
      sign.setSize(sign.getText());
      sign.setEmpty(sign.getText());
    }
    sign.updateSign += 1;
    if ((allowed) && 
      (GommeHD.isGommeHD()) && 
      (!sign.getText().isEmpty()))
    {
      ArrayList<String> text = sign.getText();
      if (!text.isEmpty()) {
        if (sign.getAvailable())
        {
          if (sign.getSearch())
          {
            if (sign.getSize())
            {
              if ((sign.isEmpty()) && (nightMode))
              {
                blue();
              }
              else
              {
                green();
                if (autoJoin) {
                  sendJoinPacket(sign.v());
                }
              }
              if ((sound) && 
                (ave.J() / 2L % 30L == 0L)) {
                ave.A().W().a(new bpf(soundLocation, 12.0F, 2.0F, sign
                  .v().n(), sign.v().o(), sign
                  .v().p()));
              }
            }
            else
            {
              orange();
            }
          }
          else {
            red();
          }
        }
        else if (sign.isFull())
        {
          if (sign.getSearch()) {
            orange();
          } else {
            red();
          }
        }
        else {
          red();
        }
      }
    }
  }
}
