package de.resourcepacks24.main;

import ave;
import avm;
import bnm;
import com.google.gson.Gson;
import de.resourcepacks24.utils.DrawUtils;
import de.resourcepacks24.utils.EnumPackSorting;
import de.resourcepacks24.utils.IconDownloader;
import de.resourcepacks24.utils.PackInfoCallback;
import de.resourcepacks24.utils.PackInfoDownloader;
import de.resourcepacks24.utils.RPTag;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Random;
import jy;

public class ResourcePacks24
{
  public static String api_packs = "https://resourcepacks24.de/api/api?public_key=4cb863fb3cf988de9d2bcec48b9c22f3669fc7bf&username=" + 
    ave.A().L().c() + "&uuid=" + ave.A().L().b();
  public static String pack_page = "https://resourcepacks24.de/resourcepack/";
  public static String creator_home = "https://resourcepacks24.de/c/";
  public static String download_count = "https://resourcepacks24.de/api/count_download?rp_id=";
  public static SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd.MM.yyyy");
  public static final jy RESOURCE_FOLDER = new jy("folder.png");
  private DrawUtils draw;
  public static Random random = new Random();
  private int progress = 0;
  private int animatedProgress = 0;
  private EnumPackSorting sorting = EnumPackSorting.NONE;
  private String searchText = "";
  private boolean sortModeVotes = false;
  private Pack selectedPack;
  private String path = "";
  private ArrayList<String> deletedPacks = new ArrayList();
  private IconDownloader iconDownloader;
  private ArrayList<Pack> packs = new ArrayList();
  ArrayList<RPTag> rpTags = new ArrayList();
  private static ResourcePacks24 instance;
  
  public ArrayList<Pack> getPacks()
  {
    int i;
    if ((this.sorting == EnumPackSorting.TOP) || (this.sorting == EnumPackSorting.LATEST))
    {
      ArrayList<Pack> all = new ArrayList();
      i = 0;
      for (Pack p : this.packs)
      {
        if (i >= 20) {
          break;
        }
        if (!isHiddenPack(p)) {
          all.add(p);
        }
        i++;
      }
      return all;
    }
    if (this.sorting == EnumPackSorting.RANDOM)
    {
      ArrayList<Pack> all = new ArrayList();
      for (Pack p : this.packs) {
        if (!isHiddenPack(p)) {
          all.add(p);
        }
      }
      return all;
    }
    if (this.sorting == EnumPackSorting.NONE)
    {
      if (this.searchText.replace(" ", "").isEmpty()) {
        return new ArrayList();
      }
      ArrayList<Pack> all = new ArrayList();
      for (Pack p : this.packs)
      {
        if ((p.getCreator().toLowerCase().contains(this.searchText.toLowerCase())) && (!all.contains(p)) && 
          (!isHiddenPack(p))) {
          all.add(p);
        }
        if ((p.getName().toLowerCase().contains(this.searchText.toLowerCase())) && (!all.contains(p)) && 
          (!isHiddenPack(p))) {
          all.add(p);
        }
        if ((p.getDesc().toLowerCase().contains(this.searchText.toLowerCase())) && (!all.contains(p)) && 
          (!isHiddenPack(p))) {
          all.add(p);
        }
      }
      return all;
    }
    return this.packs;
  }
  
  public boolean isHiddenPack(Pack pack)
  {
    boolean hidden = true;
    for (RPTag tag : getRpTags()) {
      if (tag.isEnabled())
      {
        if (tag.hasTag("PvP", pack.getTag_pvp())) {
          hidden = false;
        }
        if (tag.hasTag("Hardcore Games", pack.getTag_hg())) {
          hidden = false;
        }
        if (tag.hasTag("Survival Games", pack.getTag_sg())) {
          hidden = false;
        }
        if (tag.hasTag("UHC", pack.getTag_uhc())) {
          hidden = false;
        }
        if (tag.hasTag("Potion PvP", pack.getTag_pot())) {
          hidden = false;
        }
        if (tag.hasTag("Bedwars", pack.getTag_bedwars())) {
          hidden = false;
        }
        if (tag.hasTag("SkyWars", pack.getTag_skywars())) {
          hidden = false;
        }
        if (tag.hasTag("SMYP", pack.getTag_smyp())) {
          hidden = false;
        }
        if (tag.hasTag("YouTube", pack.getTag_yt())) {
          hidden = false;
        }
        if ((tag.getTagName().equals("Premium")) && (pack.getPremiumId() != 0)) {
          hidden = false;
        }
      }
    }
    return hidden;
  }
  
  public String getPath()
  {
    return this.path;
  }
  
  public ArrayList<String> getDeletedPacks()
  {
    return this.deletedPacks;
  }
  
  public int getAnimatedProgress()
  {
    return this.animatedProgress;
  }
  
  public IconDownloader getIconDownloader()
  {
    return this.iconDownloader;
  }
  
  public void resetProgress()
  {
    this.progress = 0;
    this.animatedProgress = 0;
  }
  
  public int getProgress()
  {
    return this.progress;
  }
  
  public DrawUtils getDraw()
  {
    return this.draw;
  }
  
  public boolean isSortModeVotes()
  {
    return this.sortModeVotes;
  }
  
  public void setSortModeVotes(boolean sortModeVotes)
  {
    this.sortModeVotes = sortModeVotes;
  }
  
  public void setSelectedPack(Pack pack)
  {
    this.selectedPack = pack;
  }
  
  public Pack getSelectedPack()
  {
    return this.selectedPack;
  }
  
  public void setSearchText(String searchText)
  {
    this.searchText = searchText;
  }
  
  public String getSearchText()
  {
    return this.searchText;
  }
  
  public ArrayList<RPTag> getRpTags()
  {
    return this.rpTags;
  }
  
  public EnumPackSorting getSorting()
  {
    return this.sorting;
  }
  
  public void setPath(String path)
  {
    this.path = path;
  }
  
  public void updateAnimatedProgress()
  {
    if (this.progress > this.animatedProgress) {
      if (this.progress - 6 > this.animatedProgress) {
        this.animatedProgress += 5;
      } else {
        this.animatedProgress += 1;
      }
    }
    if (this.progress < this.animatedProgress) {
      if (this.progress + 6 < this.animatedProgress) {
        this.animatedProgress -= 5;
      } else {
        this.animatedProgress -= 1;
      }
    }
  }
  
  public void setProgress(int progress)
  {
    if (progress == 0) {
      this.animatedProgress = progress;
    }
    this.progress = progress;
  }
  
  public static ResourcePacks24 getInstance()
  {
    if (instance == null)
    {
      instance = new ResourcePacks24();
      instance.onLoad();
      return instance;
    }
    return instance;
  }
  
  public void onLoad()
  {
    this.draw = new DrawUtils();
    this.iconDownloader = new IconDownloader();
    new PackInfoDownloader(new PackInfoCallback()
    {
      public void result(ArrayList<Pack> list)
      {
        ResourcePacks24.this.packs = list;
      }
      
      public void progress(int i)
      {
        ResourcePacks24.this.progress = i;
      }
    });
    this.rpTags.clear();
    this.rpTags.add(new RPTag("PvP", true));
    this.rpTags.add(new RPTag("Hardcore Games", true));
    this.rpTags.add(new RPTag("Survival Games", true));
    this.rpTags.add(new RPTag("UHC", true));
    this.rpTags.add(new RPTag("Potion PvP", true));
    this.rpTags.add(new RPTag("Bedwars", true));
    this.rpTags.add(new RPTag("Skywars", true));
    this.rpTags.add(new RPTag("SMYP", true));
    this.rpTags.add(new RPTag("YouTube", true));
    this.rpTags.add(new RPTag("Premium", true));
    
    rpConfig();
    System.out.println("[Resourcepack24] Loaded modification!");
  }
  
  public void sort(EnumPackSorting sorting)
  {
    this.sorting = sorting;
    if (sorting == EnumPackSorting.LATEST) {
      Collections.sort(this.packs, new Comparator()
      {
        public int compare(Pack pack1, Pack pack2)
        {
          return (int)(pack2.getUpTime() - pack1.getUpTime());
        }
      });
    } else if (sorting == EnumPackSorting.TOP) {
      Collections.sort(this.packs, new Comparator()
      {
        public int compare(Pack pack1, Pack pack2)
        {
          if (ResourcePacks24.this.sortModeVotes) {
            return pack2.getVotes() - pack1.getVotes();
          }
          return pack2.getDownloads() - pack1.getDownloads();
        }
      });
    } else {
      Collections.sort(this.packs, new Comparator()
      {
        public int compare(Pack pack1, Pack pack2)
        {
          return pack1.getId() - pack2.getId();
        }
      });
    }
  }
  
  private void rpConfig()
  {
    final File rpFile = new File(ave.A().v, "rp24.txt");
    final Gson gson = new Gson();
    if (rpFile.exists())
    {
      try
      {
        BufferedReader in = new BufferedReader(new FileReader(rpFile));
        String json = "";
        String line;
        while ((line = in.readLine()) != null) {
          json = json + line;
        }
        in.close();
        ArrayList<String> configList = (ArrayList)gson.fromJson(json, ArrayList.class);
        this.deletedPacks.addAll(configList);
        System.out.println("[Resourcepack24] Loaded config file!");
        for (String packName : configList)
        {
          File folder = ave.A().R().d();
          File pack = new File(folder.getAbsolutePath(), packName);
          if (pack.delete())
          {
            getInstance().getDeletedPacks().remove(packName);
            System.out.println("[Resourcepack24] Deleted " + packName + " successfully!");
          }
          else
          {
            System.out.println("[Resourcepack24] Can't delete " + packName + ".");
          }
        }
      }
      catch (Exception e)
      {
        e.printStackTrace();
      }
      rpFile.delete();
    }
    Runtime.getRuntime().addShutdownHook(new Thread("Resourcepack24Mod shutdown hook")
    {
      public void run()
      {
        if (!ResourcePacks24.this.getDeletedPacks().isEmpty()) {
          try
          {
            if (!rpFile.exists()) {
              rpFile.createNewFile();
            }
            String json = gson.toJson(ResourcePacks24.this.getDeletedPacks());
            FileWriter writer = new FileWriter(rpFile);
            writer.write(json);
            writer.flush();
            writer.close();
            System.out.println("[Resourcepack24] Saved config file!");
          }
          catch (Exception e)
          {
            e.printStackTrace();
          }
        }
      }
    });
  }
}
