class aql$v
{
  int a;
  v[] b = new v[6];
  boolean[] c = new boolean[6];
  boolean d;
  boolean e;
  int f;
  
  public aql$v(int ☃)
  {
    a = ☃;
  }
  
  public void a(cq ☃, v ☃)
  {
    b[☃.a()] = ☃;
    b[☃.d().a()] = this;
  }
  
  public void a()
  {
    for (int ☃ = 0; ☃ < 6; ☃++) {
      c[☃] = (b[☃] != null ? 1 : false);
    }
  }
  
  public boolean a(int ☃)
  {
    if (e) {
      return true;
    }
    f = ☃;
    for (int ☃ = 0; ☃ < 6; ☃++) {
      if ((b[☃] != null) && (c[☃] != 0) && 
        (b[☃].f != ☃) && (b[☃].a(☃))) {
        return true;
      }
    }
    return false;
  }
  
  public boolean b()
  {
    return a >= 75;
  }
  
  public int c()
  {
    int ☃ = 0;
    for (int ☃ = 0; ☃ < 6; ☃++) {
      if (c[☃] != 0) {
        ☃++;
      }
    }
    return ☃;
  }
}
