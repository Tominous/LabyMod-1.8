public class amz
{
  private int a;
  private int b;
  private int c;
  private char[] d;
  private amw e;
  private amw f;
  
  public amz(int ☃, boolean ☃)
  {
    this.a = ☃;
    this.d = new char['က'];
    this.e = new amw();
    if (☃) {
      this.f = new amw();
    }
  }
  
  public alz a(int ☃, int ☃, int ☃)
  {
    alz ☃ = (alz)afh.d.a(this.d[(☃ << 8 | ☃ << 4 | ☃)]);
    if (☃ != null) {
      return ☃;
    }
    return afi.a.Q();
  }
  
  public void a(int ☃, int ☃, int ☃, alz ☃)
  {
    alz ☃ = a(☃, ☃, ☃);
    afh ☃ = ☃.c();
    afh ☃ = ☃.c();
    if (☃ != afi.a)
    {
      this.b -= 1;
      if (☃.y()) {
        this.c -= 1;
      }
    }
    if (☃ != afi.a)
    {
      this.b += 1;
      if (☃.y()) {
        this.c += 1;
      }
    }
    this.d[(☃ << 8 | ☃ << 4 | ☃)] = ((char)afh.d.b(☃));
  }
  
  public afh b(int ☃, int ☃, int ☃)
  {
    return a(☃, ☃, ☃).c();
  }
  
  public int c(int ☃, int ☃, int ☃)
  {
    alz ☃ = a(☃, ☃, ☃);
    return ☃.c().c(☃);
  }
  
  public boolean a()
  {
    return this.b == 0;
  }
  
  public boolean b()
  {
    return this.c > 0;
  }
  
  public int d()
  {
    return this.a;
  }
  
  public void a(int ☃, int ☃, int ☃, int ☃)
  {
    this.f.a(☃, ☃, ☃, ☃);
  }
  
  public int d(int ☃, int ☃, int ☃)
  {
    return this.f.a(☃, ☃, ☃);
  }
  
  public void b(int ☃, int ☃, int ☃, int ☃)
  {
    this.e.a(☃, ☃, ☃, ☃);
  }
  
  public int e(int ☃, int ☃, int ☃)
  {
    return this.e.a(☃, ☃, ☃);
  }
  
  public void e()
  {
    this.b = 0;
    this.c = 0;
    for (int ☃ = 0; ☃ < 16; ☃++) {
      for (int ☃ = 0; ☃ < 16; ☃++) {
        for (int ☃ = 0; ☃ < 16; ☃++)
        {
          afh ☃ = b(☃, ☃, ☃);
          if (☃ != afi.a)
          {
            this.b += 1;
            if (☃.y()) {
              this.c += 1;
            }
          }
        }
      }
    }
  }
  
  public char[] g()
  {
    return this.d;
  }
  
  public void a(char[] ☃)
  {
    this.d = ☃;
  }
  
  public amw h()
  {
    return this.e;
  }
  
  public amw i()
  {
    return this.f;
  }
  
  public void a(amw ☃)
  {
    this.e = ☃;
  }
  
  public void b(amw ☃)
  {
    this.f = ☃;
  }
}
