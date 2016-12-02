package de.resourcepacks24.gui;

import ave;
import avs;
import avw;
import axu;
import azo;
import azp;
import bfl;
import de.resourcepacks24.main.Pack;
import de.resourcepacks24.main.ResourcePacks24;
import de.resourcepacks24.utils.DrawUtils;
import de.resourcepacks24.utils.EnumPackSorting;
import de.resourcepacks24.utils.PackFileDownloader;
import de.resourcepacks24.utils.PackInfoCallback;
import de.resourcepacks24.utils.RPTag;
import de.resourcepacks24.utils.Utils;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import org.lwjgl.input.Keyboard;
import zw;
import zx;

public class ModGuiScreenResourcePacks
  extends axu
{
  private ave mc;
  private axu lastScreen;
  private avs buttonDone;
  private avs buttonSearch;
  private avs buttonTop;
  private avs buttonLatest;
  private int selectedButton;
  private String title;
  private ModGuiResourcePacks packList;
  private avs buttonMode;
  private avs buttonDownload;
  private avs buttonOpenPage;
  private avs buttonRandomPack;
  zx breadItem = new zx(zw.b(297));
  ArrayList<BreadVector> breadVec = new ArrayList();
  private avw searchArea;
  private long cooldown = 0L;
  private int loadingBarAnimation = 0;
  
  public ModGuiScreenResourcePacks(ave mc, azo guiScreenResourcePacks)
  {
    this.mc = mc;
    this.lastScreen = guiScreenResourcePacks;
    this.selectedButton = 1;
    this.title = "Search";
  }
  
  public void b()
  {
    Keyboard.enableRepeatEvents(true);
    
    this.n.add(this.buttonDone = new avs(0, 90, this.m - 25, this.l / 4, 20, "Done"));
    
    int buttonPositionlist = 0;
    this.n.add(this.buttonSearch = new avs(1, 5, 40, 80, 20, "Search"));
    buttonPositionlist += 22;
    this.n.add(this.buttonTop = new avs(2, 5, 40 + buttonPositionlist, 80, 20, "Top 20"));
    buttonPositionlist += 22;
    this.n.add(this.buttonLatest = new avs(3, 5, 40 + buttonPositionlist, 80, 20, "Latest"));
    buttonPositionlist += 22;
    this.n.add(this.buttonRandomPack = new avs(4, 5, 40 + buttonPositionlist, 80, 20, "Random pack"));
    
    this.n.add(this.buttonMode = new avs(100, this.l - 100, 5, 80, 20, ""));
    this.searchArea = new avw(50, this.mc.k, 91, 35, this.l - 112, 20);
    this.searchArea.a(ResourcePacks24.getInstance().getSearchText());
    
    this.n.add(this.buttonDownload = new avs(101, (this.l + 70) / 2 - this.l / 4 / 2, this.m - 25, this.l / 4, 20, "Download"));
    this.n.add(this.buttonOpenPage = new avs(102, this.l - this.l / 4 - 20, this.m - 25, this.l / 4, 20, "Open in website"));
    
    List<azp> list = new ArrayList();
    this.packList = new ModGuiResourcePacks(this.mc, this.l - 90 - 20, this.m + 20, list);
    
    refreshButtons();
    
    super.b();
  }
  
  public void refreshButtons()
  {
    this.buttonSearch.l = (this.selectedButton != this.buttonSearch.k);
    this.buttonTop.l = (this.selectedButton != this.buttonTop.k);
    this.buttonLatest.l = (this.selectedButton != this.buttonLatest.k);
    this.buttonRandomPack.l = (this.selectedButton != this.buttonRandomPack.k);
    
    this.buttonMode.m = ((!this.buttonTop.l) || (!this.buttonRandomPack.l));
    this.searchArea.e(!this.buttonSearch.l);
    if (isRandomPack()) {
      this.buttonMode.j = "Next pack";
    } else if (ResourcePacks24.getInstance().isSortModeVotes()) {
      this.buttonMode.j = "Votes";
    } else {
      this.buttonMode.j = "Downloads";
    }
    refreshPacks();
    if (this.buttonSearch.l)
    {
      this.packList.a(this.packList.c(), this.m + 20, 30, this.m - 30);
      this.packList.i(90);
      this.packList.d(7, 8);
    }
    else
    {
      this.packList.a(this.packList.c(), this.m + 20, 60, this.m - 30);
      this.packList.i(90);
      this.packList.d(7, 8);
    }
  }
  
  public void refreshPacks()
  {
    this.packList.setTitle(this.title);
    this.packList.f().clear();
    for (final Pack pack : ResourcePacks24.getInstance().getPacks())
    {
      azp a = new azp((azo)this.lastScreen)
      {
        protected int a()
        {
          return 1;
        }
        
        protected void d() {}
        
        protected String c()
        {
          String color = "8";
          switch (pack.getPremiumId())
          {
          case 1: 
            color = "f";
            break;
          case 2: 
            color = "6";
            break;
          case 3: 
            color = "b";
          }
          return de.resourcepacks24.utils.Color.cl("7") + ModGuiScreenResourcePacks.this.markSearchWord(pack.getBestPossibleName(), "7") + de.resourcepacks24.utils.Color.cl("8") + " by " + de.resourcepacks24.utils.Color.cl(color) + ModGuiScreenResourcePacks.this.markSearchWord(pack.getCreator(), color);
        }
        
        protected String b()
        {
          if (pack.getDesc() == null) {
            return "";
          }
          return de.resourcepacks24.utils.Color.cl("9") + ModGuiScreenResourcePacks.this.markSearchWord(pack.getDesc(), "9").replace("\r", "");
        }
      };
      this.packList.f().add(a);
      a.setPackInfo(pack);
    }
  }
  
  public boolean isRandomPack()
  {
    return this.title.equals("Random pack");
  }
  
  private String markSearchWord(String word, String resetColor)
  {
    return this.searchArea.b().isEmpty() ? word : word.replace(this.searchArea.b(), de.resourcepacks24.utils.Color.cl("n") + this.searchArea.b() + de.resourcepacks24.utils.Color.cl(resetColor));
  }
  
  protected void a(char typedChar, int keyCode)
    throws IOException
  {
    if (this.searchArea.a(typedChar, keyCode))
    {
      ResourcePacks24.getInstance().setSearchText(this.searchArea.b());
      refreshButtons();
    }
    super.a(typedChar, keyCode);
  }
  
  public void k()
    throws IOException
  {
    if (!isRandomPack()) {
      this.packList.p();
    }
    super.k();
  }
  
  protected void a(int mouseX, int mouseY, int mouseButton)
    throws IOException
  {
    if (!isRandomPack()) {
      this.packList.b(mouseX, mouseY, mouseButton);
    }
    this.searchArea.a(mouseX, mouseY, mouseButton);
    
    int tagPositionY = 135;
    for (RPTag tag : ResourcePacks24.getInstance().getRpTags())
    {
      if ((mouseX > 70) && (mouseX < 80) && (mouseY > tagPositionY) && (mouseY < tagPositionY + 10))
      {
        tag.setEnabled(!tag.isEnabled());
        refreshPacks();
      }
      tagPositionY += 12;
    }
    super.a(mouseX, mouseY, mouseButton);
  }
  
  protected void a(avs button)
    throws IOException
  {
    if (button.k == 0) {
      this.mc.a(this.lastScreen);
    }
    if ((button.k == 1) || (button.k == 2) || (button.k == 3) || (button.k == 4))
    {
      ResourcePacks24.getInstance().setSelectedPack(null);
      if (button.k == 1) {
        ResourcePacks24.getInstance().sort(EnumPackSorting.NONE);
      }
      if (button.k == 2) {
        ResourcePacks24.getInstance().sort(EnumPackSorting.TOP);
      }
      if (button.k == 3) {
        ResourcePacks24.getInstance().sort(EnumPackSorting.LATEST);
      }
      if (button.k == 4)
      {
        ResourcePacks24.getInstance().sort(EnumPackSorting.RANDOM);
        getRandomPack();
      }
      this.selectedButton = button.k;
      this.title = button.j;
      refreshButtons();
    }
    if (button.k == 100) {
      if (isRandomPack())
      {
        this.cooldown = (System.currentTimeMillis() + 500L);
        getRandomPack();
      }
      else
      {
        ResourcePacks24.getInstance().setSortModeVotes(!ResourcePacks24.getInstance().isSortModeVotes());
        ResourcePacks24.getInstance().sort(EnumPackSorting.TOP);
        refreshButtons();
      }
    }
    if ((button.k == 101) && 
      (ResourcePacks24.getInstance().getSelectedPack() != null) && (ResourcePacks24.getInstance().getProgress() == 0))
    {
      ResourcePacks24.getInstance().setProgress(1);
      Pack pack = ResourcePacks24.getInstance().getSelectedPack();
      new PackFileDownloader(pack, new PackInfoCallback()
      {
        public void result(ArrayList<Pack> list) {}
        
        public void progress(int i)
        {
          ResourcePacks24.getInstance().setProgress(i);
          if ((i >= 100) && (ModGuiScreenResourcePacks.this.lastScreen != null) && ((ModGuiScreenResourcePacks.this.lastScreen instanceof azo))) {
            ModGuiScreenResourcePacks.this.lastScreen = new azo(((azo)ModGuiScreenResourcePacks.this.lastScreen).getParentScreen());
          }
        }
      });
    }
    if ((button.k == 102) && 
      (ResourcePacks24.getInstance().getSelectedPack() != null)) {
      try
      {
        Utils.openWebpage(new URI(ResourcePacks24.pack_page + ResourcePacks24.getInstance().getSelectedPack().getId()));
      }
      catch (URISyntaxException e)
      {
        e.printStackTrace();
      }
    }
    super.a(button);
  }
  
  public void getRandomPack()
  {
    if (ResourcePacks24.getInstance().getPacks().size() > 3) {
      ResourcePacks24.getInstance().setSelectedPack((Pack)ResourcePacks24.getInstance().getPacks().get(ResourcePacks24.random.nextInt(ResourcePacks24.getInstance().getPacks().size() - 1)));
    }
  }
  
  public void a(int mouseX, int mouseY, float partialTicks)
  {
    c(0);
    
    this.buttonDownload.l = ((ResourcePacks24.getInstance().getSelectedPack() != null) && (ResourcePacks24.getInstance().getProgress() == 0));
    this.buttonOpenPage.l = (ResourcePacks24.getInstance().getSelectedPack() != null);
    if (!isRandomPack())
    {
      this.packList.a(mouseX, mouseY, partialTicks);
    }
    else if (ResourcePacks24.getInstance().getSelectedPack() != null)
    {
      ResourcePacks24.getInstance().getDraw().drawChatBackground(90, 30, this.l - 20, this.m - 30, 0);
      a(100, 40, 253, 193, Integer.MIN_VALUE);
      ResourcePacks24.getInstance().getDraw().drawString("?", 150.0D, 78.0D, 10.0D);
      bfl.c(1.0F, 1.0F, 1.0F);
      ResourcePacks24.getInstance().getSelectedPack().drawImage(100, 40, 153, 153, 0.6D);
      
      int linePositionY = -10;
      if (260 + ResourcePacks24.getInstance().getDraw().getStringWidth(ResourcePacks24.getInstance().getSelectedPack().getName()) * 2 > this.l - 20)
      {
        ResourcePacks24.getInstance().getDraw().drawString(ResourcePacks24.getInstance().getSelectedPack().getName(), 260.0D, 40.0D, 1.0D);
      }
      else
      {
        ResourcePacks24.getInstance().getDraw().drawString(ResourcePacks24.getInstance().getSelectedPack().getName(), 260.0D, 40.0D, 2.0D);
        linePositionY += 10;
      }
      ResourcePacks24.getInstance().getDraw().drawString(de.resourcepacks24.utils.Color.cl("7") + "by " + ResourcePacks24.getInstance().getSelectedPack().getCreator(), 260.0D, 60 + linePositionY, 1.0D);
      linePositionY += 10;
      linePositionY += 10;
      ResourcePacks24.getInstance().getDraw().drawString(de.resourcepacks24.utils.Color.cl("a") + ResourcePacks24.getInstance().getSelectedPack().getDownloads() + " Downloads", 260.0D, 60 + linePositionY, 1.0D);
      linePositionY += 10;
      ResourcePacks24.getInstance().getDraw().drawString(de.resourcepacks24.utils.Color.cl("b") + ResourcePacks24.getInstance().getSelectedPack().getVotes() + " Votes", 260.0D, 60 + linePositionY, 1.0D);
      linePositionY += 10;
      ResourcePacks24.getInstance().getDraw().drawString(de.resourcepacks24.utils.Color.cl("c") + ResourcePacks24.getInstance().getSelectedPack().getSize() + "", 260.0D, 60 + linePositionY, 1.0D);
      linePositionY += 10;
      linePositionY += 10;
      List<String> list = ResourcePacks24.getInstance().getDraw().listFormattedStringToWidth(ResourcePacks24.getInstance().getSelectedPack().getDesc().replace("\r", ""), this.l - 90 - 170 - 30);
      for (String line : list)
      {
        ResourcePacks24.getInstance().getDraw().drawString(de.resourcepacks24.utils.Color.cl("9") + line, 260.0D, 57 + linePositionY, 1.0D);
        linePositionY += 10;
      }
      ResourcePacks24.getInstance().getDraw().overlayBackground(this.m - 30, this.m);
    }
    else
    {
      getRandomPack();
    }
    this.searchArea.g();
    
    String url = "https://resourcepacks24.de/";
    if ((this.title.equals("Search")) && 
      (!this.searchArea.b().isEmpty())) {
      url = url + "search?q=" + this.searchArea.b();
    }
    if (this.title.equals("Top 20")) {
      url = url + "resourcepacks?sortby=rating";
    }
    if (this.title.equals("Latest")) {
      url = url + "newest";
    }
    if (this.title.equals("Random pack")) {
      url = url + "resourcepack/224552&random";
    }
    ResourcePacks24.getInstance().getDraw().drawCenteredString(url, this.l / 2, 15);
    float screenPercent;
    if (ResourcePacks24.getInstance().getProgress() != 0)
    {
      ResourcePacks24.getInstance().updateAnimatedProgress();
      if (ResourcePacks24.getInstance().getAnimatedProgress() >= 100)
      {
        ResourcePacks24.getInstance().resetProgress();
        refreshButtons();
        this.loadingBarAnimation -= 1;
      }
      else
      {
        if (this.loadingBarAnimation < 11) {
          this.loadingBarAnimation += 1;
        }
        int barPositionY = this.loadingBarAnimation - 10;
        screenPercent = ResourcePacks24.getInstance().getAnimatedProgress() * this.l / 100;
        int percent = (int)(ResourcePacks24.getInstance().getAnimatedProgress() * 100.0F / 100.0F);
        drawLoadingBar(screenPercent, percent, barPositionY);
      }
    }
    else if (this.loadingBarAnimation > 0)
    {
      this.loadingBarAnimation -= 1;
    }
    if ((this.loadingBarAnimation > 0) && (ResourcePacks24.getInstance().getProgress() == 0)) {
      drawLoadingBar(this.l, 100, this.loadingBarAnimation - 10);
    }
    int tagPositionY = 135;
    for (Iterator localIterator2 = ResourcePacks24.getInstance().getRpTags().iterator(); localIterator2.hasNext();)
    {
      tag = (RPTag)localIterator2.next();
      if ((mouseX > 70) && (mouseX < 80) && (mouseY > tagPositionY) && (mouseY < tagPositionY + 10))
      {
        ResourcePacks24.getInstance().getDraw();DrawUtils.a(70, tagPositionY, 80, tagPositionY + 10, -2140234538);
      }
      if (tag.isEnabled())
      {
        ResourcePacks24.getInstance().getDraw();DrawUtils.a(70, tagPositionY, 80, tagPositionY + 10, -2140234538);
        ResourcePacks24.getInstance().getDraw().drawRightString(de.resourcepacks24.utils.Color.cl("e") + "✔", 80.0D, tagPositionY + 1);
      }
      else
      {
        ResourcePacks24.getInstance().getDraw();DrawUtils.a(70, tagPositionY, 80, tagPositionY + 10, -2140234538);
      }
      ResourcePacks24.getInstance().getDraw().drawRightString(tag.getTagName(), 67.0D, tagPositionY + 3, 0.7D);
      tagPositionY += 12;
    }
    RPTag tag;
    this.buttonMode.l = ((this.cooldown < System.currentTimeMillis()) || (!isRandomPack()));
    
    super.a(mouseX, mouseY, partialTicks);
    if ((this.searchArea.b().equalsIgnoreCase("bread")) && (ResourcePacks24.random.nextInt(10) == 0)) {
      this.breadVec.add(new BreadVector());
    }
    Object rem = new ArrayList();
    for (BreadVector vec : this.breadVec)
    {
      ResourcePacks24.getInstance().getDraw().drawItem(this.breadItem, vec.x, vec.y);
      vec.fall();
      if (vec.y > this.m) {
        ((ArrayList)rem).add(vec);
      }
    }
    for (BreadVector vec : (ArrayList)rem) {
      this.breadVec.remove(vec);
    }
  }
  
  private class BreadVector
  {
    public int x = 0;
    public int y = -20;
    
    public BreadVector()
    {
      this.x = (new Random().nextInt(ModGuiScreenResourcePacks.this.l) - 5);
    }
    
    public void fall()
    {
      this.y += 1;
    }
  }
  
  private void drawLoadingBar(float screenPercent, int percent, int barPositionY)
  {
    ResourcePacks24.getInstance().getDraw();DrawUtils.a(0, barPositionY + 10, this.l, barPositionY + 11, Integer.MIN_VALUE);
    ResourcePacks24.getInstance().getDraw();DrawUtils.a(0, barPositionY + 0, this.l, barPositionY + 1, Integer.MIN_VALUE);
    ResourcePacks24.getInstance().getDraw().drawRect(0.0D, barPositionY, screenPercent, barPositionY + 10, java.awt.Color.GREEN.getRGB());
    ResourcePacks24.getInstance().getDraw();DrawUtils.a(0, barPositionY, this.l, barPositionY + 10, Integer.MIN_VALUE);
    ResourcePacks24.getInstance().getDraw().drawCenteredString(de.resourcepacks24.utils.Color.cl("f") + percent + "%", this.l / 2, barPositionY + 1);
  }
}
