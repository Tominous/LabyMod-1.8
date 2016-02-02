import com.google.common.collect.Lists;
import com.mojang.authlib.GameProfile;
import java.util.List;
import net.minecraft.server.MinecraftServer;

public class ar
  extends i
{
  public String c()
  {
    return "op";
  }
  
  public int a()
  {
    return 3;
  }
  
  public String c(m ☃)
  {
    return "commands.op.usage";
  }
  
  public void a(m ☃, String[] ☃)
    throws bz
  {
    if ((☃.length != 1) || (☃[0].length() <= 0)) {
      throw new cf("commands.op.usage", new Object[0]);
    }
    MinecraftServer ☃ = MinecraftServer.N();
    GameProfile ☃ = ☃.aF().a(☃[0]);
    if (☃ == null) {
      throw new bz("commands.op.failed", new Object[] { ☃[0] });
    }
    ☃.ap().a(☃);
    a(☃, this, "commands.op.success", new Object[] { ☃[0] });
  }
  
  public List<String> a(m ☃, String[] ☃, cj ☃)
  {
    if (☃.length == 1)
    {
      String ☃ = ☃[(☃.length - 1)];
      List<String> ☃ = Lists.newArrayList();
      for (GameProfile ☃ : MinecraftServer.N().L()) {
        if ((!MinecraftServer.N().ap().h(☃)) && (a(☃, ☃.getName()))) {
          ☃.add(☃.getName());
        }
      }
      return ☃;
    }
    return null;
  }
}
