import java.util.concurrent.Callable;
import net.minecraft.client.ClientBrandRetriever;

class ave$10
  implements Callable<String>
{
  ave$10(ave this$0) {}
  
  public String call()
    throws Exception
  {
    String s = ClientBrandRetriever.getClientModName();
    return ave.class.getSigners() == null ? "Very likely; Jar signature invalidated" : !s.equals("vanilla") ? "Definitely; Client brand changed to '" + s + "'" : "Probably not. Jar signature remains and client brand is untouched.";
  }
}
