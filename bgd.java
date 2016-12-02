public class bgd
  implements bnj
{
  private bgc a;
  private final avh b;
  private final bgf c = new bgf();
  private final bgb d = new bgb();
  private final bge e = new bge();
  
  public bgd(bgc ☃, avh ☃)
  {
    this.a = ☃;
    this.b = ☃;
  }
  
  public bgc a()
  {
    return this.a;
  }
  
  public void a(alz ☃, cj ☃, bmi ☃, adq ☃)
  {
    afh ☃ = ☃.c();
    int ☃ = ☃.b();
    if (☃ != 3) {
      return;
    }
    ☃ = ☃.a(☃, ☃, ☃);
    
    boq ☃ = this.a.b(☃);
    boq ☃ = new bow.a(☃, ☃).b();
    this.c.a(☃, ☃, ☃, ☃, bfx.a().c());
  }
  
  public boolean a(alz ☃, cj ☃, adq ☃, bfd ☃)
  {
    try
    {
      int ☃ = ☃.c().b();
      if (☃ == -1) {
        return false;
      }
      switch (☃)
      {
      case 3: 
        boq ☃ = a(☃, ☃, ☃);
        return this.c.a(☃, ☃, ☃, ☃, ☃);
      case 2: 
        return false;
      case 1: 
        return this.e.a(☃, ☃, ☃, ☃);
      }
    }
    catch (Throwable ☃)
    {
      b ☃ = b.a(☃, "Tesselating block in world");
      c ☃ = ☃.a("Block being tesselated");
      
      c.a(☃, ☃, ☃.c(), ☃.c().c(☃));
      
      throw new e(☃);
    }
    return false;
  }
  
  public bgf b()
  {
    return this.c;
  }
  
  private boq a(alz ☃, cj ☃)
  {
    boq ☃ = this.a.b(☃);
    if ((☃ != null) && (this.b.v) && ((☃ instanceof box))) {
      ☃ = ((box)☃).a(ns.a(☃));
    }
    return ☃;
  }
  
  public boq a(alz ☃, adq ☃, cj ☃)
  {
    afh ☃ = ☃.c();
    if (☃.G() != adr.g) {
      try
      {
        ☃ = ☃.a(☃, ☃, ☃);
      }
      catch (Exception localException) {}
    }
    boq ☃ = this.a.b(☃);
    if ((☃ != null) && (this.b.v) && ((☃ instanceof box))) {
      ☃ = ((box)☃).a(ns.a(☃));
    }
    return ☃;
  }
  
  public void a(alz ☃, float ☃)
  {
    int ☃ = ☃.c().b();
    if (☃ == -1) {
      return;
    }
    switch (☃)
    {
    case 3: 
      boq ☃ = a(☃, null);
      this.c.a(☃, ☃, ☃, true);
      break;
    case 2: 
      this.d.a(☃.c(), ☃);
      break;
    }
  }
  
  public boolean a(afh ☃, int ☃)
  {
    if (☃ == null) {
      return false;
    }
    int ☃ = ☃.b();
    if (☃ == 3) {
      return false;
    }
    return ☃ == 2;
  }
  
  public void a(bni ☃)
  {
    this.e.a();
  }
}
