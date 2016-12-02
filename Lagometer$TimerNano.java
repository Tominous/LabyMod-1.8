public class Lagometer$TimerNano
{
  public long timeStartNano = 0L;
  public long timeNano = 0L;
  
  public void start()
  {
    if (!Lagometer.active) {
      return;
    }
    if (timeStartNano == 0L) {
      timeStartNano = System.nanoTime();
    }
  }
  
  public void end()
  {
    if (!Lagometer.active) {
      return;
    }
    if (timeStartNano != 0L)
    {
      timeNano += System.nanoTime() - timeStartNano;
      timeStartNano = 0L;
    }
  }
  
  private void reset()
  {
    timeNano = 0L;
    timeStartNano = 0L;
  }
}
