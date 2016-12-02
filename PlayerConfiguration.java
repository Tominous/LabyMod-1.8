public class PlayerConfiguration
{
  private PlayerItemModel[] playerItemModels = new PlayerItemModel[0];
  private boolean initialized = false;
  
  public void renderPlayerItems(bbj modelBiped, bet player, float scale, float partialTicks)
  {
    if (!initialized) {
      return;
    }
    for (int i = 0; i < playerItemModels.length; i++)
    {
      PlayerItemModel model = playerItemModels[i];
      model.render(modelBiped, player, scale, partialTicks);
    }
  }
  
  public boolean isInitialized()
  {
    return initialized;
  }
  
  public void setInitialized(boolean initialized)
  {
    this.initialized = initialized;
  }
  
  public PlayerItemModel[] getPlayerItemModels()
  {
    return playerItemModels;
  }
  
  public void addPlayerItemModel(PlayerItemModel playerItemModel)
  {
    playerItemModels = ((PlayerItemModel[])Config.addObjectToArray(playerItemModels, playerItemModel));
  }
}
