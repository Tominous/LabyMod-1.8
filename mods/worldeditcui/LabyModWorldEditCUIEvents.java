package mods.worldeditcui;

import adm;
import ave;
import de.labystudio.modapi.EventHandler;
import de.labystudio.modapi.Listener;
import de.labystudio.modapi.events.ChatReceivedEvent;
import de.labystudio.modapi.events.GameTickEvent;
import de.labystudio.modapi.events.JoinedServerEvent;
import de.labystudio.modapi.events.RenderWorldEvent;
import de.labystudio.modapi.events.SendChatMessageEvent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import mods.worldeditcui.render.points.PointCube;
import mods.worldeditcui.render.region.CuboidRegion;
import mods.worldeditcui.util.RegionUtils;
import mods.worldeditcui.util.RegionUtils.VectorSet;
import mods.worldeditcui.util.Vector;
import mods.worldeditcui.util.Vector3;

public class LabyModWorldEditCUIEvents
  implements Listener
{
  private LabyModWorldEditCUI main;
  private adm prevWorld;
  
  public LabyModWorldEditCUIEvents(LabyModWorldEditCUI main)
  {
    this.main = main;
  }
  
  @EventHandler
  public void onRender(RenderWorldEvent e)
  {
    this.main.onPostRenderEntities(e.getPartialTicks());
  }
  
  @EventHandler
  public void onJoin(JoinedServerEvent e)
  {
    this.main.visible = true;
  }
  
  @EventHandler
  public void onTick(GameTickEvent e)
  {
    if (ave.A().f == null) {
      return;
    }
    if (ave.A().f == this.prevWorld) {
      return;
    }
    this.prevWorld = ave.A().f;
    ((CuboidRegion)this.main.getController().getSelection()).clear();
  }
  
  @EventHandler
  public void onChat(ChatReceivedEvent e)
  {
    String clean = e.getCleanMsg();
    if (clean.equals("Selection cleared."))
    {
      ((CuboidRegion)this.main.getController().getSelection()).clear(); return;
    }
    Object s;
    Object pos1;
    Vector pos2;
    if ((e.getMsg().startsWith("§r§d")) && 
      (clean.startsWith("Region expanded")) && (this.lastExpandSent != -1L))
    {
      CuboidRegion region = (CuboidRegion)this.main.getController().getSelection();
      if ((region.getFirstPoint() == null) || 
        (region.getSecondPoint() == null))
      {
        this.lastExpandSent = -1L;
        this.lastArgs = null;
        return;
      }
      if (this.lastArgs.toLowerCase().equals("vert"))
      {
        region.expandVert();
        return;
      }
      String[] args = this.lastArgs.split(" ");
      List<Vector> dirs = new ArrayList();
      int reverseChange = 0;
      int change = Integer.parseInt(args[0]);
      String[] split;
      switch (args.length)
      {
      case 2: 
        try
        {
          reverseChange = Integer.parseInt(args[1]);
          dirs.add(RegionUtils.getDirection("me"));
        }
        catch (NumberFormatException ex)
        {
          if (args[1].contains(","))
          {
            split = args[1].split(",");
            for (String s : split) {
              dirs.add(RegionUtils.getDirection(s.toLowerCase()));
            }
          }
          else
          {
            dirs.add(RegionUtils.getDirection(args[1].toLowerCase()));
          }
        }
      case 3: 
        reverseChange = Integer.parseInt(args[1]);
        if (args[2].contains(","))
        {
          String[] split = args[2].split(",");
          for (s : split) {
            dirs.add(RegionUtils.getDirection(((String)s).toLowerCase()));
          }
        }
        else
        {
          dirs.add(RegionUtils.getDirection(args[2].toLowerCase()));
        }
        break;
      default: 
        dirs.add(RegionUtils.getDirection("me"));
      }
      Vector3 pointCube1 = region.getFirstPoint().getPoint();
      Vector3 pointCube2 = region.getSecondPoint().getPoint();
      
      pos1 = new Vector(pointCube1.getX(), pointCube1.getY(), pointCube1.getZ());
      
      pos2 = new Vector(pointCube2.getX(), pointCube2.getY(), pointCube2.getZ());
      if (reverseChange == 0) {
        for (s = dirs.iterator(); ((Iterator)s).hasNext();)
        {
          Vector dir = (Vector)((Iterator)s).next();
          RegionUtils.VectorSet set = RegionUtils.expand((Vector)pos1, pos2, new Vector[] {dir
            .multiply(change) });
          pos1 = set.getVector1();
          pos2 = set.getVector2();
        }
      } else {
        for (s = dirs.iterator(); ((Iterator)s).hasNext();)
        {
          Vector dir = (Vector)((Iterator)s).next();
          RegionUtils.VectorSet set = RegionUtils.expand((Vector)pos1, pos2, new Vector[] {dir
            .multiply(change), dir.multiply(-reverseChange) });
          pos1 = set.getVector1();
          pos2 = set.getVector2();
        }
      }
      region.setFirstSecond(new PointCube(((Vector)pos1)
        .getX(), ((Vector)pos1).getY(), ((Vector)pos1).getZ()), new PointCube(pos2
        .getX(), pos2.getY(), pos2.getZ()));
      
      this.lastExpandSent = -1L;
      this.lastArgs = null; return;
    }
    int reverseChange;
    Vector3 pointCube1;
    Vector3 pointCube2;
    Object pos2;
    if ((e.getMsg().startsWith("§r§d")) && 
      (clean.startsWith("Region contracted")) && (this.lastContractSent != -1L))
    {
      String[] args = this.lastContractArgs.split(" ");
      List<Vector> dirs = new ArrayList();
      
      CuboidRegion region = (CuboidRegion)this.main.getController().getSelection();
      int change = Integer.parseInt(args[0]);
      reverseChange = 0;
      String[] split;
      Object s;
      switch (args.length)
      {
      case 2: 
        try
        {
          reverseChange = Integer.parseInt(args[1]);
          dirs.add(RegionUtils.getDirection("me"));
        }
        catch (NumberFormatException ex)
        {
          if (args[1].contains(","))
          {
            split = args[1].split(",");
            pos1 = split;String str1 = pos1.length;
            for (String str2 = 0; str2 < str1; str2++)
            {
              String s = pos1[str2];
              dirs.add(RegionUtils.getDirection(s.toLowerCase()));
            }
          }
          else
          {
            dirs.add(RegionUtils.getDirection(args[1].toLowerCase()));
          }
        }
      case 3: 
        reverseChange = Integer.parseInt(args[1]);
        if (args[2].contains(","))
        {
          String[] split = args[2].split(",");
          split = split;Vector localVector1 = split.length;
          for (Vector localVector2 = 0; localVector2 < localVector1; localVector2++)
          {
            s = split[localVector2];
            dirs.add(RegionUtils.getDirection(((String)s).toLowerCase()));
          }
        }
        else
        {
          dirs.add(RegionUtils.getDirection(args[2]
            .toLowerCase()));
        }
        break;
      default: 
        dirs.add(RegionUtils.getDirection("me"));
      }
      pointCube1 = region.getFirstPoint().getPoint();
      pointCube2 = region.getSecondPoint().getPoint();
      
      Vector pos1 = new Vector(pointCube1.getX(), pointCube1.getY(), pointCube1.getZ());
      
      pos2 = new Vector(pointCube2.getX(), pointCube2.getY(), pointCube2.getZ());
      if (reverseChange == 0) {
        for (s = dirs.iterator(); ((Iterator)s).hasNext();)
        {
          Vector dir = (Vector)((Iterator)s).next();
          RegionUtils.VectorSet set = RegionUtils.contract(pos1, (Vector)pos2, new Vector[] { dir.multiply(change) });
          pos1 = set.getVector1();
          pos2 = set.getVector2();
        }
      } else {
        for (s = dirs.iterator(); ((Iterator)s).hasNext();)
        {
          Vector dir = (Vector)((Iterator)s).next();
          RegionUtils.VectorSet set = RegionUtils.contract(dir.multiply(change), dir.multiply(-reverseChange), new Vector[0]);
          pos1 = set.getVector1();
          pos2 = set.getVector2();
        }
      }
      region.setFirstSecond(new PointCube(pos1
        .getX(), pos1.getY(), pos1.getZ()), new PointCube(((Vector)pos2)
        .getX(), ((Vector)pos2).getY(), ((Vector)pos2).getZ()));
      
      this.lastContractArgs = null;
      this.lastContractSent = -1L;
      return;
    }
    if ((e.getMsg().startsWith("§r§d")) && (clean.equals("Region shifted.")) && (this.lastShiftSent != -1L))
    {
      String[] args = this.lastShiftArgs.split(" ");
      
      CuboidRegion region = (CuboidRegion)this.main.getController().getSelection();
      
      List<Vector> dirs = new ArrayList();
      int change = Integer.parseInt(args[0]);
      if (args.length == 2)
      {
        if (args[1].contains(","))
        {
          reverseChange = args[1].split(",");pointCube1 = reverseChange.length;
          for (pointCube2 = 0; pointCube2 < pointCube1; pointCube2++)
          {
            String s = reverseChange[pointCube2];
            dirs.add(RegionUtils.getDirection(s.toLowerCase()));
          }
        }
        else
        {
          dirs.add(RegionUtils.getDirection(args[1].toLowerCase()));
        }
      }
      else {
        dirs.add(RegionUtils.getDirection("me"));
      }
      Vector3 pointCube1 = region.getFirstPoint().getPoint();
      Vector3 pointCube2 = region.getSecondPoint().getPoint();
      
      Vector pos1 = new Vector(pointCube1.getX(), pointCube1.getY(), pointCube1.getZ());
      
      Vector pos2 = new Vector(pointCube2.getX(), pointCube2.getY(), pointCube2.getZ());
      for (pos2 = dirs.iterator(); ((Iterator)pos2).hasNext();)
      {
        Vector dir = (Vector)((Iterator)pos2).next();
        RegionUtils.VectorSet set = RegionUtils.shift(pos1, pos2, new Vector[] {dir
          .multiply(change) });
        pos1 = set.getVector1();
        pos2 = set.getVector2();
      }
      region.setFirstSecond(new PointCube(pos1
        .getX(), pos1.getY(), pos1.getZ()), new PointCube(pos2
        .getX(), pos2.getY(), pos2.getZ()));
      
      this.lastShiftArgs = null;
      this.lastShiftSent = -1L;
      return;
    }
    if ((!e.getMsg().startsWith("§r§d")) || (
      (!clean.startsWith("First")) && (!clean.startsWith("Second")))) {
      return;
    }
    int point = clean.startsWith("First") ? 0 : 1;
    String[] coords = clean.split("\\)")[0].split("\\(")[1].split(", ");
    
    ((CuboidRegion)this.main.getController().getSelection()).setCuboidPoint(point, 
      Double.parseDouble(coords[0]), 
      Double.parseDouble(coords[1]), Double.parseDouble(coords[2]));
  }
  
  @EventHandler
  public void onCommandSent(SendChatMessageEvent e)
  {
    if (e.getMessage().toLowerCase().startsWith("//shift "))
    {
      RegionUtils.setLastYawAndPitch();
      this.lastShiftSent = System.currentTimeMillis();
      this.lastShiftArgs = e.getMessage().toLowerCase().replace("//shift ", "");
      return;
    }
    if (e.getMessage().toLowerCase().startsWith("//contract "))
    {
      RegionUtils.setLastYawAndPitch();
      this.lastContractSent = System.currentTimeMillis();
      this.lastContractArgs = e.getMessage().toLowerCase().replace("//contract ", "");
      return;
    }
    if (!e.getMessage().toLowerCase().startsWith("//expand ")) {
      return;
    }
    if ((e.getMessage().toLowerCase().endsWith(" vert")) || 
      (e.getMessage().toLowerCase().endsWith(" vertical")))
    {
      this.lastExpandSent = System.currentTimeMillis();
      this.lastArgs = "vert";
      return;
    }
    RegionUtils.setLastYawAndPitch();
    this.lastArgs = e.getMessage().toLowerCase().replace("//expand ", "");
    this.lastExpandSent = System.currentTimeMillis();
  }
  
  private String lastArgs = null;
  private long lastExpandSent = -1L;
  private String lastShiftArgs = null;
  private long lastShiftSent = -1L;
  private String lastContractArgs = null;
  private long lastContractSent = -1L;
}
