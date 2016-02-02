import java.util.concurrent.Callable;

class bdb$4
  implements Callable
{
  private static final String __OBFID = "CL_00000886";
  
  bdb$4(bdb parambdb) {}
  
  public String a()
    throws Exception
  {
    return bdb.c(this.this$0).G() == null ? "Non-integrated multiplayer server" : "Integrated singleplayer server";
  }
}
