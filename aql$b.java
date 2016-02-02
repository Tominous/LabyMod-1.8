import java.util.Random;

class aql$b
  implements aql.i
{
  public boolean a(aql.v ☃)
  {
    if ((☃.c[cq.f.a()] != 0) && (!☃.b[cq.f.a()].d) && 
      (☃.c[cq.b.a()] != 0) && (!☃.b[cq.b.a()].d))
    {
      aql.v ☃ = ☃.b[cq.f.a()];
      
      return (☃.c[cq.b.a()] != 0) && (!☃.b[cq.b.a()].d);
    }
    return false;
  }
  
  public aql.r a(cq ☃, aql.v ☃, Random ☃)
  {
    ☃.d = true;
    ☃.b[cq.f.a()].d = true;
    ☃.b[cq.b.a()].d = true;
    ☃.b[cq.f.a()].b[cq.b.a()].d = true;
    return new aql.l(☃, ☃, ☃);
  }
}
