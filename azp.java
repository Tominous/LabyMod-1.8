import java.util.List;

public abstract class azp
  implements awd.a
{
  private static final jy c = new jy("textures/gui/resource_packs.png");
  private static final eu d = new fb("resourcePack.incompatible", new Object[0]);
  private static final eu e = new fb("resourcePack.incompatible.old", new Object[0]);
  private static final eu f = new fb("resourcePack.incompatible.new", new Object[0]);
  protected final ave a;
  protected final azo b;
  
  public azp(azo ☃)
  {
    this.b = ☃;
    this.a = ave.A();
  }
  
  public void a(int ☃, int ☃, int ☃, int ☃, int ☃, int ☃, int ☃, boolean ☃)
  {
    int ☃ = a();
    if (☃ != 1)
    {
      bfl.c(1.0F, 1.0F, 1.0F, 1.0F);
      avp.a(☃ - 1, ☃ - 1, ☃ + ☃ - 9, ☃ + ☃ + 1, -8978432);
    }
    d();
    bfl.c(1.0F, 1.0F, 1.0F, 1.0F);
    avp.a(☃, ☃, 0.0F, 0.0F, 32, 32, 32.0F, 32.0F);
    String ☃ = c();
    String ☃ = b();
    if (((this.a.t.A) || (☃)) && (e()))
    {
      this.a.P().a(c);
      avp.a(☃, ☃, ☃ + 32, ☃ + 32, -1601138544);
      bfl.c(1.0F, 1.0F, 1.0F, 1.0F);
      int ☃ = ☃ - ☃;
      int ☃ = ☃ - ☃;
      if (☃ < 1)
      {
        ☃ = d.d();
        ☃ = e.d();
      }
      else if (☃ > 1)
      {
        ☃ = d.d();
        ☃ = f.d();
      }
      if (f())
      {
        if (☃ < 32) {
          avp.a(☃, ☃, 0.0F, 32.0F, 32, 32, 256.0F, 256.0F);
        } else {
          avp.a(☃, ☃, 0.0F, 0.0F, 32, 32, 256.0F, 256.0F);
        }
      }
      else
      {
        if (g()) {
          if (☃ < 16) {
            avp.a(☃, ☃, 32.0F, 32.0F, 32, 32, 256.0F, 256.0F);
          } else {
            avp.a(☃, ☃, 32.0F, 0.0F, 32, 32, 256.0F, 256.0F);
          }
        }
        if (h()) {
          if ((☃ < 32) && (☃ > 16) && (☃ < 16)) {
            avp.a(☃, ☃, 96.0F, 32.0F, 32, 32, 256.0F, 256.0F);
          } else {
            avp.a(☃, ☃, 96.0F, 0.0F, 32, 32, 256.0F, 256.0F);
          }
        }
        if (i()) {
          if ((☃ < 32) && (☃ > 16) && (☃ > 16)) {
            avp.a(☃, ☃, 64.0F, 32.0F, 32, 32, 256.0F, 256.0F);
          } else {
            avp.a(☃, ☃, 64.0F, 0.0F, 32, 32, 256.0F, 256.0F);
          }
        }
      }
    }
    int ☃ = this.a.k.a(☃);
    if (☃ > 157) {
      ☃ = this.a.k.a(☃, 157 - this.a.k.a("...")) + "...";
    }
    this.a.k.a(☃, ☃ + 32 + 2, ☃ + 1, 16777215);
    List<String> ☃ = this.a.k.c(☃, 157);
    for (int ☃ = 0; (☃ < 2) && (☃ < ☃.size()); ☃++) {
      this.a.k.a((String)☃.get(☃), ☃ + 32 + 2, ☃ + 12 + 10 * ☃, 8421504);
    }
  }
  
  protected abstract int a();
  
  protected abstract String b();
  
  protected abstract String c();
  
  protected abstract void d();
  
  protected boolean e()
  {
    return true;
  }
  
  protected boolean f()
  {
    return !this.b.a(this);
  }
  
  protected boolean g()
  {
    return this.b.a(this);
  }
  
  protected boolean h()
  {
    List<azp> ☃ = this.b.b(this);
    int ☃ = ☃.indexOf(this);
    return (☃ > 0) && (((azp)☃.get(☃ - 1)).e());
  }
  
  protected boolean i()
  {
    List<azp> ☃ = this.b.b(this);
    int ☃ = ☃.indexOf(this);
    return (☃ >= 0) && (☃ < ☃.size() - 1) && (((azp)☃.get(☃ + 1)).e());
  }
  
  public boolean a(int ☃, int ☃, int ☃, int ☃, int ☃, int ☃)
  {
    if ((e()) && (☃ <= 32))
    {
      if (f())
      {
        this.b.g();
        
        int ☃ = a();
        if (☃ != 1)
        {
          String ☃ = bnq.a("resourcePack.incompatible.confirm.title", new Object[0]);
          String ☃ = bnq.a("resourcePack.incompatible.confirm." + (☃ > 1 ? "new" : "old"), new Object[0]);
          
          this.a.a(new awy(new awx()
          {
            public void a(boolean ☃, int ☃)
            {
              List<azp> ☃ = azp.this.b.b(azp.this);
              azp.this.a.a(azp.this.b);
              if (☃)
              {
                ☃.remove(azp.this);
                azp.this.b.f().add(0, azp.this);
              }
            }
          }, ☃, ☃, 0));
        }
        else
        {
          this.b.b(this).remove(this);
          this.b.f().add(0, this);
        }
        return true;
      }
      if ((☃ < 16) && (g()))
      {
        this.b.b(this).remove(this);
        this.b.a().add(0, this);
        this.b.g();
        return true;
      }
      if ((☃ > 16) && (☃ < 16) && (h()))
      {
        List<azp> ☃ = this.b.b(this);
        int ☃ = ☃.indexOf(this);
        ☃.remove(this);
        ☃.add(☃ - 1, this);
        this.b.g();
        return true;
      }
      if ((☃ > 16) && (☃ > 16) && (i()))
      {
        List<azp> ☃ = this.b.b(this);
        int ☃ = ☃.indexOf(this);
        ☃.remove(this);
        ☃.add(☃ + 1, this);
        this.b.g();
        return true;
      }
    }
    return false;
  }
  
  public void a(int ☃, int ☃, int ☃) {}
  
  public void b(int ☃, int ☃, int ☃, int ☃, int ☃, int ☃) {}
}
