package com.minimap.interfaces;

import ady;
import amy;
import aug;
import avc;
import ave;
import avn;
import avo;
import avp;
import avr;
import avs;
import bdb;
import bfl;
import bfw;
import bmj;
import bqs;
import cj;
import com.minimap.XaeroMinimap;
import com.minimap.events.Events;
import com.minimap.gui.GuiEditMode;
import com.minimap.gui.GuiMinimap;
import com.minimap.minimap.DynamicTexture;
import com.minimap.minimap.Minimap;
import com.minimap.minimap.Waypoint;
import com.minimap.minimap.WaypointSet;
import com.minimap.settings.ModOptions;
import com.minimap.settings.ModSettings;
import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import jy;
import org.lwjgl.input.Keyboard;
import org.lwjgl.input.Mouse;
import org.lwjgl.opengl.GL11;
import pk;

public class InterfaceHandler
{
  public static void loadPresets()
  {
    new Preset("gui.xaero_preset_topleft", new int[][] { { 0, 0 }, { 0, 10000 }, { 0, 0 }, { 0, 36 }, { 0, 0 } }, new boolean[][] { { true, false }, { true, false }, { false, true }, { true, false }, { false, false } });
    new Preset("gui.xaero_preset_topright", new int[][] { { 0, 0 }, { 0, 135 }, { 120, 0 }, { 0, 50 }, { 0, 0 } }, new boolean[][] { { false, true }, { false, false }, { true, false }, { true, false }, { false, true } });
    new Preset("gui.xaero_preset_bottom_left", new int[][] { { 0, 0 }, { 0, 135 }, { 120, 0 }, { 0, 50 }, { 0, 10000 } }, new boolean[][] { { false, true }, { false, false }, { true, false }, { true, false }, { false, false } });
    new Preset("gui.xaero_preset_bottom_right", new int[][] { { 0, 0 }, { 0, 135 }, { 120, 0 }, { 0, 50 }, { 0, 10000 } }, new boolean[][] { { false, true }, { false, false }, { true, false }, { true, false }, { false, true } });
  }
  
  public static void load()
  {
    new Interface("", 0, 0, ModOptions.DEFAULT) {};
    new Interface("", 0, 0, ModOptions.DEFAULT) {};
    new Interface("", 0, 0, ModOptions.DEFAULT) {};
    new Interface("", 0, 0, ModOptions.DEFAULT) {};
    minimap = new Minimap(new Interface("gui.xaero_minimap", 128, 128, ModOptions.MINIMAP)
    {
      long lastFBOTry = 0L;
      int lastMinimapSize = 0;
      private ArrayList<String> underText = new ArrayList();
      
      public int getW(int scale)
      {
        return getSize() / scale;
      }
      
      public int getH(int scale)
      {
        return getW(scale);
      }
      
      public int getWC(int scale)
      {
        return getW(scale);
      }
      
      public int getHC(int scale)
      {
        return getH(scale);
      }
      
      public int getW0(int scale)
      {
        return getW(scale);
      }
      
      public int getH0(int scale)
      {
        return getH(scale);
      }
      
      public int getSize()
      {
        return InterfaceHandler.minimap.getMinimapWidth() + 36 + 2;
      }
      
      public void translatePosition(int specW, int specH, double ps, double pc, double offx, double offy)
      {
        double Y = (pc * offx + ps * offy) * Minimap.zoom;
        double borderedX;
        double X = borderedX = (ps * offx - pc * offy) * Minimap.zoom;
        double borderedY = Y;
        if (borderedX > specW)
        {
          borderedX = specW;
          borderedY = Y * specW / X;
        }
        else if (borderedX < -specW)
        {
          borderedX = -specW;
          borderedY = -Y * specW / X;
        }
        if (borderedY > specH)
        {
          borderedY = specH;
          borderedX = X * specH / Y;
        }
        else if (borderedY < -specH)
        {
          borderedY = -specH;
          borderedX = -X * specH / Y;
        }
        GL11.glPushMatrix();
        bfl.b(borderedX, borderedY, 0.0D);
      }
      
      public void drawInterface(int width, int height, int scale, float partial)
      {
        if ((Minimap.loadedFBO) && (!bqs.i()))
        {
          Minimap.loadedFBO = false;
          Minimap.scalingFrameBuffer.a();
          Minimap.rotationFrameBuffer.a();
          Minimap.resetImage();
        }
        if ((!Minimap.loadedFBO) && (!XaeroMinimap.getSettings().mapSafeMode) && (System.currentTimeMillis() - this.lastFBOTry > 1000L))
        {
          this.lastFBOTry = System.currentTimeMillis();
          Minimap.loadFrameBuffer();
        }
        if (XaeroMinimap.getSettings().getMinimapSize() != this.lastMinimapSize)
        {
          this.lastMinimapSize = XaeroMinimap.getSettings().getMinimapSize();
          Minimap.resetImage();
          Minimap.frameUpdateNeeded = Minimap.usingFBO();
        }
        long before = System.currentTimeMillis();
        int bufferSize;
        int bufferSize;
        if (Minimap.usingFBO()) {
          bufferSize = InterfaceHandler.minimap.getFBOBufferSize();
        } else {
          bufferSize = InterfaceHandler.minimap.getBufferSize();
        }
        float mapScale = scale / 2.0F;
        Minimap minimap = InterfaceHandler.minimap;
        int minimapWidth = InterfaceHandler.minimap.getMinimapWidth();
        minimap.minimapWidth = minimapWidth;
        int mapW = minimapWidth;
        Minimap minimap2 = InterfaceHandler.minimap;
        int minimapHeight = mapW;
        minimap2.minimapHeight = minimapHeight;
        int mapH = minimapHeight;
        Minimap.frameUpdatePartialTicks = partial;
        InterfaceHandler.minimap.updateZoom();
        Minimap.zoom = InterfaceHandler.minimap.getZoom();
        avc.a();
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        float sizeFix = bufferSize / 512.0F;
        if (Minimap.usingFBO())
        {
          InterfaceHandler.minimap.renderFrameToFBO(bufferSize, mapW, sizeFix, partial, true);
          ave.A().b().a(true);
          Minimap.rotationFrameBuffer.c();
          sizeFix = 1.0F;
        }
        else
        {
          InterfaceHandler.minimap.updateMapFrame(bufferSize, partial);
          GL11.glScalef(sizeFix, sizeFix, 1.0F);
          Minimap.bindTextureBuffer(Minimap.mapTexture.getBuffer(bufferSize), bufferSize, bufferSize, Minimap.mapTexture.b());
          GL11.glColor4f(1.0F, 1.0F, 1.0F, XaeroMinimap.getSettings().minimapOpacity / 100.0F);
        }
        GL11.glEnable(3008);
        bfl.d();
        bfl.l();
        bfl.b(770, 771);
        GL11.glScalef(1.0F / mapScale, 1.0F / mapScale, 1.0F);
        int scaledX = (int)(this.x * mapScale);
        int scaledY = (int)(this.y * mapScale);
        InterfaceHandler.mc.q.b((int)((scaledX + 9) / sizeFix), (int)((scaledY + 9) / sizeFix), 0, 0, (int)((mapW / 2 + 1) / sizeFix), (int)((mapH / 2 + 1) / sizeFix));
        if (!Minimap.usingFBO())
        {
          GL11.glScalef(1.0F / sizeFix, 1.0F / sizeFix, 1.0F);
          GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        }
        int specH;
        int specW = specH = mapW / 2 + 6;
        double angle = Math.toRadians(Minimap.getRenderAngle());
        double ps = Math.sin(3.141592653589793D - angle);
        double pc = Math.cos(3.141592653589793D - angle);
        InterfaceHandler.mc.P().a(InterfaceHandler.guiTextures);
        if (XaeroMinimap.getSettings().getLockNorth())
        {
          GL11.glPushMatrix();
          GL11.glScalef(0.5F, 0.5F, 1.0F);
          int arrowRotation = (int)Math.round(12.0D * Minimap.getActualAngle() / 180.0D) % 24;
          if (arrowRotation < 0) {
            arrowRotation += 24;
          }
          InterfaceHandler.mc.q.b(2 * scaledX + 18 + (mapW + 1) / 2 - 15, 2 * scaledY + 18 + (mapH + 1) / 2 - 15, 49 + 31 * (arrowRotation % 4), 31 * (arrowRotation / 4), 31, 31);
          GL11.glPopMatrix();
        }
        InterfaceHandler.mc.q.b(scaledX + 9 - 4, scaledY + 9 - 4, 0, 0, 17, 15);
        InterfaceHandler.mc.q.b(scaledX + 9 - 4 + mapW / 2 - 8, scaledY + 9 - 4, 0, 15, 17, 15);
        InterfaceHandler.mc.q.b(scaledX + 9 - 4, scaledY + 9 - 4 + mapH / 2 - 6, 0, 30, 17, 15);
        InterfaceHandler.mc.q.b(scaledX + 9 - 4 + mapW / 2 - 8, scaledY + 9 - 4 + mapH / 2 - 6, 0, 45, 17, 15);
        int horLineLength = (mapW / 2 - 16) / 16;
        for (int i = 0; i < horLineLength; i++)
        {
          InterfaceHandler.mc.q.b(scaledX + 9 - 4 + 17 + i * 16, scaledY + 9 - 4, 0, 60, 16, 4);
          InterfaceHandler.mc.q.b(scaledX + 9 - 4 + 17 + i * 16, scaledY + 9 - 4 + mapH / 2 + 9 - 4, 0, 64, 16, 4);
        }
        int vertLineLength = (mapH / 2 - 14) / 5;
        for (int j = 0; j < vertLineLength; j++)
        {
          InterfaceHandler.mc.q.b(scaledX + 9 - 4, scaledY + 9 - 4 + 15 + j * 5, 0, 68, 4, 5);
          InterfaceHandler.mc.q.b(scaledX + 9 - 4 + mapW / 2 + 9 - 4, scaledY + 9 - 4 + 15 + j * 5, 0, 73, 4, 5);
        }
        GL11.glPushMatrix();
        bfl.a(0.5F, 0.5F, 1.0F);
        bfl.b(2 * scaledX + specW - 6 + 18, 2 * scaledY + specH - 6 + 18, 0.0F);
        if (XaeroMinimap.getSettings().compassOverWaypoints)
        {
          drawWaypoints(specW, specH, ps, pc, partial);
          drawCompass(specW, specH, ps, pc);
        }
        else
        {
          drawCompass(specW, specH, ps, pc);
          drawWaypoints(specW, specH, ps, pc, partial);
        }
        GL11.glPopMatrix();
        if (XaeroMinimap.getSettings().getShowCoords())
        {
          int interfaceSize = getSize() / 2;
          String coords = Minimap.myFloor(InterfaceHandler.mc.h.s) + ", " + Minimap.myFloor(InterfaceHandler.mc.h.t) + ", " + Minimap.myFloor(InterfaceHandler.mc.h.u);
          if (InterfaceHandler.mc.k.a(coords) >= interfaceSize)
          {
            String stringLevel = "" + Minimap.myFloor(InterfaceHandler.mc.h.t);
            coords = Minimap.myFloor(InterfaceHandler.mc.h.s) + ", " + Minimap.myFloor(InterfaceHandler.mc.h.u);
            this.underText.add(coords);
            this.underText.add(stringLevel);
          }
          else
          {
            this.underText.add(coords);
          }
        }
        if (XaeroMinimap.getSettings().showBiome)
        {
          cj pos = new cj(InterfaceHandler.mc.ac().s, InterfaceHandler.mc.ac().aR().b, InterfaceHandler.mc.ac().u);
          this.underText.add(InterfaceHandler.mc.f.f(pos).a(pos, InterfaceHandler.mc.f.v()).ah);
        }
        drawTextUnderMinimap(scaledX, scaledY, height, mapScale);
        GL11.glScalef(mapScale, mapScale, 1.0F);
        super.drawInterface(width, height, scale, partial);
      }
      
      public void drawTextUnderMinimap(int scaledX, int scaledY, int height, float mapScale)
      {
        int interfaceSize = getSize() / 2;
        int scaledHeight = (int)(height * mapScale);
        for (int i = 0; i < this.underText.size(); i++)
        {
          String s = (String)this.underText.get(i);
          int stringWidth = InterfaceHandler.mc.k.a(s);
          boolean under = scaledY + interfaceSize / 2 < scaledHeight / 2;
          int stringY = scaledY + (under ? interfaceSize : -9) + i * 9 * (under ? 1 : -1);
          ave.A().k.a(s, scaledX + interfaceSize / 2 - stringWidth / 2, stringY, Minimap.radarPlayers.hashCode());
        }
        this.underText.clear();
      }
      
      private void drawWaypoints(int specW, int specH, double ps, double pc, float partial)
      {
        if ((XaeroMinimap.settings.getShowWaypoints()) && (Minimap.waypoints != null))
        {
          double playerX = Minimap.getEntityX(InterfaceHandler.mc.h, partial);
          double playerZ = Minimap.getEntityZ(InterfaceHandler.mc.h, partial);
          renderWaypointsList(Minimap.waypoints.list, playerX, playerZ, specW, specH, ps, pc);
        }
      }
      
      private void renderWaypointsList(ArrayList<Waypoint> waypoints, double playerX, double playerZ, int specW, int specH, double ps, double pc)
      {
        for (Waypoint w : waypoints) {
          if ((w != null) && (!w.disabled)) {
            if ((w.type != 1) || (XaeroMinimap.getSettings().getDeathpoints()))
            {
              double offx = w.x - playerX;
              double offy = w.z - playerZ;
              translatePosition(specW, specH, ps, pc, offx, offy);
              bfl.a(2.0F, 2.0F, 1.0F);
              w.drawIconOnGUI(-4, -4);
              GL11.glPopMatrix();
            }
          }
        }
      }
      
      private void drawCompass(int specW, int specH, double ps, double pc)
      {
        String[] nesw = { "N", "E", "S", "W" };
        for (int i = 0; i < 4; i++)
        {
          double offx = (i == 0) || (i == 2) ? 0.0D : i == 1 ? '✐' : '?';
          double offy = (i == 1) || (i == 3) ? 0.0D : i == 2 ? '✐' : '?';
          translatePosition(specW, specH, ps, pc, offx, offy);
          bfl.a(2.0F, 2.0F, 1.0F);
          ave.A().k.a(nesw[i], 1 - InterfaceHandler.mc.k.a(nesw[i]) / 2, -3.0F, Minimap.radarPlayers.hashCode());
          GL11.glPopMatrix();
        }
      }
    });
  }
  
  public static void drawInterfaces(float partial)
  {
    avr scaledresolution = new avr(XaeroMinimap.mc);
    int width = scaledresolution.a();
    int height = scaledresolution.b();
    int scale = scaledresolution.e();
    int mouseX = Mouse.getX() * width / XaeroMinimap.mc.d;
    int mouseY = height - Mouse.getY() * height / XaeroMinimap.mc.e - 1;
    updateInterfaces(mouseX, mouseY, width, height, scale);
    for (Interface l : list) {
      if (XaeroMinimap.settings.getBooleanValue(l.option)) {
        l.drawInterface(width, height, scale, partial);
      }
    }
  }
  
  public static boolean overAButton(int mouseX, int mouseY)
  {
    if ((mc.m instanceof GuiEditMode)) {
      for (int k = 0; k < ((GuiEditMode)mc.m).getButtons().size(); k++)
      {
        avs b = (avs)((GuiEditMode)mc.m).getButtons().get(k);
        if ((mouseX >= b.h) && (mouseY >= b.i) && (mouseX < b.h + 150) && (mouseY < b.i + 20)) {
          return true;
        }
      }
    }
    return false;
  }
  
  public static void confirm()
  {
    for (Interface l : list)
    {
      l.bx = l.actualx;
      l.by = l.actualy;
      l.bcentered = l.centered;
      l.bflipped = l.flipped;
      l.bfromRight = l.fromRight;
    }
  }
  
  public static void cancel()
  {
    for (Interface l : list)
    {
      l.actualx = l.bx;
      l.actualy = l.by;
      l.centered = l.bcentered;
      l.flipped = l.bflipped;
      l.fromRight = l.bfromRight;
    }
  }
  
  public static void applyPreset(int id)
  {
    for (Interface l : list)
    {
      actionTimer = 10;
      l.actualx = ((Preset)presets.get(id)).coords[l.id][0];
      l.actualy = ((Preset)presets.get(id)).coords[l.id][1];
      l.centered = ((Preset)presets.get(id)).types[l.id][0];
      l.flipped = l.cflipped;
      l.fromRight = ((Preset)presets.get(id)).types[l.id][1];
    }
  }
  
  public static void updateInterfaces(int mouseX, int mouseY, int width, int height, int scale)
  {
    int i;
    if (actionTimer <= 0)
    {
      if ((XaeroMinimap.events.lastGuiOpen instanceof GuiEditMode))
      {
        if (Mouse.isButtonDown(1)) {
          selectedId = -1;
        }
        i = getInterfaceId(mouseX, mouseY, width, height, scale);
        if (i == -1) {
          i = selectedId;
        }
        if (i != -1)
        {
          if ((Mouse.isButtonDown(0)) && (draggingId == -1))
          {
            draggingId = i;
            selectedId = i;
            if (((Interface)list.get(i)).fromRight) {
              ((Interface)list.get(i)).x = (width - ((Interface)list.get(i)).x);
            }
            draggingOffX = ((Interface)list.get(i)).x - mouseX;
            draggingOffY = ((Interface)list.get(i)).y - mouseY;
            if (((Interface)list.get(i)).fromRight) {
              ((Interface)list.get(i)).x = (width - ((Interface)list.get(i)).x);
            }
          }
          else if ((!Mouse.isButtonDown(0)) && (draggingId != -1))
          {
            draggingId = -1;
            draggingOffX = 0;
            draggingOffY = 0;
          }
          if (selectedId != -1) {
            i = selectedId;
          }
          if ((Keyboard.isKeyDown(33)) && (System.currentTimeMillis() - lastFlip > 300L))
          {
            lastFlip = System.currentTimeMillis();
            ((Interface)list.get(i)).flipped = (!((Interface)list.get(i)).flipped);
          }
          if ((Keyboard.isKeyDown(46)) && (System.currentTimeMillis() - lastFlip > 300L))
          {
            lastFlip = System.currentTimeMillis();
            ((Interface)list.get(i)).centered = (!((Interface)list.get(i)).centered);
          }
          if (Keyboard.isKeyDown(31))
          {
            selectedId = -1;
            draggingId = -1;
            switch (i)
            {
            case 4: 
              mc.a(new GuiMinimap(XaeroMinimap.getSettings()));
            }
          }
        }
        if (draggingId != -1)
        {
          if (!((Interface)list.get(draggingId)).centered)
          {
            ((Interface)list.get(draggingId)).actualx = (mouseX + draggingOffX);
            if (((Interface)list.get(draggingId)).fromRight) {
              ((Interface)list.get(draggingId)).actualx = (width - ((Interface)list.get(draggingId)).actualx);
            }
          }
          if (((Interface)list.get(draggingId)).actualx > width / 2)
          {
            ((Interface)list.get(draggingId)).fromRight = (!((Interface)list.get(draggingId)).fromRight);
            ((Interface)list.get(draggingId)).actualx = (width - ((Interface)list.get(draggingId)).actualx);
          }
          ((Interface)list.get(draggingId)).actualy = (mouseY + draggingOffY);
        }
      }
    }
    else {
      actionTimer -= 1;
    }
    for (Interface j : list)
    {
      j.x = j.actualx;
      j.y = j.actualy;
      if (j.fromRight) {
        j.x = (width - j.x);
      }
      if (j.centered)
      {
        if (j.multi)
        {
          j.w = j.getWC(scale);
          j.h = j.getHC(scale);
        }
        j.x = (width / 2 - j.getW(scale) / 2);
      }
      else if (j.multi)
      {
        j.w = j.getW0(scale);
        j.h = j.getH0(scale);
      }
      if (j.x < 5) {
        j.x = 0;
      }
      if (j.y < 5) {
        j.y = 0;
      }
      if (j.x + j.getW(scale) > width - 5) {
        j.x = (width - j.getW(scale));
      }
      if (j.y + j.getH(scale) > height - 5) {
        j.y = (height - j.getH(scale));
      }
    }
  }
  
  public static void drawBoxes(int mouseX, int mouseY, int width, int height, int scale)
  {
    if ((XaeroMinimap.events.lastGuiOpen instanceof GuiEditMode))
    {
      int mouseOverId = getInterfaceId(mouseX, mouseY, width, height, scale);
      for (int i = 0; i < list.size(); i++) {
        if (XaeroMinimap.settings.getBooleanValue(((Interface)list.get(i)).option))
        {
          int x = ((Interface)list.get(i)).x;
          if (((Interface)list.get(i)).fromRight) {
            x = width - x;
          }
          int y = ((Interface)list.get(i)).y;
          int w = ((Interface)list.get(i)).getW(scale);
          int h = ((Interface)list.get(i)).getH(scale);
          int x2 = x + w;
          int y2 = y + h;
          if ((selectedId == i) || ((!overAButton(mouseX, mouseY)) && (mouseX >= x) && (mouseX <= x2) && (mouseY >= y) && (mouseY <= y2)) || (i == draggingId))
          {
            avp.a(x, y, x2, y2, selectedId == i ? selected.hashCode() : enabled.hashCode());
            if ((draggingId == -1) && (i == mouseOverId)) {
              ((Interface)list.get(i)).cBox.drawBox(mouseX, mouseY, width, height);
            }
          }
          else
          {
            avp.a(x, y, x2, y2, disabled.hashCode());
          }
        }
      }
    }
  }
  
  public static int getInterfaceId(int mouseX, int mouseY, int width, int height, int scale)
  {
    int toReturn = -1;
    int size = 0;
    for (int i = 0; i < list.size(); i++)
    {
      int x = ((Interface)list.get(i)).x;
      if (((Interface)list.get(i)).fromRight) {
        x = width - x;
      }
      int y = ((Interface)list.get(i)).y;
      int x2 = x + ((Interface)list.get(i)).getW(scale);
      int y2 = y + ((Interface)list.get(i)).getH(scale);
      int isize = ((Interface)list.get(i)).getSize();
      if (((size == 0) || (isize < size)) && (!overAButton(mouseX, mouseY)) && (mouseX >= x) && (mouseX < x2) && (mouseY >= y) && (mouseY < y2))
      {
        size = isize;
        toReturn = i;
      }
    }
    return toReturn;
  }
  
  public static int actionTimer = 0;
  public static ArrayList<Preset> presets = new ArrayList();
  public static ArrayList<Interface> list = new ArrayList();
  public static final jy invtextures = new jy("textures/gui/container/inventory.png");
  public static ave mc = XaeroMinimap.mc;
  public static int selectedId = -1;
  public static int draggingId = -1;
  public static int draggingOffX = 0;
  public static int draggingOffY = 0;
  public static Minimap minimap;
  public static final jy guiTextures = new jy("xaerobetterpvp/gui/guis.png");
  public static final jy mapTextures = new jy("xaeromaptexture");
  public static long lastFlip = 0L;
  public static final Color disabled = new Color(189, 189, 189, 80);
  public static final Color enabled = new Color(255, 255, 255, 100);
  public static final Color selected = new Color(255, 255, 255, 130);
}
