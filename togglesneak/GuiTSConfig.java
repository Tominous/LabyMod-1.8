package togglesneak;

import ave;
import avn;
import avs;
import axu;
import de.labystudio.modapi.ModAPI;
import java.util.List;

public class GuiTSConfig
  extends axu
{
  private avs btnToggleSneak;
  private avs btnToggleSprint;
  private avs btnShowHUDText;
  private avs btnDoubleTap;
  private avs btnFlyBoost;
  private avs btnSaveSettings;
  private avs btnPositionMode;
  private GuiSlideControl sliderHUDTextPosX;
  private GuiSlideControl sliderHUDTextPosY;
  private GuiSlideControl sliderFlyBoostAmount;
  private avs lastPressed;
  private boolean changedShowHUD;
  private boolean changedToggleSprint;
  private int headerPos;
  private int footerPos;
  private byte byte0 = -16;
  
  public void b()
  {
    n.clear();
    
    headerPos = (m / 4 - 52);
    footerPos = (m - 29);
    
    btnToggleSneak = new avs(1, l / 2 - 98, getRowPos(1), 60, 20, String.valueOf(ToggleSneakMod.optionToggleSneak));
    btnToggleSprint = new avs(2, l / 2 + 102, getRowPos(1), 60, 20, String.valueOf(ToggleSneakMod.optionToggleSprint));
    btnShowHUDText = new avs(3, l / 2 + 2, getRowPos(2), 60, 20, String.valueOf(ToggleSneakMod.optionShowHUDText));
    btnPositionMode = new avs(133, l / 2 + 2, getRowPos(3), 60, 20, ToggleSneakMod.optionPositionMode);
    
    sliderHUDTextPosX = new GuiSlideControl(50, l / 2 + 2, getRowPos(4), 150, 20, "X Pos: ", 1.0F, l - 25, ToggleSneakMod.optionHUDTextPosX, true);
    sliderHUDTextPosY = new GuiSlideControl(60, l / 2 + 2, getRowPos(5), 150, 20, "Y Pos: ", 1.0F, m - 8, ToggleSneakMod.optionHUDTextPosY, true);
    
    btnDoubleTap = new avs(4, l / 2 + 2, getRowPos(6), 60, 20, String.valueOf(ToggleSneakMod.optionDoubleTap));
    btnFlyBoost = new avs(5, l / 2 - 113, getRowPos(7), 60, 20, String.valueOf(ToggleSneakMod.optionEnableFlyBoost));
    
    sliderFlyBoostAmount = new GuiSlideControl(70, l / 2 + 57, getRowPos(7), 150, 20, "x", 0.0F, 10.0F, (float)ToggleSneakMod.optionFlyBoostAmount, false);
    
    btnSaveSettings = new avs(100, l / 2 - 30, footerPos, 60, 20, "Done");
    
    n.add(btnToggleSneak);
    n.add(btnToggleSprint);
    n.add(btnShowHUDText);
    n.add(btnPositionMode);
    if (ToggleSneakMod.optionPositionMode.equals("CUSTOM"))
    {
      n.add(sliderHUDTextPosX);
      n.add(sliderHUDTextPosY);
    }
    n.add(btnDoubleTap);
    n.add(btnFlyBoost);
    n.add(sliderFlyBoostAmount);
    
    n.add(btnSaveSettings);
  }
  
  public int getRowPos(int rowNumber)
  {
    return rowNumber > 3 ? m / 4 + 0 + (24 * (rowNumber - (ToggleSneakMod.optionPositionMode.equals("CUSTOM") ? 0 : 2)) - 24) + byte0 : m / 4 + 0 + (24 * rowNumber - 24) + byte0;
  }
  
  protected void a(int mouseX, int mouseY, int mouseButton)
  {
    if (mouseButton == 0) {
      for (int l = 0; l < n.size(); l++)
      {
        avs guibutton = (avs)n.get(l);
        if (guibutton.c(j, mouseX, mouseY))
        {
          lastPressed = guibutton;
          a(guibutton);
        }
      }
    }
  }
  
  protected void b(int mouseX, int mouseY, int which)
  {
    if ((lastPressed != null) && (which == 0))
    {
      lastPressed.a(mouseX, mouseY);
      
      actionPerformed_MouseUp(lastPressed);
      
      lastPressed = null;
    }
  }
  
  protected void actionPerformed_MouseUp(avs button)
  {
    if ((button instanceof GuiSlideControl)) {
      a(button);
    }
  }
  
  protected void a(avs button)
  {
    switch (k)
    {
    case 1: 
      ToggleSneakMod.optionToggleSneak = !ToggleSneakMod.optionToggleSneak;
      btnToggleSneak.j = String.valueOf(ToggleSneakMod.optionToggleSneak);
      break;
    case 2: 
      ToggleSneakMod.optionToggleSprint = !ToggleSneakMod.optionToggleSprint;
      btnToggleSprint.j = String.valueOf(ToggleSneakMod.optionToggleSprint);
      changedToggleSprint = true;
      break;
    case 3: 
      ToggleSneakMod.optionShowHUDText = !ToggleSneakMod.optionShowHUDText;
      btnShowHUDText.j = String.valueOf(ToggleSneakMod.optionShowHUDText);
      changedShowHUD = true;
      break;
    case 133: 
      String nextMode = PositionMode.getNext(ToggleSneakMod.optionPositionMode).name();
      ToggleSneakMod.optionPositionMode = nextMode;
      btnPositionMode.j = nextMode;
      b();
      break;
    case 4: 
      ToggleSneakMod.optionDoubleTap = !ToggleSneakMod.optionDoubleTap;
      btnDoubleTap.j = String.valueOf(ToggleSneakMod.optionDoubleTap);
      break;
    case 5: 
      ToggleSneakMod.optionEnableFlyBoost = !ToggleSneakMod.optionEnableFlyBoost;
      btnFlyBoost.j = String.valueOf(ToggleSneakMod.optionEnableFlyBoost);
      break;
    case 50: 
      ToggleSneakMod.optionHUDTextPosX = sliderHUDTextPosX.GetValueAsInt();
      break;
    case 60: 
      ToggleSneakMod.optionHUDTextPosY = sliderHUDTextPosY.GetValueAsInt();
      break;
    case 70: 
      ToggleSneakMod.optionFlyBoostAmount = sliderFlyBoostAmount.GetValueAsFloat();
      break;
    case 100: 
      j.a(ModAPI.getLastScreen());
    }
    saveAll();
  }
  
  private void saveAll()
  {
    if (changedShowHUD) {
      ToggleSneakModEvents.SetHUDText("");
    }
    if ((changedToggleSprint) && (j.f != null)) {
      ToggleSneakMod.wasSprintDisabled = true;
    }
    ToggleSneakMod.saveConfig();
    
    changedShowHUD = false;
    changedToggleSprint = false;
  }
  
  public void a(int mouseX, int mouseY, float partialTicks)
  {
    String lblToggleSneak = "Enable ToggleSneak";
    String lblToggleSprint = "Enable ToggleSprint";
    String lblShowHUDText = "Show status on HUD";
    String lblHUDTextPosX = "Horizontal HUD Location";
    String lblHUDTextPosY = "Vertical HUD Location";
    String lblDoubleTap = "Enable Double-Tapping";
    String lblFlyBoost = "Enable Fly Boost";
    String lblFlyBoostAmount = "Fly Boost Multiplier";
    String lblPositionMode = "HUD Position-Mode";
    
    c();
    
    a(q, "ToggleSneak Settings", l / 2, headerPos, 16777215);
    
    c(q, lblToggleSneak, l / 2 - 100 - q.a(lblToggleSneak), getRowPos(1) + 6, 16777215);
    c(q, lblToggleSprint, l / 2 + 100 - q.a(lblToggleSprint), getRowPos(1) + 6, 16777215);
    c(q, lblShowHUDText, l / 2 - 3 - q.a(lblShowHUDText), getRowPos(2) + 6, 16777215);
    c(q, lblPositionMode, l / 2 - 3 - q.a(lblPositionMode), getRowPos(3) + 6, 16777215);
    if (ToggleSneakMod.optionPositionMode.equals("CUSTOM"))
    {
      c(q, lblHUDTextPosX, l / 2 - 3 - q.a(lblHUDTextPosX), getRowPos(4) + 6, 16777215);
      c(q, lblHUDTextPosY, l / 2 - 3 - q.a(lblHUDTextPosY), getRowPos(5) + 6, 16777215);
    }
    c(q, lblDoubleTap, l / 2 - 3 - q.a(lblDoubleTap), getRowPos(6) + 6, 16777215);
    c(q, lblFlyBoost, l / 2 - 115 - q.a(lblFlyBoost), getRowPos(7) + 6, 16777215);
    c(q, lblFlyBoostAmount, l / 2 + 50 - q.a(lblFlyBoostAmount), getRowPos(7) + 6, 16777215);
    
    super.a(mouseX, mouseY, partialTicks);
  }
}
