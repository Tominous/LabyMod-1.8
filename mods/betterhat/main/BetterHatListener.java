package mods.betterhat.main;

import bfl;
import de.labystudio.modapi.EventHandler;
import de.labystudio.modapi.Listener;
import de.labystudio.modapi.events.RenderModelBipedEvent;

public class BetterHatListener
  implements Listener
{
  private void initModel(ModelRendererUV model, float size)
  {
    ModelBoxUV box = null;
    float scale = 1.135F;
    for (int x = -4; x < 4; x++) {
      for (int z = -4; z < 4; z++)
      {
        box = ModelBoxUV.addBox(model, x * 1.135F, -8.5225F, z * 1.135F, 1, 1, 1, size + 0.07F);
        box.setAllUV(44 + x, 3 - z);
        box = ModelBoxUV.addBox(model, x * 1.135F, -0.5575F, z * 1.135F, 1, 1, 1, size + 0.07F);
        box.setAllUV(52 + x, 3 - z);
      }
    }
    for (int x = -4; x < 4; x++) {
      for (int y = -8; y < 0; y++)
      {
        box = ModelBoxUV.addBox(model, x * 1.135F, (y + 0.5F) * 1.135F, -4.55F, 1, 1, 1, size + 0.07F);
        box.setAllUV(44 + x, 16 + y);
        box = ModelBoxUV.addBox(model, x * 1.135F, (y + 0.5F) * 1.135F, 3.415F, 1, 1, 1, size + 0.07F);
        box.setAllUV(60 + x, 16 + y);
      }
    }
    for (int z2 = -3; z2 < 4; z2++) {
      for (int y = -8; y < 0; y++)
      {
        box = ModelBoxUV.addBox(model, -4.55F, (y + 0.5F) * 1.135F, z2 * 1.135F, 1, 1, 1, size + 0.07F);
        box.setAllUV(36 - z2 - 1, 16 + y);
        box = ModelBoxUV.addBox(model, 3.415F, (y + 0.5F) * 1.135F, z2 * 1.135F, 1, 1, 1, size + 0.07F);
        box.setAllUV(52 + z2, 16 + y);
      }
    }
    box.initQuads();
  }
  
  @EventHandler
  public void onRenderBipedHeadwear(RenderModelBipedEvent event)
  {
    event.setCancelled(true);
    if (!(event.getBipedHeadwear() instanceof ModelRendererUV))
    {
      ModelRendererUV model = new ModelRendererUV(event.getModelBiped(), 32, 0);
      initModel(model, 0.001F);
      model.a(0.0F, 0.0F + event.getVar5(), 0.0F);
      event.setBipedHeadwear(model);
    }
    else
    {
      bfl.G();
      bfl.j();
      getBipedHeadweark = false;
      ((ModelRendererUV)event.getBipedHeadwear()).applyRotation(event.getBipedHead());
      ((ModelRendererUV)event.getBipedHeadwear()).renderBetterHat(event.getScale());
      getBipedHeadweark = true;
    }
  }
}
