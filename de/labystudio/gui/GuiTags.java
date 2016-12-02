package de.labystudio.gui;

import avs;
import bfl;
import de.labystudio.gui.extras.ModGuiTextField;
import de.labystudio.labymod.LabyMod;
import de.labystudio.language.L;
import de.labystudio.utils.Color;
import de.labystudio.utils.DrawUtils;
import de.labystudio.utils.FriendsLoader;
import de.labystudio.utils.Scrollbar;
import de.labystudio.utils.TextureManager;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import org.lwjgl.input.Keyboard;
import org.lwjgl.opengl.GL11;

public class GuiTags
  extends GuiMenuScreen
{
  DrawUtils draw;
  Scrollbar scrollbar;
  
  public GuiTags()
  {
    super(null);
    childScreen = this;
    draw = getInstancedraw;
    editor = false;
    id = "Tags";
  }
  
  String selectedFriend = "";
  private avs btnAddFriend;
  private avs btnEditFriend;
  private avs btnDeleteFriend;
  
  public void b()
  {
    Keyboard.enableRepeatEvents(true);
    n.clear();
    n.add(btnAddFriend = new avs(0, l / 2 - 154, m - 26, 100, 20, L.f("gui_tags_addfriend", new Object[0])));
    n.add(btnEditFriend = new avs(1, l / 2 - 50, m - 26, 100, 20, L.f("gui_tags_editfriend", new Object[0])));
    n.add(btnDeleteFriend = new avs(2, l / 2 + 4 + 50, m - 26, 100, 20, L.f("gui_tags_deletefriend", new Object[0])));
    
    super.b();
    initEditor(selectedFriend);
    if (FriendsLoader.friends == null) {
      scrollbar = new Scrollbar(0);
    } else {
      scrollbar = new Scrollbar(FriendsLoader.friends.size());
    }
    scrollbar.setPosition(l / 2 + 154, 40, l / 2 + 160, m - 40);
    scrollbar.update(35);
  }
  
  private void drawFriends()
  {
    int listY = 0;
    if ((FriendsLoader.friends != null) && (!FriendsLoader.friends.isEmpty())) {
      for (String friend : FriendsLoader.friends.keySet())
      {
        String nick = (String)FriendsLoader.friends.get(friend);
        if (selectedFriend.equalsIgnoreCase(friend)) {
          DrawUtils.a(l / 2 - 151, 50 + scrollbar.getScrollY() + listY - 4, l / 2 + 158, 50 + scrollbar.getScrollY() + listY + 30, 632207020);
        }
        bfl.c(1.0F, 1.0F, 1.0F);
        GL11.glColor3f(1.0F, 1.0F, 1.0F);
        getInstancetextureManager.drawPlayerHead(friend, l / 2 - 150, 50 + scrollbar.getScrollY() + listY, 1.0D);
        draw.drawString(Color.cl("l") + friend, l / 2 - 110, 50 + scrollbar.getScrollY() + listY);
        if (nick.isEmpty()) {
          draw.drawString(Color.cl("c") + L.f("gui_tags_nonickname", new Object[0]) + Color.cl("r"), l / 2 - 110, 25 + scrollbar.getScrollY() + listY + 35);
        } else {
          draw.drawString(Color.cl("e") + L.f("gui_tags_nickname", new Object[0]) + ": " + Color.cl("r") + nick.replace("&", Color.c) + Color.cl("r"), l / 2 - 110, 25 + scrollbar.getScrollY() + listY + 35);
        }
        listY += 35;
      }
    }
  }
  
  protected void a(int mouseX, int mouseY, int mouseButton)
    throws IOException
  {
    super.a(mouseX, mouseY, mouseButton);
    
    scrollbar.mouseAction(mouseX, mouseY, false);
    int listY;
    if (editor)
    {
      editName.a(mouseX, mouseY, mouseButton);
      editNick.a(mouseX, mouseY, mouseButton);
    }
    else
    {
      listY = 0;
      for (String friend : FriendsLoader.friends.keySet())
      {
        String nick = (String)FriendsLoader.friends.get(friend);
        if ((mouseX > l / 2 - 151) && (mouseX < l / 2 + 160) && (mouseY > 50 + scrollbar.getScrollY() + listY - 4) && (mouseY < 50 + scrollbar.getScrollY() + listY + 31))
        {
          selectedFriend = friend;
          return;
        }
        listY += 35;
      }
    }
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
  
  public void a(avs button)
    throws IOException
  {
    super.actionPermformed(button);
    if (k == 0)
    {
      selectedFriend = "";
      edit("");
    }
    if (k == 1) {
      edit(selectedFriend);
    }
    if (k == 2)
    {
      FriendsLoader.friends.remove(selectedFriend);
      FriendsLoader.saveFriends();
      b();
      selectedFriend = "";
    }
    if (k == 3)
    {
      if ((!selectedFriend.isEmpty()) && 
        (!editName.b().equals(selectedFriend))) {
        FriendsLoader.friends.remove(selectedFriend);
      }
      selectedFriend = editName.b();
      FriendsLoader.friends.put(editName.b(), editNick.b());
      editor = false;
      FriendsLoader.saveFriends();
      b();
    }
    if (k == 4)
    {
      editor = false;
      b();
    }
  }
  
  protected void a(char typedChar, int keyCode)
    throws IOException
  {
    editName.a(typedChar, keyCode);
    editNick.a(typedChar, keyCode);
    if ((editor) && (done.l) && (
      (keyCode == 28) || (keyCode == 156))) {
      a(done);
    }
    super.a(typedChar, keyCode);
  }
  
  boolean editor = false;
  ModGuiTextField editName = new ModGuiTextField(-1, null, 0, 0, 0, 0);
  ModGuiTextField editNick = new ModGuiTextField(-1, null, 0, 0, 0, 0);
  avs done;
  
  private void edit(String name)
  {
    editor = true;
    selectedFriend = name;
    focus = false;
    initEditor(name);
  }
  
  boolean focus = false;
  
  private void initEditor(String name)
  {
    if (!editor) {
      return;
    }
    for (int i = 0; i <= n.size() - 1; i++)
    {
      avs b = (avs)n.get(i);
      m = false;
    }
    editName = new ModGuiTextField(-1, draw.fontRenderer, l / 2 - 100, m / 2 - 50, 200, 20);
    editName.f(16);
    editName.setBlacklistWord(" ");
    editName.a(name);
    editNick = new ModGuiTextField(-1, draw.fontRenderer, l / 2 - 100, m / 2, 200, 20);
    editNick.f(50);
    if (FriendsLoader.friends.containsKey(name)) {
      editNick.a((String)FriendsLoader.friends.get(name));
    }
    avs cancel = new avs(4, l / 2 - 100, m / 2 + 53, L.f("button_cancel", new Object[0]));
    n.add(cancel);
    
    done = new avs(3, l / 2 - 100, m / 2 + 28, L.f("button_done", new Object[0]));
    n.add(done);
    
    btnDeleteFriend.m = false;
    btnEditFriend.m = false;
    btnAddFriend.m = false;
  }
  
  private void drawEditor()
  {
    draw.drawString(L.f("gui_tags_playername", new Object[0]) + ":", l / 2 - 100, m / 2 - 63);
    draw.drawString(L.f("gui_tags_nickname", new Object[0]) + ":", l / 2 - 100, m / 2 - 13);
    if ((editName != null) && (editNick != null))
    {
      editName.g();
      editNick.g();
      if (done != null) {
        done.l = ((!editName.b().replace(" ", "").isEmpty()) && ((!FriendsLoader.friends.containsKey(editName.b())) || (editName.b().equals(selectedFriend))));
      }
    }
    if (!focus)
    {
      editName.b(true);
      focus = true;
    }
  }
  
  public void a(int mouseX, int mouseY, float partialTicks)
  {
    if (editor)
    {
      c(0);
      drawEditor();
      super.a(mouseX, mouseY, partialTicks);
      return;
    }
    if (LabyMod.getInstance().isInGame())
    {
      bfl.l();
      draw.drawTransparentBackground(0, 32, l, m - 33);
    }
    else
    {
      c();
      draw.drawChatBackground(0, 32, l, m - 33);
    }
    drawFriends();
    
    bfl.k();
    draw.overlayBackground(0, 32);
    draw.overlayBackground(m - 33, m);
    
    scrollbar.draw();
    
    btnEditFriend.l = (!selectedFriend.isEmpty());
    btnDeleteFriend.l = (!selectedFriend.isEmpty());
    
    super.a(mouseX, mouseY, partialTicks);
  }
}
