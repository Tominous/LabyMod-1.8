package de.labystudio.utils;

import de.labystudio.capes.CapeManager;
import de.labystudio.cosmetic.CosmeticManager;
import de.labystudio.labymod.ConfigManager;
import de.labystudio.labymod.LabyMod;
import de.labystudio.labymod.ModSettings;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintStream;
import java.io.Reader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import org.lwjgl.input.Keyboard;

public class SupportLog
{
  private static long cooldown = 0L;
  private static long keepTime = 0L;
  private static ArrayList<String> log = new ArrayList();
  
  public static void overwrite()
  {
    System.out.println("Overwrite output..");
    System.setErr(new PrintStreamLabyMod(System.err));
    System.setOut(new PrintStreamLabyMod(System.out));
  }
  
  public static void listenKey()
  {
    if ((Keyboard.isKeyDown(29)) && (Keyboard.isKeyDown(56)) && (Keyboard.isKeyDown(42)) && (Keyboard.isKeyDown(46)) && (cooldown < System.currentTimeMillis()))
    {
      keepTime += 1L;
      if (keepTime > 20L)
      {
        cooldown = System.currentTimeMillis() + 20000L;
        upload(log);
      }
    }
    else
    {
      keepTime = 0L;
    }
  }
  
  public static void upload(ArrayList<String> log)
  {
    System.out.println("-------------------------------");
    System.out.println("Date: " + new Date().toString());
    System.out.println("Minecraft Name: " + LabyMod.getInstance().getPlayerName());
    System.out.println("UUID: " + LabyMod.getInstance().getPlayerUUID());
    System.out.println("LabyMod Version: 2.7.98");
    System.out.println("Minecraft Version: 1.8.8");
    System.out.println("Cosmetics loaded: " + (!LabyMod.getInstance().getCosmeticManager().getOnlineCosmetics().isEmpty()));
    System.out.println("Capes loaded: " + LabyMod.getInstance().getCapeManager().countUserCapes());
    System.out.println("Has LabyMod Cape: " + LabyMod.getInstance().getCapeManager().isWhitelisted(LabyMod.getInstance().getPlayerUUID()));
    System.out.println("Capes enabled: " + ConfigManager.settings.capes);
    System.out.println("Server: " + LabyMod.getInstance().ip);
    System.out.println("-------------------------------");
    ArrayList<String> copy = new ArrayList(log);
    try
    {
      String all = "";
      for (String line : copy) {
        all = all + line + "\n";
      }
      String urlParameters = all;
      byte[] postData = urlParameters.getBytes(StandardCharsets.UTF_8);
      int postDataLength = postData.length;
      String request = "http://hastebin.com//documents";
      URL url = new URL(request);
      HttpURLConnection conn = (HttpURLConnection)url.openConnection();
      conn.setDoOutput(true);
      conn.setInstanceFollowRedirects(false);
      conn.setRequestMethod("POST");
      conn.setRequestProperty("Content-Type", "text/plain");
      conn.setRequestProperty("charset", "utf-8");
      conn.setRequestProperty("Content-Length", Integer.toString(postDataLength));
      conn.setUseCaches(false);
      DataOutputStream wr = new DataOutputStream(conn.getOutputStream());
      wr.write(postData);
      Reader in = new BufferedReader(new InputStreamReader(conn.getInputStream(), "UTF-8"));
      String out = "";
      int c;
      while ((c = in.read()) >= 0) {
        out = out + (char)c;
      }
      if ((out.contains("{\"key\":\"")) && (out.contains("\"}")))
      {
        String hastebin = "http://hastebin.com/" + out.replace("{\"key\":\"", "").replace("\"}", "");
        System.out.println(hastebin);
        LabyMod.getInstance().openWebpage(hastebin, true);
      }
      else
      {
        String hastebin = out;
        System.out.println(hastebin);
        LabyMod.getInstance().openWebpage(hastebin, true);
      }
    }
    catch (Exception error)
    {
      error.printStackTrace();
    }
  }
  
  public static class PrintStreamLabyMod
    extends PrintStream
  {
    public PrintStreamLabyMod(OutputStream out)
    {
      super();
    }
    
    public void print(String s)
    {
      SupportLog.log.add(s);
      if (SupportLog.log.size() > 1000) {
        SupportLog.log.remove(0);
      }
      super.print(s);
    }
    
    public void debug(String s)
    {
      SupportLog.log.add(s);
      if (SupportLog.log.size() > 1000) {
        SupportLog.log.remove(0);
      }
    }
  }
}
