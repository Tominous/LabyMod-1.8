import com.mojang.authlib.GameProfile;

public class bks
  implements blb<pr>
{
  private final bct a;
  
  public bks(bct ☃)
  {
    this.a = ☃;
  }
  
  public void a(pr ☃, float ☃, float ☃, float ☃, float ☃, float ☃, float ☃, float ☃)
  {
    zx ☃ = ☃.q(3);
    if ((☃ == null) || (☃.b() == null)) {
      return;
    }
    zw ☃ = ☃.b();
    ave ☃ = ave.A();
    
    bfl.E();
    if (☃.av()) {
      bfl.b(0.0F, 0.2F, 0.0F);
    }
    boolean ☃ = ((☃ instanceof wi)) || (((☃ instanceof we)) && (((we)☃).co()));
    if ((!☃) && (☃.j_()))
    {
      float ☃ = 2.0F;
      float ☃ = 1.4F;
      bfl.a(☃ / ☃, ☃ / ☃, ☃ / ☃);
      bfl.b(0.0F, 16.0F * ☃, 0.0F);
    }
    this.a.c(0.0625F);
    
    bfl.c(1.0F, 1.0F, 1.0F, 1.0F);
    if ((☃ instanceof yo))
    {
      float ☃ = 0.625F;
      bfl.b(0.0F, -0.25F, 0.0F);
      bfl.b(180.0F, 0.0F, 1.0F, 0.0F);
      bfl.a(☃, -☃, -☃);
      if (☃) {
        bfl.b(0.0F, 0.1875F, 0.0F);
      }
      ☃.ah().a(☃, ☃, bgr.b.d);
    }
    else if (☃ == zy.bX)
    {
      float ☃ = 1.1875F;
      bfl.a(☃, -☃, -☃);
      if (☃) {
        bfl.b(0.0F, 0.0625F, 0.0F);
      }
      GameProfile ☃ = null;
      if (☃.n())
      {
        dn ☃ = ☃.o();
        if (☃.b("SkullOwner", 10))
        {
          ☃ = dy.a(☃.m("SkullOwner"));
        }
        else if (☃.b("SkullOwner", 8))
        {
          String ☃ = ☃.j("SkullOwner");
          if (!nx.b(☃))
          {
            ☃ = alo.b(new GameProfile(null, ☃));
            ☃.a("SkullOwner", dy.a(new dn(), ☃));
          }
        }
      }
      bhk.c.a(-0.5F, 0.0F, -0.5F, cq.b, 180.0F, ☃.i(), ☃, -1);
    }
    bfl.F();
  }
  
  public boolean b()
  {
    return true;
  }
}
