import java.util.UUID;

public abstract class py
  extends ps
{
  public static final UUID bk = UUID.fromString("E199AD21-BA8A-4C53-8D13-6182D5C69D3A");
  public static final qd bl = new qd(bk, "Fleeing speed bonus", 2.0D, 2).a(false);
  
  public py(adm ☃)
  {
    super(☃);
    
    this.c = new rp(this, 1.0D);
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
    return (super.bR()) && (a(new cj(this.s, aR().b, this.u)) >= 0.0F);
  }
  
  public boolean cf()
  {
    return !this.h.m();
  }
  
  public boolean cg()
  {
    return e(new cj(this));
  }
  
  public boolean e(cj ☃)
  {
    if (this.b == -1.0F) {
      return true;
    }
    return this.a.i(☃) < this.b * this.b;
  }
  
  public void a(cj ☃, int ☃)
  {
    this.a = ☃;
    this.b = ☃;
  }
  
  public cj ch()
  {
    return this.a;
  }
  
  public float ci()
  {
    return this.b;
  }
  
  public void cj()
  {
    this.b = -1.0F;
  }
  
  public boolean ck()
  {
    return this.b != -1.0F;
  }
  
  protected void ca()
  {
    super.ca();
    if ((cc()) && (cd() != null) && (cd().o == this.o))
    {
      pk ☃ = cd();
      a(new cj((int)☃.s, (int)☃.t, (int)☃.u), 5);
      
      float ☃ = g(☃);
      if (((this instanceof qa)) && (((qa)this).cn()))
      {
        if (☃ > 10.0F) {
          a(true, true);
        }
        return;
      }
      if (!this.bm)
      {
        this.i.a(2, this.c);
        if ((s() instanceof sv)) {
          ((sv)s()).a(false);
        }
        this.bm = true;
      }
      o(☃);
      if (☃ > 4.0F) {
        s().a(☃, 1.0D);
      }
      if (☃ > 6.0F)
      {
        double ☃ = (☃.s - this.s) / ☃;
        double ☃ = (☃.t - this.t) / ☃;
        double ☃ = (☃.u - this.u) / ☃;
        
        this.v += ☃ * Math.abs(☃) * 0.4D;
        this.w += ☃ * Math.abs(☃) * 0.4D;
        this.x += ☃ * Math.abs(☃) * 0.4D;
      }
      if (☃ > 10.0F) {
        a(true, true);
      }
    }
    else if ((!cc()) && (this.bm))
    {
      this.bm = false;
      this.i.a(this.c);
      if ((s() instanceof sv)) {
        ((sv)s()).a(true);
      }
      cj();
    }
  }
  
  protected void o(float ☃) {}
}
