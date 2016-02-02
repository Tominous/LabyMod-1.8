package net.minecraft.realms;

import adp.a;
import ave;
import avh;
import avm;
import bnm;
import com.google.common.util.concurrent.ListenableFuture;
import com.mojang.authlib.GameProfile;
import com.mojang.authlib.minecraft.MinecraftSessionService;
import com.mojang.util.UUIDTypeAdapter;
import java.io.File;
import java.net.Proxy;

public class Realms
{
  public static boolean isTouchScreen()
  {
    return ave.A().t.A;
  }
  
  public static Proxy getProxy()
  {
    return ave.A().O();
  }
  
  public static String sessionId()
  {
    avm ☃ = ave.A().L();
    if (☃ == null) {
      return null;
    }
    return ☃.a();
  }
  
  public static String userName()
  {
    avm ☃ = ave.A().L();
    if (☃ == null) {
      return null;
    }
    return ☃.c();
  }
  
  public static long currentTimeMillis()
  {
    return ave.J();
  }
  
  public static String getSessionId()
  {
    return ave.A().L().a();
  }
  
  public static String getUUID()
  {
    return ave.A().L().b();
  }
  
  public static String getName()
  {
    return ave.A().L().c();
  }
  
  public static String uuidToName(String ☃)
  {
    return ave.A().aa().fillProfileProperties(new GameProfile(UUIDTypeAdapter.fromString(☃), null), false).getName();
  }
  
  public static void setScreen(RealmsScreen ☃)
  {
    ave.A().a(☃.getProxy());
  }
  
  public static String getGameDirectoryPath()
  {
    return ave.A().v.getAbsolutePath();
  }
  
  public static int survivalId()
  {
    return adp.a.b.a();
  }
  
  public static int creativeId()
  {
    return adp.a.c.a();
  }
  
  public static int adventureId()
  {
    return adp.a.d.a();
  }
  
  public static int spectatorId()
  {
    return adp.a.e.a();
  }
  
  public static void setConnectedToRealms(boolean ☃)
  {
    ave.A().a(☃);
  }
  
  public static ListenableFuture<Object> downloadResourcePack(String ☃, String ☃)
  {
    ListenableFuture<Object> ☃ = ave.A().R().a(☃, ☃);
    
    return ☃;
  }
  
  public static void clearResourcePack()
  {
    ave.A().R().f();
  }
}
