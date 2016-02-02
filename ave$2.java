import java.util.concurrent.Callable;
import net.minecraft.client.ClientBrandRetriever;

class ave$2
  implements Callable<String>
{
  ave$2(ave paramave) {}
  
  public String a()
    throws Exception
  {
    String ☃ = ClientBrandRetriever.getClientModName();
    if (!☃.equals("vanilla")) {
      return "Definitely; Client brand changed to '" + ☃ + "'";
    }
    if (ave.class.getSigners() == null) {
      return "Very likely; Jar signature invalidated";
    }
    return "Probably not. Jar signature remains and client brand is untouched.";
  }
}
