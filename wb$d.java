import java.util.Random;

class wb$d
  extends qq
{
  private float g;
  private int h;
  private wb i;
  private boolean j;
  
  public wb$d(wb ☃)
  {
    super(☃);
    i = ☃;
  }
  
  public void a(float ☃, boolean ☃)
  {
    g = ☃;
    j = ☃;
  }
  
  public void a(double ☃)
  {
    e = ☃;
    f = true;
  }
  
  public void c()
  {
    a.y = a(a.y, g, 30.0F);
    a.aK = a.y;
    a.aI = a.y;
    if (!f)
    {
      a.n(0.0F);
      return;
    }
    f = false;
    if (a.C)
    {
      a.k((float)(e * a.a(vy.d).e()));
      if (h-- <= 0)
      {
        h = i.cg();
        if (j) {
          h /= 3;
        }
        i.r().a();
        if (i.cn()) {
          i.a(i.ck(), i.bB(), ((i.bc().nextFloat() - i.bc().nextFloat()) * 0.2F + 1.0F) * 0.8F);
        }
      }
      else
      {
        i.aZ = (i.ba = 0.0F);
        a.k(0.0F);
      }
    }
    else
    {
      a.k((float)(e * a.a(vy.d).e()));
    }
  }
}
