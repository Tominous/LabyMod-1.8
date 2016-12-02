package shadersmod.client;

import awi;
import java.util.ArrayList;

class GuiSlotShaders
  extends awi
{
  private ArrayList shaderslist;
  private int selectedIndex;
  private long lastClickedCached = 0L;
  final GuiShaders shadersGui;
  
  public GuiSlotShaders(GuiShaders par1GuiShaders, int width, int height, int top, int bottom, int slotHeight)
  {
    super(par1GuiShaders.getMc(), width, height, top, bottom, slotHeight);
    shadersGui = par1GuiShaders;
    updateList();
    
    n = 0.0F;
    int posYSelected = selectedIndex * slotHeight;
    int wMid = (bottom - top) / 2;
    if (posYSelected > wMid) {
      h(posYSelected - wMid);
    }
  }
  
  public int c()
  {
    return b - 20;
  }
  
  public void updateList()
  {
    shaderslist = Shaders.listofShaders();
    selectedIndex = 0;
    int i = 0;
    for (int n = shaderslist.size(); i < n; i++) {
      if (((String)shaderslist.get(i)).equals(Shaders.currentshadername))
      {
        selectedIndex = i;
        break;
      }
    }
  }
  
  protected int b()
  {
    return shaderslist.size();
  }
  
  protected void a(int index, boolean doubleClicked, int mouseX, int mouseY)
  {
    if ((index == selectedIndex) && (p == lastClickedCached)) {
      return;
    }
    selectedIndex = index;
    
    lastClickedCached = p;
    Shaders.setShaderPack((String)shaderslist.get(index));
    Shaders.uninit();
    
    shadersGui.updateButtons();
  }
  
  protected boolean a(int index)
  {
    return index == selectedIndex;
  }
  
  protected int d()
  {
    return b - 6;
  }
  
  protected int k()
  {
    return b() * 18;
  }
  
  protected void a() {}
  
  protected void a(int index, int posX, int posY, int contentY, int mouseX, int mouseY)
  {
    shadersGui.drawCenteredString((String)shaderslist.get(index), b / 2, posY + 1, 16777215);
  }
  
  public int getSelectedIndex()
  {
    return selectedIndex;
  }
}
