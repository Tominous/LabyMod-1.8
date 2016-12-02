package net.minecraft.realms;

import eu;
import java.util.List;

public class DisconnectedRealmsScreen
  extends RealmsScreen
{
  private String title;
  private eu reason;
  private List<String> lines;
  private final RealmsScreen parent;
  private int textHeight;
  
  public DisconnectedRealmsScreen(RealmsScreen ☃, String ☃, eu ☃)
  {
    parent = ☃;
    title = getLocalizedString(☃);
    reason = ☃;
  }
  
  public void init()
  {
    Realms.setConnectedToRealms(false);
    
    buttonsClear();
    
    lines = fontSplit(reason.d(), width() - 50);
    textHeight = (lines.size() * fontLineHeight());
    
    buttonsAdd(newButton(0, width() / 2 - 100, height() / 2 + textHeight / 2 + fontLineHeight(), getLocalizedString("gui.back")));
  }
  
  public void keyPressed(char ☃, int ☃)
  {
    if (☃ == 1) {
      Realms.setScreen(parent);
    }
  }
  
  public void buttonClicked(RealmsButton ☃)
  {
    if (☃.id() == 0) {
      Realms.setScreen(parent);
    }
  }
  
  public void render(int ☃, int ☃, float ☃)
  {
    renderBackground();
    
    drawCenteredString(title, width() / 2, height() / 2 - textHeight / 2 - fontLineHeight() * 2, 11184810);
    
    int ☃ = height() / 2 - textHeight / 2;
    if (lines != null) {
      for (String ☃ : lines)
      {
        drawCenteredString(☃, width() / 2, ☃, 16777215);
        ☃ += fontLineHeight();
      }
    }
    super.render(☃, ☃, ☃);
  }
}
