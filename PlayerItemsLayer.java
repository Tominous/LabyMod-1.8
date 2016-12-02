import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class PlayerItemsLayer
  implements blb
{
  private bln renderPlayer = null;
  
  public PlayerItemsLayer(bln renderPlayer)
  {
    this.renderPlayer = renderPlayer;
  }
  
  public void a(pr entityLiving, float limbSwing, float limbSwingAmount, float partialTicks, float ticksExisted, float headYaw, float rotationPitch, float scale)
  {
    renderEquippedItems(entityLiving, scale, partialTicks);
  }
  
  protected void renderEquippedItems(pr entityLiving, float scale, float partialTicks)
  {
    if (!Config.isShowCapes()) {
      return;
    }
    if (!(entityLiving instanceof bet)) {
      return;
    }
    bet player = (bet)entityLiving;
    
    bfl.c(1.0F, 1.0F, 1.0F, 1.0F);
    bfl.C();
    
    bbj modelBipedMain = (bbj)renderPlayer.b();
    PlayerConfigurations.renderPlayerItems(modelBipedMain, player, scale, partialTicks);
  }
  
  public boolean b()
  {
    return false;
  }
  
  public static void register(Map renderPlayerMap)
  {
    Set keys = renderPlayerMap.keySet();
    boolean registered = false;
    for (Iterator it = keys.iterator(); it.hasNext();)
    {
      Object key = it.next();
      Object renderer = renderPlayerMap.get(key);
      if ((renderer instanceof bln))
      {
        bln renderPlayer = (bln)renderer;
        renderPlayer.a(new PlayerItemsLayer(renderPlayer));
        registered = true;
      }
    }
    if (!registered) {
      Config.warn("PlayerItemsLayer not registered");
    }
  }
}
