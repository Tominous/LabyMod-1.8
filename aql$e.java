import java.util.Random;

class aql$e
  implements aql.i
{
  public boolean a(aql.v ☃)
  {
    if ((☃.c[cq.c.a()] != 0) && (!☃.b[cq.c.a()].d)) {
      return true;
    }
    return false;
  }
  
  public aql.r a(cq ☃, aql.v ☃, Random ☃)
  {
    aql.v ☃ = ☃;
    if ((☃.c[cq.c.a()] == 0) || (☃.b[cq.c.a()].d)) {
      ☃ = ☃.b[cq.d.a()];
    }
    ☃.d = true;
    ☃.b[cq.c.a()].d = true;
    return new aql.o(☃, ☃, ☃);
  }
}
