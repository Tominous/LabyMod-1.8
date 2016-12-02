class wb$a
  extends rd
{
  private wb a;
  private int b;
  
  public wb$a(wb ☃)
  {
    this.a = ☃;
    a(2);
  }
  
  public boolean a()
  {
    pr ☃ = this.a.u();
    if (☃ == null) {
      return false;
    }
    if (!☃.ai()) {
      return false;
    }
    if (((☃ instanceof wn)) && (((wn)☃).bA.a)) {
      return false;
    }
    return true;
  }
  
  public void c()
  {
    this.b = 300;
    super.c();
  }
  
  public boolean b()
  {
    pr ☃ = this.a.u();
    if (☃ == null) {
      return false;
    }
    if (!☃.ai()) {
      return false;
    }
    if (((☃ instanceof wn)) && (((wn)☃).bA.a)) {
      return false;
    }
    if (--this.b <= 0) {
      return false;
    }
    return true;
  }
  
  public void e()
  {
    this.a.a(this.a.u(), 10.0F, 10.0F);
    ((wb.d)this.a.q()).a(this.a.y, this.a.ci());
  }
}
