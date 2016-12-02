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
    lastScreen = guiScreenResourcePacks;
    selectedButton = 1;
    title = "Search";
  }
  
  public void b()
  {
    Keyboard.enableRepeatEvents(true);
    
    n.add(buttonDone = new avs(0, 90, m - 25, l / 4, 20, "Done"));
    
    int buttonPositionlist = 0;
    n.add(buttonSearch = new avs(1, 5, 40, 80, 20, "Search"));
    buttonPositionlist += 22;
    n.add(buttonTop = new avs(2, 5, 40 + buttonPositionlist, 80, 20, "Top 20"));
    buttonPositionlist += 22;
    n.add(buttonLatest = new avs(3, 5, 40 + buttonPositionlist, 80, 20, "Latest"));
    buttonPositionlist += 22;
    n.add(buttonRandomPack = new avs(4, 5, 40 + buttonPositionlist, 80, 20, "Random pack"));
    
    n.add(buttonMode = new avs(100, l - 100, 5, 80, 20, ""));
    searchArea = new avw(50, mc.k, 91, 35, l - 112, 20);
    searchArea.a(ResourcePacks24.getInstance().getSearchText());
    
    n.add(buttonDownload = new avs(101, (l + 70) / 2 - l / 4 / 2, m - 25, l / 4, 20, "Download"));
    n.add(buttonOpenPage = new avs(102, l - l / 4 - 20, m - 25, l / 4, 20, "Open in website"));
    
    List<azp> list = new ArrayList();
    packList = new ModGuiResourcePacks(mc, l - 90 - 20, m + 20, list);
    
    refreshButtons();
    
    super.b();
  }
  
  public void refreshButtons()
  {
    buttonSearch.l = (selectedButton != buttonSearch.k);
    buttonTop.l = (selectedButton != buttonTop.k);
    buttonLatest.l = (selectedButton != buttonLatest.k);
    buttonRandomPack.l = (selectedButton != buttonRandomPack.k);
    
    buttonMode.m = ((!buttonTop.l) || (!buttonRandomPack.l));
    searchArea.e(!buttonSearch.l);
    if (isRandomPack()) {
      buttonMode.j = "Next pack";
    } else if (ResourcePacks24.getInstance().isSortModeVotes()) {
      buttonMode.j = "Votes";
    } else {
      buttonMode.j = "Downloads";
    }
    refreshPacks();
    if (buttonSearch.l)
    {
      packList.a(packList.c(), m + 20, 30, m - 30);
      packList.i(90);
      packList.d(7, 8);
    }
    else
    {
      packList.a(packList.c(), m + 20, 60, m - 30);
      packList.i(90);
      packList.d(7, 8);
    }
  }
  
  public void refreshPacks()
  {
    packList.setTitle(title);
    packList.f().clear();
    for (final Pack pack : ResourcePacks24.getInstance().getPacks())
    {
      azp a = new azp((azo)lastScreen)
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
      packList.f().add(a);
      a.setPackInfo(pack);
    }
  }
  
  public boolean isRandomPack()
  {
    return title.equals("Random pack");
  }
  
  private String markSearchWord(String word, String resetColor)
  {
    return searchArea.b().isEmpty() ? word : word.replace(searchArea.b(), de.resourcepacks24.utils.Color.cl("n") + searchArea.b() + de.resourcepacks24.utils.Color.cl(resetColor));
  }
  
  protected void a(char typedChar, int keyCode)
    throws IOException
  {
    if (searchArea.a(typedChar, keyCode))
    {
      ResourcePacks24.getInstance().setSearchText(searchArea.b());
      refreshButtons();
    }
    super.a(typedChar, keyCode);
  }
  
  public void k()
    throws IOException
  {
    if (!isRandomPack()) {
      packList.p();
    }
    super.k();
  }
  
  protected void a(int mouseX, int mouseY, int mouseButton)
    throws IOException
  {
    if (!isRandomPack()) {
      packList.b(mouseX, mouseY, mouseButton);
    }
    searchArea.a(mouseX, mouseY, mouseButton);
    
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
    if (k == 0) {
      mc.a(lastScreen);
    }
    if ((k == 1) || (k == 2) || (k == 3) || (k == 4))
    {
      ResourcePacks24.getInstance().setSelectedPack(null);
      if (k == 1) {
        ResourcePacks24.getInstance().sort(EnumPackSorting.NONE);
      }
      if (k == 2) {
        ResourcePacks24.getInstance().sort(EnumPackSorting.TOP);
      }
      if (k == 3) {
        ResourcePacks24.getInstance().sort(EnumPackSorting.LATEST);
      }
      if (k == 4)
      {
        ResourcePacks24.getInstance().sort(EnumPackSorting.RANDOM);
        getRandomPack();
      }
      selectedButton = k;
      title = j;
      refreshButtons();
    }
    if (k == 100) {
      if (isRandomPack())
      {
        cooldown = (System.currentTimeMillis() + 500L);
        getRandomPack();
      }
      else
      {
        ResourcePacks24.getInstance().setSortModeVotes(!ResourcePacks24.getInstance().isSortModeVotes());
        ResourcePacks24.getInstance().sort(EnumPackSorting.TOP);
        refreshButtons();
      }
    }
    if ((k == 101) && 
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
          if ((i >= 100) && (lastScreen != null) && ((lastScreen instanceof azo))) {
            lastScreen = new azo(((azo)lastScreen).getParentScreen());
          }
        }
      });
    }
    if ((k == 102) && 
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
    
    buttonDownload.l = ((ResourcePacks24.getInstance().getSelectedPack() != null) && (ResourcePacks24.getInstance().getProgress() == 0));
    buttonOpenPage.l = (ResourcePacks24.getInstance().getSelectedPack() != null);
    if (!isRandomPack())
    {
      packList.a(mouseX, mouseY, partialTicks);
    }
    else if (ResourcePacks24.getInstance().getSelectedPack() != null)
    {
      ResourcePacks24.getInstance().getDraw().drawChatBackground(90, 30, l - 20, m - 30, 0);
      a(100, 40, 253, 193, Integer.MIN_VALUE);
      ResourcePacks24.getInstance().getDraw().drawString("?", 150.0D, 78.0D, 10.0D);
      bfl.c(1.0F, 1.0F, 1.0F);
      ResourcePacks24.getInstance().getSelectedPack().drawImage(100, 40, 153, 153, 0.6D);
      
      int linePositionY = -10;
      if (260 + ResourcePacks24.getInstance().getDraw().getStringWidth(ResourcePacks24.getInstance().getSelectedPack().getName()) * 2 > l - 20)
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
      List<String> list = ResourcePacks24.getInstance().getDraw().listFormattedStringToWidth(ResourcePacks24.getInstance().getSelectedPack().getDesc().replace("\r", ""), l - 90 - 170 - 30);
      for (String line : list)
      {
        ResourcePacks24.getInstance().getDraw().drawString(de.resourcepacks24.utils.Color.cl("9") + line, 260.0D, 57 + linePositionY, 1.0D);
        linePositionY += 10;
      }
      ResourcePacks24.getInstance().getDraw().overlayBackground(m - 30, m);
    }
    else
    {
      getRandomPack();
    }
    searchArea.g();
    
    String url = "https://resourcepacks24.de/";
    if ((title.equals("Search")) && 
      (!searchArea.b().isEmpty())) {
      url = url + "search?q=" + searchArea.b();
    }
    if (title.equals("Top 20")) {
      url = url + "resourcepacks?sortby=rating";
    }
    if (title.equals("Latest")) {
      url = url + "newest";
    }
    if (title.equals("Random pack")) {
      url = url + "resourcepack/224552&random";
    }
    ResourcePacks24.getInstance().getDraw().drawCenteredString(url, l / 2, 15);
    float screenPercent;
    if (ResourcePacks24.getInstance().getProgress() != 0)
    {
      ResourcePacks24.getInstance().updateAnimatedProgress();
      if (ResourcePacks24.getInstance().getAnimatedProgress() >= 100)
      {
        ResourcePacks24.getInstance().resetProgress();
        refreshButtons();
        loadingBarAnimation -= 1;
      }
      else
      {
        if (loadingBarAnimation < 11) {
          loadingBarAnimation += 1;
        }
        int barPositionY = loadingBarAnimation - 10;
        screenPercent = ResourcePacks24.getInstance().getAnimatedProgress() * l / 100;
        int percent = (int)(ResourcePacks24.getInstance().getAnimatedProgress() * 100.0F / 100.0F);
        drawLoadingBar(screenPercent, percent, barPositionY);
      }
    }
    else if (loadingBarAnimation > 0)
    {
      loadingBarAnimation -= 1;
    }
    if ((loadingBarAnimation > 0) && (ResourcePacks24.getInstance().getProgress() == 0)) {
      drawLoadingBar(l, 100, loadingBarAnimation - 10);
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
    buttonMode.l = ((cooldown < System.currentTimeMillis()) || (!isRandomPack()));
    
    super.a(mouseX, mouseY, partialTicks);
    if ((searchArea.b().equalsIgnoreCase("bread")) && (ResourcePacks24.random.nextInt(10) == 0)) {
      breadVec.add(new BreadVector());
    }
    Object rem = new ArrayList();
    for (BreadVector vec : breadVec)
    {
      ResourcePacks24.getInstance().getDraw().drawItem(breadItem, x, y);
      vec.fall();
      if (y > m) {
        ((ArrayList)rem).add(vec);
      }
    }
    for (BreadVector vec : (ArrayList)rem) {
      breadVec.remove(vec);
    }
  }
  
  private class BreadVector
  {
    public int x = 0;
    public int y = -20;
    
    public BreadVector()
    {
      x = (new Random().nextInt(l) - 5);
    }
    
    public void fall()
    {
      y += 1;
    }
  }
  
  private void drawLoadingBar(float screenPercent, int percent, int barPositionY)
  {
    ResourcePacks24.getInstance().getDraw();DrawUtils.a(0, barPositionY + 10, l, barPositionY + 11, Integer.MIN_VALUE);
    ResourcePacks24.getInstance().getDraw();DrawUtils.a(0, barPositionY + 0, l, barPositionY + 1, Integer.MIN_VALUE);
    ResourcePacks24.getInstance().getDraw().drawRect(0.0D, barPositionY, screenPercent, barPositionY + 10, java.awt.Color.GREEN.getRGB());
    ResourcePacks24.getInstance().getDraw();DrawUtils.a(0, barPositionY, l, barPositionY + 10, Integer.MIN_VALUE);
    ResourcePacks24.getInstance().getDraw().drawCenteredString(de.resourcepacks24.utils.Color.cl("f") + percent + "%", l / 2, barPositionY + 1);
  }
}
