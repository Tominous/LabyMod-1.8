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
    return this.modelRenderer;
  }
  
  public void render(bbj modelBiped, float scale)
  {
    bct attachModel = PlayerItemModel.getAttachModel(modelBiped, this.attachTo);
    if (attachModel != null) {
      attachModel.c(scale);
    }
    this.modelRenderer.a(scale * this.scaleFactor);
  }
}
