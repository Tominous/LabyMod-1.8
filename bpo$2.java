import java.util.concurrent.Callable;
import net.minecraft.client.ClientBrandRetriever;

class bpo$2
  implements Callable
{
  private static final String __OBFID = "CL_00001131";
  
  bpo$2(bpo parambpo) {}
  
  public String a()
    throws Exception
  {
    String var1 = ClientBrandRetriever.getClientModName();
    if (!var1.equals("vanilla")) {
      return "Definitely; Client brand changed to '" + var1 + "'";
    }
    var1 = this.this$0.getServerModName();
    return ave.class.getSigners() == null ? "Very likely; Jar signature invalidated" : !var1.equals("vanilla") ? "Definitely; Server brand changed to '" + var1 + "'" : "Probably not. Jar signature remains and both client + server brands are untouched.";
  }
}
