package de.labystudio.gui;

import ave;
import avs;
import avw;
import bfl;
import bmj;
import de.labystudio.chat.BroadcastType;
import de.labystudio.chat.ChatHandler;
import de.labystudio.chat.Client;
import de.labystudio.chat.ClientConnection;
import de.labystudio.chat.EnumAlertType;
import de.labystudio.chat.LabyModPlayer;
import de.labystudio.chat.LabyModPlayer.OnlineStatus;
import de.labystudio.chat.LabyModPlayerRequester;
import de.labystudio.chat.MessageChatComponent;
import de.labystudio.chat.ServerInfo;
import de.labystudio.chat.SingleChat;
import de.labystudio.chat.TitleChatComponent;
import de.labystudio.gui.extras.ModGuiTextField;
import de.labystudio.labymod.ConfigManager;
import de.labystudio.labymod.LabyMod;
import de.labystudio.labymod.ModSettings;
import de.labystudio.language.L;
import de.labystudio.packets.EnumConnectionState;
import de.labystudio.packets.PacketPlayChangeOptions;
import de.labystudio.packets.PacketPlayDenyFriendRequest;
import de.labystudio.packets.PacketPlayFriendRemove;
import de.labystudio.packets.PacketPlayRequestAddFriend;
import de.labystudio.packets.PacketPlayServerStatus;
import de.labystudio.utils.DrawUtils;
import de.labystudio.utils.LOGO;
import de.labystudio.utils.ModGui;
import de.labystudio.utils.TextureManager;
import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.TimeZone;
import javax.sound.sampled.AudioFileFormat.Type;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.DataLine.Info;
import javax.sound.sampled.TargetDataLine;
import org.apache.commons.lang3.ArrayUtils;
import org.lwjgl.input.Keyboard;
import org.lwjgl.input.Mouse;
import org.lwjgl.opengl.GL11;

public class GuiOnlineChat
  extends GuiMenuScreen
{
  GuiOnlineChat()
  {
    super(null);
    childScreen = this;
    id = "Chat";
    draw = getInstancedraw;
  }
  
  DateFormat df = new SimpleDateFormat("HH:mm");
  DrawUtils draw;
  int copyLine = 0;
  long micCooldown = 0L;
  long switchScreen = 0L;
  boolean recording = false;
  avs reconButton;
  avs showSettingsButton;
  avs showFileSharingButton;
  avs micButton;
  avs sendButton;
  avs screenSelectButton;
  avs friendSelectButton;
  avs addFriendScreenButton;
  avs playerStatusButton;
  boolean showSettingsBox = false;
  int showSettingsX = 0;
  int showSettingsY = 0;
  boolean showStatusBox = false;
  int showStatusX = 0;
  int showStatusY = 0;
  boolean showFileSharing = false;
  int showFileSharingX = 0;
  int showFileSharingY = 0;
  boolean showPlayerSettingsBox = false;
  int showPlayerSettingsX = 0;
  int showPlayerSettingsY = 0;
  ModGuiTextField searchArea;
  avw chatArea;
  avw motdEditor;
  ModGuiTextField searchFriendsArea;
  boolean YesNoBox = false;
  boolean stopSpam = false;
  boolean playerInfo = false;
  
  public void b()
  {
    Keyboard.enableRepeatEvents(true);
    scrollFriendList = 0;
    scrollScreenBrowser = 0;
    scrollChatlog = 0;
    
    searchArea = new ModGuiTextField(-1, q, 29, 74, 100, 20);
    searchArea.setBlacklistWord(" ");
    searchArea.f(16);
    searchArea.a(false);
    
    searchFriendsArea = new ModGuiTextField(-1, q, 0, 0, 180, 20);
    searchFriendsArea.setBlacklistWord(" ");
    searchFriendsArea.f(16);
    if (friendFinder) {
      searchFriendsArea.b(true);
    }
    chatArea = new avw(-1, q, 185, m - 24, l - 224, 18);
    chatArea.f(120);
    
    motdEditor = new avw(-1, q, 145, 111, 218, 20);
    motdEditor.f(70);
    motdEditor.a(settingsmotd);
    
    refreshButtons();
    updateChatlog();
  }
  
  private void refreshButtons()
  {
    n.clear();
    if (screenSelector)
    {
      screenSelectButton = new avs(5, 70, m - 25, 120, 20, "Send screenshot");
      n.add(screenSelectButton);
      
      avs b = new avs(6, 2, m - 25, 60, 20, "Cancel");
      n.add(b);
      return;
    }
    if (friendFinder)
    {
      friendSelectButton = new avs(8, l / 2 + 5, m / 2 + 15, 87, 20, L.f("gui_chat_sendrequest", new Object[0]));
      n.add(friendSelectButton);
      
      avs b = new avs(6, l / 2 - 90 - 1, m / 2 + 15, 90, 20, L.f("button_cancel", new Object[0]));
      n.add(b);
      return;
    }
    if (getInstanceselectedPlayer != null)
    {
      showFileSharingButton = new avs(1, 140, m - 25, 20, 20, "+");
      showFileSharingButton.l = false;
      n.add(showFileSharingButton);
      
      micButton = new avs(2, 161, m - 25, 21, 20, "");
      micButton.l = false;
      n.add(micButton);
      
      sendButton = new avs(3, l - 35, m - 25, 30, 20, L.f("gui_chat_send", new Object[0]));
      n.add(sendButton);
      if ((getInstanceselectedPlayer instanceof LabyModPlayerRequester))
      {
        avs b = new avs(10, (l - 140) / 2 + 2 + 140, m / 2 + 15, 90, 20, de.labystudio.utils.Color.cl("a") + L.f("gui_chat_accept", new Object[0]));
        if (stopSpam) {
          l = false;
        }
        n.add(b);
        
        b = new avs(9, (l - 140) / 2 - 92 + 140, m / 2 + 15, 90, 20, de.labystudio.utils.Color.cl("c") + L.f("gui_chat_deny", new Object[0]));
        if (stopSpam) {
          l = false;
        }
        n.add(b);
      }
      if (YesNoBox)
      {
        avs b = new avs(12, l / 2 - 95, m / 2 + 25, 90, 20, de.labystudio.utils.Color.cl("c") + L.f("status_no", new Object[0]));
        n.add(b);
        
        b = new avs(13, l / 2 + 5, m / 2 + 25, 90, 20, de.labystudio.utils.Color.cl("a") + L.f("status_yes", new Object[0]));
        n.add(b);
      }
    }
    else
    {
      avs b = new avs(11, 143, 135, 130, 20, L.f("gui_chat_showmyip", new Object[0]) + ": " + colorBoolean(settingsshowConntectedIP));
      n.add(b);
      b = new avs(14, 275, 135, 90, 20, L.f("gui_chat_showalerts", new Object[0]) + ": " + colorBoolean(settingsalertsChat));
      n.add(b);
      b = new avs(15, 143, 157, 130, 20, L.f("gui_chat_showplayingalerts", new Object[0]) + ": " + colorBoolean(settingsalertsPlayingOn));
      l = settingsalertsChat;
      n.add(b);
      b = new avs(17, 275, 157, 90, 20, L.f("gui_chat_playsounds", new Object[0]) + ": " + colorBoolean(settingsplaySounds));
      n.add(b);
      b = new avs(19, 143, 179, 130, 20, L.f("gui_chat_ignorerequests", new Object[0]) + ": " + colorBoolean(settingsignoreRequests));
      n.add(b);
      if (LOGO.isLogo(LabyMod.getInstance().getPlayerName()))
      {
        b = new avs(1337, 275, 179, 90, 20, "Logomode: " + colorBoolean(settingslogomode));
        n.add(b);
      }
    }
    showSettingsButton = new avs(0, 7, 68, 20, 20, "!");
    n.add(showSettingsButton);
    
    String text = L.f("gui_chat_addfriend", new Object[0]);
    addFriendScreenButton = new avs(7, l - 66 - 4, 3, draw.getStringWidth(text) + 10, 20, text);
    addFriendScreenButton.h = (l - draw.getStringWidth(addFriendScreenButton.j) - 10 - 4);
    n.add(addFriendScreenButton);
    
    playerStatusButton = new avs(16, l - draw.getStringWidth(addFriendScreenButton.j) - 45 - 4, 3, 35, 20, "?");
    n.add(playerStatusButton);
    
    reconButton = new avs(4, 6, m - 25, 130, 20, "?");
    reconButton.l = false;
    n.add(reconButton);
    
    super.b();
    ConfigManager.save();
    stopSpam = false;
  }
  
  private String colorBoolean(boolean b)
  {
    if (b) {
      return de.labystudio.utils.Color.cl("a") + L.f("status_yes", new Object[0]);
    }
    return de.labystudio.utils.Color.cl("c") + L.f("status_no", new Object[0]);
  }
  
  public void a(int mouseX, int mouseY, float partialTicks)
  {
    cacheMouseX = mouseX;
    if (LabyMod.getInstance().isInGame())
    {
      bfl.l();
      getInstancedraw.drawTransparentBackground(140, 25, l - 5, m - 30);
      getInstancedraw.drawTransparentBackground(6, 5 + listPositionY, 138, m - 30);
    }
    else
    {
      c();
      getInstancedraw.drawChatBackground(140, 25, l - 5, m - 30);
      getInstancedraw.drawChatBackground(6, 5 + listPositionY, 138, m - 30);
    }
    bfl.k();
    
    drawOpenScreenshots();
    if ((getInstanceselectedPlayer != null) && 
      (!ChatHandler.getMyFriends().contains(getInstanceselectedPlayer)))
    {
      getInstanceselectedPlayer = null;
      b();
    }
    updateButtons();
    if (screenSelector)
    {
      drawScreenSelector();
      super.a(mouseX, mouseY, partialTicks);
      return;
    }
    if (friendFinder)
    {
      drawFriendFinder();
      super.a(mouseX, mouseY, partialTicks);
      return;
    }
    drawChatlog();
    getInstancedraw.overlayBackground(0, 25);
    getInstancedraw.overlayBackground(m - 30, m);
    drawChatArea();
    updateButtons();
    drawServerStatus();
    drawMyProfile();
    drawMyFriends();
    drawSearchArea();
    drawSettings();
    drawTitle();
    drawRequestScreen();
    drawYesNoBox();
    super.a(mouseX, mouseY, partialTicks);
    drawMic();
    drawSettingsBox();
    drawStatusBox();
    drawFileSharingBox();
    drawPlayerSettingsBox();
    drawPlayerInfo();
    if (getInstancenewMessage)
    {
      getInstancenewMessage = false;
      updateChatlog();
    }
    ChatHandler.updateIsWriting(getInstanceselectedPlayer, chatArea.b());
  }
  
  private void updateButtons()
  {
    updateReconnectButton();
    updateShowSettingsButton();
    updateShowFileSharingButton();
    updateMicButton();
    updateSendButton();
    updateSelectButton();
    updateAddFriendScreenButton();
    updateSettingsButton();
    updateStatusButton();
  }
  
  private void updateStatusButton()
  {
    if (playerStatusButton == null) {
      return;
    }
    if (ChatHandler.playerStatus == 0) {
      playerStatusButton.j = (de.labystudio.utils.Color.cl("a") + L.f("gui_chat_status_online", new Object[0]));
    }
    if (ChatHandler.playerStatus == 1) {
      playerStatusButton.j = (de.labystudio.utils.Color.cl("b") + L.f("gui_chat_status_away", new Object[0]));
    }
    if (ChatHandler.playerStatus == 2) {
      playerStatusButton.j = (de.labystudio.utils.Color.cl("d") + L.f("gui_chat_status_busy", new Object[0]));
    }
    playerStatusButton.l = (!showStatusBox);
    if (LabyMod.getInstance().getClient().getClientConnection().getState() != EnumConnectionState.PLAY)
    {
      showStatusBox = false;
      playerStatusButton.l = false;
      playerStatusButton.m = false;
    }
    else
    {
      playerStatusButton.m = true;
    }
  }
  
  private void updateAddFriendScreenButton()
  {
    if (addFriendScreenButton != null) {
      addFriendScreenButton.l = (getInstanceclient.getClientConnection().getState() == EnumConnectionState.PLAY);
    }
  }
  
  private void updateSelectButton()
  {
    if ((friendSelectButton != null) && 
      (friendFinder))
    {
      friendSelectButton.l = (!searchFriendsArea.b().isEmpty());
      if (searchFriendsArea.b().equalsIgnoreCase(LabyMod.getInstance().getPlayerName())) {
        friendSelectButton.l = false;
      }
      for (LabyModPlayer p : getInstanceclient.getFriends()) {
        if (p.getName().equalsIgnoreCase(searchFriendsArea.b())) {
          friendSelectButton.l = false;
        }
      }
      for (LabyModPlayer p : getInstanceclient.getRequests()) {
        if (p.getName().equalsIgnoreCase(searchFriendsArea.b())) {
          friendSelectButton.l = false;
        }
      }
    }
    if (screenSelectButton != null) {
      screenSelectButton.l = (screenSelected != null);
    }
  }
  
  private void updateSendButton()
  {
    if (sendButton != null) {
      if (getInstanceselectedPlayer != null) {
        sendButton.l = ((!getInstanceselectedPlayer.isRequest()) && (!chatArea.b().replace(" ", "").isEmpty()) && (LabyMod.getInstance().getClient().getClientConnection().getState() == EnumConnectionState.PLAY));
      } else {
        sendButton.l = false;
      }
    }
  }
  
  private void updateMicButton()
  {
    if (micButton != null) {
      micButton.l = false;
    }
  }
  
  private void updateSettingsButton()
  {
    if ((!settingsalertsChat) && (settingsalertsPlayingOn))
    {
      settingsalertsPlayingOn = false;
      b();
    }
  }
  
  private String getConnectionStatus()
  {
    EnumConnectionState state = getInstanceclient.getClientConnection().getState();
    if (state == EnumConnectionState.PLAY) {
      return de.labystudio.utils.Color.cl("a") + L.f("gui_chat_connection_connected", new Object[0]) + de.labystudio.utils.Color.cl("f");
    }
    if (state == EnumConnectionState.HELLO) {
      return de.labystudio.utils.Color.cl("c") + L.f("gui_chat_connection_connecting", new Object[0]) + de.labystudio.utils.Color.cl("f");
    }
    if (state == EnumConnectionState.LOGIN) {
      return de.labystudio.utils.Color.cl("c") + L.f("gui_chat_connection_loggingin", new Object[0]) + de.labystudio.utils.Color.cl("f");
    }
    return de.labystudio.utils.Color.cl("4") + L.f("gui_chat_connection_notconnected", new Object[0]) + de.labystudio.utils.Color.cl("f");
  }
  
  private void updateShowSettingsButton()
  {
    if (settingsshowSettingsFriend == 0) {
      showSettingsButton.j = (de.labystudio.utils.Color.cl("b") + "All");
    }
    if (settingsshowSettingsFriend == 1) {
      showSettingsButton.j = (de.labystudio.utils.Color.cl("a") + "On");
    }
    if (settingsshowSettingsFriend == 2) {
      showSettingsButton.j = (de.labystudio.utils.Color.cl("e") + "Rq");
    }
    if (settingsshowSettingsFriend == 3) {
      showSettingsButton.j = (de.labystudio.utils.Color.cl("6") + "<-");
    }
    showSettingsButton.l = (!showSettingsBox);
  }
  
  private void updateShowFileSharingButton()
  {
    if (showFileSharingButton != null) {
      showFileSharingButton.l = false;
    }
  }
  
  private void updateReconnectButton()
  {
    if (getInstanceclient.getClientConnection().getState() == EnumConnectionState.PLAY) {
      reconButton.j = L.f("gui_chat_logout", new Object[0]);
    } else {
      reconButton.j = L.f("gui_chat_login", new Object[0]);
    }
    reconButton.l = (getInstancelastRecon + 5000L < System.currentTimeMillis());
    if (!reconButton.l) {
      if (getInstanceclient.getClientConnection().getState() == EnumConnectionState.PLAY) {
        reconButton.j = L.f("gui_chat_loggedin", new Object[0]);
      } else {
        reconButton.j = L.f("gui_chat_loggedout", new Object[0]);
      }
    }
    if (getInstanceclient.getClientConnection().getState() == EnumConnectionState.LOGIN)
    {
      reconButton.l = false;
      reconButton.j = L.f("gui_chat_pleasewait", new Object[0]);
    }
  }
  
  private void drawYesNoBox()
  {
    if (!YesNoBox) {
      return;
    }
    draw.drawBox(l / 2 - 100, m / 2 - 20, l / 2 + 100, m / 2 + 50);
    draw.drawCenteredString(de.labystudio.utils.Color.cl("c") + L.f("gui_chat_warning", new Object[0]), l / 2, m / 2 - 13);
    draw.drawCenteredString(L.f("gui_chat_removequestion_line1", new Object[0]), l / 2, m / 2 - 2);
    draw.drawCenteredString(L.f("gui_chat_removequestion_line2", new Object[] { showPlayerSettingsPlayer.getName() }), l / 2, m / 2 + 8);
  }
  
  private void drawSettings()
  {
    if (getInstanceselectedPlayer == null)
    {
      GL11.glColor3d(1.0D, 1.0D, 1.0D);
      GL11.glPushMatrix();
      GL11.glScaled(2.0D, 2.0D, 2.0D);
      GL11.glTranslated(-78.2D, -8.0D, 0.0D);
      getInstancetextureManager.drawPlayerHead(LabyMod.getInstance().getPlayerName(), 150.0D, 25.0D, 1.0D);
      GL11.glScaled(0.7D, 0.7D, 0.7D);
      GL11.glTranslated(79.2D, 10.0D, 0.0D);
      draw.drawString(de.labystudio.utils.Color.cl("b") + de.labystudio.utils.Color.cl("l") + LabyMod.getInstance().getPlayerName(), 183.0D, 28.0D);
      GL11.glPopMatrix();
      draw.drawString(L.f("gui_chat_personalmessage", new Object[0]) + ":", 145.0D, 98.0D);
      motdEditor.g();
      if (isConnected())
      {
        draw.drawString(L.f("gui_chat_contacts", new Object[0]) + ": " + de.labystudio.utils.Color.cl("7") + getInstanceclient.build().getContactsAmount(), 210.0D, 53.0D);
        if (getInstancedraw.getHeight() > 260)
        {
          draw.drawString(L.f("gui_chat_datejoined", new Object[0]) + ":", 150.0D, 208.0D);
          draw.drawString(buildDate(getInstanceclient.build().getJoinedFirst()), 150.0D, 219.0D);
          draw.drawString(L.f("gui_chat_lasttimeonline", new Object[0]) + ":", 270.0D, 208.0D);
          draw.drawString(buildDate(getInstanceclient.build().getLastOnline()), 270.0D, 219.0D);
        }
      }
    }
  }
  
  public boolean isConnected()
  {
    return getInstanceclient.getClientConnection().getState() == EnumConnectionState.PLAY;
  }
  
  public String buildDate(long time)
  {
    Date date = new Date(time);
    DateFormat df = new SimpleDateFormat("dd/MM/yyyy HH:mm");
    return de.labystudio.utils.Color.cl("7") + df.format(date);
  }
  
  private void drawPlayerInfo()
  {
    if ((!playerInfo) || (getInstanceselectedPlayer == null)) {
      return;
    }
    draw.drawBox(l / 2 - 180, m / 2 - 70, l / 2 + 180, m / 2 + 70);
    
    getInstancetextureManager.drawPlayerHead(getInstanceselectedPlayer.getName(), l / 2 - 175, m / 2 - 60, 4.1D);
    double k = 1.7D;
    GL11.glPushMatrix();
    GL11.glScaled(k, k, k);
    draw.drawString(getInstanceselectedPlayer.getName(), (int)((l / 2 - 40) / k), (int)(m / 2 / k - 35.0D));
    GL11.glPopMatrix();
    GL11.glPushMatrix();
    k = 1.2D;
    GL11.glScaled(k, k, k);
    drawStatusSymbol(getInstanceselectedPlayer.getStatus(), getInstanceselectedPlayer.isRequest(), (int)((l / 2 - 40) / k), (int)(m / 2 / k - 34.0D));
    String status = de.labystudio.utils.Color.cl("e") + L.f("gui_chat_status_request", new Object[0]);
    if (!getInstanceselectedPlayer.isRequest())
    {
      if (getInstanceselectedPlayer.getStatus() == LabyModPlayer.OnlineStatus.ONLINE) {
        status = de.labystudio.utils.Color.cl("2") + L.f("gui_chat_status_online", new Object[0]);
      }
      if (getInstanceselectedPlayer.getStatus() == LabyModPlayer.OnlineStatus.AWAY) {
        status = de.labystudio.utils.Color.cl("b") + L.f("gui_chat_status_away", new Object[0]);
      }
      if (getInstanceselectedPlayer.getStatus() == LabyModPlayer.OnlineStatus.BUSY) {
        status = de.labystudio.utils.Color.cl("d") + L.f("gui_chat_status_busy", new Object[0]);
      }
      if (getInstanceselectedPlayer.getStatus() == LabyModPlayer.OnlineStatus.OFFLINE) {
        status = de.labystudio.utils.Color.cl("4") + L.f("gui_chat_status_offline", new Object[0]);
      }
    }
    draw.drawString(status, (int)((l / 2 - 25) / k), (int)(m / 2 / k - 34.0D));
    GL11.glPopMatrix();
    if ((getInstanceselectedPlayer.isOnline()) && (!getInstanceselectedPlayer.getTimeZone().isEmpty()))
    {
      df.setCalendar(Calendar.getInstance());
      df.setTimeZone(TimeZone.getTimeZone(getInstanceselectedPlayer.getTimeZone()));
      draw.drawString(df.format(df.getCalendar().getTime()) + " " + df.getTimeZone().getDisplayName(), l / 2 - 40, m / 2 - 25);
    }
    if ((getInstanceselectedPlayer.isOnline()) && (getInstanceselectedPlayer.getContactsAmount() != 0)) {
      draw.drawString(L.f("gui_chat_contacts", new Object[0]) + ": " + de.labystudio.utils.Color.cl("7") + getInstanceselectedPlayer.getContactsAmount(), l / 2 - 40, m / 2 - 13);
    }
    if ((!getInstanceselectedPlayer.getServerInfo().getServerIp().replace(" ", "").isEmpty()) && 
      (getInstanceselectedPlayer.isOnline())) {
      if (getInstanceselectedPlayer.getServerInfo().getSpecifiedServerName() != null) {
        draw.drawString(L.f("gui_chat_server", new Object[0]) + ": " + de.labystudio.utils.Color.cl("7") + getInstanceselectedPlayer.getServerInfo().getServerIp() + " (" + getInstanceselectedPlayer.getServerInfo().getSpecifiedServerName() + ")", l / 2 - 40, m / 2 - 3);
      } else {
        draw.drawString(L.f("gui_chat_server", new Object[0]) + ": " + de.labystudio.utils.Color.cl("7") + getInstanceselectedPlayer.getServerInfo().getServerIp(), l / 2 - 40, m / 2 - 3);
      }
    }
    if (!getInstanceselectedPlayer.isRequest())
    {
      draw.drawString(L.f("gui_chat_datejoined", new Object[0]) + ":", l / 2 - 40, m / 2 + 12);
      draw.drawString(buildDate(getInstanceselectedPlayer.getJoinedFirst()), l / 2 - 40, m / 2 + 23);
      
      draw.drawString(L.f("gui_chat_lasttimeonline", new Object[0]) + ":", l / 2 - 40, m / 2 + 37);
      draw.drawString(buildDate(getInstanceselectedPlayer.getLastOnline()), l / 2 - 40, m / 2 + 48);
    }
  }
  
  private void drawRequestScreen()
  {
    if (getInstanceselectedPlayer == null) {
      return;
    }
    if (!(getInstanceselectedPlayer instanceof LabyModPlayerRequester)) {
      return;
    }
    GL11.glColor3d(1.0D, 1.0D, 1.0D);
    getInstancetextureManager.drawPlayerHead(getInstanceselectedPlayer.getName(), (l - 140) / 2 + 5 + 100, m / 2 - 75, 2.0D);
    double k = 2.0D;
    GL11.glPushMatrix();
    GL11.glScaled(k, k, k);
    draw.drawCenteredString(de.labystudio.utils.Color.cl("b") + de.labystudio.utils.Color.cl("l") + getInstanceselectedPlayer.getName(), ((l - 140) / 2 + 5 + 132) / (int)k, m / 2 / (int)k - 3);
    GL11.glPopMatrix();
  }
  
  private String fixLine(String i)
  {
    while (i.contains("  ")) {
      i = i.replace("  ", "");
    }
    return i;
  }
  
  private void sendMessage()
  {
    if (chatArea == null) {
      return;
    }
    if (getInstanceselectedPlayer == null) {
      return;
    }
    if (getInstanceselectedPlayer.isRequest()) {
      return;
    }
    if (chatArea.b().replace(" ", "").isEmpty()) {
      return;
    }
    if (LabyMod.getInstance().getClient().getClientConnection().getState() != EnumConnectionState.PLAY) {
      return;
    }
    String message = fixLine(chatArea.b());
    message = message.replace("'", "´");
    chatArea.a("");
    chatArea.f();
    SingleChat chat = ChatHandler.getHandler().getChat(getInstanceselectedPlayer);
    if (getInstanceclient.getClientConnection().isNextDay(chat.getMessages())) {
      chat.addMessage(new TitleChatComponent(LabyMod.getInstance().getPlayerName(), System.currentTimeMillis(), getInstanceclient.getClientConnection().getThisDay()));
    }
    chat.addMessage(new MessageChatComponent(LabyMod.getInstance().getPlayerName(), System.currentTimeMillis(), message));
    getInstanceselectedPlayer.setLastMessage(System.currentTimeMillis());
    updateChatlog();
  }
  
  int scrollChatlog = 0;
  int chatLastY = 0;
  
  private void drawChatlog()
  {
    if (getInstanceselectedPlayer == null) {
      return;
    }
    if ((getInstanceselectedPlayer instanceof LabyModPlayerRequester)) {
      return;
    }
    int x = 145;
    int minY = 25;
    int maxY = m - 43 - scrollChatlog;
    int currentY = maxY;
    List<MessageChatComponent> lines = getCurrentChatlog();
    if (lines != null)
    {
      if ((LabyMod.getInstance().getClient().isTyping(getInstanceselectedPlayer)) && (getInstanceselectedPlayer.isOnline()))
      {
        currentY -= 20;
        chatLastY = (currentY - 20);
        draw.drawString(de.labystudio.utils.Color.cl("3") + L.f("gui_chat_typing", new Object[] { getInstanceselectedPlayer.getName() }), x, chatLastY + 37);
      }
      for (MessageChatComponent line : lines)
      {
        line.draw(x, currentY);
        currentY -= line.getYSize();
        chatLastY = (currentY - 20);
      }
    }
    DrawUtils.a(x - 5, minY, draw.getWidth() - 5, minY + 31, de.labystudio.utils.Color.toRGB(0, 0, 0, 240));
    draw.overlayBackground(x - 4, minY + 1, draw.getWidth() - x - 2, minY + 30);
    
    String status = de.labystudio.utils.Color.cl("4") + "OFFLINE";
    if (getInstanceselectedPlayer.getStatus() == LabyModPlayer.OnlineStatus.ONLINE) {
      status = de.labystudio.utils.Color.cl("a") + "ONLINE";
    }
    if (getInstanceselectedPlayer.getStatus() == LabyModPlayer.OnlineStatus.BUSY) {
      status = de.labystudio.utils.Color.cl("5") + "BUSY";
    }
    if (getInstanceselectedPlayer.getStatus() == LabyModPlayer.OnlineStatus.AWAY) {
      status = de.labystudio.utils.Color.cl("b") + "AWAY";
    }
    getInstancetextureManager.drawPlayerHead(getInstanceselectedPlayer.getName(), x, minY + 8, 0.7D);
    getInstancedraw.drawString(getInstanceselectedPlayer.getName(), x + 26, minY + 6);
    getInstancedraw.drawString(de.labystudio.utils.Color.cl("7") + getInstanceselectedPlayer.getMotd(), x + 26, minY + 17);
    getInstancedraw.drawRightString(status, draw.getWidth() - 8, minY + 3);
    if ((getInstanceselectedPlayer.isOnline()) && (!getInstanceselectedPlayer.getTimeZone().isEmpty()))
    {
      df.setCalendar(Calendar.getInstance());
      df.setTimeZone(TimeZone.getTimeZone(getInstanceselectedPlayer.getTimeZone()));
      getInstancedraw.drawRightString(df.format(df.getCalendar().getTime()) + " Uhr", draw.getWidth() - 8, minY + 15);
    }
    ServerInfo serverInfo = getInstanceselectedPlayer.getServerInfo();
    if (serverInfo != null) {
      if ((serverInfo.getServerIp() == null) || (serverInfo.getServerIp().replace(" ", "").isEmpty())) {
        getInstancedraw.drawRightString(de.labystudio.utils.Color.cl("c") + "Not playing " + de.labystudio.utils.Color.cl("7") + "| ", draw.getWidth() - 10 - draw.getStringWidth(status), minY + 3);
      } else if (serverInfo.getServerIp().equals("Hidden")) {
        getInstancedraw.drawRightString(de.labystudio.utils.Color.cl("4") + "Hidden serverip " + de.labystudio.utils.Color.cl("7") + "| ", draw.getWidth() - 10 - draw.getStringWidth(status), minY + 3);
      } else {
        getInstancedraw.drawRightString(de.labystudio.utils.Color.cl("e") + serverInfo.getServerIp() + " " + de.labystudio.utils.Color.cl("7") + "| ", draw.getWidth() - 10 - draw.getStringWidth(status), minY + 3);
      }
    }
  }
  
  private void drawOpenScreenshots()
  {
    List<MessageChatComponent> lines = getCurrentChatlog();
    if (lines != null) {
      for (MessageChatComponent line : lines) {
        line.drawOpen();
      }
    }
  }
  
  List<MessageChatComponent> chatlogList = new ArrayList();
  TargetDataLine micLine;
  File currentAudioFile;
  
  private List<MessageChatComponent> getCurrentChatlog()
  {
    List<MessageChatComponent> lines = new ArrayList();
    lines.clear();
    lines.addAll(chatlogList);
    return lines;
  }
  
  public void updateChatlog()
  {
    List<MessageChatComponent> list = new ArrayList();
    if ((getInstanceselectedPlayer != null) && ((getInstanceselectedPlayer instanceof LabyModPlayer)) && (!getInstanceselectedPlayer.isRequest())) {
      list = ChatHandler.getHandler().getChat(getInstanceselectedPlayer).getMessages();
    } else {
      list = new ArrayList();
    }
    chatlogList.clear();
    chatlogList.addAll(list);
  }
  
  public double avg(double... d)
  {
    double a = 0.0D;
    for (int i = 0; i < d.length; i++) {
      a += d[i];
    }
    return a / d.length;
  }
  
  private void enableMic()
  {
    try
    {
      AudioFormat format = new AudioFormat(20000.0F, 16, 1, true, true);
      TargetDataLine microphone = AudioSystem.getTargetDataLine(format);
      DataLine.Info info = new DataLine.Info(TargetDataLine.class, format);
      micLine = ((TargetDataLine)AudioSystem.getLine(info));
      micLine.open();
      micLine.start();
      currentAudioFile = createNewAudioFile();
      new rec().start();
    }
    catch (Exception localException) {}
  }
  
  private void drawInfo(String title, String message)
  {
    draw.drawBox(l / 3, m / 2 - 20, l / 3 * 2, m / 2 + 20);
    draw.drawCenteredString(de.labystudio.utils.Color.cl("c") + title, l / 2, m / 2 - 14);
    draw.drawCenteredString(message, l / 2, m / 2);
  }
  
  private void drawMic()
  {
    try
    {
      if (micButton == null) {
        return;
      }
      if (getInstanceselectedPlayer != null)
      {
        bfl.c(1.0F, 1.0F, 1.0F);
        GL11.glPushMatrix();
        GL11.glScaled(0.92D, 0.92D, 1.1D);
        GL11.glTranslated(14.9D, m / 10 - 3, 0.0D);
        if (recording) {
          GL11.glColor4d(2.0D, 0.3D, 0.3D, 1.0D);
        }
        if (!micButton.l) {
          GL11.glColor4d(1.3D, 1.0D, 1.1D, 0.5D);
        }
        j.P().a(getInstancetexture_mic);
        b(166, m - 23, 0, 0, 13, 13);
        GL11.glPopMatrix();
      }
      if (micLine != null)
      {
        int smoothLevel = calcMicLevel();
        
        int h = java.awt.Color.GREEN.getRGB();
        if (smoothLevel > 7) {
          h = java.awt.Color.ORANGE.getRGB();
        }
        if (smoothLevel > 10) {
          h = java.awt.Color.RED.getRGB();
        }
        DrawUtils.a(164, m - 145, 250, m - 39, Integer.MIN_VALUE);
        draw.drawBox(164, m - 145, 176, m - 39);
        a(165, m - 40 - smoothLevel * 5, 175, m - 40, h, java.awt.Color.GREEN.getRGB());
        draw.drawString(de.labystudio.utils.Color.cl("c") + "Recording.. ", 180.0D, m - 140);
        draw.drawString("" + ModGui.truncateTo((micLine.getFramePosition() + 0.0D) / micLine.getFormat().getFrameRate(), 1) + " sec", 180.0D, m - 140 + 10);
        if (micLine.getFramePosition() / 10000 / 2 > 60) {
          recording = false;
        }
        if ((!recording) && (micLine != null))
        {
          micCooldown = System.currentTimeMillis();
          if (micLine.getFramePosition() / 10000 / 2 < 1)
          {
            micLine.stop();
            micLine.close();
            if (settingschatAlertType)
            {
              if (settingsalertsChat) {
                LabyMod.getInstance().displayMessageInChat(ClientConnection.chatPrefix + de.labystudio.utils.Color.cl("c") + "Recording is too short!");
              }
            }
            else {
              getInstanceachievementGui.displayBroadcast(BroadcastType.ERROR, "Recording is too short!", EnumAlertType.CHAT);
            }
          }
          else
          {
            micLine.stop();
            micLine.close();
            LabyModPlayer p = getInstanceselectedPlayer;
            if (p == null) {
              currentAudioFile.delete();
            }
          }
          micLine = null;
          currentAudioFile = null;
        }
      }
    }
    catch (Exception localException) {}
  }
  
  int micLevel = 0;
  int micLastLevel = 0;
  int changeCount = 0;
  int smoothLevel = 0;
  double result = 0.0D;
  int micTimer = 0;
  
  private int calcMicLevel()
  {
    new level().start();
    int calc = micLevel - micLastLevel;
    if (calc < 0) {
      calc *= -1;
    }
    if (calc > 5) {
      changeCount += 1;
    }
    if (micTimer > 3)
    {
      micTimer = 0;
      result = changeCount;
      changeCount = 0;
      smoothLevel -= 1;
    }
    micTimer += 1;
    
    micLastLevel = micLevel;
    if (smoothLevel > result * 10.0D) {
      smoothLevel -= 1;
    }
    if (smoothLevel < result * 5.0D) {
      smoothLevel += 1;
    }
    if (smoothLevel > 18) {
      smoothLevel = 18;
    }
    return smoothLevel;
  }
  
  private int calculateRMSLevel(byte[] audioData)
  {
    long lSum = 0L;
    for (int i = 0; i < audioData.length; i++) {
      lSum += audioData[i];
    }
    double dAvg = lSum / audioData.length;
    
    double sumMeanSquare = 0.0D;
    for (int j = 0; j < audioData.length; j++) {
      sumMeanSquare += Math.pow(audioData[j] - dAvg, 2.0D);
    }
    double averageMeanSquare = sumMeanSquare / audioData.length;
    return (int)(Math.pow(averageMeanSquare, 0.5D) + 0.5D);
  }
  
  private static final DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd_HH.mm.ss");
  
  class rec
    extends Thread
  {
    rec() {}
    
    public void run()
    {
      AudioFileFormat.Type fileType = AudioFileFormat.Type.WAVE;
      AudioInputStream ais = new AudioInputStream(micLine);
      try
      {
        AudioSystem.write(ais, fileType, currentAudioFile);
      }
      catch (Exception localException) {}
    }
  }
  
  private static File getTimestampedPNGFileForDirectory(File p_74290_0_)
  {
    String var2 = dateFormat.format(new Date()).toString();
    int var3 = 1;
    for (;;)
    {
      File var1 = new File(p_74290_0_, var2 + (var3 == 1 ? "" : new StringBuilder().append("_").append(var3).toString()) + ".wav");
      if (!var1.exists()) {
        return var1;
      }
      var3++;
    }
  }
  
  public File createNewAudioFile()
  {
    File wavFile = new File("LabyMod/Chatlog/media/");
    if (!wavFile.exists()) {
      wavFile.mkdirs();
    }
    return getTimestampedPNGFileForDirectory(wavFile);
  }
  
  class level
    extends Thread
  {
    level() {}
    
    public void run()
    {
      if (micLine != null)
      {
        byte[] buffer = new byte[micLine.getFormat().getFrameSize()];
        micLine.read(buffer, 0, buffer.length);
        micLevel = GuiOnlineChat.this.calculateRMSLevel(buffer);
      }
    }
  }
  
  protected void b(int mouseX, int mouseY, int state)
  {
    recording = false;
    comRelease(mouseX, mouseY, state);
    super.b(mouseX, mouseY, state);
  }
  
  private void drawChatArea()
  {
    if (getInstanceselectedPlayer != null) {
      chatArea.g();
    }
  }
  
  public void a(avs button)
    throws IOException
  {
    if (switchScreen + 100L > System.currentTimeMillis()) {
      return;
    }
    if ((k == 4) && 
      (getInstancelastRecon + 5000L < System.currentTimeMillis()))
    {
      l = false;
      getInstanceselectedPlayer = null;
      getInstancelastRecon = System.currentTimeMillis();
      if (getInstanceclient.getClientConnection().getState() == EnumConnectionState.PLAY)
      {
        LabyMod.getInstance().getClient().getClientConnection().setIntentionally(true);
        getInstanceclient.disconnect();
      }
      else
      {
        getInstanceclient.connect();
      }
      refreshButtons();
    }
    if ((k == 0) && 
      (!showSettingsBox)) {
      showSettingsBox = true;
    }
    if ((k == 1) && 
      (!showFileSharing))
    {
      showFileSharing = true;
      showFileSharingButton.l = false;
    }
    if (k == 3) {
      sendMessage();
    }
    if (k == 2)
    {
      recording = true;
      enableMic();
    }
    if (k == 5)
    {
      SingleChat chat = ChatHandler.getHandler().getChat(getInstanceselectedPlayer);
      
      screenSelector = false;
      switchScreen = System.currentTimeMillis();
      b();
    }
    if (k == 6)
    {
      screenSelector = false;
      friendFinder = false;
      switchScreen = System.currentTimeMillis();
      b();
    }
    if (k == 7) {
      openFriendFinder();
    }
    if (k == 8)
    {
      sendRequest(searchFriendsArea.b());
      b();
    }
    if ((k == 9) && 
      (getInstanceselectedPlayer != null) && ((getInstanceselectedPlayer instanceof LabyModPlayerRequester)))
    {
      getInstanceclient.getClientConnection().sendPacket(new PacketPlayDenyFriendRequest((LabyModPlayerRequester)getInstanceselectedPlayer));
      getInstanceselectedPlayer = null;
      b();
    }
    if ((k == 10) && 
      (getInstanceselectedPlayer != null))
    {
      sendRequest(getInstanceselectedPlayer.getName());
      stopSpam = true;
      l = false;
      b();
    }
    if (k == 11)
    {
      settingsshowConntectedIP = (!settingsshowConntectedIP);
      getInstanceclient.getClientConnection().sendPacket(new PacketPlayChangeOptions(LabyMod.getInstance().getClient().getOptions()));
      if ((!settingsshowConntectedIP) && 
        (LabyMod.getInstance().getClient().getClientConnection().getState() != EnumConnectionState.OFFLINE)) {
        LabyMod.getInstance().getClient().getClientConnection().sendPacket(new PacketPlayServerStatus(" ", 0));
      }
      b();
    }
    if (k == 19)
    {
      settingsignoreRequests = (!settingsignoreRequests);
      b();
    }
    if (k == 12)
    {
      YesNoBox = false;
      b();
    }
    if (k == 13)
    {
      if (getInstanceclient.getClientConnection().getState() == EnumConnectionState.PLAY)
      {
        if (showPlayerSettingsPlayer.isRequest()) {
          getInstanceclient.getClientConnection().sendPacket(new PacketPlayDenyFriendRequest((LabyModPlayerRequester)getInstanceselectedPlayer));
        } else {
          getInstanceclient.getClientConnection().sendPacket(new PacketPlayFriendRemove(showPlayerSettingsPlayer));
        }
        if (settingschatAlertType)
        {
          if (settingsalertsChat) {
            LabyMod.getInstance().displayMessageInChat(ClientConnection.chatPrefix + de.labystudio.utils.Color.cl("e") + L.f("", new Object[] { getInstanceselectedPlayer.getName() }));
          }
        }
        else {
          getInstanceachievementGui.displayBroadcast(BroadcastType.INFO, L.f("", new Object[] { getInstanceselectedPlayer.getName() }), EnumAlertType.CHAT);
        }
      }
      else if (settingschatAlertType)
      {
        if (settingsalertsChat) {
          LabyMod.getInstance().displayMessageInChat(ClientConnection.chatPrefix + de.labystudio.utils.Color.cl("c") + L.f("gui_chat_message_offline", new Object[0]));
        }
      }
      else
      {
        getInstanceachievementGui.displayBroadcast(BroadcastType.ERROR, L.f("gui_chat_message_offline", new Object[0]), EnumAlertType.CHAT);
      }
      YesNoBox = false;
      b();
    }
    if (k == 14)
    {
      settingsalertsChat = (!settingsalertsChat);
      b();
    }
    if (k == 15)
    {
      settingsalertsPlayingOn = (!settingsalertsPlayingOn);
      b();
    }
    if ((k == 16) && 
      (!showStatusBox)) {
      showStatusBox = true;
    }
    if (k == 17)
    {
      settingsplaySounds = (!settingsplaySounds);
      b();
    }
    if (k == 1337)
    {
      settingslogomode = (!settingslogomode);
      b();
    }
    super.actionPermformed(button);
  }
  
  private String getCurrentPlayerName()
  {
    if (getInstanceselectedPlayer == null) {
      return "";
    }
    return getInstanceselectedPlayer.getName();
  }
  
  int PSSizeX = 120;
  int PSSizeY = 55;
  
  private void drawPlayerSettingsBox()
  {
    if (!showPlayerSettingsBox) {
      return;
    }
    PSSizeX = (draw.getStringWidth(followString(getInstanceselectedPlayer)) + 75);
    draw.drawBox(showPlayerSettingsX, showPlayerSettingsY, showPlayerSettingsX + PSSizeX, showPlayerSettingsY + PSSizeY);
    draw.drawString("Info", showPlayerSettingsX + 5, showPlayerSettingsY + 5);
    draw.drawString(followString(getInstanceselectedPlayer), showPlayerSettingsX + 5, showPlayerSettingsY + 17);
    
    draw.drawString(L.f("gui_chat_removecontact", new Object[0]), showPlayerSettingsX + 5, showPlayerSettingsY + 41);
  }
  
  private String notifyString(LabyModPlayer p)
  {
    String output = de.labystudio.utils.Color.cl("c") + "(" + L.f("status_disabled", new Object[0]) + ")";
    if ((p != null) && 
      (p.isNotify())) {
      output = de.labystudio.utils.Color.cl("a") + "(" + L.f("status_enabled", new Object[0]) + ")";
    }
    return output;
  }
  
  private String followString(LabyModPlayer p)
  {
    String output = L.f("gui_chat_joinserver", new Object[0]) + " " + de.labystudio.utils.Color.cl("c") + "(" + L.f("gui_chat_notplaying", new Object[0]) + ")";
    if ((p != null) && 
      (!p.getServerInfo().getServerIp().replace(" ", "").isEmpty()) && (p.isOnline()))
    {
      output = L.f("gui_chat_joinserver", new Object[0]) + " " + de.labystudio.utils.Color.cl("a") + "(" + p.getServerInfo().getServerIp() + ")";
      if (p.getServerInfo().getServerIp().equalsIgnoreCase("Hidden")) {
        output = L.f("gui_chat_joinserver", new Object[0]) + " " + de.labystudio.utils.Color.cl("c") + "(" + L.f("gui_chat_serverhidden", new Object[0]) + ")";
      }
    }
    return output;
  }
  
  int SSSizeX = 70;
  int SSSizeY = 42;
  
  private void drawStatusBox()
  {
    if (!showStatusBox) {
      return;
    }
    draw.drawBox(showStatusX, showStatusY, showStatusX - SSSizeX, showStatusY + SSSizeY);
    draw.drawString(de.labystudio.utils.Color.cl("a") + isStatus(0) + L.f("gui_chat_status_online", new Object[0]), showStatusX - SSSizeX + 5, showStatusY + 5);
    draw.drawString(de.labystudio.utils.Color.cl("b") + isStatus(1) + L.f("gui_chat_status_away", new Object[0]), showStatusX - SSSizeX + 5, showStatusY + 17);
    draw.drawString(de.labystudio.utils.Color.cl("d") + isStatus(2) + L.f("gui_chat_status_busy", new Object[0]), showStatusX - SSSizeX + 5, showStatusY + 29);
  }
  
  private String isStatus(int i)
  {
    if (ChatHandler.playerStatus == i) {
      return "> " + de.labystudio.utils.Color.cl("f");
    }
    return de.labystudio.utils.Color.cl("0") + "> " + de.labystudio.utils.Color.cl("f");
  }
  
  int FSSizeX = 100;
  int FSSizeY = 18;
  
  private void drawFileSharingBox()
  {
    if (!showFileSharing) {
      return;
    }
    draw.drawBox(showFileSharingX, showFileSharingY, showFileSharingX + FSSizeX, showFileSharingY - FSSizeY);
    draw.drawString("Send screenshot", showFileSharingX + 5, showFileSharingY - FSSizeY + 5);
  }
  
  int SBSizeX = 70;
  int SBSizeY = 54;
  LabyModPlayer showPlayerSettingsPlayer;
  
  private void drawSettingsBox()
  {
    if (!showSettingsBox) {
      return;
    }
    draw.drawBox(showSettingsX, showSettingsY, showSettingsX + SBSizeX, showSettingsY + SBSizeY);
    draw.drawString(de.labystudio.utils.Color.cl("b") + isSettings(0) + L.f("gui_chat_filter_all", new Object[0]), showSettingsX + 5, showSettingsY + 5);
    draw.drawString(de.labystudio.utils.Color.cl("a") + isSettings(1) + L.f("gui_chat_filter_online", new Object[0]), showSettingsX + 5, showSettingsY + 17);
    draw.drawString(de.labystudio.utils.Color.cl("e") + isSettings(2) + L.f("gui_chat_filter_requests", new Object[0]), showSettingsX + 5, showSettingsY + 29);
    draw.drawString(de.labystudio.utils.Color.cl("6") + isSettings(3) + L.f("gui_chat_filter_recent", new Object[0]), showSettingsX + 5, showSettingsY + 41);
  }
  
  private String isSettings(int i)
  {
    if (settingsshowSettingsFriend == i) {
      return "> " + de.labystudio.utils.Color.cl("f");
    }
    return de.labystudio.utils.Color.cl("0") + "> " + de.labystudio.utils.Color.cl("f");
  }
  
  private boolean playerSettingsBoxMouseClicked(int mouseX, int mouseY, int mouseButton)
  {
    if (!showPlayerSettingsBox)
    {
      showPlayerSettingsX = mouseX;
      showPlayerSettingsY = mouseY;
    }
    if ((mouseX > showPlayerSettingsX) && (mouseX < showPlayerSettingsX + PSSizeX) && (mouseY > showPlayerSettingsY) && (mouseY < showPlayerSettingsY + PSSizeY))
    {
      if ((mouseY > showPlayerSettingsY) && (mouseY < showPlayerSettingsY + 14))
      {
        playerInfo = true;
        showPlayerSettingsBox = false;
      }
      if ((mouseY > showPlayerSettingsY + 14) && (mouseY < showPlayerSettingsY + 29))
      {
        if (getInstanceselectedPlayer != null) {
          if (getInstanceselectedPlayer.isRequest())
          {
            if (settingschatAlertType)
            {
              if (settingsalertsChat) {
                LabyMod.getInstance().displayMessageInChat(ClientConnection.chatPrefix + de.labystudio.utils.Color.cl("c") + L.f("gui_chat_message_nofriends", new Object[] { getInstanceselectedPlayer.getName() }));
              }
            }
            else {
              getInstanceachievementGui.displayBroadcast(BroadcastType.ERROR, L.f("gui_chat_message_nofriends", new Object[] { getInstanceselectedPlayer.getName() }), EnumAlertType.CHAT);
            }
          }
          else if (!getInstanceselectedPlayer.isOnline())
          {
            if (settingschatAlertType)
            {
              if (settingsalertsChat) {
                LabyMod.getInstance().displayMessageInChat(ClientConnection.chatPrefix + de.labystudio.utils.Color.cl("c") + L.f("gui_chat_message_isoffline", new Object[0]));
              }
            }
            else {
              getInstanceachievementGui.displayBroadcast(BroadcastType.ERROR, L.f("gui_chat_message_isoffline", new Object[0]), EnumAlertType.CHAT);
            }
          }
          else if ((getInstanceselectedPlayer.getServerInfo().getServerIp() != null) && (!getInstanceselectedPlayer.getServerInfo().getServerIp().replace(" ", "").isEmpty()))
          {
            if (getInstanceselectedPlayer.getServerInfo().getServerIp().equalsIgnoreCase("Hidden"))
            {
              if (settingschatAlertType)
              {
                if (settingsalertsChat) {
                  LabyMod.getInstance().displayMessageInChat(ClientConnection.chatPrefix + de.labystudio.utils.Color.cl("c") + L.f("gui_chat_message_cantfollow", new Object[0]));
                }
              }
              else {
                getInstanceachievementGui.displayBroadcast(BroadcastType.ERROR, L.f("gui_chat_message_cantfollow", new Object[0]), EnumAlertType.CHAT);
              }
            }
            else {
              LabyMod.getInstance().connectToServer(getInstanceselectedPlayer.getServerInfo().getServerIp());
            }
          }
          else if (settingschatAlertType)
          {
            if (settingsalertsChat) {
              LabyMod.getInstance().displayMessageInChat(de.labystudio.utils.Color.cl("c") + L.f("gui_chat_message_notplaying", new Object[0]));
            }
          }
          else {
            getInstanceachievementGui.displayBroadcast(BroadcastType.ERROR, L.f("gui_chat_message_notplaying", new Object[0]), EnumAlertType.CHAT);
          }
        }
        showPlayerSettingsBox = false;
      }
      if (((mouseY <= showPlayerSettingsY + 29) || (mouseY >= showPlayerSettingsY + 41) || 
        (getInstanceselectedPlayer == null)) || (
        
        (mouseY > showPlayerSettingsY + 41) && (mouseY < showPlayerSettingsY + PSSizeY) && 
        (showPlayerSettingsPlayer != null)))
      {
        YesNoBox = true;
        showPlayerSettingsBox = false;
      }
      ConfigManager.save();
      b();
      return true;
    }
    if (showPlayerSettingsBox)
    {
      showPlayerSettingsBox = false;
      showPlayerSettingsPlayer = null;
    }
    return false;
  }
  
  private boolean statusBoxMouseClicked(int mouseX, int mouseY, int mouseButton)
  {
    if (!showStatusBox)
    {
      showStatusX = mouseX;
      showStatusY = mouseY;
    }
    if ((mouseX < showStatusX) && (mouseX > showStatusX - SSSizeX) && (mouseY > showStatusY) && (mouseY < showStatusY + SSSizeY))
    {
      if ((mouseY > showStatusY) && (mouseY < showStatusY + 17)) {
        ChatHandler.setStatus(0);
      }
      if ((mouseY > showStatusY + 17) && (mouseY < showStatusY + 29)) {
        ChatHandler.setStatus(1);
      }
      if ((mouseY > showStatusY + 29) && (mouseY < showStatusY + SSSizeY)) {
        ChatHandler.setStatus(2);
      }
      ConfigManager.save();
      b();
      return true;
    }
    if (showStatusBox) {
      showStatusBox = false;
    }
    return false;
  }
  
  private boolean settingsBoxMouseClicked(int mouseX, int mouseY, int mouseButton)
  {
    if (!showSettingsBox)
    {
      showSettingsX = mouseX;
      showSettingsY = mouseY;
    }
    if ((mouseX > showSettingsX) && (mouseX < showSettingsX + SBSizeX) && (mouseY > showSettingsY) && (mouseY < showSettingsY + SBSizeY))
    {
      if ((mouseY > showSettingsY) && (mouseY < showSettingsY + 17)) {
        settingsshowSettingsFriend = 0;
      }
      if ((mouseY > showSettingsY + 17) && (mouseY < showSettingsY + 29)) {
        settingsshowSettingsFriend = 1;
      }
      if ((mouseY > showSettingsY + 29) && (mouseY < showSettingsY + 41)) {
        settingsshowSettingsFriend = 2;
      }
      if ((mouseY > showSettingsY + 41) && (mouseY < showSettingsY + SBSizeY)) {
        settingsshowSettingsFriend = 3;
      }
      ConfigManager.save();
      b();
      return true;
    }
    if (showSettingsBox) {
      showSettingsBox = false;
    }
    return false;
  }
  
  private boolean fileSharingBoxMouseClicked(int mouseX, int mouseY, int mouseButton)
  {
    if (!showFileSharing)
    {
      showFileSharingX = mouseX;
      showFileSharingY = mouseY;
    }
    if ((mouseX > showFileSharingX) && (mouseX < showFileSharingX + FSSizeX) && (mouseY < showFileSharingY) && (mouseY > showFileSharingY - FSSizeY))
    {
      if ((mouseY < showFileSharingY) && (mouseY > showFileSharingY - 30)) {
        openScreenshotSelector();
      }
      return true;
    }
    if (showFileSharing) {
      showFileSharing = false;
    }
    return false;
  }
  
  boolean friendFinder = false;
  
  private void openFriendFinder()
  {
    searchFriendsArea.a("");
    friendFinder = true;
    b();
  }
  
  boolean playerExist = false;
  
  private void drawFriendFinder()
  {
    c(0);
    draw.drawCenteredString(L.f("gui_chat_addfriend", new Object[0]), l / 2, m / 2 - 25);
    searchFriendsArea.a = (l / 2 - 90);
    searchFriendsArea.f = (m / 2 - 10);
    searchFriendsArea.g();
  }
  
  private void sendRequest(String playerName)
  {
    getInstanceclient.getClientConnection().sendPacket(new PacketPlayRequestAddFriend(playerName));
    friendFinder = false;
    searchFriendsArea.a("");
    b();
  }
  
  boolean screenSelector = false;
  
  private void openScreenshotSelector()
  {
    File folder = new File("screenshots");
    if (!folder.exists()) {
      return;
    }
    screenSelected = null;
    screenSelector = true;
    refreshButtons();
    File[] list = folder.listFiles();
    ArrayUtils.reverse(list);
    screenList = list;
  }
  
  int scrollScreenBrowser = 0;
  boolean endOfScreens = false;
  File screenSelected = null;
  File[] screenList;
  int friendListY;
  int scrollFriendList;
  
  private void drawScreenSelector()
  {
    if (!screenSelector) {
      return;
    }
    c(0);
    getInstancedraw.drawChatBackground(0, 20, 190, m - 30);
    int x = 13;
    int y = 27 + scrollScreenBrowser * 20;
    endOfScreens = true;
    if (screenList != null) {
      for (File f : screenList) {
        if (y > l)
        {
          endOfScreens = false;
        }
        else if (!f.exists())
        {
          if (f == screenSelected) {
            screenSelected = null;
          }
        }
        else if (f.getName().toLowerCase().endsWith(".png"))
        {
          if (f == screenSelected)
          {
            DrawUtils.a(0, y - 2, x + 176, y + 10, 1023000000);
            bfl.c(1.0F, 1.0F, 1.0F);
          }
          j.P().a(getInstancetexture_img);
          if (f.isDirectory()) {
            b(1, y - 1, 10, 0, 10, 10);
          } else {
            b(1, y - 1, 0, 0, 10, 10);
          }
          draw.drawString(f.getName(), x, y);
          y += 12;
          if (y > draw.getHeight() - 40) {
            endOfScreens = false;
          }
        }
      }
    }
    getInstancedraw.overlayBackground(m - 30, m);
    getInstancedraw.overlayBackground(0, 20);
    if (screenSelected != null) {
      if (screenSelected.isDirectory())
      {
        draw.drawString(de.labystudio.utils.Color.cl("c") + "Only PNG files!", 195.0D, 23.0D);
      }
      else
      {
        bfl.c(1.0F, 1.0F, 1.0F);
        GL11.glPushMatrix();
        double k = l / 39 * 0.1D;
        GL11.glScaled(k, k, k);
        getInstancetextureManager.drawFileImage(screenSelected, 195.0D / k, 35.0D / k, l / k, m / k);
        draw.drawString("" + screenSelected.getName(), (int)(190.0D / k) + 3, (int)(20.0D / k));
        GL11.glPopMatrix();
      }
    }
    draw.drawString("Select screenshot", 5.0D, 7.0D);
    draw.drawString(getCurrentPlayerName(), l - 10 - draw.getStringWidth(getCurrentPlayerName()), 7.0D);
  }
  
  private void screenClick(int mouseX, int mouseY, int mouseButton)
  {
    if (!screenSelector) {
      return;
    }
    int x = 13;
    if ((mouseX <= 13) || (mouseX >= 190)) {
      return;
    }
    int y = 27 + scrollScreenBrowser * 20;
    for (File f : screenList) {
      if (f.exists()) {
        if (f.getName().toLowerCase().endsWith(".png")) {
          if ((mouseY >= 25) && (mouseY <= m - 35))
          {
            if ((mouseY > y) && (mouseY < y + 12))
            {
              screenSelected = f;
              refreshButtons();
              return;
            }
            y += 12;
          }
        }
      }
    }
  }
  
  private void finderClick(int mouseX, int mouseY, int mouseButton)
  {
    searchFriendsArea.a(mouseX, mouseY, mouseButton);
  }
  
  public void a(int mouseX, int mouseY, int mouseButton)
    throws IOException
  {
    if (playerInfo) {
      playerInfo = false;
    }
    if (YesNoBox)
    {
      if ((mouseX <= l / 2 - 100) || (mouseX >= l / 2 + 100) || (mouseY <= m / 2 - 50) || (mouseY >= m / 2 + 50))
      {
        YesNoBox = false;
        b();
      }
      super.a(mouseX, mouseY, mouseButton);
      return;
    }
    if ((settingsBoxMouseClicked(mouseX, mouseY, mouseButton)) || (fileSharingBoxMouseClicked(mouseX, mouseY, mouseButton)) || (playerSettingsBoxMouseClicked(mouseX, mouseY, mouseButton)) || (statusBoxMouseClicked(mouseX, mouseY, mouseButton))) {
      return;
    }
    List<MessageChatComponent> lines = getCurrentChatlog();
    Iterator localIterator;
    if (lines != null) {
      for (localIterator = lines.iterator(); localIterator.hasNext();)
      {
        line = (MessageChatComponent)localIterator.next();
        line.click(mouseX, mouseY, mouseButton);
      }
    }
    MessageChatComponent line;
    if (screenSelector)
    {
      screenClick(mouseX, mouseY, mouseButton);
      super.a(mouseX, mouseY, mouseButton);
      return;
    }
    if (friendFinder)
    {
      finderClick(mouseX, mouseY, mouseButton);
      super.a(mouseX, mouseY, mouseButton);
      return;
    }
    searchArea.a(mouseX, mouseY, mouseButton);
    chatArea.a(mouseX, mouseY, mouseButton);
    if (getInstanceselectedPlayer == null) {
      motdEditor.a(mouseX, mouseY, mouseButton);
    }
    int listY = listPositionY + 72;
    for (LabyModPlayer p : renderedPlayers)
    {
      if ((mouseX > 7) && (mouseX < 140) && (mouseY > listY) && (mouseY < listY + 32))
      {
        getInstanceselectedPlayer = p;
        refreshButtons();
        updateChatlog();
        scrollChatlog = 0;
        if (mouseButton == 1)
        {
          showPlayerSettingsX = mouseX;
          showPlayerSettingsY = mouseY;
          showPlayerSettingsPlayer = p;
          showPlayerSettingsBox = true;
        }
        ChatHandler.resetTyping();
        
        break;
      }
      listY += 36;
    }
    if ((mouseX > 7) && (mouseX < 140) && (mouseY > 25) && (mouseY < 57))
    {
      getInstanceselectedPlayer = null;
      refreshButtons();
    }
    if ((mouseX > 145) && 
      (getInstanceselectedPlayer != null)) {
      chatArea.b(true);
    }
    super.a(mouseX, mouseY, mouseButton);
  }
  
  protected void a(char typedChar, int keyCode)
    throws IOException
  {
    if (searchArea.a(typedChar, keyCode)) {
      scrollFriendList = 0;
    }
    if (friendFinder) {
      searchFriendsArea.a(typedChar, keyCode);
    }
    if (chatArea.a(typedChar, keyCode)) {
      copyLine = 0;
    }
    if (motdEditor.a(typedChar, keyCode)) {
      settingsmotd = motdEditor.b();
    }
    if ((keyCode == 28) || (keyCode == 156)) {
      if (friendFinder)
      {
        if (friendSelectButton.l) {
          a(friendSelectButton);
        }
      }
      else if (!screenSelector) {
        if ((sendButton != null) && 
          (sendButton.l)) {
          a(sendButton);
        }
      }
    }
    ArrayList<MessageChatComponent> log = filterList(chatlogList, LabyMod.getInstance().getPlayerName());
    if ((keyCode == 200) && 
      (copyLine < log.size()))
    {
      copyLine += 1;
      if ((copyLine <= log.size()) && (copyLine != 0)) {
        chatArea.a(((MessageChatComponent)log.get(copyLine - 1)).getMessage());
      }
    }
    if (keyCode == 208)
    {
      if (copyLine > 0)
      {
        copyLine -= 1;
        if ((copyLine <= log.size()) && (copyLine != 0)) {
          chatArea.a(((MessageChatComponent)log.get(copyLine - 1)).getMessage());
        }
      }
      if (copyLine == 0) {
        chatArea.a("");
      }
    }
    String[] split;
    if ((keyCode == 15) && 
      (!chatArea.b().isEmpty()))
    {
      split = chatArea.b().split(" ");
      String s = split[(split.length - 1)];
      if (chatArea.b().contains(" "))
      {
        complete(split, LabyMod.getInstance().getPlayerName(), s);
        for (LabyModPlayer p : getInstanceclient.getFriends()) {
          complete(split, p.getName(), s);
        }
      }
      else
      {
        complete(split, LabyMod.getInstance().getPlayerName(), chatArea.b());
        for (LabyModPlayer p : getInstanceclient.getFriends()) {
          complete(split, p.getName(), chatArea.b());
        }
      }
    }
    super.a(typedChar, keyCode);
  }
  
  private void complete(String[] split, String completed, String toComplete)
  {
    if ((!toComplete.equals(completed)) && 
      (completed.startsWith(toComplete)))
    {
      String build = "";
      if (split.length > 1) {
        for (int i = 0; i <= split.length - 2; i++) {
          build = build + split[i] + " ";
        }
      }
      chatArea.a(build + completed);
    }
  }
  
  private ArrayList<MessageChatComponent> filterList(List<MessageChatComponent> chatlogList2, String onlyPlayer)
  {
    ArrayList<MessageChatComponent> list = new ArrayList();
    for (MessageChatComponent m : chatlogList2) {
      if (m.getSender().equalsIgnoreCase(onlyPlayer)) {
        list.add(m);
      }
    }
    return list;
  }
  
  private void drawSearchArea()
  {
    getInstancedraw.drawBox(searchArea.a - 1 - 22, searchArea.f - 7, searchArea.a + 108, searchArea.f + 15);
    searchArea.g();
  }
  
  private void drawMotd(String motd, int x, int y)
  {
    int k = 0;
    boolean nextLine = false;
    for (int i = 0; i <= motd.length() - 1; i++)
    {
      char a = motd.charAt(i);
      if ((43 + k > 130) && (!nextLine))
      {
        nextLine = true;
        k = 0;
      }
      if (!nextLine) {
        draw.drawString(de.labystudio.utils.Color.cl("o") + a + "", x + k, y);
      } else if (43 + k < 130) {
        draw.drawString(de.labystudio.utils.Color.cl("o") + a + "", x + k, y + 10);
      }
      k += draw.getStringWidth(de.labystudio.utils.Color.cl("o") + a + "");
    }
  }
  
  int listPositionY = 20;
  int renderedFriends;
  int failedRender;
  List<LabyModPlayer> renderedPlayers = new ArrayList();
  
  private void drawNextEntry(LabyModPlayer p)
  {
    if (friendListY + scrollFriendList > listPositionY + 20) {
      if (friendListY + scrollFriendList < this.m - 90)
      {
        bfl.c(1.0F, 1.0F, 1.0F);
        if (getCurrentPlayerName().equals(p.getName()))
        {
          DrawUtils.a(7, 26 + friendListY + scrollFriendList, 137, 26 + friendListY + scrollFriendList + 34, 1154650990);
          GL11.glColor3d(1.0D, 1.0D, 1.0D);
          messages = 0;
        }
        if (!p.isOnline()) {
          GL11.glColor3d(0.30000001192092896D, 0.30000001192092896D, 0.30000001192092896D);
        }
        getInstancetextureManager.drawPlayerHead(p.getName(), 8.0D, 30 + friendListY + scrollFriendList, 1.0D);
        
        String m = "";
        double k = 1.0D;
        if (messages != 0)
        {
          if (p.getName().length() > 11) {
            k = 0.88D;
          }
          int amm = messages;
          if (amm > 99) {
            amm = 99;
          }
          m = de.labystudio.utils.Color.cl("c") + " (" + amm + ")";
        }
        GL11.glPushMatrix();
        GL11.glScaled(k, k, k);
        draw.drawString(de.labystudio.utils.Color.cl("b") + p.getName() + m, (int)(43.0D / k), (int)((28 + friendListY + scrollFriendList) / k));
        GL11.glPopMatrix();
        if (p.isRequest()) {
          draw.drawString(de.labystudio.utils.Color.cl("e") + de.labystudio.utils.Color.cl("l") + L.f("gui_chat_status_request", new Object[0]), 43.0D, 38 + friendListY + scrollFriendList);
        } else {
          drawMotd(p.getMotd(), 43, 38 + friendListY + scrollFriendList);
        }
        drawStatusSymbol(p.getStatus(), p.isRequest(), 9, 50 + friendListY + scrollFriendList);
        renderedFriends += 1;
        renderedPlayers.add(p);
      }
      else
      {
        failedRender += 1;
      }
    }
    friendListY += 36;
  }
  
  private void drawStatusSymbol(LabyModPlayer.OnlineStatus onlineStatus, boolean isRequest, int x, int y)
  {
    GL11.glEnable(3553);
    bfl.d();
    bfl.l();
    bfl.c(1.0F, 1.0F, 1.0F);
    String status = de.labystudio.utils.Color.cl("f") + de.labystudio.utils.Color.cl("l") + "✘";
    GL11.glColor4f(1.0F, 0.0F, 0.0F, 0.7F);
    if (onlineStatus == LabyModPlayer.OnlineStatus.ONLINE)
    {
      status = de.labystudio.utils.Color.cl("f") + de.labystudio.utils.Color.cl("l") + "✔";
      GL11.glColor4f(0.0F, 1.0F, 0.0F, 0.7F);
    }
    if (onlineStatus == LabyModPlayer.OnlineStatus.AWAY)
    {
      status = de.labystudio.utils.Color.cl("f") + de.labystudio.utils.Color.cl("l") + "/";
      GL11.glColor4f(0.0F, 1.0F, 1.0F, 0.7F);
    }
    if (onlineStatus == LabyModPlayer.OnlineStatus.BUSY)
    {
      status = de.labystudio.utils.Color.cl("f") + de.labystudio.utils.Color.cl("l") + "-";
      GL11.glColor4f(0.8F, 0.3F, 0.9F, 0.9F);
    }
    if (isRequest)
    {
      status = de.labystudio.utils.Color.cl("f") + de.labystudio.utils.Color.cl("l") + "?";
      GL11.glColor4f(1.0F, 1.0F, 0.0F, 0.7F);
    }
    j.P().a(getInstancetexture_status);
    b(x - 1, y - 1, 0, 0, 64, 64);
    
    GL11.glPushMatrix();
    GL11.glScaled(0.75D, 0.75D, 0.75D);
    draw.drawString(status, (int)(x * 1.33D) + 3, (int)(y * 1.33D) + 3);
    GL11.glPopMatrix();
    bfl.c(1.0F, 1.0F, 1.0F);
  }
  
  private void drawMyFriends()
  {
    friendListY = (listPositionY + 47);
    renderedFriends = 0;
    failedRender = 0;
    renderedPlayers.clear();
    List<LabyModPlayer> friends = new ArrayList();
    friends.addAll(ChatHandler.getMyFriends());
    if (friends.isEmpty())
    {
      if (LabyMod.getInstance().getClient().getClientConnection().getState() == EnumConnectionState.PLAY)
      {
        draw.drawCenteredString(de.labystudio.utils.Color.cl("c") + L.f("gui_chat_nofriends_title", new Object[0]), 70, listPositionY + 75);
        draw.drawCenteredString(de.labystudio.utils.Color.cl("c") + L.f("gui_chat_nofriends_all", new Object[0]), 70, listPositionY + 85);
      }
    }
    else
    {
      int visibleFriends = 0;
      for (LabyModPlayer p : friends) {
        if ((!p.getName().isEmpty()) && 
        
          (p.getName().toLowerCase().contains(searchArea.b().replace(" ", "").toLowerCase())) && 
          
          ((settingsshowSettingsFriend != 1) || 
          (p.isOnline())) && (
          
          (settingsshowSettingsFriend != 2) || 
          ((p instanceof LabyModPlayerRequester))))
        {
          visibleFriends++;
          drawNextEntry(p);
        }
      }
      if ((visibleFriends == 0) && (!friends.isEmpty())) {
        if (searchArea.b().replace(" ", "").isEmpty())
        {
          draw.drawCenteredString(de.labystudio.utils.Color.cl("c") + L.f("gui_chat_nofriends_title", new Object[0]), 70, listPositionY + 85);
          draw.drawCenteredString(de.labystudio.utils.Color.cl("c") + trlS(settingsshowSettingsFriend), 70, listPositionY + 95);
        }
        else
        {
          draw.drawCenteredString(de.labystudio.utils.Color.cl("c") + L.f("gui_chat_nofriends_error", new Object[0]), 70, listPositionY + 75);
          draw.drawCenteredString(de.labystudio.utils.Color.cl("c") + searchArea.b(), 70, listPositionY + 85);
        }
      }
    }
  }
  
  private String trlS(int i)
  {
    if ((i == 0) || (i == 3)) {
      return L.f("gui_chat_nofriends_all", new Object[0]);
    }
    if (i == 1) {
      return L.f("gui_chat_nofriends_online", new Object[0]);
    }
    if (i == 2) {
      return L.f("gui_chat_nofriends_request", new Object[0]);
    }
    return null;
  }
  
  private void drawMyProfile()
  {
    GL11.glColor3d(1.0D, 1.0D, 1.0D);
    if (getInstanceselectedPlayer == null)
    {
      DrawUtils.a(7, 26, 137, 60, 1154650990);
      GL11.glColor3d(1.0D, 1.0D, 1.0D);
    }
    draw.drawString(de.labystudio.utils.Color.cl("b") + LabyMod.getInstance().getPlayerName(), 43.0D, 28.0D);
    drawMotd(ChatHandler.getInfo(LabyMod.getInstance().getPlayerName()).getMotd(), 43, 38);
    bfl.c(1.0F, 1.0F, 1.0F);
    getInstancetextureManager.drawPlayerHead(LabyMod.getInstance().getPlayerName(), 8.0D, 30.0D, 1.0D);
  }
  
  private void drawServerStatus()
  {
    ChatHandler.getServerStatus();
  }
  
  private void drawTitle()
  {
    int i = 0;
    if (LabyMod.getInstance().getClient().getClientConnection().getState() == EnumConnectionState.PLAY) {
      i = 30;
    }
    draw.drawRightString(getConnectionStatus(), l - draw.getStringWidth(addFriendScreenButton.j) - 15 - 6 - i, 10.0D);
    if ((getInstancelastKickReason != null) && (!getInstancelastKickReason.isEmpty()) && (LabyMod.getInstance().getClient().getClientConnection().getState() != EnumConnectionState.PLAY)) {
      draw.drawString("§4" + L.f("error_error", new Object[0]) + ": §c" + getInstancelastKickReason, 145.0D, getInstancedraw.getHeight() - 18);
    }
  }
  
  int cacheMouseX = 0;
  
  public void k()
    throws IOException
  {
    super.k();
    List<MessageChatComponent> lines = getCurrentChatlog();
    if (lines != null) {
      for (MessageChatComponent line : lines) {
        line.handleMouseInput();
      }
    }
    int var1 = Mouse.getEventDWheel();
    if (var1 != 0)
    {
      if (var1 > 1) {
        var1 = 1;
      }
      if (var1 < -1) {
        var1 = -1;
      }
      if (screenSelector)
      {
        if (var1 > 0)
        {
          if (scrollScreenBrowser < 0) {
            scrollScreenBrowser += 1;
          }
        }
        else if (!endOfScreens) {
          scrollScreenBrowser -= 1;
        }
      }
      else if (!friendFinder) {
        if (cacheMouseX < 140)
        {
          if (var1 > 0)
          {
            if (scrollFriendList < 0) {
              scrollFriendList += 36;
            }
          }
          else if (failedRender != 0) {
            scrollFriendList -= 36;
          }
        }
        else if (getInstanceselectedPlayer != null) {
          if (var1 > 0)
          {
            if (chatLastY < 0) {
              scrollChatlog -= 20;
            }
          }
          else if (scrollChatlog < 0) {
            scrollChatlog += 20;
          }
        }
      }
    }
  }
  
  protected void a(int mouseX, int mouseY, int clickedMouseButton, long timeSinceLastClick)
  {
    List<MessageChatComponent> lines = getCurrentChatlog();
    if (lines != null) {
      for (MessageChatComponent line : lines) {
        line.mouseClickMove(mouseX, mouseY, clickedMouseButton, timeSinceLastClick);
      }
    }
  }
  
  private void comRelease(int mouseX, int mouseY, int state)
  {
    List<MessageChatComponent> lines = getCurrentChatlog();
    if (lines != null) {
      for (MessageChatComponent line : lines) {
        line.mouseRelease(mouseX, mouseY, state);
      }
    }
  }
}
