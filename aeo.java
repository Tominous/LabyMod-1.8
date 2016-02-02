import java.util.List;
import java.util.Random;

public class aeo
  extends ady
{
  protected boolean aD;
  
  protected aeo(int ☃)
  {
    super(☃);
    
    a(0.8F, 0.4F);
    a(e);
    
    this.au.add(new ady.c(tp.class, 5, 2, 6));
    
    this.as.A = 64537;
    this.as.B = 4;
    this.as.C = 10;
  }
  
  public agw.a a(Random ☃, cj ☃)
  {
    double ☃ = af.a(☃.n() / 200.0D, ☃.p() / 200.0D);
    if (☃ < -0.8D)
    {
      int ☃ = ☃.nextInt(4);
      switch (☃)
      {
      case 0: 
        return agw.a.g;
      case 1: 
        return agw.a.f;
      case 2: 
        return agw.a.i;
      }
      return agw.a.h;
    }
    if (☃.nextInt(3) > 0)
    {
      int ☃ = ☃.nextInt(3);
      if (☃ == 0) {
        return agw.a.b;
      }
      if (☃ == 1) {
        return agw.a.e;
      }
      return agw.a.j;
    }
    return agw.a.a;
  }
  
  public void a(adm ☃, Random ☃, cj ☃)
  {
    double ☃ = af.a((☃.n() + 8) / 200.0D, (☃.p() + 8) / 200.0D);
    if (☃ < -0.8D)
    {
      this.as.B = 15;
      this.as.C = 5;
    }
    else
    {
      this.as.B = 4;
      this.as.C = 10;
      
      ag.a(agi.b.c);
      for (int ☃ = 0; ☃ < 7; ☃++)
      {
        int ☃ = ☃.nextInt(16) + 8;
        int ☃ = ☃.nextInt(16) + 8;
        int ☃ = ☃.nextInt(☃.m(☃.a(☃, 0, ☃)).o() + 32);
        ag.b(☃, ☃, ☃.a(☃, ☃, ☃));
      }
    }
    if (this.aD)
    {
      ag.a(agi.b.a);
      for (int ☃ = 0; ☃ < 10; ☃++)
      {
        int ☃ = ☃.nextInt(16) + 8;
        int ☃ = ☃.nextInt(16) + 8;
        int ☃ = ☃.nextInt(☃.m(☃.a(☃, 0, ☃)).o() + 32);
        ag.b(☃, ☃, ☃.a(☃, ☃, ☃));
      }
    }
    super.a(☃, ☃, ☃);
  }
  
  protected ady d(int ☃)
  {
    aeo ☃ = new aeo(☃);
    ☃.a("Sunflower Plains");
    ☃.aD = true;
    ☃.b(9286496);
    ☃.aj = 14273354;
    return ☃;
  }
}
