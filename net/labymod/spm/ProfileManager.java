package net.labymod.spm;

import ave;
import avh;
import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import org.apache.commons.io.FileUtils;

public class ProfileManager
{
  public static File PROFILES_FOLDER = new File("spm");
  public static File OF_FOLDER = new File(PROFILES_FOLDER, "of");
  public static File CURRENT_OPTIONS = new File("options.txt");
  public static File CURRENT_OF_OPTIONS = new File("optionsof.txt");
  private static ProfileManager instance;
  private ArrayList<File> profiles = new ArrayList();
  
  public ArrayList<File> getProfiles()
  {
    return this.profiles;
  }
  
  public static ProfileManager getProfileManager()
  {
    if (instance == null) {
      return new ProfileManager();
    }
    return instance;
  }
  
  public ProfileManager()
  {
    instance = this;
    loadProfiles();
  }
  
  public void loadProfiles()
  {
    this.profiles.clear();
    if (!PROFILES_FOLDER.exists())
    {
      PROFILES_FOLDER.mkdir();
      System.out.println("[SPM] Profiles folder created");
    }
    if (!OF_FOLDER.exists()) {
      OF_FOLDER.mkdir();
    }
    File[] list = PROFILES_FOLDER.listFiles();
    if ((list == null) || (list.length == 0))
    {
      System.out.println("[SPM] Folder is empty");
      return;
    }
    for (File file : list) {
      if ((file != null) && (file.getName().endsWith(".txt")) && (file.getName().length() >= 5)) {
        this.profiles.add(file);
      }
    }
  }
  
  public boolean saveProfileAs(String name)
  {
    return saveProfileAs(new File(PROFILES_FOLDER, name + ".txt"));
  }
  
  public boolean saveProfileAs(File file)
  {
    if (!CURRENT_OPTIONS.exists()) {
      return false;
    }
    try
    {
      if (file.exists()) {
        file.delete();
      }
      FileUtils.copyFile(CURRENT_OPTIONS, file);
      if (CURRENT_OF_OPTIONS.exists())
      {
        File ofDestFile = new File(OF_FOLDER, file.getName());
        if (ofDestFile.exists()) {
          ofDestFile.delete();
        }
        FileUtils.copyFile(CURRENT_OF_OPTIONS, ofDestFile);
      }
      if (!this.profiles.contains(file)) {
        this.profiles.add(file);
      }
      System.out.println("[SPM] Saved profile " + file.getName());
      return true;
    }
    catch (IOException e)
    {
      e.printStackTrace();
    }
    return false;
  }
  
  public boolean deleteProfile(File file)
  {
    if (!file.exists()) {
      return false;
    }
    if (file.delete())
    {
      File ofDestFile = new File(OF_FOLDER, file.getName());
      if (ofDestFile.exists()) {
        ofDestFile.delete();
      }
      this.profiles.remove(file);
      System.out.println("[SPM] Deleted profile " + file.getName());
      return true;
    }
    return false;
  }
  
  public boolean loadProfile(File file)
  {
    if (!file.exists()) {
      return false;
    }
    if (CURRENT_OPTIONS.delete()) {
      try
      {
        File ofDestFile = new File(OF_FOLDER, file.getName());
        if ((ofDestFile.exists()) && (CURRENT_OF_OPTIONS.delete())) {
          FileUtils.copyFile(ofDestFile, CURRENT_OF_OPTIONS);
        }
        FileUtils.copyFile(file, CURRENT_OPTIONS);
        ave.A().t.a();
        System.out.println("[SPM] Loaded profile " + file.getName());
        return true;
      }
      catch (IOException e)
      {
        e.printStackTrace();
      }
    }
    return false;
  }
}
