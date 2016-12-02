import java.util.concurrent.Callable;

class b$5
  implements Callable<String>
{
  b$5(b paramb) {}
  
  public String a()
  {
    Runtime ☃ = Runtime.getRuntime();
    long ☃ = ☃.maxMemory();
    long ☃ = ☃.totalMemory();
    long ☃ = ☃.freeMemory();
    long ☃ = ☃ / 1024L / 1024L;
    long ☃ = ☃ / 1024L / 1024L;
    long ☃ = ☃ / 1024L / 1024L;
    
    return ☃ + " bytes (" + ☃ + " MB) / " + ☃ + " bytes (" + ☃ + " MB) up to " + ☃ + " bytes (" + ☃ + " MB)";
  }
}
