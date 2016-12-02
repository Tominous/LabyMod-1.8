package mods.batty.main;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class BattyConfig
{
  private static BattyUI ui = BattyMod.getInstance().getBatheartgui();
  
  public static void retrieveOptions()
  {
    if (uioptionsFile.exists()) {
      try
      {
        FileInputStream fis = new FileInputStream(uioptionsFile);
        try
        {
          uipropts.load(fis);
        }
        catch (IOException ex)
        {
          ex.printStackTrace();
        }
      }
      catch (FileNotFoundException var5)
      {
        var5.printStackTrace();
      }
    }
    String myShade = uipropts.getProperty("Coords.shade");
    String myTxtChr1 = uipropts.getProperty("Coords.chars.Increase");
    String myTxtChr2 = uipropts.getProperty("Coords.chars.Decrease");
    String myTxtCol1 = uipropts.getProperty("Coords.colours.TitleText");
    String myTxtCol6 = uipropts.getProperty("Coords.colours.CoordText");
    String myTxtCol2 = uipropts.getProperty("Coords.colours.PosCoordText");
    String myTxtCol7 = uipropts.getProperty("Coords.colours.NegCoordText");
    String myTxtCol3 = uipropts.getProperty("Coords.colours.CompassText");
    String myTxtCol4 = uipropts.getProperty("Coords.colours.ChevronText");
    String myTxtCol5 = uipropts.getProperty("Coords.colours.BiomeText");
    String myTxtCol8 = uipropts.getProperty("Coords.colours.PosChunkText");
    String myTxtCol9 = uipropts.getProperty("Coords.colours.NegChunkText");
    String myTxtFmt1 = uipropts.getProperty("Coords.copy.tpFormat");
    if (myShade != null) {
      uishadedCoords = myShade.equals("true");
    }
    if (myTxtChr1 != null) {
      if (myTxtChr1.length() > 1) {
        uimyChevronUp = myTxtChr1.substring(0, 1);
      } else {
        uimyChevronUp = myTxtChr1;
      }
    }
    if (myTxtChr2 != null) {
      if (myTxtChr2.length() > 1) {
        uimyChevronDown = myTxtChr2.substring(0, 1);
      } else {
        uimyChevronDown = myTxtChr2;
      }
    }
    if (myTxtCol1 != null)
    {
      uimyFind = BattyUtils.nameSearch(BattyUI.myColourList, myTxtCol1);
      if (uimyFind != -1) {
        uimyTitleText = BattyUI.myColourCodes[uimyFind];
      }
    }
    if (myTxtCol2 != null)
    {
      uimyFind = BattyUtils.nameSearch(BattyUI.myColourList, myTxtCol2);
      if (uimyFind != -1) {
        uimyPosCoordText = BattyUI.myColourCodes[uimyFind];
      }
    }
    if (myTxtCol7 != null)
    {
      uimyFind = BattyUtils.nameSearch(BattyUI.myColourList, myTxtCol7);
      if (uimyFind != -1) {
        uimyNegCoordText = BattyUI.myColourCodes[uimyFind];
      }
    }
    if (myTxtCol3 != null)
    {
      uimyFind = BattyUtils.nameSearch(BattyUI.myColourList, myTxtCol3);
      if (uimyFind != -1) {
        uimyCompassText = BattyUI.myColourCodes[uimyFind];
      }
    }
    if (myTxtCol4 != null)
    {
      uimyFind = BattyUtils.nameSearch(BattyUI.myColourList, myTxtCol4);
      if (uimyFind != -1) {
        uimyChevronText = BattyUI.myColourCodes[uimyFind];
      }
    }
    if (myTxtCol5 != null)
    {
      uimyFind = BattyUtils.nameSearch(BattyUI.myColourList, myTxtCol5);
      if (uimyFind != -1) {
        uimyBiomeText = BattyUI.myColourCodes[uimyFind];
      }
    }
    if (myTxtCol6 != null)
    {
      uimyFind = BattyUtils.nameSearch(BattyUI.myColourList, myTxtCol6);
      if (uimyFind != -1)
      {
        uimyPosCoordText = BattyUI.myColourCodes[uimyFind];
        uimyNegCoordText = BattyUI.myColourCodes[uimyFind];
      }
    }
    if (myTxtCol8 != null)
    {
      uimyFind = BattyUtils.nameSearch(BattyUI.myColourList, myTxtCol8);
      if (uimyFind != -1) {
        uimyPosChunkText = BattyUI.myColourCodes[uimyFind];
      }
    }
    if (myTxtCol9 != null)
    {
      uimyFind = BattyUtils.nameSearch(BattyUI.myColourList, myTxtCol9);
      if (uimyFind != -1) {
        uimyNegChunkText = BattyUI.myColourCodes[uimyFind];
      }
    }
    if (myTxtFmt1 != null) {
      uicoordsCopyTPFormat = myTxtFmt1.equals("true");
    }
    myShade = uipropts.getProperty("Timer.shade");
    myTxtCol1 = uipropts.getProperty("Timer.colours.Stopped");
    myTxtCol2 = uipropts.getProperty("Timer.colours.Running");
    if (myShade != null) {
      uishadedTimer = myShade.equals("true");
    }
    if (myTxtCol1 != null)
    {
      uimyFind = BattyUtils.nameSearch(BattyUI.myColourList, myTxtCol1);
      if (uimyFind != -1) {
        uimyTimerStopText = BattyUI.myColourCodes[uimyFind];
      }
    }
    if (myTxtCol2 != null)
    {
      uimyFind = BattyUtils.nameSearch(BattyUI.myColourList, myTxtCol2);
      if (uimyFind != -1) {
        uimyTimerRunText = BattyUI.myColourCodes[uimyFind];
      }
    }
    myShade = uipropts.getProperty("FPS.shade");
    myTxtCol1 = uipropts.getProperty("FPS.colours.Text");
    if (myShade != null) {
      uishadedFPS = myShade.equals("true");
    }
    if (myTxtCol1 != null)
    {
      uimyFind = BattyUtils.nameSearch(BattyUI.myColourList, myTxtCol1);
      if (uimyFind != -1) {
        uimyFPSText = BattyUI.myColourCodes[uimyFind];
      }
    }
  }
  
  public static void retrieveRuntimeOptions()
  {
    if (uiruntimeFile.exists()) {
      try
      {
        FileInputStream fis = new FileInputStream(uiruntimeFile);
        try
        {
          uiproprt.load(fis);
        }
        catch (IOException ex)
        {
          ex.printStackTrace();
        }
      }
      catch (FileNotFoundException var5)
      {
        var5.printStackTrace();
      }
    }
    String myTimeString = uiproprt.getProperty("Timer.saved");
    if (myTimeString != null) {
      BattyUtils.parseTimeString(myTimeString);
    }
    String myCoordsVis = uiproprt.getProperty("Coords.visible");
    if (myCoordsVis != null) {
      uishowCoords = Integer.parseInt(myCoordsVis);
    }
    String myTimerVis = uiproprt.getProperty("Timer.visible");
    if (myTimerVis != null) {
      uihideTimer = (!myTimerVis.equals("true"));
    }
    String myCoordsLoc = uiproprt.getProperty("Coords.location");
    if (myCoordsLoc != null) {
      uicoordLocation = Integer.parseInt(myCoordsLoc);
    }
    String myTimerLoc = uiproprt.getProperty("Timer.location");
    if (myTimerLoc != null) {
      uitimerLocation = Integer.parseInt(myTimerLoc);
    }
    String myTimerRuns = uiproprt.getProperty("Timer.running");
    if (myTimerRuns != null) {
      uitimerRunning = myTimerRuns.equals("true");
    }
    String myFPSVis = uiproprt.getProperty("FPS.visible");
    if (myFPSVis != null) {
      uihideFPS = (!myFPSVis.equals("true"));
    }
    String myFPSLoc = uiproprt.getProperty("FPS.location");
    if (myFPSLoc != null) {
      uifpsLocation = Integer.parseInt(myFPSLoc);
    }
  }
  
  public static void storeRuntimeOptions()
  {
    uiproprt.setProperty("Timer.saved", BattyUtils.getSaveString());
    uiproprt.setProperty("Coords.visible", BattyUtils.constructCoordVisString());
    uiproprt.setProperty("Timer.visible", BattyUtils.constructTimerVisString());
    uiproprt.setProperty("Coords.location", BattyUtils.constructCoordLocString());
    uiproprt.setProperty("Timer.location", BattyUtils.constructTimerLocString());
    uiproprt.setProperty("Timer.running", BattyUtils.constructTimerRunString());
    uiproprt.setProperty("FPS.visible", BattyUtils.constructFPSVisString());
    uiproprt.setProperty("FPS.location", BattyUtils.constructFPSLocString());
    try
    {
      FileOutputStream fos = new FileOutputStream(uiruntimeFile);
      uiproprt.store(fos, null);
      fos.flush();
    }
    catch (IOException e)
    {
      e.printStackTrace();
    }
  }
}
