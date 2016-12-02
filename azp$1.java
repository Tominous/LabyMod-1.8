import de.resourcepacks24.main.ResourcePacks24;
import java.io.File;
import java.io.PrintStream;
import java.util.ArrayList;

class azp$1
  implements awx
{
  azp$1(azp this$0) {}
  
  public void a(boolean result, int id)
  {
    if (result)
    {
      File folder = ave.A().R().d();
      File pack = new File(folder.getAbsolutePath(), this$0.getTitle());
      if (pack.delete())
      {
        System.out.println("[Resourcepack24] Deleted " + this$0.getTitle() + " successfully!");
      }
      else
      {
        ResourcePacks24.getInstance().getDeletedPacks().add(this$0.getTitle());
        System.out.println("[Resourcepack24] Can't delete " + this$0.getTitle() + ", try again later..");
      }
    }
    this$0.a.a(new azo(this$0.b.getParentScreen()));
  }
}
