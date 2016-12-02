import java.util.concurrent.Callable;

final class c$2
  implements Callable<String>
{
  c$2(int paramInt) {}
  
  public String a()
    throws Exception
  {
    if (a < 0) {
      return "Unknown? (Got " + a + ")";
    }
    String ☃ = String.format("%4s", new Object[] { Integer.toBinaryString(a) }).replace(" ", "0");
    
    return String.format("%1$d / 0x%1$X / 0b%2$s", new Object[] { Integer.valueOf(a), ☃ });
  }
}
