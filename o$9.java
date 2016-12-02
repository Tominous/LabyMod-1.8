import com.google.common.base.Predicate;
import java.util.Map;
import java.util.Map.Entry;
import java.util.UUID;
import net.minecraft.server.MinecraftServer;

final class o$9
  implements Predicate<pk>
{
  o$9(Map paramMap) {}
  
  public boolean a(pk ☃)
  {
    auo ☃ = MinecraftServer.N().a(0).Z();
    for (Map.Entry<String, Integer> ☃ : a.entrySet())
    {
      String ☃ = (String)☃.getKey();
      boolean ☃ = false;
      if ((☃.endsWith("_min")) && (☃.length() > 4))
      {
        ☃ = true;
        ☃ = ☃.substring(0, ☃.length() - 4);
      }
      auk ☃ = ☃.b(☃);
      if (☃ == null) {
        return false;
      }
      String ☃ = (☃ instanceof lf) ? ☃.e_() : ☃.aK().toString();
      if (!☃.b(☃, ☃)) {
        return false;
      }
      aum ☃ = ☃.c(☃, ☃);
      int ☃ = ☃.c();
      if ((☃ < ((Integer)☃.getValue()).intValue()) && (☃)) {
        return false;
      }
      if ((☃ > ((Integer)☃.getValue()).intValue()) && (!☃)) {
        return false;
      }
    }
    return true;
  }
}
