import java.util.UUID;

public abstract class py
  extends ps
{
  public static final UUID bk = UUID.fromString("E199AD21-BA8A-4C53-8D13-6182D5C69D3A");
  public static final qd bl = new qd(bk, "Fleeing speed bonus", 2.0D, 2).a(false);
  
  public py(adm ☃)
  {
    super(☃);
    
    c = new rp(this, 1.0D);
  }
  
  private cj a = cj.a;
  private float b = -1.0F;
  private rd c;
  private boolean bm;
  
  public float a(cj ☃)
  {
    return 0.0F;
  }
  
  public boolean bR()
  {
    return (super.bR()) && (a(new cj(s, aRb, u)) >= 0.0F);
  }
  
  public boolean cf()
  {
    return !h.m();
  }
  
  public boolean cg()
  {
    return e(new cj(this));
  }
  
  public boolean e(cj ☃)
  {
    if (b == -1.0F) {
      return true;
    }
    return a.i(☃) < b * b;
  }
  
  public void a(cj ☃, int ☃)
  {
    a = ☃;
    b = ☃;
  }
  
  public cj ch()
  {
    return a;
  }
  
  public float ci()
  {
    return b;
  }
  
  public void cj()
  {
    b = -1.0F;
  }
  
  public boolean ck()
  {
    return b != -1.0F;
  }
  
  protected void ca()
  {
    super.ca();
    if ((cc()) && (cd() != null) && (cdo == o))
    {
      pk ☃ = cd();
      a(new cj((int)s, (int)t, (int)u), 5);
      
      float ☃ = g(☃);
      if (((this instanceof qa)) && (((qa)this).cn()))
      {
        if (☃ > 10.0F) {
          a(true, true);
        }
        return;
      }
      if (!bm)
      {
        i.a(2, c);
        if ((s() instanceof sv)) {
          ((sv)s()).a(false);
        }
        bm = true;
      }
      o(☃);
      if (☃ > 4.0F) {
        s().a(☃, 1.0D);
      }
      if (☃ > 6.0F)
      {
        double ☃ = (s - s) / ☃;
        double ☃ = (t - t) / ☃;
        double ☃ = (u - u) / ☃;
        
        v += ☃ * Math.abs(☃) * 0.4D;
        w += ☃ * Math.abs(☃) * 0.4D;
        x += ☃ * Math.abs(☃) * 0.4D;
      }
      if (☃ > 10.0F) {
        a(true, true);
      }
    }
    else if ((!cc()) && (bm))
    {
      bm = false;
      i.a(c);
      if ((s() instanceof sv)) {
        ((sv)s()).a(true);
      }
      cj();
    }
  }
  
  protected void o(float ☃) {}
}
