public class PlayerItemRenderer
{
  private int attachTo = 0;
  private float scaleFactor = 0.0F;
  private bct modelRenderer = null;
  
  public PlayerItemRenderer(int attachTo, float scaleFactor, bct modelRenderer)
  {
    this.attachTo = attachTo;
    this.scaleFactor = scaleFactor;
    this.modelRenderer = modelRenderer;
  }
  
  public bct getModelRenderer()
  {
    return modelRenderer;
  }
  
  public void render(bbj modelBiped, float scale)
  {
    bct attachModel = PlayerItemModel.getAttachModel(modelBiped, attachTo);
    if (attachModel != null) {
      attachModel.c(scale);
    }
    modelRenderer.a(scale * scaleFactor);
  }
}
