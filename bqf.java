public class bqf
  extends bqh
{
  public bqf(pr ☃, pr ☃)
  {
    super("player_combat");
    
    a("player", ☃.e_());
    if (☃ != null) {
      a("primary_opponent", ☃.e_());
    }
    if (☃ != null) {
      a("Combat between " + ☃.e_() + " and " + ☃.e_());
    } else {
      a("Combat between " + ☃.e_() + " and others");
    }
  }
}
