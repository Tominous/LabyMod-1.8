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
    this.scrollbar = new Scrollbar(10);
    ProfileManager.getProfileManager().loadProfiles();
  }
  
  public void b()
  {
    Keyboard.enableRepeatEvents(true);
    
    this.n.add(this.doneButton = new avs(0, (this.l - this.l / 4) / 2 + this.l / 4 - 100, this.m - 30, "Done"));
    this.n.add(this.addButton = new avs(1, (this.l - 5) / 4 - 20, this.m - 30, 23, 20, "+"));
    
    this.n.add(this.loadButton = new avs(2, this.l - 70, 49, 60, 20, "Load"));
    this.n.add(this.overwriteButton = new avs(3, this.l - 70, 70, 60, 20, "Overwrite"));
    this.n.add(this.deleteButton = new avs(4, this.l - 70, 91, 60, 20, "Delete"));
    
    this.addField = new avw(0, this.j.k, 6, this.m - 29, (this.l - 5) / 4 - 30, 18);
    this.addField.f(25);
    
    this.scrollbar.setPosition(this.l / 4 - 5, 5, this.l / 4, this.m - 35);
    this.scrollbar.setSpeed(10);
    this.scrollbar.update(ProfileManager.getProfileManager().getProfiles().size());
    
    super.b();
  }
  
  protected void a(avs button)
    throws IOException
  {
    if (button.k == 0) {
      ave.A().a(this.lastScreen);
    }
    String green = "§a";
    String red = "§c";
    if (button.k == 1) {
      if (ProfileManager.getProfileManager().saveProfileAs(this.addField.b()))
      {
        this.addField.a("");
        displayMessage(green + "Profile successfully created");
      }
      else
      {
        displayMessage(red + "Failed to create profile");
      }
    }
    if ((button.k == 2) && (this.selectedProfile != null)) {
      if (ProfileManager.getProfileManager().loadProfile(this.selectedProfile))
      {
        button.l = false;
        displayMessage(green + "Profile successfully loaded");
      }
      else
      {
        displayMessage(red + "Failed to load profile");
      }
    }
    if ((button.k == 3) && (this.selectedProfile != null)) {
      if (ProfileManager.getProfileManager().saveProfileAs(this.selectedProfile))
      {
        button.l = false;
        displayMessage(green + "Profile successfully overwritten");
        selectProfile(this.selectedProfile);
      }
      else
      {
        displayMessage(red + "Failed to overwrite profile");
      }
    }
    if ((button.k == 4) && (this.selectedProfile != null)) {
      if (ProfileManager.getProfileManager().deleteProfile(this.selectedProfile))
      {
        this.selectedProfile = null;
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
    this.messageDisplayTime = (System.currentTimeMillis() + 2000L);
  }
  
  public void a(int mouseX, int mouseY, float partialTicks)
  {
    c(0);
    DrawUtils.drawBackground(5, 5, this.l / 4, this.m - 35);
    DrawUtils.drawBackground(this.l / 4 + 5, 5, this.l - 5, this.m - 35);
    
    int listY = 10 + this.scrollbar.getScrollY();
    for (File profile : ProfileManager.getProfileManager().getProfiles())
    {
      if (this.selectedProfile == profile) {
        a(5, listY - 1, this.l / 4, listY + 9, Integer.MAX_VALUE);
      }
      c(this.j.k, profile.getName().replace(".txt", ""), 10, listY, Color.WHITE.getRGB());
      listY += 10;
    }
    DrawUtils.overlayBackground(0, this.m - 35, this.l / 4, this.m);
    DrawUtils.overlayBackground(0, 0, this.l / 4, 5);
    this.addButton.l = ((!this.addField.b().replaceAll(" ", "").isEmpty()) && (isAlphaNumeric(this.addField.b())));
    this.addField.g();
    
    this.scrollbar.update(ProfileManager.getProfileManager().getProfiles().size());
    this.scrollbar.draw();
    
    this.loadButton.m = (this.selectedProfile != null);
    this.overwriteButton.m = (this.selectedProfile != null);
    this.deleteButton.m = (this.selectedProfile != null);
    if (this.selectedProfile != null)
    {
      double k = 2.0D;
      bfl.E();
      bfl.a(k, k, k);
      String name = this.selectedProfile.getName().replaceAll(".txt", "");
      a(this.j.k, name, (int)(((this.l - this.l / 4) / 2 + this.l / 4) / k), (int)(17.0D / k), Color.WHITE.getRGB());
      bfl.F();
    }
    if ((this.storedSettings != null) && (this.selectedProfile != null)) {
      drawKeyBoard(mouseX, mouseY);
    }
    if ((this.message != null) && (this.messageDisplayTime > System.currentTimeMillis())) {
      c(this.j.k, this.message, this.l / 4 + 10, this.m - 47, Color.WHITE.getRGB());
    }
    super.a(mouseX, mouseY, partialTicks);
  }
  
  private void drawKeyBoard(int mouseX, int mouseY)
  {
    this.hoverMessage = null;
    
    drawKey(this.storedSettings.keyBindForward, 1, 2, mouseX, mouseY);
    drawKey(this.storedSettings.keyBindBack, 1, 3, mouseX, mouseY);
    drawKey(this.storedSettings.keyBindLeft, 0, 3, mouseX, mouseY);
    drawKey(this.storedSettings.keyBindRight, 2, 3, mouseX, mouseY);
    
    drawKey(this.storedSettings.keyBindAttack, 10, 0, mouseX, mouseY);
    drawKey(this.storedSettings.keyBindPickBlock, 11, 0, mouseX, mouseY);
    drawKey(this.storedSettings.keyBindUseItem, 12, 0, mouseX, mouseY);
    
    drawKey(this.storedSettings.keyBindInventory, 4, 2, mouseX, mouseY);
    drawKey(this.storedSettings.keyBindDrop, 4, 3, mouseX, mouseY);
    drawKey(this.storedSettings.keyBindSprint, 4, 4, mouseX, mouseY);
    drawKey(this.storedSettings.keyBindSneak, 4, 5, mouseX, mouseY);
    drawKey(this.storedSettings.keyBindJump, 4, 6, mouseX, mouseY);
    
    int i = 0;
    for (SPMBinding keyBind : this.storedSettings.keyBindsHotbar)
    {
      drawKey(keyBind, i, 0, mouseX, mouseY);
      i++;
    }
    if (this.hoverMessage != null)
    {
      Object list = new ArrayList();
      ((List)list).add(bnq.a(this.hoverMessage, new Object[0]));
      a((List)list, mouseX, mouseY);
      bfl.f();
    }
    a(this.l / 4 + 20 + 170, 67, this.l / 4 + 20 + 221 - 1, 118, Integer.MAX_VALUE);
  }
  
  private void drawKey(SPMBinding keyBind, int x, int y, int mouseX, int mouseY)
  {
    drawKey(bnq.a(keyBind.getKeyDescription(), new Object[0]), keyBind.getKeyCode(), x, y, mouseX, mouseY);
  }
  
  private void drawKey(String name, int keyCode, int x, int y, int mouseX, int mouseY)
  {
    int posX = this.l / 4 + 20 + x * 17;
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
    a(this.j.k, shortName, posX + 8, posY + 4, Color.WHITE.getRGB());
    
    String fullName = bnq.a(name, new Object[0]);
    if ((mouseX > posX) && (mouseX < posX + 16) && (mouseY > posY) && (mouseY < posY + 16)) {
      this.hoverMessage = fullName;
    }
    if ((x == 4) && (y > 1)) {
      c(this.j.k, fullName, posX + 19, posY + 4, Color.WHITE.getRGB());
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
    this.addField.a(mouseX, mouseY, mouseButton);
    this.scrollbar.mouseAction(mouseX, mouseY, false);
    
    int listY = 10 + this.scrollbar.getScrollY();
    for (File profile : ProfileManager.getProfileManager().getProfiles())
    {
      if ((mouseX > 5) && (mouseX < this.l / 4) && (mouseY > listY) && (mouseY < listY + 10)) {
        selectProfile(profile);
      }
      listY += 10;
    }
    super.a(mouseX, mouseY, mouseButton);
  }
  
  private void selectProfile(File profile)
  {
    this.selectedProfile = profile;
    this.loadButton.l = true;
    this.overwriteButton.l = true;
    this.deleteButton.l = true;
    if (this.lastClick > System.currentTimeMillis())
    {
      try
      {
        a(this.loadButton);
      }
      catch (IOException e)
      {
        e.printStackTrace();
      }
      this.lastClick = System.currentTimeMillis();
    }
    else
    {
      this.lastClick = (System.currentTimeMillis() + 200L);
    }
    this.storedSettings = new SPMSettings(this.selectedProfile);
  }
  
  protected void a(char typedChar, int keyCode)
    throws IOException
  {
    if ((keyCode != 1) || (
    
      (!this.addField.a(typedChar, keyCode)) || 
      
      (keyCode == 28))) {
      a(this.addButton);
    }
    if ((keyCode == 211) && (this.selectedProfile != null)) {
      a(this.deleteButton);
    }
    if ((keyCode == 28) && (this.selectedProfile != null) && (!this.addField.m())) {
      a(this.loadButton);
    }
    super.a(typedChar, keyCode);
  }
  
  protected void a(int mouseX, int mouseY, int clickedMouseButton, long timeSinceLastClick)
  {
    this.scrollbar.mouseAction(mouseX, mouseY, true);
    super.a(mouseX, mouseY, clickedMouseButton, timeSinceLastClick);
  }
  
  public void k()
    throws IOException
  {
    this.scrollbar.mouseInput();
    super.k();
  }
}
