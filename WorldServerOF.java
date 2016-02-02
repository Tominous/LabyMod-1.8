import net.minecraft.server.MinecraftServer;

public class WorldServerOF
  extends le
{
  private MinecraftServer mcServer;
  
  public WorldServerOF(MinecraftServer par1MinecraftServer, atp par2iSaveHandler, ato worldInfo, int par4, nt par6Profiler)
  {
    super(par1MinecraftServer, par2iSaveHandler, worldInfo, par4, par6Profiler);
    
    this.mcServer = par1MinecraftServer;
  }
  
  public void c()
  {
    super.c();
    if (!Config.isTimeDefault()) {
      fixWorldTime();
    }
    if (Config.waterOpacityChanged)
    {
      Config.waterOpacityChanged = false;
      
      ClearWater.updateWaterOpacity(Config.getGameSettings(), this);
    }
  }
  
  protected void p()
  {
    if (!Config.isWeatherEnabled()) {
      fixWorldWeather();
    }
    super.p();
  }
  
  private void fixWorldWeather()
  {
    if ((this.x.p()) || (this.x.n()))
    {
      this.x.g(0);
      this.x.b(false);
      k(0.0F);
      
      this.x.f(0);
      this.x.a(false);
      i(0.0F);
      
      this.mcServer.ap().a(new gm(2, 0.0F));
      
      this.mcServer.ap().a(new gm(7, 0.0F));
      
      this.mcServer.ap().a(new gm(8, 0.0F));
    }
  }
  
  private void fixWorldTime()
  {
    if (this.x.r().a() != 1) {
      return;
    }
    long time = L();
    long timeOfDay = time % 24000L;
    if (Config.isTimeDayOnly())
    {
      if (timeOfDay <= 1000L) {
        b(time - timeOfDay + 1001L);
      }
      if (timeOfDay >= 11000L) {
        b(time - timeOfDay + 24001L);
      }
    }
    if (Config.isTimeNightOnly())
    {
      if (timeOfDay <= 14000L) {
        b(time - timeOfDay + 14001L);
      }
      if (timeOfDay >= 22000L) {
        b(time - timeOfDay + 24000L + 14001L);
      }
    }
  }
}
