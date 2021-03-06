package com.minimap.minimap;

import adf;
import adm;
import ads;
import aey;
import afh;
import afi;
import afx;
import agi;
import agw;
import ahc;
import ahe;
import ahv;
import aim;
import ajf;
import ajs;
import alz;
import amy;
import anm;
import arm;
import arn;
import aul;
import avc;
import ave;
import avh;
import avh.a;
import avn;
import bdb;
import bde;
import bfd;
import bfl;
import bfw;
import bfx;
import bgc;
import bgd;
import bmi;
import bmj;
import bml;
import bms;
import bnh;
import bni;
import bpo;
import cj;
import com.minimap.XaeroMinimap;
import com.minimap.animation.Animation;
import com.minimap.interfaces.Interface;
import com.minimap.interfaces.InterfaceHandler;
import com.minimap.settings.ModSettings;
import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.PrintStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import jy;
import ns;
import org.lwjgl.opengl.ContextCapabilities;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GLContext;
import pk;
import pr;
import ps;
import uz;
import vq;
import vv;
import wn;

public class Minimap
{
  public Interface screen;
  public static final int frame = 9;
  
  public static int getLoadSide()
  {
    return FBOMinimapSizes[XaeroMinimap.getSettings().getMinimapSize()];
  }
  
  public static int getUpdateRadius()
  {
    return (int)Math.ceil(loadingSide / 2.0D / 
    
      XaeroMinimap.getSettings().zooms[
      XaeroMinimap.getSettings().zoom]);
  }
  
  public static String getSaveFolder(anm provider)
  {
    return "DIM" + provider.q();
  }
  
  private static String getWorld()
  {
    if (mc.f == null) {
      return null;
    }
    if (mc.G() != null) {
      return mc.G().U() + "_" + getSaveFolder(mc.f.t);
    }
    String serverIP = mc.D().b;
    if (serverIP.contains(":")) {
      serverIP = serverIP.substring(0, serverIP.indexOf(":"));
    }
    return "Multiplayer_" + serverIP.replaceAll(":", "§") + "_" + getSaveFolder(mc.f.t);
  }
  
  public static String getCurrentWorldID()
  {
    if (customWorldID == null) {
      return worldID;
    }
    return customWorldID;
  }
  
  public static WaypointWorld getCurrentWorld()
  {
    return (WaypointWorld)waypointMap.get(getCurrentWorldID());
  }
  
  public static String getAutoWorldID()
  {
    return worldID;
  }
  
  private static WaypointSet getWaypoints()
  {
    if (customWorldID == null) {
      return ((WaypointWorld)waypointMap.get(worldID)).getCurrentSet();
    }
    return ((WaypointWorld)waypointMap.get(customWorldID)).getCurrentSet();
  }
  
  public static void addWorld(String id)
  {
    if (waypointMap.get(id) == null) {
      waypointMap.put(id, new WaypointWorld());
    }
  }
  
  public static void updateWaypoints()
  {
    addWorld(worldID = getWorld());
    waypoints = getWaypoints();
  }
  
  public Minimap(Interface i)
  {
    this.loadedCaving = -1;
    this.loadingCaving = -1;
    this.loadingMapX = 0;
    this.loadingMapZ = 0;
    this.loadedMapX = 0;
    this.loadedMapZ = 0;
    this.minimapZoom = 1.0D;
    this.minimapWidth = 0;
    this.minimapHeight = 0;
    this.loader = new MapLoader();
    this.currentBlocks = new MinimapChunk[16][16];
    this.loadingBlocks = new MinimapChunk[16][16];
    this.blockY = 0;
    this.blockColor = 0;
    this.isglowing = false;
    this.lastBlockY = new int[16];
    this.drawYState = 0;
    this.screen = i;
    new Thread(this.loader).start();
  }
  
  public static int loadBlockColourFromTexture(alz state, afh b, cj pos, boolean convert)
  {
    int stateId = state.toString().hashCode();
    Integer c = (Integer)blockColours.get(Integer.valueOf(stateId));
    int red = 0;
    int green = 0;
    int blue = 0;
    if (c == null)
    {
      bmi texture = ave.A().ae().a().a(state);
      String name = null;
      try
      {
        name = texture.i() + ".png";
        if ((b instanceof ahe)) {
          name = "minecraft:blocks/grass_top.png";
        } else if (b == afi.bh) {
          name = "minecraft:blocks/mushroom_block_skin_red.png";
        } else if (b == afi.bg) {
          name = "minecraft:blocks/mushroom_block_skin_brown.png";
        } else if (((b instanceof aim)) && (b != afi.co)) {
          name = "minecraft:blocks/stone.png";
        }
        if (convert) {
          name = name.replaceAll("_side", "_top").replaceAll("_front.png", "_top.png");
        }
        c = Integer.valueOf(-1);
        String[] args = name.split(":");
        if (args.length < 2) {
          return 0;
        }
        Integer cachedColour = (Integer)textureColours.get(name);
        if (cachedColour == null)
        {
          jy location = new jy(args[0], "textures/" + args[1]);
          
          bnh resource = ave.A().Q().a(location);
          InputStream input = resource.b();
          
          BufferedImage img = bml.a(input);
          red = 0;
          green = 0;
          blue = 0;
          int total = 64;
          int tw = img.getWidth();
          int diff = tw / 8;
          for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++)
            {
              int rgb = img.getRGB(i * diff, j * diff);
              if (rgb == 0)
              {
                total--;
              }
              else
              {
                red += (rgb >> 16 & 0xFF);
                green += (rgb >> 8 & 0xFF);
                blue += (rgb & 0xFF);
              }
            }
          }
          input.close();
          if (total == 0) {
            total = 1;
          }
          red /= total;
          green /= total;
          blue /= total;
          c = Integer.valueOf(0xFF000000 | red << 16 | green << 8 | blue);
          textureColours.put(name, c);
        }
        else
        {
          c = cachedColour;
        }
      }
      catch (FileNotFoundException e)
      {
        if (convert) {
          return loadBlockColourFromTexture(state, b, pos, false);
        }
        c = Integer.valueOf(b.g(state).L);
        if (name != null) {
          textureColours.put(name, c);
        }
        System.out.println("Block file not found: " + b
          .f());
      }
      catch (Exception e2)
      {
        c = Integer.valueOf(b.g(state).L);
        if (name != null) {
          textureColours.put(name, c);
        }
        System.out.println("Block " + b.f() + " has no texture, using material colour.");
      }
      if (c != null) {
        blockColours.put(Integer.valueOf(stateId), c);
      }
    }
    int grassColor = b.d(
      ave.A().f, pos);
    if (grassColor != 16777215)
    {
      float rMultiplier = (c.intValue() >> 16 & 0xFF) / 255.0F;
      float gMultiplier = (c.intValue() >> 8 & 0xFF) / 255.0F;
      float bMultiplier = (c.intValue() & 0xFF) / 255.0F;
      red = (int)((grassColor >> 16 & 0xFF) * rMultiplier);
      green = (int)((grassColor >> 8 & 0xFF) * gMultiplier);
      blue = (int)((grassColor & 0xFF) * bMultiplier);
      c = Integer.valueOf(0xFF000000 | red << 16 | green << 8 | blue);
    }
    return c.intValue();
  }
  
  public boolean applyTransparentBlock(amy bchunk, afh b, alz state, cj globalPos, cj pos)
  {
    int red = 0;
    int green = 0;
    int blue = 0;
    int colors = 0;
    boolean skip = false;
    if (((b instanceof ahv)) && (b.p() != 255) && 
      (b.p() != 0))
    {
      if (this.liquidApplied == -1)
      {
        switch (XaeroMinimap.getSettings().blockColours)
        {
        case 1: 
          red = 0;
          green = 200;
          blue = 450;
          break;
        case 0: 
          int waterColor = loadBlockColourFromTexture(state, b, globalPos, true);
          
          red = (waterColor >> 16 & 0xFF) * 2;
          green = (waterColor >> 8 & 0xFF) * 2;
          blue = (waterColor & 0xFF) * 2;
          break;
        }
        this.liquidApplied = pos.o();
        this.liquidOpacity = b.p();
        colors = 2;
      }
      skip = true;
    }
    else if ((XaeroMinimap.getSettings().blockColours == 0) && (
      (b.m() == adf.d) || ((b instanceof ahc))))
    {
      int glassColor = loadBlockColourFromTexture(state, b, globalPos, true);
      
      red = glassColor >> 16 & 0xFF;
      green = glassColor >> 8 & 0xFF;
      blue = glassColor & 0xFF;
      colors = 1;
    }
    else if ((XaeroMinimap.getSettings().blockColours == 1) && ((b instanceof ajs)))
    {
      int i5 = bchunk.c(pos);
      int color = b.g(b.a(i5)).L;
      red = color >> 16 & 0xFF;
      green = color >> 8 & 0xFF;
      blue = color & 0xFF;
      colors = 1;
    }
    if (colors > 0)
    {
      this.underRed += red;
      this.underGreen += green;
      this.underBlue += blue;
      this.transparentColors += colors;
      if (this.transparentColors == colors)
      {
        this.transparentIsGlowing = isGlowing(b);
        if (XaeroMinimap.getSettings().lighting) {
          this.postBrightness = getBlockBrightness(bchunk, new cj(pos
          
            .n(), Math.min(pos.o() + 1, 255), pos
            .p()));
        }
      }
      skip = true;
    }
    return skip;
  }
  
  public afh findBlock(amy bchunk, int insideX, int insideZ, int highY, int lowY)
  {
    boolean underair = false;
    for (int i = highY; i >= lowY; i--)
    {
      afh got = bchunk.a(insideX, i, insideZ);
      if ((!(got instanceof aey)) && ((underair) || (this.loadingCaving == -1)))
      {
        if ((got.b() != -1) && 
          (got != afi.aa) && 
          (got != afi.H)) {
          if (!XaeroMinimap.getSettings().showFlowers)
          {
            if (!(got instanceof agw)) {
              if ((got instanceof agi)) {}
            }
          }
          else if (!XaeroMinimap.getSettings().displayRedstone)
          {
            if ((got != afi.aF) && (got != afi.af) && (!(got instanceof ajf))) {
              if ((got instanceof afx)) {}
            }
          }
          else
          {
            this.blockY = i;
            int color = 0;
            cj pos = new cj(insideX, this.blockY, insideZ);
            
            cj globalPos = getGlobalBlockPos(bchunk.a, bchunk.b, insideX, this.blockY, insideZ);
            
            alz state = bchunk.g(pos);
            if (XaeroMinimap.getSettings().blockColours == 0) {
              state = state;
            }
            if (!applyTransparentBlock(bchunk, got, state, globalPos, pos))
            {
              if (XaeroMinimap.getSettings().blockColours == 1)
              {
                arn minimapColor = got.g(state);
                color = minimapColor.L;
              }
              else
              {
                color = loadBlockColourFromTexture(state, got, globalPos, true);
              }
              if (color != 0)
              {
                this.blockColor = color;
                return got;
              }
            }
          }
        }
      }
      else if ((got instanceof aey)) {
        underair = true;
      }
    }
    return null;
  }
  
  public cj getGlobalBlockPos(int chunkX, int chunkZ, int x, int y, int z)
  {
    return new cj(chunkX * 16 + x, y, chunkZ * 16 + z);
  }
  
  public double getBlockBrightness(amy c, cj pos)
  {
    return (5.0F + Math.max(sunBrightness * c
      .a(ads.a, pos), c
      .a(ads.b, pos))) / 20.0D;
  }
  
  public int getBrightestColour(int c)
  {
    int r = c >> 16 & 0xFF;
    int g = c >> 8 & 0xFF;
    int b = c & 0xFF;
    int max = Math.max(r, Math.max(g, b));
    if (max == 0) {
      return c;
    }
    if (max == r)
    {
      g = 255 * g / r;
      b = 255 * b / r;
      r = 255;
    }
    else if (max == g)
    {
      r = 255 * r / g;
      b = 255 * b / g;
      g = 255;
    }
    else
    {
      g = 255 * g / b;
      r = 255 * r / b;
      b = 255;
    }
    return 0xFF000000 | r << 16 | g << 8 | b;
  }
  
  public boolean isGlowing(afh b)
  {
    return b.r() >= 0.5D;
  }
  
  public void loadBlockColor(int par1, int par2, amy bchunk, int chunkX, int chunkZ)
  {
    int insideX = par1 & 0xF;
    int insideZ = par2 & 0xF;
    int playerY = (int)mc.h.t;
    int height = bchunk.b(insideX, insideZ);
    int highY = this.loadingCaving != -1 ? this.loadingCaving : height + 3;
    
    int lowY = this.loadingCaving != -1 ? playerY - 30 : 0;
    if (lowY < 0) {
      lowY = 0;
    }
    this.blockY = 0;
    this.blockColor = 0;
    this.underRed = 0;
    this.underGreen = 0;
    this.underBlue = 0;
    this.transparentColors = 0;
    this.transparentIsGlowing = false;
    this.liquidApplied = -1;
    this.liquidOpacity = -1;
    this.postBrightness = -1.0D;
    this.isglowing = false;
    afh block = findBlock(bchunk, insideX, insideZ, highY, lowY);
    
    this.isglowing = ((block != null) && (!(block instanceof aim)) && (isGlowing(block)));
    double brightness = 1.0D;
    if (!XaeroMinimap.getSettings().lighting)
    {
      if (this.loadingCaving != -1) {
        brightness *= Math.min(this.blockY / height, 1.0D);
      }
      if (this.liquidApplied != -1)
      {
        int depth = this.liquidApplied - this.blockY;
        brightness -= depth * this.liquidOpacity / 30.0D;
        if (brightness < 0.0D) {
          brightness = 0.0D;
        }
      }
    }
    else
    {
      cj pos = new cj(insideX, Math.min(this.blockY + 1, 255), insideZ);
      
      brightness = getBlockBrightness(bchunk, pos);
    }
    double secondaryB = 1.0D;
    if (this.lastBlockY[insideX] <= 0)
    {
      this.lastBlockY[insideX] = this.blockY;
      
      amy prevChunk = mc.f.a(this.loadingMapX + chunkX, this.loadingMapZ + chunkZ - 1);
      if ((prevChunk != null) && (prevChunk.o())) {
        this.lastBlockY[insideX] = (prevChunk.b(insideX, 15) - 1);
      }
    }
    if (this.blockY < this.lastBlockY[insideX]) {
      secondaryB -= 0.15D;
    }
    if (this.blockY > this.lastBlockY[insideX]) {
      secondaryB += 0.15D;
    }
    brightness *= secondaryB;
    this.lastBlockY[insideX] = this.blockY;
    if (this.blockColor == 0) {
      this.blockColor = 1;
    }
    if (this.isglowing) {
      this.blockColor = getBrightestColour(this.blockColor);
    }
    int l = this.blockColor >> 16 & 0xFF;
    int i1 = this.blockColor >> 8 & 0xFF;
    int j1 = this.blockColor & 0xFF;
    l *= (int)(this.isglowing ? 1.0D : brightness);
    if (l > 255) {
      l = 255;
    }
    i1 *= (int)(this.isglowing ? 1.0D : brightness);
    if (i1 > 255) {
      i1 = 255;
    }
    j1 *= (int)(this.isglowing ? 1.0D : brightness);
    if (j1 > 255) {
      j1 = 255;
    }
    if (this.transparentColors > 0)
    {
      l = (l + this.underRed) / (this.transparentColors + 1);
      i1 = (i1 + this.underGreen) / (this.transparentColors + 1);
      j1 = (j1 + this.underBlue) / (this.transparentColors + 1);
    }
    if (this.postBrightness != -1.0D)
    {
      l = (int)Math.min(l * this.postBrightness, 255.0D);
      i1 = (int)Math.min(i1 * this.postBrightness, 255.0D);
      j1 = (int)Math.min(j1 * this.postBrightness, 255.0D);
    }
    this.blockColor = (0xFF000000 | l << 16 | i1 << 8 | j1);
    if (this.transparentIsGlowing) {
      this.blockColor = getBrightestColour(this.blockColor);
    }
    if ((chunkX < 0) || (chunkX >= loadingSide) || (chunkZ < 0) || (chunkZ >= loadingSide)) {
      return;
    }
    MinimapChunk[] chunkmap = this.loadingBlocks[chunkX];
    if (chunkmap == null)
    {
      chunkmap = new MinimapChunk[loadingSide];
      this.loadingBlocks[chunkX] = chunkmap;
    }
    MinimapChunk chunk = chunkmap[chunkZ];
    if (chunk == null)
    {
      chunk = new MinimapChunk(bchunk.a, bchunk.b);
      chunkmap[chunkZ] = chunk;
    }
    chunk.colors[insideX][insideZ] = this.blockColor;
  }
  
  public int getMapCoord(int side, double coord)
  {
    return (myFloor(coord) >> 4) - side / 2;
  }
  
  public int getLoadedBlockColor(int par1, int par2)
  {
    int cX = (par1 >> 4) - this.loadedMapX;
    int cZ = (par2 >> 4) - this.loadedMapZ;
    if ((cX < 0) || (cX >= loadedSide) || (cZ < 0) || (cZ >= loadedSide)) {
      return 1;
    }
    MinimapChunk current = this.currentBlocks[cX][cZ];
    if (current != null) {
      return chunkOverlay(current.colors[(par1 & 0xF)][(par2 & 0xF)], current);
    }
    return 1;
  }
  
  public MinimapChunk[] getLoadedYChunks(int par1)
  {
    int cX = (par1 >> 4) - this.loadedMapX;
    if ((cX < 0) || (cX >= loadedSide)) {
      return null;
    }
    return this.currentBlocks[cX];
  }
  
  public int getLoadedBlockColor(MinimapChunk[] yChunks, int par1, int par2)
  {
    int cZ = (par2 >> 4) - this.loadedMapZ;
    if ((cZ < 0) || (cZ >= loadedSide)) {
      return 1;
    }
    MinimapChunk current = yChunks[cZ];
    if (current != null) {
      return chunkOverlay(current.colors[(par1 & 0xF)][(par2 & 0xF)], current);
    }
    return 1;
  }
  
  public int gridOverlay(int color)
  {
    int r = ((color >> 16 & 0xFF) * 2 + 170) / 3;
    int g = ((color >> 8 & 0xFF) * 2 + 0) / 3;
    int b = ((color & 0xFF) * 2 + 0) / 3;
    return 0xFF000000 | r << 16 | g << 8 | b;
  }
  
  public int slimeOverlay(int color)
  {
    int r = ((color >> 16 & 0xFF) + 82) / 2;
    int g = ((color >> 8 & 0xFF) + 241) / 2;
    int b = ((color & 0xFF) + 64) / 2;
    return 0xFF000000 | r << 16 | g << 8 | b;
  }
  
  public int chunkOverlay(int color, MinimapChunk c)
  {
    if ((XaeroMinimap.getSettings().getSlimeChunks()) && (c.slimeChunk)) {
      return slimeOverlay(color);
    }
    if ((XaeroMinimap.getSettings().getChunkGrid()) && (c.chunkGrid)) {
      return gridOverlay(color);
    }
    return color;
  }
  
  public static double getRenderAngle()
  {
    if (XaeroMinimap.getSettings().getLockNorth()) {
      return 90.0D;
    }
    return getActualAngle();
  }
  
  public static double getActualAngle()
  {
    double rotation = mc.h.y;
    if ((rotation < 0.0D) || (rotation > 360.0D)) {
      rotation %= 360.0D;
    }
    double angle = 270.0D - rotation;
    if ((angle < 0.0D) || (angle > 360.0D)) {
      angle %= 360.0D;
    }
    return angle;
  }
  
  public double getZoom()
  {
    return this.minimapZoom;
  }
  
  public void updateZoom()
  {
    double target = XaeroMinimap.getSettings().zooms[XaeroMinimap.getSettings().zoom] * (this.loadedCaving != -1 ? 3.0F : 1.0F);
    if (target > XaeroMinimap.getSettings().zooms[(XaeroMinimap.getSettings().zooms.length - 1)]) {
      target = XaeroMinimap.getSettings().zooms[(XaeroMinimap.getSettings().zooms.length - 1)];
    }
    double off = target - this.minimapZoom;
    if ((off > 0.01D) || (off < -0.01D)) {
      off = (float)Animation.animate(off, 0.8D);
    } else {
      off = 0.0D;
    }
    this.minimapZoom = (target - off);
  }
  
  public static double getEntityX(pk e, float partial)
  {
    return e.P + (e.s - e.P) * partial;
  }
  
  public static double getEntityZ(pk e, float partial)
  {
    return e.R + (e.u - e.R) * partial;
  }
  
  public static void resetImage()
  {
    toResetImage = true;
  }
  
  public static int myFloor(double d)
  {
    if (d < 0.0D) {
      d -= 1.0D;
    }
    return (int)d;
  }
  
  public int getMinimapWidth()
  {
    return enlargedMap ? 448 : minimapSizes[XaeroMinimap.getSettings().getMinimapSize()];
  }
  
  public int getBufferSize()
  {
    return enlargedMap ? 512 : bufferSizes[XaeroMinimap.getSettings().getMinimapSize()];
  }
  
  public int getFBOBufferSize()
  {
    return FBOBufferSizes[XaeroMinimap.getSettings().getMinimapSize()];
  }
  
  public static boolean usingFBO()
  {
    return (loadedFBO) && (!enlargedMap) && (!XaeroMinimap.getSettings().mapSafeMode);
  }
  
  public void updateMapFrame(int bufferSize, float partial)
  {
    wn p = mc.h;
    long before = System.currentTimeMillis();
    if ((toResetImage) || (usingFBO()))
    {
      this.bytes = new byte[bufferSize * bufferSize * 3];
      toResetImage = false;
    }
    boolean motionBlur = ave.ai() >= 35;
    int increaseY = motionBlur ? 2 : 1;
    int mapW = 0;
    int mapH = 0;
    int halfW = 0;
    int halfH = 0;
    if (!usingFBO())
    {
      mapW = mapH = getMinimapWidth();
      halfW = (mapW + 1) / 2;
      halfH = (mapH + 1) / 2;
    }
    if (enlargedMap) {
      zoom = zoom * (mapW / minimapSizes[XaeroMinimap.getSettings().getMinimapSize()]);
    }
    double halfWZoomed = halfW / zoom;
    double halfHZoomed = halfH / zoom;
    if (usingFBO())
    {
      int chunkAmount = loadedSide;
      int actualSize = getLoadSide();
      mapUpdateX = getMapCoord(actualSize, 
        getEntityX(mc.h, partial));
      mapUpdateZ = getMapCoord(actualSize, 
        getEntityZ(mc.h, partial));
      int chunkOffsetX = mapUpdateX - this.loadedMapX;
      int chunkOffsetZ = mapUpdateZ - this.loadedMapZ;
      mapW = mapH = actualSize * 16;
      
      double corner = (int)(actualSize * (Math.sqrt(2.0D) - 1.0D) / Math.sqrt(2.0D));
      
      int cornerZoomed = (int)(corner + actualSize * Math.sqrt(0.5D) * (1.0D - 1.0D / zoom) - 1.0D);
      int thing = actualSize - 1;
      for (int chunkX = 0; chunkX < chunkAmount - chunkOffsetX; chunkX++)
      {
        int transformedX = chunkX + chunkOffsetX;
        if ((transformedX >= 0) && 
          (transformedX < chunkAmount))
        {
          MinimapChunk[] yChunks = this.currentBlocks[transformedX];
          if (yChunks != null)
          {
            int drawX = 16 * chunkX;
            for (int chunkZ = 0; chunkZ < yChunks.length - chunkOffsetZ; chunkZ++) {
              if ((chunkX + chunkZ >= cornerZoomed) && (thing - chunkZ + chunkX >= cornerZoomed) && (thing - chunkX + chunkZ >= cornerZoomed)) {
                if (2 * thing - chunkX - chunkZ >= cornerZoomed)
                {
                  int transformedZ = chunkZ + chunkOffsetZ;
                  if ((transformedZ >= 0) && 
                    (transformedZ < chunkAmount))
                  {
                    MinimapChunk c = yChunks[transformedZ];
                    if (c != null)
                    {
                      int drawY = 16 * chunkZ;
                      for (int insideX = 0; insideX < 16; insideX++)
                      {
                        int[] blocks = c.colors[insideX];
                        int pixelX = drawX + insideX;
                        if ((pixelX <= mapW) && 
                          (pixelX >= 0)) {
                          for (int insideZ = 0; insideZ < 16; insideZ++)
                          {
                            int pixelY = drawY + insideZ;
                            if ((pixelY >= 0) && 
                              (pixelY <= mapH)) {
                              putColor(this.bytes, pixelX, pixelY, 
                              
                                chunkOverlay(blocks[insideZ], c), bufferSize);
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
      }
    }
    else
    {
      byte currentState = this.drawYState;
      double angle = Math.toRadians(getRenderAngle());
      double ps = Math.sin(3.141592653589793D - angle);
      double pc = Math.cos(3.141592653589793D - angle);
      double playerX = getEntityX(mc.h, partial);
      
      double playerZ = getEntityZ(mc.h, partial);
      for (int currentX = 0; currentX <= mapW + 1; currentX++)
      {
        double currentXZoomed = currentX / zoom;
        double offx = currentXZoomed - halfWZoomed;
        double psx = ps * offx;
        double pcx = pc * offx;
        for (int currentY = motionBlur ? currentState : 0; currentY <= mapH + 1; currentY += increaseY)
        {
          double offy = currentY / zoom - halfHZoomed;
          putColor(this.bytes, currentX, currentY, 
          
            getLoadedBlockColor(myFloor(playerX + psx + pc * offy), 
            myFloor(playerZ + ps * offy - pcx)), bufferSize);
        }
        currentState = (byte)(currentState != 1 ? 1 : 0);
      }
      renderEntityListSafeMode(p, loadedEntities, pc, ps, mapW, bufferSize, halfW, halfH, playerX, playerZ, partial);
      
      renderEntityListSafeMode(p, loadedItems, pc, ps, mapW, bufferSize, halfW, halfH, playerX, playerZ, partial);
      
      renderEntityListSafeMode(p, loadedHostile, pc, ps, mapW, bufferSize, halfW, halfH, playerX, playerZ, partial);
      
      renderEntityListSafeMode(p, loadedLiving, pc, ps, mapW, bufferSize, halfW, halfH, playerX, playerZ, partial);
      
      renderEntityListSafeMode(p, loadedPlayers, pc, ps, mapW, bufferSize, halfW, halfH, playerX, playerZ, partial);
      
      renderEntityDotSafeMode(p, p, pc, ps, mapW, bufferSize, halfW, halfH, playerX, playerZ, partial);
      
      this.drawYState = ((byte)(this.drawYState != 1 ? 1 : 0));
      ByteBuffer buffer = mapTexture.getBuffer(bufferSize);
      buffer.put(this.bytes);
      buffer.flip();
    }
  }
  
  public void renderEntityListSafeMode(wn p, ArrayList<pk> list, double pc, double ps, int mapW, int bufferSize, int halfW, int halfH, double playerX, double playerZ, float partial)
  {
    for (int i = 0; i < list.size(); i++)
    {
      pk e = (pk)list.get(i);
      if ((p == e) || 
        (renderEntityDotSafeMode(p, e, pc, ps, mapW, bufferSize, halfW, halfH, playerX, playerZ, partial))) {}
    }
  }
  
  public boolean renderEntityDotSafeMode(wn p, pk e, double pc, double ps, int mapW, int bufferSize, int halfW, int halfH, double playerX, double playerZ, float partial)
  {
    if (!shouldRenderEntity(e)) {
      return false;
    }
    double offx = getEntityX(e, partial) - playerX;
    double offz = getEntityZ(e, partial) - playerZ;
    double offh = p.t - e.t;
    double Z = pc * offx + ps * offz;
    double X = ps * offx - pc * offz;
    int drawX = myFloor(halfW + X * zoom);
    int drawY = myFloor(halfH + Z * zoom);
    XaeroMinimap.getSettings();
    int color = getEntityColour(e, offh);
    for (int a = drawX - 2; a < drawX + 4; a++) {
      if ((a >= 0) && 
        (a <= mapW)) {
        for (int b = drawY - 2; b < drawY + 4; b++) {
          if ((b >= 0) && 
            (b <= mapW) && (
            ((a != drawX - 2) && (a != drawX + 3)) || ((b != drawY - 2) && (b != drawY + 3) && ((a != drawX + 2) || (b != drawY - 2)) && ((a != drawX + 3) || (b != drawY - 1)) && ((a != drawX - 2) || (b != drawY + 2))))) {
            if ((a != drawX - 1) || (b != drawY + 3)) {
              if ((a == drawX + 3) || (b == drawY + 3) || ((a == drawX + 2) && (b == drawY + 2))) {
                putColor(this.bytes, a, b, 0, bufferSize);
              } else {
                putColor(this.bytes, a, b, color, bufferSize);
              }
            }
          }
        }
      }
    }
    return true;
  }
  
  private int getCaving()
  {
    if (!XaeroMinimap.settings.getCaveMaps()) {
      return -1;
    }
    int x = myFloor(mc.h.s);
    int y = Math.max((int)mc.h.t + 1, 0);
    
    int z = myFloor(mc.h.u);
    int chunkX = x >> 4;
    int chunkZ = z >> 4;
    int insideX = x & 0xF;
    int insideZ = z & 0xF;
    
    amy bchunk = mc.h.o.a(chunkX, chunkZ);
    int top = bchunk.b(insideX, insideZ);
    if (y < top) {
      for (int i = y; i < top; i++)
      {
        afh got = bchunk.a(insideX, i, insideZ);
        if (got.t().k()) {
          return Math.min(y + 3, i);
        }
      }
    }
    return -1;
  }
  
  private void putColor(byte[] bytes, int x, int y, int color, int size)
  {
    int pixel = (y * size + x) * 3;
    bytes[pixel] = ((byte)(color >> 16 & 0xFF));
    bytes[(++pixel)] = ((byte)(color >> 8 & 0xFF));
    bytes[(++pixel)] = ((byte)(color & 0xFF));
  }
  
  public static void loadFrameBuffer()
  {
    if (!GLContext.getCapabilities().GL_EXT_framebuffer_object)
    {
      System.out.println("FBO not supported! Using minimap safe mode.");
    }
    else
    {
      if (!ave.A().t.f)
      {
        ave.A().t.a(avh.a.j, 0);
        
        System.out.println("FBO is supported but off. Turning it on.");
      }
      scalingFrameBuffer = new bfw(512, 512, false);
      rotationFrameBuffer = new bfw(512, 512, false);
      loadedFBO = scalingFrameBuffer.f != -1;
    }
    triedFBO = true;
  }
  
  public void renderFrameToFBO(int bufferSize, int viewW, float sizeFix, float partial, boolean retryIfError)
  {
    updatePause = true;
    int chunkAmount = getLoadSide();
    int mapW = chunkAmount * 16;
    double playerX = getEntityX(mc.h, partial);
    
    double playerZ = getEntityZ(mc.h, partial);
    
    int xFloored = myFloor(playerX);
    int zFloored = myFloor(playerZ);
    int offsetX = xFloored & 0xF;
    int offsetZ = zFloored & 0xF;
    int mapX = getMapCoord(chunkAmount, playerX);
    int mapZ = getMapCoord(chunkAmount, playerZ);
    boolean zooming = (int)zoom != zoom;
    ByteBuffer buffer = mapTexture.getBuffer(bufferSize);
    if ((mapX != mapUpdateX) || (mapZ != mapUpdateZ) || (zooming) || (!retryIfError)) {
      if (!frameIsUpdating)
      {
        frameIsUpdating = true;
        updateMapFrame(bufferSize, partial);
        frameIsUpdating = false;
        buffer.put(this.bytes);
        buffer.flip();
        bufferSizeToUpdate = -1;
        frameUpdateNeeded = false;
      }
      else
      {
        offsetX += 16 * (mapX - mapUpdateX);
        offsetZ += 16 * (mapZ - mapUpdateZ);
      }
    }
    scalingFrameBuffer.a(true);
    GL11.glClear(16640);
    GL11.glEnable(3553);
    avc.a();
    try
    {
      bindTextureBuffer(buffer, bufferSize, bufferSize, mapTexture
        .b());
    }
    catch (Exception e)
    {
      if (retryIfError)
      {
        System.out.println("Error when binding texture buffer. Retrying...");
        renderFrameToFBO(bufferSize, viewW, sizeFix, partial, false);
      }
      else
      {
        System.out.println("Error after retrying... :( Please report to Xaero96 on MinecraftForum of PlanetMinecraft!");
      }
    }
    long before = System.currentTimeMillis();
    if (!zooming) {
      GL11.glTexParameteri(3553, 10240, 9728);
    } else {
      GL11.glTexParameteri(3553, 10240, 9729);
    }
    bfl.m(256);
    bfl.n(5889);
    GL11.glPushMatrix();
    bfl.D();
    bfl.a(0.0D, 512.0D, 512.0D, 0.0D, 1000.0D, 3000.0D);
    bfl.n(5888);
    GL11.glPushMatrix();
    bfl.D();
    before = System.currentTimeMillis();
    double xInsidePixel = getEntityX(mc.h, partial) - xFloored;
    if (xInsidePixel < 0.0D) {
      xInsidePixel += 1.0D;
    }
    double zInsidePixel = getEntityZ(mc.h, partial) - zFloored;
    if (zInsidePixel < 0.0D) {
      zInsidePixel += 1.0D;
    }
    zInsidePixel = 1.0D - zInsidePixel;
    float halfW = mapW / 2.0F;
    float halfWView = viewW / 2.0F;
    float angle = (float)(90.0D - getRenderAngle());
    bfl.b(256.0F, 256.0F, -2000.0F);
    bfl.a(zoom, zoom, 1.0D);
    drawMyTexturedModalRect(-halfW - offsetX + 8.0F, -halfW - offsetZ + 7.0F, 0, 0, mapW + offsetX, mapW + offsetZ, bufferSize);
    
    scalingFrameBuffer.e();
    rotationFrameBuffer.a(false);
    GL11.glClear(16640);
    scalingFrameBuffer.c();
    bfl.D();
    if (XaeroMinimap.getSettings().getAntiAliasing())
    {
      GL11.glTexParameteri(3553, 10240, 9729);
      GL11.glTexParameteri(3553, 10241, 9729);
    }
    else
    {
      GL11.glTexParameteri(3553, 10240, 9728);
      GL11.glTexParameteri(3553, 10241, 9728);
    }
    bfl.b(halfWView + 0.5F, 511.5F - halfWView, -2000.0F);
    if (!XaeroMinimap.getSettings().getLockNorth()) {
      GL11.glRotatef(angle, 0.0F, 0.0F, 1.0F);
    }
    GL11.glPushMatrix();
    bfl.b(-xInsidePixel * zoom, -zInsidePixel * zoom, 0.0D);
    
    bfl.k();
    GL11.glColor4f(1.0F, 1.0F, 1.0F, 
      XaeroMinimap.getSettings().minimapOpacity / 100.0F);
    drawMyTexturedModalRect(-256.0F, -256.0F, 0, 0, 512.0F, 512.0F, 512.0F);
    GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
    GL11.glPopMatrix();
    before = System.currentTimeMillis();
    mc.P()
      .a(InterfaceHandler.guiTextures);
    wn p = mc.h;
    renderEntityListToFBO(p, loadedEntities, angle, playerX, playerZ, partial);
    
    renderEntityListToFBO(p, loadedItems, angle, playerX, playerZ, partial);
    
    renderEntityListToFBO(p, loadedLiving, angle, playerX, playerZ, partial);
    
    renderEntityListToFBO(p, loadedHostile, angle, playerX, playerZ, partial);
    
    renderEntityListToFBO(p, loadedPlayers, angle, playerX, playerZ, partial);
    
    renderEntityDotToFBO(p, p, angle, playerX, playerZ, partial);
    rotationFrameBuffer.e();
    GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
    bfl.k();
    updatePause = false;
    bfl.n(5889);
    GL11.glPopMatrix();
    bfl.n(5888);
    GL11.glPopMatrix();
  }
  
  public static void renderEntityListToFBO(wn p, ArrayList<pk> list, float angle, double playerX, double playerZ, float partial)
  {
    for (int i = 0; i < list.size(); i++)
    {
      pk e = (pk)list.get(i);
      if ((p == e) || 
        (renderEntityDotToFBO(p, e, angle, playerX, playerZ, partial))) {}
    }
  }
  
  public static boolean renderEntityDotToFBO(wn p, pk e, float angle, double playerX, double playerZ, float partial)
  {
    try
    {
      if (!shouldRenderEntity(e)) {
        return false;
      }
      double offx = getEntityX(e, partial) - playerX;
      double offz = playerZ - getEntityZ(e, partial);
      double offh = p.t - e.t;
      GL11.glPushMatrix();
      bfl.b(offx * zoom, offz * zoom, 0.0D);
      if (!XaeroMinimap.getSettings().getLockNorth()) {
        GL11.glRotatef(-angle, 0.0F, 0.0F, 1.0F);
      }
      bfl.b(-0.5F, -0.5F, 0.0F);
      int color = getEntityColour(e, offh);
      float f = (color >> 16 & 0xFF) / 255.0F;
      float f2 = (color >> 8 & 0xFF) / 255.0F;
      float f3 = (color & 0xFF) / 255.0F;
      GL11.glColor4f(f, f2, f3, 1.0F);
      GL11.glScalef(XaeroMinimap.getSettings().dotsScale, 
        XaeroMinimap.getSettings().dotsScale, 1.0F);
      drawMyTexturedModalRect(-2.0F, -3.0F, 0, 87, 6.0F, 6.0F, 256.0F);
      GL11.glPopMatrix();
      return true;
    }
    catch (Exception ex)
    {
      ex.printStackTrace();
    }
    return false;
  }
  
  private static void drawMyTexturedModalRect(float x, float y, int textureX, int textureY, float width, float height, float factor)
  {
    float f2;
    float f = f2 = 1.0F / factor;
    bfx tessellator = bfx.a();
    bfd worldrenderer = tessellator.c();
    worldrenderer.a(7, bms.g);
    worldrenderer
      .b(x + 0.0F, y + height, 0.0D)
      .a((textureX + 0) * f, (textureY + height) * f2)
      .d();
    worldrenderer
      .b(x + width, y + height, 0.0D)
      .a((textureX + width) * f, (textureY + height) * f2)
      .d();
    worldrenderer
      .b(x + width, y + 0.0F, 0.0D)
      .a((textureX + width) * f, (textureY + 0) * f2)
      .d();
    worldrenderer
      .b(x + 0.0F, y + 0.0F, 0.0D)
      .a((textureX + 0) * f, (textureY + 0) * f2)
      .d();
    tessellator.b();
  }
  
  public static void bindTextureBuffer(ByteBuffer image, int width, int height, int par0)
  {
    GL11.glBindTexture(3553, par0);
    GL11.glTexImage2D(3553, 0, 6407, width, height, 0, 6407, 5121, image);
  }
  
  public static boolean shouldRenderEntity(pk e)
  {
    return (!e.av()) && (!e.ax());
  }
  
  public static int getEntityColour(pk e, double offh)
  {
    int color = ModSettings.COLORS[XaeroMinimap.getSettings().otherColor];
    if ((e instanceof wn))
    {
      if (XaeroMinimap.getSettings().playersColor != -1)
      {
        color = ModSettings.COLORS[XaeroMinimap.getSettings().playersColor];
      }
      else
      {
        aul team = (aul)((wn)e).bO();
        if ((team != null) && (team.e() != null) && 
          (team.e().length() > 1)) {
          color = ave.A().k.b(team.e().charAt(1));
        } else {
          color = radarPlayers.hashCode();
        }
      }
    }
    else if (((e instanceof vv)) || ((e instanceof vq))) {
      color = ModSettings.COLORS[XaeroMinimap.getSettings().hostileColor];
    } else if ((e instanceof ps)) {
      color = ModSettings.COLORS[XaeroMinimap.getSettings().mobsColor];
    } else if ((e instanceof uz)) {
      color = ModSettings.COLORS[XaeroMinimap.getSettings().itemsColor];
    }
    int l = color >> 16 & 0xFF;
    int i1 = color >> 8 & 0xFF;
    int j1 = color & 0xFF;
    double level = 20.0D - offh;
    if (level < 0.0D) {
      level = 0.0D;
    }
    double brightness = 1.0D;
    if ((level <= 10.0D) && (XaeroMinimap.getSettings().showEntityHeight))
    {
      brightness = level / 20.0D;
      l *= (int)brightness;
      if (l > 255) {
        l = 255;
      }
      i1 *= (int)brightness;
      if (i1 > 255) {
        i1 = 255;
      }
      j1 *= (int)brightness;
      if (j1 > 255) {
        j1 = 255;
      }
      color = 0xFF000000 | l << 16 | i1 << 8 | j1;
    }
    return color;
  }
  
  public static int loadingSide = 16;
  public static int loadedSide = 16;
  public static int updateRadius = 16;
  public static boolean enlargedMap = false;
  public static ave mc = ave.A();
  private int loadedCaving;
  private int loadingCaving;
  public static final Color radarPlayers = new Color(255, 255, 255);
  public static final Color radarShadow = new Color(0, 0, 0);
  public static ArrayList<pk> loadedPlayers = new ArrayList();
  public static ArrayList<pk> loadedLiving = new ArrayList();
  public static ArrayList<pk> loadedHostile = new ArrayList();
  public static ArrayList<pk> loadedItems = new ArrayList();
  public static ArrayList<pk> loadedEntities = new ArrayList();
  public static int blocksLoaded = 0;
  public int loadingMapX;
  public int loadingMapZ;
  public int loadedMapX;
  public int loadedMapZ;
  public double minimapZoom;
  public int minimapWidth;
  public int minimapHeight;
  public MapLoader loader;
  public static HashMap<String, WaypointWorld> waypointMap = new HashMap();
  public static WaypointSet waypoints = null;
  private static String worldID = null;
  public static String customWorldID = null;
  public MinimapChunk[][] currentBlocks;
  public MinimapChunk[][] loadingBlocks;
  public static boolean frameIsUpdating = false;
  public static boolean frameUpdateNeeded = false;
  public static int bufferSizeToUpdate = -1;
  public static float frameUpdatePartialTicks = 1.0F;
  public static boolean updatePause = false;
  int underRed;
  int underGreen;
  int underBlue;
  int transparentColors;
  boolean transparentIsGlowing;
  int liquidApplied;
  int liquidOpacity;
  public double postBrightness;
  int blockY;
  int blockColor;
  public static HashMap<String, Integer> textureColours = new HashMap();
  public static HashMap<Integer, Integer> blockColours = new HashMap();
  public static boolean clearBlockColours = false;
  boolean isglowing;
  public int[] lastBlockY;
  public static float sunBrightness;
  private byte[] bytes;
  private byte drawYState;
  private static boolean toResetImage = true;
  public static double zoom = 1.0D;
  public static final int[] minimapSizes = { 112, 168, 224, 336 };
  public static final int[] bufferSizes = { 128, 256, 256, 512 };
  public static final int[] FBOMinimapSizes = { 11, 17, 21, 31 };
  public static final int[] FBOBufferSizes = { 256, 512, 512, 512 };
  public static boolean triedFBO = false;
  public static boolean loadedFBO = false;
  public static DynamicTexture mapTexture = new DynamicTexture(InterfaceHandler.mapTextures);
  public static bfw scalingFrameBuffer;
  public static bfw rotationFrameBuffer;
  public static int mapUpdateX;
  public static int mapUpdateZ;
  
  public class MapLoader
    implements Runnable
  {
    public MapLoader() {}
    
    public float getSunBrightnessFactor(adm world, float p_72967_1_)
    {
      float f = world.c(p_72967_1_);
      float f1 = 1.0F - (ns.b(f * 3.1415927F * 2.0F) * 2.0F + 0.5F);
      
      f1 = ns.a(f1, 0.0F, 1.0F);
      f1 = 1.0F - f1;
      
      f1 = (float)(f1 * (1.0D - world.j(p_72967_1_) * 5.0F / 16.0D));
      
      f1 = (float)(f1 * (1.0D - world.h(p_72967_1_) * 5.0F / 16.0D));
      return f1;
    }
    
    public void run()
    {
      int updateChunkX = 0;
      int updateChunkZ = 0;
      for (;;)
      {
        long before = System.currentTimeMillis();
        boolean sleep = true;
        try
        {
          if ((XaeroMinimap.getSettings() == null) || 
            (!XaeroMinimap.getSettings().getMinimap()) || (Minimap.mc.h == null) || (Minimap.mc.f == null))
          {
            Thread.sleep(100L);
          }
          else
          {
            long before2 = System.currentTimeMillis();
            if ((updateChunkX == 0) && (updateChunkZ == 0))
            {
              if (Minimap.clearBlockColours)
              {
                Minimap.clearBlockColours = false;
                if (!Minimap.blockColours.isEmpty())
                {
                  Minimap.blockColours.clear();
                  Minimap.textureColours.clear();
                  System.out
                    .println("Minimap block colour cache cleaned.");
                }
              }
              Minimap.sunBrightness = getSunBrightnessFactor(Minimap.mc.f, 1.0F);
              Minimap.loadingSide = Minimap.getLoadSide();
              Minimap.updateRadius = Minimap.getUpdateRadius();
              
              Minimap.this.loadingMapX = Minimap.this.getMapCoord(Minimap.loadingSide, Minimap.mc.h.s);
              
              Minimap.this.loadingMapZ = Minimap.this.getMapCoord(Minimap.loadingSide, Minimap.mc.h.u);
              
              Minimap.this.loadingCaving = Minimap.this
                .getCaving();
              Minimap.this.loadingBlocks = new MinimapChunk[Minimap.loadingSide][Minimap.loadingSide];
            }
            sleep = updateChunk(updateChunkX, updateChunkZ);
            if ((updateChunkX == Minimap.loadingSide - 1) && (updateChunkZ == Minimap.loadingSide - 1))
            {
              Minimap.this.currentBlocks = Minimap.this.loadingBlocks;
              Minimap.loadedSide = Minimap.loadingSide;
              Minimap.this.loadedMapX = Minimap.this.loadingMapX;
              Minimap.this.loadedMapZ = Minimap.this.loadingMapZ;
              Minimap.this.loadedCaving = Minimap.this.loadingCaving;
              Minimap.frameUpdateNeeded = Minimap.usingFBO();
            }
            updateChunkZ = (updateChunkZ + 1) % Minimap.loadingSide;
            if (updateChunkZ == 0)
            {
              updateChunkX = (updateChunkX + 1) % Minimap.loadingSide;
              
              Minimap.this.lastBlockY = new int[16];
              wn p = Minimap.mc.h;
              ArrayList<pk> loadingPlayers = new ArrayList();
              ArrayList<pk> loadingHostile = new ArrayList();
              ArrayList<pk> loadingLiving = new ArrayList();
              ArrayList<pk> loadingItems = new ArrayList();
              ArrayList<pk> loadingEntities = new ArrayList();
              for (int i = 0; i < p.o.f.size(); i++) {
                try
                {
                  pk e = (pk)p.o.f.get(i);
                  int type = 0;
                  if ((e instanceof wn))
                  {
                    if ((e != p) && (
                    
                      (XaeroMinimap.getSettings().getShowPlayers()) && (
                      (!XaeroMinimap.settings.getShowOtherTeam()) && 
                      
                      (p.bO() != ((pr)e).bO())))) {
                      continue;
                    }
                    type = 1;
                  }
                  else if (((e instanceof vv)) || ((e instanceof vq)))
                  {
                    if (!XaeroMinimap.getSettings().getShowHostile()) {
                      continue;
                    }
                    type = 2;
                  }
                  else if ((e instanceof ps))
                  {
                    if (!XaeroMinimap.getSettings().getShowMobs()) {
                      continue;
                    }
                    type = 3;
                  }
                  else if ((e instanceof uz))
                  {
                    if (!XaeroMinimap.getSettings().getShowItems()) {
                      continue;
                    }
                    type = 4;
                  }
                  else
                  {
                    if (!XaeroMinimap.getSettings().getShowOther()) {
                      continue;
                    }
                  }
                  double offx = e.s - p.s;
                  
                  double offy = e.u - p.u;
                  
                  double offh = p.t - e.t;
                  
                  double offheight2 = offh * offh;
                  double offx2 = offx * offx;
                  double offy2 = offy * offy;
                  
                  double maxDistance = 31250.0D / (Minimap.this.getZoom() * Minimap.this.getZoom());
                  if ((offx2 <= maxDistance) && (offy2 <= maxDistance) && (offheight2 <= 400.0D))
                  {
                    ArrayList<pk> typeList = loadingEntities;
                    switch (type)
                    {
                    case 1: 
                      typeList = loadingPlayers;
                      break;
                    case 2: 
                      typeList = loadingHostile;
                      break;
                    case 3: 
                      typeList = loadingLiving;
                      break;
                    case 4: 
                      typeList = loadingItems;
                    }
                    typeList.add(e);
                    if (XaeroMinimap.getSettings().entityAmount != 0) {
                      if (typeList.size() >= 100 * XaeroMinimap.getSettings().entityAmount) {
                        break;
                      }
                    }
                  }
                }
                catch (Exception localException1) {}
              }
              Minimap.loadedPlayers = loadingPlayers;
              Minimap.loadedHostile = loadingHostile;
              Minimap.loadedLiving = loadingLiving;
              Minimap.loadedItems = loadingItems;
              Minimap.loadedEntities = loadingEntities;
            }
            if ((!Minimap.frameIsUpdating) && (Minimap.frameUpdateNeeded))
            {
              Minimap.frameUpdateNeeded = false;
              Minimap.frameIsUpdating = true;
              
              Minimap.bufferSizeToUpdate = Minimap.this.getFBOBufferSize();
              Minimap.this.updateMapFrame(Minimap.bufferSizeToUpdate, Minimap.frameUpdatePartialTicks);
              
              Minimap.frameIsUpdating = false;
            }
            if ((!Minimap.updatePause) && (Minimap.bufferSizeToUpdate != -1))
            {
              ByteBuffer buffer = Minimap.mapTexture.getBuffer(Minimap.bufferSizeToUpdate);
              buffer.put(Minimap.this.bytes);
              buffer.flip();
              Minimap.bufferSizeToUpdate = -1;
            }
          }
        }
        catch (Exception e2)
        {
          e2.printStackTrace();
          Minimap.frameIsUpdating = false;
        }
        int passed = (int)(System.currentTimeMillis() - before);
        try
        {
          if ((sleep) && (passed <= 5)) {
            Thread.sleep(5 - passed);
          } else {
            Thread.sleep(1L);
          }
        }
        catch (InterruptedException e3)
        {
          e3.printStackTrace();
        }
      }
    }
    
    public boolean updateChunk(int x, int z)
    {
      int chunkX = Minimap.this.loadingMapX + x;
      int chunkZ = Minimap.this.loadingMapZ + z;
      int halfSide = Minimap.loadingSide / 2;
      int fromCenterX = x - halfSide;
      int fromCenterZ = z - halfSide;
      int xOld = chunkX - Minimap.this.loadedMapX;
      int zOld = chunkZ - Minimap.this.loadedMapZ;
      MinimapChunk current = null;
      if ((Minimap.this.currentBlocks != null) && (xOld > -1) && (xOld < Minimap.this.currentBlocks.length) && (zOld > -1) && (zOld < Minimap.this.currentBlocks.length)) {
        current = Minimap.this.currentBlocks[xOld][zOld];
      }
      amy bchunk = Minimap.mc.h.o.a(chunkX, chunkZ);
      if ((!bchunk.o()) || (fromCenterX > Minimap.updateRadius) || (fromCenterZ > Minimap.updateRadius) || (fromCenterX < -Minimap.updateRadius) || (fromCenterZ < -Minimap.updateRadius))
      {
        if (current != null) {
          Minimap.this.loadingBlocks[x][z] = current;
        }
        return false;
      }
      int x2 = chunkX * 16;
      int z2 = chunkZ * 16;
      for (int blockX = x2; blockX < x2 + 16; blockX++) {
        for (int blockZ = z2; blockZ < z2 + 16; blockZ++) {
          Minimap.this.loadBlockColor(blockX, blockZ, bchunk, x, z);
        }
      }
      return true;
    }
  }
}
