public final class ki
  extends RuntimeException
{
  public static final ki a = new ki();
  
  private ki()
  {
    setStackTrace(new StackTraceElement[0]);
  }
  
  public synchronized Throwable fillInStackTrace()
  {
    setStackTrace(new StackTraceElement[0]);
    return this;
  }
}
