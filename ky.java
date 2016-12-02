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
    f += 1;
    
    long ☃ = a.K();
    long ☃ = ☃ / 24000L + 1L;
    if ((!c) && (f > 20))
    {
      c = true;
      b.a.a(new gm(5, 0.0F));
    }
    d = (☃ > 120500L);
    if (d) {
      e += 1;
    }
    if (☃ % 24000L == 500L)
    {
      if (☃ <= 6L) {
        b.a(new fb("demo.day." + ☃, new Object[0]));
      }
    }
    else if (☃ == 1L)
    {
      if (☃ == 100L) {
        b.a.a(new gm(5, 101.0F));
      } else if (☃ == 175L) {
        b.a.a(new gm(5, 102.0F));
      } else if (☃ == 250L) {
        b.a.a(new gm(5, 103.0F));
      }
    }
    else if ((☃ == 5L) && 
      (☃ % 24000L == 22000L)) {
      b.a(new fb("demo.day.warning", new Object[0]));
    }
  }
  
  private void f()
  {
    if (e > 100)
    {
      b.a(new fb("demo.reminder", new Object[0]));
      e = 0;
    }
  }
  
  public void a(cj ☃, cq ☃)
  {
    if (d)
    {
      f();
      return;
    }
    super.a(☃, ☃);
  }
  
  public void a(cj ☃)
  {
    if (d) {
      return;
    }
    super.a(☃);
  }
  
  public boolean b(cj ☃)
  {
    if (d) {
      return false;
    }
    return super.b(☃);
  }
  
  public boolean a(wn ☃, adm ☃, zx ☃)
  {
    if (d)
    {
      f();
      return false;
    }
    return super.a(☃, ☃, ☃);
  }
  
  public boolean a(wn ☃, adm ☃, zx ☃, cj ☃, cq ☃, float ☃, float ☃, float ☃)
  {
    if (d)
    {
      f();
      return false;
    }
    return super.a(☃, ☃, ☃, ☃, ☃, ☃, ☃, ☃);
  }
}
