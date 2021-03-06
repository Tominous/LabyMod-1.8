package com.minimap.events;

import avc;
import ave;
import avn;
import axe;
import axu;
import aya;
import azh;
import bew;
import bfd;
import bfk;
import bfl;
import bfx;
import biu;
import com.minimap.ServerFilter;
import com.minimap.ServerFilter.FilterType;
import com.minimap.XaeroMinimap;
import com.minimap.animation.Animation;
import com.minimap.gui.GuiMisc;
import com.minimap.interfaces.InterfaceHandler;
import com.minimap.minimap.Minimap;
import com.minimap.minimap.Waypoint;
import com.minimap.minimap.WaypointSet;
import com.minimap.settings.ModSettings;
import de.labystudio.modapi.EventHandler;
import de.labystudio.modapi.Listener;
import de.labystudio.modapi.events.ChatReceivedEvent;
import de.labystudio.modapi.events.GameTickEvent;
import de.labystudio.modapi.events.JoinedServerEvent;
import de.labystudio.modapi.events.RenderOverlayEvent;
import fa;
import java.io.IOException;
import java.io.PrintStream;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Iterator;
import ns;
import org.lwjgl.input.Keyboard;
import org.lwjgl.opengl.GL11;
import pk;
import wn;

public class Events
  implements Listener
{
  public Object lastGuiOpen;
  int deathCounter;
  private static boolean askedToUpdate;
  private static ave mc = ;
  private axu lastScreen;
  
  public Events()
  {
    this.deathCounter = 0;
  }
  
  public void createDeathpoint(wn p)
  {
    boolean disabled = false;
    if (Minimap.waypoints == null) {
      return;
    }
    for (Waypoint w : Minimap.waypoints.list) {
      if (w.type == 1)
      {
        if ((!XaeroMinimap.getSettings().getDeathpoints()) || (!XaeroMinimap.getSettings().getOldDeathpoints()))
        {
          Minimap.waypoints.list.remove(w);
          break;
        }
        disabled = w.disabled;
        w.type = 0;
        w.name = "gui.xaero_deathpoint_old";
        break;
      }
    }
    if (XaeroMinimap.getSettings().getDeathpoints())
    {
      Waypoint deathpoint = new Waypoint(Minimap.myFloor(p.s), Minimap.myFloor(p.t), Minimap.myFloor(p.u), "gui.xaero_deathpoint", "D", 0, 1);
      deathpoint.disabled = disabled;
      Minimap.waypoints.list.add(deathpoint);
    }
    try
    {
      XaeroMinimap.settings.saveWaypoints();
    }
    catch (IOException e)
    {
      e.printStackTrace();
    }
  }
  
  public void renderLast(float partialTicks)
  {
    if ((XaeroMinimap.settings.getShowIngameWaypoints()) && (Minimap.waypoints != null))
    {
      pk entity = XaeroMinimap.mc.ac();
      double d3 = entity.P + (entity.s - entity.P) * partialTicks;
      double d4 = entity.Q + (entity.t - entity.Q) * partialTicks;
      double d5 = entity.R + (entity.u - entity.R) * partialTicks;
      bfx tessellator = bfx.a();
      bfd worldrenderer = tessellator.c();
      Iterator iterator = Minimap.waypoints.list.iterator();
      while (iterator.hasNext())
      {
        Waypoint w = (Waypoint)iterator.next();
        if ((!w.disabled) && ((w.type != 1) || (XaeroMinimap.getSettings().getDeathpoints()))) {
          renderIngameWaypoint(w, 12.0D, d3, d4, d5, entity, worldrenderer, tessellator);
        }
      }
      avc.a();
      bfl.j();
      bfl.a(true);
    }
  }
  
  protected void renderIngameWaypoint(Waypoint w, double radius, double d3, double d4, double d5, pk entity, bfd worldrenderer, bfx tessellator)
  {
    biu renderManager = ave.A().af();
    avn fontrenderer = renderManager.c();
    if (fontrenderer == null) {
      return;
    }
    float f = 1.6F;
    float f1 = 0.01666667F * f;
    bfl.E();
    float offX = w.x - (float)d3 + 0.5F;
    float offY = w.y - (float)d4 + 1.0F;
    float offZ = w.z - (float)d5 + 0.5F;
    double distance = Math.sqrt(offX * offX + offY * offY + offZ * offZ);
    float textSize = 1.0F;
    boolean background = false;
    String name = w.getName();
    boolean showDistance = false;
    if (distance > radius)
    {
      float zoomer = (float)(radius / distance);
      offX *= zoomer;
      offY *= zoomer;
      offY += entity.aS() * (1.0F - zoomer);
      offZ *= zoomer;
      if (distance > 20.0D)
      {
        textSize = 1.6F;
        if (XaeroMinimap.getSettings().distance == 1)
        {
          float Z = (float)(offZ != 0.0F ? offZ : 0.001D);
          float angle = (float)Math.toDegrees(Math.atan(-offX / Z));
          if (offZ < 0.0F) {
            if (offX < 0.0F) {
              angle += 180.0F;
            } else {
              angle -= 180.0F;
            }
          }
          float cameraAngle = ns.g(entity.y);
          showDistance = (angle - cameraAngle > -20.0F) && (angle - cameraAngle < 20.0F);
        }
        else if (XaeroMinimap.getSettings().distance == 2)
        {
          showDistance = true;
        }
        if (showDistance)
        {
          name = GuiMisc.simpleFormat.format(distance) + "m";
          background = true;
        }
        else
        {
          name = "";
        }
      }
    }
    bfl.b(offX, offY, offZ);
    GL11.glNormal3f(0.0F, 1.0F, 0.0F);
    bfl.b(-renderManager.e, 0.0F, 1.0F, 0.0F);
    bfl.b(renderManager.f, 1.0F, 0.0F, 0.0F);
    bfl.a(-f1, -f1, f1);
    bfl.f();
    bfl.a(false);
    bfl.i();
    bfl.l();
    bfl.a(770, 771, 1, 0);
    bfl.a(2.0F, 2.0F, 2.0F);
    w.drawIconInWorld(worldrenderer, tessellator, fontrenderer, name, textSize, background, showDistance);
    bfl.e();
    bfl.k();
    bfl.c(1.0F, 1.0F, 1.0F, 1.0F);
    bfl.F();
  }
  
  @EventHandler
  public void onRender(RenderOverlayEvent e)
  {
    if (Keyboard.isKeyDown(1)) {
      InterfaceHandler.cancel();
    }
    if ((ServerFilter.getCurrentFilterType() != ServerFilter.FilterType.DISALLOWED) && (XaeroMinimap.allowMiniMap))
    {
      ave.A().o.j();
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      InterfaceHandler.drawInterfaces(e.getPartialTicks());
      Animation.tick();
    }
  }
  
  @EventHandler
  public void onTick(GameTickEvent e)
  {
    if (this.lastScreen != mc.m)
    {
      this.lastScreen = mc.m;
      if (((this.lastScreen instanceof aya)) || ((this.lastScreen instanceof azh))) {
        XaeroMinimap.getSettings().resetServerSettings();
      }
      if ((this.lastScreen instanceof axe))
      {
        this.deathCounter += 1;
        if ((this.deathCounter & 0x1) == 0) {
          createDeathpoint(XaeroMinimap.mc.h);
        }
      }
    }
  }
  
  @EventHandler
  public void onJoinedServer(JoinedServerEvent e)
  {
    if (!XaeroMinimap.previousServer.equals(e.getIp()))
    {
      XaeroMinimap.previousServer = e.getIp();
      
      XaeroMinimap.allowMiniMap = true;
      XaeroMinimap.allowPlayerRadar = true;
      XaeroMinimap.allowRadar = true;
    }
    ServerFilter.FilterType filter = ServerFilter.getFilterTypeForServer(e.getIp());
    if (filter != ServerFilter.FilterType.ALLOWED) {
      mc.h.b(new fa("[Minimap] This server has a filter for the minimap: " + filter.name()));
    }
  }
  
  @EventHandler
  public void onChatReceived(ChatReceivedEvent e)
  {
    String text = e.getCleanMsg();
    if (text.contains("§c §r§5 §r§1 §r§f"))
    {
      String code = text.substring(text.indexOf("f") + 1);
      code = code.replaceAll("§", "").replaceAll("r", "").replaceAll(" ", "");
      XaeroMinimap.getSettings().resetServerSettings();
      XaeroMinimap.getSettings();
      ModSettings.serverSettings &= Integer.parseInt(code);
      System.out.println("Code: " + code);
    }
  }
}
