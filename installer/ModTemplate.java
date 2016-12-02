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
    return this.recommended;
  }
  
  public String getModName()
  {
    return this.modName;
  }
  
  public String getAuthor()
  {
    return this.author;
  }
  
  public void setEnabled(boolean enabled)
  {
    this.recommended = enabled;
  }
  
  public String getDownload()
  {
    return this.download;
  }
  
  public boolean isProhibited()
  {
    return this.prohibited;
  }
}
