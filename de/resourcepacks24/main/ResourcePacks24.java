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
    if ((sorting == EnumPackSorting.TOP) || (sorting == EnumPackSorting.LATEST))
    {
      ArrayList<Pack> all = new ArrayList();
      i = 0;
      for (Pack p : packs)
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
    if (sorting == EnumPackSorting.RANDOM)
    {
      ArrayList<Pack> all = new ArrayList();
      for (Pack p : packs) {
        if (!isHiddenPack(p)) {
          all.add(p);
        }
      }
      return all;
    }
    if (sorting == EnumPackSorting.NONE)
    {
      if (searchText.replace(" ", "").isEmpty()) {
        return new ArrayList();
      }
      ArrayList<Pack> all = new ArrayList();
      for (Pack p : packs)
      {
        if ((p.getCreator().toLowerCase().contains(searchText.toLowerCase())) && (!all.contains(p)) && 
          (!isHiddenPack(p))) {
          all.add(p);
        }
        if ((p.getName().toLowerCase().contains(searchText.toLowerCase())) && (!all.contains(p)) && 
          (!isHiddenPack(p))) {
          all.add(p);
        }
        if ((p.getDesc().toLowerCase().contains(searchText.toLowerCase())) && (!all.contains(p)) && 
          (!isHiddenPack(p))) {
          all.add(p);
        }
      }
      return all;
    }
    return packs;
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
    return path;
  }
  
  public ArrayList<String> getDeletedPacks()
  {
    return deletedPacks;
  }
  
  public int getAnimatedProgress()
  {
    return animatedProgress;
  }
  
  public IconDownloader getIconDownloader()
  {
    return iconDownloader;
  }
  
  public void resetProgress()
  {
    progress = 0;
    animatedProgress = 0;
  }
  
  public int getProgress()
  {
    return progress;
  }
  
  public DrawUtils getDraw()
  {
    return draw;
  }
  
  public boolean isSortModeVotes()
  {
    return sortModeVotes;
  }
  
  public void setSortModeVotes(boolean sortModeVotes)
  {
    this.sortModeVotes = sortModeVotes;
  }
  
  public void setSelectedPack(Pack pack)
  {
    selectedPack = pack;
  }
  
  public Pack getSelectedPack()
  {
    return selectedPack;
  }
  
  public void setSearchText(String searchText)
  {
    this.searchText = searchText;
  }
  
  public String getSearchText()
  {
    return searchText;
  }
  
  public ArrayList<RPTag> getRpTags()
  {
    return rpTags;
  }
  
  public EnumPackSorting getSorting()
  {
    return sorting;
  }
  
  public void setPath(String path)
  {
    this.path = path;
  }
  
  public void updateAnimatedProgress()
  {
    if (progress > animatedProgress) {
      if (progress - 6 > animatedProgress) {
        animatedProgress += 5;
      } else {
        animatedProgress += 1;
      }
    }
    if (progress < animatedProgress) {
      if (progress + 6 < animatedProgress) {
        animatedProgress -= 5;
      } else {
        animatedProgress -= 1;
      }
    }
  }
  
  public void setProgress(int progress)
  {
    if (progress == 0) {
      animatedProgress = progress;
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
    draw = new DrawUtils();
    iconDownloader = new IconDownloader();
    new PackInfoDownloader(new PackInfoCallback()
    {
      public void result(ArrayList<Pack> list)
      {
        packs = list;
      }
      
      public void progress(int i)
      {
        progress = i;
      }
    });
    rpTags.clear();
    rpTags.add(new RPTag("PvP", true));
    rpTags.add(new RPTag("Hardcore Games", true));
    rpTags.add(new RPTag("Survival Games", true));
    rpTags.add(new RPTag("UHC", true));
    rpTags.add(new RPTag("Potion PvP", true));
    rpTags.add(new RPTag("Bedwars", true));
    rpTags.add(new RPTag("Skywars", true));
    rpTags.add(new RPTag("SMYP", true));
    rpTags.add(new RPTag("YouTube", true));
    rpTags.add(new RPTag("Premium", true));
    
    rpConfig();
    System.out.println("[Resourcepack24] Loaded modification!");
  }
  
  public void sort(EnumPackSorting sorting)
  {
    this.sorting = sorting;
    if (sorting == EnumPackSorting.LATEST) {
      Collections.sort(packs, new Comparator()
      {
        public int compare(Pack pack1, Pack pack2)
        {
          return (int)(pack2.getUpTime() - pack1.getUpTime());
        }
      });
    } else if (sorting == EnumPackSorting.TOP) {
      Collections.sort(packs, new Comparator()
      {
        public int compare(Pack pack1, Pack pack2)
        {
          if (sortModeVotes) {
            return pack2.getVotes() - pack1.getVotes();
          }
          return pack2.getDownloads() - pack1.getDownloads();
        }
      });
    } else {
      Collections.sort(packs, new Comparator()
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
    final File rpFile = new File(Av, "rp24.txt");
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
        deletedPacks.addAll(configList);
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
        if (!getDeletedPacks().isEmpty()) {
          try
          {
            if (!rpFile.exists()) {
              rpFile.createNewFile();
            }
            String json = gson.toJson(getDeletedPacks());
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
