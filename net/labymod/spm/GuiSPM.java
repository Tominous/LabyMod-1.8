package net.labymod.spm;

import ave;
import avs;
import avw;
import axu;
import bfl;
import bnq;
import java.awt.Color;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.lwjgl.input.Keyboard;
import org.lwjgl.input.Mouse;

public class GuiSPM
  extends axu
{
  private Scrollbar scrollbar;
  private axu lastScreen;
  private avs doneButton;
  private avs addButton;
  private avw addField;
  private avs deleteButton;
  private avs loadButton;
  private avs overwriteButton;
  private long lastClick = 0L;
  private String message = null;
  private long messageDisplayTime = 0L;
  private String hoverMessage = null;
  private File selectedProfile;
  private SPMSettings storedSettings;
  
  public GuiSPM(axu lastScreen)
  {
    this.lastScreen = lastScreen;
    scrollbar = new Scrollbar(10);
    ProfileManager.getProfileManager().loadProfiles();
  }
  
  public void b()
  {
    Keyboard.enableRepeatEvents(true);
    
    n.add(doneButton = new avs(0, (l - l / 4) / 2 + l / 4 - 100, m - 30, "Done"));
    n.add(addButton = new avs(1, (l - 5) / 4 - 20, m - 30, 23, 20, "+"));
    
    n.add(loadButton = new avs(2, l - 70, 49, 60, 20, "Load"));
    n.add(overwriteButton = new avs(3, l - 70, 70, 60, 20, "Overwrite"));
    n.add(deleteButton = new avs(4, l - 70, 91, 60, 20, "Delete"));
    
    addField = new avw(0, j.k, 6, m - 29, (l - 5) / 4 - 30, 18);
    addField.f(25);
    
    scrollbar.setPosition(l / 4 - 5, 5, l / 4, m - 35);
    scrollbar.setSpeed(10);
    scrollbar.update(ProfileManager.getProfileManager().getProfiles().size());
    
    super.b();
  }
  
  protected void a(avs button)
    throws IOException
  {
    if (k == 0) {
      ave.A().a(lastScreen);
    }
    String green = "§a";
    String red = "§c";
    if (k == 1) {
      if (ProfileManager.getProfileManager().saveProfileAs(addField.b()))
      {
        addField.a("");
        displayMessage(green + "Profile successfully created");
      }
      else
      {
        displayMessage(red + "Failed to create profile");
      }
    }
    if ((k == 2) && (selectedProfile != null)) {
      if (ProfileManager.getProfileManager().loadProfile(selectedProfile))
      {
        l = false;
        displayMessage(green + "Profile successfully loaded");
      }
      else
      {
        displayMessage(red + "Failed to load profile");
      }
    }
    if ((k == 3) && (selectedProfile != null)) {
      if (ProfileManager.getProfileManager().saveProfileAs(selectedProfile))
      {
        l = false;
        displayMessage(green + "Profile successfully overwritten");
        selectProfile(selectedProfile);
      }
      else
      {
        displayMessage(red + "Failed to overwrite profile");
      }
    }
    if ((k == 4) && (selectedProfile != null)) {
      if (ProfileManager.getProfileManager().deleteProfile(selectedProfile))
      {
        selectedProfile = null;
        displayMessage(green + "Profile successfully deleted");
      }
      else
      {
        displayMessage(red + "Failed to delete profile");
      }
    }
    super.a(button);
  }
  
  private void displayMessage(String message)
  {
    this.message = message;
    messageDisplayTime = (System.currentTimeMillis() + 2000L);
  }
  
  public void a(int mouseX, int mouseY, float partialTicks)
  {
    c(0);
    DrawUtils.drawBackground(5, 5, l / 4, m - 35);
    DrawUtils.drawBackground(l / 4 + 5, 5, l - 5, m - 35);
    
    int listY = 10 + scrollbar.getScrollY();
    for (File profile : ProfileManager.getProfileManager().getProfiles())
    {
      if (selectedProfile == profile) {
        a(5, listY - 1, l / 4, listY + 9, Integer.MAX_VALUE);
      }
      c(j.k, profile.getName().replace(".txt", ""), 10, listY, Color.WHITE.getRGB());
      listY += 10;
    }
    DrawUtils.overlayBackground(0, m - 35, l / 4, m);
    DrawUtils.overlayBackground(0, 0, l / 4, 5);
    addButton.l = ((!addField.b().replaceAll(" ", "").isEmpty()) && (isAlphaNumeric(addField.b())));
    addField.g();
    
    scrollbar.update(ProfileManager.getProfileManager().getProfiles().size());
    scrollbar.draw();
    
    loadButton.m = (selectedProfile != null);
    overwriteButton.m = (selectedProfile != null);
    deleteButton.m = (selectedProfile != null);
    if (selectedProfile != null)
    {
      double k = 2.0D;
      bfl.E();
      bfl.a(k, k, k);
      String name = selectedProfile.getName().replaceAll(".txt", "");
      a(j.k, name, (int)(((l - l / 4) / 2 + l / 4) / k), (int)(17.0D / k), Color.WHITE.getRGB());
      bfl.F();
    }
    if ((storedSettings != null) && (selectedProfile != null)) {
      drawKeyBoard(mouseX, mouseY);
    }
    if ((message != null) && (messageDisplayTime > System.currentTimeMillis())) {
      c(j.k, message, l / 4 + 10, m - 47, Color.WHITE.getRGB());
    }
    super.a(mouseX, mouseY, partialTicks);
  }
  
  private void drawKeyBoard(int mouseX, int mouseY)
  {
    hoverMessage = null;
    
    drawKey(storedSettings.keyBindForward, 1, 2, mouseX, mouseY);
    drawKey(storedSettings.keyBindBack, 1, 3, mouseX, mouseY);
    drawKey(storedSettings.keyBindLeft, 0, 3, mouseX, mouseY);
    drawKey(storedSettings.keyBindRight, 2, 3, mouseX, mouseY);
    
    drawKey(storedSettings.keyBindAttack, 10, 0, mouseX, mouseY);
    drawKey(storedSettings.keyBindPickBlock, 11, 0, mouseX, mouseY);
    drawKey(storedSettings.keyBindUseItem, 12, 0, mouseX, mouseY);
    
    drawKey(storedSettings.keyBindInventory, 4, 2, mouseX, mouseY);
    drawKey(storedSettings.keyBindDrop, 4, 3, mouseX, mouseY);
    drawKey(storedSettings.keyBindSprint, 4, 4, mouseX, mouseY);
    drawKey(storedSettings.keyBindSneak, 4, 5, mouseX, mouseY);
    drawKey(storedSettings.keyBindJump, 4, 6, mouseX, mouseY);
    
    int i = 0;
    for (SPMBinding keyBind : storedSettings.keyBindsHotbar)
    {
      drawKey(keyBind, i, 0, mouseX, mouseY);
      i++;
    }
    if (hoverMessage != null)
    {
      Object list = new ArrayList();
      ((List)list).add(bnq.a(hoverMessage, new Object[0]));
      a((List)list, mouseX, mouseY);
      bfl.f();
    }
    a(l / 4 + 20 + 170, 67, l / 4 + 20 + 221 - 1, 118, Integer.MAX_VALUE);
  }
  
  private void drawKey(SPMBinding keyBind, int x, int y, int mouseX, int mouseY)
  {
    drawKey(bnq.a(keyBind.getKeyDescription(), new Object[0]), keyBind.getKeyCode(), x, y, mouseX, mouseY);
  }
  
  private void drawKey(String name, int keyCode, int x, int y, int mouseX, int mouseY)
  {
    int posX = l / 4 + 20 + x * 17;
    int posY = 50 + y * 17;
    a(posX, posY, posX + 16, posY + 16, Integer.MAX_VALUE);
    if (((keyCode >= 0) && (Keyboard.isKeyDown(keyCode))) || ((keyCode < 0) && (Mouse.isButtonDown(keyCode + 100)))) {
      a(posX, posY, posX + 16, posY + 16, Integer.MAX_VALUE);
    }
    String shortName = null;
    if (keyCode >= 0) {
      shortName = Keyboard.getKeyName(keyCode);
    }
    if (shortName == null)
    {
      int code = keyCode + 100;
      if (code == 0) {
        shortName = "<";
      }
      if (code == 1) {
        shortName = ">";
      }
      if (code == 2) {
        shortName = "|";
      }
      if (code >= 3) {
        shortName = "B" + (code + 1);
      }
    }
    if ((shortName != null) && 
      (shortName.length() > 2)) {
      shortName = shortName.substring(0, 2);
    }
    a(j.k, shortName, posX + 8, posY + 4, Color.WHITE.getRGB());
    
    String fullName = bnq.a(name, new Object[0]);
    if ((mouseX > posX) && (mouseX < posX + 16) && (mouseY > posY) && (mouseY < posY + 16)) {
      hoverMessage = fullName;
    }
    if ((x == 4) && (y > 1)) {
      c(j.k, fullName, posX + 19, posY + 4, Color.WHITE.getRGB());
    }
  }
  
  private boolean isAlphaNumeric(String s)
  {
    String pattern = "^[a-zA-Z0-9 _-]*$";
    return s.matches(pattern);
  }
  
  protected void a(int mouseX, int mouseY, int mouseButton)
    throws IOException
  {
    addField.a(mouseX, mouseY, mouseButton);
    scrollbar.mouseAction(mouseX, mouseY, false);
    
    int listY = 10 + scrollbar.getScrollY();
    for (File profile : ProfileManager.getProfileManager().getProfiles())
    {
      if ((mouseX > 5) && (mouseX < l / 4) && (mouseY > listY) && (mouseY < listY + 10)) {
        selectProfile(profile);
      }
      listY += 10;
    }
    super.a(mouseX, mouseY, mouseButton);
  }
  
  private void selectProfile(File profile)
  {
    selectedProfile = profile;
    loadButton.l = true;
    overwriteButton.l = true;
    deleteButton.l = true;
    if (lastClick > System.currentTimeMillis())
    {
      try
      {
        a(loadButton);
      }
      catch (IOException e)
      {
        e.printStackTrace();
      }
      lastClick = System.currentTimeMillis();
    }
    else
    {
      lastClick = (System.currentTimeMillis() + 200L);
    }
    storedSettings = new SPMSettings(selectedProfile);
  }
  
  protected void a(char typedChar, int keyCode)
    throws IOException
  {
    if ((keyCode != 1) || (
    
      (!addField.a(typedChar, keyCode)) || 
      
      (keyCode == 28))) {
      a(addButton);
    }
    if ((keyCode == 211) && (selectedProfile != null)) {
      a(deleteButton);
    }
    if ((keyCode == 28) && (selectedProfile != null) && (!addField.m())) {
      a(loadButton);
    }
    super.a(typedChar, keyCode);
  }
  
  protected void a(int mouseX, int mouseY, int clickedMouseButton, long timeSinceLastClick)
  {
    scrollbar.mouseAction(mouseX, mouseY, true);
    super.a(mouseX, mouseY, clickedMouseButton, timeSinceLastClick);
  }
  
  public void k()
    throws IOException
  {
    scrollbar.mouseInput();
    super.k();
  }
}
