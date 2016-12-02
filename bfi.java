import com.mojang.authlib.GameProfile;

public class bfi
{
  public static bfi a = new bfi();
  private aky b = new aky(0);
  private aky c = new aky(1);
  private alf d = new alf();
  private aku e = new aku();
  private alo f = new alo();
  
  public void a(zx ☃)
  {
    if (☃.b() == zy.cE)
    {
      this.e.a(☃);
      bhc.a.a(this.e, 0.0D, 0.0D, 0.0D, 0.0F);
    }
    else if (☃.b() == zy.bX)
    {
      GameProfile ☃ = null;
      if (☃.n())
      {
        dn ☃ = ☃.o();
        if (☃.b("SkullOwner", 10))
        {
          ☃ = dy.a(☃.m("SkullOwner"));
        }
        else if ((☃.b("SkullOwner", 8)) && (☃.j("SkullOwner").length() > 0))
        {
          ☃ = new GameProfile(null, ☃.j("SkullOwner"));
          ☃ = alo.b(☃);
          ☃.o("SkullOwner");
          ☃.a("SkullOwner", dy.a(new dn(), ☃));
        }
      }
      if (bhk.c != null)
      {
        bfl.E();
        bfl.b(-0.5F, 0.0F, -0.5F);
        bfl.a(2.0F, 2.0F, 2.0F);
        bfl.p();
        bhk.c.a(0.0F, 0.0F, 0.0F, cq.b, 0.0F, ☃.i(), ☃, -1);
        bfl.o();
        bfl.F();
      }
    }
    else
    {
      afh ☃ = afh.a(☃.b());
      if (☃ == afi.bQ) {
        bhc.a.a(this.d, 0.0D, 0.0D, 0.0D, 0.0F);
      } else if (☃ == afi.cg) {
        bhc.a.a(this.c, 0.0D, 0.0D, 0.0D, 0.0F);
      } else {
        bhc.a.a(this.b, 0.0D, 0.0D, 0.0D, 0.0F);
      }
    }
  }
}
