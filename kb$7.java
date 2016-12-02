import com.mojang.authlib.GameProfile;

final class kb$7
  extends cn
{
  private boolean b = true;
  
  protected zx b(ck ☃, zx ☃)
  {
    adm ☃ = ☃.i();
    cq ☃ = agg.b(☃.f());
    cj ☃ = ☃.d().a(☃);
    ajm ☃ = afi.ce;
    if ((☃.d(☃)) && (☃.b(☃, ☃, ☃)))
    {
      if (!D)
      {
        ☃.a(☃, ☃.Q().a(ajm.a, cq.b), 3);
        akw ☃ = ☃.s(☃);
        if ((☃ instanceof alo))
        {
          if (☃.i() == 3)
          {
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
                if (!nx.b(☃)) {
                  ☃ = new GameProfile(null, ☃);
                }
              }
            }
            ((alo)☃).a(☃);
          }
          else
          {
            ((alo)☃).a(☃.i());
          }
          ((alo)☃).b(☃.d().b() * 4);
          afi.ce.a(☃, ☃, (alo)☃);
        }
        b -= 1;
      }
    }
    else {
      b = false;
    }
    return ☃;
  }
  
  protected void a(ck ☃)
  {
    if (b) {
      ☃.i().b(1000, ☃.d(), 0);
    } else {
      ☃.i().b(1001, ☃.d(), 0);
    }
  }
}
