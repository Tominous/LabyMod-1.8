package de.zockermaus.ts3;

import java.util.ArrayList;
import java.util.List;

public class TeamSpeakChannelGroup
{
  private static final List<TeamSpeakChannelGroup> groups = new ArrayList();
  int sgid;
  String groupName;
  int type;
  int iconId;
  int savebd;
  int namemode;
  int nameModifyPower;
  int nameMemberAddPower;
  int nameMemberRemovePower;
  
  public TeamSpeakChannelGroup(int sgid)
  {
    this.sgid = sgid;
  }
  
  public void setSgid(int sgid)
  {
    this.sgid = sgid;
  }
  
  public void setGroupName(String groupName)
  {
    this.groupName = groupName;
  }
  
  public void setType(int type)
  {
    this.type = type;
  }
  
  public void setIconId(int iconId)
  {
    this.iconId = iconId;
  }
  
  public void setSavebd(int savebd)
  {
    this.savebd = savebd;
  }
  
  public void setNamemode(int namemode)
  {
    this.namemode = namemode;
  }
  
  public void setNameModifyPower(int nameModifyPower)
  {
    this.nameModifyPower = nameModifyPower;
  }
  
  public void setNameMemberAddPower(int nameMemberAddPower)
  {
    this.nameMemberAddPower = nameMemberAddPower;
  }
  
  public void setNameMemberRemovePower(int nameMemberRemovePower)
  {
    this.nameMemberRemovePower = nameMemberRemovePower;
  }
  
  public int getSgid()
  {
    return sgid;
  }
  
  public String getGroupName()
  {
    return groupName;
  }
  
  public int getType()
  {
    return type;
  }
  
  public int getIconId()
  {
    return iconId;
  }
  
  public int getSavebd()
  {
    return savebd;
  }
  
  public int getNamemode()
  {
    return namemode;
  }
  
  public int getNameModifyPower()
  {
    return nameModifyPower;
  }
  
  public int getNameMemberAddPower()
  {
    return nameMemberAddPower;
  }
  
  public int getNameMemberRemovePower()
  {
    return nameMemberRemovePower;
  }
  
  public static void addGroup(TeamSpeakChannelGroup group)
  {
    groups.add(group);
  }
  
  public static List<TeamSpeakChannelGroup> getGroups()
  {
    return groups;
  }
}
