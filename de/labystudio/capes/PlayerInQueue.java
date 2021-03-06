package de.labystudio.capes;

import bet;

public class PlayerInQueue
{
  private bet player;
  private boolean refresh;
  
  public PlayerInQueue(bet player, boolean refresh)
  {
    this.player = player;
    this.refresh = refresh;
  }
  
  public bet getPlayer()
  {
    return this.player;
  }
  
  public boolean isRefresh()
  {
    return this.refresh;
  }
}
