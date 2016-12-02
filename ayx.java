import java.util.Random;

public class ayx
{
  private static final ayx a = new ayx();
  private Random b = new Random();
  private String[] c = "the elder scrolls klaatu berata niktu xyzzy bless curse light darkness fire air earth water hot dry cold wet ignite snuff embiggen twist shorten stretch fiddle destroy imbue galvanize enchant free limited range of towards inside sphere cube self other ball mental physical grow shrink demon elemental spirit animal creature beast humanoid undead fresh stale ".split(" ");
  
  public static ayx a()
  {
    return a;
  }
  
  public String b()
  {
    int ☃ = b.nextInt(2) + 3;
    String ☃ = "";
    for (int ☃ = 0; ☃ < ☃; ☃++)
    {
      if (☃ > 0) {
        ☃ = ☃ + " ";
      }
      ☃ = ☃ + c[b.nextInt(c.length)];
    }
    return ☃;
  }
  
  public void a(long ☃)
  {
    b.setSeed(☃);
  }
}
