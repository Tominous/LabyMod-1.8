package installer;

public class ModTemplate
{
  private String modName;
  private boolean recommended;
  private String download;
  private boolean prohibited;
  private String author;
  
  public ModTemplate(String modName, String author, boolean recommended, String download, boolean prohibited)
  {
    this.modName = modName;
    this.author = author;
    this.recommended = recommended;
    this.download = download;
    this.prohibited = prohibited;
  }
  
  public boolean isEnabled()
  {
    return recommended;
  }
  
  public String getModName()
  {
    return modName;
  }
  
  public String getAuthor()
  {
    return author;
  }
  
  public void setEnabled(boolean enabled)
  {
    recommended = enabled;
  }
  
  public String getDownload()
  {
    return download;
  }
  
  public boolean isProhibited()
  {
    return prohibited;
  }
}
