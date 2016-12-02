package mods.batty.main;

import ady;
import amy;
import aug;
import avb;
import ave;
import avh;
import avn;
import avp;
import avr;
import bdb;
import bew;
import bmj;
import cj;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Arrays;
import java.util.List;
import java.util.Properties;
import jy;
import ns;
import org.apache.commons.lang3.ArrayUtils;
import org.lwjgl.opengl.GL11;
import pk;

public class BattyUI
  extends avp
{
  public final ave mc;
  int showCoords = 1;
  boolean shadedCoords = true;
  boolean hideTimer = false;
  boolean shadedTimer = true;
  public boolean timerRunning = false;
  public boolean toggleTimer = false;
  public boolean resetTimer = false;
  boolean shadedFPS = true;
  boolean hideFPS = false;
  boolean coordsCopyTPFormat = false;
  int myTitleText = 16746496;
  int myPosCoordText = 5636095;
  int myNegCoordText = 13434879;
  int myPosChunkText = 16777215;
  int myNegChunkText = 11184810;
  int myCompassText = 16746496;
  int myChevronText = 5636095;
  int myBiomeText = 11184810;
  int myRectColour = 1431655765;
  int myTimerStopText = 16746496;
  int myTimerRunText = 5636095;
  int myFPSText = 5636095;
  int myPosX;
  int myPosY;
  int myPosZ;
  boolean myXminus;
  boolean myZminus;
  int myAngle;
  int myDir;
  int myMoveX;
  int myMoveZ;
  int myFind;
  protected static final jy batUIResourceLocation = new jy("battymod/batheart_icon.png");
  static float batLogoScaler = 0.036F;
  static int batLogoU = 0;
  static int batLogoV = 0;
  static int batLogoX = (int)(256.0F * batLogoScaler);
  static int batLogoY = (int)(256.0D * batLogoScaler);
  int coordLocation = 0;
  int myXLine;
  int myYLine;
  int myZLine;
  int myBiomeLine;
  int myBaseOffset;
  int myCoord0Offset;
  int myCoord1Offset;
  int myCoord2Offset;
  int myRHSlocation;
  int coordBoxW;
  int coordBoxH;
  int coordBoxL;
  int coordBoxR;
  int coordBoxTop;
  int coordBoxBase;
  int timerLocation = 2;
  int clockBoxW;
  int clockBoxH;
  int clockBoxL;
  int clockBoxR;
  int clockBoxTop;
  int clockBoxBase;
  int myTimerLine;
  int myTimerOffset;
  int fpsLocation = 1;
  int fpsBoxW;
  int fpsBoxH;
  int fpsBoxL;
  int fpsBoxR;
  int fpsBoxTop;
  int fpsBoxBase;
  int myFPSLine;
  int myFPSOffset;
  public String myChevronUp = "+";
  public String myChevronDown = "-";
  public static final String[] myCardinalPoint = { "N", "NE", "E", "SE", "S", "SW", "W", "NW" };
  public static final String[] myColourList = { "black", "darkblue", "darkgreen", "darkaqua", "darkred", "purple", "brown", "grey", "darkgrey", "blue", "green", "aqua", "sage", "violet", "orange", "lime", "silver", "coolblue", "red", "gold", "oldgold", "lightpurple", "pink", "yellow", "white" };
  public static final int[] myColourCodes = { 0, 170, 43520, 43690, 11141120, 11141290, 11162880, 11184810, 5592405, 5592575, 5635925, 5636095, 8956416, 8934860, 13391104, 13434624, 13421772, 13434879, 16733525, 16755200, 16746496, 16733695, 16755370, 16777045, 16777215 };
  public int myMoon;
  public File optionsFile;
  public File runtimeFile;
  public int secondCounter = 0;
  public int minuteCounter = 0;
  public int hourCounter = 0;
  public int tickCounter = 0;
  Properties propts = new Properties();
  Properties proprt = new Properties();
  public static avb hideunhideCoordskey = new avb("Hide / Unhide Coords", 75, "Batty's Coordinates");
  public static avb moveCoordScreenPos = new avb("Change Coords Screen Position", 79, "Batty's Coordinates");
  public static avb copyCoordsClipboard = new avb("Copy Coords to Clipboard", 71, "Batty's Coordinates");
  public static avb hideunhideTimerkey = new avb("Hide / Unhide Timer", 76, "Batty's Timer");
  public static avb startstopTimerkey = new avb("Start / Stop Timer", 83, "Batty's Timer");
  public static avb resetTimerkey = new avb("Reset Timer to Zero", 82, "Batty's Timer");
  public static avb moveTimerScreenPos = new avb("Change Timer Screen Position", 80, "Batty's Timer");
  public static avb hideunhideFPSkey = new avb("Hide / Unhide FPS", 77, "Batty's FPS");
  public static avb moveFPSScreenPos = new avb("Change FPS Screen Position", 81, "Batty's FPS");
  
  public BattyUI(ave par1Minecraft)
  {
    BattyMod.getInstance().setBatheartgui(this);
    this.mc = par1Minecraft;
    
    this.optionsFile = new File(this.mc.v, "BatMod.properties");
    this.runtimeFile = new File(this.mc.v, "BatMod.runtime");
    
    BattyConfig.retrieveOptions();
    BattyConfig.retrieveRuntimeOptions();
    
    List<avb> keybindings = Arrays.asList(new avb[] { hideunhideCoordskey, moveCoordScreenPos, copyCoordsClipboard, hideunhideTimerkey, resetTimerkey, moveTimerScreenPos, startstopTimerkey, hideunhideFPSkey, moveFPSScreenPos });
    try
    {
      BufferedReader bufferedreader = new BufferedReader(new FileReader(new File(this.mc.v, "options.txt")));
      
      String s = "";
      while ((s = bufferedreader.readLine()) != null) {
        for (avb keybinding : keybindings)
        {
          String[] astring = s.split(":");
          if (astring[0].equals("key_" + keybinding.g())) {
            keybinding.b(Integer.parseInt(astring[1]));
          }
        }
      }
    }
    catch (Exception e)
    {
      e.printStackTrace();
    }
    for (avb keybinding : keybindings) {
      this.mc.t.aw = ((avb[])ArrayUtils.add(this.mc.t.aw, keybinding));
    }
  }
  
  public void drawTexture(int x, int y, int u, int v, int width, int height, jy resourceLocation, float scaler)
  {
    x = (int)(x / scaler);
    y = (int)(y / scaler);
    
    GL11.glPushMatrix();
    GL11.glDisable(2896);
    GL11.glScalef(scaler, scaler, scaler);
    
    this.mc.P().a(resourceLocation);
    b(x, y, u, v, width, height);
    
    GL11.glPopMatrix();
  }
  
  protected void drawLogoTexture(int x, int y)
  {
    GL11.glEnable(3042);
    GL11.glBlendFunc(770, 771);
    GL11.glColor4f(255.0F, 255.0F, 255.0F, 255.0F);
    
    drawTexture(x, y, batLogoU, batLogoV, (int)(batLogoX / batLogoScaler), (int)(batLogoY / batLogoScaler), batUIResourceLocation, batLogoScaler);
    
    GL11.glDisable(3042);
  }
  
  public void renderPlayerCoords()
  {
    GL11.glEnable(3008);
    avn var8 = this.mc.k;
    
    avr myRes = new avr(this.mc);
    
    cj var1 = new cj(this.mc.ac().s, this.mc.ac().aR().b, this.mc.ac().u);
    this.myPosX = ns.c(this.mc.h.s);
    this.myXminus = (this.mc.h.s < 0.0D);
    this.myPosY = ns.c(this.mc.h.aR().b);
    this.myPosZ = ns.c(this.mc.h.u);
    this.myZminus = (this.mc.h.u < 0.0D);
    this.myAngle = BattyUtils.getCardinalPoint(this.mc.h.y);
    
    this.myDir = (ns.c(this.mc.h.y * 4.0F / 360.0F + 0.5D) & 0x3);
    
    int compassW = this.mc.k.a(myCardinalPoint[7]);
    if (this.showCoords > 2)
    {
      this.coordBoxW = 104;
      this.coordBoxH = 40;
    }
    else
    {
      this.coordBoxW = 80;
      this.coordBoxH = 30;
    }
    switch (this.coordLocation)
    {
    case 0: 
      this.coordBoxR = (this.coordBoxW + 1);
      this.coordBoxBase = (this.coordBoxH + 1);
      break;
    case 1: 
      this.coordBoxR = (myRes.a() - 1);
      this.coordBoxBase = (this.coordBoxH + 1);
      break;
    case 2: 
      this.coordBoxR = (myRes.a() - 1);
      this.coordBoxBase = (myRes.b() - 1);
      break;
    case 3: 
      this.coordBoxR = (this.coordBoxW + 1);
      this.coordBoxBase = (myRes.b() - 1);
    }
    this.coordBoxL = (this.coordBoxR - this.coordBoxW);
    this.coordBoxTop = (this.coordBoxBase - this.coordBoxH);
    this.myXLine = (this.coordBoxTop + 1);
    this.myYLine = (this.myXLine + 10);
    this.myZLine = (this.myYLine + 10);
    this.myBiomeLine = (this.myZLine + 10);
    this.myBaseOffset = (this.coordBoxL + 1);
    this.myCoord0Offset = (this.myBaseOffset + 10);
    this.myCoord1Offset = (this.myBaseOffset + 16);
    this.myCoord2Offset = (this.myBaseOffset + 39);
    if (this.showCoords == 3) {
      this.myRHSlocation = (this.coordBoxR - compassW - 14);
    } else if (this.showCoords > 2) {
      this.myRHSlocation = (this.coordBoxR - compassW - 1);
    } else {
      this.myRHSlocation = (this.myBaseOffset + 64);
    }
    if (this.shadedCoords) {
      a(this.coordBoxL, this.coordBoxTop, this.coordBoxR, this.coordBoxBase, this.myRectColour);
    }
    var8.a(String.format("x: ", new Object[0]), this.myBaseOffset, this.myXLine, this.myTitleText);
    
    var8.a(String.format("y: ", new Object[0]), this.myBaseOffset, this.myYLine, this.myTitleText);
    
    var8.a(String.format("z: ", new Object[0]), this.myBaseOffset, this.myZLine, this.myTitleText);
    if (this.showCoords < 4)
    {
      if (!this.myXminus)
      {
        var8.a(String.format("%d", new Object[] { Integer.valueOf(this.myPosX) }), this.myCoord1Offset, this.myXLine, this.myPosCoordText);
      }
      else
      {
        var8.a("-", this.myCoord0Offset, this.myXLine, this.myNegCoordText);
        var8.a(String.format("%d", new Object[] { Integer.valueOf(Math.abs(this.myPosX)) }), this.myCoord1Offset, this.myXLine, this.myNegCoordText);
      }
      var8.a(String.format("%d", new Object[] { Integer.valueOf(this.myPosY) }), this.myCoord1Offset, this.myYLine, this.myPosCoordText);
      if (!this.myZminus)
      {
        var8.a(String.format("%d", new Object[] { Integer.valueOf(this.myPosZ) }), this.myCoord1Offset, this.myZLine, this.myPosCoordText);
      }
      else
      {
        var8.a("-", this.myCoord0Offset, this.myZLine, this.myNegCoordText);
        var8.a(String.format("%d", new Object[] { Integer.valueOf(Math.abs(this.myPosZ)) }), this.myCoord1Offset, this.myZLine, this.myNegCoordText);
      }
    }
    else
    {
      if (this.myPosX >= 0)
      {
        var8.a(String.format("c%d ", new Object[] { Integer.valueOf(this.myPosX >> 4) }), this.myCoord2Offset, this.myXLine, this.myPosChunkText);
        
        var8.a(String.format("b%d", new Object[] { Integer.valueOf(this.myPosX & 0xF) }), this.myCoord1Offset, this.myXLine, this.myPosChunkText);
      }
      else
      {
        var8.a(String.format("c%d ", new Object[] { Integer.valueOf(this.myPosX >> 4) }), this.myCoord2Offset, this.myXLine, this.myNegChunkText);
        
        var8.a(String.format("b%d", new Object[] { Integer.valueOf(this.myPosX & 0xF) }), this.myCoord1Offset, this.myXLine, this.myPosChunkText);
      }
      var8.a(String.format("%d", new Object[] { Integer.valueOf(this.myPosY) }), this.myCoord1Offset, this.myYLine, this.myPosCoordText);
      if (this.myPosZ >= 0)
      {
        var8.a(String.format("c%d ", new Object[] { Integer.valueOf(this.myPosZ >> 4) }), this.myCoord2Offset, this.myZLine, this.myPosChunkText);
        
        var8.a(String.format("b%d", new Object[] { Integer.valueOf(this.myPosZ & 0xF) }), this.myCoord1Offset, this.myZLine, this.myPosChunkText);
      }
      else
      {
        var8.a(String.format("c%d ", new Object[] { Integer.valueOf(this.myPosZ >> 4) }), this.myCoord2Offset, this.myZLine, this.myNegChunkText);
        
        var8.a(String.format("b%d", new Object[] { Integer.valueOf(this.myPosZ & 0xF) }), this.myCoord1Offset, this.myZLine, this.myPosChunkText);
      }
    }
    drawLogoTexture(this.myRHSlocation - 12, this.myYLine - 1);
    
    var8.a(myCardinalPoint[this.myAngle], this.myRHSlocation, this.myYLine, this.myCompassText);
    if (this.showCoords > 1) {
      switch (this.myAngle)
      {
      case 0: 
        var8.a(this.myChevronDown + this.myChevronDown, this.myRHSlocation, this.myZLine, this.myNegCoordText);
        
        break;
      case 1: 
        var8.a(this.myChevronDown, this.myRHSlocation, this.myZLine, this.myNegCoordText);
        
        var8.a(this.myChevronUp, this.myRHSlocation, this.myXLine, this.myPosCoordText);
        
        break;
      case 2: 
        var8.a(this.myChevronUp + this.myChevronUp, this.myRHSlocation, this.myXLine, this.myPosCoordText);
        
        break;
      case 3: 
        var8.a(this.myChevronUp, this.myRHSlocation, this.myXLine, this.myPosCoordText);
        
        var8.a(this.myChevronUp, this.myRHSlocation, this.myZLine, this.myPosCoordText);
        
        break;
      case 4: 
        var8.a(this.myChevronUp + this.myChevronUp, this.myRHSlocation, this.myZLine, this.myPosCoordText);
        
        break;
      case 5: 
        var8.a(this.myChevronUp, this.myRHSlocation, this.myZLine, this.myPosCoordText);
        
        var8.a(this.myChevronDown, this.myRHSlocation, this.myXLine, this.myNegCoordText);
        
        break;
      case 6: 
        var8.a(this.myChevronDown + this.myChevronDown, this.myRHSlocation, this.myXLine, this.myNegCoordText);
        
        break;
      case 7: 
        var8.a(this.myChevronDown, this.myRHSlocation, this.myXLine, this.myNegCoordText);
        
        var8.a(this.myChevronDown, this.myRHSlocation, this.myZLine, this.myNegCoordText);
      }
    }
    if ((this.showCoords > 2) && (this.mc.f != null) && (this.mc.f.e(var1)))
    {
      amy var26 = this.mc.f.f(var1);
      var8.a(var26.a(var1, this.mc.f.v()).ah, this.myBaseOffset, this.myBiomeLine, this.myBiomeText);
    }
  }
  
  public void renderPlayerTimer()
  {
    GL11.glEnable(3008);
    avr myRes = new avr(this.mc);
    String myTime = BattyUtils.constructTimeString();
    int timeStringWid = this.mc.k.a(myTime);
    this.clockBoxW = (12 + timeStringWid);
    this.clockBoxH = 10;
    switch (this.timerLocation)
    {
    case 0: 
      this.clockBoxR = (this.clockBoxW + 1);
      this.clockBoxBase = (this.clockBoxH + 1);
      if (this.coordLocation == 0) {
        this.clockBoxBase += this.coordBoxH + 1;
      }
      break;
    case 1: 
      this.clockBoxR = (myRes.a() / 2 + this.clockBoxW / 2);
      this.clockBoxBase = (this.clockBoxH + 1);
      break;
    case 2: 
      this.clockBoxR = (myRes.a() - 1);
      this.clockBoxBase = (this.clockBoxH + 1);
      if (this.coordLocation == 1) {
        this.clockBoxBase += this.coordBoxH + 1;
      }
      break;
    case 3: 
      this.clockBoxR = (myRes.a() - 1);
      this.clockBoxBase = (myRes.b() - 1);
      if (this.coordLocation == 2) {
        this.clockBoxBase -= this.coordBoxH + 1;
      }
      break;
    case 4: 
      this.clockBoxR = (this.clockBoxW + 1);
      this.clockBoxBase = (myRes.b() - 15);
      if (this.coordLocation == 3) {
        this.clockBoxBase -= this.coordBoxH + 1;
      }
      break;
    }
    this.clockBoxL = (this.clockBoxR - this.clockBoxW);
    this.clockBoxTop = (this.clockBoxBase - this.clockBoxH);
    
    this.myTimerLine = (this.clockBoxTop + 1);
    this.myTimerOffset = (this.clockBoxL + 6);
    if (this.shadedTimer) {
      a(this.clockBoxL, this.clockBoxTop, this.clockBoxR, this.clockBoxBase, this.myRectColour);
    }
    if (this.timerRunning) {
      this.mc.k.a(myTime, this.myTimerOffset, this.myTimerLine, this.myTimerRunText);
    } else {
      this.mc.k.a(myTime, this.myTimerOffset, this.myTimerLine, this.myTimerStopText);
    }
  }
  
  public void renderPlayerFPS()
  {
    GL11.glEnable(3008);
    avr myRes = new avr(this.mc);
    String myFPS = this.mc.C.split(" ")[0] + " FPS";
    int fpsStringWid = this.mc.k.a(myFPS);
    this.fpsBoxW = (12 + fpsStringWid);
    this.fpsBoxH = 10;
    switch (this.fpsLocation)
    {
    case 0: 
      this.fpsBoxR = (this.fpsBoxW + 1);
      this.fpsBoxBase = (this.fpsBoxH + 1);
      if (this.timerLocation == 0) {
        this.fpsBoxBase += this.clockBoxH + 1;
      }
      if (this.coordLocation == 0) {
        this.fpsBoxBase += this.coordBoxH + 1;
      }
      break;
    case 1: 
      this.fpsBoxR = (myRes.a() / 2 + this.fpsBoxW / 2);
      this.fpsBoxBase = (this.fpsBoxH + 1);
      if (this.timerLocation == 1) {
        this.fpsBoxBase += this.clockBoxH + 1;
      }
      break;
    case 2: 
      this.fpsBoxR = (myRes.a() - 1);
      this.fpsBoxBase = (this.fpsBoxH + 1);
      if (this.timerLocation == 2) {
        this.fpsBoxBase += this.clockBoxH + 1;
      }
      if (this.coordLocation == 1) {
        this.fpsBoxBase += this.coordBoxH + 1;
      }
      break;
    case 3: 
      this.fpsBoxR = (myRes.a() - 1);
      this.fpsBoxBase = (myRes.b() - 1);
      if (this.timerLocation == 3) {
        this.fpsBoxBase -= this.clockBoxH + 1;
      }
      if (this.coordLocation == 2) {
        this.fpsBoxBase -= this.coordBoxH + 1;
      }
      break;
    case 4: 
      this.fpsBoxR = (this.fpsBoxW + 1);
      this.fpsBoxBase = (myRes.b() - 15);
      if (this.timerLocation == 4) {
        this.fpsBoxBase -= this.clockBoxH + 1;
      }
      if (this.coordLocation == 3) {
        this.fpsBoxBase -= this.coordBoxH + 1;
      }
      break;
    }
    this.fpsBoxL = (this.fpsBoxR - this.fpsBoxW);
    this.fpsBoxTop = (this.fpsBoxBase - this.fpsBoxH);
    
    this.myFPSLine = (this.fpsBoxTop + 1);
    this.myFPSOffset = (this.fpsBoxL + 6);
    if (this.shadedFPS) {
      a(this.fpsBoxL, this.fpsBoxTop, this.fpsBoxR, this.fpsBoxBase, this.myRectColour);
    }
    this.mc.k.a(myFPS, this.myFPSOffset, this.myFPSLine, this.myFPSText);
  }
  
  public void hideUnhideCoords()
  {
    this.showCoords += 1;
    if (this.showCoords > 4) {
      this.showCoords = 0;
    }
    BattyConfig.storeRuntimeOptions();
  }
  
  public void rotateScreenCoords()
  {
    this.coordLocation += 1;
    if (this.coordLocation > 2) {
      this.coordLocation = 0;
    }
    BattyConfig.storeRuntimeOptions();
  }
  
  public void copyScreenCoords()
  {
    StringSelection myCoordString;
    StringSelection myCoordString;
    if (this.coordsCopyTPFormat) {
      myCoordString = new StringSelection(this.myPosX + " " + this.myPosY + " " + this.myPosZ);
    } else {
      myCoordString = new StringSelection("x:" + this.myPosX + " y:" + this.myPosY + " z:" + this.myPosZ);
    }
    Toolkit.getDefaultToolkit().getSystemClipboard().setContents(myCoordString, null);
  }
  
  public void hideUnhideStopWatch()
  {
    this.hideTimer = (!this.hideTimer);
    BattyConfig.storeRuntimeOptions();
  }
  
  public void rotateScreenTimer()
  {
    this.timerLocation += 1;
    if (this.timerLocation > 4) {
      this.timerLocation = 0;
    }
    BattyConfig.storeRuntimeOptions();
  }
  
  public void hideUnhideFPS()
  {
    this.hideFPS = (!this.hideFPS);
    BattyConfig.storeRuntimeOptions();
  }
  
  public void rotateScreenFPS()
  {
    this.fpsLocation += 1;
    if (this.fpsLocation > 3) {
      this.fpsLocation = 0;
    }
    BattyConfig.storeRuntimeOptions();
  }
  
  public void renderPlayerInfo()
  {
    if (!this.mc.t.aB)
    {
      if (this.showCoords > 0) {
        renderPlayerCoords();
      } else {
        this.coordBoxH = 0;
      }
      if (this.hideTimer) {
        this.clockBoxH = 0;
      } else {
        renderPlayerTimer();
      }
      if (!this.hideFPS) {
        renderPlayerFPS();
      }
    }
  }
}
