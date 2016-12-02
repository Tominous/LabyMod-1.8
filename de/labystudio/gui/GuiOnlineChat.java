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
import de.labystudio.utils.Color;
import de.labystudio.utils.DrawUtils;
import de.labystudio.utils.LOGO;
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
    this.childScreen = this;
    this.id = "Chat";
    this.draw = LabyMod.getInstance().draw;
  }
  
  DateFormat df = new SimpleDateFormat("HH:mm");
  DrawUtils draw;
  int copyLine = 0;
  long switchScreen = 0L;
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
    this.scrollFriendList = 0;
    this.scrollScreenBrowser = 0;
    this.scrollChatlog = 0;
    
    this.searchArea = new ModGuiTextField(-1, this.q, 29, 74, 100, 20);
    this.searchArea.setBlacklistWord(" ");
    this.searchArea.f(16);
    this.searchArea.a(false);
    
    this.searchFriendsArea = new ModGuiTextField(-1, this.q, 0, 0, 180, 20);
    this.searchFriendsArea.setBlacklistWord(" ");
    this.searchFriendsArea.f(16);
    if (this.friendFinder) {
      this.searchFriendsArea.b(true);
    }
    this.chatArea = new avw(-1, this.q, 140, this.m - 24, this.l - 178, 18);
    this.chatArea.f(120);
    this.chatArea.b(true);
    
    this.motdEditor = new avw(-1, this.q, 145, 111, 218, 20);
    this.motdEditor.f(70);
    this.motdEditor.a(ConfigManager.settings.motd);
    
    refreshButtons();
    updateChatlog();
  }
  
  private void refreshButtons()
  {
    this.n.clear();
    if (this.screenSelector)
    {
      this.screenSelectButton = new avs(5, 70, this.m - 25, 120, 20, "Send screenshot");
      this.n.add(this.screenSelectButton);
      
      avs b = new avs(6, 2, this.m - 25, 60, 20, "Cancel");
      this.n.add(b);
      return;
    }
    if (this.friendFinder)
    {
      this.friendSelectButton = new avs(8, this.l / 2 + 5, this.m / 2 + 15, 87, 20, L.f("gui_chat_sendrequest", new Object[0]));
      this.n.add(this.friendSelectButton);
      
      avs b = new avs(6, this.l / 2 - 90 - 1, this.m / 2 + 15, 90, 20, L.f("button_cancel", new Object[0]));
      this.n.add(b);
      return;
    }
    if (LabyMod.getInstance().selectedPlayer != null)
    {
      this.sendButton = new avs(3, this.l - 35, this.m - 25, 30, 20, L.f("gui_chat_send", new Object[0]));
      this.n.add(this.sendButton);
      if ((LabyMod.getInstance().selectedPlayer instanceof LabyModPlayerRequester))
      {
        avs b = new avs(10, (this.l - 140) / 2 + 2 + 140, this.m / 2 + 15, 90, 20, Color.cl("a") + L.f("gui_chat_accept", new Object[0]));
        if (this.stopSpam) {
          b.l = false;
        }
        this.n.add(b);
        
        b = new avs(9, (this.l - 140) / 2 - 92 + 140, this.m / 2 + 15, 90, 20, Color.cl("c") + L.f("gui_chat_deny", new Object[0]));
        if (this.stopSpam) {
          b.l = false;
        }
        this.n.add(b);
      }
      if (this.YesNoBox)
      {
        avs b = new avs(12, this.l / 2 - 95, this.m / 2 + 25, 90, 20, Color.cl("c") + L.f("status_no", new Object[0]));
        this.n.add(b);
        
        b = new avs(13, this.l / 2 + 5, this.m / 2 + 25, 90, 20, Color.cl("a") + L.f("status_yes", new Object[0]));
        this.n.add(b);
      }
    }
    else
    {
      avs b = new avs(11, 143, 135, 130, 20, L.f("gui_chat_showmyip", new Object[0]) + ": " + colorBoolean(ConfigManager.settings.showConntectedIP));
      this.n.add(b);
      b = new avs(14, 275, 135, 90, 20, L.f("gui_chat_showalerts", new Object[0]) + ": " + colorBoolean(ConfigManager.settings.alertsChat));
      this.n.add(b);
      b = new avs(15, 143, 157, 130, 20, L.f("gui_chat_showplayingalerts", new Object[0]) + ": " + colorBoolean(ConfigManager.settings.alertsPlayingOn));
      b.l = ConfigManager.settings.alertsChat;
      this.n.add(b);
      b = new avs(17, 275, 157, 90, 20, L.f("gui_chat_playsounds", new Object[0]) + ": " + colorBoolean(ConfigManager.settings.playSounds));
      this.n.add(b);
      b = new avs(19, 143, 179, 130, 20, L.f("gui_chat_ignorerequests", new Object[0]) + ": " + colorBoolean(ConfigManager.settings.ignoreRequests));
      this.n.add(b);
      if (LOGO.isLogo(LabyMod.getInstance().getPlayerName()))
      {
        b = new avs(1337, 275, 179, 90, 20, "Logomode: " + colorBoolean(ConfigManager.settings.logomode));
        this.n.add(b);
      }
    }
    this.showSettingsButton = new avs(0, 7, 68, 20, 20, "!");
    this.n.add(this.showSettingsButton);
    
    String text = L.f("gui_chat_addfriend", new Object[0]);
    this.addFriendScreenButton = new avs(7, this.l - 66 - 4, 3, this.draw.getStringWidth(text) + 10, 20, text);
    this.addFriendScreenButton.h = (this.l - this.draw.getStringWidth(this.addFriendScreenButton.j) - 10 - 4);
    this.n.add(this.addFriendScreenButton);
    
    this.playerStatusButton = new avs(16, this.l - this.draw.getStringWidth(this.addFriendScreenButton.j) - 45 - 4, 3, 35, 20, "?");
    this.n.add(this.playerStatusButton);
    
    this.reconButton = new avs(4, 6, this.m - 25, 130, 20, "?");
    this.reconButton.l = false;
    this.n.add(this.reconButton);
    
    super.b();
    ConfigManager.save();
    this.stopSpam = false;
  }
  
  private String colorBoolean(boolean b)
  {
    if (b) {
      return Color.cl("a") + L.f("status_yes", new Object[0]);
    }
    return Color.cl("c") + L.f("status_no", new Object[0]);
  }
  
  public void a(int mouseX, int mouseY, float partialTicks)
  {
    this.cacheMouseX = mouseX;
    if (LabyMod.getInstance().isInGame())
    {
      bfl.l();
      LabyMod.getInstance().draw.drawTransparentBackground(140, 25, this.l - 5, this.m - 30);
      LabyMod.getInstance().draw.drawTransparentBackground(6, 5 + this.listPositionY, 138, this.m - 30);
    }
    else
    {
      c();
      LabyMod.getInstance().draw.drawChatBackground(140, 25, this.l - 5, this.m - 30);
      LabyMod.getInstance().draw.drawChatBackground(6, 5 + this.listPositionY, 138, this.m - 30);
    }
    bfl.k();
    
    drawOpenScreenshots();
    if ((LabyMod.getInstance().selectedPlayer != null) && 
      (!ChatHandler.getMyFriends().contains(LabyMod.getInstance().selectedPlayer)))
    {
      LabyMod.getInstance().selectedPlayer = null;
      b();
    }
    updateButtons();
    if (this.screenSelector)
    {
      drawScreenSelector();
      super.a(mouseX, mouseY, partialTicks);
      return;
    }
    if (this.friendFinder)
    {
      drawFriendFinder();
      super.a(mouseX, mouseY, partialTicks);
      return;
    }
    drawChatlog();
    LabyMod.getInstance().draw.overlayBackground(0, 25);
    LabyMod.getInstance().draw.overlayBackground(this.m - 30, this.m);
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
    
    drawSettingsBox();
    drawStatusBox();
    drawFileSharingBox();
    drawPlayerSettingsBox();
    drawPlayerInfo();
    if (LabyMod.getInstance().newMessage)
    {
      LabyMod.getInstance().newMessage = false;
      updateChatlog();
    }
    ChatHandler.updateIsWriting(LabyMod.getInstance().selectedPlayer, this.chatArea.b());
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
    if (this.playerStatusButton == null) {
      return;
    }
    if (ChatHandler.playerStatus == 0) {
      this.playerStatusButton.j = (Color.cl("a") + L.f("gui_chat_status_online", new Object[0]));
    }
    if (ChatHandler.playerStatus == 1) {
      this.playerStatusButton.j = (Color.cl("b") + L.f("gui_chat_status_away", new Object[0]));
    }
    if (ChatHandler.playerStatus == 2) {
      this.playerStatusButton.j = (Color.cl("d") + L.f("gui_chat_status_busy", new Object[0]));
    }
    this.playerStatusButton.l = (!this.showStatusBox);
    if (LabyMod.getInstance().getClient().getClientConnection().getState() != EnumConnectionState.PLAY)
    {
      this.showStatusBox = false;
      this.playerStatusButton.l = false;
      this.playerStatusButton.m = false;
    }
    else
    {
      this.playerStatusButton.m = true;
    }
  }
  
  private void updateAddFriendScreenButton()
  {
    if (this.addFriendScreenButton != null) {
      this.addFriendScreenButton.l = (LabyMod.getInstance().client.getClientConnection().getState() == EnumConnectionState.PLAY);
    }
  }
  
  private void updateSelectButton()
  {
    if ((this.friendSelectButton != null) && 
      (this.friendFinder))
    {
      this.friendSelectButton.l = (!this.searchFriendsArea.b().isEmpty());
      if (this.searchFriendsArea.b().equalsIgnoreCase(LabyMod.getInstance().getPlayerName())) {
        this.friendSelectButton.l = false;
      }
      for (LabyModPlayer p : LabyMod.getInstance().client.getFriends()) {
        if (p.getName().equalsIgnoreCase(this.searchFriendsArea.b())) {
          this.friendSelectButton.l = false;
        }
      }
      for (LabyModPlayer p : LabyMod.getInstance().client.getRequests()) {
        if (p.getName().equalsIgnoreCase(this.searchFriendsArea.b())) {
          this.friendSelectButton.l = false;
        }
      }
    }
    if (this.screenSelectButton != null) {
      this.screenSelectButton.l = (this.screenSelected != null);
    }
  }
  
  private void updateSendButton()
  {
    if (this.sendButton != null) {
      if (LabyMod.getInstance().selectedPlayer != null) {
        this.sendButton.l = ((!LabyMod.getInstance().selectedPlayer.isRequest()) && (!this.chatArea.b().replace(" ", "").isEmpty()) && (LabyMod.getInstance().getClient().getClientConnection().getState() == EnumConnectionState.PLAY));
      } else {
        this.sendButton.l = false;
      }
    }
  }
  
  private void updateMicButton()
  {
    if (this.micButton != null) {
      this.micButton.l = false;
    }
  }
  
  private void updateSettingsButton()
  {
    if ((!ConfigManager.settings.alertsChat) && (ConfigManager.settings.alertsPlayingOn))
    {
      ConfigManager.settings.alertsPlayingOn = false;
      b();
    }
  }
  
  private String getConnectionStatus()
  {
    EnumConnectionState state = LabyMod.getInstance().client.getClientConnection().getState();
    if (state == EnumConnectionState.PLAY) {
      return Color.cl("a") + L.f("gui_chat_connection_connected", new Object[0]) + Color.cl("f");
    }
    if (state == EnumConnectionState.HELLO) {
      return Color.cl("c") + L.f("gui_chat_connection_connecting", new Object[0]) + Color.cl("f");
    }
    if (state == EnumConnectionState.LOGIN) {
      return Color.cl("c") + L.f("gui_chat_connection_loggingin", new Object[0]) + Color.cl("f");
    }
    return Color.cl("4") + L.f("gui_chat_connection_notconnected", new Object[0]) + Color.cl("f");
  }
  
  private void updateShowSettingsButton()
  {
    if (ConfigManager.settings.showSettingsFriend == 0) {
      this.showSettingsButton.j = (Color.cl("b") + "All");
    }
    if (ConfigManager.settings.showSettingsFriend == 1) {
      this.showSettingsButton.j = (Color.cl("a") + "On");
    }
    if (ConfigManager.settings.showSettingsFriend == 2) {
      this.showSettingsButton.j = (Color.cl("e") + "Rq");
    }
    if (ConfigManager.settings.showSettingsFriend == 3) {
      this.showSettingsButton.j = (Color.cl("6") + "<-");
    }
    this.showSettingsButton.l = (!this.showSettingsBox);
  }
  
  private void updateShowFileSharingButton()
  {
    if (this.showFileSharingButton != null) {
      this.showFileSharingButton.l = false;
    }
  }
  
  private void updateReconnectButton()
  {
    if (LabyMod.getInstance().client.getClientConnection().getState() == EnumConnectionState.PLAY) {
      this.reconButton.j = L.f("gui_chat_logout", new Object[0]);
    } else {
      this.reconButton.j = L.f("gui_chat_login", new Object[0]);
    }
    this.reconButton.l = (LabyMod.getInstance().lastRecon + 5000L < System.currentTimeMillis());
    if (!this.reconButton.l) {
      if (LabyMod.getInstance().client.getClientConnection().getState() == EnumConnectionState.PLAY) {
        this.reconButton.j = L.f("gui_chat_loggedin", new Object[0]);
      } else {
        this.reconButton.j = L.f("gui_chat_loggedout", new Object[0]);
      }
    }
    if (LabyMod.getInstance().client.getClientConnection().getState() == EnumConnectionState.LOGIN)
    {
      this.reconButton.l = false;
      this.reconButton.j = L.f("gui_chat_pleasewait", new Object[0]);
    }
  }
  
  private void drawYesNoBox()
  {
    if (!this.YesNoBox) {
      return;
    }
    this.draw.drawBox(this.l / 2 - 100, this.m / 2 - 20, this.l / 2 + 100, this.m / 2 + 50);
    this.draw.drawCenteredString(Color.cl("c") + L.f("gui_chat_warning", new Object[0]), this.l / 2, this.m / 2 - 13);
    this.draw.drawCenteredString(L.f("gui_chat_removequestion_line1", new Object[0]), this.l / 2, this.m / 2 - 2);
    this.draw.drawCenteredString(L.f("gui_chat_removequestion_line2", new Object[] { this.showPlayerSettingsPlayer.getName() }), this.l / 2, this.m / 2 + 8);
  }
  
  private void drawSettings()
  {
    if (LabyMod.getInstance().selectedPlayer == null)
    {
      GL11.glColor3d(1.0D, 1.0D, 1.0D);
      GL11.glPushMatrix();
      GL11.glScaled(2.0D, 2.0D, 2.0D);
      GL11.glTranslated(-78.2D, -8.0D, 0.0D);
      LabyMod.getInstance().textureManager.drawPlayerHead(LabyMod.getInstance().getPlayerName(), 150.0D, 25.0D, 1.0D);
      GL11.glScaled(0.7D, 0.7D, 0.7D);
      GL11.glTranslated(79.2D, 10.0D, 0.0D);
      this.draw.drawString(Color.cl("b") + Color.cl("l") + LabyMod.getInstance().getPlayerName(), 183.0D, 28.0D);
      GL11.glPopMatrix();
      this.draw.drawString(L.f("gui_chat_personalmessage", new Object[0]) + ":", 145.0D, 98.0D);
      this.motdEditor.g();
      if (isConnected())
      {
        this.draw.drawString(L.f("gui_chat_contacts", new Object[0]) + ": " + Color.cl("7") + LabyMod.getInstance().client.build().getContactsAmount(), 210.0D, 53.0D);
        if (LabyMod.getInstance().draw.getHeight() > 260)
        {
          this.draw.drawString(L.f("gui_chat_datejoined", new Object[0]) + ":", 150.0D, 208.0D);
          this.draw.drawString(buildDate(LabyMod.getInstance().client.build().getJoinedFirst()), 150.0D, 219.0D);
          this.draw.drawString(L.f("gui_chat_lasttimeonline", new Object[0]) + ":", 270.0D, 208.0D);
          this.draw.drawString(buildDate(LabyMod.getInstance().client.build().getLastOnline()), 270.0D, 219.0D);
        }
      }
    }
  }
  
  public boolean isConnected()
  {
    return LabyMod.getInstance().client.getClientConnection().getState() == EnumConnectionState.PLAY;
  }
  
  public String buildDate(long time)
  {
    if (time == 0L) {
      return Color.cl("7") + "Unknown";
    }
    Date date = new Date(time);
    DateFormat df = new SimpleDateFormat("dd/MM/yyyy HH:mm");
    return Color.cl("7") + df.format(date);
  }
  
  private void drawPlayerInfo()
  {
    if ((!this.playerInfo) || (LabyMod.getInstance().selectedPlayer == null)) {
      return;
    }
    this.draw.drawBox(this.l / 2 - 180, this.m / 2 - 70, this.l / 2 + 180, this.m / 2 + 70);
    
    LabyMod.getInstance().textureManager.drawPlayerHead(LabyMod.getInstance().selectedPlayer.getName(), this.l / 2 - 175, this.m / 2 - 60, 4.1D);
    double k = 1.7D;
    GL11.glPushMatrix();
    GL11.glScaled(k, k, k);
    this.draw.drawString(LabyMod.getInstance().selectedPlayer.getName(), (int)((this.l / 2 - 40) / k), (int)(this.m / 2 / k - 35.0D));
    GL11.glPopMatrix();
    GL11.glPushMatrix();
    k = 1.2D;
    GL11.glScaled(k, k, k);
    drawStatusSymbol(LabyMod.getInstance().selectedPlayer.getStatus(), LabyMod.getInstance().selectedPlayer.isRequest(), (int)((this.l / 2 - 40) / k), (int)(this.m / 2 / k - 34.0D));
    String status = Color.cl("e") + L.f("gui_chat_status_request", new Object[0]);
    if (!LabyMod.getInstance().selectedPlayer.isRequest())
    {
      if (LabyMod.getInstance().selectedPlayer.getStatus() == LabyModPlayer.OnlineStatus.ONLINE) {
        status = Color.cl("2") + L.f("gui_chat_status_online", new Object[0]);
      }
      if (LabyMod.getInstance().selectedPlayer.getStatus() == LabyModPlayer.OnlineStatus.AWAY) {
        status = Color.cl("b") + L.f("gui_chat_status_away", new Object[0]);
      }
      if (LabyMod.getInstance().selectedPlayer.getStatus() == LabyModPlayer.OnlineStatus.BUSY) {
        status = Color.cl("d") + L.f("gui_chat_status_busy", new Object[0]);
      }
      if (LabyMod.getInstance().selectedPlayer.getStatus() == LabyModPlayer.OnlineStatus.OFFLINE) {
        status = Color.cl("4") + L.f("gui_chat_status_offline", new Object[0]);
      }
    }
    this.draw.drawString(status, (int)((this.l / 2 - 25) / k), (int)(this.m / 2 / k - 34.0D));
    GL11.glPopMatrix();
    if ((LabyMod.getInstance().selectedPlayer.isOnline()) && (!LabyMod.getInstance().selectedPlayer.getTimeZone().isEmpty()))
    {
      this.df.setCalendar(Calendar.getInstance());
      this.df.setTimeZone(TimeZone.getTimeZone(LabyMod.getInstance().selectedPlayer.getTimeZone()));
      this.draw.drawString(this.df.format(this.df.getCalendar().getTime()) + " " + this.df.getTimeZone().getDisplayName(), this.l / 2 - 40, this.m / 2 - 25);
    }
    if ((LabyMod.getInstance().selectedPlayer.isOnline()) && (LabyMod.getInstance().selectedPlayer.getContactsAmount() != 0)) {
      this.draw.drawString(L.f("gui_chat_contacts", new Object[0]) + ": " + Color.cl("7") + LabyMod.getInstance().selectedPlayer.getContactsAmount(), this.l / 2 - 40, this.m / 2 - 13);
    }
    if ((!LabyMod.getInstance().selectedPlayer.getServerInfo().getServerIp().replace(" ", "").isEmpty()) && 
      (LabyMod.getInstance().selectedPlayer.isOnline())) {
      if (LabyMod.getInstance().selectedPlayer.getServerInfo().getSpecifiedServerName() != null) {
        this.draw.drawString(L.f("gui_chat_server", new Object[0]) + ": " + Color.cl("7") + LabyMod.getInstance().selectedPlayer.getServerInfo().getServerIp() + " (" + 
          LabyMod.getInstance().selectedPlayer.getServerInfo().getSpecifiedServerName() + ")", this.l / 2 - 40, this.m / 2 - 3);
      } else {
        this.draw.drawString(L.f("gui_chat_server", new Object[0]) + ": " + Color.cl("7") + LabyMod.getInstance().selectedPlayer.getServerInfo().getServerIp(), this.l / 2 - 40, this.m / 2 - 3);
      }
    }
    if (!LabyMod.getInstance().selectedPlayer.isRequest())
    {
      this.draw.drawString(L.f("gui_chat_datejoined", new Object[0]) + ":", this.l / 2 - 40, this.m / 2 + 12);
      this.draw.drawString(buildDate(LabyMod.getInstance().selectedPlayer.getJoinedFirst()), this.l / 2 - 40, this.m / 2 + 23);
      
      this.draw.drawString(L.f("gui_chat_lasttimeonline", new Object[0]) + ":", this.l / 2 - 40, this.m / 2 + 37);
      this.draw.drawString(buildDate(LabyMod.getInstance().selectedPlayer.getLastOnline()), this.l / 2 - 40, this.m / 2 + 48);
    }
  }
  
  private void drawRequestScreen()
  {
    if (LabyMod.getInstance().selectedPlayer == null) {
      return;
    }
    if (!(LabyMod.getInstance().selectedPlayer instanceof LabyModPlayerRequester)) {
      return;
    }
    GL11.glColor3d(1.0D, 1.0D, 1.0D);
    LabyMod.getInstance().textureManager.drawPlayerHead(LabyMod.getInstance().selectedPlayer.getName(), (this.l - 140) / 2 + 5 + 100, this.m / 2 - 75, 2.0D);
    double k = 2.0D;
    GL11.glPushMatrix();
    GL11.glScaled(k, k, k);
    this.draw.drawCenteredString(Color.cl("b") + Color.cl("l") + LabyMod.getInstance().selectedPlayer.getName(), ((this.l - 140) / 2 + 5 + 132) / (int)k, this.m / 2 / (int)k - 3);
    
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
    if (this.chatArea == null) {
      return;
    }
    if (LabyMod.getInstance().selectedPlayer == null) {
      return;
    }
    if (LabyMod.getInstance().selectedPlayer.isRequest()) {
      return;
    }
    if (this.chatArea.b().replace(" ", "").isEmpty()) {
      return;
    }
    if (LabyMod.getInstance().getClient().getClientConnection().getState() != EnumConnectionState.PLAY) {
      return;
    }
    String message = fixLine(this.chatArea.b());
    message = message.replace("'", "´");
    this.chatArea.a("");
    this.chatArea.f();
    SingleChat chat = ChatHandler.getHandler().getChat(LabyMod.getInstance().selectedPlayer);
    if (LabyMod.getInstance().client.getClientConnection().isNextDay(chat.getMessages())) {
      chat.addMessage(new TitleChatComponent(LabyMod.getInstance().getPlayerName(), System.currentTimeMillis(), LabyMod.getInstance().client.getClientConnection().getThisDay()));
    }
    chat.addMessage(new MessageChatComponent(LabyMod.getInstance().getPlayerName(), System.currentTimeMillis(), message));
    LabyMod.getInstance().selectedPlayer.setLastMessage(System.currentTimeMillis());
    updateChatlog();
  }
  
  int scrollChatlog = 0;
  int chatLastY = 0;
  
  private void drawChatlog()
  {
    if (LabyMod.getInstance().selectedPlayer == null) {
      return;
    }
    if ((LabyMod.getInstance().selectedPlayer instanceof LabyModPlayerRequester)) {
      return;
    }
    int x = 145;
    int minY = 25;
    int maxY = this.m - 43 - this.scrollChatlog;
    int currentY = maxY;
    List<MessageChatComponent> lines = getCurrentChatlog();
    if (lines != null)
    {
      if ((LabyMod.getInstance().getClient().isTyping(LabyMod.getInstance().selectedPlayer)) && (LabyMod.getInstance().selectedPlayer.isOnline()))
      {
        currentY -= 20;
        this.chatLastY = (currentY - 20);
        this.draw.drawString(Color.cl("3") + L.f("gui_chat_typing", new Object[] { LabyMod.getInstance().selectedPlayer.getName() }), x, this.chatLastY + 37);
      }
      for (MessageChatComponent line : lines)
      {
        line.draw(x, currentY);
        currentY -= line.getYSize();
        this.chatLastY = (currentY - 20);
      }
    }
    DrawUtils.a(x - 5, minY, this.draw.getWidth() - 5, minY + 31, Color.toRGB(0, 0, 0, 240));
    this.draw.overlayBackground(x - 4, minY + 1, this.draw.getWidth() - x - 2, minY + 30);
    
    String status = Color.cl("4") + "OFFLINE";
    if (LabyMod.getInstance().selectedPlayer.getStatus() == LabyModPlayer.OnlineStatus.ONLINE) {
      status = Color.cl("a") + "ONLINE";
    }
    if (LabyMod.getInstance().selectedPlayer.getStatus() == LabyModPlayer.OnlineStatus.BUSY) {
      status = Color.cl("5") + "BUSY";
    }
    if (LabyMod.getInstance().selectedPlayer.getStatus() == LabyModPlayer.OnlineStatus.AWAY) {
      status = Color.cl("b") + "AWAY";
    }
    LabyMod.getInstance().textureManager.drawPlayerHead(LabyMod.getInstance().selectedPlayer.getName(), x, minY + 8, 0.7D);
    LabyMod.getInstance().draw.drawString(LabyMod.getInstance().selectedPlayer.getName(), x + 26, minY + 6);
    LabyMod.getInstance().draw.drawString(Color.cl("7") + LabyMod.getInstance().selectedPlayer.getMotd(), x + 26, minY + 17);
    LabyMod.getInstance().draw.drawRightString(status, this.draw.getWidth() - 8, minY + 3);
    if ((LabyMod.getInstance().selectedPlayer.isOnline()) && (!LabyMod.getInstance().selectedPlayer.getTimeZone().isEmpty()))
    {
      this.df.setCalendar(Calendar.getInstance());
      this.df.setTimeZone(TimeZone.getTimeZone(LabyMod.getInstance().selectedPlayer.getTimeZone()));
      LabyMod.getInstance().draw.drawRightString(this.df.format(this.df.getCalendar().getTime()) + " Uhr", this.draw.getWidth() - 8, minY + 15);
    }
    ServerInfo serverInfo = LabyMod.getInstance().selectedPlayer.getServerInfo();
    if (serverInfo != null) {
      if ((serverInfo.getServerIp() == null) || (serverInfo.getServerIp().replace(" ", "").isEmpty())) {
        LabyMod.getInstance().draw.drawRightString(Color.cl("c") + "Not playing " + Color.cl("7") + "| ", this.draw.getWidth() - 10 - this.draw.getStringWidth(status), minY + 3);
      } else if (serverInfo.getServerIp().equals("Hidden")) {
        LabyMod.getInstance().draw.drawRightString(Color.cl("4") + "Hidden serverip " + Color.cl("7") + "| ", this.draw.getWidth() - 10 - this.draw.getStringWidth(status), minY + 3);
      } else {
        LabyMod.getInstance().draw.drawRightString(Color.cl("e") + serverInfo.getServerIp() + " " + Color.cl("7") + "| ", this.draw.getWidth() - 10 - this.draw.getStringWidth(status), minY + 3);
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
  
  private List<MessageChatComponent> getCurrentChatlog()
  {
    List<MessageChatComponent> lines = new ArrayList();
    lines.clear();
    lines.addAll(this.chatlogList);
    return lines;
  }
  
  public void updateChatlog()
  {
    List<MessageChatComponent> list = new ArrayList();
    if ((LabyMod.getInstance().selectedPlayer != null) && ((LabyMod.getInstance().selectedPlayer instanceof LabyModPlayer)) && (!LabyMod.getInstance().selectedPlayer.isRequest())) {
      list = ChatHandler.getHandler().getChat(LabyMod.getInstance().selectedPlayer).getMessages();
    } else {
      list = new ArrayList();
    }
    this.chatlogList.clear();
    this.chatlogList.addAll(list);
  }
  
  public double avg(double... d)
  {
    double a = 0.0D;
    for (int i = 0; i < d.length; i++) {
      a += d[i];
    }
    return a / d.length;
  }
  
  private void drawInfo(String title, String message)
  {
    this.draw.drawBox(this.l / 3, this.m / 2 - 20, this.l / 3 * 2, this.m / 2 + 20);
    this.draw.drawCenteredString(Color.cl("c") + title, this.l / 2, this.m / 2 - 14);
    this.draw.drawCenteredString(message, this.l / 2, this.m / 2);
  }
  
  private static final DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd_HH.mm.ss");
  
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
  
  protected void b(int mouseX, int mouseY, int state)
  {
    comRelease(mouseX, mouseY, state);
    super.b(mouseX, mouseY, state);
  }
  
  private void drawChatArea()
  {
    if (LabyMod.getInstance().selectedPlayer != null) {
      this.chatArea.g();
    }
  }
  
  public void a(avs button)
    throws IOException
  {
    if (this.switchScreen + 100L > System.currentTimeMillis()) {
      return;
    }
    if ((button.k == 4) && 
      (LabyMod.getInstance().lastRecon + 5000L < System.currentTimeMillis()))
    {
      button.l = false;
      LabyMod.getInstance().selectedPlayer = null;
      LabyMod.getInstance().lastRecon = System.currentTimeMillis();
      if (LabyMod.getInstance().client.getClientConnection().getState() == EnumConnectionState.PLAY)
      {
        LabyMod.getInstance().getClient().getClientConnection().setIntentionally(true);
        LabyMod.getInstance().client.disconnect();
      }
      else
      {
        LabyMod.getInstance().client.connect();
      }
      refreshButtons();
    }
    if ((button.k == 0) && 
      (!this.showSettingsBox)) {
      this.showSettingsBox = true;
    }
    if ((button.k == 1) && 
      (!this.showFileSharing))
    {
      this.showFileSharing = true;
      this.showFileSharingButton.l = false;
    }
    if (button.k == 3) {
      sendMessage();
    }
    if ((button.k != 2) || 
    
      (button.k == 5))
    {
      SingleChat chat = ChatHandler.getHandler().getChat(LabyMod.getInstance().selectedPlayer);
      
      this.screenSelector = false;
      this.switchScreen = System.currentTimeMillis();
      b();
    }
    if (button.k == 6)
    {
      this.screenSelector = false;
      this.friendFinder = false;
      this.switchScreen = System.currentTimeMillis();
      b();
    }
    if (button.k == 7) {
      openFriendFinder();
    }
    if (button.k == 8)
    {
      sendRequest(this.searchFriendsArea.b());
      b();
    }
    if ((button.k == 9) && 
      (LabyMod.getInstance().selectedPlayer != null) && ((LabyMod.getInstance().selectedPlayer instanceof LabyModPlayerRequester)))
    {
      LabyMod.getInstance().client.getClientConnection().sendPacket(new PacketPlayDenyFriendRequest((LabyModPlayerRequester)LabyMod.getInstance().selectedPlayer));
      LabyMod.getInstance().selectedPlayer = null;
      b();
    }
    if ((button.k == 10) && 
      (LabyMod.getInstance().selectedPlayer != null))
    {
      sendRequest(LabyMod.getInstance().selectedPlayer.getName());
      this.stopSpam = true;
      button.l = false;
      b();
    }
    if (button.k == 11)
    {
      ConfigManager.settings.showConntectedIP = (!ConfigManager.settings.showConntectedIP);
      LabyMod.getInstance().client.getClientConnection().sendPacket(new PacketPlayChangeOptions(LabyMod.getInstance().getClient().getOptions()));
      if ((!ConfigManager.settings.showConntectedIP) && 
        (LabyMod.getInstance().getClient().getClientConnection().getState() != EnumConnectionState.OFFLINE)) {
        LabyMod.getInstance().getClient().getClientConnection().sendPacket(new PacketPlayServerStatus(" ", 0));
      }
      b();
    }
    if (button.k == 19)
    {
      ConfigManager.settings.ignoreRequests = (!ConfigManager.settings.ignoreRequests);
      b();
    }
    if (button.k == 12)
    {
      this.YesNoBox = false;
      b();
    }
    if (button.k == 13)
    {
      if (LabyMod.getInstance().client.getClientConnection().getState() == EnumConnectionState.PLAY)
      {
        if (this.showPlayerSettingsPlayer.isRequest()) {
          LabyMod.getInstance().client.getClientConnection().sendPacket(new PacketPlayDenyFriendRequest((LabyModPlayerRequester)LabyMod.getInstance().selectedPlayer));
        } else {
          LabyMod.getInstance().client.getClientConnection().sendPacket(new PacketPlayFriendRemove(this.showPlayerSettingsPlayer));
        }
        if (ConfigManager.settings.chatAlertType)
        {
          if (ConfigManager.settings.alertsChat) {
            LabyMod.getInstance().displayMessageInChat(ClientConnection.chatPrefix + Color.cl("e") + L.f("", new Object[] { LabyMod.getInstance().selectedPlayer.getName() }));
          }
        }
        else {
          LabyMod.getInstance().achievementGui.displayBroadcast(BroadcastType.INFO, L.f("", new Object[] { LabyMod.getInstance().selectedPlayer.getName() }), EnumAlertType.CHAT);
        }
      }
      else if (ConfigManager.settings.chatAlertType)
      {
        if (ConfigManager.settings.alertsChat) {
          LabyMod.getInstance().displayMessageInChat(ClientConnection.chatPrefix + Color.cl("c") + L.f("gui_chat_message_offline", new Object[0]));
        }
      }
      else
      {
        LabyMod.getInstance().achievementGui.displayBroadcast(BroadcastType.ERROR, L.f("gui_chat_message_offline", new Object[0]), EnumAlertType.CHAT);
      }
      this.YesNoBox = false;
      b();
    }
    if (button.k == 14)
    {
      ConfigManager.settings.alertsChat = (!ConfigManager.settings.alertsChat);
      b();
    }
    if (button.k == 15)
    {
      ConfigManager.settings.alertsPlayingOn = (!ConfigManager.settings.alertsPlayingOn);
      b();
    }
    if ((button.k == 16) && 
      (!this.showStatusBox)) {
      this.showStatusBox = true;
    }
    if (button.k == 17)
    {
      ConfigManager.settings.playSounds = (!ConfigManager.settings.playSounds);
      b();
    }
    if (button.k == 1337)
    {
      ConfigManager.settings.logomode = (!ConfigManager.settings.logomode);
      b();
    }
    super.actionPermformed(button);
  }
  
  private String getCurrentPlayerName()
  {
    if (LabyMod.getInstance().selectedPlayer == null) {
      return "";
    }
    return LabyMod.getInstance().selectedPlayer.getName();
  }
  
  int PSSizeX = 120;
  int PSSizeY = 55;
  
  private void drawPlayerSettingsBox()
  {
    if (!this.showPlayerSettingsBox) {
      return;
    }
    this.PSSizeX = (this.draw.getStringWidth(followString(LabyMod.getInstance().selectedPlayer)) + 75);
    this.draw.drawBox(this.showPlayerSettingsX, this.showPlayerSettingsY, this.showPlayerSettingsX + this.PSSizeX, this.showPlayerSettingsY + this.PSSizeY);
    this.draw.drawString("Info", this.showPlayerSettingsX + 5, this.showPlayerSettingsY + 5);
    this.draw.drawString(followString(LabyMod.getInstance().selectedPlayer), this.showPlayerSettingsX + 5, this.showPlayerSettingsY + 17);
    
    this.draw.drawString(L.f("gui_chat_removecontact", new Object[0]), this.showPlayerSettingsX + 5, this.showPlayerSettingsY + 41);
  }
  
  private String notifyString(LabyModPlayer p)
  {
    String output = Color.cl("c") + "(" + L.f("status_disabled", new Object[0]) + ")";
    if ((p != null) && 
      (p.isNotify())) {
      output = Color.cl("a") + "(" + L.f("status_enabled", new Object[0]) + ")";
    }
    return output;
  }
  
  private String followString(LabyModPlayer p)
  {
    String output = L.f("gui_chat_joinserver", new Object[0]) + " " + Color.cl("c") + "(" + L.f("gui_chat_notplaying", new Object[0]) + ")";
    if ((p != null) && 
      (!p.getServerInfo().getServerIp().replace(" ", "").isEmpty()) && (p.isOnline()))
    {
      output = L.f("gui_chat_joinserver", new Object[0]) + " " + Color.cl("a") + "(" + p.getServerInfo().getServerIp() + ")";
      if (p.getServerInfo().getServerIp().equalsIgnoreCase("Hidden")) {
        output = L.f("gui_chat_joinserver", new Object[0]) + " " + Color.cl("c") + "(" + L.f("gui_chat_serverhidden", new Object[0]) + ")";
      }
    }
    return output;
  }
  
  int SSSizeX = 70;
  int SSSizeY = 42;
  
  private void drawStatusBox()
  {
    if (!this.showStatusBox) {
      return;
    }
    this.draw.drawBox(this.showStatusX, this.showStatusY, this.showStatusX - this.SSSizeX, this.showStatusY + this.SSSizeY);
    this.draw.drawString(Color.cl("a") + isStatus(0) + L.f("gui_chat_status_online", new Object[0]), this.showStatusX - this.SSSizeX + 5, this.showStatusY + 5);
    this.draw.drawString(Color.cl("b") + isStatus(1) + L.f("gui_chat_status_away", new Object[0]), this.showStatusX - this.SSSizeX + 5, this.showStatusY + 17);
    this.draw.drawString(Color.cl("d") + isStatus(2) + L.f("gui_chat_status_busy", new Object[0]), this.showStatusX - this.SSSizeX + 5, this.showStatusY + 29);
  }
  
  private String isStatus(int i)
  {
    if (ChatHandler.playerStatus == i) {
      return "> " + Color.cl("f");
    }
    return Color.cl("0") + "> " + Color.cl("f");
  }
  
  int FSSizeX = 100;
  int FSSizeY = 18;
  
  private void drawFileSharingBox()
  {
    if (!this.showFileSharing) {
      return;
    }
    this.draw.drawBox(this.showFileSharingX, this.showFileSharingY, this.showFileSharingX + this.FSSizeX, this.showFileSharingY - this.FSSizeY);
    this.draw.drawString("Send screenshot", this.showFileSharingX + 5, this.showFileSharingY - this.FSSizeY + 5);
  }
  
  int SBSizeX = 70;
  int SBSizeY = 54;
  LabyModPlayer showPlayerSettingsPlayer;
  
  private void drawSettingsBox()
  {
    if (!this.showSettingsBox) {
      return;
    }
    this.draw.drawBox(this.showSettingsX, this.showSettingsY, this.showSettingsX + this.SBSizeX, this.showSettingsY + this.SBSizeY);
    this.draw.drawString(Color.cl("b") + isSettings(0) + L.f("gui_chat_filter_all", new Object[0]), this.showSettingsX + 5, this.showSettingsY + 5);
    this.draw.drawString(Color.cl("a") + isSettings(1) + L.f("gui_chat_filter_online", new Object[0]), this.showSettingsX + 5, this.showSettingsY + 17);
    this.draw.drawString(Color.cl("e") + isSettings(2) + L.f("gui_chat_filter_requests", new Object[0]), this.showSettingsX + 5, this.showSettingsY + 29);
    this.draw.drawString(Color.cl("6") + isSettings(3) + L.f("gui_chat_filter_recent", new Object[0]), this.showSettingsX + 5, this.showSettingsY + 41);
  }
  
  private String isSettings(int i)
  {
    if (ConfigManager.settings.showSettingsFriend == i) {
      return "> " + Color.cl("f");
    }
    return Color.cl("0") + "> " + Color.cl("f");
  }
  
  private boolean playerSettingsBoxMouseClicked(int mouseX, int mouseY, int mouseButton)
  {
    if (!this.showPlayerSettingsBox)
    {
      this.showPlayerSettingsX = mouseX;
      this.showPlayerSettingsY = mouseY;
    }
    if ((mouseX > this.showPlayerSettingsX) && (mouseX < this.showPlayerSettingsX + this.PSSizeX) && (mouseY > this.showPlayerSettingsY) && (mouseY < this.showPlayerSettingsY + this.PSSizeY))
    {
      if ((mouseY > this.showPlayerSettingsY) && (mouseY < this.showPlayerSettingsY + 14))
      {
        this.playerInfo = true;
        this.showPlayerSettingsBox = false;
      }
      if ((mouseY > this.showPlayerSettingsY + 14) && (mouseY < this.showPlayerSettingsY + 29))
      {
        if (LabyMod.getInstance().selectedPlayer != null) {
          if (LabyMod.getInstance().selectedPlayer.isRequest())
          {
            if (ConfigManager.settings.chatAlertType)
            {
              if (ConfigManager.settings.alertsChat) {
                LabyMod.getInstance().displayMessageInChat(ClientConnection.chatPrefix + Color.cl("c") + L.f("gui_chat_message_nofriends", new Object[] { LabyMod.getInstance().selectedPlayer.getName() }));
              }
            }
            else {
              LabyMod.getInstance().achievementGui.displayBroadcast(BroadcastType.ERROR, L.f("gui_chat_message_nofriends", new Object[] { LabyMod.getInstance().selectedPlayer.getName() }), EnumAlertType.CHAT);
            }
          }
          else if (!LabyMod.getInstance().selectedPlayer.isOnline())
          {
            if (ConfigManager.settings.chatAlertType)
            {
              if (ConfigManager.settings.alertsChat) {
                LabyMod.getInstance().displayMessageInChat(ClientConnection.chatPrefix + Color.cl("c") + L.f("gui_chat_message_isoffline", new Object[0]));
              }
            }
            else {
              LabyMod.getInstance().achievementGui.displayBroadcast(BroadcastType.ERROR, L.f("gui_chat_message_isoffline", new Object[0]), EnumAlertType.CHAT);
            }
          }
          else if ((LabyMod.getInstance().selectedPlayer.getServerInfo().getServerIp() != null) && 
            (!LabyMod.getInstance().selectedPlayer.getServerInfo().getServerIp().replace(" ", "").isEmpty()))
          {
            if (LabyMod.getInstance().selectedPlayer.getServerInfo().getServerIp().equalsIgnoreCase("Hidden"))
            {
              if (ConfigManager.settings.chatAlertType)
              {
                if (ConfigManager.settings.alertsChat) {
                  LabyMod.getInstance().displayMessageInChat(ClientConnection.chatPrefix + Color.cl("c") + L.f("gui_chat_message_cantfollow", new Object[0]));
                }
              }
              else {
                LabyMod.getInstance().achievementGui.displayBroadcast(BroadcastType.ERROR, L.f("gui_chat_message_cantfollow", new Object[0]), EnumAlertType.CHAT);
              }
            }
            else {
              LabyMod.getInstance().connectToServer(
                LabyMod.getInstance().selectedPlayer.getServerInfo().getServerIp() + ":" + LabyMod.getInstance().selectedPlayer.getServerInfo().getServerPort());
            }
          }
          else if (ConfigManager.settings.chatAlertType)
          {
            if (ConfigManager.settings.alertsChat) {
              LabyMod.getInstance().displayMessageInChat(Color.cl("c") + L.f("gui_chat_message_notplaying", new Object[0]));
            }
          }
          else {
            LabyMod.getInstance().achievementGui.displayBroadcast(BroadcastType.ERROR, L.f("gui_chat_message_notplaying", new Object[0]), EnumAlertType.CHAT);
          }
        }
        this.showPlayerSettingsBox = false;
      }
      if (((mouseY <= this.showPlayerSettingsY + 29) || (mouseY >= this.showPlayerSettingsY + 41) || 
        (LabyMod.getInstance().selectedPlayer == null)) || (
        
        (mouseY > this.showPlayerSettingsY + 41) && (mouseY < this.showPlayerSettingsY + this.PSSizeY) && 
        (this.showPlayerSettingsPlayer != null)))
      {
        this.YesNoBox = true;
        this.showPlayerSettingsBox = false;
      }
      ConfigManager.save();
      b();
      return true;
    }
    if (this.showPlayerSettingsBox)
    {
      this.showPlayerSettingsBox = false;
      this.showPlayerSettingsPlayer = null;
    }
    return false;
  }
  
  private boolean statusBoxMouseClicked(int mouseX, int mouseY, int mouseButton)
  {
    if (!this.showStatusBox)
    {
      this.showStatusX = mouseX;
      this.showStatusY = mouseY;
    }
    if ((mouseX < this.showStatusX) && (mouseX > this.showStatusX - this.SSSizeX) && (mouseY > this.showStatusY) && (mouseY < this.showStatusY + this.SSSizeY))
    {
      if ((mouseY > this.showStatusY) && (mouseY < this.showStatusY + 17)) {
        ChatHandler.setStatus(0);
      }
      if ((mouseY > this.showStatusY + 17) && (mouseY < this.showStatusY + 29)) {
        ChatHandler.setStatus(1);
      }
      if ((mouseY > this.showStatusY + 29) && (mouseY < this.showStatusY + this.SSSizeY)) {
        ChatHandler.setStatus(2);
      }
      ConfigManager.save();
      b();
      return true;
    }
    if (this.showStatusBox) {
      this.showStatusBox = false;
    }
    return false;
  }
  
  private boolean settingsBoxMouseClicked(int mouseX, int mouseY, int mouseButton)
  {
    if (!this.showSettingsBox)
    {
      this.showSettingsX = mouseX;
      this.showSettingsY = mouseY;
    }
    if ((mouseX > this.showSettingsX) && (mouseX < this.showSettingsX + this.SBSizeX) && (mouseY > this.showSettingsY) && (mouseY < this.showSettingsY + this.SBSizeY))
    {
      if ((mouseY > this.showSettingsY) && (mouseY < this.showSettingsY + 17)) {
        ConfigManager.settings.showSettingsFriend = 0;
      }
      if ((mouseY > this.showSettingsY + 17) && (mouseY < this.showSettingsY + 29)) {
        ConfigManager.settings.showSettingsFriend = 1;
      }
      if ((mouseY > this.showSettingsY + 29) && (mouseY < this.showSettingsY + 41)) {
        ConfigManager.settings.showSettingsFriend = 2;
      }
      if ((mouseY > this.showSettingsY + 41) && (mouseY < this.showSettingsY + this.SBSizeY)) {
        ConfigManager.settings.showSettingsFriend = 3;
      }
      ConfigManager.save();
      b();
      return true;
    }
    if (this.showSettingsBox) {
      this.showSettingsBox = false;
    }
    return false;
  }
  
  private boolean fileSharingBoxMouseClicked(int mouseX, int mouseY, int mouseButton)
  {
    if (!this.showFileSharing)
    {
      this.showFileSharingX = mouseX;
      this.showFileSharingY = mouseY;
    }
    if ((mouseX > this.showFileSharingX) && (mouseX < this.showFileSharingX + this.FSSizeX) && (mouseY < this.showFileSharingY) && (mouseY > this.showFileSharingY - this.FSSizeY))
    {
      if ((mouseY < this.showFileSharingY) && (mouseY > this.showFileSharingY - 30)) {
        openScreenshotSelector();
      }
      return true;
    }
    if (this.showFileSharing) {
      this.showFileSharing = false;
    }
    return false;
  }
  
  boolean friendFinder = false;
  
  private void openFriendFinder()
  {
    this.searchFriendsArea.a("");
    this.friendFinder = true;
    b();
  }
  
  boolean playerExist = false;
  
  private void drawFriendFinder()
  {
    c(0);
    this.draw.drawCenteredString(L.f("gui_chat_addfriend", new Object[0]), this.l / 2, this.m / 2 - 25);
    this.searchFriendsArea.a = (this.l / 2 - 90);
    this.searchFriendsArea.f = (this.m / 2 - 10);
    this.searchFriendsArea.g();
  }
  
  private void sendRequest(String playerName)
  {
    LabyMod.getInstance().client.getClientConnection().sendPacket(new PacketPlayRequestAddFriend(playerName));
    this.friendFinder = false;
    this.searchFriendsArea.a("");
    b();
  }
  
  boolean screenSelector = false;
  
  private void openScreenshotSelector()
  {
    File folder = new File("screenshots");
    if (!folder.exists()) {
      return;
    }
    this.screenSelected = null;
    this.screenSelector = true;
    refreshButtons();
    File[] list = folder.listFiles();
    ArrayUtils.reverse(list);
    this.screenList = list;
  }
  
  int scrollScreenBrowser = 0;
  boolean endOfScreens = false;
  File screenSelected = null;
  File[] screenList;
  int friendListY;
  int scrollFriendList;
  
  private void drawScreenSelector()
  {
    if (!this.screenSelector) {
      return;
    }
    c(0);
    LabyMod.getInstance().draw.drawChatBackground(0, 20, 190, this.m - 30);
    int x = 13;
    int y = 27 + this.scrollScreenBrowser * 20;
    this.endOfScreens = true;
    if (this.screenList != null) {
      for (File f : this.screenList) {
        if (y > this.l)
        {
          this.endOfScreens = false;
        }
        else if (!f.exists())
        {
          if (f == this.screenSelected) {
            this.screenSelected = null;
          }
        }
        else if (f.getName().toLowerCase().endsWith(".png"))
        {
          if (f == this.screenSelected)
          {
            DrawUtils.a(0, y - 2, x + 176, y + 10, 1023000000);
            bfl.c(1.0F, 1.0F, 1.0F);
          }
          this.j.P().a(LabyMod.getInstance().texture_img);
          if (f.isDirectory()) {
            b(1, y - 1, 10, 0, 10, 10);
          } else {
            b(1, y - 1, 0, 0, 10, 10);
          }
          this.draw.drawString(f.getName(), x, y);
          y += 12;
          if (y > this.draw.getHeight() - 40) {
            this.endOfScreens = false;
          }
        }
      }
    }
    LabyMod.getInstance().draw.overlayBackground(this.m - 30, this.m);
    LabyMod.getInstance().draw.overlayBackground(0, 20);
    if (this.screenSelected != null) {
      if (this.screenSelected.isDirectory())
      {
        this.draw.drawString(Color.cl("c") + "Only PNG files!", 195.0D, 23.0D);
      }
      else
      {
        bfl.c(1.0F, 1.0F, 1.0F);
        GL11.glPushMatrix();
        double k = this.l / 39 * 0.1D;
        GL11.glScaled(k, k, k);
        LabyMod.getInstance().textureManager.drawFileImage(this.screenSelected, 195.0D / k, 35.0D / k, this.l / k, this.m / k);
        this.draw.drawString("" + this.screenSelected.getName(), (int)(190.0D / k) + 3, (int)(20.0D / k));
        GL11.glPopMatrix();
      }
    }
    this.draw.drawString("Select screenshot", 5.0D, 7.0D);
    this.draw.drawString(getCurrentPlayerName(), this.l - 10 - this.draw.getStringWidth(getCurrentPlayerName()), 7.0D);
  }
  
  private void screenClick(int mouseX, int mouseY, int mouseButton)
  {
    if (!this.screenSelector) {
      return;
    }
    int x = 13;
    if ((mouseX <= 13) || (mouseX >= 190)) {
      return;
    }
    int y = 27 + this.scrollScreenBrowser * 20;
    for (File f : this.screenList) {
      if (f.exists()) {
        if (f.getName().toLowerCase().endsWith(".png")) {
          if ((mouseY >= 25) && (mouseY <= this.m - 35))
          {
            if ((mouseY > y) && (mouseY < y + 12))
            {
              this.screenSelected = f;
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
    this.searchFriendsArea.a(mouseX, mouseY, mouseButton);
  }
  
  public void a(int mouseX, int mouseY, int mouseButton)
    throws IOException
  {
    if (this.playerInfo) {
      this.playerInfo = false;
    }
    if (this.YesNoBox)
    {
      if ((mouseX <= this.l / 2 - 100) || (mouseX >= this.l / 2 + 100) || (mouseY <= this.m / 2 - 50) || (mouseY >= this.m / 2 + 50))
      {
        this.YesNoBox = false;
        b();
      }
      super.a(mouseX, mouseY, mouseButton);
      return;
    }
    if ((settingsBoxMouseClicked(mouseX, mouseY, mouseButton)) || (fileSharingBoxMouseClicked(mouseX, mouseY, mouseButton)) || (playerSettingsBoxMouseClicked(mouseX, mouseY, mouseButton)) || 
      (statusBoxMouseClicked(mouseX, mouseY, mouseButton))) {
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
    if (this.screenSelector)
    {
      screenClick(mouseX, mouseY, mouseButton);
      super.a(mouseX, mouseY, mouseButton);
      return;
    }
    if (this.friendFinder)
    {
      finderClick(mouseX, mouseY, mouseButton);
      super.a(mouseX, mouseY, mouseButton);
      return;
    }
    this.searchArea.a(mouseX, mouseY, mouseButton);
    this.chatArea.a(mouseX, mouseY, mouseButton);
    if (LabyMod.getInstance().selectedPlayer == null) {
      this.motdEditor.a(mouseX, mouseY, mouseButton);
    }
    int listY = this.listPositionY + 72;
    for (LabyModPlayer p : this.renderedPlayers)
    {
      if ((mouseX > 7) && (mouseX < 140) && (mouseY > listY) && (mouseY < listY + 32))
      {
        LabyMod.getInstance().selectedPlayer = p;
        refreshButtons();
        updateChatlog();
        this.scrollChatlog = 0;
        if (mouseButton == 1)
        {
          this.showPlayerSettingsX = mouseX;
          this.showPlayerSettingsY = mouseY;
          this.showPlayerSettingsPlayer = p;
          this.showPlayerSettingsBox = true;
        }
        ChatHandler.resetTyping();
        this.chatArea.b(true);
        
        break;
      }
      listY += 36;
    }
    if ((mouseX > 7) && (mouseX < 140) && (mouseY > 25) && (mouseY < 57))
    {
      LabyMod.getInstance().selectedPlayer = null;
      refreshButtons();
    }
    if ((mouseX > 145) && 
      (LabyMod.getInstance().selectedPlayer != null)) {
      this.chatArea.b(true);
    }
    super.a(mouseX, mouseY, mouseButton);
  }
  
  protected void a(char typedChar, int keyCode)
    throws IOException
  {
    if (this.searchArea.a(typedChar, keyCode)) {
      this.scrollFriendList = 0;
    }
    if (this.friendFinder) {
      this.searchFriendsArea.a(typedChar, keyCode);
    }
    if (this.chatArea.a(typedChar, keyCode)) {
      this.copyLine = 0;
    }
    if (this.motdEditor.a(typedChar, keyCode)) {
      ConfigManager.settings.motd = this.motdEditor.b();
    }
    if ((keyCode == 28) || (keyCode == 156)) {
      if (this.friendFinder)
      {
        if (this.friendSelectButton.l) {
          a(this.friendSelectButton);
        }
      }
      else if ((!this.screenSelector) && 
        (this.sendButton != null) && 
        (this.sendButton.l)) {
        a(this.sendButton);
      }
    }
    ArrayList<MessageChatComponent> log = filterList(this.chatlogList, LabyMod.getInstance().getPlayerName());
    if ((keyCode == 200) && 
      (this.copyLine < log.size()))
    {
      this.copyLine += 1;
      if ((this.copyLine <= log.size()) && (this.copyLine != 0)) {
        this.chatArea.a(((MessageChatComponent)log.get(this.copyLine - 1)).getMessage());
      }
    }
    if (keyCode == 208)
    {
      if (this.copyLine > 0)
      {
        this.copyLine -= 1;
        if ((this.copyLine <= log.size()) && (this.copyLine != 0)) {
          this.chatArea.a(((MessageChatComponent)log.get(this.copyLine - 1)).getMessage());
        }
      }
      if (this.copyLine == 0) {
        this.chatArea.a("");
      }
    }
    String[] split;
    if ((keyCode == 15) && 
      (!this.chatArea.b().isEmpty()))
    {
      split = this.chatArea.b().split(" ");
      String s = split[(split.length - 1)];
      if (this.chatArea.b().contains(" "))
      {
        complete(split, LabyMod.getInstance().getPlayerName(), s);
        for (LabyModPlayer p : LabyMod.getInstance().client.getFriends()) {
          complete(split, p.getName(), s);
        }
      }
      else
      {
        complete(split, LabyMod.getInstance().getPlayerName(), this.chatArea.b());
        for (LabyModPlayer p : LabyMod.getInstance().client.getFriends()) {
          complete(split, p.getName(), this.chatArea.b());
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
      this.chatArea.a(build + completed);
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
    LabyMod.getInstance().draw.drawBox(this.searchArea.a - 1 - 22, this.searchArea.f - 7, this.searchArea.a + 108, this.searchArea.f + 15);
    this.searchArea.g();
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
        this.draw.drawString(Color.cl("o") + a + "", x + k, y);
      } else if (43 + k < 130) {
        this.draw.drawString(Color.cl("o") + a + "", x + k, y + 10);
      }
      k += this.draw.getStringWidth(Color.cl("o") + a + "");
    }
  }
  
  int listPositionY = 20;
  int renderedFriends;
  int failedRender;
  List<LabyModPlayer> renderedPlayers = new ArrayList();
  
  private void drawNextEntry(LabyModPlayer p)
  {
    if (this.friendListY + this.scrollFriendList > this.listPositionY + 20) {
      if (this.friendListY + this.scrollFriendList < this.m - 90)
      {
        bfl.c(1.0F, 1.0F, 1.0F);
        if (getCurrentPlayerName().equals(p.getName()))
        {
          DrawUtils.a(7, 26 + this.friendListY + this.scrollFriendList, 137, 26 + this.friendListY + this.scrollFriendList + 34, 1154650990);
          GL11.glColor3d(1.0D, 1.0D, 1.0D);
          p.messages = 0;
        }
        if ((!p.isOnline()) && (!p.isRequest())) {
          GL11.glColor3d(0.10000000149011612D, 0.10000000149011612D, 0.10000000149011612D);
        }
        LabyMod.getInstance().textureManager.drawPlayerHead(p.getName(), 8.0D, 30 + this.friendListY + this.scrollFriendList, 1.0D);
        
        String m = "";
        double k = 1.0D;
        if (p.messages != 0)
        {
          if (p.getName().length() > 11) {
            k = 0.88D;
          }
          int amm = p.messages;
          if (amm > 99) {
            amm = 99;
          }
          m = Color.cl("e") + " (" + amm + ")";
        }
        GL11.glPushMatrix();
        GL11.glScaled(k, k, k);
        this.draw.drawString(Color.cl(p.isOnline() ? "a" : "c") + p.getName() + m, (int)(43.0D / k), (int)((28 + this.friendListY + this.scrollFriendList) / k));
        GL11.glPopMatrix();
        if (p.isRequest()) {
          this.draw.drawString(Color.cl("e") + Color.cl("l") + L.f("gui_chat_status_request", new Object[0]), 43.0D, 38 + this.friendListY + this.scrollFriendList);
        } else {
          drawMotd(p.getMotd(), 43, 38 + this.friendListY + this.scrollFriendList);
        }
        drawStatusSymbol(p.getStatus(), p.isRequest(), 9, 50 + this.friendListY + this.scrollFriendList);
        this.renderedFriends += 1;
        this.renderedPlayers.add(p);
      }
      else
      {
        this.failedRender += 1;
      }
    }
    this.friendListY += 36;
  }
  
  private void drawStatusSymbol(LabyModPlayer.OnlineStatus onlineStatus, boolean isRequest, int x, int y)
  {
    GL11.glEnable(3553);
    bfl.d();
    bfl.l();
    bfl.c(1.0F, 1.0F, 1.0F);
    String status = Color.cl("f") + Color.cl("l") + "✘";
    GL11.glColor4f(1.0F, 0.0F, 0.0F, 0.7F);
    if (onlineStatus == LabyModPlayer.OnlineStatus.ONLINE)
    {
      status = Color.cl("f") + Color.cl("l") + "✔";
      GL11.glColor4f(0.0F, 1.0F, 0.0F, 0.7F);
    }
    if (onlineStatus == LabyModPlayer.OnlineStatus.AWAY)
    {
      status = Color.cl("f") + Color.cl("l") + "/";
      GL11.glColor4f(0.0F, 1.0F, 1.0F, 0.7F);
    }
    if (onlineStatus == LabyModPlayer.OnlineStatus.BUSY)
    {
      status = Color.cl("f") + Color.cl("l") + "-";
      GL11.glColor4f(0.8F, 0.3F, 0.9F, 0.9F);
    }
    if (isRequest)
    {
      status = Color.cl("f") + Color.cl("l") + "?";
      GL11.glColor4f(1.0F, 1.0F, 0.0F, 0.7F);
    }
    this.j.P().a(LabyMod.getInstance().texture_status);
    b(x - 1, y - 1, 0, 0, 64, 64);
    
    GL11.glPushMatrix();
    GL11.glScaled(0.75D, 0.75D, 0.75D);
    this.draw.drawString(status, (int)(x * 1.33D) + 3, (int)(y * 1.33D) + 3);
    GL11.glPopMatrix();
    bfl.c(1.0F, 1.0F, 1.0F);
  }
  
  private void drawMyFriends()
  {
    this.friendListY = (this.listPositionY + 47);
    this.renderedFriends = 0;
    this.failedRender = 0;
    this.renderedPlayers.clear();
    List<LabyModPlayer> friends = new ArrayList();
    friends.addAll(ChatHandler.getMyFriends());
    if (friends.isEmpty())
    {
      if (LabyMod.getInstance().getClient().getClientConnection().getState() == EnumConnectionState.PLAY)
      {
        this.draw.drawCenteredString(Color.cl("c") + L.f("gui_chat_nofriends_title", new Object[0]), 70, this.listPositionY + 75);
        this.draw.drawCenteredString(Color.cl("c") + L.f("gui_chat_nofriends_all", new Object[0]), 70, this.listPositionY + 85);
      }
    }
    else
    {
      int visibleFriends = 0;
      for (LabyModPlayer p : friends) {
        if ((!p.getName().isEmpty()) && 
        
          (p.getName().toLowerCase().contains(this.searchArea.b().replace(" ", "").toLowerCase())) && 
          
          ((ConfigManager.settings.showSettingsFriend != 1) || 
          (p.isOnline())) && (
          
          (ConfigManager.settings.showSettingsFriend != 2) || 
          ((p instanceof LabyModPlayerRequester))))
        {
          visibleFriends++;
          drawNextEntry(p);
        }
      }
      if ((visibleFriends == 0) && (!friends.isEmpty())) {
        if (this.searchArea.b().replace(" ", "").isEmpty())
        {
          this.draw.drawCenteredString(Color.cl("c") + L.f("gui_chat_nofriends_title", new Object[0]), 70, this.listPositionY + 85);
          this.draw.drawCenteredString(Color.cl("c") + trlS(ConfigManager.settings.showSettingsFriend), 70, this.listPositionY + 95);
        }
        else
        {
          this.draw.drawCenteredString(Color.cl("c") + L.f("gui_chat_nofriends_error", new Object[0]), 70, this.listPositionY + 75);
          this.draw.drawCenteredString(Color.cl("c") + this.searchArea.b(), 70, this.listPositionY + 85);
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
    if (LabyMod.getInstance().selectedPlayer == null)
    {
      DrawUtils.a(7, 26, 137, 60, 1154650990);
      GL11.glColor3d(1.0D, 1.0D, 1.0D);
    }
    this.draw.drawString(Color.cl("b") + LabyMod.getInstance().getPlayerName(), 43.0D, 28.0D);
    drawMotd(ChatHandler.getInfo(LabyMod.getInstance().getPlayerName()).getMotd(), 43, 38);
    bfl.c(1.0F, 1.0F, 1.0F);
    LabyMod.getInstance().textureManager.drawPlayerHead(LabyMod.getInstance().getPlayerName(), 8.0D, 30.0D, 1.0D);
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
    this.draw.drawRightString(getConnectionStatus(), this.l - this.draw.getStringWidth(this.addFriendScreenButton.j) - 15 - 6 - i, 10.0D);
    if ((LabyMod.getInstance().lastKickReason != null) && (!LabyMod.getInstance().lastKickReason.isEmpty()) && 
      (LabyMod.getInstance().getClient().getClientConnection().getState() != EnumConnectionState.PLAY)) {
      this.draw.drawString("§4" + L.f("error_error", new Object[0]) + ": §c" + LabyMod.getInstance().lastKickReason, 145.0D, LabyMod.getInstance().draw.getHeight() - 18);
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
      if (this.screenSelector)
      {
        if (var1 > 0)
        {
          if (this.scrollScreenBrowser < 0) {
            this.scrollScreenBrowser += 1;
          }
        }
        else if (!this.endOfScreens) {
          this.scrollScreenBrowser -= 1;
        }
      }
      else if (!this.friendFinder) {
        if (this.cacheMouseX < 140)
        {
          if (var1 > 0)
          {
            if (this.scrollFriendList < 0) {
              this.scrollFriendList += 36;
            }
          }
          else if (this.failedRender != 0) {
            this.scrollFriendList -= 36;
          }
        }
        else if (LabyMod.getInstance().selectedPlayer != null) {
          if (var1 > 0)
          {
            if (this.chatLastY < 0) {
              this.scrollChatlog -= 20;
            }
          }
          else if (this.scrollChatlog < 0) {
            this.scrollChatlog += 20;
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
