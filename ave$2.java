class ave$2
  extends Thread
{
  ave$2(ave this$0, String x0)
  {
    super(x0);
  }
  
  public void run()
  {
    while (this$0.B) {
      try
      {
        Thread.sleep(2147483647L);
      }
      catch (InterruptedException localInterruptedException) {}
    }
  }
}
