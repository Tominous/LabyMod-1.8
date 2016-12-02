import java.util.Random;

class aql$d
  implements aql.i
{
  public boolean a(aql.v ☃)
  {
    if ((c[cq.c.a()] != 0) && (!b[cq.c.a()].d) && 
      (c[cq.b.a()] != 0) && (!b[cq.b.a()].d))
    {
      aql.v ☃ = b[cq.c.a()];
      
      return (c[cq.b.a()] != 0) && (!b[cq.b.a()].d);
    }
    return false;
  }
  
  public aql.r a(cq ☃, aql.v ☃, Random ☃)
  {
    d = true;
    b[cq.c.a()].d = true;
    b[cq.b.a()].d = true;
    b[cq.c.a()].b[cq.b.a()].d = true;
    return new aql.n(☃, ☃, ☃);
  }
}
