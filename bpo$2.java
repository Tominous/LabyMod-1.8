import java.util.concurrent.Callable;
import net.minecraft.client.ClientBrandRetriever;

class bpo$2
  implements Callable<String>
{
  bpo$2(bpo parambpo) {}
  
  public String a()
    throws Exception
  {
    String ☃ = ClientBrandRetriever.getClientModName();
    if (!☃.equals("vanilla")) {
      return "Definitely; Client brand changed to '" + ☃ + "'";
    }
    ☃ = this.a.getServerModName();
    if (!☃.equals("vanilla")) {
      return "Definitely; Server brand changed to '" + ☃ + "'";
    }
    if (ave.class.getSigners() == null) {
      return "Very likely; Jar signature invalidated";
    }
    return "Probably not. Jar signature remains and both client + server brands are untouched.";
  }
}
