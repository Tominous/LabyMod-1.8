public class awk
{
  private static final jy a = new jy("textures/gui/stream_indicator.png");
  private final ave b;
  private float c = 1.0F;
  private int d = 1;
  
  public awk(ave ☃)
  {
    this.b = ☃;
  }
  
  public void a(int ☃, int ☃)
  {
    if (this.b.Y().k())
    {
      bfl.l();
      
      int ☃ = this.b.Y().x();
      if (☃ > 0)
      {
        String ☃ = "" + ☃;
        int ☃ = this.b.k.a(☃);
        int ☃ = 20;
        
        int ☃ = ☃ - ☃ - 1;
        int ☃ = ☃ + 20 - 1;
        int ☃ = ☃;
        int ☃ = ☃ + 20 + this.b.k.a - 1;
        bfl.x();
        bfx ☃ = bfx.a();
        bfd ☃ = ☃.c();
        bfl.c(0.0F, 0.0F, 0.0F, (0.65F + 0.35000002F * this.c) / 2.0F);
        ☃.a(7, bms.e);
        ☃.b(☃, ☃, 0.0D).d();
        ☃.b(☃, ☃, 0.0D).d();
        ☃.b(☃, ☃, 0.0D).d();
        ☃.b(☃, ☃, 0.0D).d();
        ☃.b();
        bfl.w();
        this.b.k.a(☃, ☃ - ☃, ☃ + 20, 16777215);
      }
      a(☃, ☃, b(), 0);
      
      a(☃, ☃, c(), 17);
    }
  }
  
  private void a(int ☃, int ☃, int ☃, int ☃)
  {
    bfl.c(1.0F, 1.0F, 1.0F, 0.65F + 0.35000002F * this.c);
    this.b.P().a(a);
    float ☃ = 150.0F;
    
    float ☃ = 0.0F;
    float ☃ = ☃ * 0.015625F;
    float ☃ = 1.0F;
    float ☃ = (☃ + 16) * 0.015625F;
    
    bfx ☃ = bfx.a();
    bfd ☃ = ☃.c();
    ☃.a(7, bms.g);
    ☃.b(☃ - 16 - ☃, ☃ + 16, ☃).a(☃, ☃).d();
    ☃.b(☃ - ☃, ☃ + 16, ☃).a(☃, ☃).d();
    ☃.b(☃ - ☃, ☃ + 0, ☃).a(☃, ☃).d();
    ☃.b(☃ - 16 - ☃, ☃ + 0, ☃).a(☃, ☃).d();
    ☃.b();
    bfl.c(1.0F, 1.0F, 1.0F, 1.0F);
  }
  
  private int b()
  {
    return this.b.Y().l() ? 16 : 0;
  }
  
  private int c()
  {
    return this.b.Y().D() ? 48 : 32;
  }
  
  public void a()
  {
    if (this.b.Y().k())
    {
      this.c += 0.025F * this.d;
      if (this.c < 0.0F)
      {
        this.d *= -1;
        this.c = 0.0F;
      }
      else if (this.c > 1.0F)
      {
        this.d *= -1;
        this.c = 1.0F;
      }
    }
    else
    {
      this.c = 1.0F;
      this.d = 1;
    }
  }
}
