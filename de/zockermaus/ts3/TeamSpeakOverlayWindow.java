package de.zockermaus.ts3;

import ave;
import de.labystudio.gui.extras.ModGuiTextField;
import de.labystudio.labymod.LabyMod;
import de.labystudio.utils.DrawUtils;
import java.util.ArrayList;

public class TeamSpeakOverlayWindow
{
  private ArrayList<InfoMessage> info = new ArrayList();
  String infoTitle;
  boolean infoDrag;
  int infoPosX;
  int infoPosY;
  int infoLengthX;
  int infoLengthY;
  int infoClickX;
  int infoClickY;
  String inputTitle;
  boolean inputDrag;
  int inputPosX;
  int inputPosY;
  int inputLengthX;
  int inputLengthY;
  int inputClickX;
  int inputClickY;
  int inputTarget;
  String input;
  PopUpCallback inputCallBack;
  ModGuiTextField inputField;
  
  class InfoMessage
  {
    String message;
    int clientId;
    
    public InfoMessage(int clientId, String message)
    {
      this.clientId = clientId;
      this.message = message;
    }
  }
  
  public void openInfo(int clientId, String title, String message)
  {
    if (message.length() > 70) {
      message = message.substring(0, 70) + "..";
    }
    info.add(new InfoMessage(clientId, message));
    infoTitle = title;
    if (info.size() > 15) {
      info.remove(0);
    }
    calcInfo();
  }
  
  public void openInput(int targetId, String title, String message, PopUpCallback callBack)
  {
    inputTitle = title;
    input = message;
    inputTarget = targetId;
    inputCallBack = callBack;
    inputField = new ModGuiTextField(0, getInstancemc.k, 0, 0, 159, 10);
    inputField.a("");
    inputField.f(50);
    inputField.b(true);
    calcInput();
  }
  
  boolean closedInfo = false;
  
  private void resetInfo()
  {
    info.clear();
    infoTitle = null;
    infoDrag = false;
    infoPosX = 0;
    infoPosY = 0;
    infoLengthX = 0;
    infoLengthY = 0;
    infoClickX = 0;
    infoClickY = 0;
    closedInfo = true;
  }
  
  boolean closedInput = false;
  
  private void resetinput()
  {
    input = null;
    inputTitle = null;
    inputDrag = false;
    inputPosX = 0;
    inputPosY = 0;
    inputLengthX = 0;
    inputLengthY = 0;
    inputClickX = 0;
    inputClickY = 0;
    inputTarget = 0;
    closedInput = true;
    inputField = null;
  }
  
  public void drawWindow(int mouseX, int mouseY)
  {
    if (!info.isEmpty()) {
      drawInfo(mouseX, mouseY);
    }
    if (input != null) {
      drawInput(mouseX, mouseY);
    }
  }
  
  public boolean isInInfoScreen(int mouseX, int mouseY)
  {
    if (closedInfo) {
      return true;
    }
    return (mouseX > infoPosX - 1) && (mouseX < infoPosX + infoLengthX + 1) && (mouseY > infoPosY - 1) && (mouseY < infoPosY + infoLengthY + 1);
  }
  
  public boolean isInInfoFrame(int mouseX, int mouseY)
  {
    return (mouseX > infoPosX - 1) && (mouseX < infoPosX + infoLengthX + 1) && (mouseY > infoPosY - 1) && (mouseY < infoPosY + 15);
  }
  
  public boolean isInInputScreen(int mouseX, int mouseY)
  {
    if (closedInput) {
      return true;
    }
    return (mouseX > inputPosX - 1) && (mouseX < inputPosX + inputLengthX + 1) && (mouseY > inputPosY - 1) && (mouseY < inputPosY + inputLengthY + 1);
  }
  
  public boolean isInInputFrame(int mouseX, int mouseY)
  {
    return (mouseX > inputPosX - 1) && (mouseX < inputPosX + inputLengthX + 1) && (mouseY > inputPosY - 1) && (mouseY < inputPosY + 15);
  }
  
  public boolean isInScreen(int mouseX, int mouseY)
  {
    return (isInInfoScreen(mouseX, mouseY)) || (isInInputScreen(mouseX, mouseY));
  }
  
  public boolean isInFrame(int mouseX, int mouseY)
  {
    return (isInInputScreen(mouseX, mouseY)) || (isInInputScreen(mouseX, mouseY));
  }
  
  private void calcInfo()
  {
    int max = getInstancedraw.getStringWidth(infoTitle);
    for (InfoMessage infoMessage : info)
    {
      int l = getInstancedraw.getStringWidth(message);
      if (l > max) {
        max = l;
      }
    }
    infoLengthX = (20 + max);
    infoLengthY = (40 + info.size() * 10);
    if (info.size() == 1) {
      posInfo();
    }
  }
  
  private void calcInput()
  {
    int max = getInstancedraw.getStringWidth(inputTitle);
    int l = getInstancedraw.getStringWidth(input);
    if (l > max) {
      max = l;
    }
    int k = 165;
    if (max > 165) {
      k = max + 10;
    }
    inputLengthX = k;
    inputLengthY = 62;
    
    inputPosX = (getInstancedraw.getWidth() / 2 - inputLengthX / 2);
    inputPosY = (getInstancedraw.getHeight() / 2 - inputLengthY / 2);
  }
  
  private void posInfo()
  {
    infoPosX = (getInstancedraw.getWidth() / 2 - infoLengthX / 2);
    infoPosY = (getInstancedraw.getHeight() / 2 - infoLengthY / 2);
  }
  
  private void drawInfo(int mouseX, int mouseY)
  {
    DrawUtils.a(infoPosX - 1, infoPosY - 1, infoPosX + infoLengthX + 1, infoPosY + infoLengthY + 1, java.awt.Color.BLACK.getRGB());
    DrawUtils.a(infoPosX, infoPosY, infoPosX + infoLengthX, infoPosY + infoLengthY, java.awt.Color.GRAY.getRGB());
    DrawUtils.a(infoPosX, infoPosY, infoPosX + infoLengthX, infoPosY + 15, java.awt.Color.WHITE.getRGB());
    
    getInstancedraw.drawString(de.labystudio.utils.Color.cl("6") + infoTitle, infoPosX + 3, infoPosY + 3);
    String c = de.labystudio.utils.Color.cl("c");
    if ((mouseX > infoPosX + infoLengthX - 20) && (mouseX < infoPosX + infoLengthX) && (mouseY > infoPosY + 3) && (mouseY < infoPosY + 15)) {
      c = de.labystudio.utils.Color.cl("4");
    }
    getInstancedraw.drawString(c + "x", infoPosX + infoLengthX - 13, infoPosY + 3);
    
    int slot = 0;
    for (InfoMessage infoMessage : info)
    {
      getInstancedraw.drawString(message, infoPosX + 3, infoPosY + 20 + slot);
      slot += 10;
    }
    DrawUtils.a(infoPosX + infoLengthX / 2 - 25, infoPosY + infoLengthY - 15, infoPosX + infoLengthX / 2 + 25, infoPosY + infoLengthY - 2, java.awt.Color.BLACK.getRGB());
    DrawUtils.a(infoPosX + infoLengthX / 2 - 24, infoPosY + infoLengthY - 14, infoPosX + infoLengthX / 2 + 24, infoPosY + infoLengthY - 3, java.awt.Color.DARK_GRAY.getRGB());
    if ((mouseX > infoPosX + infoLengthX / 2 - 24) && (mouseX < infoPosX + infoLengthX / 2 + 24) && (mouseY > infoPosY + infoLengthY - 14) && (mouseY < infoPosY + infoLengthY - 3)) {
      DrawUtils.a(infoPosX + infoLengthX / 2 - 24, infoPosY + infoLengthY - 14, infoPosX + infoLengthX / 2 + 24, infoPosY + infoLengthY - 3, java.awt.Color.GRAY.getRGB() + 40);
    }
    getInstancedraw.drawCenteredString("OK", infoPosX + infoLengthX / 2, infoPosY + infoLengthY - 12);
    while (infoPosX + infoLengthX > getInstancedraw.getWidth()) {
      infoPosX -= 1;
    }
  }
  
  private void drawInput(int mouseX, int mouseY)
  {
    if (inputCallBack.tick(inputTarget))
    {
      resetinput();
      return;
    }
    DrawUtils.a(inputPosX - 1, inputPosY - 1, inputPosX + inputLengthX + 1, inputPosY + inputLengthY + 1, java.awt.Color.BLACK.getRGB());
    DrawUtils.a(inputPosX, inputPosY, inputPosX + inputLengthX, inputPosY + inputLengthY, java.awt.Color.GRAY.getRGB());
    DrawUtils.a(inputPosX, inputPosY, inputPosX + inputLengthX, inputPosY + 15, java.awt.Color.WHITE.getRGB());
    
    getInstancedraw.drawString(de.labystudio.utils.Color.cl("6") + inputTitle, inputPosX + 3, inputPosY + 3);
    String c = de.labystudio.utils.Color.cl("c");
    if ((mouseX > inputPosX + inputLengthX - 20) && (mouseX < inputPosX + inputLengthX) && (mouseY > inputPosY + 3) && (mouseY < inputPosY + 15)) {
      c = de.labystudio.utils.Color.cl("4");
    }
    getInstancedraw.drawString(c + "x", inputPosX + inputLengthX - 13, inputPosY + 3);
    
    getInstancedraw.drawString(input, inputPosX + 3, inputPosY + 20);
    
    DrawUtils.a(inputPosX + inputLengthX / 2 - 60, inputPosY + inputLengthY - 15, inputPosX + inputLengthX / 2 - 10, inputPosY + inputLengthY - 2, java.awt.Color.BLACK.getRGB());
    DrawUtils.a(inputPosX + inputLengthX / 2 - 60 + 1, inputPosY + inputLengthY - 14, inputPosX + inputLengthX / 2 - 11, inputPosY + inputLengthY - 3, java.awt.Color.DARK_GRAY.getRGB());
    if ((mouseX > inputPosX + inputLengthX / 2 - 60 + 1) && (mouseX < inputPosX + inputLengthX / 2 + 11) && (mouseY > inputPosY + inputLengthY - 14) && (mouseY < inputPosY + inputLengthY - 3)) {
      DrawUtils.a(inputPosX + inputLengthX / 2 - 60 + 1, inputPosY + inputLengthY - 14, inputPosX + inputLengthX / 2 - 11, inputPosY + inputLengthY - 3, java.awt.Color.GRAY.getRGB() + 40);
    }
    getInstancedraw.drawCenteredString("OK", inputPosX + inputLengthX / 2 - 35, inputPosY + inputLengthY - 12);
    
    DrawUtils.a(inputPosX + inputLengthX / 2 + 10, inputPosY + inputLengthY - 15, inputPosX + inputLengthX / 2 + 60, inputPosY + inputLengthY - 2, java.awt.Color.BLACK.getRGB());
    DrawUtils.a(inputPosX + inputLengthX / 2 + 11, inputPosY + inputLengthY - 14, inputPosX + inputLengthX / 2 + 60 - 1, inputPosY + inputLengthY - 3, java.awt.Color.DARK_GRAY.getRGB());
    if ((mouseX > inputPosX + inputLengthX / 2 + 10) && (mouseX < inputPosX + inputLengthX / 2 + 60) && (mouseY > inputPosY + inputLengthY - 14) && (mouseY < inputPosY + inputLengthY - 3)) {
      DrawUtils.a(inputPosX + inputLengthX / 2 + 11, inputPosY + inputLengthY - 14, inputPosX + inputLengthX / 2 + 60 - 1, inputPosY + inputLengthY - 3, java.awt.Color.GRAY.getRGB() + 40);
    }
    getInstancedraw.drawCenteredString("Cancel", inputPosX + inputLengthX / 2 + 35, inputPosY + inputLengthY - 12);
    
    inputField.a = (inputPosX + 3);
    inputField.f = (inputPosY + 32);
    
    inputField.a = (inputPosX + inputLengthX / 2 - 80);
    
    inputField.g();
  }
  
  public void mouseClicked(int mouseX, int mouseY, int mouseButton)
  {
    if (!isOpen()) {
      return;
    }
    if (isInInfoFrame(mouseX, mouseY))
    {
      infoClickX = (mouseX - infoPosX);
      infoClickY = (mouseY - infoPosY);
      infoDrag = true;
    }
    if (isInInputFrame(mouseX, mouseY))
    {
      inputClickX = (mouseX - inputPosX);
      inputClickY = (mouseY - inputPosY);
      inputDrag = true;
    }
    int slot;
    if (!info.isEmpty())
    {
      if ((mouseX > infoPosX + infoLengthX / 2 - 24) && (mouseX < infoPosX + infoLengthX / 2 + 24) && (mouseY > infoPosY + infoLengthY - 14) && (mouseY < infoPosY + infoLengthY - 3)) {
        resetInfo();
      }
      if ((mouseX > infoPosX + infoLengthX - 20) && (mouseX < infoPosX + infoLengthX) && (mouseY > infoPosY + 3) && (mouseY < infoPosY + 15)) {
        resetInfo();
      }
      slot = 0;
      for (InfoMessage infoMessage : info)
      {
        getInstancedraw.drawString(message, infoPosX + 3, infoPosY + 20 + slot);
        int l = infoLengthX;
        TeamSpeakUser user = TeamSpeakController.getInstance().getUser(clientId);
        if (user != null) {
          l = getInstancedraw.getStringWidth(user.getNickName());
        }
        if ((mouseX > infoPosX) && (mouseX < infoPosX + l) && (mouseY > infoPosY + 20 + slot) && (mouseY < infoPosY + 20 + slot + 10))
        {
          TeamSpeak.callBack = true;
          TeamSpeak.callBackClient = clientId;
          break;
        }
        slot += 10;
      }
    }
    if (input != null)
    {
      if ((mouseX > inputPosX + inputLengthX / 2 - 60 + 1) && (mouseX < inputPosX + inputLengthX / 2 + 11) && (mouseY > inputPosY + inputLengthY - 14) && (mouseY < inputPosY + inputLengthY - 3))
      {
        inputCallBack.ok(inputTarget, inputField.b());
        resetinput();
      }
      if ((mouseX > inputPosX + inputLengthX / 2 + 10) && (mouseX < inputPosX + inputLengthX / 2 + 60) && (mouseY > inputPosY + inputLengthY - 14) && (mouseY < inputPosY + inputLengthY - 3))
      {
        inputCallBack.cancel();
        resetinput();
      }
      if ((mouseX > inputPosX + inputLengthX - 20) && (mouseX < inputPosX + inputLengthX) && (mouseY > inputPosY + 3) && (mouseY < inputPosY + 15))
      {
        inputCallBack.cancel();
        resetinput();
      }
    }
    if (inputField != null) {
      inputField.a(mouseX, mouseY, mouseButton);
    }
  }
  
  public void KeyTyped(char typedChar, int keyCode)
  {
    if (!isOpen()) {
      return;
    }
    if ((keyCode == 28) && (inputField != null) && (inputField.m()) && 
      (inputCallBack != null) && (inputField != null))
    {
      inputCallBack.ok(inputTarget, inputField.b());
      resetinput();
    }
    if (inputField != null) {
      inputField.a(typedChar, keyCode);
    }
  }
  
  public void mouseClickMove(int mouseX, int mouseY, int clickedMouseButton, long timeSinceLastClick)
  {
    if (!isOpen()) {
      return;
    }
    if ((infoDrag) && (!inputDrag))
    {
      if ((mouseX - infoClickX > 0) && (mouseX - infoClickX < getInstancedraw.getWidth() - infoLengthX)) {
        infoPosX = (mouseX - infoClickX);
      }
      if ((mouseY - infoClickY > 0) && (mouseY - infoClickY < getInstancedraw.getHeight() - infoLengthY)) {
        infoPosY = (mouseY - infoClickY);
      }
    }
    if (inputDrag)
    {
      if ((mouseX - inputClickX > 0) && (mouseX - inputClickX < getInstancedraw.getWidth() - inputLengthX)) {
        inputPosX = (mouseX - inputClickX);
      }
      if ((mouseY - inputClickY > 0) && (mouseY - inputClickY < getInstancedraw.getHeight() - inputLengthY)) {
        inputPosY = (mouseY - inputClickY);
      }
    }
  }
  
  public void mouseReleased(int mouseX, int mouseY, int state)
  {
    infoDrag = false;
    inputDrag = false;
    closedInfo = false;
    closedInput = false;
  }
  
  public boolean allow()
  {
    return (!closedInfo) && (!closedInput);
  }
  
  public boolean isOpen()
  {
    return (!info.isEmpty()) || (input != null);
  }
}
