import java.util.Random;

public class aqn$d
  extends aqn.c
{
  private boolean e;
  
  public aqn$d() {}
  
  public aqn$d(Random ☃, int ☃, int ☃)
  {
    super(☃, ☃, 64, ☃, 7, 7, 9);
  }
  
  protected void a(dn ☃)
  {
    super.a(☃);
    ☃.a("Witch", this.e);
  }
  
  protected void b(dn ☃)
  {
    super.b(☃);
    this.e = ☃.n("Witch");
  }
  
  public boolean a(adm ☃, Random ☃, aqe ☃)
  {
    if (!a(☃, ☃, 0)) {
      return false;
    }
    a(☃, ☃, 1, 1, 1, 5, 1, 7, afi.f.a(aio.a.b.a()), afi.f.a(aio.a.b.a()), false);
    a(☃, ☃, 1, 4, 2, 5, 4, 7, afi.f.a(aio.a.b.a()), afi.f.a(aio.a.b.a()), false);
    a(☃, ☃, 2, 1, 0, 4, 1, 0, afi.f.a(aio.a.b.a()), afi.f.a(aio.a.b.a()), false);
    
    a(☃, ☃, 2, 2, 2, 3, 3, 2, afi.f.a(aio.a.b.a()), afi.f.a(aio.a.b.a()), false);
    a(☃, ☃, 1, 2, 3, 1, 3, 6, afi.f.a(aio.a.b.a()), afi.f.a(aio.a.b.a()), false);
    a(☃, ☃, 5, 2, 3, 5, 3, 6, afi.f.a(aio.a.b.a()), afi.f.a(aio.a.b.a()), false);
    a(☃, ☃, 2, 2, 7, 4, 3, 7, afi.f.a(aio.a.b.a()), afi.f.a(aio.a.b.a()), false);
    
    a(☃, ☃, 1, 0, 2, 1, 3, 2, afi.r.Q(), afi.r.Q(), false);
    a(☃, ☃, 5, 0, 2, 5, 3, 2, afi.r.Q(), afi.r.Q(), false);
    a(☃, ☃, 1, 0, 7, 1, 3, 7, afi.r.Q(), afi.r.Q(), false);
    a(☃, ☃, 5, 0, 7, 5, 3, 7, afi.r.Q(), afi.r.Q(), false);
    
    a(☃, afi.aO.Q(), 2, 3, 2, ☃);
    a(☃, afi.aO.Q(), 3, 3, 7, ☃);
    a(☃, afi.a.Q(), 1, 3, 4, ☃);
    a(☃, afi.a.Q(), 5, 3, 4, ☃);
    a(☃, afi.a.Q(), 5, 3, 5, ☃);
    a(☃, afi.ca.Q().a(agx.b, agx.a.r), 1, 3, 5, ☃);
    
    a(☃, afi.ai.Q(), 3, 2, 6, ☃);
    a(☃, afi.bE.Q(), 4, 2, 6, ☃);
    
    a(☃, afi.aO.Q(), 1, 2, 1, ☃);
    a(☃, afi.aO.Q(), 5, 2, 1, ☃);
    
    int ☃ = a(afi.ad, 3);
    int ☃ = a(afi.ad, 1);
    int ☃ = a(afi.ad, 0);
    int ☃ = a(afi.ad, 2);
    
    a(☃, ☃, 0, 4, 1, 6, 4, 1, afi.bU.a(☃), afi.bU.a(☃), false);
    a(☃, ☃, 0, 4, 2, 0, 4, 7, afi.bU.a(☃), afi.bU.a(☃), false);
    a(☃, ☃, 6, 4, 2, 6, 4, 7, afi.bU.a(☃), afi.bU.a(☃), false);
    a(☃, ☃, 0, 4, 8, 6, 4, 8, afi.bU.a(☃), afi.bU.a(☃), false);
    for (int ☃ = 2; ☃ <= 7; ☃ += 5) {
      for (int ☃ = 1; ☃ <= 5; ☃ += 4) {
        b(☃, afi.r.Q(), ☃, -1, ☃, ☃);
      }
    }
    if (!this.e)
    {
      int ☃ = a(2, 5);
      int ☃ = d(2);
      int ☃ = b(2, 5);
      if (☃.b(new cj(☃, ☃, ☃)))
      {
        this.e = true;
        
        wd ☃ = new wd(☃);
        ☃.b(☃ + 0.5D, ☃, ☃ + 0.5D, 0.0F, 0.0F);
        ☃.a(☃.E(new cj(☃, ☃, ☃)), null);
        ☃.d(☃);
      }
    }
    return true;
  }
}
