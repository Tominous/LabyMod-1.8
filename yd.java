public class yd
  extends oq
{
  private alf a;
  
  public yd()
  {
    super("container.enderchest", false, 27);
  }
  
  public void a(alf ☃)
  {
    this.a = ☃;
  }
  
  public void a(du ☃)
  {
    for (int ☃ = 0; ☃ < o_(); ☃++) {
      a(☃, null);
    }
    for (int ☃ = 0; ☃ < ☃.c(); ☃++)
    {
      dn ☃ = ☃.b(☃);
      int ☃ = ☃.d("Slot") & 0xFF;
      if ((☃ >= 0) && (☃ < o_())) {
        a(☃, zx.a(☃));
      }
    }
  }
  
  public du h()
  {
    du ☃ = new du();
    for (int ☃ = 0; ☃ < o_(); ☃++)
    {
      zx ☃ = a(☃);
      if (☃ != null)
      {
        dn ☃ = new dn();
        ☃.a("Slot", (byte)☃);
        ☃.b(☃);
        ☃.a(☃);
      }
    }
    return ☃;
  }
  
  public boolean a(wn ☃)
  {
    if ((this.a != null) && (!this.a.a(☃))) {
      return false;
    }
    return super.a(☃);
  }
  
  public void b(wn ☃)
  {
    if (this.a != null) {
      this.a.b();
    }
    super.b(☃);
  }
  
  public void c(wn ☃)
  {
    if (this.a != null) {
      this.a.d();
    }
    super.c(☃);
    this.a = null;
  }
}
