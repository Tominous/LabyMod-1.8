public class ky
  extends lg
{
  private boolean c;
  private boolean d;
  private int e;
  private int f;
  
  public ky(adm ☃)
  {
    super(☃);
  }
  
  public void a()
  {
    super.a();
    this.f += 1;
    
    long ☃ = this.a.K();
    long ☃ = ☃ / 24000L + 1L;
    if ((!this.c) && (this.f > 20))
    {
      this.c = true;
      this.b.a.a(new gm(5, 0.0F));
    }
    this.d = (☃ > 120500L);
    if (this.d) {
      this.e += 1;
    }
    if (☃ % 24000L == 500L)
    {
      if (☃ <= 6L) {
        this.b.a(new fb("demo.day." + ☃, new Object[0]));
      }
    }
    else if (☃ == 1L)
    {
      if (☃ == 100L) {
        this.b.a.a(new gm(5, 101.0F));
      } else if (☃ == 175L) {
        this.b.a.a(new gm(5, 102.0F));
      } else if (☃ == 250L) {
        this.b.a.a(new gm(5, 103.0F));
      }
    }
    else if ((☃ == 5L) && 
      (☃ % 24000L == 22000L)) {
      this.b.a(new fb("demo.day.warning", new Object[0]));
    }
  }
  
  private void f()
  {
    if (this.e > 100)
    {
      this.b.a(new fb("demo.reminder", new Object[0]));
      this.e = 0;
    }
  }
  
  public void a(cj ☃, cq ☃)
  {
    if (this.d)
    {
      f();
      return;
    }
    super.a(☃, ☃);
  }
  
  public void a(cj ☃)
  {
    if (this.d) {
      return;
    }
    super.a(☃);
  }
  
  public boolean b(cj ☃)
  {
    if (this.d) {
      return false;
    }
    return super.b(☃);
  }
  
  public boolean a(wn ☃, adm ☃, zx ☃)
  {
    if (this.d)
    {
      f();
      return false;
    }
    return super.a(☃, ☃, ☃);
  }
  
  public boolean a(wn ☃, adm ☃, zx ☃, cj ☃, cq ☃, float ☃, float ☃, float ☃)
  {
    if (this.d)
    {
      f();
      return false;
    }
    return super.a(☃, ☃, ☃, ☃, ☃, ☃, ☃, ☃);
  }
}
