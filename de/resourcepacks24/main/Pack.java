package de.resourcepacks24.main;

import de.resourcepacks24.utils.IconDownloader;

public class Pack
{
  private int id;
  private String name = "?";
  private String ingameName;
  private String newName;
  private long upTime;
  private String creator = "?";
  private String size = "?";
  private int status;
  private int downloads;
  private String hashName = "?";
  private int premiumId;
  private int votes;
  private int tag_hg;
  private int tag_sg;
  private int tag_uhc;
  private int tag_pot;
  private int tag_pvp;
  private int tag_bedwars;
  private int tag_skywars;
  private int tag_smyp;
  private int tag_yt;
  private String desc = "?";
  
  public Pack(int id, String name, String ingameName, String newName, long upTime, String creator, String size, int status, int downloads, String hashName, int premiumId, int votes, int tag_hg, int tag_sg, int tag_uhc, int tag_pot, int tag_pvp, int tag_bedwars, int tag_skywars, int tag_smyp, int tag_yt)
  {
    this.id = id;
    this.name = name;
    this.ingameName = ingameName;
    this.newName = newName;
    this.upTime = upTime;
    this.creator = creator;
    this.size = size;
    this.status = status;
    this.downloads = downloads;
    this.hashName = hashName;
    
    this.premiumId = premiumId;
    this.votes = votes;
    this.tag_hg = tag_hg;
    this.tag_sg = tag_sg;
    this.tag_uhc = tag_uhc;
    this.tag_pot = tag_pot;
    this.tag_pvp = tag_pvp;
    this.tag_bedwars = tag_bedwars;
    this.tag_skywars = tag_skywars;
    this.tag_smyp = tag_sg;
    this.tag_yt = tag_yt;
  }
  
  public int getId()
  {
    return id;
  }
  
  public String getName()
  {
    return name;
  }
  
  public String getIngameName()
  {
    return ingameName;
  }
  
  public String getNewName()
  {
    return newName;
  }
  
  public long getUpTime()
  {
    return upTime;
  }
  
  public String getCreator()
  {
    return creator;
  }
  
  public String getSize()
  {
    return size;
  }
  
  public int getStatus()
  {
    return status;
  }
  
  public int getDownloads()
  {
    return downloads;
  }
  
  public String getHashName()
  {
    return hashName;
  }
  
  public int getPremiumId()
  {
    return premiumId;
  }
  
  public int getVotes()
  {
    return votes;
  }
  
  public int getTag_bedwars()
  {
    return tag_bedwars;
  }
  
  public int getTag_hg()
  {
    return tag_hg;
  }
  
  public int getTag_pot()
  {
    return tag_pot;
  }
  
  public int getTag_pvp()
  {
    return tag_pvp;
  }
  
  public int getTag_sg()
  {
    return tag_sg;
  }
  
  public int getTag_skywars()
  {
    return tag_skywars;
  }
  
  public int getTag_smyp()
  {
    return tag_smyp;
  }
  
  public int getTag_uhc()
  {
    return tag_uhc;
  }
  
  public int getTag_yt()
  {
    return tag_yt;
  }
  
  public String getDesc()
  {
    return desc;
  }
  
  public void setDesc(String desc)
  {
    this.desc = desc;
  }
  
  public String getBestPossibleName()
  {
    if (ingameName != null) {
      return ingameName;
    }
    if (newName != null) {
      return newName;
    }
    if (name != null) {
      return name;
    }
    return "?";
  }
  
  public void drawImage(int x, int y, int width, int height, double scale)
  {
    ResourcePacks24.getInstance().getIconDownloader().drawUrlImage(getHashName(), ResourcePacks24.creator_home + 
      getCreator() + "/thumbnail/" + getName() + ".jpg", x, y, width, height, scale);
  }
}
