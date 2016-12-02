import java.util.concurrent.Callable;

class ato$9
  implements Callable<String>
{
  ato$9(ato paramato) {}
  
  public String a()
    throws Exception
  {
    return String.format("Game mode: %s (ID %d). Hardcore: %b. Cheats: %b", new Object[] { ato.o(this.a).b(), Integer.valueOf(ato.o(this.a).a()), Boolean.valueOf(ato.p(this.a)), Boolean.valueOf(ato.q(this.a)) });
  }
}
