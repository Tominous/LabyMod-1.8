package directionhud;

import ave;
import avn;
import avs;
import axu;
import de.labystudio.modapi.ModAPI;
import java.util.List;

public class GuiDHConfig
  extends axu
{
  private avs btnEnable;
  private avs btnShowWhileChat;
  private avs btnPositionMode;
  private avs btnMarkerColor;
  private avs btnSaveSettings;
  private GuiSlideControl sliderCustomX;
  private GuiSlideControl sliderCustomY;
  private avs lastPressed;
  private int headerPos;
  private int footerPos;
  private byte byte0 = -16;
  
  public void b()
  {
    n.clear();
    
    headerPos = (m / 4 - 52);
    footerPos = (m - 29);
    
    btnEnable = new avs(1, l / 2 - 98, getRowPos(1), 60, 20, String.valueOf(DirectionHUD.optionEnable));
    btnShowWhileChat = new avs(2, l / 2 + 102, getRowPos(1), 60, 20, String.valueOf(DirectionHUD.showWhileChat));
    btnMarkerColor = new avs(3, l / 2 + 2, getRowPos(2), 60, 20, DirectionHUD.optionMarkerColor);
    btnPositionMode = new avs(133, l / 2 + 2, getRowPos(3), 60, 20, DirectionHUD.optionPositionMode);
    
    sliderCustomX = new GuiSlideControl(50, l / 2 + 2, getRowPos(4), 150, 20, "X Pos: ", 1.0F, l - 25, DirectionHUD.optionCustomX, true);
    sliderCustomY = new GuiSlideControl(60, l / 2 + 2, getRowPos(5), 150, 20, "Y Pos: ", 1.0F, m - 8, DirectionHUD.optionCustomY, true);
    
    btnSaveSettings = new avs(100, l / 2 - 30, footerPos, 60, 20, "Done");
    
    n.add(btnEnable);
    n.add(btnShowWhileChat);
    n.add(btnMarkerColor);
    n.add(btnPositionMode);
    if (DirectionHUD.optionPositionMode.equals("CUSTOM"))
    {
      n.add(sliderCustomX);
      n.add(sliderCustomY);
    }
    n.add(btnSaveSettings);
  }
  
  public int getRowPos(int rowNumber)
  {
    return rowNumber > 3 ? m / 4 + 0 + (24 * (rowNumber - (DirectionHUD.optionPositionMode.equals("CUSTOM") ? 0 : 2)) - 24) + byte0 : m / 4 + 0 + (24 * rowNumber - 24) + byte0;
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
      DirectionHUD.optionEnable = !DirectionHUD.optionEnable;
      btnEnable.j = String.valueOf(DirectionHUD.optionEnable);
      break;
    case 2: 
      DirectionHUD.showWhileChat = !DirectionHUD.showWhileChat;
      btnShowWhileChat.j = String.valueOf(DirectionHUD.showWhileChat);
      break;
    case 3: 
      DirectionHUD.optionMarkerColor = DirectionHUD.getNextColor(DirectionHUD.optionMarkerColor);
      btnMarkerColor.j = DirectionHUD.optionMarkerColor;
      break;
    case 133: 
      String nextMode = PositionMode.getNext(DirectionHUD.optionPositionMode).name();
      DirectionHUD.optionPositionMode = nextMode;
      btnPositionMode.j = nextMode;
      b();
      break;
    case 50: 
      DirectionHUD.optionCustomX = sliderCustomX.GetValueAsInt();
      break;
    case 60: 
      DirectionHUD.optionCustomY = sliderCustomY.GetValueAsInt();
      break;
    case 100: 
      j.a(ModAPI.getLastScreen());
    }
    saveAll();
  }
  
  private void saveAll() {}
  
  public void a(int mouseX, int mouseY, float partialTicks)
  {
    String lblEnable = "Enable";
    String lblShowInChat = "Show while chat";
    String lblMarkerColor = "Marker-Color";
    String lblCustomX = "Custom X Position";
    String lblCustomY = "Custom Y Position";
    String lblPositionMode = "Position-Mode";
    
    c();
    
    a(q, "DirectionHUD Settings", l / 2, headerPos, 16777215);
    
    c(q, lblEnable, l / 2 - 100 - q.a(lblEnable), getRowPos(1) + 6, 16777215);
    c(q, lblShowInChat, l / 2 + 100 - q.a(lblShowInChat), getRowPos(1) + 6, 16777215);
    c(q, lblMarkerColor, l / 2 - 3 - q.a(lblMarkerColor), getRowPos(2) + 6, 16777215);
    c(q, lblPositionMode, l / 2 - 3 - q.a(lblPositionMode), getRowPos(3) + 6, 16777215);
    if (DirectionHUD.optionPositionMode.equals("CUSTOM"))
    {
      c(q, lblCustomX, l / 2 - 3 - q.a(lblCustomX), getRowPos(4) + 6, 16777215);
      c(q, lblCustomY, l / 2 - 3 - q.a(lblCustomY), getRowPos(5) + 6, 16777215);
    }
    super.a(mouseX, mouseY, partialTicks);
  }
}
